---
title: Class PdfOptions
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.ImageOptions.PdfOptions class. The PDF options
type: docs
weight: 36610
url: /net/aspose.cad.imageoptions/pdfoptions/
---
## PdfOptions class

The PDF options.

```csharp
public class PdfOptions : ImageOptionsBase
```

## Constructors

| Name | Description |
| --- | --- |
| [PdfOptions](pdfoptions/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [CancellationToken](../../aspose.cad.imageoptions/imageoptionsbase/cancellationtoken/) { get; set; } | Token that can be used to interrupt export operation |
| [CorePdfOptions](../../aspose.cad.imageoptions/pdfoptions/corepdfoptions/) { get; set; } | Gets or sets the core PDF options. |
| [Is3DContent](../../aspose.cad.imageoptions/pdfoptions/is3dcontent/) { get; set; } | Gets or sets whether content of the document should be represented as 3D model. Allows to export U3D content directly to PDF in a form of interactive 3D annotation object. The resulting PDF file will contain single 3D model object occupying the entire page with margins. |
| [Layers](../../aspose.cad.imageoptions/imageoptionsbase/layers/) { get; set; } | Gets or sets a of layer names must be exported. All data will be exported without layers if names is not sets. |
| virtual [Palette](../../aspose.cad.imageoptions/imageoptionsbase/palette/) { get; set; } | Gets or sets the color palette. |
| [Pc3File](../../aspose.cad.imageoptions/imageoptionsbase/pc3file/) { get; set; } | Gets or sets the PC3 file full name. |
| [PdfDocumentInfo](../../aspose.cad.imageoptions/pdfoptions/pdfdocumentinfo/) { get; set; } | Gets or sets metadata for document. |
| [RenderToGraphicsBound](../../aspose.cad.imageoptions/imageoptionsbase/rendertographicsbound/) { get; set; } | Gets or sets a value indicating which image sizes to use when rendering: graphic sizes (true, default) or set in metadata (false). |
| virtual [ResolutionSettings](../../aspose.cad.imageoptions/imageoptionsbase/resolutionsettings/) { get; set; } | Gets or sets the resolution settings. |
| [Rotation](../../aspose.cad.imageoptions/imageoptionsbase/rotation/) { get; set; } | Gets or sets the parameter for rotate, flip, or rotate and flip the image.. |
| [Source](../../aspose.cad.imageoptions/imageoptionsbase/source/) { get; set; } | Gets or sets the source to create image in. |
| override [TargetFormat](../../aspose.cad.imageoptions/pdfoptions/targetformat/) { get; } |  |
| [Timeout](../../aspose.cad.imageoptions/imageoptionsbase/timeout/) { get; set; } | Timeout value for export operation (in milliseconds) |
| [UserWatermarkColor](../../aspose.cad.imageoptions/imageoptionsbase/userwatermarkcolor/) { get; set; } | Color for user-generated watermark |
| [UserWatermarkText](../../aspose.cad.imageoptions/imageoptionsbase/userwatermarktext/) { get; set; } | Text for user-generated watermark |
| [VectorRasterizationOptions](../../aspose.cad.imageoptions/imageoptionsbase/vectorrasterizationoptions/) { get; set; } | Gets or sets the vector rasterization options. |
| [WatermarkGuardOptions](../../aspose.cad.imageoptions/imageoptionsbase/watermarkguardoptions/) { get; set; } | Gets or sets the blind watermark options. |
| virtual [XmpData](../../aspose.cad.imageoptions/imageoptionsbase/xmpdata/) { get; set; } | Gets or sets the XMP metadata container. |

### See Also

* class [ImageOptionsBase](../imageoptionsbase/)
* namespace [Aspose.CAD.ImageOptions](../../aspose.cad.imageoptions/)
* assembly [Aspose.CAD](../../)


