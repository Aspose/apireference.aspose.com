---
title: "XpsMatrix"
second_title: "Aspose.Page per Java API Reference"
description: "Classe che incapsula le funzionalità dell'elemento proprietà MatrixTransform."
type: docs
weight: 36
url: /it/java/com.aspose.xps/xpsmatrix/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsMatrix extends XpsObject
```

Classe che incapsula le funzionalità dell'elemento proprietà MatrixTransform. Questo elemento definisce una trasformazione di matrice affine arbitraria utilizzata per manipolare i sistemi di coordinate degli elementi.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [deepClone()](#deepClone--) | Clona questa matrice di trasformazione. |
| [equals(XpsMatrix a, XpsMatrix b)](#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | L'implementazione reale. |
| [equals(Object obj)](#equals-java.lang.Object-) | Determina se l'oggetto specificato è uguale a questa istanza. |
| [getClass()](#getClass--) |  |
| [getM11()](#getM11--) | Ottiene l'elemento M11. |
| [getM12()](#getM12--) | Ottiene l'elemento M12. |
| [getM21()](#getM21--) | Ottiene l'elemento M21. |
| [getM22()](#getM22--) | Ottiene l'elemento M22. |
| [getM31()](#getM31--) | Ottiene l'elemento M31. |
| [getM32()](#getM32--) | Ottiene l'elemento M32. |
| [hashCode()](#hashCode--) | Restituisce un codice hash per questa istanza. |
| [isIdentity()](#isIdentity--) | Ottiene un valore che indica se questa istanza è una matrice identità. |
| [multiply(XpsMatrix matrix)](#multiply-com.aspose.xps.XpsMatrix-) | Moltiplica questa matrice per la matrice specificata da  matrix  nell'ordine predefinito (Prepend). |
| [multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)](#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-) | Moltiplica questa matrice per la matrice specificata da  matrix  nell'ordine specificato da  matrixOrder . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(XpsMatrix a, XpsMatrix b)](#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Implementa l'operatore ==. |
| [op_Inequality(XpsMatrix a, XpsMatrix b)](#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Implementa l'operatore !. |
| [reset()](#reset--) | Reimposta questa Matrice alla matrice identità. |
| [rotate(float angle)](#rotate-float-) | Applica una rotazione in senso orario di  angle  a questa Matrice nell'ordine predefinito (Prepend). |
| [rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)](#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Applica una rotazione in senso orario di  angle  a questa Matrice nell'ordine specificato da  matrixOrder . |
| [rotateAround(float angle, Point2D pivot)](#rotateAround-float-java.awt.geom.Point2D-) | Applica una rotazione in senso orario di  angle  attorno al  pivot  a questa Matrice nell'ordine predefinito (Prepend). |
| [rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)](#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-) | Applica una rotazione in senso orario di  angle  attorno al  pivot  a questa Matrice nell'ordine specificato da  matrixOrder . |
| [scale(float scaleX, float scaleY)](#scale-float-float-) | Applica il vettore di scala specificato (scaleX e scaleY) a questa Matrice nell'ordine predefinito (Prepend). |
| [scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)](#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Applica il vettore di scala specificato (scaleX e scaleY) a questa Matrice nell'ordine specificato da  matrixOrder . |
| [skew(double skewX, double skewY)](#skew-double-double-) | Applica la trasformazione di inclinazione specificata a questa Matrice. |
| [toString()](#toString--) | Restituisce la rappresentazione stringa di questa istanza  XpsMatrix . |
| [transform(Rectangle2D rect)](#transform-java.awt.geom.Rectangle2D-) | Applica la trasformazione affine rappresentata da questa Matrice a un rettangolo specificato. |
| [transformPoint(Point2D point)](#transformPoint-java.awt.geom.Point2D-) | Applica la trasformazione affine rappresentata da questa Matrice a un punto specificato. |
| [transformPoints(Point2D[] points)](#transformPoints-java.awt.geom.Point2D---) | Applica la trasformazione affine rappresentata da questa Matrice a un array specificato di punti. |
| [transformPoints(Point2D[] points, int startIndex, int numberOfPoints)](#transformPoints-java.awt.geom.Point2D---int-int-) | Applica la trasformazione affine rappresentata da questa Matrice a una parte specificata di un array di punti. |
| [translate(float offsetX, float offsetY)](#translate-float-float-) | Applica il vettore di traslazione specificato a questa Matrice. |
| [translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)](#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Applica il vettore di traslazione specificato a questa Matrice nell'ordine specificato da  matrixOrder . |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsMatrix deepClone()
```


Clona questa matrice di trasformazione.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - Clone of this transformation matrix.
### equals(XpsMatrix a, XpsMatrix b) {#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean equals(XpsMatrix a, XpsMatrix b)
```


L'implementazione reale.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La prima matrice. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La seconda matrice. |

**Returns:**
boolean - [true] se le matrici sono uguali
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Determina se l'oggetto specificato è uguale a questa istanza.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | java.lang.Object | L'oggetto da confrontare con questa istanza. |

**Returns:**
boolean -  true  se l'oggetto specificato è uguale a questa istanza; altrimenti,  false . Il parametro  obj  è null.
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


Ottiene l'elemento M11.

**Returns:**
float - L'elemento M11.
### getM12() {#getM12--}
```
public float getM12()
```


Ottiene l'elemento M12.

**Returns:**
float - L'elemento M12.
### getM21() {#getM21--}
```
public float getM21()
```


Ottiene l'elemento M21.

**Returns:**
float - L'elemento M21.
### getM22() {#getM22--}
```
public float getM22()
```


Ottiene l'elemento M22.

**Returns:**
float - L'elemento M22.
### getM31() {#getM31--}
```
public float getM31()
```


Ottiene l'elemento M31.

**Returns:**
float - L'elemento M31.
### getM32() {#getM32--}
```
public float getM32()
```


Ottiene l'elemento M32.

**Returns:**
float - L'elemento M32.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Restituisce un codice hash per questa istanza.

**Returns:**
int - Un codice hash per questa istanza, adatto per l'uso in algoritmi di hashing e strutture dati come una tabella hash.
### isIdentity() {#isIdentity--}
```
public boolean isIdentity()
```


Ottiene un valore che indica se questa istanza è una matrice identità.

Valore:  True  se questa istanza è una matrice identità; altrimenti,  false .

**Returns:**
boolean - Un valore che indica se questa istanza è una matrice identità.
### multiply(XpsMatrix matrix) {#multiply-com.aspose.xps.XpsMatrix-}
```
public void multiply(XpsMatrix matrix)
```


Moltiplica questa matrice per la matrice specificata da  matrix  nell'ordine predefinito (Prepend).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La matrice. |

### multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder) {#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)
```


