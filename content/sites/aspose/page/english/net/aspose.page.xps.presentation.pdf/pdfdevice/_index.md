---
title: Class PdfDevice
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.Presentation.Pdf.PdfDevice class. Class incapsulating image composing device
type: docs
weight: 700
url: /net/aspose.page.xps.presentation.pdf/pdfdevice/
---
## PdfDevice class

Class incapsulating image composing device.

```csharp
[Obsolete("PdfDevice class is deprecated beginning from 24.3. Please use SaveAsPdf method in XpsDocument class instead. In 24.6 this class will be entirely hidden")]
public class PdfDevice : Device, IMultiPageDevice
```

## Constructors

| Name | Description |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | Creates the new instance. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | Creates the new instance with specified media size. |

## Properties

| Name | Description |
| --- | --- |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentpagenumber/) { get; } | Returns the absolute number of the current page withint the document. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentrelativepagenumber/) { get; } | Returns the number of the current page within the current partititon. |

## Methods

| Name | Description |
| --- | --- |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline/#addoutline)(int, string) | Adds an outline item with the last object as its target. |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline/#addoutline_1)(PointF, int, string) | Adds an outline item with the origin point as its target. |
| virtual [ClosePage](../../aspose.page.xps.presentation.pdf/pdfdevice/closepage/)() | Accomplishes the page. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.pdf/pdfdevice/closepartition/)() | Accomplished the document partition. |
| [InitPageNumbers](../../aspose.page.xps.presentation.pdf/pdfdevice/initpagenumbers/)() | Initializes numbers of pages to output. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage/#openpage_1)(string) | Starts a new page with the specifies title. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage/#openpage)(float, float) | Starts a new page with the specified width and height. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.pdf/pdfdevice/openpartition/)() | Starts a new document partition. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget/#sethyperlinktarget)(int) | Sets the hyperlink with a page number as its target. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget/#sethyperlinktarget_1)(string) | Sets the hyperlink with an external URI as its target. |
| override [ToString](../../aspose.page/device/tostring/)() | Returns the name of device type. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.pdf/pdfdevice/updatepageparameters/)(IMultiPageDevice) | Updates the current page parameters. |

### See Also

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* namespace [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* assembly [Aspose.Page](../../)


