---
title: LinearGradientBrush.LinearGradientBrush
second_title: Aspose.Drawing for .NET API Reference
description: LinearGradientBrush constructor. Initializes a new instance of the LinearGradientBrush class with the specified points and colors
type: docs
weight: 10
url: /net/system.drawing.drawing2d/lineargradientbrush/lineargradientbrush/
---
## LinearGradientBrush(PointF, PointF, Color, Color) {#constructor_1}

Initializes a new instance of the [`LinearGradientBrush`](../) class with the specified points and colors.

```csharp
public LinearGradientBrush(PointF point1, PointF point2, Color color1, Color color2)
```

| Parameter | Type | Description |
| --- | --- | --- |
| point1 | PointF | A PointF structure that represents the starting point of the linear gradient. |
| point2 | PointF | A PointF structure that represents the endpoint of the linear gradient. |
| color1 | Color | A Color structure that represents the starting color of the linear gradient. |
| color2 | Color | A Color structure that represents the ending color of the linear gradient. |

### See Also

* struct [PointF](../../../system.drawing/pointf/)
* struct [Color](../../../system.drawing/color/)
* class [LinearGradientBrush](../)
* namespace [System.Drawing.Drawing2D](../../lineargradientbrush/)
* assembly [Aspose.Drawing](../../../)

---

## LinearGradientBrush(Point, Point, Color, Color) {#constructor}

Initializes a new instance of the [`LinearGradientBrush`](../) class with the specified points and colors.

```csharp
public LinearGradientBrush(Point point1, Point point2, Color color1, Color color2)
```

| Parameter | Type | Description |
| --- | --- | --- |
| point1 | Point | A Point structure that represents the starting point of the linear gradient. |
| point2 | Point | A Point structure that represents the endpoint of the linear gradient. |
| color1 | Color | A Color structure that represents the starting color of the linear gradient. |
| color2 | Color | A Color structure that represents the ending color of the linear gradient. |

### See Also

* struct [Point](../../../system.drawing/point/)
* struct [Color](../../../system.drawing/color/)
* class [LinearGradientBrush](../)
* namespace [System.Drawing.Drawing2D](../../lineargradientbrush/)
* assembly [Aspose.Drawing](../../../)

---

## LinearGradientBrush(RectangleF, Color, Color, LinearGradientMode) {#constructor_7}

Initializes a new instance of the [`LinearGradientBrush`](../) class based on a rectangle, starting and ending colors, and an orientation mode.

```csharp
public LinearGradientBrush(RectangleF rect, Color color1, Color color2, 
    LinearGradientMode linearGradientMode)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | RectangleF | A RectangleF structure that specifies the bounds of the linear gradient. |
| color1 | Color | A Color structure that represents the starting color for the gradient. |
| color2 | Color | A Color structure that represents the ending color for the gradient. |
| linearGradientMode | LinearGradientMode | A LinearGradientMode enumeration element that specifies the orientation of the gradient. The orientation determines the starting and ending points of the gradient. For example, LinearGradientMode.ForwardDiagonal specifies that the starting point is the upper-left corner of the rectangle and the ending point is the lower-right corner of the rectangle. |

### See Also

* struct [RectangleF](../../../system.drawing/rectanglef/)
* struct [Color](../../../system.drawing/color/)
* enum [LinearGradientMode](../../lineargradientmode/)
* class [LinearGradientBrush](../)
* namespace [System.Drawing.Drawing2D](../../lineargradientbrush/)
* assembly [Aspose.Drawing](../../../)

---

## LinearGradientBrush(Rectangle, Color, Color, LinearGradientMode) {#constructor_4}

Initializes a new instance of the [`LinearGradientBrush`](../) class based on a rectangle, starting and ending colors, and orientation.

```csharp
public LinearGradientBrush(Rectangle rect, Color color1, Color color2, 
    LinearGradientMode linearGradientMode)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | Rectangle | A Rectangle structure that specifies the bounds of the linear gradient. |
| color1 | Color | A Color structure that represents the starting color for the gradient. |
| color2 | Color | A Color structure that represents the ending color for the gradient. |
| linearGradientMode | LinearGradientMode | A LinearGradientMode enumeration element that specifies the orientation of the gradient. The orientation determines the starting and ending points of the gradient. For example, LinearGradientMode.ForwardDiagonal specifies that the starting point is the upper-left corner of the rectangle and the ending point is the lower-right corner of the rectangle. |

### See Also

