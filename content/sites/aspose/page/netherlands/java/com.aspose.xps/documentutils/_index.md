---
title: "DocumentUtils"
second_title: "Aspose.Page voor Java API-referentie"
description: "Deze klasse biedt hulpmiddelen die verder gaan dan de formele XPS-manipulatie-API."
type: docs
weight: 10
url: /nl/java/com.aspose.xps/documentutils/
---
**Inheritance:**
java.lang.Object
```
public class DocumentUtils
```

Deze klasse biedt hulpmiddelen die verder gaan dan de formele XPS-manipulatie-API.
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [createCircle(Point2D center, float radius)](#createCircle-java.awt.geom.Point2D-float-) | Maakt een padgeometrie die een cirkel weergeeft. |
| [createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)](#createCircularSegment-java.awt.geom.Point2D-float-float-float-) | Maakt een padgeometrie die een cirkelsegment tussen twee hoeken weergeeft. |
| [createEllipse(Point2D center, float radiusX, float radiusY)](#createEllipse-java.awt.geom.Point2D-float-float-) | Maakt een padgeometrie die een ellips weergeeft. |
| [createImage(String fileName, Rectangle2D imageBox)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-) | Maakt een rechthoekig pad gevuld met een afbeelding. |
| [createImage(String fileName, Rectangle2D imageBox, ImageMode mode)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-) | Maakt een rechthoekig pad gevuld met een afbeelding. |
| [createPieSlice(Point2D center, float radius, float startAngle, float endAngle)](#createPieSlice-java.awt.geom.Point2D-float-float-float-) | Maakt een padgeometrie die een cirkelsegment tussen twee radiale stralen weergeeft. |
| [createRectangle(Rectangle2D rectangle)](#createRectangle-java.awt.geom.Rectangle2D-) | Maakt een padgeometrie die een rechthoek weergeeft. |
| [createRegularCircumscribedNGon(int n, Point2D center, float radius)](#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-) | Maakt een padgeometrie die een regelmatig n‑hoekig veelhoek omschreven rond een cirkel weergeeft. |
| [createRegularInscribedNGon(int n, Point2D center, float radius)](#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-) | Maakt een padgeometrie die een regelmatig n‑hoekig veelhoek ingeschreven in een cirkel weergeeft. |
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


Maakt een padgeometrie die een cirkel weergeeft.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Het middelpunt van de cirkel. |
| straal | float | De straal van de cirkel. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createCircularSegment(Point2D center, float radius, float startAngle, float endAngle) {#createCircularSegment-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)
```


Maakt een padgeometrie die een cirkelsegment tussen twee hoeken weergeeft.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Het centrum van de cirkel. |
| straal | float | De straal van de cirkel. |
| startAngle | float | De hoek (graden) van de startstraal. |
| endAngle | float | De hoek (graden) van de eindstraal. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createEllipse(Point2D center, float radiusX, float radiusY) {#createEllipse-java.awt.geom.Point2D-float-float-}
```
public XpsPathGeometry createEllipse(Point2D center, float radiusX, float radiusY)
```


Maakt een padgeometrie die een ellips weergeeft.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Het middelpunt van de ellips. |
| radiusX | float | De horizontale straal van de ellips. |
| radiusY | float | De verticale straal van de ellips. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createImage(String fileName, Rectangle2D imageBox) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox)
```


Maakt een rechthoekig pad gevuld met een afbeelding.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fileName | java.lang.String | De naam van het afbeeldingsbestand. |
| imageBox | java.awt.geom.Rectangle2D | Het afbeeldingsvak om te vullen met de afbeelding. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createImage(String fileName, Rectangle2D imageBox, ImageMode mode) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox, ImageMode mode)
```


Maakt een rechthoekig pad gevuld met een afbeelding.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| fileName | java.lang.String | De naam van het afbeeldingsbestand. |
| imageBox | java.awt.geom.Rectangle2D | Het afbeeldingsvak om te vullen met de afbeelding. |
| mode | [ImageMode](../../com.aspose.xps/imagemode) | Afbeeldingsaanpassingsmodus. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createPieSlice(Point2D center, float radius, float startAngle, float endAngle) {#createPieSlice-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createPieSlice(Point2D center, float radius, float startAngle, float endAngle)
```


Maakt een padgeometrie die een cirkelsegment tussen twee radiale stralen weergeeft.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Het centrum van de cirkel. |
| straal | float | De straal van de cirkel. |
| startAngle | float | De hoek (graden) van de startstraal. |
| endAngle | float | De hoek (graden) van de eindstraal. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRectangle(Rectangle2D rectangle) {#createRectangle-java.awt.geom.Rectangle2D-}
```
public XpsPathGeometry createRectangle(Rectangle2D rectangle)
```


Maakt een padgeometrie die een rechthoek weergeeft.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rectangle | java.awt.geom.Rectangle2D | De rechthoek. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularCircumscribedNGon(int n, Point2D center, float radius) {#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularCircumscribedNGon(int n, Point2D center, float radius)
```


Maakt een padgeometrie die een regelmatig n‑hoekig veelhoek omschreven rond een cirkel weergeeft.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| n | int | Het aantal hoekpunten. |
| center | java.awt.geom.Point2D | Het centrum van de cirkel. |
| straal | float | De straal van de cirkel. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularInscribedNGon(int n, Point2D center, float radius) {#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularInscribedNGon(int n, Point2D center, float radius)
```


Maakt een padgeometrie die een regelmatig n‑hoekig veelhoek ingeschreven in een cirkel weergeeft.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| n | int | Het aantal hoekpunten. |
| center | java.awt.geom.Point2D | Het centrum van de cirkel. |
| straal | float | De straal van de cirkel. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

