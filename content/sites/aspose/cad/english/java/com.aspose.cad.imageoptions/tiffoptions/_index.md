---
title: "TiffOptions"
linktitle: "TiffOptions"
second_title: "Aspose.CAD for Java"
description: "The tiff file format options."
type: docs
weight: 10
url: /java/com.aspose.cad.imageoptions/tiffoptions/
---

**Inheritance:** java.lang.Object, ImageOptionsBase

The tiff file format options. Note that width and height tags will get overwritten on image creation by width and height parameters so there is no need to specify them directly. Note that many options return a default value but that does not mean that this option is set explicitly as a tag value. To verify the tag is present use Tags property or the corresponding IsTagPresent method. <developer_tip> WARNING! never modify tiff options during save since this may cause side effects and hard to find bugs. The following line was specially left commented since it caused incorrect determination of data beginning. The passed options did not contain spp (although the options are not correct in such case but still this scenario causes errors) and the next line caused +spp tag +bpp tag added and when options were written after data completely written they have overwritten the data beginning for uncompressed codec!!! See TiffUncompressedCodec.Encode. this.Options.SamplesPerPixel = 3; </developer_tip>

## Constructors

| Constructor | Description |
| --- | --- |
| [TiffOptions(int expectedFormat, int byteOrder)](#TiffOptions-int-int) | Initializes a new instance of the TiffOptions class. |
| [TiffOptions(int expectedFormat)](#TiffOptions-int) | Initializes a new instance of the TiffOptions class. By default little endian convention is used. |
| [TiffOptions(TiffOptions options)](#TiffOptions-com.aspose.cad.imageoptions.TiffOptions) | Initializes a new instance of the TiffOptions class. |
| [TiffOptions(com.aspose.cad.fileformats.tiff.TiffDataType[] tags)](#TiffOptions-com.aspose.cad.fileformats.tiff.TiffDataType:A) | Initializes a new instance of the TiffOptions class. |

## Methods

| Method | Description |
| --- | --- |
| [getTargetFormat()](#getTargetFormat) |  |
| [getXmpData()](#getXmpData) | Gets or sets the XMP metadata container. |
| [setXmpData(com.aspose.cad.xmp.XmpPacketWrapper value)](#setXmpData-com.aspose.cad.xmp.XmpPacketWrapper) | Gets or sets the XMP metadata container. |
| [isValid()](#isValid) | Gets a value indicating whether the TiffOptions have been properly configured. Use Validate method as to find the failure reason. |
| [getArtist()](#getArtist) | Gets or sets the artist. |
| [setArtist(String value)](#setArtist-java.lang.String) | Gets or sets the artist. |
| [isTagPresent(int tag)](#isTagPresent-int) | Determines whether tag is present in the options or not. |
| [getByteOrder()](#getByteOrder) | Gets or sets a value indicating the tiff byte order. |
| [setByteOrder(int value)](#setByteOrder-int) | Gets or sets a value indicating the tiff byte order. |
| [getIccProfile()](#getIccProfile) | Gets the icc profile stream. |
| [getBitsPerSample()](#getBitsPerSample) | Gets or sets the bits per sample. |
| [setBitsPerSample(int[] value)](#setBitsPerSample-int:A) | Gets or sets the bits per sample. |
| [getCompression()](#getCompression) | Gets or sets the compression. |
| [setCompression(int value)](#setCompression-int) | Gets or sets the compression. |
| [getCopyright()](#getCopyright) | Gets or sets the copyright. |
| [setCopyright(String value)](#setCopyright-java.lang.String) | Gets or sets the copyright. |
| [getColorMap()](#getColorMap) | Gets or sets the color map. |
| [setColorMap(int[] value)](#setColorMap-int:A) | Gets or sets the color map. |
| [getPalette()](#getPalette) | Gets or sets the color palette. |
| [setPalette(com.aspose.cad.IColorPalette value)](#setPalette-com.aspose.cad.IColorPalette) | Gets or sets the color palette. |
| [getDateTime()](#getDateTime) | Gets or sets the date and time. |
| [setDateTime(String value)](#setDateTime-java.lang.String) | Gets or sets the date and time. |
| [getDocumentName()](#getDocumentName) | Gets or sets the name of the document. |
| [setDocumentName(String value)](#setDocumentName-java.lang.String) | Gets or sets the name of the document. |
| [getAlphaStorage()](#getAlphaStorage) | Gets or sets the alpha storage option. Options other than TiffAlphaStorage.Unspecified are used when there are more than 3 SamplesPerPixel defined. |
| [setAlphaStorage(int value)](#setAlphaStorage-int) | Gets or sets the alpha storage option. Options other than TiffAlphaStorage.Unspecified are used when there are more than 3 SamplesPerPixel defined. |
| [isExtraSamplesPresent()](#isExtraSamplesPresent) | Gets a value indicating whether the extra samples is present. |
| [getFillOrder()](#getFillOrder) | Gets or sets the byte bits fill order. |
| [setFillOrder(int value)](#setFillOrder-int) | Gets or sets the byte bits fill order. |
| [getHalfToneHints()](#getHalfToneHints) | Gets or sets the halftone hints. |
| [setHalfToneHints(int[] value)](#setHalfToneHints-int:A) | Gets or sets the halftone hints. |
| [getImageDescription()](#getImageDescription) | Gets or sets the image description. |
| [setImageDescription(String value)](#setImageDescription-java.lang.String) | Gets or sets the image description. |
| [getInkNames()](#getInkNames) | Gets or sets the ink names. |
| [setInkNames(String value)](#setInkNames-java.lang.String) | Gets or sets the ink names. |
| [getScannerManufacturer()](#getScannerManufacturer) | Gets or sets the scanner manufacturer. |
| [setScannerManufacturer(String value)](#setScannerManufacturer-java.lang.String) | Gets or sets the scanner manufacturer. |
| [getMaxSampleValue()](#getMaxSampleValue) | Gets or sets the max sample value. |
| [setMaxSampleValue(int[] value)](#setMaxSampleValue-int:A) | Gets or sets the max sample value. |
| [getMinSampleValue()](#getMinSampleValue) | Gets or sets the min sample value. |
| [setMinSampleValue(int[] value)](#setMinSampleValue-int:A) | Gets or sets the min sample value. |
| [getScannerModel()](#getScannerModel) | Gets or sets the scanner model. |
| [setScannerModel(String value)](#setScannerModel-java.lang.String) | Gets or sets the scanner model. |
| [getOrientation()](#getOrientation) | Gets or sets the orientation. |
| [setOrientation(int value)](#setOrientation-int) | Gets or sets the orientation. |
| [getPageName()](#getPageName) | Gets or sets the page name. |
| [setPageName(String value)](#setPageName-java.lang.String) | Gets or sets the page name. |
| [getPageNumber()](#getPageNumber) | Gets or sets the page number tag. |
| [setPageNumber(int[] value)](#setPageNumber-int:A) | Gets or sets the page number tag. |
| [getPhotometric()](#getPhotometric) | Gets or sets the photometric. |
| [setPhotometric(int value)](#setPhotometric-int) | Gets or sets the photometric. |
| [getPlanarConfiguration()](#getPlanarConfiguration) | Gets or sets the planar configuration. |
| [setPlanarConfiguration(int value)](#setPlanarConfiguration-int) | Gets or sets the planar configuration. |
| [getResolutionUnit()](#getResolutionUnit) | Gets or sets the resolution unit. |
| [setResolutionUnit(int value)](#setResolutionUnit-int) | Gets or sets the resolution unit. |
| [getRowsPerStrip()](#getRowsPerStrip) | Gets or sets the rows per strip. |
| [setRowsPerStrip(long value)](#setRowsPerStrip-long) | Gets or sets the rows per strip. |
| [getSampleFormat()](#getSampleFormat) | Gets or sets the sample format. |
| [setSampleFormat(int[] value)](#setSampleFormat-int:A) | Gets or sets the sample format. |
| [getSamplesPerPixel()](#getSamplesPerPixel) | Gets the samples per pixel. To change this property value use the BitsPerSample property setter. |
| [getSmaxSampleValue()](#getSmaxSampleValue) | Gets or sets the max sample value. The value has a field type which best matches the sample data (Byte, Short or Long type). |
| [setSmaxSampleValue(long[] value)](#setSmaxSampleValue-long:A) | Gets or sets the max sample value. The value has a field type which best matches the sample data (Byte, Short or Long type). |
| [getSminSampleValue()](#getSminSampleValue) | Gets or sets the min sample value. The value has a field type which best matches the sample data (Byte, Short or Long type). |
| [setSminSampleValue(long[] value)](#setSminSampleValue-long:A) | Gets or sets the min sample value. The value has a field type which best matches the sample data (Byte, Short or Long type). |
| [getSoftwareType()](#getSoftwareType) | Gets or sets the software type. |
| [setSoftwareType(String value)](#setSoftwareType-java.lang.String) | Gets or sets the software type. |
| [getStripByteCounts()](#getStripByteCounts) | Gets or sets the strip byte counts. |
| [setStripByteCounts(long[] value)](#setStripByteCounts-long:A) | Gets or sets the strip byte counts. |
| [getStripOffsets()](#getStripOffsets) | Gets or sets the strip offsets. |
| [setStripOffsets(long[] value)](#setStripOffsets-long:A) | Gets or sets the strip offsets. |
| [getSubFileType()](#getSubFileType) | Gets or sets a general indication of the kind of data contained in this subfile. |
| [setSubFileType(long value)](#setSubFileType-long) | Gets or sets a general indication of the kind of data contained in this subfile. |
| [getTargetPrinter()](#getTargetPrinter) | Gets or sets the target printer. |
| [setTargetPrinter(String value)](#setTargetPrinter-java.lang.String) | Gets or sets the target printer. |
| [getThreshholding()](#getThreshholding) | Gets or sets the threshholding. |
| [setThreshholding(int value)](#setThreshholding-int) | Gets or sets the threshholding. |
| [getTotalPages()](#getTotalPages) | Gets the total pages. |
| [getXposition()](#getXposition) | Gets or sets the x position. |
| [setXposition(com.aspose.cad.fileformats.tiff.TiffRational value)](#setXposition-com.aspose.cad.fileformats.tiff.TiffRational) | Gets or sets the x position. |
| [getResolutionSettings()](#getResolutionSettings) | Gets or sets the resolution settings. |
| [setResolutionSettings(com.aspose.cad.ResolutionSetting value)](#setResolutionSettings-com.aspose.cad.ResolutionSetting) | Gets or sets the resolution settings. |
| [getXresolution()](#getXresolution) | Gets or sets the x resolution. |
| [setXresolution(com.aspose.cad.fileformats.tiff.TiffRational value)](#setXresolution-com.aspose.cad.fileformats.tiff.TiffRational) | Gets or sets the x resolution. |
| [getYposition()](#getYposition) | Gets or sets the y position. |
| [setYposition(com.aspose.cad.fileformats.tiff.TiffRational value)](#setYposition-com.aspose.cad.fileformats.tiff.TiffRational) | Gets or sets the y position. |
| [getYresolution()](#getYresolution) | Gets or sets the y resolution. |
| [setYresolution(com.aspose.cad.fileformats.tiff.TiffRational value)](#setYresolution-com.aspose.cad.fileformats.tiff.TiffRational) | Gets or sets the y resolution. |
| [getFaxT4Options()](#getFaxT4Options) | Gets or sets the fax t4 options. |
| [setFaxT4Options(long value)](#setFaxT4Options-long) | Gets or sets the fax t4 options. |
| [getPredictor()](#getPredictor) | Gets or sets the predictor for LZW compression. |
| [setPredictor(int value)](#setPredictor-int) | Gets or sets the predictor for LZW compression. |
| [getImageLength()](#getImageLength) | Gets or sets the image length. |
| [setImageLength(long value)](#setImageLength-long) | Gets or sets the image length. |
| [getImageWidth()](#getImageWidth) | Gets or sets the image width. |
| [setImageWidth(long value)](#setImageWidth-long) | Gets or sets the image width. |
| [getTags()](#getTags) | Gets or sets the tags. |
| [setTags(com.aspose.cad.fileformats.tiff.TiffDataType[] value)](#setTags-com.aspose.cad.fileformats.tiff.TiffDataType:A) | Gets or sets the tags. |
| [getValidTagCount()](#getValidTagCount) | Gets the valid tag count. This is not the total tags count but the number of tags which may be preserved. |
| [getBitsPerPixel()](#getBitsPerPixel) | Gets the bits per pixel. |
| [getValidTagsCount(com.aspose.cad.fileformats.tiff.TiffDataType[] tags)](#getValidTagsCount-com.aspose.cad.fileformats.tiff.TiffDataType:A) | Gets the valid tags count. |
| [removeTag(int tag)](#removeTag-int) | Removes the tag. |
| [validate()](#validate) | Validates if options have valid combination of tags |
| [addTags(com.aspose.cad.fileformats.tiff.TiffDataType[] tagsToAdd)](#addTags-com.aspose.cad.fileformats.tiff.TiffDataType:A) | Adds the tags. |
| [addTag(com.aspose.cad.fileformats.tiff.TiffDataType tagToAdd)](#addTag-com.aspose.cad.fileformats.tiff.TiffDataType) | Adds a new tag. |
| [getTagByType(int tagKey)](#getTagByType-int) | Gets the instance of the tag by type. |

### TiffOptions(int expectedFormat, int byteOrder) {#TiffOptions-int-int}
```java
public TiffOptions(int expectedFormat, int byteOrder)
```

Initializes a new instance of the TiffOptions class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| expectedFormat | int | The expected tiff file format. |
| byteOrder | int | The tiff file format byte order to use. |

### TiffOptions(int expectedFormat) {#TiffOptions-int}
```java
public TiffOptions(int expectedFormat)
```

Initializes a new instance of the TiffOptions class. By default little endian convention is used.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| expectedFormat | int | The expected tiff file format. |

### TiffOptions(TiffOptions options) {#TiffOptions-com.aspose.cad.imageoptions.TiffOptions}
```java
public TiffOptions(TiffOptions options)
```

Initializes a new instance of the TiffOptions class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| options | TiffOptions | The options to copy from. |

### TiffOptions(com.aspose.cad.fileformats.tiff.TiffDataType[] tags) {#TiffOptions-com.aspose.cad.fileformats.tiff.TiffDataType:A}
```java
public TiffOptions(com.aspose.cad.fileformats.tiff.TiffDataType[] tags)
```

Initializes a new instance of the TiffOptions class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| tags | com.aspose.cad.fileformats.tiff.TiffDataType[] | The tags to initialize options with. |

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

### isValid() {#isValid}
```java
public boolean isValid()
```

Gets a value indicating whether the TiffOptions have been properly configured. Use Validate method as to find the failure reason.

**Returns:** boolean - true if TiffOptions are properly configured; otherwise, false .

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

### isTagPresent(int tag) {#isTagPresent-int}
```java
public boolean isTagPresent(int tag)
```

Determines whether tag is present in the options or not.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| tag | int | The tag id to check. |

**Returns:** boolean - true if tag is present; otherwise, false .

### getByteOrder() {#getByteOrder}
```java
public int getByteOrder()
```

Gets or sets a value indicating the tiff byte order.

**Returns:** int

### setByteOrder(int value) {#setByteOrder-int}
```java
public void setByteOrder(int value)
```

Gets or sets a value indicating the tiff byte order.

### getIccProfile() {#getIccProfile}
```java
public byte[] getIccProfile()
```

Gets the icc profile stream.

**Returns:** byte[] - The icc profile.

### getBitsPerSample() {#getBitsPerSample}
```java
public int[] getBitsPerSample()
```

Gets or sets the bits per sample.

**Returns:** int[] - The bits per sample value. When setting this value keep in mind that it will also set SamplesPerPixel value to array length. These 2 properties are very tightly coupled so may be set alltogether only.

### setBitsPerSample(int[] value) {#setBitsPerSample-int:A}
```java
public void setBitsPerSample(int[] value)
```

Gets or sets the bits per sample.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int[] | The bits per sample value. When setting this value keep in mind that it will also set SamplesPerPixel value to array length. These 2 properties are very tightly coupled so may be set alltogether only. |

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

### getColorMap() {#getColorMap}
```java
public int[] getColorMap()
```

Gets or sets the color map.

**Returns:** int[] - The color map.

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.cad.cadexceptions.imageformats.TiffImageException` - The color map may be defined for samples per pixel equal to 1 only. or The bits per sample are not defined.
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;The array length must correspond to the followign formula: 3 * (2**BitsPerSample).

### setColorMap(int[] value) {#setColorMap-int:A}
```java
public void setColorMap(int[] value)
```

Gets or sets the color map.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int[] | The color map. |

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.cad.cadexceptions.imageformats.TiffImageException` - The color map may be defined for samples per pixel equal to 1 only. or The bits per sample are not defined.
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;The array length must correspond to the followign formula: 3 * (2**BitsPerSample).

### getPalette() {#getPalette}
```java
public com.aspose.cad.IColorPalette getPalette()
```

Gets or sets the color palette.

**Returns:** com.aspose.cad.IColorPalette - The color palette.

### setPalette(com.aspose.cad.IColorPalette value) {#setPalette-com.aspose.cad.IColorPalette}
```java
public void setPalette(com.aspose.cad.IColorPalette value)
```

Gets or sets the color palette.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.IColorPalette | The color palette. |

### getDateTime() {#getDateTime}
```java
public String getDateTime()
```

Gets or sets the date and time.

**Returns:** String - The date and time.

### setDateTime(String value) {#setDateTime-java.lang.String}
```java
public void setDateTime(String value)
```

Gets or sets the date and time.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The date and time. |

### getDocumentName() {#getDocumentName}
```java
public String getDocumentName()
```

Gets or sets the name of the document.

**Returns:** String - The name of the document.

### setDocumentName(String value) {#setDocumentName-java.lang.String}
```java
public void setDocumentName(String value)
```

Gets or sets the name of the document.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The name of the document. |

### getAlphaStorage() {#getAlphaStorage}
```java
public int getAlphaStorage()
```

Gets or sets the alpha storage option. Options other than TiffAlphaStorage.Unspecified are used when there are more than 3 SamplesPerPixel defined.

**Returns:** int - The alpha storage option.

### setAlphaStorage(int value) {#setAlphaStorage-int}
```java
public void setAlphaStorage(int value)
```

Gets or sets the alpha storage option. Options other than TiffAlphaStorage.Unspecified are used when there are more than 3 SamplesPerPixel defined.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The alpha storage option. |

### isExtraSamplesPresent() {#isExtraSamplesPresent}
```java
public boolean isExtraSamplesPresent()
```

Gets a value indicating whether the extra samples is present.

**Returns:** boolean - true if the extra samples is present; otherwise, false .

### getFillOrder() {#getFillOrder}
```java
public int getFillOrder()
```

Gets or sets the byte bits fill order.

**Returns:** int - The byte bits fill order.

### setFillOrder(int value) {#setFillOrder-int}
```java
public void setFillOrder(int value)
```

Gets or sets the byte bits fill order.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The byte bits fill order. |

### getHalfToneHints() {#getHalfToneHints}
```java
public int[] getHalfToneHints()
```

Gets or sets the halftone hints.

**Returns:** int[] - The halftone hints.

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;Halftone hints array length must be equal to 2.

### setHalfToneHints(int[] value) {#setHalfToneHints-int:A}
```java
public void setHalfToneHints(int[] value)
```

Gets or sets the halftone hints.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int[] | The halftone hints. |

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;Halftone hints array length must be equal to 2.

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

### getInkNames() {#getInkNames}
```java
public String getInkNames()
```

Gets or sets the ink names.

**Returns:** String - The ink names.

### setInkNames(String value) {#setInkNames-java.lang.String}
```java
public void setInkNames(String value)
```

Gets or sets the ink names.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The ink names. |

### getScannerManufacturer() {#getScannerManufacturer}
```java
public String getScannerManufacturer()
```

Gets or sets the scanner manufacturer.

**Returns:** String - The scanner manufacturer.

### setScannerManufacturer(String value) {#setScannerManufacturer-java.lang.String}
```java
public void setScannerManufacturer(String value)
```

Gets or sets the scanner manufacturer.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The scanner manufacturer. |

### getMaxSampleValue() {#getMaxSampleValue}
```java
public int[] getMaxSampleValue()
```

Gets or sets the max sample value.

**Returns:** int[] - The max sample value.

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;The array length must correspond to the samples per pixel count.

### setMaxSampleValue(int[] value) {#setMaxSampleValue-int:A}
```java
public void setMaxSampleValue(int[] value)
```

Gets or sets the max sample value.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int[] | The max sample value. |

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;The array length must correspond to the samples per pixel count.

### getMinSampleValue() {#getMinSampleValue}
```java
public int[] getMinSampleValue()
```

Gets or sets the min sample value.

**Returns:** int[] - The min sample value.

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;The array length must correspond to the samples per pixel count.

### setMinSampleValue(int[] value) {#setMinSampleValue-int:A}
```java
public void setMinSampleValue(int[] value)
```

Gets or sets the min sample value.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int[] | The min sample value. |

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;The array length must correspond to the samples per pixel count.

### getScannerModel() {#getScannerModel}
```java
public String getScannerModel()
```

Gets or sets the scanner model.

**Returns:** String - The scanner model.

### setScannerModel(String value) {#setScannerModel-java.lang.String}
```java
public void setScannerModel(String value)
```

Gets or sets the scanner model.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The scanner model. |

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

### getPageName() {#getPageName}
```java
public String getPageName()
```

Gets or sets the page name.

**Returns:** String - The page name.

### setPageName(String value) {#setPageName-java.lang.String}
```java
public void setPageName(String value)
```

Gets or sets the page name.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The page name. |

### getPageNumber() {#getPageNumber}
```java
public int[] getPageNumber()
```

Gets or sets the page number tag.

**Returns:** int[] - The page number tag.

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;Expected 2 values in the array: PageNumber[0] is the page number and PageNumber[1] is the total number of pages in the document.

### setPageNumber(int[] value) {#setPageNumber-int:A}
```java
public void setPageNumber(int[] value)
```

Gets or sets the page number tag.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int[] | The page number tag. |

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;Expected 2 values in the array: PageNumber[0] is the page number and PageNumber[1] is the total number of pages in the document.

### getPhotometric() {#getPhotometric}
```java
public int getPhotometric()
```

Gets or sets the photometric.

**Returns:** int - The photometric.

### setPhotometric(int value) {#setPhotometric-int}
```java
public void setPhotometric(int value)
```

Gets or sets the photometric.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The photometric. |

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

### getRowsPerStrip() {#getRowsPerStrip}
```java
public long getRowsPerStrip()
```

Gets or sets the rows per strip.

**Returns:** long - The rows per strip.

### setRowsPerStrip(long value) {#setRowsPerStrip-long}
```java
public void setRowsPerStrip(long value)
```

Gets or sets the rows per strip.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | long | The rows per strip. |

### getSampleFormat() {#getSampleFormat}
```java
public int[] getSampleFormat()
```

Gets or sets the sample format.

**Returns:** int[] - The sample format.

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;The array length must correspond to the samples per pixel count.

### setSampleFormat(int[] value) {#setSampleFormat-int:A}
```java
public void setSampleFormat(int[] value)
```

Gets or sets the sample format.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int[] | The sample format. |

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;The array length must correspond to the samples per pixel count.

### getSamplesPerPixel() {#getSamplesPerPixel}
```java
public int getSamplesPerPixel()
```

Gets the samples per pixel. To change this property value use the BitsPerSample property setter.

**Returns:** int - The samples per pixel.

### getSmaxSampleValue() {#getSmaxSampleValue}
```java
public long[] getSmaxSampleValue()
```

Gets or sets the max sample value. The value has a field type which best matches the sample data (Byte, Short or Long type).

**Returns:** long[] - The max sample value.

### setSmaxSampleValue(long[] value) {#setSmaxSampleValue-long:A}
```java
public void setSmaxSampleValue(long[] value)
```

Gets or sets the max sample value. The value has a field type which best matches the sample data (Byte, Short or Long type).

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | long[] | The max sample value. |

### getSminSampleValue() {#getSminSampleValue}
```java
public long[] getSminSampleValue()
```

Gets or sets the min sample value. The value has a field type which best matches the sample data (Byte, Short or Long type).

**Returns:** long[] - The min sample value.

### setSminSampleValue(long[] value) {#setSminSampleValue-long:A}
```java
public void setSminSampleValue(long[] value)
```

Gets or sets the min sample value. The value has a field type which best matches the sample data (Byte, Short or Long type).

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | long[] | The min sample value. |

### getSoftwareType() {#getSoftwareType}
```java
public String getSoftwareType()
```

Gets or sets the software type.

**Returns:** String - The software type.

### setSoftwareType(String value) {#setSoftwareType-java.lang.String}
```java
public void setSoftwareType(String value)
```

Gets or sets the software type.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The software type. |

### getStripByteCounts() {#getStripByteCounts}
```java
public long[] getStripByteCounts()
```

Gets or sets the strip byte counts.

**Returns:** long[] - The strip byte counts.

### setStripByteCounts(long[] value) {#setStripByteCounts-long:A}
```java
public void setStripByteCounts(long[] value)
```

Gets or sets the strip byte counts.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | long[] | The strip byte counts. |

### getStripOffsets() {#getStripOffsets}
```java
public long[] getStripOffsets()
```

Gets or sets the strip offsets.

**Returns:** long[] - The strip offsets.

### setStripOffsets(long[] value) {#setStripOffsets-long:A}
```java
public void setStripOffsets(long[] value)
```

Gets or sets the strip offsets.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | long[] | The strip offsets. |

### getSubFileType() {#getSubFileType}
```java
public long getSubFileType()
```

Gets or sets a general indication of the kind of data contained in this subfile.

**Returns:** long - The general indication of the kind of data contained in this subfile.

### setSubFileType(long value) {#setSubFileType-long}
```java
public void setSubFileType(long value)
```

Gets or sets a general indication of the kind of data contained in this subfile.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | long | The general indication of the kind of data contained in this subfile. |

### getTargetPrinter() {#getTargetPrinter}
```java
public String getTargetPrinter()
```

Gets or sets the target printer.

**Returns:** String - The target printer.

### setTargetPrinter(String value) {#setTargetPrinter-java.lang.String}
```java
public void setTargetPrinter(String value)
```

Gets or sets the target printer.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The target printer. |

### getThreshholding() {#getThreshholding}
```java
public int getThreshholding()
```

Gets or sets the threshholding.

**Returns:** int - The threshholding.

### setThreshholding(int value) {#setThreshholding-int}
```java
public void setThreshholding(int value)
```

Gets or sets the threshholding.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The threshholding. |

### getTotalPages() {#getTotalPages}
```java
public int getTotalPages()
```

Gets the total pages.

**Returns:** int - The total pages.

### getXposition() {#getXposition}
```java
public com.aspose.cad.fileformats.tiff.TiffRational getXposition()
```

Gets or sets the x position.

**Returns:** com.aspose.cad.fileformats.tiff.TiffRational - The x position.

### setXposition(com.aspose.cad.fileformats.tiff.TiffRational value) {#setXposition-com.aspose.cad.fileformats.tiff.TiffRational}
```java
public void setXposition(com.aspose.cad.fileformats.tiff.TiffRational value)
```

Gets or sets the x position.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.fileformats.tiff.TiffRational | The x position. |

### getResolutionSettings() {#getResolutionSettings}
```java
public com.aspose.cad.ResolutionSetting getResolutionSettings()
```

Gets or sets the resolution settings.

**Returns:** com.aspose.cad.ResolutionSetting

### setResolutionSettings(com.aspose.cad.ResolutionSetting value) {#setResolutionSettings-com.aspose.cad.ResolutionSetting}
```java
public void setResolutionSettings(com.aspose.cad.ResolutionSetting value)
```

Gets or sets the resolution settings.

### getXresolution() {#getXresolution}
```java
public com.aspose.cad.fileformats.tiff.TiffRational getXresolution()
```

Gets or sets the x resolution.

**Returns:** com.aspose.cad.fileformats.tiff.TiffRational - The x resolution.

### setXresolution(com.aspose.cad.fileformats.tiff.TiffRational value) {#setXresolution-com.aspose.cad.fileformats.tiff.TiffRational}
```java
public void setXresolution(com.aspose.cad.fileformats.tiff.TiffRational value)
```

Gets or sets the x resolution.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.fileformats.tiff.TiffRational | The x resolution. |

### getYposition() {#getYposition}
```java
public com.aspose.cad.fileformats.tiff.TiffRational getYposition()
```

Gets or sets the y position.

**Returns:** com.aspose.cad.fileformats.tiff.TiffRational - The y position.

### setYposition(com.aspose.cad.fileformats.tiff.TiffRational value) {#setYposition-com.aspose.cad.fileformats.tiff.TiffRational}
```java
public void setYposition(com.aspose.cad.fileformats.tiff.TiffRational value)
```

Gets or sets the y position.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.fileformats.tiff.TiffRational | The y position. |

### getYresolution() {#getYresolution}
```java
public com.aspose.cad.fileformats.tiff.TiffRational getYresolution()
```

Gets or sets the y resolution.

**Returns:** com.aspose.cad.fileformats.tiff.TiffRational - The y resolution.

### setYresolution(com.aspose.cad.fileformats.tiff.TiffRational value) {#setYresolution-com.aspose.cad.fileformats.tiff.TiffRational}
```java
public void setYresolution(com.aspose.cad.fileformats.tiff.TiffRational value)
```

Gets or sets the y resolution.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.fileformats.tiff.TiffRational | The y resolution. |

### getFaxT4Options() {#getFaxT4Options}
```java
public long getFaxT4Options()
```

Gets or sets the fax t4 options.

**Returns:** long - The fax t4 options.

### setFaxT4Options(long value) {#setFaxT4Options-long}
```java
public void setFaxT4Options(long value)
```

Gets or sets the fax t4 options.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | long | The fax t4 options. |

### getPredictor() {#getPredictor}
```java
public int getPredictor()
```

Gets or sets the predictor for LZW compression.

**Returns:** int - The predictor type.

### setPredictor(int value) {#setPredictor-int}
```java
public void setPredictor(int value)
```

Gets or sets the predictor for LZW compression.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The predictor type. |

### getImageLength() {#getImageLength}
```java
public long getImageLength()
```

Gets or sets the image length.

**Returns:** long - The image length.

### setImageLength(long value) {#setImageLength-long}
```java
public void setImageLength(long value)
```

Gets or sets the image length.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | long | The image length. |

### getImageWidth() {#getImageWidth}
```java
public long getImageWidth()
```

Gets or sets the image width.

**Returns:** long - The image width.

### setImageWidth(long value) {#setImageWidth-long}
```java
public void setImageWidth(long value)
```

Gets or sets the image width.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | long | The image width. |

### getTags() {#getTags}
```java
public com.aspose.cad.fileformats.tiff.TiffDataType[] getTags()
```

Gets or sets the tags.

**Returns:** com.aspose.cad.fileformats.tiff.TiffDataType[] - The tags.

### setTags(com.aspose.cad.fileformats.tiff.TiffDataType[] value) {#setTags-com.aspose.cad.fileformats.tiff.TiffDataType:A}
```java
public void setTags(com.aspose.cad.fileformats.tiff.TiffDataType[] value)
```

Gets or sets the tags.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.fileformats.tiff.TiffDataType[] | The tags. |

### getValidTagCount() {#getValidTagCount}
```java
public int getValidTagCount()
```

Gets the valid tag count. This is not the total tags count but the number of tags which may be preserved.

**Returns:** int - The valid tag count.

### getBitsPerPixel() {#getBitsPerPixel}
```java
public int getBitsPerPixel()
```

Gets the bits per pixel.

**Returns:** int - The bits per pixel.

### getValidTagsCount(com.aspose.cad.fileformats.tiff.TiffDataType[] tags) {#getValidTagsCount-com.aspose.cad.fileformats.tiff.TiffDataType:A}
```java
public static int getValidTagsCount(com.aspose.cad.fileformats.tiff.TiffDataType[] tags)
```

Gets the valid tags count.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| tags | com.aspose.cad.fileformats.tiff.TiffDataType[] | The tags to validate_internalized. |

**Returns:** int - The valid tags count.

### removeTag(int tag) {#removeTag-int}
```java
public boolean removeTag(int tag)
```

Removes the tag.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| tag | int | The tag to remove. |

**Returns:** boolean - true if successfully removed

### validate() {#validate}
```java
public void validate()
```

Validates if options have valid combination of tags

### addTags(com.aspose.cad.fileformats.tiff.TiffDataType[] tagsToAdd) {#addTags-com.aspose.cad.fileformats.tiff.TiffDataType:A}
```java
public void addTags(com.aspose.cad.fileformats.tiff.TiffDataType[] tagsToAdd)
```

Adds the tags.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| tagsToAdd | com.aspose.cad.fileformats.tiff.TiffDataType[] | The tags to add. |

### addTag(com.aspose.cad.fileformats.tiff.TiffDataType tagToAdd) {#addTag-com.aspose.cad.fileformats.tiff.TiffDataType}
```java
public void addTag(com.aspose.cad.fileformats.tiff.TiffDataType tagToAdd)
```

Adds a new tag.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| tagToAdd | com.aspose.cad.fileformats.tiff.TiffDataType | The tag to add. |

### getTagByType(int tagKey) {#getTagByType-int}
```java
public com.aspose.cad.fileformats.tiff.TiffDataType getTagByType(int tagKey)
```

Gets the instance of the tag by type.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| tagKey | int | The tag key. |

**Returns:** com.aspose.cad.fileformats.tiff.TiffDataType - Instance of the tag if exists_internalized or null otherwise.

