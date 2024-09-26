---
title: PageAPI class
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 30
url: /python-net/aspose.page.xps.features.eventbasedmodifications/pageapi/
---

## PageAPI class

The Page element modification API.



The PageAPI type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
| `utils` | Gets the object that provides utilities beyond the formal XPS manipulation API. |
| `total_page_count` | Returns the total number of pages in all documents inside XPS document. |
| `page_count` | Returns the number of pages in the active document. |
| `height` | Returns/sets the height of the page, expressed as a real number<br/>            in units of the effective coordinate space. |
| `width` | Returns/sets the width of the page, expressed as a real number in<br/>            units of the effective coordinate space. |
## Methods
| Name | Description |
| :- | :- |
| `add_canvas(canvas)` | Adds a canvas. |
| `add_canvas()` | Adds a canvas. |
| `add_path(path)` | Adds a path element. |
| `add_path(data)` | Adds a new path to the page. |
| `add_glyphs(glyphs)` | Adds a glyphs element. |
| `add_glyphs(font_family, font_rendering_em_size, font_style, origin_x, origin_y, unicode_string)` | Adds new glyphs to the page. |
| `add_glyphs(font, font_rendering_em_size, origin_x, origin_y, unicode_string)` | Adds new glyphs to the page. |
| `create_glyphs(font_family, font_rendering_em_size, font_style, origin_x, origin_y, unicode_string)` | Creates new glyphs. |
| `create_glyphs(font, font_rendering_em_size, origin_x, origin_y, unicode_string)` | Creates new glyphs. |
| `insert_glyphs(index, font_family, font_size, font_style, origin_x, origin_y, unicode_string)` | Inserts new glyphs to the page at |
| `insert_glyphs(index, font, font_size, origin_x, origin_y, unicode_string)` | Inserts new glyphs to the page at |
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
| `remove_at(index)` | Removes an element at |
| `create_canvas()` | Creates a new canvas. |
| `insert_canvas(index)` | Inserts a new canvas to the page at |
| `create_path(data)` | Creates a new path. |
| `insert_path(index, data)` | Inserts a new path to the page at |
| `create_matrix(m11, m12, m21, m22, m31, m32)` | Creates a new affine transformation matrix. |
| `create_arc_segment(point, size, rotation_angle, is_large_arc, sweep_direction, is_stroked)` | Creates a new elliptical arc segment. |
| `create_poly_line_segment(points, is_stroked)` | Creates a new polygonal drawing containing an arbitrary number of individual vertices. |
| `create_poly_bezier_segment(points, is_stroked)` | Creates a new set of cubic Bézier curves. |
| `create_poly_quadratic_bezier_segment(points, is_stroked)` | Creates a new set of quadratic Bézier curves from the previous point in the path figure through a set<br/>            of vertices, using specified control points. |
| `create_visual_brush(element, viewbox, viewport)` | Creates a new visual brush. |
| `add_outline_entry(description, outline_level, target_page_number)` | Adds an outline entry to the document. |

### See Also

* module [`aspose.page.xps.features.eventbasedmodifications`](/page/python-net/aspose.page.xps.features.eventbasedmodifications/)
* package [`aspose.page`](/page/python-net/)

