---
title: Device class
second_title: Aspose.TeX for Python via .NET API Reference
description: 
type: docs
weight: 10
url: /python-net/aspose.tex.presentation/device/
---

## Device class

Implements the interface for outputting text and graphic content<br/>            to abstract device. Rendering is performed page by page.



The Device type exposes the following members:
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
| `dispose()` | Disposes the device. |
| `start_document()` | Starts the whole document. |
| `end_document()` | Finalizes the whole document. |
| `start_page(width, height)` | Starts a new page. |
| `end_page()` | Finalizes a page. |
| `add_hyperlink(active_rect, border, target_uri)` | Sets the hyperlink with a URI as its target. |
| `set_transform(matrix)` | Sets the current coordinate space transformation. |
| `set_clip(path)` | Sets the current clip path. |
| `draw_string(str, origin_x, origin_y, char_infos)` | Draws a text string. |
| `draw_path(path)` | Draws a path. |
| `fill_path(path)` | Fills a path. |
| `show_image(origin, size, image_data)` | Shows a raster image. |

### See Also

* module [`aspose.tex.presentation`](/tex/python-net/aspose.tex.presentation/)
* package [`aspose.tex`](/tex/python-net/)

