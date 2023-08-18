---
title: GraphicsPathIterator.CopyData
second_title: Aspose.Drawing for .NET API Reference
description: GraphicsPathIterator method. Copies the GraphicsPath.PathPoints property and GraphicsPath.PathTypes property arrays of the associated GraphicsPath into the two specified arrays
type: docs
weight: 40
url: /net/system.drawing.drawing2d/graphicspathiterator/copydata/
---
## GraphicsPathIterator.CopyData method

Copies the GraphicsPath.PathPoints property and GraphicsPath.PathTypes property arrays of the associated [`GraphicsPath`](../../graphicspath/) into the two specified arrays.

```csharp
public int CopyData(ref PointF[] points, ref byte[] types, int startIndex, int endIndex)
```

| Parameter | Type | Description |
| --- | --- | --- |
| points | PointF[]& | Upon return, contains an array of System.Drawing.PointF structures that represents the points in the path. |
| types | Byte[]& | Upon return, contains an array of bytes that represents the types of points in the path. |
| startIndex | Int32 | Specifies the starting index of the arrays. |
| endIndex | Int32 | Specifies the ending index of the arrays. |

### Return Value

The number of points copied.

### See Also

* struct [PointF](../../../system.drawing/pointf/)
* class [GraphicsPathIterator](../)
* namespace [System.Drawing.Drawing2D](../../graphicspathiterator/)
* assembly [Aspose.Drawing](../../../)


