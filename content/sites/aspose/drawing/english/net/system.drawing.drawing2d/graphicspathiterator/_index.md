---
title: Class GraphicsPathIterator
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Drawing2D.GraphicsPathIterator class. Provides the ability to iterate through subpaths in a GraphicsPath and test the types of shapes contained in each subpath. This class cannot be inherited
type: docs
weight: 270
url: /net/system.drawing.drawing2d/graphicspathiterator/
---
## GraphicsPathIterator class

Provides the ability to iterate through subpaths in a GraphicsPath and test the types of shapes contained in each subpath. This class cannot be inherited.

```csharp
public sealed class GraphicsPathIterator : IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [GraphicsPathIterator](graphicspathiterator/)(GraphicsPath) | Initializes a new instance of the `GraphicsPathIterator` class. |

## Properties

| Name | Description |
| --- | --- |
| [Count](../../system.drawing.drawing2d/graphicspathiterator/count/) { get; } | Gets the number of points in the path. |
| [SubpathCount](../../system.drawing.drawing2d/graphicspathiterator/subpathcount/) { get; } | Gets the number of subpaths in the path. |

## Methods

| Name | Description |
| --- | --- |
| [CopyData](../../system.drawing.drawing2d/graphicspathiterator/copydata/)(ref PointF[], ref byte[], int, int) | Copies the GraphicsPath.PathPoints property and GraphicsPath.PathTypes property arrays of the associated [`GraphicsPath`](../graphicspath/) into the two specified arrays. |
| [Dispose](../../system.drawing.drawing2d/graphicspathiterator/dispose/)() | Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources. |
| [Enumerate](../../system.drawing.drawing2d/graphicspathiterator/enumerate/)(ref PointF[], ref byte[]) | Copies the GraphicsPath.PathPoints property and GraphicsPath.PathTypes property arrays of the associated [`GraphicsPath`](../graphicspath/) into the two specified arrays. |
| [HasCurve](../../system.drawing.drawing2d/graphicspathiterator/hascurve/)() | Indicates whether the path associated with this `GraphicsPathIterator` contains a curve. |
| [NextMarker](../../system.drawing.drawing2d/graphicspathiterator/nextmarker/#nextmarker_1)(GraphicsPath) | This `GraphicsPathIterator` object has a [`GraphicsPath`](../graphicspath/) object associated with it. This method increments the associated [`GraphicsPath`](../graphicspath/) to the next marker in its path and copies all the points contained between the current marker and the next marker (or end of path) to a second [`GraphicsPath`](../graphicspath/) object passed in to the parameter. |
| [NextMarker](../../system.drawing.drawing2d/graphicspathiterator/nextmarker/#nextmarker)(out int, out int) | Increments the `GraphicsPathIterator` to the next marker in the path and returns the start and stop indexes by way of the [out] parameters. |
| [NextPathType](../../system.drawing.drawing2d/graphicspathiterator/nextpathtype/)(out byte, out int, out int) | Gets the starting index and the ending index of the next group of data points that all have the same type. |
| [NextSubpath](../../system.drawing.drawing2d/graphicspathiterator/nextsubpath/#nextsubpath_1)(GraphicsPath, out bool) | Gets the next figure (subpath) from the associated path of this `GraphicsPathIterator`. |
| [NextSubpath](../../system.drawing.drawing2d/graphicspathiterator/nextsubpath/#nextsubpath)(out int, out int, out bool) | Moves the `GraphicsPathIterator` to the next subpath in the path. The start index and end index of the next subpath are contained in the [out] parameters. |
| [Rewind](../../system.drawing.drawing2d/graphicspathiterator/rewind/)() | Rewinds this `GraphicsPathIterator` to the beginning of its associated path. |

### See Also

* namespace [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* assembly [Aspose.Drawing](../../)


