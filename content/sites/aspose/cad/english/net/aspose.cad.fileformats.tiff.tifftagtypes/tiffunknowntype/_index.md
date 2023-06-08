---
title: Class TiffUnknownType
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Tiff.TiffTagTypes.TiffUnknownType class. The unknown tiff type. In case the tiff tag cannot be recognized this type is instantinated
type: docs
weight: 35000
url: /net/aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/
---
## TiffUnknownType class

The unknown tiff type. In case the tiff tag cannot be recognized this type is instantinated.

```csharp
public sealed class TiffUnknownType : TiffDataType
```

## Constructors

| Name | Description |
| --- | --- |
| [TiffUnknownType](tiffunknowntype/)(TiffStreamReader, ushort, ushort, uint, uint) | Initializes a new instance of the `TiffUnknownType` class. |

## Properties

| Name | Description |
| --- | --- |
| [AlignedDataSize](../../aspose.cad.fileformats.tiff/tiffdatatype/aligneddatasize/) { get; } | Gets the additional data size in bytes (in case the 12 bytes is not enough to fit the tag data). |
| override [Count](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/count/) { get; } | Gets the count of elements. |
| override [DataSize](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/datasize/) { get; } | Gets the additional data size in bytes (in case the 12 bytes is not enough to fit the tag data). |
| [Id](../../aspose.cad.fileformats.tiff/tiffdatatype/id/) { get; } | Gets tag id integer representation. |
| [IsValid](../../aspose.cad.fileformats.tiff/tiffdatatype/isvalid/) { get; } | Gets a value indicating whether tag data is valid. The valid tag contains data which may be preserved. The invalid tag cannot be stored. |
| [OffsetOrValue](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/offsetorvalue/) { get; } | Gets the offset value for an additional data or value itself in case count is 1. |
| [Stream](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/stream/) { get; } | Gets the stream to read additional data from. |
| [TagId](../../aspose.cad.fileformats.tiff/tiffdatatype/tagid/) { get; } | Gets the tag id. |
| override [TagType](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/tagtype/) { get; } | Gets the tag type. |
| override [Value](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/value/) { get; set; } | Gets or sets the value this data type contains. |

## Methods

| Name | Description |
| --- | --- |
| [CompareTo](../../aspose.cad.fileformats.tiff/tiffdatatype/compareto/)(object) | Compares the current instance with another object of the same type and returns an integer that indicates whether the current instance precedes, follows, or occurs in the same position in the sort order as the other object. |
| virtual [DeepClone](../../aspose.cad.fileformats.tiff/tiffdatatype/deepclone/)() | Performs a deep clone of this instance. |
| override [ToString](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/tostring/)() | Returns a String that represents this instance. |
| override [WriteAdditionalData](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffunknowntype/writeadditionaldata/)(TiffStreamWriter) | Writes the additional tag data. |
| [WriteTag](../../aspose.cad.fileformats.tiff/tiffdatatype/writetag/)(TiffStreamWriter, long) | Writes the tag data. |

## Remarks

Note the `TiffUnknownType` is not serialized back to stream.

### See Also

* class [TiffDataType](../../aspose.cad.fileformats.tiff/tiffdatatype/)
* namespace [Aspose.CAD.FileFormats.Tiff.TiffTagTypes](../../aspose.cad.fileformats.tiff.tifftagtypes/)
* assembly [Aspose.CAD](../../)


