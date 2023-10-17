---
title: Class PdfDevice
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.Presentation.Pdf.PdfDevice class. Class incapsulating image composing device
type: docs
weight: 630
url: /net/aspose.page.xps.presentation.pdf/pdfdevice/
---
## PdfDevice class

Class incapsulating image composing device.

```csharp
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
| override [Background](../../aspose.page.xps.presentation.pdf/pdfdevice/background/) { get; set; } | Gets/sets the background color. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Returns or specifies current characters transform. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Returns or specifies creator of resulting device output. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentpagenumber/) { get; } | Returns the absolute number of the current page withint the document. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentrelativepagenumber/) { get; } | Returns the number of the current page within the current partititon. |
| override [Font](../../aspose.page.xps.presentation.pdf/pdfdevice/font/) { get; set; } | Gets/sets the current font. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Indicates whether device uses direct RGB mode, that is RGB. |
| override [Opacity](../../aspose.page.xps.presentation.pdf/pdfdevice/opacity/) { get; set; } | Gets/sets the opacity. |
| override [OpacityMask](../../aspose.page.xps.presentation.pdf/pdfdevice/opacitymask/) { get; set; } | Gets/sets the brush for opacity mask. The mask applies over Paint or Strike. |
| override [Paint](../../aspose.page.xps.presentation.pdf/pdfdevice/paint/) { get; set; } | Gets/sets the brush for filling paths. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Device properties including metadata. |
| override [SaveOptions](../../aspose.page.xps.presentation.pdf/pdfdevice/saveoptions/) { set; } | Initializes save options. |
| override [Size](../../aspose.page.xps.presentation.pdf/pdfdevice/size/) { get; set; } | Gets/sets the device media size. |
| override [Stroke](../../aspose.page.xps.presentation.pdf/pdfdevice/stroke/) { get; set; } | Gets/sets the stroke for drawing paths. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Returns or specifies current text rendering mode. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Returns or specifies current text stroke width. |

## Methods

| Name | Description |
| --- | --- |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline/#addoutline)(int, string) | Adds an outline item with the last object as its target. |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline/#addoutline_1)(PointF, int, string) | Adds an outline item with the origin point as its target. |
| virtual [ClosePage](../../aspose.page.xps.presentation.pdf/pdfdevice/closepage/)() | Accomplishes the page. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.pdf/pdfdevice/closepartition/)() | Accomplished the document partition. |
| override [Create](../../aspose.page.xps.presentation.pdf/pdfdevice/create/)() | Creates a new instance of the device based on this device instance. Writes this device graphics state, i.e. creates ApsCanvas instance(s) with corresponding RenderTransform and Clip properties. |
| override [Dispose](../../aspose.page.xps.presentation.pdf/pdfdevice/dispose/)() | Disposes this device instance. Finalizes this device instance graphics state, i.e. switches APS composing context to the ApsCanvas of the level higher then this device's graphics state ApsCanvas. |
| override [Draw](../../aspose.page.xps.presentation.pdf/pdfdevice/draw/)(GraphicsPath) | Draws the specified path. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Draws an arc. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | Draws an image with assigned transform and background. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Draws a line segment. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Draws an oval. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Draws a poligone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Draws a polygon. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Draws a polyline. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Draws a polyline. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Draws a rectangle. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Draws a round rectangle. |
| override [DrawString](../../aspose.page.xps.presentation.pdf/pdfdevice/drawstring/)(string, double, double) | Draws a string at the specified position. |
| override [EndDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/enddocument/)() | Accomplishes the document. |
| override [Fill](../../aspose.page.xps.presentation.pdf/pdfdevice/fill/)(GraphicsPath) | Fills the specified path. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Fills an arc. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Fills an oval. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | Fills a poligone. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | Fills a poligone. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Fills a rectangle. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Fills a round rectangle. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | Gets a value of string property. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | Gets a value of color property. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | Gets a value of double property. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | Gets a value of integer property. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | Gets a value of margin property. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | Gets a value of rectangle property. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | Gets a value of size property. |
| override [GetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/gettransform/)() | Returns the current transformation matrix. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Initializes clip of the device. |
| [InitPageNumbers](../../aspose.page.xps.presentation.pdf/pdfdevice/initpagenumbers/)() | Initializes numbers of pages to output. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Gets a value of boolean property. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage/#openpage_1)(string) | Starts a new page with the specifies title. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage/#openpage)(float, float) | Starts a new page with the specified width and height. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.pdf/pdfdevice/openpartition/)() | Starts a new document partition. |
| override [ReNew](../../aspose.page.xps.presentation.pdf/pdfdevice/renew/)() | Sets the devices to the initial state. |
| override [Reset](../../aspose.page.xps.presentation.pdf/pdfdevice/reset/)() | Resets the device. |
| override [Rotate](../../aspose.page.xps.presentation.pdf/pdfdevice/rotate/#rotate)(double) | Applies a clockwise rotation about the origin to the current transformation matrix. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Rotate the current transformation matrix around a point. |
| override [Scale](../../aspose.page.xps.presentation.pdf/pdfdevice/scale/)(double, double) | Applies the specified scale vector to the current transformation matrix. |
| override [SetClip](../../aspose.page.xps.presentation.pdf/pdfdevice/setclip/)(GraphicsPath) | Adds the specified path to the current clip path. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget/#sethyperlinktarget)(int) | Sets the hyperlink with a page number as its target. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget/#sethyperlinktarget_1)(string) | Sets the hyperlink with an external URI as its target. |
| override [SetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/settransform/)(Matrix) | Sets the current transformation matrix. |
| override [Shear](../../aspose.page.xps.presentation.pdf/pdfdevice/shear/)(double, double) | Applies the specified shear vector to the current transformation matrix. |
| override [StartDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/startdocument/)() | Starts the document. |
| override [ToString](../../aspose.page/device/tostring/)() | Returns the name of device type. |
| override [Transform](../../aspose.page.xps.presentation.pdf/pdfdevice/transform/)(Matrix) | Multiplies the current transformation matrix by the specified Matrix. |
| override [Translate](../../aspose.page.xps.presentation.pdf/pdfdevice/translate/)(double, double) | Applies the specified translation vector to the current transformation matrix. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.pdf/pdfdevice/updatepageparameters/)(IMultiPageDevice) | Updates the current page parameters. |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Writes a comment. |

### See Also

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* namespace [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* assembly [Aspose.Page](../../)


