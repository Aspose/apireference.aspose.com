package com.aspose.doclet.model;

import com.aspose.doclet.utils.MarkDownUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PackageMetadataFile extends MetadataFile{
    public PackageMetadataFile(String outputPath, String fileName, String frontMatter, int weight) {
        super(outputPath, fileName, frontMatter, weight);
    }
    private Set<MetadataFileItem> classes = new LinkedHashSet<>();
    private Set<MetadataFileItem> interfaces = new LinkedHashSet<>();
    private Set<MetadataFileItem> enums = new LinkedHashSet<>();
    private Set<MetadataFileItem> exceptions = new LinkedHashSet<>();
    private Set<MetadataFileItem> errors = new LinkedHashSet<>();
    private Set<MetadataFileItem> constants = new LinkedHashSet<>();

    public Set<MetadataFileItem> getClasses() {
        return classes;
    }
    public Set<MetadataFileItem> getInterfaces() {
        return interfaces;
    }
    public Set<MetadataFileItem> getEnums() {
        return enums;
    }
    public Set<MetadataFileItem> getExceptions() {
        return exceptions;
    }
    public Set<MetadataFileItem> getErrors() {
        return errors;
    }
    public Set<MetadataFileItem> getConstants() {
        return constants;
    }

    @JsonIgnore
    @Override
    public String getFileContent() {
        Set<MetadataFileItem> sortedSet = new TreeSet<>(getItems());
        setItems(sortedSet);
        return getFrontMatter() + MarkDownUtil.packageToMarkdown(this);
    }
}
