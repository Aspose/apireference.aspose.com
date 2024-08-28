---
title: PageAPI
second_title: Aspose.Page for Java API Reference
description: The Page element modification API.
type: docs
weight: 12
url: /java/com.aspose.xps.features.eventbasedmodifications/pageapi/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.xps.features.EventBasedModifications.IModificationAPI](../../com.aspose.xps.features.eventbasedmodifications/imodificationapi)
```
public class PageAPI implements EventBasedModifications.IModificationAPI
```

The **Page** element modification API.
## Methods

| Method | Description |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Adds a content element (Canvas, Path, or Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Inserts an element (Canvas, Path, or Glyphs) to the page at  index  position. |
| [<T>remove(T element)](#-T-remove-T-) | Removes an element from the page. |
| [addCanvas()](#addCanvas--) | Adds a new canvas to the page. |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Adds new glyphs to the page. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Adds new glyphs to the page. |
| [addOutlineEntry(String description, int outlineLevel, int targetPageNumber)](#addOutlineEntry-java.lang.String-int-int-) | Adds an outline entry to the document. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Adds a new path to the page. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | Creates a new stroked elliptical arc segment. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | Creates a new elliptical arc segment. |
| [createCanvas()](#createCanvas--) | Creates a new canvas. |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | Creates a new color in ICC based color space. |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | Creates a new color in scRGB color space. |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | Creates a new color in scRGB color space. |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | Creates a new color in sRGB color space. |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | Creates a new color in sRGB color space. |
| [createColor(Color color)](#createColor-java.awt.Color-) | Creates a new color. |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | Creates a new color in ICC based color space. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Creates new glyphs. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Creates new glyphs. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Creates a new gradient stop. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Creates a new gradient stop. |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Creates a new image brush. |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Creates a new image brush. |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | Creates a new linear gradient brush. |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | Creates a new linear gradient brush. |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | Creates a new affine transformation matrix. |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | Creates a new path. |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | Creates a new open path figure. |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | Creates a new path figure. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | Creates a new open path figure. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | Creates a new path figure. |
| [createPathGeometry()](#createPathGeometry--) | Creates a new path geometry. |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | Creates a new path geometry specified with abbreviated form. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | Creates a new path geometry with specified list of path figures. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | Creates a new set of stroked cubic B?zier curves. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | Creates a new set of cubic B?zier curves. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | Creates a new stroked polygonal drawing containing an arbitrary number of individual vertices. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | Creates a new polygonal drawing containing an arbitrary number of individual vertices. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | Creates a new set of stroked quadratic B?zier curves from the previous point in the path figure through a set of vertices, using specified control points. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | Creates a new set of quadratic B?zier curves from the previous point in the path figure through a set of vertices, using specified control points. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Creates a new radial gradient brush. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Creates a new radial gradient brush. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | Creates a new solid color brush. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | Creates a new solid color brush. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Creates a new visual brush. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | Returns the height of the page, expressed as a real number in units of the effective coordinate space. |
| [getPageCount()](#getPageCount--) | Returns the number of pages in the active document. |
| [getTotalPageCount()](#getTotalPageCount--) | Returns the total number of pages in all documents inside XPS document. |
| [getUtils()](#getUtils--) | Gets the object that provides utilities beyond the formal XPS manipulation API. |
| [getWidth()](#getWidth--) | Returns the width of the page, expressed as a real number in units of the effective coordinate space. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Inserts a new canvas to the page at  index  position. |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Inserts new glyphs to the page at  index  position. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Inserts new glyphs to the page at  index  position. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Inserts a new path to the page at  index  position. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Removes an element at  index  position from the page. |
| [setHeight(float value)](#setHeight-float-) | Sets the height of the page, expressed as a real number in units of the effective coordinate space. |
| [setWidth(float value)](#setWidth-float-) | Sets the width of the page, expressed as a real number in units of the effective coordinate space. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Adds a content element (Canvas, Path, or Glyphs)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| element | T | The element to add. |

**Returns:**
T - Added element.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Inserts an element (Canvas, Path, or Glyphs) to the page at  index  position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which an  element  should be inserted. |
| element | T | The element to insert. |

**Returns:**
T - Inserted element.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


Removes an element from the page.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| element | T | The element to remove. |

**Returns:**
T - Removed element.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Adds a new canvas to the page.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Adds new glyphs to the page.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Font resource. |
| fontRenderingEmSize | float | Font size. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin Y coordinate. |
| unicodeString | java.lang.String | String to be printed. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Adds new glyphs to the page.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontFamily | java.lang.String | Font family. |
| fontRenderingEmSize | float | Font size. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Font style. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin Y coordinate. |
| unicodeString | java.lang.String | String to be printed. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, int targetPageNumber) {#addOutlineEntry-java.lang.String-int-int-}
```
public void addOutlineEntry(String description, int outlineLevel, int targetPageNumber)
```


Adds an outline entry to the document.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| description | java.lang.String | The entry description. |
| outlineLevel | int | The outline level. |
| targetPageNumber | int | The target page number. |

### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Adds a new path to the page.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | The geometry of the path. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


Creates a new stroked elliptical arc segment.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point | java.awt.geom.Point2D | The end point of the elliptical arc. |
| size | java.awt.geom.Dimension2D | The x and y radius of the elliptical arc as an x,y pair. |
| rotationAngle | float | Indicates how the ellipse is rotated relative to the current coordinate system. |
| isLargeArc | boolean | Determines whether the arc is drawn with a sweep of 180 or greater. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | The direction in which the arc is drawn. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


Creates a new elliptical arc segment.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point | java.awt.geom.Point2D | The end point of the elliptical arc. |
| size | java.awt.geom.Dimension2D | The x and y radius of the elliptical arc as an x,y pair. |
| rotationAngle | float | Indicates how the ellipse is rotated relative to the current coordinate system. |
| isLargeArc | boolean | Determines whether the arc is drawn with a sweep of 180 or greater. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | The direction in which the arc is drawn. |
| isStroked | boolean | Specifies whether the stroke for this segment of the path is drawn. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


Creates a new canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


Creates a new color in ICC based color space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | The ICC profile resource. |
| components | float[] | Color components. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


Creates a new color in scRGB color space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| r | float | The red color component. |
| g | float | The green color component. |
| b | float | The blue color component. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


Creates a new color in scRGB color space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | float | The alpha color component. |
| r | float | The red color component. |
| g | float | The green color component. |
| b | float | The blue color component. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


Creates a new color in sRGB color space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| r | int | The red color component. |
| g | int | The green color component. |
| b | int | The blue color component. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


Creates a new color in sRGB color space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | int | The alpha color component. |
| r | int | The red color component. |
| g | int | The green color component. |
| b | int | The blue color component. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


Creates a new color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| color | java.awt.Color | A native color instance for RGB color. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


Creates a new color in ICC based color space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | java.lang.String | The path to the ICC profile. |
| components | float[] | Color components. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Creates new glyphs.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Font resource. |
| fontRenderingEmSize | float | Font size. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin Y coordinate. |
| unicodeString | java.lang.String | String to be printed. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Creates new glyphs.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fontFamily | java.lang.String | Font family. |
| fontRenderingEmSize | float | Font size. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Font style. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin Y coordinate. |
| unicodeString | java.lang.String | String to be printed. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


Creates a new gradient stop.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | The gradient stop color. |
| offset | float | The gradient offset. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


Creates a new gradient stop.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| color | java.awt.Color | The gradient stop color. |
| offset | float | The gradient offset. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


Creates a new image brush.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | An image resource. |
| viewbox | java.awt.geom.Rectangle2D | The position and dimensions of the brush's source content. |
| viewport | java.awt.geom.Rectangle2D | The region in the containing coordinate space of the prime brush tile that is (possibly repeatedly) applied to fill the region to which the brush is applied |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


Creates a new image brush.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| imagePath | java.lang.String | The path to the image to take as a brush tile. |
| viewbox | java.awt.geom.Rectangle2D | The position and dimensions of the brush's source content. |
| viewport | java.awt.geom.Rectangle2D | The region in the containing coordinate space of the prime brush tile that is (possibly repeatedly) applied to fill the region to which the brush is applied |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


Creates a new linear gradient brush.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | The starting point of the linear gradient. |
| endPoint | java.awt.geom.Point2D | The end point of the linear gradient. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


Creates a new linear gradient brush.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | The list of gradient stops. |
| startPoint | java.awt.geom.Point2D | The starting point of the linear gradient. |
| endPoint | java.awt.geom.Point2D | The end point of the linear gradient. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


Creates a new affine transformation matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| m11 | float | Element 11. |
| m12 | float | Element 12. |
| m21 | float | Element 21. |
| m22 | float | Element 22. |
| m31 | float | Element 31. |
| m32 | float | Element 32. |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


Creates a new path.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | The geometry of the path. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


Creates a new open path figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | The starting point for the first segment of the path figure. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


Creates a new path figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | The starting point for the first segment of the path figure. |
| isClosed | boolean | Specifies whether the path is closed. If set to true, the stroke is drawn "closed", that is, the last point in the last segment of the path figure is connected with the point specified in the StartPoint attribute, otherwise the stroke is drawn "open", and the last point is not connected to the start point. Only applicable if the path figure is used in a Path element that specifies a stroke. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


Creates a new open path figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | The starting point for the first segment of the path figure. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | List of path segments. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


Creates a new path figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | The starting point for the first segment of the path figure. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | List of path segments. |
| isClosed | boolean | Specifies whether the path is closed. If set to true, the stroke is drawn "closed", that is, the last point in the last segment of the path figure is connected with the point specified in the StartPoint attribute, otherwise the stroke is drawn "open", and the last point is not connected to the start point. Only applicable if the path figure is used in a Path element that specifies a stroke. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


Creates a new path geometry.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


Creates a new path geometry specified with abbreviated form.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | Abbreviated form of path geometry. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


Creates a new path geometry with specified list of path figures.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | List of path figures. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


Creates a new set of stroked cubic B?zier curves.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Control points for multiple B?zier segments. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


Creates a new set of cubic B?zier curves.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Control points for multiple B?zier segments. |
| isStroked | boolean | Specifies whether the stroke for this segment of the path is drawn. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


Creates a new stroked polygonal drawing containing an arbitrary number of individual vertices.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | A set of coordinates for the multiple segments that define the poly line segment. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


Creates a new polygonal drawing containing an arbitrary number of individual vertices.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | A set of coordinates for the multiple segments that define the poly line segment. |
| isStroked | boolean | Specifies whether the stroke for this segment of the path is drawn. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


Creates a new set of stroked quadratic B?zier curves from the previous point in the path figure through a set of vertices, using specified control points.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Control points for multiple quadratic B?zier segments. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


Creates a new set of quadratic B?zier curves from the previous point in the path figure through a set of vertices, using specified control points.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Control points for multiple quadratic B?zier segments. |
| isStroked | boolean | Specifies whether the stroke for this segment of the path is drawn. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Creates a new radial gradient brush.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| center | java.awt.geom.Point2D | The center point of the radial gradient (that is, the center of the ellipse). |
| gradientOrigin | java.awt.geom.Point2D | The origin point of the radial gradient. |
| radiusX | float | The radius in the x dimension of the ellipse which defines the radial gradient. |
| radiusY | float | The radius in the y dimension of the ellipse which defines the radial gradient. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Creates a new radial gradient brush.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | The list of gradient stops. |
| center | java.awt.geom.Point2D | The center point of the radial gradient (that is, the center of the ellipse). |
| gradientOrigin | java.awt.geom.Point2D | The origin point of the radial gradient. |
| radiusX | float | The radius in the x dimension of the ellipse which defines the radial gradient. |
| radiusY | float | The radius in the y dimension of the ellipse which defines the radial gradient. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


Creates a new solid color brush.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | The color for filled elements. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


Creates a new solid color brush.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| color | java.awt.Color | The color for filled elements. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


Creates a new visual brush.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | The XPS element (Canvas, Path, or Glyphs) for Visual property od visual brush. |
| viewbox | java.awt.geom.Rectangle2D | The position and dimensions of the brush's source content. |
| viewport | java.awt.geom.Rectangle2D | The region in the containing coordinate space of the prime brush tile that is (possibly repeatedly) applied to fill the region to which the brush is applied |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public float getHeight()
```


Returns the height of the page, expressed as a real number in units of the effective coordinate space.

**Returns:**
float - The height of the page.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Returns the number of pages in the active document.

**Returns:**
int - The number of pages in the active document.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


Returns the total number of pages in all documents inside XPS document.

**Returns:**
int - The total number of pages in all documents inside XPS document.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


Gets the object that provides utilities beyond the formal XPS manipulation API.

**Returns:**
[DocumentUtils](../../com.aspose.xps/documentutils) - The object that provides utilities beyond the formal XPS manipulation API.
### getWidth() {#getWidth--}
```
public float getWidth()
```


Returns the width of the page, expressed as a real number in units of the effective coordinate space.

**Returns:**
float - The width of the page.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


Inserts a new canvas to the page at  index  position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a new canvas should be inserted. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Inserts new glyphs to the page at  index  position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which new glyphs should be inserted. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Font resource. |
| fontSize | float | Font size. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin Y coordinate. |
| unicodeString | java.lang.String | String to be printed. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Inserts new glyphs to the page at  index  position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which new glyphs should be inserted. |
| fontFamily | java.lang.String | Font family. |
| fontSize | float | Font size. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Font style. |
| originX | float | Glyphs origin X coordinate. |
| originY | float | Glyphs origin Y coordinate. |
| unicodeString | java.lang.String | String to be printed. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Inserts a new path to the page at  index  position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a new path should be inserted. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | The geometry of the path. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### removeAt(int index) {#removeAt-int-}
```
public XpsContentElement removeAt(int index)
```


Removes an element at  index  position from the page.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which element should be removed. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


Sets the height of the page, expressed as a real number in units of the effective coordinate space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The height of the page. |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


Sets the width of the page, expressed as a real number in units of the effective coordinate space.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | The width of the page. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

