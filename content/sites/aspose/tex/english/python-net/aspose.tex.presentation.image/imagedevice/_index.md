---
title: ImageDevice class
second_title: Aspose.TeX for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.tex.presentation.image/imagedevice/
is_root: false
---

## ImageDevice class

Implements the interface for outputting text and graphic content to image(s).



**Inheritance:** [`ImageDevice`](/tex/python-net/aspose.tex.presentation.image/imagedevice) → 
[`Device`](/tex/python-net/aspose.tex.presentation/device)



The ImageDevice type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/tex/python-net/aspose.tex.presentation.image/imagedevice/__init__/#) | Creates a new instance.<br/>The output file will be written to the output working<br/>directory taking the job name as a file name. |
| [__init__](/tex/python-net/aspose.tex.presentation.image/imagedevice/__init__/#bool) | Creates a new instance.<br/>The output file will be written to the output working<br/>directory taking the job name as a file name. |


### Properties
| Property | Description |
| :- | :- |
| [page_count](/tex/python-net/aspose.tex.presentation.image/imagedevice/page_count) | Gets the number of pages. |
| [is_ready](/tex/python-net/aspose.tex.presentation.image/imagedevice/is_ready) | Shows if device is ready for output. |
| [destination_name](/tex/python-net/aspose.tex.presentation.image/imagedevice/destination_name) | Gets destination name: output file name or device description. |
| [stroke](/tex/python-net/aspose.tex.presentation.image/imagedevice/stroke) | Gets/sets the current stroke. |
| [fill](/tex/python-net/aspose.tex.presentation.image/imagedevice/fill) | Gets/sets the current fill. |
| [stroke_opacity](/tex/python-net/aspose.tex.presentation.image/imagedevice/stroke_opacity) | Gets/sets the current stroke opacity. |
| [fill_opacity](/tex/python-net/aspose.tex.presentation.image/imagedevice/fill_opacity) | Gets/sets the current fill opacity. |
| [result](/tex/python-net/aspose.tex.presentation.image/imagedevice/result) | Returns the resulting images byte arrays.<br/>The first dimension is for inner documents<br/>and the second one is for pages within inner documents. |


### Methods
| Method | Description |
| :- | :- |
| [initialize](/tex/python-net/aspose.tex.presentation.image/imagedevice/initialize/#) | Initializes the device. |
| [create](/tex/python-net/aspose.tex.presentation.image/imagedevice/create/#) | Creates a copy of this device. |
| [dispose](/tex/python-net/aspose.tex.presentation.image/imagedevice/dispose/#) | Disposes this device instance. Finalizes this device instance graphics state,<br/>i.e. switches composing context to the level higher then this device's graphics state. |
| [start_document](/tex/python-net/aspose.tex.presentation.image/imagedevice/start_document/#) | Starts the whole document. |
| [end_document](/tex/python-net/aspose.tex.presentation.image/imagedevice/end_document/#) | Finalizes the whole document. |
| [start_page](/tex/python-net/aspose.tex.presentation.image/imagedevice/start_page/#float-float) | Starts a new page. |
| [end_page](/tex/python-net/aspose.tex.presentation.image/imagedevice/end_page/#) | Finalizes a page. |
| [add_hyperlink](/tex/python-net/aspose.tex.presentation.image/imagedevice/add_hyperlink/#aspose.pydrawing.RectangleF-aspose.pydrawing.Pen-str) | Set the hyperlink with a URI as its target. |
| [set_transform](/tex/python-net/aspose.tex.presentation.image/imagedevice/set_transform/#aspose.pydrawing.drawing2d.Matrix) | Sets the current coordinate space transformation. |
| [set_clip](/tex/python-net/aspose.tex.presentation.image/imagedevice/set_clip/#aspose.pydrawing.drawing2d.GraphicsPath) | Sets the current clip path. |
| [draw_string](/tex/python-net/aspose.tex.presentation.image/imagedevice/draw_string/#str-float-float-System.Collections.Generic.List<GlyphData>) |  |
| [draw_path](/tex/python-net/aspose.tex.presentation.image/imagedevice/draw_path/#aspose.pydrawing.drawing2d.GraphicsPath) | Draws a path. |
| [fill_path](/tex/python-net/aspose.tex.presentation.image/imagedevice/fill_path/#aspose.pydrawing.drawing2d.GraphicsPath) | Fill a path. |
| [show_image](/tex/python-net/aspose.tex.presentation.image/imagedevice/show_image/#aspose.pydrawing.PointF-aspose.pydrawing.SizeF-bytes) | Shows a raster image. |



### See Also
* module [`aspose.tex.presentation.image`](..)
* class [`Device`](/tex/python-net/aspose.tex.presentation/device)
* class [`ImageDevice`](/tex/python-net/aspose.tex.presentation.image/imagedevice)
