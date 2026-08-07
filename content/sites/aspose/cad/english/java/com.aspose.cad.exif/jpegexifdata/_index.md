---
title: "JpegExifData"
linktitle: "JpegExifData"
second_title: "Aspose.CAD for Java"
description: "EXIF data container for jpeg files."
type: docs
weight: 10
url: /java/com.aspose.cad.exif/jpegexifdata/
---

**Inheritance:** java.lang.Object, com.aspose.cad.exif.ExifData

EXIF data container for jpeg files.

## Constructors

| Constructor | Description |
| --- | --- |
| [JpegExifData()](#JpegExifData) | Initializes a new instance of the JpegExifData class. |
| [JpegExifData(com.aspose.cad.fileformats.tiff.TiffDataType[] exifdata)](#JpegExifData-com.aspose.cad.fileformats.tiff.TiffDataType:A) | Initializes a new instance of the JpegExifData class with data from array. |
| [JpegExifData(com.aspose.cad.fileformats.tiff.TiffDataType[] commonTags, com.aspose.cad.fileformats.tiff.TiffDataType[] exifTags, com.aspose.cad.fileformats.tiff.TiffDataType[] gpsTags)](#JpegExifData-com.aspose.cad.fileformats.tiff.TiffDataType:A-com.aspose.cad.fileformats.tiff.TiffDataType:A-com.aspose.cad.fileformats.tiff.TiffDataType:A) | Initializes a new instance of the JpegExifData class with data from array. |

## Fields

| Field | Description |
| --- | --- |
| [MAX_EXIF_SEGMENT_SIZE](#MAX_EXIF_SEGMENT_SIZE) | The maximum EXIF segment size in bytes allowed. |

## Methods

| Method | Description |
| --- | --- |
| [getArtist()](#getArtist) | Gets or sets the artist. |
| [setArtist(String value)](#setArtist-java.lang.String) | Gets or sets the artist. |
| [getBitsPerSample()](#getBitsPerSample) | Gets or sets the bits per sample. |
| [setBitsPerSample(int[] value)](#setBitsPerSample-int:A) | Gets or sets the bits per sample. |
| [getCompression()](#getCompression) | Gets or sets the compression. |
| [setCompression(int value)](#setCompression-int) | Gets or sets the compression. |
| [getCopyright()](#getCopyright) | Gets or sets the copyright. |
| [setCopyright(String value)](#setCopyright-java.lang.String) | Gets or sets the copyright. |
| [getDateTime()](#getDateTime) | Gets or sets the date time. |
| [setDateTime(String value)](#setDateTime-java.lang.String) | Gets or sets the date time. |
| [getImageDescription()](#getImageDescription) | Gets or sets the image description. |
| [setImageDescription(String value)](#setImageDescription-java.lang.String) | Gets or sets the image description. |
| [getImageLength()](#getImageLength) | Gets or sets the image length. |
| [setImageLength(long value)](#setImageLength-long) | Gets or sets the image length. |
| [getImageWidth()](#getImageWidth) | Gets or sets the image width. |
| [setImageWidth(long value)](#setImageWidth-long) | Gets or sets the image width. |
| [getModel()](#getModel) | Gets or sets the model. |
| [setModel(String value)](#setModel-java.lang.String) | Gets or sets the model. |
| [getOrientation()](#getOrientation) | Gets or sets the orientation. |
| [setOrientation(int value)](#setOrientation-int) | Gets or sets the orientation. |
| [getPhotometricInterpretation()](#getPhotometricInterpretation) | Gets or sets the photometric interpretation. |
| [setPhotometricInterpretation(int value)](#setPhotometricInterpretation-int) | Gets or sets the photometric interpretation. |
| [getPlanarConfiguration()](#getPlanarConfiguration) | Gets or sets the planar configuration. |
| [setPlanarConfiguration(int value)](#setPlanarConfiguration-int) | Gets or sets the planar configuration. |
| [getPrimaryChromaticities()](#getPrimaryChromaticities) | Gets or sets the chromaticity of the three primary colors of the image. |
| [setPrimaryChromaticities(com.aspose.cad.fileformats.tiff.TiffRational[] value)](#setPrimaryChromaticities-com.aspose.cad.fileformats.tiff.TiffRational:A) | Gets or sets the chromaticity of the three primary colors of the image. |
| [getReferenceBlackWhite()](#getReferenceBlackWhite) | Gets or sets the reference black white. |
| [setReferenceBlackWhite(com.aspose.cad.fileformats.tiff.TiffRational[] value)](#setReferenceBlackWhite-com.aspose.cad.fileformats.tiff.TiffRational:A) | Gets or sets the reference black white. |
| [getResolutionUnit()](#getResolutionUnit) | Gets or sets the resolution unit. |
| [setResolutionUnit(int value)](#setResolutionUnit-int) | Gets or sets the resolution unit. |
| [getSamplesPerPixel()](#getSamplesPerPixel) | Gets or sets the samples per pixel. |
| [setSamplesPerPixel(int value)](#setSamplesPerPixel-int) | Gets or sets the samples per pixel. |
| [getSoftware()](#getSoftware) | Gets or sets the software. |
| [setSoftware(String value)](#setSoftware-java.lang.String) | Gets or sets the software. |
| [getThumbnail()](#getThumbnail) | Gets or sets the thumbnail image. |
| [setThumbnail(RasterImage value)](#setThumbnail-com.aspose.cad.RasterImage) | Gets or sets the thumbnail image. |
| [getTransferFunction()](#getTransferFunction) | Gets or sets the transfer function. |
| [setTransferFunction(int[] value)](#setTransferFunction-int:A) | Gets or sets the transfer function. |
| [getXResolution()](#getXResolution) | Gets or sets the x resolution. |
| [setXResolution(com.aspose.cad.fileformats.tiff.TiffRational value)](#setXResolution-com.aspose.cad.fileformats.tiff.TiffRational) | Gets or sets the x resolution. |
| [getYCbCrCoefficients()](#getYCbCrCoefficients) | Gets or sets the matrix coefficients for transformation from RGB to YCbCr image data. |
| [setYCbCrCoefficients(com.aspose.cad.fileformats.tiff.TiffRational[] value)](#setYCbCrCoefficients-com.aspose.cad.fileformats.tiff.TiffRational:A) | Gets or sets the matrix coefficients for transformation from RGB to YCbCr image data. |
| [getYCbCrPositioning()](#getYCbCrPositioning) | Gets or sets the position of chrominance components in relation to the luminance component. |
| [setYCbCrPositioning(int value)](#setYCbCrPositioning-int) | Gets or sets the position of chrominance components in relation to the luminance component. |
| [getYCbCrSubSampling()](#getYCbCrSubSampling) | Gets or sets the sampling ratio of chrominance components in relation to the luminance component. |
| [setYCbCrSubSampling(int[] value)](#setYCbCrSubSampling-int:A) | Gets or sets the sampling ratio of chrominance components in relation to the luminance component. |
| [getYResolution()](#getYResolution) | Gets or sets the y resolution. |
| [setYResolution(com.aspose.cad.fileformats.tiff.TiffRational value)](#setYResolution-com.aspose.cad.fileformats.tiff.TiffRational) | Gets or sets the y resolution. |
| [serializeExifData()](#serializeExifData) | Serializes the EXIF data. Writes the tags values and contents. The most influencing size tag is Thumbnail tag contents. |

### JpegExifData() {#JpegExifData}
```java
public JpegExifData()
```

Initializes a new instance of the JpegExifData class.

### JpegExifData(com.aspose.cad.fileformats.tiff.TiffDataType[] exifdata) {#JpegExifData-com.aspose.cad.fileformats.tiff.TiffDataType:A}
```java
public JpegExifData(com.aspose.cad.fileformats.tiff.TiffDataType[] exifdata)
```

Initializes a new instance of the JpegExifData class with data from array.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| exifdata | com.aspose.cad.fileformats.tiff.TiffDataType[] | Array of EXIF tags together with common and GPS tags. |

### JpegExifData(com.aspose.cad.fileformats.tiff.TiffDataType[] commonTags, com.aspose.cad.fileformats.tiff.TiffDataType[] exifTags, com.aspose.cad.fileformats.tiff.TiffDataType[] gpsTags) {#JpegExifData-com.aspose.cad.fileformats.tiff.TiffDataType:A-com.aspose.cad.fileformats.tiff.TiffDataType:A-com.aspose.cad.fileformats.tiff.TiffDataType:A}
```java
public JpegExifData(com.aspose.cad.fileformats.tiff.TiffDataType[] commonTags, com.aspose.cad.fileformats.tiff.TiffDataType[] exifTags, com.aspose.cad.fileformats.tiff.TiffDataType[] gpsTags)
```

Initializes a new instance of the JpegExifData class with data from array.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| commonTags | com.aspose.cad.fileformats.tiff.TiffDataType[] | The common tags. |
| exifTags | com.aspose.cad.fileformats.tiff.TiffDataType[] | The EXIF tags. |
| gpsTags | com.aspose.cad.fileformats.tiff.TiffDataType[] | The GPS tags. |

### MAX_EXIF_SEGMENT_SIZE {#MAX_EXIF_SEGMENT_SIZE}
```java
public static final int MAX_EXIF_SEGMENT_SIZE
```

The maximum EXIF segment size in bytes allowed.

**Returns:** int

### getArtist() {#getArtist}
```java
public String getArtist()
```

Gets or sets the artist.

**Returns:** String - The artist.

### setArtist(String value) {#setArtist-java.lang.String}
```java
public void setArtist(String value)
```

Gets or sets the artist.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The artist. |

### getBitsPerSample() {#getBitsPerSample}
```java
public int[] getBitsPerSample()
```

Gets or sets the bits per sample.

**Returns:** int[] - The bits per sample.

### setBitsPerSample(int[] value) {#setBitsPerSample-int:A}
```java
public void setBitsPerSample(int[] value)
```

Gets or sets the bits per sample.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int[] | The bits per sample. |

### getCompression() {#getCompression}
```java
public int getCompression()
```

Gets or sets the compression.

**Returns:** int - The compression.

### setCompression(int value) {#setCompression-int}
```java
public void setCompression(int value)
```

Gets or sets the compression.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The compression. |

### getCopyright() {#getCopyright}
```java
public String getCopyright()
```

Gets or sets the copyright.

**Returns:** String - The copyright.

### setCopyright(String value) {#setCopyright-java.lang.String}
```java
public void setCopyright(String value)
```

Gets or sets the copyright.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The copyright. |

### getDateTime() {#getDateTime}
```java
public String getDateTime()
```

Gets or sets the date time.

**Returns:** String - The date time.

### setDateTime(String value) {#setDateTime-java.lang.String}
```java
public void setDateTime(String value)
```

Gets or sets the date time.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The date time. |

### getImageDescription() {#getImageDescription}
```java
public String getImageDescription()
```

Gets or sets the image description.

**Returns:** String - The image description.

### setImageDescription(String value) {#setImageDescription-java.lang.String}
```java
public void setImageDescription(String value)
```

Gets or sets the image description.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The image description. |

### getImageLength() {#getImageLength}
```java
public long getImageLength()
```

Gets or sets the image length.

**Returns:** long - The length of the image.

### setImageLength(long value) {#setImageLength-long}
```java
public void setImageLength(long value)
```

Gets or sets the image length.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | long | The length of the image. |

### getImageWidth() {#getImageWidth}
```java
public long getImageWidth()
```

Gets or sets the image width.

**Returns:** long - The width of the image.

### setImageWidth(long value) {#setImageWidth-long}
```java
public void setImageWidth(long value)
```

Gets or sets the image width.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | long | The width of the image. |

### getModel() {#getModel}
```java
public String getModel()
```

Gets or sets the model.

**Returns:** String - The model.

### setModel(String value) {#setModel-java.lang.String}
```java
public void setModel(String value)
```

Gets or sets the model.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The model. |

### getOrientation() {#getOrientation}
```java
public int getOrientation()
```

Gets or sets the orientation.

**Returns:** int - The orientation.

### setOrientation(int value) {#setOrientation-int}
```java
public void setOrientation(int value)
```

Gets or sets the orientation.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The orientation. |

### getPhotometricInterpretation() {#getPhotometricInterpretation}
```java
public int getPhotometricInterpretation()
```

Gets or sets the photometric interpretation.

**Returns:** int - The photometric interpretation.

### setPhotometricInterpretation(int value) {#setPhotometricInterpretation-int}
```java
public void setPhotometricInterpretation(int value)
```

Gets or sets the photometric interpretation.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The photometric interpretation. |

### getPlanarConfiguration() {#getPlanarConfiguration}
```java
public int getPlanarConfiguration()
```

Gets or sets the planar configuration.

**Returns:** int - The planar configuration.

### setPlanarConfiguration(int value) {#setPlanarConfiguration-int}
```java
public void setPlanarConfiguration(int value)
```

Gets or sets the planar configuration.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The planar configuration. |

### getPrimaryChromaticities() {#getPrimaryChromaticities}
```java
public com.aspose.cad.fileformats.tiff.TiffRational[] getPrimaryChromaticities()
```

Gets or sets the chromaticity of the three primary colors of the image.

**Returns:** com.aspose.cad.fileformats.tiff.TiffRational[] - The chromaticity of the three primary colors of the image.

### setPrimaryChromaticities(com.aspose.cad.fileformats.tiff.TiffRational[] value) {#setPrimaryChromaticities-com.aspose.cad.fileformats.tiff.TiffRational:A}
```java
public void setPrimaryChromaticities(com.aspose.cad.fileformats.tiff.TiffRational[] value)
```

Gets or sets the chromaticity of the three primary colors of the image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.fileformats.tiff.TiffRational[] | The chromaticity of the three primary colors of the image. |

### getReferenceBlackWhite() {#getReferenceBlackWhite}
```java
public com.aspose.cad.fileformats.tiff.TiffRational[] getReferenceBlackWhite()
```

Gets or sets the reference black white.

**Returns:** com.aspose.cad.fileformats.tiff.TiffRational[] - The reference black white.

### setReferenceBlackWhite(com.aspose.cad.fileformats.tiff.TiffRational[] value) {#setReferenceBlackWhite-com.aspose.cad.fileformats.tiff.TiffRational:A}
```java
public void setReferenceBlackWhite(com.aspose.cad.fileformats.tiff.TiffRational[] value)
```

Gets or sets the reference black white.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.fileformats.tiff.TiffRational[] | The reference black white. |

### getResolutionUnit() {#getResolutionUnit}
```java
public int getResolutionUnit()
```

Gets or sets the resolution unit.

**Returns:** int - The resolution unit.

### setResolutionUnit(int value) {#setResolutionUnit-int}
```java
public void setResolutionUnit(int value)
```

Gets or sets the resolution unit.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The resolution unit. |

### getSamplesPerPixel() {#getSamplesPerPixel}
```java
public int getSamplesPerPixel()
```

Gets or sets the samples per pixel.

**Returns:** int - The samples per pixel.

### setSamplesPerPixel(int value) {#setSamplesPerPixel-int}
```java
public void setSamplesPerPixel(int value)
```

Gets or sets the samples per pixel.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The samples per pixel. |

### getSoftware() {#getSoftware}
```java
public String getSoftware()
```

Gets or sets the software.

**Returns:** String - The software.

### setSoftware(String value) {#setSoftware-java.lang.String}
```java
public void setSoftware(String value)
```

Gets or sets the software.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The software. |

### getThumbnail() {#getThumbnail}
```java
public RasterImage getThumbnail()
```

Gets or sets the thumbnail image.

**Returns:** RasterImage - The thumbnail.

### setThumbnail(RasterImage value) {#setThumbnail-com.aspose.cad.RasterImage}
```java
public void setThumbnail(RasterImage value)
```

Gets or sets the thumbnail image.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | RasterImage | The thumbnail. |

### getTransferFunction() {#getTransferFunction}
```java
public int[] getTransferFunction()
```

Gets or sets the transfer function.

**Returns:** int[] - The transfer function.

### setTransferFunction(int[] value) {#setTransferFunction-int:A}
```java
public void setTransferFunction(int[] value)
```

Gets or sets the transfer function.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int[] | The transfer function. |

### getXResolution() {#getXResolution}
```java
public com.aspose.cad.fileformats.tiff.TiffRational getXResolution()
```

Gets or sets the x resolution.

**Returns:** com.aspose.cad.fileformats.tiff.TiffRational - The x resolution.

### setXResolution(com.aspose.cad.fileformats.tiff.TiffRational value) {#setXResolution-com.aspose.cad.fileformats.tiff.TiffRational}
```java
public void setXResolution(com.aspose.cad.fileformats.tiff.TiffRational value)
```

Gets or sets the x resolution.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.fileformats.tiff.TiffRational | The x resolution. |

### getYCbCrCoefficients() {#getYCbCrCoefficients}
```java
public com.aspose.cad.fileformats.tiff.TiffRational[] getYCbCrCoefficients()
```

Gets or sets the matrix coefficients for transformation from RGB to YCbCr image data.

**Returns:** com.aspose.cad.fileformats.tiff.TiffRational[] - The matrix coefficients for transformation from RGB to YCbCr image data.

### setYCbCrCoefficients(com.aspose.cad.fileformats.tiff.TiffRational[] value) {#setYCbCrCoefficients-com.aspose.cad.fileformats.tiff.TiffRational:A}
```java
public void setYCbCrCoefficients(com.aspose.cad.fileformats.tiff.TiffRational[] value)
```

Gets or sets the matrix coefficients for transformation from RGB to YCbCr image data.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.fileformats.tiff.TiffRational[] | The matrix coefficients for transformation from RGB to YCbCr image data. |

### getYCbCrPositioning() {#getYCbCrPositioning}
```java
public int getYCbCrPositioning()
```

Gets or sets the position of chrominance components in relation to the luminance component.

**Returns:** int - The position of chrominance components in relation to the luminance component.

### setYCbCrPositioning(int value) {#setYCbCrPositioning-int}
```java
public void setYCbCrPositioning(int value)
```

Gets or sets the position of chrominance components in relation to the luminance component.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The position of chrominance components in relation to the luminance component. |

### getYCbCrSubSampling() {#getYCbCrSubSampling}
```java
public int[] getYCbCrSubSampling()
```

Gets or sets the sampling ratio of chrominance components in relation to the luminance component.

**Returns:** int[] - The sampling ratio of chrominance components in relation to the luminance component.

### setYCbCrSubSampling(int[] value) {#setYCbCrSubSampling-int:A}
```java
public void setYCbCrSubSampling(int[] value)
```

Gets or sets the sampling ratio of chrominance components in relation to the luminance component.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int[] | The sampling ratio of chrominance components in relation to the luminance component. |

### getYResolution() {#getYResolution}
```java
public com.aspose.cad.fileformats.tiff.TiffRational getYResolution()
```

Gets or sets the y resolution.

**Returns:** com.aspose.cad.fileformats.tiff.TiffRational - The y resolution.

### setYResolution(com.aspose.cad.fileformats.tiff.TiffRational value) {#setYResolution-com.aspose.cad.fileformats.tiff.TiffRational}
```java
public void setYResolution(com.aspose.cad.fileformats.tiff.TiffRational value)
```

Gets or sets the y resolution.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.fileformats.tiff.TiffRational | The y resolution. |

### serializeExifData() {#serializeExifData}
```java
public byte[] serializeExifData()
```

Serializes the EXIF data. Writes the tags values and contents. The most influencing size tag is Thumbnail tag contents.

**Returns:** byte[] - The serialized EXIF data. The overall segment size must be less than or equal to MaxExifSegmentSize bytes in order to produce correct jpeg image. Hint: try to reduce the thumbnail size or change its compression in case you have too big EXIF section size.

