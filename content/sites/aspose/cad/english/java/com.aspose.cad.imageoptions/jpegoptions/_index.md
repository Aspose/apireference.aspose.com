---
title: "JpegOptions"
linktitle: "JpegOptions"
second_title: "Aspose.CAD for Java"
description: "The jpeg file format create options."
type: docs
weight: 10
url: /java/com.aspose.cad.imageoptions/jpegoptions/
---

**Inheritance:** java.lang.Object, ImageOptionsBase

The jpeg file format create options.

## Constructors

| Constructor | Description |
| --- | --- |
| [JpegOptions()](#JpegOptions) | Initializes a new instance of the JpegOptions class. |
| [JpegOptions(JpegOptions jpegOptions)](#JpegOptions-com.aspose.cad.imageoptions.JpegOptions) | Initializes a new instance of the JpegOptions class. |

## Methods

| Method | Description |
| --- | --- |
| [getTargetFormat()](#getTargetFormat) |  |
| [getXmpData()](#getXmpData) | Gets or sets the XMP metadata container. |
| [setXmpData(com.aspose.cad.xmp.XmpPacketWrapper value)](#setXmpData-com.aspose.cad.xmp.XmpPacketWrapper) | Gets or sets the XMP metadata container. |
| [getJfif()](#getJfif) | Gets or sets the jfif. |
| [setJfif(JFIFData value)](#setJfif-com.aspose.cad.fileformats.jpeg.JFIFData) | Gets or sets the jfif. |
| [getComment()](#getComment) | Gets or sets the jpeg file comment. |
| [setComment(String value)](#setComment-java.lang.String) | Gets or sets the jpeg file comment. |
| [getExifData()](#getExifData) | Get or set exif data container |
| [setExifData(JpegExifData value)](#setExifData-com.aspose.cad.exif.JpegExifData) | Get or set exif data container |
| [getCompressionType()](#getCompressionType) | Gets or sets the compression type. |
| [setCompressionType(int value)](#setCompressionType-int) | Gets or sets the compression type. |
| [getColorType()](#getColorType) | Gets or sets the color type for jpeg image. |
| [setColorType(int value)](#setColorType-int) | Gets or sets the color type for jpeg image. |
| [getQuality()](#getQuality) | Gets or sets image quality. |
| [setQuality(int value)](#setQuality-int) | Gets or sets image quality. |
| [getScaledQuality()](#getScaledQuality) | The scaled quality. |
| [getRdOptSettings()](#getRdOptSettings) | Gets or sets the RD optimizer settings. |
| [setRdOptSettings(com.aspose.cad.imageoptions.RdOptimizerSettings value)](#setRdOptSettings-com.aspose.cad.imageoptions.RdOptimizerSettings) | Gets or sets the RD optimizer settings. |
| [getRgbColorProfile()](#getRgbColorProfile) | The destination RGB color profile for CMYK jpeg images. Use for saving images. Must be in pair with CMYKColorProfile for correct color conversion. |
| [setRgbColorProfile(com.aspose.cad.sources.StreamSource value)](#setRgbColorProfile-com.aspose.cad.sources.StreamSource) | The destination RGB color profile for CMYK jpeg images. Use for saving images. Must be in pair with CMYKColorProfile for correct color conversion. |
| [getCmykColorProfile()](#getCmykColorProfile) | The destination CMYK color profile for CMYK jpeg images. Use for saving images. Must be in pair with RGBColorProfile for correct color conversion. |
| [setCmykColorProfile(com.aspose.cad.sources.StreamSource value)](#setCmykColorProfile-com.aspose.cad.sources.StreamSource) | The destination CMYK color profile for CMYK jpeg images. Use for saving images. Must be in pair with RGBColorProfile for correct color conversion. |

### JpegOptions() {#JpegOptions}
```java
public JpegOptions()
```

Initializes a new instance of the JpegOptions class.

### JpegOptions(JpegOptions jpegOptions) {#JpegOptions-com.aspose.cad.imageoptions.JpegOptions}
```java
public JpegOptions(JpegOptions jpegOptions)
```

Initializes a new instance of the JpegOptions class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| jpegOptions | JpegOptions | The JPEG options. |

### getTargetFormat() {#getTargetFormat}
```java
public long getTargetFormat()
```

**Returns:** long

### getXmpData() {#getXmpData}
```java
public com.aspose.cad.xmp.XmpPacketWrapper getXmpData()
```

Gets or sets the XMP metadata container.

**Returns:** com.aspose.cad.xmp.XmpPacketWrapper - The XMP data container.

### setXmpData(com.aspose.cad.xmp.XmpPacketWrapper value) {#setXmpData-com.aspose.cad.xmp.XmpPacketWrapper}
```java
public void setXmpData(com.aspose.cad.xmp.XmpPacketWrapper value)
```

Gets or sets the XMP metadata container.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.xmp.XmpPacketWrapper | The XMP data container. |

### getJfif() {#getJfif}
```java
public JFIFData getJfif()
```

Gets or sets the jfif.

**Returns:** JFIFData

### setJfif(JFIFData value) {#setJfif-com.aspose.cad.fileformats.jpeg.JFIFData}
```java
public void setJfif(JFIFData value)
```

Gets or sets the jfif.

### getComment() {#getComment}
```java
public String getComment()
```

Gets or sets the jpeg file comment.

**Returns:** String

### setComment(String value) {#setComment-java.lang.String}
```java
public void setComment(String value)
```

Gets or sets the jpeg file comment.

### getExifData() {#getExifData}
```java
public JpegExifData getExifData()
```

Get or set exif data container

**Returns:** JpegExifData

### setExifData(JpegExifData value) {#setExifData-com.aspose.cad.exif.JpegExifData}
```java
public void setExifData(JpegExifData value)
```

Get or set exif data container

### getCompressionType() {#getCompressionType}
```java
public int getCompressionType()
```

Gets or sets the compression type.

**Returns:** int

### setCompressionType(int value) {#setCompressionType-int}
```java
public void setCompressionType(int value)
```

Gets or sets the compression type.

### getColorType() {#getColorType}
```java
public int getColorType()
```

Gets or sets the color type for jpeg image.

**Returns:** int

### setColorType(int value) {#setColorType-int}
```java
public void setColorType(int value)
```

Gets or sets the color type for jpeg image.

### getQuality() {#getQuality}
```java
public int getQuality()
```

Gets or sets image quality.

**Returns:** int

### setQuality(int value) {#setQuality-int}
```java
public void setQuality(int value)
```

Gets or sets image quality.

### getScaledQuality() {#getScaledQuality}
```java
public int getScaledQuality()
```

The scaled quality.

**Returns:** int

### getRdOptSettings() {#getRdOptSettings}
```java
public com.aspose.cad.imageoptions.RdOptimizerSettings getRdOptSettings()
```

Gets or sets the RD optimizer settings.

**Returns:** com.aspose.cad.imageoptions.RdOptimizerSettings - The RD optimizer settings.

### setRdOptSettings(com.aspose.cad.imageoptions.RdOptimizerSettings value) {#setRdOptSettings-com.aspose.cad.imageoptions.RdOptimizerSettings}
```java
public void setRdOptSettings(com.aspose.cad.imageoptions.RdOptimizerSettings value)
```

Gets or sets the RD optimizer settings.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.imageoptions.RdOptimizerSettings | The RD optimizer settings. |

### getRgbColorProfile() {#getRgbColorProfile}
```java
public com.aspose.cad.sources.StreamSource getRgbColorProfile()
```

The destination RGB color profile for CMYK jpeg images. Use for saving images. Must be in pair with CMYKColorProfile for correct color conversion.

**Returns:** com.aspose.cad.sources.StreamSource

### setRgbColorProfile(com.aspose.cad.sources.StreamSource value) {#setRgbColorProfile-com.aspose.cad.sources.StreamSource}
```java
public void setRgbColorProfile(com.aspose.cad.sources.StreamSource value)
```

The destination RGB color profile for CMYK jpeg images. Use for saving images. Must be in pair with CMYKColorProfile for correct color conversion.

### getCmykColorProfile() {#getCmykColorProfile}
```java
public com.aspose.cad.sources.StreamSource getCmykColorProfile()
```

The destination CMYK color profile for CMYK jpeg images. Use for saving images. Must be in pair with RGBColorProfile for correct color conversion.

**Returns:** com.aspose.cad.sources.StreamSource

### setCmykColorProfile(com.aspose.cad.sources.StreamSource value) {#setCmykColorProfile-com.aspose.cad.sources.StreamSource}
```java
public void setCmykColorProfile(com.aspose.cad.sources.StreamSource value)
```

The destination CMYK color profile for CMYK jpeg images. Use for saving images. Must be in pair with RGBColorProfile for correct color conversion.

