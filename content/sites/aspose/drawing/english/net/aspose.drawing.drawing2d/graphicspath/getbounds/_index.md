---
title: GraphicsPath.GetBounds
second_title: Aspose.Drawing for .NET API Reference
description: GraphicsPath method. Returns a rectangle that bounds this GraphicsPath
type: docs
weight: 260
url: /net/aspose.drawing.drawing2d/graphicspath/getbounds/
---
## GetBounds() {#getbounds}

Returns a rectangle that bounds this GraphicsPath.

```csharp
public RectangleF GetBounds()
```

### Return Value

A RectangleF that represents a rectangle that bounds this GraphicsPath.

### See Also

* struct [RectangleF](../../../aspose.drawing/rectanglef/)
* class [GraphicsPath](../)
* namespace [Aspose.Drawing.Drawing2D](../../graphicspath/)
* assembly [Aspose.Drawing.Common](../../../)

---

## GetBounds(Matrix) {#getbounds_1}

Returns a rectangle that bounds this GraphicsPath when this path is transformed by the specified Matrix.

```csharp
public RectangleF GetBounds(Matrix matrix)
```

| Parameter | Type | Description |
| --- | --- | --- |
| matrix | Matrix | The Matrix that specifies a transformation to be applied to this path before the bounding rectangle is calculated. This path is not permanently transformed; the transformation is used only during the process of calculating the bounding rectangle. |

### Return Value

A RectangleF that represents a rectangle that bounds this GraphicsPath.

### See Also

* struct [RectangleF](../../../aspose.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* namespace [Aspose.Drawing.Drawing2D](../../graphicspath/)
* assembly [Aspose.Drawing.Common](../../../)

---

## GetBounds(Matrix, Pen) {#getbounds_2}

Returns a rectangle that bounds this GraphicsPath when the current path is transformed by the specified Matrix and drawn with the specified Pen.

```csharp
public RectangleF GetBounds(Matrix matrix, Pen pen)
```

| Parameter | Type | Description |
| --- | --- | --- |
| matrix | Matrix | The Matrix that specifies a transformation to be applied to this path before the bounding rectangle is calculated. This path is not permanently transformed; the transformation is used only during the process of calculating the bounding rectangle. |
| pen | Pen | The Pen with which to draw the GraphicsPath. |

### Return Value

A RectangleF that represents a rectangle that bounds this GraphicsPath.

### See Also

* struct [RectangleF](../../../aspose.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* class [Pen](../../../aspose.drawing/pen/)
* class [GraphicsPath](../)
* namespace [Aspose.Drawing.Drawing2D](../../graphicspath/)
* assembly [Aspose.Drawing.Common](../../../)


