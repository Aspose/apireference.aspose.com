---
title: GraphicsPathIterator.Enumerate
second_title: Aspose.Drawing for .NET API Reference
description: GraphicsPathIterator method. Copies the GraphicsPath.PathPoints property and GraphicsPath.PathTypes property arrays of the associated GraphicsPath into the two specified arrays
type: docs
weight: 60
url: /net/aspose.drawing.drawing2d/graphicspathiterator/enumerate/
---
## GraphicsPathIterator.Enumerate method

Copies the GraphicsPath.PathPoints property and GraphicsPath.PathTypes property arrays of the associated [`GraphicsPath`](../../graphicspath/) into the two specified arrays.

```csharp
public int Enumerate(ref PointF[] points, ref byte[] types)
```

| Parameter | Type | Description |
| --- | --- | --- |
| points | PointF[]& | Upon return, contains an array of System.Drawing.PointF structures that represents the points in the path. |
| types | Byte[]& | Upon return, contains an array of bytes that represents the types of points in the path. |

### Return Value

The number of points copied.

### See Also

* struct [PointF](../../../aspose.drawing/pointf/)
* class [GraphicsPathIterator](../)
* namespace [Aspose.Drawing.Drawing2D](../../graphicspathiterator/)
* assembly [Aspose.Drawing.Common](../../../)


