---
title: PsDocument class
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.page.eps/psdocument/
is_root: false
---

## PsDocument class

This class encapsulates PS/EPS documents.



**Inheritance:** [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) → 
[`Document`](/page/python-net/aspose.page/document)



The PsDocument type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/page/python-net/aspose.page.eps/psdocument/__init__/#str-aspose.page.eps.device.PsSaveOptions) | Initializes empty [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) with initialized page. |
| [__init__](/page/python-net/aspose.page.eps/psdocument/__init__/#io.RawIOBase-aspose.page.eps.device.PsSaveOptions) | Initializes empty [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) with initialized page. |
| [__init__](/page/python-net/aspose.page.eps/psdocument/__init__/#str-aspose.page.eps.device.PsSaveOptions-bool) | Initializes empty [`PsDocument`](/page/python-net/aspose.page.eps/psdocument). |
| [__init__](/page/python-net/aspose.page.eps/psdocument/__init__/#io.RawIOBase-aspose.page.eps.device.PsSaveOptions-bool) | Initializes empty [`PsDocument`](/page/python-net/aspose.page.eps/psdocument). |
| [__init__](/page/python-net/aspose.page.eps/psdocument/__init__/#str-aspose.page.eps.device.PsSaveOptions-int) | Initializes empty [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) when the number of Postscript document pages is known in advance. |
| [__init__](/page/python-net/aspose.page.eps/psdocument/__init__/#io.RawIOBase-aspose.page.eps.device.PsSaveOptions-int) | Initializes empty [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) when the number of Postscript document pages is known in advance. |
| [__init__](/page/python-net/aspose.page.eps/psdocument/__init__/#str) | Initializes [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) with an input PS/EPS file. |
| [__init__](/page/python-net/aspose.page.eps/psdocument/__init__/#io.RawIOBase) | Initializes [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) with a stream of PS/EPS file. |


### Properties
| Property | Description |
| :- | :- |
| [input_stream](/page/python-net/aspose.page.eps/psdocument/input_stream) | Gets or sets an input stream of PS/EPS file. |
| [number_of_pages](/page/python-net/aspose.page.eps/psdocument/number_of_pages) | Returns the number of pages in resulting PDF document. |


### Methods
| Method | Description |
| :- | :- |
| [save](/page/python-net/aspose.page.eps/psdocument/save/#aspose.page.Device-aspose.page.SaveOptions) | Saves PS/EPS file to a device. |
| [save](/page/python-net/aspose.page.eps/psdocument/save/#io.RawIOBase) | Saves given [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) as EPS file. This method is used only after updating XMP metadata.<br/>It saves initial EPS file with updated existing metadata or new one created while calling GetMetadata method.<br/>In the last case all necessary PostScript code and EPS comments are added. |
| [save](/page/python-net/aspose.page.eps/psdocument/save/#) | Saves given [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) as EPS file. This method is used only when PsDocument was created from scratch. |
| [save_as_pdf](/page/python-net/aspose.page.eps/psdocument/save_as_pdf/#str-aspose.page.eps.device.PdfSaveOptions) | Saves PS/EPS file to PDF file. |
| [save_as_pdf](/page/python-net/aspose.page.eps/psdocument/save_as_pdf/#io.RawIOBase-aspose.page.eps.device.PdfSaveOptions) | Saves PS/EPS file to PDF stream. |
| [resize_eps](/page/python-net/aspose.page.eps/psdocument/resize_eps/#str-aspose.pydrawing.SizeF-aspose.page.Units) | Resizes given [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) as EPS file. This method is used only after extracting EPS size.<br/>It saves initial EPS file with updated existing %%BoundingBox or new one will be created. Page transformation matrix also will be set. |
| [resize_eps](/page/python-net/aspose.page.eps/psdocument/resize_eps/#io.RawIOBase-aspose.pydrawing.SizeF-aspose.page.Units) | Resizes given [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) as EPS file. This method is used only after extracting EPS size.<br/>It saves initial EPS file with updated existing %%BoundingBox or new one will be created. Page transformation matrix also will be set. |
| [crop_eps](/page/python-net/aspose.page.eps/psdocument/crop_eps/#str-list) | Crops given [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) as EPS file.<br/>It saves initial EPS file with updated existing %%BoundingBox or new one will be created. |
| [crop_eps](/page/python-net/aspose.page.eps/psdocument/crop_eps/#io.RawIOBase-list) | Crops given [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) as EPS file.<br/>It saves initial EPS file with updated existing %%BoundingBox or new one will be created. |
| [save_image_as_eps](/page/python-net/aspose.page.eps/psdocument/save_image_as_eps/#io.RawIOBase-io.RawIOBase-aspose.page.eps.device.PsSaveOptions) | Saves PNG/JPEG/TIFF/BMP/GIF/EMF image from input stream to EPS output stream. |
| [save_image_as_eps](/page/python-net/aspose.page.eps/psdocument/save_image_as_eps/#str-str-aspose.page.eps.device.PsSaveOptions) | Saves PNG/JPEG/TIFF/BMP/GIF/EMF image from file to EPS file. |
| [save_image_as_eps](/page/python-net/aspose.page.eps/psdocument/save_image_as_eps/#aspose.pydrawing.Bitmap-str-aspose.page.eps.device.PsSaveOptions) | Saves Bitmap object to EPS file. |
| [save_image_as_eps](/page/python-net/aspose.page.eps/psdocument/save_image_as_eps/#aspose.pydrawing.Bitmap-io.RawIOBase-aspose.page.eps.device.PsSaveOptions) | Saves Bitmap object to EPS output stream. |
| [open_page](/page/python-net/aspose.page.eps/psdocument/open_page/#float-float) | Creates new page and make it current one. |
| [open_page](/page/python-net/aspose.page.eps/psdocument/open_page/#str) | Creates new page with document's size and make it current one. |
| [rotate](/page/python-net/aspose.page.eps/psdocument/rotate/#float) | Adds rotation counterclockwise about the origin to current graphics state (rotate current matrix). |
| [rotate](/page/python-net/aspose.page.eps/psdocument/rotate/#int) | Adds rotation counterclockwise about the origin to current graphics state (rotate current matrix). |
| [fill_text](/page/python-net/aspose.page.eps/psdocument/fill_text/#str-aspose.pydrawing.Font-float-float) | Adds a text string by filling interrior of glyphs. |
| [fill_text](/page/python-net/aspose.page.eps/psdocument/fill_text/#str-list-aspose.pydrawing.Font-float-float) | Adds a text string by filling interrior of glyphs. |
| [fill_text](/page/python-net/aspose.page.eps/psdocument/fill_text/#str-aspose.page.font.DrFont-float-float) | Adds a text string by filling interrior of glyphs. |
| [fill_text](/page/python-net/aspose.page.eps/psdocument/fill_text/#str-list-aspose.page.font.DrFont-float-float) | Adds a text string by filling interrior of glyphs. |
| [fill_text](/page/python-net/aspose.page.eps/psdocument/fill_text/#str-aspose.pydrawing.Font-float-float-aspose.pydrawing.Brush) | Adds a text string by filling interrior of glyphs. |
| [fill_text](/page/python-net/aspose.page.eps/psdocument/fill_text/#str-list-aspose.pydrawing.Font-float-float-aspose.pydrawing.Brush) | Adds a text string by filling interrior of glyphs. |
| [fill_text](/page/python-net/aspose.page.eps/psdocument/fill_text/#str-aspose.page.font.DrFont-float-float-aspose.pydrawing.Brush) | Adds a text string by filling interrior of glyphs. |
| [fill_text](/page/python-net/aspose.page.eps/psdocument/fill_text/#str-list-aspose.page.font.DrFont-float-float-aspose.pydrawing.Brush) | Adds a text string by filling interrior of glyphs. |
| [outline_text](/page/python-net/aspose.page.eps/psdocument/outline_text/#str-aspose.pydrawing.Font-float-float) | Adds a text string by drawing glyphs contours. |
| [outline_text](/page/python-net/aspose.page.eps/psdocument/outline_text/#str-list-aspose.pydrawing.Font-float-float) | Adds a text string by drawing glyphs contours. |
| [outline_text](/page/python-net/aspose.page.eps/psdocument/outline_text/#str-aspose.page.font.DrFont-float-float) | Adds a text string by drawing glyphs contours. |
| [outline_text](/page/python-net/aspose.page.eps/psdocument/outline_text/#str-list-aspose.page.font.DrFont-float-float) | Adds a text string by drawing glyphs contours. |
| [outline_text](/page/python-net/aspose.page.eps/psdocument/outline_text/#str-aspose.pydrawing.Font-float-float-aspose.pydrawing.Pen) | Adds a text string by drawing glyphs contours. |
| [outline_text](/page/python-net/aspose.page.eps/psdocument/outline_text/#str-list-aspose.pydrawing.Font-float-float-aspose.pydrawing.Pen) | Adds a text string by drawing glyphs contours. |
| [outline_text](/page/python-net/aspose.page.eps/psdocument/outline_text/#str-aspose.page.font.DrFont-float-float-aspose.pydrawing.Pen) | Adds a text string by drawing glyphs contours. |
| [outline_text](/page/python-net/aspose.page.eps/psdocument/outline_text/#str-list-aspose.page.font.DrFont-float-float-aspose.pydrawing.Pen) | Adds a text string by drawing glyphs contours. |
| [fill_and_stroke_text](/page/python-net/aspose.page.eps/psdocument/fill_and_stroke_text/#str-aspose.pydrawing.Font-float-float-aspose.pydrawing.Brush-aspose.pydrawing.Pen) | Adds a text string by filling interrior of glyphs and drawing glyphs contours. |
| [fill_and_stroke_text](/page/python-net/aspose.page.eps/psdocument/fill_and_stroke_text/#str-list-aspose.pydrawing.Font-float-float-aspose.pydrawing.Brush-aspose.pydrawing.Pen) | Adds a text string by filling interrior of glyphs and drawing glyphs contours. |
| [fill_and_stroke_text](/page/python-net/aspose.page.eps/psdocument/fill_and_stroke_text/#str-aspose.page.font.DrFont-float-float-aspose.pydrawing.Brush-aspose.pydrawing.Pen) | Adds a text string by filling interrior of glyphs and drawing glyphs contours. |
| [fill_and_stroke_text](/page/python-net/aspose.page.eps/psdocument/fill_and_stroke_text/#str-list-aspose.page.font.DrFont-float-float-aspose.pydrawing.Brush-aspose.pydrawing.Pen) | Adds a text string by filling interrior of glyphs and drawing glyphs contours. |
| [draw_polyline](/page/python-net/aspose.page.eps/psdocument/draw_polyline/#list-list-int) | Draws a polyline. |
| [draw_polyline](/page/python-net/aspose.page.eps/psdocument/draw_polyline/#list-list-int) | Draws a polyline. |
| [draw_polygon](/page/python-net/aspose.page.eps/psdocument/draw_polygon/#list-list-int) | Draws a polygon. |
| [draw_polygon](/page/python-net/aspose.page.eps/psdocument/draw_polygon/#list-list-int) | Draws a poligone. |
| [fill_polygon](/page/python-net/aspose.page.eps/psdocument/fill_polygon/#list-list-int) | Fills a poligone. |
| [fill_polygon](/page/python-net/aspose.page.eps/psdocument/fill_polygon/#list-list-int) | Fills a poligone. |
| [draw_image](/page/python-net/aspose.page.eps/psdocument/draw_image/#aspose.pydrawing.Bitmap) | Draw image. |
| [draw_image](/page/python-net/aspose.page.eps/psdocument/draw_image/#aspose.pydrawing.Bitmap-aspose.pydrawing.drawing2d.Matrix-aspose.pydrawing.Color) | Draw transformed image with background. |
| [merge_to_pdf](/page/python-net/aspose.page.eps/psdocument/merge_to_pdf/#str-list-aspose.page.SaveOptions) | Merges PS/EPS files to a device. |
| [merge_to_pdf](/page/python-net/aspose.page.eps/psdocument/merge_to_pdf/#io.RawIOBase-list-aspose.page.SaveOptions) | Merges PS/EPS files to a device. |
| [save_as_image](/page/python-net/aspose.page.eps/psdocument/save_as_image/#aspose.page.eps.device.ImageSaveOptions) | Saves PS/EPS file to images bytes arrays. |
| [get_xmp_metadata](/page/python-net/aspose.page.eps/psdocument/get_xmp_metadata/#) | Reads PS/EPS file and extracts XmpMetdata if it already exists or add new one if it doesn't exist. |
| [extract_eps_size](/page/python-net/aspose.page.eps/psdocument/extract_eps_size/#) | Reads EPS file and extracts a size of EPS image from %%BoundingBox comment or default page size (595, 842) if it doesn't exist. |
| [extract_eps_bounding_box](/page/python-net/aspose.page.eps/psdocument/extract_eps_bounding_box/#) | Reads EPS file and extracts bounding box of EPS image from %%BoundingBox comment or bounds for default page size (0, 0, 595, 842) if it doesn't exist. |
| [set_page_size](/page/python-net/aspose.page.eps/psdocument/set_page_size/#float-float) | Sets page size. To create pages with different sizes in one document use PsDocument.SetPageDevice <br/>method just after this method. |
| [close_page](/page/python-net/aspose.page.eps/psdocument/close_page/#) | Complete current page. |
| [write_graphics_save](/page/python-net/aspose.page.eps/psdocument/write_graphics_save/#) | Writes saving of the current graphics state (See PostScript specification on operator "gsave"). |
| [write_graphics_restore](/page/python-net/aspose.page.eps/psdocument/write_graphics_restore/#) | Writes restoring of the current graphics state (See PostScript specification on operator "grestore"). |
| [set_transform](/page/python-net/aspose.page.eps/psdocument/set_transform/#aspose.pydrawing.drawing2d.Matrix) | Set current transformation to this one. |
| [transform](/page/python-net/aspose.page.eps/psdocument/transform/#aspose.pydrawing.drawing2d.Matrix) | Adds transformation to current graphics state (concatenates this matrix with current one). |
| [translate](/page/python-net/aspose.page.eps/psdocument/translate/#float-float) | Adds translation to current graphics state (translates current matrix). |
| [scale](/page/python-net/aspose.page.eps/psdocument/scale/#float-float) | Adds scale to current graphics state (scale current matrix). |
| [shear](/page/python-net/aspose.page.eps/psdocument/shear/#float-float) | Adds shear transformation to current graphics state (shear current matrix). |
| [clip](/page/python-net/aspose.page.eps/psdocument/clip/#aspose.pydrawing.drawing2d.GraphicsPath) | Adds clip to current graphics state. |
| [clip_text](/page/python-net/aspose.page.eps/psdocument/clip_text/#str-aspose.pydrawing.Font-float-float) | Adds clip from an outline of given text in given font. |
| [clip_rectangle](/page/python-net/aspose.page.eps/psdocument/clip_rectangle/#aspose.pydrawing.RectangleF) | Adds clipping rectangle to current graphics state. |
| [clip_and_new_path](/page/python-net/aspose.page.eps/psdocument/clip_and_new_path/#aspose.pydrawing.drawing2d.GraphicsPath) | Adds clip to current graphics state and than writes "newpath" operator. It is necessary to do to escape<br/>of confluence of this clipping path and some subsequent pathes such as glyphs outlined with "charpath" operator. |
| [set_paint](/page/python-net/aspose.page.eps/psdocument/set_paint/#aspose.pydrawing.Brush) | Sets paint in current graphics state. |
| [get_paint](/page/python-net/aspose.page.eps/psdocument/get_paint/#) | Gets paint of current graphics state. |
| [set_stroke](/page/python-net/aspose.page.eps/psdocument/set_stroke/#aspose.pydrawing.Pen) | Sets stroke in current graphics state. |
| [get_stroke](/page/python-net/aspose.page.eps/psdocument/get_stroke/#) | Gets stroke of current graphics state. |
| [fill](/page/python-net/aspose.page.eps/psdocument/fill/#aspose.pydrawing.drawing2d.GraphicsPath) | Fill an arbitrary path. |
| [draw](/page/python-net/aspose.page.eps/psdocument/draw/#aspose.pydrawing.drawing2d.GraphicsPath) | Draw an arbitrary path. |
| [draw_arc](/page/python-net/aspose.page.eps/psdocument/draw_arc/#float-float-float-float-float-float) | Draws an arc. |
| [draw_line](/page/python-net/aspose.page.eps/psdocument/draw_line/#float-float-float-float) | Draws a line segment. |
| [draw_oval](/page/python-net/aspose.page.eps/psdocument/draw_oval/#float-float-float-float) | Draws an oval. |
| [draw_rect](/page/python-net/aspose.page.eps/psdocument/draw_rect/#float-float-float-float) | Draws a rectangle. |
| [draw_round_rect](/page/python-net/aspose.page.eps/psdocument/draw_round_rect/#float-float-float-float-float-float) | Draws a round rectangle. |
| [fill_arc](/page/python-net/aspose.page.eps/psdocument/fill_arc/#float-float-float-float-float-float) | Fills an arc. |
| [fill_oval](/page/python-net/aspose.page.eps/psdocument/fill_oval/#float-float-float-float) | Fills an oval. |
| [fill_rect](/page/python-net/aspose.page.eps/psdocument/fill_rect/#float-float-float-float) | Fills a rectangle. |
| [fill_round_rect](/page/python-net/aspose.page.eps/psdocument/fill_round_rect/#float-float-float-float-float-float) | Fills a round rectangle. |
| [draw_transparent_image](/page/python-net/aspose.page.eps/psdocument/draw_transparent_image/#aspose.pydrawing.Bitmap-aspose.pydrawing.drawing2d.Matrix-int) | Draw transformed transparent image. If image doesn't have Alpha channel it will be drawn as opaque image |
| [draw_explicit_image_mask](/page/python-net/aspose.page.eps/psdocument/draw_explicit_image_mask/#aspose.pydrawing.Bitmap-aspose.pydrawing.Bitmap-aspose.pydrawing.drawing2d.Matrix) | Draw masked image. |
| [merge](/page/python-net/aspose.page.eps/psdocument/merge/#list-aspose.page.Device-aspose.page.SaveOptions) | Merges PS/EPS files to a device. |



### See Also
* module [`aspose.page.eps`](..)
* class [`Document`](/page/python-net/aspose.page/document)
* class [`PsDocument`](/page/python-net/aspose.page.eps/psdocument)
