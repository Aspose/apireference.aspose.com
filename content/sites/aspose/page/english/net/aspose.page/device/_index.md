---
title: Class Device
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.Device class. This class encapsulates rendering of document to abstract device. Rendering of the document is performed page by page
type: docs
weight: 20
url: /net/aspose.page/device/
---
## Device class

This class encapsulates rendering of document to abstract device. Rendering of the document is performed page by page.

```csharp
public abstract class Device
```

## Constructors

| Name | Description |
| --- | --- |
| [Device](device/)(Size) | Initializes `Device` with a size of a page. |

## Properties

| Name | Description |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | Returns or specifies current background of the page. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Returns or specifies current characters transform. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Returns or specifies creator of resulting device output. |
| virtual [Font](../../aspose.page/device/font/) { get; set; } | Returns or specifies current font. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Indicates whether device uses direct RGB mode, that is RGB. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | Returns or specifies current opacity. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Returns or specifies current opacity mask. |
| virtual [Paint](../../aspose.page/device/paint/) { get; set; } | Returns or specifies current paint. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Device properties including metadata. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | Options for managing rendering process. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | Returns or specifies a size of the page. |
| virtual [Stroke](../../aspose.page/device/stroke/) { get; set; } | Returns or specifies current stroke. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Returns or specifies current text rendering mode. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Returns or specifies current text stroke width. |

## Methods

| Name | Description |
| --- | --- |
| virtual [Create](../../aspose.page/device/create/)() | Creates a copy of this device. |
| virtual [Dispose](../../aspose.page/device/dispose/)() | Disposes the device. |
| virtual [Draw](../../aspose.page/device/draw/)(GraphicsPath) | Draws a path. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Draws an arc. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | Draws an image with assigned transform and background. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Draws a line segment. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Draws an oval. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon)(double[], double[], int) | Draws a poligone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon_1)(int[], int[], int) | Draws a polygon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline)(double[], double[], int) | Draws a polyline. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline_1)(int[], int[], int) | Draws a polyline. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Draws a rectangle. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Draws a round rectangle. |
| virtual [DrawString](../../aspose.page/device/drawstring/)(string, double, double) | Draws a string at given point. |
| virtual [EndDocument](../../aspose.page/device/enddocument/)() | Makes necessary preparation of device after the document has been rendered. |
| virtual [Fill](../../aspose.page/device/fill/)(GraphicsPath) | Fills a path. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Fills an arc. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Fills an oval. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon)(double[], double[], int) | Fills a poligone. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon_1)(int[], int[], int) | Fills a poligone. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Fills a rectangle. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Fills a round rectangle. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | Gets a value of string property. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | Gets a value of color property. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | Gets a value of double property. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | Gets a value of integer property. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | Gets a value of margin property. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | Gets a value of rectangle property. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | Gets a value of size property. |
| virtual [GetTransform](../../aspose.page/device/gettransform/)() | Gets current transform. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Initializes clip of the device. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Gets a value of boolean property. |
| virtual [ReNew](../../aspose.page/device/renew/)() | Reset device to initial state for whole document. Used for reseting output stream. |
| virtual [Reset](../../aspose.page/device/reset/)() | Reset the device to initial state for a page. |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate)(double) | Rotate the current transformation matrix. Calls writeTransform(Transform). Rotating with a positive angle theta rotates points on the positive x axis toward the positive y axis. |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate_1)(double, double, double) | Rotate the current transformation matrix around a point. |
| virtual [Scale](../../aspose.page/device/scale/)(double, double) | Scales the current transformation matrix. Calls writeTransform(Transform). |
| virtual [SetClip](../../aspose.page/device/setclip/)(GraphicsPath) | Specifies the clip of the device. |
| virtual [SetTransform](../../aspose.page/device/settransform/)(Matrix) | Specifies current transform. |
| virtual [Shear](../../aspose.page/device/shear/)(double, double) | Shears the current transformation matrix. Calls writeTransform(Transform). |
| virtual [StartDocument](../../aspose.page/device/startdocument/)() | Makes necessary preparation of device before start rendering of document. |
| override [ToString](../../aspose.page/device/tostring/)() | Returns the name of device type. |
| virtual [Transform](../../aspose.page/device/transform/)(Matrix) | Transforms the current transformation matrix. Calls writeTransform(Transform) |
| virtual [Translate](../../aspose.page/device/translate/)(double, double) | Translates the current transformation matrix. Calls writeTransform(Transform). |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Writes a comment. |

## Fields

| Name | Description |
| --- | --- |
| static [VERSION](../../aspose.page/device/version/) | Current device version. |

### See Also

* namespace [Aspose.Page](../../aspose.page/)
* assembly [Aspose.Page](../../)


