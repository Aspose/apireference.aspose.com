---
title: "DgnCellHeaderElement"
linktitle: "DgnCellHeaderElement"
second_title: "Aspose.CAD for Java"
description: "Represents cell header element"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.dgn.dgnelements/dgncellheaderelement/
---

**Inheritance:** java.lang.Object, DgnDrawingElementBase

**All Implemented Interfaces:** ICompositeDgnElement

Represents cell header element

## Constructors

| Constructor | Description |
| --- | --- |
| [DgnCellHeaderElement(byte[] rawData, boolean is3DElementExpected)](#DgnCellHeaderElement-byte:A-boolean) | Initializes a new instance of the DgnCellHeaderElement class |

## Methods

| Method | Description |
| --- | --- |
| [getName()](#getName) | Gets cell name |
| [getClassBitmap()](#getClassBitmap) | Gets cell's class bit map |
| [getLevels()](#getLevels) | Gets array of levels used in cell |
| [getRangeBlockLow()](#getRangeBlockLow) | Gets cell's range block low |
| [getRangeBlockHi()](#getRangeBlockHi) | Gets cell's range block hi |
| [getTransFormationMatrix()](#getTransFormationMatrix) | Gets cell's 2D/3D transformation matrix |
| [getOrigin()](#getOrigin) | Gets cell's origin point |
| [getXScale()](#getXScale) | Gets cell's x scale |
| [getYScale()](#getYScale) | Gets cell's y scale |
| [getRotation()](#getRotation) | Gets cell's rotation angle |
| [getChilds()](#getChilds) | Gets childs of the composite element |
| [addChild(DgnElement child)](#addChild-com.aspose.cad.fileformats.dgn.dgnelements.DgnElement) | Adds element as a child |
| [getMinPoint()](#getMinPoint) | Gets the min point of object. |
| [getMaxPoint()](#getMaxPoint) | Gets the max point of object. |

### DgnCellHeaderElement(byte[] rawData, boolean is3DElementExpected) {#DgnCellHeaderElement-byte:A-boolean}
```java
public DgnCellHeaderElement(byte[] rawData, boolean is3DElementExpected)
```

Initializes a new instance of the DgnCellHeaderElement class

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rawData | byte[] | raw data |
| is3DElementExpected | boolean | is 3D |

### getName() {#getName}
```java
public String getName()
```

Gets cell name

**Returns:** String

### getClassBitmap() {#getClassBitmap}
```java
public int getClassBitmap()
```

Gets cell's class bit map

**Returns:** int

### getLevels() {#getLevels}
```java
public int[] getLevels()
```

Gets array of levels used in cell

**Returns:** int[]

### getRangeBlockLow() {#getRangeBlockLow}
```java
public DgnPoint getRangeBlockLow()
```

Gets cell's range block low

**Returns:** DgnPoint

### getRangeBlockHi() {#getRangeBlockHi}
```java
public DgnPoint getRangeBlockHi()
```

Gets cell's range block hi

**Returns:** DgnPoint

### getTransFormationMatrix() {#getTransFormationMatrix}
```java
public double[] getTransFormationMatrix()
```

Gets cell's 2D/3D transformation matrix

**Returns:** double[]

### getOrigin() {#getOrigin}
```java
public DgnPoint getOrigin()
```

Gets cell's origin point

**Returns:** DgnPoint

### getXScale() {#getXScale}
```java
public double getXScale()
```

Gets cell's x scale

**Returns:** double

### getYScale() {#getYScale}
```java
public double getYScale()
```

Gets cell's y scale

**Returns:** double

### getRotation() {#getRotation}
```java
public double getRotation()
```

Gets cell's rotation angle

**Returns:** double

### getChilds() {#getChilds}
```java
public List<DgnDrawingElementBase> getChilds()
```

Gets childs of the composite element

**Returns:** List<DgnDrawingElementBase>

### addChild(DgnElement child) {#addChild-com.aspose.cad.fileformats.dgn.dgnelements.DgnElement}
```java
public void addChild(DgnElement child)
```

Adds element as a child

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| child | DgnElement | element to add as a child |

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

