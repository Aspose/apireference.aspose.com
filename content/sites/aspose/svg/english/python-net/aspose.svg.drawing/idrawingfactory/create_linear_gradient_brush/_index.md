---
title: create_linear_gradient_brush method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.svg.drawing/idrawingfactory/create_linear_gradient_brush/
is_root: false
---

## create_linear_gradient_brush {#aspose.pydrawing.RectangleF-list}

Creates a linear gradient brush with the specified parameters.


### Returns 


The created [`ILinearGradientBrush`](/svg/python-net/aspose.svg.drawing/ilineargradientbrush).


```python
def create_linear_gradient_brush(self, rect, colors):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| rect | aspose.pydrawing.RectangleF | The rectangle defining the gradient bounds. |
| colors | list | The interpolation colors for the gradient. See [`IInterpolationColor`](/svg/python-net/aspose.svg.drawing/iinterpolationcolor). |


## create_linear_gradient_brush {#aspose.pydrawing.RectangleF-float-bool-list-aspose.svg.drawing.SpreadMode}

Creates a linear gradient brush with the specified parameters.


### Returns 


The created [`ILinearGradientBrush`](/svg/python-net/aspose.svg.drawing/ilineargradientbrush).


```python
def create_linear_gradient_brush(self, rect, angle, is_scaled, colors, spread_mode):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| rect | aspose.pydrawing.RectangleF | The rectangle defining the gradient bounds. |
| angle | float | The angle of the gradient. |
| is_scaled | bool | Determines whether the angle is affected by transformation matrix associated with the brush. |
| colors | list | The interpolation colors for the gradient. See [`IInterpolationColor`](/svg/python-net/aspose.svg.drawing/iinterpolationcolor). |
| spread_mode | [`SpreadMode`](/svg/python-net/aspose.svg.drawing/spreadmode) | The spread mode for the gradient. See [`SpreadMode`](/svg/python-net/aspose.svg.drawing/spreadmode). |



### See Also
* module [`aspose.svg.drawing`](../../)
* class [`IDrawingFactory`](/svg/python-net/aspose.svg.drawing/idrawingfactory)
* class [`IInterpolationColor`](/svg/python-net/aspose.svg.drawing/iinterpolationcolor)
* class [`ILinearGradientBrush`](/svg/python-net/aspose.svg.drawing/ilineargradientbrush)
* class [`SpreadMode`](/svg/python-net/aspose.svg.drawing/spreadmode)
