---
title: "XpsMatrix"
second_title: "Aspose.Page voor Java API-referentie"
description: "Klasse die de kenmerken van het MatrixTransform-eigenschapselement omvat."
type: docs
weight: 36
url: /nl/java/com.aspose.xps/xpsmatrix/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsMatrix extends XpsObject
```

Klasse die MatrixTransform-eigenschapselementeigenschappen incapsuleert. Dit element definieert een willekeurige affiene matrixtransformatie die wordt gebruikt om de coördinatensystemen van elementen te manipuleren.
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [deepClone()](#deepClone--) | Kopieert deze transformatie-matrix. |
| [equals(XpsMatrix a, XpsMatrix b)](#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | De daadwerkelijke implementatie. |
| [equals(Object obj)](#equals-java.lang.Object-) | Bepaalt of het opgegeven object gelijk is aan deze instantie. |
| [getClass()](#getClass--) |  |
| [getM11()](#getM11--) | Haalt het M11-element op. |
| [getM12()](#getM12--) | Haalt het M12-element op. |
| [getM21()](#getM21--) | Haalt het M21-element op. |
| [getM22()](#getM22--) | Haalt het M22-element op. |
| [getM31()](#getM31--) | Haalt het M31-element op. |
| [getM32()](#getM32--) | Haalt het M32-element op. |
| [hashCode()](#hashCode--) | Retourneert een hashcode voor deze instantie. |
| [isIdentity()](#isIdentity--) | Haalt een waarde op die aangeeft of deze instantie een identiteitsmatrix is. |
| [multiply(XpsMatrix matrix)](#multiply-com.aspose.xps.XpsMatrix-) | Vermenigvuldigt deze matrix met de matrix gespecificeerd door de  matrix  in de standaard (Prepend)-volgorde. |
| [multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)](#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-) | Vermenigvuldigt deze matrix met de matrix gespecificeerd door de  matrix  in de volgorde gespecificeerd door  matrixOrder . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(XpsMatrix a, XpsMatrix b)](#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Implementeert de operator ==. |
| [op_Inequality(XpsMatrix a, XpsMatrix b)](#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Implementeert de operator !. |
| [reset()](#reset--) | Reset deze Matrix naar een identiteitsmatrix. |
| [rotate(float angle)](#rotate-float-) | Past een rotatie met de klok mee van  angle  toe op deze Matrix in de standaard (Prepend)-volgorde. |
| [rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)](#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Past een rotatie met de klok mee van  angle  toe op deze Matrix in de volgorde gespecificeerd door  matrixOrder . |
| [rotateAround(float angle, Point2D pivot)](#rotateAround-float-java.awt.geom.Point2D-) | Past een rotatie met de klok mee van  angle  rond het  pivot  toe op deze Matrix in de standaard (Prepend)-volgorde. |
| [rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)](#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-) | Past een rotatie met de klok mee van  angle  rond het  pivot  toe op deze Matrix in de volgorde gespecificeerd door  matrixOrder . |
| [scale(float scaleX, float scaleY)](#scale-float-float-) | Past de gespecificeerde schaalvector (scaleX en scaleY) toe op deze Matrix in de standaard (Prepend)-volgorde. |
| [scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)](#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Past de gespecificeerde schaalvector (scaleX en scaleY) toe op deze Matrix in de volgorde gespecificeerd door  matrixOrder . |
| [skew(double skewX, double skewY)](#skew-double-double-) | Past de gespecificeerde scheeftransformatie toe op deze Matrix. |
| [toString()](#toString--) | Retourneert de tekenreeksrepresentatie van deze  XpsMatrix  instantie. |
| [transform(Rectangle2D rect)](#transform-java.awt.geom.Rectangle2D-) | Past de affine transformatie die door deze Matrix wordt vertegenwoordigd toe op een gespecificeerde rechthoek. |
| [transformPoint(Point2D point)](#transformPoint-java.awt.geom.Point2D-) | Past de affine transformatie die door deze Matrix wordt vertegenwoordigd toe op een gespecificeerd punt. |
| [transformPoints(Point2D[] points)](#transformPoints-java.awt.geom.Point2D---) | Past de affine transformatie die door deze Matrix wordt vertegenwoordigd toe op een gespecificeerde array van punten. |
| [transformPoints(Point2D[] points, int startIndex, int numberOfPoints)](#transformPoints-java.awt.geom.Point2D---int-int-) | Past de affine transformatie die door deze Matrix wordt vertegenwoordigd toe op een gespecificeerd deel van een array van punten. |
| [translate(float offsetX, float offsetY)](#translate-float-float-) | Past de gespecificeerde translatievector toe op deze Matrix. |
| [translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)](#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Past de gespecificeerde translatievector toe op deze Matrix in de volgorde gespecificeerd door  matrixOrder . |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsMatrix deepClone()
```


