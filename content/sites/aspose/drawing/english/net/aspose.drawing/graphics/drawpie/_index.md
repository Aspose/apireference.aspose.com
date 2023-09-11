---
title: Graphics.DrawPie
second_title: Aspose.Drawing for .NET API Reference
description: Graphics method. Draws a pie shape defined by an ellipse specified by a RectangleF structure and two radial lines
type: docs
weight: 400
url: /net/aspose.drawing/graphics/drawpie/
---
## DrawPie(Pen, RectangleF, float, float) {#drawpie}

Draws a pie shape defined by an ellipse specified by a RectangleF structure and two radial lines.

```csharp
public void DrawPie(Pen pen, RectangleF rect, float startAngle, float sweepAngle)
```

| Parameter | Type | Description |
| --- | --- | --- |
| pen | Pen | Pen that determines the color, width, and style of the pie shape. |
| rect | RectangleF | RectangleF structure that represents the bounding rectangle that defines the ellipse from which the pie shape comes. |
| startAngle | Single | Angle measured in degrees clockwise from the x-axis to the first side of the pie shape. |
| sweepAngle | Single | Angle measured in degrees clockwise from the startAngle parameter to the second side of the pie shape. |

### See Also

* class [Pen](../../pen/)
* struct [RectangleF](../../rectanglef/)
* class [Graphics](../)
* namespace [Aspose.Drawing](../../graphics/)
* assembly [Aspose.Drawing.Common](../../../)

---

## DrawPie(Pen, float, float, float, float, float, float) {#drawpie_1}

Draws a pie shape defined by an ellipse specified by a coordinate pair, a width, a height, and two radial lines.

```csharp
public void DrawPie(Pen pen, float x, float y, float width, float height, float startAngle, 
    float sweepAngle)
```

| Parameter | Type | Description |
| --- | --- | --- |
| pen | Pen | Pen that determines the color, width, and style of the pie shape. |
| x | Single | The x-coordinate of the upper-left corner of the bounding rectangle that defines the ellipse from which the pie shape comes. |
| y | Single | The y-coordinate of the upper-left corner of the bounding rectangle that defines the ellipse from which the pie shape comes. |
| width | Single | Width of the bounding rectangle that defines the ellipse from which the pie shape comes. |
| height | Single | Height of the bounding rectangle that defines the ellipse from which the pie shape comes. |
| startAngle | Single | Angle measured in degrees clockwise from the x-axis to the first side of the pie shape. |
| sweepAngle | Single | Angle measured in degrees clockwise from the startAngle parameter to the second side of the pie shape. |

### See Also

* class [Pen](../../pen/)
* class [Graphics](../)
* namespace [Aspose.Drawing](../../graphics/)
* assembly [Aspose.Drawing.Common](../../../)


