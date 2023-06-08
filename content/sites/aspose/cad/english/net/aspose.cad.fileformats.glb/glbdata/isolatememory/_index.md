---
title: GlbData.IsolateMemory
second_title: Aspose.CAD for .NET API Reference
description: GlbData method. Refreshes all internal memory buffers
type: docs
weight: 410
url: /net/aspose.cad.fileformats.glb/glbdata/isolatememory/
---
## GlbData.IsolateMemory method

Refreshes all internal memory buffers.

```csharp
public void IsolateMemory()
```

## Remarks

[`Buffer`](../../buffer/) instances can be created using external Byte arrays, which can potentially be shared with other instances. Editing these arrays directly can lead to data corruption. This method refreshes all internal memory buffers, by copying the data into newly allocated buffers. This ensures that at this point, all memory buffers are not shared and of exclusive use of this [`GlbImage`](../../glbimage/) instance.

### See Also

* class [GlbData](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../glbdata/)
* assembly [Aspose.CAD](../../../)


