---
title: XpsDocument class
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 30
url: /python-net/aspose.page.xps/xpsdocument/
---

## XpsDocument class

Class incapsulating the main entity of XPS document that provides manipulation<br/>            methods for any XPS element.

**Inheritance:** `XpsDocument` → [`Document`](/page/python-net/aspose.page/document)

The XpsDocument type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
| `XpsDocument()` | Creates empty XPS document with default page size. |
| `XpsDocument(path)` | Initializes a new instance of the XpsDocument class |
| `XpsDocument(path, options)` | Initializes a new instance of the XpsDocument class |
| `XpsDocument(stream, options)` | Initializes a new instance of the XpsDocument class |
## Properties
| Name | Description |
| :- | :- |
| `utils` | Gets the object that provides utilities beyond the formal XPS manipulation API. |
| `active_document` | Gets the active document number. |
| `active_page` | Gets the active page number within the active document. |
| `page` | Returns an [XpsPage](/page/python-net/aspose.page.xps.xpsmodel/xpspage/) instance for active page. |
| `document_count` | Returns the number of documents inside the XPS package. |
| `total_page_count` | Returns total number of pages in all documents inside XPS document. |
| `page_count` | Returns the number of pages in the active document. |
| `job_print_ticket` | Returns/sets document's job print ticket |
## Methods
| Name | Description |
| :- | :- |
| `save(path)` | Saves XPS document to XPS file located at the |
| `save(stream)` | Saves XPS document to stream. |
| `save_as_pdf(out_pdf_file_path, options)` | Saves the document in PDF format. |
| `save_as_pdf(stream, options)` | Saves the document in PDF format. |
| `save_as_image(options)` | Saves the document to image file.The output directory and the file name will be the same as from input XPS file.<br/>            The file extension will correspond to image format in "options" param.<br/>            If the document was initialized with a stream that is not FileStream, image file will be saved in the current folder with default file name template. |
| `save_as_image(options, out_dir, file_name_template)` | None |
| `save_as_ps(out_ps_file_path, options)` | Saves the document in PS format. |
| `save_as_ps(stream, options)` | Saves the document in PS format. |
| `merge_to_pdf(files_for_merge, out_pdf_file_path, options)` | Merging XPS documents to PDF using the [Device](/page/python-net/aspose.page/device/) instance. |
| `merge_to_pdf(files_for_merge, pdf_stream, options)` | Merging XPS documents to PDF using the [Device](/page/python-net/aspose.page/device/) instance. |
| `merge(files_for_merge, out_xps_file_path)` | Merging XPS documents to PDF using the [Device](/page/python-net/aspose.page/device/) instance. |
| `merge(files_for_merge, out_stream)` | Merging XPS documents to PDF using the [Device](/page/python-net/aspose.page/device/) instance. |
| `add_canvas(canvas)` | Adds a canvas. |
| `add_canvas()` | Adds a canvas. |
| `add_path(path)` | Adds a path element. |
| `add_path(data)` | Adds a new path to the active page. |
| `add_glyphs(glyphs)` | Adds a glyphs element. |
| `add_glyphs(font_family, font_rendering_em_size, font_style, origin_x, origin_y, unicode_string)` | Adds new glyphs to the active page. |
| `add_glyphs(font, font_rendering_em_size, origin_x, origin_y, unicode_string)` | Adds new glyphs to the active page. |
| `add_document(activate)` | Adds an empty document with default page size. |
| `add_document(width, height, activate)` | Adds an empty document with the first page dimensions |
| `insert_document(index, activate)` | Inserts an empty document with default page size<br/>            at |
| `insert_document(index, width, height, activate)` | Inserts an empty document with the first page dimensions |
| `add_page(activate)` | Adds an empty page to the document with default page size. |
| `add_page(width, height, activate)` | Adds an empty page to the document with specified |
| `add_page(page, activate)` | Adds a page to the document. |
| `insert_page(index, activate)` | Inserts an empty page to the document with default page size<br/>            at |
| `insert_page(index, width, height, activate)` | Inserts an empty page to the document with specified |
| `insert_page(index, page, activate)` | Inserts a page to the document at |
| `create_glyphs(font_family, font_rendering_em_size, font_style, origin_x, origin_y, unicode_string)` | Creates new glyphs. |
| `create_glyphs(font, font_rendering_em_size, origin_x, origin_y, unicode_string)` | Creates new glyphs. |
| `insert_glyphs(index, font_family, font_size, font_style, origin_x, origin_y, unicode_string)` | Inserts new glyphs to the active page at |
| `insert_glyphs(index, font, font_size, origin_x, origin_y, unicode_string)` | Inserts new glyphs to the active page at |
| `create_path_geometry(abbreviated_geometry)` | Creates a new path geometry specified with abbreviated form. |
| `create_path_geometry()` | Creates a new path geometry specified with abbreviated form. |
| `create_path_geometry(path_figures)` | None |
| `create_path_figure(start_point, is_closed)` | Creates a new path figure. |
| `create_path_figure(start_point, segments, is_closed)` | None |
| `create_solid_color_brush(color)` | Creates a new solid color brush. |
| `create_solid_color_brush(color)` | Creates a new solid color brush. |
| `create_gradient_stop(color, offset)` | Creates a new gradient stop. |
| `create_gradient_stop(color, offset)` | Creates a new gradient stop. |
| `create_linear_gradient_brush(gradient_stops, start_point, end_point)` | None |
| `create_linear_gradient_brush(start_point, end_point)` | Creates a new linear gradient brush. |
| `create_radial_gradient_brush(gradient_stops, center, gradient_origin, radius_x, radius_y)` | None |
| `create_radial_gradient_brush(center, gradient_origin, radius_x, radius_y)` | Creates a new radial gradient brush. |
| `create_image_brush(image, viewbox, viewport)` | Creates a new image brush. |
| `create_image_brush(image_path, viewbox, viewport)` | Creates a new image brush. |
| `create_color(color)` | Creates a new color. |
| `create_color(a, r, g, b)` | Creates a new color in sRGB color space. |
| `create_color(r, g, b)` | Creates a new color in sRGB color space. |
| `create_color(a, r, g, b)` | Creates a new color in scRGB color space. |
| `create_color(r, g, b)` | Creates a new color in scRGB color space. |
| `create_color(path, components)` | Creates a new color in ICC based color space. |
| `create_color(icc_profile, components)` | Creates a new color in ICC based color space. |
| `create_image(image_path)` | Creates a new image brush. |
| `create_image(stream)` | Creates a new image resource out of |
| `create_icc_profile(icc_profile_path)` | Creates a new ICC profile resource out of ICC profile file located at the |
| `create_icc_profile(stream)` | Creates a new ICC profile resource out of |
| `create_font(font_family, font_style)` | Creates a new TrueType font resource. |
| `create_font(stream)` | Creates a new TrueType font resource out of stream. |
| `select_active_document(document_number)` | Selects an active document for editing. |
| `select_active_page(page_number)` | Selects an active document page for editing. |
| `save_as_image_bytes(options)` | Saves the document in a bitmap image format as bytes arrays. |
| `get_document_print_ticket(document_index)` | Returns the print ticket of the document indexed by |
| `set_document_print_ticket(document_index, print_ticket)` | Links the |
| `get_page_print_ticket(document_index, page_index)` | Returns the print ticket of the page indexed by |
| `set_page_print_ticket(document_index, page_index, print_ticket)` | Links the |
| `remove_at(index)` | Removes an element at |
| `remove_document_at(index)` | Removes a document at |
| `remove_page(page)` | Removes a page from the document. |
| `remove_page_at(index)` | Removes a page from the document at |
| `create_canvas()` | Creates a new canvas. |
| `insert_canvas(index)` | Inserts a new canvas to the active page at |
| `create_path(data)` | Creates a new path. |
| `insert_path(index, data)` | Inserts a new path to the active page at |
| `create_matrix(m11, m12, m21, m22, m31, m32)` | Creates a new affine transformation matrix. |
| `create_arc_segment(point, size, rotation_angle, is_large_arc, sweep_direction, is_stroked)` | Creates a new elliptical arc segment. |
| `create_poly_line_segment(points, is_stroked)` | Creates a new polygonal drawing containing an arbitrary number of individual vertices. |
| `create_poly_bezier_segment(points, is_stroked)` | Creates a new set of cubic Bézier curves. |
| `create_poly_quadratic_bezier_segment(points, is_stroked)` | Creates a new set of quadratic Bézier curves from the previous point in the path figure through a set<br/>            of vertices, using specified control points. |
| `create_visual_brush(element, viewbox, viewport)` | Creates a new visual brush. |
| `add_outline_entry(description, outline_level, target)` | Adds an outline entry to the document. |

### See Also

* module [`aspose.page.xps`](/page/python-net/aspose.page.xps/)
* package [`aspose.page`](/page/python-net/)