Moltiplica questa matrice per la matrice specificata da  matrix  nell'ordine specificato da  matrixOrder .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La matrice. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | L'ordine. |

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


Implementa l'operatore ==.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La prima matrice. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La seconda matrice. |

**Returns:**
boolean - Il risultato dell'operatore.
### op_Inequality(XpsMatrix a, XpsMatrix b) {#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Inequality(XpsMatrix a, XpsMatrix b)
```


Implementa l'operatore !=.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La prima matrice. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La seconda matrice. |

**Returns:**
boolean - Il risultato dell'operatore.
### reset() {#reset--}
```
public void reset()
```


Reimposta questa Matrice alla matrice identità.

### rotate(float angle) {#rotate-float-}
```
public void rotate(float angle)
```


Applica una rotazione in senso orario di  angle  a questa Matrice nell'ordine predefinito (Prepend).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| angle | float | L'angolo. |

### rotate(float angle, XpsMatrix.MatrixOrder matrixOrder) {#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)
```


Applica una rotazione in senso orario di  angle  a questa Matrice nell'ordine specificato da  matrixOrder .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| angle | float | L'angolo. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | L'ordine. |

### rotateAround(float angle, Point2D pivot) {#rotateAround-float-java.awt.geom.Point2D-}
```
public void rotateAround(float angle, Point2D pivot)
```


Applica una rotazione in senso orario di  angle  attorno al  pivot  a questa Matrice nell'ordine predefinito (Prepend).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| angle | float | L'angolo. |
| pivot | java.awt.geom.Point2D | Il punto pivot. |

### rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder) {#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)
```


Applica una rotazione in senso orario di  angle  attorno al  pivot  a questa Matrice nell'ordine specificato da  matrixOrder .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| angle | float | L'angolo. |
| pivot | java.awt.geom.Point2D | Il punto pivot. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | L'ordine. |

### scale(float scaleX, float scaleY) {#scale-float-float-}
```
public void scale(float scaleX, float scaleY)
```


Applica il vettore di scala specificato (scaleX e scaleY) a questa Matrice nell'ordine predefinito (Prepend).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| scaleX | float | La scala x. |
| scaleY | float | La scala y. |

### scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder) {#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)
```


Applica il vettore di scala specificato (scaleX e scaleY) a questa Matrice nell'ordine specificato da  matrixOrder .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| scaleX | float | La scala X. |
| scaleY | float | La scala Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | L'ordine. |

### skew(double skewX, double skewY) {#skew-double-double-}
```
public void skew(double skewX, double skewY)
```


Applica la trasformazione di inclinazione specificata a questa Matrice.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| skewX | double | Lo skew x. |
| skewY | double | Lo skew y. |

### toString() {#toString--}
```
public String toString()
```


Restituisce la rappresentazione stringa di questa istanza  XpsMatrix .

**Returns:**
java.lang.String - Rappresentazione della stringa
### transform(Rectangle2D rect) {#transform-java.awt.geom.Rectangle2D-}
```
public Rectangle2D transform(Rectangle2D rect)
```


Applica la trasformazione affine rappresentata da questa Matrice a un rettangolo specificato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D | Il rettangolo. |

**Returns:**
java.awt.geom.Rectangle2D - Rettangolo trasformato
### transformPoint(Point2D point) {#transformPoint-java.awt.geom.Point2D-}
```
public Point2D transformPoint(Point2D point)
```


Applica la trasformazione affine rappresentata da questa Matrice a un punto specificato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| punto | java.awt.geom.Point2D | Il punto. |

**Returns:**
java.awt.geom.Point2D - Punto trasformato
### transformPoints(Point2D[] points) {#transformPoints-java.awt.geom.Point2D---}
```
public void transformPoints(Point2D[] points)
```


Applica la trasformazione affine rappresentata da questa Matrice a un array specificato di punti.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | I punti. |

### transformPoints(Point2D[] points, int startIndex, int numberOfPoints) {#transformPoints-java.awt.geom.Point2D---int-int-}
```
public void transformPoints(Point2D[] points, int startIndex, int numberOfPoints)
```


Applica la trasformazione affine rappresentata da questa Matrice a una parte specificata di un array di punti.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | I punti. |
| startIndex | int | L'indice di partenza. |
| numberOfPoints | int | Il numero di punti. |

### translate(float offsetX, float offsetY) {#translate-float-float-}
```
public void translate(float offsetX, float offsetY)
```


Applica il vettore di traslazione specificato a questa Matrice.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| offsetX | float | L'offset X. |
| offsetY | float | L'offset Y. |

### translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder) {#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)
```


Applica il vettore di traslazione specificato a questa Matrice nell'ordine specificato da  matrixOrder .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| offsetX | float | L'offset X. |
| offsetY | float | L'offset Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | L'ordine. |

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

