---
title: MemoryImage.TryParseMime64
second_title: Aspose.CAD for .NET API Reference
description: MemoryImage method. Tries to parse a Mime64 string to MemoryImage
type: docs
weight: 220
url: /net/aspose.cad.fileformats.glb.memory/memoryimage/tryparsemime64/
---
## MemoryImage.TryParseMime64 method

Tries to parse a Mime64 string to [`MemoryImage`](../)

```csharp
public static bool TryParseMime64(string mime64content, out MemoryImage image)
```

| Parameter | Type | Description |
| --- | --- | --- |
| mime64content | String | The Mime64 string source. |
| image | MemoryImage& | if decoding succeeds, it will contain the image file. |

### Return Value

true if decoding succeeded.

## Remarks

The string must be haedered with a mime prefix like: "data:image/png;base64,"

### See Also

* struct [MemoryImage](../)
* namespace [Aspose.CAD.FileFormats.GLB.Memory](../../memoryimage/)
* assembly [Aspose.CAD](../../../)


