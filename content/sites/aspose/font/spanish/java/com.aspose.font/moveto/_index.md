---
title: "MoveTo"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la operación MoveTo."
type: docs
weight: 65
url: /es/java/com.aspose.font/moveto/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IPathSegment](../../com.aspose.font/ipathsegment)
```
public class MoveTo implements IPathSegment
```

Representa la operación MoveTo.
## Métodos

| Método | Descripción |
| --- | --- |
| [clone()](#clone--) | Crea un nuevo objeto que es una copia de la instancia actual. |
| [copy()](#copy--) | Crea una copia del objeto segmento. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getX()](#getX--) | Obtiene la coordenada x. |
| [getY()](#getY--) | Obtiene la coordenada y. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [shift(double dx, double dy)](#shift-double-double-) | Realiza un desplazamiento por las coordenadas x e y. |
| [toString()](#toString--) |  |
| [transform(TransformationMatrix matrix)](#transform-com.aspose.font.TransformationMatrix-) | Transforma las coordenadas con la matriz de transformación. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### clone() {#clone--}
```
public Object clone()
```


Crea un nuevo objeto que es una copia de la instancia actual.

**Returns:**
java.lang.Object - Un nuevo objeto que es una copia de esta instancia.
### copy() {#copy--}
```
public IPathSegment copy()
```


Crea una copia del objeto segmento.

**Returns:**
[IPathSegment](../../com.aspose.font/ipathsegment) - Copy of the segment object.
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
### getX() {#getX--}
```
public double getX()
```


Obtiene la coordenada x.

**Returns:**
double - Coordenada x.
### getY() {#getY--}
```
public double getY()
```


Obtiene la coordenada y.

**Returns:**
double - Coordenada y.
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




### shift(double dx, double dy) {#shift-double-double-}
```
public void shift(double dx, double dy)
```


Realiza un desplazamiento por las coordenadas x e y.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| dx | double | Valor dx. |
| dy | double | Valor dy. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### transform(TransformationMatrix matrix) {#transform-com.aspose.font.TransformationMatrix-}
```
public void transform(TransformationMatrix matrix)
```


Transforma las coordenadas con la matriz de transformación.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matriz de transformación. |

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

