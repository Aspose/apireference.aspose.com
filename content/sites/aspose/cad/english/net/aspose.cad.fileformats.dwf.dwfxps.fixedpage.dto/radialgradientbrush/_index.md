---
title: Class RadialGradientBrush
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO.RadialGradientBrush class. The radial gradient brush
type: docs
weight: 9500
url: /net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/
---
## RadialGradientBrush class

The radial gradient brush.

```csharp
public class RadialGradientBrush
```

## Constructors

| Name | Description |
| --- | --- |
| [RadialGradientBrush](radialgradientbrush/)() | Initializes a new instance of the `RadialGradientBrush` class. |

## Properties

| Name | Description |
| --- | --- |
| [Center](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/center/) { get; set; } | Gets or sets the center. Specifies the center point of the radial gradient(that is, the center of the ellipse). The radial gradient brush interpolates the colors from the gradient origin to the circumference of the ellipse. The circumference is determined by the center and the radii. |
| [ColorInterpolationMode](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/colorinterpolationmode/) { get; set; } | Gets or sets the color interpolation mode. Specifies the gamma function for color interpolation. The gamma adjustment should not be applied to the alpha component, if specified. |
| [GradientOrigin](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/gradientorigin/) { get; set; } | Gets or sets the gradient origin. Specifies the origin point of the radial gradient. |
| [MappingMode](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/mappingmode/) { get; set; } | Gets or sets the mapping mode. Specifies that center, x radius, and y radius are defined in the effective coordinate space (includes the Transform attribute of the brush). |
| [Opacity](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/opacity/) { get; set; } | Gets or sets the opacity. Defines the uniform transparency of the radial gradient. Values range from 0 (fully transparent) to 1 (fully opaque), inclusive. Values outside of this range are invalid. |
| [RadialGradientBrushGradientStops](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/radialgradientbrushgradientstops/) { get; set; } | Gets or sets the radial gradient brush gradient stops. Holds a sequence of GradientStop elements. |
| [RadialGradientBrushTransform](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/radialgradientbrushtransform/) { get; set; } | Gets or sets the radial gradient brush transform. Describes the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The center, gradient origin, x radius, and y radius are transformed using the local effective render transform. |
| [RadiusX](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/radiusx/) { get; set; } | Gets or sets the radius x. Specifies the radius in the x dimension of the ellipse which defines the radial gradient. |
| [RadiusY](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/radiusy/) { get; set; } | Gets or sets the radius y. Specifies the radius in the y dimension of the ellipse which defines the radial gradient. |
| [SpreadMethod](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/spreadmethod/) { get; set; } | Gets or sets the spread method. Describes how the brush should fill the content area outside of the primary, initial gradient area. Valid values are Pad, Reflect and Repeat. |
| [Transform](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/radialgradientbrush/transform/) { get; set; } | Gets or sets the transform. Describes the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The ellipse defined by the center, gradient origin, x radius, and y radius values is transformed using the local effective render transform. |

### See Also

* namespace [Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/)
* assembly [Aspose.CAD](../../)


