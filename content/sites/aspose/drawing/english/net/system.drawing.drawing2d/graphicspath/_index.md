---
title: GraphicsPath
second_title: Aspose.Drawing for .NET API Reference
description: 
type: docs
weight: 250
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
| [GraphicsPath](graphicspath)() | Initializes a new instance of the GraphicsPath class with a FillMode value of Alternate. |
| [GraphicsPath](graphicspath)(FillMode) | Initializes a new instance of the [`GraphicsPath`](../graphicspath) class with the specified FillMode enumeration. |
| [GraphicsPath](graphicspath)(PointF[], byte[]) | Initializes a new instance of the [`GraphicsPath`](../graphicspath) class with the specified [`PathPointType`](../pathpointtype) and PointF arrays. |
| [GraphicsPath](graphicspath)(Point[], byte[]) | Initializes a new instance of the [`GraphicsPath`](../graphicspath) class with the specified [`PathPointType`](../pathpointtype) and Point arrays. |
| [GraphicsPath](graphicspath)(PointF[], byte[], FillMode) | Initializes a new instance of the [`GraphicsPath`](../graphicspath) class with the specified PathPointType and PointF arrays and with the specified FillMode enumeration element.. |
| [GraphicsPath](graphicspath)(Point[], byte[], FillMode) | Initializes a new instance of the [`GraphicsPath`](../graphicspath) class with the specified PathPointType and Point arrays and with the specified FillMode enumeration element.. |

## Properties

| Name | Description |
| --- | --- |
| [FillMode](fillmode) { get; set; } | Gets or sets a FillMode enumeration that determines how the interiors of shapes in this GraphicsPath are filled. |
| [PathData](pathdata) { get; } | Gets a PathData that encapsulates arrays of points and types for this GraphicsPath |
| [PathPoints](pathpoints) { get; } | Gets the points in the path. |
| [PathTypes](pathtypes) { get; } | Gets the types of the corresponding points in the PathPoints array. |
| [PointCount](pointcount) { get; } | Gets the number of elements in the PathPoints or the PathTypes array. |

## Methods

