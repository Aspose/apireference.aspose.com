package com.aspose.doclet.lookup;

import com.aspose.doclet.lookup.model.ExtendedMetadataFileItem;
import com.aspose.doclet.model.*;

import com.aspose.doclet.utils.StringUtil;
import com.sun.source.doctree.DocCommentTree;
import com.sun.source.doctree.DocTree;
import com.sun.source.doctree.LinkTree;
import com.sun.source.doctree.LiteralTree;

import java.io.Console;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.util.ElementFilter;

import jdk.javadoc.doclet.DocletEnvironment;

import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;

public abstract class BaseLookup<T extends Element> {

    protected final Map<ElementKind, String> elementKindLookup = new HashMap<>() {{
        put(ElementKind.PACKAGE, "Package");
        put(ElementKind.CLASS, "Class");
        put(ElementKind.ENUM, "Enum");
        put(ElementKind.ENUM_CONSTANT, "Field");
        put(ElementKind.INTERFACE, "Interface");
        put(ElementKind.ANNOTATION_TYPE, "Interface");
        put(ElementKind.CONSTRUCTOR, "Constructor");
        put(ElementKind.METHOD, "Method");
        put(ElementKind.FIELD, "Field");
    }};

    protected Map<T, ExtendedMetadataFileItem> map = new HashMap<>();
    protected final DocletEnvironment environment;

    protected BaseLookup(DocletEnvironment environment) {
        this.environment = environment;
    }

    protected ExtendedMetadataFileItem resolve(T key) {
        ExtendedMetadataFileItem value = map.get(key);
        if (value == null) {
            value = buildMetadataFileItem(key);
            map.put(key, value);
        }
        return value;
    }

    protected abstract ExtendedMetadataFileItem buildMetadataFileItem(T key);

    public String extractPackageName(T key) {
        return resolve(key).getPackageName();
    }

    public String extractFullName(T key) {
        return resolve(key).getFullName();
    }

    public String extractName(T key) {
        return resolve(key).getName();
    }

    public String extractHref(T key) {
        return resolve(key).getHref();
    }

    public String extractParent(T key) {
        return resolve(key).getParent();
    }

    public String extractId(T key) {
        return resolve(key).getId();
    }

    public String extractUid(T key) {
        return resolve(key).getUid();
    }

    public String extractNameWithType(T key) {
        return resolve(key).getNameWithType();
    }

    public String extractMethodContent(T key) {
        return resolve(key).getMethodContent();
    }

    public String extractFieldContent(T key) {
        return resolve(key).getFieldContent();
    }

    public String extractConstructorContent(T key) {
        return resolve(key).getConstructorContent();
    }

    public String extractOverload(T key) {
        return resolve(key).getOverload();
    }

    public List<MethodParameter> extractParameters(T key) {
        return resolve(key).getParameters();
    }

    public List<ExceptionItem> extractExceptions(T key) {
        return resolve(key).getExceptions();
    }

    public Return extractReturn(T key) {
        return resolve(key).getReturn();
    }

    public String extractSummary(T key) {
        return resolve(key).getSummary();
    }
    public String extractShortSummary(T key) {
        return resolve(key).getShortSummary();
    }

    public String extractType(T key) {
        return resolve(key).getType();
    }

    public String extractContent(T key) {
        return resolve(key).getContent();
    }

    public List<TypeParameter> extractTypeParameters(T key) {
        return resolve(key).getTypeParameters();
    }

    public List<ClassInfo> extractSuperclass(T key) {
        List<ClassInfo> reversed = resolve(key).getSuperclass();
        Collections.reverse(reversed);
        return reversed;
    }

    public List<String> extractInheritedMethods(T key) {
        List<String> sorted = resolve(key).getInheritedMethods();
        Collections.sort(sorted);
        return sorted;
    }

    public List<ClassInfo> extractInterfaces(T key) {
        return resolve(key).getInterfaces();
    }

    public String extractTocName(T key) {
        return resolve(key).getTocName();
    }

    public Set<MetadataFileItem> extractReferences(T key) {
        return resolve(key).getReferences();
    }

    public String extractOverridden(T key) {
        return resolve(key).getOverridden();
    }

    protected String determineType(T element) {
        return elementKindLookup.get(element.getKind());
    }

    protected String determinePackageName(T element) {
        String packageName = null;
        try {
            packageName = String.valueOf(environment.getElementUtils().getPackageOf(element));
        }
        catch (Exception ex)
        {

        }
        return packageName;
    }

