---
title: Accessor.SetVertexData
second_title: Aspose.CAD for .NET API Reference
description: Accessor method. 
type: docs
weight: 240
url: /net/aspose.cad.fileformats.glb/accessor/setvertexdata/
---
## SetVertexData(MemoryAccessor) {#setvertexdata_1}

```csharp
public void SetVertexData(MemoryAccessor src)
```

### See Also

* class [MemoryAccessor](../../../aspose.cad.fileformats.glb.memory/memoryaccessor/)
* class [Accessor](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../accessor/)
* assembly [Aspose.CAD](../../../)

---

## SetVertexData(BufferView, int, int, DimensionType, EncodingType, bool) {#setvertexdata}

Associates this [`Accessor`](../) with a [`BufferView`](../../bufferview/)

```csharp
public void SetVertexData(BufferView buffer, int bufferByteOffset, int itemCount, 
    DimensionType dimensions = DimensionType.VEC3, EncodingType encoding = EncodingType.FLOAT, 
    bool normalized = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| buffer | BufferView | The [`BufferView`](../../bufferview/) source. |
| bufferByteOffset | Int32 | The start byte offset within *buffer*. |
| itemCount | Int32 | The number of items in the accessor. |
| dimensions | DimensionType | The [`DimensionType`](../../dimensiontype/) item type. |
| encoding | EncodingType | The [`EncodingType`](../../encodingtype/) item encoding. |
| normalized | Boolean | The item normalization mode. |

### See Also

* class [BufferView](../../bufferview/)
* enum [DimensionType](../../dimensiontype/)
* enum [EncodingType](../../encodingtype/)
* class [Accessor](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../accessor/)
* assembly [Aspose.CAD](../../../)


