---
title: Device class
second_title: Aspose.TeX for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.tex.presentation/device/
is_root: false
---

## Device class

Implements the interface for outputting text and graphic content
to abstract device. Rendering is performed page by page.



The Device type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [page_count](/tex/python-net/aspose.tex.presentation/device/page_count) | Gets the number of pages. |
| [is_ready](/tex/python-net/aspose.tex.presentation/device/is_ready) | Shows if device is ready for output. |
| [destination_name](/tex/python-net/aspose.tex.presentation/device/destination_name) | Gets destination name: output file name or device description. |
| [stroke](/tex/python-net/aspose.tex.presentation/device/stroke) | Gets/sets the current stroke. |
| [fill](/tex/python-net/aspose.tex.presentation/device/fill) | Gets/sets the current fill. |
| [stroke_opacity](/tex/python-net/aspose.tex.presentation/device/stroke_opacity) | Gets/sets the current stroke opacity. |
| [fill_opacity](/tex/python-net/aspose.tex.presentation/device/fill_opacity) | Gets/sets the current fill opacity. |


### Methods
| Method | Description |
| :- | :- |
| [init](/tex/python-net/aspose.tex.presentation/device/init/#) | Initializes device. |
| [create](/tex/python-net/aspose.tex.presentation/device/create/#) | Creates a copy of this device. |
| [dispose](/tex/python-net/aspose.tex.presentation/device/dispose/#) | Disposes the device. |
| [start_document](/tex/python-net/aspose.tex.presentation/device/start_document/#) | Starts the whole document. |
| [end_document](/tex/python-net/aspose.tex.presentation/device/end_document/#) | Finalizes the whole document. |
| [start_page](/tex/python-net/aspose.tex.presentation/device/start_page/#float-float) | Starts a new page. |
| [end_page](/tex/python-net/aspose.tex.presentation/device/end_page/#) | Finalizes a page. |
| [add_hyperlink](/tex/python-net/aspose.tex.presentation/device/add_hyperlink/#aspose.pydrawing.RectangleF-aspose.pydrawing.Pen-str) | Sets the hyperlink with a URI as its target. |
| [set_transform](/tex/python-net/aspose.tex.presentation/device/set_transform/#aspose.pydrawing.drawing2d.Matrix) | Sets the current coordinate space transformation. |
| [set_clip](/tex/python-net/aspose.tex.presentation/device/set_clip/#aspose.pydrawing.drawing2d.GraphicsPath) | Sets the current clip path. |
| [draw_string](/tex/python-net/aspose.tex.presentation/device/draw_string/#str-float-float-System.Collections.Generic.List<GlyphData>) |  |
| [draw_path](/tex/python-net/aspose.tex.presentation/device/draw_path/#aspose.pydrawing.drawing2d.GraphicsPath) | Draws a path. |
| [fill_path](/tex/python-net/aspose.tex.presentation/device/fill_path/#aspose.pydrawing.drawing2d.GraphicsPath) | Fills a path. |
| [show_image](/tex/python-net/aspose.tex.presentation/device/show_image/#aspose.pydrawing.PointF-aspose.pydrawing.SizeF-bytes) | Shows a raster image. |



### See Also
* module [`aspose.tex.presentation`](..)
