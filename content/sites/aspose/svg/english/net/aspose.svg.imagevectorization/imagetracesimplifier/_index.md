---
title: ImageTraceSimplifier Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.ImageVectorization.ImageTraceSimplifier class. The ImageTraceSimplifier class is responsible reducing the number of points in a curve that is approximated by a series of the trace points
type: docs
weight: 2120
url: /net/aspose.svg.imagevectorization/imagetracesimplifier/
---
## ImageTraceSimplifier class

The ImageTraceSimplifier class is responsible reducing the number of points in a curve that is approximated by a series of the trace points.

```csharp
public class ImageTraceSimplifier : IImageTraceSimplifier
```

## Constructors

| Name | Description |
| --- | --- |
| [ImageTraceSimplifier](imagetracesimplifier/#constructor)() | Initializes a new instance of the `ImageTraceSimplifier` class. |
| [ImageTraceSimplifier](imagetracesimplifier/#constructor_1)(float) | Initializes a new instance of the `ImageTraceSimplifier` class. |

## Properties

| Name | Description |
| --- | --- |
| [Tolerance](../../aspose.svg.imagevectorization/imagetracesimplifier/tolerance/) { get; set; } | The value of the tolerance determines the maximum error tolerance allowed for an point to be eliminated from trace. It must be in the range from 0 to 4. Any higher or lower values will be aligned with the minimum and maximum values of this range, accordingly. The default value is 0.3. |

## Methods

| Name | Description |
| --- | --- |
| [Simplify](../../aspose.svg.imagevectorization/imagetracesimplifier/simplify/)(IEnumerable&lt;PointF&gt;) | Reduces the number of points it the list of the trace points. |

### See Also

* interface [IImageTraceSimplifier](../iimagetracesimplifier/)
* namespace [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* assembly [Aspose.SVG](../../)
