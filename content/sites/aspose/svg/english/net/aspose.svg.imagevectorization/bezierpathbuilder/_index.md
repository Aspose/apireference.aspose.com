---
title: BezierPathBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.ImageVectorization.BezierPathBuilder class. The BezierPathBuilder class is responsible for constructing a Bezier path from a given set of points. It approximates a trace of points with a Bezier curve optimizing the number of segments to closely match the original trace while minimizing complexity
type: docs
weight: 6140
url: /net/aspose.svg.imagevectorization/bezierpathbuilder/
---
## BezierPathBuilder class

The `BezierPathBuilder` class is responsible for constructing a Bezier path from a given set of points. It approximates a trace of points with a Bezier curve, optimizing the number of segments to closely match the original trace while minimizing complexity.

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
| [Build](../../aspose.svg.imagevectorization/bezierpathbuilder/build/)(IEnumerable&lt;PointF&gt;) | Builds an optimized Bezier path from a sequence of trace points. The method approximates the given trace with a Bezier curve, using a combination of line and curve segments. It aims to minimize the number of segments while ensuring the path closely fits the original trace. |

### See Also

* interface [IPathBuilder](../ipathbuilder/)
* namespace [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* assembly [Aspose.SVG](../../)
