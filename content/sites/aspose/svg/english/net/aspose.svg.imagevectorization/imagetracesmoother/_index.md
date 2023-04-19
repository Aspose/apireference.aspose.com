---
title: ImageTraceSmoother Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.ImageVectorization.ImageTraceSmoother class. The ImageTraceSimplifier class is responsible for smoothing the number of points in a curve that is approximated by a series of the trace points. This class implement nearest-neighbor approach
type: docs
weight: 2130
url: /net/aspose.svg.imagevectorization/imagetracesmoother/
---
## ImageTraceSmoother class

The ImageTraceSimplifier class is responsible for smoothing the number of points in a curve that is approximated by a series of the trace points. This class implement nearest-neighbor approach.

```csharp
public class ImageTraceSmoother : IImageTraceSmoother
```

## Constructors

| Name | Description |
| --- | --- |
| [ImageTraceSmoother](imagetracesmoother/#constructor)() | Initializes a new instance of the `ImageTraceSmoother` class. |
| [ImageTraceSmoother](imagetracesmoother/#constructor_1)(int) | Initializes a new instance of the `ImageTraceSmoother` class. |

## Properties

| Name | Description |
| --- | --- |
| [Extent](../../aspose.svg.imagevectorization/imagetracesmoother/extent/) { get; set; } | Gets of sets extent of the region considered by query point. It must be in the range from 1 to 20. Any higher or lower values will be aligned with the minimum and maximum values of this range, accordingly. |

## Methods

| Name | Description |
| --- | --- |
| virtual [Smooth](../../aspose.svg.imagevectorization/imagetracesmoother/smooth/)(IEnumerable&lt;PointF&gt;) | Smoothes the trace. |

### See Also

* interface [IImageTraceSmoother](../iimagetracesmoother/)
* namespace [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* assembly [Aspose.SVG](../../)
