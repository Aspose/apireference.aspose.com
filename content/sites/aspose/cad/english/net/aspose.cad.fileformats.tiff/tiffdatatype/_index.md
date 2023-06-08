---
title: Class TiffDataType
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Tiff.TiffDataType class. The tiff data type
type: docs
weight: 34820
url: /net/aspose.cad.fileformats.tiff/tiffdatatype/
---
## TiffDataType class

The tiff data type.

```csharp
public abstract class TiffDataType : IComparable
```

## Properties

| Name | Description |
| --- | --- |
| [AlignedDataSize](../../aspose.cad.fileformats.tiff/tiffdatatype/aligneddatasize/) { get; } | Gets the additional data size in bytes (in case the 12 bytes is not enough to fit the tag data). |
| abstract [Count](../../aspose.cad.fileformats.tiff/tiffdatatype/count/) { get; } | Gets the count of elements. |
| abstract [DataSize](../../aspose.cad.fileformats.tiff/tiffdatatype/datasize/) { get; } | Gets the additional data size in bytes (in case the 12 bytes is not enough to fit the tag data). |
| [Id](../../aspose.cad.fileformats.tiff/tiffdatatype/id/) { get; } | Gets tag id integer representation. |
| [IsValid](../../aspose.cad.fileformats.tiff/tiffdatatype/isvalid/) { get; } | Gets a value indicating whether tag data is valid. The valid tag contains data which may be preserved. The invalid tag cannot be stored. |
| [TagId](../../aspose.cad.fileformats.tiff/tiffdatatype/tagid/) { get; } | Gets the tag id. |
| abstract [TagType](../../aspose.cad.fileformats.tiff/tiffdatatype/tagtype/) { get; } | Gets the tag type. |
| abstract [Value](../../aspose.cad.fileformats.tiff/tiffdatatype/value/) { get; set; } | Gets or sets the value this data type contains. |

## Methods

| Name | Description |
| --- | --- |
| static [ReadTag](../../aspose.cad.fileformats.tiff/tiffdatatype/readtag/)(TiffStreamReader, long) | Reads the tag data. |
| [CompareTo](../../aspose.cad.fileformats.tiff/tiffdatatype/compareto/)(object) | Compares the current instance with another object of the same type and returns an integer that indicates whether the current instance precedes, follows, or occurs in the same position in the sort order as the other object. |
| virtual [DeepClone](../../aspose.cad.fileformats.tiff/tiffdatatype/deepclone/)() | Performs a deep clone of this instance. |
| override [ToString](../../aspose.cad.fileformats.tiff/tiffdatatype/tostring/)() | Returns a String that represents this instance. |
| abstract [WriteAdditionalData](../../aspose.cad.fileformats.tiff/tiffdatatype/writeadditionaldata/)(TiffStreamWriter) | Writes the additional tag data. |
| [WriteTag](../../aspose.cad.fileformats.tiff/tiffdatatype/writetag/)(TiffStreamWriter, long) | Writes the tag data. |

### See Also

* namespace [Aspose.CAD.FileFormats.Tiff](../../aspose.cad.fileformats.tiff/)
* assembly [Aspose.CAD](../../)


