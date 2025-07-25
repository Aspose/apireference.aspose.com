---
title: Path2D Class
second_title: Aspose.HTML for .NET API Reference
description: Aspose.Html.Dom.Canvas.Path2D class. The Path2D interface of the Canvas 2D API is used to declare paths that are then later used on CanvasRenderingContext2D objects. The path methods of the CanvasRenderingContext2D interface are present on this interface as well and are allowing you to create paths that you can retain and replay as required on a canvas
type: docs
weight: 460
url: /net/aspose.html.dom.canvas/path2d/
---
## Path2D class

The Path2D interface of the Canvas 2D API is used to declare paths that are then later used on CanvasRenderingContext2D objects. The path methods of the CanvasRenderingContext2D interface are present on this interface as well and are allowing you to create paths that you can retain and replay as required on a canvas.

```csharp
public class Path2D : DOMObject, ICanvasPathMethods, IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [Path2D](path2d/#constructor)() | returns a newly instantiated Path2D object |
| [Path2D](path2d/#constructor_1)(*Path2D*) | returns a newly instantiated Path2D object with another path as an argument (creates a copy) |
| [Path2D](path2d/#constructor_2)(*string*) | returns a newly instantiated Path2D object with a string consisting of SVG path data. |

## Methods

| Name | Description |
| --- | --- |
| [AddPath](../../aspose.html.dom.canvas/path2d/addpath/#addpath)(*Path2D*) | Adds to the path the path given by the argument. |
| [AddPath](../../aspose.html.dom.canvas/path2d/addpath/#addpath_1)(*Path2D, [SVGMatrix](../../aspose.html.dom.svg.datatypes/svgmatrix/)*) | Adds to the path the path given by the argument. |
| [Arc](../../aspose.html.dom.canvas/path2d/arc/#arc)(*double, double, double, double, double*) | Adds an arc to the path which is centered at (x, y) position with radius r starting at startAngle and ending at endAngle going in the given direction by anticlockwise (defaulting to clockwise). |
| [Arc](../../aspose.html.dom.canvas/path2d/arc/#arc_1)(*double, double, double, double, double, bool*) | Adds an arc to the path which is centered at (x, y) position with radius r starting at startAngle and ending at endAngle going in the given direction by anticlockwise (defaulting to clockwise). |
| [ArcTo](../../aspose.html.dom.canvas/path2d/arcto/)(*double, double, double, double, double*) | Adds an arc to the path with the given control points and radius, connected to the previous point by a straight line. |
| [BezierCurveTo](../../aspose.html.dom.canvas/path2d/beziercurveto/)(*double, double, double, double, double, double*) | Adds a cubic Bézier curve to the path. It requires three points. The first two points are control points and the third one is the end point. The starting point is the last point in the current path, which can be changed using moveTo() before creating the Bézier curve. |
| [ClosePath](../../aspose.html.dom.canvas/path2d/closepath/)() | Causes the point of the pen to move back to the start of the current sub-path. It tries to draw a straight line from the current point to the start. If the shape has already been closed or has only one point, this function does nothing. |
| [Dispose](../../aspose.html.dom.canvas/path2d/dispose/)() | Disposes object. |
| [Ellipse](../../aspose.html.dom.canvas/path2d/ellipse/#ellipse)(*double, double, double, double, double, double, double*) | Adds an ellipse to the path which is centered at (x, y) position with the radii radiusX and radiusY starting at startAngle and ending at endAngle going in the given direction by anticlockwise (defaulting to clockwise). |
| [Ellipse](../../aspose.html.dom.canvas/path2d/ellipse/#ellipse_1)(*double, double, double, double, double, double, double, bool*) | Adds an ellipse to the path which is centered at (x, y) position with the radii radiusX and radiusY starting at startAngle and ending at endAngle going in the given direction by anticlockwise (defaulting to clockwise). |
| virtual [GetPlatformType](../../aspose.html.dom/domobject/getplatformtype/)() | This method is used to retrieve the ECMAScript object Type. |
| [LineTo](../../aspose.html.dom.canvas/path2d/lineto/)(*double, double*) | Connects the last point in the subpath to the x, y coordinates with a straight line. |
| [MoveTo](../../aspose.html.dom.canvas/path2d/moveto/)(*double, double*) | Moves the starting point of a new sub-path to the (x, y) coordinates. |
| [QuadraticCurveTo](../../aspose.html.dom.canvas/path2d/quadraticcurveto/)(*double, double, double, double*) | Adds a quadratic Bézier curve to the current path. |
| [Rect](../../aspose.html.dom.canvas/path2d/rect/)(*double, double, double, double*) | Creates a path for a rectangle at position (x, y) with a size that is determined by width and height. |

### See Also

* class [DOMObject](../../aspose.html.dom/domobject/)
* interface [ICanvasPathMethods](../icanvaspathmethods/)
* namespace [Aspose.Html.Dom.Canvas](../../aspose.html.dom.canvas/)
* assembly [Aspose.HTML](../../)
