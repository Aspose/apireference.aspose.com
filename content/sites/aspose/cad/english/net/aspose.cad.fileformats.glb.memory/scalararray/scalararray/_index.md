---
title: ScalarArray.ScalarArray
second_title: Aspose.CAD for .NET API Reference
description: ScalarArray constructor. Initializes a new instance of the ScalarArray struct
type: docs
weight: 10
url: /net/aspose.cad.fileformats.glb.memory/scalararray/scalararray/
---
## ScalarArray(Memory&lt;byte&gt;, int, EncodingType, bool) {#constructor}

Initializes a new instance of the [`ScalarArray`](../) struct.

```csharp
public ScalarArray(Memory<byte> source, int byteStride = 0, 
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
* struct [ScalarArray](../)
* namespace [Aspose.CAD.FileFormats.GLB.Memory](../../scalararray/)
* assembly [Aspose.CAD](../../../)

---

## ScalarArray(Memory&lt;byte&gt;, int, int, int, EncodingType, bool) {#constructor_1}

Initializes a new instance of the [`ScalarArray`](../) struct.

```csharp
public ScalarArray(Memory<byte> source, int byteOffset, int itemsCount, int byteStride, 
    EncodingType encoding = EncodingType.FLOAT, bool normalized = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| source | Memory`1 | The array range to wrap. |
| byteOffset | Int32 | The zero-based index of the first Byte in *source*. |
| itemsCount | Int32 | The number of Single items in *source*. |
| byteStride | Int32 | The byte stride between elements. If the value is zero, the size of the item is used instead. |
| encoding | EncodingType | A value of [`EncodingType`](../../../aspose.cad.fileformats.glb/encodingtype/). |
| normalized | Boolean | True if values are normalized. |

### See Also

* enum [EncodingType](../../../aspose.cad.fileformats.glb/encodingtype/)
* struct [ScalarArray](../)
* namespace [Aspose.CAD.FileFormats.GLB.Memory](../../scalararray/)
* assembly [Aspose.CAD](../../../)


