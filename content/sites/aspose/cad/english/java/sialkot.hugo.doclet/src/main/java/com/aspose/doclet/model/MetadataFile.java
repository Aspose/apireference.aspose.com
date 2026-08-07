package com.aspose.doclet.model;

import com.aspose.doclet.utils.StringUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.aspose.doclet.utils.MarkDownUtil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MetadataFile implements MarkDownFile {

    private final String outputPath;
    private String fileName;
    private Set<MetadataFileItem> items = new LinkedHashSet<>();
    private Set<MetadataFileItem> references = new LinkedHashSet<>();

    private final String frontMatter;
    private final int weight;

    public MetadataFile(String outputPath, String fileName, String frontMatter, int weight) {
        this.outputPath = outputPath;
        this.setFileName(fileName);
        this.frontMatter = frontMatter;
        this.weight = weight;
    }
    public String getFrontMatter()
    {
        String frontMatterContent = "";
        try {
            frontMatterContent= new String (Files.readAllBytes(Paths.get(frontMatter)));
            MetadataFileItem firstItem = getFirstItem();
            if(firstItem!=null)
            {
                frontMatterContent = frontMatterContent.replace("$title", StringUtil.CleanName(firstItem.getName()));
                frontMatterContent = frontMatterContent.replace("$weight", String.valueOf(weight));
                frontMatterContent = frontMatterContent.replace("$ref", getRelativeLink(firstItem));
                String description = firstItem.getShortSummary();
                if(description !=null)
                {
                   description = StringUtil.CleanDescription(description);
                }
                else description = "";
                frontMatterContent = frontMatterContent.replace("$description", description);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return frontMatterContent;
    }
    public static String getRelativeLink(MetadataFileItem item)
    {
        if(item.getType() == "Package")
        {
            return item.getName().toLowerCase();
        }
        else
        {
            return StringUtil.CleanName(item.getParent().toLowerCase() +"/"+item.getName().toLowerCase());
        }
    }
    private MetadataFileItem getFirstItem()
    {
        if(items.size() > 0)
        {
            return items.iterator().next();
        }
        else return  null;
    }
    public Set<MetadataFileItem> getItems() {
        return items;
    }
    public Set<MetadataFileItem> getReferences() {
        return references;
    }


    @JsonIgnore
    @Override
    public String getFileContent() {
        return "";
    }

    @JsonIgnore
    @Override
    public String getFileNameWithPath() {
        return getOutputPath() + File.separator + getFileName();
    }

    @JsonIgnore
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getOutputPath() {
        return outputPath;
    }

    public void setItems(Set<MetadataFileItem> items) {
        this.items = items;
    }

    public void setReferences(Set<MetadataFileItem> references) {
        this.references = references;
    }

    public int getWeight() {
        return weight;
    }
}
