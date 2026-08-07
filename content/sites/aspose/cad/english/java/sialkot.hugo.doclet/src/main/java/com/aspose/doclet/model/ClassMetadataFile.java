package com.aspose.doclet.model;

import com.aspose.doclet.utils.MarkDownUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ClassMetadataFile extends MetadataFile{
    public ClassMetadataFile(String outputPath, String fileName, String frontMatter, int weight) {
        super(outputPath, fileName, frontMatter, weight);
    }
    private Set<MetadataFileItem> constructors = new LinkedHashSet<>();
    public Set<MetadataFileItem> getConstructors() {
        return constructors;
    }
    public void setConstructors(Set<MetadataFileItem> constructors) {
        this.constructors = constructors;
    }

    private Set<MetadataFileItem> methods = new LinkedHashSet<>();
    public Set<MetadataFileItem> getMethods() {
        return methods;
    }
    public void setMethods(Set<MetadataFileItem> methods) {
        this.methods = methods;
    }

    private Set<MetadataFileItem> fields = new LinkedHashSet<>();
    public Set<MetadataFileItem> getFields() {
        return fields;
    }
    public void setFields(Set<MetadataFileItem> fields) {
        this.fields = fields;
    }
    @JsonIgnore
    @Override
    public String getFileContent() {
        Set<MetadataFileItem> sortedSet = new TreeSet<>(getItems());
        setItems(sortedSet);
        return getFrontMatter() + MarkDownUtil.classToMarkdown(this);
    }

}
