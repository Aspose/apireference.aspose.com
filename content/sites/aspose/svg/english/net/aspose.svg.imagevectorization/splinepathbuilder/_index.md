---
title: SplinePathBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.ImageVectorization.SplinePathBuilder class. The SplinePathBuilder class is responsible for building path segments SVGPathSeg from list of the trace points. This path builder is based on applying a Catmull-Roma spline to a set of smoothed and reduced path points
type: docs
weight: 6210
url: /net/aspose.svg.imagevectorization/splinepathbuilder/
---
## SplinePathBuilder class

The `SplinePathBuilder` class is responsible for building path segments [`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) from list of the trace points. This path builder is based on applying a Catmull-Roma spline to a set of smoothed and reduced path points..

```csharp
public class SplinePathBuilder : IPathBuilder
```

## Constructors

| Name | Description |
| --- | --- |
| [SplinePathBuilder](splinepathbuilder/#constructor)() | Initializes a new instance of the `SplinePathBuilder` class. |
| [SplinePathBuilder](splinepathbuilder/#constructor_2)(float) | Initializes a new instance of the `SplinePathBuilder` class. |
| [SplinePathBuilder](splinepathbuilder/#constructor_1)(IImageTraceSmoother, IImageTraceSimplifier, float) | Initializes a new instance of the `SplinePathBuilder` class. |

## Properties

| Name | Description |
| --- | --- |
| [Tension](../../aspose.svg.imagevectorization/splinepathbuilder/tension/) { get; set; } | The value of the tensions affects how sharply the curve bends at the (interpolated) control points. It must be in the range from 0 to 1. Any higher or lower values will be aligned with the minimum and maximum values of this range, accordingly. |
| [TraceSimplifier](../../aspose.svg.imagevectorization/splinepathbuilder/tracesimplifier/) { get; set; } | Gets or sets the trace simplifier. |
| [TraceSmoother](../../aspose.svg.imagevectorization/splinepathbuilder/tracesmoother/) { get; set; } | Gets or sets the trace smoother. |

## Methods

| Name | Description |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/splinepathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Builds path segments from the list of the trace points. |

### See Also

* interface [IPathBuilder](../ipathbuilder/)
* namespace [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* assembly [Aspose.SVG](../../)
