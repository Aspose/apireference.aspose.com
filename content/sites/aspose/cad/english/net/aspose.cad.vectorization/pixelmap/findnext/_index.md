---
title: PixelMap.FindNext
second_title: Aspose.CAD for .NET API Reference
description: PixelMap method. Searches a x and a y such that sourcexy  1 and sourcex1y 0. If this not exists false will be returned else the result is true
type: docs
weight: 80
url: /net/aspose.cad.vectorization/pixelmap/findnext/
---
## PixelMap.FindNext method

Searches a x and a y such that source[x,y] = 1 and source[x+1,y] 0. If this not exists, false will be returned else the result is true.

```csharp
public bool FindNext(Point2I point, ref Point2I result)
```

| Parameter | Type | Description |
| --- | --- | --- |
| point | Point2I | The start point |
| result | Point2I& | The result point |

### See Also

* struct [Point2I](../../../aspose.cad.vectorization.common/point2i/)
* class [PixelMap](../)
* namespace [Aspose.CAD.Vectorization](../../pixelmap/)
* assembly [Aspose.CAD](../../../)


