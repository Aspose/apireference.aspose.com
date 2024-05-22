---
title: ar method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.svg.builder/pathbuilder/ar/
is_root: false
---

## ar {#float-float-float-bool-bool-float-float}

Adds a relative 'Elliptical Arc Curve' command to the path data.


### Returns 


The current PathBuilder instance.


```python
def ar(self, r1, r2, angle, large_arc_flag, sweep_flag, x, y):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| r1 | float | The x-radius of the ellipse, relative to the current position. |
| r2 | float | The y-radius of the ellipse, relative to the current position. |
| angle | float | The rotation angle of the ellipse in degrees, relative to the current position. |
| large_arc_flag | bool | Flag indicating if the arc should be greater than or equal to 180 degrees. |
| sweep_flag | bool | Flag indicating if the arc should be drawn in a positive angle direction. |
| x | float | The x-coordinate of the end point of the arc, relative to the current position. |
| y | float | The y-coordinate of the end point of the arc, relative to the current position. |



### See Also
* module [`aspose.svg.builder`](../../)
* class [`PathBuilder`](/svg/python-net/aspose.svg.builder/pathbuilder)
