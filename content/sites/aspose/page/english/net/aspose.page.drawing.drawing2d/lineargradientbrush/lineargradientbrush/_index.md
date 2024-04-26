---
title: LinearGradientBrush.LinearGradientBrush
second_title: Aspose.Page for .NET API Reference
description: LinearGradientBrush constructor. Initializes a new instance of the LinearGradientBrush class with the specified points and colors
type: docs
weight: 10
url: /net/aspose.page.drawing.drawing2d/lineargradientbrush/lineargradientbrush/
---
## LinearGradientBrush(PointF, PointF, Color, Color) {#constructor}

Initializes a new instance of the [`LinearGradientBrush`](../) class with the specified points and colors.

```csharp
public LinearGradientBrush(PointF point1, PointF point2, Color color1, Color color2)
```

| Parameter | Type | Description |
| --- | --- | --- |
| point1 | PointF | A [`PointF`](../../../aspose.page.drawing/pointf/) structure that represents the starting point of the linear gradient. |
| point2 | PointF | A [`PointF`](../../../aspose.page.drawing/pointf/) structure that represents the endpoint of the linear gradient. |
| color1 | Color | A [`Color`](../../../aspose.page.drawing/color/) structure that represents the starting color of the linear gradient. |
| color2 | Color | A [`Color`](../../../aspose.page.drawing/color/) structure that represents the ending color of the linear gradient. |

### See Also

* struct [PointF](../../../aspose.page.drawing/pointf/)
* struct [Color](../../../aspose.page.drawing/color/)
* class [LinearGradientBrush](../)
* namespace [Aspose.Page.Drawing.Drawing2D](../../lineargradientbrush/)
* assembly [Aspose.Page](../../../)

---

## LinearGradientBrush(RectangleF, Color, Color, LinearGradientMode) {#constructor_1}

Creates a new instance of the [`LinearGradientBrush`](../) based on a rectangle, starting and ending colors, and an orientation mode.

```csharp
public LinearGradientBrush(RectangleF rect, Color color1, Color color2, 
    LinearGradientMode linearGradientMode)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | RectangleF | A [`RectangleF`](../../../aspose.page.drawing/rectanglef/) structure that specifies the bounds of the linear gradient. |
| color1 | Color | A [`Color`](../../../aspose.page.drawing/color/) structure that represents the starting color for the gradient. |
| color2 | Color | A [`Color`](../../../aspose.page.drawing/color/) structure that represents the ending color for the gradient. |
| linearGradientMode | LinearGradientMode | A [`LinearGradientMode`](../../lineargradientmode/) enumeration element that specifies the orientation of the gradient. The orientation determines the starting and ending points of the gradient. For example, LinearGradientMode.ForwardDiagonal specifies that the starting point is the upper-left corner of the rectangle and the ending point is the lower-right corner of the rectangle. |

### See Also

* struct [RectangleF](../../../aspose.page.drawing/rectanglef/)
* struct [Color](../../../aspose.page.drawing/color/)
* enum [LinearGradientMode](../../lineargradientmode/)
* class [LinearGradientBrush](../)
* namespace [Aspose.Page.Drawing.Drawing2D](../../lineargradientbrush/)
* assembly [Aspose.Page](../../../)

---

## LinearGradientBrush(RectangleF, Color, Color, float) {#constructor_2}

Creates a new instance of the [`LinearGradientBrush`](../) class based on a rectangle, starting and ending colors, and an orientation angle.

```csharp
public LinearGradientBrush(RectangleF rect, Color color1, Color color2, float angle)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | RectangleF | A [`RectangleF`](../../../aspose.page.drawing/rectanglef/) structure that specifies the bounds of the linear gradient. |
| color1 | Color | A [`Color`](../../../aspose.page.drawing/color/) structure that represents the starting color for the gradient. |
| color2 | Color | A [`Color`](../../../aspose.page.drawing/color/) structure that represents the ending color for the gradient. |
| angle | Single | The angle, measured in degrees clockwise from the x-axis, of the gradient's orientation line. |

### See Also

* struct [RectangleF](../../../aspose.page.drawing/rectanglef/)
* struct [Color](../../../aspose.page.drawing/color/)
* class [LinearGradientBrush](../)
* namespace [Aspose.Page.Drawing.Drawing2D](../../lineargradientbrush/)
* assembly [Aspose.Page](../../../)

---

## LinearGradientBrush(RectangleF, Color, Color, float, bool) {#constructor_3}

Creates a new instance of the [`LinearGradientBrush`](../) class based on a rectangle, starting and ending colors, and an orientation angle.

```csharp
public LinearGradientBrush(RectangleF rect, Color color1, Color color2, float angle, 
    bool isAngleScaleable)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | RectangleF | A [`RectangleF`](../../../aspose.page.drawing/rectanglef/) structure that specifies the bounds of the linear gradient. |
| color1 | Color | A [`Color`](../../../aspose.page.drawing/color/) structure that represents the starting color for the gradient. |
| color2 | Color | A [`Color`](../../../aspose.page.drawing/color/) structure that represents the ending color for the gradient. |
| angle | Single | The angle, measured in degrees clockwise from the x-axis, of the gradient's orientation line. |
| isAngleScaleable | Boolean | Set to true to specify that the angle is affected by the transform associated with this [`LinearGradientBrush`](../); otherwise, false. |

### See Also

* struct [RectangleF](../../../aspose.page.drawing/rectanglef/)
* struct [Color](../../../aspose.page.drawing/color/)
* class [LinearGradientBrush](../)
* namespace [Aspose.Page.Drawing.Drawing2D](../../lineargradientbrush/)
* assembly [Aspose.Page](../../../)


