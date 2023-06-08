---
title: GlbData.UseBufferView
second_title: Aspose.CAD for .NET API Reference
description: GlbData method. Creates or reuses a BufferView instance at GlbImage.LogicalBufferViews
type: docs
weight: 490
url: /net/aspose.cad.fileformats.glb/glbdata/usebufferview/
---
## UseBufferView(ArraySegment&lt;byte&gt;, int, BufferMode?) {#usebufferview_2}

Creates or reuses a [`BufferView`](../../bufferview/) instance at !:GlbImage.LogicalBufferViews.

```csharp
public BufferView UseBufferView(ArraySegment<byte> data, int byteStride = 0, 
    BufferMode? target = default)
```

| Parameter | Type | Description |
| --- | --- | --- |
| data | ArraySegment`1 | The array range to wrap. |
| byteStride | Int32 | For strided vertex buffers, it must be a value multiple of 4, 0 otherwise |
| target | Nullable`1 | The type hardware device buffer, or null |

### Return Value

A [`BufferView`](../../bufferview/) instance.

### See Also

* class [BufferView](../../bufferview/)
* enum [BufferMode](../../buffermode/)
* class [GlbData](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../glbdata/)
* assembly [Aspose.CAD](../../../)

---

## UseBufferView(byte[], int, int?, int, BufferMode?) {#usebufferview_1}

Creates or reuses a [`BufferView`](../../bufferview/) instance at !:GlbImage.LogicalBufferViews.

```csharp
public BufferView UseBufferView(byte[] buffer, int byteOffset = 0, int? byteLength = null, 
    int byteStride = 0, BufferMode? target = default)
```

| Parameter | Type | Description |
| --- | --- | --- |
| buffer | Byte[] | The array to wrap. |
| byteOffset | Int32 | The zero-based index of the first Byte in *buffer* |
| byteLength | Nullable`1 | The number of elements in *buffer* |
| byteStride | Int32 | For strided vertex buffers, it must be a value multiple of 4, 0 otherwise |
| target | Nullable`1 | The type hardware device buffer, or null |

### Return Value

A [`BufferView`](../../bufferview/) instance.

### See Also

* class [BufferView](../../bufferview/)
* enum [BufferMode](../../buffermode/)
* class [GlbData](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../glbdata/)
* assembly [Aspose.CAD](../../../)

---

## UseBufferView(Buffer, int, int?, int, BufferMode?) {#usebufferview}

Creates or reuses a [`BufferView`](../../bufferview/) instance at !:GlbImage.LogicalBufferViews.

```csharp
public BufferView UseBufferView(Buffer buffer, int byteOffset = 0, int? byteLength = null, 
    int byteStride = 0, BufferMode? target = default)
```

| Parameter | Type | Description |
| --- | --- | --- |
| buffer | Buffer | The buffer to wrap. |
| byteOffset | Int32 | The zero-based index of the first Byte in *buffer* |
| byteLength | Nullable`1 | The number of elements in *buffer* |
| byteStride | Int32 | For strided vertex buffers, it must be a value multiple of 4, 0 otherwise |
| target | Nullable`1 | The type hardware device buffer, or null |

### Return Value

A [`BufferView`](../../bufferview/) instance.

### See Also

* class [BufferView](../../bufferview/)
* class [Buffer](../../buffer/)
* enum [BufferMode](../../buffermode/)
* class [GlbData](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../glbdata/)
* assembly [Aspose.CAD](../../../)


