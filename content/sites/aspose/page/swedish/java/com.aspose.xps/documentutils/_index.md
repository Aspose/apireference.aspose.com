---
title: "DocumentUtils"
second_title: "Aspose.Page för Java API-referens"
description: "Denna klass tillhandahåller verktyg utöver det formella XPS‑manipulerings‑API‑et."
type: docs
weight: 10
url: /sv/java/com.aspose.xps/documentutils/
---
**Inheritance:**
java.lang.Object
```
public class DocumentUtils
```

Denna klass tillhandahåller verktyg utöver det formella XPS‑manipulerings‑API‑et.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [createCircle(Point2D center, float radius)](#createCircle-java.awt.geom.Point2D-float-) | Skapar en sökvägsgeometri som representerar en cirkel. |
| [createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)](#createCircularSegment-java.awt.geom.Point2D-float-float-float-) | Skapar en sökvägsgeometri som representerar ett cirkulärt segment mellan två vinklar. |
| [createEllipse(Point2D center, float radiusX, float radiusY)](#createEllipse-java.awt.geom.Point2D-float-float-) | Skapar en sökvägsgeometri som representerar en ellips. |
| [createImage(String fileName, Rectangle2D imageBox)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-) | Skapar en rektangulär sökväg fylld med en bild. |
| [createImage(String fileName, Rectangle2D imageBox, ImageMode mode)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-) | Skapar en rektangulär sökväg fylld med en bild. |
| [createPieSlice(Point2D center, float radius, float startAngle, float endAngle)](#createPieSlice-java.awt.geom.Point2D-float-float-float-) | Skapar en sökvägsgeometri som representerar ett cirkelsegment mellan två radiala strålar. |
| [createRectangle(Rectangle2D rectangle)](#createRectangle-java.awt.geom.Rectangle2D-) | Skapar en sökvägsgeometri som representerar en rektangel. |
| [createRegularCircumscribedNGon(int n, Point2D center, float radius)](#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-) | Skapar en sökvägsgeometri som representerar en regelbunden n‑gon omskriven runt en cirkel. |
| [createRegularInscribedNGon(int n, Point2D center, float radius)](#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-) | Skapar en sökvägsgeometri som representerar en regelbunden n‑gon inskriven i en cirkel. |
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


Skapar en sökvägsgeometri som representerar en cirkel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| centrum | java.awt.geom.Point2D | Centrumpunkten för cirkeln. |
| radie | float | Radien på cirkeln. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createCircularSegment(Point2D center, float radius, float startAngle, float endAngle) {#createCircularSegment-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)
```


Skapar en sökvägsgeometri som representerar ett cirkulärt segment mellan två vinklar.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| centrum | java.awt.geom.Point2D | Centrumpunkten i cirkeln. |
| radie | float | Radien på cirkeln. |
| startAngle | float | Vinkeln (grader) för startstrålen. |
| endAngle | float | Vinkeln (grader) för slutstrålen. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createEllipse(Point2D center, float radiusX, float radiusY) {#createEllipse-java.awt.geom.Point2D-float-float-}
```
public XpsPathGeometry createEllipse(Point2D center, float radiusX, float radiusY)
```


Skapar en sökvägsgeometri som representerar en ellips.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| centrum | java.awt.geom.Point2D | Centrumpunkten för ellipsen. |
| radiusX | float | Den horisontella radien för ellipsen. |
| radiusY | float | Den vertikala radien för ellipsen. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createImage(String fileName, Rectangle2D imageBox) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox)
```


Skapar en rektangulär sökväg fylld med en bild.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fileName | java.lang.String | Namnet på bildfilen. |
| imageBox | java.awt.geom.Rectangle2D | Bildrutan att fylla med bilden. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createImage(String fileName, Rectangle2D imageBox, ImageMode mode) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox, ImageMode mode)
```


Skapar en rektangulär sökväg fylld med en bild.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fileName | java.lang.String | Namnet på bildfilen. |
| imageBox | java.awt.geom.Rectangle2D | Bildrutan att fylla med bilden. |
| mode | [ImageMode](../../com.aspose.xps/imagemode) | Bildanpassningsläge. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createPieSlice(Point2D center, float radius, float startAngle, float endAngle) {#createPieSlice-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createPieSlice(Point2D center, float radius, float startAngle, float endAngle)
```


Skapar en sökvägsgeometri som representerar ett cirkelsegment mellan två radiala strålar.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| centrum | java.awt.geom.Point2D | Centrumpunkten i cirkeln. |
| radie | float | Radien på cirkeln. |
| startAngle | float | Vinkeln (grader) för startstrålen. |
| endAngle | float | Vinkeln (grader) för slutstrålen. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRectangle(Rectangle2D rectangle) {#createRectangle-java.awt.geom.Rectangle2D-}
```
public XpsPathGeometry createRectangle(Rectangle2D rectangle)
```


Skapar en sökvägsgeometri som representerar en rektangel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| rektangel | java.awt.geom.Rectangle2D | Rektangeln. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularCircumscribedNGon(int n, Point2D center, float radius) {#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularCircumscribedNGon(int n, Point2D center, float radius)
```


Skapar en sökvägsgeometri som representerar en regelbunden n‑gon omskriven runt en cirkel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| n | int | Antalet hörn. |
| centrum | java.awt.geom.Point2D | Centrumpunkten i cirkeln. |
| radie | float | Radien på cirkeln. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularInscribedNGon(int n, Point2D center, float radius) {#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularInscribedNGon(int n, Point2D center, float radius)
```


Skapar en sökvägsgeometri som representerar en regelbunden n‑gon inskriven i en cirkel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| n | int | Antalet hörn. |
| centrum | java.awt.geom.Point2D | Centrumpunkten i cirkeln. |
| radie | float | Radien på cirkeln. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

