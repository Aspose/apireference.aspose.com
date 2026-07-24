---
title: "XpsMatrix"
second_title: "Aspose.Page för Java API-referens"
description: "Klass som kapslar in funktioner för MatrixTransform-egenskapselement."
type: docs
weight: 36
url: /sv/java/com.aspose.xps/xpsmatrix/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsMatrix extends XpsObject
```

Klass som inkapslar MatrixTransform-egenskapselementfunktioner. Detta element definierar en godtycklig affink matrisomvandling som används för att manipulera elementens koordinatsystem.
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [deepClone()](#deepClone--) | Klonar denna transformationsmatris. |
| [equals(XpsMatrix a, XpsMatrix b)](#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Den faktiska implementationen. |
| [equals(Object obj)](#equals-java.lang.Object-) | Bestämmer om det angivna  object  är lika med denna instans. |
| [getClass()](#getClass--) |  |
| [getM11()](#getM11--) | Hämtar M11‑elementet. |
| [getM12()](#getM12--) | Hämtar M12‑elementet. |
| [getM21()](#getM21--) | Hämtar M21‑elementet. |
| [getM22()](#getM22--) | Hämtar M22‑elementet. |
| [getM31()](#getM31--) | Hämtar M31‑elementet. |
| [getM32()](#getM32--) | Hämtar M32‑elementet. |
| [hashCode()](#hashCode--) | Returnerar en hash‑kod för denna instans. |
| [isIdentity()](#isIdentity--) | Hämtar ett värde som indikerar om denna instans är en identitetsmatris. |
| [multiply(XpsMatrix matrix)](#multiply-com.aspose.xps.XpsMatrix-) | Multiplicerar denna matris med matrisen som anges av  matrix  i standard (Prepend)-ordning. |
| [multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)](#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-) | Multiplicerar denna matris med matrisen som anges av  matrix  i den ordning som anges av  matrixOrder . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(XpsMatrix a, XpsMatrix b)](#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Implementerar operatorn ==. |
| [op_Inequality(XpsMatrix a, XpsMatrix b)](#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Implementerar operatorn ! |
| [reset()](#reset--) | Återställer denna Matrix till identitetsmatris. |
| [rotate(float angle)](#rotate-float-) | Tillämpar medursrotation med  angle  på denna Matrix i standard (Prepend)-ordning. |
| [rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)](#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Tillämpar medursrotation med  angle  på denna Matrix i den ordning som anges av  matrixOrder . |
| [rotateAround(float angle, Point2D pivot)](#rotateAround-float-java.awt.geom.Point2D-) | Tillämpar medursrotation med  angle  kring  pivot  på denna Matrix i standard (Prepend)-ordning. |
| [rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)](#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-) | Tillämpar medursrotation med  angle  runt  pivot  på denna Matrix i den ordning som anges av  matrixOrder . |
| [scale(float scaleX, float scaleY)](#scale-float-float-) | Tillämpar den angivna skalningsvektorn (scaleX och scaleY) på denna Matrix i standardordning (Prepend). |
| [scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)](#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Tillämpar den angivna skalningsvektorn (scaleX och scaleY) på denna Matrix i den ordning som anges av  matrixOrder . |
| [skew(double skewX, double skewY)](#skew-double-double-) | Tillämpar angiven skevningstransformation på denna Matrix. |
| [toString()](#toString--) | Returnerar strängrepresentationen av detta  XpsMatrix  -instans. |
| [transform(Rectangle2D rect)](#transform-java.awt.geom.Rectangle2D-) | Tillämpar den affina transformationen som representeras av denna Matrix på en angiven rektangel. |
| [transformPoint(Point2D point)](#transformPoint-java.awt.geom.Point2D-) | Tillämpar den affina transformationen som representeras av denna Matrix på en angiven punkt. |
| [transformPoints(Point2D[] points)](#transformPoints-java.awt.geom.Point2D---) | Tillämpar den affina transformationen som representeras av denna Matrix på en angiven array av punkter. |
| [transformPoints(Point2D[] points, int startIndex, int numberOfPoints)](#transformPoints-java.awt.geom.Point2D---int-int-) | Tillämpar den affina transformationen som representeras av denna Matrix på en angiven del av en array av punkter. |
| [translate(float offsetX, float offsetY)](#translate-float-float-) | Tillämpar den angivna translationsvektorn på denna Matrix. |
| [translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)](#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Tillämpar den angivna translationsvektorn på denna Matrix i den ordning som anges av  matrixOrder . |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsMatrix deepClone()
```


Klonar denna transformationsmatris.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - Clone of this transformation matrix.
### equals(XpsMatrix a, XpsMatrix b) {#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean equals(XpsMatrix a, XpsMatrix b)
```


Den faktiska implementationen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Den första matrisen. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Den andra matrisen. |

**Returns:**
boolean - [true] om matriser är lika
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Bestämmer om det angivna  object  är lika med denna instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| obj | java.lang.Object | Objektet att jämföra med denna instans. |

**Returns:**
boolean -  true  om det angivna  objektet  är lika med denna instans; annars,  false . Parametern  obj  är null.
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


Hämtar M11‑elementet.

**Returns:**
float - M11-elementet.
### getM12() {#getM12--}
```
public float getM12()
```


Hämtar M12‑elementet.

**Returns:**
float - M12-elementet.
### getM21() {#getM21--}
```
public float getM21()
```


Hämtar M21‑elementet.

**Returns:**
float - M21-elementet.
### getM22() {#getM22--}
```
public float getM22()
```


Hämtar M22‑elementet.

**Returns:**
float - M22-elementet.
### getM31() {#getM31--}
```
public float getM31()
```


Hämtar M31‑elementet.

**Returns:**
float - M31-elementet.
### getM32() {#getM32--}
```
public float getM32()
```


Hämtar M32‑elementet.

**Returns:**
float - M32-elementet.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Returnerar en hash‑kod för denna instans.

**Returns:**
int - En hashkod för denna instans, lämplig för användning i hash-algoritmer och datastrukturer som en hash-tabell.
### isIdentity() {#isIdentity--}
```
public boolean isIdentity()
```


Hämtar ett värde som indikerar om denna instans är en identitetsmatris.

Värde:  True  om denna instans är identitetsmatris; annars,  false .

**Returns:**
boolean - Ett värde som indikerar om denna instans är en identitetsmatris.
### multiply(XpsMatrix matrix) {#multiply-com.aspose.xps.XpsMatrix-}
```
public void multiply(XpsMatrix matrix)
```


Multiplicerar denna matris med matrisen som anges av  matrix  i standard (Prepend)-ordning.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Matrisen. |

### multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder) {#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)
```


