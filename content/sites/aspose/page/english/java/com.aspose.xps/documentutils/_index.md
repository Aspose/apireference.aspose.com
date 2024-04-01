---
title: DocumentUtils
second_title: Aspose.Page for Java API Reference
description: This class provides utilities beyond the formal XPS manipulation API.
type: docs
weight: 10
url: /java/com.aspose.xps/documentutils/
---
**Inheritance:**
java.lang.Object
```
public class DocumentUtils
```

This class provides utilities beyond the formal XPS manipulation API.
## Methods

| Method | Description |
| --- | --- |
| [createCircle(Point2D center, float radius)](#createCircle-java.awt.geom.Point2D-float-) | Creates a path geometry representing a circle. |
| [createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)](#createCircularSegment-java.awt.geom.Point2D-float-float-float-) | Creates a path geometry representing a circular segment between two angles. |
| [createEllipse(Point2D center, float radiusX, float radiusY)](#createEllipse-java.awt.geom.Point2D-float-float-) | Creates a path geometry representing an ellipse. |
| [createImage(String fileName, Rectangle2D imageBox)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-) | Creates a rectangular path filled with an image. |
| [createImage(String fileName, Rectangle2D imageBox, ImageMode mode)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-) | Creates a rectangular path filled with an image. |
| [createPieSlice(Point2D center, float radius, float startAngle, float endAngle)](#createPieSlice-java.awt.geom.Point2D-float-float-float-) | Creates a path geometry representing a circle slice between two radial rays. |
| [createRectangle(Rectangle2D rectangle)](#createRectangle-java.awt.geom.Rectangle2D-) | Creates a path geometry representing a rectangle. |
| [createRegularCircumscribedNGon(int n, Point2D center, float radius)](#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-) | Creates a path geometry representing a regular n-gon circumscribed around a circle. |
| [createRegularInscribedNGon(int n, Point2D center, float radius)](#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-) | Creates a path geometry representing a regular n-gon inscribed in a circle. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### createCircle(Point2D center, float radius) {#createCircle-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createCircle(Point2D center, float radius)
```


Creates a path geometry representing a circle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| center | java.awt.geom.Point2D | The center point of the circle. |
| radius | float | The radius of the circle. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createCircularSegment(Point2D center, float radius, float startAngle, float endAngle) {#createCircularSegment-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)
```


Creates a path geometry representing a circular segment between two angles.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| center | java.awt.geom.Point2D | The center of the circle. |
| radius | float | The radius of the circle. |
| startAngle | float | The angle (degrees) of the starting ray. |
| endAngle | float | The angle (degrees) of the ending ray. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createEllipse(Point2D center, float radiusX, float radiusY) {#createEllipse-java.awt.geom.Point2D-float-float-}
```
public XpsPathGeometry createEllipse(Point2D center, float radiusX, float radiusY)
```


Creates a path geometry representing an ellipse.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| center | java.awt.geom.Point2D | The center point of the ellipse. |
| radiusX | float | The horizontal radius of the ellipse. |
| radiusY | float | The vertical radius of the ellipse. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createImage(String fileName, Rectangle2D imageBox) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox)
```


Creates a rectangular path filled with an image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | The name of the image file. |
| imageBox | java.awt.geom.Rectangle2D | The image box to fill with the image. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createImage(String fileName, Rectangle2D imageBox, ImageMode mode) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox, ImageMode mode)
```


Creates a rectangular path filled with an image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | The name of the image file. |
| imageBox | java.awt.geom.Rectangle2D | The image box to fill with the image. |
| mode | [ImageMode](../../com.aspose.xps/imagemode) | Image fit mode. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createPieSlice(Point2D center, float radius, float startAngle, float endAngle) {#createPieSlice-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createPieSlice(Point2D center, float radius, float startAngle, float endAngle)
```


Creates a path geometry representing a circle slice between two radial rays.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| center | java.awt.geom.Point2D | The center of the circle. |
| radius | float | The radius of the circle. |
| startAngle | float | The angle (degrees) of the starting ray. |
| endAngle | float | The angle (degrees) of the ending ray. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRectangle(Rectangle2D rectangle) {#createRectangle-java.awt.geom.Rectangle2D-}
```
public XpsPathGeometry createRectangle(Rectangle2D rectangle)
```


Creates a path geometry representing a rectangle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rectangle | java.awt.geom.Rectangle2D | The rectangle. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularCircumscribedNGon(int n, Point2D center, float radius) {#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularCircumscribedNGon(int n, Point2D center, float radius)
```


Creates a path geometry representing a regular n-gon circumscribed around a circle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| n | int | The number of vertices. |
| center | java.awt.geom.Point2D | The center of the circle. |
| radius | float | The radius of the circle. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularInscribedNGon(int n, Point2D center, float radius) {#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularInscribedNGon(int n, Point2D center, float radius)
```


Creates a path geometry representing a regular n-gon inscribed in a circle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| n | int | The number of vertices. |
| center | java.awt.geom.Point2D | The center of the circle. |
| radius | float | The radius of the circle. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
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
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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

