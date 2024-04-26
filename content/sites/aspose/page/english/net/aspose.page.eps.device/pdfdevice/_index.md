---
title: Class PdfDevice
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.EPS.Device.PdfDevice class. This class encapsulates rendering of document to PDF
type: docs
weight: 450
url: /net/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class

This class encapsulates rendering of document to PDF.

```csharp
[Obsolete("PdfDevice class is deprecated beginning from 24.3. Please use SaveAsPdf method in PsDocument class instead. In 24.6 this class will be entirely hidden")]
public class PdfDevice : Device, IMultiPageDevice, IStreamable
```

## Constructors

| Name | Description |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | Initializes new instance of `PdfDevice` with output stream. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | Initializes new instance of `PdfDevice` with output stream and specified size of a page. |

## Properties

| Name | Description |
| --- | --- |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/pdfdevice/currentpagenumber/) { get; } | Current page number. |
| [OutputStream](../../aspose.page.eps.device/pdfdevice/outputstream/) { get; set; } | Specifies or returns an output stream. |

## Methods

| Name | Description |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/pdfdevice/closepage/)() | Makes necessary preparation of the device after page has been rendered. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/pdfdevice/initpagenumbers/)() | Initializes numbers of pages to output. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage_1)(string) | Makes necessary preparation of the device before page rendering. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage)(float, float) | Makes necessary preparation of the device before each page rendering. |
| override [ToString](../../aspose.page.eps.device/pdfdevice/tostring/)() | Returns the name of device type. |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/pdfdevice/updatepageparameters/)(IMultiPageDevice) | Updates page parameters from other multi-paged device. |

## Fields

| Name | Description |
| --- | --- |
| static readonly [AUTHOR](../../aspose.page.eps.device/pdfdevice/author/) | "Author" property value. |
| static readonly [BACKGROUND](../../aspose.page.eps.device/pdfdevice/background/) | "Background" property key. |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/pdfdevice/background_color/) | "Background color" property key. |
| static readonly [COMPRESS](../../aspose.page.eps.device/pdfdevice/compress/) | "Compress" property key. |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/pdfdevice/embed_fonts/) | "Embed font in document" property key. |
| static readonly [EMBED_FONTS_AS](../../aspose.page.eps.device/pdfdevice/embed_fonts_as/) | "What font type is used for embedding" property key. |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/pdfdevice/emit_errors/) | "Emit errors" property value. |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/pdfdevice/emit_warnings/) | "Emit warnings" property value. |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/pdfdevice/fit_to_page/) | "Fit content to page" property key. |
| static readonly [KEYWORDS](../../aspose.page.eps.device/pdfdevice/keywords/) | "Keywords" property value. |
| static readonly [ORIENTATION](../../aspose.page.eps.device/pdfdevice/orientation/) | "Orientation" property key. |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/pdfdevice/page_margins/) | "Page margins" property key. |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/pdfdevice/page_size/) | "Page size" property key. |
| static readonly [SUBJECT](../../aspose.page.eps.device/pdfdevice/subject/) | "Subject" property value. |
| static readonly [TITLE](../../aspose.page.eps.device/pdfdevice/title/) | "Title" property value. |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/pdfdevice/transparent/) | "Transparent" property key. |
| static readonly [VERSION](../../aspose.page.eps.device/pdfdevice/version/) | "Version" property key. |
| const [VERSION5](../../aspose.page.eps.device/pdfdevice/version5/) | "Version of Adobe Acrobat Reader" property value. |
| static readonly [WRITE_IMAGES_AS](../../aspose.page.eps.device/pdfdevice/write_images_as/) | "Format of images" property key. |

### See Also

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* interface [IStreamable](../../aspose.page/istreamable/)
* namespace [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* assembly [Aspose.Page](../../)


