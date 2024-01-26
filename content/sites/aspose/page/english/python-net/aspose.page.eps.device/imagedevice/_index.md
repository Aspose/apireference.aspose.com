---
title: ImageDevice class
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.page.eps.device/imagedevice/
is_root: false
---

## ImageDevice class

This class encapsulates rendering of document to image.



**Inheritance:** [`ImageDevice`](/page/python-net/aspose.page.eps.device/imagedevice) → 
[`Device`](/page/python-net/aspose.page/device)



The ImageDevice type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/page/python-net/aspose.page.eps.device/imagedevice/__init__/#) | Initializes new instance of [`ImageDevice`](/page/python-net/aspose.page.eps.device/imagedevice). |
| [__init__](/page/python-net/aspose.page.eps.device/imagedevice/__init__/#aspose.pydrawing.Size) | Initializes new instance of [`ImageDevice`](/page/python-net/aspose.page.eps.device/imagedevice) with specified size of a page. |
| [__init__](/page/python-net/aspose.page.eps.device/imagedevice/__init__/#aspose.pydrawing.imaging.ImageFormat) | Initializes new instance of [`ImageDevice`](/page/python-net/aspose.page.eps.device/imagedevice) with specified image format. |
| [__init__](/page/python-net/aspose.page.eps.device/imagedevice/__init__/#aspose.pydrawing.Size-aspose.pydrawing.imaging.ImageFormat) | Initializes new instance of [`ImageDevice`](/page/python-net/aspose.page.eps.device/imagedevice) with specified size of a page and image format. |


### Properties
| Property | Description |
| :- | :- |
| [creator](/page/python-net/aspose.page.eps.device/imagedevice/creator) | Returns or specifies creator of resulting device output. |
| [size](/page/python-net/aspose.page.eps.device/imagedevice/size) | Returns or specifies a size of the page. |
| [is_direct_rgb](/page/python-net/aspose.page.eps.device/imagedevice/is_direct_rgb) | Indicates whether device uses direct RGB mode, that is RGB. |
| [background](/page/python-net/aspose.page.eps.device/imagedevice/background) | Indicates whether device uses direct RGB mode, that is RGB. |
| [opacity](/page/python-net/aspose.page.eps.device/imagedevice/opacity) | Returns or specifies current background of the page. |
| [stroke](/page/python-net/aspose.page.eps.device/imagedevice/stroke) | Returns or specifies current stroke. |
| [paint](/page/python-net/aspose.page.eps.device/imagedevice/paint) | Returns or specifies current paint. |
| [opacity_mask](/page/python-net/aspose.page.eps.device/imagedevice/opacity_mask) | Returns or specifies current opacity mask. |
| [font](/page/python-net/aspose.page.eps.device/imagedevice/font) | Returns or specifies current font. |
| [char_tm](/page/python-net/aspose.page.eps.device/imagedevice/char_tm) | Returns or specifies current characters transform. |
| [text_rendering_mode](/page/python-net/aspose.page.eps.device/imagedevice/text_rendering_mode) | Returns or specifies current text rendering mode. |
| [text_stroke_width](/page/python-net/aspose.page.eps.device/imagedevice/text_stroke_width) | Returns or specifies current text stroke width. |
| [version](/page/python-net/aspose.page.eps.device/imagedevice/version) | Current device version. |
| [format](/page/python-net/aspose.page.eps.device/imagedevice/format) | Image format. |
| [current_page_number](/page/python-net/aspose.page.eps.device/imagedevice/current_page_number) | Current page number. |
| [images_bytes](/page/python-net/aspose.page.eps.device/imagedevice/images_bytes) | Returns resulting images in bytes, one byte array for one page. |
| [TRANSPARENT](/page/python-net/aspose.page.eps.device/imagedevice/transparent) | "Transparent" property key. |
| [BACKGROUND](/page/python-net/aspose.page.eps.device/imagedevice/background) | Indicates whether device uses direct RGB mode, that is RGB. |
| [BACKGROUND_COLOR](/page/python-net/aspose.page.eps.device/imagedevice/background_color) | "Background color" property key. |
| [PAGE_SIZE](/page/python-net/aspose.page.eps.device/imagedevice/page_size) | "Page size" property key. |
| [PAGE_MARGINS](/page/python-net/aspose.page.eps.device/imagedevice/page_margins) | "Page margins" property key. |
| [ORIENTATION](/page/python-net/aspose.page.eps.device/imagedevice/orientation) | "Orientation" property key. |
| [FIT_TO_PAGE](/page/python-net/aspose.page.eps.device/imagedevice/fit_to_page) | "Fit content to page" property key. |
| [EMBED_FONTS](/page/python-net/aspose.page.eps.device/imagedevice/embed_fonts) | "Embed font in document" property key. |
| [EMIT_WARNINGS](/page/python-net/aspose.page.eps.device/imagedevice/emit_warnings) | "Emit warnings" property value. |
| [EMIT_ERRORS](/page/python-net/aspose.page.eps.device/imagedevice/emit_errors) | "Emit errors" property value. |
| [PRODUCER](/page/python-net/aspose.page.eps.device/imagedevice/producer) | "Producer" property value. |


### Methods
| Method | Description |
| :- | :- |
| [rotate](/page/python-net/aspose.page.eps.device/imagedevice/rotate/#float) | Rotate the current transformation matrix over the Z-axis. Calls writeTransform(Transform).<br/>Rotating with a positive angle theta rotates points on the positive x axis<br/>toward the positive y axis. |
| [rotate](/page/python-net/aspose.page.eps.device/imagedevice/rotate/#float-float-float) | Rotate the current transformation matrix around a point. |
| [draw_polyline](/page/python-net/aspose.page.eps.device/imagedevice/draw_polyline/#list-list-int) | Draws a polyline. |
| [draw_polyline](/page/python-net/aspose.page.eps.device/imagedevice/draw_polyline/#list-list-int) | Draws a polyline. |
| [draw_polygon](/page/python-net/aspose.page.eps.device/imagedevice/draw_polygon/#list-list-int) | Draws a polygon. |
| [draw_polygon](/page/python-net/aspose.page.eps.device/imagedevice/draw_polygon/#list-list-int) | Draws a poligone. |
| [fill_polygon](/page/python-net/aspose.page.eps.device/imagedevice/fill_polygon/#list-list-int) | Fills a poligone. |
| [fill_polygon](/page/python-net/aspose.page.eps.device/imagedevice/fill_polygon/#list-list-int) | Fills a poligone. |
| [open_page](/page/python-net/aspose.page.eps.device/imagedevice/open_page/#str) | Makes necessary preparation of the device before page rendering. |
| [open_page](/page/python-net/aspose.page.eps.device/imagedevice/open_page/#float-float) | Makes necessary preparation of the device before each page rendering. |
| [re_new](/page/python-net/aspose.page.eps.device/imagedevice/re_new/#) | Reset device to initial state for whole document. |
| [get_property](/page/python-net/aspose.page.eps.device/imagedevice/get_property/#str) | Gets a value of string property. |
| [get_property_color](/page/python-net/aspose.page.eps.device/imagedevice/get_property_color/#str) | Gets a value of color property. |
| [get_property_rectangle](/page/python-net/aspose.page.eps.device/imagedevice/get_property_rectangle/#str) | Gets a value of rectangle property. |
| [get_property_margins](/page/python-net/aspose.page.eps.device/imagedevice/get_property_margins/#str) | Gets a value of margins property. |
| [get_property_size](/page/python-net/aspose.page.eps.device/imagedevice/get_property_size/#str) | Gets a value of size property. |
| [get_property_int](/page/python-net/aspose.page.eps.device/imagedevice/get_property_int/#str) | Gets a value of integer property. |
| [get_property_double](/page/python-net/aspose.page.eps.device/imagedevice/get_property_double/#str) | Gets a value of double property. |
| [is_property](/page/python-net/aspose.page.eps.device/imagedevice/is_property/#str) | Gets a value of boolean property. |
| [create](/page/python-net/aspose.page.eps.device/imagedevice/create/#) | Creates a copy of this device. |
| [set_transform](/page/python-net/aspose.page.eps.device/imagedevice/set_transform/#aspose.pydrawing.drawing2d.Matrix) | Specifies current transform. |
| [get_transform](/page/python-net/aspose.page.eps.device/imagedevice/get_transform/#) | Gets the current transform. |
| [transform](/page/python-net/aspose.page.eps.device/imagedevice/transform/#aspose.pydrawing.drawing2d.Matrix) | Transforms the current transformation matrix. Calls writeTransform(Transform). |
| [translate](/page/python-net/aspose.page.eps.device/imagedevice/translate/#float-float) | Translates the current transformation matrix. Calls writeTransform(Transform). |
| [scale](/page/python-net/aspose.page.eps.device/imagedevice/scale/#float-float) | Scales the current transformation matrix. Calls writeTransform(Transform). |
| [shear](/page/python-net/aspose.page.eps.device/imagedevice/shear/#float-float) | Shears the current transformation matrix. Calls writeTransform(Transform). |
| [init_clip](/page/python-net/aspose.page.eps.device/imagedevice/init_clip/#) | Initializes a clip of the device. |
| [set_clip](/page/python-net/aspose.page.eps.device/imagedevice/set_clip/#aspose.pydrawing.drawing2d.GraphicsPath) | Clips shape. |
| [draw](/page/python-net/aspose.page.eps.device/imagedevice/draw/#aspose.pydrawing.drawing2d.GraphicsPath) | Draws a path. |
| [fill](/page/python-net/aspose.page.eps.device/imagedevice/fill/#aspose.pydrawing.drawing2d.GraphicsPath) | Fills a path. |
| [draw_string](/page/python-net/aspose.page.eps.device/imagedevice/draw_string/#str-float-float) | Draws a string at given point. |
| [draw_image](/page/python-net/aspose.page.eps.device/imagedevice/draw_image/#aspose.pydrawing.Bitmap-aspose.pydrawing.drawing2d.Matrix-aspose.pydrawing.Color) | Draws an image with assigned transform and background. |
| [start_document](/page/python-net/aspose.page.eps.device/imagedevice/start_document/#) | Makes necessary preparation of device before start rendering of document. |
| [end_document](/page/python-net/aspose.page.eps.device/imagedevice/end_document/#) | Makes necessary preparation of device after the document has been rendered. |
| [dispose](/page/python-net/aspose.page.eps.device/imagedevice/dispose/#) | Disposes the device. |
| [reset](/page/python-net/aspose.page.eps.device/imagedevice/reset/#) | Reset the device to initial state for a page. |
| [write_comment](/page/python-net/aspose.page.eps.device/imagedevice/write_comment/#str) | Writes a comment. |
| [draw_arc](/page/python-net/aspose.page.eps.device/imagedevice/draw_arc/#float-float-float-float-float-float) | Draws an arc. |
| [draw_line](/page/python-net/aspose.page.eps.device/imagedevice/draw_line/#float-float-float-float) | Draws a line segment. |
| [draw_oval](/page/python-net/aspose.page.eps.device/imagedevice/draw_oval/#float-float-float-float) | Draws an oval. |
| [draw_rect](/page/python-net/aspose.page.eps.device/imagedevice/draw_rect/#float-float-float-float) | Draws a rectangle. |
| [draw_round_rect](/page/python-net/aspose.page.eps.device/imagedevice/draw_round_rect/#float-float-float-float-float-float) | Draws a round rectangle. |
| [fill_arc](/page/python-net/aspose.page.eps.device/imagedevice/fill_arc/#float-float-float-float-float-float) | Fills an arc. |
| [fill_oval](/page/python-net/aspose.page.eps.device/imagedevice/fill_oval/#float-float-float-float) | Fills an oval. |
| [fill_rect](/page/python-net/aspose.page.eps.device/imagedevice/fill_rect/#float-float-float-float) | Fills a rectangle. |
| [fill_round_rect](/page/python-net/aspose.page.eps.device/imagedevice/fill_round_rect/#float-float-float-float-float-float) | Fills a round rectangle. |
| [init_page_numbers](/page/python-net/aspose.page.eps.device/imagedevice/init_page_numbers/#) | Initializes numbers of pages to output. |
| [close_page](/page/python-net/aspose.page.eps.device/imagedevice/close_page/#) | Makes necessary preparation of the device after page has been rendered. |
| [update_page_parameters](/page/python-net/aspose.page.eps.device/imagedevice/update_page_parameters/#aspose.page.IMultiPageDevice) | Updates page parameters from other multi-paged device. |



### See Also
* module [`aspose.page.eps.device`](..)
* class [`Device`](/page/python-net/aspose.page/device)
* class [`ImageDevice`](/page/python-net/aspose.page.eps.device/imagedevice)
