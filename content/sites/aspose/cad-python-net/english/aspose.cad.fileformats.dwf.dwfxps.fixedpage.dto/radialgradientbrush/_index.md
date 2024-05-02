---
title: RadialGradientBrush class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 180
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/
is_root: false
---

## RadialGradientBrush class

The radial gradient brush.



The RadialGradientBrush type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/__init__/#) | Initializes a new instance of the [`RadialGradientBrush`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush) class. |


### Properties
| Property | Description |
| :- | :- |
| [radial_gradient_brush_transform](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/radial_gradient_brush_transform) | Gets or sets the radial gradient brush transform.<br/>Describes the matrix transformation applied to the coordinate space of the brush.<br/>The Transform property is concatenated with the current effective render transform<br/>to yield an effective render transform local to the brush. The center, gradient origin,<br/>x radius, and y radius are transformed using the local effective render transform. |
| [radial_gradient_brush_gradient_stops](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/radial_gradient_brush_gradient_stops) | Gets or sets the radial gradient brush gradient stops.<br/>Holds a sequence of GradientStop elements. |
| [opacity](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/opacity) | Gets or sets the opacity.<br/>Defines the uniform transparency of the radial gradient.<br/>Values range from 0 (fully transparent) to 1 (fully opaque), inclusive.<br/>Values outside of this range are invalid. |
| [color_interpolation_mode](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/color_interpolation_mode) | Gets or sets the color interpolation mode.<br/>Specifies the gamma function for color interpolation.<br/>The gamma adjustment should not be applied to the alpha component,<br/>if specified. |
| [spread_method](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/spread_method) | Gets or sets the spread method.<br/>Describes how the brush should fill the content area outside of the primary,<br/>initial gradient area. Valid values are Pad, Reflect and Repeat. |
| [mapping_mode](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/mapping_mode) | Gets or sets the mapping mode.<br/>Specifies that center, x radius, and y radius are defined in<br/>the effective coordinate space (includes the Transform attribute of the brush). |
| [transform](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/transform) | Gets or sets the transform.<br/>Describes the matrix transformation applied to the coordinate space of the brush.<br/>The Transform property is concatenated with the current effective render transform<br/>to yield an effective render transform local to the brush.<br/>The ellipse defined by the center, gradient origin, x radius,<br/>and y radius values is transformed using the local effective render transform. |
| [center](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/center) | Gets or sets the center.<br/>Specifies the center point of the radial gradient(that is, the center of the ellipse).<br/>The radial gradient brush interpolates the colors from the gradient origin to the circumference of the ellipse.<br/>The circumference is determined by the center and the radii. |
| [gradient_origin](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/gradient_origin) | Gets or sets the gradient origin.<br/>Specifies the origin point of the radial gradient. |
| [radius_x](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/radius_x) | Gets or sets the radius x.<br/>Specifies the radius in the x dimension of the ellipse which defines the radial gradient. |
| [radius_y](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/radius_y) | Gets or sets the radius y.<br/>Specifies the radius in the y dimension of the ellipse which defines the radial gradient. |



### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](..)
* class [`RadialGradientBrush`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush)
