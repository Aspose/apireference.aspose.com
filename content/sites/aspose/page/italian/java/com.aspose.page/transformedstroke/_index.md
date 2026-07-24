---
title: "TransformedStroke"
second_title: "Aspose.Page per Java API Reference"
description: "Un tratto che contiene una trasformazione."
type: docs
weight: 17
url: /it/java/com.aspose.page/transformedstroke/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.awt.Stroke
```
public class TransformedStroke implements Stroke
```

Un tratto che contiene una trasformazione.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [TransformedStroke(Stroke base, AffineTransform at)](#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-) | Crea un TransformedStroke basato su un altro Stroke e su un AffineTransform. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [createStrokedShape(Shape s)](#createStrokedShape-java.awt.Shape-) | Traccia la Shape fornita con questo stroke, creando un contorno. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBaseStroke()](#getBaseStroke--) | Ottiene lo stroke di base. |
| [getClass()](#getClass--) |  |
| [getTransform()](#getTransform--) | Ottiene una trasformazione. |
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


Crea un TransformedStroke basato su un altro Stroke e su un AffineTransform.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| base | java.awt.Stroke | La base dello stroke. |
| at | java.awt.geom.AffineTransform | La trasformazione affine. |

### createStrokedShape(Shape s) {#createStrokedShape-java.awt.Shape-}
```
public Shape createStrokedShape(Shape s)
```


Traccia la Shape fornita con questo stroke, creando un contorno. Questo contorno è distorto dal nostro AffineTransform rispetto al contorno che sarebbe fornito dallo stroke di base, ma solo in termini di scala (cioè spessore delle linee), poiché la traslazione e la rotazione vengono annullate dopo il tracciamento.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| s | java.awt.Shape | Come shape da contornare. |

**Returns:**
java.awt.Shape - Un contorno della shape.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getBaseStroke() {#getBaseStroke--}
```
public Stroke getBaseStroke()
```


Ottiene lo stroke di base.

**Returns:**
java.awt.Stroke - Stroke di base.
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


Ottiene una trasformazione.

**Returns:**
java.awt.geom.AffineTransform - Una trasformazione.
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

