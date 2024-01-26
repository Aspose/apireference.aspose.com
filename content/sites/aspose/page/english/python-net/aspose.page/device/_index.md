---
title: Device class
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.page/device/
is_root: false
---

## Device class

This class encapsulates rendering of document to abstract device.
Rendering of the document is performed page by page.



The Device type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [creator](/page/python-net/aspose.page/device/creator) | Returns or specifies creator of resulting device output. |
| [size](/page/python-net/aspose.page/device/size) | Returns or specifies a size of the page. |
| [is_direct_rgb](/page/python-net/aspose.page/device/is_direct_rgb) | Indicates whether device uses direct RGB mode, that is RGB. |
| [background](/page/python-net/aspose.page/device/background) | Returns or specifies current background of the page. |
| [opacity](/page/python-net/aspose.page/device/opacity) | Returns or specifies current opacity. |
| [stroke](/page/python-net/aspose.page/device/stroke) | Returns or specifies current stroke. |
| [paint](/page/python-net/aspose.page/device/paint) | Returns or specifies current paint. |
| [opacity_mask](/page/python-net/aspose.page/device/opacity_mask) | Returns or specifies current opacity mask. |
| [char_tm](/page/python-net/aspose.page/device/char_tm) | Returns or specifies current characters transform. |
| [text_rendering_mode](/page/python-net/aspose.page/device/text_rendering_mode) | Returns or specifies current text rendering mode. |
| [text_stroke_width](/page/python-net/aspose.page/device/text_stroke_width) | Returns or specifies current text stroke width. |
| [version](/page/python-net/aspose.page/device/version) | Current device version. |


### Methods
| Method | Description |
| :- | :- |
| [rotate](/page/python-net/aspose.page/device/rotate/#float) | Rotate the current transformation matrix. Calls writeTransform(Transform).<br/>Rotating with a positive angle theta rotates points on the positive x axis<br/>toward the positive y axis. |
| [rotate](/page/python-net/aspose.page/device/rotate/#float-float-float) | Rotate the current transformation matrix around a point. |
| [draw_polyline](/page/python-net/aspose.page/device/draw_polyline/#list-list-int) | Draws a polyline. |
| [draw_polyline](/page/python-net/aspose.page/device/draw_polyline/#list-list-int) | Draws a polyline. |
| [draw_polygon](/page/python-net/aspose.page/device/draw_polygon/#list-list-int) | Draws a polygon. |
| [draw_polygon](/page/python-net/aspose.page/device/draw_polygon/#list-list-int) | Draws a poligone. |
| [fill_polygon](/page/python-net/aspose.page/device/fill_polygon/#list-list-int) | Fills a poligone. |
| [fill_polygon](/page/python-net/aspose.page/device/fill_polygon/#list-list-int) | Fills a poligone. |
| [re_new](/page/python-net/aspose.page/device/re_new/#) | Reset device to initial state for whole document. Used for reseting output stream. |
| [get_property](/page/python-net/aspose.page/device/get_property/#str) | Gets a value of string property. |
| [get_property_color](/page/python-net/aspose.page/device/get_property_color/#str) | Gets a value of color property. |
| [get_property_rectangle](/page/python-net/aspose.page/device/get_property_rectangle/#str) | Gets a value of rectangle property. |
| [get_property_margins](/page/python-net/aspose.page/device/get_property_margins/#str) | Gets a value of margin property. |
| [get_property_size](/page/python-net/aspose.page/device/get_property_size/#str) | Gets a value of size property. |
| [get_property_int](/page/python-net/aspose.page/device/get_property_int/#str) | Gets a value of integer property. |
| [get_property_double](/page/python-net/aspose.page/device/get_property_double/#str) | Gets a value of double property. |
| [is_property](/page/python-net/aspose.page/device/is_property/#str) | Gets a value of boolean property. |
| [create](/page/python-net/aspose.page/device/create/#) | Creates a copy of this device. |
| [set_transform](/page/python-net/aspose.page/device/set_transform/#aspose.pydrawing.drawing2d.Matrix) | Specifies current transform. |
| [get_transform](/page/python-net/aspose.page/device/get_transform/#) | Gets current transform. |
| [transform](/page/python-net/aspose.page/device/transform/#aspose.pydrawing.drawing2d.Matrix) | Transforms the current transformation matrix. Calls writeTransform(Transform) |
| [translate](/page/python-net/aspose.page/device/translate/#float-float) | Translates the current transformation matrix. Calls writeTransform(Transform). |
| [scale](/page/python-net/aspose.page/device/scale/#float-float) | Scales the current transformation matrix. Calls writeTransform(Transform). |
| [shear](/page/python-net/aspose.page/device/shear/#float-float) | Shears the current transformation matrix. Calls writeTransform(Transform). |
| [init_clip](/page/python-net/aspose.page/device/init_clip/#) | Initializes clip of the device. |
| [set_clip](/page/python-net/aspose.page/device/set_clip/#aspose.pydrawing.drawing2d.GraphicsPath) | Specifies the clip of the device. |
| [draw](/page/python-net/aspose.page/device/draw/#aspose.pydrawing.drawing2d.GraphicsPath) | Draws a path. |
| [fill](/page/python-net/aspose.page/device/fill/#aspose.pydrawing.drawing2d.GraphicsPath) | Fills a path. |
| [draw_string](/page/python-net/aspose.page/device/draw_string/#str-float-float) | Draws a string at given point. |
| [draw_image](/page/python-net/aspose.page/device/draw_image/#aspose.pydrawing.Bitmap-aspose.pydrawing.drawing2d.Matrix-aspose.pydrawing.Color) | Draws an image with assigned transform and background. |
| [start_document](/page/python-net/aspose.page/device/start_document/#) | Makes necessary preparation of device before start rendering of document. |
| [end_document](/page/python-net/aspose.page/device/end_document/#) | Makes necessary preparation of device after the document has been rendered. |
| [dispose](/page/python-net/aspose.page/device/dispose/#) | Disposes the device. |
| [reset](/page/python-net/aspose.page/device/reset/#) | Reset the device to initial state for a page. |
| [write_comment](/page/python-net/aspose.page/device/write_comment/#str) | Writes a comment. |
| [draw_arc](/page/python-net/aspose.page/device/draw_arc/#float-float-float-float-float-float) | Draws an arc. |
| [draw_line](/page/python-net/aspose.page/device/draw_line/#float-float-float-float) | Draws a line segment. |
| [draw_oval](/page/python-net/aspose.page/device/draw_oval/#float-float-float-float) | Draws an oval. |
| [draw_rect](/page/python-net/aspose.page/device/draw_rect/#float-float-float-float) | Draws a rectangle. |
| [draw_round_rect](/page/python-net/aspose.page/device/draw_round_rect/#float-float-float-float-float-float) | Draws a round rectangle. |
| [fill_arc](/page/python-net/aspose.page/device/fill_arc/#float-float-float-float-float-float) | Fills an arc. |
| [fill_oval](/page/python-net/aspose.page/device/fill_oval/#float-float-float-float) | Fills an oval. |
| [fill_rect](/page/python-net/aspose.page/device/fill_rect/#float-float-float-float) | Fills a rectangle. |
| [fill_round_rect](/page/python-net/aspose.page/device/fill_round_rect/#float-float-float-float-float-float) | Fills a round rectangle. |



### See Also
* module [`aspose.page`](..)
