---
title: "ASJpegExportParametersBean"
linktitle: "ASJpegExportParametersBean"
second_title: "Aspose.CAD for JasperReports"
description: "The HTML file format export parameters."
type: docs
weight: 10
url: /jasperreports/com.aspose.cad.jasperreports.jpg/asjpegexportparametersbean/
---

**Inheritance:** java.lang.Object, ImageExportParameters

The HTML file format export parameters.

## Constructors

| Constructor | Description |
| --- | --- |
| [ASJpegExportParametersBean()](#ASJpegExportParametersBean) | Instantiates a new Jpeg Export Parameters. |

## Methods

| Method | Description |
| --- | --- |
| [getExportConfiguration()](#getExportConfiguration) | Gets export configuration. |
| [getXmpData()](#getXmpData) | Gets the XMP metadata container. |
| [getComment()](#getComment) | Gets the jpeg file comment. |
| [setComment(String value)](#setComment-java.lang.String) | Sets the jpeg file comment. |
| [getExifData()](#getExifData) | Get or set exif data container |
| [setExifData(com.aspose.imaging.exif.JpegExifData value)](#setExifData-com.aspose.imaging.exif.JpegExifData) | Get or set exif data container |
| [getCompressionType()](#getCompressionType) | Gets the compression type. |
| [setCompressionType(JpegCompressionMode value)](#setCompressionType-com.aspose.cad.jasperreports.jpg.JpegCompressionMode) | Sets the compression type. |
| [getColorType()](#getColorType) | Gets the color type for jpeg image. |
| [setColorType(JpegCompressionColorMode value)](#setColorType-com.aspose.cad.jasperreports.jpg.JpegCompressionColorMode) | Sets the color type for jpeg image. |
| [getBitsPerChannel()](#getBitsPerChannel) | Gets bits per channel for lossless jpeg image. Now we support from 2 to 8 bits per channel. |
| [setBitsPerChannel(byte value)](#setBitsPerChannel-byte) | Sets bits per channel for lossless jpeg image. Now we support from 2 to 8 bits per channel. |
| [getQuality()](#getQuality) | Gets image quality. |
| [setQuality(int value)](#setQuality-int) | Sets image quality. |
| [getRdOptSettings()](#getRdOptSettings) | Gets the RD optimizer settings. |
| [setRdOptSettings(com.aspose.cad.imageoptions.RdOptimizerSettings value)](#setRdOptSettings-com.aspose.cad.imageoptions.RdOptimizerSettings) | Sets the RD optimizer settings. |
| [getRgbColorProfile()](#getRgbColorProfile) | The destination RGB color profile for CMYK jpeg images. Use for saving images. Must be in pair with CMYKColorProfile for correct color conversion. |
| [setRgbColorProfile(com.aspose.cad.sources.StreamSource value)](#setRgbColorProfile-com.aspose.cad.sources.StreamSource) | The destination RGB color profile for CMYK jpeg images. Use for saving images. Must be in pair with CMYKColorProfile for correct color conversion. |
| [getCmykColorProfile()](#getCmykColorProfile) | The destination CMYK color profile for CMYK jpeg images. Use for saving images. Must be in pair with RGBColorProfile for correct color conversion. |
| [setCmykColorProfile(com.aspose.cad.sources.StreamSource value)](#setCmykColorProfile-com.aspose.cad.sources.StreamSource) | The destination CMYK color profile for CMYK jpeg images. Use for saving images. Must be in pair with RGBColorProfile for correct color conversion. |
| [getJpegLsAllowedLossyError()](#getJpegLsAllowedLossyError) | Gets the JPEG-LS difference bound for near-lossless coding (NEAR parameter from the JPEG-LS specification). |
| [setJpegLsAllowedLossyError(int value)](#setJpegLsAllowedLossyError-int) | Sets the JPEG-LS difference bound for near-lossless coding (NEAR parameter from the JPEG-LS specification). |
| [getJpegLsInterleaveMode()](#getJpegLsInterleaveMode) | Gets the JPEG-LS interleave mode. |
| [setJpegLsInterleaveMode(JpegLsInterleaveMode value)](#setJpegLsInterleaveMode-com.aspose.cad.jasperreports.jpg.JpegLsInterleaveMode) | Sets the JPEG-LS interleave mode. |
| [getJpegLsPreset()](#getJpegLsPreset) | Gets the JPEG-LS preset parameters. |
| [setJpegLsPreset(com.aspose.imaging.fileformats.jpeg.JpegLsPresetCodingParameters value)](#setJpegLsPreset-com.aspose.imaging.fileformats.jpeg.JpegLsPresetCodingParameters) | Sets the JPEG-LS preset parameters. |
| [getHorizontalSampling()](#getHorizontalSampling) | Gets the horizontal subsamplings for each component. |
| [setHorizontalSampling(byte[] value)](#setHorizontalSampling-byte:A) | Sets the horizontal subsamplings for each component. |
| [getVerticalSampling()](#getVerticalSampling) | Gets the vertical subsamplings for each component. |
| [setVerticalSampling(byte[] value)](#setVerticalSampling-byte:A) | Sets the vertical subsamplings for each component. |
| [getSampleRoundingMode()](#getSampleRoundingMode) | Gets the sample rounding mode to fit an 8-bit value to an n-bit value. |
| [setSampleRoundingMode(SampleRoundingMode value)](#setSampleRoundingMode-com.aspose.cad.jasperreports.jpg.SampleRoundingMode) | Sets the sample rounding mode to fit an 8-bit value to an n-bit value. |
| [getPreblendAlphaIfPresent()](#getPreblendAlphaIfPresent) | Gets a value indicating whether red, green and blue components should be mixed with a background color, if alpha channel is present. |
| [setPreblendAlphaIfPresent(boolean value)](#setPreblendAlphaIfPresent-boolean) | Sets a value indicating whether red, green and blue components should be mixed with a background color, if alpha channel is present. |
| [getResolutionUnit()](#getResolutionUnit) | Gets the resolution unit. |
| [setResolutionUnit(ResolutionUnit value)](#setResolutionUnit-com.aspose.cad.jasperreports.common.ResolutionUnit) | Sets the resolution unit. |
| [setPropertyValues(Object propertyValues)](#setPropertyValues-java.lang.Object) |  |

### ASJpegExportParametersBean() {#ASJpegExportParametersBean}
```java
public ASJpegExportParametersBean()
```

Instantiates a new Jpeg Export Parameters.

### getExportConfiguration() {#getExportConfiguration}
```java
public ASJpegExportConfiguration getExportConfiguration()
```

Gets export configuration.

**Returns:** ASJpegExportConfiguration - the export configuration

### getXmpData() {#getXmpData}
```java
public com.aspose.cad.xmp.XmpPacketWrapper getXmpData()
```

Gets the XMP metadata container.

**Returns:** com.aspose.cad.xmp.XmpPacketWrapper - The XMP data container.

### getComment() {#getComment}
```java
public String getComment()
```

Gets the jpeg file comment.

**Returns:** String - the comment

### setComment(String value) {#setComment-java.lang.String}
```java
public void setComment(String value)
```

Sets the jpeg file comment.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | the value |

### getExifData() {#getExifData}
```java
public com.aspose.imaging.exif.JpegExifData getExifData()
```

Get or set exif data container

**Returns:** com.aspose.imaging.exif.JpegExifData - the exif data

### setExifData(com.aspose.imaging.exif.JpegExifData value) {#setExifData-com.aspose.imaging.exif.JpegExifData}
```java
public void setExifData(com.aspose.imaging.exif.JpegExifData value)
```

Get or set exif data container

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.imaging.exif.JpegExifData | the value |

### getCompressionType() {#getCompressionType}
```java
public JpegCompressionMode getCompressionType()
```

Gets the compression type.

**Returns:** JpegCompressionMode - the compression type

### setCompressionType(JpegCompressionMode value) {#setCompressionType-com.aspose.cad.jasperreports.jpg.JpegCompressionMode}
```java
public void setCompressionType(JpegCompressionMode value)
```

Sets the compression type.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | JpegCompressionMode | the value |

### getColorType() {#getColorType}
```java
public JpegCompressionColorMode getColorType()
```

Gets the color type for jpeg image.

**Returns:** JpegCompressionColorMode - the color type

### setColorType(JpegCompressionColorMode value) {#setColorType-com.aspose.cad.jasperreports.jpg.JpegCompressionColorMode}
```java
public void setColorType(JpegCompressionColorMode value)
```

Sets the color type for jpeg image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | JpegCompressionColorMode | the value |

### getBitsPerChannel() {#getBitsPerChannel}
```java
public byte getBitsPerChannel()
```

Gets bits per channel for lossless jpeg image. Now we support from 2 to 8 bits per channel.

**Returns:** byte - the bits per channel

### setBitsPerChannel(byte value) {#setBitsPerChannel-byte}
```java
public void setBitsPerChannel(byte value)
```

Sets bits per channel for lossless jpeg image. Now we support from 2 to 8 bits per channel.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | byte | the value |

### getQuality() {#getQuality}
```java
public int getQuality()
```

Gets image quality.

**Returns:** int - the quality

### setQuality(int value) {#setQuality-int}
```java
public void setQuality(int value)
```

Sets image quality.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the value |

### getRdOptSettings() {#getRdOptSettings}
```java
public com.aspose.cad.imageoptions.RdOptimizerSettings getRdOptSettings()
```

Gets the RD optimizer settings.

**Returns:** com.aspose.cad.imageoptions.RdOptimizerSettings - The RD optimizer settings.

### setRdOptSettings(com.aspose.cad.imageoptions.RdOptimizerSettings value) {#setRdOptSettings-com.aspose.cad.imageoptions.RdOptimizerSettings}
```java
public void setRdOptSettings(com.aspose.cad.imageoptions.RdOptimizerSettings value)
```

Sets the RD optimizer settings.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.imageoptions.RdOptimizerSettings | The RD optimizer settings. |

### getRgbColorProfile() {#getRgbColorProfile}
```java
public com.aspose.cad.sources.StreamSource getRgbColorProfile()
```

The destination RGB color profile for CMYK jpeg images. Use for saving images. Must be in pair with CMYKColorProfile for correct color conversion.

**Returns:** com.aspose.cad.sources.StreamSource - the rgb color profile

### setRgbColorProfile(com.aspose.cad.sources.StreamSource value) {#setRgbColorProfile-com.aspose.cad.sources.StreamSource}
```java
public void setRgbColorProfile(com.aspose.cad.sources.StreamSource value)
```

The destination RGB color profile for CMYK jpeg images. Use for saving images. Must be in pair with CMYKColorProfile for correct color conversion.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.sources.StreamSource | the value |

### getCmykColorProfile() {#getCmykColorProfile}
```java
public com.aspose.cad.sources.StreamSource getCmykColorProfile()
```

The destination CMYK color profile for CMYK jpeg images. Use for saving images. Must be in pair with RGBColorProfile for correct color conversion.

**Returns:** com.aspose.cad.sources.StreamSource - the cmyk color profile

### setCmykColorProfile(com.aspose.cad.sources.StreamSource value) {#setCmykColorProfile-com.aspose.cad.sources.StreamSource}
```java
public void setCmykColorProfile(com.aspose.cad.sources.StreamSource value)
```

The destination CMYK color profile for CMYK jpeg images. Use for saving images. Must be in pair with RGBColorProfile for correct color conversion.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.sources.StreamSource | the value |

### getJpegLsAllowedLossyError() {#getJpegLsAllowedLossyError}
```java
public int getJpegLsAllowedLossyError()
```

Gets the JPEG-LS difference bound for near-lossless coding (NEAR parameter from the JPEG-LS specification).

**Returns:** int - the jpeg ls allowed lossy error

### setJpegLsAllowedLossyError(int value) {#setJpegLsAllowedLossyError-int}
```java
public void setJpegLsAllowedLossyError(int value)
```

Sets the JPEG-LS difference bound for near-lossless coding (NEAR parameter from the JPEG-LS specification).

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the value |

### getJpegLsInterleaveMode() {#getJpegLsInterleaveMode}
```java
public JpegLsInterleaveMode getJpegLsInterleaveMode()
```

Gets the JPEG-LS interleave mode.

**Returns:** JpegLsInterleaveMode - the jpeg ls interleave mode

### setJpegLsInterleaveMode(JpegLsInterleaveMode value) {#setJpegLsInterleaveMode-com.aspose.cad.jasperreports.jpg.JpegLsInterleaveMode}
```java
public void setJpegLsInterleaveMode(JpegLsInterleaveMode value)
```

Sets the JPEG-LS interleave mode.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | JpegLsInterleaveMode | the value |

### getJpegLsPreset() {#getJpegLsPreset}
```java
public com.aspose.imaging.fileformats.jpeg.JpegLsPresetCodingParameters getJpegLsPreset()
```

Gets the JPEG-LS preset parameters.

**Returns:** com.aspose.imaging.fileformats.jpeg.JpegLsPresetCodingParameters - the jpeg ls preset

### setJpegLsPreset(com.aspose.imaging.fileformats.jpeg.JpegLsPresetCodingParameters value) {#setJpegLsPreset-com.aspose.imaging.fileformats.jpeg.JpegLsPresetCodingParameters}
```java
public void setJpegLsPreset(com.aspose.imaging.fileformats.jpeg.JpegLsPresetCodingParameters value)
```

Sets the JPEG-LS preset parameters.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.imaging.fileformats.jpeg.JpegLsPresetCodingParameters | the value |

### getHorizontalSampling() {#getHorizontalSampling}
```java
public byte[] getHorizontalSampling()
```

Gets the horizontal subsamplings for each component.

**Returns:** byte[] - the byte [ ]

### setHorizontalSampling(byte[] value) {#setHorizontalSampling-byte:A}
```java
public void setHorizontalSampling(byte[] value)
```

Sets the horizontal subsamplings for each component.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | byte[] | the value |

### getVerticalSampling() {#getVerticalSampling}
```java
public byte[] getVerticalSampling()
```

Gets the vertical subsamplings for each component.

**Returns:** byte[] - the byte [ ]

### setVerticalSampling(byte[] value) {#setVerticalSampling-byte:A}
```java
public void setVerticalSampling(byte[] value)
```

Sets the vertical subsamplings for each component.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | byte[] | the value |

### getSampleRoundingMode() {#getSampleRoundingMode}
```java
public SampleRoundingMode getSampleRoundingMode()
```

Gets the sample rounding mode to fit an 8-bit value to an n-bit value.

**Returns:** SampleRoundingMode - the sample rounding mode

### setSampleRoundingMode(SampleRoundingMode value) {#setSampleRoundingMode-com.aspose.cad.jasperreports.jpg.SampleRoundingMode}
```java
public void setSampleRoundingMode(SampleRoundingMode value)
```

Sets the sample rounding mode to fit an 8-bit value to an n-bit value.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | SampleRoundingMode | the value |

### getPreblendAlphaIfPresent() {#getPreblendAlphaIfPresent}
```java
public boolean getPreblendAlphaIfPresent()
```

Gets a value indicating whether red, green and blue components should be mixed with a background color, if alpha channel is present.

**Returns:** boolean - the preblend alpha if present

### setPreblendAlphaIfPresent(boolean value) {#setPreblendAlphaIfPresent-boolean}
```java
public void setPreblendAlphaIfPresent(boolean value)
```

Sets a value indicating whether red, green and blue components should be mixed with a background color, if alpha channel is present.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | the value |

### getResolutionUnit() {#getResolutionUnit}
```java
public final ResolutionUnit getResolutionUnit()
```

Gets the resolution unit.

**Returns:** ResolutionUnit - the resolution unit.

### setResolutionUnit(ResolutionUnit value) {#setResolutionUnit-com.aspose.cad.jasperreports.common.ResolutionUnit}
```java
public final void setResolutionUnit(ResolutionUnit value)
```

Sets the resolution unit.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | ResolutionUnit | the resolution unit. |

### setPropertyValues(Object propertyValues) {#setPropertyValues-java.lang.Object}
```java
public void setPropertyValues(Object propertyValues)
```

