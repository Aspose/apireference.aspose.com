---
title: AffineTransform.Multiply
second_title: Aspose.CAD for .NET API Reference
description: AffineTransform method. Multiplies a by b
type: docs
weight: 60
url: /net/aspose.cad.fileformats.glb.transforms/affinetransform/multiply/
---
## AffineTransform.Multiply method

Multiplies *a* by *b*.

```csharp
public static AffineTransform Multiply(ref AffineTransform a, ref AffineTransform b)
```

| Parameter | Type | Description |
| --- | --- | --- |
| a | AffineTransform& | The left transform. |
| b | AffineTransform& | The right transform. |

### Return Value

A new [`AffineTransform`](../) structure.

The returned value will use a decomposed representation it these two conditions are met:

1. Arguments *a* and *b* are also in decomposed form.
2. The result of the operation is decomposable.

Otherwise the returned value will use a Matrix representation.

### See Also

* struct [AffineTransform](../)
* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../affinetransform/)
* assembly [Aspose.CAD](../../../)


