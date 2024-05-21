---
title: is_point_in_path method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 150
url: /aspose.svg.rendering/icanvas/is_point_in_path/
is_root: false
---

## is_point_in_path {#float-float-aspose.svg.drawing.FillRule}

Determines whether the specified point is inside the current path using the specified fill rule.


### Returns 


`true` if the point is inside the path; otherwise, `false`.


```python
def is_point_in_path(self, x, y, mode):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| x | float | The x-coordinate of the point to test. |
| y | float | The y-coordinate of the point to test. |
| mode | aspose.svg.drawing.FillRule | The fill rule to use for testing. See [`FillRule`](./aspose.svg.drawing/fillrule). |


## is_point_in_path {#aspose.svg.rendering.IPath-float-float-aspose.svg.drawing.FillRule}

Determines whether the specified point is inside the specified path using the specified fill rule.


### Returns 


`true` if the point is inside the path; otherwise, `false`.


```python
def is_point_in_path(self, path, x, y, mode):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| path | [`IPath`](./aspose.svg.rendering/ipath) | The path to test.See [`IPath`](./aspose.svg.rendering/ipath). |
| x | float | The x-coordinate of the point to test. |
| y | float | The y-coordinate of the point to test. |
| mode | aspose.svg.drawing.FillRule | The fill rule to use for testing. See [`FillRule`](./aspose.svg.drawing/fillrule). |



### See Also
* module [`aspose.svg.rendering`](../../)
* class [`FillRule`](./aspose.svg.drawing/fillrule)
* class [`ICanvas`](./aspose.svg.rendering/icanvas)
* class [`IPath`](./aspose.svg.rendering/ipath)
