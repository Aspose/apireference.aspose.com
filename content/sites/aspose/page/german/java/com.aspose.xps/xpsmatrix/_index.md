---
title: "XpsMatrix"
second_title: "Aspose.Page for Java API-Referenz"
description: "Klasse, die Eigenschaften des MatrixTransform-Property-Elements kapselt."
type: docs
weight: 36
url: /de/java/com.aspose.xps/xpsmatrix/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsMatrix extends XpsObject
```

Klasse, die die Eigenschaften des MatrixTransform-Eigenschaftselements kapselt. Dieses Element definiert eine beliebige affine Matrixtransformation, die verwendet wird, um die Koordinatensysteme von Elementen zu manipulieren.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [deepClone()](#deepClone--) | Klont diese Transformationsmatrix. |
| [equals(XpsMatrix a, XpsMatrix b)](#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Die tatsächliche Implementierung. |
| [equals(Object obj)](#equals-java.lang.Object-) | Bestimmt, ob das angegebene  object  gleich dieser Instanz ist. |
| [getClass()](#getClass--) |  |
| [getM11()](#getM11--) | Liest das M11-Element. |
| [getM12()](#getM12--) | Liest das M12-Element. |
| [getM21()](#getM21--) | Liest das M21-Element. |
| [getM22()](#getM22--) | Liest das M22-Element. |
| [getM31()](#getM31--) | Liest das M31-Element. |
| [getM32()](#getM32--) | Liest das M32-Element. |
| [hashCode()](#hashCode--) | Gibt einen Hashcode für diese Instanz zurück. |
| [isIdentity()](#isIdentity--) | Liest einen Wert, der angibt, ob diese Instanz die Einheitsmatrix ist. |
| [multiply(XpsMatrix matrix)](#multiply-com.aspose.xps.XpsMatrix-) | Multipliziert diese Matrix mit der durch die  matrix  angegebenen Matrix in der Standardreihenfolge (Prepend). |
| [multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)](#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-) | Multipliziert diese Matrix mit der durch die  matrix  angegebenen Matrix in der durch  matrixOrder  festgelegten Reihenfolge. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(XpsMatrix a, XpsMatrix b)](#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Implementiert den Operator ==. |
| [op_Inequality(XpsMatrix a, XpsMatrix b)](#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Implementiert den Operator !. |
| [reset()](#reset--) | Setzt diese Matrix auf die Einheitsmatrix zurück. |
| [rotate(float angle)](#rotate-float-) | Wendet eine Drehung im Uhrzeigersinn um  angle  auf diese Matrix in der Standardreihenfolge (Prepend) an. |
| [rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)](#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Wendet eine Drehung im Uhrzeigersinn um  angle  auf diese Matrix in der durch  matrixOrder  festgelegten Reihenfolge an. |
| [rotateAround(float angle, Point2D pivot)](#rotateAround-float-java.awt.geom.Point2D-) | Wendet eine Drehung im Uhrzeigersinn um  angle  um den  pivot  auf diese Matrix in der Standardreihenfolge (Prepend) an. |
| [rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)](#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-) | Wendet eine Drehung im Uhrzeigersinn um  angle  um den  pivot  auf diese Matrix in der durch  matrixOrder  festgelegten Reihenfolge an. |
| [scale(float scaleX, float scaleY)](#scale-float-float-) | Wendet den angegebenen Skalierungsvektor (scaleX und scaleY) auf diese Matrix in der Standardreihenfolge (Prepend) an. |
| [scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)](#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Wendet den angegebenen Skalierungsvektor (scaleX und scaleY) auf diese Matrix in der durch  matrixOrder  festgelegten Reihenfolge an. |
| [skew(double skewX, double skewY)](#skew-double-double-) | Wendet die angegebene Schrägtransformierung auf diese Matrix an. |
| [toString()](#toString--) | Gibt die Zeichenkettenrepräsentation dieser  XpsMatrix  Instanz zurück. |
| [transform(Rectangle2D rect)](#transform-java.awt.geom.Rectangle2D-) | Wendet die von dieser Matrix dargestellte affine Transformation auf ein angegebenes Rechteck an. |
| [transformPoint(Point2D point)](#transformPoint-java.awt.geom.Point2D-) | Wendet die von dieser Matrix dargestellte affine Transformation auf einen angegebenen Punkt an. |
| [transformPoints(Point2D[] points)](#transformPoints-java.awt.geom.Point2D---) | Wendet die von dieser Matrix dargestellte affine Transformation auf ein angegebenes Punktarray an. |
| [transformPoints(Point2D[] points, int startIndex, int numberOfPoints)](#transformPoints-java.awt.geom.Point2D---int-int-) | Wendet die von dieser Matrix dargestellte affine Transformation auf einen angegebenen Teil des Punktarrays an. |
| [translate(float offsetX, float offsetY)](#translate-float-float-) | Wendet den angegebenen Translationsvektor auf diese Matrix an. |
| [translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)](#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Wendet den angegebenen Translationsvektor auf diese Matrix in der durch  matrixOrder  festgelegten Reihenfolge an. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsMatrix deepClone()
```


