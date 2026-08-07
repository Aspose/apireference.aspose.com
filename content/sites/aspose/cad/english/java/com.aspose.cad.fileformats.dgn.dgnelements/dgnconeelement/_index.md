---
title: "DgnConeElement"
linktitle: "DgnConeElement"
second_title: "Aspose.CAD for Java"
description: "Represents Cone element"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.dgn.dgnelements/dgnconeelement/
---

**Inheritance:** java.lang.Object, DgnDrawingElementBaseQuaternion

Represents Cone element

## Constructors

| Constructor | Description |
| --- | --- |
| [DgnConeElement(byte[] rawData, boolean is3DElementExpected)](#DgnConeElement-byte:A-boolean) | Initializes a new instance of the DgnConeElement class from raw data Initializes a new instance of the DgnArcElement class |

## Methods

| Method | Description |
| --- | --- |
| [getFirstCircle()](#getFirstCircle) | Gets first circle |
| [getSecondCircle()](#getSecondCircle) | Gets second circle |
| [getMinPoint()](#getMinPoint) | Gets the min point of object. |
| [getMaxPoint()](#getMaxPoint) | Gets the max point of object. |

### DgnConeElement(byte[] rawData, boolean is3DElementExpected) {#DgnConeElement-byte:A-boolean}
```java
public DgnConeElement(byte[] rawData, boolean is3DElementExpected)
```

Initializes a new instance of the DgnConeElement class from raw data Initializes a new instance of the DgnArcElement class

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rawData | byte[] | raw data |
| is3DElementExpected | boolean | is 3D object expected |

### getFirstCircle() {#getFirstCircle}
```java
public DgnCircle getFirstCircle()
```

Gets first circle

**Returns:** DgnCircle

### getSecondCircle() {#getSecondCircle}
```java
public DgnCircle getSecondCircle()
```

Gets second circle

**Returns:** DgnCircle

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

