---
title: PsDocument class
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 60
url: /python-net/aspose.page.eps/psdocument/
---

## PsDocument class

This class encapsulates PS/EPS documents.

**Inheritance:** `PsDocument` → [`Document`](/page/python-net/aspose.page/document)

The PsDocument type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
| `PsDocument()` | Initializes empty [PsDocument](/page/python-net/aspose.page.eps/psdocument/). This constructor is used only for additional operations that are not related to PostScript files,<br/>            for example, converting fonts. |
| `PsDocument(out_ps_file_path, options)` | Initializes a new instance of the PsDocument class |
| `PsDocument(out_ps_stream, options)` | Initializes a new instance of the PsDocument class |
| `PsDocument(out_ps_file_path, options, multipaged)` | Initializes a new instance of the PsDocument class |
| `PsDocument(out_ps_stream, options, multipaged)` | Initializes a new instance of the PsDocument class |
| `PsDocument(out_ps_file_path, options, number_of_pages)` | Initializes a new instance of the PsDocument class |
| `PsDocument(out_ps_stream, options, number_of_pages)` | Initializes a new instance of the PsDocument class |
| `PsDocument(ps_file_path)` | Initializes a new instance of the PsDocument class |
| `PsDocument(in_ps_stream)` | Initializes a new instance of the PsDocument class |
## Properties
| Name | Description |
| :- | :- |
| `input_stream` | Gets or sets an input stream of PS/EPS file. |
| `number_of_pages` | Returns the number of pages in resulting PDF document. |
## Methods
| Name | Description |
| :- | :- |
| `save_as_pdf(out_pdf_file_path, options)` | Saves PS/EPS file to PDF file. |
| `save_as_pdf(pdf_stream, options)` | Saves PS/EPS file to PDF stream. |
| `save(eps_stream)` | Saves PS/EPS file to PDF stream. |
| `save()` | Saves PS/EPS file to PDF file. |
| `resize_eps(out_eps_file_path, new_size_in_units, units)` | Resizes given [PsDocument](/page/python-net/aspose.page.eps/psdocument/) as EPS file. This method is used only after extracting EPS size.<br/>            It saves initial EPS file with updated existing %%BoundingBox or new one will be created. Page transformation matrix also will be set. |
| `resize_eps(eps_stream, new_size_in_units, units)` | Resizes given [PsDocument](/page/python-net/aspose.page.eps/psdocument/) as EPS file. This method is used only after extracting EPS size.<br/>            It saves initial EPS file with updated existing %%BoundingBox or new one will be created. Page transformation matrix also will be set. |
| `crop_eps(out_eps_file_path, crop_box)` | Crops given [PsDocument](/page/python-net/aspose.page.eps/psdocument/) as EPS file.<br/>            It saves initial EPS file with updated existing %%BoundingBox or new one will be created. |
| `crop_eps(eps_stream, crop_box)` | Crops given [PsDocument](/page/python-net/aspose.page.eps/psdocument/) as EPS file.<br/>            It saves initial EPS file with updated existing %%BoundingBox or new one will be created. |
| `save_image_as_eps(image_stream, eps_stream, options)` | Saves PNG/JPEG/TIFF/BMP/GIF/EMF image from input stream to EPS output stream. |
| `save_image_as_eps(image_file_path, eps_file_path, options)` | Saves PNG/JPEG/TIFF/BMP/GIF/EMF image from file to EPS file. |
| `save_image_as_eps(image, eps_file_path, options)` | Saves Bitmap object to EPS file. |
| `save_image_as_eps(image, eps_stream, options)` | Saves Bitmap object to EPS output stream. |
| `convert_type_3_font_to_ttf(type_3_font_file_path, output_dir)` | Converts Type 3 font to TrueType.<br/>            The name of the converted TTF font will be the same as input Type 3 font file with ".ttf" extension.<br/>            TTF file will be saved to assigned output directory. |
| `convert_type_3_font_to_ttf(type_3_font_file_path, output_stream)` | Converts Type 3 font to TrueType stream. |
| `open_page(width, height)` | Creates new page and make it current one. |
| `open_page(page_name)` | Creates new page with document's size and make it current one. |
| `rotate(angle_radians)` | Adds rotation counterclockwise about the origin to current graphics state (rotate current matrix). |
| `rotate(angle_degrees)` | Adds rotation counterclockwise about the origin to current graphics state (rotate current matrix). |
| `fill_text(text, font, x, y)` | Adds a text string by filling interrior of glyphs. |
| `fill_text(text, advances, font, x, y)` | Adds a text string by filling interrior of glyphs. |
| `fill_text(text, dr_font, x, y)` | Adds a text string by filling interrior of glyphs. |
| `fill_text(text, advances, dr_font, x, y)` | Adds a text string by filling interrior of glyphs. |
| `fill_text(text, font, x, y, fill)` | Adds a text string by filling interrior of glyphs. |
| `fill_text(text, advances, font, x, y, fill)` | Adds a text string by filling interrior of glyphs. |
| `fill_text(text, dr_font, x, y, fill)` | Adds a text string by filling interrior of glyphs. |
| `fill_text(text, advances, dr_font, x, y, fill)` | Adds a text string by filling interrior of glyphs. |
| `outline_text(text, font, x, y)` | Adds a text string by drawing glyphs contours. |
| `outline_text(text, advances, font, x, y)` | Adds a text string by drawing glyphs contours. |
| `outline_text(text, dr_font, x, y)` | Adds a text string by drawing glyphs contours. |
| `outline_text(text, advances, dr_font, x, y)` | Adds a text string by drawing glyphs contours. |
| `outline_text(text, font, x, y, stroke)` | Adds a text string by drawing glyphs contours. |
| `outline_text(text, advances, font, x, y, stroke)` | Adds a text string by drawing glyphs contours. |
| `outline_text(text, dr_font, x, y, stroke)` | Adds a text string by drawing glyphs contours. |
| `outline_text(text, advances, dr_font, x, y, stroke)` | Adds a text string by drawing glyphs contours. |
| `fill_and_stroke_text(text, font, x, y, fill_paint, stroke)` | Adds a text string by filling interrior of glyphs and drawing glyphs contours. |
| `fill_and_stroke_text(text, advances, font, x, y, fill_paint, stroke)` | Adds a text string by filling interrior of glyphs and drawing glyphs contours. |
| `fill_and_stroke_text(text, dr_font, x, y, fill_paint, stroke)` | Adds a text string by filling interrior of glyphs and drawing glyphs contours. |
| `fill_and_stroke_text(text, advances, dr_font, x, y, fill_paint, stroke)` | Adds a text string by filling interrior of glyphs and drawing glyphs contours. |
| `draw_polyline(x_points, y_points, n_points)` | Draws a polyline. |
| `draw_polyline(x_points, y_points, n_points)` | Draws a polyline. |
| `draw_polygon(x_points, y_points, n_points)` | Draws a polygon. |
| `draw_polygon(x_points, y_points, n_points)` | Draws a poligone. |
| `fill_polygon(x_points, y_points, n_points)` | Fills a poligone. |
| `fill_polygon(x_points, y_points, n_points)` | Fills a poligone. |
| `draw_image(image)` | Draw image. |
| `draw_image(image, transform, bkg)` | Draw transformed image with background. |
| `merge_to_pdf(out_pdf_file_path, files_for_merge, options)` | Merges PS/EPS files to a device. |
| `merge_to_pdf(pdf_stream, files_for_merge, options)` | Merges PS/EPS files to a device. |
| `save_as_image(options)` | Saves PS/EPS file to images bytes arrays. |
| `get_xmp_metadata()` | Reads PS/EPS file and extracts XmpMetdata if it already exists or add new one if it doesn't exist. |
| `extract_text(options, start_page, end_page)` | Extract text from PS file. The text can be extracted only if it is written with Type 42 (TrueType) font or Type 0 font with Type 42 fonts in its Vector Map. |
| `extract_eps_size()` | Reads EPS file and extracts a size of EPS image from %%BoundingBox comment or default page size (595, 842) if it doesn't exist. |
| `extract_eps_bounding_box()` | Reads EPS file and extracts bounding box of EPS image from %%BoundingBox comment or bounds for default page size (0, 0, 595, 842) if it doesn't exist. |
| `convert_type_1_font_to_ttf(type_1_font_file_path, output_dir)` | Converts Type 1 font to TrueType.<br/>            The name of the converted TTF font will be the same as input Type 1 font with ".ttf" extension.<br/>            TTF file will be saved to assigned output directory. |
| `set_page_size(width, height)` | Sets page size. To create pages with different sizes in one document use |
| `close_page()` | Complete current page. |
| `write_graphics_save()` | Writes saving of the current graphics state (See PostScript specification on operator "gsave"). |
| `write_graphics_restore()` | Writes restoring of the current graphics state (See PostScript specification on operator "grestore"). |
| `set_transform(matrix)` | Set current transformation to this one. |
| `transform(matrix)` | Adds transformation to current graphics state (concatenates this matrix with current one). |
| `translate(x, y)` | Adds translation to current graphics state (translates current matrix). |
| `scale(x_scale, y_scale)` | Adds scale to current graphics state (scale current matrix). |
| `shear(shx, shy)` | Adds shear transformation to current graphics state (shear current matrix). |
| `clip(s)` | Adds clip to current graphics state. |
| `clip_text(text, font, x, y)` | Adds clip from an outline of given text in given font. |
| `clip_rectangle(rect)` | Adds clipping rectangle to current graphics state. |
| `clip_and_new_path(s)` | Adds clip to current graphics state and than writes "newpath" operator. It is necessary to do to escape<br/>            of confluence of this clipping path and some subsequent pathes such as glyphs outlined with "charpath" operator. |
| `set_paint(paint)` | Sets paint in current graphics state. |
| `get_paint()` | Gets paint of current graphics state. |
| `set_stroke(stroke)` | Sets stroke in current graphics state. |
| `get_stroke()` | Gets stroke of current graphics state. |
| `fill(shape)` | Fill an arbitrary path. |
| `draw(shape)` | Draw an arbitrary path. |
| `draw_arc(x, y, width, height, start_angle, arc_angle)` | Draws an arc. |
| `draw_line(x1, y1, x2, y2)` | Draws a line segment. |
| `draw_oval(x, y, width, height)` | Draws an oval. |
| `draw_rect(x, y, width, height)` | Draws a rectangle. |
| `draw_round_rect(x, y, width, height, arc_width, arc_height)` | Draws a round rectangle. |
| `fill_arc(x, y, width, height, start_angle, arc_angle)` | Fills an arc. |
| `fill_oval(x, y, width, height)` | Fills an oval. |
| `fill_rect(x, y, width, height)` | Fills a rectangle. |
| `fill_round_rect(x, y, width, height, arc_width, arc_height)` | Fills a round rectangle. |
| `draw_transparent_image(image, transform, transparency_threshold)` | Draw transformed transparent image. If image doesn't have Alpha channel it will be drawn as opaque image |
| `draw_explicit_image_mask(image_24bpp, alpha_mask_1bpp, transform)` | Draw masked image. |

### See Also

* module [`aspose.page.eps`](/page/python-net/aspose.page.eps/)
* package [`aspose.page`](/page/python-net/)