Multiplicerar denna matris med matrisen som anges av  matrix  i den ordning som anges av  matrixOrder .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Matrisen. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Ordningen. |

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


Implementerar operatorn ==.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Den första matrisen. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Den andra matrisen. |

**Returns:**
boolean - Resultatet av operatorn.
### op_Inequality(XpsMatrix a, XpsMatrix b) {#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Inequality(XpsMatrix a, XpsMatrix b)
```


Implementerar operatorn !=.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Den första matrisen. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Den andra matrisen. |

**Returns:**
boolean - Resultatet av operatorn.
### reset() {#reset--}
```
public void reset()
```


Återställer denna Matrix till identitetsmatris.

### rotate(float angle) {#rotate-float-}
```
public void rotate(float angle)
```


Tillämpar medursrotation med  angle  på denna Matrix i standard (Prepend)-ordning.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| vinkel | float | Vinkeln. |

### rotate(float angle, XpsMatrix.MatrixOrder matrixOrder) {#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)
```


Tillämpar medursrotation med  angle  på denna Matrix i den ordning som anges av  matrixOrder .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| vinkel | float | Vinkeln. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Ordningen. |

### rotateAround(float angle, Point2D pivot) {#rotateAround-float-java.awt.geom.Point2D-}
```
public void rotateAround(float angle, Point2D pivot)
```


Tillämpar medursrotation med  angle  kring  pivot  på denna Matrix i standard (Prepend)-ordning.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| vinkel | float | Vinkeln. |
| pivot | java.awt.geom.Point2D | Pivotpunkten. |

### rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder) {#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)
```


Tillämpar medursrotation med  angle  runt  pivot  på denna Matrix i den ordning som anges av  matrixOrder .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| vinkel | float | Vinkeln. |
| pivot | java.awt.geom.Point2D | Pivotpunkten. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Ordningen. |

### scale(float scaleX, float scaleY) {#scale-float-float-}
```
public void scale(float scaleX, float scaleY)
```


Tillämpar den angivna skalningsvektorn (scaleX och scaleY) på denna Matrix i standardordning (Prepend).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| scaleX | float | Skalan x. |
| scaleY | float | Skalan y. |

### scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder) {#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)
```


Tillämpar den angivna skalningsvektorn (scaleX och scaleY) på denna Matrix i den ordning som anges av  matrixOrder .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| scaleX | float | Skalan X. |
| scaleY | float | Skalan Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Ordningen. |

### skew(double skewX, double skewY) {#skew-double-double-}
```
public void skew(double skewX, double skewY)
```


Tillämpar angiven skevningstransformation på denna Matrix.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| skewX | double | Snedningen x. |
| skewY | double | Snedningen y. |

### toString() {#toString--}
```
public String toString()
```


Returnerar strängrepresentationen av detta  XpsMatrix  -instans.

**Returns:**
java.lang.String - Strängrepresentation
### transform(Rectangle2D rect) {#transform-java.awt.geom.Rectangle2D-}
```
public Rectangle2D transform(Rectangle2D rect)
```


Tillämpar den affina transformationen som representeras av denna Matrix på en angiven rektangel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D | Rektangeln. |

**Returns:**
java.awt.geom.Rectangle2D - Transformerad rektangel
### transformPoint(Point2D point) {#transformPoint-java.awt.geom.Point2D-}
```
public Point2D transformPoint(Point2D point)
```


Tillämpar den affina transformationen som representeras av denna Matrix på en angiven punkt.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkt | java.awt.geom.Point2D | Punkten. |

**Returns:**
java.awt.geom.Point2D - Transformerad punkt
### transformPoints(Point2D[] points) {#transformPoints-java.awt.geom.Point2D---}
```
public void transformPoints(Point2D[] points)
```


Tillämpar den affina transformationen som representeras av denna Matrix på en angiven array av punkter.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkter | java.awt.geom.Point2D[] | Punkterna. |

### transformPoints(Point2D[] points, int startIndex, int numberOfPoints) {#transformPoints-java.awt.geom.Point2D---int-int-}
```
public void transformPoints(Point2D[] points, int startIndex, int numberOfPoints)
```


Tillämpar den affina transformationen som representeras av denna Matrix på en angiven del av en array av punkter.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| punkter | java.awt.geom.Point2D[] | Punkterna. |
| startIndex | int | Startindexen. |
| numberOfPoints | int | Antalet punkter. |

### translate(float offsetX, float offsetY) {#translate-float-float-}
```
public void translate(float offsetX, float offsetY)
```


Tillämpar den angivna translationsvektorn på denna Matrix.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| offsetX | float | Offset X. |
| offsetY | float | Offset Y. |

### translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder) {#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)
```


Tillämpar den angivna translationsvektorn på denna Matrix i den ordning som anges av  matrixOrder .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| offsetX | float | Offset X. |
| offsetY | float | Offset Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Ordningen. |

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

