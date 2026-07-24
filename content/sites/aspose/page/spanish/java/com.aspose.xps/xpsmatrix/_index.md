---
title: "XpsMatrix"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Clase que encapsula características del elemento de propiedad MatrixTransform."
type: docs
weight: 36
url: /es/java/com.aspose.xps/xpsmatrix/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsMatrix extends XpsObject
```

Clase que encapsula características del elemento de propiedad MatrixTransform. Este elemento define una transformación matricial afín arbitraria utilizada para manipular los sistemas de coordenadas de los elementos.
## Métodos

| Método | Descripción |
| --- | --- |
| [deepClone()](#deepClone--) | Clona esta matriz de transformación. |
| [equals(XpsMatrix a, XpsMatrix b)](#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | La implementación real. |
| [equals(Object obj)](#equals-java.lang.Object-) | Determina si el  object  especificado es igual a esta instancia. |
| [getClass()](#getClass--) |  |
| [getM11()](#getM11--) | Obtiene el elemento M11. |
| [getM12()](#getM12--) | Obtiene el elemento M12. |
| [getM21()](#getM21--) | Obtiene el elemento M21. |
| [getM22()](#getM22--) | Obtiene el elemento M22. |
| [getM31()](#getM31--) | Obtiene el elemento M31. |
| [getM32()](#getM32--) | Obtiene el elemento M32. |
| [hashCode()](#hashCode--) | Devuelve un código hash para esta instancia. |
| [isIdentity()](#isIdentity--) | Obtiene un valor que indica si esta instancia es una matriz identidad. |
| [multiply(XpsMatrix matrix)](#multiply-com.aspose.xps.XpsMatrix-) | Multiplica esta matriz por la matriz especificada por la  matrix  en orden predeterminado (Prepend). |
| [multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)](#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-) | Multiplica esta matriz por la matriz especificada por la  matrix  en el orden especificado por  matrixOrder . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(XpsMatrix a, XpsMatrix b)](#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Implementa el operador ==. |
| [op_Inequality(XpsMatrix a, XpsMatrix b)](#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Implementa el operador !. |
| [reset()](#reset--) | Restablece esta Matriz a la matriz identidad. |
| [rotate(float angle)](#rotate-float-) | Aplica una rotación en sentido horario de  angle  a esta Matriz en orden predeterminado (Prepend). |
| [rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)](#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Aplica una rotación en sentido horario de  angle  a esta Matriz en el orden especificado por  matrixOrder . |
| [rotateAround(float angle, Point2D pivot)](#rotateAround-float-java.awt.geom.Point2D-) | Aplica una rotación en sentido horario de  angle  alrededor del  pivot  a esta Matriz en orden predeterminado (Prepend). |
| [rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)](#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-) | Aplica una rotación en sentido horario de  angle  alrededor del  pivot  a esta Matriz en el orden especificado por  matrixOrder . |
| [scale(float scaleX, float scaleY)](#scale-float-float-) | Aplica el vector de escala especificado (scaleX y scaleY) a esta Matriz en el orden predeterminado (Prepend). |
| [scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)](#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Aplica el vector de escala especificado (scaleX y scaleY) a esta Matriz en el orden especificado por  matrixOrder . |
| [skew(double skewX, double skewY)](#skew-double-double-) | Aplica la transformación de sesgo especificada a esta Matriz. |
| [toString()](#toString--) | Devuelve la representación en cadena de esta  XpsMatrix  instancia. |
| [transform(Rectangle2D rect)](#transform-java.awt.geom.Rectangle2D-) | Aplica la transformación afín representada por esta Matriz a un rectángulo especificado. |
| [transformPoint(Point2D point)](#transformPoint-java.awt.geom.Point2D-) | Aplica la transformación afín representada por esta Matriz a un punto especificado. |
| [transformPoints(Point2D[] points)](#transformPoints-java.awt.geom.Point2D---) | Aplica la transformación afín representada por esta Matriz a una matriz especificada de puntos. |
| [transformPoints(Point2D[] points, int startIndex, int numberOfPoints)](#transformPoints-java.awt.geom.Point2D---int-int-) | Aplica la transformación afín representada por esta Matriz a una parte especificada de la matriz de puntos. |
| [translate(float offsetX, float offsetY)](#translate-float-float-) | Aplica el vector de traslación especificado a esta Matriz. |
| [translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)](#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Aplica el vector de traslación especificado a esta Matriz en el orden especificado por  matrixOrder . |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsMatrix deepClone()
```


Clona esta matriz de transformación.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - Clone of this transformation matrix.
### equals(XpsMatrix a, XpsMatrix b) {#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean equals(XpsMatrix a, XpsMatrix b)
```


La implementación real.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La primera matriz. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La segunda matriz. |

**Returns:**
boolean - [true] si las matrices son iguales
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Determina si el  object  especificado es igual a esta instancia.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | java.lang.Object | El  objeto  para comparar con esta instancia. |

**Returns:**
boolean -  true  si el  objeto  especificado es igual a esta instancia; de lo contrario,  false . El parámetro  obj  es nulo.
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


Obtiene el elemento M11.

**Returns:**
float - El elemento M11.
### getM12() {#getM12--}
```
public float getM12()
```


Obtiene el elemento M12.

**Returns:**
float - El elemento M12.
### getM21() {#getM21--}
```
public float getM21()
```


Obtiene el elemento M21.

**Returns:**
float - El elemento M21.
### getM22() {#getM22--}
```
public float getM22()
```


Obtiene el elemento M22.

**Returns:**
float - El elemento M22.
### getM31() {#getM31--}
```
public float getM31()
```


Obtiene el elemento M31.

**Returns:**
float - El elemento M31.
### getM32() {#getM32--}
```
public float getM32()
```


Obtiene el elemento M32.

**Returns:**
float - El elemento M32.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Devuelve un código hash para esta instancia.

**Returns:**
int - Un código hash para esta instancia, adecuado para su uso en algoritmos de hash y estructuras de datos como una tabla hash.
### isIdentity() {#isIdentity--}
```
public boolean isIdentity()
```


Obtiene un valor que indica si esta instancia es una matriz identidad.

Valor:  True  si esta instancia es una matriz identidad; de lo contrario,  false .

**Returns:**
boolean - Un valor que indica si esta instancia es una matriz identidad.
### multiply(XpsMatrix matrix) {#multiply-com.aspose.xps.XpsMatrix-}
```
public void multiply(XpsMatrix matrix)
```


Multiplica esta matriz por la matriz especificada por la  matrix  en orden predeterminado (Prepend).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La matriz. |

### multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder) {#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)
```


