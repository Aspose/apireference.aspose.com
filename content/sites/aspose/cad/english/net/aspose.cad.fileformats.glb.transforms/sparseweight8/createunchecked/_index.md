---
title: SparseWeight8.CreateUnchecked
second_title: Aspose.CAD for .NET API Reference
description: SparseWeight8 method. Creates a new SparseWeight8 struct
type: docs
weight: 40
url: /net/aspose.cad.fileformats.glb.transforms/sparseweight8/createunchecked/
---
## SparseWeight8.CreateUnchecked method

Creates a new [`SparseWeight8`](../) struct.

```csharp
public static SparseWeight8 CreateUnchecked(ref Vector4 idx0123, ref Vector4 idx4567, 
    ref Vector4 wgt0123, ref Vector4 wgt4567)
```

| Parameter | Type | Description |
| --- | --- | --- |
| idx0123 | Vector4& | The first 4 indices. |
| idx4567 | Vector4& | The next 4 indices. |
| wgt0123 | Vector4& | The first 4 weights. |
| wgt4567 | Vector4& | The next 4 weights. |

### Return Value

A [`SparseWeight8`](../) instance.

## Remarks

Unlike [`Create`](../create/), this method is a direct call to the constructor, so it's very fast. But it doesn't validate the input values, so it's intended to be used in limited scenarios, where performance is paramount.

### See Also

* struct [SparseWeight8](../)
* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../sparseweight8/)
* assembly [Aspose.CAD](../../../)


