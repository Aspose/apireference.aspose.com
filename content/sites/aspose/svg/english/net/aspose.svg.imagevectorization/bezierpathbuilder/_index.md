---
title: BezierPathBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.ImageVectorization.BezierPathBuilder class. The SplinePathBuilder class is responsible for building path segments SVGPathSeg from list of the trace points. This path builder is based on using least-squares method to find Bezier control points for trace of points
type: docs
weight: 2100
url: /net/aspose.svg.imagevectorization/bezierpathbuilder/
---
## BezierPathBuilder class

The [`SplinePathBuilder`](../splinepathbuilder/) class is responsible for building path segments [`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) from list of the trace points. This path builder is based on using least-squares method to find Bezier control points for trace of points.

```csharp
public class BezierPathBuilder : IPathBuilder
```

## Constructors

| Name | Description |
| --- | --- |
| [BezierPathBuilder](bezierpathbuilder/)() | Initializes a new instance of the `BezierPathBuilder` class. |

## Properties

| Name | Description |
| --- | --- |
| [ErrorThreshold](../../aspose.svg.imagevectorization/bezierpathbuilder/errorthreshold/) { get; set; } | Gets or sets the error threshold. This parameter defines maximum deviation of points to fitted curve. By default it is 30. |
| [MaxIterations](../../aspose.svg.imagevectorization/bezierpathbuilder/maxiterations/) { get; set; } | Gets or sets the error threshold. This parameter defines number of iteration for least-squares approximation method. By default it is 30. |
| [TraceSmoother](../../aspose.svg.imagevectorization/bezierpathbuilder/tracesmoother/) { get; set; } | Gets or sets the trace smoother. |

## Methods

| Name | Description |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/bezierpathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Builds path segments from the list of the trace points. |

### See Also

* interface [IPathBuilder](../ipathbuilder/)
* namespace [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* assembly [Aspose.SVG](../../)
