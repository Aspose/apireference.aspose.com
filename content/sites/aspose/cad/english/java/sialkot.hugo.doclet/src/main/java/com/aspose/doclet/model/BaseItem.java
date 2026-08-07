package com.aspose.doclet.model;

public class BaseItem {
    private final String uid;
    private final String name;
    private final String summary;

    public BaseItem(String uid, String name, String summary) {
        this.uid = uid;
        this.name = name;
        this.summary = summary;
    }

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getSummary() {
        return summary;
    }
}