    protected String determineComment(T element) {
        return getDocCommentTree(element)
                .map(DocCommentTree::getFullBody)
                .map(d -> replaceLinksAndCodes(d))
                .orElse(null);
    }
    protected String determineShortComment(T element) {
        return getDocCommentTree(element)
                .map(DocCommentTree::getFirstSentence)
                .map(d -> replaceLinksAndCodes(d))
                .orElse(null);
    }

    /**
     * <ul>
     * <li>Replace @link and @linkplain with <xref> tags</li>
     * <li>Replace @code with <code> tags</li>
     * </ul>
     */
    String replaceLinksAndCodes(List<? extends DocTree> items) {
        return items.stream().map(
                bodyItem -> {
                    switch (bodyItem.getKind()) {
                        case LINK:
                        case LINK_PLAIN:
                            return buildMarkdownLink((LinkTree) bodyItem);
                        case CODE:
                            return buildCodeTag((LiteralTree) bodyItem);
                        case LITERAL:
                            return expandLiteralBody((LiteralTree) bodyItem);
                        default:
                            return String.valueOf(bodyItem);
                    }
                }
        ).collect(Collectors.joining());
    }
    protected T getElementByName(String name)
    {
        var element = getElementBySimpleName(name);
        if(element == null)
        {
            element = getElementByQualifiedName(name);
        }
        return element;
    }
    protected T getElementBySimpleName(String name)
    {
        var element = this.environment.getIncludedElements().stream().filter(e -> e.getSimpleName().contentEquals(name)).findFirst();
        return !element.isEmpty() ? (T) element.get() : null;
    }
    protected T getElementByQualifiedName(String name)
    {
        var element = ElementFilter.typesIn(this.environment.getIncludedElements()).stream().filter(e -> e.getQualifiedName().contentEquals(name)).findFirst();
        return !element.isEmpty() ? (T) element.get() : null;
    }
    protected T getElementByType(String name)
    {
        var element = this.environment.getIncludedElements().stream().filter(e -> e.asType().toString().contentEquals(name)).findFirst();
        return !element.isEmpty() ? (T) element.get() : null;
    }
    private String getRelativeLink(String signature) throws Exception {
        String relativeLink = signature;
        if(!signature.startsWith("http")) {
            String[] parts = signature.split("#");
            if(parts.length > 0)
            {
                var element = getElementByName(parts[0]);
                if(element != null)
                {
                    String owner = determinePackageName(element);
                    if(!owner.isEmpty())
                    {
                        relativeLink = String.format("../%s/%s",owner.toLowerCase(),element.getSimpleName().toString().toLowerCase());
                    }
                }
                else {
                    throw new Exception("No element found");
                }
            }
            if(parts.length > 1)
            {
                relativeLink += "#" + StringUtil.ConvertHashURLFormat(parts[1]);
            }
        }
        return relativeLink;
    }
    private String getSignature(String signature) {
        String simpleSignature = signature;
        if(!signature.startsWith("http")) {
            String[] parts = signature.split("#");
            if(parts.length > 0)
            {
                var element = getElementByName(parts[0]);
                if(element != null)
                {
                    String owner = determinePackageName(element);
                    if(owner!= null && !owner.isEmpty())
                    {
                        simpleSignature = element.getSimpleName().toString();
                    }
                }
            }
            if(parts.length > 1)
            {
                simpleSignature += ".#" + parts[1];
            }
        }
        return simpleSignature;
    }
    /**
     * By using this way of processing links we provide support of @links with label, like this: {@link List someLabel}
     */
    String buildMarkdownLink(LinkTree linkTree) {
        String signature = getSignature(linkTree.getReference().getSignature());
        String label = signature.toLowerCase();
        try {
            label = getRelativeLink(linkTree.getReference().getSignature());
        }
        catch (Exception ex)
        {
            return signature;
        }
        return String.format("[%s](%s)", signature, label);
    }

    String buildCodeTag(LiteralTree literalTree) {
        return String.format("```\r\n%s\r\n```", literalTree.getBody());
    }

    String expandLiteralBody(LiteralTree bodyItem) {
        return String.valueOf(bodyItem.getBody());
    }

    protected Optional<DocCommentTree> getDocCommentTree(T element) {
        return Optional.ofNullable(environment.getDocTrees().getDocCommentTree(element));
    }

    /**
     * We make type shortening in assumption that package name doesn't contain uppercase characters
     */
    public String makeTypeShort(String value) {
        if (!value.contains(".")) {
            return value;
        }
        return Stream.of(StringUtils.split(value, "<"))
                .map(s -> RegExUtils.removeAll(s, "\\b[a-z0-9_.]+\\."))
                .collect(Collectors.joining("<"));
    }
}