Kopieert deze transformatie-matrix.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - Clone of this transformation matrix.
### equals(XpsMatrix a, XpsMatrix b) {#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean equals(XpsMatrix a, XpsMatrix b)
```


De daadwerkelijke implementatie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | De eerste matrix. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | De tweede matrix. |

**Returns:**
boolean - [true] als matrices gelijk zijn
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Bepaalt of het opgegeven object gelijk is aan deze instantie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| obj | java.lang.Object | Het object om te vergelijken met deze instantie. |

**Returns:**
boolean - true als het opgegeven object gelijk is aan deze instantie; anders false. De obj-parameter is null.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getM11() {#getM11--}
```
public float getM11()
```


Haalt het M11-element op.

**Returns:**
float - Het M11-element.
### getM12() {#getM12--}
```
public float getM12()
```


Haalt het M12-element op.

**Returns:**
float - Het M12-element.
### getM21() {#getM21--}
```
public float getM21()
```


Haalt het M21-element op.

**Returns:**
float - Het M21-element.
### getM22() {#getM22--}
```
public float getM22()
```


Haalt het M22-element op.

**Returns:**
float - Het M22-element.
### getM31() {#getM31--}
```
public float getM31()
```


Haalt het M31-element op.

**Returns:**
float - Het M31-element.
### getM32() {#getM32--}
```
public float getM32()
```


Haalt het M32-element op.

**Returns:**
float - Het M32-element.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Retourneert een hashcode voor deze instantie.

**Returns:**
int - Een hashcode voor deze instantie, geschikt voor gebruik in hash-algoritmen en datastructuren zoals een hashtabel.
### isIdentity() {#isIdentity--}
```
public boolean isIdentity()
```


Haalt een waarde op die aangeeft of deze instantie een identiteitsmatrix is.

Waarde: True als deze instantie een identiteitsmatrix is; anders false.

**Returns:**
boolean - Een waarde die aangeeft of deze instantie een identiteitsmatrix is.
### multiply(XpsMatrix matrix) {#multiply-com.aspose.xps.XpsMatrix-}
```
public void multiply(XpsMatrix matrix)
```


Vermenigvuldigt deze matrix met de matrix gespecificeerd door de  matrix  in de standaard (Prepend)-volgorde.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | De matrix. |

### multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder) {#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)
```


