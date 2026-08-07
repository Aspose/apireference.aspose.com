---
title: "DgnRootElement"
linktitle: "DgnRootElement"
second_title: "Aspose.CAD for Java"
description: "Represents root element of a DGN file"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.dgn.dgnelements/dgnrootelement/
---

**Inheritance:** java.lang.Object, DgnElement

Represents root element of a DGN file

## Constructors

| Constructor | Description |
| --- | --- |
| [DgnRootElement(byte[] data)](#DgnRootElement-byte:A) | Initializes a new instance of the DgnRootElement class |

## Methods

| Method | Description |
| --- | --- |
| [getIs3D()](#getIs3D) | Gets a value indicating whether the file is 3D model |
| [getScale()](#getScale) | Gets global scale factor |
| [getOriginPoint()](#getOriginPoint) | Gets global origin point |
| [getAxisLockAngel()](#getAxisLockAngel) | Gets axis lock angel |
| [getAxisLockOrigin()](#getAxisLockOrigin) | Gets axis lock origin |
| [getActiveCell()](#getActiveCell) | Gets active cell |
| [getActivePatteringScale()](#getActivePatteringScale) | Gets active pattering scale |
| [getActivePatteringCell()](#getActivePatteringCell) | Gets active pattering cell |
| [getActivePatteringRowSpacing()](#getActivePatteringRowSpacing) | Gets active pattering row spacing |
| [getActivePatteringAngle()](#getActivePatteringAngle) | Gets active pattering angle |
| [getActivePatteringAngle2()](#getActivePatteringAngle2) | Gets second active pattering angle |
| [getActivePatteringColumnSpacing()](#getActivePatteringColumnSpacing) | Gets active pattering column spacing |
| [getActivePoint()](#getActivePoint) | Gets active point |
| [getActiveLineTerminatorScale()](#getActiveLineTerminatorScale) | Gets active line terminator scale |
| [getActiveLineTerminator()](#getActiveLineTerminator) | Gets active line terminator |
| [getKeyPointSnapFlag()](#getKeyPointSnapFlag) | Gets key point snap flag |
| [getKeyPointSnapDivisor()](#getKeyPointSnapDivisor) | Gets key point snap divisor |
| [getUnitType()](#getUnitType) | Gets or sets unit type of design file |
| [getSubUnitType()](#getSubUnitType) | Gets or sets sub-unit type of design file |

### DgnRootElement(byte[] data) {#DgnRootElement-byte:A}
```java
public DgnRootElement(byte[] data)
```

Initializes a new instance of the DgnRootElement class

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| data | byte[] | raw data |

### getIs3D() {#getIs3D}
```java
public boolean getIs3D()
```

Gets a value indicating whether the file is 3D model

**Returns:** boolean

### getScale() {#getScale}
```java
public double getScale()
```

Gets global scale factor

**Returns:** double

### getOriginPoint() {#getOriginPoint}
```java
public DgnPoint getOriginPoint()
```

Gets global origin point

**Returns:** DgnPoint

### getAxisLockAngel() {#getAxisLockAngel}
```java
public double getAxisLockAngel()
```

Gets axis lock angel

**Returns:** double

### getAxisLockOrigin() {#getAxisLockOrigin}
```java
public double getAxisLockOrigin()
```

Gets axis lock origin

**Returns:** double

### getActiveCell() {#getActiveCell}
```java
public int getActiveCell()
```

Gets active cell

**Returns:** int

### getActivePatteringScale() {#getActivePatteringScale}
```java
public double getActivePatteringScale()
```

Gets active pattering scale

**Returns:** double

### getActivePatteringCell() {#getActivePatteringCell}
```java
public int getActivePatteringCell()
```

Gets active pattering cell

**Returns:** int

### getActivePatteringRowSpacing() {#getActivePatteringRowSpacing}
```java
public int getActivePatteringRowSpacing()
```

Gets active pattering row spacing

**Returns:** int

### getActivePatteringAngle() {#getActivePatteringAngle}
```java
public double getActivePatteringAngle()
```

Gets active pattering angle

**Returns:** double

### getActivePatteringAngle2() {#getActivePatteringAngle2}
```java
public double getActivePatteringAngle2()
```

Gets second active pattering angle

**Returns:** double

### getActivePatteringColumnSpacing() {#getActivePatteringColumnSpacing}
```java
public int getActivePatteringColumnSpacing()
```

Gets active pattering column spacing

**Returns:** int

### getActivePoint() {#getActivePoint}
```java
public int getActivePoint()
```

Gets active point

**Returns:** int

### getActiveLineTerminatorScale() {#getActiveLineTerminatorScale}
```java
public double getActiveLineTerminatorScale()
```

Gets active line terminator scale

**Returns:** double

### getActiveLineTerminator() {#getActiveLineTerminator}
```java
public int getActiveLineTerminator()
```

Gets active line terminator

**Returns:** int

### getKeyPointSnapFlag() {#getKeyPointSnapFlag}
```java
public short getKeyPointSnapFlag()
```

Gets key point snap flag

**Returns:** short

### getKeyPointSnapDivisor() {#getKeyPointSnapDivisor}
```java
public short getKeyPointSnapDivisor()
```

Gets key point snap divisor

**Returns:** short

### getUnitType() {#getUnitType}
```java
public int getUnitType()
```

Gets or sets unit type of design file

**Returns:** int

### getSubUnitType() {#getSubUnitType}
```java
public int getSubUnitType()
```

Gets or sets sub-unit type of design file

**Returns:** int

