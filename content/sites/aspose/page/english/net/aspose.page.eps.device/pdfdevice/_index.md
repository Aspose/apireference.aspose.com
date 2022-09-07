---
title: PdfDevice
second_title: Aspose.Page for .NET API Reference
description: This class encapsulates rendering of document to PDF.
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
| [PdfDevice](pdfdevice#constructor)(Stream) | Initializes new instance of [`PdfDevice`](../pdfdevice) with output stream. |
| [PdfDevice](pdfdevice#constructor_1)(Stream, Size) | Initializes new instance of [`PdfDevice`](../pdfdevice) with output stream and specified size of a page. |

## Properties

| Name | Description |
| --- | --- |
| virtual [Background](../../aspose.page/device/background) { get; set; } | Returns or specifies current background of the page. |
| virtual [CharTM](../../aspose.page/device/chartm) { get; set; } | Returns or specifies current characters transform. |
| [Creator](../../aspose.page/device/creator) { get; set; } | Returns or specifies creator of resulting device output. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/pdfdevice/currentpagenumber) { get; } | Current page number. |
| override [Font](../../aspose.page.eps.device/pdfdevice/font) { set; } | Specifies current font. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb) { get; } | Indicates whether device uses direct RGB mode, that is RGB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Indicates whether this instance of Aspose.Page library is licensed. |
| virtual [Opacity](../../aspose.page/device/opacity) { get; set; } | Returns or specifies current opacity. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask) { get; set; } | Returns or specifies current opacity mask. |
| [OutputStream](../../aspose.page.eps.device/pdfdevice/outputstream) { get; set; } | Specifies or returns an output stream. |
| override [Paint](../../aspose.page.eps.device/pdfdevice/paint) { set; } | Returns or specifies current paint. |
| [Properties](../../aspose.page/device/properties) { get; set; } | Device properties including metadata. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions) { set; } | Options for managing rendering process. |
| virtual [Size](../../aspose.page/device/size) { get; set; } | Returns or specifies a size of the page. |
| override [Stroke](../../aspose.page.eps.device/pdfdevice/stroke) { set; } | Returns or specifies current stroke. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode) { get; set; } | Returns or specifies current text rendering mode. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth) { get; set; } | Returns or specifies current text stroke width. |

## Methods

