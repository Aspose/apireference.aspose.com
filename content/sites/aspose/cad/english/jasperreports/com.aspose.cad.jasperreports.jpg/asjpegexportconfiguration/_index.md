---
title: "ASJpegExportConfiguration"
linktitle: "ASJpegExportConfiguration"
second_title: "Aspose.CAD for JasperReports"
description: "The JPEG file format export configuration."
type: docs
weight: 10
url: /jasperreports/com.aspose.cad.jasperreports.jpg/asjpegexportconfiguration/
---

**Inheritance:** java.lang.Object, ImageExportConfiguration

The JPEG file format export configuration.

## Methods

| Method | Description |
| --- | --- |
| [getXmpData()](#getXmpData) | Gets the XMP metadata container. |
| [getComment()](#getComment) | Gets the jpeg file comment. |
| [getExifData()](#getExifData) | Get or set exif data container |
| [getCompressionType()](#getCompressionType) | Gets the compression type. |
| [getColorType()](#getColorType) | Gets the color type for jpeg image. |
| [getBitsPerChannel()](#getBitsPerChannel) | Gets bits per channel for lossless jpeg image. Now we support from 2 to 8 bits per channel. |
| [getQuality()](#getQuality) | Gets image quality. |
| [getRdOptSettings()](#getRdOptSettings) | Gets the RD optimizer settings. |
| [getRgbColorProfile()](#getRgbColorProfile) | The destination RGB color profile for CMYK jpeg images. Use for saving images. Must be in pair with CMYKColorProfile for correct color conversion. |
| [getCmykColorProfile()](#getCmykColorProfile) | The destination CMYK color profile for CMYK jpeg images. Use for saving images. Must be in pair with RGBColorProfile for correct color conversion. |
| [getJpegLsAllowedLossyError()](#getJpegLsAllowedLossyError) | Gets the JPEG-LS difference bound for near-lossless coding (NEAR parameter from the JPEG-LS specification). |
| [getJpegLsInterleaveMode()](#getJpegLsInterleaveMode) | Gets the JPEG-LS interleave mode. |
| [getJpegLsPreset()](#getJpegLsPreset) | Gets the JPEG-LS preset parameters. |
| [getHorizontalSampling()](#getHorizontalSampling) | Gets the horizontal subsamplings for each component. |
| [getVerticalSampling()](#getVerticalSampling) | Gets the vertical subsamplings for each component. |
| [getSampleRoundingMode()](#getSampleRoundingMode) | Gets the sample rounding mode to fit an 8-bit value to an n-bit value. P:JpegOptions.BitsPerChannel |
| [getPreblendAlphaIfPresent()](#getPreblendAlphaIfPresent) | Gets a value indicating whether red, green and blue components should be mixed with a background color, if alpha channel is present. |
| [getResolutionUnit()](#getResolutionUnit) | Gets the resolution unit. |

### getXmpData() {#getXmpData}
```java
com.aspose.cad.xmp.XmpPacketWrapper getXmpData()
```

Gets the XMP metadata container.

**Returns:** com.aspose.cad.xmp.XmpPacketWrapper - The XMP data container.

### getComment() {#getComment}
```java
String getComment()
```

Gets the jpeg file comment.

**Returns:** String

### getExifData() {#getExifData}
```java
com.aspose.imaging.exif.JpegExifData getExifData()
```

Get or set exif data container

**Returns:** com.aspose.imaging.exif.JpegExifData

### getCompressionType() {#getCompressionType}
```java
JpegCompressionMode getCompressionType()
```

Gets the compression type.

**Returns:** JpegCompressionMode

### getColorType() {#getColorType}
```java
JpegCompressionColorMode getColorType()
```

Gets the color type for jpeg image.

**Returns:** JpegCompressionColorMode

### getBitsPerChannel() {#getBitsPerChannel}
```java
byte getBitsPerChannel()
```

Gets bits per channel for lossless jpeg image. Now we support from 2 to 8 bits per channel.

**Returns:** byte

### getQuality() {#getQuality}
```java
int getQuality()
```

Gets image quality.

**Returns:** int

### getRdOptSettings() {#getRdOptSettings}
```java
com.aspose.cad.imageoptions.RdOptimizerSettings getRdOptSettings()
```

Gets the RD optimizer settings.

**Returns:** com.aspose.cad.imageoptions.RdOptimizerSettings - The RD optimizer settings.

### getRgbColorProfile() {#getRgbColorProfile}
```java
com.aspose.cad.sources.StreamSource getRgbColorProfile()
```

The destination RGB color profile for CMYK jpeg images. Use for saving images. Must be in pair with CMYKColorProfile for correct color conversion.

**Returns:** com.aspose.cad.sources.StreamSource

### getCmykColorProfile() {#getCmykColorProfile}
```java
com.aspose.cad.sources.StreamSource getCmykColorProfile()
```

The destination CMYK color profile for CMYK jpeg images. Use for saving images. Must be in pair with RGBColorProfile for correct color conversion.

**Returns:** com.aspose.cad.sources.StreamSource

### getJpegLsAllowedLossyError() {#getJpegLsAllowedLossyError}
```java
int getJpegLsAllowedLossyError()
```

Gets the JPEG-LS difference bound for near-lossless coding (NEAR parameter from the JPEG-LS specification).

**Returns:** int

### getJpegLsInterleaveMode() {#getJpegLsInterleaveMode}
```java
JpegLsInterleaveMode getJpegLsInterleaveMode()
```

Gets the JPEG-LS interleave mode.

**Returns:** JpegLsInterleaveMode

### getJpegLsPreset() {#getJpegLsPreset}
```java
com.aspose.imaging.fileformats.jpeg.JpegLsPresetCodingParameters getJpegLsPreset()
```

Gets the JPEG-LS preset parameters.

**Returns:** com.aspose.imaging.fileformats.jpeg.JpegLsPresetCodingParameters

### getHorizontalSampling() {#getHorizontalSampling}
```java
byte[] getHorizontalSampling()
```

Gets the horizontal subsamplings for each component.

**Returns:** byte[]

### getVerticalSampling() {#getVerticalSampling}
```java
byte[] getVerticalSampling()
```

Gets the vertical subsamplings for each component.

**Returns:** byte[]

### getSampleRoundingMode() {#getSampleRoundingMode}
```java
SampleRoundingMode getSampleRoundingMode()
```

Gets the sample rounding mode to fit an 8-bit value to an n-bit value. P:JpegOptions.BitsPerChannel

**Returns:** SampleRoundingMode

### getPreblendAlphaIfPresent() {#getPreblendAlphaIfPresent}
```java
boolean getPreblendAlphaIfPresent()
```

Gets a value indicating whether red, green and blue components should be mixed with a background color, if alpha channel is present.

**Returns:** boolean

### getResolutionUnit() {#getResolutionUnit}
```java
ResolutionUnit getResolutionUnit()
```

Gets the resolution unit.

**Returns:** ResolutionUnit - the resolution unit.

