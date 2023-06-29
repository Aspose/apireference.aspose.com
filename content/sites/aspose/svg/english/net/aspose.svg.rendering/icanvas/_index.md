---
title: ICanvas Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Rendering.ICanvas interface. Represents a canvas for drawing 2D graphics
type: docs
weight: 3070
url: /net/aspose.svg.rendering/icanvas/
---
## ICanvas interface

Represents a canvas for drawing 2D graphics.

```csharp
public interface ICanvas : IDisposable
```

## Properties

| Name | Description |
| --- | --- |
| [Context](../../aspose.svg.rendering/icanvas/context/) { get; } | Gets the canvas context associated with the canvas. |

## Methods

| Name | Description |
| --- | --- |
| [Arc](../../aspose.svg.rendering/icanvas/arc/#arc)(double, double, double, double, double) | Adds an arc to the current path. |
| [Arc](../../aspose.svg.rendering/icanvas/arc/#arc_1)(double, double, double, double, double, bool) | Adds an arc to the current path. |
| [ArcTo](../../aspose.svg.rendering/icanvas/arcto/)(double, double, double, double, double) | Adds an arc to the current path, connecting the previous point to the start point of the arc with a straight line. |
| [BeginPath](../../aspose.svg.rendering/icanvas/beginpath/)() | Begins a new subpath, discarding the current path if any. |
| [BezierCurveTo](../../aspose.svg.rendering/icanvas/beziercurveto/)(double, double, double, double, double, double) | Adds a cubic Bézier curve to the current path. |
| [ClearRect](../../aspose.svg.rendering/icanvas/clearrect/)(float, float, float, float) | Clears the specified rectangular area to transparent. |
| [Clip](../../aspose.svg.rendering/icanvas/clip/#clip)(FillRule) | Sets the current clipping path using the specified fill rule. |
| [Clip](../../aspose.svg.rendering/icanvas/clip/#clip_1)(IPath, FillRule) | Sets the current clipping path using the specified path and fill rule. |
| [ClosePath](../../aspose.svg.rendering/icanvas/closepath/)() | Closes the current subpath by drawing a straight line from the current point to the starting point of the subpath. |
| [DrawImage](../../aspose.svg.rendering/icanvas/drawimage/)(byte[], WebImageFormat, RectangleF) | Draws an image on the canvas. |
| [Ellipse](../../aspose.svg.rendering/icanvas/ellipse/#ellipse)(double, double, double, double, double, double, double) | Adds an ellipse to the current path. |
| [Ellipse](../../aspose.svg.rendering/icanvas/ellipse/#ellipse_1)(double, double, double, double, double, double, double, bool) | Adds an ellipse to the current path. |
| [Fill](../../aspose.svg.rendering/icanvas/fill/#fill)(FillRule) | Fills the current path with the specified fill rule. |
| [Fill](../../aspose.svg.rendering/icanvas/fill/#fill_1)(IPath, FillRule) | Fills the specified path with the specified fill rule. |
| [FillRect](../../aspose.svg.rendering/icanvas/fillrect/)(float, float, float, float) | Fills the specified rectangular area with the current fill style. |
| [FillText](../../aspose.svg.rendering/icanvas/filltext/)(string, float, float) | Fills the specified text at the specified position. |
| [GetImageData](../../aspose.svg.rendering/icanvas/getimagedata/)(float, float, float, float) | Gets the image data of the specified rectangular area. |
| [GetPathRect](../../aspose.svg.rendering/icanvas/getpathrect/)() | Gets the bounding rectangle of the current path. |
| [IsPointInPath](../../aspose.svg.rendering/icanvas/ispointinpath/#ispointinpath_1)(float, float, FillRule) | Determines whether the specified point is inside the current path using the specified fill rule. |
| [IsPointInPath](../../aspose.svg.rendering/icanvas/ispointinpath/#ispointinpath)(IPath, float, float, FillRule) | Determines whether the specified point is inside the specified path using the specified fill rule. |
| [IsPointInStroke](../../aspose.svg.rendering/icanvas/ispointinstroke/#ispointinstroke_1)(float, float) | Determines whether the specified point is inside the current stroked path. |
| [IsPointInStroke](../../aspose.svg.rendering/icanvas/ispointinstroke/#ispointinstroke)(IPath, float, float) | Determines whether the specified point is inside the specified stroked path. |
| [LineTo](../../aspose.svg.rendering/icanvas/lineto/)(double, double) | Adds a line segment to the current path. |
| [MeasureText](../../aspose.svg.rendering/icanvas/measuretext/)(string) | Measures the width of the specified text using the current font properties. |
| [MoveTo](../../aspose.svg.rendering/icanvas/moveto/)(double, double) | Moves the starting point of a new subpath to the specified point. |
| [PutImageData](../../aspose.svg.rendering/icanvas/putimagedata/)(Tuple&lt;int, int, Uint8ClampedArray&gt;, int, int) | Puts the specified image data onto the canvas at the specified position. |
| [QuadraticCurveTo](../../aspose.svg.rendering/icanvas/quadraticcurveto/)(double, double, double, double) | Adds a quadratic Bézier curve to the current path. |
| [Rect](../../aspose.svg.rendering/icanvas/rect/)(float, float, float, float) | Adds a rectangle to the current path. |
| [RestoreContext](../../aspose.svg.rendering/icanvas/restorecontext/)() | Restores the most recently saved canvas state by popping the top entry from the drawing state stack. |
| [SaveContext](../../aspose.svg.rendering/icanvas/savecontext/)() | Saves the entire state of the canvas by pushing the current state onto a stack. |
| [Stroke](../../aspose.svg.rendering/icanvas/stroke/#stroke)() | Strokes the current path. |
| [Stroke](../../aspose.svg.rendering/icanvas/stroke/#stroke_1)(IPath) | Strokes the specified path. |
| [StrokeRect](../../aspose.svg.rendering/icanvas/strokerect/)(float, float, float, float) | Strokes the specified rectangular area. |
| [StrokeText](../../aspose.svg.rendering/icanvas/stroketext/)(string, float, float) | Strokes the specified text at the specified position. |

### See Also

* namespace [Aspose.Svg.Rendering](../../aspose.svg.rendering/)
* assembly [Aspose.SVG](../../)