Klont diese Transformationsmatrix.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - Clone of this transformation matrix.
### equals(XpsMatrix a, XpsMatrix b) {#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean equals(XpsMatrix a, XpsMatrix b)
```


Die tatsächliche Implementierung.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Die erste Matrix. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Die zweite Matrix. |

**Returns:**
boolean - [true] wenn Matrizen gleich sind
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Bestimmt, ob das angegebene  object  gleich dieser Instanz ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | java.lang.Object | Das Objekt zum Vergleich mit dieser Instanz. |

**Returns:**
boolean - true, wenn das angegebene Objekt dieser Instanz gleich ist; andernfalls false. Der Parameter obj ist null.
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


Liest das M11-Element.

**Returns:**
float - Das M11-Element.
### getM12() {#getM12--}
```
public float getM12()
```


Liest das M12-Element.

**Returns:**
float - Das M12-Element.
### getM21() {#getM21--}
```
public float getM21()
```


Liest das M21-Element.

**Returns:**
float - Das M21-Element.
### getM22() {#getM22--}
```
public float getM22()
```


Liest das M22-Element.

**Returns:**
float - Das M22-Element.
### getM31() {#getM31--}
```
public float getM31()
```


Liest das M31-Element.

**Returns:**
float - Das M31-Element.
### getM32() {#getM32--}
```
public float getM32()
```


Liest das M32-Element.

**Returns:**
float - Das M32-Element.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Gibt einen Hashcode für diese Instanz zurück.

**Returns:**
int - Ein Hashcode für diese Instanz, geeignet für die Verwendung in Hash-Algorithmen und Datenstrukturen wie einer Hashtabelle.
### isIdentity() {#isIdentity--}
```
public boolean isIdentity()
```


Liest einen Wert, der angibt, ob diese Instanz die Einheitsmatrix ist.

Wert: True, wenn diese Instanz eine Einheitsmatrix ist; andernfalls false.

**Returns:**
boolean - Ein Wert, der angibt, ob diese Instanz eine Einheitsmatrix ist.
### multiply(XpsMatrix matrix) {#multiply-com.aspose.xps.XpsMatrix-}
```
public void multiply(XpsMatrix matrix)
```


Multipliziert diese Matrix mit der durch die  matrix  angegebenen Matrix in der Standardreihenfolge (Prepend).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Die Matrix. |

### multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder) {#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)
```


Multipliziert diese Matrix mit der durch die  matrix  angegebenen Matrix in der durch  matrixOrder  festgelegten Reihenfolge.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Die Matrix. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Die Reihenfolge. |

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


Implementiert den Operator ==.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Die erste Matrix. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Die zweite Matrix. |

**Returns:**
boolean - Das Ergebnis des Operators.
### op_Inequality(XpsMatrix a, XpsMatrix b) {#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Inequality(XpsMatrix a, XpsMatrix b)
```


Implementiert den Operator !=.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Die erste Matrix. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Die zweite Matrix. |

**Returns:**
boolean - Das Ergebnis des Operators.
### reset() {#reset--}
```
public void reset()
```


Setzt diese Matrix auf die Einheitsmatrix zurück.

### rotate(float angle) {#rotate-float-}
```
public void rotate(float angle)
```


Wendet eine Drehung im Uhrzeigersinn um  angle  auf diese Matrix in der Standardreihenfolge (Prepend) an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| angle | float | Der Winkel. |

### rotate(float angle, XpsMatrix.MatrixOrder matrixOrder) {#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)
```


