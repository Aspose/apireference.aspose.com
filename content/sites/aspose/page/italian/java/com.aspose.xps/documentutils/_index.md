---
title: "DocumentUtils"
second_title: "Aspose.Page per Java API Reference"
description: "Questa classe fornisce utilità oltre l'API formale di manipolazione XPS."
type: docs
weight: 10
url: /it/java/com.aspose.xps/documentutils/
---
**Inheritance:**
java.lang.Object
```
public class DocumentUtils
```

Questa classe fornisce utilità oltre l'API formale di manipolazione XPS.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [createCircle(Point2D center, float radius)](#createCircle-java.awt.geom.Point2D-float-) | Crea una geometria di percorso che rappresenta un cerchio. |
| [createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)](#createCircularSegment-java.awt.geom.Point2D-float-float-float-) | Crea una geometria di percorso che rappresenta un segmento circolare tra due angoli. |
| [createEllipse(Point2D center, float radiusX, float radiusY)](#createEllipse-java.awt.geom.Point2D-float-float-) | Crea una geometria di percorso che rappresenta un'ellisse. |
| [createImage(String fileName, Rectangle2D imageBox)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-) | Crea un percorso rettangolare riempito con un'immagine. |
| [createImage(String fileName, Rectangle2D imageBox, ImageMode mode)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-) | Crea un percorso rettangolare riempito con un'immagine. |
| [createPieSlice(Point2D center, float radius, float startAngle, float endAngle)](#createPieSlice-java.awt.geom.Point2D-float-float-float-) | Crea una geometria di percorso che rappresenta una fetta di cerchio tra due raggi radiali. |
| [createRectangle(Rectangle2D rectangle)](#createRectangle-java.awt.geom.Rectangle2D-) | Crea una geometria di percorso che rappresenta un rettangolo. |
| [createRegularCircumscribedNGon(int n, Point2D center, float radius)](#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-) | Crea una geometria di percorso che rappresenta un n-gono regolare circoscritto attorno a un cerchio. |
| [createRegularInscribedNGon(int n, Point2D center, float radius)](#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-) | Crea una geometria di percorso che rappresenta un n-gono regolare inscritto in un cerchio. |
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


Crea una geometria di percorso che rappresenta un cerchio.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Il punto centrale del cerchio. |
| radius | float | Il raggio del cerchio. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createCircularSegment(Point2D center, float radius, float startAngle, float endAngle) {#createCircularSegment-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)
```


Crea una geometria di percorso che rappresenta un segmento circolare tra due angoli.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Il centro del cerchio. |
| radius | float | Il raggio del cerchio. |
| startAngle | float | L'angolo (gradi) del raggio iniziale. |
| endAngle | float | L'angolo (gradi) del raggio finale. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createEllipse(Point2D center, float radiusX, float radiusY) {#createEllipse-java.awt.geom.Point2D-float-float-}
```
public XpsPathGeometry createEllipse(Point2D center, float radiusX, float radiusY)
```


Crea una geometria di percorso che rappresenta un'ellisse.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Il punto centrale dell'ellisse. |
| radiusX | float | Il raggio orizzontale dell'ellisse. |
| radiusY | float | Il raggio verticale dell'ellisse. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createImage(String fileName, Rectangle2D imageBox) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox)
```


Crea un percorso rettangolare riempito con un'immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fileName | java.lang.String | Il nome del file immagine. |
| imageBox | java.awt.geom.Rectangle2D | Il riquadro immagine da riempire con l'immagine. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createImage(String fileName, Rectangle2D imageBox, ImageMode mode) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox, ImageMode mode)
```


Crea un percorso rettangolare riempito con un'immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fileName | java.lang.String | Il nome del file immagine. |
| imageBox | java.awt.geom.Rectangle2D | Il riquadro immagine da riempire con l'immagine. |
| mode | [ImageMode](../../com.aspose.xps/imagemode) | Modalità di adattamento immagine. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createPieSlice(Point2D center, float radius, float startAngle, float endAngle) {#createPieSlice-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createPieSlice(Point2D center, float radius, float startAngle, float endAngle)
```


Crea una geometria di percorso che rappresenta una fetta di cerchio tra due raggi radiali.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Il centro del cerchio. |
| radius | float | Il raggio del cerchio. |
| startAngle | float | L'angolo (gradi) del raggio iniziale. |
| endAngle | float | L'angolo (gradi) del raggio finale. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRectangle(Rectangle2D rectangle) {#createRectangle-java.awt.geom.Rectangle2D-}
```
public XpsPathGeometry createRectangle(Rectangle2D rectangle)
```


Crea una geometria di percorso che rappresenta un rettangolo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rectangle | java.awt.geom.Rectangle2D | Il rettangolo. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularCircumscribedNGon(int n, Point2D center, float radius) {#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularCircumscribedNGon(int n, Point2D center, float radius)
```


Crea una geometria di percorso che rappresenta un n-gono regolare circoscritto attorno a un cerchio.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| n | int | Il numero di vertici. |
| center | java.awt.geom.Point2D | Il centro del cerchio. |
| radius | float | Il raggio del cerchio. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularInscribedNGon(int n, Point2D center, float radius) {#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularInscribedNGon(int n, Point2D center, float radius)
```


Crea una geometria di percorso che rappresenta un n-gono regolare inscritto in un cerchio.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| n | int | Il numero di vertici. |
| center | java.awt.geom.Point2D | Il centro del cerchio. |
| radius | float | Il raggio del cerchio. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

