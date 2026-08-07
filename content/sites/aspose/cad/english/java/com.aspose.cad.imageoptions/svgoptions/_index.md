---
title: "SvgOptions"
linktitle: "SvgOptions"
second_title: "Aspose.CAD for Java"
description: "The SVG file format creation options."
type: docs
weight: 10
url: /java/com.aspose.cad.imageoptions/svgoptions/
---

**Inheritance:** java.lang.Object, ImageOptionsBase

The SVG file format creation options.

## Constructors

| Constructor | Description |
| --- | --- |
| [SvgOptions()](#SvgOptions) |  |

## Methods

| Method | Description |
| --- | --- |
| [getColorType()](#getColorType) | Gets or sets the color type for SVG image. |
| [setColorType(int value)](#setColorType-int) | Gets or sets the color type for SVG image. |
| [getTextAsShapes()](#getTextAsShapes) | Gets or sets a value indicating whether text must be converted as shapes. By default text will be converted as shapes. |
| [setTextAsShapes(boolean value)](#setTextAsShapes-boolean) | Gets or sets a value indicating whether text must be converted as shapes. By default text will be converted as shapes. |
| [getCallback()](#getCallback) | Gets or sets the font store options. |
| [setCallback(ISvgResourceKeeperCallback value)](#setCallback-com.aspose.cad.imageoptions.svgoptionsparameters.ISvgResourceKeeperCallback) | Gets or sets the font store options. |
| [getRescaleSubpixelLinewidths()](#getRescaleSubpixelLinewidths) | Wether sub-pixel lindewidths should be rescaled |
| [setRescaleSubpixelLinewidths(boolean value)](#setRescaleSubpixelLinewidths-boolean) | Wether sub-pixel lindewidths should be rescaled |
| [getUseAbsoluteRescaling()](#getUseAbsoluteRescaling) | Wether minimum non-rescaled line widh should be defined relative to whole image size (if false) or in pixels (if true) |
| [setUseAbsoluteRescaling(boolean value)](#setUseAbsoluteRescaling-boolean) | Wether minimum non-rescaled line widh should be defined relative to whole image size (if false) or in pixels (if true) |
| [getMinimumRelativeLinewidthRatio()](#getMinimumRelativeLinewidthRatio) | Lines with width less than image's size\minimumRelativeLinewidthRatio will be rescaled if relative rescaling is used |
| [setMinimumRelativeLinewidthRatio(float value)](#setMinimumRelativeLinewidthRatio-float) | Lines with width less than image's size\minimumRelativeLinewidthRatio will be rescaled if relative rescaling is used |
| [getMinimumAbsoluteNonscaledLinewidth()](#getMinimumAbsoluteNonscaledLinewidth) | Lines with width in pixels less than this will be rescaled |
| [setMinimumAbsoluteNonscaledLinewidth(float value)](#setMinimumAbsoluteNonscaledLinewidth-float) | Lines with width in pixels less than this will be rescaled |
| [getMinimumLinewidth()](#getMinimumLinewidth) | Minumum width of the line (i.e. width of zero-width line) relative to minimum non-rescaled linewidth |
| [setMinimumLinewidth(float value)](#setMinimumLinewidth-float) | Minumum width of the line (i.e. width of zero-width line) relative to minimum non-rescaled linewidth |
| [getTargetFormat()](#getTargetFormat) |  |

### SvgOptions() {#SvgOptions}
```java
public SvgOptions()
```

### getColorType() {#getColorType}
```java
public final int getColorType()
```

Gets or sets the color type for SVG image.

**Returns:** int - The type of the color of SVG image.

### setColorType(int value) {#setColorType-int}
```java
public final void setColorType(int value)
```

Gets or sets the color type for SVG image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The type of the color of SVG image. |

### getTextAsShapes() {#getTextAsShapes}
```java
public final boolean getTextAsShapes()
```

Gets or sets a value indicating whether text must be converted as shapes. By default text will be converted as shapes.

**Returns:** boolean - true if all text is turned into SVG shapes in the convertion; otherwise, false .

### setTextAsShapes(boolean value) {#setTextAsShapes-boolean}
```java
public final void setTextAsShapes(boolean value)
```

Gets or sets a value indicating whether text must be converted as shapes. By default text will be converted as shapes.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if all text is turned into SVG shapes in the convertion; otherwise, false . |

### getCallback() {#getCallback}
```java
public final ISvgResourceKeeperCallback getCallback()
```

Gets or sets the font store options.

**Returns:** ISvgResourceKeeperCallback - The font store options.

### setCallback(ISvgResourceKeeperCallback value) {#setCallback-com.aspose.cad.imageoptions.svgoptionsparameters.ISvgResourceKeeperCallback}
```java
public final void setCallback(ISvgResourceKeeperCallback value)
```

Gets or sets the font store options.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | ISvgResourceKeeperCallback | The font store options. |

### getRescaleSubpixelLinewidths() {#getRescaleSubpixelLinewidths}
```java
public final boolean getRescaleSubpixelLinewidths()
```

Wether sub-pixel lindewidths should be rescaled

**Returns:** boolean

### setRescaleSubpixelLinewidths(boolean value) {#setRescaleSubpixelLinewidths-boolean}
```java
public final void setRescaleSubpixelLinewidths(boolean value)
```

Wether sub-pixel lindewidths should be rescaled

### getUseAbsoluteRescaling() {#getUseAbsoluteRescaling}
```java
public final boolean getUseAbsoluteRescaling()
```

Wether minimum non-rescaled line widh should be defined relative to whole image size (if false) or in pixels (if true)

**Returns:** boolean

### setUseAbsoluteRescaling(boolean value) {#setUseAbsoluteRescaling-boolean}
```java
public final void setUseAbsoluteRescaling(boolean value)
```

Wether minimum non-rescaled line widh should be defined relative to whole image size (if false) or in pixels (if true)

### getMinimumRelativeLinewidthRatio() {#getMinimumRelativeLinewidthRatio}
```java
public final float getMinimumRelativeLinewidthRatio()
```

Lines with width less than image's size\minimumRelativeLinewidthRatio will be rescaled if relative rescaling is used

**Returns:** float

### setMinimumRelativeLinewidthRatio(float value) {#setMinimumRelativeLinewidthRatio-float}
```java
public final void setMinimumRelativeLinewidthRatio(float value)
```

Lines with width less than image's size\minimumRelativeLinewidthRatio will be rescaled if relative rescaling is used

### getMinimumAbsoluteNonscaledLinewidth() {#getMinimumAbsoluteNonscaledLinewidth}
```java
public final float getMinimumAbsoluteNonscaledLinewidth()
```

Lines with width in pixels less than this will be rescaled

**Returns:** float

### setMinimumAbsoluteNonscaledLinewidth(float value) {#setMinimumAbsoluteNonscaledLinewidth-float}
```java
public final void setMinimumAbsoluteNonscaledLinewidth(float value)
```

Lines with width in pixels less than this will be rescaled

### getMinimumLinewidth() {#getMinimumLinewidth}
```java
public final float getMinimumLinewidth()
```

Minumum width of the line (i.e. width of zero-width line) relative to minimum non-rescaled linewidth

**Returns:** float

### setMinimumLinewidth(float value) {#setMinimumLinewidth-float}
```java
public final void setMinimumLinewidth(float value)
```

Minumum width of the line (i.e. width of zero-width line) relative to minimum non-rescaled linewidth

### getTargetFormat() {#getTargetFormat}
```java
public long getTargetFormat()
```

**Returns:** long

