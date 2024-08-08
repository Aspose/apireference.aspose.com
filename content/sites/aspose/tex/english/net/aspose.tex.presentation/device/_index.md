---
title: Class Device
second_title: Aspose.TeX for .NET API Reference
description: Aspose.TeX.Presentation.Device class. Implements the interface for outputting text and graphic content to abstract device. Rendering is performed page by page
type: docs
weight: 590
url: /net/aspose.tex.presentation/device/
---
## Device class

Implements the interface for outputting text and graphic content to abstract device. Rendering is performed page by page.

```csharp
public abstract class Device
```

## Constructors

| Name | Description |
| --- | --- |
| [Device](device/)() | Creates a new instance. |

## Properties

| Name | Description |
| --- | --- |
| abstract [DestinationName](../../aspose.tex.presentation/device/destinationname/) { get; } | Gets destination name: output file name or device description. |
| virtual [Fill](../../aspose.tex.presentation/device/fill/) { get; set; } | Gets/sets the current fill. |
| virtual [FillOpacity](../../aspose.tex.presentation/device/fillopacity/) { get; set; } | Gets/sets the current fill opacity. |
| abstract [IsReady](../../aspose.tex.presentation/device/isready/) { get; } | Shows if device is ready for output. |
| abstract [PageCount](../../aspose.tex.presentation/device/pagecount/) { get; } | Gets the number of pages. |
| virtual [Stroke](../../aspose.tex.presentation/device/stroke/) { get; set; } | Gets/sets the current stroke. |
| virtual [StrokeOpacity](../../aspose.tex.presentation/device/strokeopacity/) { get; set; } | Gets/sets the current stroke opacity. |

## Methods

| Name | Description |
| --- | --- |
| abstract [AddHyperlink](../../aspose.tex.presentation/device/addhyperlink/)(RectangleF, Pen, string) | Sets the hyperlink with a URI as its target. |
| virtual [Create](../../aspose.tex.presentation/device/create/)() | Creates a copy of this device. |
| virtual [Dispose](../../aspose.tex.presentation/device/dispose/)() | Disposes the device. |
| abstract [DrawPath](../../aspose.tex.presentation/device/drawpath/)(GraphicsPath) | Draws a path. |
| abstract [DrawString](../../aspose.tex.presentation/device/drawstring/)(string, float, float, List&lt;GlyphData&gt;) | Draws a text string. |
| abstract [EndDocument](../../aspose.tex.presentation/device/enddocument/)() | Finalizes the whole document. |
| abstract [EndPage](../../aspose.tex.presentation/device/endpage/)() | Finalizes a page. |
| abstract [FillPath](../../aspose.tex.presentation/device/fillpath/)(GraphicsPath) | Fills a path. |
| abstract [Initialize](../../aspose.tex.presentation/device/initialize/)() | Initializes the device. |
| abstract [SetClip](../../aspose.tex.presentation/device/setclip/)(GraphicsPath) | Sets the current clip path. |
| abstract [SetTransform](../../aspose.tex.presentation/device/settransform/)(Matrix) | Sets the current coordinate space transformation. |
| abstract [ShowImage](../../aspose.tex.presentation/device/showimage/)(PointF, SizeF, byte[]) | Shows a raster image. |
| abstract [StartDocument](../../aspose.tex.presentation/device/startdocument/)() | Starts the whole document. |
| abstract [StartPage](../../aspose.tex.presentation/device/startpage/)(float, float) | Starts a new page. |

### See Also

* namespace [Aspose.TeX.Presentation](../../aspose.tex.presentation/)
* assembly [Aspose.TeX](../../)


