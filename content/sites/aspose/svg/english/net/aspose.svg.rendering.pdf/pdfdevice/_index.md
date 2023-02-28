---
title: PdfDevice
second_title: Aspose.SVG for .NET API Reference
description: Represents rendering to a pdf document.
type: docs
weight: 2950
url: /net/aspose.svg.rendering.pdf/pdfdevice/
---
## PdfDevice class

Represents rendering to a pdf document.

```csharp
public class PdfDevice : Device<PdfGraphicContext, PdfRenderingOptions>
```

## Constructors

| Name | Description |
| --- | --- |
| [PdfDevice](pdfdevice#constructor)(ICreateStreamProvider) | Initializes a new instance of the [`PdfDevice`](./pdfdevice/) class. |
| [PdfDevice](pdfdevice#constructor_4)(Stream) | Initializes a new instance of the [`PdfDevice`](./pdfdevice/) class. |
| [PdfDevice](pdfdevice#constructor_5)(string) | Initializes a new instance of the [`PdfDevice`](./pdfdevice/) class. |
| [PdfDevice](pdfdevice#constructor_1)(PdfRenderingOptions, ICreateStreamProvider) | Initializes a new instance of the [`PdfDevice`](./pdfdevice/) class by rendering options and stream provider. |
| [PdfDevice](pdfdevice#constructor_2)(PdfRenderingOptions, Stream) | Initializes a new instance of the [`PdfDevice`](./pdfdevice/) class by rendering options and output stream. |
| [PdfDevice](pdfdevice#constructor_3)(PdfRenderingOptions, string) | Initializes a new instance of the [`PdfDevice`](./pdfdevice/) class by rendering options and output file name. |

## Properties

| Name | Description |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device`2/graphiccontext/) { get; } |  |
| [Options](../../aspose.svg.rendering/device`2/options/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| override [AddRect](../../aspose.svg.rendering.pdf/pdfdevice/addrect/)(RectangleF) | Appends a rectangle to the current path as a complete subpath. |
| override [BeginDocument](../../aspose.svg.rendering.pdf/pdfdevice/begindocument/)(Document) | Begins rendering of the document. |
| override [BeginElement](../../aspose.svg.rendering.pdf/pdfdevice/beginelement/)(Element, RectangleF) | Begins rendering of the element. |
| override [BeginPage](../../aspose.svg.rendering.pdf/pdfdevice/beginpage/)(SizeF) | Begins rendering of the new page. |
| override [Clip](../../aspose.svg.rendering.pdf/pdfdevice/clip/)(FillMode) | Modifies the current clipping path by intersecting it with the current path, using the FillMode rule to determine the region to fill. This method terminates current path. |
| override [ClosePath](../../aspose.svg.rendering.pdf/pdfdevice/closepath/)() | Closes the current subpath by appending a straight line segment from the current point to the starting point of the subpath. If the current subpath is already closed, "ClosePath" does nothing. This operator terminates the current subpath. Appending another segment to the current path begins a new subpath, even if the new segment begins at the endpoint reached by the "ClosePath" method. |
| override [CubicBezierTo](../../aspose.svg.rendering.pdf/pdfdevice/cubicbezierto/)(PointF, PointF, PointF) | Appends a cubic Bézier curve to the current path. The curve extends from the current point to the point pt2, using pt1 and pt2 as the Bézier control points. The new current point is pt3. |
| [Dispose](../../aspose.svg.rendering/device`2/dispose/)() |  |
| override [DrawImage](../../aspose.svg.rendering.pdf/pdfdevice/drawimage/)(byte[], ImageType, RectangleF) | Draws the specified image. |
| override [EndDocument](../../aspose.svg.rendering.pdf/pdfdevice/enddocument/)() | Ends rendering of the document. |
| override [EndElement](../../aspose.svg.rendering.pdf/pdfdevice/endelement/)(Element) | Ends rendering of the element. |
| override [EndPage](../../aspose.svg.rendering.pdf/pdfdevice/endpage/)() | Ends rendering of the current page. |
| override [Fill](../../aspose.svg.rendering.pdf/pdfdevice/fill/)(FillMode) | Fills the entire region enclosed by the current path. If the path consists of several disconnected subpaths, it fills the insides of all subpaths, considered together. This method terminates current path. |
| override [FillText](../../aspose.svg.rendering.pdf/pdfdevice/filltext/)(string, PointF) | Fills the specified text string at the specified location. |
| override [Flush](../../aspose.svg.rendering.pdf/pdfdevice/flush/)() | Flushes all data to output stream. |
| override [LineTo](../../aspose.svg.rendering.pdf/pdfdevice/lineto/)(PointF) | Appends a straight line segment from the current point to the point (pt). The new current point is pt. |
| override [MoveTo](../../aspose.svg.rendering.pdf/pdfdevice/moveto/)(PointF) | Begins a new subpath by moving the current point to coordinates of the parameter pt, omitting any connecting line segment. If the previous path construction method in the current path was also "MoveTo", the new "MoveTo" overrides it; no vestige of the previous "MoveTo" operation remains in the path. |
| override [RestoreGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice/restoregraphiccontext/)() | Restores the entire graphics context to its former value by popping it from the stack. |
| override [SaveGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice/savegraphiccontext/)() | Pushes a copy of the entire graphics context onto the stack. |
| override [Stroke](../../aspose.svg.rendering.pdf/pdfdevice/stroke/)() | Strokes a line along the current path. The stroked line follows each straight or curved segment in the path, centered on the segment with sides parallel to it. Each of the path’s subpaths is treated separately. This method terminates current path. |
| override [StrokeAndFill](../../aspose.svg.rendering.pdf/pdfdevice/strokeandfill/)(FillMode) | Strokes and fill current path. This method terminates current path. |
| override [StrokeText](../../aspose.svg.rendering.pdf/pdfdevice/stroketext/)(string, PointF) | Strokes the specified text string at the specified location. |

## Other Members

| Name | Description |
| --- | --- |
| class [PdfGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice.pdfgraphiccontext) | Holds current graphics control parameters for the PdfDevice. These parameters define the global framework within which the graphics operators execute. |

### See Also

* class [Device&lt;TGraphicContext,TRenderingOptions&gt;](../../aspose.svg.rendering/device-2/)
* class [PdfGraphicContext](../pdfdevice.pdfgraphiccontext/)
* class [PdfRenderingOptions](../pdfrenderingoptions/)
* namespace [Aspose.Svg.Rendering.Pdf](../../aspose.svg.rendering.pdf/)
* assembly [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
