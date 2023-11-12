---
title: Class SvgOptions
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.ImageOptions.SvgOptions class. The SVG file format creation options
type: docs
weight: 36540
url: /net/aspose.cad.imageoptions/svgoptions/
---
## SvgOptions class

The SVG file format creation options.

```csharp
public class SvgOptions : ImageOptionsBase, ITextAsShapesOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [SvgOptions](svgoptions/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Callback](../../aspose.cad.imageoptions/svgoptions/callback/) { get; set; } | Gets or sets the callback that can be used to store image and font binary data as user needs |
| [CancellationToken](../../aspose.cad/imageoptionsbase/cancellationtoken/) { get; set; } | Token that can be used to interrupt export operation |
| [Layers](../../aspose.cad/imageoptionsbase/layers/) { get; set; } | Gets or sets a of layer names must be exported. All data will be exported without layers if names is not sets. |
| [MinimumAbsoluteNonscaledLinewidth](../../aspose.cad.imageoptions/svgoptions/minimumabsolutenonscaledlinewidth/) { get; set; } | Lines with width in pixels less than this will be rescaled if absolute rescaling treshold |
| [MinimumLinewidth](../../aspose.cad.imageoptions/svgoptions/minimumlinewidth/) { get; set; } | Minumum width of the line relative to minimum non-rescaled linewidth. A line with width of 0 would be drawn with this width if rescaling is used ( as it is by default), lines thicker than that will be drawn thicker until they reach rescaling treshold, lines thicker than that won't be rescaled. |
| [MinimumRelativeLinewidthRatio](../../aspose.cad.imageoptions/svgoptions/minimumrelativelinewidthratio/) { get; set; } | Lines with width less than image's size\minimumRelativeLinewidthRatio will be rescaled if relative rescaling treshold is used. A smaller dimension is picked as image size. |
| virtual [Palette](../../aspose.cad/imageoptionsbase/palette/) { get; set; } | Gets or sets the color palette. |
| [Pc3File](../../aspose.cad/imageoptionsbase/pc3file/) { get; set; } | Gets or sets the PC3 file full name. |
| [RescaleSubpixelLinewidths](../../aspose.cad.imageoptions/svgoptions/rescalesubpixellinewidths/) { get; set; } | Whether sub-pixel linewidths should be rescaled. If set to true, lines thinner than a width specified by other options will be drawn thicker, asymptotically approaching the minimum width |
| virtual [ResolutionSettings](../../aspose.cad/imageoptionsbase/resolutionsettings/) { get; set; } | Gets or sets the resolution settings. |
| [Rotation](../../aspose.cad/imageoptionsbase/rotation/) { get; set; } | Gets or sets the parameter for rotate, flip, or rotate and flip the image.. |
| [Source](../../aspose.cad/imageoptionsbase/source/) { get; set; } | Gets or sets the source to create image in. |
| override [TargetFormat](../../aspose.cad.imageoptions/svgoptions/targetformat/) { get; } |  |
| [TextAsShapes](../../aspose.cad.imageoptions/svgoptions/textasshapes/) { get; set; } | Gets or sets a value indicating whether text must be converted as shapes. By default text will be converted to shapes, so it won't be selectable. |
| [Timeout](../../aspose.cad/imageoptionsbase/timeout/) { get; set; } | Timeout value for export operation (in milliseconds) |
| [UseAbsoluteRescaling](../../aspose.cad.imageoptions/svgoptions/useabsoluterescaling/) { get; set; } | Wether minimum non-rescaled line widh should be defined relative to whole image size (if false) or in pixels (if true). If false, use  to specify maximum rate of image size to line width when line won't be rescaled up yet. If true, use  to specify minimum unscaled width in pixels |
| [UserWatermarkColor](../../aspose.cad/imageoptionsbase/userwatermarkcolor/) { get; set; } | Color for user-generated watermark |
| [UserWatermarkText](../../aspose.cad/imageoptionsbase/userwatermarktext/) { get; set; } | Text for user-generated watermark |
| [VectorRasterizationOptions](../../aspose.cad/imageoptionsbase/vectorrasterizationoptions/) { get; set; } | Gets or sets the vector rasterization options. |
| virtual [XmpData](../../aspose.cad/imageoptionsbase/xmpdata/) { get; set; } | Gets or sets the XMP metadata container. |

## Examples

//Renders loaded file and saves it to SVG using (var img = Image.Load(file)) { CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions(); SvgOptions opt = new SvgOptions(); opt.VectorRasterizationOptions = cadRasterizationOptions; cadRasterizationOptions.DrawType = CadDrawTypeMode.UseObjectColor; img.Save(outSvg, opt); }

### See Also

* class [ImageOptionsBase](../../aspose.cad/imageoptionsbase/)
* interface [ITextAsShapesOptions](../itextasshapesoptions/)
* namespace [Aspose.CAD.ImageOptions](../../aspose.cad.imageoptions/)
* assembly [Aspose.CAD](../../)


