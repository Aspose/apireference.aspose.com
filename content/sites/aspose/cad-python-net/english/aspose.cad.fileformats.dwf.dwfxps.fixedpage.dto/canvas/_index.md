---
title: Canvas class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/
is_root: false
---

## Canvas class

The canvas.
The Canvas element groups elements together.
Glyphs and Path elements can be grouped in a canvas in order to be identified as a unit(as a hyperlink destination)
or to apply a composed property value to each child and ancestor element.



The Canvas type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/__init__/#) | Initializes a new instance of the [`Canvas`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas) class. |


### Properties
| Property | Description |
| :- | :- |
| [canvas_resources](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/canvas_resources) | Gets or sets the canvas resources.<br/>Contains the resource dictionary for the Canvas element. |
| [canvas_render_transform](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/canvas_render_transform) | Gets or sets the canvas render transform.<br/>Establishes a new coordinate frame for the child and descendant elements of the canvas,<br/>such as another canvas.Also affects clip and opacity mask. |
| [canvas_clip](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/canvas_clip) | Gets or sets the canvas clip.<br/>Limits the rendered region of the element. |
| [canvas_opacity_mask](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/canvas_opacity_mask) | Gets or sets the canvas opacity mask.<br/>Specifies a mask of alpha values that is applied to the canvas in the same fashion as the Opacity attribute,<br/>but allowing different alpha values for different areas of  the element. |
| [items](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/items) | Gets or sets the items.<br/>Grouped together FixedPage descendant elements. |
| [render_transform](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/render_transform) | Gets or sets the render transform.<br/>Establishes a new coordinate frame for the child and descendant elements of the canvas, such as another canvas.<br/>Also affects clip and opacity mask. |
| [clip](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/clip) | Gets or sets the clip.<br/>Limits the rendered region of the element. |
| [opacity](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/opacity) | Gets or sets the opacity.<br/>Defines the uniform transparency of the canvas.<br/>Values range from 0 (fully transparent) to 1 (fully opaque), inclusive.<br/>Values outside of this range are invalid. |
| [opacity_mask](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/opacity_mask) | Gets or sets the opacity mask.<br/>Specifies a mask of alpha values that is applied to the canvas<br/>in the same fashion as the Opacity attribute,<br/>but allowing different alpha values for different areas of the element. |
| [name](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/name) | Gets or sets the name.<br/>Contains a string value that identifies the current element as a named,<br/>addressable point in the document for the purpose of hyperlinking. |
| [render_options_edge_mode](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/render_options_edge_mode) | Gets or sets the render options edge mode.<br/>Controls how edges of paths within the canvas are rendered.<br/>The only valid value is Aliased.<br/>Omitting this attribute causes the edges to be rendered in the consumer's default manner. |
| [render_options_edge_mode_specified](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/render_options_edge_mode_specified) | Gets or sets a value indicating whether render options edge mode specified. |
| [fixed_page_navigate_uri](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/fixed_page_navigate_uri) | Gets or sets the fixed page navigate uri.<br/>Associates a hyperlink URI with the element.<br/>May be a relative reference or a URI that addresses a resource<br/>that is internal to or external to the package. |
| [language](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/language) | Gets or sets the language.<br/>Specifies the default language used for the current element and for any child or descendant elements.<br/>The language is specified according to RFC 3066. |
| [automation_properties_name](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/automation_properties_name) | Gets or sets the automation properties name.<br/>A brief description of the Canvas contents for accessibility purposes,<br/>particularly if filled with a set of vector graphics<br/>and text elements intended to comprise a single vector graphic. |
| [automation_properties_help_text](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas/automation_properties_help_text) | Gets or sets the automation properties help text.<br/>A detailed description of the Canvas contents for accessibility purposes,<br/>particularly if filled with a set of graphics and text elements<br/>intended to comprise a single vector graphic. |



### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](..)
* class [`Canvas`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/canvas)
