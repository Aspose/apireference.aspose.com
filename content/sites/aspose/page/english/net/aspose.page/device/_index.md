---
title: Device
second_title: Aspose.Page for .NET API Reference
description: 
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
| [Device](device)(Size) | Initializes [`Device`](../device) with a size of a page. |

## Properties

| Name | Description |
| --- | --- |
| virtual [Background](background) { get; set; } | Returns or specifies current background of the page. |
| virtual [CharTM](chartm) { get; set; } | Returns or specifies current characters transform. |
| [Creator](creator) { get; set; } | Returns or specifies creator of resulting device output. |
| virtual [Font](font) { get; set; } | Returns or specifies current font. |
| virtual [IsDirectRGB](isdirectrgb) { get; } | Indicates whether device uses direct RGB mode, that is RGB. |
| [IsLicensed](islicensed) { get; } | Indicates whether this instance of Aspose.Page library is licensed. |
| virtual [Opacity](opacity) { get; set; } | Returns or specifies current opacity. |
| virtual [OpacityMask](opacitymask) { get; set; } | Returns or specifies current opacity mask. |
| virtual [Paint](paint) { get; set; } | Returns or specifies current paint. |
| [Properties](properties) { get; set; } | Device properties including metadata. |
| virtual [SaveOptions](saveoptions) { set; } | Options for managing rendering process. |
| virtual [Size](size) { get; set; } | Returns or specifies a size of the page. |
| virtual [Stroke](stroke) { get; set; } | Returns or specifies current stroke. |
| virtual [TextRenderingMode](textrenderingmode) { get; set; } | Returns or specifies current text rendering mode. |
| virtual [TextStrokeWidth](textstrokewidth) { get; set; } | Returns or specifies current text stroke width. |

## Methods

| Name | Description |
| --- | --- |
| virtual [Create](create)() | Creates a copy of this device. |
| virtual [Dispose](dispose)() | Disposes the device. |
| virtual [Draw](draw)(GraphicsPath) | Draws a path. |
| virtual [DrawArc](drawarc)(double, double, double, double, double, double) | Draws an arc. |
| virtual [DrawImage](drawimage)(Bitmap, Matrix, Color) | Draws an image with assigned transform and background. |
| virtual [DrawLine](drawline)(double, double, double, double) | Draws a line segment. |
| virtual [DrawOval](drawoval)(double, double, double, double) | Draws an oval. |
| virtual [DrawPolygon](drawpolygon)(double[], double[], int) | Draws a poligone. |
| virtual [DrawPolygon](drawpolygon)(int[], int[], int) | Draws a polygon. |
| virtual [DrawPolyline](drawpolyline)(double[], double[], int) | Draws a polyline. |
| virtual [DrawPolyline](drawpolyline)(int[], int[], int) | Draws a polyline. |
| virtual [DrawRect](drawrect)(double, double, double, double) | Draws a rectangle. |
| virtual [DrawRoundRect](drawroundrect)(double, double, double, double, double, double) | Draws a round rectangle. |
| virtual [DrawString](drawstring)(string, double, double) | Draws a string at given point. |
| virtual [EndDocument](enddocument)() | Makes necessary preparation of device after the document has been rendered. |
| virtual [Fill](fill)(GraphicsPath) | Fills a path. |
| virtual [FillArc](fillarc)(double, double, double, double, double, double) | Fills an arc. |
| virtual [FillOval](filloval)(double, double, double, double) | Fills an oval. |
| virtual [FillPolygon](fillpolygon)(double[], double[], int) | Fills a poligone. |
| virtual [FillPolygon](fillpolygon)(int[], int[], int) | Fills a poligone. |
| virtual [FillRect](fillrect)(double, double, double, double) | Fills a rectangle. |
| virtual [FillRoundRect](fillroundrect)(double, double, double, double, double, double) | Fills a round rectangle. |
| [GetProperty](getproperty)(string) | Gets a value of string property. |
| [GetPropertyColor](getpropertycolor)(string) | Gets a value of color property. |
| [GetPropertyDouble](getpropertydouble)(string) | Gets a value of double property. |
| [GetPropertyInt](getpropertyint)(string) | Gets a value of integer property. |
| [GetPropertyMargins](getpropertymargins)(string) | Gets a value of margin property. |
| [GetPropertyRectangle](getpropertyrectangle)(string) | Gets a value of rectangle property. |
| [GetPropertySize](getpropertysize)(string) | Gets a value of size property. |
| virtual [GetTransform](gettransform)() | Gets current transform. |
| virtual [InitClip](initclip)() | Initializes clip of the device. |
| [IsProperty](isproperty)(string) | Gets a value of boolean property. |
| virtual [ReNew](renew)() | Reset device to initial state for whole document. Used for reseting output stream. |
| virtual [Reset](reset)() | Reset the device to initial state for a page. |
| virtual [Rotate](rotate)(double) | Rotate the current transformation matrix. Calls writeTransform(Transform). Rotating with a positive angle theta rotates points on the positive x axis toward the positive y axis. |
| virtual [Rotate](rotate)(double, double, double) | Rotate the current transformation matrix around a point. |
| virtual [Scale](scale)(double, double) | Scales the current transformation matrix. Calls writeTransform(Transform). |
| virtual [SetClip](setclip)(GraphicsPath) | Specifies the clip of the device. |
| virtual [SetTransform](settransform)(Matrix) | Specifies current transform. |
| virtual [Shear](shear)(double, double) | Shears the current transformation matrix. Calls writeTransform(Transform). |
| virtual [StartDocument](startdocument)() | Makes necessary preparation of device before start rendering of document. |
| override [ToString](tostring)() | Returns the name of device type. |
| virtual [Transform](transform)(Matrix) | Transforms the current transformation matrix. Calls writeTransform(Transform) |
| virtual [Translate](translate)(double, double) | Translates the current transformation matrix. Calls writeTransform(Transform). |
| virtual [WriteComment](writecomment)(string) | Writes a comment. |

## Other Members

| Name | Description |
| --- | --- |
| static [VERSION](version) | Current device version. |

### See Also

* namespace [Aspose.Page](../../aspose.page)
* assembly [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
