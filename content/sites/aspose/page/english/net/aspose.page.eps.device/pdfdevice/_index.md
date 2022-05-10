---
title: PdfDevice
second_title: Aspose.Page for .NET API Reference
description: 
type: docs
weight: 60
url: /net/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class

This class encapsulates rendering of document to PDF.

```csharp
public class PdfDevice : Device, IMultiPageDevice, IStreamable
```

## Constructors

| Name | Description |
| --- | --- |
| [PdfDevice](pdfdevice)(Stream) | Initializes new instance of [`PdfDevice`](../pdfdevice) with output stream. |
| [PdfDevice](pdfdevice)(Stream, Size) | Initializes new instance of [`PdfDevice`](../pdfdevice) with output stream and specified size of a page. |

## Properties

| Name | Description |
| --- | --- |
| virtual [CurrentPageNumber](currentpagenumber) { get; } | Current page number. |
| override [Font](font) { set; } | Specifies current font. |
| [OutputStream](outputstream) { get; set; } | Specifies or returns an output stream. |
| override [Paint](paint) { set; } | Returns or specifies current paint. |
| [Properties](properties) { get; set; } | Device properties including metadata. |
| override [Stroke](stroke) { set; } | Returns or specifies current stroke. |

## Methods

| Name | Description |
| --- | --- |
| virtual [ClosePage](closepage)() | Makes necessary preparation of the device after page has been rendered. |
| override [Create](create)() | Creates a copy of this device. |
| override [Dispose](dispose)() | Disposes the graphics context. If on creation restoreOnDispose was true, writeGraphicsRestore() will be called. |
| override [Draw](draw)(GraphicsPath) | Draws a path. |
| override [DrawImage](drawimage)(Bitmap, Matrix, Color) | Draws an image with assigned transform and background. |
| override [DrawString](drawstring)(string, double, double) | Draws a string at given point. |
| override [EndDocument](enddocument)() | Makes necessary preparation of device after the document has been rendered. |
| override [Fill](fill)(GraphicsPath) | Fills a path. |
| override [GetTransform](gettransform)() | Gets current transform. |
| override [InitClip](initclip)() | Initializes clip of the device. |
| virtual [InitPageNumbers](initpagenumbers)() | Initializes numbers of pages to output. |
| virtual [OpenPage](openpage)(string) | Makes necessary preparation of the device before page rendering. |
| virtual [OpenPage](openpage)(float, float) | Makes necessary preparation of the device before each page rendering. |
| override [ReNew](renew)() | Reset device to initial state for whole document. Used for reseting output stream. |
| override [Reset](reset)() | If page device parameters will be set this method allows to return writing stream back the begining of page. |
| override [Rotate](rotate)(double) | Rotate the current transform over the Z-axis. Calls writeTransform(Transform). Rotating with a positive angle theta rotates points on the positive x axis toward the positive y axis. |
| override [Scale](scale)(double, double) | Scales the current transformation matrix. Calls writeTransform(Transform). |
| override [SetClip](setclip)(GraphicsPath) | Specifies the clip of the device. |
| override [SetTransform](settransform)(Matrix) | Specifies the current transform. Since most output formats do not implement this functionality, the inverse transform of the currentTransform is calculated and multiplied by the transform to be set.The result is then forwarded by a call to writeTransform(Transform). |
| override [Shear](shear)(double, double) | Shears the current transformation matrix. Calls writeTransform(Transform). |
| override [StartDocument](startdocument)() | Makes necessary preparation of device before start rendering of document. |
| override [ToString](tostring)() | Returns the name of device type. |
| override [Transform](transform)(Matrix) | Transforms the current transformation matrix. Calls writeTransform(Transform) |
| override [Translate](translate)(double, double) | Translates the current transformation matrix. Calls writeTransform(Transform). |
| virtual [UpdatePageParameters](updatepageparameters)(IMultiPageDevice) | Updates page parameters from other multi-paged device. |
| override [WriteComment](writecomment)(string) | Writes a comment. |

## Other Members

| Name | Description |
| --- | --- |
| static readonly [AUTHOR](author) | "Author" property value. |
| static readonly [BACKGROUND](background) | "Background" property key. |
| static readonly [BACKGROUND_COLOR](background_color) | "Background color" property key. |
| static readonly [COMPRESS](compress) | "Compress" property key. |
| static readonly [EMBED_FONTS](embed_fonts) | "Embed font in document" property key. |
| static readonly [EMBED_FONTS_AS](embed_fonts_as) | "What font type is used for embedding" property key. |
| static readonly [EMIT_ERRORS](emit_errors) | "Emit errors" property value. |
| static readonly [EMIT_WARNINGS](emit_warnings) | "Emit warnings" property value. |
| static readonly [FIT_TO_PAGE](fit_to_page) | "Fit content to page" property key. |
| static readonly [KEYWORDS](keywords) | "Keywords" property value. |
| static readonly [ORIENTATION](orientation) | "Orientation" property key. |
| static readonly [PAGE_MARGINS](page_margins) | "Page margins" property key. |
| static readonly [PAGE_SIZE](page_size) | "Page size" property key. |
| static readonly [SUBJECT](subject) | "Subject" property value. |
| static readonly [TITLE](title) | "Title" property value. |
| static readonly [TRANSPARENT](transparent) | "Transparent" property key. |
| static readonly [VERSION](version) | "Version" property key. |
| const [VERSION5](version5) | "Version of Adobe Acrobat Reader" property value. |
| static readonly [WRITE_IMAGES_AS](write_images_as) | "Format of images" property key. |

### See Also

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* interface [IStreamable](../../aspose.page/istreamable)
* namespace [Aspose.Page.EPS.Device](../../aspose.page.eps.device)
* assembly [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