Wendet eine Drehung im Uhrzeigersinn um  angle  auf diese Matrix in der durch  matrixOrder  festgelegten Reihenfolge an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| angle | float | Der Winkel. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Die Reihenfolge. |

### rotateAround(float angle, Point2D pivot) {#rotateAround-float-java.awt.geom.Point2D-}
```
public void rotateAround(float angle, Point2D pivot)
```


Wendet eine Drehung im Uhrzeigersinn um  angle  um den  pivot  auf diese Matrix in der Standardreihenfolge (Prepend) an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| angle | float | Der Winkel. |
| Drehpunkt | java.awt.geom.Point2D | Der Drehpunkt. |

### rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder) {#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)
```


Wendet eine Drehung im Uhrzeigersinn um  angle  um den  pivot  auf diese Matrix in der durch  matrixOrder  festgelegten Reihenfolge an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| angle | float | Der Winkel. |
| Drehpunkt | java.awt.geom.Point2D | Der Drehpunkt. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Die Reihenfolge. |

### scale(float scaleX, float scaleY) {#scale-float-float-}
```
public void scale(float scaleX, float scaleY)
```


Wendet den angegebenen Skalierungsvektor (scaleX und scaleY) auf diese Matrix in der Standardreihenfolge (Prepend) an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| scaleX | float | Der Skalierungswert x. |
| scaleY | float | Der Skalierungswert y. |

### scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder) {#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)
```


Wendet den angegebenen Skalierungsvektor (scaleX und scaleY) auf diese Matrix in der durch  matrixOrder  festgelegten Reihenfolge an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| scaleX | float | Der Skalierungswert X. |
| scaleY | float | Der Skalierungswert Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Die Reihenfolge. |

### skew(double skewX, double skewY) {#skew-double-double-}
```
public void skew(double skewX, double skewY)
```


Wendet die angegebene Schrägtransformierung auf diese Matrix an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| skewX | double | Die Schrägstellung x. |
| skewY | double | Die Schrägstellung y. |

### toString() {#toString--}
```
public String toString()
```


Gibt die Zeichenkettenrepräsentation dieser  XpsMatrix  Instanz zurück.

**Returns:**
java.lang.String - Zeichenkettenrepräsentation
### transform(Rectangle2D rect) {#transform-java.awt.geom.Rectangle2D-}
```
public Rectangle2D transform(Rectangle2D rect)
```


Wendet die von dieser Matrix dargestellte affine Transformation auf ein angegebenes Rechteck an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Rechteck | java.awt.geom.Rectangle2D | Das Rechteck. |

**Returns:**
java.awt.geom.Rectangle2D - Transformiertes Rechteck
### transformPoint(Point2D point) {#transformPoint-java.awt.geom.Point2D-}
```
public Point2D transformPoint(Point2D point)
```


Wendet die von dieser Matrix dargestellte affine Transformation auf einen angegebenen Punkt an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Punkt | java.awt.geom.Point2D | Der Punkt. |

**Returns:**
java.awt.geom.Point2D - Transformierter Punkt
### transformPoints(Point2D[] points) {#transformPoints-java.awt.geom.Point2D---}
```
public void transformPoints(Point2D[] points)
```


Wendet die von dieser Matrix dargestellte affine Transformation auf ein angegebenes Punktarray an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Die Punkte. |

### transformPoints(Point2D[] points, int startIndex, int numberOfPoints) {#transformPoints-java.awt.geom.Point2D---int-int-}
```
public void transformPoints(Point2D[] points, int startIndex, int numberOfPoints)
```


Wendet die von dieser Matrix dargestellte affine Transformation auf einen angegebenen Teil des Punktarrays an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Die Punkte. |
| startIndex | int | Der Startindex. |
| numberOfPoints | int | Die Anzahl der Punkte. |

### translate(float offsetX, float offsetY) {#translate-float-float-}
```
public void translate(float offsetX, float offsetY)
```


Wendet den angegebenen Translationsvektor auf diese Matrix an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| offsetX | float | Der Versatz X. |
| offsetY | float | Der Versatz Y. |

### translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder) {#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)
```


Wendet den angegebenen Translationsvektor auf diese Matrix in der durch  matrixOrder  festgelegten Reihenfolge an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| offsetX | float | Der Versatz X. |
| offsetY | float | Der Versatz Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Die Reihenfolge. |

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

