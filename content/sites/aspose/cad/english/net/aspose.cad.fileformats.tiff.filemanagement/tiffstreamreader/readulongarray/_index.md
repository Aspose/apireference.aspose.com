---
title: TiffStreamReader.ReadULongArray
second_title: Aspose.CAD for .NET API Reference
description: TiffStreamReader method. Reads an array of unsigned integer values from the stream
type: docs
weight: 200
url: /net/aspose.cad.fileformats.tiff.filemanagement/tiffstreamreader/readulongarray/
---
## TiffStreamReader.ReadULongArray method

Reads an array of unsigned integer values from the stream.

```csharp
public uint[] ReadULongArray(long position, long count)
```

| Parameter | Type | Description |
| --- | --- | --- |
| position | Int64 | The position to read from. |
| count | Int64 | The elements count. |

### Return Value

The array of unsigned integer values.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | count;Total bytes count is negative. + count + x4= + totalBytes |

### See Also

* class [TiffStreamReader](../)
* namespace [Aspose.CAD.FileFormats.Tiff.FileManagement](../../tiffstreamreader/)
* assembly [Aspose.CAD](../../../)


