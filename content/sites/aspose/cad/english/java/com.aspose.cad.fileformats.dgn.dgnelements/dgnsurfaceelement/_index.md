---
title: "DgnSurfaceElement"
linktitle: "DgnSurfaceElement"
second_title: "Aspose.CAD for Java"
description: "Represents surface element"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.dgn.dgnelements/dgnsurfaceelement/
---

**Inheritance:** java.lang.Object, DgnDrawingElementBase

Represents surface element

## Constructors

| Constructor | Description |
| --- | --- |
| [DgnSurfaceElement(byte[] rawData)](#DgnSurfaceElement-byte:A) | Initializes a new instance of the DgnSurfaceElement class from raw data |

## Methods

| Method | Description |
| --- | --- |
| [isRational()](#isRational) | Gets a value indicating whether the surface is rational |
| [isUniform()](#isUniform) | Gets or sets a value indicating whether the surface is uniformed |
| [setUniform(boolean value)](#setUniform-boolean) | Gets or sets a value indicating whether the surface is uniformed |
| [getPropertiesU()](#getPropertiesU) | Gets Properties for U |
| [getOrderU()](#getOrderU) | Gets Order for U |
| [getPolesCountU()](#getPolesCountU) | Gets poles count for U |
| [getKnotsCountU()](#getKnotsCountU) | Gets knots count for U |
| [getRuleLinesU()](#getRuleLinesU) | Gets rule lines for U |
| [getPropertiesV()](#getPropertiesV) | Gets Properties for V |
| [getOrderV()](#getOrderV) | Gets Order for V |
| [getPolesCountV()](#getPolesCountV) | Gets poles count for V |
| [getKnotsCountV()](#getKnotsCountV) | Gets knots count for V |
| [getRuleLinesV()](#getRuleLinesV) | Gets rule lines for V |
| [getSurfaceType()](#getSurfaceType) | Gets surface type |
| [getBoundElementsCount()](#getBoundElementsCount) | Gets bound elements count |
| [getBoundaries()](#getBoundaries) | Gets bound elements |
| [getPoles()](#getPoles) | Gets poles |
| [getKnot()](#getKnot) | Gets or sets knot |
| [getWeights()](#getWeights) | Gets weights |
| [getMinPoint()](#getMinPoint) | Gets the min point of object. |
| [getMaxPoint()](#getMaxPoint) | Gets the max point of object. |

### DgnSurfaceElement(byte[] rawData) {#DgnSurfaceElement-byte:A}
```java
public DgnSurfaceElement(byte[] rawData)
```

Initializes a new instance of the DgnSurfaceElement class from raw data

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rawData | byte[] | Raw data |

### isRational() {#isRational}
```java
public boolean isRational()
```

Gets a value indicating whether the surface is rational

**Returns:** boolean

### isUniform() {#isUniform}
```java
public boolean isUniform()
```

Gets or sets a value indicating whether the surface is uniformed

**Returns:** boolean

### setUniform(boolean value) {#setUniform-boolean}
```java
public void setUniform(boolean value)
```

Gets or sets a value indicating whether the surface is uniformed

### getPropertiesU() {#getPropertiesU}
```java
public byte getPropertiesU()
```

Gets Properties for U

**Returns:** byte

### getOrderU() {#getOrderU}
```java
public byte getOrderU()
```

Gets Order for U

**Returns:** byte

### getPolesCountU() {#getPolesCountU}
```java
public int getPolesCountU()
```

Gets poles count for U

**Returns:** int

### getKnotsCountU() {#getKnotsCountU}
```java
public int getKnotsCountU()
```

Gets knots count for U

**Returns:** int

### getRuleLinesU() {#getRuleLinesU}
```java
public int getRuleLinesU()
```

Gets rule lines for U

**Returns:** int

### getPropertiesV() {#getPropertiesV}
```java
public byte getPropertiesV()
```

Gets Properties for V

**Returns:** byte

### getOrderV() {#getOrderV}
```java
public byte getOrderV()
```

Gets Order for V

**Returns:** byte

### getPolesCountV() {#getPolesCountV}
```java
public int getPolesCountV()
```

Gets poles count for V

**Returns:** int

### getKnotsCountV() {#getKnotsCountV}
```java
public int getKnotsCountV()
```

Gets knots count for V

**Returns:** int

### getRuleLinesV() {#getRuleLinesV}
```java
public int getRuleLinesV()
```

Gets rule lines for V

**Returns:** int

### getSurfaceType() {#getSurfaceType}
```java
public int getSurfaceType()
```

Gets surface type

**Returns:** int

### getBoundElementsCount() {#getBoundElementsCount}
```java
public int getBoundElementsCount()
```

Gets bound elements count

**Returns:** int

### getBoundaries() {#getBoundaries}
```java
public DgnDrawingElementBase[] getBoundaries()
```

Gets bound elements

**Returns:** DgnDrawingElementBase[]

### getPoles() {#getPoles}
```java
public DgnSplinePoleElement[] getPoles()
```

Gets poles

**Returns:** DgnSplinePoleElement[]

### getKnot() {#getKnot}
```java
public DgnSplineKnotElement getKnot()
```

Gets or sets knot

**Returns:** DgnSplineKnotElement

### getWeights() {#getWeights}
```java
public DgnSplineWeightFactorElement[] getWeights()
```

Gets weights

**Returns:** DgnSplineWeightFactorElement[]

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