| Name | Description |
| --- | --- |
| [AddArc](addarc)(RectangleF, float, float) | Appends an elliptical arc to the current figure. |
| [AddArc](addarc)(float, float, float, float, float, float) | Appends an elliptical arc to the current figure. |
| [AddBezier](addbezier)(PointF, PointF, PointF, PointF) | Adds a cubic Bézier curve to the current figure. |
| [AddBezier](addbezier)(float, float, float, float, float, float, float, float) | Adds a cubic Bézier curve to the current figure. |
| [AddBeziers](addbeziers)(PointF[]) | Adds a sequence of connected cubic Bézier curves to the current figure. |
| [AddBeziers](addbeziers)(Point[]) | Adds a sequence of connected cubic Bézier curves to the current figure. |
| [AddClosedCurve](addclosedcurve)(PointF[]) | Adds a closed curve to this path. A cardinal spline curve is used because the curve travels through each of the points in the array. |
| [AddClosedCurve](addclosedcurve)(PointF[], float) | Adds a closed curve to this path. A cardinal spline curve is used because the curve travels through each of the points in the array. |
| [AddCurve](addcurve)(PointF[]) | Adds a spline curve to the current figure. A cardinal spline curve is used because the curve travels through each of the points in the array. |
| [AddCurve](addcurve)(Point[]) | Adds a spline curve to the current figure. A cardinal spline curve is used because the curve travels through each of the points in the array. |
| [AddCurve](addcurve)(PointF[], float) | Adds a spline curve to the current figure. |
| [AddCurve](addcurve)(PointF[], int, int, float) | Adds a spline curve to the current figure. |
| [AddEllipse](addellipse)(RectangleF) | Adds an ellipse to the current path. |
| [AddEllipse](addellipse)(float, float, float, float) | Adds an ellipse to the current path. |
| [AddLine](addline)(PointF, PointF) | Appends a line segment to this GraphicsPath. |
| [AddLine](addline)(float, float, float, float) | Appends a line segment to this GraphicsPath. |
| [AddLines](addlines)(PointF[]) | Appends a series of connected line segments to the end of this GraphicsPath. |
| [AddLines](addlines)(Point[]) | Appends a series of connected line segments to the end of this GraphicsPath. |
| [AddPath](addpath)(GraphicsPath, bool) | Appends the specified GraphicsPath to this path. |
| [AddPie](addpie)(Rectangle, float, float) | Adds the outline of a pie shape to this path. |
| [AddPie](addpie)(float, float, float, float, float, float) | Adds the outline of a pie shape to this path. |
| [AddPolygon](addpolygon)(PointF[]) | Adds a polygon to this path. |
| [AddPolygon](addpolygon)(Point[]) | Adds a polygon to this path. |
| [AddRectangle](addrectangle)(Rectangle) | Adds a rectangle to this path. |
| [AddRectangle](addrectangle)(RectangleF) | Adds a rectangle to this path. |
| [AddRectangles](addrectangles)(RectangleF[]) | Adds a series of rectangles to this path. |
| [AddRectangles](addrectangles)(Rectangle[]) | Adds a series of rectangles to this path. |
| [AddString](addstring)(string, FontFamily, int, float, Point, StringFormat) | Adds a text string to this path. |
| [AddString](addstring)(string, FontFamily, int, float, PointF, StringFormat) | Adds a text string to this path. |
| [AddString](addstring)(string, FontFamily, int, float, Rectangle, StringFormat) | Adds a text string to this path. |
| [AddString](addstring)(string, FontFamily, int, float, RectangleF, StringFormat) | Adds a text string to this path. |
| [Clone](clone)() | Make a copy of the current path object. |
| [CloseAllFigures](closeallfigures)() | Closes all open figures in this path and starts a new figure. It closes each open figure by connecting a line from its endpoint to its starting point. |
| [CloseFigure](closefigure)() | Closes the current figure and starts a new figure. If the current figure contains a sequence of connected lines and curves, the method closes the loop by connecting a line from the endpoint to the starting point. |
| [Dispose](dispose)() | Releases all resources used by this GraphicsPath. |
| [Flatten](flatten)() | Converts each curve in this path into a sequence of connected line segments. |
| [GetBounds](getbounds)() | Returns a rectangle that bounds this GraphicsPath. |
| [GetBounds](getbounds)(Matrix) | Returns a rectangle that bounds this GraphicsPath when this path is transformed by the specified Matrix. |
| [GetBounds](getbounds)(Matrix, Pen) | Returns a rectangle that bounds this GraphicsPath when the current path is transformed by the specified Matrix and drawn with the specified Pen. |
| [GetLastPoint](getlastpoint)() | Gets the last point in the PathPoints array of this [`GraphicsPath`](../graphicspath). |
| [IsOutlineVisible](isoutlinevisible)(PointF, Pen) | Indicates whether the specified point is contained within (under) the outline of this GraphicsPath when drawn with the specified Pen. |
| [IsVisible](isvisible)(PointF) | Indicates whether the specified point is contained within this GraphicsPath. |
| [Reset](reset)() | Empties the [`PathPoints`](./pathpoints) and [`PathTypes`](./pathtypes) arrays and sets the [`FillMode`](../fillmode) to Alternate. |
| [Reverse](reverse)() | Reverses the order of points in the [`PathPoints`](./pathpoints) array of this [`GraphicsPath`](../graphicspath). |
| [SetMarkers](setmarkers)() | Sets a marker on this [`GraphicsPath`](../graphicspath). |
| [StartFigure](startfigure)() | Starts a new figure without closing the current figure. All subsequent points added to the path are added to this new figure. |
| [Transform](transform)(Matrix) | Applies a transform matrix to this GraphicsPath. |
| [Warp](warp)(PointF[], RectangleF) | Applies a warp transform, defined by a rectangle and a parallelogram, to this [`GraphicsPath`](../graphicspath). |
| [Warp](warp)(PointF[], RectangleF, Matrix) | Applies a warp transform, defined by a rectangle and a parallelogram, to this [`GraphicsPath`](../graphicspath). |
| [Warp](warp)(PointF[], RectangleF, Matrix, WarpMode) | Applies a warp transform, defined by a rectangle and a parallelogram, to this [`GraphicsPath`](../graphicspath). |
| [Warp](warp)(PointF[], RectangleF, Matrix, WarpMode, float) | Applies a warp transform, defined by a rectangle and a parallelogram, to this [`GraphicsPath`](../graphicspath). |
| [Widen](widen)(Pen) | Adds an additional outline to the path. |
| [Widen](widen)(Pen, Matrix, float) | Replaces this GraphicsPath with curves that enclose the area that is filled when this path is drawn by the specified pen. |

### See Also

* namespace [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* assembly [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
