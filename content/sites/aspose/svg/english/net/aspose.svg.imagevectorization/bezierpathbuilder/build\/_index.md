---
title: BezierPathBuilder.Build
second_title: Aspose.SVG for .NET API Reference
description: BezierPathBuilder Build method. Builds an optimized Bezier path from a sequence of trace points. The method approximates the given trace with a Bezier curve using a combination of line and curve segments. It aims to minimize the number of segments while ensuring the path closely fits the original trace
type: docs
weight: 50
url: /net/aspose.svg.imagevectorization/bezierpathbuilder/build/
---
## BezierPathBuilder.Build method

Builds an optimized Bezier path from a sequence of trace points. The method approximates the given trace with a Bezier curve, using a combination of line and curve segments. It aims to minimize the number of segments while ensuring the path closely fits the original trace.

```csharp
public string Build(IEnumerable<PointF> trace)
```

| Parameter | Type | Description |
| --- | --- | --- |
| trace | IEnumerable`1 | The sequence of points that define the trace to be approximated. |

### Return Value

A string representing the SVG path data. This data consists of a series of commands and coordinates that define the Bezier path, closely approximating the input trace with minimized complexity.

### See Also

* class [BezierPathBuilder](../)
* namespace [Aspose.Svg.ImageVectorization](../../../aspose.svg.imagevectorization/)
* assembly [Aspose.SVG](../../../)