| Name | Description |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/pdfdevice/closepage)() | Makes necessary preparation of the device after page has been rendered. |
| override [Create](../../aspose.page.eps.device/pdfdevice/create)() | Creates a copy of this device. |
| override [Dispose](../../aspose.page.eps.device/pdfdevice/dispose)() | Disposes the graphics context. If on creation restoreOnDispose was true, writeGraphicsRestore() will be called. |
| override [Draw](../../aspose.page.eps.device/pdfdevice/draw)(GraphicsPath) | Draws a path. |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | Draws an arc. |
| override [DrawImage](../../aspose.page.eps.device/pdfdevice/drawimage)(Bitmap, Matrix, Color) | Draws an image with assigned transform and background. |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | Draws a line segment. |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | Draws an oval. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(double[], double[], int) | Draws a poligone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(int[], int[], int) | Draws a polygon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(double[], double[], int) | Draws a polyline. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(int[], int[], int) | Draws a polyline. |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | Draws a rectangle. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | Draws a round rectangle. |
| override [DrawString](../../aspose.page.eps.device/pdfdevice/drawstring)(string, double, double) | Draws a string at given point. |
| override [EndDocument](../../aspose.page.eps.device/pdfdevice/enddocument)() | Makes necessary preparation of device after the document has been rendered. |
| override [Fill](../../aspose.page.eps.device/pdfdevice/fill)(GraphicsPath) | Fills a path. |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | Fills an arc. |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | Fills an oval. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(double[], double[], int) | Fills a poligone. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(int[], int[], int) | Fills a poligone. |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | Fills a rectangle. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | Fills a round rectangle. |
| [GetProperty](../../aspose.page/device/getproperty)(string) | Gets a value of string property. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor)(string) | Gets a value of color property. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble)(string) | Gets a value of double property. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint)(string) | Gets a value of integer property. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins)(string) | Gets a value of margin property. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle)(string) | Gets a value of rectangle property. |
| [GetPropertySize](../../aspose.page/device/getpropertysize)(string) | Gets a value of size property. |
| override [GetTransform](../../aspose.page.eps.device/pdfdevice/gettransform)() | Gets current transform. |
| override [InitClip](../../aspose.page.eps.device/pdfdevice/initclip)() | Initializes clip of the device. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/pdfdevice/initpagenumbers)() | Initializes numbers of pages to output. |
| [IsProperty](../../aspose.page/device/isproperty)(string) | Gets a value of boolean property. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage#openpage_1)(string) | Makes necessary preparation of the device before page rendering. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage#openpage)(float, float) | Makes necessary preparation of the device before each page rendering. |
| override [ReNew](../../aspose.page.eps.device/pdfdevice/renew)() | Reset device to initial state for whole document. Used for reseting output stream. |
| override [Reset](../../aspose.page.eps.device/pdfdevice/reset)() | If page device parameters will be set this method allows to return writing stream back the begining of page. |
| override [Rotate](../../aspose.page.eps.device/pdfdevice/rotate#rotate)(double) | Rotate the current transform over the Z-axis. Calls writeTransform(Transform). Rotating with a positive angle theta rotates points on the positive x axis toward the positive y axis. |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | Rotate the current transformation matrix around a point. |
| override [Scale](../../aspose.page.eps.device/pdfdevice/scale)(double, double) | Scales the current transformation matrix. Calls writeTransform(Transform). |
| override [SetClip](../../aspose.page.eps.device/pdfdevice/setclip)(GraphicsPath) | Specifies the clip of the device. |
| override [SetTransform](../../aspose.page.eps.device/pdfdevice/settransform)(Matrix) | Specifies the current transform. Since most output formats do not implement this functionality, the inverse transform of the currentTransform is calculated and multiplied by the transform to be set.The result is then forwarded by a call to writeTransform(Transform). |
| override [Shear](../../aspose.page.eps.device/pdfdevice/shear)(double, double) | Shears the current transformation matrix. Calls writeTransform(Transform). |
| override [StartDocument](../../aspose.page.eps.device/pdfdevice/startdocument)() | Makes necessary preparation of device before start rendering of document. |
| override [ToString](../../aspose.page.eps.device/pdfdevice/tostring)() | Returns the name of device type. |
| override [Transform](../../aspose.page.eps.device/pdfdevice/transform)(Matrix) | Transforms the current transformation matrix. Calls writeTransform(Transform) |
| override [Translate](../../aspose.page.eps.device/pdfdevice/translate)(double, double) | Translates the current transformation matrix. Calls writeTransform(Transform). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/pdfdevice/updatepageparameters)(IMultiPageDevice) | Updates page parameters from other multi-paged device. |
| override [WriteComment](../../aspose.page.eps.device/pdfdevice/writecomment)(string) | Writes a comment. |

## Fields

| Name | Description |
| --- | --- |
| static readonly [AUTHOR](../../aspose.page.eps.device/pdfdevice/author) | "Author" property value. |
| static readonly [BACKGROUND](../../aspose.page.eps.device/pdfdevice/background) | "Background" property key. |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/pdfdevice/background_color) | "Background color" property key. |
| static readonly [COMPRESS](../../aspose.page.eps.device/pdfdevice/compress) | "Compress" property key. |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/pdfdevice/embed_fonts) | "Embed font in document" property key. |
| static readonly [EMBED_FONTS_AS](../../aspose.page.eps.device/pdfdevice/embed_fonts_as) | "What font type is used for embedding" property key. |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/pdfdevice/emit_errors) | "Emit errors" property value. |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/pdfdevice/emit_warnings) | "Emit warnings" property value. |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/pdfdevice/fit_to_page) | "Fit content to page" property key. |
| static readonly [KEYWORDS](../../aspose.page.eps.device/pdfdevice/keywords) | "Keywords" property value. |
| static readonly [ORIENTATION](../../aspose.page.eps.device/pdfdevice/orientation) | "Orientation" property key. |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/pdfdevice/page_margins) | "Page margins" property key. |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/pdfdevice/page_size) | "Page size" property key. |
| static readonly [SUBJECT](../../aspose.page.eps.device/pdfdevice/subject) | "Subject" property value. |
| static readonly [TITLE](../../aspose.page.eps.device/pdfdevice/title) | "Title" property value. |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/pdfdevice/transparent) | "Transparent" property key. |
| static readonly [VERSION](../../aspose.page.eps.device/pdfdevice/version) | "Version" property key. |
| const [VERSION5](../../aspose.page.eps.device/pdfdevice/version5) | "Version of Adobe Acrobat Reader" property value. |
| static readonly [WRITE_IMAGES_AS](../../aspose.page.eps.device/pdfdevice/write_images_as) | "Format of images" property key. |

### See Also

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* interface [IStreamable](../../aspose.page/istreamable)
* namespace [Aspose.Page.EPS.Device](../../aspose.page.eps.device)
* assembly [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
