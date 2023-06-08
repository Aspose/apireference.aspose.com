---
title: AffineTransform.TryInvert
second_title: Aspose.CAD for .NET API Reference
description: AffineTransform method. Inverts the specified transform. The return value indicates whether the operation succeeded
type: docs
weight: 250
url: /net/aspose.cad.fileformats.glb.transforms/affinetransform/tryinvert/
---
## AffineTransform.TryInvert method

Inverts the specified transform. The return value indicates whether the operation succeeded.

```csharp
public static bool TryInvert(ref AffineTransform xform, out AffineTransform inverse)
```

| Parameter | Type | Description |
| --- | --- | --- |
| xform | AffineTransform& | The transform to invert. |
| inverse | AffineTransform& | The inverted result. |

### Return Value

True if the operation succeeds.

## Remarks

SRT format with uneven scale can produce results that differ from a matrix

### See Also

* struct [AffineTransform](../)
* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../affinetransform/)
* assembly [Aspose.CAD](../../../)


