---
title: ImageDevice class
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.page.xps.presentation.image/imagedevice/
is_root: false
---

## ImageDevice class

Class incapsulating image composing device.



**Inheritance:** [`ImageDevice`](/page/python-net/aspose.page.xps.presentation.image/imagedevice) → 
[`Device`](/page/python-net/aspose.page/device)



The ImageDevice type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/page/python-net/aspose.page.xps.presentation.image/imagedevice/__init__/#) | Creates the new instance. |
| [__init__](/page/python-net/aspose.page.xps.presentation.image/imagedevice/__init__/#aspose.pydrawing.Size) | Creates the new instance with specified media size. |


### Properties
| Property | Description |
| :- | :- |
| [creator](/page/python-net/aspose.page.xps.presentation.image/imagedevice/creator) | Returns or specifies creator of resulting device output. |
| [size](/page/python-net/aspose.page.xps.presentation.image/imagedevice/size) | Gets/sets the device media size. |
| [is_direct_rgb](/page/python-net/aspose.page.xps.presentation.image/imagedevice/is_direct_rgb) | Indicates whether device uses direct RGB mode, that is RGB. |
| [background](/page/python-net/aspose.page.xps.presentation.image/imagedevice/background) | Gets/sets the background color. |
| [opacity](/page/python-net/aspose.page.xps.presentation.image/imagedevice/opacity) | Gets/sets the opacity. |
| [stroke](/page/python-net/aspose.page.xps.presentation.image/imagedevice/stroke) | Gets/sets the stroke for drawing paths. |
| [paint](/page/python-net/aspose.page.xps.presentation.image/imagedevice/paint) | Gets/sets the brush for filling paths. |
| [opacity_mask](/page/python-net/aspose.page.xps.presentation.image/imagedevice/opacity_mask) | Gets/sets the brush for opacity mask. The mask applies over Paint or Strike. |
| [char_tm](/page/python-net/aspose.page.xps.presentation.image/imagedevice/char_tm) | Returns or specifies current characters transform. |
| [text_rendering_mode](/page/python-net/aspose.page.xps.presentation.image/imagedevice/text_rendering_mode) | Returns or specifies current text rendering mode. |
| [text_stroke_width](/page/python-net/aspose.page.xps.presentation.image/imagedevice/text_stroke_width) | Returns or specifies current text stroke width. |
| [version](/page/python-net/aspose.page.xps.presentation.image/imagedevice/version) | Current device version. |
| [result](/page/python-net/aspose.page.xps.presentation.image/imagedevice/result) | Returns the resulting images byte arrays.<br/>The first dimension is for inner documents<br/>and the second one is for pages within inner documents. |
| [current_page_number](/page/python-net/aspose.page.xps.presentation.image/imagedevice/current_page_number) | Returns the absolute number of the current page within the document. |
| [current_relative_page_number](/page/python-net/aspose.page.xps.presentation.image/imagedevice/current_relative_page_number) | Returns the relative number of the current page within the current partition. |


### Methods
| Method | Description |
| :- | :- |
| [rotate](/page/python-net/aspose.page.xps.presentation.image/imagedevice/rotate/#float) | Applies a clockwise rotation about the origin to the current transformation matrix. |
| [rotate](/page/python-net/aspose.page.xps.presentation.image/imagedevice/rotate/#float-float-float) | Rotate the current transformation matrix around a point. |
| [draw_polyline](/page/python-net/aspose.page.xps.presentation.image/imagedevice/draw_polyline/#list-list-int) | Draws a polyline. |
| [draw_polyline](/page/python-net/aspose.page.xps.presentation.image/imagedevice/draw_polyline/#list-list-int) | Draws a polyline. |
| [draw_polygon](/page/python-net/aspose.page.xps.presentation.image/imagedevice/draw_polygon/#list-list-int) | Draws a polygon. |
| [draw_polygon](/page/python-net/aspose.page.xps.presentation.image/imagedevice/draw_polygon/#list-list-int) | Draws a poligone. |
| [fill_polygon](/page/python-net/aspose.page.xps.presentation.image/imagedevice/fill_polygon/#list-list-int) | Fills a poligone. |
| [fill_polygon](/page/python-net/aspose.page.xps.presentation.image/imagedevice/fill_polygon/#list-list-int) | Fills a poligone. |
| [open_page](/page/python-net/aspose.page.xps.presentation.image/imagedevice/open_page/#str) | Starts a new page with the specifies title. |
| [open_page](/page/python-net/aspose.page.xps.presentation.image/imagedevice/open_page/#float-float) | Starts a new page with the specified width and height. |
| [re_new](/page/python-net/aspose.page.xps.presentation.image/imagedevice/re_new/#) | Sets the devices to the initial state. |
| [get_property](/page/python-net/aspose.page.xps.presentation.image/imagedevice/get_property/#str) | Gets a value of string property. |
| [get_property_color](/page/python-net/aspose.page.xps.presentation.image/imagedevice/get_property_color/#str) | Gets a value of color property. |
| [get_property_rectangle](/page/python-net/aspose.page.xps.presentation.image/imagedevice/get_property_rectangle/#str) | Gets a value of rectangle property. |
| [get_property_margins](/page/python-net/aspose.page.xps.presentation.image/imagedevice/get_property_margins/#str) | Gets a value of margin property. |
| [get_property_size](/page/python-net/aspose.page.xps.presentation.image/imagedevice/get_property_size/#str) | Gets a value of size property. |
| [get_property_int](/page/python-net/aspose.page.xps.presentation.image/imagedevice/get_property_int/#str) | Gets a value of integer property. |
| [get_property_double](/page/python-net/aspose.page.xps.presentation.image/imagedevice/get_property_double/#str) | Gets a value of double property. |
| [is_property](/page/python-net/aspose.page.xps.presentation.image/imagedevice/is_property/#str) | Gets a value of boolean property. |
| [create](/page/python-net/aspose.page.xps.presentation.image/imagedevice/create/#) | Creates a new instance of the device based on this device instance.<br/>Writes this device graphics state, i.e. creates ApsCanvas instance(s)<br/>with corresponding RenderTransform and Clip properties. |
| [set_transform](/page/python-net/aspose.page.xps.presentation.image/imagedevice/set_transform/#aspose.pydrawing.drawing2d.Matrix) | Sets the current transformation matrix. |
| [get_transform](/page/python-net/aspose.page.xps.presentation.image/imagedevice/get_transform/#) | Returns the current transformation matrix. |
| [transform](/page/python-net/aspose.page.xps.presentation.image/imagedevice/transform/#aspose.pydrawing.drawing2d.Matrix) | Multiplies the current transformation matrix by the specified Matrix. |
| [translate](/page/python-net/aspose.page.xps.presentation.image/imagedevice/translate/#float-float) | Applies the specified translation vector to the current transformation matrix. |
| [scale](/page/python-net/aspose.page.xps.presentation.image/imagedevice/scale/#float-float) | Applies the specified scale vector to the current transformation matrix. |
| [shear](/page/python-net/aspose.page.xps.presentation.image/imagedevice/shear/#float-float) | Applies the specified shear vector to the current transformation matrix. |
| [init_clip](/page/python-net/aspose.page.xps.presentation.image/imagedevice/init_clip/#) | Initializes clip of the device. |
| [set_clip](/page/python-net/aspose.page.xps.presentation.image/imagedevice/set_clip/#aspose.pydrawing.drawing2d.GraphicsPath) | Adds the specified path to the current clip path. |
| [draw](/page/python-net/aspose.page.xps.presentation.image/imagedevice/draw/#aspose.pydrawing.drawing2d.GraphicsPath) | Draws the specified path. |
| [fill](/page/python-net/aspose.page.xps.presentation.image/imagedevice/fill/#aspose.pydrawing.drawing2d.GraphicsPath) | Fills the specified path. |
| [draw_string](/page/python-net/aspose.page.xps.presentation.image/imagedevice/draw_string/#str-float-float) | Draws a string at the specified position. |
| [draw_image](/page/python-net/aspose.page.xps.presentation.image/imagedevice/draw_image/#aspose.pydrawing.Bitmap-aspose.pydrawing.drawing2d.Matrix-aspose.pydrawing.Color) | Draws an image with assigned transform and background. |
| [start_document](/page/python-net/aspose.page.xps.presentation.image/imagedevice/start_document/#) | Starts the document. |
| [end_document](/page/python-net/aspose.page.xps.presentation.image/imagedevice/end_document/#) | Accomplishes the document. |
| [dispose](/page/python-net/aspose.page.xps.presentation.image/imagedevice/dispose/#) | Disposes this device instance. Finalizes this device instance graphics state,<br/>i.e. switches APS composing context to the ApsCanvas of the level higher then this<br/>device's graphics state ApsCanvas. |
| [reset](/page/python-net/aspose.page.xps.presentation.image/imagedevice/reset/#) | Resets the device. |
| [write_comment](/page/python-net/aspose.page.xps.presentation.image/imagedevice/write_comment/#str) | Writes a comment. |
| [draw_arc](/page/python-net/aspose.page.xps.presentation.image/imagedevice/draw_arc/#float-float-float-float-float-float) | Draws an arc. |
| [draw_line](/page/python-net/aspose.page.xps.presentation.image/imagedevice/draw_line/#float-float-float-float) | Draws a line segment. |
| [draw_oval](/page/python-net/aspose.page.xps.presentation.image/imagedevice/draw_oval/#float-float-float-float) | Draws an oval. |
| [draw_rect](/page/python-net/aspose.page.xps.presentation.image/imagedevice/draw_rect/#float-float-float-float) | Draws a rectangle. |
| [draw_round_rect](/page/python-net/aspose.page.xps.presentation.image/imagedevice/draw_round_rect/#float-float-float-float-float-float) | Draws a round rectangle. |
| [fill_arc](/page/python-net/aspose.page.xps.presentation.image/imagedevice/fill_arc/#float-float-float-float-float-float) | Fills an arc. |
| [fill_oval](/page/python-net/aspose.page.xps.presentation.image/imagedevice/fill_oval/#float-float-float-float) | Fills an oval. |
| [fill_rect](/page/python-net/aspose.page.xps.presentation.image/imagedevice/fill_rect/#float-float-float-float) | Fills a rectangle. |
| [fill_round_rect](/page/python-net/aspose.page.xps.presentation.image/imagedevice/fill_round_rect/#float-float-float-float-float-float) | Fills a round rectangle. |
| [init_page_numbers](/page/python-net/aspose.page.xps.presentation.image/imagedevice/init_page_numbers/#) | Initializes numbers of pages to output. |
| [close_page](/page/python-net/aspose.page.xps.presentation.image/imagedevice/close_page/#) | Accomplishes the page. |
| [update_page_parameters](/page/python-net/aspose.page.xps.presentation.image/imagedevice/update_page_parameters/#aspose.page.IMultiPageDevice) | Updates the current page parameters. |
| [open_partition](/page/python-net/aspose.page.xps.presentation.image/imagedevice/open_partition/#) | Starts a new document partition. |
| [close_partition](/page/python-net/aspose.page.xps.presentation.image/imagedevice/close_partition/#) | Accomplished the document partition. |



### See Also
* module [`aspose.page.xps.presentation.image`](..)
* class [`Device`](/page/python-net/aspose.page/device)
* class [`ImageDevice`](/page/python-net/aspose.page.xps.presentation.image/imagedevice)
