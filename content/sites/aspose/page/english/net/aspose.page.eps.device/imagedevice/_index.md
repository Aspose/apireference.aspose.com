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
| override [Background](background) { get; set; } | Indicates whether device uses direct RGB mode, that is RGB. |
| override [CharTM](chartm) { get; set; } | Returns or specifies current characters transform. |
| [Creator](creator) { get; set; } | Returns or specifies creator of resulting device output. |
| virtual [CurrentPageNumber](currentpagenumber) { get; } | Current page number. |
| override [Font](font) { get; set; } | Returns or specifies current font. |
| [Format](format) { get; } | Image format. |
| [ImagesBytes](imagesbytes) { get; } | Returns resulting images in bytes, one byte array for one page. |
| override [IsDirectRGB](isdirectrgb) { get; } | Indicates whether device uses direct RGB mode, that is RGB. |
| override [Opacity](opacity) { get; set; } | Returns or specifies current background of the page. |
| override [Paint](paint) { get; set; } | Returns or specifies current paint. |
| [Properties](properties) { get; set; } | Device properties including metadata. |
| override [SaveOptions](saveoptions) { set; } | Options for managing rendering process. |
| override [Size](size) { get; set; } | Returns or specifies a size of the page. |
| override [Stroke](stroke) { get; set; } | Returns or specifies current stroke. |
| override [TextRenderingMode](textrenderingmode) { get; set; } | Returns or specifies current text rendering mode. |
| override [TextStrokeWidth](textstrokewidth) { get; set; } | Returns or specifies current text stroke width. |

## Methods

| Name | Description |
| --- | --- |
| virtual [ClosePage](closepage)() | Makes necessary preparation of the device after page has been rendered. |
| override [Create](create)() | Creates a copy of this device. |
| override [Dispose](dispose)() | Disposes the device. |
| override [Draw](draw)(GraphicsPath) | Draws a path. |
| override [DrawImage](drawimage)(Bitmap, Matrix, Color) | Draws an image with assigned transform and background. |
| override [DrawString](drawstring)(string, double, double) | Draws a string at given point. |
| override [EndDocument](enddocument)() | Makes necessary preparation of device after the document has been rendered. |
| override [Fill](fill)(GraphicsPath) | Fills a path. |
| [GetProperty](getproperty)(string) | Gets a value of string property. |
| [GetPropertyColor](getpropertycolor)(string) | Gets a value of color property. |
| [GetPropertyDouble](getpropertydouble)(string) | Gets a value of double property. |
| [GetPropertyInt](getpropertyint)(string) | Gets a value of integer property. |
| [GetPropertyMargins](getpropertymargins)(string) | Gets a value of margins property. |
| [GetPropertyRectangle](getpropertyrectangle)(string) | Gets a value of rectangle property. |
| [GetPropertySize](getpropertysize)(string) | Gets a value of size property. |
| override [GetTransform](gettransform)() | Gets the current transform. |
| override [InitClip](initclip)() | Initializes a clip of the device. |
| virtual [InitPageNumbers](initpagenumbers)() | Initializes numbers of pages to output. |
| [IsProperty](isproperty)(string) | Gets a value of boolean property. |
| virtual [OpenPage](openpage)(string) | Makes necessary preparation of the device before page rendering. |
| virtual [OpenPage](openpage)(float, float) | Makes necessary preparation of the device before each page rendering. |
| override [ReNew](renew)() | Reset device to initial state for whole document. |
| override [Reset](reset)() | Reset the device to initial state for a page. |
| override [Rotate](rotate)(double) | Rotate the current transformation matrix over the Z-axis. Calls writeTransform(Transform). Rotating with a positive angle theta rotates points on the positive x axis toward the positive y axis. |
| override [Scale](scale)(double, double) | Scales the current transformation matrix. Calls writeTransform(Transform). |
| override [SetClip](setclip)(GraphicsPath) | Clips shape. |
| override [SetTransform](settransform)(Matrix) | Specifies current transform. |
| override [Shear](shear)(double, double) | Shears the current transformation matrix. Calls writeTransform(Transform). |
| override [StartDocument](startdocument)() | Makes necessary preparation of device before start rendering of document. |
| override [ToString](tostring)() | Returns the name of device type. |
| override [Transform](transform)(Matrix) | Transforms the current transformation matrix. Calls writeTransform(Transform). |
| override [Translate](translate)(double, double) | Translates the current transformation matrix. Calls writeTransform(Transform). |
| virtual [UpdatePageParameters](updatepageparameters)(IMultiPageDevice) | Updates page parameters from other multi-paged device. |
| override [WriteComment](writecomment)(string) | Writes a comment. |

## Other Members

| Name | Description |
| --- | --- |
| static readonly [BACKGROUND](background) | "Background" property key. |
| static readonly [BACKGROUND_COLOR](background_color) | "Background color" property key. |
| static readonly [EMBED_FONTS](embed_fonts) | "Embed font in document" property key. |
| static readonly [EMIT_ERRORS](emit_errors) | "Emit errors" property value. |
| static readonly [EMIT_WARNINGS](emit_warnings) | "Emit warnings" property value. |
| static readonly [FIT_TO_PAGE](fit_to_page) | "Fit content to page" property key. |
| static readonly [ORIENTATION](orientation) | "Orientation" property key. |
| static readonly [PAGE_MARGINS](page_margins) | "Page margins" property key. |
| static readonly [PAGE_SIZE](page_size) | "Page size" property key. |
| static readonly [PRODUCER](producer) | "Producer" property value. |
| static readonly [TRANSPARENT](transparent) | "Transparent" property key. |

### See Also

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* namespace [Aspose.Page.EPS.Device](../../aspose.page.eps.device)
* assembly [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
