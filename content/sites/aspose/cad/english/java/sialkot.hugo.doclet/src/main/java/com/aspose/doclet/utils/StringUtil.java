package com.aspose.doclet.utils;

public class StringUtil {
    public static String CleanName(String name)
    {
      return name.replaceAll("\\<.*\\>","");
    }
    public static String CleanDescription(String description)
    {
        return description.replaceAll("<[^>]*>", "").replace("p\n","").replace("\np","").replace("/p","").replace("\n","").replaceAll("\\[(.*?)\\]\\((.*?)\\)", "").replaceAll("[^\\w\\h-\\./]", "").trim();
    }
    public static String CleanShortDescription(String description)
    {
        return description.replace("\\`","").replace("\n","").trim();
    }
    public static String ConvertHashURLFormat(String url)
    {
        return url.replaceAll("[^0-9a-zA-Z.]","-");
    }
    public static String RemoveClassPrefixFromLinks(String summary, String enclosingElement)
    {
        if(summary != null && enclosingElement !=null) {
            summary = summary.replaceAll("\\[" + enclosingElement + "\\.#([^\\]]*)", "[$1");
            summary = summary.replace(".#",".");
            return summary;
        }
        else {
            return summary;
        }
    }
}