Multiplica esta matriz por la matriz especificada por la  matrix  en el orden especificado por  matrixOrder .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La matriz. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | El orden. |

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


Implementa el operador ==.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La primera matriz. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La segunda matriz. |

**Returns:**
boolean - El resultado del operador.
### op_Inequality(XpsMatrix a, XpsMatrix b) {#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Inequality(XpsMatrix a, XpsMatrix b)
```


Implementa el operador !=.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La primera matriz. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La segunda matriz. |

**Returns:**
boolean - El resultado del operador.
### reset() {#reset--}
```
public void reset()
```


Restablece esta Matriz a la matriz identidad.

### rotate(float angle) {#rotate-float-}
```
public void rotate(float angle)
```


Aplica una rotación en sentido horario de  angle  a esta Matriz en orden predeterminado (Prepend).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ángulo | float | El ángulo. |

### rotate(float angle, XpsMatrix.MatrixOrder matrixOrder) {#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)
```


Aplica una rotación en sentido horario de  angle  a esta Matriz en el orden especificado por  matrixOrder .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ángulo | float | El ángulo. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | El orden. |

### rotateAround(float angle, Point2D pivot) {#rotateAround-float-java.awt.geom.Point2D-}
```
public void rotateAround(float angle, Point2D pivot)
```


Aplica una rotación en sentido horario de  angle  alrededor del  pivot  a esta Matriz en orden predeterminado (Prepend).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ángulo | float | El ángulo. |
| pivote | java.awt.geom.Point2D | El punto de pivote. |

### rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder) {#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)
```


Aplica una rotación en sentido horario de  angle  alrededor del  pivot  a esta Matriz en el orden especificado por  matrixOrder .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ángulo | float | El ángulo. |
| pivote | java.awt.geom.Point2D | El punto de pivote. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | El orden. |

### scale(float scaleX, float scaleY) {#scale-float-float-}
```
public void scale(float scaleX, float scaleY)
```


Aplica el vector de escala especificado (scaleX y scaleY) a esta Matriz en el orden predeterminado (Prepend).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| scaleX | float | La escala x. |
| scaleY | float | La escala y. |

### scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder) {#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)
```


Aplica el vector de escala especificado (scaleX y scaleY) a esta Matriz en el orden especificado por  matrixOrder .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| scaleX | float | La escala X. |
| scaleY | float | La escala Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | El orden. |

### skew(double skewX, double skewY) {#skew-double-double-}
```
public void skew(double skewX, double skewY)
```


Aplica la transformación de sesgo especificada a esta Matriz.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| skewX | double | La inclinación x. |
| skewY | double | La inclinación y. |

### toString() {#toString--}
```
public String toString()
```


Devuelve la representación en cadena de esta  XpsMatrix  instancia.

**Returns:**
java.lang.String - Representación de cadena
### transform(Rectangle2D rect) {#transform-java.awt.geom.Rectangle2D-}
```
public Rectangle2D transform(Rectangle2D rect)
```


Aplica la transformación afín representada por esta Matriz a un rectángulo especificado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D | El rectángulo. |

**Returns:**
java.awt.geom.Rectangle2D - Rectángulo transformado
### transformPoint(Point2D point) {#transformPoint-java.awt.geom.Point2D-}
```
public Point2D transformPoint(Point2D point)
```


Aplica la transformación afín representada por esta Matriz a un punto especificado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| point | java.awt.geom.Point2D | El punto. |

**Returns:**
java.awt.geom.Point2D - Punto transformado
### transformPoints(Point2D[] points) {#transformPoints-java.awt.geom.Point2D---}
```
public void transformPoints(Point2D[] points)
```


Aplica la transformación afín representada por esta Matriz a una matriz especificada de puntos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| puntos | java.awt.geom.Point2D[] | Los puntos. |

### transformPoints(Point2D[] points, int startIndex, int numberOfPoints) {#transformPoints-java.awt.geom.Point2D---int-int-}
```
public void transformPoints(Point2D[] points, int startIndex, int numberOfPoints)
```


Aplica la transformación afín representada por esta Matriz a una parte especificada de la matriz de puntos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| puntos | java.awt.geom.Point2D[] | Los puntos. |
| startIndex | int | El índice de inicio. |
| numberOfPoints | int | El número de puntos. |

### translate(float offsetX, float offsetY) {#translate-float-float-}
```
public void translate(float offsetX, float offsetY)
```


Aplica el vector de traslación especificado a esta Matriz.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| offsetX | float | El desplazamiento X. |
| offsetY | float | El desplazamiento Y. |

### translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder) {#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)
```


Aplica el vector de traslación especificado a esta Matriz en el orden especificado por  matrixOrder .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| offsetX | float | El desplazamiento X. |
| offsetY | float | El desplazamiento Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | El orden. |

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

