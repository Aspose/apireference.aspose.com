---
title: Class GraphicsPath
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.Drawing.Drawing2D.GraphicsPath class. Represents a series of connected lines and curves. This class cannot be inherited
type: docs
weight: 140
url: /net/aspose.page.drawing.drawing2d/graphicspath/
---
## GraphicsPath class

Represents a series of connected lines and curves. This class cannot be inherited.

```csharp
public sealed class GraphicsPath : ICloneable, IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [GraphicsPath](graphicspath/#constructor)() | Initializes a new instance of the `GraphicsPath` class with a [`FillMode`](./fillmode/) value of Alternate. |
| [GraphicsPath](graphicspath/#constructor_1)(FillMode) | Initializes a new instance of the `GraphicsPath` class with the specified [`FillMode`](../fillmode/) enumeration. |
| [GraphicsPath](graphicspath/#constructor_2)(PointF[], byte[]) | Initializes a new instance of the `GraphicsPath` array with the specified PathPointType and [`PointF`](../../aspose.page.drawing/pointf/) arrays. |
| [GraphicsPath](graphicspath/#constructor_3)(PointF[], byte[], FillMode) | Initializes a new instance of the `GraphicsPath` array with the specified PathPointType and [`PointF`](../../aspose.page.drawing/pointf/) arrays and with the specified [`FillMode`](../fillmode/) enumeration element. |

## Properties

| Name | Description |
| --- | --- |
| [FillMode](../../aspose.page.drawing.drawing2d/graphicspath/fillmode/) { get; set; } | Gets or sets a [`FillMode`](../fillmode/) enumeration that determines how the interiors of shapes in this `GraphicsPath` are filled. |
| [PathPoints](../../aspose.page.drawing.drawing2d/graphicspath/pathpoints/) { get; } | Gets the points in the path. |
| [PathTypes](../../aspose.page.drawing.drawing2d/graphicspath/pathtypes/) { get; } | Gets the types of the corresponding points in the [`PathPoints`](./pathpoints/) array. |
| [PointCount](../../aspose.page.drawing.drawing2d/graphicspath/pointcount/) { get; } | Gets the number of elements in the [`PathPoints`](./pathpoints/) or the [`PathTypes`](./pathtypes/) array. |

## Methods

| Name | Description |
| --- | --- |
| [AddArc](../../aspose.page.drawing.drawing2d/graphicspath/addarc/#addarc)(RectangleF, float, float) | Appends an elliptical arc to the current figure. |
| [AddArc](../../aspose.page.drawing.drawing2d/graphicspath/addarc/#addarc_1)(float, float, float, float, float, float) | Appends an elliptical arc to the current figure. |
| [AddBezier](../../aspose.page.drawing.drawing2d/graphicspath/addbezier/#addbezier)(PointF, PointF, PointF, PointF) | Adds a cubic Bezier curve to the current figure. |
| [AddBezier](../../aspose.page.drawing.drawing2d/graphicspath/addbezier/#addbezier_1)(float, float, float, float, float, float, float, float) | Adds a cubic Bezier curve to the current figure. |
| [AddBeziers](../../aspose.page.drawing.drawing2d/graphicspath/addbeziers/)(PointF[]) | Adds a sequence of connected cubic Bezier curves to the current figure. |
| [AddClosedCurve](../../aspose.page.drawing.drawing2d/graphicspath/addclosedcurve/#addclosedcurve)(PointF[]) | Adds a closed curve to this path. A cardinal spline curve is used because the curve travels through each of the points in the array. |
| [AddClosedCurve](../../aspose.page.drawing.drawing2d/graphicspath/addclosedcurve/#addclosedcurve_1)(PointF[], float) | Adds a closed curve to this path. A cardinal spline curve is used because the curve travels through each of the points in the array. |
| [AddCurve](../../aspose.page.drawing.drawing2d/graphicspath/addcurve/#addcurve)(PointF[]) | Adds a spline curve to the current figure. A cardinal spline curve is used because the curve travels through each of the points in the array. |
| [AddCurve](../../aspose.page.drawing.drawing2d/graphicspath/addcurve/#addcurve_2)(PointF[], float) | Adds a spline curve to the current figure. |
| [AddCurve](../../aspose.page.drawing.drawing2d/graphicspath/addcurve/#addcurve_1)(PointF[], int, int, float) | Adds a spline curve to the current figure. |
| [AddEllipse](../../aspose.page.drawing.drawing2d/graphicspath/addellipse/#addellipse)(RectangleF) | Adds an ellipse to the current path. |
| [AddEllipse](../../aspose.page.drawing.drawing2d/graphicspath/addellipse/#addellipse_1)(float, float, float, float) | Adds an ellipse to the current path. |
| [AddLine](../../aspose.page.drawing.drawing2d/graphicspath/addline/#addline)(PointF, PointF) | Appends a line segment to this `GraphicsPath`. |
| [AddLine](../../aspose.page.drawing.drawing2d/graphicspath/addline/#addline_1)(float, float, float, float) | Appends a line segment to this `GraphicsPath`. |
| [AddLines](../../aspose.page.drawing.drawing2d/graphicspath/addlines/)(PointF[]) | Appends a series of connected line segments to the end of this `GraphicsPath`. |
| [AddPath](../../aspose.page.drawing.drawing2d/graphicspath/addpath/)(GraphicsPath, bool) | Appends the specified `GraphicsPath` to this path. |
| [AddPie](../../aspose.page.drawing.drawing2d/graphicspath/addpie/#addpie)(RectangleF, float, float) | Adds the outline of a pie shape to this path. |
| [AddPie](../../aspose.page.drawing.drawing2d/graphicspath/addpie/#addpie_1)(float, float, float, float, float, float) | Adds the outline of a pie shape to this path. |
| [AddPolygon](../../aspose.page.drawing.drawing2d/graphicspath/addpolygon/)(PointF[]) | Adds a polygon to this path. |
| [AddRectangle](../../aspose.page.drawing.drawing2d/graphicspath/addrectangle/)(RectangleF) | Adds a rectangle to this path. |
| [AddRectangles](../../aspose.page.drawing.drawing2d/graphicspath/addrectangles/)(RectangleF[]) | Adds a series of rectangles to this path. |
| [AddString](../../aspose.page.drawing.drawing2d/graphicspath/addstring/#addstring)(string, Font, int, float, PointF) | Adds a text string to this path. |
| [AddString](../../aspose.page.drawing.drawing2d/graphicspath/addstring/#addstring_1)(string, Font, int, float, RectangleF) | Adds a text string to this path. |
| [Clone](../../aspose.page.drawing.drawing2d/graphicspath/clone/)() | Creates an exact copy of this path. |
| [CloseAllFigures](../../aspose.page.drawing.drawing2d/graphicspath/closeallfigures/)() | Closes all open figures in this path and starts a new figure. It closes each open figure by connecting a line from its endpoint to its starting point. |
| [CloseFigure](../../aspose.page.drawing.drawing2d/graphicspath/closefigure/)() | Closes the current figure and starts a new figure. If the current figure contains a sequence of connected lines and curves, the method closes the loop by connecting a line from the endpoint to the starting point. |
| [Dispose](../../aspose.page.drawing.drawing2d/graphicspath/dispose/)() | Releases all resources used by this `GraphicsPath`. |
| [Flatten](../../aspose.page.drawing.drawing2d/graphicspath/flatten/#flatten)() | Converts each curve in this path into a sequence of connected line segments. |
| [Flatten](../../aspose.page.drawing.drawing2d/graphicspath/flatten/#flatten_1)(Matrix) | Applies the specified transform and then converts each curve in this `GraphicsPath` into a sequence of connected line segments. |
| [Flatten](../../aspose.page.drawing.drawing2d/graphicspath/flatten/#flatten_2)(Matrix, float) | Converts each curve in this `GraphicsPath` into a sequence of connected line segments. |
| [GetBounds](../../aspose.page.drawing.drawing2d/graphicspath/getbounds/#getbounds)() | Returns a rectangle that bounds this `GraphicsPath`. |
| [GetBounds](../../aspose.page.drawing.drawing2d/graphicspath/getbounds/#getbounds_1)(Matrix) | Returns a rectangle that bounds this `GraphicsPath` when this path is transformed by the specified [`Matrix`](../matrix/). |
| [GetBounds](../../aspose.page.drawing.drawing2d/graphicspath/getbounds/#getbounds_2)(Matrix, Pen) | Returns a rectangle that bounds this `GraphicsPath` when the current path is transformed by the specified [`Matrix`](../matrix/) and drawn with the specified [`Pen`](../../aspose.page.drawing/pen/). |
| [GetLastPoint](../../aspose.page.drawing.drawing2d/graphicspath/getlastpoint/)() | Gets the last point in the [`PathPoints`](./pathpoints/) array of this `GraphicsPath`. |
| [IsOutlineVisible](../../aspose.page.drawing.drawing2d/graphicspath/isoutlinevisible/#isoutlinevisible)(PointF, Pen) | Indicates whether the specified point is contained within (under) the outline of this `GraphicsPath` when drawn with the specified [`Pen`](../../aspose.page.drawing/pen/). |
| [IsOutlineVisible](../../aspose.page.drawing.drawing2d/graphicspath/isoutlinevisible/#isoutlinevisible_1)(float, float, Pen) | Indicates whether the specified point is contained within (under) the outline of this `GraphicsPath` when drawn with the specified [`Pen`](../../aspose.page.drawing/pen/). |
| [IsVisible](../../aspose.page.drawing.drawing2d/graphicspath/isvisible/#isvisible)(PointF) | Indicates whether the specified point is contained within this `GraphicsPath`. |
| [IsVisible](../../aspose.page.drawing.drawing2d/graphicspath/isvisible/#isvisible_1)(float, float) | Indicates whether the specified point is contained within this `GraphicsPath`. |
| [Reset](../../aspose.page.drawing.drawing2d/graphicspath/reset/)() | Empties the [`PathPoints`](./pathpoints/) and [`PathTypes`](./pathtypes/) arrays and sets the [`FillMode`](../fillmode/) to Alternate. |
| [Reverse](../../aspose.page.drawing.drawing2d/graphicspath/reverse/)() | Reverses the order of points in the [`PathPoints`](./pathpoints/) array of this `GraphicsPath`. |
| [SetMarkers](../../aspose.page.drawing.drawing2d/graphicspath/setmarkers/)() | Sets a marker on this `GraphicsPath`. |
| [StartFigure](../../aspose.page.drawing.drawing2d/graphicspath/startfigure/)() | Starts a new figure without closing the current figure. All subsequent points added to the path are added to this new figure. |
| [Transform](../../aspose.page.drawing.drawing2d/graphicspath/transform/)(Matrix) | Applies a transform matrix to this `GraphicsPath`. |
| [Warp](../../aspose.page.drawing.drawing2d/graphicspath/warp/#warp)(PointF[], RectangleF) | Applies a warp transform, defined by a rectangle and a parallelogram, to this `GraphicsPath`. |
| [Warp](../../aspose.page.drawing.drawing2d/graphicspath/warp/#warp_1)(PointF[], RectangleF, Matrix) | Applies a warp transform, defined by a rectangle and a parallelogram, to this `GraphicsPath`. |
| [Warp](../../aspose.page.drawing.drawing2d/graphicspath/warp/#warp_2)(PointF[], RectangleF, Matrix, WarpMode) | Applies a warp transform, defined by a rectangle and a parallelogram, to this `GraphicsPath`. |
| [Warp](../../aspose.page.drawing.drawing2d/graphicspath/warp/#warp_3)(PointF[], RectangleF, Matrix, WarpMode, float) | Applies a warp transform, defined by a rectangle and a parallelogram, to this `GraphicsPath`. |
| [Widen](../../aspose.page.drawing.drawing2d/graphicspath/widen/#widen)(Pen) | Adds an additional outline to the path. |
| [Widen](../../aspose.page.drawing.drawing2d/graphicspath/widen/#widen_1)(Pen, Matrix) | Adds an additional outline to the `GraphicsPath`. |
| [Widen](../../aspose.page.drawing.drawing2d/graphicspath/widen/#widen_2)(Pen, Matrix, float) | Replaces this `GraphicsPath` with curves that enclose the area that is filled when this path is drawn by the specified pen. |

### See Also

* namespace [Aspose.Page.Drawing.Drawing2D](../../aspose.page.drawing.drawing2d/)
* assembly [Aspose.Page](../../)


