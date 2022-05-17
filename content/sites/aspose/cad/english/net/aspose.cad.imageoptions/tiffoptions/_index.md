---
title: TiffOptions
second_title: Aspose.CAD for .NET API Reference
description: 
type: docs
weight: 29790
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
| [TiffOptions](tiffoptions)(TiffDataType[]) | Initializes a new instance of the [`TiffOptions`](../tiffoptions) class. |
| [TiffOptions](tiffoptions)(TiffExpectedFormat) | Initializes a new instance of the [`TiffOptions`](../tiffoptions) class. By default little endian convention is used. |
| [TiffOptions](tiffoptions)(TiffOptions) | Initializes a new instance of the [`TiffOptions`](../tiffoptions) class. |
| [TiffOptions](tiffoptions)(TiffExpectedFormat, TiffByteOrder) | Initializes a new instance of the [`TiffOptions`](../tiffoptions) class. |

## Properties

| Name | Description |
| --- | --- |
| [AlphaStorage](alphastorage) { get; set; } | Gets or sets the alpha storage option. Options other than Unspecified are used when there are more than 3 [`SamplesPerPixel`](./samplesperpixel) defined. |
| [Artist](artist) { get; set; } | Gets or sets the artist. |
| [BitsPerPixel](bitsperpixel) { get; } | Gets the bits per pixel. |
| [BitsPerSample](bitspersample) { get; set; } | Gets or sets the bits per sample. |
| [ByteOrder](byteorder) { get; set; } | Gets or sets a value indicating the tiff byte order. |
| [ColorMap](colormap) { get; set; } | Gets or sets the color map. |
| [Compression](compression) { get; set; } | Gets or sets the compression. |
| [Copyright](copyright) { get; set; } | Gets or sets the copyright. |
| [DateTime](datetime) { get; set; } | Gets or sets the date and time. |
| [DocumentName](documentname) { get; set; } | Gets or sets the name of the document. |
| [FaxT4Options](faxt4options) { get; set; } | Gets or sets the fax t4 options. |
| [FillOrder](fillorder) { get; set; } | Gets or sets the byte bits fill order. |
| [HalfToneHints](halftonehints) { get; set; } | Gets or sets the halftone hints. |
| [IccProfile](iccprofile) { get; } | Gets the icc profile stream. |
| [ImageDescription](imagedescription) { get; set; } | Gets or sets the image description. |
| [ImageLength](imagelength) { get; set; } | Gets or sets the image length. |
| [ImageWidth](imagewidth) { get; set; } | Gets or sets the image width. |
| [InkNames](inknames) { get; set; } | Gets or sets the ink names. |
| [IsExtraSamplesPresent](isextrasamplespresent) { get; } | Gets a value indicating whether the extra samples is present. |
| [IsValid](isvalid) { get; } | Gets a value indicating whether the [`TiffOptions`](../tiffoptions) have been properly configured. Use Validate method as to find the failure reason. |
| [MaxSampleValue](maxsamplevalue) { get; set; } | Gets or sets the max sample value. |
| [MinSampleValue](minsamplevalue) { get; set; } | Gets or sets the min sample value. |
| [Orientation](orientation) { get; set; } | Gets or sets the orientation. |
| [PageName](pagename) { get; set; } | Gets or sets the page name. |
| [PageNumber](pagenumber) { get; set; } | Gets or sets the page number tag. |
| override [Palette](palette) { get; set; } | Gets or sets the color palette. |
| [Photometric](photometric) { get; set; } | Gets or sets the photometric. |
| [PlanarConfiguration](planarconfiguration) { get; set; } | Gets or sets the planar configuration. |
| [Predictor](predictor) { get; set; } | Gets or sets the predictor for LZW compression. |
| override [ResolutionSettings](resolutionsettings) { get; set; } | Gets or sets the resolution settings. |
| [ResolutionUnit](resolutionunit) { get; set; } | Gets or sets the resolution unit. |
| [RowsPerStrip](rowsperstrip) { get; set; } | Gets or sets the rows per strip. |
| [SampleFormat](sampleformat) { get; set; } | Gets or sets the sample format. |
| [SamplesPerPixel](samplesperpixel) { get; } | Gets the samples per pixel. To change this property value use the [`BitsPerSample`](./bitspersample) property setter. |
| [ScannerManufacturer](scannermanufacturer) { get; set; } | Gets or sets the scanner manufacturer. |
| [ScannerModel](scannermodel) { get; set; } | Gets or sets the scanner model. |
| [SmaxSampleValue](smaxsamplevalue) { get; set; } | Gets or sets the max sample value. The value has a field type which best matches the sample data (Byte, Short or Long type). |
| [SminSampleValue](sminsamplevalue) { get; set; } | Gets or sets the min sample value. The value has a field type which best matches the sample data (Byte, Short or Long type). |
| [SoftwareType](softwaretype) { get; set; } | Gets or sets the software type. |
| [StripByteCounts](stripbytecounts) { get; set; } | Gets or sets the strip byte counts. |
| [StripOffsets](stripoffsets) { get; set; } | Gets or sets the strip offsets. |
| [SubFileType](subfiletype) { get; set; } | Gets or sets a general indication of the kind of data contained in this subfile. |
| [Tags](tags) { get; set; } | Gets or sets the tags. |
| [TargetPrinter](targetprinter) { get; set; } | Gets or sets the target printer. |
| [Threshholding](threshholding) { get; set; } | Gets or sets the threshholding. |
| [TotalPages](totalpages) { get; } | Gets the total pages. |
| [ValidTagCount](validtagcount) { get; } | Gets the valid tag count. This is not the total tags count but the number of tags which may be preserved. |
| override [XmpData](xmpdata) { get; set; } | Gets or sets the XMP metadata container. |
| [Xposition](xposition) { get; set; } | Gets or sets the x position. |
| [Xresolution](xresolution) { get; set; } | Gets or sets the x resolution. |
| [Yposition](yposition) { get; set; } | Gets or sets the y position. |
| [Yresolution](yresolution) { get; set; } | Gets or sets the y resolution. |

## Methods

| Name | Description |
| --- | --- |
| [AddTag](addtag)(TiffDataType) | Adds a new tag. |
| [AddTags](addtags)(TiffDataType[]) | Adds the tags. |
| [GetTagByType](gettagbytype)(TiffTags) | Gets the instance of the tag by type. |
| [IsTagPresent](istagpresent)(TiffTags) | Determines whether tag is present in the options or not. |
| [RemoveTag](removetag)(TiffTags) | Removes the tag. |
| [Validate](validate)() | Validates if options have valid combination of tags |
| static [GetValidTagsCount](getvalidtagscount)(TiffDataType[]) | Gets the valid tags count. |

### See Also

* class [ImageOptionsBase](../../aspose.cad/imageoptionsbase)
* namespace [Aspose.CAD.ImageOptions](../../aspose.cad.imageoptions)
* assembly [Aspose.CAD](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.CAD.dll -->