* struct [Rectangle](../../../system.drawing/rectangle/)
* struct [Color](../../../system.drawing/color/)
* enum [LinearGradientMode](../../lineargradientmode/)
* class [LinearGradientBrush](../)
* namespace [System.Drawing.Drawing2D](../../lineargradientbrush/)
* assembly [Aspose.Drawing](../../../)

---

## LinearGradientBrush(RectangleF, Color, Color, float) {#constructor_5}

Initializes a new instance of the [`LinearGradientBrush`](../) class based on a rectangle, starting and ending colors, and an orientation angle.

```csharp
public LinearGradientBrush(RectangleF rect, Color color1, Color color2, float angle)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | RectangleF | A RectangleF structure that specifies the bounds of the linear gradient. |
| color1 | Color | A Color structure that represents the starting color for the gradient. |
| color2 | Color | A Color structure that represents the ending color for the gradient. |
| angle | Single | The angle, measured in degrees clockwise from the x-axis, of the gradient's orientation line. |

### See Also

* struct [RectangleF](../../../system.drawing/rectanglef/)
* struct [Color](../../../system.drawing/color/)
* class [LinearGradientBrush](../)
* namespace [System.Drawing.Drawing2D](../../lineargradientbrush/)
* assembly [Aspose.Drawing](../../../)

---

## LinearGradientBrush(RectangleF, Color, Color, float, bool) {#constructor_6}

Initializes a new instance of the [`LinearGradientBrush`](../) class based on a rectangle, starting and ending colors, and an orientation angle.

```csharp
public LinearGradientBrush(RectangleF rect, Color color1, Color color2, float angle, 
    bool isAngleScaleable)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | RectangleF | A RectangleF structure that specifies the bounds of the linear gradient. |
| color1 | Color | A Color structure that represents the starting color for the gradient. |
| color2 | Color | A Color structure that represents the ending color for the gradient. |
| angle | Single | The angle, measured in degrees clockwise from the x-axis, of the gradient's orientation line. |
| isAngleScaleable | Boolean | Set to true to specify that the angle is affected by the transform associated with this LinearGradientBrush; otherwise, false. |

### See Also

* struct [RectangleF](../../../system.drawing/rectanglef/)
* struct [Color](../../../system.drawing/color/)
* class [LinearGradientBrush](../)
* namespace [System.Drawing.Drawing2D](../../lineargradientbrush/)
* assembly [Aspose.Drawing](../../../)

---

## LinearGradientBrush(Rectangle, Color, Color, float) {#constructor_2}

Initializes a new instance of the [`LinearGradientBrush`](../) class based on a rectangle, starting and ending colors, and an orientation angle.

```csharp
public LinearGradientBrush(Rectangle rect, Color color1, Color color2, float angle)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | Rectangle | A Rectangle structure that specifies the bounds of the linear gradient. |
| color1 | Color | A Color structure that represents the starting color for the gradient. |
| color2 | Color | A Color structure that represents the ending color for the gradient. |
| angle | Single | The angle, measured in degrees clockwise from the x-axis, of the gradient's orientation line. |

### See Also

* struct [Rectangle](../../../system.drawing/rectangle/)
* struct [Color](../../../system.drawing/color/)
* class [LinearGradientBrush](../)
* namespace [System.Drawing.Drawing2D](../../lineargradientbrush/)
* assembly [Aspose.Drawing](../../../)

---

## LinearGradientBrush(Rectangle, Color, Color, float, bool) {#constructor_3}

Initializes a new instance of the [`LinearGradientBrush`](../) class based on a rectangle, starting and ending colors, and an orientation angle.

```csharp
public LinearGradientBrush(Rectangle rect, Color color1, Color color2, float angle, 
    bool isAngleScaleable)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | Rectangle | A Rectangle structure that specifies the bounds of the linear gradient. |
| color1 | Color | A Color structure that represents the starting color for the gradient. |
| color2 | Color | A Color structure that represents the ending color for the gradient. |
| angle | Single | The angle, measured in degrees clockwise from the x-axis, of the gradient's orientation line. |
| isAngleScaleable | Boolean | Set to true to specify that the angle is affected by the transform associated with this LinearGradientBrush; otherwise, false. |

### See Also

* struct [Rectangle](../../../system.drawing/rectangle/)
* struct [Color](../../../system.drawing/color/)
* class [LinearGradientBrush](../)
* namespace [System.Drawing.Drawing2D](../../lineargradientbrush/)
* assembly [Aspose.Drawing](../../../)


