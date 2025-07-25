---
title: PdfDevice.PdfGraphicContext Class
second_title: Aspose.HTML for .NET API Reference
description: Aspose.Html.Rendering.Pdf.PdfDevicePdfGraphicContext class. Holds current graphics control parameters for the PdfDevice. These parameters define the global framework within which the graphics operators execute
type: docs
weight: 4660
url: /net/aspose.html.rendering.pdf/pdfdevice.pdfgraphiccontext/
---
## PdfDevice.PdfGraphicContext class

Holds current graphics control parameters for the PdfDevice. These parameters define the global framework within which the graphics operators execute.

```csharp
public class PdfGraphicContext : GraphicContext
```

## Constructors

| Name | Description |
| --- | --- |
| [PdfGraphicContext](../../aspose.html.rendering.pdf/pdfdevice.pdfgraphiccontext/.ctor)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| virtual [CharacterSpacing](../../aspose.html.rendering/graphiccontext/characterspacing/) { get; set; } | Sets or gets character spacing. |
| virtual [FillBrush](../../aspose.html.rendering/graphiccontext/fillbrush/) { get; set; } | Sets or gets the brush object that is used to fill the interiors of paths. |
| virtual [Font](../../aspose.html.rendering/graphiccontext/font/) { get; set; } | Sets or gets the true type font object that is used for rendering text. |
| virtual [FontSize](../../aspose.html.rendering/graphiccontext/fontsize/) { get; set; } | Sets or gets text font size. |
| virtual [FontStyle](../../aspose.html.rendering/graphiccontext/fontstyle/) { get; set; } | Sets or gets text font style. |
| virtual [LineCap](../../aspose.html.rendering/graphiccontext/linecap/) { get; set; } | Sets or gets the code specifying the shape of the endpoints for any open path that is stroked. |
| virtual [LineDashOffset](../../aspose.html.rendering/graphiccontext/linedashoffset/) { get; set; } | Sets or gets the phase offset of the current line dash pattern. |
| virtual [LineDashPattern](../../aspose.html.rendering/graphiccontext/linedashpattern/) { get; set; } | Sets or gets the description of the dash pattern to be used when paths are stroked. Can be set to null or an empty array to be disabled. |
| virtual [LineJoin](../../aspose.html.rendering/graphiccontext/linejoin/) { get; set; } | Sets or gets the code specifying the shape of joints between connected segments of a stroked path. |
| virtual [LineWidth](../../aspose.html.rendering/graphiccontext/linewidth/) { get; set; } | Sets or gets the thickness of paths to be stroked. |
| virtual [MiterLimit](../../aspose.html.rendering/graphiccontext/miterlimit/) { get; set; } | Sets or gets the maximum length of mitered line joins for stroked paths. This parameter limits the length of "spikes" produced when line segments join at sharp angles. |
| virtual [StrokeBrush](../../aspose.html.rendering/graphiccontext/strokebrush/) { get; set; } | Sets or gets the brush object that is used for stroked paths. |
| virtual [TextInfo](../../aspose.html.rendering/graphiccontext/textinfo/) { get; } | Gets a [`TextInfo`](../../aspose.html.rendering/textinfo/) object which contains information about rendered text. |
| virtual [TransformationMatrix](../../aspose.html.rendering/graphiccontext/transformationmatrix/) { get; set; } | Sets or gets transformation matrix. |

## Methods

| Name | Description |
| --- | --- |
| virtual [Clone](../../aspose.html.rendering/graphiccontext/clone/)() | Creates a new instance of a GraphicContext class with the same property values as an existing instance. |
| virtual [Transform](../../aspose.html.rendering/graphiccontext/transform/)(*[IMatrix](../../aspose.html.drawing/imatrix/)*) | Modify the current transformation matrix by multiplying the specified matrix. |

### See Also

* class [GraphicContext](../../aspose.html.rendering/graphiccontext/)
* class [PdfDevice](../pdfdevice/)
* namespace [Aspose.Html.Rendering.Pdf](../../aspose.html.rendering.pdf/)
* assembly [Aspose.HTML](../../)
