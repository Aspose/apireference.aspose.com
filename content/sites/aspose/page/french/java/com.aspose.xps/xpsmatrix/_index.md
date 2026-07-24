---
title: "XpsMatrix"
second_title: "Référence API Aspose.Page pour Java"
description: "Classe encapsulant les fonctionnalités de l'élément de propriété MatrixTransform."
type: docs
weight: 36
url: /fr/java/com.aspose.xps/xpsmatrix/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsMatrix extends XpsObject
```

Classe encapsulant les fonctionnalités de l'élément de propriété MatrixTransform. Cet élément définit une transformation matricielle affine arbitraire utilisée pour manipuler les systèmes de coordonnées des éléments.
## Méthodes

| Méthode | Description |
| --- | --- |
| [deepClone()](#deepClone--) | Clone cette matrice de transformation. |
| [equals(XpsMatrix a, XpsMatrix b)](#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | L'implémentation réelle. |
| [equals(Object obj)](#equals-java.lang.Object-) | Détermine si l'objet spécifié est égal à cette instance. |
| [getClass()](#getClass--) |  |
| [getM11()](#getM11--) | Obtient l'élément M11. |
| [getM12()](#getM12--) | Obtient l'élément M12. |
| [getM21()](#getM21--) | Obtient l'élément M21. |
| [getM22()](#getM22--) | Obtient l'élément M22. |
| [getM31()](#getM31--) | Obtient l'élément M31. |
| [getM32()](#getM32--) | Obtient l'élément M32. |
| [hashCode()](#hashCode--) | Renvoie un code de hachage pour cette instance. |
| [isIdentity()](#isIdentity--) | Obtient une valeur indiquant si cette instance est une matrice identité. |
| [multiply(XpsMatrix matrix)](#multiply-com.aspose.xps.XpsMatrix-) | Multiplie cette matrice par la matrice spécifiée par la  matrix  dans l'ordre par défaut (Prepend). |
| [multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)](#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-) | Multiplie cette matrice par la matrice spécifiée par la  matrix  dans l'ordre spécifié par  matrixOrder . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(XpsMatrix a, XpsMatrix b)](#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Implémente l'opérateur ==. |
| [op_Inequality(XpsMatrix a, XpsMatrix b)](#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Implémente l'opérateur !. |
| [reset()](#reset--) | Réinitialise cette Matrix à la matrice identité. |
| [rotate(float angle)](#rotate-float-) | Applique une rotation horaire de  angle  à cette Matrix dans l'ordre par défaut (Prepend). |
| [rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)](#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Applique une rotation horaire de  angle  à cette Matrix dans l'ordre spécifié par  matrixOrder . |
| [rotateAround(float angle, Point2D pivot)](#rotateAround-float-java.awt.geom.Point2D-) | Applique une rotation horaire de  angle  autour du  pivot  à cette Matrix dans l'ordre par défaut (Prepend). |
| [rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)](#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-) | Applique une rotation horaire de  angle  autour du  pivot  à cette Matrix dans l'ordre spécifié par  matrixOrder . |
| [scale(float scaleX, float scaleY)](#scale-float-float-) | Applique le vecteur d'échelle spécifié (scaleX et scaleY) à cette Matrix dans l'ordre par défaut (Prepend). |
| [scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)](#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Applique le vecteur d'échelle spécifié (scaleX et scaleY) à cette Matrix dans l'ordre spécifié par  matrixOrder . |
| [skew(double skewX, double skewY)](#skew-double-double-) | Applique la transformation de cisaillement spécifiée à cette Matrix. |
| [toString()](#toString--) | Renvoie la représentation sous forme de chaîne de cette instance  XpsMatrix . |
| [transform(Rectangle2D rect)](#transform-java.awt.geom.Rectangle2D-) | Applique la transformation affine représentée par cette Matrix à un rectangle spécifié. |
| [transformPoint(Point2D point)](#transformPoint-java.awt.geom.Point2D-) | Applique la transformation affine représentée par cette Matrix à un point spécifié. |
| [transformPoints(Point2D[] points)](#transformPoints-java.awt.geom.Point2D---) | Applique la transformation affine représentée par cette Matrix à un tableau de points spécifié. |
| [transformPoints(Point2D[] points, int startIndex, int numberOfPoints)](#transformPoints-java.awt.geom.Point2D---int-int-) | Applique la transformation affine représentée par cette Matrix à une partie spécifiée d'un tableau de points. |
| [translate(float offsetX, float offsetY)](#translate-float-float-) | Applique le vecteur de translation spécifié à cette Matrix. |
| [translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)](#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Applique le vecteur de translation spécifié à cette Matrix dans l'ordre spécifié par  matrixOrder . |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsMatrix deepClone()
```


