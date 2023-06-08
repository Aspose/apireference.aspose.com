---
title: Class TiffASCIIType
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Tiff.TiffTagTypes.TiffASCIIType class. The tiff ascii type
type: docs
weight: 34860
url: /net/aspose.cad.fileformats.tiff.tifftagtypes/tiffasciitype/
---
## TiffASCIIType class

The tiff ascii type.

```csharp
public sealed class TiffASCIIType : TiffDataType
```

## Constructors

| Name | Description |
| --- | --- |
| [TiffASCIIType](tiffasciitype/#constructor)(TiffTags) | Initializes a new instance of the `TiffASCIIType` class. |
| [TiffASCIIType](tiffasciitype/#constructor_1)(ushort) | Initializes a new instance of the `TiffASCIIType` class. |

## Properties

| Name | Description |
| --- | --- |
| [AlignedDataSize](../../aspose.cad.fileformats.tiff/tiffdatatype/aligneddatasize/) { get; } | Gets the additional data size in bytes (in case the 12 bytes is not enough to fit the tag data). |
| override [Count](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffasciitype/count/) { get; } | Gets the count of elements. |
| override [DataSize](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffasciitype/datasize/) { get; } | Gets the additional data size in bytes (in case the 12 bytes is not enough to fit the tag data). |
| [Id](../../aspose.cad.fileformats.tiff/tiffdatatype/id/) { get; } | Gets tag id integer representation. |
| [IsValid](../../aspose.cad.fileformats.tiff/tiffdatatype/isvalid/) { get; } | Gets a value indicating whether tag data is valid. The valid tag contains data which may be preserved. The invalid tag cannot be stored. |
| [TagId](../../aspose.cad.fileformats.tiff/tiffdatatype/tagid/) { get; } | Gets the tag id. |
| override [TagType](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffasciitype/tagtype/) { get; } | Gets the tag type. |
| [Text](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffasciitype/text/) { get; set; } | Gets or sets the text. |
| override [Value](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffasciitype/value/) { get; set; } | Gets or sets the value this data type contains. |

## Methods

| Name | Description |
| --- | --- |
| [CompareTo](../../aspose.cad.fileformats.tiff/tiffdatatype/compareto/)(object) | Compares the current instance with another object of the same type and returns an integer that indicates whether the current instance precedes, follows, or occurs in the same position in the sort order as the other object. |
| virtual [DeepClone](../../aspose.cad.fileformats.tiff/tiffdatatype/deepclone/)() | Performs a deep clone of this instance. |
| override [ToString](../../aspose.cad.fileformats.tiff/tiffdatatype/tostring/)() | Returns a String that represents this instance. |
| override [WriteAdditionalData](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffasciitype/writeadditionaldata/)(TiffStreamWriter) | Writes the additional tag data. |
| [WriteTag](../../aspose.cad.fileformats.tiff/tiffdatatype/writetag/)(TiffStreamWriter, long) | Writes the tag data. |

### See Also

* class [TiffDataType](../../aspose.cad.fileformats.tiff/tiffdatatype/)
* namespace [Aspose.CAD.FileFormats.Tiff.TiffTagTypes](../../aspose.cad.fileformats.tiff.tifftagtypes/)
* assembly [Aspose.CAD](../../)


