---
title: GraphicContext class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.svg.rendering/graphiccontext/
is_root: false
---

## GraphicContext class

Holds current graphics control parameters.
These parameters define the global framework within which the graphics operators execute.



The GraphicContext type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/svg/python-net/aspose.svg.rendering/graphiccontext/__init__/#) | Initializes a new instance of the [`GraphicContext`](/svg/python-net/aspose.svg.rendering/graphiccontext) class. |


### Properties
| Property | Description |
| :- | :- |
| [current_element](/svg/python-net/aspose.svg.rendering/graphiccontext/current_element) | Gets current processed element. |
| [line_cap](/svg/python-net/aspose.svg.rendering/graphiccontext/line_cap) | Sets or gets the code specifying the shape of the endpoints for any open path that is stroked. |
| [line_dash_offset](/svg/python-net/aspose.svg.rendering/graphiccontext/line_dash_offset) | Sets or gets the phase offset of the current line dash pattern. |
| [line_dash_pattern](/svg/python-net/aspose.svg.rendering/graphiccontext/line_dash_pattern) | Sets or gets the description of the dash pattern to be used when paths are stroked.<br/>Can be set to null or an empty array to be disabled. |
| [line_join](/svg/python-net/aspose.svg.rendering/graphiccontext/line_join) | Sets or gets the code specifying the shape of joints between connected segments of a stroked path. |
| [line_width](/svg/python-net/aspose.svg.rendering/graphiccontext/line_width) | Sets or gets the thickness of paths to be stroked. |
| [miter_limit](/svg/python-net/aspose.svg.rendering/graphiccontext/miter_limit) | Sets or gets the maximum length of mitered line joins for stroked paths. <br/>This parameter limits the length of "spikes" produced when line segments join at sharp angles. |
| [fill_brush](/svg/python-net/aspose.svg.rendering/graphiccontext/fill_brush) | Sets or gets the brush object that is used to fill the interiors of paths. |
| [stroke_brush](/svg/python-net/aspose.svg.rendering/graphiccontext/stroke_brush) | Sets or gets the brush object that is used for stroked paths. |
| [font](/svg/python-net/aspose.svg.rendering/graphiccontext/font) | Sets or gets the true type font object that is used for rendering text. |
| [font_size](/svg/python-net/aspose.svg.rendering/graphiccontext/font_size) | Sets or gets text font size. |
| [font_style](/svg/python-net/aspose.svg.rendering/graphiccontext/font_style) | Sets or gets text font style. |
| [character_spacing](/svg/python-net/aspose.svg.rendering/graphiccontext/character_spacing) | Sets or gets character spacing. |
| [transformation_matrix](/svg/python-net/aspose.svg.rendering/graphiccontext/transformation_matrix) | Sets or gets transformation matrix. |
| [text_info](/svg/python-net/aspose.svg.rendering/graphiccontext/text_info) | Gets a [`TextInfo`](/svg/python-net/aspose.svg.rendering/textinfo) object which contains information about rendered text. |


### Methods
| Method | Description |
| :- | :- |
| [transform](/svg/python-net/aspose.svg.rendering/graphiccontext/transform/#aspose.svg.drawing.IMatrix) | Modify the current transformation matrix by multiplying the specified matrix. |
| [clone](/svg/python-net/aspose.svg.rendering/graphiccontext/clone/#) | Creates a new instance of a GraphicContext class with the same property values as an existing instance. |



### See Also
* module [`aspose.svg.rendering`](..)
* class [`GraphicContext`](/svg/python-net/aspose.svg.rendering/graphiccontext)
* class [`TextInfo`](/svg/python-net/aspose.svg.rendering/textinfo)
