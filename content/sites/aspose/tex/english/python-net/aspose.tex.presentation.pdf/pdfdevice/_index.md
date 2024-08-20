---
title: PdfDevice class
second_title: Aspose.TeX for Python via .NET API Reference
description: 
type: docs
weight: 10
url: /python-net/aspose.tex.presentation.pdf/pdfdevice/
---

## PdfDevice class

Implements the interface for outputting text and graphic content to PDF document.

**Inheritance:** `PdfDevice` → [`Device`](/tex/python-net/aspose.tex.presentation/device)

The PdfDevice type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
| `PdfDevice()` | Creates a new instance.<br/>            The output file will be written to the output working<br/>            directory taking the job name as a file name. |
| `PdfDevice(stream)` | Initializes a new instance of the PdfDevice class |
## Properties
| Name | Description |
| :- | :- |
| `page_count` | Gets the number of pages. |
| `is_ready` | Shows if device is ready for output. |
| `destination_name` | Gets destination name: output file name or device description. |
| `stroke` | Gets/sets the current stroke. |
| `fill` | Gets/sets the current fill. |
| `stroke_opacity` | Gets/sets the current stroke opacity. |
| `fill_opacity` | Gets/sets the current fill opacity. |
## Methods
| Name | Description |
| :- | :- |
| `initialize()` | Initializes the device. |
| `create()` | Creates a copy of this device. |
| `dispose()` | Disposes this device instance. Finalizes this device instance graphics state,<br/>            i.e. switches composing context to the level higher then this device's graphics state. |
| `start_document()` | Starts the whole document. |
| `end_document()` | Finalizes the whole document. |
| `start_page(width, height)` | Starts a new page. |
| `end_page()` | Finalizes a page. |
| `add_hyperlink(active_rect, border, target_uri)` | Set the hyperlink with a URI as its target. |
| `set_transform(matrix)` | Sets the current coordinate space transformation. |
| `set_clip(path)` | Sets the current clip path. |
| `draw_string(str, origin_x, origin_y, char_infos)` | Draws a text string. |
| `draw_path(path)` | Draws a path. |
| `fill_path(path)` | Fill a path. |
| `show_image(origin, size, image_data)` | Shows a raster image. |
| `add_bookmark(name, position)` | Adds the bookmark identified by the name. |
| `start_fragment()` | Starts a fragment to rasterize. |
| `end_fragment()` | Ends a fragment to rasterize. |

### See Also

* module [`aspose.tex.presentation.pdf`](/tex/python-net/aspose.tex.presentation.pdf/)
* package [`aspose.tex`](/tex/python-net/)

