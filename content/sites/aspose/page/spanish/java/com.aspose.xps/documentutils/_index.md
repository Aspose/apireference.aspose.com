---
title: "DocumentUtils"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Esta clase proporciona utilidades más allá de la API formal de manipulación de XPS."
type: docs
weight: 10
url: /es/java/com.aspose.xps/documentutils/
---
**Inheritance:**
java.lang.Object
```
public class DocumentUtils
```

Esta clase proporciona utilidades más allá de la API formal de manipulación de XPS.
## Métodos

| Método | Descripción |
| --- | --- |
| [createCircle(Point2D center, float radius)](#createCircle-java.awt.geom.Point2D-float-) | Crea una geometría de ruta que representa un círculo. |
| [createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)](#createCircularSegment-java.awt.geom.Point2D-float-float-float-) | Crea una geometría de ruta que representa un segmento circular entre dos ángulos. |
| [createEllipse(Point2D center, float radiusX, float radiusY)](#createEllipse-java.awt.geom.Point2D-float-float-) | Crea una geometría de ruta que representa una elipse. |
| [createImage(String fileName, Rectangle2D imageBox)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-) | Crea una ruta rectangular rellena con una imagen. |
| [createImage(String fileName, Rectangle2D imageBox, ImageMode mode)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-) | Crea una ruta rectangular rellena con una imagen. |
| [createPieSlice(Point2D center, float radius, float startAngle, float endAngle)](#createPieSlice-java.awt.geom.Point2D-float-float-float-) | Crea una geometría de ruta que representa una porción de círculo entre dos rayos radiales. |
| [createRectangle(Rectangle2D rectangle)](#createRectangle-java.awt.geom.Rectangle2D-) | Crea una geometría de ruta que representa un rectángulo. |
| [createRegularCircumscribedNGon(int n, Point2D center, float radius)](#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-) | Crea una geometría de ruta que representa un n-gono regular circunscrito alrededor de un círculo. |
| [createRegularInscribedNGon(int n, Point2D center, float radius)](#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-) | Crea una geometría de ruta que representa un n-gono regular inscrito en un círculo. |
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


Crea una geometría de ruta que representa un círculo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| center | java.awt.geom.Point2D | El punto central del círculo. |
| radio | float | El radio del círculo. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createCircularSegment(Point2D center, float radius, float startAngle, float endAngle) {#createCircularSegment-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)
```


Crea una geometría de ruta que representa un segmento circular entre dos ángulos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| center | java.awt.geom.Point2D | El centro del círculo. |
| radio | float | El radio del círculo. |
| startAngle | float | El ángulo (grados) del rayo inicial. |
| endAngle | float | El ángulo (grados) del rayo final. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createEllipse(Point2D center, float radiusX, float radiusY) {#createEllipse-java.awt.geom.Point2D-float-float-}
```
public XpsPathGeometry createEllipse(Point2D center, float radiusX, float radiusY)
```


Crea una geometría de ruta que representa una elipse.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| center | java.awt.geom.Point2D | El punto central de la elipse. |
| radiusX | float | El radio horizontal de la elipse. |
| radiusY | float | El radio vertical de la elipse. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createImage(String fileName, Rectangle2D imageBox) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox)
```


Crea una ruta rectangular rellena con una imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fileName | java.lang.String | El nombre del archivo de imagen. |
| imageBox | java.awt.geom.Rectangle2D | El cuadro de imagen para rellenar con la imagen. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createImage(String fileName, Rectangle2D imageBox, ImageMode mode) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox, ImageMode mode)
```


Crea una ruta rectangular rellena con una imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fileName | java.lang.String | El nombre del archivo de imagen. |
| imageBox | java.awt.geom.Rectangle2D | El cuadro de imagen para rellenar con la imagen. |
| mode | [ImageMode](../../com.aspose.xps/imagemode) | Modo de ajuste de imagen. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createPieSlice(Point2D center, float radius, float startAngle, float endAngle) {#createPieSlice-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createPieSlice(Point2D center, float radius, float startAngle, float endAngle)
```


Crea una geometría de ruta que representa una porción de círculo entre dos rayos radiales.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| center | java.awt.geom.Point2D | El centro del círculo. |
| radio | float | El radio del círculo. |
| startAngle | float | El ángulo (grados) del rayo inicial. |
| endAngle | float | El ángulo (grados) del rayo final. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRectangle(Rectangle2D rectangle) {#createRectangle-java.awt.geom.Rectangle2D-}
```
public XpsPathGeometry createRectangle(Rectangle2D rectangle)
```


Crea una geometría de ruta que representa un rectángulo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| rectángulo | java.awt.geom.Rectangle2D | El rectángulo. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularCircumscribedNGon(int n, Point2D center, float radius) {#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularCircumscribedNGon(int n, Point2D center, float radius)
```


Crea una geometría de ruta que representa un n-gono regular circunscrito alrededor de un círculo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| n | int | El número de vértices. |
| center | java.awt.geom.Point2D | El centro del círculo. |
| radio | float | El radio del círculo. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularInscribedNGon(int n, Point2D center, float radius) {#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularInscribedNGon(int n, Point2D center, float radius)
```


Crea una geometría de ruta que representa un n-gono regular inscrito en un círculo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| n | int | El número de vértices. |
| center | java.awt.geom.Point2D | El centro del círculo. |
| radio | float | El radio del círculo. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

