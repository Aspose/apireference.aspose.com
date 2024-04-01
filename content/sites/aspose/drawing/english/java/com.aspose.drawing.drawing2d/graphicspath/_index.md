---
title: GraphicsPath
second_title: Aspose.Drawing for Java API Reference
description: Represents a series of connected lines and curves.
type: docs
weight: 23
url: /java/com.aspose.drawing.drawing2d/graphicspath/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.ms.System.IDisposable
```
public class GraphicsPath implements System.IDisposable
```

Represents a series of connected lines and curves.
## Constructors

| Constructor | Description |
| --- | --- |
| [GraphicsPath()](#GraphicsPath--) | Initializes a new instance of the GraphicsPath class with a FillMode value of Alternate. |
| [GraphicsPath(int fillMode)](#GraphicsPath-int-) | Initializes a new instance of the [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) class with the specified `FillMode`([.getFillMode](../../null/\#getFillMode)/[.setFillMode(int)](../../null/\#setFillMode-int-)) enumeration. |
| [GraphicsPath(PointF[] pts, byte[] types)](#GraphicsPath-com.aspose.drawing.PointF---byte---) | Initializes a new instance of the [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) class with the specified [PathPointType](../../com.aspose.drawing.drawing2d/pathpointtype) and [PointF](../../com.aspose.drawing/pointf) arrays. |
| [GraphicsPath(Point[] pts, byte[] types)](#GraphicsPath-com.aspose.drawing.Point---byte---) | Initializes a new instance of the [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) class with the specified [PathPointType](../../com.aspose.drawing.drawing2d/pathpointtype) and [Point](../../com.aspose.drawing/point) arrays. |
| [GraphicsPath(PointF[] pts, byte[] types, int fillMode)](#GraphicsPath-com.aspose.drawing.PointF---byte---int-) | Initializes a new instance of the [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) class with the specified [PathPointType](../../com.aspose.drawing.drawing2d/pathpointtype) and [PointF](../../com.aspose.drawing/pointf) arrays and with the specified `FillMode`([.getFillMode](../../null/\#getFillMode)/[.setFillMode(int)](../../null/\#setFillMode-int-)) enumeration element.. |
| [GraphicsPath(Point[] pts, byte[] types, int fillMode)](#GraphicsPath-com.aspose.drawing.Point---byte---int-) | Initializes a new instance of the [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) class with the specified [PathPointType](../../com.aspose.drawing.drawing2d/pathpointtype) and [Point](../../com.aspose.drawing/point) arrays and with the specified `FillMode`([.getFillMode](../../null/\#getFillMode)/[.setFillMode(int)](../../null/\#setFillMode-int-)) enumeration element.. |
## Methods

| Method | Description |
| --- | --- |
| [getFillMode()](#getFillMode--) | Gets a FillMode enumeration that determines how the interiors of shapes in this GraphicsPath are filled. |
| [setFillMode(int value)](#setFillMode-int-) | Gets or sets a FillMode enumeration that determines how the interiors of shapes in this GraphicsPath are filled. |
| [getPathData()](#getPathData--) | Gets a [PathData](../../com.aspose.drawing.drawing2d/pathdata) that encapsulates arrays of points and types for this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) |
| [getPointCount()](#getPointCount--) | Gets the number of elements in the `PathPoints` or the `PathTypes` array. |
| [getPathTypes()](#getPathTypes--) | Gets the types of the corresponding points in the `PathPoints` array. |
| [getPathPoints()](#getPathPoints--) | Gets the points in the path. |
| [dispose()](#dispose--) | Releases all resources used by this GraphicsPath. |
| [deepClone()](#deepClone--) | Make a copy of the current path object. |
| [addArc(RectangleF rect, float startAngle, float sweepAngle)](#addArc-com.aspose.drawing.RectangleF-float-float-) | Appends an elliptical arc to the current figure. |
| [addArc(float x, float y, float width, float height, float startAngle, float sweepAngle)](#addArc-float-float-float-float-float-float-) | Appends an elliptical arc to the current figure. |
| [addBezier(PointF pt1, PointF pt2, PointF pt3, PointF pt4)](#addBezier-com.aspose.drawing.PointF-com.aspose.drawing.PointF-com.aspose.drawing.PointF-com.aspose.drawing.PointF-) | Adds a cubic Bézier curve to the current figure. |
| [addBezier(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4)](#addBezier-float-float-float-float-float-float-float-float-) | Adds a cubic Bézier curve to the current figure. |
| [addBeziers(Point[] points)](#addBeziers-com.aspose.drawing.Point---) | Adds a sequence of connected cubic Bézier curves to the current figure. |
| [addBeziers(PointF[] points)](#addBeziers-com.aspose.drawing.PointF---) | Adds a sequence of connected cubic Bézier curves to the current figure. |
| [addClosedCurve(PointF[] points)](#addClosedCurve-com.aspose.drawing.PointF---) | Adds a closed curve to this path. |
| [addClosedCurve(PointF[] points, float tension)](#addClosedCurve-com.aspose.drawing.PointF---float-) | Adds a closed curve to this path. |
| [addCurve(Point[] points)](#addCurve-com.aspose.drawing.Point---) | Adds a spline curve to the current figure. |
| [addCurve(PointF[] points)](#addCurve-com.aspose.drawing.PointF---) | Adds a spline curve to the current figure. |
| [addCurve(PointF[] points, float tension)](#addCurve-com.aspose.drawing.PointF---float-) | Adds a spline curve to the current figure. |
| [addCurve(PointF[] points, int offset, int numberOfSegments, float tension)](#addCurve-com.aspose.drawing.PointF---int-int-float-) | Adds a spline curve to the current figure. |
| [addEllipse(RectangleF rect)](#addEllipse-com.aspose.drawing.RectangleF-) | Adds an ellipse to the current path. |
| [addEllipse(float x, float y, float width, float height)](#addEllipse-float-float-float-float-) | Adds an ellipse to the current path. |
| [addLine(PointF pt1, PointF pt2)](#addLine-com.aspose.drawing.PointF-com.aspose.drawing.PointF-) | Appends a line segment to this GraphicsPath. |
| [addLine(float x1, float y1, float x2, float y2)](#addLine-float-float-float-float-) | Appends a line segment to this GraphicsPath. |
| [addLines(PointF[] points)](#addLines-com.aspose.drawing.PointF---) | Appends a series of connected line segments to the end of this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [addLines(Point[] points)](#addLines-com.aspose.drawing.Point---) | Appends a series of connected line segments to the end of this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [addPath(GraphicsPath addingPath, boolean connect)](#addPath-com.aspose.drawing.drawing2d.GraphicsPath-boolean-) | Appends the specified GraphicsPath to this path. |
| [addPie(Rectangle rect, float startAngle, float sweepAngle)](#addPie-com.aspose.drawing.Rectangle-float-float-) | Adds the outline of a pie shape to this path. |
| [addPie(float x, float y, float width, float height, float startAngle, float sweepAngle)](#addPie-float-float-float-float-float-float-) | Adds the outline of a pie shape to this path. |
| [addPolygon(PointF[] points)](#addPolygon-com.aspose.drawing.PointF---) | Adds a polygon to this path. |
| [addPolygon(Point[] points)](#addPolygon-com.aspose.drawing.Point---) | Adds a polygon to this path. |
| [addRectangle(Rectangle rect)](#addRectangle-com.aspose.drawing.Rectangle-) | Adds a rectangle to this path. |
| [addRectangle(RectangleF rect)](#addRectangle-com.aspose.drawing.RectangleF-) | Adds a rectangle to this path. |
| [addRectangles(RectangleF[] rects)](#addRectangles-com.aspose.drawing.RectangleF---) | Adds a series of rectangles to this path. |
| [addRectangles(Rectangle[] rects)](#addRectangles-com.aspose.drawing.Rectangle---) | Adds a series of rectangles to this path. |
| [addString(String s, FontFamily family, int style, float emSize, Point origin, StringFormat format)](#addString-java.lang.String-com.aspose.drawing.FontFamily-int-float-com.aspose.drawing.Point-com.aspose.drawing.StringFormat-) | Adds a text string to this path. |
| [addString(String s, FontFamily family, int style, float emSize, PointF origin, StringFormat format)](#addString-java.lang.String-com.aspose.drawing.FontFamily-int-float-com.aspose.drawing.PointF-com.aspose.drawing.StringFormat-) | Adds a text string to this path. |
| [addString(String s, FontFamily family, int style, float emSize, Rectangle layoutRect, StringFormat format)](#addString-java.lang.String-com.aspose.drawing.FontFamily-int-float-com.aspose.drawing.Rectangle-com.aspose.drawing.StringFormat-) | Adds a text string to this path. |
| [addString(String s, FontFamily family, int style, float emSize, RectangleF layoutRect, StringFormat format)](#addString-java.lang.String-com.aspose.drawing.FontFamily-int-float-com.aspose.drawing.RectangleF-com.aspose.drawing.StringFormat-) | Adds a text string to this path. |
| [startFigure()](#startFigure--) | Starts a new figure without closing the current figure. |
| [closeFigure()](#closeFigure--) | Closes the current figure and starts a new figure. |
| [transform(Matrix matrix)](#transform-com.aspose.drawing.drawing2d.Matrix-) | Applies a transform matrix to this GraphicsPath. |
| [getBounds()](#getBounds--) | Returns a rectangle that bounds this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [getBounds(Matrix matrix)](#getBounds-com.aspose.drawing.drawing2d.Matrix-) | Returns a rectangle that bounds this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) when this path is transformed by the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix). |
| [getBounds(Matrix matrix, Pen pen)](#getBounds-com.aspose.drawing.drawing2d.Matrix-com.aspose.drawing.Pen-) | Returns a rectangle that bounds this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) when the current path is transformed by the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix) and drawn with the specified [Pen](../../com.aspose.drawing/pen). |
| [getLastPoint()](#getLastPoint--) | Gets the last point in the PathPoints array of this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [flatten()](#flatten--) | Converts each curve in this path into a sequence of connected line segments. |
| [flatten(Matrix matrix)](#flatten-com.aspose.drawing.drawing2d.Matrix-) | Applies the specified transform and then converts each curve in this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [flatten(Matrix matrix, float flatness)](#flatten-com.aspose.drawing.drawing2d.Matrix-float-) | Converts each curve in this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) into a sequence of connected line segments. |
| [widen(Pen pen)](#widen-com.aspose.drawing.Pen-) | Adds an additional outline to the path. |
| [widen(Pen pen, Matrix matrix)](#widen-com.aspose.drawing.Pen-com.aspose.drawing.drawing2d.Matrix-) | Adds an additional outline to the [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [widen(Pen pen, Matrix matrix, float flatness)](#widen-com.aspose.drawing.Pen-com.aspose.drawing.drawing2d.Matrix-float-) | Replaces this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) with curves that enclose the area that is filled when this path is drawn by the specified pen. |
| [closeAllFigures()](#closeAllFigures--) | Closes all open figures in this path and starts a new figure. |
| [reset()](#reset--) | Empties the `Drawing2D.GraphicsPath.PathPoints`([.getPathPoints](../../null/\#getPathPoints)) and `Drawing2D.GraphicsPath.PathTypes`([.getPathTypes](../../null/\#getPathTypes)) arrays and sets the [FillMode](../../com.aspose.drawing.drawing2d/fillmode) to `System.Drawing.Drawing2D.FillMode.Alternate`. |
| [reverse()](#reverse--) | Reverses the order of points in the `Drawing2D.GraphicsPath.PathPoints`([.getPathPoints](../../null/\#getPathPoints)) array of this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [setMarkers()](#setMarkers--) | Sets a marker on this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [isOutlineVisible(PointF point, Pen pen)](#isOutlineVisible-com.aspose.drawing.PointF-com.aspose.drawing.Pen-) | Indicates whether the specified point is contained within (under) the outline of this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) when drawn with the specified [Pen](../../com.aspose.drawing/pen). |
| [isVisible(float x, float y)](#isVisible-float-float-) | Indicates whether the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [isVisible(float x, float y, Graphics graphics)](#isVisible-float-float-com.aspose.drawing.Graphics-) | Indicates whether the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath), using the specified [Graphics](../../com.aspose.drawing/graphics). |
| [isVisible(int x, int y)](#isVisible-int-int-) | Indicates whether the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [isVisible(int x, int y, Graphics graphics)](#isVisible-int-int-com.aspose.drawing.Graphics-) | Indicates whether the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath), using the specified [Graphics](../../com.aspose.drawing/graphics). |
| [isVisible(Point point)](#isVisible-com.aspose.drawing.Point-) | Indicates whether the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [isVisible(Point point, Graphics graphics)](#isVisible-com.aspose.drawing.Point-com.aspose.drawing.Graphics-) | Indicates whether the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath), using the specified [Graphics](../../com.aspose.drawing/graphics). |
| [isVisible(PointF point)](#isVisible-com.aspose.drawing.PointF-) | Indicates whether the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [isVisible(PointF point, Graphics graphics)](#isVisible-com.aspose.drawing.PointF-com.aspose.drawing.Graphics-) | Indicates whether the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath), using the specified [Graphics](../../com.aspose.drawing/graphics). |
| [warp(PointF[] destPoints, RectangleF srcRect)](#warp-com.aspose.drawing.PointF---com.aspose.drawing.RectangleF-) | Applies a warp transform, defined by a rectangle and a parallelogram, to this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix)](#warp-com.aspose.drawing.PointF---com.aspose.drawing.RectangleF-com.aspose.drawing.drawing2d.Matrix-) | Applies a warp transform, defined by a rectangle and a parallelogram, to this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, int warpMode)](#warp-com.aspose.drawing.PointF---com.aspose.drawing.RectangleF-com.aspose.drawing.drawing2d.Matrix-int-) | Applies a warp transform, defined by a rectangle and a parallelogram, to this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, int warpMode, float flatness)](#warp-com.aspose.drawing.PointF---com.aspose.drawing.RectangleF-com.aspose.drawing.drawing2d.Matrix-int-float-) | Applies a warp transform, defined by a rectangle and a parallelogram, to this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [getFigures()](#getFigures--) | Gets the path figures. |
### GraphicsPath() {#GraphicsPath--}
```
public GraphicsPath()
```


Initializes a new instance of the GraphicsPath class with a FillMode value of Alternate.

### GraphicsPath(int fillMode) {#GraphicsPath-int-}
```
public GraphicsPath(int fillMode)
```


Initializes a new instance of the [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) class with the specified `FillMode`([.getFillMode](../../null/\#getFillMode)/[.setFillMode(int)](../../null/\#setFillMode-int-)) enumeration.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fillMode | int | The `FillMode`([.getFillMode](../../null/\#getFillMode)/[.setFillMode(int)](../../null/\#setFillMode-int-)) enumeration that determines how the interior of this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) is filled. |

### GraphicsPath(PointF[] pts, byte[] types) {#GraphicsPath-com.aspose.drawing.PointF---byte---}
```
public GraphicsPath(PointF[] pts, byte[] types)
```


Initializes a new instance of the [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) class with the specified [PathPointType](../../com.aspose.drawing.drawing2d/pathpointtype) and [PointF](../../com.aspose.drawing/pointf) arrays.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pts | [PointF\[\]](../../com.aspose.drawing/pointf) | An array of [PointF](../../com.aspose.drawing/pointf) structures that defines the coordinates of the points that make up this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| types | byte[] | An array of [PathPointType](../../com.aspose.drawing.drawing2d/pathpointtype) enumeration elements that specifies the type of each corresponding point in the `pts` array.

--------------------

This method actually does nothing. It's just for compatibility with System.Drawing API. |

### GraphicsPath(Point[] pts, byte[] types) {#GraphicsPath-com.aspose.drawing.Point---byte---}
```
public GraphicsPath(Point[] pts, byte[] types)
```


Initializes a new instance of the [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) class with the specified [PathPointType](../../com.aspose.drawing.drawing2d/pathpointtype) and [Point](../../com.aspose.drawing/point) arrays.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pts | [Point\[\]](../../com.aspose.drawing/point) | An array of [Point](../../com.aspose.drawing/point) structures that defines the coordinates of the points that make up this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| types | byte[] | An array of [PathPointType](../../com.aspose.drawing.drawing2d/pathpointtype) enumeration elements that specifies the type of each corresponding point in the `pts` array.

--------------------

This method actually does nothing. It's just for compatibility with System.Drawing API. |

### GraphicsPath(PointF[] pts, byte[] types, int fillMode) {#GraphicsPath-com.aspose.drawing.PointF---byte---int-}
```
public GraphicsPath(PointF[] pts, byte[] types, int fillMode)
```


Initializes a new instance of the [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) class with the specified [PathPointType](../../com.aspose.drawing.drawing2d/pathpointtype) and [PointF](../../com.aspose.drawing/pointf) arrays and with the specified `FillMode`([.getFillMode](../../null/\#getFillMode)/[.setFillMode(int)](../../null/\#setFillMode-int-)) enumeration element..

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pts | [PointF\[\]](../../com.aspose.drawing/pointf) | An array of [PointF](../../com.aspose.drawing/pointf) structures that defines the coordinates of the points that make up this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| types | byte[] | An array of [PathPointType](../../com.aspose.drawing.drawing2d/pathpointtype) enumeration elements that specifies the type of each corresponding point in the pts array. |
| fillMode | int | A `FillMode`([.getFillMode](../../null/\#getFillMode)/[.setFillMode(int)](../../null/\#setFillMode-int-)) enumeration that specifies how the interiors of shapes in this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) are filled. |

### GraphicsPath(Point[] pts, byte[] types, int fillMode) {#GraphicsPath-com.aspose.drawing.Point---byte---int-}
```
public GraphicsPath(Point[] pts, byte[] types, int fillMode)
```


Initializes a new instance of the [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) class with the specified [PathPointType](../../com.aspose.drawing.drawing2d/pathpointtype) and [Point](../../com.aspose.drawing/point) arrays and with the specified `FillMode`([.getFillMode](../../null/\#getFillMode)/[.setFillMode(int)](../../null/\#setFillMode-int-)) enumeration element..

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pts | [Point\[\]](../../com.aspose.drawing/point) | An array of [Point](../../com.aspose.drawing/point) structures that defines the coordinates of the points that make up this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| types | byte[] | An array of [PathPointType](../../com.aspose.drawing.drawing2d/pathpointtype) enumeration elements that specifies the type of each corresponding point in the pts array. |
| fillMode | int | A `FillMode`([.getFillMode](../../null/\#getFillMode)/[.setFillMode(int)](../../null/\#setFillMode-int-)) enumeration that specifies how the interiors of shapes in this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) are filled. |

### getFillMode() {#getFillMode--}
```
public final int getFillMode()
```


Gets a FillMode enumeration that determines how the interiors of shapes in this GraphicsPath are filled.

**Returns:**
int - a FillMode enumeration that determines how the interiors of shapes in this GraphicsPath are filled.
### setFillMode(int value) {#setFillMode-int-}
```
public final void setFillMode(int value)
```


Gets or sets a FillMode enumeration that determines how the interiors of shapes in this GraphicsPath are filled.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

### getPathData() {#getPathData--}
```
public final PathData getPathData()
```


Gets a [PathData](../../com.aspose.drawing.drawing2d/pathdata) that encapsulates arrays of points and types for this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath)

Value: A [PathData](../../com.aspose.drawing.drawing2d/pathdata) that encapsulates arrays for both the points and types for this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Returns:**
[PathData](../../com.aspose.drawing.drawing2d/pathdata)
### getPointCount() {#getPointCount--}
```
public final int getPointCount()
```


Gets the number of elements in the `PathPoints` or the `PathTypes` array.

**Returns:**
int - An integer that specifies the number of elements in the `PathPoints` or the `PathTypes` array.
### getPathTypes() {#getPathTypes--}
```
public final byte[] getPathTypes()
```


Gets the types of the corresponding points in the `PathPoints` array.

**Returns:**
byte[]
### getPathPoints() {#getPathPoints--}
```
public final PointF[] getPathPoints()
```


Gets the points in the path.

**Returns:**
com.aspose.drawing.PointF[] - An array of [PointF](../../com.aspose.drawing/pointf) objects that represent the path.
### dispose() {#dispose--}
```
public final void dispose()
```


Releases all resources used by this GraphicsPath.

--------------------

This method actually does nothing. It's just for compatibility with System.Drawing API.

### deepClone() {#deepClone--}
```
public final Object deepClone()
```


Make a copy of the current path object.

**Returns:**
java.lang.Object
### addArc(RectangleF rect, float startAngle, float sweepAngle) {#addArc-com.aspose.drawing.RectangleF-float-float-}
```
public final void addArc(RectangleF rect, float startAngle, float sweepAngle)
```


Appends an elliptical arc to the current figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | A RectangleF that represents the rectangular bounds of the ellipse from which the arc is taken. |
| startAngle | float | The starting angle of the arc, measured in degrees clockwise from the x-axis. |
| sweepAngle | float | The angle between startAngle and the end of the arc. |

### addArc(float x, float y, float width, float height, float startAngle, float sweepAngle) {#addArc-float-float-float-float-float-float-}
```
public final void addArc(float x, float y, float width, float height, float startAngle, float sweepAngle)
```


Appends an elliptical arc to the current figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | The x coordinate. |
| y | float | The y coordinate. |
| width | float | The width. |
| height | float | The height. |
| startAngle | float | The start angle. |
| sweepAngle | float | The sweep angle. |

### addBezier(PointF pt1, PointF pt2, PointF pt3, PointF pt4) {#addBezier-com.aspose.drawing.PointF-com.aspose.drawing.PointF-com.aspose.drawing.PointF-com.aspose.drawing.PointF-}
```
public final void addBezier(PointF pt1, PointF pt2, PointF pt3, PointF pt4)
```


Adds a cubic Bézier curve to the current figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt1 | [PointF](../../com.aspose.drawing/pointf) | A PointF that represents the starting point of the curve. |
| pt2 | [PointF](../../com.aspose.drawing/pointf) | A PointF that represents the first control point for the curve. |
| pt3 | [PointF](../../com.aspose.drawing/pointf) | A PointF that represents the second control point for the curve. |
| pt4 | [PointF](../../com.aspose.drawing/pointf) | A PointF that represents the endpoint of the curve. |

### addBezier(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {#addBezier-float-float-float-float-float-float-float-float-}
```
public final void addBezier(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4)
```


Adds a cubic Bézier curve to the current figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x1 | float | The x-coordinate of the starting point of the curve. |
| y1 | float | The y-coordinate of the starting point of the curve. |
| x2 | float | The x-coordinate of the first control point for the curve. |
| y2 | float | The y-coordinate of the first control point for the curve. |
| x3 | float | The x-coordinate of the second control point for the curve. |
| y3 | float | The y-coordinate of the second control point for the curve. |
| x4 | float | The x-coordinate of the endpoint of the curve. |
| y4 | float | The y-coordinate of the endpoint of the curve. |

### addBeziers(Point[] points) {#addBeziers-com.aspose.drawing.Point---}
```
public final void addBeziers(Point[] points)
```


Adds a sequence of connected cubic Bézier curves to the current figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | [Point\[\]](../../com.aspose.drawing/point) | The points. |

### addBeziers(PointF[] points) {#addBeziers-com.aspose.drawing.PointF---}
```
public final void addBeziers(PointF[] points)
```


Adds a sequence of connected cubic Bézier curves to the current figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | The points. |

### addClosedCurve(PointF[] points) {#addClosedCurve-com.aspose.drawing.PointF---}
```
public final void addClosedCurve(PointF[] points)
```


Adds a closed curve to this path. A cardinal spline curve is used because the curve travels through each of the points in the array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | An array of [PointF](../../com.aspose.drawing/pointf) structures that represents the points that define the curve. |

### addClosedCurve(PointF[] points, float tension) {#addClosedCurve-com.aspose.drawing.PointF---float-}
```
public final void addClosedCurve(PointF[] points, float tension)
```


Adds a closed curve to this path. A cardinal spline curve is used because the curve travels through each of the points in the array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | An array of PointF structures that represents the points that define the curve. |
| tension | float | A value between from 0 through 1 that specifies the amount that the curve bends between points, with 0 being the smallest curve (sharpest corner) and 1 being the smoothest curve. |

### addCurve(Point[] points) {#addCurve-com.aspose.drawing.Point---}
```
public final void addCurve(Point[] points)
```


Adds a spline curve to the current figure. A cardinal spline curve is used because the curve travels through each of the points in the array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | [Point\[\]](../../com.aspose.drawing/point) | An array of [Point](../../com.aspose.drawing/point) structures that represents the points that define the curve. |

### addCurve(PointF[] points) {#addCurve-com.aspose.drawing.PointF---}
```
public final void addCurve(PointF[] points)
```


Adds a spline curve to the current figure. A cardinal spline curve is used because the curve travels through each of the points in the array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | An array of [PointF](../../com.aspose.drawing/pointf) structures that represents the points that define the curve. |

### addCurve(PointF[] points, float tension) {#addCurve-com.aspose.drawing.PointF---float-}
```
public final void addCurve(PointF[] points, float tension)
```


Adds a spline curve to the current figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | An array of PointF structures that represents the points that define the curve. |
| tension | float | A value that specifies the amount that the curve bends between control points. Values greater than 1 produce unpredictable results. |

### addCurve(PointF[] points, int offset, int numberOfSegments, float tension) {#addCurve-com.aspose.drawing.PointF---int-int-float-}
```
public final void addCurve(PointF[] points, int offset, int numberOfSegments, float tension)
```


Adds a spline curve to the current figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | An array of [PointF](../../com.aspose.drawing/pointf) structures that represents the points that define the curve. |
| offset | int | The index of the element in the `points` array that is used as the first point in the curve. |
| numberOfSegments | int | The number of segments used to draw the curve. A segment can be thought of as a line connecting two points. |
| tension | float | A value that specifies the amount that the curve bends between control points. Values greater than 1 produce unpredictable results. |

### addEllipse(RectangleF rect) {#addEllipse-com.aspose.drawing.RectangleF-}
```
public final void addEllipse(RectangleF rect)
```


Adds an ellipse to the current path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | A RectangleF that represents the bounding rectangle that defines the ellipse. |

### addEllipse(float x, float y, float width, float height) {#addEllipse-float-float-float-float-}
```
public final void addEllipse(float x, float y, float width, float height)
```


Adds an ellipse to the current path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | The x-coordinate of the upper-left corner of the bounding rectangle that defines the ellipse. |
| y | float | The y-coordinate of the upper left corner of the bounding rectangle that defines the ellipse. |
| width | float | The width of the bounding rectangle that defines the ellipse. |
| height | float | The height of the bounding rectangle that defines the ellipse. |

### addLine(PointF pt1, PointF pt2) {#addLine-com.aspose.drawing.PointF-com.aspose.drawing.PointF-}
```
public final void addLine(PointF pt1, PointF pt2)
```


Appends a line segment to this GraphicsPath.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pt1 | [PointF](../../com.aspose.drawing/pointf) | A PointF that represents the starting point of the line. |
| pt2 | [PointF](../../com.aspose.drawing/pointf) | A PointF that represents the endpoint of the line. |

### addLine(float x1, float y1, float x2, float y2) {#addLine-float-float-float-float-}
```
public final void addLine(float x1, float y1, float x2, float y2)
```


Appends a line segment to this GraphicsPath.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x1 | float | The x-coordinate of the starting point of the line. |
| y1 | float | The y-coordinate of the starting point of the line. |
| x2 | float | The x-coordinate of the endpoint of the line. |
| y2 | float | The y-coordinate of the endpoint of the line. |

### addLines(PointF[] points) {#addLines-com.aspose.drawing.PointF---}
```
public final void addLines(PointF[] points)
```


Appends a series of connected line segments to the end of this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | An array of [PointF](../../com.aspose.drawing/pointf) structures that represents the points that define the line segments to add. |

### addLines(Point[] points) {#addLines-com.aspose.drawing.Point---}
```
public final void addLines(Point[] points)
```


Appends a series of connected line segments to the end of this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | [Point\[\]](../../com.aspose.drawing/point) | An array of [Point](../../com.aspose.drawing/point) structures that represents the points that define the line segments to add. |

### addPath(GraphicsPath addingPath, boolean connect) {#addPath-com.aspose.drawing.drawing2d.GraphicsPath-boolean-}
```
public final void addPath(GraphicsPath addingPath, boolean connect)
```


Appends the specified GraphicsPath to this path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| addingPath | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | The GraphicsPath to add. |
| connect | boolean | A Boolean value that specifies whether the first figure in the added path is part of the last figure in this path. A value of true specifies that (if possible) the first figure in the added path is part of the last figure in this path. A value of false specifies that the first figure in the added path is separate from the last figure in this path. |

### addPie(Rectangle rect, float startAngle, float sweepAngle) {#addPie-com.aspose.drawing.Rectangle-float-float-}
```
public final void addPie(Rectangle rect, float startAngle, float sweepAngle)
```


Adds the outline of a pie shape to this path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | A Rectangle that represents the bounding rectangle that defines the ellipse from which the pie is drawn. |
| startAngle | float | The starting angle for the pie section, measured in degrees clockwise from the x-axis. |
| sweepAngle | float | The angle between startAngle and the end of the pie section, measured in degrees clockwise from startAngle. |

### addPie(float x, float y, float width, float height, float startAngle, float sweepAngle) {#addPie-float-float-float-float-float-float-}
```
public final void addPie(float x, float y, float width, float height, float startAngle, float sweepAngle)
```


Adds the outline of a pie shape to this path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | The x-coordinate of the upper-left corner of the bounding rectangle that defines the ellipse from which the pie is drawn. |
| y | float | The y-coordinate of the upper-left corner of the bounding rectangle that defines the ellipse from which the pie is drawn. |
| width | float | The width of the bounding rectangle that defines the ellipse from which the pie is drawn. |
| height | float | The height of the bounding rectangle that defines the ellipse from which the pie is drawn. |
| startAngle | float | The starting angle for the pie section, measured in degrees clockwise from the x-axis. |
| sweepAngle | float | The angle between startAngle and the end of the pie section, measured in degrees clockwise from startAngle. |

### addPolygon(PointF[] points) {#addPolygon-com.aspose.drawing.PointF---}
```
public final void addPolygon(PointF[] points)
```


Adds a polygon to this path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | An array of PointF structures that defines the polygon to add. |

### addPolygon(Point[] points) {#addPolygon-com.aspose.drawing.Point---}
```
public final void addPolygon(Point[] points)
```


Adds a polygon to this path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | [Point\[\]](../../com.aspose.drawing/point) | An array of [Point](../../com.aspose.drawing/point) structures that defines the polygon to add. |

### addRectangle(Rectangle rect) {#addRectangle-com.aspose.drawing.Rectangle-}
```
public final void addRectangle(Rectangle rect)
```


Adds a rectangle to this path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | A [Rectangle](../../com.aspose.drawing/rectangle) that represents the rectangle to add. |

### addRectangle(RectangleF rect) {#addRectangle-com.aspose.drawing.RectangleF-}
```
public final void addRectangle(RectangleF rect)
```


Adds a rectangle to this path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | A [RectangleF](../../com.aspose.drawing/rectanglef) that represents the rectangle to add. |

### addRectangles(RectangleF[] rects) {#addRectangles-com.aspose.drawing.RectangleF---}
```
public final void addRectangles(RectangleF[] rects)
```


Adds a series of rectangles to this path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rects | [RectangleF\[\]](../../com.aspose.drawing/rectanglef) | An array of [RectangleF](../../com.aspose.drawing/rectanglef) structures that represents the rectangles to add. |

### addRectangles(Rectangle[] rects) {#addRectangles-com.aspose.drawing.Rectangle---}
```
public final void addRectangles(Rectangle[] rects)
```


Adds a series of rectangles to this path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rects | [Rectangle\[\]](../../com.aspose.drawing/rectangle) | An array of [Rectangle](../../com.aspose.drawing/rectangle) structures that represents the rectangles to add. |

### addString(String s, FontFamily family, int style, float emSize, Point origin, StringFormat format) {#addString-java.lang.String-com.aspose.drawing.FontFamily-int-float-com.aspose.drawing.Point-com.aspose.drawing.StringFormat-}
```
public final void addString(String s, FontFamily family, int style, float emSize, Point origin, StringFormat format)
```


Adds a text string to this path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | java.lang.String | The String to add. |
| family | [FontFamily](../../com.aspose.drawing/fontfamily) | A [FontFamily](../../com.aspose.drawing/fontfamily) that represents the name of the font with which the test is drawn. |
| style | int | A [FontStyle](../../com.aspose.drawing/fontstyle) enumeration that represents style information about the text (bold, italic, and so on). This must be cast as an integer (see the example code later in this section). |
| emSize | float | The height of the EM square box that bounds the character. |
| origin | [Point](../../com.aspose.drawing/point) | A [Point](../../com.aspose.drawing/point) that represents the point where the text starts. |
| format | [StringFormat](../../com.aspose.drawing/stringformat) | A [StringFormat](../../com.aspose.drawing/stringformat) that specifies text formatting information, such as line spacing and alignment. |

### addString(String s, FontFamily family, int style, float emSize, PointF origin, StringFormat format) {#addString-java.lang.String-com.aspose.drawing.FontFamily-int-float-com.aspose.drawing.PointF-com.aspose.drawing.StringFormat-}
```
public final void addString(String s, FontFamily family, int style, float emSize, PointF origin, StringFormat format)
```


Adds a text string to this path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | java.lang.String | The String to add. |
| family | [FontFamily](../../com.aspose.drawing/fontfamily) | A [FontFamily](../../com.aspose.drawing/fontfamily) that represents the name of the font with which the test is drawn. |
| style | int | A [FontStyle](../../com.aspose.drawing/fontstyle) enumeration that represents style information about the text (bold, italic, and so on). This must be cast as an integer (see the example code later in this section). |
| emSize | float | The height of the EM square box that bounds the character. |
| origin | [PointF](../../com.aspose.drawing/pointf) | A [PointF](../../com.aspose.drawing/pointf) that represents the point where the text starts. |
| format | [StringFormat](../../com.aspose.drawing/stringformat) | A [StringFormat](../../com.aspose.drawing/stringformat) that specifies text formatting information, such as line spacing and alignment. |

### addString(String s, FontFamily family, int style, float emSize, Rectangle layoutRect, StringFormat format) {#addString-java.lang.String-com.aspose.drawing.FontFamily-int-float-com.aspose.drawing.Rectangle-com.aspose.drawing.StringFormat-}
```
public final void addString(String s, FontFamily family, int style, float emSize, Rectangle layoutRect, StringFormat format)
```


Adds a text string to this path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | java.lang.String | The String to add. |
| family | [FontFamily](../../com.aspose.drawing/fontfamily) | A [FontFamily](../../com.aspose.drawing/fontfamily) that represents the name of the font with which the test is drawn. |
| style | int | A [FontStyle](../../com.aspose.drawing/fontstyle) enumeration that represents style information about the text (bold, italic, and so on). This must be cast as an integer (see the example code later in this section). |
| emSize | float | The height of the EM square box that bounds the character. |
| layoutRect | [Rectangle](../../com.aspose.drawing/rectangle) | A [Rectangle](../../com.aspose.drawing/rectangle) that represents the rectangle that bounds the text. |
| format | [StringFormat](../../com.aspose.drawing/stringformat) | A [StringFormat](../../com.aspose.drawing/stringformat) that specifies text formatting information, such as line spacing and alignment. |

### addString(String s, FontFamily family, int style, float emSize, RectangleF layoutRect, StringFormat format) {#addString-java.lang.String-com.aspose.drawing.FontFamily-int-float-com.aspose.drawing.RectangleF-com.aspose.drawing.StringFormat-}
```
public final void addString(String s, FontFamily family, int style, float emSize, RectangleF layoutRect, StringFormat format)
```


Adds a text string to this path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | java.lang.String | The String to add. |
| family | [FontFamily](../../com.aspose.drawing/fontfamily) | A [FontFamily](../../com.aspose.drawing/fontfamily) that represents the name of the font with which the test is drawn. |
| style | int | A [FontStyle](../../com.aspose.drawing/fontstyle) enumeration that represents style information about the text (bold, italic, and so on). This must be cast as an integer (see the example code later in this section). |
| emSize | float | The height of the EM square box that bounds the character. |
| layoutRect | [RectangleF](../../com.aspose.drawing/rectanglef) | A [RectangleF](../../com.aspose.drawing/rectanglef) that represents the rectangle that bounds the text. |
| format | [StringFormat](../../com.aspose.drawing/stringformat) | A [StringFormat](../../com.aspose.drawing/stringformat) that specifies text formatting information, such as line spacing and alignment. |

### startFigure() {#startFigure--}
```
public final void startFigure()
```


Starts a new figure without closing the current figure. All subsequent points added to the path are added to this new figure.

### closeFigure() {#closeFigure--}
```
public final void closeFigure()
```


Closes the current figure and starts a new figure. If the current figure contains a sequence of connected lines and curves, the method closes the loop by connecting a line from the endpoint to the starting point.

### transform(Matrix matrix) {#transform-com.aspose.drawing.drawing2d.Matrix-}
```
public final void transform(Matrix matrix)
```


Applies a transform matrix to this GraphicsPath.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | A Matrix that represents the transformation to apply. |

### getBounds() {#getBounds--}
```
public final RectangleF getBounds()
```


Returns a rectangle that bounds this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Returns:**
[RectangleF](../../com.aspose.drawing/rectanglef) - A [RectangleF](../../com.aspose.drawing/rectanglef) that represents a rectangle that bounds this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).
### getBounds(Matrix matrix) {#getBounds-com.aspose.drawing.drawing2d.Matrix-}
```
public final RectangleF getBounds(Matrix matrix)
```


Returns a rectangle that bounds this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) when this path is transformed by the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | The [Matrix](../../com.aspose.drawing.drawing2d/matrix) that specifies a transformation to be applied to this path before the bounding rectangle is calculated. This path is not permanently transformed; the transformation is used only during the process of calculating the bounding rectangle. |

**Returns:**
[RectangleF](../../com.aspose.drawing/rectanglef) - A [RectangleF](../../com.aspose.drawing/rectanglef) that represents a rectangle that bounds this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).
### getBounds(Matrix matrix, Pen pen) {#getBounds-com.aspose.drawing.drawing2d.Matrix-com.aspose.drawing.Pen-}
```
public final RectangleF getBounds(Matrix matrix, Pen pen)
```


Returns a rectangle that bounds this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) when the current path is transformed by the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix) and drawn with the specified [Pen](../../com.aspose.drawing/pen).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | The [Matrix](../../com.aspose.drawing.drawing2d/matrix) that specifies a transformation to be applied to this path before the bounding rectangle is calculated. This path is not permanently transformed; the transformation is used only during the process of calculating the bounding rectangle. |
| pen | [Pen](../../com.aspose.drawing/pen) | The [Pen](../../com.aspose.drawing/pen) with which to draw the [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |

**Returns:**
[RectangleF](../../com.aspose.drawing/rectanglef) - A [RectangleF](../../com.aspose.drawing/rectanglef) that represents a rectangle that bounds this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).
### getLastPoint() {#getLastPoint--}
```
public final PointF getLastPoint()
```


Gets the last point in the PathPoints array of this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Returns:**
[PointF](../../com.aspose.drawing/pointf) - The last point in the PathPoints array of this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).
### flatten() {#flatten--}
```
public final void flatten()
```


Converts each curve in this path into a sequence of connected line segments.

### flatten(Matrix matrix) {#flatten-com.aspose.drawing.drawing2d.Matrix-}
```
public final void flatten(Matrix matrix)
```


Applies the specified transform and then converts each curve in this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | A [Matrix](../../com.aspose.drawing.drawing2d/matrix) by which to transform this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) before flattening. |

### flatten(Matrix matrix, float flatness) {#flatten-com.aspose.drawing.drawing2d.Matrix-float-}
```
public final void flatten(Matrix matrix, float flatness)
```


Converts each curve in this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) into a sequence of connected line segments.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | A [Matrix](../../com.aspose.drawing.drawing2d/matrix) by which to transform this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) before flattening. |
| flatness | float | Specifies the maximum permitted error between the curve and its flattened approximation. A value of 0.25 is the default. Reducing the flatness value will increase the number of line segments in the approximation. |

### widen(Pen pen) {#widen-com.aspose.drawing.Pen-}
```
public final void widen(Pen pen)
```


Adds an additional outline to the path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | A [Pen](../../com.aspose.drawing/pen) that specifies the width between the original outline of the path and the new outline this method creates. |

### widen(Pen pen, Matrix matrix) {#widen-com.aspose.drawing.Pen-com.aspose.drawing.drawing2d.Matrix-}
```
public final void widen(Pen pen, Matrix matrix)
```


Adds an additional outline to the [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | A [Pen](../../com.aspose.drawing/pen) that specifies the width between the original outline of the path and the new outline this method creates. |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | A [Matrix](../../com.aspose.drawing.drawing2d/matrix) that specifies a transform to apply to the path before widening. |

### widen(Pen pen, Matrix matrix, float flatness) {#widen-com.aspose.drawing.Pen-com.aspose.drawing.drawing2d.Matrix-float-}
```
public final void widen(Pen pen, Matrix matrix, float flatness)
```


Replaces this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) with curves that enclose the area that is filled when this path is drawn by the specified pen.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | A [Pen](../../com.aspose.drawing/pen) that specifies the width between the original outline of the path and the new outline this method creates. |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | A [Matrix](../../com.aspose.drawing.drawing2d/matrix) that specifies a transform to apply to the path before widening. |
| flatness | float | A value that specifies the flatness for curves.

--------------------

MS System.Drawing implementation calls Flatten() inside Widen() or uses the same algorithm. Aspose.Drawing implementation uses Skia algorithm without replacement the curves to line segments. It ignores the `flatness` parameter. |

### closeAllFigures() {#closeAllFigures--}
```
public final void closeAllFigures()
```


Closes all open figures in this path and starts a new figure. It closes each open figure by connecting a line from its endpoint to its starting point.

### reset() {#reset--}
```
public final void reset()
```


Empties the `Drawing2D.GraphicsPath.PathPoints`([.getPathPoints](../../null/\#getPathPoints)) and `Drawing2D.GraphicsPath.PathTypes`([.getPathTypes](../../null/\#getPathTypes)) arrays and sets the [FillMode](../../com.aspose.drawing.drawing2d/fillmode) to `System.Drawing.Drawing2D.FillMode.Alternate`.

### reverse() {#reverse--}
```
public final void reverse()
```


Reverses the order of points in the `Drawing2D.GraphicsPath.PathPoints`([.getPathPoints](../../null/\#getPathPoints)) array of this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

### setMarkers() {#setMarkers--}
```
public final void setMarkers()
```


Sets a marker on this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

### isOutlineVisible(PointF point, Pen pen) {#isOutlineVisible-com.aspose.drawing.PointF-com.aspose.drawing.Pen-}
```
public final boolean isOutlineVisible(PointF point, Pen pen)
```


Indicates whether the specified point is contained within (under) the outline of this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) when drawn with the specified [Pen](../../com.aspose.drawing/pen).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point | [PointF](../../com.aspose.drawing/pointf) | A [PointF](../../com.aspose.drawing/pointf) that specifies the location to test. |
| pen | [Pen](../../com.aspose.drawing/pen) | The [Pen](../../com.aspose.drawing/pen) to test. |

**Returns:**
boolean - This method returns `true` if the specified point is contained within the outline of this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) when drawn with the specified [Pen](../../com.aspose.drawing/pen); otherwise, `false`.
### isVisible(float x, float y) {#isVisible-float-float-}
```
public final boolean isVisible(float x, float y)
```


Indicates whether the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | The X coordinate of the point to test. |
| y | float | The Y coordinate of the point to test. |

**Returns:**
boolean - This method returns `true` if the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath); otherwise, `false`.
### isVisible(float x, float y, Graphics graphics) {#isVisible-float-float-com.aspose.drawing.Graphics-}
```
public final boolean isVisible(float x, float y, Graphics graphics)
```


Indicates whether the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath), using the specified [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | The X coordinate of the point to test. |
| y | float | The Y coordinate of the point to test. |
| graphics | [Graphics](../../com.aspose.drawing/graphics) | The [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) for which to test visibility. |

**Returns:**
boolean - This method returns `true` if the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath); otherwise, `false`.
### isVisible(int x, int y) {#isVisible-int-int-}
```
public final boolean isVisible(int x, int y)
```


Indicates whether the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | int | The X coordinate of the point to test. |
| y | int | The Y coordinate of the point to test. |

**Returns:**
boolean - This method returns `true` if the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath); otherwise, `false`.
### isVisible(int x, int y, Graphics graphics) {#isVisible-int-int-com.aspose.drawing.Graphics-}
```
public final boolean isVisible(int x, int y, Graphics graphics)
```


Indicates whether the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath), using the specified [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | int | The X coordinate of the point to test. |
| y | int | The Y coordinate of the point to test. |
| graphics | [Graphics](../../com.aspose.drawing/graphics) | The [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) for which to test visibility. |

**Returns:**
boolean - This method returns `true` if the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath); otherwise, `false`.
### isVisible(Point point) {#isVisible-com.aspose.drawing.Point-}
```
public final boolean isVisible(Point point)
```


Indicates whether the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point | [Point](../../com.aspose.drawing/point) | A [Point](../../com.aspose.drawing/point) that represents the point to test. |

**Returns:**
boolean - This method returns `true` if the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath); otherwise, `false`.
### isVisible(Point point, Graphics graphics) {#isVisible-com.aspose.drawing.Point-com.aspose.drawing.Graphics-}
```
public final boolean isVisible(Point point, Graphics graphics)
```


Indicates whether the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath), using the specified [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point | [Point](../../com.aspose.drawing/point) | A [Point](../../com.aspose.drawing/point) that represents the point to test. |
| graphics | [Graphics](../../com.aspose.drawing/graphics) | The [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) for which to test visibility. |

**Returns:**
boolean - This method returns `true` if the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath); otherwise, `false`.
### isVisible(PointF point) {#isVisible-com.aspose.drawing.PointF-}
```
public final boolean isVisible(PointF point)
```


Indicates whether the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point | [PointF](../../com.aspose.drawing/pointf) | A [PointF](../../com.aspose.drawing/pointf) that represents the point to test. |

**Returns:**
boolean - This method returns `true` if the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath); otherwise, `false`.
### isVisible(PointF point, Graphics graphics) {#isVisible-com.aspose.drawing.PointF-com.aspose.drawing.Graphics-}
```
public final boolean isVisible(PointF point, Graphics graphics)
```


Indicates whether the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath), using the specified [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point | [PointF](../../com.aspose.drawing/pointf) | A [PointF](../../com.aspose.drawing/pointf) that represents the point to test. |
| graphics | [Graphics](../../com.aspose.drawing/graphics) | The [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) for which to test visibility. |

**Returns:**
boolean - This method returns `true` if the specified point is contained within this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath); otherwise, `false`.
### warp(PointF[] destPoints, RectangleF srcRect) {#warp-com.aspose.drawing.PointF---com.aspose.drawing.RectangleF-}
```
public final void warp(PointF[] destPoints, RectangleF srcRect)
```


Applies a warp transform, defined by a rectangle and a parallelogram, to this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| destPoints | [PointF\[\]](../../com.aspose.drawing/pointf) | An array of [PointF](../../com.aspose.drawing/pointf) structures that define a parallelogram to which the rectangle defined by `srcRect` is transformed. The array can contain either three or four elements. If the array contains three elements, the lower-right corner of the parallelogram is implied by the first three points. |
| srcRect | [RectangleF](../../com.aspose.drawing/rectanglef) | A [RectangleF](../../com.aspose.drawing/rectanglef) that represents the rectangle that is transformed to the parallelogram defined by `destPoints`. |

### warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix) {#warp-com.aspose.drawing.PointF---com.aspose.drawing.RectangleF-com.aspose.drawing.drawing2d.Matrix-}
```
public final void warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix)
```


Applies a warp transform, defined by a rectangle and a parallelogram, to this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| destPoints | [PointF\[\]](../../com.aspose.drawing/pointf) | An array of [PointF](../../com.aspose.drawing/pointf) structures that define a parallelogram to which the rectangle defined by `srcRect` is transformed. The array can contain either three or four elements. If the array contains three elements, the lower-right corner of the parallelogram is implied by the first three points. |
| srcRect | [RectangleF](../../com.aspose.drawing/rectanglef) | A [RectangleF](../../com.aspose.drawing/rectanglef) that represents the rectangle that is transformed to the parallelogram defined by `destPoints`. |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | A [Matrix](../../com.aspose.drawing.drawing2d/matrix) that specifies a geometric transform to apply to the path. |

### warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, int warpMode) {#warp-com.aspose.drawing.PointF---com.aspose.drawing.RectangleF-com.aspose.drawing.drawing2d.Matrix-int-}
```
public final void warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, int warpMode)
```


Applies a warp transform, defined by a rectangle and a parallelogram, to this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| destPoints | [PointF\[\]](../../com.aspose.drawing/pointf) | An array of [PointF](../../com.aspose.drawing/pointf) structures that defines a parallelogram to which the rectangle defined by `srcRect` is transformed. The array can contain either three or four elements. If the array contains three elements, the lower-right corner of the parallelogram is implied by the first three points. |
| srcRect | [RectangleF](../../com.aspose.drawing/rectanglef) | A [RectangleF](../../com.aspose.drawing/rectanglef) that represents the rectangle that is transformed to the parallelogram defined by `destPoints`. |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | A [Matrix](../../com.aspose.drawing.drawing2d/matrix) that specifies a geometric transform to apply to the path. |
| warpMode | int | A [WarpMode](../../com.aspose.drawing.drawing2d/warpmode) enumeration that specifies whether this warp operation uses perspective or bilinear mode. |

### warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, int warpMode, float flatness) {#warp-com.aspose.drawing.PointF---com.aspose.drawing.RectangleF-com.aspose.drawing.drawing2d.Matrix-int-float-}
```
public final void warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, int warpMode, float flatness)
```


Applies a warp transform, defined by a rectangle and a parallelogram, to this [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| destPoints | [PointF\[\]](../../com.aspose.drawing/pointf) | An array of [PointF](../../com.aspose.drawing/pointf) structures that define a parallelogram to which the rectangle defined by `srcRect` is transformed. The array can contain either three or four elements. If the array contains three elements, the lower-right corner of the parallelogram is implied by the first three points. |
| srcRect | [RectangleF](../../com.aspose.drawing/rectanglef) | A [RectangleF](../../com.aspose.drawing/rectanglef) that represents the rectangle that is transformed to the parallelogram defined by `destPoints`. |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | A [Matrix](../../com.aspose.drawing.drawing2d/matrix) that specifies a geometric transform to apply to the path. |
| warpMode | int | A [WarpMode](../../com.aspose.drawing.drawing2d/warpmode) enumeration that specifies whether this warp operation uses perspective or bilinear mode. |
| flatness | float | A value from 0 through 1 that specifies how flat the resulting path is. For more information, see the `M:System.Drawing.Drawing2D.GraphicsPath.Flatten` methods. |

### getFigures() {#getFigures--}
```
public Figure[] getFigures()
```


Gets the path figures.

**Returns:**
com.aspose.imaging.Figure[] - The path figures.
