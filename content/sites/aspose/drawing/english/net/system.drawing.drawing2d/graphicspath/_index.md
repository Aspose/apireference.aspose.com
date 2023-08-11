---
title: Class GraphicsPath
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Drawing2D.GraphicsPath class. Represents a series of connected lines and curves
type: docs
weight: 260
url: /net/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class

Represents a series of connected lines and curves.

```csharp
public class GraphicsPath : IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [GraphicsPath](graphicspath/#constructor)() | Initializes a new instance of the GraphicsPath class with a FillMode value of Alternate. |
| [GraphicsPath](graphicspath/#constructor_1)(FillMode) | Initializes a new instance of the `GraphicsPath` class with the specified FillMode enumeration. |
| [GraphicsPath](graphicspath/#constructor_2)(PointF[], byte[]) | Initializes a new instance of the `GraphicsPath` class with the specified [`PathPointType`](../pathpointtype/) and PointF arrays. |
| [GraphicsPath](graphicspath/#constructor_4)(Point[], byte[]) | Initializes a new instance of the `GraphicsPath` class with the specified [`PathPointType`](../pathpointtype/) and Point arrays. |
| [GraphicsPath](graphicspath/#constructor_3)(PointF[], byte[], FillMode) | Initializes a new instance of the `GraphicsPath` class with the specified PathPointType and PointF arrays and with the specified FillMode enumeration element.. |
| [GraphicsPath](graphicspath/#constructor_5)(Point[], byte[], FillMode) | Initializes a new instance of the `GraphicsPath` class with the specified PathPointType and Point arrays and with the specified FillMode enumeration element.. |

## Properties

| Name | Description |
| --- | --- |
| [FillMode](../../system.drawing.drawing2d/graphicspath/fillmode/) { get; set; } | Gets or sets a FillMode enumeration that determines how the interiors of shapes in this GraphicsPath are filled. |
| [PathData](../../system.drawing.drawing2d/graphicspath/pathdata/) { get; } | Gets a PathData that encapsulates arrays of points and types for this GraphicsPath |
| [PathPoints](../../system.drawing.drawing2d/graphicspath/pathpoints/) { get; } | Gets the points in the path. |
| [PathTypes](../../system.drawing.drawing2d/graphicspath/pathtypes/) { get; } | Gets the types of the corresponding points in the PathPoints array. |
| [PointCount](../../system.drawing.drawing2d/graphicspath/pointcount/) { get; } | Gets the number of elements in the PathPoints or the PathTypes array. |

## Methods

| Name | Description |
| --- | --- |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc/#addarc_1)(RectangleF, float, float) | Appends an elliptical arc to the current figure. |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc/#addarc)(float, float, float, float, float, float) | Appends an elliptical arc to the current figure. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier/#addbezier_1)(PointF, PointF, PointF, PointF) | Adds a cubic Bézier curve to the current figure. |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier/#addbezier)(float, float, float, float, float, float, float, float) | Adds a cubic Bézier curve to the current figure. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers/#addbeziers)(PointF[]) | Adds a sequence of connected cubic Bézier curves to the current figure. |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers/#addbeziers_1)(Point[]) | Adds a sequence of connected cubic Bézier curves to the current figure. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve/#addclosedcurve)(PointF[]) | Adds a closed curve to this path. A cardinal spline curve is used because the curve travels through each of the points in the array. |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve/#addclosedcurve_1)(PointF[], float) | Adds a closed curve to this path. A cardinal spline curve is used because the curve travels through each of the points in the array. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve)(PointF[]) | Adds a spline curve to the current figure. A cardinal spline curve is used because the curve travels through each of the points in the array. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_3)(Point[]) | Adds a spline curve to the current figure. A cardinal spline curve is used because the curve travels through each of the points in the array. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_2)(PointF[], float) | Adds a spline curve to the current figure. |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve/#addcurve_1)(PointF[], int, int, float) | Adds a spline curve to the current figure. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse/#addellipse_1)(RectangleF) | Adds an ellipse to the current path. |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse/#addellipse)(float, float, float, float) | Adds an ellipse to the current path. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline/#addline_1)(PointF, PointF) | Appends a line segment to this GraphicsPath. |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline/#addline)(float, float, float, float) | Appends a line segment to this GraphicsPath. |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines/#addlines)(PointF[]) | Appends a series of connected line segments to the end of this GraphicsPath. |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines/#addlines_1)(Point[]) | Appends a series of connected line segments to the end of this GraphicsPath. |
| [AddPath](../../system.drawing.drawing2d/graphicspath/addpath/)(GraphicsPath, bool) | Appends the specified GraphicsPath to this path. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie/#addpie_1)(Rectangle, float, float) | Adds the outline of a pie shape to this path. |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie/#addpie)(float, float, float, float, float, float) | Adds the outline of a pie shape to this path. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon/#addpolygon)(PointF[]) | Adds a polygon to this path. |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon/#addpolygon_1)(Point[]) | Adds a polygon to this path. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle/#addrectangle)(Rectangle) | Adds a rectangle to this path. |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle/#addrectangle_1)(RectangleF) | Adds a rectangle to this path. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles/#addrectangles)(RectangleF[]) | Adds a series of rectangles to this path. |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles/#addrectangles_1)(Rectangle[]) | Adds a series of rectangles to this path. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring)(string, FontFamily, int, float, Point, StringFormat) | Adds a text string to this path. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_1)(string, FontFamily, int, float, PointF, StringFormat) | Adds a text string to this path. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_2)(string, FontFamily, int, float, Rectangle, StringFormat) | Adds a text string to this path. |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring/#addstring_3)(string, FontFamily, int, float, RectangleF, StringFormat) | Adds a text string to this path. |
| [Clone](../../system.drawing.drawing2d/graphicspath/clone/)() | Make a copy of the current path object. |
| [CloseAllFigures](../../system.drawing.drawing2d/graphicspath/closeallfigures/)() | Closes all open figures in this path and starts a new figure. It closes each open figure by connecting a line from its endpoint to its starting point. |
| [CloseFigure](../../system.drawing.drawing2d/graphicspath/closefigure/)() | Closes the current figure and starts a new figure. If the current figure contains a sequence of connected lines and curves, the method closes the loop by connecting a line from the endpoint to the starting point. |
| [Dispose](../../system.drawing.drawing2d/graphicspath/dispose/)() | Releases all resources used by this GraphicsPath. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten)() | Converts each curve in this path into a sequence of connected line segments. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten_1)(Matrix) | Applies the specified transform and then converts each curve in this GraphicsPath. |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten/#flatten_2)(Matrix, float) | Converts each curve in this GraphicsPath into a sequence of connected line segments. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds)() | Returns a rectangle that bounds this GraphicsPath. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds_1)(Matrix) | Returns a rectangle that bounds this GraphicsPath when this path is transformed by the specified Matrix. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds/#getbounds_2)(Matrix, Pen) | Returns a rectangle that bounds this GraphicsPath when the current path is transformed by the specified Matrix and drawn with the specified Pen. |
| [GetLastPoint](../../system.drawing.drawing2d/graphicspath/getlastpoint/)() | Gets the last point in the PathPoints array of this `GraphicsPath`. |
| [IsOutlineVisible](../../system.drawing.drawing2d/graphicspath/isoutlinevisible/)(PointF, Pen) | Indicates whether the specified point is contained within (under) the outline of this GraphicsPath when drawn with the specified Pen. |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible/#isvisible_4)(Point) | Indicates whether the specified point is contained within this GraphicsPath. |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible/#isvisible_6)(PointF) | Indicates whether the specified point is contained within this GraphicsPath. |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible/#isvisible_2)(float, float) | Indicates whether the specified point is contained within this GraphicsPath. |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible/#isvisible)(int, int) | Indicates whether the specified point is contained within this GraphicsPath. |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible/#isvisible_5)(Point, Graphics) | Indicates whether the specified point is contained within this GraphicsPath, using the specified Graphics. |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible/#isvisible_7)(PointF, Graphics) | Indicates whether the specified point is contained within this GraphicsPath, using the specified Graphics. |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible/#isvisible_3)(float, float, Graphics) | Indicates whether the specified point is contained within this GraphicsPath, using the specified Graphics. |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible/#isvisible_1)(int, int, Graphics) | Indicates whether the specified point is contained within this GraphicsPath, using the specified Graphics. |
| [Reset](../../system.drawing.drawing2d/graphicspath/reset/)() | Empties the [`PathPoints`](./pathpoints/) and [`PathTypes`](./pathtypes/) arrays and sets the [`FillMode`](../fillmode/) to Alternate. |
| [Reverse](../../system.drawing.drawing2d/graphicspath/reverse/)() | Reverses the order of points in the [`PathPoints`](./pathpoints/) array of this `GraphicsPath`. |
| [SetMarkers](../../system.drawing.drawing2d/graphicspath/setmarkers/)() | Sets a marker on this `GraphicsPath`. |
| [StartFigure](../../system.drawing.drawing2d/graphicspath/startfigure/)() | Starts a new figure without closing the current figure. All subsequent points added to the path are added to this new figure. |
| [Transform](../../system.drawing.drawing2d/graphicspath/transform/)(Matrix) | Applies a transform matrix to this GraphicsPath. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp)(PointF[], RectangleF) | Applies a warp transform, defined by a rectangle and a parallelogram, to this `GraphicsPath`. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_1)(PointF[], RectangleF, Matrix) | Applies a warp transform, defined by a rectangle and a parallelogram, to this `GraphicsPath`. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_2)(PointF[], RectangleF, Matrix, WarpMode) | Applies a warp transform, defined by a rectangle and a parallelogram, to this `GraphicsPath`. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp/#warp_3)(PointF[], RectangleF, Matrix, WarpMode, float) | Applies a warp transform, defined by a rectangle and a parallelogram, to this `GraphicsPath`. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen)(Pen) | Adds an additional outline to the path. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen_1)(Pen, Matrix) | Adds an additional outline to the GraphicsPath. |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen/#widen_2)(Pen, Matrix, float) | Replaces this GraphicsPath with curves that enclose the area that is filled when this path is drawn by the specified pen. |

### See Also

* namespace [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* assembly [Aspose.Drawing](../../)


