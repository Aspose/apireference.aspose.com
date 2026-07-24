---
title: "DimensionF"
second_title: "Referencia de API de Aspose.Page para Java"
description: "La clase Dimension encapsula el ancho y la altura de un componente en precisión simple en un solo objeto."
type: docs
weight: 11
url: /es/java/com.aspose.page/dimensionf/
---
**Inheritance:**
java.lang.Object, java.awt.geom.Dimension2D

**All Implemented Interfaces:**
java.io.Serializable
```
public class DimensionF extends Dimension2D implements Serializable
```

La clase `Dimension` encapsula el ancho y la altura de un componente (en precisión simple) en un solo objeto.

Normalmente, los valores de `width` y `height` son enteros no negativos. Los constructores que le permiten crear una dimensión no impiden que establezca un valor negativo para estas propiedades. Si el valor de `width` o `height` es negativo, el comportamiento de algunos métodos definidos por otros objetos es indefinido.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [DimensionF()](#DimensionF--) | Crea una instancia de `Dimension` con un ancho de cero y una altura de cero. |
| [DimensionF(DimensionF d)](#DimensionF-com.aspose.page.DimensionF-) | Crea una instancia de `Dimension` cuyo ancho y altura son los mismos que los de la dimensión especificada. |
| [DimensionF(float width, float height)](#DimensionF-float-float-) | Construye un `Dimension` e lo inicializa con el ancho especificado y la altura especificada. |
## Campos

| Campo | Descripción |
| --- | --- |
| [height](#height) | La dimensión de altura; se pueden usar valores negativos. |
| [width](#width) | La dimensión de ancho; se pueden usar valores negativos. |
## Métodos

| Método | Descripción |
| --- | --- |
| [clone()](#clone--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | Comprueba si dos objetos de dimensión tienen valores iguales. |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | \{@inheritDoc\} |
| [getSize()](#getSize--) | Obtiene el tamaño de este objeto `Dimension`. |
| [getWidth()](#getWidth--) | \{@inheritDoc\} |
| [hashCode()](#hashCode--) | Devuelve el código hash de este `Dimension`. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setSize(DimensionF d)](#setSize-com.aspose.page.DimensionF-) | Establece el tamaño de este objeto `Dimension` al tamaño especificado. |
| [setSize(double width, double height)](#setSize-double-double-) | Establece el tamaño de este objeto `Dimension` al ancho y altura especificados con precisión doble. |
| [setSize(float width, float height)](#setSize-float-float-) | Establece el tamaño de este objeto `Dimension` al ancho y altura especificados. |
| [setSize(Dimension2D arg0)](#setSize-java.awt.geom.Dimension2D-) |  |
| [toString()](#toString--) | Devuelve una representación en cadena de los valores de los campos `height` y `width` de este objeto `Dimension`. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DimensionF() {#DimensionF--}
```
public DimensionF()
```


Crea una instancia de `Dimension` con un ancho de cero y una altura de cero.

### DimensionF(DimensionF d) {#DimensionF-com.aspose.page.DimensionF-}
```
public DimensionF(DimensionF d)
```


Crea una instancia de `Dimension` cuyo ancho y altura son los mismos que los de la dimensión especificada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | la dimensión especificada para los valores de `width` y `height` |

### DimensionF(float width, float height) {#DimensionF-float-float-}
```
public DimensionF(float width, float height)
```


Construye un `Dimension` e lo inicializa con el ancho especificado y la altura especificada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ancho | float | el ancho especificado |
| altura | float | la altura especificada |

### height {#height}
```
public float height
```


La dimensión de altura; se pueden usar valores negativos.

### width {#width}
```
public float width
```


La dimensión de ancho; se pueden usar valores negativos.

### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Comprueba si dos objetos de dimensión tienen valores iguales.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public double getHeight()
```




**Returns:**
double
### getSize() {#getSize--}
```
public DimensionF getSize()
```


Obtiene el tamaño de este objeto `Dimension`. Este método se incluye por completitud, para paralelizar el método `getSize` definido por `Component`.

**Returns:**
[DimensionF](../../com.aspose.page/dimensionf) - the size of this dimension, a new instance of `Dimension` with the same width and height
### getWidth() {#getWidth--}
```
public double getWidth()
```




**Returns:**
double
### hashCode() {#hashCode--}
```
public int hashCode()
```


Devuelve el código hash de este `Dimension`.

**Returns:**
int - un código hash para este `Dimension`
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setSize(DimensionF d) {#setSize-com.aspose.page.DimensionF-}
```
public void setSize(DimensionF d)
```


Establece el tamaño de este objeto `Dimension` al tamaño especificado. Este método se incluye por completitud, para paralelizar el método `setSize` definido por `Component`.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | el nuevo tamaño para este objeto `Dimension` |

### setSize(double width, double height) {#setSize-double-double-}
```
public void setSize(double width, double height)
```


Establece el tamaño de este objeto `Dimension` al ancho y altura especificados con precisión doble. Tenga en cuenta que si `width` o `height` son mayores que `Integer.MAX_VALUE`, se restablecerán a `Integer.MAX_VALUE`.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ancho | double | el nuevo ancho para el objeto `Dimension` |
| altura | double | la nueva altura para el objeto `Dimension` |

### setSize(float width, float height) {#setSize-float-float-}
```
public void setSize(float width, float height)
```


Establece el tamaño de este objeto `Dimension` al ancho y altura especificados. Este método se incluye por completitud, para paralelizar el método `setSize` definido por `Component`.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ancho | float | el nuevo ancho para este objeto `Dimension` |
| altura | float | la nueva altura para este objeto `Dimension` |

### setSize(Dimension2D arg0) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.awt.geom.Dimension2D |  |

### toString() {#toString--}
```
public String toString()
```


Devuelve una representación en forma de cadena de los valores de los campos `height` y `width` de este objeto `Dimension`. Este método está destinado a usarse solo con fines de depuración, y el contenido y formato de la cadena devuelta pueden variar entre implementaciones. La cadena devuelta puede estar vacía pero no puede ser `null`.

**Returns:**
java.lang.String - una representación en forma de cadena de este objeto `Dimension`
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

