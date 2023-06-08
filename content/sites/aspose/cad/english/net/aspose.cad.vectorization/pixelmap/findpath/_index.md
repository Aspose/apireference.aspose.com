---
title: PixelMap.FindPath
second_title: Aspose.CAD for .NET API Reference
description: PixelMap method. Compute a path in the binary matrix. Start path at the point x0x1 which must be an upper left corner of the path. Also compute the area enclosed by the path. Return a new Path object or NULL on error note that a legitimate path cannot have length 0
type: docs
weight: 90
url: /net/aspose.cad.vectorization/pixelmap/findpath/
---
## PixelMap.FindPath method

Compute a path in the binary matrix. Start path at the point (x0,x1), which must be an upper left corner of the path. Also compute the area enclosed by the path. Return a new Path object, or NULL on error (note that a legitimate path cannot have length 0).

```csharp
public TracePath FindPath(TurnPolicy turnPolicy, Point2I point)
```

| Parameter | Type | Description |
| --- | --- | --- |
| turnPolicy | TurnPolicy | The turn policy |
| point | Point2I | The start point |

### See Also

* class [TracePath](../../tracepath/)
* enum [TurnPolicy](../../../aspose.cad.vectorization.common/turnpolicy/)
* struct [Point2I](../../../aspose.cad.vectorization.common/point2i/)
* class [PixelMap](../)
* namespace [Aspose.CAD.Vectorization](../../pixelmap/)
* assembly [Aspose.CAD](../../../)


