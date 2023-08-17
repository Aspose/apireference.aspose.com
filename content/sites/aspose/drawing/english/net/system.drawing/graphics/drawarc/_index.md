---
title: Graphics.DrawArc
second_title: Aspose.Drawing for .NET API Reference
description: Graphics method. Draws an arc representing a portion of an ellipse specified by a RectangleF structure
type: docs
weight: 260
url: /net/system.drawing/graphics/drawarc/
---
## DrawArc(Pen, RectangleF, float, float) {#drawarc_1}

Draws an arc representing a portion of an ellipse specified by a RectangleF structure.

```csharp
public void DrawArc(Pen pen, RectangleF rect, float startAngle, float sweepAngle)
```

| Parameter | Type | Description |
| --- | --- | --- |
| pen | Pen | Pen that determines the color, width, and style of the arc. |
| rect | RectangleF | RectangleF structure that defines the boundaries of the ellipse. |
| startAngle | Single | Angle in degrees measured clockwise from the x-axis to the starting point of the arc. |
| sweepAngle | Single | Angle in degrees measured clockwise from the startAngle parameter to ending point of the arc. |

### See Also

* class [Pen](../../pen/)
* struct [RectangleF](../../rectanglef/)
* class [Graphics](../)
* namespace [System.Drawing](../../graphics/)
* assembly [Aspose.Drawing](../../../)

---

## DrawArc(Pen, float, float, float, float, float, float) {#drawarc}

Draws an arc representing a portion of an ellipse specified by a pair of coordinates, a width, and a height.

```csharp
public void DrawArc(Pen pen, float x, float y, float width, float height, float startAngle, 
    float sweepAngle)
```

| Parameter | Type | Description |
| --- | --- | --- |
| pen | Pen | Pen that determines the color, width, and style of the arc. |
| x | Single | The x-coordinate of the upper-left corner of the rectangle that defines the ellipse. |
| y | Single | The y-coordinate of the upper-left corner of the rectangle that defines the ellipse. |
| width | Single | Width of the rectangle that defines the ellipse. |
| height | Single | Height of the rectangle that defines the ellipse. |
| startAngle | Single | Angle in degrees measured clockwise from the x-axis to the starting point of the arc. |
| sweepAngle | Single | Angle in degrees measured clockwise from the startAngle parameter to ending point of the arc. |

### See Also

* class [Pen](../../pen/)
* class [Graphics](../)
* namespace [System.Drawing](../../graphics/)
* assembly [Aspose.Drawing](../../../)


