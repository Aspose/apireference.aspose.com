---
title: Class TiffOptions
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.ImageOptions.TiffOptions class. The tiff file format options. Note that width and height tags will get overwritten on image creation by width and height parameters so there is no need to specify them directly. Note that many options return a default value but that does not mean that this option is set explicitly as a tag value. To verify the tag is present use Tags property or the corresponding IsTagPresent method
type: docs
weight: 35900
url: /net/aspose.cad.imageoptions/tiffoptions/
---
## TiffOptions class

The tiff file format options. Note that width and height tags will get overwritten on image creation by width and height parameters so there is no need to specify them directly. Note that many options return a default value but that does not mean that this option is set explicitly as a tag value. To verify the tag is present use Tags property or the corresponding IsTagPresent method.

```csharp
public class TiffOptions : ImageOptionsBase
```

## Constructors

| Name | Description |
| --- | --- |
| [TiffOptions](tiffoptions/#constructor)() | Initializes a new instance of the `TiffOptions` class. By default little endian convention is used. No compression. Rgb profile |
| [TiffOptions](tiffoptions/#constructor_3)(TiffDataType[]) | Initializes a new instance of the `TiffOptions` class. |
| [TiffOptions](tiffoptions/#constructor_1)(TiffExpectedFormat) | Initializes a new instance of the `TiffOptions` class. By default little endian convention is used. |
| [TiffOptions](tiffoptions/#constructor_4)(TiffOptions) | Initializes a new instance of the `TiffOptions` class. |
| [TiffOptions](tiffoptions/#constructor_2)(TiffExpectedFormat, TiffByteOrder) | Initializes a new instance of the `TiffOptions` class. |

## Properties

| Name | Description |
| --- | --- |
| [AlphaStorage](../../aspose.cad.imageoptions/tiffoptions/alphastorage/) { get; set; } | Gets or sets the alpha storage option. Options other than Unspecified are used when there are more than 3 [`SamplesPerPixel`](./samplesperpixel/) defined. |
| [Artist](../../aspose.cad.imageoptions/tiffoptions/artist/) { get; set; } | Gets or sets the artist. |
| [BitsPerPixel](../../aspose.cad.imageoptions/tiffoptions/bitsperpixel/) { get; } | Gets the bits per pixel. |
| [BitsPerSample](../../aspose.cad.imageoptions/tiffoptions/bitspersample/) { get; set; } | Gets or sets the bits per sample. |
| [ByteOrder](../../aspose.cad.imageoptions/tiffoptions/byteorder/) { get; set; } | Gets or sets a value indicating the tiff byte order. |
| [CancellationToken](../../aspose.cad/imageoptionsbase/cancellationtoken/) { get; set; } | Token that can be used to interrupt export operation |
| [ColorMap](../../aspose.cad.imageoptions/tiffoptions/colormap/) { get; set; } | Gets or sets the color map. |
| [Compression](../../aspose.cad.imageoptions/tiffoptions/compression/) { get; set; } | Gets or sets the compression. |
| [Copyright](../../aspose.cad.imageoptions/tiffoptions/copyright/) { get; set; } | Gets or sets the copyright. |
| [DateTime](../../aspose.cad.imageoptions/tiffoptions/datetime/) { get; set; } | Gets or sets the date and time. |
| [DocumentName](../../aspose.cad.imageoptions/tiffoptions/documentname/) { get; set; } | Gets or sets the name of the document. |
| [FaxT4Options](../../aspose.cad.imageoptions/tiffoptions/faxt4options/) { get; set; } | Gets or sets the fax t4 options. |
| [FillOrder](../../aspose.cad.imageoptions/tiffoptions/fillorder/) { get; set; } | Gets or sets the byte bits fill order. |
| [HalfToneHints](../../aspose.cad.imageoptions/tiffoptions/halftonehints/) { get; set; } | Gets or sets the halftone hints. |
| [IccProfile](../../aspose.cad.imageoptions/tiffoptions/iccprofile/) { get; } | Gets the icc profile stream. |
| [ImageDescription](../../aspose.cad.imageoptions/tiffoptions/imagedescription/) { get; set; } | Gets or sets the image description. |
| [ImageLength](../../aspose.cad.imageoptions/tiffoptions/imagelength/) { get; set; } | Gets or sets the image length. |
| [ImageWidth](../../aspose.cad.imageoptions/tiffoptions/imagewidth/) { get; set; } | Gets or sets the image width. |
| [InkNames](../../aspose.cad.imageoptions/tiffoptions/inknames/) { get; set; } | Gets or sets the ink names. |
| [IsExtraSamplesPresent](../../aspose.cad.imageoptions/tiffoptions/isextrasamplespresent/) { get; } | Gets a value indicating whether the extra samples is present. |
| [IsValid](../../aspose.cad.imageoptions/tiffoptions/isvalid/) { get; } | Gets a value indicating whether the `TiffOptions` have been properly configured. Use Validate method as to find the failure reason. |
| [Layers](../../aspose.cad/imageoptionsbase/layers/) { get; set; } | Gets or sets a of layer names must be exported. All data will be exported without layers if names is not sets. |
| [MaxSampleValue](../../aspose.cad.imageoptions/tiffoptions/maxsamplevalue/) { get; set; } | Gets or sets the max sample value. |
| [MinSampleValue](../../aspose.cad.imageoptions/tiffoptions/minsamplevalue/) { get; set; } | Gets or sets the min sample value. |
| [Orientation](../../aspose.cad.imageoptions/tiffoptions/orientation/) { get; set; } | Gets or sets the orientation. |
| [PageName](../../aspose.cad.imageoptions/tiffoptions/pagename/) { get; set; } | Gets or sets the page name. |
| [PageNumber](../../aspose.cad.imageoptions/tiffoptions/pagenumber/) { get; set; } | Gets or sets the page number tag. |
| override [Palette](../../aspose.cad.imageoptions/tiffoptions/palette/) { get; set; } | Gets or sets the color palette. |
| [Pc3File](../../aspose.cad/imageoptionsbase/pc3file/) { get; set; } | Gets or sets the PC3 file full name. |
| [Photometric](../../aspose.cad.imageoptions/tiffoptions/photometric/) { get; set; } | Gets or sets the photometric. |
| [PlanarConfiguration](../../aspose.cad.imageoptions/tiffoptions/planarconfiguration/) { get; set; } | Gets or sets the planar configuration. |
| [Predictor](../../aspose.cad.imageoptions/tiffoptions/predictor/) { get; set; } | Gets or sets the predictor for LZW compression. |
| override [ResolutionSettings](../../aspose.cad.imageoptions/tiffoptions/resolutionsettings/) { get; set; } | Gets or sets the resolution settings. |
| [ResolutionUnit](../../aspose.cad.imageoptions/tiffoptions/resolutionunit/) { get; set; } | Gets or sets the resolution unit. |
| [Rotation](../../aspose.cad/imageoptionsbase/rotation/) { get; set; } | Gets or sets the parameter for rotate, flip, or rotate and flip the image.. |
| [RowsPerStrip](../../aspose.cad.imageoptions/tiffoptions/rowsperstrip/) { get; set; } | Gets or sets the rows per strip. |
| [SampleFormat](../../aspose.cad.imageoptions/tiffoptions/sampleformat/) { get; set; } | Gets or sets the sample format. |
| [SamplesPerPixel](../../aspose.cad.imageoptions/tiffoptions/samplesperpixel/) { get; } | Gets the samples per pixel. To change this property value use the [`BitsPerSample`](./bitspersample/) property setter. |
| [ScannerManufacturer](../../aspose.cad.imageoptions/tiffoptions/scannermanufacturer/) { get; set; } | Gets or sets the scanner manufacturer. |
| [ScannerModel](../../aspose.cad.imageoptions/tiffoptions/scannermodel/) { get; set; } | Gets or sets the scanner model. |
| [SmaxSampleValue](../../aspose.cad.imageoptions/tiffoptions/smaxsamplevalue/) { get; set; } | Gets or sets the max sample value. The value has a field type which best matches the sample data (Byte, Short or Long type). |
| [SminSampleValue](../../aspose.cad.imageoptions/tiffoptions/sminsamplevalue/) { get; set; } | Gets or sets the min sample value. The value has a field type which best matches the sample data (Byte, Short or Long type). |
| [SoftwareType](../../aspose.cad.imageoptions/tiffoptions/softwaretype/) { get; set; } | Gets or sets the software type. |
| [Source](../../aspose.cad/imageoptionsbase/source/) { get; set; } | Gets or sets the source to create image in. |
| [StripByteCounts](../../aspose.cad.imageoptions/tiffoptions/stripbytecounts/) { get; set; } | Gets or sets the strip byte counts. |
| [StripOffsets](../../aspose.cad.imageoptions/tiffoptions/stripoffsets/) { get; set; } | Gets or sets the strip offsets. |
| [SubFileType](../../aspose.cad.imageoptions/tiffoptions/subfiletype/) { get; set; } | Gets or sets a general indication of the kind of data contained in this subfile. |
| [Tags](../../aspose.cad.imageoptions/tiffoptions/tags/) { get; set; } | Gets or sets the tags. |
| override [TargetFormat](../../aspose.cad.imageoptions/tiffoptions/targetformat/) { get; } |  |
| [TargetPrinter](../../aspose.cad.imageoptions/tiffoptions/targetprinter/) { get; set; } | Gets or sets the target printer. |
| [Threshholding](../../aspose.cad.imageoptions/tiffoptions/threshholding/) { get; set; } | Gets or sets the threshholding. |
| [Timeout](../../aspose.cad/imageoptionsbase/timeout/) { get; set; } | Timeout value for export operation (in milliseconds) |
| [TotalPages](../../aspose.cad.imageoptions/tiffoptions/totalpages/) { get; } | Gets the total pages. |
| [UserWatermarkColor](../../aspose.cad/imageoptionsbase/userwatermarkcolor/) { get; set; } | Color for user-generated watermark |
| [UserWatermarkText](../../aspose.cad/imageoptionsbase/userwatermarktext/) { get; set; } | Text for user-generated watermark |
| [ValidTagCount](../../aspose.cad.imageoptions/tiffoptions/validtagcount/) { get; } | Gets the valid tag count. This is not the total tags count but the number of tags which may be preserved. |
| [VectorRasterizationOptions](../../aspose.cad/imageoptionsbase/vectorrasterizationoptions/) { get; set; } | Gets or sets the vector rasterization options. |
| override [XmpData](../../aspose.cad.imageoptions/tiffoptions/xmpdata/) { get; set; } | Gets or sets the XMP metadata container. |
| [Xposition](../../aspose.cad.imageoptions/tiffoptions/xposition/) { get; set; } | Gets or sets the x position. |
| [Xresolution](../../aspose.cad.imageoptions/tiffoptions/xresolution/) { get; set; } | Gets or sets the x resolution. |
| [Yposition](../../aspose.cad.imageoptions/tiffoptions/yposition/) { get; set; } | Gets or sets the y position. |
| [Yresolution](../../aspose.cad.imageoptions/tiffoptions/yresolution/) { get; set; } | Gets or sets the y resolution. |

## Methods

| Name | Description |
| --- | --- |
| [AddTag](../../aspose.cad.imageoptions/tiffoptions/addtag/)(TiffDataType) | Adds a new tag. |
| [AddTags](../../aspose.cad.imageoptions/tiffoptions/addtags/)(TiffDataType[]) | Adds the tags. |
| [GetTagByType](../../aspose.cad.imageoptions/tiffoptions/gettagbytype/)(TiffTags) | Gets the instance of the tag by type. |
| [IsTagPresent](../../aspose.cad.imageoptions/tiffoptions/istagpresent/)(TiffTags) | Determines whether tag is present in the options or not. |
| [RemoveTag](../../aspose.cad.imageoptions/tiffoptions/removetag/)(TiffTags) | Removes the tag. |
| [Validate](../../aspose.cad.imageoptions/tiffoptions/validate/)() | Validates if options have valid combination of tags |
| static [GetValidTagsCount](../../aspose.cad.imageoptions/tiffoptions/getvalidtagscount/)(TiffDataType[]) | Gets the valid tags count. |

### See Also

* class [ImageOptionsBase](../../aspose.cad/imageoptionsbase/)
* namespace [Aspose.CAD.ImageOptions](../../aspose.cad.imageoptions/)
* assembly [Aspose.CAD](../../)


