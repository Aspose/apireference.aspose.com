---
title: ListLevelAlignment
linktitle: ListLevelAlignment
second_title: Aspose.Words for Java
description: Specifies alignment for the list number or bullet in Java.
type: docs
weight: 424
url: /java/com.aspose.words/listlevelalignment/
---

**Inheritance:**
java.lang.Object
```
public class ListLevelAlignment
```

Specifies alignment for the list number or bullet.

 **Remarks:** 

Used as a value for the [ListLevel.getAlignment()](../../com.aspose.words/listlevel/\#getAlignment) / [ListLevel.setAlignment(int)](../../com.aspose.words/listlevel/\#setAlignment-int) property.

 **Examples:** 

Shows how to apply custom list formatting to paragraphs when using DocumentBuilder.

```

 Document doc = new Document();

 // A list allows us to organize and decorate sets of paragraphs with prefix symbols and indents.
 // We can create nested lists by increasing the indent level.
 // We can begin and end a list by using a document builder's "ListFormat" property.
 // Each paragraph that we add between a list's start and the end will become an item in the list.
 // Create a list from a Microsoft Word template, and customize the first two of its list levels.
 List docList = doc.getLists().add(ListTemplate.NUMBER_DEFAULT);

 ListLevel listLevel = docList.getListLevels().get(0);
 listLevel.getFont().setColor(Color.RED);
 listLevel.getFont().setSize(24.0);
 listLevel.setNumberStyle(NumberStyle.ORDINAL_TEXT);
 listLevel.setStartAt(21);
 listLevel.setNumberFormat(" ");

 listLevel.setNumberPosition(-36);
 listLevel.setTextPosition(144.0);
 listLevel.setTabPosition(144.0);

 listLevel = docList.getListLevels().get(1);
 listLevel.setAlignment(ListLevelAlignment.RIGHT);
 listLevel.setNumberStyle(NumberStyle.BULLET);
 listLevel.getFont().setName("Wingdings");
 listLevel.getFont().setColor(Color.BLUE);
 listLevel.getFont().setSize(24.0);

 // This NumberFormat value will create star-shaped bullet list symbols.
 listLevel.setNumberFormat("\uf0af");
 listLevel.setTrailingCharacter(ListTrailingCharacter.SPACE);
 listLevel.setNumberPosition(144.0);

 // Create paragraphs and apply both list levels of our custom list formatting to them.
 DocumentBuilder builder = new DocumentBuilder(doc);

 builder.getListFormat().setList(docList);
 builder.writeln("The quick brown fox...");
 builder.writeln("The quick brown fox...");

 builder.getListFormat().listIndent();
 builder.writeln("jumped over the lazy dog.");
 builder.writeln("jumped over the lazy dog.");

 builder.getListFormat().listOutdent();
 builder.writeln("The quick brown fox...");

 builder.getListFormat().removeNumbers();

 builder.getDocument().save(getArtifactsDir() + "Lists.CreateCustomList.docx");
 
```
## Fields

| Field | Description |
| --- | --- |
| [CENTER](#CENTER) | The list label is centered at the number position. |
| [LEFT](#LEFT) | The list label is aligned to the left of the number position. |
| [RIGHT](#RIGHT) | This list label is aligned to the right of the number position. |
| [length](#length) |  |
## Methods

| Method | Description |
| --- | --- |
| [fromName(String listLevelAlignmentName)](#fromName-java.lang.String) |  |
| [getName(int listLevelAlignment)](#getName-int) |  |
| [getValues()](#getValues) |  |
| [toString(int listLevelAlignment)](#toString-int) |  |
### CENTER {#CENTER}
```
public static int CENTER
```


The list label is centered at the number position.

### LEFT {#LEFT}
```
public static int LEFT
```


The list label is aligned to the left of the number position.

### RIGHT {#RIGHT}
```
public static int RIGHT
```


This list label is aligned to the right of the number position.

### length {#length}
```
public static int length
```


### fromName(String listLevelAlignmentName) {#fromName-java.lang.String}
```
public static int fromName(String listLevelAlignmentName)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| listLevelAlignmentName | java.lang.String |  |

**Returns:**
int
### getName(int listLevelAlignment) {#getName-int}
```
public static String getName(int listLevelAlignment)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| listLevelAlignment | int |  |

**Returns:**
java.lang.String
### getValues() {#getValues}
```
public static int[] getValues()
```




**Returns:**
int[]
### toString(int listLevelAlignment) {#toString-int}
```
public static String toString(int listLevelAlignment)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| listLevelAlignment | int |  |

**Returns:**
java.lang.String
