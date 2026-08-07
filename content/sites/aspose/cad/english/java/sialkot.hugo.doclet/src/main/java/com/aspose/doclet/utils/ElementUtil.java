package com.aspose.doclet.utils;

import jdk.javadoc.doclet.DocletEnvironment;
import org.apache.commons.lang3.StringUtils;

import javax.lang.model.element.*;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.ElementFilter;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ElementUtil {
    public final DocletEnvironment docletEnvironment;
    private final Set<Pattern> excludePackages = new HashSet<>();
    private final Set<Pattern> excludeClasses = new HashSet<>();
    private final boolean noDeprecated;
    private Utils utils;

    public ElementUtil(DocletEnvironment docletEnvironment, String[] excludePackages, String[] excludeClasses, boolean noDeprecated) {
        this.excludePackages.addAll(Stream.of(excludePackages)
            .map(o -> Pattern.compile(o)).collect(Collectors.toSet()));
        this.excludeClasses.addAll(Stream.of(excludeClasses)
            .map(o -> Pattern.compile(o)).collect(Collectors.toSet()));
        this.docletEnvironment = docletEnvironment;
        utils = new Utils(docletEnvironment);
        this.noDeprecated =noDeprecated;

    }

    public List<TypeElement> extractSortedElements(Element element) {
        // Need to apply sorting, because order of result items for Element.getEnclosedElements() depend on JDK implementation
        // By default, exclude private and package-private items
        // todo allow pass parameter for filter items by access modifiers
        return ElementFilter.typesIn(element.getEnclosedElements()).stream()
            .filter(o -> !Utils.isPrivateOrPackagePrivate(o))
            .filter(o -> !matchAnyPattern(excludeClasses, String.valueOf(o.getQualifiedName())))
            .sorted((o1, o2) ->
                StringUtils.compare(String.valueOf(o1.getQualifiedName()), String.valueOf(o2.getQualifiedName()))
            ).collect(Collectors.toList());
    }
    public List<TypeElement> extractSortedElements(Element element, ElementKind kind) {
        // Need to apply sorting, because order of result items for Element.getEnclosedElements() depend on JDK implementation
        // By default, exclude private and package-private items
        // todo allow pass parameter for filter items by access modifiers
        return ElementFilter.typesIn(element.getEnclosedElements()).stream()
                .filter(o -> !Utils.isPrivateOrPackagePrivate(o))
                .filter(o -> o.getKind().equals(kind))
                .filter(o -> !matchAnyPattern(excludeClasses, String.valueOf(o.getQualifiedName())))
                .filter(o -> utils.includeDeprecated(noDeprecated,o))
                .sorted((o1, o2) ->
                        StringUtils.compare(String.valueOf(o1.getQualifiedName()), String.valueOf(o2.getQualifiedName()))
                ).collect(Collectors.toList());
    }

    public List<PackageElement> extractPackageElements(Set<? extends Element> elements) {
        return ElementFilter.packagesIn(elements).stream()
            .filter(o -> !matchAnyPattern(excludePackages, String.valueOf(o)))
                .filter(o -> utils.includeDeprecated(noDeprecated, o))
            .sorted((o1, o2) ->
                StringUtils.compare(String.valueOf(o1.getQualifiedName()), String.valueOf(o2.getQualifiedName()))
            ).collect(Collectors.toList());
    }
    public List<ExecutableElement> extractConstructors(Element element)
    {
        return ElementFilter.constructorsIn(element.getEnclosedElements().stream()
                .filter(constructorElement -> !Utils.isPrivateOrPackagePrivate(constructorElement))
                .filter(constructorElement -> utils.includeDeprecated(noDeprecated,constructorElement))
                .collect(Collectors.toList()));
    }
    public List<ExecutableElement> extractMethods(TypeElement element)
    {
        return ElementFilter.methodsIn(getMethods(element).stream().distinct()
                .filter(methodElement -> !Utils.isPrivateOrPackagePrivate(methodElement))
                .filter(methodElement -> utils.includeDeprecated(noDeprecated,methodElement))
                .filter( distinctByKey(o -> o.toString()) )
                .sorted((o1, o2) ->
                        StringUtils.compare(String.valueOf(o1.toString()), String.valueOf(o2.toString()))
                )
                .collect(Collectors.toList()));
    }
    public List<ExecutableElement> getMethods(TypeElement element)
    {
        List<ExecutableElement> allMethods = new ArrayList<>();
        allMethods.addAll(ElementFilter.methodsIn(element.getEnclosedElements()));
        List<ExecutableElement> inheritedMethods = new ArrayList<>();
        extractInheritedMethods(element, inheritedMethods);
        allMethods.addAll(inheritedMethods);
        return allMethods;
    }
    public List<VariableElement> getFields(TypeElement element)
    {
        List<VariableElement> allFields = new ArrayList<>();
        allFields.addAll(ElementFilter.fieldsIn(element.getEnclosedElements()));
        List<VariableElement> inheritedFields = new ArrayList<>();
        extractInheritedFields(element, inheritedFields);
        allFields.addAll(inheritedFields);
        return allFields;
    }
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor)
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
    public void extractInheritedMethods(TypeElement classElement, List<ExecutableElement> inheritedMembers)
    {
        TypeMirror superclass = classElement.getSuperclass();
        if (superclass.getKind() != TypeKind.NONE) {
            TypeElement superClassElement = (TypeElement) docletEnvironment.getTypeUtils().asElement(superclass);
            List<ExecutableElement> members = getInheritedMethods(superClassElement);
            inheritedMembers.addAll(members);
            extractInheritedMethods(superClassElement, inheritedMembers);
        }
    }
    public void extractInheritedFields(TypeElement classElement, List<VariableElement> inheritedFields)
    {
        TypeMirror superclass = classElement.getSuperclass();
        if (superclass.getKind() != TypeKind.NONE) {
            TypeElement superClassElement = (TypeElement) docletEnvironment.getTypeUtils().asElement(superclass);
            List<VariableElement> members = getInheritedFields(superClassElement);
            inheritedFields.addAll(members);
            extractInheritedFields(superClassElement, inheritedFields);
        }
    }
    public List<ExecutableElement> getInheritedMethods(TypeElement element)
    {
        return ElementFilter.methodsIn(element.getEnclosedElements().stream().collect(Collectors.toList()));
    }
    public List<VariableElement> getInheritedFields(TypeElement element)
    {
        return ElementFilter.fieldsIn(element.getEnclosedElements().stream().collect(Collectors.toList()));
    }
    public List<VariableElement> extractFields(TypeElement element)
    {
        return ElementFilter.fieldsIn(getFields(element).stream()
                .filter(fieldElement -> !Utils.isPrivateOrPackagePrivate(fieldElement))
                .filter(fieldElement -> utils.includeDeprecated(noDeprecated,fieldElement))
                .sorted((o1, o2) ->
                        StringUtils.compare(String.valueOf(o1.toString()), String.valueOf(o2.toString()))
                )
                .collect(Collectors.toList()));
    }
    boolean matchAnyPattern(Set<Pattern> patterns, String stringToCheck) {
        for (Pattern pattern : patterns) {
            if (pattern.matcher(stringToCheck).matches()) {
                return true;
            }
        }
        return false;
    }
}
