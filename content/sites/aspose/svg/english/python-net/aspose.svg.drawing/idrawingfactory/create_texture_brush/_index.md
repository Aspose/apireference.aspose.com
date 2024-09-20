---
title: create_texture_brush method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 110
url: /python-net/aspose.svg.drawing/idrawingfactory/create_texture_brush/
is_root: false
---

## create_texture_brush {#bytes}

Creates a texture brush with the specified parameters.


### Returns 


The created [`ITextureBrush`](/svg/python-net/aspose.svg.drawing/itexturebrush).


```python
def create_texture_brush(self, image_bytes):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| image_bytes | bytes | The byte array containing the image data. |


## create_texture_brush {#bytes-aspose.svg.drawing.SpreadMode-float-aspose.svg.drawing.IMatrix}

Creates a texture brush with the specified parameters.


### Returns 


The created [`ITextureBrush`](/svg/python-net/aspose.svg.drawing/itexturebrush).


```python
def create_texture_brush(self, image_bytes, spread_mode, opacity, transformation_matrix):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| image_bytes | bytes | The byte array containing the image data. |
| spread_mode | [`SpreadMode`](/svg/python-net/aspose.svg.drawing/spreadmode) | The spread mode for the brush. See [`SpreadMode`](/svg/python-net/aspose.svg.drawing/spreadmode). |
| opacity | float | The opacity of the brush. |
| transformation_matrix | [`IMatrix`](/svg/python-net/aspose.svg.drawing/imatrix) | The transformation matrix for the brush. |


## create_texture_brush {#aspose.pydrawing.PointF-aspose.svg.drawing.IMatrix-list-aspose.pydrawing.RectangleF-float-aspose.pydrawing.RectangleF}

Creates a texture brush with the specified parameters for an elliptical shape.


### Returns 


The created [`ITextureBrush`](/svg/python-net/aspose.svg.drawing/itexturebrush).


```python
def create_texture_brush(self, center_point, transformation, interpolation_colors, bounds, opacity, elipse_rect):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| center_point | aspose.pydrawing.PointF | The center point of the ellipse. |
| transformation | [`IMatrix`](/svg/python-net/aspose.svg.drawing/imatrix) | The transformation matrix for the brush. See [`IMatrix`](/svg/python-net/aspose.svg.drawing/imatrix). |
| interpolation_colors | list | The interpolation colors for the brush. See [`IInterpolationColor`](/svg/python-net/aspose.svg.drawing/iinterpolationcolor). |
| bounds | aspose.pydrawing.RectangleF | The bounds of the brush. |
| opacity | float | The opacity of the brush. |
| elipse_rect | aspose.pydrawing.RectangleF | The rectangle defining the elliptical shape. |



### See Also
* module [`aspose.svg.drawing`](../../)
* class [`IDrawingFactory`](/svg/python-net/aspose.svg.drawing/idrawingfactory)
* class [`IInterpolationColor`](/svg/python-net/aspose.svg.drawing/iinterpolationcolor)
* class [`IMatrix`](/svg/python-net/aspose.svg.drawing/imatrix)
* class [`ITextureBrush`](/svg/python-net/aspose.svg.drawing/itexturebrush)
* class [`SpreadMode`](/svg/python-net/aspose.svg.drawing/spreadmode)