Clone cette matrice de transformation.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - Clone of this transformation matrix.
### equals(XpsMatrix a, XpsMatrix b) {#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean equals(XpsMatrix a, XpsMatrix b)
```


L'implémentation réelle.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La première matrice. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La deuxième matrice. |

**Returns:**
booléen - [true] si les matrices sont égales
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Détermine si l'objet spécifié est égal à cette instance.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object | L'objet à comparer avec cette instance. |

**Returns:**
booléen - true si l'objet spécifié est égal à cette instance ; sinon, false. Le paramètre obj est nul.
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


Obtient l'élément M11.

**Returns:**
float - L'élément M11.
### getM12() {#getM12--}
```
public float getM12()
```


Obtient l'élément M12.

**Returns:**
float - L'élément M12.
### getM21() {#getM21--}
```
public float getM21()
```


Obtient l'élément M21.

**Returns:**
float - L'élément M21.
### getM22() {#getM22--}
```
public float getM22()
```


Obtient l'élément M22.

**Returns:**
float - L'élément M22.
### getM31() {#getM31--}
```
public float getM31()
```


Obtient l'élément M31.

**Returns:**
float - L'élément M31.
### getM32() {#getM32--}
```
public float getM32()
```


Obtient l'élément M32.

**Returns:**
float - L'élément M32.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Renvoie un code de hachage pour cette instance.

**Returns:**
int - Un code de hachage pour cette instance, adapté à une utilisation dans les algorithmes de hachage et les structures de données comme une table de hachage.
### isIdentity() {#isIdentity--}
```
public boolean isIdentity()
```


Obtient une valeur indiquant si cette instance est une matrice identité.

Valeur : True si cette instance est une matrice identité ; sinon, false.

**Returns:**
booléen - Une valeur indiquant si cette instance est une matrice identité.
### multiply(XpsMatrix matrix) {#multiply-com.aspose.xps.XpsMatrix-}
```
public void multiply(XpsMatrix matrix)
```


Multiplie cette matrice par la matrice spécifiée par la  matrix  dans l'ordre par défaut (Prepend).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La matrice. |

### multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder) {#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)
```


Multiplie cette matrice par la matrice spécifiée par la  matrix  dans l'ordre spécifié par  matrixOrder .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La matrice. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | L'ordre. |

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


Implémente l'opérateur ==.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La première matrice. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La deuxième matrice. |

**Returns:**
booléen - Le résultat de l'opérateur.
### op_Inequality(XpsMatrix a, XpsMatrix b) {#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Inequality(XpsMatrix a, XpsMatrix b)
```


Implémente l'opérateur !=.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La première matrice. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La deuxième matrice. |

**Returns:**
booléen - Le résultat de l'opérateur.
### reset() {#reset--}
```
public void reset()
```


Réinitialise cette Matrix à la matrice identité.

### rotate(float angle) {#rotate-float-}
```
public void rotate(float angle)
```


Applique une rotation horaire de  angle  à cette Matrix dans l'ordre par défaut (Prepend).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| angle | float | L'angle. |

### rotate(float angle, XpsMatrix.MatrixOrder matrixOrder) {#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)
```


