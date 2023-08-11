---
title: GraphicsPathIterator.NextSubpath
second_title: Aspose.Drawing for .NET API Reference
description: GraphicsPathIterator method. Moves the GraphicsPathIterator to the next subpath in the path. The start index and end index of the next subpath are contained in the out parameters
type: docs
weight: 100
url: /net/system.drawing.drawing2d/graphicspathiterator/nextsubpath/
---
## NextSubpath(out int, out int, out bool) {#nextsubpath}

Moves the [`GraphicsPathIterator`](../) to the next subpath in the path. The start index and end index of the next subpath are contained in the [out] parameters.

```csharp
public int NextSubpath(out int startIndex, out int endIndex, out bool isClosed)
```

| Parameter | Type | Description |
| --- | --- | --- |
| startIndex | Int32& | [out] Receives the starting index of the next subpath. |
| endIndex | Int32& | [out] Receives the ending index of the next subpath. |
| isClosed | Boolean& | [out] Indicates whether the subpath is closed. |

### Return Value

The number of data points in the retrieved figure (subpath). If there are no more figures to retrieve, zero is returned.

### See Also

* class [GraphicsPathIterator](../)
* namespace [System.Drawing.Drawing2D](../../graphicspathiterator/)
* assembly [Aspose.Drawing](../../../)

---

## NextSubpath(GraphicsPath, out bool) {#nextsubpath_1}

Gets the next figure (subpath) from the associated path of this [`GraphicsPathIterator`](../).

```csharp
public int NextSubpath(GraphicsPath path, out bool isClosed)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | GraphicsPath | A [`GraphicsPath`](../../graphicspath/) that is to have its data points set to match the data points of the retrieved figure (subpath) for this iterator. |
| isClosed | Boolean& | [out] Indicates whether the current subpath is closed. It is true if the if the figure is closed, otherwise it is false. |

### Return Value

The number of data points in the retrieved figure (subpath). If there are no more figures to retrieve, zero is returned.

### See Also

* class [GraphicsPath](../../graphicspath/)
* class [GraphicsPathIterator](../)
* namespace [System.Drawing.Drawing2D](../../graphicspathiterator/)
* assembly [Aspose.Drawing](../../../)


