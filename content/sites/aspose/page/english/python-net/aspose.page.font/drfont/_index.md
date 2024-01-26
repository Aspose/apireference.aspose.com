---
title: DrFont class
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.page.font/drfont/
is_root: false
---

## DrFont class

Use this class instead of GDI+ Font



The DrFont type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [style](/page/python-net/aspose.page.font/drfont/style) | Gets style of this font. |
| [is_bold](/page/python-net/aspose.page.font/drfont/is_bold) | Gets a value indicating whether this instance is bold. |
| [is_italic](/page/python-net/aspose.page.font/drfont/is_italic) | Gets a value indicating whether this instance is italic. |
| [small_caps_scale_factor](/page/python-net/aspose.page.font/drfont/small_caps_scale_factor) | Gets the SmallCaps scale factor. |
| [family_name](/page/python-net/aspose.page.font/drfont/family_name) | Gets name of this font. |
| [size_points](/page/python-net/aspose.page.font/drfont/size_points) | Gets size of this font (points). |
| [ascent_points](/page/python-net/aspose.page.font/drfont/ascent_points) | Returns the cell ascent in points. |
| [descent_points](/page/python-net/aspose.page.font/drfont/descent_points) | Returns the cell descent in points. |
| [cell_height_points](/page/python-net/aspose.page.font/drfont/cell_height_points) | Shortcut for [`DrFont.ascent_points`](/page/python-net/aspose.page.font/drfont#ascent_points) + [`DrFont.descent_points`](/page/python-net/aspose.page.font/drfont#descent_points). |
| [ascent_lis](/page/python-net/aspose.page.font/drfont/ascent_lis) | Cell ascent of this font (lis).<br/>This is a vertical distance from cell top to cell baseline. |
| [descent_lis](/page/python-net/aspose.page.font/drfont/descent_lis) | Cell descent of this font (lis).<br/>This is a vertical distance from cell bottom to cell baseline. |
| [cell_height_lis](/page/python-net/aspose.page.font/drfont/cell_height_lis) | Returns cell height of this font (lis).<br/>This is a shortcut for [`DrFont.ascent_lis`](/page/python-net/aspose.page.font/drfont#ascent_lis) + [`DrFont.descent_lis`](/page/python-net/aspose.page.font/drfont#descent_lis). |
| [leading_lis](/page/python-net/aspose.page.font/drfont/leading_lis) | Returns leading of this font (lis).<br/>This is a shortcut for [`DrFont.line_spacing_lis`](/page/python-net/aspose.page.font/drfont#line_spacing_lis) - [`DrFont.cell_height_lis`](/page/python-net/aspose.page.font/drfont#cell_height_lis). |
| [leading_points](/page/python-net/aspose.page.font/drfont/leading_points) | Returns leading of this font (lis).<br/>This is a shortcut for [`DrFont.line_spacing_lis`](/page/python-net/aspose.page.font/drfont#line_spacing_lis) - [`DrFont.cell_height_lis`](/page/python-net/aspose.page.font/drfont#cell_height_lis). |
| [line_spacing_lis](/page/python-net/aspose.page.font/drfont/line_spacing_lis) | Returns cell spacing of this font (lis).<br/>This is a vertical distance between baselines of the two glyphs. |
| [line_spacing_points](/page/python-net/aspose.page.font/drfont/line_spacing_points) | Returns cell spacing of this font (points).<br/>This is a vertical distance between baselines of the two glyphs. |
| [style_ex](/page/python-net/aspose.page.font/drfont/style_ex) | This property contains additional information about font's style |


### Methods
| Method | Description |
| :- | :- |
| [get_text_width_points](/page/python-net/aspose.page.font/drfont/get_text_width_points/#str) | Gets the text width points. |
| [get_text_width_points](/page/python-net/aspose.page.font/drfont/get_text_width_points/#str-int-int) | Gets the text width points. |
| [replace](/page/python-net/aspose.page.font/drfont/replace/#aspose.page.font.DrFont) | Replace font content |
| [get_char_width_points](/page/python-net/aspose.page.font/drfont/get_char_width_points/#char) | Returns width of the character (points). |
| [get_text_size_points](/page/python-net/aspose.page.font/drfont/get_text_size_points/#str) | Returns measurement text box of the text in points. |
| [get_char_width_lis](/page/python-net/aspose.page.font/drfont/get_char_width_lis/#char) | Gets the char width lis. |
| [get_text_width_lis](/page/python-net/aspose.page.font/drfont/get_text_width_lis/#str) | Gets the text width lis. |
| [is_poorly_rendered_by_gdi_plus](/page/python-net/aspose.page.font/drfont/is_poorly_rendered_by_gdi_plus/#str) | Returns True for "Microsoft Sans Serif" font. This one is poorly rendered by GDI+. See Test286 and Gemini-6959. |



### See Also
* module [`aspose.page.font`](..)
