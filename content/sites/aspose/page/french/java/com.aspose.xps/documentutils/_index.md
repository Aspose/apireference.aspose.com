---
title: "DocumentUtils"
second_title: "Référence API Aspose.Page pour Java"
description: "Cette classe fournit des utilitaires au‑delà de l’API officielle de manipulation XPS."
type: docs
weight: 10
url: /fr/java/com.aspose.xps/documentutils/
---
**Inheritance:**
java.lang.Object
```
public class DocumentUtils
```

Cette classe fournit des utilitaires au‑delà de l’API officielle de manipulation XPS.
## Méthodes

| Méthode | Description |
| --- | --- |
| [createCircle(Point2D center, float radius)](#createCircle-java.awt.geom.Point2D-float-) | Crée une géométrie de chemin représentant un cercle. |
| [createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)](#createCircularSegment-java.awt.geom.Point2D-float-float-float-) | Crée une géométrie de chemin représentant un segment circulaire entre deux angles. |
| [createEllipse(Point2D center, float radiusX, float radiusY)](#createEllipse-java.awt.geom.Point2D-float-float-) | Crée une géométrie de chemin représentant une ellipse. |
| [createImage(String fileName, Rectangle2D imageBox)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-) | Crée un chemin rectangulaire rempli d'une image. |
| [createImage(String fileName, Rectangle2D imageBox, ImageMode mode)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-) | Crée un chemin rectangulaire rempli d'une image. |
| [createPieSlice(Point2D center, float radius, float startAngle, float endAngle)](#createPieSlice-java.awt.geom.Point2D-float-float-float-) | Crée une géométrie de chemin représentant une tranche de cercle entre deux rayons radiaux. |
| [createRectangle(Rectangle2D rectangle)](#createRectangle-java.awt.geom.Rectangle2D-) | Crée une géométrie de chemin représentant un rectangle. |
| [createRegularCircumscribedNGon(int n, Point2D center, float radius)](#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-) | Crée une géométrie de chemin représentant un n-gone régulier circonscrit autour d'un cercle. |
| [createRegularInscribedNGon(int n, Point2D center, float radius)](#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-) | Crée une géométrie de chemin représentant un n-gone régulier inscrit dans un cercle. |
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


Crée une géométrie de chemin représentant un cercle.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Le point central du cercle. |
| rayon | float | Le rayon du cercle. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createCircularSegment(Point2D center, float radius, float startAngle, float endAngle) {#createCircularSegment-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)
```


Crée une géométrie de chemin représentant un segment circulaire entre deux angles.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Le centre du cercle. |
| rayon | float | Le rayon du cercle. |
| startAngle | float | L'angle (degrés) du rayon de départ. |
| endAngle | float | L'angle (degrés) du rayon final. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createEllipse(Point2D center, float radiusX, float radiusY) {#createEllipse-java.awt.geom.Point2D-float-float-}
```
public XpsPathGeometry createEllipse(Point2D center, float radiusX, float radiusY)
```


Crée une géométrie de chemin représentant une ellipse.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Le point central de l'ellipse. |
| radiusX | float | Le rayon horizontal de l'ellipse. |
| radiusY | float | Le rayon vertical de l'ellipse. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createImage(String fileName, Rectangle2D imageBox) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox)
```


Crée un chemin rectangulaire rempli d'une image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | Le nom du fichier image. |
| imageBox | java.awt.geom.Rectangle2D | La zone d'image à remplir avec l'image. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createImage(String fileName, Rectangle2D imageBox, ImageMode mode) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox, ImageMode mode)
```


Crée un chemin rectangulaire rempli d'une image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | Le nom du fichier image. |
| imageBox | java.awt.geom.Rectangle2D | La zone d'image à remplir avec l'image. |
| mode | [ImageMode](../../com.aspose.xps/imagemode) | Mode d'ajustement de l'image. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createPieSlice(Point2D center, float radius, float startAngle, float endAngle) {#createPieSlice-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createPieSlice(Point2D center, float radius, float startAngle, float endAngle)
```


Crée une géométrie de chemin représentant une tranche de cercle entre deux rayons radiaux.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Le centre du cercle. |
| rayon | float | Le rayon du cercle. |
| startAngle | float | L'angle (degrés) du rayon de départ. |
| endAngle | float | L'angle (degrés) du rayon final. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRectangle(Rectangle2D rectangle) {#createRectangle-java.awt.geom.Rectangle2D-}
```
public XpsPathGeometry createRectangle(Rectangle2D rectangle)
```


Crée une géométrie de chemin représentant un rectangle.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| rectangle | java.awt.geom.Rectangle2D | Le rectangle. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularCircumscribedNGon(int n, Point2D center, float radius) {#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularCircumscribedNGon(int n, Point2D center, float radius)
```


Crée une géométrie de chemin représentant un n-gone régulier circonscrit autour d'un cercle.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| n | int | Le nombre de sommets. |
| center | java.awt.geom.Point2D | Le centre du cercle. |
| rayon | float | Le rayon du cercle. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularInscribedNGon(int n, Point2D center, float radius) {#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularInscribedNGon(int n, Point2D center, float radius)
```


Crée une géométrie de chemin représentant un n-gone régulier inscrit dans un cercle.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| n | int | Le nombre de sommets. |
| center | java.awt.geom.Point2D | Le centre du cercle. |
| rayon | float | Le rayon du cercle. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