Vermenigvuldigt deze matrix met de matrix gespecificeerd door de  matrix  in de volgorde gespecificeerd door  matrixOrder .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | De matrix. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | De volgorde. |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(XpsMatrix a, XpsMatrix b) {#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Equality(XpsMatrix a, XpsMatrix b)
```


Implementeert de operator ==.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | De eerste matrix. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | De tweede matrix. |

**Returns:**
boolean - Het resultaat van de operator.
### op_Inequality(XpsMatrix a, XpsMatrix b) {#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Inequality(XpsMatrix a, XpsMatrix b)
```


Implementeert de operator !=.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | De eerste matrix. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | De tweede matrix. |

**Returns:**
boolean - Het resultaat van de operator.
### reset() {#reset--}
```
public void reset()
```


Reset deze Matrix naar een identiteitsmatrix.

### rotate(float angle) {#rotate-float-}
```
public void rotate(float angle)
```


Past een rotatie met de klok mee van  angle  toe op deze Matrix in de standaard (Prepend)-volgorde.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| angle | float | De hoek. |

### rotate(float angle, XpsMatrix.MatrixOrder matrixOrder) {#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)
```


Past een rotatie met de klok mee van  angle  toe op deze Matrix in de volgorde gespecificeerd door  matrixOrder .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| angle | float | De hoek. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | De volgorde. |

### rotateAround(float angle, Point2D pivot) {#rotateAround-float-java.awt.geom.Point2D-}
```
public void rotateAround(float angle, Point2D pivot)
```


Past een rotatie met de klok mee van  angle  rond het  pivot  toe op deze Matrix in de standaard (Prepend)-volgorde.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| angle | float | De hoek. |
| draaipunt | java.awt.geom.Point2D | Het draaipunt. |

### rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder) {#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)
```


Past een rotatie met de klok mee van  angle  rond het  pivot  toe op deze Matrix in de volgorde gespecificeerd door  matrixOrder .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| angle | float | De hoek. |
| draaipunt | java.awt.geom.Point2D | Het draaipunt. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | De volgorde. |

### scale(float scaleX, float scaleY) {#scale-float-float-}
```
public void scale(float scaleX, float scaleY)
```


Past de gespecificeerde schaalvector (scaleX en scaleY) toe op deze Matrix in de standaard (Prepend)-volgorde.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| scaleX | float | De schaal x. |
| scaleY | float | De schaal y. |

### scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder) {#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)
```


Past de gespecificeerde schaalvector (scaleX en scaleY) toe op deze Matrix in de volgorde gespecificeerd door  matrixOrder .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| scaleX | float | De schaal X. |
| scaleY | float | De schaal Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | De volgorde. |

### skew(double skewX, double skewY) {#skew-double-double-}
```
public void skew(double skewX, double skewY)
```


Past de gespecificeerde scheeftransformatie toe op deze Matrix.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| skewX | double | De skew x. |
| skewY | double | De skew y. |

### toString() {#toString--}
```
public String toString()
```


Retourneert de tekenreeksrepresentatie van deze  XpsMatrix  instantie.

**Returns:**
java.lang.String - String-representatie
### transform(Rectangle2D rect) {#transform-java.awt.geom.Rectangle2D-}
```
public Rectangle2D transform(Rectangle2D rect)
```


Past de affine transformatie die door deze Matrix wordt vertegenwoordigd toe op een gespecificeerde rechthoek.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D | De rechthoek. |

**Returns:**
java.awt.geom.Rectangle2D - Getransformeerde rechthoek
### transformPoint(Point2D point) {#transformPoint-java.awt.geom.Point2D-}
```
public Point2D transformPoint(Point2D point)
```


Past de affine transformatie die door deze Matrix wordt vertegenwoordigd toe op een gespecificeerd punt.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| punt | java.awt.geom.Point2D | Het punt. |

**Returns:**
java.awt.geom.Point2D - Getransformeerd punt
### transformPoints(Point2D[] points) {#transformPoints-java.awt.geom.Point2D---}
```
public void transformPoints(Point2D[] points)
```


Past de affine transformatie die door deze Matrix wordt vertegenwoordigd toe op een gespecificeerde array van punten.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | De punten. |

### transformPoints(Point2D[] points, int startIndex, int numberOfPoints) {#transformPoints-java.awt.geom.Point2D---int-int-}
```
public void transformPoints(Point2D[] points, int startIndex, int numberOfPoints)
```


Past de affine transformatie die door deze Matrix wordt vertegenwoordigd toe op een gespecificeerd deel van een array van punten.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | De punten. |
| startIndex | int | De start index. |
| numberOfPoints | int | Het aantal punten. |

### translate(float offsetX, float offsetY) {#translate-float-float-}
```
public void translate(float offsetX, float offsetY)
```


Past de gespecificeerde translatievector toe op deze Matrix.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| offsetX | float | De offset X. |
| offsetY | float | De offset Y. |

### translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder) {#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)
```


Past de gespecificeerde translatievector toe op deze Matrix in de volgorde gespecificeerd door  matrixOrder .

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| offsetX | float | De offset X. |
| offsetY | float | De offset Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | De volgorde. |

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

