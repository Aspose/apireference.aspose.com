---
title: "ASTiffExportConfigurationImpl"
linktitle: "ASTiffExportConfigurationImpl"
second_title: "Aspose.CAD for JasperReports"
description: "The TIFF file format export configuration."
type: docs
weight: 10
url: /jasperreports/com.aspose.cad.jasperreports.tiff/astiffexportconfigurationimpl/
---

**Inheritance:** java.lang.Object, ImageExportConfigurationImpl

**All Implemented Interfaces:** ASTiffExportConfiguration

The TIFF file format export configuration.

## Constructors

| Constructor | Description |
| --- | --- |
| [ASTiffExportConfigurationImpl(TiffExpectedFormatEnum expectedFormat)](#ASTiffExportConfigurationImpl-com.aspose.cad.jasperreports.tiff.enums.TiffExpectedFormatEnum) | Initializes a new instance of the ASTiffExportConfigurationImpl class. By default little endian convention is used. |
| [ASTiffExportConfigurationImpl(TiffExpectedFormatEnum expectedFormat, TiffByteOrderEnum byteOrder)](#ASTiffExportConfigurationImpl-com.aspose.cad.jasperreports.tiff.enums.TiffExpectedFormatEnum-com.aspose.cad.jasperreports.tiff.enums.TiffByteOrderEnum) | Initializes a new instance of the ASTiffExportConfigurationImpl class. |

## Methods

| Method | Description |
| --- | --- |
| [getValidTagsCount(com.aspose.cad.fileformats.tiff.TiffDataType[] tags)](#getValidTagsCount-com.aspose.cad.fileformats.tiff.TiffDataType:A) | Gets the valid tags count. |
| [getFileStandard()](#getFileStandard) | Gets or sets the TIFF file standard. |
| [setFileStandard(TiffFileStandardsEnum value)](#setFileStandard-com.aspose.cad.jasperreports.tiff.enums.TiffFileStandardsEnum) | Gets or sets the TIFF file standard. |
| [getPremultiplyComponents()](#getPremultiplyComponents) | Gets or sets a value indicating whether components must be premultiplied. |
| [setPremultiplyComponents(boolean value)](#setPremultiplyComponents-boolean) | Gets or sets a value indicating whether components must be premultiplied. |
| [getYCbCrSubsampling()](#getYCbCrSubsampling) | Gets or sets the subsampling factors for YCbCr photometric. |
| [setYCbCrSubsampling(int[] value)](#setYCbCrSubsampling-int:A) | Gets or sets the subsampling factors for YCbCr photometric. |
| [getYCbCrCoefficients()](#getYCbCrCoefficients) | Gets or sets the YCbCrCoefficients. |
| [setYCbCrCoefficients(com.aspose.cad.fileformats.tiff.TiffRational[] value)](#setYCbCrCoefficients-com.aspose.cad.fileformats.tiff.TiffRational:A) | Gets or sets the YCbCrCoefficients. |
| [getArtist()](#getArtist) | Gets or sets the artist. |
| [setArtist(String value)](#setArtist-java.lang.String) | Gets or sets the artist. |
| [getByteOrder()](#getByteOrder) | Gets or sets a value indicating the tiff byte order. |
| [setByteOrder(TiffByteOrderEnum value)](#setByteOrder-com.aspose.cad.jasperreports.tiff.enums.TiffByteOrderEnum) | Gets or sets a value indicating the tiff byte order. |
| [getIccProfile()](#getIccProfile) | Gets the icc profile stream. |
| [setIccProfile(byte[] value)](#setIccProfile-byte:A) | Sets the icc profile stream. |
| [getBitsPerSample()](#getBitsPerSample) | Gets the bits per sample. |
| [setBitsPerSample(int[] value)](#setBitsPerSample-int:A) | Sets the bits per sample. |
| [getExtraSamples()](#getExtraSamples) | Gets the extra samples values. |
| [getCompression()](#getCompression) | Gets the compression. |
| [setCompression(TiffCompressionsEnum compression)](#setCompression-com.aspose.cad.jasperreports.tiff.enums.TiffCompressionsEnum) | Sets the compression. |
| [getCopyright()](#getCopyright) | Gets the copyright. |
| [setCopyright(String value)](#setCopyright-java.lang.String) | Sets the copyright. |
| [getColorMap()](#getColorMap) | Gets or sets the color map. |
| [setColorMap(int[] value)](#setColorMap-int:A) | Gets or sets the color map. |
| [getPalette()](#getPalette) | Gets or sets the color palette. |
| [setPalette(com.aspose.cad.IColorPalette value)](#setPalette-com.aspose.cad.IColorPalette) | Gets or sets the color palette. |
| [getDateTime()](#getDateTime) | Gets or sets the date and time. |
| [setDateTime(String value)](#setDateTime-java.lang.String) | Gets or sets the date and time. |
| [getDocumentName()](#getDocumentName) | Gets or sets the name of the document. |
| [setDocumentName(String value)](#setDocumentName-java.lang.String) | Gets or sets the name of the document. |
| [getAlphaStorage()](#getAlphaStorage) | Gets or sets the alpha storage option. Options other than TiffAlphaStorageEnum.Unspecified are used when there are more than 3 SamplesPerPixel defined. |
| [setAlphaStorage(TiffAlphaStorageEnum alphaStorage)](#setAlphaStorage-com.aspose.cad.jasperreports.tiff.enums.TiffAlphaStorageEnum) | Gets or sets the alpha storage option. Options other than TiffAlphaStorage.Unspecified are used when there are more than 3 SamplesPerPixel defined. |
| [isExtraSamplesPresent()](#isExtraSamplesPresent) | Gets a value indicating whether the extra samples is present. |
| [getFillOrder()](#getFillOrder) | Gets or sets the byte bits fill order. |
| [setFillOrder(TiffFillOrdersEnum fillOrder)](#setFillOrder-com.aspose.cad.jasperreports.tiff.enums.TiffFillOrdersEnum) | Gets or sets the byte bits fill order. |
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
| [setOrientation(TiffOrientationsEnum orientation)](#setOrientation-com.aspose.cad.jasperreports.tiff.enums.TiffOrientationsEnum) | Gets or sets the orientation. |
| [getPageName()](#getPageName) | Gets or sets the page name. |
| [setPageName(String value)](#setPageName-java.lang.String) | Gets or sets the page name. |
| [getPageNumber()](#getPageNumber) | Gets or sets the page number tag. |
| [setPageNumber(int[] value)](#setPageNumber-int:A) | Gets or sets the page number tag. |
| [getPhotometric()](#getPhotometric) | Gets or sets the photometric. |
| [setPhotometric(TiffPhotometricsEnum photometric)](#setPhotometric-com.aspose.cad.jasperreports.tiff.enums.TiffPhotometricsEnum) | Gets or sets the photometric. |
| [getPlanarConfiguration()](#getPlanarConfiguration) | Gets or sets the planar configuration. |
| [setPlanarConfiguration(TiffPlanarConfigsEnum planarConfiguration)](#setPlanarConfiguration-com.aspose.cad.jasperreports.tiff.enums.TiffPlanarConfigsEnum) | Gets or sets the planar configuration. |
| [getResolutionUnit()](#getResolutionUnit) | Gets or sets the resolution unit. |
| [setResolutionUnit(TiffResolutionUnitsEnum resolutionUnitsEnum)](#setResolutionUnit-com.aspose.cad.jasperreports.tiff.enums.TiffResolutionUnitsEnum) | Gets or sets the resolution unit. |
| [getRowsPerStrip()](#getRowsPerStrip) | Gets or sets the rows per strip. |
| [setRowsPerStrip(long value)](#setRowsPerStrip-long) | Gets or sets the rows per strip. |
| [getTileWidth()](#getTileWidth) | Gets ot sets tile width. |
| [setTileWidth(long value)](#setTileWidth-long) | Gets ot sets tile width. |
| [getTileLength()](#getTileLength) | Gets ot sets tile length. |
| [setTileLength(long value)](#setTileLength-long) | Gets ot sets tile length. |
| [getSampleFormat()](#getSampleFormat) | Gets or sets the sample format. |
| [setSampleFormat(TiffSampleFormatsEnum[] sampleFormats)](#setSampleFormat-com.aspose.cad.jasperreports.tiff.enums.TiffSampleFormatsEnum:A) | Gets or sets the sample format. |
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
| [getTileByteCounts()](#getTileByteCounts) | Gets or sets the tile byte counts. |
| [setTileByteCounts(long[] value)](#setTileByteCounts-long:A) | Gets or sets the tile byte counts. |
| [getTileOffsets()](#getTileOffsets) | Gets or sets the tile offsets. |
| [setTileOffsets(long[] value)](#setTileOffsets-long:A) | Gets or sets the tile offsets. |
| [getSubFileType()](#getSubFileType) | Gets or sets a general indication of the kind of data contained in this subfile. |
| [setSubFileType(TiffNewSubFileTypesEnum subFileType)](#setSubFileType-com.aspose.cad.jasperreports.tiff.enums.TiffNewSubFileTypesEnum) | Gets or sets a general indication of the kind of data contained in this subfile. |
| [getTargetPrinter()](#getTargetPrinter) | Gets or sets the target printer. |
| [setTargetPrinter(String value)](#setTargetPrinter-java.lang.String) | Gets or sets the target printer. |
| [getThreshholding()](#getThreshholding) | Gets or sets the threshholding. |
| [setThreshholding(TiffThresholdsEnum threshholding)](#setThreshholding-com.aspose.cad.jasperreports.tiff.enums.TiffThresholdsEnum) | Gets or sets the threshholding. |
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
| [setFaxT4Options(Group3OptionsEnum value)](#setFaxT4Options-com.aspose.cad.jasperreports.tiff.enums.Group3OptionsEnum) | Gets or sets the fax t4 options. |
| [getPredictor()](#getPredictor) | Gets or sets the predictor for LZW compression. |
| [setPredictor(TiffPredictorEnum predictor)](#setPredictor-com.aspose.cad.jasperreports.tiff.enums.TiffPredictorEnum) | Gets or sets the predictor for LZW compression. |
| [getImageLength()](#getImageLength) | Gets or sets the image length. |
| [setImageLength(long value)](#setImageLength-long) | Gets or sets the image length. |
| [getImageWidth()](#getImageWidth) | Gets or sets the image width. |
| [setImageWidth(long value)](#setImageWidth-long) | Gets or sets the image width. |
| [getExifIfd()](#getExifIfd) | Gets or sets the pointer to EXIF IFD. |
| [getTags()](#getTags) | Gets or sets the tags. |
| [setTags(com.aspose.cad.fileformats.tiff.TiffDataType[] value)](#setTags-com.aspose.cad.fileformats.tiff.TiffDataType:A) | Gets or sets the tags. |
| [getValidTagCount()](#getValidTagCount) | Gets the valid tag count. This is not the total tags count but the number of tags which may be preserved. |
| [getBitsPerPixel()](#getBitsPerPixel) | Gets the bits per pixel. |
| [removeTag(int tag)](#removeTag-int) | Removes the tag. |
| [removeTag(TiffTagsEnum tag)](#removeTag-com.aspose.cad.jasperreports.tiff.enums.TiffTagsEnum) |  |
| [addTags(com.aspose.cad.fileformats.tiff.TiffDataType[] tagsToAdd)](#addTags-com.aspose.cad.fileformats.tiff.TiffDataType:A) | Adds the tags. |
| [addTag(com.aspose.cad.fileformats.tiff.TiffDataType tagToAdd)](#addTag-com.aspose.cad.fileformats.tiff.TiffDataType) | Adds a new tag. |
| [getTagByType(TiffTagsEnum tagKey)](#getTagByType-com.aspose.cad.jasperreports.tiff.enums.TiffTagsEnum) | Gets the instance of the tag by type. |
| [getExpectedFormat()](#getExpectedFormat) | Gets expected tiff file format. |
| [setExpectedFormat(TiffExpectedFormatEnum expectedFormat)](#setExpectedFormat-com.aspose.cad.jasperreports.tiff.enums.TiffExpectedFormatEnum) | Gets expected tiff file format. |

### ASTiffExportConfigurationImpl(TiffExpectedFormatEnum expectedFormat) {#ASTiffExportConfigurationImpl-com.aspose.cad.jasperreports.tiff.enums.TiffExpectedFormatEnum}
```java
public ASTiffExportConfigurationImpl(TiffExpectedFormatEnum expectedFormat)
```

Initializes a new instance of the ASTiffExportConfigurationImpl class. By default little endian convention is used.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| expectedFormat | TiffExpectedFormatEnum | The expected tiff file format. |

### ASTiffExportConfigurationImpl(TiffExpectedFormatEnum expectedFormat, TiffByteOrderEnum byteOrder) {#ASTiffExportConfigurationImpl-com.aspose.cad.jasperreports.tiff.enums.TiffExpectedFormatEnum-com.aspose.cad.jasperreports.tiff.enums.TiffByteOrderEnum}
```java
public ASTiffExportConfigurationImpl(TiffExpectedFormatEnum expectedFormat, TiffByteOrderEnum byteOrder)
```

Initializes a new instance of the ASTiffExportConfigurationImpl class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| expectedFormat | TiffExpectedFormatEnum | The expected tiff file format. |
| byteOrder | TiffByteOrderEnum | The tiff file format byte order to use. |

### getValidTagsCount(com.aspose.cad.fileformats.tiff.TiffDataType[] tags) {#getValidTagsCount-com.aspose.cad.fileformats.tiff.TiffDataType:A}
```java
public static int getValidTagsCount(com.aspose.cad.fileformats.tiff.TiffDataType[] tags)
```

Gets the valid tags count.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| tags | com.aspose.cad.fileformats.tiff.TiffDataType[] | The tags to validate. |

**Returns:** int - The valid tags count.

### getFileStandard() {#getFileStandard}
```java
public TiffFileStandardsEnum getFileStandard()
```

Gets or sets the TIFF file standard.

**Returns:** TiffFileStandardsEnum - The TIFF file standard.

### setFileStandard(TiffFileStandardsEnum value) {#setFileStandard-com.aspose.cad.jasperreports.tiff.enums.TiffFileStandardsEnum}
```java
public void setFileStandard(TiffFileStandardsEnum value)
```

Gets or sets the TIFF file standard.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | TiffFileStandardsEnum | The TIFF file standard. |

### getPremultiplyComponents() {#getPremultiplyComponents}
```java
public boolean getPremultiplyComponents()
```

Gets or sets a value indicating whether components must be premultiplied.

**Returns:** boolean - true if components must be premultiplied; otherwise, false .

### setPremultiplyComponents(boolean value) {#setPremultiplyComponents-boolean}
```java
public void setPremultiplyComponents(boolean value)
```

Gets or sets a value indicating whether components must be premultiplied.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | true if components must be premultiplied; otherwise, false . |

### getYCbCrSubsampling() {#getYCbCrSubsampling}
```java
public int[] getYCbCrSubsampling()
```

Gets or sets the subsampling factors for YCbCr photometric.

**Returns:** int[] - The subsampling factors for YCbCr photometric.

**Throws:**

- `com.aspose.cad.cadexceptions.imageformats.TiffImageException` - Invalid field length. YCbCrSubsampling field must contain two values.
- `com.aspose.ms.System.ArgumentNullException` - value

### setYCbCrSubsampling(int[] value) {#setYCbCrSubsampling-int:A}
```java
public void setYCbCrSubsampling(int[] value)
```

Gets or sets the subsampling factors for YCbCr photometric.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int[] | The subsampling factors for YCbCr photometric. |

**Throws:**

- `com.aspose.cad.cadexceptions.imageformats.TiffImageException` - Invalid field length. YCbCrSubsampling field must contain two values.
- `com.aspose.ms.System.ArgumentNullException` - value

### getYCbCrCoefficients() {#getYCbCrCoefficients}
```java
public com.aspose.cad.fileformats.tiff.TiffRational[] getYCbCrCoefficients()
```

Gets or sets the YCbCrCoefficients.

**Returns:** com.aspose.cad.fileformats.tiff.TiffRational[] - The YCbCrCoefficients.

**Throws:**

- `com.aspose.cad.cadexceptions.imageformats.TiffImageException` - Invalid count of rational coefficient values. Must be equal to 3.
- `com.aspose.ms.System.ArgumentNullException` - value

### setYCbCrCoefficients(com.aspose.cad.fileformats.tiff.TiffRational[] value) {#setYCbCrCoefficients-com.aspose.cad.fileformats.tiff.TiffRational:A}
```java
public void setYCbCrCoefficients(com.aspose.cad.fileformats.tiff.TiffRational[] value)
```

Gets or sets the YCbCrCoefficients.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.fileformats.tiff.TiffRational[] | The YCbCrCoefficients. |

**Throws:**

- `com.aspose.cad.cadexceptions.imageformats.TiffImageException` - Invalid count of rational coefficient values. Must be equal to 3.
- `com.aspose.ms.System.ArgumentNullException` - value

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

### getByteOrder() {#getByteOrder}
```java
public TiffByteOrderEnum getByteOrder()
```

Gets or sets a value indicating the tiff byte order.

**Returns:** TiffByteOrderEnum

### setByteOrder(TiffByteOrderEnum value) {#setByteOrder-com.aspose.cad.jasperreports.tiff.enums.TiffByteOrderEnum}
```java
public void setByteOrder(TiffByteOrderEnum value)
```

Gets or sets a value indicating the tiff byte order.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | TiffByteOrderEnum |  |

### getIccProfile() {#getIccProfile}
```java
public byte[] getIccProfile()
```

Gets the icc profile stream.

**Returns:** byte[] - The icc profile.

### setIccProfile(byte[] value) {#setIccProfile-byte:A}
```java
public void setIccProfile(byte[] value)
```

Sets the icc profile stream.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | byte[] | The icc profile. |

### getBitsPerSample() {#getBitsPerSample}
```java
public int[] getBitsPerSample()
```

Gets the bits per sample.

**Returns:** int[] - The bits per sample value. When setting this value keep in mind that it will also set SamplesPerPixel value to array length. These 2 properties are very tightly coupled so may be set alltogether only.

### setBitsPerSample(int[] value) {#setBitsPerSample-int:A}
```java
public void setBitsPerSample(int[] value)
```

Sets the bits per sample.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int[] | The bits per sample value. When setting this value keep in mind that it will also set SamplesPerPixel value to array length. These 2 properties are very tightly coupled so may be set alltogether only. |

### getExtraSamples() {#getExtraSamples}
```java
public int[] getExtraSamples()
```

Gets the extra samples values.

**Returns:** int[] - The extra samples value.

### getCompression() {#getCompression}
```java
public TiffCompressionsEnum getCompression()
```

Gets the compression.

**Returns:** TiffCompressionsEnum - The compression.

### setCompression(TiffCompressionsEnum compression) {#setCompression-com.aspose.cad.jasperreports.tiff.enums.TiffCompressionsEnum}
```java
public void setCompression(TiffCompressionsEnum compression)
```

Sets the compression.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| compression | TiffCompressionsEnum | The compression. |

### getCopyright() {#getCopyright}
```java
public String getCopyright()
```

Gets the copyright.

**Returns:** String - The copyright.

### setCopyright(String value) {#setCopyright-java.lang.String}
```java
public void setCopyright(String value)
```

Sets the copyright.

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
public TiffAlphaStorageEnum getAlphaStorage()
```

Gets or sets the alpha storage option. Options other than TiffAlphaStorageEnum.Unspecified are used when there are more than 3 SamplesPerPixel defined.

**Returns:** TiffAlphaStorageEnum - The alpha storage option.

### setAlphaStorage(TiffAlphaStorageEnum alphaStorage) {#setAlphaStorage-com.aspose.cad.jasperreports.tiff.enums.TiffAlphaStorageEnum}
```java
public void setAlphaStorage(TiffAlphaStorageEnum alphaStorage)
```

Gets or sets the alpha storage option. Options other than TiffAlphaStorage.Unspecified are used when there are more than 3 SamplesPerPixel defined.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| alphaStorage | TiffAlphaStorageEnum | The alpha storage option. |

### isExtraSamplesPresent() {#isExtraSamplesPresent}
```java
public boolean isExtraSamplesPresent()
```

Gets a value indicating whether the extra samples is present.

**Returns:** boolean - true if the extra samples is present; otherwise, false .

### getFillOrder() {#getFillOrder}
```java
public TiffFillOrdersEnum getFillOrder()
```

Gets or sets the byte bits fill order.

**Returns:** TiffFillOrdersEnum - The byte bits fill order.

### setFillOrder(TiffFillOrdersEnum fillOrder) {#setFillOrder-com.aspose.cad.jasperreports.tiff.enums.TiffFillOrdersEnum}
```java
public void setFillOrder(TiffFillOrdersEnum fillOrder)
```

Gets or sets the byte bits fill order.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| fillOrder | TiffFillOrdersEnum | The byte bits fill order. |

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
public TiffOrientationsEnum getOrientation()
```

Gets or sets the orientation.

**Returns:** TiffOrientationsEnum - The orientation.

### setOrientation(TiffOrientationsEnum orientation) {#setOrientation-com.aspose.cad.jasperreports.tiff.enums.TiffOrientationsEnum}
```java
public void setOrientation(TiffOrientationsEnum orientation)
```

Gets or sets the orientation.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| orientation | TiffOrientationsEnum | The orientation. |

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
public TiffPhotometricsEnum getPhotometric()
```

Gets or sets the photometric.

**Returns:** TiffPhotometricsEnum - The photometric.

### setPhotometric(TiffPhotometricsEnum photometric) {#setPhotometric-com.aspose.cad.jasperreports.tiff.enums.TiffPhotometricsEnum}
```java
public void setPhotometric(TiffPhotometricsEnum photometric)
```

Gets or sets the photometric.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| photometric | TiffPhotometricsEnum | The photometric. |

### getPlanarConfiguration() {#getPlanarConfiguration}
```java
public TiffPlanarConfigsEnum getPlanarConfiguration()
```

Gets or sets the planar configuration.

**Returns:** TiffPlanarConfigsEnum - The planar configuration.

### setPlanarConfiguration(TiffPlanarConfigsEnum planarConfiguration) {#setPlanarConfiguration-com.aspose.cad.jasperreports.tiff.enums.TiffPlanarConfigsEnum}
```java
public void setPlanarConfiguration(TiffPlanarConfigsEnum planarConfiguration)
```

Gets or sets the planar configuration.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| planarConfiguration | TiffPlanarConfigsEnum | The planar configuration. |

### getResolutionUnit() {#getResolutionUnit}
```java
public TiffResolutionUnitsEnum getResolutionUnit()
```

Gets or sets the resolution unit.

**Returns:** TiffResolutionUnitsEnum - The resolution unit.

### setResolutionUnit(TiffResolutionUnitsEnum resolutionUnitsEnum) {#setResolutionUnit-com.aspose.cad.jasperreports.tiff.enums.TiffResolutionUnitsEnum}
```java
public void setResolutionUnit(TiffResolutionUnitsEnum resolutionUnitsEnum)
```

Gets or sets the resolution unit.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| resolutionUnitsEnum | TiffResolutionUnitsEnum | The resolution unit. |

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

### getTileWidth() {#getTileWidth}
```java
public long getTileWidth()
```

Gets ot sets tile width.

**Returns:** long

### setTileWidth(long value) {#setTileWidth-long}
```java
public void setTileWidth(long value)
```

Gets ot sets tile width.

### getTileLength() {#getTileLength}
```java
public long getTileLength()
```

Gets ot sets tile length.

**Returns:** long

### setTileLength(long value) {#setTileLength-long}
```java
public void setTileLength(long value)
```

Gets ot sets tile length.

### getSampleFormat() {#getSampleFormat}
```java
public TiffSampleFormatsEnum[] getSampleFormat()
```

Gets or sets the sample format.

**Returns:** TiffSampleFormatsEnum[] - The sample format.

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;The array length must correspond to the samples per pixel count.

### setSampleFormat(TiffSampleFormatsEnum[] sampleFormats) {#setSampleFormat-com.aspose.cad.jasperreports.tiff.enums.TiffSampleFormatsEnum:A}
```java
public void setSampleFormat(TiffSampleFormatsEnum[] sampleFormats)
```

Gets or sets the sample format.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| sampleFormats | TiffSampleFormatsEnum[] | The sample format. |

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

### getTileByteCounts() {#getTileByteCounts}
```java
public long[] getTileByteCounts()
```

Gets or sets the tile byte counts.

**Returns:** long[]

### setTileByteCounts(long[] value) {#setTileByteCounts-long:A}
```java
public void setTileByteCounts(long[] value)
```

Gets or sets the tile byte counts.

### getTileOffsets() {#getTileOffsets}
```java
public long[] getTileOffsets()
```

Gets or sets the tile offsets.

**Returns:** long[]

### setTileOffsets(long[] value) {#setTileOffsets-long:A}
```java
public void setTileOffsets(long[] value)
```

Gets or sets the tile offsets.

### getSubFileType() {#getSubFileType}
```java
public TiffNewSubFileTypesEnum getSubFileType()
```

Gets or sets a general indication of the kind of data contained in this subfile.

**Returns:** TiffNewSubFileTypesEnum - The general indication of the kind of data contained in this subfile.

### setSubFileType(TiffNewSubFileTypesEnum subFileType) {#setSubFileType-com.aspose.cad.jasperreports.tiff.enums.TiffNewSubFileTypesEnum}
```java
public void setSubFileType(TiffNewSubFileTypesEnum subFileType)
```

Gets or sets a general indication of the kind of data contained in this subfile.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| subFileType | TiffNewSubFileTypesEnum | The general indication of the kind of data contained in this subfile. |

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
public TiffThresholdsEnum getThreshholding()
```

Gets or sets the threshholding.

**Returns:** TiffThresholdsEnum - The threshholding.

### setThreshholding(TiffThresholdsEnum threshholding) {#setThreshholding-com.aspose.cad.jasperreports.tiff.enums.TiffThresholdsEnum}
```java
public void setThreshholding(TiffThresholdsEnum threshholding)
```

Gets or sets the threshholding.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| threshholding | TiffThresholdsEnum | The threshholding. |

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
public Group3OptionsEnum getFaxT4Options()
```

Gets or sets the fax t4 options.

**Returns:** Group3OptionsEnum - The fax t4 options.

### setFaxT4Options(Group3OptionsEnum value) {#setFaxT4Options-com.aspose.cad.jasperreports.tiff.enums.Group3OptionsEnum}
```java
public void setFaxT4Options(Group3OptionsEnum value)
```

Gets or sets the fax t4 options.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | Group3OptionsEnum | The fax t4 options. |

### getPredictor() {#getPredictor}
```java
public TiffPredictorEnum getPredictor()
```

Gets or sets the predictor for LZW compression.

**Returns:** TiffPredictorEnum - The predictor type.

### setPredictor(TiffPredictorEnum predictor) {#setPredictor-com.aspose.cad.jasperreports.tiff.enums.TiffPredictorEnum}
```java
public void setPredictor(TiffPredictorEnum predictor)
```

Gets or sets the predictor for LZW compression.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| predictor | TiffPredictorEnum | The predictor type. |

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

### getExifIfd() {#getExifIfd}
```java
public com.aspose.cad.fileformats.tiff.TiffExifIfd getExifIfd()
```

Gets or sets the pointer to EXIF IFD.

**Returns:** com.aspose.cad.fileformats.tiff.TiffExifIfd - The pointer to EXIF IFD.

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

### removeTag(TiffTagsEnum tag) {#removeTag-com.aspose.cad.jasperreports.tiff.enums.TiffTagsEnum}
```java
public boolean removeTag(TiffTagsEnum tag)
```

**Returns:** boolean

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

### getTagByType(TiffTagsEnum tagKey) {#getTagByType-com.aspose.cad.jasperreports.tiff.enums.TiffTagsEnum}
```java
public com.aspose.cad.fileformats.tiff.TiffDataType getTagByType(TiffTagsEnum tagKey)
```

Gets the instance of the tag by type.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| tagKey | TiffTagsEnum | The tag key. |

**Returns:** com.aspose.cad.fileformats.tiff.TiffDataType - Instance of the tag if exists or null otherwise.

### getExpectedFormat() {#getExpectedFormat}
```java
public TiffExpectedFormatEnum getExpectedFormat()
```

Gets expected tiff file format.

**Returns:** TiffExpectedFormatEnum - expected tiff file format.

### setExpectedFormat(TiffExpectedFormatEnum expectedFormat) {#setExpectedFormat-com.aspose.cad.jasperreports.tiff.enums.TiffExpectedFormatEnum}
```java
public void setExpectedFormat(TiffExpectedFormatEnum expectedFormat)
```

Gets expected tiff file format.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| expectedFormat | TiffExpectedFormatEnum | Expected tiff file format.. |

