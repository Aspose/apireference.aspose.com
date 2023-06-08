---
title: SparseWeight8.InterpolateCubic
second_title: Aspose.CAD for .NET API Reference
description: SparseWeight8 method. Interpolates x  xt with y  yt an amount. If theres more than 8 non zero result values the 8 most representative values are taken
type: docs
weight: 50
url: /net/aspose.cad.fileformats.glb.transforms/sparseweight8/interpolatecubic/
---
## SparseWeight8.InterpolateCubic method

Interpolates (*x* , *xt*) with (*y* , *yt*) an *amount*. If there's more than 8 non zero result values, the 8 most representative values are taken.

```csharp
public static SparseWeight8 InterpolateCubic(ref SparseWeight8 x, ref SparseWeight8 xt, 
    ref SparseWeight8 y, ref SparseWeight8 yt, float amount)
```

| Parameter | Type | Description |
| --- | --- | --- |
| x | SparseWeight8& | The first value operand. |
| xt | SparseWeight8& | The first tangent operand. |
| y | SparseWeight8& | The second value operand. |
| yt | SparseWeight8& | The second tangent operand. |
| amount | Single | The amount of *y* |

### Return Value

A new [`SparseWeight8`](../)

### See Also

* struct [SparseWeight8](../)
* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../sparseweight8/)
* assembly [Aspose.CAD](../../../)


