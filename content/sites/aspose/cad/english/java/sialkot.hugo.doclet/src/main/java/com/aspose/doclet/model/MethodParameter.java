package com.aspose.doclet.model;

public class MethodParameter {

    private final String id;
    private final String type;
    private String description;
    private String packageName;
    private String typeName;
    private boolean isArray;

    public MethodParameter(String id, String type, String description, String packageName, String typeName, boolean isArray) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.packageName = packageName;
        this.typeName = typeName;
        this.isArray = isArray;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public boolean isArray() {
        return isArray;
    }

    public void setArray(boolean array) {
        isArray = array;
    }
}
