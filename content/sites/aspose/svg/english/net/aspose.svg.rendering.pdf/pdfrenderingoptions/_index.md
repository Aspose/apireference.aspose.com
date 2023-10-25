---
title: PdfRenderingOptions Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Rendering.Pdf.PdfRenderingOptions class. Represents rendering options for PdfDevice
type: docs
weight: 2630
url: /net/aspose.svg.rendering.pdf/pdfrenderingoptions/
---
## PdfRenderingOptions class

Represents rendering options for [`PdfDevice`](../pdfdevice/).

```csharp
public class PdfRenderingOptions : RenderingOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [PdfRenderingOptions](pdfrenderingoptions/)() | Initializes a new instance of the `PdfRenderingOptions` class. |

## Properties

| Name | Description |
| --- | --- |
| [BackgroundColor](../../aspose.svg.rendering/renderingoptions/backgroundcolor/) { get; set; } | Gets or sets Color which will fill background of every page. Default value is Transparent. |
| [Css](../../aspose.svg.rendering/renderingoptions/css/) { get; } | Gets a [`CssOptions`](../../aspose.svg.rendering/cssoptions/) object which is used for configuration of css properties processing. |
| [DocumentInfo](../../aspose.svg.rendering.pdf/pdfrenderingoptions/documentinfo/) { get; } | Contains information about the output PDF document. |
| [Encryption](../../aspose.svg.rendering.pdf/pdfrenderingoptions/encryption/) { get; set; } | Gets or sets a encryption details. If not set, then no encryption will be performed. |
| [FormFieldBehaviour](../../aspose.svg.rendering.pdf/pdfrenderingoptions/formfieldbehaviour/) { get; set; } | Specifies the behavior of form fields in the output PDF document. |
| virtual [HorizontalResolution](../../aspose.svg.rendering/renderingoptions/horizontalresolution/) { get; set; } | Sets or gets horizontal resolution for internal (which are used during filters processing) images, in pixels per inch. By default this property is 300 dpi. |
| [IsTaggedPdf](../../aspose.svg.rendering.pdf/pdfrenderingoptions/istaggedpdf/) { get; set; } | Creates a tag structure if `true`. |
| [JpegQuality](../../aspose.svg.rendering.pdf/pdfrenderingoptions/jpegquality/) { get; set; } | Specifies the quality of JPEG compression for images (if JPEG compression is used). Default is 95. |
| [PageSetup](../../aspose.svg.rendering/renderingoptions/pagesetup/) { get; } | Gets a page setup object is used for configuration output page-set. |
| virtual [VerticalResolution](../../aspose.svg.rendering/renderingoptions/verticalresolution/) { get; set; } | Sets or gets vertical resolution for internal (which are used during filters processing) images, in pixels per inch. By default this property is 300 dpi. |

### See Also

* class [RenderingOptions](../../aspose.svg.rendering/renderingoptions/)
* namespace [Aspose.Svg.Rendering.Pdf](../../aspose.svg.rendering.pdf/)
* assembly [Aspose.SVG](../../)
