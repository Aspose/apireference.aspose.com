---
title: Vector4Array.Vector4Array
second_title: Aspose.CAD for .NET API Reference
description: Vector4Array constructor. Initializes a new instance of the Vector4Array struct
type: docs
weight: 10
url: /net/aspose.cad.fileformats.glb.memory/vector4array/vector4array/
---
## Vector4Array(Memory&lt;byte&gt;, int, EncodingType, bool) {#constructor}

Initializes a new instance of the [`Vector4Array`](../) struct.

```csharp
public Vector4Array(Memory<byte> source, int byteStride = 0, 
    EncodingType encoding = EncodingType.FLOAT, bool normalized = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| source | Memory`1 | The array range to wrap. |
| byteStride | Int32 | The byte stride between elements. If the value is zero, the size of the item is used instead. |
| encoding | EncodingType | A value of [`EncodingType`](../../../aspose.cad.fileformats.glb/encodingtype/). |
| normalized | Boolean | True if values are normalized. |

### See Also

* enum [EncodingType](../../../aspose.cad.fileformats.glb/encodingtype/)
* struct [Vector4Array](../)
* namespace [Aspose.CAD.FileFormats.GLB.Memory](../../vector4array/)
* assembly [Aspose.CAD](../../../)

---

## Vector4Array(Memory&lt;byte&gt;, int, int, int, EncodingType, bool) {#constructor_1}

Initializes a new instance of the [`Vector4Array`](../) struct.

```csharp
public Vector4Array(Memory<byte> source, int byteOffset, int itemsCount, int byteStride, 
    EncodingType encoding = EncodingType.FLOAT, bool normalized = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| source | Memory`1 | The array range to wrap. |
| byteOffset | Int32 | The zero-based index of the first Byte in *source*. |
| itemsCount | Int32 | The number of Vector3 items in *source*. |
| byteStride | Int32 | The byte stride between elements. If the value is zero, the size of the item is used instead. |
| encoding | EncodingType | A value of [`EncodingType`](../../../aspose.cad.fileformats.glb/encodingtype/). |
| normalized | Boolean | True if values are normalized. |

### See Also

* enum [EncodingType](../../../aspose.cad.fileformats.glb/encodingtype/)
* struct [Vector4Array](../)
* namespace [Aspose.CAD.FileFormats.GLB.Memory](../../vector4array/)
* assembly [Aspose.CAD](../../../)


