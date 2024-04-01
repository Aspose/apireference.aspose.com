---
title: XpsDocument.CreateArcSegment
second_title: Aspose.Page for .NET API Reference
description: XpsDocument method. Creates a new elliptical arc segment
type: docs
weight: 170
url: /net/aspose.page.xps/xpsdocument/createarcsegment/
---
## XpsDocument.CreateArcSegment method

Creates a new elliptical arc segment.

```csharp
public XpsArcSegment CreateArcSegment(PointF point, SizeF size, float rotationAngle, 
    bool isLargeArc, XpsSweepDirection sweepDirection, bool isStroked = true)
```

| Parameter | Type | Description |
| --- | --- | --- |
| point | PointF | The endpoint of the elliptical arc. |
| size | SizeF | The x and y radius of the elliptical arc as an x,y pair. |
| rotationAngle | Single | Indicates how the ellipse is rotated relative to the current coordinate system. |
| isLargeArc | Boolean | Determines whether the arc is drawn with a sweep of 180 or greater. |
| sweepDirection | XpsSweepDirection | The direction in which the arc is drawn. |
| isStroked | Boolean | Specifies whether the stroke for this segment of the path is drawn. |

### Return Value

New elliptical arc segment.

### See Also

* class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* class [XpsDocument](../)
* namespace [Aspose.Page.XPS](../../xpsdocument/)
* assembly [Aspose.Page](../../../)


