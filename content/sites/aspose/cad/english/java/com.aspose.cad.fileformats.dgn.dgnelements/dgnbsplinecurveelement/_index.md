---
title: "DgnBSplineCurveElement"
linktitle: "DgnBSplineCurveElement"
second_title: "Aspose.CAD for Java"
description: "B-spline curve element"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.dgn.dgnelements/dgnbsplinecurveelement/
---

**Inheritance:** java.lang.Object, DgnDrawingElementBase

B-spline curve element

## Constructors

| Constructor | Description |
| --- | --- |
| [DgnBSplineCurveElement(byte[] rawData)](#DgnBSplineCurveElement-byte:A) | Initializes a new instance of the DgnBSplineCurveElement class from raw data Initializes a new instance of the DgnBSplineCurveElement class |

## Methods

| Method | Description |
| --- | --- |
| [getOrder()](#getOrder) | Gets B-spline order: 2-15 |
| [isClosed()](#isClosed) | Gets a value indicating whether B-spline is closed |
| [isRational()](#isRational) | Gets a value indicating whether B-spline is rational |
| [getCurveType()](#getCurveType) | Gets curve type |
| [getKnotElement()](#getKnotElement) | Gets or sets KNOT element |
| [setKnotElement(DgnSplineKnotElement value)](#setKnotElement-com.aspose.cad.fileformats.dgn.dgnelements.DgnSplineKnotElement) | Gets or sets KNOT element |
| [getPoleElement()](#getPoleElement) | Gets or sets pole element |
| [setPoleElement(DgnSplinePoleElement value)](#setPoleElement-com.aspose.cad.fileformats.dgn.dgnelements.DgnSplinePoleElement) | Gets or sets pole element |
| [getMinPoint()](#getMinPoint) | Gets the min point of object. |
| [getMaxPoint()](#getMaxPoint) | Gets the max point of object. |

### DgnBSplineCurveElement(byte[] rawData) {#DgnBSplineCurveElement-byte:A}
```java
public DgnBSplineCurveElement(byte[] rawData)
```

Initializes a new instance of the DgnBSplineCurveElement class from raw data Initializes a new instance of the DgnBSplineCurveElement class

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rawData | byte[] | Raw data |

### getOrder() {#getOrder}
```java
public byte getOrder()
```

Gets B-spline order: 2-15

**Returns:** byte

### isClosed() {#isClosed}
```java
public boolean isClosed()
```

Gets a value indicating whether B-spline is closed

**Returns:** boolean

### isRational() {#isRational}
```java
public boolean isRational()
```

Gets a value indicating whether B-spline is rational

**Returns:** boolean

### getCurveType() {#getCurveType}
```java
public byte getCurveType()
```

Gets curve type

**Returns:** byte

### getKnotElement() {#getKnotElement}
```java
public DgnSplineKnotElement getKnotElement()
```

Gets or sets KNOT element

**Returns:** DgnSplineKnotElement

### setKnotElement(DgnSplineKnotElement value) {#setKnotElement-com.aspose.cad.fileformats.dgn.dgnelements.DgnSplineKnotElement}
```java
public void setKnotElement(DgnSplineKnotElement value)
```

Gets or sets KNOT element

### getPoleElement() {#getPoleElement}
```java
public DgnSplinePoleElement getPoleElement()
```

Gets or sets pole element

**Returns:** DgnSplinePoleElement

### setPoleElement(DgnSplinePoleElement value) {#setPoleElement-com.aspose.cad.fileformats.dgn.dgnelements.DgnSplinePoleElement}
```java
public void setPoleElement(DgnSplinePoleElement value)
```

Gets or sets pole element

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

