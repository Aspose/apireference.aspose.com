---
title: "RasterImage"
linktitle: "RasterImage"
second_title: "Aspose.CAD for Java"
description: "Represents a raster image supporting raster graphics operations."
type: docs
weight: 10
url: /java/com.aspose.cad/rasterimage/
---

**Inheritance:** java.lang.Object, Image

**All Implemented Interfaces:** IRasterImageArgb32PixelLoader

Represents a raster image supporting raster graphics operations.

## Methods

| Method | Description |
| --- | --- |
| [getXmpData()](#getXmpData) | Gets or sets the XMP metadata. |
| [setXmpData(com.aspose.cad.xmp.XmpPacketWrapper value)](#setXmpData-com.aspose.cad.xmp.XmpPacketWrapper) | Gets or sets the XMP metadata. |
| [getRawIndexedColorConverter()](#getRawIndexedColorConverter) | Gets or sets the indexed color converter |
| [setRawIndexedColorConverter(IIndexedColorConverter value)](#setRawIndexedColorConverter-com.aspose.cad.IIndexedColorConverter) | Gets or sets the indexed color converter |
| [getRawCustomColorConverter()](#getRawCustomColorConverter) | Gets or sets the custom color converter |
| [setRawCustomColorConverter(IColorConverter value)](#setRawCustomColorConverter-com.aspose.cad.IColorConverter) | Gets or sets the custom color converter |
| [getRawFallbackIndex()](#getRawFallbackIndex) | Gets or sets the fallback index to use when palette index is out of bounds |
| [setRawFallbackIndex(int value)](#setRawFallbackIndex-int) | Gets or sets the fallback index to use when palette index is out of bounds |
| [getRawDataSettings()](#getRawDataSettings) | Gets the current raw data settings. Note when using these settings the data loads without conversion. |
| [getRawDataFormat()](#getRawDataFormat) | Gets the raw data format. |
| [getRawLineSize()](#getRawLineSize) | Gets the raw line size in bytes. |
| [isRawDataAvailable()](#isRawDataAvailable) | Gets a value indicating whether raw data loading is available. |
| [getBitsPerPixel()](#getBitsPerPixel) | Gets the image bits per pixel count. |
| [getHorizontalResolution()](#getHorizontalResolution) | Gets or sets the horizontal resolution, in pixels per inch, of this RasterImage . |
| [setHorizontalResolution(double value)](#setHorizontalResolution-double) | Gets or sets the horizontal resolution, in pixels per inch, of this RasterImage . |
| [getVerticalResolution()](#getVerticalResolution) | Gets or sets the vertical resolution, in pixels per inch, of this RasterImage . |
| [setVerticalResolution(double value)](#setVerticalResolution-double) | Gets or sets the vertical resolution, in pixels per inch, of this RasterImage . |
| [hasTransparentColor()](#hasTransparentColor) | Gets a value indicating whether image has transparent color. |
| [setTransparentColor(boolean value)](#setTransparentColor-boolean) | Gets a value indicating whether image has transparent color. |
| [hasAlpha()](#hasAlpha) | Gets a value indicating whether this instance has alpha. |
| [getTransparentColor()](#getTransparentColor) | Gets the image transparent color. |
| [setTransparentColor(com.aspose.cad.Color value)](#setTransparentColor-com.aspose.cad.Color) | Gets the image transparent color. |
| [dither(int ditheringMethod, int bitsCount)](#dither-int-int) | Performs dithering on the current image. |
| [getDefaultPixels(com.aspose.cad.Rectangle rectangle, IPartialArgb32PixelLoader partialPixelLoader)](#getDefaultPixels-com.aspose.cad.Rectangle-com.aspose.cad.IPartialArgb32PixelLoader) | Gets the default pixels array using partial pixel loader. |
| [dither(int ditheringMethod, int bitsCount, com.aspose.cad.IColorPalette customPalette)](#dither-int-int-com.aspose.cad.IColorPalette) | Performs dithering on the current image. |
| [resize(int newWidth, int newHeight, int resizeType)](#resize-int-int-int) | Resizes the image. |
| [resize(int newWidth, int newHeight, ImageResizeSettings settings)](#resize-int-int-com.aspose.cad.ImageResizeSettings) | Resizes the image. |
| [binarizeOtsu()](#binarizeOtsu) | Binarization of an image with Otsu thresholding |
| [binarizeBradley(double brightnessDifference)](#binarizeBradley-double) | Binarization of an image using Bradley's adaptive thresholding algorithm using the integral image thresholding |
| [adjustBrightness(int brightness)](#adjustBrightness-int) | Adjust of a brightness for image. |
| [crop(com.aspose.cad.Rectangle rectangle)](#crop-com.aspose.cad.Rectangle) | Cropping the image. |
| [grayscale()](#grayscale) | Transformation of an image to its grayscale representation |
| [binarizeFixed(byte threshold)](#binarizeFixed-byte) | Binarization of an image with predefined threshold |
| [adjustGamma(float gammaRed, float gammaGreen, float gammaBlue)](#adjustGamma-float-float-float) | Gamma-correction of an image. |
| [adjustGamma(float gamma)](#adjustGamma-float) | Gamma-correction of an image. |
| [rotate(float angle, boolean resizeProportionally, com.aspose.cad.Color backgroundColor)](#rotate-float-boolean-com.aspose.cad.Color) | Rotate image around the center. |
| [adjustContrast(float contrast)](#adjustContrast-float) | Image contrasting |
| [getDefaultRawData(com.aspose.cad.Rectangle rectangle, IPartialRawDataLoader partialRawDataLoader, RawDataSettings rawDataSettings)](#getDefaultRawData-com.aspose.cad.Rectangle-com.aspose.cad.IPartialRawDataLoader-com.aspose.cad.RawDataSettings) | Gets the default raw data array using partial pixel loader. |
| [getDefaultArgb32Pixels(com.aspose.cad.Rectangle rectangle)](#getDefaultArgb32Pixels-com.aspose.cad.Rectangle) | Gets the default 32-bit ARGB pixels array. |
| [getDefaultRawData(com.aspose.cad.Rectangle rectangle, RawDataSettings rawDataSettings)](#getDefaultRawData-com.aspose.cad.Rectangle-com.aspose.cad.RawDataSettings) | Gets the default raw data array. |
| [getArgb32Pixel(int x, int y)](#getArgb32Pixel-int-int) | Gets an image 32-bit ARGB pixel. |
| [getPixel(int x, int y)](#getPixel-int-int) | Gets an image pixel. |
| [setArgb32Pixel(int x, int y, int argb32Color)](#setArgb32Pixel-int-int-int) | Sets an image 32-bit ARGB pixel for the specified position. |
| [setPixel(int x, int y, com.aspose.cad.Color color)](#setPixel-int-int-com.aspose.cad.Color) | Sets an image pixel for the specified position. |
| [readScanLine(int scanLineIndex)](#readScanLine-int) | Reads the whole scan line by the specified scan line index. |
| [readScanLineArgb(int scanLineIndex)](#readScanLineArgb-int) | Reads the whole scan line by the specified scan line index. |
| [writeScanLine(int scanLineIndex, int[] pixels)](#writeScanLine-int-int:A) | Writes the whole scan line to the specified scan line index. |
| [writeScanLine(int scanLineIndex, com.aspose.cad.Color[] pixels)](#writeScanLine-int-com.aspose.cad.Color:A) | Writes the whole scan line to the specified scan line index. |
| [loadPartialArgb32Pixels(com.aspose.cad.Rectangle desiredRectangle, IPartialArgb32PixelLoader pixelLoader)](#loadPartialArgb32Pixels-com.aspose.cad.Rectangle-com.aspose.cad.IPartialArgb32PixelLoader) | Loads 32-bit ARGB pixels partially by packs. |
| [loadPartialPixels(com.aspose.cad.Rectangle desiredRectangle, IPartialPixelLoader pixelLoader)](#loadPartialPixels-com.aspose.cad.Rectangle-com.aspose.cad.IPartialPixelLoader) | Loads pixels partially by packs. |
| [loadArgb32Pixels(com.aspose.cad.Rectangle rectangle)](#loadArgb32Pixels-com.aspose.cad.Rectangle) | Loads 32-bit ARGB pixels. |
| [loadPixels(com.aspose.cad.Rectangle rectangle)](#loadPixels-com.aspose.cad.Rectangle) | Loads pixels. |
| [loadCmykPixels(com.aspose.cad.Rectangle rectangle)](#loadCmykPixels-com.aspose.cad.Rectangle) | Loads pixels in CMYK format. |
| [loadRawData(com.aspose.cad.Rectangle rectangle, RawDataSettings rawDataSettings, IPartialRawDataLoader rawDataLoader)](#loadRawData-com.aspose.cad.Rectangle-com.aspose.cad.RawDataSettings-com.aspose.cad.IPartialRawDataLoader) | Loads raw data. |
| [saveRawData(byte[] data, int dataOffset, com.aspose.cad.Rectangle rectangle, RawDataSettings rawDataSettings)](#saveRawData-byte:A-int-com.aspose.cad.Rectangle-com.aspose.cad.RawDataSettings) | Saves the raw data. |
| [saveArgb32Pixels(com.aspose.cad.Rectangle rectangle, int[] pixels)](#saveArgb32Pixels-com.aspose.cad.Rectangle-int:A) | Saves the 32-bit ARGB pixels. |
| [savePixels(com.aspose.cad.Rectangle rectangle, com.aspose.cad.Color[] pixels)](#savePixels-com.aspose.cad.Rectangle-com.aspose.cad.Color:A) | Saves the pixels. |
| [saveCmykPixels(com.aspose.cad.Rectangle rectangle, com.aspose.cad.CmykColor[] pixels)](#saveCmykPixels-com.aspose.cad.Rectangle-com.aspose.cad.CmykColor:A) | Saves the pixels. |
| [setResolution(double dpiX, double dpiY)](#setResolution-double-double) | Sets the resolution for this RasterImage . |
| [setPalette(com.aspose.cad.IColorPalette palette, boolean updateColors)](#setPalette-com.aspose.cad.IColorPalette-boolean) | Sets the image palette. |
| [crop(int leftShift, int rightShift, int topShift, int bottomShift)](#crop-int-int-int-int) | Crop image with shifts. |
| [filter(com.aspose.cad.Rectangle rectangle, FilterOptionsBase options)](#filter-com.aspose.cad.Rectangle-com.aspose.cad.imagefilters.filteroptions.FilterOptionsBase) | Filters the specified rectangle. |

### getXmpData() {#getXmpData}
```java
public com.aspose.cad.xmp.XmpPacketWrapper getXmpData()
```

Gets or sets the XMP metadata.

**Returns:** com.aspose.cad.xmp.XmpPacketWrapper - The XMP metadata.

### setXmpData(com.aspose.cad.xmp.XmpPacketWrapper value) {#setXmpData-com.aspose.cad.xmp.XmpPacketWrapper}
```java
public void setXmpData(com.aspose.cad.xmp.XmpPacketWrapper value)
```

Gets or sets the XMP metadata.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.xmp.XmpPacketWrapper | The XMP metadata. |

### getRawIndexedColorConverter() {#getRawIndexedColorConverter}
```java
public IIndexedColorConverter getRawIndexedColorConverter()
```

Gets or sets the indexed color converter

**Returns:** IIndexedColorConverter - The indexed color converter

### setRawIndexedColorConverter(IIndexedColorConverter value) {#setRawIndexedColorConverter-com.aspose.cad.IIndexedColorConverter}
```java
public void setRawIndexedColorConverter(IIndexedColorConverter value)
```

Gets or sets the indexed color converter

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | IIndexedColorConverter | The indexed color converter |

### getRawCustomColorConverter() {#getRawCustomColorConverter}
```java
public IColorConverter getRawCustomColorConverter()
```

Gets or sets the custom color converter

**Returns:** IColorConverter - The custom color converter

### setRawCustomColorConverter(IColorConverter value) {#setRawCustomColorConverter-com.aspose.cad.IColorConverter}
```java
public void setRawCustomColorConverter(IColorConverter value)
```

Gets or sets the custom color converter

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | IColorConverter | The custom color converter |

### getRawFallbackIndex() {#getRawFallbackIndex}
```java
public int getRawFallbackIndex()
```

Gets or sets the fallback index to use when palette index is out of bounds

**Returns:** int - The fallback index to use when palette index is out of bounds

### setRawFallbackIndex(int value) {#setRawFallbackIndex-int}
```java
public void setRawFallbackIndex(int value)
```

Gets or sets the fallback index to use when palette index is out of bounds

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The fallback index to use when palette index is out of bounds |

### getRawDataSettings() {#getRawDataSettings}
```java
public RawDataSettings getRawDataSettings()
```

Gets the current raw data settings. Note when using these settings the data loads without conversion.

**Returns:** RawDataSettings - The current raw data settings.

### getRawDataFormat() {#getRawDataFormat}
```java
public PixelDataFormat getRawDataFormat()
```

Gets the raw data format.

**Returns:** PixelDataFormat - The raw data format.

### getRawLineSize() {#getRawLineSize}
```java
public int getRawLineSize()
```

Gets the raw line size in bytes.

**Returns:** int - The raw line size in bytes.

### isRawDataAvailable() {#isRawDataAvailable}
```java
public boolean isRawDataAvailable()
```

Gets a value indicating whether raw data loading is available.

**Returns:** boolean - true if this raw data loading is available; otherwise, false .

### getBitsPerPixel() {#getBitsPerPixel}
```java
public abstract int getBitsPerPixel()
```

Gets the image bits per pixel count.

**Returns:** int - The image bits per pixel count.

### getHorizontalResolution() {#getHorizontalResolution}
```java
public double getHorizontalResolution()
```

Gets or sets the horizontal resolution, in pixels per inch, of this RasterImage .

**Returns:** double - The horizontal resolution. Note by default this value is always 96 since different platforms cannot return the screen resolution. You may consider using the SetResolution method for updating both resolution values in single call.

### setHorizontalResolution(double value) {#setHorizontalResolution-double}
```java
public void setHorizontalResolution(double value)
```

Gets or sets the horizontal resolution, in pixels per inch, of this RasterImage .

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The horizontal resolution. Note by default this value is always 96 since different platforms cannot return the screen resolution. You may consider using the SetResolution method for updating both resolution values in single call. |

### getVerticalResolution() {#getVerticalResolution}
```java
public double getVerticalResolution()
```

Gets or sets the vertical resolution, in pixels per inch, of this RasterImage .

**Returns:** double - The vertical resolution. Note by default this value is always 96 since different platforms cannot return the screen resolution. You may consider using the SetResolution method for updating both resolution values in single call.

### setVerticalResolution(double value) {#setVerticalResolution-double}
```java
public void setVerticalResolution(double value)
```

Gets or sets the vertical resolution, in pixels per inch, of this RasterImage .

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | double | The vertical resolution. Note by default this value is always 96 since different platforms cannot return the screen resolution. You may consider using the SetResolution method for updating both resolution values in single call. |

### hasTransparentColor() {#hasTransparentColor}
```java
public boolean hasTransparentColor()
```

Gets a value indicating whether image has transparent color.

**Returns:** boolean

### setTransparentColor(boolean value) {#setTransparentColor-boolean}
```java
public void setTransparentColor(boolean value)
```

Gets a value indicating whether image has transparent color.

### hasAlpha() {#hasAlpha}
```java
public boolean hasAlpha()
```

Gets a value indicating whether this instance has alpha.

**Returns:** boolean - true if this instance has alpha; otherwise, false .

### getTransparentColor() {#getTransparentColor}
```java
public com.aspose.cad.Color getTransparentColor()
```

Gets the image transparent color.

**Returns:** com.aspose.cad.Color

### setTransparentColor(com.aspose.cad.Color value) {#setTransparentColor-com.aspose.cad.Color}
```java
public void setTransparentColor(com.aspose.cad.Color value)
```

Gets the image transparent color.

### dither(int ditheringMethod, int bitsCount) {#dither-int-int}
```java
public void dither(int ditheringMethod, int bitsCount)
```

Performs dithering on the current image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| ditheringMethod | int | The dithering method. |
| bitsCount | int | The final bits count for dithering. |

### getDefaultPixels(com.aspose.cad.Rectangle rectangle, IPartialArgb32PixelLoader partialPixelLoader) {#getDefaultPixels-com.aspose.cad.Rectangle-com.aspose.cad.IPartialArgb32PixelLoader}
```java
public void getDefaultPixels(com.aspose.cad.Rectangle rectangle, IPartialArgb32PixelLoader partialPixelLoader)
```

Gets the default pixels array using partial pixel loader.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rectangle | com.aspose.cad.Rectangle | The rectangle to get pixels for. |
| partialPixelLoader | IPartialArgb32PixelLoader | The partial pixel loader. |

### dither(int ditheringMethod, int bitsCount, com.aspose.cad.IColorPalette customPalette) {#dither-int-int-com.aspose.cad.IColorPalette}
```java
public abstract void dither(int ditheringMethod, int bitsCount, com.aspose.cad.IColorPalette customPalette)
```

Performs dithering on the current image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| ditheringMethod | int | The dithering method. |
| bitsCount | int | The final bits count for dithering. |
| customPalette | com.aspose.cad.IColorPalette | The custom palette for dithering. |

### resize(int newWidth, int newHeight, int resizeType) {#resize-int-int-int}
```java
public abstract void resize(int newWidth, int newHeight, int resizeType)
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
public abstract void resize(int newWidth, int newHeight, ImageResizeSettings settings)
```

Resizes the image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| newWidth | int | The new width. |
| newHeight | int | The new height. |
| settings | ImageResizeSettings | The resize settings. |

### binarizeOtsu() {#binarizeOtsu}
```java
public abstract void binarizeOtsu()
```

Binarization of an image with Otsu thresholding

### binarizeBradley(double brightnessDifference) {#binarizeBradley-double}
```java
public abstract void binarizeBradley(double brightnessDifference)
```

Binarization of an image using Bradley's adaptive thresholding algorithm using the integral image thresholding

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| brightnessDifference | double | The brightness difference between pixel and the average of an s x s window of pixels centered around this pixel. |

### adjustBrightness(int brightness) {#adjustBrightness-int}
```java
public abstract void adjustBrightness(int brightness)
```

Adjust of a brightness for image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| brightness | int | Brightness value. |

### crop(com.aspose.cad.Rectangle rectangle) {#crop-com.aspose.cad.Rectangle}
```java
public abstract void crop(com.aspose.cad.Rectangle rectangle)
```

Cropping the image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rectangle | com.aspose.cad.Rectangle | The rectangle. |

### grayscale() {#grayscale}
```java
public abstract void grayscale()
```

Transformation of an image to its grayscale representation

### binarizeFixed(byte threshold) {#binarizeFixed-byte}
```java
public abstract void binarizeFixed(byte threshold)
```

Binarization of an image with predefined threshold

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| threshold | byte | Threshold value. If corresponding gray value of a pixel is greater than threshold, a value of 255 will be assigned to it, 0 otherwise. |

### adjustGamma(float gammaRed, float gammaGreen, float gammaBlue) {#adjustGamma-float-float-float}
```java
public abstract void adjustGamma(float gammaRed, float gammaGreen, float gammaBlue)
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
public abstract void adjustGamma(float gamma)
```

Gamma-correction of an image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| gamma | float | Gamma for red, green and blue channels coefficient |

### rotate(float angle, boolean resizeProportionally, com.aspose.cad.Color backgroundColor) {#rotate-float-boolean-com.aspose.cad.Color}
```java
public abstract void rotate(float angle, boolean resizeProportionally, com.aspose.cad.Color backgroundColor)
```

Rotate image around the center.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The rotate angle in degrees. Positive values will rotate clockwise. |
| resizeProportionally | boolean | if set to true you will have your image size changed according to rotated rectangle (corner points) projections in other case that leaves dimensions untouched and only internal image contents are rotated. |
| backgroundColor | com.aspose.cad.Color | Color of the background. |

### adjustContrast(float contrast) {#adjustContrast-float}
```java
public abstract void adjustContrast(float contrast)
```

Image contrasting

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| contrast | float | Contrast value (in range [-100; 100]) |

### getDefaultRawData(com.aspose.cad.Rectangle rectangle, IPartialRawDataLoader partialRawDataLoader, RawDataSettings rawDataSettings) {#getDefaultRawData-com.aspose.cad.Rectangle-com.aspose.cad.IPartialRawDataLoader-com.aspose.cad.RawDataSettings}
```java
public void getDefaultRawData(com.aspose.cad.Rectangle rectangle, IPartialRawDataLoader partialRawDataLoader, RawDataSettings rawDataSettings)
```

Gets the default raw data array using partial pixel loader.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rectangle | com.aspose.cad.Rectangle | The rectangle to get pixels for. |
| partialRawDataLoader | IPartialRawDataLoader | The partial raw data loader. |
| rawDataSettings | RawDataSettings | The raw data settings. |

### getDefaultArgb32Pixels(com.aspose.cad.Rectangle rectangle) {#getDefaultArgb32Pixels-com.aspose.cad.Rectangle}
```java
public int[] getDefaultArgb32Pixels(com.aspose.cad.Rectangle rectangle)
```

Gets the default 32-bit ARGB pixels array.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rectangle | com.aspose.cad.Rectangle | The rectangle to get pixels for. |

**Returns:** int[] - The default pixels array.

### getDefaultRawData(com.aspose.cad.Rectangle rectangle, RawDataSettings rawDataSettings) {#getDefaultRawData-com.aspose.cad.Rectangle-com.aspose.cad.RawDataSettings}
```java
public byte[] getDefaultRawData(com.aspose.cad.Rectangle rectangle, RawDataSettings rawDataSettings)
```

Gets the default raw data array.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rectangle | com.aspose.cad.Rectangle | The rectangle to get raw data for. |
| rawDataSettings | RawDataSettings | The raw data settings. |

**Returns:** byte[] - The default raw data array.

### getArgb32Pixel(int x, int y) {#getArgb32Pixel-int-int}
```java
public int getArgb32Pixel(int x, int y)
```

Gets an image 32-bit ARGB pixel.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| x | int | The pixel x location. |
| y | int | The pixel y location. |

**Returns:** int - The 32-bit ARGB pixel for the specified location.

### getPixel(int x, int y) {#getPixel-int-int}
```java
public com.aspose.cad.Color getPixel(int x, int y)
```

Gets an image pixel.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| x | int | The pixel x location. |
| y | int | The pixel y location. |

**Returns:** com.aspose.cad.Color - The pixel color for the specified location.

### setArgb32Pixel(int x, int y, int argb32Color) {#setArgb32Pixel-int-int-int}
```java
public void setArgb32Pixel(int x, int y, int argb32Color)
```

Sets an image 32-bit ARGB pixel for the specified position.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| x | int | The pixel x location. |
| y | int | The pixel y location. |
| argb32Color | int | The 32-bit ARGB pixel for the specified position. |

### setPixel(int x, int y, com.aspose.cad.Color color) {#setPixel-int-int-com.aspose.cad.Color}
```java
public void setPixel(int x, int y, com.aspose.cad.Color color)
```

Sets an image pixel for the specified position.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| x | int | The pixel x location. |
| y | int | The pixel y location. |
| color | com.aspose.cad.Color | The pixel color for the specified position. |

### readScanLine(int scanLineIndex) {#readScanLine-int}
```java
public com.aspose.cad.Color[] readScanLine(int scanLineIndex)
```

Reads the whole scan line by the specified scan line index.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| scanLineIndex | int | Zero based index of the scan line. |

**Returns:** com.aspose.cad.Color[] - The scan line pixel color values array.

### readScanLineArgb(int scanLineIndex) {#readScanLineArgb-int}
```java
public int[] readScanLineArgb(int scanLineIndex)
```

Reads the whole scan line by the specified scan line index.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| scanLineIndex | int | Zero based index of the scan line. |

**Returns:** int[] - The scan line pixel color values array as ARGB.

### writeScanLine(int scanLineIndex, int[] pixels) {#writeScanLine-int-int:A}
```java
public void writeScanLine(int scanLineIndex, int[] pixels)
```

Writes the whole scan line to the specified scan line index.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| scanLineIndex | int | Zero based index of the scan line. |
| pixels | int[] | The pixel colors array as ARGB to write. |

### writeScanLine(int scanLineIndex, com.aspose.cad.Color[] pixels) {#writeScanLine-int-com.aspose.cad.Color:A}
```java
public void writeScanLine(int scanLineIndex, com.aspose.cad.Color[] pixels)
```

Writes the whole scan line to the specified scan line index.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| scanLineIndex | int | Zero based index of the scan line. |
| pixels | com.aspose.cad.Color[] | The pixel colors array to write. |

### loadPartialArgb32Pixels(com.aspose.cad.Rectangle desiredRectangle, IPartialArgb32PixelLoader pixelLoader) {#loadPartialArgb32Pixels-com.aspose.cad.Rectangle-com.aspose.cad.IPartialArgb32PixelLoader}
```java
public void loadPartialArgb32Pixels(com.aspose.cad.Rectangle desiredRectangle, IPartialArgb32PixelLoader pixelLoader)
```

Loads 32-bit ARGB pixels partially by packs.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| desiredRectangle | com.aspose.cad.Rectangle | The desired rectangle. |
| pixelLoader | IPartialArgb32PixelLoader | The 32-bit ARGB pixel loader. |

### loadPartialPixels(com.aspose.cad.Rectangle desiredRectangle, IPartialPixelLoader pixelLoader) {#loadPartialPixels-com.aspose.cad.Rectangle-com.aspose.cad.IPartialPixelLoader}
```java
public void loadPartialPixels(com.aspose.cad.Rectangle desiredRectangle, IPartialPixelLoader pixelLoader)
```

Loads pixels partially by packs.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| desiredRectangle | com.aspose.cad.Rectangle | The desired rectangle. |
| pixelLoader | IPartialPixelLoader | The pixel loader. |

### loadArgb32Pixels(com.aspose.cad.Rectangle rectangle) {#loadArgb32Pixels-com.aspose.cad.Rectangle}
```java
public int[] loadArgb32Pixels(com.aspose.cad.Rectangle rectangle)
```

Loads 32-bit ARGB pixels.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rectangle | com.aspose.cad.Rectangle | The rectangle to load pixels from. |

**Returns:** int[] - The loaded 32-bit ARGB pixels array.

### loadPixels(com.aspose.cad.Rectangle rectangle) {#loadPixels-com.aspose.cad.Rectangle}
```java
public com.aspose.cad.Color[] loadPixels(com.aspose.cad.Rectangle rectangle)
```

Loads pixels.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rectangle | com.aspose.cad.Rectangle | The rectangle to load pixels from. |

**Returns:** com.aspose.cad.Color[] - The loaded pixels array.

### loadCmykPixels(com.aspose.cad.Rectangle rectangle) {#loadCmykPixels-com.aspose.cad.Rectangle}
```java
public com.aspose.cad.CmykColor[] loadCmykPixels(com.aspose.cad.Rectangle rectangle)
```

Loads pixels in CMYK format.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rectangle | com.aspose.cad.Rectangle | The rectangle to load pixels from. |

**Returns:** com.aspose.cad.CmykColor[] - The loaded CMYK pixels array.

### loadRawData(com.aspose.cad.Rectangle rectangle, RawDataSettings rawDataSettings, IPartialRawDataLoader rawDataLoader) {#loadRawData-com.aspose.cad.Rectangle-com.aspose.cad.RawDataSettings-com.aspose.cad.IPartialRawDataLoader}
```java
public void loadRawData(com.aspose.cad.Rectangle rectangle, RawDataSettings rawDataSettings, IPartialRawDataLoader rawDataLoader)
```

Loads raw data.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rectangle | com.aspose.cad.Rectangle | The rectangle to load raw data from. |
| rawDataSettings | RawDataSettings | The raw data settings to use for loaded data. Note if data is not in the format specified then data conversion will be performed. |
| rawDataLoader | IPartialRawDataLoader | The raw data loader. |

### saveRawData(byte[] data, int dataOffset, com.aspose.cad.Rectangle rectangle, RawDataSettings rawDataSettings) {#saveRawData-byte:A-int-com.aspose.cad.Rectangle-com.aspose.cad.RawDataSettings}
```java
public void saveRawData(byte[] data, int dataOffset, com.aspose.cad.Rectangle rectangle, RawDataSettings rawDataSettings)
```

Saves the raw data.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| data | byte[] | The raw data. |
| dataOffset | int | The starting raw data offset. |
| rectangle | com.aspose.cad.Rectangle | The raw data rectangle. |
| rawDataSettings | RawDataSettings | The raw data settings the data is in. |

### saveArgb32Pixels(com.aspose.cad.Rectangle rectangle, int[] pixels) {#saveArgb32Pixels-com.aspose.cad.Rectangle-int:A}
```java
public void saveArgb32Pixels(com.aspose.cad.Rectangle rectangle, int[] pixels)
```

Saves the 32-bit ARGB pixels.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rectangle | com.aspose.cad.Rectangle | The rectangle to save pixels to. |
| pixels | int[] | The 32-bit ARGB pixels array. |

### savePixels(com.aspose.cad.Rectangle rectangle, com.aspose.cad.Color[] pixels) {#savePixels-com.aspose.cad.Rectangle-com.aspose.cad.Color:A}
```java
public void savePixels(com.aspose.cad.Rectangle rectangle, com.aspose.cad.Color[] pixels)
```

Saves the pixels.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rectangle | com.aspose.cad.Rectangle | The rectangle to save pixels to. |
| pixels | com.aspose.cad.Color[] | The pixels array. |

### saveCmykPixels(com.aspose.cad.Rectangle rectangle, com.aspose.cad.CmykColor[] pixels) {#saveCmykPixels-com.aspose.cad.Rectangle-com.aspose.cad.CmykColor:A}
```java
public void saveCmykPixels(com.aspose.cad.Rectangle rectangle, com.aspose.cad.CmykColor[] pixels)
```

Saves the pixels.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rectangle | com.aspose.cad.Rectangle | The rectangle to save pixels to. |
| pixels | com.aspose.cad.CmykColor[] | The CMYK pixels array. |

### setResolution(double dpiX, double dpiY) {#setResolution-double-double}
```java
public void setResolution(double dpiX, double dpiY)
```

Sets the resolution for this RasterImage .

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| dpiX | double | The horizontal resolution, in dots per inch, of the RasterImage . |
| dpiY | double | The vertical resolution, in dots per inch, of the RasterImage . |

### setPalette(com.aspose.cad.IColorPalette palette, boolean updateColors) {#setPalette-com.aspose.cad.IColorPalette-boolean}
```java
public void setPalette(com.aspose.cad.IColorPalette palette, boolean updateColors)
```

Sets the image palette.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| palette | com.aspose.cad.IColorPalette | The palette to set. |
| updateColors | boolean | if set to true colors will be updated according to the new palette; otherwise color indexes remain unchanged. Note that unchanged indexes may crash the image on loading if some indexes have no corresponding palette entries. |

### crop(int leftShift, int rightShift, int topShift, int bottomShift) {#crop-int-int-int-int}
```java
public void crop(int leftShift, int rightShift, int topShift, int bottomShift)
```

Crop image with shifts.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| leftShift | int | The left shift. |
| rightShift | int | The right shift. |
| topShift | int | The top shift. |
| bottomShift | int | The bottom shift. |

### filter(com.aspose.cad.Rectangle rectangle, FilterOptionsBase options) {#filter-com.aspose.cad.Rectangle-com.aspose.cad.imagefilters.filteroptions.FilterOptionsBase}
```java
public void filter(com.aspose.cad.Rectangle rectangle, FilterOptionsBase options)
```

Filters the specified rectangle.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| rectangle | com.aspose.cad.Rectangle | The rectangle. |
| options | FilterOptionsBase | The options. |

