---
title: GraphicsPathIterator.NextMarker
second_title: Aspose.Drawing for .NET API Reference
description: GraphicsPathIterator method. Increments the GraphicsPathIterator to the next marker in the path and returns the start and stop indexes by way of the out parameters
type: docs
weight: 80
url: /net/aspose.drawing.drawing2d/graphicspathiterator/nextmarker/
---
## NextMarker(out int, out int) {#nextmarker_1}

Increments the [`GraphicsPathIterator`](../) to the next marker in the path and returns the start and stop indexes by way of the [out] parameters.

```csharp
public int NextMarker(out int startIndex, out int endIndex)
```

| Parameter | Type | Description |
| --- | --- | --- |
| startIndex | Int32& | [out] The integer reference supplied to this parameter receives the index of the point that starts a subpath. |
| endIndex | Int32& | [out] The integer reference supplied to this parameter receives the index of the point that ends the subpath to which startIndex points. |

### Return Value

The number of points between this marker and the next.

### See Also

* class [GraphicsPathIterator](../)
* namespace [Aspose.Drawing.Drawing2D](../../graphicspathiterator/)
* assembly [Aspose.Drawing.Common](../../../)

---

## NextMarker(GraphicsPath) {#nextmarker}

This [`GraphicsPathIterator`](../) object has a [`GraphicsPath`](../../graphicspath/) object associated with it. This method increments the associated [`GraphicsPath`](../../graphicspath/) to the next marker in its path and copies all the points contained between the current marker and the next marker (or end of path) to a second [`GraphicsPath`](../../graphicspath/) object passed in to the parameter.

```csharp
public int NextMarker(GraphicsPath path)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | GraphicsPath | The [`GraphicsPath`](../../graphicspath/) object to which the points will be copied. |

### Return Value

The number of points between this marker and the next.

### See Also

* class [GraphicsPath](../../graphicspath/)
* class [GraphicsPathIterator](../)
* namespace [Aspose.Drawing.Drawing2D](../../graphicspathiterator/)
* assembly [Aspose.Drawing.Common](../../../)


