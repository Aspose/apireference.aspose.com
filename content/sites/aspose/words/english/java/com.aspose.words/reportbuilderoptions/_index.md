---
title: ReportBuilderOptions
linktitle: ReportBuilderOptions
second_title: Aspose.Words for Java
description: Represents options for the LINQ Reporting Engine functionality in Java.
type: docs
weight: 565
url: /java/com.aspose.words/reportbuilderoptions/
---

**Inheritance:**
java.lang.Object
```
public class ReportBuilderOptions
```

Represents options for the LINQ Reporting Engine functionality.

 **Examples:** 

Shows how to populate document with data.

```

 public void buildReportData() throws Exception {
     // There is a several ways to populate document with data:
     String doc = getMyDir() + "Reporting engine template - If greedy (Java).docx";

     AsposeData obj = new AsposeData();
     {
         obj.setList(new ArrayList<>());
         {
             obj.getList().add("abc");
         }
     }

     ReportBuilder.buildReport(doc, getArtifactsDir() + "LowCode.BuildReportWithObject.1.docx", obj);
     ReportBuilderOptions options = new ReportBuilderOptions();
     options.setOptions(ReportBuildOptions.ALLOW_MISSING_MEMBERS);
     ReportBuilder.buildReport(doc, getArtifactsDir() + "LowCode.BuildReportWithObject.2.docx", obj, options);
     ReportBuilder.buildReport(doc, getArtifactsDir() + "LowCode.BuildReportWithObject.3.docx", SaveFormat.DOCX, obj);
     ReportBuilder.buildReport(doc, getArtifactsDir() + "LowCode.BuildReportWithObject.4.docx", SaveFormat.DOCX, obj, options);
 }

 public static class AsposeData {
     public ArrayList getList() {
         return mList;
     }

     ;

     public void setList(ArrayList value) {
         mList = value;
     }

     ;

     private ArrayList mList;
 }
 
```
## Constructors

