---
title: ImageDevice
second_title: Aspose.Page for .NET API Reference
description: Class incapsulating image composing device.
type: docs
weight: 290
url: /net/aspose.page.xps.presentation.image/imagedevice/
---
## ImageDevice class

Class incapsulating image composing device.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Constructors

| Name | Description |
| --- | --- |
| [ImageDevice](imagedevice#constructor)() | Creates the new instance. |
| [ImageDevice](imagedevice#constructor_1)(Size) | Creates the new instance with specified media size. |

## Properties

| Name | Description |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.image/imagedevice/background) { get; set; } | Gets/sets the background color. |
| virtual [CharTM](../../aspose.page/device/chartm) { get; set; } | Returns or specifies current characters transform. |
| [Creator](../../aspose.page/device/creator) { get; set; } | Returns or specifies creator of resulting device output. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentpagenumber) { get; } | Returns the absolute number of the current page within the document. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentrelativepagenumber) { get; } | Returns the relative number of the current page within the current partition. |
| override [Font](../../aspose.page.xps.presentation.image/imagedevice/font) { get; set; } | Gets/sets the current font. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb) { get; } | Indicates whether device uses direct RGB mode, that is RGB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Indicates whether this instance of Aspose.Page library is licensed. |
| override [Opacity](../../aspose.page.xps.presentation.image/imagedevice/opacity) { get; set; } | Gets/sets the opacity. |
| override [OpacityMask](../../aspose.page.xps.presentation.image/imagedevice/opacitymask) { get; set; } | Gets/sets the brush for opacity mask. The mask applies over Paint or Strike. |
| override [Paint](../../aspose.page.xps.presentation.image/imagedevice/paint) { get; set; } | Gets/sets the brush for filling paths. |
| [Properties](../../aspose.page/device/properties) { get; set; } | Device properties including metadata. |
| [Result](../../aspose.page.xps.presentation.image/imagedevice/result) { get; } | Returns the resulting images byte arrays. The first dimension is for inner documents and the second one is for pages within inner documents. |
| override [SaveOptions](../../aspose.page.xps.presentation.image/imagedevice/saveoptions) { set; } | Initializes save options. |
| override [Size](../../aspose.page.xps.presentation.image/imagedevice/size) { get; set; } | Gets/sets the device media size. |
| override [Stroke](../../aspose.page.xps.presentation.image/imagedevice/stroke) { get; set; } | Gets/sets the stroke for drawing paths. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode) { get; set; } | Returns or specifies current text rendering mode. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth) { get; set; } | Returns or specifies current text stroke width. |

## Methods

| Name | Description |
| --- | --- |
| virtual [ClosePage](../../aspose.page.xps.presentation.image/imagedevice/closepage)() | Accomplishes the page. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.image/imagedevice/closepartition)() | Accomplished the document partition. |
| override [Create](../../aspose.page.xps.presentation.image/imagedevice/create)() | Creates a new instance of the device based on this device instance. Writes this device graphics state, i.e. creates ApsCanvas instance(s) with corresponding RenderTransform and Clip properties. |
| override [Dispose](../../aspose.page.xps.presentation.image/imagedevice/dispose)() | Disposes this device instance. Finalizes this device instance graphics state, i.e. switches APS composing context to the ApsCanvas of the level higher then this device's graphics state ApsCanvas. |
| override [Draw](../../aspose.page.xps.presentation.image/imagedevice/draw)(GraphicsPath) | Draws the specified path. |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | Draws an arc. |
| virtual [DrawImage](../../aspose.page/device/drawimage)(Bitmap, Matrix, Color) | Draws an image with assigned transform and background. |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | Draws a line segment. |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | Draws an oval. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(double[], double[], int) | Draws a poligone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(int[], int[], int) | Draws a polygon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(double[], double[], int) | Draws a polyline. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(int[], int[], int) | Draws a polyline. |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | Draws a rectangle. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | Draws a round rectangle. |
| override [DrawString](../../aspose.page.xps.presentation.image/imagedevice/drawstring)(string, double, double) | Draws a string at the specified position. |
| override [EndDocument](../../aspose.page.xps.presentation.image/imagedevice/enddocument)() | Accomplishes the document. |
| override [Fill](../../aspose.page.xps.presentation.image/imagedevice/fill)(GraphicsPath) | Fills the specified path. |
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
| override [GetTransform](../../aspose.page.xps.presentation.image/imagedevice/gettransform)() | Returns the current transformation matrix. |
| virtual [InitClip](../../aspose.page/device/initclip)() | Initializes clip of the device. |
| [InitPageNumbers](../../aspose.page.xps.presentation.image/imagedevice/initpagenumbers)() | Initializes numbers of pages to output. |
| [IsProperty](../../aspose.page/device/isproperty)(string) | Gets a value of boolean property. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage#openpage_1)(string) | Starts a new page with the specifies title. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage#openpage)(float, float) | Starts a new page with the specified width and height. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.image/imagedevice/openpartition)() | Starts a new document partition. |
| override [ReNew](../../aspose.page.xps.presentation.image/imagedevice/renew)() | Sets the devices to the initial state. |
| override [Reset](../../aspose.page.xps.presentation.image/imagedevice/reset)() | Resets the device. |
| override [Rotate](../../aspose.page.xps.presentation.image/imagedevice/rotate#rotate)(double) | Applies a clockwise rotation about the origin to the current transformation matrix. |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | Rotate the current transformation matrix around a point. |
| override [Scale](../../aspose.page.xps.presentation.image/imagedevice/scale)(double, double) | Applies the specified scale vector to the current transformation matrix. |
| override [SetClip](../../aspose.page.xps.presentation.image/imagedevice/setclip)(GraphicsPath) | Adds the specified path to the current clip path. |
| override [SetTransform](../../aspose.page.xps.presentation.image/imagedevice/settransform)(Matrix) | Sets the current transformation matrix. |
| override [Shear](../../aspose.page.xps.presentation.image/imagedevice/shear)(double, double) | Applies the specified shear vector to the current transformation matrix. |
| override [StartDocument](../../aspose.page.xps.presentation.image/imagedevice/startdocument)() | Starts the document. |
| override [ToString](../../aspose.page/device/tostring)() | Returns the name of device type. |
| override [Transform](../../aspose.page.xps.presentation.image/imagedevice/transform)(Matrix) | Multiplies the current transformation matrix by the specified Matrix. |
| override [Translate](../../aspose.page.xps.presentation.image/imagedevice/translate)(double, double) | Applies the specified translation vector to the current transformation matrix. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.image/imagedevice/updatepageparameters)(IMultiPageDevice) | Updates the current page parameters. |
| virtual [WriteComment](../../aspose.page/device/writecomment)(string) | Writes a comment. |

### See Also

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* namespace [Aspose.Page.XPS.Presentation.Image](../../aspose.page.xps.presentation.image)
* assembly [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
