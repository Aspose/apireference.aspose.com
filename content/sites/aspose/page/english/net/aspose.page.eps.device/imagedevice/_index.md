---
title: ImageDevice
second_title: Aspose.Page for .NET API Reference
description: 
type: docs
weight: 40
url: /net/aspose.page.eps.device/imagedevice/
---
## ImageDevice class

This class encapsulates rendering of document to image.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Constructors

| Name | Description |
| --- | --- |
| [ImageDevice](imagedevice)() | Initializes new instance of [`ImageDevice`](../imagedevice). |
| [ImageDevice](imagedevice)(ImageFormat) | Initializes new instance of [`ImageDevice`](../imagedevice) with specified image format. |
| [ImageDevice](imagedevice)(Size) | Initializes new instance of [`ImageDevice`](../imagedevice) with specified size of a page. |
| [ImageDevice](imagedevice)(Size, ImageFormat) | Initializes new instance of [`ImageDevice`](../imagedevice) with specified size of a page and image format. |

## Properties

| Name | Description |
| --- | --- |
| override [Background](../../aspose.page.eps.device/imagedevice/background) { get; set; } | Indicates whether device uses direct RGB mode, that is RGB. |
| override [CharTM](../../aspose.page.eps.device/imagedevice/chartm) { get; set; } | Returns or specifies current characters transform. |
| [Creator](../../aspose.page.eps.device/imagedevice/creator) { get; set; } | Returns or specifies creator of resulting device output. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/imagedevice/currentpagenumber) { get; } | Current page number. |
| override [Font](../../aspose.page.eps.device/imagedevice/font) { get; set; } | Returns or specifies current font. |
| [Format](../../aspose.page.eps.device/imagedevice/format) { get; } | Image format. |
| [ImagesBytes](../../aspose.page.eps.device/imagedevice/imagesbytes) { get; } | Returns resulting images in bytes, one byte array for one page. |
| override [IsDirectRGB](../../aspose.page.eps.device/imagedevice/isdirectrgb) { get; } | Indicates whether device uses direct RGB mode, that is RGB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Indicates whether this instance of Aspose.Page library is licensed. |
| override [Opacity](../../aspose.page.eps.device/imagedevice/opacity) { get; set; } | Returns or specifies current background of the page. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask) { get; set; } | Returns or specifies current opacity mask. |
| override [Paint](../../aspose.page.eps.device/imagedevice/paint) { get; set; } | Returns or specifies current paint. |
| [Properties](../../aspose.page.eps.device/imagedevice/properties) { get; set; } | Device properties including metadata. |
| override [SaveOptions](../../aspose.page.eps.device/imagedevice/saveoptions) { set; } | Options for managing rendering process. |
| override [Size](../../aspose.page.eps.device/imagedevice/size) { get; set; } | Returns or specifies a size of the page. |
| override [Stroke](../../aspose.page.eps.device/imagedevice/stroke) { get; set; } | Returns or specifies current stroke. |
| override [TextRenderingMode](../../aspose.page.eps.device/imagedevice/textrenderingmode) { get; set; } | Returns or specifies current text rendering mode. |
| override [TextStrokeWidth](../../aspose.page.eps.device/imagedevice/textstrokewidth) { get; set; } | Returns or specifies current text stroke width. |

## Methods

