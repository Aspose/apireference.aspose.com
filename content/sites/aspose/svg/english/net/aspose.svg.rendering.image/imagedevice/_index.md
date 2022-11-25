---
title: ImageDevice
second_title: Aspose.SVG for .NET API Reference
description: Represents rendering to raster formats jpeg png bmp gif tiff.
type: docs
weight: 2820
url: /net/aspose.svg.rendering.image/imagedevice/
---
## ImageDevice class

Represents rendering to raster formats: jpeg, png, bmp, gif, tiff.

```csharp
public class ImageDevice : Device<ImageGraphicContext, ImageRenderingOptions>
```

## Constructors

| Name | Description |
| --- | --- |
| [ImageDevice](imagedevice#constructor)(ICreateStreamProvider) | Initializes a new instance of the [`ImageDevice`](./imagedevice/) class. |
| [ImageDevice](imagedevice#constructor_4)(Stream) | Initializes a new instance of the [`ImageDevice`](./imagedevice/) class. |
| [ImageDevice](imagedevice#constructor_5)(string) | Initializes a new instance of the [`ImageDevice`](./imagedevice/) class. |
| [ImageDevice](imagedevice#constructor_1)(ImageRenderingOptions, ICreateStreamProvider) | Initializes a new instance of the [`ImageDevice`](./imagedevice/) class by rendering options and stream provider. |
| [ImageDevice](imagedevice#constructor_2)(ImageRenderingOptions, Stream) | Initializes a new instance of the [`ImageDevice`](./imagedevice/) class by rendering options and output stream. |
| [ImageDevice](imagedevice#constructor_3)(ImageRenderingOptions, string) | Initializes a new instance of the [`ImageDevice`](./imagedevice/) class by rendering options and output file name. |

## Properties

| Name | Description |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device`2/graphiccontext/) { get; } |  |
| virtual [Graphics](../../aspose.svg.rendering.image/imagedevice/graphics/) { get; } | Gets the instance of Graphics. |
| [Options](../../aspose.svg.rendering/device`2/options/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| override [AddRect](../../aspose.svg.rendering.image/imagedevice/addrect/)(RectangleF) | Appends a rectangle to the current path as a complete subpath. |
| override [BeginDocument](../../aspose.svg.rendering.image/imagedevice/begindocument/)(Document) | Begins rendering of the document. |
| override [BeginElement](../../aspose.svg.rendering.image/imagedevice/beginelement/)(Element, RectangleF) | Begins rendering of the element. |
| override [BeginPage](../../aspose.svg.rendering.image/imagedevice/beginpage/)(SizeF) | Begins rendering of the new page. |
| override [Clip](../../aspose.svg.rendering.image/imagedevice/clip/)(FillMode) | Modifies the current clipping path by intersecting it with the current path, using the FillMode rule to determine the region to fill. This method terminates current path. |
| override [ClosePath](../../aspose.svg.rendering.image/imagedevice/closepath/)() | Closes the current subpath by appending a straight line segment from the current point to the starting point of the subpath. If the current subpath is already closed, "ClosePath" does nothing. This operator terminates the current subpath. Appending another segment to the current path begins a new subpath, even if the new segment begins at the endpoint reached by the "ClosePath" method. |
| override [CubicBezierTo](../../aspose.svg.rendering.image/imagedevice/cubicbezierto/)(PointF, PointF, PointF) | Appends a cubic Bézier curve to the current path. The curve extends from the current point to the point pt2, using pt1 and pt2 as the Bézier control points. The new current point is pt3. |
| [Dispose](../../aspose.svg.rendering/device`2/dispose/)() |  |
| override [DrawImage](../../aspose.svg.rendering.image/imagedevice/drawimage/)(byte[], ImageType, RectangleF) | Draws the specified image. |
| override [EndDocument](../../aspose.svg.rendering.image/imagedevice/enddocument/)() | Ends rendering of the document. |
| override [EndElement](../../aspose.svg.rendering.image/imagedevice/endelement/)(Element) | Ends rendering of the element. |
| override [EndPage](../../aspose.svg.rendering.image/imagedevice/endpage/)() | Ends rendering of the current page. |
| override [Fill](../../aspose.svg.rendering.image/imagedevice/fill/)(FillMode) | Fills the entire region enclosed by the current path. If the path consists of several disconnected subpaths, it fills the insides of all subpaths, considered together. This method terminates current path. |
| override [FillText](../../aspose.svg.rendering.image/imagedevice/filltext/)(string, PointF) | Fills the specified text string at the specified location. |
| override [Flush](../../aspose.svg.rendering.image/imagedevice/flush/)() | Flushes all data to output stream. |
| override [LineTo](../../aspose.svg.rendering.image/imagedevice/lineto/)(PointF) | Appends a straight line segment from the current point to the point (pt). The new current point is pt. |
| override [MoveTo](../../aspose.svg.rendering.image/imagedevice/moveto/)(PointF) | Begins a new subpath by moving the current point to coordinates of the parameter pt, omitting any connecting line segment. If the previous path construction method in the current path was also "MoveTo", the new "MoveTo" overrides it; no vestige of the previous "MoveTo" operation remains in the path. |
| override [RestoreGraphicContext](../../aspose.svg.rendering.image/imagedevice/restoregraphiccontext/)() | Restores the entire graphics context to its former value by popping it from the stack. |
| override [SaveGraphicContext](../../aspose.svg.rendering.image/imagedevice/savegraphiccontext/)() | Pushes a copy of the entire graphics context onto the stack. |
| override [Stroke](../../aspose.svg.rendering.image/imagedevice/stroke/)() | Strokes a line along the current path. The stroked line follows each straight or curved segment in the path, centered on the segment with sides parallel to it. Each of the path’s subpaths is treated separately. This method terminates current path. |
| override [StrokeAndFill](../../aspose.svg.rendering.image/imagedevice/strokeandfill/)(FillMode) | Strokes and fill current path. This method terminates current path. |
| override [StrokeText](../../aspose.svg.rendering.image/imagedevice/stroketext/)(string, PointF) | Strokes the specified text string at the specified location. |

## Other Members

| Name | Description |
| --- | --- |
| class [ImageGraphicContext](../../aspose.svg.rendering.image/imagedevice.imagegraphiccontext) | Holds current graphics control parameters for the [`ImageDevice`](./imagedevice/). These parameters define the global framework within which the graphics operators execute. |

### See Also

* class [ImageGraphicContext](../imagedevice.imagegraphiccontext/)
* class [Device&lt;TGraphicContext,TRenderingOptions&gt;](../../aspose.svg.rendering/device-2/)
* class [ImageRenderingOptions](../imagerenderingoptions/)
* namespace [Aspose.Svg.Rendering.Image](../../aspose.svg.rendering.image/)
* assembly [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
