---
title: "DgnMultiTextElement"
linktitle: "DgnMultiTextElement"
second_title: "Aspose.CAD for Java"
description: "Represents multi-line text element"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.dgn.dgnelements/dgnmultitextelement/
---

**Inheritance:** java.lang.Object, DgnTextElement

Represents multi-line text element

## Constructors

| Constructor | Description |
| --- | --- |
| [DgnMultiTextElement(byte[] rawData, boolean is3DElementExpected)](#DgnMultiTextElement-byte:A-boolean) | Initializes a new instance of the DgnMultiTextElement class |

## Methods

| Method | Description |
| --- | --- |
| [getLinesNumber()](#getLinesNumber) | Gets number of lines |
| [getNodeNumber()](#getNodeNumber) | Gets nodes number |
| [getLineSpacing()](#getLineSpacing) | Gets line spacing |
| [getMaximumlengthAllowed()](#getMaximumlengthAllowed) | Gets maximum length allowed |
| [getMaximumlengthAllowUsed()](#getMaximumlengthAllowUsed) | Gets maximum length allowed to use |
| [getStrings()](#getStrings) | Gets lines |
| [addText(DgnTextElement text)](#addText-com.aspose.cad.fileformats.dgn.dgnelements.DgnTextElement) | Adds text element |
| [getTextSize()](#getTextSize) | Gets text size in UOR |

### DgnMultiTextElement(byte[] rawData, boolean is3DElementExpected) {#DgnMultiTextElement-byte:A-boolean}
```java
public DgnMultiTextElement(byte[] rawData, boolean is3DElementExpected)
```

Initializes a new instance of the DgnMultiTextElement class

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rawData | byte[] | raw data |
| is3DElementExpected | boolean | is 3D |

### getLinesNumber() {#getLinesNumber}
```java
public int getLinesNumber()
```

Gets number of lines

**Returns:** int

### getNodeNumber() {#getNodeNumber}
```java
public int getNodeNumber()
```

Gets nodes number

**Returns:** int

### getLineSpacing() {#getLineSpacing}
```java
public int getLineSpacing()
```

Gets line spacing

**Returns:** int

### getMaximumlengthAllowed() {#getMaximumlengthAllowed}
```java
public short getMaximumlengthAllowed()
```

Gets maximum length allowed

**Returns:** short

### getMaximumlengthAllowUsed() {#getMaximumlengthAllowUsed}
```java
public short getMaximumlengthAllowUsed()
```

Gets maximum length allowed to use

**Returns:** short

### getStrings() {#getStrings}
```java
public DgnTextElement[] getStrings()
```

Gets lines

**Returns:** DgnTextElement[]

### addText(DgnTextElement text) {#addText-com.aspose.cad.fileformats.dgn.dgnelements.DgnTextElement}
```java
public void addText(DgnTextElement text)
```

Adds text element

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| text | DgnTextElement | text element to add |

### getTextSize() {#getTextSize}
```java
public com.aspose.cad.SizeF getTextSize()
```

Gets text size in UOR

**Returns:** com.aspose.cad.SizeF

