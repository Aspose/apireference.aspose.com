---
title: PdfSaveOptions Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Saving.PdfSaveOptions class. Specific options data class
type: docs
weight: 5690
url: /net/aspose.svg.saving/pdfsaveoptions/
---
## PdfSaveOptions class

Specific options data class.

```csharp
public class PdfSaveOptions : PdfRenderingOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [PdfSaveOptions](pdfsaveoptions/)() | The default constructor. |

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

* class [PdfRenderingOptions](../../aspose.svg.rendering.pdf/pdfrenderingoptions/)
* namespace [Aspose.Svg.Saving](../../aspose.svg.saving/)
* assembly [Aspose.SVG](../../)
