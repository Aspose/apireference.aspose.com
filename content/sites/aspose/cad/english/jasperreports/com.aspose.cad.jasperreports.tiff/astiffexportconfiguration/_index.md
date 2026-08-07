---
title: "ASTiffExportConfiguration"
linktitle: "ASTiffExportConfiguration"
second_title: "Aspose.CAD for JasperReports"
description: "The TIFF file format export configuration."
type: docs
weight: 10
url: /jasperreports/com.aspose.cad.jasperreports.tiff/astiffexportconfiguration/
---

**Inheritance:** java.lang.Object, ImageExportConfiguration

The TIFF file format export configuration.

## Methods

| Method | Description |
| --- | --- |
| [getFileStandard()](#getFileStandard) | Gets or sets the TIFF file standard. |
| [getPremultiplyComponents()](#getPremultiplyComponents) | Gets or sets a value indicating whether components must be premultiplied. |
| [getYCbCrSubsampling()](#getYCbCrSubsampling) | Gets or sets the subsampling factors for YCbCr photometric. |
| [getYCbCrCoefficients()](#getYCbCrCoefficients) | Gets or sets the YCbCrCoefficients. |
| [getArtist()](#getArtist) | Gets or sets the artist. |
| [getByteOrder()](#getByteOrder) | Gets or sets a value indicating the tiff byte order. |
| [getIccProfile()](#getIccProfile) | Gets the icc profile stream. |
| [getBitsPerSample()](#getBitsPerSample) | Gets the bits per sample. |
| [getExtraSamples()](#getExtraSamples) | Gets the extra samples values. |
| [getCompression()](#getCompression) | Gets the compression. |
| [getCopyright()](#getCopyright) | Gets the copyright. |
| [getColorMap()](#getColorMap) | Gets or sets the color map. |
| [getPalette()](#getPalette) | Gets or sets the color palette. |
| [getDateTime()](#getDateTime) | Gets or sets the date and time. |
| [getDocumentName()](#getDocumentName) | Gets or sets the name of the document. |
| [getAlphaStorage()](#getAlphaStorage) | Gets or sets the alpha storage option. Options other than TiffAlphaStorage.Unspecified are used when there are more than 3 SamplesPerPixel defined. |
| [isExtraSamplesPresent()](#isExtraSamplesPresent) | Gets a value indicating whether the extra samples is present. |
| [getFillOrder()](#getFillOrder) | Gets or sets the byte bits fill order. |
| [getHalfToneHints()](#getHalfToneHints) | Gets or sets the halftone hints. |
| [getImageDescription()](#getImageDescription) | Gets or sets the image description. |
| [getInkNames()](#getInkNames) |  |
| [getScannerManufacturer()](#getScannerManufacturer) | Gets or sets the scanner manufacturer. |
| [getMaxSampleValue()](#getMaxSampleValue) | Gets or sets the max sample value. |
| [getMinSampleValue()](#getMinSampleValue) | Gets or sets the min sample value. |
| [getScannerModel()](#getScannerModel) | Gets or sets the scanner model. |
| [getOrientation()](#getOrientation) | Gets or sets the orientation. |
| [getPageName()](#getPageName) | Gets or sets the page name. |
| [getPageNumber()](#getPageNumber) | Gets or sets the page number tag. |
| [getPhotometric()](#getPhotometric) | Gets or sets the photometric. |
| [getPlanarConfiguration()](#getPlanarConfiguration) | Gets or sets the planar configuration. |
| [getResolutionUnit()](#getResolutionUnit) | Gets or sets the resolution unit. |
| [getRowsPerStrip()](#getRowsPerStrip) | Gets or sets the rows per strip. |
| [getTileWidth()](#getTileWidth) | Gets ot sets tile width. |
| [getTileLength()](#getTileLength) | Gets ot sets tile length. |
| [getSampleFormat()](#getSampleFormat) | Gets or sets the sample format. |
| [getSamplesPerPixel()](#getSamplesPerPixel) | Gets the samples per pixel. To change this property value use the BitsPerSample property setter. |
| [getSmaxSampleValue()](#getSmaxSampleValue) | Gets or sets the max sample value. The value has a field type which best matches the sample data (Byte, Short or Long type). |
| [getSminSampleValue()](#getSminSampleValue) | Gets or sets the min sample value. The value has a field type which best matches the sample data (Byte, Short or Long type). |
| [getSoftwareType()](#getSoftwareType) | Gets or sets the software type. |
| [getStripByteCounts()](#getStripByteCounts) | Gets or sets the strip byte counts. |
| [getStripOffsets()](#getStripOffsets) | Gets or sets the strip offsets. |
| [getTileByteCounts()](#getTileByteCounts) | Gets or sets the tile byte counts. |
| [getTileOffsets()](#getTileOffsets) | Gets or sets the tile offsets. |
| [getSubFileType()](#getSubFileType) | Gets or sets a general indication of the kind of data contained in this subfile. |
| [getTargetPrinter()](#getTargetPrinter) | Gets or sets the target printer. |
| [getThreshholding()](#getThreshholding) | Gets or sets the threshholding. |
| [getTotalPages()](#getTotalPages) | Gets the total pages. |
| [getXposition()](#getXposition) | Gets or sets the x position. |
| [getResolutionSettings()](#getResolutionSettings) | Gets or sets the resolution settings. |
| [getXresolution()](#getXresolution) | Gets or sets the x resolution. |
| [getYposition()](#getYposition) | Gets or sets the y position. |
| [getYresolution()](#getYresolution) | Gets or sets the y resolution. |
| [getFaxT4Options()](#getFaxT4Options) | Gets or sets the fax t4 options. |
| [getPredictor()](#getPredictor) | Gets or sets the predictor for LZW compression. |
| [getImageLength()](#getImageLength) | Gets or sets the image length. |
| [getImageWidth()](#getImageWidth) | Gets or sets the image width. |
| [getExifIfd()](#getExifIfd) | Gets or sets the pointer to EXIF IFD. |
| [getTags()](#getTags) | Gets or sets the tags. |
| [getValidTagCount()](#getValidTagCount) | Gets the valid tag count. This is not the total tags count but the number of tags which may be preserved. |
| [getBitsPerPixel()](#getBitsPerPixel) | Gets the bits per pixel. |
| [getTagByType(TiffTagsEnum tagKey)](#getTagByType-com.aspose.cad.jasperreports.tiff.enums.TiffTagsEnum) | Gets the instance of the tag by type. |
| [getExpectedFormat()](#getExpectedFormat) |  |

### getFileStandard() {#getFileStandard}
```java
TiffFileStandardsEnum getFileStandard()
```

Gets or sets the TIFF file standard.

**Returns:** TiffFileStandardsEnum - The TIFF file standard.

### getPremultiplyComponents() {#getPremultiplyComponents}
```java
boolean getPremultiplyComponents()
```

Gets or sets a value indicating whether components must be premultiplied.

**Returns:** boolean - true if components must be premultiplied; otherwise, false .

### getYCbCrSubsampling() {#getYCbCrSubsampling}
```java
int[] getYCbCrSubsampling()
```

Gets or sets the subsampling factors for YCbCr photometric.

**Returns:** int[] - The subsampling factors for YCbCr photometric.

**Throws:**

- `com.aspose.cad.cadexceptions.imageformats.TiffImageException` - Invalid field length. YCbCrSubsampling field must contain two values.
- `com.aspose.ms.System.ArgumentNullException` - value

### getYCbCrCoefficients() {#getYCbCrCoefficients}
```java
com.aspose.cad.fileformats.tiff.TiffRational[] getYCbCrCoefficients()
```

Gets or sets the YCbCrCoefficients.

**Returns:** com.aspose.cad.fileformats.tiff.TiffRational[] - The YCbCrCoefficients.

**Throws:**

- `com.aspose.cad.cadexceptions.imageformats.TiffImageException` - Invalid count of rational coefficient values. Must be equal to 3.
- `com.aspose.ms.System.ArgumentNullException` - value

### getArtist() {#getArtist}
```java
String getArtist()
```

Gets or sets the artist.

**Returns:** String - The artist.

### getByteOrder() {#getByteOrder}
```java
TiffByteOrderEnum getByteOrder()
```

Gets or sets a value indicating the tiff byte order.

**Returns:** TiffByteOrderEnum

### getIccProfile() {#getIccProfile}
```java
byte[] getIccProfile()
```

Gets the icc profile stream.

**Returns:** byte[] - The icc profile.

### getBitsPerSample() {#getBitsPerSample}
```java
int[] getBitsPerSample()
```

Gets the bits per sample.

**Returns:** int[] - The bits per sample value. When setting this value keep in mind that it will also set SamplesPerPixel value to array length. These 2 properties are very tightly coupled so may be set alltogether only.

### getExtraSamples() {#getExtraSamples}
```java
int[] getExtraSamples()
```

Gets the extra samples values.

**Returns:** int[] - The extra samples value.

### getCompression() {#getCompression}
```java
TiffCompressionsEnum getCompression()
```

Gets the compression.

**Returns:** TiffCompressionsEnum - The compression.

### getCopyright() {#getCopyright}
```java
String getCopyright()
```

Gets the copyright.

**Returns:** String - The copyright.

### getColorMap() {#getColorMap}
```java
int[] getColorMap()
```

Gets or sets the color map.

**Returns:** int[] - The color map.

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.cad.cadexceptions.imageformats.TiffImageException` - The color map may be defined for samples per pixel equal to 1 only. or The bits per sample are not defined.
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;The array length must correspond to the followign formula: 3 * (2**BitsPerSample).

### getPalette() {#getPalette}
```java
com.aspose.cad.IColorPalette getPalette()
```

Gets or sets the color palette.

**Returns:** com.aspose.cad.IColorPalette - The color palette.

### getDateTime() {#getDateTime}
```java
String getDateTime()
```

Gets or sets the date and time.

**Returns:** String - The date and time.

### getDocumentName() {#getDocumentName}
```java
String getDocumentName()
```

Gets or sets the name of the document.

**Returns:** String - The name of the document.

### getAlphaStorage() {#getAlphaStorage}
```java
TiffAlphaStorageEnum getAlphaStorage()
```

Gets or sets the alpha storage option. Options other than TiffAlphaStorage.Unspecified are used when there are more than 3 SamplesPerPixel defined.

**Returns:** TiffAlphaStorageEnum - The alpha storage option.

### isExtraSamplesPresent() {#isExtraSamplesPresent}
```java
boolean isExtraSamplesPresent()
```

Gets a value indicating whether the extra samples is present.

**Returns:** boolean - true if the extra samples is present; otherwise, false .

### getFillOrder() {#getFillOrder}
```java
TiffFillOrdersEnum getFillOrder()
```

Gets or sets the byte bits fill order.

**Returns:** TiffFillOrdersEnum - The byte bits fill order.

### getHalfToneHints() {#getHalfToneHints}
```java
int[] getHalfToneHints()
```

Gets or sets the halftone hints.

**Returns:** int[] - The halftone hints.

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;Halftone hints array length must be equal to 2.

### getImageDescription() {#getImageDescription}
```java
String getImageDescription()
```

Gets or sets the image description.

**Returns:** String - The image description.

### getInkNames() {#getInkNames}
```java
String getInkNames()
```

**Returns:** String

### getScannerManufacturer() {#getScannerManufacturer}
```java
String getScannerManufacturer()
```

Gets or sets the scanner manufacturer.

**Returns:** String - The scanner manufacturer.

### getMaxSampleValue() {#getMaxSampleValue}
```java
int[] getMaxSampleValue()
```

Gets or sets the max sample value.

**Returns:** int[] - The max sample value.

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;The array length must correspond to the samples per pixel count.

### getMinSampleValue() {#getMinSampleValue}
```java
int[] getMinSampleValue()
```

Gets or sets the min sample value.

**Returns:** int[] - The min sample value.

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;The array length must correspond to the samples per pixel count.

### getScannerModel() {#getScannerModel}
```java
String getScannerModel()
```

Gets or sets the scanner model.

**Returns:** String - The scanner model.

### getOrientation() {#getOrientation}
```java
TiffOrientationsEnum getOrientation()
```

Gets or sets the orientation.

**Returns:** TiffOrientationsEnum - The orientation.

### getPageName() {#getPageName}
```java
String getPageName()
```

Gets or sets the page name.

**Returns:** String - The page name.

### getPageNumber() {#getPageNumber}
```java
int[] getPageNumber()
```

Gets or sets the page number tag.

**Returns:** int[] - The page number tag.

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;Expected 2 values in the array: PageNumber[0] is the page number and PageNumber[1] is the total number of pages in the document.

### getPhotometric() {#getPhotometric}
```java
TiffPhotometricsEnum getPhotometric()
```

Gets or sets the photometric.

**Returns:** TiffPhotometricsEnum - The photometric.

### getPlanarConfiguration() {#getPlanarConfiguration}
```java
TiffPlanarConfigsEnum getPlanarConfiguration()
```

Gets or sets the planar configuration.

**Returns:** TiffPlanarConfigsEnum - The planar configuration.

### getResolutionUnit() {#getResolutionUnit}
```java
TiffResolutionUnitsEnum getResolutionUnit()
```

Gets or sets the resolution unit.

**Returns:** TiffResolutionUnitsEnum - The resolution unit.

### getRowsPerStrip() {#getRowsPerStrip}
```java
long getRowsPerStrip()
```

Gets or sets the rows per strip.

**Returns:** long - The rows per strip.

### getTileWidth() {#getTileWidth}
```java
long getTileWidth()
```

Gets ot sets tile width.

**Returns:** long

### getTileLength() {#getTileLength}
```java
long getTileLength()
```

Gets ot sets tile length.

**Returns:** long

### getSampleFormat() {#getSampleFormat}
```java
TiffSampleFormatsEnum[] getSampleFormat()
```

Gets or sets the sample format.

**Returns:** TiffSampleFormatsEnum[] - The sample format.

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - value
- `com.aspose.ms.System.ArgumentOutOfRangeException` - value;The array length must correspond to the samples per pixel count.

### getSamplesPerPixel() {#getSamplesPerPixel}
```java
int getSamplesPerPixel()
```

Gets the samples per pixel. To change this property value use the BitsPerSample property setter.

**Returns:** int - The samples per pixel.

### getSmaxSampleValue() {#getSmaxSampleValue}
```java
long[] getSmaxSampleValue()
```

Gets or sets the max sample value. The value has a field type which best matches the sample data (Byte, Short or Long type).

**Returns:** long[] - The max sample value.

### getSminSampleValue() {#getSminSampleValue}
```java
long[] getSminSampleValue()
```

Gets or sets the min sample value. The value has a field type which best matches the sample data (Byte, Short or Long type).

**Returns:** long[] - The min sample value.

### getSoftwareType() {#getSoftwareType}
```java
String getSoftwareType()
```

Gets or sets the software type.

**Returns:** String - The software type.

### getStripByteCounts() {#getStripByteCounts}
```java
long[] getStripByteCounts()
```

Gets or sets the strip byte counts.

**Returns:** long[] - The strip byte counts.

### getStripOffsets() {#getStripOffsets}
```java
long[] getStripOffsets()
```

Gets or sets the strip offsets.

**Returns:** long[] - The strip offsets.

### getTileByteCounts() {#getTileByteCounts}
```java
long[] getTileByteCounts()
```

Gets or sets the tile byte counts.

**Returns:** long[]

### getTileOffsets() {#getTileOffsets}
```java
long[] getTileOffsets()
```

Gets or sets the tile offsets.

**Returns:** long[]

### getSubFileType() {#getSubFileType}
```java
TiffNewSubFileTypesEnum getSubFileType()
```

Gets or sets a general indication of the kind of data contained in this subfile.

**Returns:** TiffNewSubFileTypesEnum - The general indication of the kind of data contained in this subfile.

### getTargetPrinter() {#getTargetPrinter}
```java
String getTargetPrinter()
```

Gets or sets the target printer.

**Returns:** String - The target printer.

### getThreshholding() {#getThreshholding}
```java
TiffThresholdsEnum getThreshholding()
```

Gets or sets the threshholding.

**Returns:** TiffThresholdsEnum - The threshholding.

### getTotalPages() {#getTotalPages}
```java
int getTotalPages()
```

Gets the total pages.

**Returns:** int - The total pages.

### getXposition() {#getXposition}
```java
com.aspose.cad.fileformats.tiff.TiffRational getXposition()
```

Gets or sets the x position.

**Returns:** com.aspose.cad.fileformats.tiff.TiffRational - The x position.

### getResolutionSettings() {#getResolutionSettings}
```java
com.aspose.cad.ResolutionSetting getResolutionSettings()
```

Gets or sets the resolution settings.

**Returns:** com.aspose.cad.ResolutionSetting

### getXresolution() {#getXresolution}
```java
com.aspose.cad.fileformats.tiff.TiffRational getXresolution()
```

Gets or sets the x resolution.

**Returns:** com.aspose.cad.fileformats.tiff.TiffRational - The x resolution.

### getYposition() {#getYposition}
```java
com.aspose.cad.fileformats.tiff.TiffRational getYposition()
```

Gets or sets the y position.

**Returns:** com.aspose.cad.fileformats.tiff.TiffRational - The y position.

### getYresolution() {#getYresolution}
```java
com.aspose.cad.fileformats.tiff.TiffRational getYresolution()
```

Gets or sets the y resolution.

**Returns:** com.aspose.cad.fileformats.tiff.TiffRational - The y resolution.

### getFaxT4Options() {#getFaxT4Options}
```java
Group3OptionsEnum getFaxT4Options()
```

Gets or sets the fax t4 options.

**Returns:** Group3OptionsEnum - The fax t4 options.

### getPredictor() {#getPredictor}
```java
TiffPredictorEnum getPredictor()
```

Gets or sets the predictor for LZW compression.

**Returns:** TiffPredictorEnum - The predictor type.

### getImageLength() {#getImageLength}
```java
long getImageLength()
```

Gets or sets the image length.

**Returns:** long - The image length.

### getImageWidth() {#getImageWidth}
```java
long getImageWidth()
```

Gets or sets the image width.

**Returns:** long - The image width.

### getExifIfd() {#getExifIfd}
```java
com.aspose.cad.fileformats.tiff.TiffExifIfd getExifIfd()
```

Gets or sets the pointer to EXIF IFD.

**Returns:** com.aspose.cad.fileformats.tiff.TiffExifIfd - The pointer to EXIF IFD.

### getTags() {#getTags}
```java
com.aspose.cad.fileformats.tiff.TiffDataType[] getTags()
```

Gets or sets the tags.

**Returns:** com.aspose.cad.fileformats.tiff.TiffDataType[] - The tags.

### getValidTagCount() {#getValidTagCount}
```java
int getValidTagCount()
```

Gets the valid tag count. This is not the total tags count but the number of tags which may be preserved.

**Returns:** int - The valid tag count.

### getBitsPerPixel() {#getBitsPerPixel}
```java
int getBitsPerPixel()
```

Gets the bits per pixel.

**Returns:** int - The bits per pixel.

### getTagByType(TiffTagsEnum tagKey) {#getTagByType-com.aspose.cad.jasperreports.tiff.enums.TiffTagsEnum}
```java
com.aspose.cad.fileformats.tiff.TiffDataType getTagByType(TiffTagsEnum tagKey)
```

Gets the instance of the tag by type.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| tagKey | TiffTagsEnum | The tag key. |

**Returns:** com.aspose.cad.fileformats.tiff.TiffDataType - Instance of the tag if exists or null otherwise.

### getExpectedFormat() {#getExpectedFormat}
```java
TiffExpectedFormatEnum getExpectedFormat()
```

**Returns:** TiffExpectedFormatEnum