Applique une rotation horaire de  angle  à cette Matrix dans l'ordre spécifié par  matrixOrder .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| angle | float | L'angle. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | L'ordre. |

### rotateAround(float angle, Point2D pivot) {#rotateAround-float-java.awt.geom.Point2D-}
```
public void rotateAround(float angle, Point2D pivot)
```


Applique une rotation horaire de  angle  autour du  pivot  à cette Matrix dans l'ordre par défaut (Prepend).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| angle | float | L'angle. |
| pivot | java.awt.geom.Point2D | Le point pivot. |

### rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder) {#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)
```


Applique une rotation horaire de  angle  autour du  pivot  à cette Matrix dans l'ordre spécifié par  matrixOrder .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| angle | float | L'angle. |
| pivot | java.awt.geom.Point2D | Le point pivot. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | L'ordre. |

### scale(float scaleX, float scaleY) {#scale-float-float-}
```
public void scale(float scaleX, float scaleY)
```


Applique le vecteur d'échelle spécifié (scaleX et scaleY) à cette Matrix dans l'ordre par défaut (Prepend).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| scaleX | float | L'échelle x. |
| scaleY | float | L'échelle y. |

### scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder) {#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)
```


Applique le vecteur d'échelle spécifié (scaleX et scaleY) à cette Matrix dans l'ordre spécifié par  matrixOrder .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| scaleX | float | L'échelle X. |
| scaleY | float | L'échelle Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | L'ordre. |

### skew(double skewX, double skewY) {#skew-double-double-}
```
public void skew(double skewX, double skewY)
```


Applique la transformation de cisaillement spécifiée à cette Matrix.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| skewX | double | L'inclinaison x. |
| skewY | double | L'inclinaison y. |

### toString() {#toString--}
```
public String toString()
```


Renvoie la représentation sous forme de chaîne de cette instance  XpsMatrix .

**Returns:**
java.lang.String - Représentation de chaîne
### transform(Rectangle2D rect) {#transform-java.awt.geom.Rectangle2D-}
```
public Rectangle2D transform(Rectangle2D rect)
```


Applique la transformation affine représentée par cette Matrix à un rectangle spécifié.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D | Le rectangle. |

**Returns:**
java.awt.geom.Rectangle2D - Rectangle transformé
### transformPoint(Point2D point) {#transformPoint-java.awt.geom.Point2D-}
```
public Point2D transformPoint(Point2D point)
```


Applique la transformation affine représentée par cette Matrix à un point spécifié.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| point | java.awt.geom.Point2D | Le point. |

**Returns:**
java.awt.geom.Point2D - Point transformé
### transformPoints(Point2D[] points) {#transformPoints-java.awt.geom.Point2D---}
```
public void transformPoints(Point2D[] points)
```


Applique la transformation affine représentée par cette Matrix à un tableau de points spécifié.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Les points. |

### transformPoints(Point2D[] points, int startIndex, int numberOfPoints) {#transformPoints-java.awt.geom.Point2D---int-int-}
```
public void transformPoints(Point2D[] points, int startIndex, int numberOfPoints)
```


Applique la transformation affine représentée par cette Matrix à une partie spécifiée d'un tableau de points.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Les points. |
| startIndex | int | L'index de départ. |
| numberOfPoints | int | Le nombre de points. |

### translate(float offsetX, float offsetY) {#translate-float-float-}
```
public void translate(float offsetX, float offsetY)
```


Applique le vecteur de translation spécifié à cette Matrix.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| offsetX | float | Le décalage X. |
| offsetY | float | Le décalage Y. |

### translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder) {#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)
```


Applique le vecteur de translation spécifié à cette Matrix dans l'ordre spécifié par  matrixOrder .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| offsetX | float | Le décalage X. |
| offsetY | float | Le décalage Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | L'ordre. |

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

