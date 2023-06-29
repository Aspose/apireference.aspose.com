---
title: ImageDevice Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Rendering.Image.ImageDevice class. Represents rendering to raster formats jpeg png bmp gif tiff
type: docs
weight: 3200
url: /net/aspose.svg.rendering.image/imagedevice/
---
## ImageDevice class

Represents rendering to raster formats: jpeg, png, bmp, gif, tiff.

```csharp
public class ImageDevice : DeviceAdapter
```

## Constructors

| Name | Description |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)(ICreateStreamProvider) | Initializes a new instance of the `ImageDevice` class. |
| [ImageDevice](imagedevice/#constructor_4)(Stream) | Initializes a new instance of the `ImageDevice` class. |
| [ImageDevice](imagedevice/#constructor_5)(string) | Initializes a new instance of the `ImageDevice` class. |
| [ImageDevice](imagedevice/#constructor_1)(ImageRenderingOptions, ICreateStreamProvider) | Initializes a new instance of the `ImageDevice` class by rendering options and stream provider. |
| [ImageDevice](imagedevice/#constructor_2)(ImageRenderingOptions, Stream) | Initializes a new instance of the `ImageDevice` class by rendering options and output stream. |
| [ImageDevice](imagedevice/#constructor_3)(ImageRenderingOptions, string) | Initializes a new instance of the `ImageDevice` class by rendering options and output file name. |

## Properties

| Name | Description |
| --- | --- |
| [AdaptedDevice](../../aspose.svg.rendering/deviceadapter/adapteddevice/) { get; set; } | Gets or sets the adapted device. See [`IDevice`](../../aspose.svg.rendering/idevice/). |
| [GraphicContext](../../aspose.svg.rendering/deviceadapter/graphiccontext/) { get; } | Gets the graphic context. |
| [Options](../../aspose.svg.rendering/deviceadapter/options/) { get; } | Gets the rendering options. |

## Methods

| Name | Description |
| --- | --- |
| virtual [AddRect](../../aspose.svg.rendering/deviceadapter/addrect/)(RectangleF) | Appends a rectangle to the current path as a complete subpath. |
| virtual [BeginDocument](../../aspose.svg.rendering/deviceadapter/begindocument/)(Document) | Begins rendering of the document. |
| virtual [BeginElement](../../aspose.svg.rendering/deviceadapter/beginelement/)(Element, RectangleF) | Begins rendering of the element. |
| virtual [BeginPage](../../aspose.svg.rendering/deviceadapter/beginpage/)(SizeF) | Begins rendering of the new page. |
| virtual [Clip](../../aspose.svg.rendering/deviceadapter/clip/)(FillRule) | Modifies the current clipping path by intersecting it with the current path, using the FillMode rule to determine the region to fill. This method terminates current path. |
| virtual [ClosePath](../../aspose.svg.rendering/deviceadapter/closepath/)() | Closes the current subpath by appending a straight line segment from the current point to the starting point of the subpath. If the current subpath is already closed, "ClosePath" does nothing. This operator terminates the current subpath. Appending another segment to the current path begins a new subpath, even if the new segment begins at the endpoint reached by the "ClosePath" method. |
| virtual [CubicBezierTo](../../aspose.svg.rendering/deviceadapter/cubicbezierto/)(PointF, PointF, PointF) | Appends a cubic Bézier curve to the current path. The curve extends from the current point to the point pt2, using pt1 and pt2 as the Bézier control points. The new current point is pt3. |
| virtual [Dispose](../../aspose.svg.rendering/deviceadapter/dispose/)() | Performs application-defined tasks associated with freeing, releasing, or resetting resources. |
| virtual [DrawImage](../../aspose.svg.rendering/deviceadapter/drawimage/)(byte[], WebImageFormat, RectangleF) | Draws the specified image. |
| virtual [EndDocument](../../aspose.svg.rendering/deviceadapter/enddocument/)() | Ends rendering of the document. |
| virtual [EndElement](../../aspose.svg.rendering/deviceadapter/endelement/)(Element) | Ends rendering of the element. |
| virtual [EndPage](../../aspose.svg.rendering/deviceadapter/endpage/)() | Ends rendering of the current page. |
| virtual [Fill](../../aspose.svg.rendering/deviceadapter/fill/)(FillRule) | Fills the entire region enclosed by the current path. If the path consists of several disconnected subpaths, it fills the insides of all subpaths, considered together. This method terminates current path. |
| override [FillText](../../aspose.svg.rendering.image/imagedevice/filltext/)(string, PointF) | Fills the specified text string at the specified location. |
| virtual [Flush](../../aspose.svg.rendering/deviceadapter/flush/)() | Flushes all data to output stream. |
| virtual [LineTo](../../aspose.svg.rendering/deviceadapter/lineto/)(PointF) | Appends a straight line segment from the current point to the point (pt). The new current point is pt. |
| virtual [MoveTo](../../aspose.svg.rendering/deviceadapter/moveto/)(PointF) | Begins a new subpath by moving the current point to coordinates of the parameter pt, omitting any connecting line segment. If the previous path construction method in the current path was also "MoveTo", the new "MoveTo" overrides it; no vestige of the previous "MoveTo" operation remains in the path. |
| virtual [RestoreGraphicContext](../../aspose.svg.rendering/deviceadapter/restoregraphiccontext/)() | Restores the entire graphics context to its former value by popping it from the stack. |
| virtual [SaveGraphicContext](../../aspose.svg.rendering/deviceadapter/savegraphiccontext/)() | Pushes a copy of the entire graphics context onto the stack. |
| virtual [Stroke](../../aspose.svg.rendering/deviceadapter/stroke/)() | Strokes a line along the current path. The stroked line follows each straight or curved segment in the path, centered on the segment with sides parallel to it. Each of the path’s subpaths is treated separately. This method terminates current path. |
| virtual [StrokeAndFill](../../aspose.svg.rendering/deviceadapter/strokeandfill/)(FillRule) | Strokes and fill current path. This method terminates current path. |
| virtual [StrokeText](../../aspose.svg.rendering/deviceadapter/stroketext/)(string, PointF) | Strokes the specified text string at the specified location. |

### See Also

* class [DeviceAdapter](../../aspose.svg.rendering/deviceadapter/)
* namespace [Aspose.Svg.Rendering.Image](../../aspose.svg.rendering.image/)
* assembly [Aspose.SVG](../../)
