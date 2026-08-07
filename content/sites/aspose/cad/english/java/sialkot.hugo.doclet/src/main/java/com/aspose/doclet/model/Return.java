package com.aspose.doclet.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Return {

    @JsonProperty("type")
    private final String returnType;
    @JsonProperty("description")
    private String returnDescription;

    private String returnPackage;

    public Return(String returnType, String returnDescription, String returnPackage) {
        this.returnType = returnType;
        this.returnDescription = returnDescription;
        this.returnPackage = returnPackage;
    }

    public Return(String returnType) {
        this.returnType = returnType;
    }

    public String getReturnType() {
        return returnType;
    }

    public String getReturnDescription() {
        return returnDescription;
    }

    public void setReturnDescription(String returnDescription) {
        this.returnDescription = returnDescription;
    }

    public String getReturnPackage() {
        return returnPackage;
    }

    public void setReturnPackage(String returnPackage) {
        this.returnPackage = returnPackage;
    }
}
