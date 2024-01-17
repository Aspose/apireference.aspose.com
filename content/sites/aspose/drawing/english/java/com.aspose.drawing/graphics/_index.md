---
title: Graphics
second_title: Aspose.Drawing for Java API Reference
description: Encapsulates drawing surface.
type: docs
weight: 26
url: /java/com.aspose.drawing/graphics/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.ms.System.IDisposable
```
public class Graphics implements System.IDisposable
```

Encapsulates drawing surface.
## Methods

| Method | Description |
| --- | --- |
| [fromImage(Image image)](#fromImage-com.aspose.drawing.Image-) | Creates a new Graphics from the specified Image. |
| [fromHwnd(byte[] hwnd)](#fromHwnd-byte---) | Creates a new [Graphics](../../com.aspose.drawing/graphics) from the specified handle to a window. |
| [isInBeginUpdateCall()](#isInBeginUpdateCall--) |  |
| [setInBeginUpdateCall(boolean inBeginUpdateCall)](#setInBeginUpdateCall-boolean-) |  |
| [getCompositingQuality()](#getCompositingQuality--) | Gets the rendering quality of composited images drawn to this [Graphics](../../com.aspose.drawing/graphics). |
| [setCompositingQuality(int value)](#setCompositingQuality-int-) | Sets the rendering quality of composited images drawn to this [Graphics](../../com.aspose.drawing/graphics). |
| [getCompositingMode()](#getCompositingMode--) | Gets a value that specifies how composited images are drawn to this [Graphics](../../com.aspose.drawing/graphics). |
| [setCompositingMode(int value)](#setCompositingMode-int-) | Sets a value that specifies how composited images are drawn to this [Graphics](../../com.aspose.drawing/graphics). |
| [getClip()](#getClip--) | Gets a [Region](../../com.aspose.drawing/region) that limits the drawing region of this [Graphics](../../com.aspose.drawing/graphics). |
| [setClip(Region value)](#setClip-com.aspose.drawing.Region-) | Sets a [Region](../../com.aspose.drawing/region) that limits the drawing region of this [Graphics](../../com.aspose.drawing/graphics). |
| [setClip(Graphics g)](#setClip-com.aspose.drawing.Graphics-) | Sets the clipping region of this [Graphics](../../com.aspose.drawing/graphics) to the Clip property of the specified [Graphics](../../com.aspose.drawing/graphics) |
| [setClip(Rectangle rect)](#setClip-com.aspose.drawing.Rectangle-) | Sets the clipping region of this [Graphics](../../com.aspose.drawing/graphics) to the result of the specified operation combining the current clip region and the rectangle specified by a [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| [setClip(RectangleF rect)](#setClip-com.aspose.drawing.RectangleF-) | Sets the clipping region of this [Graphics](../../com.aspose.drawing/graphics) to the result of the specified operation combining the current clip region and the rectangle specified by a [RectangleF](../../com.aspose.drawing/rectanglef) structure. |
| [setClip(GraphicsPath path)](#setClip-com.aspose.drawing.drawing2d.GraphicsPath-) | Sets the clipping region of this [Graphics](../../com.aspose.drawing/graphics) to the specified [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) . |
| [getClipBounds()](#getClipBounds--) | Gets a [RectangleF](../../com.aspose.drawing/rectanglef) structure that bounds the clipping region of this [Graphics](../../com.aspose.drawing/graphics). |
| [isClipEmpty()](#isClipEmpty--) | Gets a value indicating whether the clipping region of this [Graphics](../../com.aspose.drawing/graphics) is empty. |
| [getVisibleClipBounds()](#getVisibleClipBounds--) | Gets the bounding rectangle of the visible clipping region of this [Graphics](../../com.aspose.drawing/graphics). |
| [isVisibleClipEmpty()](#isVisibleClipEmpty--) | Gets a value indicating whether the visible clipping region of this [Graphics](../../com.aspose.drawing/graphics) is empty. |
| [getDpiX()](#getDpiX--) | Gets the horizontal resolution of this [Graphics](../../com.aspose.drawing/graphics). |
| [getDpiY()](#getDpiY--) | Gets the vertical resolution of this [Graphics](../../com.aspose.drawing/graphics). |
| [getInterpolationMode()](#getInterpolationMode--) | Gets the interpolation mode associated with this Graphics. |
| [setInterpolationMode(int value)](#setInterpolationMode-int-) | Sets the interpolation mode associated with this Graphics. |
| [getPageScale()](#getPageScale--) | Gets the scaling between world units and page units for this [Graphics](../../com.aspose.drawing/graphics). |
| [setPageScale(float value)](#setPageScale-float-) | Sets the scaling between world units and page units for this [Graphics](../../com.aspose.drawing/graphics). |
| [getPageUnit()](#getPageUnit--) | Gets the unit of measure used for page coordinates in this [Graphics](../../com.aspose.drawing/graphics). |
| [setPageUnit(int value)](#setPageUnit-int-) | Sets the unit of measure used for page coordinates in this [Graphics](../../com.aspose.drawing/graphics). |
| [getPixelOffsetMode()](#getPixelOffsetMode--) | Gets a value specifying how pixels are offset during rendering of this [Graphics](../../com.aspose.drawing/graphics). |
| [setPixelOffsetMode(int value)](#setPixelOffsetMode-int-) | Sets a value specifying how pixels are offset during rendering of this [Graphics](../../com.aspose.drawing/graphics). |
| [getRenderingOrigin()](#getRenderingOrigin--) | Gets the rendering origin of this [Graphics](../../com.aspose.drawing/graphics) for dithering and for hatch brushes. |
| [setRenderingOrigin(Point value)](#setRenderingOrigin-com.aspose.drawing.Point-) | Sets the rendering origin of this [Graphics](../../com.aspose.drawing/graphics) for dithering and for hatch brushes. |
| [getSmoothingMode()](#getSmoothingMode--) | Gets the rendering quality for this Graphics. |
| [setSmoothingMode(int value)](#setSmoothingMode-int-) | Sets the rendering quality for this Graphics. |
| [getTextContrast()](#getTextContrast--) | Gets the gamma correction value for rendering text. |
| [setTextContrast(int value)](#setTextContrast-int-) | Sets the gamma correction value for rendering text. |
| [getTextRenderingHint()](#getTextRenderingHint--) | Gets the rendering mode for text associated with this [Graphics](../../com.aspose.drawing/graphics). |
| [setTextRenderingHint(int value)](#setTextRenderingHint-int-) | Sets the rendering mode for text associated with this [Graphics](../../com.aspose.drawing/graphics). |
| [getTransform()](#getTransform--) | Gets a copy of the geometric world transformation for this [Graphics](../../com.aspose.drawing/graphics). |
| [setTransform(Matrix value)](#setTransform-com.aspose.drawing.drawing2d.Matrix-) | Sets a copy of the geometric world transformation for this [Graphics](../../com.aspose.drawing/graphics). |
| [copyFromScreen(Point upperLeftSource, Point upperLeftDestination, Size blockRegionSize)](#copyFromScreen-com.aspose.drawing.Point-com.aspose.drawing.Point-com.aspose.drawing.Size-) | Performs a bit-block transfer of color data, corresponding to a rectangle of pixels, from the screen to the drawing surface of the [Graphics](../../com.aspose.drawing/graphics). |
| [copyFromScreen(int sourceX, int sourceY, int destinationX, int destinationY, Size blockRegionSize, int copyPixelOperation)](#copyFromScreen-int-int-int-int-com.aspose.drawing.Size-int-) | Performs a bit-block transfer of the color data, corresponding to a rectangle of pixels, from the screen to the drawing surface of the [Graphics](../../com.aspose.drawing/graphics). |
| [copyFromScreen(Point upperLeftSource, Point upperLeftDestination, Size blockRegionSize, int copyPixelOperation)](#copyFromScreen-com.aspose.drawing.Point-com.aspose.drawing.Point-com.aspose.drawing.Size-int-) | Performs a bit-block transfer of color data, corresponding to a rectangle of pixels, from the screen to the drawing surface of the [Graphics](../../com.aspose.drawing/graphics). |
| [dispose()](#dispose--) | Releases all resources used by this Graphics. |
| [clear(Color color)](#clear-com.aspose.drawing.Color-) | Clears the entire drawing surface and fills it with the specified background color. |
| [drawArc(Pen pen, RectangleF rect, float startAngle, float sweepAngle)](#drawArc-com.aspose.drawing.Pen-com.aspose.drawing.RectangleF-float-float-) | Draws an arc representing a portion of an ellipse specified by a RectangleF structure. |
| [drawArc(Pen pen, float x, float y, float width, float height, float startAngle, float sweepAngle)](#drawArc-com.aspose.drawing.Pen-float-float-float-float-float-float-) | Draws an arc representing a portion of an ellipse specified by a pair of coordinates, a width, and a height. |
| [drawBezier(Pen pen, PointF pt1, PointF pt2, PointF pt3, PointF pt4)](#drawBezier-com.aspose.drawing.Pen-com.aspose.drawing.PointF-com.aspose.drawing.PointF-com.aspose.drawing.PointF-com.aspose.drawing.PointF-) | Draws a Bézier spline defined by four PointF structures. |
| [drawBezier(Pen pen, float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4)](#drawBezier-com.aspose.drawing.Pen-float-float-float-float-float-float-float-float-) | Draws a Bézier spline defined by four ordered pairs of coordinates that represent points. |
| [drawBeziers(Pen pen, PointF[] points)](#drawBeziers-com.aspose.drawing.Pen-com.aspose.drawing.PointF---) | Draws a series of Bézier splines from an array of [Point](../../com.aspose.drawing/point) structures. |
| [drawBeziers(Pen pen, Point[] points)](#drawBeziers-com.aspose.drawing.Pen-com.aspose.drawing.Point---) | Draws a series of Bézier splines from an array of [PointF](../../com.aspose.drawing/pointf) structures. |
| [drawClosedCurve(Pen pen, PointF[] points, float tension, int fillmode)](#drawClosedCurve-com.aspose.drawing.Pen-com.aspose.drawing.PointF---float-int-) | Draws a closed cardinal spline defined by an array of PointF structures using a specified tension. |
| [drawClosedCurve(Pen pen, PointF[] points)](#drawClosedCurve-com.aspose.drawing.Pen-com.aspose.drawing.PointF---) | Draws a closed cardinal spline defined by an array of [PointF](../../com.aspose.drawing/pointf) structures. |
| [drawClosedCurve(Pen pen, Point[] points, float tension, int fillmode)](#drawClosedCurve-com.aspose.drawing.Pen-com.aspose.drawing.Point---float-int-) | Draws a closed cardinal spline defined by an array of [Point](../../com.aspose.drawing/point) structures using a specified tension. |
| [drawClosedCurve(Pen pen, Point[] points)](#drawClosedCurve-com.aspose.drawing.Pen-com.aspose.drawing.Point---) | Draws a closed cardinal spline defined by an array of [Point](../../com.aspose.drawing/point) structures. |
| [drawCurve(Pen pen, PointF[] points)](#drawCurve-com.aspose.drawing.Pen-com.aspose.drawing.PointF---) | Draws a cardinal spline through a specified array of [PointF](../../com.aspose.drawing/pointf) structures. |
| [drawCurve(Pen pen, Point[] points)](#drawCurve-com.aspose.drawing.Pen-com.aspose.drawing.Point---) | Draws a cardinal spline through a specified array of [Point](../../com.aspose.drawing/point) structures. |
| [drawCurve(Pen pen, Point[] points, float tension)](#drawCurve-com.aspose.drawing.Pen-com.aspose.drawing.Point---float-) | Draws a cardinal spline through a specified array of [Point](../../com.aspose.drawing/point) structures using a specified tension. |
| [drawCurve(Pen pen, PointF[] points, int offset, int numberOfSegments)](#drawCurve-com.aspose.drawing.Pen-com.aspose.drawing.PointF---int-int-) | Draws a cardinal spline through a specified array of [PointF](../../com.aspose.drawing/pointf) structures using a specified tension. |
| [drawCurve(Pen pen, PointF[] points, int offset, int numberOfSegments, float tension)](#drawCurve-com.aspose.drawing.Pen-com.aspose.drawing.PointF---int-int-float-) | Draws a cardinal spline through a specified array of [PointF](../../com.aspose.drawing/pointf) structures using a specified tension. |
| [drawCurve(Pen pen, Point[] points, int offset, int numberOfSegments, float tension)](#drawCurve-com.aspose.drawing.Pen-com.aspose.drawing.Point---int-int-float-) | Draws a cardinal spline through a specified array of [Point](../../com.aspose.drawing/point) structures using a specified tension. |
| [drawCurve(Pen pen, PointF[] points, float tension)](#drawCurve-com.aspose.drawing.Pen-com.aspose.drawing.PointF---float-) | Draws a cardinal spline through a specified array of [PointF](../../com.aspose.drawing/pointf) structures using a specified tension. |
| [drawEllipse(Pen pen, RectangleF rect)](#drawEllipse-com.aspose.drawing.Pen-com.aspose.drawing.RectangleF-) | Draws an ellipse defined by a bounding RectangleF. |
| [drawEllipse(Pen pen, float x, float y, float width, float height)](#drawEllipse-com.aspose.drawing.Pen-float-float-float-float-) | Draws an ellipse defined by a bounding rectangle specified by a pair of coordinates, a height, and a width. |
| [drawIcon(Icon icon, int x, int y)](#drawIcon-com.aspose.drawing.Icon-int-int-) | Draws the image represented by the specified [Icon](../../com.aspose.drawing/icon) at the specified coordinates. |
| [drawIcon(Icon icon, Rectangle targetRect)](#drawIcon-com.aspose.drawing.Icon-com.aspose.drawing.Rectangle-) | Draws the image represented by the specified [Icon](../../com.aspose.drawing/icon) within the area specified by a [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| [drawIconUnstretched(Icon icon, Rectangle targetRect)](#drawIconUnstretched-com.aspose.drawing.Icon-com.aspose.drawing.Rectangle-) | Draws the image represented by the specified [Icon](../../com.aspose.drawing/icon) without scaling the image. |
| [drawImage(Image image, int x, int y)](#drawImage-com.aspose.drawing.Image-int-int-) | Draws the specified image, using its original physical size, at the location specified by a coordinate pair. |
| [drawImage(Image image, float x, float y)](#drawImage-com.aspose.drawing.Image-float-float-) | Draws the specified [Image](../../com.aspose.drawing/image), using its original physical size, at the specified location. |
| [drawImage(Image image, Point point)](#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Point-) | Draws the specified Image, using its original physical size, at the specified location. |
| [drawImage(Image image, Point[] destPoints)](#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Point---) | Draws the specified `\\u0415:Image` at the specified location and with the specified shape and size. |
| [drawImage(Image image, PointF point)](#drawImage-com.aspose.drawing.Image-com.aspose.drawing.PointF-) | Draws the specified [Image](../../com.aspose.drawing/image), using its original physical size, at the specified location. |
| [drawImage(Image image, PointF[] destPoints)](#drawImage-com.aspose.drawing.Image-com.aspose.drawing.PointF---) | Draws the specified [Image](../../com.aspose.drawing/image) at the specified location and with the specified shape and size. |
| [drawImage(Image image, int x, int y, int width, int height)](#drawImage-com.aspose.drawing.Image-int-int-int-int-) | Draws the specified Image at the specified location and with the specified size. |
| [drawImage(Image image, Rectangle rect)](#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Rectangle-) | Draws the specified Image at the specified location and with the specified size. |
| [drawImage(Image image, RectangleF rect)](#drawImage-com.aspose.drawing.Image-com.aspose.drawing.RectangleF-) | Draws the specified Image at the specified location and with the specified size. |
| [drawImage(Image image, float x, float y, float width, float height)](#drawImage-com.aspose.drawing.Image-float-float-float-float-) | Draws the specified [Image](../../com.aspose.drawing/image), using its original physical size, at the specified location and with the specified size. |
| [drawImage(Image image, int x, int y, Rectangle srcRect, int srcUnit)](#drawImage-com.aspose.drawing.Image-int-int-com.aspose.drawing.Rectangle-int-) | Draws a portion of an image at a specified location. |
| [drawImage(Image image, float x, float y, RectangleF srcRect, int srcUnit)](#drawImage-com.aspose.drawing.Image-float-float-com.aspose.drawing.RectangleF-int-) | Draws a portion of an image at a specified location. |
| [drawImage(Image image, PointF[] destPoints, RectangleF srcRect, int srcUnit)](#drawImage-com.aspose.drawing.Image-com.aspose.drawing.PointF---com.aspose.drawing.RectangleF-int-) | Draws the specified portion of the specified Image at the specified location and with the specified size. |
| [drawImage(Image image, Point[] destPoints, Rectangle srcRect, int srcUnit)](#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Point---com.aspose.drawing.Rectangle-int-) | Draws the specified portion of the specified [Image](../../com.aspose.drawing/image) at the specified location and with the specified size. |
| [drawImage(Image image, Point[] destPoints, Rectangle srcRect, int srcUnit, ImageAttributes imageAttr)](#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Point---com.aspose.drawing.Rectangle-int-com.aspose.drawing.imaging.ImageAttributes-) | Draws the specified portion of the specified [Image](../../com.aspose.drawing/image) at the specified location and with the specified size. |
| [drawImage(Image image, PointF[] destPoints, RectangleF srcRect, int srcUnit, ImageAttributes imageAttr)](#drawImage-com.aspose.drawing.Image-com.aspose.drawing.PointF---com.aspose.drawing.RectangleF-int-com.aspose.drawing.imaging.ImageAttributes-) | Draws the specified portion of the specified Image at the specified location and with the specified size. |
| [drawImage(Image image, Rectangle destRect, Rectangle srcRect, int srcUnit)](#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-int-) | Draws the specified portion of the specified Image at the specified location and with the specified size. |
| [drawImage(Image image, Rectangle destRect, int srcX, int srcY, int srcWidth, int srcHeight, int srcUnit, ImageAttributes imageAttr)](#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Rectangle-int-int-int-int-int-com.aspose.drawing.imaging.ImageAttributes-) | Draws the specified portion of the specified Image at the specified location and with the specified size. |
| [drawImage(Image image, RectangleF destRect, RectangleF srcRect, int srcUnit)](#drawImage-com.aspose.drawing.Image-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-int-) | Draws the specified portion of the specified Image at the specified location and with the specified size. |
| [drawImage(Image image, Rectangle destRect, int srcX, int srcY, int srcWidth, int srcHeight, int srcUnit)](#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Rectangle-int-int-int-int-int-) | Draws the specified portion of the specified [Image](../../com.aspose.drawing/image) at the specified location and with the specified size. |
| [drawImage(Image image, Rectangle destRect, float srcX, float srcY, float srcWidth, float srcHeight, int srcUnit)](#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Rectangle-float-float-float-float-int-) | Draws the specified portion of the specified [Image](../../com.aspose.drawing/image) at the specified location and with the specified size. |
| [drawImage(Image image, Rectangle destRect, float srcX, float srcY, float srcWidth, float srcHeight, int srcUnit, ImageAttributes imageAttrs)](#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Rectangle-float-float-float-float-int-com.aspose.drawing.imaging.ImageAttributes-) | Draws the specified portion of the specified [Image](../../com.aspose.drawing/image) at the specified location and with the specified size. |
| [drawImageUnscaled(Image image, int x, int y)](#drawImageUnscaled-com.aspose.drawing.Image-int-int-) | Draws the specified image using its original physical size at the location specified by a coordinate pair. |
| [drawImageUnscaled(Image image, Point point)](#drawImageUnscaled-com.aspose.drawing.Image-com.aspose.drawing.Point-) | Draws a specified image using its original physical size at a specified location. |
| [drawImageUnscaled(Image image, Rectangle rect)](#drawImageUnscaled-com.aspose.drawing.Image-com.aspose.drawing.Rectangle-) | Draws a specified image using its original physical size at a specified location. |
| [drawImageUnscaled(Image image, int x, int y, int width, int height)](#drawImageUnscaled-com.aspose.drawing.Image-int-int-int-int-) | Draws the specified image using its original physical size at the location specified by a coordinate pair. |
| [drawImageUnscaledAndClipped(Image image, Rectangle rect)](#drawImageUnscaledAndClipped-com.aspose.drawing.Image-com.aspose.drawing.Rectangle-) | Draws the specified image without scaling and clips it, if necessary, to fit in the specified rectangle. |
| [drawLine(Pen pen, Point pt1, Point pt2)](#drawLine-com.aspose.drawing.Pen-com.aspose.drawing.Point-com.aspose.drawing.Point-) | Draws a line connecting two [Point](../../com.aspose.drawing/point) structures. |
| [drawLine(Pen pen, int x1, int y1, int x2, int y2)](#drawLine-com.aspose.drawing.Pen-int-int-int-int-) | Draws a line connecting the two points specified by the coordinate pairs. |
| [drawLine(Pen pen, PointF pt1, PointF pt2)](#drawLine-com.aspose.drawing.Pen-com.aspose.drawing.PointF-com.aspose.drawing.PointF-) | Draws a line connecting two PointF structures. |
| [drawLine(Pen pen, float x1, float y1, float x2, float y2)](#drawLine-com.aspose.drawing.Pen-float-float-float-float-) | Draws a line connecting the two points specified by the coordinate pairs. |
| [drawLines(Pen pen, PointF[] points)](#drawLines-com.aspose.drawing.Pen-com.aspose.drawing.PointF---) | Draws a series of line segments that connect an array of [PointF](../../com.aspose.drawing/pointf) structures. |
| [drawLines(Pen pen, Point[] points)](#drawLines-com.aspose.drawing.Pen-com.aspose.drawing.Point---) | Draws a series of line segments that connect an array of [Point](../../com.aspose.drawing/point) structures. |
| [drawPath(Pen pen, GraphicsPath path)](#drawPath-com.aspose.drawing.Pen-com.aspose.drawing.drawing2d.GraphicsPath-) | Draws a GraphicsPath. |
| [drawPie(Pen pen, RectangleF rect, float startAngle, float sweepAngle)](#drawPie-com.aspose.drawing.Pen-com.aspose.drawing.RectangleF-float-float-) | Draws a pie shape defined by an ellipse specified by a RectangleF structure and two radial lines. |
| [drawPie(Pen pen, float x, float y, float width, float height, float startAngle, float sweepAngle)](#drawPie-com.aspose.drawing.Pen-float-float-float-float-float-float-) | Draws a pie shape defined by an ellipse specified by a coordinate pair, a width, a height, and two radial lines. |
| [drawPolygon(Pen pen, Point[] points)](#drawPolygon-com.aspose.drawing.Pen-com.aspose.drawing.Point---) | Draws a polygon defined by an array of [Point](../../com.aspose.drawing/point) structures. |
| [drawPolygon(Pen pen, PointF[] points)](#drawPolygon-com.aspose.drawing.Pen-com.aspose.drawing.PointF---) | Draws a polygon defined by an array of PointF structures. |
| [drawRectangle(Pen pen, int x, int y, int width, int height)](#drawRectangle-com.aspose.drawing.Pen-int-int-int-int-) | Draws a rectangle specified by a coordinate pair, a width, and a height. |
| [drawRectangle(Pen pen, Rectangle rect)](#drawRectangle-com.aspose.drawing.Pen-com.aspose.drawing.Rectangle-) | Draws a rectangle specified by a Rectangle structure. |
| [drawRectangle(Pen pen, float x, float y, float width, float height)](#drawRectangle-com.aspose.drawing.Pen-float-float-float-float-) | Draws a rectangle specified by a coordinate pair, a width, and a height. |
| [drawRectangles(Pen pen, RectangleF[] rects)](#drawRectangles-com.aspose.drawing.Pen-com.aspose.drawing.RectangleF---) | Draws a series of rectangles specified by [RectangleF](../../com.aspose.drawing/rectanglef) structures. |
| [drawRectangles(Pen pen, Rectangle[] rects)](#drawRectangles-com.aspose.drawing.Pen-com.aspose.drawing.Rectangle---) | Draws a series of rectangles specified by [Rectangle](../../com.aspose.drawing/rectangle) structures. |
| [drawString(String s, Font font, Brush brush, RectangleF layoutRectangle)](#drawString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.Brush-com.aspose.drawing.RectangleF-) | Draws the specified text string in the specified rectangle with the specified [Brush](../../com.aspose.drawing/brush) and [Font](../../com.aspose.drawing/font) objects using the formatting attributes of the specified [StringFormat](../../com.aspose.drawing/stringformat). |
| [drawString(String s, Font font, Brush brush, PointF point)](#drawString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.Brush-com.aspose.drawing.PointF-) | Draws the specified text string at the specified location with the specified [Brush](../../com.aspose.drawing/brush) and [Font](../../com.aspose.drawing/font) objects. |
| [drawString(String s, Font font, Brush brush, PointF point, StringFormat format)](#drawString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.Brush-com.aspose.drawing.PointF-com.aspose.drawing.StringFormat-) | Draws the specified text string at the specified location with the specified [Brush](../../com.aspose.drawing/brush) and [Font](../../com.aspose.drawing/font) objects using the formatting attributes of the specified [StringFormat](../../com.aspose.drawing/stringformat). |
| [drawString(String s, Font font, Brush brush, float x, float y, StringFormat format)](#drawString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.Brush-float-float-com.aspose.drawing.StringFormat-) | Draws the specified text string at the specified location with the specified [Brush](../../com.aspose.drawing/brush) and [Font](../../com.aspose.drawing/font) objects using the formatting attributes of the specified [StringFormat](../../com.aspose.drawing/stringformat). |
| [drawString(String s, Font font, Brush brush, float x, float y)](#drawString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.Brush-float-float-) | Draws the specified text string at the specified location with the specified [Brush](../../com.aspose.drawing/brush) and [Font](../../com.aspose.drawing/font) objects. |
| [drawString(String s, Font font, Brush brush, RectangleF layoutRectangle, StringFormat format)](#drawString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.Brush-com.aspose.drawing.RectangleF-com.aspose.drawing.StringFormat-) | Draws the specified text string in the specified rectangle with the specified [Brush](../../com.aspose.drawing/brush) and [Font](../../com.aspose.drawing/font) objects using the formatting attributes of the specified [StringFormat](../../com.aspose.drawing/stringformat). |
| [fillClosedCurve(Brush brush, PointF[] points, int fillmode, float tension)](#fillClosedCurve-com.aspose.drawing.Brush-com.aspose.drawing.PointF---int-float-) | Fills the interior of a closed cardinal spline curve defined by an array of PointF structures using the specified fill mode and tension. |
| [fillClosedCurve(Brush brush, PointF[] points)](#fillClosedCurve-com.aspose.drawing.Brush-com.aspose.drawing.PointF---) | Fills the interior of a closed cardinal spline curve defined by an array of [PointF](../../com.aspose.drawing/pointf) structures. |
| [fillClosedCurve(Brush brush, PointF[] points, int fillmode)](#fillClosedCurve-com.aspose.drawing.Brush-com.aspose.drawing.PointF---int-) | Fills the interior of a closed cardinal spline curve defined by an array of [PointF](../../com.aspose.drawing/pointf) structures using the specified fill mode. |
| [fillClosedCurve(Brush brush, Point[] points)](#fillClosedCurve-com.aspose.drawing.Brush-com.aspose.drawing.Point---) | Fills the interior of a closed cardinal spline curve defined by an array of [Point](../../com.aspose.drawing/point) structures. |
| [fillClosedCurve(Brush brush, Point[] points, int fillmode)](#fillClosedCurve-com.aspose.drawing.Brush-com.aspose.drawing.Point---int-) | Fills the interior of a closed cardinal spline curve defined by an array of [Point](../../com.aspose.drawing/point) structures using the specified fill mode. |
| [fillClosedCurve(Brush brush, Point[] points, int fillmode, float tension)](#fillClosedCurve-com.aspose.drawing.Brush-com.aspose.drawing.Point---int-float-) | Fills the interior of a closed cardinal spline curve defined by an array of [Point](../../com.aspose.drawing/point) structures using the specified fill mode. |
| [fillEllipse(Brush brush, RectangleF rect)](#fillEllipse-com.aspose.drawing.Brush-com.aspose.drawing.RectangleF-) | Fills the interior of an ellipse defined by a bounding rectangle specified by a RectangleF structure. |
| [fillEllipse(Brush brush, float x, float y, float width, float height)](#fillEllipse-com.aspose.drawing.Brush-float-float-float-float-) | Fills the interior of an ellipse defined by a bounding rectangle specified by a pair of coordinates, a width, and a height. |
| [fillPath(Brush brush, GraphicsPath path)](#fillPath-com.aspose.drawing.Brush-com.aspose.drawing.drawing2d.GraphicsPath-) | Fills the interior of a GraphicsPath. |
| [fillPie(Brush brush, Rectangle rect, float startAngle, float sweepAngle)](#fillPie-com.aspose.drawing.Brush-com.aspose.drawing.Rectangle-float-float-) | Fills the interior of a pie section defined by an ellipse specified by a Rectangle structure and two radial lines. |
| [fillPie(Brush brush, float x, float y, float width, float height, float startAngle, float sweepAngle)](#fillPie-com.aspose.drawing.Brush-float-float-float-float-float-float-) | Fills the interior of a pie section defined by an ellipse specified by a pair of coordinates, a width, a height, and two radial lines. |
| [fillPie(Brush brush, int x, int y, int width, int height, int startAngle, int sweepAngle)](#fillPie-com.aspose.drawing.Brush-int-int-int-int-int-int-) | Fills the interior of a pie section defined by an ellipse specified by a pair of coordinates, a width, a height, and two radial lines. |
| [fillPolygon(Brush brush, PointF[] points, int fillMode)](#fillPolygon-com.aspose.drawing.Brush-com.aspose.drawing.PointF---int-) | Fills the interior of a polygon defined by an array of points specified by PointF structures using the specified fill mode. |
| [fillPolygon(Brush brush, PointF[] points)](#fillPolygon-com.aspose.drawing.Brush-com.aspose.drawing.PointF---) | Fills the interior of a polygon defined by an array of points specified by [PointF](../../com.aspose.drawing/pointf) structures. |
| [fillPolygon(Brush brush, Point[] points)](#fillPolygon-com.aspose.drawing.Brush-com.aspose.drawing.Point---) | Fills the interior of a polygon defined by an array of points specified by [Point](../../com.aspose.drawing/point) structures. |
| [fillPolygon(Brush brush, Point[] points, int fillMode)](#fillPolygon-com.aspose.drawing.Brush-com.aspose.drawing.Point---int-) | Fills the interior of a polygon defined by an array of points specified by [Point](../../com.aspose.drawing/point) structures using the specified fill mode. |
| [fillRectangle(Brush brush, float x, float y, float width, float height)](#fillRectangle-com.aspose.drawing.Brush-float-float-float-float-) | Fills the interior of a rectangle specified by a pair of coordinates, a width, and a height. |
| [fillRectangle(Brush brush, RectangleF rect)](#fillRectangle-com.aspose.drawing.Brush-com.aspose.drawing.RectangleF-) | Fills the interior of a rectangle specified by a RectangleF structure. |
| [fillRectangles(Brush brush, Rectangle[] rects)](#fillRectangles-com.aspose.drawing.Brush-com.aspose.drawing.Rectangle---) | Fills the interiors of a series of rectangles specified by [Rectangle](../../com.aspose.drawing/rectangle) structures. |
| [fillRectangles(Brush brush, RectangleF[] rects)](#fillRectangles-com.aspose.drawing.Brush-com.aspose.drawing.RectangleF---) | Fills the interiors of a series of rectangles specified by [RectangleF](../../com.aspose.drawing/rectanglef) structures. |
| [fillRegion(Brush brush, Region region)](#fillRegion-com.aspose.drawing.Brush-com.aspose.drawing.Region-) | Fills the interior of a Region. |
| [flush()](#flush--) | Forces execution of all pending graphics operations and returns immediately without waiting for the operations to finish. |
| [flush(int intention)](#flush-int-) | Forces execution of all pending graphics operations with the method waiting or not waiting, as specified, to return before the operations finish. |
| [measureString(String text, Font font)](#measureString-java.lang.String-com.aspose.drawing.Font-) | Measures the specified string when drawn with the specified [Font](../../com.aspose.drawing/font). |
| [measureString(String text, Font font, SizeF layoutArea)](#measureString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.SizeF-) | Measures the specified string when drawn with the specified [Font](../../com.aspose.drawing/font). |
| [measureString(String text, Font font, int width)](#measureString-java.lang.String-com.aspose.drawing.Font-int-) | Measures the specified string when drawn with the specified [Font](../../com.aspose.drawing/font). |
| [measureString(String text, Font font, PointF origin, StringFormat stringFormat)](#measureString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.PointF-com.aspose.drawing.StringFormat-) | Measures the specified string when drawn with the specified [Font](../../com.aspose.drawing/font) and formatted with the specified [StringFormat](../../com.aspose.drawing/stringformat). |
| [measureString(String text, Font font, int width, StringFormat format)](#measureString-java.lang.String-com.aspose.drawing.Font-int-com.aspose.drawing.StringFormat-) | Measures the specified string when drawn with the specified [Font](../../com.aspose.drawing/font) and formatted with the specified [StringFormat](../../com.aspose.drawing/stringformat). |
| [measureString(String text, Font font, SizeF layoutArea, StringFormat stringFormat)](#measureString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.SizeF-com.aspose.drawing.StringFormat-) | Measures the specified string when drawn with the specified [Font](../../com.aspose.drawing/font) and formatted with the specified [StringFormat](../../com.aspose.drawing/stringformat). |
| [measureString(String text, Font font, SizeF layoutArea, StringFormat stringFormat, int[] charactersFitted, int[] linesFilled)](#measureString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.SizeF-com.aspose.drawing.StringFormat-int---int---) | Measures the specified string when drawn with the specified [Font](../../com.aspose.drawing/font) and formatted with the specified [StringFormat](../../com.aspose.drawing/stringformat). |
| [measureCharacterRanges(String text, Font font, RectangleF layoutRect, StringFormat stringFormat)](#measureCharacterRanges-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.RectangleF-com.aspose.drawing.StringFormat-) | Gets an array of [Region](../../com.aspose.drawing/region) objects, each of which bounds a range of character positions within the specified string. |
| [resetTransform()](#resetTransform--) | Resets the world transformation matrix of this [Graphics](../../com.aspose.drawing/graphics) to the identity matrix. |
| [transformPoints(int destSpace, int srcSpace, PointF[] pts)](#transformPoints-int-int-com.aspose.drawing.PointF---) | Transforms an array of points from one coordinate space to another using the current world and page transformations of this [Graphics](../../com.aspose.drawing/graphics). |
| [transformPoints(int destSpace, int srcSpace, Point[] pts)](#transformPoints-int-int-com.aspose.drawing.Point---) | Transforms an array of points from one coordinate space to another using the current world and page transformations of this [Graphics](../../com.aspose.drawing/graphics). |
| [translateClip(int dx, int dy)](#translateClip-int-int-) | Translates the clipping region of this [Graphics](../../com.aspose.drawing/graphics) by specified amounts in the horizontal and vertical directions. |
| [translateClip(float dx, float dy)](#translateClip-float-float-) | Translates the clipping region of this [Graphics](../../com.aspose.drawing/graphics) by specified amounts in the horizontal and vertical directions. |
| [translateTransform(float dx, float dy)](#translateTransform-float-float-) | Changes the origin of the coordinate system by prepending the specified translation to the transformation matrix of this [Graphics](../../com.aspose.drawing/graphics). |
| [translateTransform(float dx, float dy, int order)](#translateTransform-float-float-int-) | Changes the origin of the coordinate system by applying the specified translation to the transformation matrix of this [Graphics](../../com.aspose.drawing/graphics) in the specified order. |
| [scaleTransform(float sx, float sy)](#scaleTransform-float-float-) | Applies the specified scaling operation to the transformation matrix of this [Graphics](../../com.aspose.drawing/graphics) by prepending it to the object's transformation matrix. |
| [scaleTransform(float sx, float sy, int order)](#scaleTransform-float-float-int-) | Applies the specified scaling operation to the transformation matrix of this [Graphics](../../com.aspose.drawing/graphics) in the specified order. |
| [rotateTransform(float angle)](#rotateTransform-float-) | Applies the specified rotation to the transformation matrix of this [Graphics](../../com.aspose.drawing/graphics). |
| [rotateTransform(float angle, int order)](#rotateTransform-float-int-) | Applies the specified rotation to the transformation matrix of this [Graphics](../../com.aspose.drawing/graphics) in the specified order. |
| [multiplyTransform(Matrix matrix)](#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-) | Multiplies the world transformation of this [Graphics](../../com.aspose.drawing/graphics) and specified the [Matrix](../../com.aspose.drawing.drawing2d/matrix). |
| [multiplyTransform(Matrix matrix, int order)](#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-int-) | Multiplies the world transformation of this [Graphics](../../com.aspose.drawing/graphics) and specified the [Matrix](../../com.aspose.drawing.drawing2d/matrix) in the specified order. |
| [setClip(Graphics g, int combineMode)](#setClip-com.aspose.drawing.Graphics-int-) | Sets the clipping region of this [Graphics](../../com.aspose.drawing/graphics) to the result of the specified combining operation of the current clip region and the Clip property of the specified [Graphics](../../com.aspose.drawing/graphics). |
| [setClip(Rectangle rect, int combineMode)](#setClip-com.aspose.drawing.Rectangle-int-) | Sets the clipping region of this [Graphics](../../com.aspose.drawing/graphics) to the result of the specified operation combining the current clip region and the rectangle specified by a [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| [setClip(RectangleF rect, int combineMode)](#setClip-com.aspose.drawing.RectangleF-int-) | Sets the clipping region of this [Graphics](../../com.aspose.drawing/graphics) to the result of the specified operation combining the current clip region and the rectangle specified by a [RectangleF](../../com.aspose.drawing/rectanglef) structure. |
| [setClip(GraphicsPath path, int combineMode)](#setClip-com.aspose.drawing.drawing2d.GraphicsPath-int-) | Sets the clipping region of this [Graphics](../../com.aspose.drawing/graphics) to the result of the specified operation combining the current clip region and the specified [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [setClip(Region region, int combineMode)](#setClip-com.aspose.drawing.Region-int-) | Sets the clipping region of this [Graphics](../../com.aspose.drawing/graphics) to the result of the specified operation combining the current clip region and the specified [Region](../../com.aspose.drawing/region). |
| [getHdc()](#getHdc--) | Gets the handle to the device context associated with this [Graphics](../../com.aspose.drawing/graphics). |
| [getNearestColor(Color color)](#getNearestColor-com.aspose.drawing.Color-) | Gets the nearest color to the specified [Color](../../com.aspose.drawing/color) structure. |
| [intersectClip(Region region)](#intersectClip-com.aspose.drawing.Region-) | Updates the clip region of this [Graphics](../../com.aspose.drawing/graphics) to the intersection of the current clip region and the specified [Region](../../com.aspose.drawing/region). |
| [intersectClip(Rectangle rect)](#intersectClip-com.aspose.drawing.Rectangle-) | Updates the clip region of this [Graphics](../../com.aspose.drawing/graphics) to the intersection of the current clip region and the specified [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| [intersectClip(RectangleF rect)](#intersectClip-com.aspose.drawing.RectangleF-) | Updates the clip region of this [Graphics](../../com.aspose.drawing/graphics) to the intersection of the current clip region and the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure. |
| [isVisible(int x, int y)](#isVisible-int-int-) | Indicates whether the point specified by a pair of coordinates is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics). |
| [isVisible(Point point)](#isVisible-com.aspose.drawing.Point-) | Indicates whether the specified [Point](../../com.aspose.drawing/point) structure is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics). |
| [isVisible(float x, float y)](#isVisible-float-float-) | Indicates whether the point specified by a pair of coordinates is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics). |
| [isVisible(PointF point)](#isVisible-com.aspose.drawing.PointF-) | Indicates whether the specified [PointF](../../com.aspose.drawing/pointf) structure is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics). |
| [isVisible(int x, int y, int width, int height)](#isVisible-int-int-int-int-) | Indicates whether the rectangle specified by a pair of coordinates, a width, and a height is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics). |
| [isVisible(Rectangle rect)](#isVisible-com.aspose.drawing.Rectangle-) | Indicates whether the rectangle specified by a [Rectangle](../../com.aspose.drawing/rectangle) structure is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics). |
| [isVisible(float x, float y, float width, float height)](#isVisible-float-float-float-float-) | Indicates whether the rectangle specified by a pair of coordinates, a width, and a height is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics). |
| [isVisible(RectangleF rect)](#isVisible-com.aspose.drawing.RectangleF-) | Indicates whether the rectangle specified by a [RectangleF](../../com.aspose.drawing/rectanglef) structure is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics). |
| [releaseHdc(byte[] hdc)](#releaseHdc-byte---) | Releases a device context handle obtained by a previous call to the `M:Graphics.GetHdc` method of this [Graphics](../../com.aspose.drawing/graphics). |
| [releaseHdc()](#releaseHdc--) | Releases a device context handle obtained by a previous call to the `M:Graphics.GetHdc` method of this [Graphics](../../com.aspose.drawing/graphics). |
| [save()](#save--) | Saves the current state of this [Graphics](../../com.aspose.drawing/graphics) and identifies the saved state with a [GraphicsState](../../com.aspose.drawing.drawing2d/graphicsstate). |
| [restore(GraphicsState gstate)](#restore-com.aspose.drawing.drawing2d.GraphicsState-) | Restores the state of this [Graphics](../../com.aspose.drawing/graphics) to the state represented by a [GraphicsState](../../com.aspose.drawing.drawing2d/graphicsstate). |
| [resetClip()](#resetClip--) | Resets the clip region of this [Graphics](../../com.aspose.drawing/graphics) to an infinite region. |
| [beginContainer()](#beginContainer--) | Saves a graphics container with the current state of this [Graphics](../../com.aspose.drawing/graphics) and opens and uses a new graphics container. |
| [beginContainer(Rectangle dstrect, Rectangle srcrect, int unit)](#beginContainer-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-int-) | Saves a graphics container with the current state of this [Graphics](../../com.aspose.drawing/graphics) and opens and uses a new graphics container with the specified scale transformation. |
| [beginContainer(RectangleF dstrect, RectangleF srcrect, int unit)](#beginContainer-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-int-) | Saves a graphics container with the current state of this [Graphics](../../com.aspose.drawing/graphics) and opens and uses a new graphics container with the specified scale transformation. |
| [endContainer(GraphicsContainer container)](#endContainer-com.aspose.drawing.drawing2d.GraphicsContainer-) | Closes the current graphics container and restores the state of this [Graphics](../../com.aspose.drawing/graphics) to the state saved by a call to the [.beginContainer](../../null/\#beginContainer) method. |
| [excludeClip(Region region)](#excludeClip-com.aspose.drawing.Region-) | Updates the clip region of this [Graphics](../../com.aspose.drawing/graphics) to exclude the area specified by a [Region](../../com.aspose.drawing/region). |
| [excludeClip(Rectangle rect)](#excludeClip-com.aspose.drawing.Rectangle-) | Updates the clip region of this [Graphics](../../com.aspose.drawing/graphics) to exclude the area specified by a [Rectangle](../../com.aspose.drawing/rectangle) |
| [enumerateMetafile(Metafile metafile, PointF destPoint, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData, ImageAttributes imageAttr)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-) | Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point using specified image attributes. |
| [enumerateMetafile(Metafile metafile, PointF destPoint, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---) | Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point. |
| [enumerateMetafile(Metafile metafile, PointF[] destPoints, Graphics.EnumerateMetafileProcByte callback)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF---com.aspose.drawing.Graphics.EnumerateMetafileProcByte-) | Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram. |
| [enumerateMetafile(Metafile metafile, Point destPoint, Graphics.EnumerateMetafileProcByte callback)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-) | Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point. |
| [enumerateMetafile(Metafile metafile, Point destPoint, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---) | Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point. |
| [enumerateMetafile(Metafile metafile, Point destPoint, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData, ImageAttributes imageAttr)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-) | Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point using specified image attributes. |
| [enumerateMetafile(Metafile metafile, RectangleF destRect, Graphics.EnumerateMetafileProcByte callback)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.RectangleF-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-) | Sends the records of the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle. |
| [enumerateMetafile(Metafile metafile, RectangleF destRect, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.RectangleF-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---) | Sends the records of the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle. |
| [enumerateMetafile(Metafile metafile, RectangleF destRect, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData, ImageAttributes imageAttr)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.RectangleF-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-) | Sends the records of the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle using specified image attributes. |
| [enumerateMetafile(Metafile metafile, Rectangle destRect, Graphics.EnumerateMetafileProcByte callback)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Rectangle-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-) | Sends the records of the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle. |
| [enumerateMetafile(Metafile metafile, PointF destPoint, Graphics.EnumerateMetafileProcByte callback)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-) | Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point. |
| [enumerateMetafile(Metafile metafile, PointF[] destPoints, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF---com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---) | Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram. |
| [enumerateMetafile(Metafile metafile, Point[] destPoints, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point---com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---) | Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram. |
| [enumerateMetafile(Metafile metafile, Point[] destPoints, Graphics.EnumerateMetafileProcByte callback)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point---com.aspose.drawing.Graphics.EnumerateMetafileProcByte-) | Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram. |
| [enumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, int unit, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData, ImageAttributes imageAttr)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point---com.aspose.drawing.Rectangle-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-) | Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram using specified image attributes. |
| [enumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point---com.aspose.drawing.Rectangle-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---) | Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram. |
| [enumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point---com.aspose.drawing.Rectangle-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-) | Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram. |
| [enumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, int unit, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData, ImageAttributes imageAttr)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF---com.aspose.drawing.RectangleF-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-) | Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram using specified image attributes. |
| [enumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF---com.aspose.drawing.RectangleF-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---) | Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram. |
| [enumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF---com.aspose.drawing.RectangleF-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-) | Sends the records in a selected rectangle from a S[Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram. |
| [enumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, int unit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes, ImageAttributes imageAttr)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-) | Sends the records of a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle using specified image attributes. |
| [enumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---) | Sends the records of a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle. |
| [enumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-) | Sends the records of a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle. |
| [enumerateMetafile(Metafile metafile, PointF[] destPoints, Graphics.EnumerateMetafileProcByte callback, byte[] bytes, ImageAttributes imageAttr)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF---com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-) | Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram using specified image attributes. |
| [enumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, int unit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes, ImageAttributes imageAttr)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-) | Sends the records of a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle using specified image attributes. |
| [enumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-) | Sends the records of a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle. |
| [enumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, int unit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes, ImageAttributes imageAttr)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point-com.aspose.drawing.Rectangle-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-) | Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point using specified image attributes. |
| [enumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point-com.aspose.drawing.Rectangle-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---) | Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point. |
| [enumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point-com.aspose.drawing.Rectangle-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-) | Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point. |
| [enumerateMetafile(Metafile metafile, Rectangle destRect, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Rectangle-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---) | Sends the records of the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle. |
| [enumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, int unit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes, ImageAttributes imageAttr)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF-com.aspose.drawing.RectangleF-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-) | Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point using specified image attributes. |
| [enumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF-com.aspose.drawing.RectangleF-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---) | Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point. |
| [enumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF-com.aspose.drawing.RectangleF-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-) | Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point. |
| [enumerateMetafile(Metafile metafile, Point[] destPoints, Graphics.EnumerateMetafileProcByte callback, byte[] bytes, ImageAttributes imageAttr)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point---com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-) | Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram using specified image attributes. |
| [enumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---) | Sends the records of a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle. |
| [enumerateMetafile(Metafile metafile, Rectangle destRect, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData, ImageAttributes imageAttr)](#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Rectangle-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-) | Sends the records of the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle using specified image attributes. |
| [addMetafileComment(byte[] data)](#addMetafileComment-byte---) | Adds a comment to the current [Metafile](../../com.aspose.drawing.imaging/metafile). |
| [beginUpdate()](#beginUpdate--) |  |
| [endUpdate()](#endUpdate--) |  |
| [getImage()](#getImage--) |  |
### fromImage(Image image) {#fromImage-com.aspose.drawing.Image-}
```
public static Graphics fromImage(Image image)
```


Creates a new Graphics from the specified Image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | Image from which to create the new Graphics. |

**Returns:**
[Graphics](../../com.aspose.drawing/graphics) - A new Graphics for the specified Image.
### fromHwnd(byte[] hwnd) {#fromHwnd-byte---}
```
public static Graphics fromHwnd(byte[] hwnd)
```


Creates a new [Graphics](../../com.aspose.drawing/graphics) from the specified handle to a window.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| hwnd | byte[] | Handle to a window. |

**Returns:**
[Graphics](../../com.aspose.drawing/graphics) - This method returns a new [Graphics](../../com.aspose.drawing/graphics) for the specified window handle.
### isInBeginUpdateCall() {#isInBeginUpdateCall--}
```
public boolean isInBeginUpdateCall()
```




**Returns:**
boolean
### setInBeginUpdateCall(boolean inBeginUpdateCall) {#setInBeginUpdateCall-boolean-}
```
public void setInBeginUpdateCall(boolean inBeginUpdateCall)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| inBeginUpdateCall | boolean |  |

### getCompositingQuality() {#getCompositingQuality--}
```
public final int getCompositingQuality()
```


Gets the rendering quality of composited images drawn to this [Graphics](../../com.aspose.drawing/graphics).

**Returns:**
int - This property specifies a member of the `CompositingQuality`([.getCompositingQuality](../../null/\#getCompositingQuality)/[.setCompositingQuality(int)](../../null/\#setCompositingQuality-int-)) enumeration.
### setCompositingQuality(int value) {#setCompositingQuality-int-}
```
public final void setCompositingQuality(int value)
```


Sets the rendering quality of composited images drawn to this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the rendering quality of composited images drawn to this [Graphics](../../com.aspose.drawing/graphics). |

### getCompositingMode() {#getCompositingMode--}
```
public final int getCompositingMode()
```


Gets a value that specifies how composited images are drawn to this [Graphics](../../com.aspose.drawing/graphics).

Value: This property specifies a member of the `CompositingMode`([.getCompositingMode](../../null/\#getCompositingMode)/[.setCompositingMode(int)](../../null/\#setCompositingMode-int-)) enumeration. The default is [CompositingMode.SourceOver](../../com.aspose.drawing.drawing2d/compositingmode\#SourceOver).

**Returns:**
int - a value that specifies how composited images are drawn to this [Graphics](../../com.aspose.drawing/graphics).
### setCompositingMode(int value) {#setCompositingMode-int-}
```
public final void setCompositingMode(int value)
```


Sets a value that specifies how composited images are drawn to this [Graphics](../../com.aspose.drawing/graphics).

Value: This property specifies a member of the `CompositingMode`([.getCompositingMode](../../null/\#getCompositingMode)/[.setCompositingMode(int)](../../null/\#setCompositingMode-int-)) enumeration. The default is [CompositingMode.SourceOver](../../com.aspose.drawing.drawing2d/compositingmode\#SourceOver).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | a value that specifies how composited images are drawn to this [Graphics](../../com.aspose.drawing/graphics). |

### getClip() {#getClip--}
```
public final Region getClip()
```


Gets a [Region](../../com.aspose.drawing/region) that limits the drawing region of this [Graphics](../../com.aspose.drawing/graphics).

**Returns:**
[Region](../../com.aspose.drawing/region) - A [Region](../../com.aspose.drawing/region) that limits the portion of this [Graphics](../../com.aspose.drawing/graphics) that is currently available for com.aspose.drawing.
### setClip(Region value) {#setClip-com.aspose.drawing.Region-}
```
public final void setClip(Region value)
```


Sets a [Region](../../com.aspose.drawing/region) that limits the drawing region of this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Region](../../com.aspose.drawing/region) | a [Region](../../com.aspose.drawing/region) that limits the drawing region of this [Graphics](../../com.aspose.drawing/graphics). |

### setClip(Graphics g) {#setClip-com.aspose.drawing.Graphics-}
```
public final void setClip(Graphics g)
```


Sets the clipping region of this [Graphics](../../com.aspose.drawing/graphics) to the Clip property of the specified [Graphics](../../com.aspose.drawing/graphics)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| g | [Graphics](../../com.aspose.drawing/graphics) | The [Graphics](../../com.aspose.drawing/graphics) - to source the Clip property . |

### setClip(Rectangle rect) {#setClip-com.aspose.drawing.Rectangle-}
```
public final void setClip(Rectangle rect)
```


Sets the clipping region of this [Graphics](../../com.aspose.drawing/graphics) to the result of the specified operation combining the current clip region and the rectangle specified by a [Rectangle](../../com.aspose.drawing/rectangle) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | The [Rectangle](../../com.aspose.drawing/rectangle) structure to combine. |

### setClip(RectangleF rect) {#setClip-com.aspose.drawing.RectangleF-}
```
public final void setClip(RectangleF rect)
```


Sets the clipping region of this [Graphics](../../com.aspose.drawing/graphics) to the result of the specified operation combining the current clip region and the rectangle specified by a [RectangleF](../../com.aspose.drawing/rectanglef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | The [RectangleF](../../com.aspose.drawing/rectanglef) structure to combine. |

### setClip(GraphicsPath path) {#setClip-com.aspose.drawing.drawing2d.GraphicsPath-}
```
public final void setClip(GraphicsPath path)
```


Sets the clipping region of this [Graphics](../../com.aspose.drawing/graphics) to the specified [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) .

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | The [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) that represents the new clip region. |

### getClipBounds() {#getClipBounds--}
```
public final RectangleF getClipBounds()
```


Gets a [RectangleF](../../com.aspose.drawing/rectanglef) structure that bounds the clipping region of this [Graphics](../../com.aspose.drawing/graphics).

Value: The [RectangleF](../../com.aspose.drawing/rectanglef) structure that bounds the clipping region of this [Graphics](../../com.aspose.drawing/graphics).

**Returns:**
[RectangleF](../../com.aspose.drawing/rectanglef) - a [RectangleF](../../com.aspose.drawing/rectanglef) structure that bounds the clipping region of this [Graphics](../../com.aspose.drawing/graphics).
### isClipEmpty() {#isClipEmpty--}
```
public final boolean isClipEmpty()
```


Gets a value indicating whether the clipping region of this [Graphics](../../com.aspose.drawing/graphics) is empty.

Value: `true` if the clipping region of this [Graphics](../../com.aspose.drawing/graphics) is empty; otherwise, `false`.

**Returns:**
boolean - a value indicating whether the clipping region of this [Graphics](../../com.aspose.drawing/graphics) is empty.
### getVisibleClipBounds() {#getVisibleClipBounds--}
```
public final RectangleF getVisibleClipBounds()
```


Gets the bounding rectangle of the visible clipping region of this [Graphics](../../com.aspose.drawing/graphics).

Value: A [RectangleF](../../com.aspose.drawing/rectanglef) structure that represents a bounding rectangle for the visible clipping region of this [Graphics](../../com.aspose.drawing/graphics).

**Returns:**
[RectangleF](../../com.aspose.drawing/rectanglef) - the bounding rectangle of the visible clipping region of this [Graphics](../../com.aspose.drawing/graphics).
### isVisibleClipEmpty() {#isVisibleClipEmpty--}
```
public final boolean isVisibleClipEmpty()
```


Gets a value indicating whether the visible clipping region of this [Graphics](../../com.aspose.drawing/graphics) is empty.

Value: `true` if the visible portion of the clipping region of this [Graphics](../../com.aspose.drawing/graphics) is empty; otherwise, `false`.

**Returns:**
boolean - a value indicating whether the visible clipping region of this [Graphics](../../com.aspose.drawing/graphics) is empty.
### getDpiX() {#getDpiX--}
```
public final float getDpiX()
```


Gets the horizontal resolution of this [Graphics](../../com.aspose.drawing/graphics).

**Returns:**
float - The value, in dots per inch, for the horizontal resolution supported by this [Graphics](../../com.aspose.drawing/graphics).
### getDpiY() {#getDpiY--}
```
public final float getDpiY()
```


Gets the vertical resolution of this [Graphics](../../com.aspose.drawing/graphics).

**Returns:**
float - The value, in dots per inch, for the vertical resolution supported by this [Graphics](../../com.aspose.drawing/graphics).
### getInterpolationMode() {#getInterpolationMode--}
```
public final int getInterpolationMode()
```


Gets the interpolation mode associated with this Graphics.

**Returns:**
int - the interpolation mode associated with this Graphics.
### setInterpolationMode(int value) {#setInterpolationMode-int-}
```
public final void setInterpolationMode(int value)
```


Sets the interpolation mode associated with this Graphics.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the interpolation mode associated with this Graphics. |

### getPageScale() {#getPageScale--}
```
public final float getPageScale()
```


Gets the scaling between world units and page units for this [Graphics](../../com.aspose.drawing/graphics).

**Returns:**
float - This property specifies a value for the scaling between world units and page units for this [Graphics](../../com.aspose.drawing/graphics).
### setPageScale(float value) {#setPageScale-float-}
```
public final void setPageScale(float value)
```


Sets the scaling between world units and page units for this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | the scaling between world units and page units for this [Graphics](../../com.aspose.drawing/graphics). |

### getPageUnit() {#getPageUnit--}
```
public final int getPageUnit()
```


Gets the unit of measure used for page coordinates in this [Graphics](../../com.aspose.drawing/graphics).

**Returns:**
int - One of the [GraphicsUnit](../../com.aspose.drawing/graphicsunit) values other than `F:GraphicsUnit.World`.
### setPageUnit(int value) {#setPageUnit-int-}
```
public final void setPageUnit(int value)
```


Sets the unit of measure used for page coordinates in this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the unit of measure used for page coordinates in this [Graphics](../../com.aspose.drawing/graphics). |

### getPixelOffsetMode() {#getPixelOffsetMode--}
```
public final int getPixelOffsetMode()
```


Gets a value specifying how pixels are offset during rendering of this [Graphics](../../com.aspose.drawing/graphics).

**Returns:**
int - This property specifies a member of the `PixelOffsetMode`([.getPixelOffsetMode](../../null/\#getPixelOffsetMode)/[.setPixelOffsetMode(int)](../../null/\#setPixelOffsetMode-int-)) enumeration.
### setPixelOffsetMode(int value) {#setPixelOffsetMode-int-}
```
public final void setPixelOffsetMode(int value)
```


Sets a value specifying how pixels are offset during rendering of this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | a value specifying how pixels are offset during rendering of this [Graphics](../../com.aspose.drawing/graphics). |

### getRenderingOrigin() {#getRenderingOrigin--}
```
public final Point getRenderingOrigin()
```


Gets the rendering origin of this [Graphics](../../com.aspose.drawing/graphics) for dithering and for hatch brushes.

Value: A [Point](../../com.aspose.drawing/point) structure that represents the dither origin for 8-bits-per-pixel and 16-bits-per-pixel dithering and is also used to set the origin for hatch brushes.

**Returns:**
[Point](../../com.aspose.drawing/point) - the rendering origin of this [Graphics](../../com.aspose.drawing/graphics) for dithering and for hatch brushes.
### setRenderingOrigin(Point value) {#setRenderingOrigin-com.aspose.drawing.Point-}
```
public final void setRenderingOrigin(Point value)
```


Sets the rendering origin of this [Graphics](../../com.aspose.drawing/graphics) for dithering and for hatch brushes.

Value: A [Point](../../com.aspose.drawing/point) structure that represents the dither origin for 8-bits-per-pixel and 16-bits-per-pixel dithering and is also used to set the origin for hatch brushes.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Point](../../com.aspose.drawing/point) | the rendering origin of this [Graphics](../../com.aspose.drawing/graphics) for dithering and for hatch brushes. |

### getSmoothingMode() {#getSmoothingMode--}
```
public final int getSmoothingMode()
```


Gets the rendering quality for this Graphics.

**Returns:**
int - the rendering quality for this Graphics.
### setSmoothingMode(int value) {#setSmoothingMode-int-}
```
public final void setSmoothingMode(int value)
```


Sets the rendering quality for this Graphics.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the rendering quality for this Graphics. |

### getTextContrast() {#getTextContrast--}
```
public final int getTextContrast()
```


Gets the gamma correction value for rendering text.

Value: The gamma correction value used for rendering antialiased and ClearType text.

**Returns:**
int - the gamma correction value for rendering text.
### setTextContrast(int value) {#setTextContrast-int-}
```
public final void setTextContrast(int value)
```


Sets the gamma correction value for rendering text.

Value: The gamma correction value used for rendering antialiased and ClearType text.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the gamma correction value for rendering text. |

### getTextRenderingHint() {#getTextRenderingHint--}
```
public final int getTextRenderingHint()
```


Gets the rendering mode for text associated with this [Graphics](../../com.aspose.drawing/graphics).

**Returns:**
int - the rendering mode for text associated with this [Graphics](../../com.aspose.drawing/graphics).
### setTextRenderingHint(int value) {#setTextRenderingHint-int-}
```
public final void setTextRenderingHint(int value)
```


Sets the rendering mode for text associated with this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the rendering mode for text associated with this [Graphics](../../com.aspose.drawing/graphics). |

### getTransform() {#getTransform--}
```
public final Matrix getTransform()
```


Gets a copy of the geometric world transformation for this [Graphics](../../com.aspose.drawing/graphics).

**Returns:**
[Matrix](../../com.aspose.drawing.drawing2d/matrix) - A copy of the [Matrix](../../com.aspose.drawing.drawing2d/matrix) that represents the geometric world transformation for this [Graphics](../../com.aspose.drawing/graphics).
### setTransform(Matrix value) {#setTransform-com.aspose.drawing.drawing2d.Matrix-}
```
public final void setTransform(Matrix value)
```


Sets a copy of the geometric world transformation for this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | a copy of the geometric world transformation for this [Graphics](../../com.aspose.drawing/graphics). |

### copyFromScreen(Point upperLeftSource, Point upperLeftDestination, Size blockRegionSize) {#copyFromScreen-com.aspose.drawing.Point-com.aspose.drawing.Point-com.aspose.drawing.Size-}
```
public final void copyFromScreen(Point upperLeftSource, Point upperLeftDestination, Size blockRegionSize)
```


Performs a bit-block transfer of color data, corresponding to a rectangle of pixels, from the screen to the drawing surface of the [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| upperLeftSource | [Point](../../com.aspose.drawing/point) | The point at the upper-left corner of the source rectangle. |
| upperLeftDestination | [Point](../../com.aspose.drawing/point) | The point at the upper-left corner of the destination rectangle. |
| blockRegionSize | [Size](../../com.aspose.drawing/size) | The size of the area to be transferred. |

### copyFromScreen(int sourceX, int sourceY, int destinationX, int destinationY, Size blockRegionSize, int copyPixelOperation) {#copyFromScreen-int-int-int-int-com.aspose.drawing.Size-int-}
```
public final void copyFromScreen(int sourceX, int sourceY, int destinationX, int destinationY, Size blockRegionSize, int copyPixelOperation)
```


Performs a bit-block transfer of the color data, corresponding to a rectangle of pixels, from the screen to the drawing surface of the [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sourceX | int | The x-coordinate of the point at the upper-left corner of the source rectangle. |
| sourceY | int | The y-coordinate of the point at the upper-left corner of the source rectangle. |
| destinationX | int | The x-coordinate of the point at the upper-left corner of the destination rectangle. |
| destinationY | int | The y-coordinate of the point at the upper-left corner of the destination rectangle. |
| blockRegionSize | [Size](../../com.aspose.drawing/size) | The size of the area to be transferred. |
| copyPixelOperation | int | One of the [CopyPixelOperation](../../com.aspose.drawing/copypixeloperation) values. |

### copyFromScreen(Point upperLeftSource, Point upperLeftDestination, Size blockRegionSize, int copyPixelOperation) {#copyFromScreen-com.aspose.drawing.Point-com.aspose.drawing.Point-com.aspose.drawing.Size-int-}
```
public final void copyFromScreen(Point upperLeftSource, Point upperLeftDestination, Size blockRegionSize, int copyPixelOperation)
```


Performs a bit-block transfer of color data, corresponding to a rectangle of pixels, from the screen to the drawing surface of the [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| upperLeftSource | [Point](../../com.aspose.drawing/point) | The point at the upper-left corner of the source rectangle. |
| upperLeftDestination | [Point](../../com.aspose.drawing/point) | The point at the upper-left corner of the destination rectangle. |
| blockRegionSize | [Size](../../com.aspose.drawing/size) | The size of the area to be transferred.. |
| copyPixelOperation | int | ne of the [CopyPixelOperation](../../com.aspose.drawing/copypixeloperation) values. |

### dispose() {#dispose--}
```
public final void dispose()
```


Releases all resources used by this Graphics.

### clear(Color color) {#clear-com.aspose.drawing.Color-}
```
public final void clear(Color color)
```


Clears the entire drawing surface and fills it with the specified background color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| color | [Color](../../com.aspose.drawing/color) | Color structure that represents the background color of the drawing surface. |

### drawArc(Pen pen, RectangleF rect, float startAngle, float sweepAngle) {#drawArc-com.aspose.drawing.Pen-com.aspose.drawing.RectangleF-float-float-}
```
public final void drawArc(Pen pen, RectangleF rect, float startAngle, float sweepAngle)
```


Draws an arc representing a portion of an ellipse specified by a RectangleF structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | Pen that determines the color, width, and style of the arc. |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | RectangleF structure that defines the boundaries of the ellipse. |
| startAngle | float | Angle in degrees measured clockwise from the x-axis to the starting point of the arc. |
| sweepAngle | float | Angle in degrees measured clockwise from the startAngle parameter to ending point of the arc. |

### drawArc(Pen pen, float x, float y, float width, float height, float startAngle, float sweepAngle) {#drawArc-com.aspose.drawing.Pen-float-float-float-float-float-float-}
```
public final void drawArc(Pen pen, float x, float y, float width, float height, float startAngle, float sweepAngle)
```


Draws an arc representing a portion of an ellipse specified by a pair of coordinates, a width, and a height.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | Pen that determines the color, width, and style of the arc. |
| x | float | The x-coordinate of the upper-left corner of the rectangle that defines the ellipse. |
| y | float | The y-coordinate of the upper-left corner of the rectangle that defines the ellipse. |
| width | float | Width of the rectangle that defines the ellipse. |
| height | float | Height of the rectangle that defines the ellipse. |
| startAngle | float | Angle in degrees measured clockwise from the x-axis to the starting point of the arc. |
| sweepAngle | float | Angle in degrees measured clockwise from the startAngle parameter to ending point of the arc. |

### drawBezier(Pen pen, PointF pt1, PointF pt2, PointF pt3, PointF pt4) {#drawBezier-com.aspose.drawing.Pen-com.aspose.drawing.PointF-com.aspose.drawing.PointF-com.aspose.drawing.PointF-com.aspose.drawing.PointF-}
```
public final void drawBezier(Pen pen, PointF pt1, PointF pt2, PointF pt3, PointF pt4)
```


Draws a Bézier spline defined by four PointF structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | Pen that determines the color, width, and style of the curve. |
| pt1 | [PointF](../../com.aspose.drawing/pointf) | PointF structure that represents the starting point of the curve. |
| pt2 | [PointF](../../com.aspose.drawing/pointf) | PointF structure that represents the first control point for the curve. |
| pt3 | [PointF](../../com.aspose.drawing/pointf) | PointF structure that represents the second control point for the curve. |
| pt4 | [PointF](../../com.aspose.drawing/pointf) | PointF structure that represents the ending point of the curve. |

### drawBezier(Pen pen, float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {#drawBezier-com.aspose.drawing.Pen-float-float-float-float-float-float-float-float-}
```
public final void drawBezier(Pen pen, float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4)
```


Draws a Bézier spline defined by four ordered pairs of coordinates that represent points.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | Pen that determines the color, width, and style of the curve. |
| x1 | float | The x-coordinate of the starting point of the curve. |
| y1 | float | The y-coordinate of the starting point of the curve. |
| x2 | float | The x-coordinate of the first control point of the curve. |
| y2 | float | The y-coordinate of the first control point of the curve. |
| x3 | float | The x-coordinate of the second control point of the curve. |
| y3 | float | The y-coordinate of the second control point of the curve. |
| x4 | float | The x-coordinate of the ending point of the curve. |
| y4 | float | The y-coordinate of the ending point of the curve. |

### drawBeziers(Pen pen, PointF[] points) {#drawBeziers-com.aspose.drawing.Pen-com.aspose.drawing.PointF---}
```
public final void drawBeziers(Pen pen, PointF[] points)
```


Draws a series of Bézier splines from an array of [Point](../../com.aspose.drawing/point) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and style of the curve. |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of [Point](../../com.aspose.drawing/point) structures that represent the points that determine the curve. The number of points in the array should be a multiple of 3 plus 1, such as 4, 7, or 10. |

### drawBeziers(Pen pen, Point[] points) {#drawBeziers-com.aspose.drawing.Pen-com.aspose.drawing.Point---}
```
public final void drawBeziers(Pen pen, Point[] points)
```


Draws a series of Bézier splines from an array of [PointF](../../com.aspose.drawing/pointf) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and style of the curve. |
| points | [Point\[\]](../../com.aspose.drawing/point) | Array of [PointF](../../com.aspose.drawing/pointf) structures that represent the points that determine the curve. The number of points in the array should be a multiple of 3 plus 1, such as 4, 7, or 10. |

### drawClosedCurve(Pen pen, PointF[] points, float tension, int fillmode) {#drawClosedCurve-com.aspose.drawing.Pen-com.aspose.drawing.PointF---float-int-}
```
public final void drawClosedCurve(Pen pen, PointF[] points, float tension, int fillmode)
```


Draws a closed cardinal spline defined by an array of PointF structures using a specified tension.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and height of the curve. |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of [PointF](../../com.aspose.drawing/pointf) structures that define the spline. |
| tension | float | Value greater than or equal to 0.0F that specifies the tension of the curve. |
| fillmode | int | Member of the FillMode enumeration that determines how the curve is filled. This parameter is required but is ignored. |

### drawClosedCurve(Pen pen, PointF[] points) {#drawClosedCurve-com.aspose.drawing.Pen-com.aspose.drawing.PointF---}
```
public final void drawClosedCurve(Pen pen, PointF[] points)
```


Draws a closed cardinal spline defined by an array of [PointF](../../com.aspose.drawing/pointf) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and height of the curve. |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of [PointF](../../com.aspose.drawing/pointf) structures that define the spline. |

### drawClosedCurve(Pen pen, Point[] points, float tension, int fillmode) {#drawClosedCurve-com.aspose.drawing.Pen-com.aspose.drawing.Point---float-int-}
```
public final void drawClosedCurve(Pen pen, Point[] points, float tension, int fillmode)
```


Draws a closed cardinal spline defined by an array of [Point](../../com.aspose.drawing/point) structures using a specified tension.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and height of the curve. |
| points | [Point\[\]](../../com.aspose.drawing/point) | Array of [Point](../../com.aspose.drawing/point) structures that define the spline. |
| tension | float | Value greater than or equal to 0.0F that specifies the tension of the curve. |
| fillmode | int | Member of the FillMode enumeration that determines how the curve is filled. This parameter is required but is ignored. |

### drawClosedCurve(Pen pen, Point[] points) {#drawClosedCurve-com.aspose.drawing.Pen-com.aspose.drawing.Point---}
```
public final void drawClosedCurve(Pen pen, Point[] points)
```


Draws a closed cardinal spline defined by an array of [Point](../../com.aspose.drawing/point) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and height of the curve. |
| points | [Point\[\]](../../com.aspose.drawing/point) | Array of [Point](../../com.aspose.drawing/point) structures that define the spline. |

### drawCurve(Pen pen, PointF[] points) {#drawCurve-com.aspose.drawing.Pen-com.aspose.drawing.PointF---}
```
public final void drawCurve(Pen pen, PointF[] points)
```


Draws a cardinal spline through a specified array of [PointF](../../com.aspose.drawing/pointf) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and style of the curve. |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of [PointF](../../com.aspose.drawing/pointf) structures that define the spline. |

### drawCurve(Pen pen, Point[] points) {#drawCurve-com.aspose.drawing.Pen-com.aspose.drawing.Point---}
```
public final void drawCurve(Pen pen, Point[] points)
```


Draws a cardinal spline through a specified array of [Point](../../com.aspose.drawing/point) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and style of the curve. |
| points | [Point\[\]](../../com.aspose.drawing/point) | Array of [Point](../../com.aspose.drawing/point) structures that define the spline. |

### drawCurve(Pen pen, Point[] points, float tension) {#drawCurve-com.aspose.drawing.Pen-com.aspose.drawing.Point---float-}
```
public final void drawCurve(Pen pen, Point[] points, float tension)
```


Draws a cardinal spline through a specified array of [Point](../../com.aspose.drawing/point) structures using a specified tension.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and style of the curve. |
| points | [Point\[\]](../../com.aspose.drawing/point) | Array of [Point](../../com.aspose.drawing/point) structures that define the spline. |
| tension | float | Value greater than or equal to 0.0F that specifies the tension of the curve. |

### drawCurve(Pen pen, PointF[] points, int offset, int numberOfSegments) {#drawCurve-com.aspose.drawing.Pen-com.aspose.drawing.PointF---int-int-}
```
public final void drawCurve(Pen pen, PointF[] points, int offset, int numberOfSegments)
```


Draws a cardinal spline through a specified array of [PointF](../../com.aspose.drawing/pointf) structures using a specified tension. The drawing begins offset from the beginning of the array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and style of the curve. |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of [PointF](../../com.aspose.drawing/pointf) structures that define the spline. |
| offset | int | Offset from the first element in the array of the points parameter to the starting point in the curve. |
| numberOfSegments | int | Number of segments after the starting point to include in the curve. |

### drawCurve(Pen pen, PointF[] points, int offset, int numberOfSegments, float tension) {#drawCurve-com.aspose.drawing.Pen-com.aspose.drawing.PointF---int-int-float-}
```
public final void drawCurve(Pen pen, PointF[] points, int offset, int numberOfSegments, float tension)
```


Draws a cardinal spline through a specified array of [PointF](../../com.aspose.drawing/pointf) structures using a specified tension. The drawing begins offset from the beginning of the array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and style of the curve. |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of [PointF](../../com.aspose.drawing/pointf) structures that define the spline. |
| offset | int | Offset from the first element in the array of the points parameter to the starting point in the curve. |
| numberOfSegments | int | Number of segments after the starting point to include in the curve. |
| tension | float | Value greater than or equal to 0.0F that specifies the tension of the curve. |

### drawCurve(Pen pen, Point[] points, int offset, int numberOfSegments, float tension) {#drawCurve-com.aspose.drawing.Pen-com.aspose.drawing.Point---int-int-float-}
```
public final void drawCurve(Pen pen, Point[] points, int offset, int numberOfSegments, float tension)
```


Draws a cardinal spline through a specified array of [Point](../../com.aspose.drawing/point) structures using a specified tension. The drawing begins offset from the beginning of the array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and style of the curve. |
| points | [Point\[\]](../../com.aspose.drawing/point) | Array of [Point](../../com.aspose.drawing/point) structures that define the spline. |
| offset | int | Offset from the first element in the array of the points parameter to the starting point in the curve. |
| numberOfSegments | int | Number of segments after the starting point to include in the curve. |
| tension | float | Value greater than or equal to 0.0F that specifies the tension of the curve. |

### drawCurve(Pen pen, PointF[] points, float tension) {#drawCurve-com.aspose.drawing.Pen-com.aspose.drawing.PointF---float-}
```
public final void drawCurve(Pen pen, PointF[] points, float tension)
```


Draws a cardinal spline through a specified array of [PointF](../../com.aspose.drawing/pointf) structures using a specified tension.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and style of the curve. |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of [PointF](../../com.aspose.drawing/pointf) structures that define the spline. |
| tension | float | Value greater than or equal to 0.0F that specifies the tension of the curve. |

### drawEllipse(Pen pen, RectangleF rect) {#drawEllipse-com.aspose.drawing.Pen-com.aspose.drawing.RectangleF-}
```
public final void drawEllipse(Pen pen, RectangleF rect)
```


Draws an ellipse defined by a bounding RectangleF.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | Pen that determines the color, width, and style of the ellipse. |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | RectangleF structure that defines the boundaries of the ellipse. |

### drawEllipse(Pen pen, float x, float y, float width, float height) {#drawEllipse-com.aspose.drawing.Pen-float-float-float-float-}
```
public final void drawEllipse(Pen pen, float x, float y, float width, float height)
```


Draws an ellipse defined by a bounding rectangle specified by a pair of coordinates, a height, and a width.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and style of the ellipse. |
| x | float | The x-coordinate of the upper-left corner of the bounding rectangle that defines the ellipse. |
| y | float | The y-coordinate of the upper-left corner of the bounding rectangle that defines the ellipse. |
| width | float | Width of the bounding rectangle that defines the ellipse. |
| height | float | Height of the bounding rectangle that defines the ellipse. |

### drawIcon(Icon icon, int x, int y) {#drawIcon-com.aspose.drawing.Icon-int-int-}
```
public final void drawIcon(Icon icon, int x, int y)
```


Draws the image represented by the specified [Icon](../../com.aspose.drawing/icon) at the specified coordinates.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| icon | [Icon](../../com.aspose.drawing/icon) | [Icon](../../com.aspose.drawing/icon) to draw. |
| x | int | The x-coordinate of the upper-left corner of the drawn image. |
| y | int | The y-coordinate of the upper-left corner of the drawn image. |

### drawIcon(Icon icon, Rectangle targetRect) {#drawIcon-com.aspose.drawing.Icon-com.aspose.drawing.Rectangle-}
```
public final void drawIcon(Icon icon, Rectangle targetRect)
```


Draws the image represented by the specified [Icon](../../com.aspose.drawing/icon) within the area specified by a [Rectangle](../../com.aspose.drawing/rectangle) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| icon | [Icon](../../com.aspose.drawing/icon) | [Icon](../../com.aspose.drawing/icon) to draw. |
| targetRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the location and size of the resulting image on the display surface. The image contained in the `icon` parameter is scaled to the dimensions of this rectangular area. |

### drawIconUnstretched(Icon icon, Rectangle targetRect) {#drawIconUnstretched-com.aspose.drawing.Icon-com.aspose.drawing.Rectangle-}
```
public final void drawIconUnstretched(Icon icon, Rectangle targetRect)
```


Draws the image represented by the specified [Icon](../../com.aspose.drawing/icon) without scaling the image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| icon | [Icon](../../com.aspose.drawing/icon) | [Icon](../../com.aspose.drawing/icon) to draw. |
| targetRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the location and size of the resulting image. The image is not scaled to fit this rectangle, but retains its original size. If the image is larger than the rectangle, it is clipped to fit inside it. |

### drawImage(Image image, int x, int y) {#drawImage-com.aspose.drawing.Image-int-int-}
```
public final void drawImage(Image image, int x, int y)
```


Draws the specified image, using its original physical size, at the location specified by a coordinate pair.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | Image to draw. |
| x | int | The x-coordinate of the upper-left corner of the drawn image. |
| y | int | The y-coordinate of the upper-left corner of the drawn image. |

### drawImage(Image image, float x, float y) {#drawImage-com.aspose.drawing.Image-float-float-}
```
public final void drawImage(Image image, float x, float y)
```


Draws the specified [Image](../../com.aspose.drawing/image), using its original physical size, at the specified location.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | [Image](../../com.aspose.drawing/image) to draw. |
| x | float | The x-coordinate of the upper-left corner of the drawn image. |
| y | float | The y-coordinate of the upper-left corner of the drawn image. |

### drawImage(Image image, Point point) {#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Point-}
```
public final void drawImage(Image image, Point point)
```


Draws the specified Image, using its original physical size, at the specified location.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | Image to draw. |
| point | [Point](../../com.aspose.drawing/point) | Point structure that represents the location of the upper-left corner of the drawn image. |

### drawImage(Image image, Point[] destPoints) {#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Point---}
```
public final void drawImage(Image image, Point[] destPoints)
```


Draws the specified `\\u0415:Image` at the specified location and with the specified shape and size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | [Image](../../com.aspose.drawing/image) to draw. |
| destPoints | [Point\[\]](../../com.aspose.drawing/point) | Array of three [Point](../../com.aspose.drawing/point) structures that define a parallelogram. |

### drawImage(Image image, PointF point) {#drawImage-com.aspose.drawing.Image-com.aspose.drawing.PointF-}
```
public final void drawImage(Image image, PointF point)
```


Draws the specified [Image](../../com.aspose.drawing/image), using its original physical size, at the specified location.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | [Image](../../com.aspose.drawing/image) to draw. |
| point | [PointF](../../com.aspose.drawing/pointf) | [PointF](../../com.aspose.drawing/pointf) structure that represents the upper-left corner of the drawn image. |

### drawImage(Image image, PointF[] destPoints) {#drawImage-com.aspose.drawing.Image-com.aspose.drawing.PointF---}
```
public final void drawImage(Image image, PointF[] destPoints)
```


Draws the specified [Image](../../com.aspose.drawing/image) at the specified location and with the specified shape and size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | [Image](../../com.aspose.drawing/image) to draw. |
| destPoints | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of three [PointF](../../com.aspose.drawing/pointf) structures that define a parallelogram. |

### drawImage(Image image, int x, int y, int width, int height) {#drawImage-com.aspose.drawing.Image-int-int-int-int-}
```
public final void drawImage(Image image, int x, int y, int width, int height)
```


Draws the specified Image at the specified location and with the specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | Image to draw. |
| x | int | The x-coordinate of the upper-left corner of the drawn image. |
| y | int | The y-coordinate of the upper-left corner of the drawn image. |
| width | int | Width of the drawn image. |
| height | int | Height of the drawn image. |

### drawImage(Image image, Rectangle rect) {#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Rectangle-}
```
public final void drawImage(Image image, Rectangle rect)
```


Draws the specified Image at the specified location and with the specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | The Image to draw. |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | The rectangle that specifies the location and size of the drawn image. |

### drawImage(Image image, RectangleF rect) {#drawImage-com.aspose.drawing.Image-com.aspose.drawing.RectangleF-}
```
public final void drawImage(Image image, RectangleF rect)
```


Draws the specified Image at the specified location and with the specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | The Image to draw. |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | The rectangle that specifies the location and size of the drawn image. |

### drawImage(Image image, float x, float y, float width, float height) {#drawImage-com.aspose.drawing.Image-float-float-float-float-}
```
public final void drawImage(Image image, float x, float y, float width, float height)
```


Draws the specified [Image](../../com.aspose.drawing/image), using its original physical size, at the specified location and with the specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | [Image](../../com.aspose.drawing/image) to draw. |
| x | float | The x-coordinate of the upper-left corner of the drawn image. |
| y | float | The y-coordinate of the upper-left corner of the drawn image. |
| width | float | The width of the drawn image. |
| height | float | The height of the drawn image. |

### drawImage(Image image, int x, int y, Rectangle srcRect, int srcUnit) {#drawImage-com.aspose.drawing.Image-int-int-com.aspose.drawing.Rectangle-int-}
```
public final void drawImage(Image image, int x, int y, Rectangle srcRect, int srcUnit)
```


Draws a portion of an image at a specified location.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | [Image](../../com.aspose.drawing/image) to draw. |
| x | int | The x-coordinate of the upper-left corner of the drawn image. |
| y | int | The y-coordinate of the upper-left corner of the drawn image. |
| srcRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the portion of the image object to draw. |
| srcUnit | int | Member of the [GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the units of measure used by the srcRect parameter. |

### drawImage(Image image, float x, float y, RectangleF srcRect, int srcUnit) {#drawImage-com.aspose.drawing.Image-float-float-com.aspose.drawing.RectangleF-int-}
```
public final void drawImage(Image image, float x, float y, RectangleF srcRect, int srcUnit)
```


Draws a portion of an image at a specified location.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | [Image](../../com.aspose.drawing/image) to draw. |
| x | float | The x-coordinate of the upper-left corner of the drawn image. |
| y | float | The y-coordinate of the upper-left corner of the drawn image. |
| srcRect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the portion of the image object to draw. |
| srcUnit | int | Member of the [GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the units of measure used by the srcRect parameter. |

### drawImage(Image image, PointF[] destPoints, RectangleF srcRect, int srcUnit) {#drawImage-com.aspose.drawing.Image-com.aspose.drawing.PointF---com.aspose.drawing.RectangleF-int-}
```
public final void drawImage(Image image, PointF[] destPoints, RectangleF srcRect, int srcUnit)
```


Draws the specified portion of the specified Image at the specified location and with the specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | Image to draw. |
| destPoints | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of three PointF structures that define a parallelogram. |
| srcRect | [RectangleF](../../com.aspose.drawing/rectanglef) | RectangleF structure that specifies the portion of the image object to draw. |
| srcUnit | int | Member of the GraphicsUnit enumeration that specifies the units of measure used by the `srcRect` parameter. |

### drawImage(Image image, Point[] destPoints, Rectangle srcRect, int srcUnit) {#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Point---com.aspose.drawing.Rectangle-int-}
```
public final void drawImage(Image image, Point[] destPoints, Rectangle srcRect, int srcUnit)
```


Draws the specified portion of the specified [Image](../../com.aspose.drawing/image) at the specified location and with the specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | [Image](../../com.aspose.drawing/image) to draw. |
| destPoints | [Point\[\]](../../com.aspose.drawing/point) | Array of three [Point](../../com.aspose.drawing/point) structures that define a parallelogram. |
| srcRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the portion of the image object to draw. |
| srcUnit | int | Member of the [GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the units of measure used by the `srcRect` parameter. |

### drawImage(Image image, Point[] destPoints, Rectangle srcRect, int srcUnit, ImageAttributes imageAttr) {#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Point---com.aspose.drawing.Rectangle-int-com.aspose.drawing.imaging.ImageAttributes-}
```
public final void drawImage(Image image, Point[] destPoints, Rectangle srcRect, int srcUnit, ImageAttributes imageAttr)
```


Draws the specified portion of the specified [Image](../../com.aspose.drawing/image) at the specified location and with the specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | [Image](../../com.aspose.drawing/image) to draw. |
| destPoints | [Point\[\]](../../com.aspose.drawing/point) | Array of three [Point](../../com.aspose.drawing/point) structures that define a parallelogram. |
| srcRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the portion of the image object to draw. |
| srcUnit | int | Member of the [GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the units of measure used by the `srcRect` parameter. |
| imageAttr | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) that specifies recoloring and gamma information for the image object. |

### drawImage(Image image, PointF[] destPoints, RectangleF srcRect, int srcUnit, ImageAttributes imageAttr) {#drawImage-com.aspose.drawing.Image-com.aspose.drawing.PointF---com.aspose.drawing.RectangleF-int-com.aspose.drawing.imaging.ImageAttributes-}
```
public final void drawImage(Image image, PointF[] destPoints, RectangleF srcRect, int srcUnit, ImageAttributes imageAttr)
```


Draws the specified portion of the specified Image at the specified location and with the specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | Image to draw. |
| destPoints | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of three PointF structures that define a parallelogram. |
| srcRect | [RectangleF](../../com.aspose.drawing/rectanglef) | RectangleF structure that specifies the portion of the image object to draw. |
| srcUnit | int | Member of the GraphicsUnit enumeration that specifies the units of measure used by the `srcRect` parameter. |
| imageAttr | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) | ImageAttributes that specifies recoloring and gamma information for the image object. |

### drawImage(Image image, Rectangle destRect, Rectangle srcRect, int srcUnit) {#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-int-}
```
public final void drawImage(Image image, Rectangle destRect, Rectangle srcRect, int srcUnit)
```


Draws the specified portion of the specified Image at the specified location and with the specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | Image to draw. |
| destRect | [Rectangle](../../com.aspose.drawing/rectangle) | Rectangle structure that specifies the location and size of the drawn image. The image is scaled to fit the rectangle. |
| srcRect | [Rectangle](../../com.aspose.drawing/rectangle) | Rectangle structure that specifies the portion of the image object to draw. |
| srcUnit | int | Member of the GraphicsUnit enumeration that specifies the units of measure used by the `srcRect` parameter. |

### drawImage(Image image, Rectangle destRect, int srcX, int srcY, int srcWidth, int srcHeight, int srcUnit, ImageAttributes imageAttr) {#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Rectangle-int-int-int-int-int-com.aspose.drawing.imaging.ImageAttributes-}
```
public final void drawImage(Image image, Rectangle destRect, int srcX, int srcY, int srcWidth, int srcHeight, int srcUnit, ImageAttributes imageAttr)
```


Draws the specified portion of the specified Image at the specified location and with the specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | Image to draw. |
| destRect | [Rectangle](../../com.aspose.drawing/rectangle) | Rectangle structure that specifies the location and size of the drawn image. The image is scaled to fit the rectangle. |
| srcX | int | The x-coordinate of the upper-left corner of the portion of the source image to draw. |
| srcY | int | The y-coordinate of the upper-left corner of the portion of the source image to draw. |
| srcWidth | int | Width of the portion of the source image to draw. |
| srcHeight | int | Height of the portion of the source image to draw. |
| srcUnit | int | Member of the GraphicsUnit enumeration that specifies the units of measure used to determine the source rectangle. |
| imageAttr | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) | ImageAttributes that specifies recoloring and gamma information for the image object. |

### drawImage(Image image, RectangleF destRect, RectangleF srcRect, int srcUnit) {#drawImage-com.aspose.drawing.Image-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-int-}
```
public final void drawImage(Image image, RectangleF destRect, RectangleF srcRect, int srcUnit)
```


Draws the specified portion of the specified Image at the specified location and with the specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | Image to draw. |
| destRect | [RectangleF](../../com.aspose.drawing/rectanglef) | RectangleF structure that specifies the location and size of the drawn image. The image is scaled to fit the rectangle. |
| srcRect | [RectangleF](../../com.aspose.drawing/rectanglef) | RectangleF structure that specifies the portion of the image object to draw. |
| srcUnit | int | Member of the GraphicsUnit enumeration that specifies the units of measure used by the `srcRect` parameter. |

### drawImage(Image image, Rectangle destRect, int srcX, int srcY, int srcWidth, int srcHeight, int srcUnit) {#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Rectangle-int-int-int-int-int-}
```
public final void drawImage(Image image, Rectangle destRect, int srcX, int srcY, int srcWidth, int srcHeight, int srcUnit)
```


Draws the specified portion of the specified [Image](../../com.aspose.drawing/image) at the specified location and with the specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | [Image](../../com.aspose.drawing/image) to draw. |
| destRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the location and size of the drawn image. The image is scaled to fit the rectangle. |
| srcX | int | The x-coordinate of the upper-left corner of the portion of the source image to draw. |
| srcY | int | The y-coordinate of the upper-left corner of the portion of the source image to draw. |
| srcWidth | int | Width of the portion of the source image to draw. |
| srcHeight | int | Height of the portion of the source image to draw |
| srcUnit | int | Member of the [GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the units of measure used to determine the source rectangle. |

### drawImage(Image image, Rectangle destRect, float srcX, float srcY, float srcWidth, float srcHeight, int srcUnit) {#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Rectangle-float-float-float-float-int-}
```
public final void drawImage(Image image, Rectangle destRect, float srcX, float srcY, float srcWidth, float srcHeight, int srcUnit)
```


Draws the specified portion of the specified [Image](../../com.aspose.drawing/image) at the specified location and with the specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | [Image](../../com.aspose.drawing/image) to draw. |
| destRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the location and size of the drawn image. The image is scaled to fit the rectangle. |
| srcX | float | The x-coordinate of the upper-left corner of the portion of the source image to draw. |
| srcY | float | The y-coordinate of the upper-left corner of the portion of the source image to draw. |
| srcWidth | float | Width of the portion of the source image to draw. |
| srcHeight | float | Height of the portion of the source image to draw |
| srcUnit | int | Member of the [GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the units of measure used to determine the source rectangle. |

### drawImage(Image image, Rectangle destRect, float srcX, float srcY, float srcWidth, float srcHeight, int srcUnit, ImageAttributes imageAttrs) {#drawImage-com.aspose.drawing.Image-com.aspose.drawing.Rectangle-float-float-float-float-int-com.aspose.drawing.imaging.ImageAttributes-}
```
public final void drawImage(Image image, Rectangle destRect, float srcX, float srcY, float srcWidth, float srcHeight, int srcUnit, ImageAttributes imageAttrs)
```


Draws the specified portion of the specified [Image](../../com.aspose.drawing/image) at the specified location and with the specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | [Image](../../com.aspose.drawing/image) to draw. |
| destRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the location and size of the drawn image. The image is scaled to fit the rectangle. |
| srcX | float | The x-coordinate of the upper-left corner of the portion of the source image to draw. |
| srcY | float | The y-coordinate of the upper-left corner of the portion of the source image to draw. |
| srcWidth | float | Width of the portion of the source image to draw. |
| srcHeight | float | Height of the portion of the source image to draw |
| srcUnit | int | Member of the [GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the units of measure used to determine the source rectangle. |
| imageAttrs | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) that specifies recoloring and gamma information for the image object. |

### drawImageUnscaled(Image image, int x, int y) {#drawImageUnscaled-com.aspose.drawing.Image-int-int-}
```
public final void drawImageUnscaled(Image image, int x, int y)
```


Draws the specified image using its original physical size at the location specified by a coordinate pair.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | [Image](../../com.aspose.drawing/image) to draw. |
| x | int | The x-coordinate of the upper-left corner of the drawn image. |
| y | int | The y-coordinate of the upper-left corner of the drawn image. |

### drawImageUnscaled(Image image, Point point) {#drawImageUnscaled-com.aspose.drawing.Image-com.aspose.drawing.Point-}
```
public final void drawImageUnscaled(Image image, Point point)
```


Draws a specified image using its original physical size at a specified location.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | [Image](../../com.aspose.drawing/image) to draw. |
| point | [Point](../../com.aspose.drawing/point) | [Point](../../com.aspose.drawing/point) structure that specifies the upper-left corner of the drawn image. |

### drawImageUnscaled(Image image, Rectangle rect) {#drawImageUnscaled-com.aspose.drawing.Image-com.aspose.drawing.Rectangle-}
```
public final void drawImageUnscaled(Image image, Rectangle rect)
```


Draws a specified image using its original physical size at a specified location.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | [Image](../../com.aspose.drawing/image) to draw. |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) that specifies the upper-left corner of the drawn image. The X and Y properties of the rectangle specify the upper-left corner. The Width and Height properties are ignored. |

### drawImageUnscaled(Image image, int x, int y, int width, int height) {#drawImageUnscaled-com.aspose.drawing.Image-int-int-int-int-}
```
public final void drawImageUnscaled(Image image, int x, int y, int width, int height)
```


Draws the specified image using its original physical size at the location specified by a coordinate pair.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | [Image](../../com.aspose.drawing/image) to draw. |
| x | int | The x-coordinate of the upper-left corner of the drawn image. |
| y | int | The y-coordinate of the upper-left corner of the drawn image. |
| width | int | The width of the drawn image. |
| height | int | The height of the drawn image. |

### drawImageUnscaledAndClipped(Image image, Rectangle rect) {#drawImageUnscaledAndClipped-com.aspose.drawing.Image-com.aspose.drawing.Rectangle-}
```
public final void drawImageUnscaledAndClipped(Image image, Rectangle rect)
```


Draws the specified image without scaling and clips it, if necessary, to fit in the specified rectangle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | The [Image](../../com.aspose.drawing/image) to draw. |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | The [Rectangle](../../com.aspose.drawing/rectangle) in which to draw the image. |

### drawLine(Pen pen, Point pt1, Point pt2) {#drawLine-com.aspose.drawing.Pen-com.aspose.drawing.Point-com.aspose.drawing.Point-}
```
public final void drawLine(Pen pen, Point pt1, Point pt2)
```


Draws a line connecting two [Point](../../com.aspose.drawing/point) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and style of the line. |
| pt1 | [Point](../../com.aspose.drawing/point) | [Point](../../com.aspose.drawing/point) structure that represents the first point to connect. |
| pt2 | [Point](../../com.aspose.drawing/point) | [Point](../../com.aspose.drawing/point) structure that represents the second point to connect. |

### drawLine(Pen pen, int x1, int y1, int x2, int y2) {#drawLine-com.aspose.drawing.Pen-int-int-int-int-}
```
public final void drawLine(Pen pen, int x1, int y1, int x2, int y2)
```


Draws a line connecting the two points specified by the coordinate pairs.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | Pen that determines the color, width, and style of the line. |
| x1 | int | The x-coordinate of the first point. |
| y1 | int | The y-coordinate of the first point. |
| x2 | int | The x-coordinate of the second point. |
| y2 | int | The y-coordinate of the second point. |

### drawLine(Pen pen, PointF pt1, PointF pt2) {#drawLine-com.aspose.drawing.Pen-com.aspose.drawing.PointF-com.aspose.drawing.PointF-}
```
public final void drawLine(Pen pen, PointF pt1, PointF pt2)
```


Draws a line connecting two PointF structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | Pen that determines the color, width, and style of the line. |
| pt1 | [PointF](../../com.aspose.drawing/pointf) | PointF structure that represents the first point to connect. |
| pt2 | [PointF](../../com.aspose.drawing/pointf) | PointF structure that represents the second point to connect. |

### drawLine(Pen pen, float x1, float y1, float x2, float y2) {#drawLine-com.aspose.drawing.Pen-float-float-float-float-}
```
public final void drawLine(Pen pen, float x1, float y1, float x2, float y2)
```


Draws a line connecting the two points specified by the coordinate pairs.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | Pen that determines the color, width, and style of the line. |
| x1 | float | The x-coordinate of the first point. |
| y1 | float | The y-coordinate of the first point. |
| x2 | float | The x-coordinate of the second point. |
| y2 | float | The y-coordinate of the second point. |

### drawLines(Pen pen, PointF[] points) {#drawLines-com.aspose.drawing.Pen-com.aspose.drawing.PointF---}
```
public final void drawLines(Pen pen, PointF[] points)
```


Draws a series of line segments that connect an array of [PointF](../../com.aspose.drawing/pointf) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and style of the line segments. |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of [PointF](../../com.aspose.drawing/pointf) structures that represent the points to connect. |

### drawLines(Pen pen, Point[] points) {#drawLines-com.aspose.drawing.Pen-com.aspose.drawing.Point---}
```
public final void drawLines(Pen pen, Point[] points)
```


Draws a series of line segments that connect an array of [Point](../../com.aspose.drawing/point) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and style of the line segments. |
| points | [Point\[\]](../../com.aspose.drawing/point) | Array of [Point](../../com.aspose.drawing/point) structures that represent the points to connect. |

### drawPath(Pen pen, GraphicsPath path) {#drawPath-com.aspose.drawing.Pen-com.aspose.drawing.drawing2d.GraphicsPath-}
```
public final void drawPath(Pen pen, GraphicsPath path)
```


Draws a GraphicsPath.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and style of the path. |
| path | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | GraphicsPath to draw. |

### drawPie(Pen pen, RectangleF rect, float startAngle, float sweepAngle) {#drawPie-com.aspose.drawing.Pen-com.aspose.drawing.RectangleF-float-float-}
```
public final void drawPie(Pen pen, RectangleF rect, float startAngle, float sweepAngle)
```


Draws a pie shape defined by an ellipse specified by a RectangleF structure and two radial lines.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | Pen that determines the color, width, and style of the pie shape. |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | RectangleF structure that represents the bounding rectangle that defines the ellipse from which the pie shape comes. |
| startAngle | float | Angle measured in degrees clockwise from the x-axis to the first side of the pie shape. |
| sweepAngle | float | Angle measured in degrees clockwise from the startAngle parameter to the second side of the pie shape. |

### drawPie(Pen pen, float x, float y, float width, float height, float startAngle, float sweepAngle) {#drawPie-com.aspose.drawing.Pen-float-float-float-float-float-float-}
```
public final void drawPie(Pen pen, float x, float y, float width, float height, float startAngle, float sweepAngle)
```


Draws a pie shape defined by an ellipse specified by a coordinate pair, a width, a height, and two radial lines.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and style of the pie shape. |
| x | float | The x-coordinate of the upper-left corner of the bounding rectangle that defines the ellipse from which the pie shape comes. |
| y | float | The y-coordinate of the upper-left corner of the bounding rectangle that defines the ellipse from which the pie shape comes. |
| width | float | Width of the bounding rectangle that defines the ellipse from which the pie shape comes. |
| height | float | Height of the bounding rectangle that defines the ellipse from which the pie shape comes. |
| startAngle | float | Angle measured in degrees clockwise from the x-axis to the first side of the pie shape. |
| sweepAngle | float | Angle measured in degrees clockwise from the startAngle parameter to the second side of the pie shape. |

### drawPolygon(Pen pen, Point[] points) {#drawPolygon-com.aspose.drawing.Pen-com.aspose.drawing.Point---}
```
public final void drawPolygon(Pen pen, Point[] points)
```


Draws a polygon defined by an array of [Point](../../com.aspose.drawing/point) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and style of the polygon. |
| points | [Point\[\]](../../com.aspose.drawing/point) | Array of [Point](../../com.aspose.drawing/point) structures that represent the vertices of the polygon. |

### drawPolygon(Pen pen, PointF[] points) {#drawPolygon-com.aspose.drawing.Pen-com.aspose.drawing.PointF---}
```
public final void drawPolygon(Pen pen, PointF[] points)
```


Draws a polygon defined by an array of PointF structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | Pen that determines the color, width, and style of the polygon. |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of PointF structures that represent the vertices of the polygon. |

### drawRectangle(Pen pen, int x, int y, int width, int height) {#drawRectangle-com.aspose.drawing.Pen-int-int-int-int-}
```
public final void drawRectangle(Pen pen, int x, int y, int width, int height)
```


Draws a rectangle specified by a coordinate pair, a width, and a height.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | Pen that determines the color, width, and style of the rectangle. |
| x | int | The x-coordinate of the upper-left corner of the rectangle to draw. |
| y | int | The y-coordinate of the upper-left corner of the rectangle to draw. |
| width | int | Width of the rectangle to draw. |
| height | int | Height of the rectangle to draw. |

### drawRectangle(Pen pen, Rectangle rect) {#drawRectangle-com.aspose.drawing.Pen-com.aspose.drawing.Rectangle-}
```
public final void drawRectangle(Pen pen, Rectangle rect)
```


Draws a rectangle specified by a Rectangle structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | A Pen that determines the color, width, and style of the rectangle. |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | A Rectangle structure that represents the rectangle to draw. |

### drawRectangle(Pen pen, float x, float y, float width, float height) {#drawRectangle-com.aspose.drawing.Pen-float-float-float-float-}
```
public final void drawRectangle(Pen pen, float x, float y, float width, float height)
```


Draws a rectangle specified by a coordinate pair, a width, and a height.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | A Pen that determines the color, width, and style of the rectangle. |
| x | float | The x-coordinate of the upper-left corner of the rectangle to draw. |
| y | float | The y-coordinate of the upper-left corner of the rectangle to draw. |
| width | float | The width of the rectangle to draw. |
| height | float | The height of the rectangle to draw. |

### drawRectangles(Pen pen, RectangleF[] rects) {#drawRectangles-com.aspose.drawing.Pen-com.aspose.drawing.RectangleF---}
```
public final void drawRectangles(Pen pen, RectangleF[] rects)
```


Draws a series of rectangles specified by [RectangleF](../../com.aspose.drawing/rectanglef) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and style of the outlines of the rectangles. |
| rects | [RectangleF\[\]](../../com.aspose.drawing/rectanglef) | Array of [RectangleF](../../com.aspose.drawing/rectanglef) structures that represent the rectangles to draw. |

### drawRectangles(Pen pen, Rectangle[] rects) {#drawRectangles-com.aspose.drawing.Pen-com.aspose.drawing.Rectangle---}
```
public final void drawRectangles(Pen pen, Rectangle[] rects)
```


Draws a series of rectangles specified by [Rectangle](../../com.aspose.drawing/rectangle) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pen | [Pen](../../com.aspose.drawing/pen) | [Pen](../../com.aspose.drawing/pen) that determines the color, width, and style of the outlines of the rectangles. |
| rects | [Rectangle\[\]](../../com.aspose.drawing/rectangle) | Array of [Rectangle](../../com.aspose.drawing/rectangle) structures that represent the rectangles to draw. |

### drawString(String s, Font font, Brush brush, RectangleF layoutRectangle) {#drawString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.Brush-com.aspose.drawing.RectangleF-}
```
public final void drawString(String s, Font font, Brush brush, RectangleF layoutRectangle)
```


Draws the specified text string in the specified rectangle with the specified [Brush](../../com.aspose.drawing/brush) and [Font](../../com.aspose.drawing/font) objects using the formatting attributes of the specified [StringFormat](../../com.aspose.drawing/stringformat).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | java.lang.String | String to draw. |
| font | [Font](../../com.aspose.drawing/font) | [Font](../../com.aspose.drawing/font) that defines the text format of the string. |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the color and texture of the drawn text. |
| layoutRectangle | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the location of the drawn text that are applied to the drawn text. |

### drawString(String s, Font font, Brush brush, PointF point) {#drawString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.Brush-com.aspose.drawing.PointF-}
```
public final void drawString(String s, Font font, Brush brush, PointF point)
```


Draws the specified text string at the specified location with the specified [Brush](../../com.aspose.drawing/brush) and [Font](../../com.aspose.drawing/font) objects.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | java.lang.String | String to draw. |
| font | [Font](../../com.aspose.drawing/font) | [Font](../../com.aspose.drawing/font) that defines the text format of the string. |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the color and texture of the drawn text. |
| point | [PointF](../../com.aspose.drawing/pointf) | [PointF](../../com.aspose.drawing/pointf) structure that specifies the upper-left corner of the drawn text. |

### drawString(String s, Font font, Brush brush, PointF point, StringFormat format) {#drawString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.Brush-com.aspose.drawing.PointF-com.aspose.drawing.StringFormat-}
```
public final void drawString(String s, Font font, Brush brush, PointF point, StringFormat format)
```


Draws the specified text string at the specified location with the specified [Brush](../../com.aspose.drawing/brush) and [Font](../../com.aspose.drawing/font) objects using the formatting attributes of the specified [StringFormat](../../com.aspose.drawing/stringformat).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | java.lang.String | String to draw. |
| font | [Font](../../com.aspose.drawing/font) | [Font](../../com.aspose.drawing/font) that defines the text format of the string. |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the color and texture of the drawn text. |
| point | [PointF](../../com.aspose.drawing/pointf) | [PointF](../../com.aspose.drawing/pointf) structure that specifies the upper-left corner of the drawn text. |
| format | [StringFormat](../../com.aspose.drawing/stringformat) | [StringFormat](../../com.aspose.drawing/stringformat) that specifies formatting attributes, such as line spacing and alignment, that are applied to the drawn text. |

### drawString(String s, Font font, Brush brush, float x, float y, StringFormat format) {#drawString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.Brush-float-float-com.aspose.drawing.StringFormat-}
```
public final void drawString(String s, Font font, Brush brush, float x, float y, StringFormat format)
```


Draws the specified text string at the specified location with the specified [Brush](../../com.aspose.drawing/brush) and [Font](../../com.aspose.drawing/font) objects using the formatting attributes of the specified [StringFormat](../../com.aspose.drawing/stringformat).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | java.lang.String | String to draw. |
| font | [Font](../../com.aspose.drawing/font) | [Font](../../com.aspose.drawing/font) that defines the text format of the string. |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the color and texture of the drawn text. |
| x | float | The x-coordinate of the upper-left corner of the drawn text. |
| y | float | The y-coordinate of the upper-left corner of the drawn text. |
| format | [StringFormat](../../com.aspose.drawing/stringformat) | [StringFormat](../../com.aspose.drawing/stringformat) that specifies formatting attributes, such as line spacing and alignment, that are applied to the drawn text. |

### drawString(String s, Font font, Brush brush, float x, float y) {#drawString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.Brush-float-float-}
```
public final void drawString(String s, Font font, Brush brush, float x, float y)
```


Draws the specified text string at the specified location with the specified [Brush](../../com.aspose.drawing/brush) and [Font](../../com.aspose.drawing/font) objects.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | java.lang.String | String to draw. |
| font | [Font](../../com.aspose.drawing/font) | [Font](../../com.aspose.drawing/font) that defines the text format of the string. |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the color and texture of the drawn text. |
| x | float | The x-coordinate of the upper-left corner of the drawn text. |
| y | float | The y-coordinate of the upper-left corner of the drawn text. |

### drawString(String s, Font font, Brush brush, RectangleF layoutRectangle, StringFormat format) {#drawString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.Brush-com.aspose.drawing.RectangleF-com.aspose.drawing.StringFormat-}
```
public final void drawString(String s, Font font, Brush brush, RectangleF layoutRectangle, StringFormat format)
```


Draws the specified text string in the specified rectangle with the specified [Brush](../../com.aspose.drawing/brush) and [Font](../../com.aspose.drawing/font) objects using the formatting attributes of the specified [StringFormat](../../com.aspose.drawing/stringformat).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | java.lang.String | String to draw. |
| font | [Font](../../com.aspose.drawing/font) | [Font](../../com.aspose.drawing/font) that defines the text format of the string. |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the color and texture of the drawn text. |
| layoutRectangle | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the location of the drawn text. |
| format | [StringFormat](../../com.aspose.drawing/stringformat) | [StringFormat](../../com.aspose.drawing/stringformat) that specifies formatting attributes, such as line spacing and alignment, that are applied to the drawn text. |

### fillClosedCurve(Brush brush, PointF[] points, int fillmode, float tension) {#fillClosedCurve-com.aspose.drawing.Brush-com.aspose.drawing.PointF---int-float-}
```
public final void fillClosedCurve(Brush brush, PointF[] points, int fillmode, float tension)
```


Fills the interior of a closed cardinal spline curve defined by an array of PointF structures using the specified fill mode and tension.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | A Brush that determines the characteristics of the fill. |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of PointF structures that define the spline. |
| fillmode | int | Member of the FillMode enumeration that determines how the curve is filled. |
| tension | float | Value greater than or equal to 0.0F that specifies the tension of the curve. |

### fillClosedCurve(Brush brush, PointF[] points) {#fillClosedCurve-com.aspose.drawing.Brush-com.aspose.drawing.PointF---}
```
public final void fillClosedCurve(Brush brush, PointF[] points)
```


Fills the interior of a closed cardinal spline curve defined by an array of [PointF](../../com.aspose.drawing/pointf) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the characteristics of the fill. |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of [PointF](../../com.aspose.drawing/pointf) structures that define the spline. |

### fillClosedCurve(Brush brush, PointF[] points, int fillmode) {#fillClosedCurve-com.aspose.drawing.Brush-com.aspose.drawing.PointF---int-}
```
public final void fillClosedCurve(Brush brush, PointF[] points, int fillmode)
```


Fills the interior of a closed cardinal spline curve defined by an array of [PointF](../../com.aspose.drawing/pointf) structures using the specified fill mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the characteristics of the fill. |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of [PointF](../../com.aspose.drawing/pointf) structures that define the spline. |
| fillmode | int | Member of the [FillMode](../../com.aspose.drawing.drawing2d/fillmode) enumeration that determines how the curve is filled. |

### fillClosedCurve(Brush brush, Point[] points) {#fillClosedCurve-com.aspose.drawing.Brush-com.aspose.drawing.Point---}
```
public final void fillClosedCurve(Brush brush, Point[] points)
```


Fills the interior of a closed cardinal spline curve defined by an array of [Point](../../com.aspose.drawing/point) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the characteristics of the fill. |
| points | [Point\[\]](../../com.aspose.drawing/point) | Array of [Point](../../com.aspose.drawing/point) structures that define the spline. |

### fillClosedCurve(Brush brush, Point[] points, int fillmode) {#fillClosedCurve-com.aspose.drawing.Brush-com.aspose.drawing.Point---int-}
```
public final void fillClosedCurve(Brush brush, Point[] points, int fillmode)
```


Fills the interior of a closed cardinal spline curve defined by an array of [Point](../../com.aspose.drawing/point) structures using the specified fill mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the characteristics of the fill. |
| points | [Point\[\]](../../com.aspose.drawing/point) | Array of [Point](../../com.aspose.drawing/point) structures that define the spline. |
| fillmode | int | Member of the [FillMode](../../com.aspose.drawing.drawing2d/fillmode) enumeration that determines how the curve is filled. |

### fillClosedCurve(Brush brush, Point[] points, int fillmode, float tension) {#fillClosedCurve-com.aspose.drawing.Brush-com.aspose.drawing.Point---int-float-}
```
public final void fillClosedCurve(Brush brush, Point[] points, int fillmode, float tension)
```


Fills the interior of a closed cardinal spline curve defined by an array of [Point](../../com.aspose.drawing/point) structures using the specified fill mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the characteristics of the fill. |
| points | [Point\[\]](../../com.aspose.drawing/point) | Array of [Point](../../com.aspose.drawing/point) structures that define the spline. |
| fillmode | int | Member of the [FillMode](../../com.aspose.drawing.drawing2d/fillmode) enumeration that determines how the curve is filled. |
| tension | float | Value greater than or equal to 0.0F that specifies the tension of the curve. |

### fillEllipse(Brush brush, RectangleF rect) {#fillEllipse-com.aspose.drawing.Brush-com.aspose.drawing.RectangleF-}
```
public final void fillEllipse(Brush brush, RectangleF rect)
```


Fills the interior of an ellipse defined by a bounding rectangle specified by a RectangleF structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | Brush that determines the characteristics of the fill. |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | RectangleF structure that represents the bounding rectangle that defines the ellipse. |

### fillEllipse(Brush brush, float x, float y, float width, float height) {#fillEllipse-com.aspose.drawing.Brush-float-float-float-float-}
```
public final void fillEllipse(Brush brush, float x, float y, float width, float height)
```


Fills the interior of an ellipse defined by a bounding rectangle specified by a pair of coordinates, a width, and a height.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the characteristics of the fill. |
| x | float | The x-coordinate of the upper-left corner of the bounding rectangle that defines the ellipse. |
| y | float | The y-coordinate of the upper-left corner of the bounding rectangle that defines the ellipse. |
| width | float | Width of the bounding rectangle that defines the ellipse. |
| height | float | Height of the bounding rectangle that defines the ellipse. |

### fillPath(Brush brush, GraphicsPath path) {#fillPath-com.aspose.drawing.Brush-com.aspose.drawing.drawing2d.GraphicsPath-}
```
public final void fillPath(Brush brush, GraphicsPath path)
```


Fills the interior of a GraphicsPath.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | Brush that determines the characteristics of the fill. |
| path | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | GraphicsPath that represents the path to fill. |

### fillPie(Brush brush, Rectangle rect, float startAngle, float sweepAngle) {#fillPie-com.aspose.drawing.Brush-com.aspose.drawing.Rectangle-float-float-}
```
public final void fillPie(Brush brush, Rectangle rect, float startAngle, float sweepAngle)
```


Fills the interior of a pie section defined by an ellipse specified by a Rectangle structure and two radial lines.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | Brush that determines the characteristics of the fill. |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | Rectangle structure that represents the bounding rectangle that defines the ellipse from which the pie section comes. |
| startAngle | float | Angle in degrees measured clockwise from the x-axis to the first side of the pie section. |
| sweepAngle | float | Angle in degrees measured clockwise from the startAngle parameter to the second side of the pie section. |

### fillPie(Brush brush, float x, float y, float width, float height, float startAngle, float sweepAngle) {#fillPie-com.aspose.drawing.Brush-float-float-float-float-float-float-}
```
public final void fillPie(Brush brush, float x, float y, float width, float height, float startAngle, float sweepAngle)
```


Fills the interior of a pie section defined by an ellipse specified by a pair of coordinates, a width, a height, and two radial lines.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the characteristics of the fill. |
| x | float | The x-coordinate of the upper-left corner of the bounding rectangle that defines the ellipse from which the pie section comes. |
| y | float | The y-coordinate of the upper-left corner of the bounding rectangle that defines the ellipse from which the pie section comes. |
| width | float | Width of the bounding rectangle that defines the ellipse from which the pie section comes. |
| height | float | Height of the bounding rectangle that defines the ellipse from which the pie section comes. |
| startAngle | float | Angle in degrees measured clockwise from the x-axis to the first side of the pie section. |
| sweepAngle | float | Angle in degrees measured clockwise from the startAngle parameter to the second side of the pie section. |

### fillPie(Brush brush, int x, int y, int width, int height, int startAngle, int sweepAngle) {#fillPie-com.aspose.drawing.Brush-int-int-int-int-int-int-}
```
public final void fillPie(Brush brush, int x, int y, int width, int height, int startAngle, int sweepAngle)
```


Fills the interior of a pie section defined by an ellipse specified by a pair of coordinates, a width, a height, and two radial lines.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the characteristics of the fill. |
| x | int | The x-coordinate of the upper-left corner of the bounding rectangle that defines the ellipse from which the pie section comes. |
| y | int | The y-coordinate of the upper-left corner of the bounding rectangle that defines the ellipse from which the pie section comes. |
| width | int | Width of the bounding rectangle that defines the ellipse from which the pie section comes. |
| height | int | Height of the bounding rectangle that defines the ellipse from which the pie section comes. |
| startAngle | int | Angle in degrees measured clockwise from the x-axis to the first side of the pie section. |
| sweepAngle | int | Angle in degrees measured clockwise from the startAngle parameter to the second side of the pie section. |

### fillPolygon(Brush brush, PointF[] points, int fillMode) {#fillPolygon-com.aspose.drawing.Brush-com.aspose.drawing.PointF---int-}
```
public final void fillPolygon(Brush brush, PointF[] points, int fillMode)
```


Fills the interior of a polygon defined by an array of points specified by PointF structures using the specified fill mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | Brush that determines the characteristics of the fill. |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of PointF structures that represent the vertices of the polygon to fill. |
| fillMode | int | Member of the FillMode enumeration that determines the style of the fill. |

### fillPolygon(Brush brush, PointF[] points) {#fillPolygon-com.aspose.drawing.Brush-com.aspose.drawing.PointF---}
```
public final void fillPolygon(Brush brush, PointF[] points)
```


Fills the interior of a polygon defined by an array of points specified by [PointF](../../com.aspose.drawing/pointf) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the characteristics of the fill. |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of [PointF](../../com.aspose.drawing/pointf) structures that represent the vertices of the polygon to fill. |

### fillPolygon(Brush brush, Point[] points) {#fillPolygon-com.aspose.drawing.Brush-com.aspose.drawing.Point---}
```
public final void fillPolygon(Brush brush, Point[] points)
```


Fills the interior of a polygon defined by an array of points specified by [Point](../../com.aspose.drawing/point) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the characteristics of the fill. |
| points | [Point\[\]](../../com.aspose.drawing/point) | Array of [Point](../../com.aspose.drawing/point) structures that represent the vertices of the polygon to fill. |

### fillPolygon(Brush brush, Point[] points, int fillMode) {#fillPolygon-com.aspose.drawing.Brush-com.aspose.drawing.Point---int-}
```
public final void fillPolygon(Brush brush, Point[] points, int fillMode)
```


Fills the interior of a polygon defined by an array of points specified by [Point](../../com.aspose.drawing/point) structures using the specified fill mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the characteristics of the fill. |
| points | [Point\[\]](../../com.aspose.drawing/point) | Array of [Point](../../com.aspose.drawing/point) structures that represent the vertices of the polygon to fill. |
| fillMode | int | Member of the FillMode enumeration that determines the style of the fill. |

### fillRectangle(Brush brush, float x, float y, float width, float height) {#fillRectangle-com.aspose.drawing.Brush-float-float-float-float-}
```
public final void fillRectangle(Brush brush, float x, float y, float width, float height)
```


Fills the interior of a rectangle specified by a pair of coordinates, a width, and a height.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the characteristics of the fill. |
| x | float | The x-coordinate of the upper-left corner of the rectangle to fill. |
| y | float | The y-coordinate of the upper-left corner of the rectangle to fill. |
| width | float | Width of the rectangle to fill. |
| height | float | Height of the rectangle to fill. |

### fillRectangle(Brush brush, RectangleF rect) {#fillRectangle-com.aspose.drawing.Brush-com.aspose.drawing.RectangleF-}
```
public final void fillRectangle(Brush brush, RectangleF rect)
```


Fills the interior of a rectangle specified by a RectangleF structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | Brush that determines the characteristics of the fill. |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | RectangleF structure that represents the rectangle to fill. |

### fillRectangles(Brush brush, Rectangle[] rects) {#fillRectangles-com.aspose.drawing.Brush-com.aspose.drawing.Rectangle---}
```
public final void fillRectangles(Brush brush, Rectangle[] rects)
```


Fills the interiors of a series of rectangles specified by [Rectangle](../../com.aspose.drawing/rectangle) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the characteristics of the fill. |
| rects | [Rectangle\[\]](../../com.aspose.drawing/rectangle) | Array of [Rectangle](../../com.aspose.drawing/rectangle) structures that represent the rectangles to fill. |

### fillRectangles(Brush brush, RectangleF[] rects) {#fillRectangles-com.aspose.drawing.Brush-com.aspose.drawing.RectangleF---}
```
public final void fillRectangles(Brush brush, RectangleF[] rects)
```


Fills the interiors of a series of rectangles specified by [RectangleF](../../com.aspose.drawing/rectanglef) structures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | [Brush](../../com.aspose.drawing/brush) that determines the characteristics of the fill. |
| rects | [RectangleF\[\]](../../com.aspose.drawing/rectanglef) | Array of [RectangleF](../../com.aspose.drawing/rectanglef) structures that represent the rectangles to fill. |

### fillRegion(Brush brush, Region region) {#fillRegion-com.aspose.drawing.Brush-com.aspose.drawing.Region-}
```
public final void fillRegion(Brush brush, Region region)
```


Fills the interior of a Region.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| brush | [Brush](../../com.aspose.drawing/brush) | Brush that determines the characteristics of the fill. |
| region | [Region](../../com.aspose.drawing/region) | Region that represents the area to fill. |

### flush() {#flush--}
```
public final void flush()
```


Forces execution of all pending graphics operations and returns immediately without waiting for the operations to finish.

### flush(int intention) {#flush-int-}
```
public final void flush(int intention)
```


Forces execution of all pending graphics operations with the method waiting or not waiting, as specified, to return before the operations finish.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| intention | int | Member of the [FlushIntention](../../com.aspose.drawing.drawing2d/flushintention) enumeration that specifies whether the method returns immediately or waits for any existing operations to finish. |

### measureString(String text, Font font) {#measureString-java.lang.String-com.aspose.drawing.Font-}
```
public final SizeF measureString(String text, Font font)
```


Measures the specified string when drawn with the specified [Font](../../com.aspose.drawing/font).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | String to measure. |
| font | [Font](../../com.aspose.drawing/font) | [Font](../../com.aspose.drawing/font) that defines the text format of the string. |

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - This method returns a [SizeF](../../com.aspose.drawing/sizef) structure that represents the size, in the units specified by the `P:Graphics.PageUnit` property, of the string specified by the `text` parameter as drawn with the `font` parameter.
### measureString(String text, Font font, SizeF layoutArea) {#measureString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.SizeF-}
```
public final SizeF measureString(String text, Font font, SizeF layoutArea)
```


Measures the specified string when drawn with the specified [Font](../../com.aspose.drawing/font).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | String to measure. |
| font | [Font](../../com.aspose.drawing/font) | [Font](../../com.aspose.drawing/font) that defines the text format of the string. |
| layoutArea | [SizeF](../../com.aspose.drawing/sizef) | [SizeF](../../com.aspose.drawing/sizef) structure that specifies the maximum layout area for the text. |

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - This method returns a [SizeF](../../com.aspose.drawing/sizef) structure that represents the size, in the units specified by the `P:Graphics.PageUnit` property, of the string specified by the `text` parameter as drawn with the `font` parameter.
### measureString(String text, Font font, int width) {#measureString-java.lang.String-com.aspose.drawing.Font-int-}
```
public final SizeF measureString(String text, Font font, int width)
```


Measures the specified string when drawn with the specified [Font](../../com.aspose.drawing/font).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | String to measure. |
| font | [Font](../../com.aspose.drawing/font) | [Font](../../com.aspose.drawing/font) that defines the text format of the string. |
| width | int | Maximum width of the string in pixels. |

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - This method returns a [SizeF](../../com.aspose.drawing/sizef) structure that represents the size, in the units specified by the `P:Graphics.PageUnit` property, of the string specified by the `text` parameter as drawn with the `font` parameter.
### measureString(String text, Font font, PointF origin, StringFormat stringFormat) {#measureString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.PointF-com.aspose.drawing.StringFormat-}
```
public final SizeF measureString(String text, Font font, PointF origin, StringFormat stringFormat)
```


Measures the specified string when drawn with the specified [Font](../../com.aspose.drawing/font) and formatted with the specified [StringFormat](../../com.aspose.drawing/stringformat).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | String to measure. |
| font | [Font](../../com.aspose.drawing/font) | [Font](../../com.aspose.drawing/font) defines the text format of the string. |
| origin | [PointF](../../com.aspose.drawing/pointf) | [PointF](../../com.aspose.drawing/pointf) structure that represents the upper-left corner of the string. |
| stringFormat | [StringFormat](../../com.aspose.drawing/stringformat) | [StringFormat](../../com.aspose.drawing/stringformat) that represents formatting information, such as line spacing, for the string. |

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - This method returns a [SizeF](../../com.aspose.drawing/sizef) structure that represents the size, in the units specified by the `P:Graphics.PageUnit` property, of the string specified by the `text` parameter as drawn with the `font` parameter and the `stringFormat` parameter.
### measureString(String text, Font font, int width, StringFormat format) {#measureString-java.lang.String-com.aspose.drawing.Font-int-com.aspose.drawing.StringFormat-}
```
public final SizeF measureString(String text, Font font, int width, StringFormat format)
```


Measures the specified string when drawn with the specified [Font](../../com.aspose.drawing/font) and formatted with the specified [StringFormat](../../com.aspose.drawing/stringformat).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | String to measure. |
| font | [Font](../../com.aspose.drawing/font) | [Font](../../com.aspose.drawing/font) that defines the text format of the string. |
| width | int | Maximum width of the string. |
| format | [StringFormat](../../com.aspose.drawing/stringformat) | [StringFormat](../../com.aspose.drawing/stringformat) that represents formatting information, such as line spacing, for the string. |

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - This method returns a [SizeF](../../com.aspose.drawing/sizef) structure that represents the size, in the units specified by the `P:Graphics.PageUnit` property, of the string specified in the `text` parameter as drawn with the `font` parameter and the `format` parameter.
### measureString(String text, Font font, SizeF layoutArea, StringFormat stringFormat) {#measureString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.SizeF-com.aspose.drawing.StringFormat-}
```
public final SizeF measureString(String text, Font font, SizeF layoutArea, StringFormat stringFormat)
```


Measures the specified string when drawn with the specified [Font](../../com.aspose.drawing/font) and formatted with the specified [StringFormat](../../com.aspose.drawing/stringformat).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | String to measure. |
| font | [Font](../../com.aspose.drawing/font) | [Font](../../com.aspose.drawing/font) defines the text format of the string. |
| layoutArea | [SizeF](../../com.aspose.drawing/sizef) | [SizeF](../../com.aspose.drawing/sizef) structure that specifies the maximum layout area for the text. |
| stringFormat | [StringFormat](../../com.aspose.drawing/stringformat) | [StringFormat](../../com.aspose.drawing/stringformat) that represents formatting information, such as line spacing, for the string. |

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - This method returns a [SizeF](../../com.aspose.drawing/sizef) structure that represents the size, in the units specified by the `P:Graphics.PageUnit` property, of the string specified in the `text` parameter as drawn with the `font` parameter and the `stringFormat` parameter.
### measureString(String text, Font font, SizeF layoutArea, StringFormat stringFormat, int[] charactersFitted, int[] linesFilled) {#measureString-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.SizeF-com.aspose.drawing.StringFormat-int---int---}
```
public final SizeF measureString(String text, Font font, SizeF layoutArea, StringFormat stringFormat, int[] charactersFitted, int[] linesFilled)
```


Measures the specified string when drawn with the specified [Font](../../com.aspose.drawing/font) and formatted with the specified [StringFormat](../../com.aspose.drawing/stringformat).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | String to measure. |
| font | [Font](../../com.aspose.drawing/font) | [Font](../../com.aspose.drawing/font) defines the text format of the string. |
| layoutArea | [SizeF](../../com.aspose.drawing/sizef) | [SizeF](../../com.aspose.drawing/sizef) structure that specifies the maximum layout area for the text. |
| stringFormat | [StringFormat](../../com.aspose.drawing/stringformat) | [StringFormat](../../com.aspose.drawing/stringformat) that represents formatting information, such as line spacing, for the string. |
| charactersFitted | int[] | Number of characters in the string. |
| linesFilled | int[] | Number of text lines in the string. |

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - This method returns a [SizeF](../../com.aspose.drawing/sizef) structure that represents the size, in the units specified by the `P:Graphics.PageUnit` property, of the string specified in the `text` parameter as drawn with the `font` parameter and the `stringFormat` parameter.
### measureCharacterRanges(String text, Font font, RectangleF layoutRect, StringFormat stringFormat) {#measureCharacterRanges-java.lang.String-com.aspose.drawing.Font-com.aspose.drawing.RectangleF-com.aspose.drawing.StringFormat-}
```
public final Region[] measureCharacterRanges(String text, Font font, RectangleF layoutRect, StringFormat stringFormat)
```


Gets an array of [Region](../../com.aspose.drawing/region) objects, each of which bounds a range of character positions within the specified string.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | String to measure. |
| font | [Font](../../com.aspose.drawing/font) | [Font](../../com.aspose.drawing/font) that defines the text format of the string. |
| layoutRect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the layout rectangle for the string. |
| stringFormat | [StringFormat](../../com.aspose.drawing/stringformat) | [StringFormat](../../com.aspose.drawing/stringformat) that represents formatting information, such as line spacing, for the string. |

**Returns:**
com.aspose.drawing.Region[] - This method returns an array of [Region](../../com.aspose.drawing/region) objects, each of which bounds a range of character positions within the specified string.
### resetTransform() {#resetTransform--}
```
public final void resetTransform()
```


Resets the world transformation matrix of this [Graphics](../../com.aspose.drawing/graphics) to the identity matrix.

### transformPoints(int destSpace, int srcSpace, PointF[] pts) {#transformPoints-int-int-com.aspose.drawing.PointF---}
```
public final void transformPoints(int destSpace, int srcSpace, PointF[] pts)
```


Transforms an array of points from one coordinate space to another using the current world and page transformations of this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| destSpace | int | Member of the [CoordinateSpace](../../com.aspose.drawing.drawing2d/coordinatespace) enumeration that specifies the destination coordinate space. |
| srcSpace | int | Member of the [CoordinateSpace](../../com.aspose.drawing.drawing2d/coordinatespace) enumeration that specifies the source coordinate space. |
| pts | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of [PointF](../../com.aspose.drawing/pointf) structures that represent the points to transform. |

### transformPoints(int destSpace, int srcSpace, Point[] pts) {#transformPoints-int-int-com.aspose.drawing.Point---}
```
public final void transformPoints(int destSpace, int srcSpace, Point[] pts)
```


Transforms an array of points from one coordinate space to another using the current world and page transformations of this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| destSpace | int | Member of the [CoordinateSpace](../../com.aspose.drawing.drawing2d/coordinatespace) enumeration that specifies the destination coordinate space. |
| srcSpace | int | Member of the [CoordinateSpace](../../com.aspose.drawing.drawing2d/coordinatespace) enumeration that specifies the source coordinate space. |
| pts | [Point\[\]](../../com.aspose.drawing/point) | Array of [Point](../../com.aspose.drawing/point) structures that represent the points to transform. |

### translateClip(int dx, int dy) {#translateClip-int-int-}
```
public final void translateClip(int dx, int dy)
```


Translates the clipping region of this [Graphics](../../com.aspose.drawing/graphics) by specified amounts in the horizontal and vertical directions.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dx | int | The x-coordinate of the translation. |
| dy | int | The y-coordinate of the translation. |

### translateClip(float dx, float dy) {#translateClip-float-float-}
```
public final void translateClip(float dx, float dy)
```


Translates the clipping region of this [Graphics](../../com.aspose.drawing/graphics) by specified amounts in the horizontal and vertical directions.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dx | float | The x-coordinate of the translation. |
| dy | float | The y-coordinate of the translation. |

### translateTransform(float dx, float dy) {#translateTransform-float-float-}
```
public final void translateTransform(float dx, float dy)
```


Changes the origin of the coordinate system by prepending the specified translation to the transformation matrix of this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dx | float | The x-coordinate of the translation. |
| dy | float | The y-coordinate of the translation. |

### translateTransform(float dx, float dy, int order) {#translateTransform-float-float-int-}
```
public final void translateTransform(float dx, float dy, int order)
```


Changes the origin of the coordinate system by applying the specified translation to the transformation matrix of this [Graphics](../../com.aspose.drawing/graphics) in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dx | float | The x-coordinate of the translation. |
| dy | float | The y-coordinate of the translation. |
| order | int | Member of the [MatrixOrder](../../com.aspose.drawing.drawing2d/matrixorder) enumeration that specifies whether the translation is prepended or appended to the transformation matrix. |

### scaleTransform(float sx, float sy) {#scaleTransform-float-float-}
```
public final void scaleTransform(float sx, float sy)
```


Applies the specified scaling operation to the transformation matrix of this [Graphics](../../com.aspose.drawing/graphics) by prepending it to the object's transformation matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sx | float | Scale factor in the x direction. |
| sy | float | Scale factor in the y direction. |

### scaleTransform(float sx, float sy, int order) {#scaleTransform-float-float-int-}
```
public final void scaleTransform(float sx, float sy, int order)
```


Applies the specified scaling operation to the transformation matrix of this [Graphics](../../com.aspose.drawing/graphics) in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sx | float | Scale factor in the x direction. |
| sy | float | Scale factor in the y direction. |
| order | int | Member of the [MatrixOrder](../../com.aspose.drawing.drawing2d/matrixorder) enumeration that specifies whether the scaling operation is prepended or appended to the transformation matrix. |

### rotateTransform(float angle) {#rotateTransform-float-}
```
public final void rotateTransform(float angle)
```


Applies the specified rotation to the transformation matrix of this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | Angle of rotation in degrees. |

### rotateTransform(float angle, int order) {#rotateTransform-float-int-}
```
public final void rotateTransform(float angle, int order)
```


Applies the specified rotation to the transformation matrix of this [Graphics](../../com.aspose.drawing/graphics) in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | Angle of rotation in degrees. |
| order | int | Member of the [MatrixOrder](../../com.aspose.drawing.drawing2d/matrixorder) enumeration that specifies whether the rotation is appended or prepended to the matrix transformation. |

### multiplyTransform(Matrix matrix) {#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-}
```
public final void multiplyTransform(Matrix matrix)
```


Multiplies the world transformation of this [Graphics](../../com.aspose.drawing/graphics) and specified the [Matrix](../../com.aspose.drawing.drawing2d/matrix).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | 4x4 [Matrix](../../com.aspose.drawing.drawing2d/matrix) that multiplies the world transformation. |

### multiplyTransform(Matrix matrix, int order) {#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-int-}
```
public final void multiplyTransform(Matrix matrix, int order)
```


Multiplies the world transformation of this [Graphics](../../com.aspose.drawing/graphics) and specified the [Matrix](../../com.aspose.drawing.drawing2d/matrix) in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | 4x4 [Matrix](../../com.aspose.drawing.drawing2d/matrix) that multiplies the world transformation. |
| order | int | Member of the [MatrixOrder](../../com.aspose.drawing.drawing2d/matrixorder) enumeration that determines the order of the multiplication. |

### setClip(Graphics g, int combineMode) {#setClip-com.aspose.drawing.Graphics-int-}
```
public final void setClip(Graphics g, int combineMode)
```


Sets the clipping region of this [Graphics](../../com.aspose.drawing/graphics) to the result of the specified combining operation of the current clip region and the Clip property of the specified [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| g | [Graphics](../../com.aspose.drawing/graphics) | The [Graphics](../../com.aspose.drawing/graphics) that specifies the clip region to combine. |
| combineMode | int | The member of the [CombineMode](../../com.aspose.drawing.drawing2d/combinemode) enumeration that specifies the combining operation to use. |

### setClip(Rectangle rect, int combineMode) {#setClip-com.aspose.drawing.Rectangle-int-}
```
public final void setClip(Rectangle rect, int combineMode)
```


Sets the clipping region of this [Graphics](../../com.aspose.drawing/graphics) to the result of the specified operation combining the current clip region and the rectangle specified by a [Rectangle](../../com.aspose.drawing/rectangle) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | The [Rectangle](../../com.aspose.drawing/rectangle) structure to combine. |
| combineMode | int | The Member of the [CombineMode](../../com.aspose.drawing.drawing2d/combinemode) enumeration that specifies the combining operation to use. |

### setClip(RectangleF rect, int combineMode) {#setClip-com.aspose.drawing.RectangleF-int-}
```
public final void setClip(RectangleF rect, int combineMode)
```


Sets the clipping region of this [Graphics](../../com.aspose.drawing/graphics) to the result of the specified operation combining the current clip region and the rectangle specified by a [RectangleF](../../com.aspose.drawing/rectanglef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | The [Rectangle](../../com.aspose.drawing/rectangle) structure to combine. |
| combineMode | int | The combine mode. |

### setClip(GraphicsPath path, int combineMode) {#setClip-com.aspose.drawing.drawing2d.GraphicsPath-int-}
```
public final void setClip(GraphicsPath path, int combineMode)
```


Sets the clipping region of this [Graphics](../../com.aspose.drawing/graphics) to the result of the specified operation combining the current clip region and the specified [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | The [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) to combine.. |
| combineMode | int | The member of the [CombineMode](../../com.aspose.drawing.drawing2d/combinemode) enumeration that specifies the combining operation to use.. |

### setClip(Region region, int combineMode) {#setClip-com.aspose.drawing.Region-int-}
```
public final void setClip(Region region, int combineMode)
```


Sets the clipping region of this [Graphics](../../com.aspose.drawing/graphics) to the result of the specified operation combining the current clip region and the specified [Region](../../com.aspose.drawing/region).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| region | [Region](../../com.aspose.drawing/region) | [Region](../../com.aspose.drawing/region) to combine. |
| combineMode | int | Member from the [CombineMode](../../com.aspose.drawing.drawing2d/combinemode) enumeration that specifies the combining operation to use. |

### getHdc() {#getHdc--}
```
public final byte[] getHdc()
```


Gets the handle to the device context associated with this [Graphics](../../com.aspose.drawing/graphics).

**Returns:**
byte[] - Handle to the device context associated with this [Graphics](../../com.aspose.drawing/graphics).
### getNearestColor(Color color) {#getNearestColor-com.aspose.drawing.Color-}
```
public final Color getNearestColor(Color color)
```


Gets the nearest color to the specified [Color](../../com.aspose.drawing/color) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| color | [Color](../../com.aspose.drawing/color) | [Color](../../com.aspose.drawing/color) structure for which to find a match. |

**Returns:**
[Color](../../com.aspose.drawing/color) - A [Color](../../com.aspose.drawing/color) structure that represents the nearest color to the one specified with the `color` parameter.
### intersectClip(Region region) {#intersectClip-com.aspose.drawing.Region-}
```
public final void intersectClip(Region region)
```


Updates the clip region of this [Graphics](../../com.aspose.drawing/graphics) to the intersection of the current clip region and the specified [Region](../../com.aspose.drawing/region).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| region | [Region](../../com.aspose.drawing/region) | [Region](../../com.aspose.drawing/region) to intersect with the current region. |

### intersectClip(Rectangle rect) {#intersectClip-com.aspose.drawing.Rectangle-}
```
public final void intersectClip(Rectangle rect)
```


Updates the clip region of this [Graphics](../../com.aspose.drawing/graphics) to the intersection of the current clip region and the specified [Rectangle](../../com.aspose.drawing/rectangle) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure to intersect with the current clip region. |

### intersectClip(RectangleF rect) {#intersectClip-com.aspose.drawing.RectangleF-}
```
public final void intersectClip(RectangleF rect)
```


Updates the clip region of this [Graphics](../../com.aspose.drawing/graphics) to the intersection of the current clip region and the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure to intersect with the current clip region. |

### isVisible(int x, int y) {#isVisible-int-int-}
```
public final boolean isVisible(int x, int y)
```


Indicates whether the point specified by a pair of coordinates is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | int | The x-coordinate of the point to test for visibility. |
| y | int | The y-coordinate of the point to test for visibility. |

**Returns:**
boolean - `true` if the point defined by the `x` and `y` parameters is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics); otherwise, `false`.
### isVisible(Point point) {#isVisible-com.aspose.drawing.Point-}
```
public final boolean isVisible(Point point)
```


Indicates whether the specified [Point](../../com.aspose.drawing/point) structure is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point | [Point](../../com.aspose.drawing/point) | [Point](../../com.aspose.drawing/point) structure to test for visibility. |

**Returns:**
boolean - `true` if the point is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics); otherwise, `false`.
### isVisible(float x, float y) {#isVisible-float-float-}
```
public final boolean isVisible(float x, float y)
```


Indicates whether the point specified by a pair of coordinates is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | The x-coordinate of the point to test for visibility. |
| y | float | The y-coordinate of the point to test for visibility. |

**Returns:**
boolean - `true` if the point defined by the `x` and `y` parameters is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics); otherwise, `false`.
### isVisible(PointF point) {#isVisible-com.aspose.drawing.PointF-}
```
public final boolean isVisible(PointF point)
```


Indicates whether the specified [PointF](../../com.aspose.drawing/pointf) structure is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point | [PointF](../../com.aspose.drawing/pointf) | [PointF](../../com.aspose.drawing/pointf) structure to test for visibility. |

**Returns:**
boolean - `true` if the point defined by the `point` parameter is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics); otherwise, `false`.
### isVisible(int x, int y, int width, int height) {#isVisible-int-int-int-int-}
```
public final boolean isVisible(int x, int y, int width, int height)
```


Indicates whether the rectangle specified by a pair of coordinates, a width, and a height is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | int | The x-coordinate of the upper-left corner of the rectangle to test for visibility. |
| y | int | The y-coordinate of the upper-left corner of the rectangle to test for visibility. |
| width | int | Width of the rectangle to test for visibility. |
| height | int | Height of the rectangle to test for visibility. |

**Returns:**
boolean - `true`if the rectangle defined by the `x`, `y`, `width`, and `height` parameters is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics); otherwise, `false`.
### isVisible(Rectangle rect) {#isVisible-com.aspose.drawing.Rectangle-}
```
public final boolean isVisible(Rectangle rect)
```


Indicates whether the rectangle specified by a [Rectangle](../../com.aspose.drawing/rectangle) structure is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure to test for visibility. |

**Returns:**
boolean - `true` if the rectangle specified by the `rect` parameter is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics); otherwise, `false`.
### isVisible(float x, float y, float width, float height) {#isVisible-float-float-float-float-}
```
public final boolean isVisible(float x, float y, float width, float height)
```


Indicates whether the rectangle specified by a pair of coordinates, a width, and a height is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | The x-coordinate of the upper-left corner of the rectangle to test for visibility. |
| y | float | The y-coordinate of the upper-left corner of the rectangle to test for visibility. |
| width | float | Width of the rectangle to test for visibility. |
| height | float | Height of the rectangle to test for visibility. |

**Returns:**
boolean - `true`if the rectangle defined by the `x`, `y`, `width`, and `height` parameters is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics); otherwise, `false`.
### isVisible(RectangleF rect) {#isVisible-com.aspose.drawing.RectangleF-}
```
public final boolean isVisible(RectangleF rect)
```


Indicates whether the rectangle specified by a [RectangleF](../../com.aspose.drawing/rectanglef) structure is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure to test for visibility. |

**Returns:**
boolean - `true` if the rectangle specified by the `rect` parameter is contained within the visible clip region of this [Graphics](../../com.aspose.drawing/graphics); otherwise, `false`.
### releaseHdc(byte[] hdc) {#releaseHdc-byte---}
```
public final void releaseHdc(byte[] hdc)
```


Releases a device context handle obtained by a previous call to the `M:Graphics.GetHdc` method of this [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| hdc | byte[] | Handle to a device context obtained by a previous call to the `M:Graphics.GetHdc` method of this [Graphics](../../com.aspose.drawing/graphics). |

### releaseHdc() {#releaseHdc--}
```
public final void releaseHdc()
```


Releases a device context handle obtained by a previous call to the `M:Graphics.GetHdc` method of this [Graphics](../../com.aspose.drawing/graphics).

### save() {#save--}
```
public final GraphicsState save()
```


Saves the current state of this [Graphics](../../com.aspose.drawing/graphics) and identifies the saved state with a [GraphicsState](../../com.aspose.drawing.drawing2d/graphicsstate).

**Returns:**
[GraphicsState](../../com.aspose.drawing.drawing2d/graphicsstate) - Returns a [GraphicsState](../../com.aspose.drawing.drawing2d/graphicsstate) that represents the saved state of this [Graphics](../../com.aspose.drawing/graphics).
### restore(GraphicsState gstate) {#restore-com.aspose.drawing.drawing2d.GraphicsState-}
```
public final void restore(GraphicsState gstate)
```


Restores the state of this [Graphics](../../com.aspose.drawing/graphics) to the state represented by a [GraphicsState](../../com.aspose.drawing.drawing2d/graphicsstate).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| gstate | [GraphicsState](../../com.aspose.drawing.drawing2d/graphicsstate) | The gstate. |

### resetClip() {#resetClip--}
```
public final void resetClip()
```


Resets the clip region of this [Graphics](../../com.aspose.drawing/graphics) to an infinite region.

### beginContainer() {#beginContainer--}
```
public final GraphicsContainer beginContainer()
```


Saves a graphics container with the current state of this [Graphics](../../com.aspose.drawing/graphics) and opens and uses a new graphics container.

**Returns:**
[GraphicsContainer](../../com.aspose.drawing.drawing2d/graphicscontainer) - This method returns a [GraphicsContainer](../../com.aspose.drawing.drawing2d/graphicscontainer) that represents the state of this [Graphics](../../com.aspose.drawing/graphics) at the time of the method call.
### beginContainer(Rectangle dstrect, Rectangle srcrect, int unit) {#beginContainer-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-int-}
```
public final GraphicsContainer beginContainer(Rectangle dstrect, Rectangle srcrect, int unit)
```


Saves a graphics container with the current state of this [Graphics](../../com.aspose.drawing/graphics) and opens and uses a new graphics container with the specified scale transformation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dstrect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that, together with the srcrect parameter, specifies a scale transformation for the container. |
| srcrect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that, together with the dstrect parameter, specifies a scale transformation for the container. |
| unit | int | Member of the [GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure for the container. |

**Returns:**
[GraphicsContainer](../../com.aspose.drawing.drawing2d/graphicscontainer) - This method returns a [GraphicsContainer](../../com.aspose.drawing.drawing2d/graphicscontainer) that represents the state of this [Graphics](../../com.aspose.drawing/graphics) at the time of the method call.
### beginContainer(RectangleF dstrect, RectangleF srcrect, int unit) {#beginContainer-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-int-}
```
public final GraphicsContainer beginContainer(RectangleF dstrect, RectangleF srcrect, int unit)
```


Saves a graphics container with the current state of this [Graphics](../../com.aspose.drawing/graphics) and opens and uses a new graphics container with the specified scale transformation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dstrect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that, together with the srcrect parameter, specifies a scale transformation for the container. |
| srcrect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that, together with the dstrect parameter, specifies a scale transformation for the container. |
| unit | int | Member of the [GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure for the container. |

**Returns:**
[GraphicsContainer](../../com.aspose.drawing.drawing2d/graphicscontainer) - This method returns a [GraphicsContainer](../../com.aspose.drawing.drawing2d/graphicscontainer) that represents the state of this [Graphics](../../com.aspose.drawing/graphics) at the time of the method call.
### endContainer(GraphicsContainer container) {#endContainer-com.aspose.drawing.drawing2d.GraphicsContainer-}
```
public final void endContainer(GraphicsContainer container)
```


Closes the current graphics container and restores the state of this [Graphics](../../com.aspose.drawing/graphics) to the state saved by a call to the [.beginContainer](../../null/\#beginContainer) method.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| container | [GraphicsContainer](../../com.aspose.drawing.drawing2d/graphicscontainer) | [GraphicsContainer](../../com.aspose.drawing.drawing2d/graphicscontainer) that represents the container this method restores. |

### excludeClip(Region region) {#excludeClip-com.aspose.drawing.Region-}
```
public final void excludeClip(Region region)
```


Updates the clip region of this [Graphics](../../com.aspose.drawing/graphics) to exclude the area specified by a [Region](../../com.aspose.drawing/region).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| region | [Region](../../com.aspose.drawing/region) | [Region](../../com.aspose.drawing/region) that specifies the region to exclude from the clip region. |

### excludeClip(Rectangle rect) {#excludeClip-com.aspose.drawing.Rectangle-}
```
public final void excludeClip(Rectangle rect)
```


Updates the clip region of this [Graphics](../../com.aspose.drawing/graphics) to exclude the area specified by a [Rectangle](../../com.aspose.drawing/rectangle)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) that specifies the rectangle to exclude from the clip region. |

### enumerateMetafile(Metafile metafile, PointF destPoint, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData, ImageAttributes imageAttr) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-}
```
public final void enumerateMetafile(Metafile metafile, PointF destPoint, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData, ImageAttributes imageAttr)
```


Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point using specified image attributes.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoint | [PointF](../../com.aspose.drawing/pointf) | [PointF](../../com.aspose.drawing/pointf) structure that specifies the location of the upper-left corner of the drawn metafile. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| callbackData | byte[] | Internal pointer that is required, but ignored. You can pass byte[]\#Zero.Zero for this parameter. |
| imageAttr | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### enumerateMetafile(Metafile metafile, PointF destPoint, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---}
```
public final void enumerateMetafile(Metafile metafile, PointF destPoint, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData)
```


Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoint | [PointF](../../com.aspose.drawing/pointf) | [PointF](../../com.aspose.drawing/pointf) structure that specifies the location of the upper-left corner of the drawn metafile. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| callbackData | byte[] | Internal pointer that is required, but ignored. You can pass byte[]\#Zero.Zero for this parameter. |

### enumerateMetafile(Metafile metafile, PointF[] destPoints, Graphics.EnumerateMetafileProcByte callback) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF---com.aspose.drawing.Graphics.EnumerateMetafileProcByte-}
```
public final void enumerateMetafile(Metafile metafile, PointF[] destPoints, Graphics.EnumerateMetafileProcByte callback)
```


Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoints | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of three [PointF](../../com.aspose.drawing/pointf) structures that define a parallelogram that determines the size and location of the drawn metafile. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |

### enumerateMetafile(Metafile metafile, Point destPoint, Graphics.EnumerateMetafileProcByte callback) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-}
```
public final void enumerateMetafile(Metafile metafile, Point destPoint, Graphics.EnumerateMetafileProcByte callback)
```


Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoint | [Point](../../com.aspose.drawing/point) | [Point](../../com.aspose.drawing/point) structure that specifies the location of the upper-left corner of the drawn metafile. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |

### enumerateMetafile(Metafile metafile, Point destPoint, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---}
```
public final void enumerateMetafile(Metafile metafile, Point destPoint, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData)
```


Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoint | [Point](../../com.aspose.drawing/point) |  |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) |  |
| callbackData | byte[] |  |

### enumerateMetafile(Metafile metafile, Point destPoint, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData, ImageAttributes imageAttr) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-}
```
public final void enumerateMetafile(Metafile metafile, Point destPoint, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData, ImageAttributes imageAttr)
```


Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point using specified image attributes.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoint | [Point](../../com.aspose.drawing/point) | [Point](../../com.aspose.drawing/point) structure that specifies the location of the upper-left corner of the drawn metafile. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| callbackData | byte[] | Internal pointer that is required, but ignored. You can pass IntPtr\#Zero.Zero for this parameter. |
| imageAttr | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### enumerateMetafile(Metafile metafile, RectangleF destRect, Graphics.EnumerateMetafileProcByte callback) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.RectangleF-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-}
```
public final void enumerateMetafile(Metafile metafile, RectangleF destRect, Graphics.EnumerateMetafileProcByte callback)
```


Sends the records of the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destRect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the location and size of the drawn metafile. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |

### enumerateMetafile(Metafile metafile, RectangleF destRect, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.RectangleF-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---}
```
public final void enumerateMetafile(Metafile metafile, RectangleF destRect, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData)
```


Sends the records of the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destRect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the location and size of the drawn metafile. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| callbackData | byte[] | Internal pointer that is required, but ignored. You can pass IntPtr\#Zero.Zero for this parameter. |

### enumerateMetafile(Metafile metafile, RectangleF destRect, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData, ImageAttributes imageAttr) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.RectangleF-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-}
```
public final void enumerateMetafile(Metafile metafile, RectangleF destRect, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData, ImageAttributes imageAttr)
```


Sends the records of the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle using specified image attributes.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destRect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the location and size of the drawn metafile. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| callbackData | byte[] | Internal pointer that is required, but ignored. You can pass IntPtr\#Zero.Zero for this parameter. |
| imageAttr | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### enumerateMetafile(Metafile metafile, Rectangle destRect, Graphics.EnumerateMetafileProcByte callback) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Rectangle-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-}
```
public final void enumerateMetafile(Metafile metafile, Rectangle destRect, Graphics.EnumerateMetafileProcByte callback)
```


Sends the records of the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the location and size of the drawn metafile. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |

### enumerateMetafile(Metafile metafile, PointF destPoint, Graphics.EnumerateMetafileProcByte callback) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-}
```
public final void enumerateMetafile(Metafile metafile, PointF destPoint, Graphics.EnumerateMetafileProcByte callback)
```


Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoint | [PointF](../../com.aspose.drawing/pointf) |  |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) |  |

### enumerateMetafile(Metafile metafile, PointF[] destPoints, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF---com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---}
```
public final void enumerateMetafile(Metafile metafile, PointF[] destPoints, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData)
```


Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoints | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of three [PointF](../../com.aspose.drawing/pointf) structures that define a parallelogram that determines the size and location of the drawn metafile. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| callbackData | byte[] | Internal pointer that is required, but ignored. You can pass IntPtr\#Zero.Zero for this parameter. |

### enumerateMetafile(Metafile metafile, Point[] destPoints, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point---com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---}
```
public final void enumerateMetafile(Metafile metafile, Point[] destPoints, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData)
```


Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoints | [Point\[\]](../../com.aspose.drawing/point) | Array of three [Point](../../com.aspose.drawing/point) structures that define a parallelogram that determines the size and location of the drawn metafile. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| callbackData | byte[] | Internal pointer that is required, but ignored. You can pass IntPtr\#Zero.Zero for this parameter. |

### enumerateMetafile(Metafile metafile, Point[] destPoints, Graphics.EnumerateMetafileProcByte callback) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point---com.aspose.drawing.Graphics.EnumerateMetafileProcByte-}
```
public final void enumerateMetafile(Metafile metafile, Point[] destPoints, Graphics.EnumerateMetafileProcByte callback)
```


Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoints | [Point\[\]](../../com.aspose.drawing/point) | Array of three [Point](../../com.aspose.drawing/point) structures that define a parallelogram that determines the size and location of the drawn metafile. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |

### enumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, int unit, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData, ImageAttributes imageAttr) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point---com.aspose.drawing.Rectangle-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-}
```
public final void enumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, int unit, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData, ImageAttributes imageAttr)
```


Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram using specified image attributes.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoints | [Point\[\]](../../com.aspose.drawing/point) | Array of three [Point](../../com.aspose.drawing/point) structures that define a parallelogram that determines the size and location of the drawn metafile. |
| srcRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| unit | int | Member of the[GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the `srcRect` parameter contains. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| callbackData | byte[] | Internal pointer that is required, but ignored. You can pass IntPtr\#Zero.Zero for this parameter. |
| imageAttr | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### enumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point---com.aspose.drawing.Rectangle-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---}
```
public final void enumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData)
```


Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoints | [Point\[\]](../../com.aspose.drawing/point) | Array of three [Point](../../com.aspose.drawing/point) structures that define a parallelogram that determines the size and location of the drawn metafile. |
| srcRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | int | Member of the[GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the `srcRect` parameter contains. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| callbackData | byte[] | Internal pointer that is required, but ignored. You can pass IntPtr\#Zero.Zero for this parameter. |

### enumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point---com.aspose.drawing.Rectangle-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-}
```
public final void enumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback)
```


Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoints | [Point\[\]](../../com.aspose.drawing/point) | Array of three [Point](../../com.aspose.drawing/point) structures that define a parallelogram that determines the size and location of the drawn metafile. |
| srcRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | int | Member of the[GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the `srcRect` parameter contains. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |

### enumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, int unit, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData, ImageAttributes imageAttr) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF---com.aspose.drawing.RectangleF-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-}
```
public final void enumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, int unit, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData, ImageAttributes imageAttr)
```


Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram using specified image attributes.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoints | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of three [PointF](../../com.aspose.drawing/pointf) structures that define a parallelogram that determines the size and location of the drawn metafile. |
| srcRect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| unit | int | Member of the[GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the `srcRect` parameter contains. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| callbackData | byte[] | Internal pointer that is required, but ignored. You can pass IntPtr\#Zero.Zero for this parameter. |
| imageAttr | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### enumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF---com.aspose.drawing.RectangleF-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---}
```
public final void enumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes)
```


Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoints | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of three [PointF](../../com.aspose.drawing/pointf) structures that define a parallelogram that determines the size and location of the drawn metafile. |
| srcRect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | int | Member of the[GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the `srcRect` parameter contains. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| bytes | byte[] |  |

### enumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF---com.aspose.drawing.RectangleF-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-}
```
public final void enumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback)
```


Sends the records in a selected rectangle from a S[Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoints | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of three [PointF](../../com.aspose.drawing/pointf) structures that define a parallelogram that determines the size and location of the drawn metafile. |
| srcRect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | int | Member of the[GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the `srcRect` parameter contains. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |

### enumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, int unit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes, ImageAttributes imageAttr) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-}
```
public final void enumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, int unit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes, ImageAttributes imageAttr)
```


Sends the records of a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle using specified image attributes.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the location and size of the drawn metafile. |
| srcRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| unit | int | Member of the[GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the `srcRect` parameter contains. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| bytes | byte[] |  |
| imageAttr | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### enumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---}
```
public final void enumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes)
```


Sends the records of a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the location and size of the drawn metafile. |
| srcRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | int | Member of the[GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the `srcRect` parameter contains. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| bytes | byte[] |  |

### enumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Rectangle-com.aspose.drawing.Rectangle-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-}
```
public final void enumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback)
```


Sends the records of a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the location and size of the drawn metafile. |
| srcRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | int | Member of the[GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the `srcRect` parameter contains. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |

### enumerateMetafile(Metafile metafile, PointF[] destPoints, Graphics.EnumerateMetafileProcByte callback, byte[] bytes, ImageAttributes imageAttr) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF---com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-}
```
public final void enumerateMetafile(Metafile metafile, PointF[] destPoints, Graphics.EnumerateMetafileProcByte callback, byte[] bytes, ImageAttributes imageAttr)
```


Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram using specified image attributes.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoints | [PointF\[\]](../../com.aspose.drawing/pointf) | Array of three [PointF](../../com.aspose.drawing/pointf) structures that define a parallelogram that determines the size and location of the drawn metafile. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| bytes | byte[] |  |
| imageAttr | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### enumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, int unit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes, ImageAttributes imageAttr) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-}
```
public final void enumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, int unit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes, ImageAttributes imageAttr)
```


Sends the records of a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle using specified image attributes.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destRect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the location and size of the drawn metafile. |
| srcRect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| unit | int | Member of the[GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the `srcRect` parameter contains. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| bytes | byte[] |  |
| imageAttr | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### enumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-}
```
public final void enumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback)
```


Sends the records of a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destRect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the location and size of the drawn metafile. |
| srcRect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | int | Member of the[GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the `srcRect` parameter contains. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |

### enumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, int unit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes, ImageAttributes imageAttr) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point-com.aspose.drawing.Rectangle-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-}
```
public final void enumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, int unit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes, ImageAttributes imageAttr)
```


Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point using specified image attributes.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoint | [Point](../../com.aspose.drawing/point) | [Point](../../com.aspose.drawing/point) structure that specifies the location of the upper-left corner of the drawn metafile. |
| srcRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| unit | int | Member of the[GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the `srcRect` parameter contains. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| bytes | byte[] |  |
| imageAttr | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### enumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point-com.aspose.drawing.Rectangle-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---}
```
public final void enumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes)
```


Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoint | [Point](../../com.aspose.drawing/point) | [Point](../../com.aspose.drawing/point) structure that specifies the location of the upper-left corner of the drawn metafile. |
| srcRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | int | Member of the[GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the `srcRect` parameter contains. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| bytes | byte[] |  |

### enumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point-com.aspose.drawing.Rectangle-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-}
```
public final void enumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback)
```


Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoint | [Point](../../com.aspose.drawing/point) | [Point](../../com.aspose.drawing/point) structure that specifies the location of the upper-left corner of the drawn metafile. |
| srcRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | int | Member of the[GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the `srcRect` parameter contains. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |

### enumerateMetafile(Metafile metafile, Rectangle destRect, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Rectangle-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---}
```
public final void enumerateMetafile(Metafile metafile, Rectangle destRect, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData)
```


Sends the records of the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destRect | [Rectangle](../../com.aspose.drawing/rectangle) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the location and size of the drawn metafile. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| callbackData | byte[] | Internal pointer that is required, but ignored. You can pass IntPtr\#Zero.Zero for this parameter. |

### enumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, int unit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes, ImageAttributes imageAttr) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF-com.aspose.drawing.RectangleF-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-}
```
public final void enumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, int unit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes, ImageAttributes imageAttr)
```


Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point using specified image attributes.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoint | [PointF](../../com.aspose.drawing/pointf) | [PointF](../../com.aspose.drawing/pointf) structure that specifies the location of the upper-left corner of the drawn metafile. |
| srcRect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| unit | int | Member of the[GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the `srcRect` parameter contains. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| bytes | byte[] |  |
| imageAttr | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### enumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF-com.aspose.drawing.RectangleF-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---}
```
public final void enumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes)
```


Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoint | [PointF](../../com.aspose.drawing/pointf) | [PointF](../../com.aspose.drawing/pointf) structure that specifies the location of the upper-left corner of the drawn metafile. |
| srcRect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | int | Member of the[GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the `srcRect` parameter contains. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| bytes | byte[] |  |

### enumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.PointF-com.aspose.drawing.RectangleF-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-}
```
public final void enumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback)
```


Sends the records in a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display at a specified point.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoint | [PointF](../../com.aspose.drawing/pointf) | [PointF](../../com.aspose.drawing/pointf) structure that specifies the location of the upper-left corner of the drawn metafile. |
| srcRect | [RectangleF](../../com.aspose.drawing/rectanglef) | System.Drawing.RectangleF structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | int | Member of the[GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the `srcRect` parameter contains. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |

### enumerateMetafile(Metafile metafile, Point[] destPoints, Graphics.EnumerateMetafileProcByte callback, byte[] bytes, ImageAttributes imageAttr) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Point---com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-}
```
public final void enumerateMetafile(Metafile metafile, Point[] destPoints, Graphics.EnumerateMetafileProcByte callback, byte[] bytes, ImageAttributes imageAttr)
```


Sends the records in the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified parallelogram using specified image attributes.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destPoints | [Point\[\]](../../com.aspose.drawing/point) | Array of three [Point](../../com.aspose.drawing/point) structures that define a parallelogram that determines the size and location of the drawn metafile. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| bytes | byte[] |  |
| imageAttr | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### enumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.RectangleF-com.aspose.drawing.RectangleF-int-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---}
```
public final void enumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, int srcUnit, Graphics.EnumerateMetafileProcByte callback, byte[] bytes)
```


Sends the records of a selected rectangle from a [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destRect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the location and size of the drawn metafile. |
| srcRect | [RectangleF](../../com.aspose.drawing/rectanglef) | [RectangleF](../../com.aspose.drawing/rectanglef) structure that specifies the portion of the metafile, relative to its upper-left corner, to draw. |
| srcUnit | int | Member of the [GraphicsUnit](../../com.aspose.drawing/graphicsunit) enumeration that specifies the unit of measure used to determine the portion of the metafile that the rectangle specified by the `srcRect` parameter contains. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| bytes | byte[] |  |

### enumerateMetafile(Metafile metafile, Rectangle destRect, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData, ImageAttributes imageAttr) {#enumerateMetafile-com.aspose.drawing.imaging.Metafile-com.aspose.drawing.Rectangle-com.aspose.drawing.Graphics.EnumerateMetafileProcByte-byte---com.aspose.drawing.imaging.ImageAttributes-}
```
public final void enumerateMetafile(Metafile metafile, Rectangle destRect, Graphics.EnumerateMetafileProcByte callback, byte[] callbackData, ImageAttributes imageAttr)
```


Sends the records of the specified [Metafile](../../com.aspose.drawing.imaging/metafile), one at a time, to a callback method for display in a specified rectangle using specified image attributes.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| metafile | [Metafile](../../com.aspose.drawing.imaging/metafile) | [Metafile](../../com.aspose.drawing.imaging/metafile) to enumerate. |
| destRect | [Rectangle](../../com.aspose.drawing/rectangle) | [Rectangle](../../com.aspose.drawing/rectangle) structure that specifies the location and size of the drawn metafile. |
| callback | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) | [EnumerateMetafileProcByte](../../com.aspose.drawing/enumeratemetafileprocbyte) delegate that specifies the method to which the metafile records are sent. |
| callbackData | byte[] | Internal pointer that is required, but ignored. You can pass IntPtr\#Zero.Zero for this parameter. |
| imageAttr | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) that specifies image attribute information for the drawn image. |

### addMetafileComment(byte[] data) {#addMetafileComment-byte---}
```
public final void addMetafileComment(byte[] data)
```


Adds a comment to the current [Metafile](../../com.aspose.drawing.imaging/metafile).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | byte[] | Array of bytes that contains the comment. |

### beginUpdate() {#beginUpdate--}
```
public void beginUpdate()
```




### endUpdate() {#endUpdate--}
```
public void endUpdate()
```




### getImage() {#getImage--}
```
public Image getImage()
```




**Returns:**
[Image](../../com.aspose.imaging/image)
