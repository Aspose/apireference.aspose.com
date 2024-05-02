---
title: LinearGradientBrush class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 100
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/
is_root: false
---

## LinearGradientBrush class

The linear gradient brush.
The LinearGradientBrush element is used to specify a linear gradient brush along a vector.
Fills a region with a linear gradient.



The LinearGradientBrush type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/__init__/#) | Initializes a new instance of the [`LinearGradientBrush`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush) class. |


### Properties
| Property | Description |
| :- | :- |
| [linear_gradient_brush_transform](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/linear_gradient_brush_transform) | Gets or sets the linear gradient brush transform.<br/>Describes the matrix transformation applied to the coordinate space of the brush.<br/>The Transform property is concatenated with the current effective render<br/>transform to yield an effective render transform local to the brush.<br/>The start point and end point are transformed using the local effective render transform. |
| [linear_gradient_brush_gradient_stops](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/linear_gradient_brush_gradient_stops) | Gets or sets the linear gradient brush gradient stops.<br/>Holds a sequence of GradientStop elements. |
| [opacity](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/opacity) | Gets or sets the opacity.<br/>Defines the uniform transparency of the linear gradient.<br/>Values range from 0 (fully transparent) to 1 (fully opaque),<br/>inclusive.Values outside of this range are invalid. |
| [color_interpolation_mode](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/color_interpolation_mode) | Gets or sets the color interpolation mode.<br/>Specifies the gamma function for color interpolation.<br/>The gamma adjustment should not be applied to the alpha component,<br/>if specified. |
| [spread_method](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/spread_method) | Gets or sets the spread method.<br/>Describes how the brush should fill the content<br/>area outside of the primary, initial gradient area.<br/>Valid values are Pad, Reflect and Repeat. |
| [mapping_mode](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/mapping_mode) | Gets or sets the mapping mode.<br/>Specifies that the start point and end point<br/>are defined in the effective coordinate space<br/>(includes the Transform attribute of the brush). |
| [transform](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/transform) | Gets or sets the transform.<br/>Describes the matrix transformation applied to the coordinate space of the brush.<br/>The Transform property on a brush is concatenated with the current effective<br/>render transform to yield an effective render transform local to the brush.<br/>The start point and end point are transformed using the local effective render transform. |
| [start_point](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/start_point) | Gets or sets the start point.<br/>Specifies the starting point of the linear gradient. |
| [end_point](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/end_point) | Gets or sets the end point.<br/>Specifies the end point of the linear gradient.<br/>The linear gradient brush interpolates the colors from<br/>the start point to the end point, where the start point<br/>represents an offset of 0, and the EndPoint represents an offset of 1.<br/>The Offset attribute value specified in a GradientStop element<br/>relates to the 0 and 1 offsets defined by the start point and end point. |



### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](..)
* class [`LinearGradientBrush`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush)
