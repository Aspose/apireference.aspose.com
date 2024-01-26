---
title: XpsDocument class
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.page.xps/xpsdocument/
is_root: false
---

## XpsDocument class

Class incapsulating the main entity of XPS document that provides manipulation
methods for any XPS element.



**Inheritance:** [`XpsDocument`](/page/python-net/aspose.page.xps/xpsdocument) → 
[`Document`](/page/python-net/aspose.page/document)



The XpsDocument type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/page/python-net/aspose.page.xps/xpsdocument/__init__/#) | Creates empty XPS document with default page size. |
| [__init__](/page/python-net/aspose.page.xps/xpsdocument/__init__/#str) | Opens an existing XPS document located at the `path`. |
| [__init__](/page/python-net/aspose.page.xps/xpsdocument/__init__/#str-aspose.page.eps.LoadOptions) | Opens an existing document located at the `path` as XPS document. |
| [__init__](/page/python-net/aspose.page.xps/xpsdocument/__init__/#io.RawIOBase-aspose.page.eps.LoadOptions) | Loads an existing document stored in the `stream` as XPS document. |


### Properties
| Property | Description |
| :- | :- |
| [active_document](/page/python-net/aspose.page.xps/xpsdocument/active_document) | Gets the active document number. |
| [active_page](/page/python-net/aspose.page.xps/xpsdocument/active_page) | Gets the active page number within the active document. |
| [page](/page/python-net/aspose.page.xps/xpsdocument/page) | Returns an [`XpsPage`](/page/python-net/aspose.page.xps.xpsmodel/xpspage) instance for active page. |
| [document_count](/page/python-net/aspose.page.xps/xpsdocument/document_count) | Returns the number of documents inside the XPS package. |
| [total_page_count](/page/python-net/aspose.page.xps/xpsdocument/total_page_count) | Returns total number of pages in all documents inside XPS document. |
| [page_count](/page/python-net/aspose.page.xps/xpsdocument/page_count) | Returns the number of pages in the active document. |
| [job_print_ticket](/page/python-net/aspose.page.xps/xpsdocument/job_print_ticket) | Returns/sets document's job print ticket |


### Methods
| Method | Description |
| :- | :- |
| [save](/page/python-net/aspose.page.xps/xpsdocument/save/#str) | Saves XPS document to XPS file located at the `path`. |
| [save](/page/python-net/aspose.page.xps/xpsdocument/save/#io.RawIOBase) | Saves XPS document to stream. |
| [save](/page/python-net/aspose.page.xps/xpsdocument/save/#aspose.page.Device-aspose.page.SaveOptions) | Saves the document using the [`Device`](/page/python-net/aspose.page/device) instance. |
| [merge](/page/python-net/aspose.page.xps/xpsdocument/merge/#list-aspose.page.Device-aspose.page.SaveOptions) | Merging XPS documents to PDF using the [`Device`](/page/python-net/aspose.page/device) instance. |
| [merge](/page/python-net/aspose.page.xps/xpsdocument/merge/#list-io.RawIOBase) | Merging several XPS files to one XPS document. |
| [add_document](/page/python-net/aspose.page.xps/xpsdocument/add_document/#bool) | Adds an empty document with default page size. |
| [add_document](/page/python-net/aspose.page.xps/xpsdocument/add_document/#float-float-bool) | Adds an empty document with the first page dimensions<br/>`width` and `height`. |
| [insert_document](/page/python-net/aspose.page.xps/xpsdocument/insert_document/#int-bool) | Inserts an empty document with default page size<br/>at `index` position. |
| [insert_document](/page/python-net/aspose.page.xps/xpsdocument/insert_document/#int-float-float-bool) | Inserts an empty document with the first page dimensions<br/>`width` and `height` at `index` position. |
| [add_page](/page/python-net/aspose.page.xps/xpsdocument/add_page/#bool) | Adds an empty page to the document with default page size. |
| [add_page](/page/python-net/aspose.page.xps/xpsdocument/add_page/#float-float-bool) | Adds an empty page to the document with specified <br/>`width` and `height`. |
| [add_page](/page/python-net/aspose.page.xps/xpsdocument/add_page/#aspose.page.xps.xpsmodel.XpsPage-bool) | Adds a page to the document. |
| [insert_page](/page/python-net/aspose.page.xps/xpsdocument/insert_page/#int-bool) | Inserts an empty page to the document with default page size<br/>at `index` position. |
| [insert_page](/page/python-net/aspose.page.xps/xpsdocument/insert_page/#int-float-float-bool) | Inserts an empty page to the document with specified <br/>`width` and `height` at `index` position. |
| [insert_page](/page/python-net/aspose.page.xps/xpsdocument/insert_page/#int-aspose.page.xps.xpsmodel.XpsPage-bool) | Inserts a page to the document at `index` position. |
| [create_glyphs](/page/python-net/aspose.page.xps/xpsdocument/create_glyphs/#str-float-aspose.pydrawing.FontStyle-float-float-str) | Creates new glyphs. |
| [create_glyphs](/page/python-net/aspose.page.xps/xpsdocument/create_glyphs/#aspose.page.xps.xpsmodel.XpsFont-float-float-float-str) | Creates new glyphs. |
| [add_glyphs](/page/python-net/aspose.page.xps/xpsdocument/add_glyphs/#str-float-aspose.pydrawing.FontStyle-float-float-str) | Adds new glyphs to the active page. |
| [add_glyphs](/page/python-net/aspose.page.xps/xpsdocument/add_glyphs/#aspose.page.xps.xpsmodel.XpsFont-float-float-float-str) | Adds new glyphs to the active page. |
| [insert_glyphs](/page/python-net/aspose.page.xps/xpsdocument/insert_glyphs/#int-str-float-aspose.pydrawing.FontStyle-float-float-str) | Inserts new glyphs to the active page at `index` position. |
| [insert_glyphs](/page/python-net/aspose.page.xps/xpsdocument/insert_glyphs/#int-aspose.page.xps.xpsmodel.XpsFont-float-float-float-str) | Inserts new glyphs to the active page at `index` position. |
| [create_path_geometry](/page/python-net/aspose.page.xps/xpsdocument/create_path_geometry/#) | Creates a new path geometry. |
| [create_path_geometry](/page/python-net/aspose.page.xps/xpsdocument/create_path_geometry/#System.Collections.Generic.List<Aspose.Page.XPS.XpsModel.XpsPathFigure>) |  |
| [create_path_geometry](/page/python-net/aspose.page.xps/xpsdocument/create_path_geometry/#str) | Creates a new path geometry specified with abbreviated form. |
| [create_path_figure](/page/python-net/aspose.page.xps/xpsdocument/create_path_figure/#aspose.pydrawing.PointF-bool) | Creates a new path figure. |
| [create_path_figure](/page/python-net/aspose.page.xps/xpsdocument/create_path_figure/#aspose.pydrawing.PointF-System.Collections.Generic.List<Aspose.Page.XPS.XpsModel.XpsPathSegment>-bool) |  |
| [create_solid_color_brush](/page/python-net/aspose.page.xps/xpsdocument/create_solid_color_brush/#aspose.page.xps.xpsmodel.XpsColor) | Creates a new solid color brush. |
| [create_solid_color_brush](/page/python-net/aspose.page.xps/xpsdocument/create_solid_color_brush/#aspose.pydrawing.Color) | Creates a new solid color brush. |
| [create_gradient_stop](/page/python-net/aspose.page.xps/xpsdocument/create_gradient_stop/#aspose.page.xps.xpsmodel.XpsColor-float) | Creates a new gradient stop. |
| [create_gradient_stop](/page/python-net/aspose.page.xps/xpsdocument/create_gradient_stop/#aspose.pydrawing.Color-float) | Creates a new gradient stop. |
| [create_linear_gradient_brush](/page/python-net/aspose.page.xps/xpsdocument/create_linear_gradient_brush/#System.Collections.Generic.List<Aspose.Page.XPS.XpsModel.XpsGradientStop>-aspose.pydrawing.PointF-aspose.pydrawing.PointF) |  |
| [create_linear_gradient_brush](/page/python-net/aspose.page.xps/xpsdocument/create_linear_gradient_brush/#aspose.pydrawing.PointF-aspose.pydrawing.PointF) | Creates a new linear gradient brush. |
| [create_radial_gradient_brush](/page/python-net/aspose.page.xps/xpsdocument/create_radial_gradient_brush/#System.Collections.Generic.List<Aspose.Page.XPS.XpsModel.XpsGradientStop>-aspose.pydrawing.PointF-aspose.pydrawing.PointF-float-float) |  |
| [create_radial_gradient_brush](/page/python-net/aspose.page.xps/xpsdocument/create_radial_gradient_brush/#aspose.pydrawing.PointF-aspose.pydrawing.PointF-float-float) | Creates a new radial gradient brush. |
| [create_image_brush](/page/python-net/aspose.page.xps/xpsdocument/create_image_brush/#aspose.page.xps.xpsmodel.XpsImage-aspose.pydrawing.RectangleF-aspose.pydrawing.RectangleF) | Creates a new image brush. |
| [create_image_brush](/page/python-net/aspose.page.xps/xpsdocument/create_image_brush/#str-aspose.pydrawing.RectangleF-aspose.pydrawing.RectangleF) | Creates a new image brush. |
| [create_color](/page/python-net/aspose.page.xps/xpsdocument/create_color/#aspose.pydrawing.Color) | Creates a new color. |
| [create_color](/page/python-net/aspose.page.xps/xpsdocument/create_color/#int-int-int-int) | Creates a new color in sRGB color space. |
| [create_color](/page/python-net/aspose.page.xps/xpsdocument/create_color/#int-int-int) | Creates a new color in sRGB color space. |
| [create_color](/page/python-net/aspose.page.xps/xpsdocument/create_color/#float-float-float-float) | Creates a new color in scRGB color space. |
| [create_color](/page/python-net/aspose.page.xps/xpsdocument/create_color/#float-float-float) | Creates a new color in scRGB color space. |
| [create_color](/page/python-net/aspose.page.xps/xpsdocument/create_color/#str-list) | Creates a new color in ICC based color space. |
| [create_color](/page/python-net/aspose.page.xps/xpsdocument/create_color/#aspose.page.xps.xpsmodel.XpsIccProfile-list) | Creates a new color in ICC based color space. |
| [create_image](/page/python-net/aspose.page.xps/xpsdocument/create_image/#str) | Creates a new image resource out of image file located at the `image_path`. |
| [create_image](/page/python-net/aspose.page.xps/xpsdocument/create_image/#io.RawIOBase) | Creates a new image resource out of `stream`. |
| [create_icc_profile](/page/python-net/aspose.page.xps/xpsdocument/create_icc_profile/#str) | Creates a new ICC profile resource out of ICC profile file located at the<br/>`icc_profile_path`. |
| [create_icc_profile](/page/python-net/aspose.page.xps/xpsdocument/create_icc_profile/#io.RawIOBase) | Creates a new ICC profile resource out of `stream`. |
| [create_font](/page/python-net/aspose.page.xps/xpsdocument/create_font/#str-aspose.pydrawing.FontStyle) | Creates a new TrueType font resource. |
| [create_font](/page/python-net/aspose.page.xps/xpsdocument/create_font/#io.RawIOBase) | Creates a new TrueType font resource out of stream. |
| [select_active_document](/page/python-net/aspose.page.xps/xpsdocument/select_active_document/#int) | Selects an active document for editing. |
| [select_active_page](/page/python-net/aspose.page.xps/xpsdocument/select_active_page/#int) | Selects an active document page for editing. |
| [get_document_print_ticket](/page/python-net/aspose.page.xps/xpsdocument/get_document_print_ticket/#int) | Returns the print ticket of the document indexed by `document_index`. |
| [set_document_print_ticket](/page/python-net/aspose.page.xps/xpsdocument/set_document_print_ticket/#int-aspose.page.xps.xpsmetadata.DocumentPrintTicket) | Links the `print_ticket` to the document indexed by `document_index`. |
| [get_page_print_ticket](/page/python-net/aspose.page.xps/xpsdocument/get_page_print_ticket/#int-int) | Returns the print ticket of the page indexed by `page_index` <br/>in the document indexed by `document_index`. |
| [set_page_print_ticket](/page/python-net/aspose.page.xps/xpsdocument/set_page_print_ticket/#int-int-aspose.page.xps.xpsmetadata.PagePrintTicket) | Links the `print_ticket` to the page indexed by `page_index`<br/>in the document indexed by `document_index`. |
| [remove_at](/page/python-net/aspose.page.xps/xpsdocument/remove_at/#int) | Removes an element at `index` position from the active page. |
| [remove_document_at](/page/python-net/aspose.page.xps/xpsdocument/remove_document_at/#int) | Removes a document at `index` position. |
| [remove_page](/page/python-net/aspose.page.xps/xpsdocument/remove_page/#aspose.page.xps.xpsmodel.XpsPage) | Removes a page from the document. |
| [remove_page_at](/page/python-net/aspose.page.xps/xpsdocument/remove_page_at/#int) | Removes a page from the document at `index` position. |
| [create_canvas](/page/python-net/aspose.page.xps/xpsdocument/create_canvas/#) | Creates a new canvas. |
| [add_canvas](/page/python-net/aspose.page.xps/xpsdocument/add_canvas/#) | Adds a new canvas to the active page. |
| [insert_canvas](/page/python-net/aspose.page.xps/xpsdocument/insert_canvas/#int) | Inserts a new canvas to the active page at `index` position. |
| [create_path](/page/python-net/aspose.page.xps/xpsdocument/create_path/#aspose.page.xps.xpsmodel.XpsPathGeometry) | Creates a new path. |
| [add_path](/page/python-net/aspose.page.xps/xpsdocument/add_path/#aspose.page.xps.xpsmodel.XpsPathGeometry) | Adds a new path to the active page. |
| [insert_path](/page/python-net/aspose.page.xps/xpsdocument/insert_path/#int-aspose.page.xps.xpsmodel.XpsPathGeometry) | Inserts a new path to the active page at `index` position. |
| [create_matrix](/page/python-net/aspose.page.xps/xpsdocument/create_matrix/#float-float-float-float-float-float) | Creates a new affine transformation matrix. |
| [create_arc_segment](/page/python-net/aspose.page.xps/xpsdocument/create_arc_segment/#aspose.pydrawing.PointF-aspose.pydrawing.SizeF-float-bool-aspose.page.xps.xpsmodel.XpsSweepDirection-bool) | Creates a new elliptical arc segment. |
| [create_poly_line_segment](/page/python-net/aspose.page.xps/xpsdocument/create_poly_line_segment/#aspose.pydrawing.PointF[]-bool) | Creates a new polygonal drawing containing an arbitrary number of individual vertices. |
| [create_poly_bezier_segment](/page/python-net/aspose.page.xps/xpsdocument/create_poly_bezier_segment/#aspose.pydrawing.PointF[]-bool) | Creates a new set of cubic Bézier curves. |
| [create_poly_quadratic_bezier_segment](/page/python-net/aspose.page.xps/xpsdocument/create_poly_quadratic_bezier_segment/#aspose.pydrawing.PointF[]-bool) | Creates a new set of quadratic Bézier curves from the previous point in the path figure through a set<br/>of vertices, using specified control points. |
| [create_visual_brush](/page/python-net/aspose.page.xps/xpsdocument/create_visual_brush/#aspose.page.xps.xpsmodel.XpsContentElement-aspose.pydrawing.RectangleF-aspose.pydrawing.RectangleF) | Creates a new visual brush. |
| [add_outline_entry](/page/python-net/aspose.page.xps/xpsdocument/add_outline_entry/#str-int-aspose.page.xps.xpsmodel.XpsHyperlinkTarget) | Adds an outline entry to the document. |



### See Also
* module [`aspose.page.xps`](..)
* class [`Device`](/page/python-net/aspose.page/device)
* class [`Document`](/page/python-net/aspose.page/document)
* class [`XpsDocument`](/page/python-net/aspose.page.xps/xpsdocument)
* class [`XpsPage`](/page/python-net/aspose.page.xps.xpsmodel/xpspage)
