---
title: create_arc_segment method
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.page.xps/xpsdocument/create_arc_segment/
is_root: false
---

## create_arc_segment {#aspose.pydrawing.PointF-aspose.pydrawing.SizeF-float-bool-aspose.page.xps.xpsmodel.XpsSweepDirection-bool}

Creates a new elliptical arc segment.


### Returns 


New elliptical arc segment.


```python
def create_arc_segment(self, point, size, rotation_angle, is_large_arc, sweep_direction, is_stroked):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| point | aspose.pydrawing.PointF | The endpoint of the elliptical arc. |
| size | aspose.pydrawing.SizeF | The x and y radius of the elliptical arc as an x,y pair. |
| rotation_angle | float | Indicates how the ellipse is rotated relative to the current coordinate system. |
| is_large_arc | bool | Determines whether the arc is drawn with a sweep of 180 or greater. |
| sweep_direction | aspose.page.xps.xpsmodel.XpsSweepDirection | The direction in which the arc is drawn. |
| is_stroked | bool | Specifies whether the stroke for this segment of the path is drawn. |



### See Also
* module [`aspose.page.xps`](../../)
* class [`XpsArcSegment`](/page/python-net/aspose.page.xps.xpsmodel/xpsarcsegment)
* class [`XpsDocument`](/page/python-net/aspose.page.xps/xpsdocument)
