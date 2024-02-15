---
title: Class XpsDevice
second_title: Aspose.TeX for .NET API Reference
description: Aspose.TeX.Presentation.Xps.XpsDevice class. Implements the interface for outputting text and graphic content to XPS document
type: docs
weight: 720
url: /net/aspose.tex.presentation.xps/xpsdevice/
---
## XpsDevice class

Implements the interface for outputting text and graphic content to XPS document.

```csharp
public class XpsDevice : Device, IFragmentRasterizer, IInteractiveDevice
```

## Constructors

| Name | Description |
| --- | --- |
| [XpsDevice](xpsdevice/#constructor)() | Creates a new instance. The output file will be written to the output working directory taking the job name as a file name. |
| [XpsDevice](xpsdevice/#constructor_1)(Stream) | Creates a new instance. The output file will be written to specified stream. |

## Properties

| Name | Description |
| --- | --- |
| override [DestinationName](../../aspose.tex.presentation.xps/xpsdevice/destinationname/) { get; } | Gets destination name: output file name or device description. |
| override [Fill](../../aspose.tex.presentation.xps/xpsdevice/fill/) { get; set; } | Gets/sets the current fill. |
| override [FillOpacity](../../aspose.tex.presentation.xps/xpsdevice/fillopacity/) { get; set; } | Gets/sets the current fill opacity. |
| override [IsReady](../../aspose.tex.presentation.xps/xpsdevice/isready/) { get; } | Shows if device is ready for output. |
| override [PageCount](../../aspose.tex.presentation.xps/xpsdevice/pagecount/) { get; } | Gets the number of pages. |
| override [Stroke](../../aspose.tex.presentation.xps/xpsdevice/stroke/) { get; set; } | Gets/sets the current stroke. |
| override [StrokeOpacity](../../aspose.tex.presentation.xps/xpsdevice/strokeopacity/) { get; set; } | Gets/sets the current stroke opacity. |

## Methods

| Name | Description |
| --- | --- |
| [AddBookmark](../../aspose.tex.presentation.xps/xpsdevice/addbookmark/)(string, PointF) | Adds the bookmark identified by the name. |
| override [AddHyperlink](../../aspose.tex.presentation.xps/xpsdevice/addhyperlink/)(RectangleF, Pen, string) | Set the hyperlink with a URI as its target. |
| override [Create](../../aspose.tex.presentation.xps/xpsdevice/create/)() | Creates a copy of this device. |
| override [Dispose](../../aspose.tex.presentation.xps/xpsdevice/dispose/)() | Disposes this device instance. Finalizes this device instance graphics state, i.e. switches APS composing context to the ApsCanvas of the level higher then this device's graphics state ApsCanvas. |
| override [DrawPath](../../aspose.tex.presentation.xps/xpsdevice/drawpath/)(GraphicsPath) | Draws a path. |
| override [DrawString](../../aspose.tex.presentation.xps/xpsdevice/drawstring/)(string, float, float, List&lt;GlyphData&gt;) | Draws a text string. |
| override [EndDocument](../../aspose.tex.presentation.xps/xpsdevice/enddocument/)() | Finalizes the whole document. |
| [EndFragment](../../aspose.tex.presentation.xps/xpsdevice/endfragment/)() | Ends a fragment to rasterize. |
| override [EndPage](../../aspose.tex.presentation.xps/xpsdevice/endpage/)() | Finalizes a page. |
| override [FillPath](../../aspose.tex.presentation.xps/xpsdevice/fillpath/)(GraphicsPath) | Fill a path. |
| override [Initialize](../../aspose.tex.presentation.xps/xpsdevice/initialize/)() | Initializes the device. |
| override [SetClip](../../aspose.tex.presentation.xps/xpsdevice/setclip/)(GraphicsPath) | Sets the current clip path. |
| override [SetTransform](../../aspose.tex.presentation.xps/xpsdevice/settransform/)(Matrix) | Sets the current coordinate space transformation. |
| override [ShowImage](../../aspose.tex.presentation.xps/xpsdevice/showimage/)(PointF, SizeF, byte[]) | Shows a raster image. |
| override [StartDocument](../../aspose.tex.presentation.xps/xpsdevice/startdocument/)() | Starts the whole document. |
| [StartFragment](../../aspose.tex.presentation.xps/xpsdevice/startfragment/)() | Starts a fragment to rasterize. |
| override [StartPage](../../aspose.tex.presentation.xps/xpsdevice/startpage/)(float, float) | Starts a new page. |

### See Also

* class [Device](../../aspose.tex.presentation/device/)
* interface [IFragmentRasterizer](../../aspose.tex.presentation/ifragmentrasterizer/)
* interface [IInteractiveDevice](../../aspose.tex.presentation/iinteractivedevice/)
* namespace [Aspose.TeX.Presentation.Xps](../../aspose.tex.presentation.xps/)
* assembly [Aspose.TeX](../../)


