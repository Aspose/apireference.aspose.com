---
title: Path class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 120
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/
is_root: false
---

## Path class

The path.
Defines a single graphical effect to be rendered to the page.
It paints a geometry with a brush and draws a stroke around it.



The Path type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/__init__/#) | Initializes a new instance of the [`Path`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path) class. |


### Properties
| Property | Description |
| :- | :- |
| [path_render_transform](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/path_render_transform) | Gets or sets the path render transform.<br/>Establishes a new coordinate frame for all attributes of the path and<br/>for all child elements of the path, such as the geometry defined by the Path.Data property element. |
| [path_clip](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/path_clip) | Gets or sets the path clip.<br/>Limits the rendered region of the element. |
| [path_opacity_mask](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/path_opacity_mask) | Gets or sets the path opacity mask.<br/>Specifies the mask of alpha values that is applied to the path in the same fashion as the Opacity attribute,<br/>but allowing different alpha values for different areas of the element. |
| [path_fill](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/path_fill) | Gets or sets the path fill.<br/>Describes the brush used to paint the geometry<br/>specified by the Data property of the path. |
| [path_stroke](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/path_stroke) | Gets or sets the path stroke.<br/>Specifies the brush used to draw the stroke. |
| [path_data](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/path_data) | Gets or sets the path data.<br/>Describes the geometry of the path. |
| [data](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/data) | Gets or sets the data.<br/>Describes the geometry of the path. |
| [fill](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/fill) | Gets or sets the fill.<br/>Describes the brush used to paint the geometry<br/>specified by the Data property of the path. |
| [render_transform](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/render_transform) | Gets or sets the render transform.<br/>Establishes a new coordinate frame for all attributes of the path<br/>and for all child elements of the path,<br/>such as the geometry defined by the Path.Data property element. |
| [clip](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/clip) | Gets or sets the clip.<br/>Limits the rendered region of the element. |
| [opacity](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/opacity) | Gets or sets the opacity.<br/>Defines the uniform transparency of the path element.<br/>Values range from 0 (fully transparent) to 1 (fully opaque),<br/>inclusive.Values outside of this range are invalid. |
| [opacity_mask](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/opacity_mask) | Gets or sets the opacity mask.<br/>Specifies a mask of alpha values that is applied to the path<br/>in the same fashion as the Opacity attribute,<br/>but allowing different alpha values for different areas of the element. |
| [stroke](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/stroke) | Gets or sets the stroke.<br/>Specifies the brush used to draw the stroke. |
| [stroke_dash_array](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/stroke_dash_array) | Gets or sets the stroke dash array.<br/>Specifies the length of dashes and gaps of the outline stroke.<br/>These values are specified as multiples of the stroke thickness<br/>as a space-separated list with an even number of non-negative values.<br/>When a stroke is drawn, the dashes and gaps specified by these<br/>values are repeated to cover the length of the stroke.<br/>If this attribute is omitted, the stroke is drawn solid, without any gaps. |
| [stroke_dash_cap](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/stroke_dash_cap) | Gets or sets the stroke dash cap.<br/>Specifies how the ends of each dash are drawn.<br/>Valid values are Flat, Round, Square, and Triangle. |
| [stroke_dash_offset](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/stroke_dash_offset) | Gets or sets the stroke dash offset.<br/>Adjusts the start point for repeating the dash array pattern.<br/>If this value is omitted, the dash array aligns with the origin of the stroke.<br/>Values are specified as multiples of the stroke thickness. |
| [stroke_end_line_cap](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/stroke_end_line_cap) | Gets or sets the stroke end line cap.<br/>Defines the shape of the end of the last dash in a stroke.<br/>Valid values are Flat, Square, Round, and Triangle. |
| [stroke_start_line_cap](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/stroke_start_line_cap) | Gets or sets the stroke start line cap.<br/>Defines the shape of the beginning of the first dash in a stroke.<br/>Valid values are Flat, Square, Round, and Triangle. |
| [stroke_line_join](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/stroke_line_join) | Gets or sets the stroke line join.<br/>Specifies how a stroke is drawn at a corner of a path.<br/>Valid values are Miter, Bevel, and Round.<br/>If Miter is selected, the value of StrokeMiterLimit is used in drawing the stroke. |
| [stroke_miter_limit](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/stroke_miter_limit) | Gets or sets the stroke miter limit.<br/>The ratio between the maximum miter length and half of the stroke thickness.<br/>This value is significant only if the StrokeLineJoin attribute specifies Miter. |
| [stroke_thickness](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/stroke_thickness) | Gets or sets the stroke thickness.<br/>Specifies the thickness of a stroke,<br/>in units of the effective coordinate space(includes the path's render transform).<br/>The stroke is drawn on top of the boundary<br/>of the geometry specified by the Path element’s Data property.<br/>Half of the StrokeThickness extends outside of the geometry specified by the Data property |
| [name](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/name) | Gets or sets the name.<br/>Contains a string value that identifies the current element as a named,<br/>addressable point in the document for the purpose of hyperlinking. |
| [fixed_page_navigate_uri](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/fixed_page_navigate_uri) | Gets or sets the fixed page navigate uri.<br/>Associates a hyperlink URI with the element.<br/>May be a relative reference or a URI that addresses a resource<br/>that is internal to or external to the package. |
| [language](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/language) | Gets or sets the language.<br/>Specifies the default language used for the current element and for any child or descendant elements.<br/>The language is specified according to RFC 3066. |
| [automation_properties_name](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/automation_properties_name) | Gets or sets the automation properties name.<br/>A brief description of the Path for accessibility purposes, particularly if filled with an ImageBrush. |
| [automation_properties_help_text](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/automation_properties_help_text) | Gets or sets the automation properties help text.<br/>A detailed description of the Path for accessibility purposes, particularly if filled with an ImageBrush. |
| [snaps_to_device_pixels](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/snaps_to_device_pixels) | Gets or sets a value indicating whether snaps to device pixels.<br/>On Anti-aliasing consumers controls if control points<br/>snap to the nearest device pixels. Valid values are ‘false’ and ‘true’.<br/>Consumers MAY ignore this attribute. |
| [snaps_to_device_pixels_specified](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path/snaps_to_device_pixels_specified) | Gets or sets a value indicating whether snaps to device pixels specified. |



### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](..)
* class [`Path`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/path)
