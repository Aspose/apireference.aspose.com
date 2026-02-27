---
title: SplinePathBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.ImageVectorization.SplinePathBuilder class. The SplinePathBuilder class is designed to construct a smooth path by transforming Centripetal CatmullRom splines into Bezier curves. It offers a method to generate a path that smoothly interpolates through a set of points providing a balance between fidelity to the points and smoothness of the curve
type: docs
weight: 4230
url: /net/aspose.svg.imagevectorization/splinepathbuilder/
---
## SplinePathBuilder class

The `SplinePathBuilder` class is designed to construct a smooth path by transforming Centripetal Catmull–Rom splines into Bezier curves. It offers a method to generate a path that smoothly interpolates through a set of points, providing a balance between fidelity to the points and smoothness of the curve.

```csharp
public class SplinePathBuilder : IPathBuilder
```

## Constructors

| Name | Description |
| --- | --- |
| [SplinePathBuilder](splinepathbuilder/#constructor)() | Initializes a new instance of the `SplinePathBuilder` class. |
| [SplinePathBuilder](splinepathbuilder/#constructor_2)(*float*) | Initializes a new instance of the `SplinePathBuilder` class. |
| [SplinePathBuilder](splinepathbuilder/#constructor_1)(*[IImageTraceSmoother](../iimagetracesmoother/), [IImageTraceSimplifier](../iimagetracesimplifier/), float*) | Initializes a new instance of the `SplinePathBuilder` class. |

## Properties

| Name | Description |
| --- | --- |
| [Tension](../../aspose.svg.imagevectorization/splinepathbuilder/tension/) { get; set; } | The value of the tensions affects how sharply the curve bends at the (interpolated) control points. It must be in the range from 0 to 1. Any higher or lower values will be aligned with the minimum and maximum values of this range, accordingly. |
| [TraceSimplifier](../../aspose.svg.imagevectorization/splinepathbuilder/tracesimplifier/) { get; set; } | Gets or sets the trace simplifier. |
| [TraceSmoother](../../aspose.svg.imagevectorization/splinepathbuilder/tracesmoother/) { get; set; } | Gets or sets the trace smoother. |

## Methods

| Name | Description |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/splinepathbuilder/build/)(*IEnumerable&lt;PointF&gt;*) | Constructs a smooth path through a sequence of points by converting Centripetal Catmull–Rom splines into Bezier curves. This method ensures a natural and smooth transition through each point, creating an SVG path that closely follows the provided trace. |

### See Also

* interface [IPathBuilder](../ipathbuilder/)
* namespace [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* assembly [Aspose.SVG](../../)
