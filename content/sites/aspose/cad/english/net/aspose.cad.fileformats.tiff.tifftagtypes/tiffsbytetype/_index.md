---
title: Class TiffSByteType
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Tiff.TiffTagTypes.TiffSByteType class. The tiff signed byte type
type: docs
weight: 34940
url: /net/aspose.cad.fileformats.tiff.tifftagtypes/tiffsbytetype/
---
## TiffSByteType class

The tiff signed byte type.

```csharp
public sealed class TiffSByteType : TiffCommonArrayType
```

## Constructors

| Name | Description |
| --- | --- |
| [TiffSByteType](tiffsbytetype/#constructor)(TiffTags) | Initializes a new instance of the `TiffSByteType` class. |
| [TiffSByteType](tiffsbytetype/#constructor_1)(ushort) | Initializes a new instance of the `TiffSByteType` class. |

## Properties

| Name | Description |
| --- | --- |
| [AlignedDataSize](../../aspose.cad.fileformats.tiff/tiffdatatype/aligneddatasize/) { get; } | Gets the additional data size in bytes (in case the 12 bytes is not enough to fit the tag data). |
| [Count](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffcommonarraytype/count/) { get; } | Gets the count of elements. |
| [DataSize](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffcommonarraytype/datasize/) { get; } | Gets the additional data size in bytes (in case the 12 bytes is not enough to fit the tag data). |
| override [ElementSize](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffsbytetype/elementsize/) { get; } | Gets the element size in bytes. |
| [Id](../../aspose.cad.fileformats.tiff/tiffdatatype/id/) { get; } | Gets tag id integer representation. |
| [IsValid](../../aspose.cad.fileformats.tiff/tiffdatatype/isvalid/) { get; } | Gets a value indicating whether tag data is valid. The valid tag contains data which may be preserved. The invalid tag cannot be stored. |
| [TagId](../../aspose.cad.fileformats.tiff/tiffdatatype/tagid/) { get; } | Gets the tag id. |
| override [TagType](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffsbytetype/tagtype/) { get; } | Gets the tag type. |
| override [Value](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffsbytetype/value/) { get; set; } | Gets or sets the value this data type contains. |
| [Values](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffsbytetype/values/) { get; set; } | Gets or sets the values. |
| override [ValuesContainer](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffsbytetype/valuescontainer/) { get; } | Gets the values container. |

## Methods

| Name | Description |
| --- | --- |
| [CompareTo](../../aspose.cad.fileformats.tiff/tiffdatatype/compareto/)(object) | Compares the current instance with another object of the same type and returns an integer that indicates whether the current instance precedes, follows, or occurs in the same position in the sort order as the other object. |
| virtual [DeepClone](../../aspose.cad.fileformats.tiff/tiffdatatype/deepclone/)() | Performs a deep clone of this instance. |
| override [ToString](../../aspose.cad.fileformats.tiff/tiffdatatype/tostring/)() | Returns a String that represents this instance. |
| override [WriteAdditionalData](../../aspose.cad.fileformats.tiff.tifftagtypes/tiffsbytetype/writeadditionaldata/)(TiffStreamWriter) | Writes the additional tag data. |
| [WriteTag](../../aspose.cad.fileformats.tiff/tiffdatatype/writetag/)(TiffStreamWriter, long) | Writes the tag data. |

### See Also

* class [TiffCommonArrayType](../tiffcommonarraytype/)
* namespace [Aspose.CAD.FileFormats.Tiff.TiffTagTypes](../../aspose.cad.fileformats.tiff.tifftagtypes/)
* assembly [Aspose.CAD](../../)


