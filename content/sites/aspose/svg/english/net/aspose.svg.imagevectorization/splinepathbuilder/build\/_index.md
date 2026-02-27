---
title: SplinePathBuilder.Build
second_title: Aspose.SVG for .NET API Reference
description: SplinePathBuilder Build method. Constructs a smooth path through a sequence of points by converting Centripetal CatmullRom splines into Bezier curves. This method ensures a natural and smooth transition through each point creating an SVG path that closely follows the provided trace
type: docs
weight: 50
url: /net/aspose.svg.imagevectorization/splinepathbuilder/build/
---
## SplinePathBuilder.Build method

Constructs a smooth path through a sequence of points by converting Centripetal Catmull–Rom splines into Bezier curves. This method ensures a natural and smooth transition through each point, creating an SVG path that closely follows the provided trace.

```csharp
public string Build(IEnumerable<PointF> trace)
```

| Parameter | Type | Description |
| --- | --- | --- |
| trace | IEnumerable`1 | The sequence of points to be interpolated into a smooth path. |

### Return Value

A string representing the SVG path data, comprising Bezier curve commands and coordinates that approximate the Centripetal Catmull–Rom spline.

### See Also

* class [SplinePathBuilder](../)
* namespace [Aspose.Svg.ImageVectorization](../../../aspose.svg.imagevectorization/)
* assembly [Aspose.SVG](../../../)
