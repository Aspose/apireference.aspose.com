---
title: "ColorPaletteHelper"
linktitle: "ColorPaletteHelper"
second_title: "Aspose.CAD for Java"
description: "Helper class for color palettes manipulation."
type: docs
weight: 10
url: /java/com.aspose.cad/colorpalettehelper/
---

Helper class for color palettes manipulation.

## Methods

| Method | Description |
| --- | --- |
| [createMonochrome()](#createMonochrome) | Creates a monochrome color palette containing 2 colors only. |
| [create4Bit()](#create4Bit) | Creates the 4 bit color palette. |
| [create4BitGrayscale(boolean minIsWhite)](#create4BitGrayscale-boolean) | Creates the 4 bit grayscale palette. |
| [create8Bit()](#create8Bit) | Creates the 8 bit color palette. |
| [create8BitGrayscale(boolean minIsWhite)](#create8BitGrayscale-boolean) | Creates the 8 bit grayscale palette. |
| [getCloseImagePalette(RasterImage image, int entriesCount)](#getCloseImagePalette-com.aspose.cad.RasterImage-int) | Gets color palette from raster image (palletizes image) in case the image does not have one. In case palette exists_internalized it will be used instead performing calculations. |
| [getUniformColorPalette(RasterImage image)](#getUniformColorPalette-com.aspose.cad.RasterImage) | Get uniform 256 color palette. |
| [getDownscalePalette(RasterImage image)](#getDownscalePalette-com.aspose.cad.RasterImage) | Get 256 color palette, composed from upper bits of initial image color values. |

### createMonochrome() {#createMonochrome}
```java
public static com.aspose.cad.IColorPalette createMonochrome()
```

Creates a monochrome color palette containing 2 colors only.

**Returns:** com.aspose.cad.IColorPalette - Color palette for monochrome images.

### create4Bit() {#create4Bit}
```java
public static com.aspose.cad.IColorPalette create4Bit()
```

Creates the 4 bit color palette.

**Returns:** com.aspose.cad.IColorPalette - The 4 bit color palette.

### create4BitGrayscale(boolean minIsWhite) {#create4BitGrayscale-boolean}
```java
public static com.aspose.cad.IColorPalette create4BitGrayscale(boolean minIsWhite)
```

Creates the 4 bit grayscale palette.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| minIsWhite | boolean | if set to true the palette starts with white color, otherwise it starts with black color. |

**Returns:** com.aspose.cad.IColorPalette - The 4 bit grayscale palette.

### create8Bit() {#create8Bit}
```java
public static com.aspose.cad.IColorPalette create8Bit()
```

Creates the 8 bit color palette.

**Returns:** com.aspose.cad.IColorPalette - The 8 bit color palette.

### create8BitGrayscale(boolean minIsWhite) {#create8BitGrayscale-boolean}
```java
public static com.aspose.cad.IColorPalette create8BitGrayscale(boolean minIsWhite)
```

Creates the 8 bit grayscale palette.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| minIsWhite | boolean | if set to true the palette starts with white color, otherwise it starts with black color. |

**Returns:** com.aspose.cad.IColorPalette - The 8 bit grayscale palette.

### getCloseImagePalette(RasterImage image, int entriesCount) {#getCloseImagePalette-com.aspose.cad.RasterImage-int}
```java
public static com.aspose.cad.IColorPalette getCloseImagePalette(RasterImage image, int entriesCount)
```

Gets color palette from raster image (palletizes image) in case the image does not have one. In case palette exists_internalized it will be used instead performing calculations.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| image | RasterImage | The raster image. |
| entriesCount | int | The desired entries count. |

**Returns:** com.aspose.cad.IColorPalette - The color palette which starts with the most frequent colors from the image and contains entriesCount entries.

### getUniformColorPalette(RasterImage image) {#getUniformColorPalette-com.aspose.cad.RasterImage}
```java
public static com.aspose.cad.ColorPalette getUniformColorPalette(RasterImage image)
```

Get uniform 256 color palette.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| image | RasterImage | The image. |

**Returns:** com.aspose.cad.ColorPalette - The ColorPalette .

### getDownscalePalette(RasterImage image) {#getDownscalePalette-com.aspose.cad.RasterImage}
```java
public static com.aspose.cad.ColorPalette getDownscalePalette(RasterImage image)
```

Get 256 color palette, composed from upper bits of initial image color values.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| image | RasterImage | The image. |

**Returns:** com.aspose.cad.ColorPalette - The ColorPalette .

