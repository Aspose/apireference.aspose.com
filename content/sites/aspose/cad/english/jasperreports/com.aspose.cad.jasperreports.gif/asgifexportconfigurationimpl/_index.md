---
title: "ASGifExportConfigurationImpl"
linktitle: "ASGifExportConfigurationImpl"
second_title: "Aspose.CAD for JasperReports"
description: "The GIF file format export configuration."
type: docs
weight: 10
url: /jasperreports/com.aspose.cad.jasperreports.gif/asgifexportconfigurationimpl/
---

**Inheritance:** java.lang.Object, ImageExportConfigurationImpl

**All Implemented Interfaces:** ASGifExportConfiguration

The GIF file format export configuration.

## Constructors

| Constructor | Description |
| --- | --- |
| [ASGifExportConfigurationImpl()](#ASGifExportConfigurationImpl) | Initializes a new instance of the GifReportExportConfigurationImpl class. |

## Methods

| Method | Description |
| --- | --- |
| [getDoPaletteCorrection()](#getDoPaletteCorrection) | Gets or sets a value indicating whether palette correction is applied. |
| [setDoPaletteCorrection(boolean value)](#setDoPaletteCorrection-boolean) | Gets or sets a value indicating whether palette correction is applied. |
| [getColorResolution()](#getColorResolution) | Gets or sets the GIF color resolution. |
| [setColorResolution(byte value)](#setColorResolution-byte) | Gets or sets the GIF color resolution. |
| [isPaletteSorted()](#isPaletteSorted) | Gets or sets a value indicating whether palette entries are sorted. |
| [setPaletteSorted(boolean value)](#setPaletteSorted-boolean) | Gets or sets a value indicating whether palette entries are sorted. |
| [getPixelAspectRatio()](#getPixelAspectRatio) | Gets or sets the GIF pixel aspect ratio. Pixel Aspect Ratio - Factor used to compute an approximation of the aspect ratio of the pixel in the original image. If the value of the field is not 0, this approximation of the aspect ratio is computed based on the formula: Aspect Ratio = (Pixel Aspect Ratio + 15) / 64 The Pixel Aspect Ratio is defined to be the quotient of the pixel's width over its height. The value range in this field allows specification of the widest pixel of 4:1 to the tallest pixel of 1:4 in increments of 1/64th. Values : 0 - No aspect ratio information is given. 1..255 - Value used in the computation. |
| [setPixelAspectRatio(byte value)](#setPixelAspectRatio-byte) | Gets or sets the GIF pixel aspect ratio. Pixel Aspect Ratio - Factor used to compute an approximation of the aspect ratio of the pixel in the original image. If the value of the field is not 0, this approximation of the aspect ratio is computed based on the formula: Aspect Ratio = (Pixel Aspect Ratio + 15) / 64 The Pixel Aspect Ratio is defined to be the quotient of the pixel's width over its height. The value range in this field allows specification of the widest pixel of 4:1 to the tallest pixel of 1:4 in increments of 1/64th. Values : 0 - No aspect ratio information is given. 1..255 - Value used in the computation. |
| [getBackgroundColorIndex()](#getBackgroundColorIndex) | Gets or sets the GIF background color index. |
| [setBackgroundColorIndex(byte value)](#setBackgroundColorIndex-byte) | Gets or sets the GIF background color index. |
| [hasTrailer()](#hasTrailer) | Gets or sets a value indicating whether GIF has trailer. |
| [setTrailer(boolean value)](#setTrailer-boolean) | Gets or sets a value indicating whether GIF has trailer. |
| [getInterlaced()](#getInterlaced) | True if image should be interlaced. |
| [setInterlaced(boolean value)](#setInterlaced-boolean) | True if image should be interlaced. |
| [getMaxDiff()](#getMaxDiff) | Gets or sets the maximum allowed pixel difference. If greater than zero, lossy compression will be used. Recommended value for optimal lossy compression is 80. 30 is very light compression, 200 is heavy. It works best when only little loss is introduced, and due to limitation of the compression algorithm very high loss levels won't give as much gain. The range of allowed values is [0, 1000]. |
| [setMaxDiff(int value)](#setMaxDiff-int) | Gets or sets the maximum allowed pixel difference. If greater than zero, lossy compression will be used. Recommended value for optimal lossy compression is 80. 30 is very light compression, 200 is heavy. It works best when only little loss is introduced, and due to limitation of the compression algorithm very high loss levels won't give as much gain. The range of allowed values is [0, 1000]. |

### ASGifExportConfigurationImpl() {#ASGifExportConfigurationImpl}
```java
public ASGifExportConfigurationImpl()
```

Initializes a new instance of the GifReportExportConfigurationImpl class.

### getDoPaletteCorrection() {#getDoPaletteCorrection}
```java
public boolean getDoPaletteCorrection()
```

Gets or sets a value indicating whether palette correction is applied.

**Returns:** boolean - true if palette correction is applied; otherwise, false . Palette correction means that whenever image is exported to GIF the source image colors will be analyzed in order to build the best matching palette (in case image Palette does not exist or not specified in the options). The analyze process takes some time however the output image will have the best matching color palette and result is visually better.

### setDoPaletteCorrection(boolean value) {#setDoPaletteCorrection-boolean}
```java
public void setDoPaletteCorrection(boolean value)
```

Gets or sets a value indicating whether palette correction is applied.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if palette correction is applied; otherwise, false . Palette correction means that whenever image is exported to GIF the source image colors will be analyzed in order to build the best matching palette (in case image Palette does not exist or not specified in the options). The analyze process takes some time however the output image will have the best matching color palette and result is visually better. |

### getColorResolution() {#getColorResolution}
```java
public byte getColorResolution()
```

Gets or sets the GIF color resolution.

**Returns:** byte - The color resolution. Color Resolution - Number of bits per primary color available to the original image, minus 1. This value represents the size of the entire palette from which the colors in the graphic were selected, not the number of colors actually used in the graphic. For example, if the value in this field is 3, then the palette of the original image had 4 bits per primary color available to create the image. This value should be set to indicate the richness of the original palette, even if not every color from the whole palette is available on the source machine.

### setColorResolution(byte value) {#setColorResolution-byte}
```java
public void setColorResolution(byte value)
```

Gets or sets the GIF color resolution.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | byte | The color resolution. Color Resolution - Number of bits per primary color available to the original image, minus 1. This value represents the size of the entire palette from which the colors in the graphic were selected, not the number of colors actually used in the graphic. For example, if the value in this field is 3, then the palette of the original image had 4 bits per primary color available to create the image. This value should be set to indicate the richness of the original palette, even if not every color from the whole palette is available on the source machine. |

### isPaletteSorted() {#isPaletteSorted}
```java
public boolean isPaletteSorted()
```

Gets or sets a value indicating whether palette entries are sorted.

**Returns:** boolean - true if palette entries are sorted; otherwise, false .

### setPaletteSorted(boolean value) {#setPaletteSorted-boolean}
```java
public void setPaletteSorted(boolean value)
```

Gets or sets a value indicating whether palette entries are sorted.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if palette entries are sorted; otherwise, false . |

### getPixelAspectRatio() {#getPixelAspectRatio}
```java
public byte getPixelAspectRatio()
```

Gets or sets the GIF pixel aspect ratio. Pixel Aspect Ratio - Factor used to compute an approximation of the aspect ratio of the pixel in the original image. If the value of the field is not 0, this approximation of the aspect ratio is computed based on the formula: Aspect Ratio = (Pixel Aspect Ratio + 15) / 64 The Pixel Aspect Ratio is defined to be the quotient of the pixel's width over its height. The value range in this field allows specification of the widest pixel of 4:1 to the tallest pixel of 1:4 in increments of 1/64th. Values : 0 - No aspect ratio information is given. 1..255 - Value used in the computation.

**Returns:** byte - The GIF pixel aspect ratio.

### setPixelAspectRatio(byte value) {#setPixelAspectRatio-byte}
```java
public void setPixelAspectRatio(byte value)
```

Gets or sets the GIF pixel aspect ratio. Pixel Aspect Ratio - Factor used to compute an approximation of the aspect ratio of the pixel in the original image. If the value of the field is not 0, this approximation of the aspect ratio is computed based on the formula: Aspect Ratio = (Pixel Aspect Ratio + 15) / 64 The Pixel Aspect Ratio is defined to be the quotient of the pixel's width over its height. The value range in this field allows specification of the widest pixel of 4:1 to the tallest pixel of 1:4 in increments of 1/64th. Values : 0 - No aspect ratio information is given. 1..255 - Value used in the computation.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | byte | The GIF pixel aspect ratio. |

### getBackgroundColorIndex() {#getBackgroundColorIndex}
```java
public byte getBackgroundColorIndex()
```

Gets or sets the GIF background color index.

**Returns:** byte - The GIF background color index.

### setBackgroundColorIndex(byte value) {#setBackgroundColorIndex-byte}
```java
public void setBackgroundColorIndex(byte value)
```

Gets or sets the GIF background color index.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | byte | The GIF background color index. |

### hasTrailer() {#hasTrailer}
```java
public boolean hasTrailer()
```

Gets or sets a value indicating whether GIF has trailer.

**Returns:** boolean - true if GIF has trailer; otherwise, false .

### setTrailer(boolean value) {#setTrailer-boolean}
```java
public void setTrailer(boolean value)
```

Gets or sets a value indicating whether GIF has trailer.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if GIF has trailer; otherwise, false . |

### getInterlaced() {#getInterlaced}
```java
public boolean getInterlaced()
```

True if image should be interlaced.

**Returns:** boolean

### setInterlaced(boolean value) {#setInterlaced-boolean}
```java
public void setInterlaced(boolean value)
```

True if image should be interlaced.

### getMaxDiff() {#getMaxDiff}
```java
public int getMaxDiff()
```

Gets or sets the maximum allowed pixel difference. If greater than zero, lossy compression will be used. Recommended value for optimal lossy compression is 80. 30 is very light compression, 200 is heavy. It works best when only little loss is introduced, and due to limitation of the compression algorithm very high loss levels won't give as much gain. The range of allowed values is [0, 1000].

**Returns:** int - The range of allowed values.

### setMaxDiff(int value) {#setMaxDiff-int}
```java
public void setMaxDiff(int value)
```

Gets or sets the maximum allowed pixel difference. If greater than zero, lossy compression will be used. Recommended value for optimal lossy compression is 80. 30 is very light compression, 200 is heavy. It works best when only little loss is introduced, and due to limitation of the compression algorithm very high loss levels won't give as much gain. The range of allowed values is [0, 1000].

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The range of allowed values. |

