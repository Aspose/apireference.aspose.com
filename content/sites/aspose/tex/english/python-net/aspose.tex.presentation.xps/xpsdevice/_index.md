---
title: XpsDevice class
second_title: Aspose.TeX for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.tex.presentation.xps/xpsdevice/
is_root: false
---

## XpsDevice class

Implements the interface for outputting text and graphic content to XPS document.



**Inheritance:** [`XpsDevice`](/tex/python-net/aspose.tex.presentation.xps/xpsdevice) → 
[`Device`](/tex/python-net/aspose.tex.presentation/device)



The XpsDevice type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/__init__/#) | Creates a new instance.<br/>The output file will be written to the output working<br/>directory taking the job name as a file name. |
| [__init__](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/__init__/#io.RawIOBase) | Creates a new instance.<br/>The output file will be written to specified stream. |


### Properties
| Property | Description |
| :- | :- |
| [page_count](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/page_count) | Gets the number of pages. |
| [is_ready](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/is_ready) | Shows if device is ready for output. |
| [destination_name](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/destination_name) | Gets destination name: output file name or device description. |
| [stroke](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/stroke) | Gets/sets the current stroke. |
| [fill](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/fill) | Gets/sets the current fill. |
| [stroke_opacity](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/stroke_opacity) | Gets/sets the current stroke opacity. |
| [fill_opacity](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/fill_opacity) | Gets/sets the current fill opacity. |


### Methods
| Method | Description |
| :- | :- |
| [initialize](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/initialize/#) | Initializes the device. |
| [create](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/create/#) | Creates a copy of this device. |
| [dispose](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/dispose/#) | Disposes this device instance. Finalizes this device instance graphics state,<br/>i.e. switches APS composing context to the ApsCanvas of the level higher then this<br/>device's graphics state ApsCanvas. |
| [start_document](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/start_document/#) | Starts the whole document. |
| [end_document](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/end_document/#) | Finalizes the whole document. |
| [start_page](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/start_page/#float-float) | Starts a new page. |
| [end_page](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/end_page/#) | Finalizes a page. |
| [add_hyperlink](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/add_hyperlink/#aspose.pydrawing.RectangleF-aspose.pydrawing.Pen-str) | Set the hyperlink with a URI as its target. |
| [set_transform](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/set_transform/#aspose.pydrawing.drawing2d.Matrix) | Sets the current coordinate space transformation. |
| [set_clip](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/set_clip/#aspose.pydrawing.drawing2d.GraphicsPath) | Sets the current clip path. |
| [draw_string](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/draw_string/#str-float-float-System.Collections.Generic.List<GlyphData>) |  |
| [draw_path](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/draw_path/#aspose.pydrawing.drawing2d.GraphicsPath) | Draws a path. |
| [fill_path](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/fill_path/#aspose.pydrawing.drawing2d.GraphicsPath) | Fill a path. |
| [show_image](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/show_image/#aspose.pydrawing.PointF-aspose.pydrawing.SizeF-bytes) | Shows a raster image. |
| [add_bookmark](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/add_bookmark/#str-aspose.pydrawing.PointF) | Adds the bookmark identified by the name. |
| [start_fragment](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/start_fragment/#) | Starts a fragment to rasterize. |
| [end_fragment](/tex/python-net/aspose.tex.presentation.xps/xpsdevice/end_fragment/#) | Ends a fragment to rasterize. |



### See Also
* module [`aspose.tex.presentation.xps`](..)
* class [`Device`](/tex/python-net/aspose.tex.presentation/device)
* class [`XpsDevice`](/tex/python-net/aspose.tex.presentation.xps/xpsdevice)
