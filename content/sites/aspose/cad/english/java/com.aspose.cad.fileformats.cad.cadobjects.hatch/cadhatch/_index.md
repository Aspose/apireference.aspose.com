---
title: "CadHatch"
linktitle: "CadHatch"
second_title: "Aspose.CAD for Java"
description: "The Cad hatch."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad.cadobjects.hatch/cadhatch/
---

**Inheritance:** java.lang.Object, CadBaseExtrudedEntity

The Cad hatch.

## Constructors

| Constructor | Description |
| --- | --- |
| [CadHatch()](#CadHatch) |  |

## Methods

| Method | Description |
| --- | --- |
| [getTypeName()](#getTypeName) | Gets the name of the type. |
| [getExtrusionDirection()](#getExtrusionDirection) | Gets or sets the extrusion direction. |
| [setExtrusionDirection(Cad3DPoint value)](#setExtrusionDirection-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint) | Gets or sets the extrusion direction. |
| [getReservedForFutureValues()](#getReservedForFutureValues) | Gets or sets the reserved for future. |
| [setReservedForFutureValues(List<CadReservedForFutureValues> value)](#setReservedForFutureValues-java.util.List) | Gets or sets the reserved for future. |
| [getHatchString()](#getHatchString) | Gets or sets the hatch string. |
| [setHatchString(String value)](#setHatchString-java.lang.String) | Gets or sets the hatch string. |
| [getZeroIsReserved()](#getZeroIsReserved) | Gets or sets the zero is reserved. |
| [setZeroIsReserved(int value)](#setZeroIsReserved-int) | Gets or sets the zero is reserved. |
| [getAssociativeFlag()](#getAssociativeFlag) | Gets or sets the associative flag. |
| [setAssociativeFlag(short value)](#setAssociativeFlag-short) | Gets or sets the associative flag. |
| [getBoundaryAnnotation()](#getBoundaryAnnotation) | Gets or sets the boundary annotation. |
| [setBoundaryAnnotation(short value)](#setBoundaryAnnotation-short) | Gets or sets the boundary annotation. |
| [getBoundaryPaths()](#getBoundaryPaths) | Gets or sets the boundary paths. |
| [setBoundaryPaths(List<CadHatchBoundaryPathContainer> value)](#setBoundaryPaths-java.util.List) | Gets or sets the boundary paths. |
| [getElevation()](#getElevation) | Gets or sets the elevation. |
| [setElevation(double value)](#setElevation-double) | Gets or sets the elevation. |
| [getGradientColorTint()](#getGradientColorTint) | Gets or sets the gradient color tint. |
| [setGradientColorTint(double value)](#setGradientColorTint-double) | Gets or sets the gradient color tint. |
| [getGradientColorsType()](#getGradientColorsType) | Gets or sets the gradient colors type. |
| [setGradientColorsType(int value)](#setGradientColorsType-int) | Gets or sets the gradient colors type. |
| [getGradientDefinition()](#getGradientDefinition) | Gets or sets the gradient definition. |
| [setGradientDefinition(double value)](#setGradientDefinition-double) | Gets or sets the gradient definition. |
| [getGradientRotationAngle()](#getGradientRotationAngle) | Gets or sets the gradient rotation angle. |
| [setGradientRotationAngle(double value)](#setGradientRotationAngle-double) | Gets or sets the gradient rotation angle. |
| [getGradientType()](#getGradientType) | Gets or sets the gradient type. |
| [setGradientType(int value)](#setGradientType-int) | Gets or sets the gradient type. |
| [getHatchAngle()](#getHatchAngle) | Gets or sets the hatch angle. |
| [setHatchAngle(double value)](#setHatchAngle-double) | Gets or sets the hatch angle. |
| [getHatchPatternDoubleFlag()](#getHatchPatternDoubleFlag) | Gets or sets the hatch pattern double flag. |
| [setHatchPatternDoubleFlag(short value)](#setHatchPatternDoubleFlag-short) | Gets or sets the hatch pattern double flag. |
| [getHatchPatternType()](#getHatchPatternType) | Gets or sets the hatch pattern type. |
| [setHatchPatternType(short value)](#setHatchPatternType-short) | Gets or sets the hatch pattern type. |
| [getHatchScaleOrSpacing()](#getHatchScaleOrSpacing) | Gets or sets the hatch scale or spacing. |
| [setHatchScaleOrSpacing(double value)](#setHatchScaleOrSpacing-double) | Gets or sets the hatch scale or spacing. |
| [getHatchStyle()](#getHatchStyle) | Gets or sets the hatch style. |
| [setHatchStyle(short value)](#setHatchStyle-short) | Gets or sets the hatch style. |
| [getIgnoredBoundaries()](#getIgnoredBoundaries) | Gets or sets the ignored boundaries. |
| [setIgnoredBoundaries(int value)](#setIgnoredBoundaries-int) | Gets or sets the ignored boundaries. |
| [getNumberOfBoundaries()](#getNumberOfBoundaries) | Gets or sets the number of boundaries. |
| [setNumberOfBoundaries(int value)](#setNumberOfBoundaries-int) | Gets or sets the number of boundaries. |
| [getNumberOfPatternDefinitions()](#getNumberOfPatternDefinitions) | Gets or sets the number of pattern definitions. |
| [setNumberOfPatternDefinitions(short value)](#setNumberOfPatternDefinitions-short) | Gets or sets the number of pattern definitions. |
| [getNumberOfSeedPoints()](#getNumberOfSeedPoints) | Gets or sets the number of seed points. |
| [setNumberOfSeedPoints(int value)](#setNumberOfSeedPoints-int) | Gets or sets the number of seed points. |
| [getOffsetVector()](#getOffsetVector) | Gets or sets the offset vector. |
| [setOffsetVector(double value)](#setOffsetVector-double) | Gets or sets the offset vector. |
| [getPatternFillColor()](#getPatternFillColor) | Gets or sets the pattern fill color. |
| [setPatternFillColor(short value)](#setPatternFillColor-short) | Gets or sets the pattern fill color. |
| [getPatternName()](#getPatternName) | Gets or sets the pattern name. |
| [setPatternName(String value)](#setPatternName-java.lang.String) | Gets or sets the pattern name. |
| [getPixelSize()](#getPixelSize) | Gets or sets the pixel size. |
| [setPixelSize(double value)](#setPixelSize-double) | Gets or sets the pixel size. |
| [getSeedPoints()](#getSeedPoints) | Gets or sets the seed points. |
| [setSeedPoints(List<Cad2DPoint> value)](#setSeedPoints-java.util.List) | Gets or sets the seed points. |
| [getSolidFillFlag()](#getSolidFillFlag) | Gets or sets the solid fill flag. |
| [setSolidFillFlag(short value)](#setSolidFillFlag-short) | Gets or sets the solid fill flag. |
| [getSolidOrGradient()](#getSolidOrGradient) | Gets or sets the solid or gradient. |
| [setSolidOrGradient(int value)](#setSolidOrGradient-int) | Gets or sets the solid or gradient. |
| [getPatternDefinitions()](#getPatternDefinitions) | Gets or sets the pattern definitions. |
| [setPatternDefinitions(List<CadHatchPatternData> value)](#setPatternDefinitions-java.util.List) | Gets or sets the pattern definitions. |
| [getGradientName()](#getGradientName) | The Gradient Name |
| [setGradientName(String value)](#setGradientName-java.lang.String) | The Gradient Name |

### CadHatch() {#CadHatch}
```java
public CadHatch()
```

### getTypeName() {#getTypeName}
```java
public int getTypeName()
```

Gets the name of the type.

**Returns:** int - The name of the type.

### getExtrusionDirection() {#getExtrusionDirection}
```java
public Cad3DPoint getExtrusionDirection()
```

Gets or sets the extrusion direction.

**Returns:** Cad3DPoint

### setExtrusionDirection(Cad3DPoint value) {#setExtrusionDirection-com.aspose.cad.fileformats.cad.cadobjects.Cad3DPoint}
```java
public void setExtrusionDirection(Cad3DPoint value)
```

Gets or sets the extrusion direction.

### getReservedForFutureValues() {#getReservedForFutureValues}
```java
public final List<CadReservedForFutureValues> getReservedForFutureValues()
```

Gets or sets the reserved for future.

**Returns:** List<CadReservedForFutureValues> - The reserved for future.

### setReservedForFutureValues(List<CadReservedForFutureValues> value) {#setReservedForFutureValues-java.util.List}
```java
public final void setReservedForFutureValues(List<CadReservedForFutureValues> value)
```

Gets or sets the reserved for future.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<CadReservedForFutureValues> | The reserved for future. |

### getHatchString() {#getHatchString}
```java
public final String getHatchString()
```

Gets or sets the hatch string.

**Returns:** String - The hatch string.

### setHatchString(String value) {#setHatchString-java.lang.String}
```java
public final void setHatchString(String value)
```

Gets or sets the hatch string.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The hatch string. |

### getZeroIsReserved() {#getZeroIsReserved}
```java
public final int getZeroIsReserved()
```

Gets or sets the zero is reserved.

**Returns:** int - The zero is reserved.

### setZeroIsReserved(int value) {#setZeroIsReserved-int}
```java
public final void setZeroIsReserved(int value)
```

Gets or sets the zero is reserved.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The zero is reserved. |

### getAssociativeFlag() {#getAssociativeFlag}
```java
public final short getAssociativeFlag()
```

Gets or sets the associative flag.

**Returns:** short

### setAssociativeFlag(short value) {#setAssociativeFlag-short}
```java
public final void setAssociativeFlag(short value)
```

Gets or sets the associative flag.

### getBoundaryAnnotation() {#getBoundaryAnnotation}
```java
public final short getBoundaryAnnotation()
```

Gets or sets the boundary annotation.

**Returns:** short

### setBoundaryAnnotation(short value) {#setBoundaryAnnotation-short}
```java
public final void setBoundaryAnnotation(short value)
```

Gets or sets the boundary annotation.

### getBoundaryPaths() {#getBoundaryPaths}
```java
public final List<CadHatchBoundaryPathContainer> getBoundaryPaths()
```

Gets or sets the boundary paths.

**Returns:** List<CadHatchBoundaryPathContainer> - The boundary paths.

### setBoundaryPaths(List<CadHatchBoundaryPathContainer> value) {#setBoundaryPaths-java.util.List}
```java
public final void setBoundaryPaths(List<CadHatchBoundaryPathContainer> value)
```

Gets or sets the boundary paths.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<CadHatchBoundaryPathContainer> | The boundary paths. |

### getElevation() {#getElevation}
```java
public final double getElevation()
```

Gets or sets the elevation.

**Returns:** double

### setElevation(double value) {#setElevation-double}
```java
public final void setElevation(double value)
```

Gets or sets the elevation.

### getGradientColorTint() {#getGradientColorTint}
```java
public final double getGradientColorTint()
```

Gets or sets the gradient color tint.

**Returns:** double - The gradient color tint.

### setGradientColorTint(double value) {#setGradientColorTint-double}
```java
public final void setGradientColorTint(double value)
```

Gets or sets the gradient color tint.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The gradient color tint. |

### getGradientColorsType() {#getGradientColorsType}
```java
public final int getGradientColorsType()
```

Gets or sets the gradient colors type.

**Returns:** int

### setGradientColorsType(int value) {#setGradientColorsType-int}
```java
public final void setGradientColorsType(int value)
```

Gets or sets the gradient colors type.

### getGradientDefinition() {#getGradientDefinition}
```java
public final double getGradientDefinition()
```

Gets or sets the gradient definition.

**Returns:** double

### setGradientDefinition(double value) {#setGradientDefinition-double}
```java
public final void setGradientDefinition(double value)
```

Gets or sets the gradient definition.

### getGradientRotationAngle() {#getGradientRotationAngle}
```java
public final double getGradientRotationAngle()
```

Gets or sets the gradient rotation angle.

**Returns:** double

### setGradientRotationAngle(double value) {#setGradientRotationAngle-double}
```java
public final void setGradientRotationAngle(double value)
```

Gets or sets the gradient rotation angle.

### getGradientType() {#getGradientType}
```java
public final int getGradientType()
```

Gets or sets the gradient type.

**Returns:** int

### setGradientType(int value) {#setGradientType-int}
```java
public final void setGradientType(int value)
```

Gets or sets the gradient type.

### getHatchAngle() {#getHatchAngle}
```java
public final double getHatchAngle()
```

Gets or sets the hatch angle.

**Returns:** double

### setHatchAngle(double value) {#setHatchAngle-double}
```java
public final void setHatchAngle(double value)
```

Gets or sets the hatch angle.

### getHatchPatternDoubleFlag() {#getHatchPatternDoubleFlag}
```java
public final short getHatchPatternDoubleFlag()
```

Gets or sets the hatch pattern double flag.

**Returns:** short

### setHatchPatternDoubleFlag(short value) {#setHatchPatternDoubleFlag-short}
```java
public final void setHatchPatternDoubleFlag(short value)
```

Gets or sets the hatch pattern double flag.

### getHatchPatternType() {#getHatchPatternType}
```java
public final short getHatchPatternType()
```

Gets or sets the hatch pattern type.

**Returns:** short

### setHatchPatternType(short value) {#setHatchPatternType-short}
```java
public final void setHatchPatternType(short value)
```

Gets or sets the hatch pattern type.

### getHatchScaleOrSpacing() {#getHatchScaleOrSpacing}
```java
public final double getHatchScaleOrSpacing()
```

Gets or sets the hatch scale or spacing.

**Returns:** double

### setHatchScaleOrSpacing(double value) {#setHatchScaleOrSpacing-double}
```java
public final void setHatchScaleOrSpacing(double value)
```

Gets or sets the hatch scale or spacing.

### getHatchStyle() {#getHatchStyle}
```java
public final short getHatchStyle()
```

Gets or sets the hatch style.

**Returns:** short

### setHatchStyle(short value) {#setHatchStyle-short}
```java
public final void setHatchStyle(short value)
```

Gets or sets the hatch style.

### getIgnoredBoundaries() {#getIgnoredBoundaries}
```java
public final int getIgnoredBoundaries()
```

Gets or sets the ignored boundaries.

**Returns:** int

### setIgnoredBoundaries(int value) {#setIgnoredBoundaries-int}
```java
public final void setIgnoredBoundaries(int value)
```

Gets or sets the ignored boundaries.

### getNumberOfBoundaries() {#getNumberOfBoundaries}
```java
public final int getNumberOfBoundaries()
```

Gets or sets the number of boundaries.

**Returns:** int

### setNumberOfBoundaries(int value) {#setNumberOfBoundaries-int}
```java
public final void setNumberOfBoundaries(int value)
```

Gets or sets the number of boundaries.

### getNumberOfPatternDefinitions() {#getNumberOfPatternDefinitions}
```java
public final short getNumberOfPatternDefinitions()
```

Gets or sets the number of pattern definitions.

**Returns:** short

### setNumberOfPatternDefinitions(short value) {#setNumberOfPatternDefinitions-short}
```java
public final void setNumberOfPatternDefinitions(short value)
```

Gets or sets the number of pattern definitions.

### getNumberOfSeedPoints() {#getNumberOfSeedPoints}
```java
public final int getNumberOfSeedPoints()
```

Gets or sets the number of seed points.

**Returns:** int

### setNumberOfSeedPoints(int value) {#setNumberOfSeedPoints-int}
```java
public final void setNumberOfSeedPoints(int value)
```

Gets or sets the number of seed points.

### getOffsetVector() {#getOffsetVector}
```java
public final double getOffsetVector()
```

Gets or sets the offset vector.

**Returns:** double

### setOffsetVector(double value) {#setOffsetVector-double}
```java
public final void setOffsetVector(double value)
```

Gets or sets the offset vector.

### getPatternFillColor() {#getPatternFillColor}
```java
public final short getPatternFillColor()
```

Gets or sets the pattern fill color.

**Returns:** short

### setPatternFillColor(short value) {#setPatternFillColor-short}
```java
public final void setPatternFillColor(short value)
```

Gets or sets the pattern fill color.

### getPatternName() {#getPatternName}
```java
public final String getPatternName()
```

Gets or sets the pattern name.

**Returns:** String

### setPatternName(String value) {#setPatternName-java.lang.String}
```java
public final void setPatternName(String value)
```

Gets or sets the pattern name.

### getPixelSize() {#getPixelSize}
```java
public final double getPixelSize()
```

Gets or sets the pixel size.

**Returns:** double

### setPixelSize(double value) {#setPixelSize-double}
```java
public final void setPixelSize(double value)
```

Gets or sets the pixel size.

### getSeedPoints() {#getSeedPoints}
```java
public final List<Cad2DPoint> getSeedPoints()
```

Gets or sets the seed points.

**Returns:** List<Cad2DPoint>

### setSeedPoints(List<Cad2DPoint> value) {#setSeedPoints-java.util.List}
```java
public final void setSeedPoints(List<Cad2DPoint> value)
```

Gets or sets the seed points.

### getSolidFillFlag() {#getSolidFillFlag}
```java
public final short getSolidFillFlag()
```

Gets or sets the solid fill flag.

**Returns:** short

### setSolidFillFlag(short value) {#setSolidFillFlag-short}
```java
public final void setSolidFillFlag(short value)
```

Gets or sets the solid fill flag.

### getSolidOrGradient() {#getSolidOrGradient}
```java
public final int getSolidOrGradient()
```

Gets or sets the solid or gradient.

**Returns:** int

### setSolidOrGradient(int value) {#setSolidOrGradient-int}
```java
public final void setSolidOrGradient(int value)
```

Gets or sets the solid or gradient.

### getPatternDefinitions() {#getPatternDefinitions}
```java
public final List<CadHatchPatternData> getPatternDefinitions()
```

Gets or sets the pattern definitions.

**Returns:** List<CadHatchPatternData>

### setPatternDefinitions(List<CadHatchPatternData> value) {#setPatternDefinitions-java.util.List}
```java
public final void setPatternDefinitions(List<CadHatchPatternData> value)
```

Gets or sets the pattern definitions.

### getGradientName() {#getGradientName}
```java
public final String getGradientName()
```

The Gradient Name

**Returns:** String

### setGradientName(String value) {#setGradientName-java.lang.String}
```java
public final void setGradientName(String value)
```

The Gradient Name

