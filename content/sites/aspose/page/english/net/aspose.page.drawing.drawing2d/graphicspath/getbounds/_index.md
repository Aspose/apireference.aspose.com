---
title: GraphicsPath.GetBounds
second_title: Aspose.Page for .NET API Reference
description: GraphicsPath method. Returns a rectangle that bounds this GraphicsPath
type: docs
weight: 250
url: /net/aspose.page.drawing.drawing2d/graphicspath/getbounds/
---
## GetBounds() {#getbounds}

Returns a rectangle that bounds this [`GraphicsPath`](../).

```csharp
public RectangleF GetBounds()
```

### Return Value

A [`RectangleF`](../../../aspose.page.drawing/rectanglef/) that represents a rectangle that bounds this [`GraphicsPath`](../).

### See Also

* struct [RectangleF](../../../aspose.page.drawing/rectanglef/)
* class [GraphicsPath](../)
* namespace [Aspose.Page.Drawing.Drawing2D](../../graphicspath/)
* assembly [Aspose.Page](../../../)

---

## GetBounds(Matrix) {#getbounds_1}

Returns a rectangle that bounds this [`GraphicsPath`](../) when this path is transformed by the specified [`Matrix`](../../matrix/).

```csharp
public RectangleF GetBounds(Matrix matrix)
```

| Parameter | Type | Description |
| --- | --- | --- |
| matrix | Matrix | The [`Matrix`](../../matrix/) that specifies a transformation to be applied to this path before the bounding rectangle is calculated. This path is not permanently transformed; the transformation is used only during the process of calculating the bounding rectangle. |

### Return Value

A [`RectangleF`](../../../aspose.page.drawing/rectanglef/) that represents a rectangle that bounds this [`GraphicsPath`](../).

### See Also

* struct [RectangleF](../../../aspose.page.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* namespace [Aspose.Page.Drawing.Drawing2D](../../graphicspath/)
* assembly [Aspose.Page](../../../)

---

## GetBounds(Matrix, Pen) {#getbounds_2}

Returns a rectangle that bounds this [`GraphicsPath`](../) when the current path is transformed by the specified [`Matrix`](../../matrix/) and drawn with the specified [`Pen`](../../../aspose.page.drawing/pen/).

```csharp
public RectangleF GetBounds(Matrix matrix, Pen pen)
```

| Parameter | Type | Description |
| --- | --- | --- |
| matrix | Matrix | The [`Matrix`](../../matrix/) that specifies a transformation to be applied to this path before the bounding rectangle is calculated. This path is not permanently transformed; the transformation is used only during the process of calculating the bounding rectangle. |
| pen | Pen | The [`Pen`](../../../aspose.page.drawing/pen/) with which to draw the [`GraphicsPath`](../). |

### Return Value

A [`RectangleF`](../../../aspose.page.drawing/rectanglef/) that represents a rectangle that bounds this [`GraphicsPath`](../).

### See Also

* struct [RectangleF](../../../aspose.page.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* class [Pen](../../../aspose.page.drawing/pen/)
* class [GraphicsPath](../)
* namespace [Aspose.Page.Drawing.Drawing2D](../../graphicspath/)
* assembly [Aspose.Page](../../../)