| Constructor | Description |
| --- | --- |
| [ReportBuilderOptions()](#ReportBuilderOptions) | Initializes a new instance of this class. |
## Methods

| Method | Description |
| --- | --- |
| [getKnownTypes()](#getKnownTypes) | Gets an unordered set (i.e. |
| [getMissingMemberMessage()](#getMissingMemberMessage) | Gets a string value printed instead of a template expression that represents a plain reference to a missing member of an object. |
| [getOptions()](#getOptions) | Gets a set of flags controlling behavior of this [ReportingEngine](../../com.aspose.words/reportingengine/) instance while building a report. |
| [setMissingMemberMessage(String value)](#setMissingMemberMessage-java.lang.String) | Sets a string value printed instead of a template expression that represents a plain reference to a missing member of an object. |
| [setOptions(int value)](#setOptions-int) | Sets a set of flags controlling behavior of this [ReportingEngine](../../com.aspose.words/reportingengine/) instance while building a report. |
### ReportBuilderOptions() {#ReportBuilderOptions}
```
public ReportBuilderOptions()
```


Initializes a new instance of this class.

### getKnownTypes() {#getKnownTypes}
```
public KnownTypeSet getKnownTypes()
```


Gets an unordered set (i.e. a collection of unique items) containing java.lang.Class objects which fully or partially qualified names can be used within report templates processed by this engine instance to invoke the corresponding types' static members, perform type casts, etc.

**Returns:**
[KnownTypeSet](../../com.aspose.words/knowntypeset/) - An unordered set (i.e.
### getMissingMemberMessage() {#getMissingMemberMessage}
```
public String getMissingMemberMessage()
```


Gets a string value printed instead of a template expression that represents a plain reference to a missing member of an object. The default value is an empty string.

 **Remarks:** 

The property should be used in conjunction with the [ReportBuildOptions.ALLOW\_MISSING\_MEMBERS](../../com.aspose.words/reportbuildoptions/\#ALLOW-MISSING-MEMBERS) option. Otherwise, an exception is thrown when a missing member of an object is encountered.

The property affects only printing of a template expression representing a plain reference to a missing object member. For example, printing of a binary operator, one of which operands references a missing object member, is not affected.

The value of this property cannot be set to null.

**Returns:**
java.lang.String - A string value printed instead of a template expression that represents a plain reference to a missing member of an object.
### getOptions() {#getOptions}
```
public int getOptions()
```


Gets a set of flags controlling behavior of this [ReportingEngine](../../com.aspose.words/reportingengine/) instance while building a report.

 **Examples:** 

Shows how to populate document with data.

```

 public void buildReportData() throws Exception {
     // There is a several ways to populate document with data:
     String doc = getMyDir() + "Reporting engine template - If greedy (Java).docx";

     AsposeData obj = new AsposeData();
     {
         obj.setList(new ArrayList<>());
         {
             obj.getList().add("abc");
         }
     }

     ReportBuilder.buildReport(doc, getArtifactsDir() + "LowCode.BuildReportWithObject.1.docx", obj);
     ReportBuilderOptions options = new ReportBuilderOptions();
     options.setOptions(ReportBuildOptions.ALLOW_MISSING_MEMBERS);
     ReportBuilder.buildReport(doc, getArtifactsDir() + "LowCode.BuildReportWithObject.2.docx", obj, options);
     ReportBuilder.buildReport(doc, getArtifactsDir() + "LowCode.BuildReportWithObject.3.docx", SaveFormat.DOCX, obj);
     ReportBuilder.buildReport(doc, getArtifactsDir() + "LowCode.BuildReportWithObject.4.docx", SaveFormat.DOCX, obj, options);
 }

 public static class AsposeData {
     public ArrayList getList() {
         return mList;
     }

     ;

     public void setList(ArrayList value) {
         mList = value;
     }

     ;

     private ArrayList mList;
 }
 
```

**Returns:**
int - A set of flags controlling behavior of this [ReportingEngine](../../com.aspose.words/reportingengine/) instance while building a report. The returned value is a bitwise combination of [ReportBuildOptions](../../com.aspose.words/reportbuildoptions/) constants.
### setMissingMemberMessage(String value) {#setMissingMemberMessage-java.lang.String}
```
public void setMissingMemberMessage(String value)
```


Sets a string value printed instead of a template expression that represents a plain reference to a missing member of an object. The default value is an empty string.

 **Remarks:** 

The property should be used in conjunction with the [ReportBuildOptions.ALLOW\_MISSING\_MEMBERS](../../com.aspose.words/reportbuildoptions/\#ALLOW-MISSING-MEMBERS) option. Otherwise, an exception is thrown when a missing member of an object is encountered.

The property affects only printing of a template expression representing a plain reference to a missing object member. For example, printing of a binary operator, one of which operands references a missing object member, is not affected.

The value of this property cannot be set to null.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | A string value printed instead of a template expression that represents a plain reference to a missing member of an object. |

### setOptions(int value) {#setOptions-int}
```
public void setOptions(int value)
```


Sets a set of flags controlling behavior of this [ReportingEngine](../../com.aspose.words/reportingengine/) instance while building a report.

 **Examples:** 

Shows how to populate document with data.

```

 public void buildReportData() throws Exception {
     // There is a several ways to populate document with data:
     String doc = getMyDir() + "Reporting engine template - If greedy (Java).docx";

     AsposeData obj = new AsposeData();
     {
         obj.setList(new ArrayList<>());
         {
             obj.getList().add("abc");
         }
     }

     ReportBuilder.buildReport(doc, getArtifactsDir() + "LowCode.BuildReportWithObject.1.docx", obj);
     ReportBuilderOptions options = new ReportBuilderOptions();
     options.setOptions(ReportBuildOptions.ALLOW_MISSING_MEMBERS);
     ReportBuilder.buildReport(doc, getArtifactsDir() + "LowCode.BuildReportWithObject.2.docx", obj, options);
     ReportBuilder.buildReport(doc, getArtifactsDir() + "LowCode.BuildReportWithObject.3.docx", SaveFormat.DOCX, obj);
     ReportBuilder.buildReport(doc, getArtifactsDir() + "LowCode.BuildReportWithObject.4.docx", SaveFormat.DOCX, obj, options);
 }

 public static class AsposeData {
     public ArrayList getList() {
         return mList;
     }

     ;

     public void setList(ArrayList value) {
         mList = value;
     }

     ;

     private ArrayList mList;
 }
 
```

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | A set of flags controlling behavior of this [ReportingEngine](../../com.aspose.words/reportingengine/) instance while building a report. The value must be a bitwise combination of [ReportBuildOptions](../../com.aspose.words/reportbuildoptions/) constants. |

