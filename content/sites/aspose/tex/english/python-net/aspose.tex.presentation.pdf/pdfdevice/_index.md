---
title: PdfDevice class
second_title: Aspose.TeX for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.tex.presentation.pdf/pdfdevice/
is_root: false
---

## PdfDevice class

Implements the interface for outputting text and graphic content to PDF document.



**Inheritance:** [`PdfDevice`](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice) → 
[`Device`](/tex/python-net/aspose.tex.presentation/device)



The PdfDevice type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/__init__/#) | Creates new instance.<br/>The output file will be written to the output working<br/>directory taking the job name as a file name. |
| [__init__](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/__init__/#io.RawIOBase) | Creates new instance.<br/>The output file will be written to specified stream. |


### Properties
| Property | Description |
| :- | :- |
| [page_count](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/page_count) | Gets the number of pages. |
| [is_ready](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/is_ready) | Shows if device is ready for output. |
| [destination_name](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/destination_name) | Gets destination name: output file name or device description. |
| [stroke](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/stroke) | Gets/sets the current stroke. |
| [fill](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/fill) | Gets/sets the current fill. |
| [stroke_opacity](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/stroke_opacity) | Gets/sets the current stroke opacity. |
| [fill_opacity](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/fill_opacity) | Gets/sets the current fill opacity. |


### Methods
| Method | Description |
| :- | :- |
| [init](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/init/#) | Initializes device. |
| [create](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/create/#) | Creates a copy of this device. |
| [dispose](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/dispose/#) | Disposes this device instance. Finalizes this device instance graphics state,<br/>i.e. switches APS composing context to the ApsCanvas of the level higher then this<br/>device's graphics state ApsCanvas. |
| [start_document](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/start_document/#) | Starts the whole document. |
| [end_document](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/end_document/#) | Finalizes the whole document. |
| [start_page](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/start_page/#float-float) | Starts a new page. |
| [end_page](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/end_page/#) | Finalizes a page. |
| [add_hyperlink](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/add_hyperlink/#aspose.pydrawing.RectangleF-aspose.pydrawing.Pen-str) | Set the hyperlink with a URI as its target. |
| [set_transform](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/set_transform/#aspose.pydrawing.drawing2d.Matrix) | Sets the current coordinate space transformation. |
| [set_clip](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/set_clip/#aspose.pydrawing.drawing2d.GraphicsPath) | Sets the current clip path. |
| [draw_string](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/draw_string/#str-float-float-System.Collections.Generic.List<GlyphData>) |  |
| [draw_path](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/draw_path/#aspose.pydrawing.drawing2d.GraphicsPath) | Draws a path. |
| [fill_path](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/fill_path/#aspose.pydrawing.drawing2d.GraphicsPath) | Fill a path. |
| [show_image](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/show_image/#aspose.pydrawing.PointF-aspose.pydrawing.SizeF-bytes) | Shows a raster image. |
| [add_bookmark](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/add_bookmark/#str-aspose.pydrawing.PointF) | Adds the bookmark identified by the name. |
| [start_fragment](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/start_fragment/#) | Starts a fragment to rasterize. |
| [end_fragment](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice/end_fragment/#) | Ends a fragment to rasterize. |



### See Also
* module [`aspose.tex.presentation.pdf`](..)
* class [`Device`](/tex/python-net/aspose.tex.presentation/device)
* class [`PdfDevice`](/tex/python-net/aspose.tex.presentation.pdf/pdfdevice)
