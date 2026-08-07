package com.aspose.doclet.utils;

import com.aspose.doclet.model.*;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator.Feature;
import com.overzealous.remark.IgnoredHtmlElement;
import com.overzealous.remark.Options;
import com.overzealous.remark.Remark;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Set;


public class MarkDownUtil {

    /**
     * Same instance of {@link Remark} class reused for better performance according to authors recommendations.
     * <p>
     * It wrapped in ThreadLocal because of its non-thread safe nature
     */
    private static ThreadLocal<Remark> remark = new ThreadLocal<>() {
        @Override
        protected Remark initialValue() {
            Options options = Options.github();
            options.fencedCodeBlocksWidth = 3;
            options.ignoredHtmlElements.add(IgnoredHtmlElement.create("xref", "uid", "data-throw-if-not-resolved"));
            return new Remark(options);
        }
    };

    private static final ObjectMapper mapper = new ObjectMapper(new YAMLFactory()
        .disable(Feature.WRITE_DOC_START_MARKER)
        //.disable(Feature.SPLIT_LINES)
    )
        .setSerializationInclusion(Include.NON_NULL)
        .setSerializationInclusion(Include.NON_EMPTY);

    public static String objectToYamlString(Object object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException jpe) {
            throw new RuntimeException("Could not serialize object to yaml string", jpe);
        }
    }
    public static String classToMarkdown(ClassMetadataFile classMetadataFile)
    {
        StringBuilder stringBuilder = new StringBuilder();
        MetadataFileItem item = classMetadataFile.getItems().iterator().next();
        stringBuilder.append(classItemToMarkdown(item));
        if(!classMetadataFile.getConstructors().isEmpty())
        {
            stringBuilder.append(classItemsToMarkdown(classMetadataFile.getConstructors(), "Constructor", "Constructors"));
        }
        if(!classMetadataFile.getFields().isEmpty())
        {
            stringBuilder.append(classItemsToMarkdown(classMetadataFile.getFields(), "Field", "Fields"));
        }
        if(!classMetadataFile.getMethods().isEmpty())
        {
            stringBuilder.append(classItemsToMarkdown(classMetadataFile.getMethods(), "Method", "Methods"));
        }
        if(!classMetadataFile.getConstructors().isEmpty())
        {
            stringBuilder.append(classItemsDetailToMarkdown(classMetadataFile.getConstructors(), true));
        }
        if(!classMetadataFile.getFields().isEmpty())
        {
            stringBuilder.append(classItemsDetailToMarkdown(classMetadataFile.getFields()));
        }
        if(!classMetadataFile.getMethods().isEmpty())
        {
            stringBuilder.append(classItemsDetailToMarkdown(classMetadataFile.getMethods(), true, true));
        }
        return  stringBuilder.toString();
    }
    public static String classItemsDetailToMarkdown(Set<MetadataFileItem> items)
    {
        return  classItemsDetailToMarkdown(items, false);
    }
    public static String classItemsDetailToMarkdown(Set<MetadataFileItem> items, boolean addParameters)
    {
        return  classItemsDetailToMarkdown(items, addParameters, false);
    }

    public static String classItemsDetailToMarkdown(Set<MetadataFileItem> items, boolean addParameters, boolean addReturn)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for(MetadataFileItem item : items) {
            stringBuilder.append(String.format("### %s", item.getName())).append(" ").append(String.format("{#%s}",StringUtil.ConvertHashURLFormat(item.getId())));
            stringBuilder.append("\r\n");
            stringBuilder.append(syntaxToMarkdown(item.getSyntax()));
            stringBuilder.append("\r\n");
            String summary =(item.getSummary());
            if(summary!=null) {
                stringBuilder.append(summaryToMarkdown(summary, !item.isMarkdownSummary()));
            }
            stringBuilder.append("\r\n");
            if(addParameters && !item.getSyntax().getParameters().isEmpty())
            {
                stringBuilder.append(methodParametersToMarkdown(item.getSyntax().getParameters()));
            }
            if(addReturn && item.getSyntax().getReturnValue() != null) {
                stringBuilder.append(methodReturnTypeToMarkdown(item.getSyntax().getReturnValue()));
            }
        }
        return stringBuilder.toString();
    }
    public static String methodReturnTypeToMarkdown(Return returnType)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("**%s:**","Returns"));
        stringBuilder.append("\r\n");
        if(returnType.getReturnPackage().isEmpty())
        {
            stringBuilder.append(returnType.getReturnType());
        }
        else {
            stringBuilder.append(String.format("[%s](../../%s/%s)",returnType.getReturnType(),returnType.getReturnPackage().toLowerCase(), returnType.getReturnType().toLowerCase()));
        }
        if(returnType.getReturnDescription()!=null) {
            stringBuilder.append(" - ").append(summaryToMarkdown(returnType.getReturnDescription(), true, false));
        }
        stringBuilder.append("\r\n");
        return stringBuilder.toString();
    }
    public static String methodParametersToMarkdown(List<MethodParameter> parameters)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("**%s:**","Parameters"));
        stringBuilder.append("\r\n");
        stringBuilder.append("| Parameter | Type | Description |");
        stringBuilder.append("\r\n");
        stringBuilder.append("| --- | --- | --- |");
        stringBuilder.append("\r\n");
        for(MethodParameter parameter : parameters) {
            stringBuilder.append("| ");
            stringBuilder.append(parameter.getId());
            stringBuilder.append(" | ");
            if(parameter.getPackageName().isEmpty())
            {
                stringBuilder.append(parameter.getType());
            }
            else {
                stringBuilder.append(String.format("[%s](../../%s/%s)",parameter.getTypeName()+(parameter.isArray()?"\\[\\]":""),parameter.getPackageName().toLowerCase(), parameter.getTypeName().toLowerCase()));
            }
            stringBuilder.append(" | ");
            String summary =parameter.getDescription();
            if(summary!=null) {
                stringBuilder.append(summaryToMarkdown(summary, true, false));
            }
            stringBuilder.append(" |");
            stringBuilder.append("\r\n");
        }
        stringBuilder.append("\r\n");
        return stringBuilder.toString();
    }
    public static String classItemsToMarkdown(Set<MetadataFileItem> items, String type, String types)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("## "+types);
        stringBuilder.append("\r\n");
        stringBuilder.append("\r\n");
        stringBuilder.append("| "+type+" | Description |");
        stringBuilder.append("\r\n");
        stringBuilder.append("| --- | --- |");
        stringBuilder.append("\r\n");
        for(MetadataFileItem item : items) {
            stringBuilder.append("| ");
            stringBuilder.append(String.format("[%s]", item.getName()));
            stringBuilder.append(String.format("(#%s)", StringUtil.ConvertHashURLFormat(item.getId())));
            stringBuilder.append(" | ");
            String summary =(item.getShortSummary());
            if(summary!=null) {
                stringBuilder.append(summaryToMarkdown(summary,!item.isMarkdownSummary(),false));
            }
            stringBuilder.append(" |");
            stringBuilder.append("\r\n");
        }

        return stringBuilder.toString();
    }
    public static String classItemToMarkdown(MetadataFileItem item)
    {
        StringBuilder stringBuilder = new StringBuilder();
        if(item.getInheritance() != null && !item.getInheritance().isEmpty())
        {
            stringBuilder.append(inheritanceToMarkdown(item.getInheritance(), "Inheritance:"));
        }
        if(item.getInterfaces() != null && !item.getInterfaces().isEmpty())
        {
            stringBuilder.append(inheritanceToMarkdown(item.getInterfaces(), "All Implemented Interfaces:"));
        }
        stringBuilder.append(syntaxToMarkdown(item.getSyntax()));
        if(item.getSummary() != null && !item.getSummary().isEmpty())
        stringBuilder.append(summaryToMarkdown(item.getSummary(), !item.isMarkdownSummary()));
        return stringBuilder.toString();
    }
    public static String syntaxToMarkdown(Syntax syntax)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("```").append("\r\n").append(syntax.getContent()).append("\r\n").append("```").append("\r\n");
        return stringBuilder.toString();
    }
    public static String summaryToMarkdown(String summary, boolean convertToHtml)
    {
        return summaryToMarkdown(summary,convertToHtml, true);
    }
    public static String summaryToMarkdown(String summary, boolean convertToHtml, boolean addLineBreaks)
    {
        StringBuilder stringBuilder = new StringBuilder();
        if(convertToHtml) {
            summary = convertHtmlToMarkdown(summary).replaceAll("\\[(.*?)\\]\\((.*?)\\)", "[$1](../$2)");
        }
        else
        {
            summary = summary.replaceAll("\\[(.*?)\\]\\((.*?)\\)", "[$1](../$2)");
        }
        if(addLineBreaks) {
            stringBuilder.append("\r\n").append(summary).append("\r\n");
        }
        else
        {
            stringBuilder.append(summary);
        }
        return stringBuilder.toString().replace("\\`","");
    }
    public static String inheritanceToMarkdown(List<ClassInfo> inheritances, String heading)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\r\n");
        stringBuilder.append("**").append(heading).append("**");
        stringBuilder.append("\r\n");
        for(int i =0; i < inheritances.size(); i++)
        {
            ClassInfo classInfo = inheritances.get(i);
            if(classInfo.isExternalClass())
            {
                stringBuilder.append(classInfo.getQualifiedName());
            }
            else {
                stringBuilder.append(String.format("[%s](../../%s/%s)",classInfo.getQualifiedName(),classInfo.getPackageName().toLowerCase(), classInfo.getName().toLowerCase()));
            }
            if(i < inheritances.size() - 1)
            {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("\r\n");
        return stringBuilder.toString();
    }
    public static String packageToMarkdown(PackageMetadataFile packageMetadataFile)
    {
        StringBuilder stringBuilder = new StringBuilder();
        MetadataFileItem item = packageMetadataFile.getItems().iterator().next();
        stringBuilder.append(ItemToMarkdown(item));
        if(packageMetadataFile.getClasses().size()>0)
        {
            stringBuilder.append(ItemsToMarkdown(packageMetadataFile.getClasses(),"Classes", "Class", item.getName()));
        }
        if(packageMetadataFile.getInterfaces().size()>0)
        {
            stringBuilder.append(ItemsToMarkdown(packageMetadataFile.getInterfaces(),"Interfaces", "Interface", item.getName()));
        }
        if(packageMetadataFile.getEnums().size()>0)
        {
            stringBuilder.append(ItemsToMarkdown(packageMetadataFile.getEnums(),"Enumerations", "Enum", item.getName()));
        }
        return stringBuilder.toString();
    }
    public static String ItemToMarkdown(MetadataFileItem item)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\r\n");
        if(item.getSummary() != null) {
            stringBuilder.append(summaryToMarkdown(item.getSummary(),true));
            stringBuilder.append("\r\n");
        }
        return stringBuilder.toString();
    }
    public static String ItemsToMarkdown(Set<MetadataFileItem> items, String types, String type, String packageName)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\r\n");
        stringBuilder.append("## " + types);
        stringBuilder.append("\r\n");
        stringBuilder.append("\r\n");
        stringBuilder.append("| "+type+" | Description |");
        stringBuilder.append("\r\n");
        stringBuilder.append("| --- | --- |");
        stringBuilder.append("\r\n");
        for(MetadataFileItem item : items) {
            stringBuilder.append("| ");
            stringBuilder.append(String.format("[%s]", item.getName()));
            stringBuilder.append(String.format("(../%s)", MetadataFile.getRelativeLink(item)));
            stringBuilder.append(" | ");
//Changed by @kolodyazhnyy: if do not check on null we get NullPointerException for every non-documented class that is inconvenient.
//It's better to see all undocumented classes in one run via warnings.
//START CHANGE
            if (item.getShortSummary() != null) {
//END CHANGE
	            String summary = StringUtil.CleanShortDescription(convertHtmlToMarkdown(item.getShortSummary()));
	            if(summary !=null) {
	                /*summary = summary.replaceAll("\\[(.*?)\\]\\((.*?)\\)", "[$1](../" + packageName.toLowerCase() + "/$2)");*/
	                stringBuilder.append(summary);
	            }
//START CHANGE
            } else {
            	System.out.println("Warning: class " + item.getFullName() + " is without javadoc comment.");
            }
//END CHANGE
            stringBuilder.append(" |");
            stringBuilder.append("\r\n");
        }

       return stringBuilder.toString();
    }

    public static String tocToMarkdown(TocFile tocFile)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\r\n");
        stringBuilder.append("## Packages");
        stringBuilder.append("\r\n");
        stringBuilder.append("| Package | Description |");
        stringBuilder.append("\r\n");
        stringBuilder.append("| --- | --- |");
        stringBuilder.append("\r\n");
        for (TocItem tocItem:
             tocFile) {
            stringBuilder.append(tocItemToMarkdown(tocItem));
        }
        return stringBuilder.toString();
    }
    private static String tocItemToMarkdown(TocItem tocItem)
    {
        StringBuilder builder = new StringBuilder();
        builder.append("| ");
        builder.append(String.format("[%s]", tocItem.getName()));
        builder.append(String.format("(./%s)", tocItem.getName().toLowerCase()));
        builder.append(" | ");
        String summary =convertHtmlToMarkdown(tocItem.getSummary());
        builder.append(summary!=null?summary:"");
        builder.append(" |");
        builder.append("\r\n");
        return builder.toString();
    }
    public static String convertHtmlToMarkdown(String text) {
        if (StringUtils.isBlank(text)) {
            return text;
        }
        String converted = remark.get().convertFragment(text).replaceAll("\r\n", "\n").replaceAll("```\n```", "\n```java\n");
        return remark.get().convertFragment(text)
            .replaceAll("\r\n", "\n")
            .replaceAll("```\n```", "```")
            .replace("\\[","[")
            .replace("\\]","]");
    }
}