| Name | Description |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/imagedevice/closepage)() | Makes necessary preparation of the device after page has been rendered. |
| override [Create](../../aspose.page.eps.device/imagedevice/create)() | Creates a copy of this device. |
| override [Dispose](../../aspose.page.eps.device/imagedevice/dispose)() | Disposes the device. |
| override [Draw](../../aspose.page.eps.device/imagedevice/draw)(GraphicsPath) | Draws a path. |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | Draws an arc. |
| override [DrawImage](../../aspose.page.eps.device/imagedevice/drawimage)(Bitmap, Matrix, Color) | Draws an image with assigned transform and background. |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | Draws a line segment. |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | Draws an oval. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(double[], double[], int) | Draws a poligone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(int[], int[], int) | Draws a polygon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(double[], double[], int) | Draws a polyline. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(int[], int[], int) | Draws a polyline. |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | Draws a rectangle. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | Draws a round rectangle. |
| override [DrawString](../../aspose.page.eps.device/imagedevice/drawstring)(string, double, double) | Draws a string at given point. |
| override [EndDocument](../../aspose.page.eps.device/imagedevice/enddocument)() | Makes necessary preparation of device after the document has been rendered. |
| override [Fill](../../aspose.page.eps.device/imagedevice/fill)(GraphicsPath) | Fills a path. |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | Fills an arc. |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | Fills an oval. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(double[], double[], int) | Fills a poligone. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(int[], int[], int) | Fills a poligone. |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | Fills a rectangle. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | Fills a round rectangle. |
| [GetProperty](../../aspose.page.eps.device/imagedevice/getproperty)(string) | Gets a value of string property. (2 methods) |
| [GetPropertyColor](../../aspose.page.eps.device/imagedevice/getpropertycolor)(string) | Gets a value of color property. (2 methods) |
| [GetPropertyDouble](../../aspose.page.eps.device/imagedevice/getpropertydouble)(string) | Gets a value of double property. (2 methods) |
| [GetPropertyInt](../../aspose.page.eps.device/imagedevice/getpropertyint)(string) | Gets a value of integer property. (2 methods) |
| [GetPropertyMargins](../../aspose.page.eps.device/imagedevice/getpropertymargins)(string) | Gets a value of margins property. (2 methods) |
| [GetPropertyRectangle](../../aspose.page.eps.device/imagedevice/getpropertyrectangle)(string) | Gets a value of rectangle property. (2 methods) |
| [GetPropertySize](../../aspose.page.eps.device/imagedevice/getpropertysize)(string) | Gets a value of size property. (2 methods) |
| override [GetTransform](../../aspose.page.eps.device/imagedevice/gettransform)() | Gets the current transform. |
| override [InitClip](../../aspose.page.eps.device/imagedevice/initclip)() | Initializes a clip of the device. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/imagedevice/initpagenumbers)() | Initializes numbers of pages to output. |
| [IsProperty](../../aspose.page.eps.device/imagedevice/isproperty)(string) | Gets a value of boolean property. (2 methods) |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage)(string) | Makes necessary preparation of the device before page rendering. |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage)(float, float) | Makes necessary preparation of the device before each page rendering. |
| override [ReNew](../../aspose.page.eps.device/imagedevice/renew)() | Reset device to initial state for whole document. |
| override [Reset](../../aspose.page.eps.device/imagedevice/reset)() | Reset the device to initial state for a page. |
| override [Rotate](../../aspose.page.eps.device/imagedevice/rotate)(double) | Rotate the current transformation matrix over the Z-axis. Calls writeTransform(Transform). Rotating with a positive angle theta rotates points on the positive x axis toward the positive y axis. |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | Rotate the current transformation matrix around a point. |
| override [Scale](../../aspose.page.eps.device/imagedevice/scale)(double, double) | Scales the current transformation matrix. Calls writeTransform(Transform). |
| override [SetClip](../../aspose.page.eps.device/imagedevice/setclip)(GraphicsPath) | Clips shape. |
| override [SetTransform](../../aspose.page.eps.device/imagedevice/settransform)(Matrix) | Specifies current transform. |
| override [Shear](../../aspose.page.eps.device/imagedevice/shear)(double, double) | Shears the current transformation matrix. Calls writeTransform(Transform). |
| override [StartDocument](../../aspose.page.eps.device/imagedevice/startdocument)() | Makes necessary preparation of device before start rendering of document. |
| override [ToString](../../aspose.page.eps.device/imagedevice/tostring)() | Returns the name of device type. |
| override [Transform](../../aspose.page.eps.device/imagedevice/transform)(Matrix) | Transforms the current transformation matrix. Calls writeTransform(Transform). |
| override [Translate](../../aspose.page.eps.device/imagedevice/translate)(double, double) | Translates the current transformation matrix. Calls writeTransform(Transform). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/imagedevice/updatepageparameters)(IMultiPageDevice) | Updates page parameters from other multi-paged device. |
| override [WriteComment](../../aspose.page.eps.device/imagedevice/writecomment)(string) | Writes a comment. |

## Fields

| Name | Description |
| --- | --- |
| static readonly [BACKGROUND](../../aspose.page.eps.device/imagedevice/background) | "Background" property key. |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/imagedevice/background_color) | "Background color" property key. |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/imagedevice/embed_fonts) | "Embed font in document" property key. |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/imagedevice/emit_errors) | "Emit errors" property value. |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/imagedevice/emit_warnings) | "Emit warnings" property value. |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/imagedevice/fit_to_page) | "Fit content to page" property key. |
| static readonly [ORIENTATION](../../aspose.page.eps.device/imagedevice/orientation) | "Orientation" property key. |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/imagedevice/page_margins) | "Page margins" property key. |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/imagedevice/page_size) | "Page size" property key. |
| static readonly [PRODUCER](../../aspose.page.eps.device/imagedevice/producer) | "Producer" property value. |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/imagedevice/transparent) | "Transparent" property key. |

### See Also

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* namespace [Aspose.Page.EPS.Device](../../aspose.page.eps.device)
* assembly [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
