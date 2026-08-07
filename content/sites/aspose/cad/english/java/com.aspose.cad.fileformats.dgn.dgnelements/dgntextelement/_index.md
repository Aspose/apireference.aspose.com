---
title: "DgnTextElement"
linktitle: "DgnTextElement"
second_title: "Aspose.CAD for Java"
description: "Represents text element"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.dgn.dgnelements/dgntextelement/
---

**Inheritance:** java.lang.Object, DgnDrawingElementBaseQuaternion

Represents text element

## Constructors

| Constructor | Description |
| --- | --- |
| [DgnTextElement(byte[] rawData, boolean is3DElementExpected)](#DgnTextElement-byte:A-boolean) | Initializes a new instance of the DgnTextElement class |

## Methods

| Method | Description |
| --- | --- |
| [getFontId()](#getFontId) | Gets or sets font id |
| [getJustification()](#getJustification) | Gets or sets justification |
| [getLengthMultiplier()](#getLengthMultiplier) | Gets or sets char width in master units |
| [getHeightMultiplier()](#getHeightMultiplier) | Gets or sets char height in master units |
| [getRotation()](#getRotation) | Gets or sets counterclockwise rotation in degrees |
| [getOrigin()](#getOrigin) | Gets or sets Bottom left corner of text |
| [getText()](#getText) | Gets actual text |
| [getTextSize()](#getTextSize) | Gets text size in UOR |
| [getMinPoint()](#getMinPoint) | Gets the min point of object. |
| [getMaxPoint()](#getMaxPoint) | Gets the max point of object. |

### DgnTextElement(byte[] rawData, boolean is3DElementExpected) {#DgnTextElement-byte:A-boolean}
```java
public DgnTextElement(byte[] rawData, boolean is3DElementExpected)
```

Initializes a new instance of the DgnTextElement class

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rawData | byte[] | raw data |
| is3DElementExpected | boolean | is 3D |

### getFontId() {#getFontId}
```java
public int getFontId()
```

Gets or sets font id

**Returns:** int

### getJustification() {#getJustification}
```java
public int getJustification()
```

Gets or sets justification

**Returns:** int

### getLengthMultiplier() {#getLengthMultiplier}
```java
public double getLengthMultiplier()
```

Gets or sets char width in master units

**Returns:** double

### getHeightMultiplier() {#getHeightMultiplier}
```java
public double getHeightMultiplier()
```

Gets or sets char height in master units

**Returns:** double

### getRotation() {#getRotation}
```java
public double getRotation()
```

Gets or sets counterclockwise rotation in degrees

**Returns:** double

### getOrigin() {#getOrigin}
```java
public DgnPoint getOrigin()
```

Gets or sets Bottom left corner of text

**Returns:** DgnPoint

### getText() {#getText}
```java
public String getText()
```

Gets actual text

**Returns:** String

### getTextSize() {#getTextSize}
```java
public com.aspose.cad.SizeF getTextSize()
```

Gets text size in UOR

**Returns:** com.aspose.cad.SizeF

### getMinPoint() {#getMinPoint}
```java
public Cad3DPoint getMinPoint()
```

Gets the min point of object.

**Returns:** Cad3DPoint - Min point of object.

### getMaxPoint() {#getMaxPoint}
```java
public Cad3DPoint getMaxPoint()
```

Gets the max point of object.

**Returns:** Cad3DPoint - Max point of object.

