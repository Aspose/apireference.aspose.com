---
title: Class SvgOptions
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.ImageOptions.SvgOptions class. The SVG file format creation options
type: docs
weight: 35830
url: /net/aspose.cad.imageoptions/svgoptions/
---
## SvgOptions class

The SVG file format creation options.

```csharp
public class SvgOptions : ImageOptionsBase
```

## Constructors

| Name | Description |
| --- | --- |
| [SvgOptions](svgoptions/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Callback](../../aspose.cad.imageoptions/svgoptions/callback/) { get; set; } | Gets or sets the font store options. |
| [CancellationToken](../../aspose.cad/imageoptionsbase/cancellationtoken/) { get; set; } | Token that can be used to interrupt export operation |
| [ColorType](../../aspose.cad.imageoptions/svgoptions/colortype/) { get; set; } | Gets or sets the color type for SVG image. |
| [Layers](../../aspose.cad/imageoptionsbase/layers/) { get; set; } | Gets or sets a of layer names must be exported. All data will be exported without layers if names is not sets. |
| [MinimumAbsoluteNonscaledLinewidth](../../aspose.cad.imageoptions/svgoptions/minimumabsolutenonscaledlinewidth/) { get; set; } | Lines with width in pixels less than this will be rescaled |
| [MinimumLinewidth](../../aspose.cad.imageoptions/svgoptions/minimumlinewidth/) { get; set; } | Minumum width of the line (i.e. width of zero-width line) relative to minimum non-rescaled linewidth |
| [MinimumRelativeLinewidthRatio](../../aspose.cad.imageoptions/svgoptions/minimumrelativelinewidthratio/) { get; set; } | Lines with width less than image's size\minimumRelativeLinewidthRatio will be rescaled if relative rescaling is used |
| virtual [Palette](../../aspose.cad/imageoptionsbase/palette/) { get; set; } | Gets or sets the color palette. |
| [Pc3File](../../aspose.cad/imageoptionsbase/pc3file/) { get; set; } | Gets or sets the PC3 file full name. |
| [RescaleSubpixelLinewidths](../../aspose.cad.imageoptions/svgoptions/rescalesubpixellinewidths/) { get; set; } | Wether sub-pixel lindewidths should be rescaled |
| virtual [ResolutionSettings](../../aspose.cad/imageoptionsbase/resolutionsettings/) { get; set; } | Gets or sets the resolution settings. |
| [Rotation](../../aspose.cad/imageoptionsbase/rotation/) { get; set; } | Gets or sets the parameter for rotate, flip, or rotate and flip the image.. |
| [Source](../../aspose.cad/imageoptionsbase/source/) { get; set; } | Gets or sets the source to create image in. |
| override [TargetFormat](../../aspose.cad.imageoptions/svgoptions/targetformat/) { get; } |  |
| [TextAsShapes](../../aspose.cad.imageoptions/svgoptions/textasshapes/) { get; set; } | Gets or sets a value indicating whether text must be converted as shapes. By default text will be converted as shapes. |
| [Timeout](../../aspose.cad/imageoptionsbase/timeout/) { get; set; } | Timeout value for export operation (in milliseconds) |
| [UseAbsoluteRescaling](../../aspose.cad.imageoptions/svgoptions/useabsoluterescaling/) { get; set; } | Wether minimum non-rescaled line widh should be defined relative to whole image size (if false) or in pixels (if true) |
| [UserWatermarkColor](../../aspose.cad/imageoptionsbase/userwatermarkcolor/) { get; set; } | Color for user-generated watermark |
| [UserWatermarkText](../../aspose.cad/imageoptionsbase/userwatermarktext/) { get; set; } | Text for user-generated watermark |
| [VectorRasterizationOptions](../../aspose.cad/imageoptionsbase/vectorrasterizationoptions/) { get; set; } | Gets or sets the vector rasterization options. |
| virtual [XmpData](../../aspose.cad/imageoptionsbase/xmpdata/) { get; set; } | Gets or sets the XMP metadata container. |

### See Also

* class [ImageOptionsBase](../../aspose.cad/imageoptionsbase/)
* namespace [Aspose.CAD.ImageOptions](../../aspose.cad.imageoptions/)
* assembly [Aspose.CAD](../../)


