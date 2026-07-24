---
title: "DocumentUtils"
second_title: "Aspose.Page for Java API-Referenz"
description: "Diese Klasse bietet Hilfsprogramme über die offizielle XPS-Manipulations-API hinaus."
type: docs
weight: 10
url: /de/java/com.aspose.xps/documentutils/
---
**Inheritance:**
java.lang.Object
```
public class DocumentUtils
```

Diese Klasse bietet Hilfsprogramme über die offizielle XPS-Manipulations-API hinaus.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [createCircle(Point2D center, float radius)](#createCircle-java.awt.geom.Point2D-float-) | Erstellt eine Pfadgeometrie, die einen Kreis darstellt. |
| [createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)](#createCircularSegment-java.awt.geom.Point2D-float-float-float-) | Erstellt eine Pfadgeometrie, die ein kreisförmiges Segment zwischen zwei Winkeln darstellt. |
| [createEllipse(Point2D center, float radiusX, float radiusY)](#createEllipse-java.awt.geom.Point2D-float-float-) | Erstellt eine Pfadgeometrie, die eine Ellipse darstellt. |
| [createImage(String fileName, Rectangle2D imageBox)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-) | Erstellt einen rechteckigen Pfad, der mit einem Bild gefüllt ist. |
| [createImage(String fileName, Rectangle2D imageBox, ImageMode mode)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-) | Erstellt einen rechteckigen Pfad, der mit einem Bild gefüllt ist. |
| [createPieSlice(Point2D center, float radius, float startAngle, float endAngle)](#createPieSlice-java.awt.geom.Point2D-float-float-float-) | Erstellt eine Pfadgeometrie, die ein Kreissegment zwischen zwei radialen Strahlen darstellt. |
| [createRectangle(Rectangle2D rectangle)](#createRectangle-java.awt.geom.Rectangle2D-) | Erstellt eine Pfadgeometrie, die ein Rechteck darstellt. |
| [createRegularCircumscribedNGon(int n, Point2D center, float radius)](#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-) | Erstellt eine Pfadgeometrie, die ein regelmäßiges n-Eck darstellt, das um einen Kreis herum beschrieben ist. |
| [createRegularInscribedNGon(int n, Point2D center, float radius)](#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-) | Erstellt eine Pfadgeometrie, die ein regelmäßiges n-Eck darstellt, das in einen Kreis eingeschrieben ist. |
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


Erstellt eine Pfadgeometrie, die einen Kreis darstellt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Der Mittelpunkt des Kreises. |
| Radius | float | Der Radius des Kreises. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createCircularSegment(Point2D center, float radius, float startAngle, float endAngle) {#createCircularSegment-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)
```


Erstellt eine Pfadgeometrie, die ein kreisförmiges Segment zwischen zwei Winkeln darstellt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Der Mittelpunkt des Kreises. |
| Radius | float | Der Radius des Kreises. |
| startAngle | float | Der Winkel (Grad) des Startstrahls. |
| endAngle | float | Der Winkel (Grad) des Endstrahls. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createEllipse(Point2D center, float radiusX, float radiusY) {#createEllipse-java.awt.geom.Point2D-float-float-}
```
public XpsPathGeometry createEllipse(Point2D center, float radiusX, float radiusY)
```


Erstellt eine Pfadgeometrie, die eine Ellipse darstellt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Der Mittelpunkt der Ellipse. |
| radiusX | float | Der horizontale Radius der Ellipse. |
| radiusY | float | Der vertikale Radius der Ellipse. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createImage(String fileName, Rectangle2D imageBox) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox)
```


Erstellt einen rechteckigen Pfad, der mit einem Bild gefüllt ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Der Name der Bilddatei. |
| imageBox | java.awt.geom.Rectangle2D | Der Bildrahmen, der mit dem Bild gefüllt wird. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createImage(String fileName, Rectangle2D imageBox, ImageMode mode) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox, ImageMode mode)
```


Erstellt einen rechteckigen Pfad, der mit einem Bild gefüllt ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Der Name der Bilddatei. |
| imageBox | java.awt.geom.Rectangle2D | Der Bildrahmen, der mit dem Bild gefüllt wird. |
| mode | [ImageMode](../../com.aspose.xps/imagemode) | Bild-Anpassungsmodus. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createPieSlice(Point2D center, float radius, float startAngle, float endAngle) {#createPieSlice-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createPieSlice(Point2D center, float radius, float startAngle, float endAngle)
```


Erstellt eine Pfadgeometrie, die ein Kreissegment zwischen zwei radialen Strahlen darstellt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Der Mittelpunkt des Kreises. |
| Radius | float | Der Radius des Kreises. |
| startAngle | float | Der Winkel (Grad) des Startstrahls. |
| endAngle | float | Der Winkel (Grad) des Endstrahls. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRectangle(Rectangle2D rectangle) {#createRectangle-java.awt.geom.Rectangle2D-}
```
public XpsPathGeometry createRectangle(Rectangle2D rectangle)
```


Erstellt eine Pfadgeometrie, die ein Rechteck darstellt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rectangle | java.awt.geom.Rectangle2D | Das Rechteck. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularCircumscribedNGon(int n, Point2D center, float radius) {#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularCircumscribedNGon(int n, Point2D center, float radius)
```


Erstellt eine Pfadgeometrie, die ein regelmäßiges n-Eck darstellt, das um einen Kreis herum beschrieben ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| n | int | Die Anzahl der Scheitelpunkte. |
| center | java.awt.geom.Point2D | Der Mittelpunkt des Kreises. |
| Radius | float | Der Radius des Kreises. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularInscribedNGon(int n, Point2D center, float radius) {#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularInscribedNGon(int n, Point2D center, float radius)
```


Erstellt eine Pfadgeometrie, die ein regelmäßiges n-Eck darstellt, das in einen Kreis eingeschrieben ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| n | int | Die Anzahl der Scheitelpunkte. |
| center | java.awt.geom.Point2D | Der Mittelpunkt des Kreises. |
| Radius | float | Der Radius des Kreises. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

