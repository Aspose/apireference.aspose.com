---
title: PdfDevice class
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.page.xps.presentation.pdf/pdfdevice/
is_root: false
---

## PdfDevice class

Class incapsulating image composing device.



**Inheritance:** [`PdfDevice`](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice) → 
[`Device`](/page/python-net/aspose.page/device)



The PdfDevice type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/__init__/#io.RawIOBase) | Creates the new instance. |
| [__init__](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/__init__/#io.RawIOBase-aspose.pydrawing.Size) | Creates the new instance with specified media size. |


### Properties
| Property | Description |
| :- | :- |
| [creator](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/creator) | Returns or specifies creator of resulting device output. |
| [size](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/size) | Gets/sets the device media size. |
| [is_direct_rgb](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/is_direct_rgb) | Indicates whether device uses direct RGB mode, that is RGB. |
| [background](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/background) | Gets/sets the background color. |
| [opacity](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/opacity) | Gets/sets the opacity. |
| [stroke](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/stroke) | Gets/sets the stroke for drawing paths. |
| [paint](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/paint) | Gets/sets the brush for filling paths. |
| [opacity_mask](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/opacity_mask) | Gets/sets the brush for opacity mask. The mask applies over Paint or Strike. |
| [font](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/font) | Gets/sets the current font. |
| [char_tm](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/char_tm) | Returns or specifies current characters transform. |
| [text_rendering_mode](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/text_rendering_mode) | Returns or specifies current text rendering mode. |
| [text_stroke_width](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/text_stroke_width) | Returns or specifies current text stroke width. |
| [version](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/version) | Current device version. |
| [current_page_number](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/current_page_number) | Returns the absolute number of the current page withint the document. |
| [current_relative_page_number](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/current_relative_page_number) | Returns the number of the current page within the current partititon. |


### Methods
| Method | Description |
| :- | :- |
| [rotate](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/rotate/#float) | Applies a clockwise rotation about the origin to the current transformation matrix. |
| [rotate](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/rotate/#float-float-float) | Rotate the current transformation matrix around a point. |
| [draw_polyline](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/draw_polyline/#list-list-int) | Draws a polyline. |
| [draw_polyline](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/draw_polyline/#list-list-int) | Draws a polyline. |
| [draw_polygon](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/draw_polygon/#list-list-int) | Draws a polygon. |
| [draw_polygon](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/draw_polygon/#list-list-int) | Draws a poligone. |
| [fill_polygon](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/fill_polygon/#list-list-int) | Fills a poligone. |
| [fill_polygon](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/fill_polygon/#list-list-int) | Fills a poligone. |
| [open_page](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/open_page/#str) | Starts a new page with the specifies title. |
| [open_page](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/open_page/#float-float) | Starts a new page with the specified width and height. |
| [set_hyperlink_target](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/set_hyperlink_target/#str) | Sets the hyperlink with an external URI as its target. |
| [set_hyperlink_target](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/set_hyperlink_target/#int) | Sets the hyperlink with a page number as its target. |
| [add_outline](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/add_outline/#int-str) | Adds an outline item with the last object as its target. |
| [add_outline](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/add_outline/#aspose.pydrawing.PointF-int-str) | Adds an outline item with the origin point as its target. |
| [re_new](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/re_new/#) | Sets the devices to the initial state. |
| [get_property](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/get_property/#str) | Gets a value of string property. |
| [get_property_color](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/get_property_color/#str) | Gets a value of color property. |
| [get_property_rectangle](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/get_property_rectangle/#str) | Gets a value of rectangle property. |
| [get_property_margins](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/get_property_margins/#str) | Gets a value of margin property. |
| [get_property_size](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/get_property_size/#str) | Gets a value of size property. |
| [get_property_int](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/get_property_int/#str) | Gets a value of integer property. |
| [get_property_double](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/get_property_double/#str) | Gets a value of double property. |
| [is_property](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/is_property/#str) | Gets a value of boolean property. |
| [create](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/create/#) | Creates a new instance of the device based on this device instance.<br/>Writes this device graphics state, i.e. creates ApsCanvas instance(s)<br/>with corresponding RenderTransform and Clip properties. |
| [set_transform](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/set_transform/#aspose.pydrawing.drawing2d.Matrix) | Sets the current transformation matrix. |
| [get_transform](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/get_transform/#) | Returns the current transformation matrix. |
| [transform](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/transform/#aspose.pydrawing.drawing2d.Matrix) | Multiplies the current transformation matrix by the specified Matrix. |
| [translate](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/translate/#float-float) | Applies the specified translation vector to the current transformation matrix. |
| [scale](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/scale/#float-float) | Applies the specified scale vector to the current transformation matrix. |
| [shear](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/shear/#float-float) | Applies the specified shear vector to the current transformation matrix. |
| [init_clip](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/init_clip/#) | Initializes clip of the device. |
| [set_clip](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/set_clip/#aspose.pydrawing.drawing2d.GraphicsPath) | Adds the specified path to the current clip path. |
| [draw](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/draw/#aspose.pydrawing.drawing2d.GraphicsPath) | Draws the specified path. |
| [fill](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/fill/#aspose.pydrawing.drawing2d.GraphicsPath) | Fills the specified path. |
| [draw_string](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/draw_string/#str-float-float) | Draws a string at the specified position. |
| [draw_image](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/draw_image/#aspose.pydrawing.Bitmap-aspose.pydrawing.drawing2d.Matrix-aspose.pydrawing.Color) | Draws an image with assigned transform and background. |
| [start_document](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/start_document/#) | Starts the document. |
| [end_document](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/end_document/#) | Accomplishes the document. |
| [dispose](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/dispose/#) | Disposes this device instance. Finalizes this device instance graphics state,<br/>i.e. switches APS composing context to the ApsCanvas of the level higher then this<br/>device's graphics state ApsCanvas. |
| [reset](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/reset/#) | Resets the device. |
| [write_comment](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/write_comment/#str) | Writes a comment. |
| [draw_arc](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/draw_arc/#float-float-float-float-float-float) | Draws an arc. |
| [draw_line](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/draw_line/#float-float-float-float) | Draws a line segment. |
| [draw_oval](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/draw_oval/#float-float-float-float) | Draws an oval. |
| [draw_rect](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/draw_rect/#float-float-float-float) | Draws a rectangle. |
| [draw_round_rect](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/draw_round_rect/#float-float-float-float-float-float) | Draws a round rectangle. |
| [fill_arc](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/fill_arc/#float-float-float-float-float-float) | Fills an arc. |
| [fill_oval](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/fill_oval/#float-float-float-float) | Fills an oval. |
| [fill_rect](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/fill_rect/#float-float-float-float) | Fills a rectangle. |
| [fill_round_rect](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/fill_round_rect/#float-float-float-float-float-float) | Fills a round rectangle. |
| [init_page_numbers](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/init_page_numbers/#) | Initializes numbers of pages to output. |
| [close_page](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/close_page/#) | Accomplishes the page. |
| [update_page_parameters](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/update_page_parameters/#aspose.page.IMultiPageDevice) | Updates the current page parameters. |
| [open_partition](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/open_partition/#) | Starts a new document partition. |
| [close_partition](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice/close_partition/#) | Accomplished the document partition. |



### See Also
* module [`aspose.page.xps.presentation.pdf`](..)
* class [`Device`](/page/python-net/aspose.page/device)
* class [`PdfDevice`](/page/python-net/aspose.page.xps.presentation.pdf/pdfdevice)
