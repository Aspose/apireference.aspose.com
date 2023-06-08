---
title: Struct Matrix3x3Array
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Memory.Matrix3x3Array struct. Wraps an encoded Memory and exposes it as an IList
type: docs
weight: 10640
url: /net/aspose.cad.fileformats.glb.memory/matrix3x3array/
---
## Matrix3x3Array structure

Wraps an encoded Memory and exposes it as an IList.

```csharp
public struct Matrix3x3Array : IList<Matrix4x4>, IReadOnlyList<Matrix4x4>
```

## Constructors

| Name | Description |
| --- | --- |
| [Matrix3x3Array](matrix3x3array/#constructor)(Memory&lt;byte&gt;, int, EncodingType, bool) |  |
| [Matrix3x3Array](matrix3x3array/#constructor_1)(Memory&lt;byte&gt;, int, int, int, EncodingType, bool) |  |

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.cad.fileformats.glb.memory/matrix3x3array/count/) { get; } |  |
| [Item](../../aspose.cad.fileformats.glb.memory/matrix3x3array/item/) { get; set; } |  |

## Methods

| Name | Description |
| --- | --- |
| [Contains](../../aspose.cad.fileformats.glb.memory/matrix3x3array/contains/)(Matrix4x4) |  |
| [CopyTo](../../aspose.cad.fileformats.glb.memory/matrix3x3array/copyto/)(Matrix4x4[], int) |  |
| [Fill](../../aspose.cad.fileformats.glb.memory/matrix3x3array/fill/)(IEnumerable&lt;Matrix4x4&gt;, int) |  |
| [GetEnumerator](../../aspose.cad.fileformats.glb.memory/matrix3x3array/getenumerator/)() |  |
| [IndexOf](../../aspose.cad.fileformats.glb.memory/matrix3x3array/indexof/)(Matrix4x4) |  |

## Remarks

Vector namespace doesn't support a 3x3 matrix, so the array is decoded as a Matrix3x3 matrix internally, but exposed as a Matrix4x4.

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Memory](../../aspose.cad.fileformats.glb.memory/)
* assembly [Aspose.CAD](../../)


