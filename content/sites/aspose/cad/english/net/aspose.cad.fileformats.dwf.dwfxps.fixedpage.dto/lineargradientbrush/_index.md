---
title: Class LinearGradientBrush
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO.LinearGradientBrush class. The linear gradient brush. The LinearGradientBrush element is used to specify a linear gradient brush along a vector. Fills a region with a linear gradient
type: docs
weight: 9390
url: /net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/
---
## LinearGradientBrush class

The linear gradient brush. The LinearGradientBrush element is used to specify a linear gradient brush along a vector. Fills a region with a linear gradient.

```csharp
public class LinearGradientBrush
```

## Constructors

| Name | Description |
| --- | --- |
| [LinearGradientBrush](lineargradientbrush/)() | Initializes a new instance of the `LinearGradientBrush` class. |

## Properties

| Name | Description |
| --- | --- |
| [ColorInterpolationMode](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/colorinterpolationmode/) { get; set; } | Gets or sets the color interpolation mode. Specifies the gamma function for color interpolation. The gamma adjustment should not be applied to the alpha component, if specified. |
| [EndPoint](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/endpoint/) { get; set; } | Gets or sets the end point. Specifies the end point of the linear gradient. The linear gradient brush interpolates the colors from the start point to the end point, where the start point represents an offset of 0, and the EndPoint represents an offset of 1. The Offset attribute value specified in a GradientStop element relates to the 0 and 1 offsets defined by the start point and end point. |
| [LinearGradientBrushGradientStops](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/lineargradientbrushgradientstops/) { get; set; } | Gets or sets the linear gradient brush gradient stops. Holds a sequence of GradientStop elements. |
| [LinearGradientBrushTransform](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/lineargradientbrushtransform/) { get; set; } | Gets or sets the linear gradient brush transform. Describes the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The start point and end point are transformed using the local effective render transform. |
| [MappingMode](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/mappingmode/) { get; set; } | Gets or sets the mapping mode. Specifies that the start point and end point are defined in the effective coordinate space (includes the Transform attribute of the brush). |
| [Opacity](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/opacity/) { get; set; } | Gets or sets the opacity. Defines the uniform transparency of the linear gradient. Values range from 0 (fully transparent) to 1 (fully opaque), inclusive.Values outside of this range are invalid. |
| [SpreadMethod](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/spreadmethod/) { get; set; } | Gets or sets the spread method. Describes how the brush should fill the content area outside of the primary, initial gradient area. Valid values are Pad, Reflect and Repeat. |
| [StartPoint](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/startpoint/) { get; set; } | Gets or sets the start point. Specifies the starting point of the linear gradient. |
| [Transform](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/lineargradientbrush/transform/) { get; set; } | Gets or sets the transform. Describes the matrix transformation applied to the coordinate space of the brush. The Transform property on a brush is concatenated with the current effective render transform to yield an effective render transform local to the brush. The start point and end point are transformed using the local effective render transform. |

### See Also

* namespace [Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/)
* assembly [Aspose.CAD](../../)


