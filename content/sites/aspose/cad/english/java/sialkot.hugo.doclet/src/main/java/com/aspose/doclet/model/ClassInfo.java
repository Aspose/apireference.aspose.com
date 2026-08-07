package com.aspose.doclet.model;

public class ClassInfo {
    private String qualifiedName;
    private String name;
    private String packageName;
    private boolean externalClass = true;

    public String getQualifiedName() {
        return qualifiedName;
    }

    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    public String getName() {
        return name;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public boolean isExternalClass() {
        return externalClass;
    }

    public void setExternalClass(boolean externalClass) {
        this.externalClass = externalClass;
    }
}
