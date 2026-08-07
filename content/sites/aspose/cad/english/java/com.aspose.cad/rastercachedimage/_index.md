---
title: "RasterCachedImage"
linktitle: "RasterCachedImage"
second_title: "Aspose.CAD for Java"
description: "Represents a raster image supporting raster graphics operations."
type: docs
weight: 10
url: /java/com.aspose.cad/rastercachedimage/
---

**Inheritance:** java.lang.Object, RasterImage

Represents a raster image supporting raster graphics operations. This image caches pixel data when required.

## Methods

| Method | Description |
| --- | --- |
| [isCached()](#isCached) | Gets a value indicating whether image data is cached currently. |
| [cacheData()](#cacheData) | Caches the data and ensures no additional data loading will be performed from the underlying DataStreamSupporter.DataStreamContainer . |
| [resize(int newWidth, int newHeight, int resizeType)](#resize-int-int-int) | Resizes the image. |
| [resize(int newWidth, int newHeight, ImageResizeSettings settings)](#resize-int-int-com.aspose.cad.ImageResizeSettings) | Resizes the image. |
| [rotate(float angle, boolean resizeProportionally, com.aspose.cad.Color backgroundColor)](#rotate-float-boolean-com.aspose.cad.Color) | Rotate image around the center. |
| [crop(com.aspose.cad.Rectangle rectangle)](#crop-com.aspose.cad.Rectangle) | Cropping the image. |
| [dither(int ditheringMethod, int bitsCount, com.aspose.cad.IColorPalette customPalette)](#dither-int-int-com.aspose.cad.IColorPalette) | Performs dithering on the current image. |
| [grayscale()](#grayscale) | Transformation of an image to its grayscale representation |
| [binarizeFixed(byte threshold)](#binarizeFixed-byte) | Binarization of an image with predefined threshold |
| [binarizeOtsu()](#binarizeOtsu) | Binarization of an image with Otsu thresholding |
| [binarizeBradley(double brightnessDifference)](#binarizeBradley-double) | Binarization of an image using Bradley's adaptive thresholding algorithm using the integral image thresholding |
| [adjustBrightness(int brightness)](#adjustBrightness-int) | Adjust of a brightness for image. |
| [adjustContrast(float contrast)](#adjustContrast-float) | Image contrasting |
| [adjustGamma(float gammaRed, float gammaGreen, float gammaBlue)](#adjustGamma-float-float-float) | Gamma-correction of an image. |
| [adjustGamma(float gamma)](#adjustGamma-float) | Gamma-correction of an image. |
| [getFormatSpecificPalette()](#getFormatSpecificPalette) | Gets palette from format-specific places |
| [setFormatSpecificPalette(com.aspose.cad.IColorPalette newPalette)](#setFormatSpecificPalette-com.aspose.cad.IColorPalette) | Sets palette into format-specific places |

### isCached() {#isCached}
```java
public final boolean isCached()
```

Gets a value indicating whether image data is cached currently.

**Returns:** boolean - true if image data is cached; otherwise, false .

### cacheData() {#cacheData}
```java
public final void cacheData()
```

Caches the data and ensures no additional data loading will be performed from the underlying DataStreamSupporter.DataStreamContainer .

### resize(int newWidth, int newHeight, int resizeType) {#resize-int-int-int}
```java
public final void resize(int newWidth, int newHeight, int resizeType)
```

Resizes the image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| newWidth | int | The new width. |
| newHeight | int | The new height. |
| resizeType | int | The resize type. |

### resize(int newWidth, int newHeight, ImageResizeSettings settings) {#resize-int-int-com.aspose.cad.ImageResizeSettings}
```java
public final void resize(int newWidth, int newHeight, ImageResizeSettings settings)
```

Resizes the image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| newWidth | int | The new width. |
| newHeight | int | The new height. |
| settings | ImageResizeSettings | The resize settings. |

### rotate(float angle, boolean resizeProportionally, com.aspose.cad.Color backgroundColor) {#rotate-float-boolean-com.aspose.cad.Color}
```java
public void rotate(float angle, boolean resizeProportionally, com.aspose.cad.Color backgroundColor)
```

Rotate image around the center.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The rotate angle in degrees. Positive values will rotate clockwise. |
| resizeProportionally | boolean | if set to true you will have your image size changed according to rotated rectangle (corner points) projections in other case that leaves dimensions untouched and only internal image contents are rotated. |
| backgroundColor | com.aspose.cad.Color | Color of the background. |

### crop(com.aspose.cad.Rectangle rectangle) {#crop-com.aspose.cad.Rectangle}
```java
public void crop(com.aspose.cad.Rectangle rectangle)
```

Cropping the image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rectangle | com.aspose.cad.Rectangle | The rectangle. |

### dither(int ditheringMethod, int bitsCount, com.aspose.cad.IColorPalette customPalette) {#dither-int-int-com.aspose.cad.IColorPalette}
```java
public void dither(int ditheringMethod, int bitsCount, com.aspose.cad.IColorPalette customPalette)
```

Performs dithering on the current image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| ditheringMethod | int | The dithering method. |
| bitsCount | int | The final bits count for dithering. |
| customPalette | com.aspose.cad.IColorPalette | The custom palette for dithering. |

### grayscale() {#grayscale}
```java
public void grayscale()
```

Transformation of an image to its grayscale representation

### binarizeFixed(byte threshold) {#binarizeFixed-byte}
```java
public void binarizeFixed(byte threshold)
```

Binarization of an image with predefined threshold

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| threshold | byte | Threshold value. If corresponding gray value of a pixel is greater than threshold, a value of 255 will be assigned to it, 0 otherwise. |

### binarizeOtsu() {#binarizeOtsu}
```java
public void binarizeOtsu()
```

Binarization of an image with Otsu thresholding

### binarizeBradley(double brightnessDifference) {#binarizeBradley-double}
```java
public void binarizeBradley(double brightnessDifference)
```

Binarization of an image using Bradley's adaptive thresholding algorithm using the integral image thresholding

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| brightnessDifference | double | The brightness difference between pixel and the average of an s x s window of pixels centered around this pixel. |

### adjustBrightness(int brightness) {#adjustBrightness-int}
```java
public void adjustBrightness(int brightness)
```

Adjust of a brightness for image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| brightness | int | Brightness value. |

### adjustContrast(float contrast) {#adjustContrast-float}
```java
public void adjustContrast(float contrast)
```

Image contrasting

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| contrast | float | Contrast value (in range [-100; 100]) |

### adjustGamma(float gammaRed, float gammaGreen, float gammaBlue) {#adjustGamma-float-float-float}
```java
public void adjustGamma(float gammaRed, float gammaGreen, float gammaBlue)
```

Gamma-correction of an image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| gammaRed | float | Gamma for red channel coefficient |
| gammaGreen | float | Gamma for green channel coefficient |
| gammaBlue | float | Gamma for blue channel coefficient |

### adjustGamma(float gamma) {#adjustGamma-float}
```java
public void adjustGamma(float gamma)
```

Gamma-correction of an image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| gamma | float | Gamma for red, green and blue channels coefficient |

### getFormatSpecificPalette() {#getFormatSpecificPalette}
```java
public com.aspose.cad.IColorPalette getFormatSpecificPalette()
```

Gets palette from format-specific places

**Returns:** com.aspose.cad.IColorPalette - Format-specific IColorPalette .

### setFormatSpecificPalette(com.aspose.cad.IColorPalette newPalette) {#setFormatSpecificPalette-com.aspose.cad.IColorPalette}
```java
public void setFormatSpecificPalette(com.aspose.cad.IColorPalette newPalette)
```

Sets palette into format-specific places

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| newPalette | com.aspose.cad.IColorPalette | New 32-bit ARGB palette. |

