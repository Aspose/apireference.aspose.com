---
title: "TransformedStroke"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Un trazo que contiene transformación."
type: docs
weight: 17
url: /es/java/com.aspose.page/transformedstroke/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.awt.Stroke
```
public class TransformedStroke implements Stroke
```

Un trazo que contiene transformación.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [TransformedStroke(Stroke base, AffineTransform at)](#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-) | Crea un TransformedStroke basado en otro Stroke y un AffineTransform. |
## Métodos

| Método | Descripción |
| --- | --- |
| [createStrokedShape(Shape s)](#createStrokedShape-java.awt.Shape-) | Dibuja la Shape dada con este stroke, creando un contorno. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBaseStroke()](#getBaseStroke--) | Obtiene el stroke básico. |
| [getClass()](#getClass--) |  |
| [getTransform()](#getTransform--) | Obtiene una transformación. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TransformedStroke(Stroke base, AffineTransform at) {#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-}
```
public TransformedStroke(Stroke base, AffineTransform at)
```


Crea un TransformedStroke basado en otro Stroke y un AffineTransform.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| base | java.awt.Stroke | La base del stroke. |
| en | java.awt.geom.AffineTransform | La transformación afín. |

### createStrokedShape(Shape s) {#createStrokedShape-java.awt.Shape-}
```
public Shape createStrokedShape(Shape s)
```


Dibuja la Shape dada con este trazo, creando un contorno. Este contorno se distorsiona mediante nuestro AffineTransform en relación con el contorno que produciría el base stroke, pero solo en términos de escalado (es decir, el grosor de las líneas), ya que la traslación y rotación se deshacen después del trazado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| s | java.awt.Shape | Como forma a contornear. |

**Returns:**
java.awt.Shape - Un contorno de la forma.
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
### getBaseStroke() {#getBaseStroke--}
```
public Stroke getBaseStroke()
```


Obtiene el stroke básico.

**Returns:**
java.awt.Stroke - Trazo básico.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


Obtiene una transformación.

**Returns:**
java.awt.geom.AffineTransform - Una transformación.
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

