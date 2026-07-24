---
title: "TransformedStroke"
second_title: "Référence API Aspose.Page pour Java"
description: "Un trait qui contient une transformation."
type: docs
weight: 17
url: /fr/java/com.aspose.page/transformedstroke/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.awt.Stroke
```
public class TransformedStroke implements Stroke
```

Un trait qui contient une transformation.
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [TransformedStroke(Stroke base, AffineTransform at)](#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-) | Crée un TransformedStroke basé sur un autre Stroke et un AffineTransform. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [createStrokedShape(Shape s)](#createStrokedShape-java.awt.Shape-) | Trace le Shape donné avec ce stroke, créant un contour. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBaseStroke()](#getBaseStroke--) | Obtient le stroke de base. |
| [getClass()](#getClass--) |  |
| [getTransform()](#getTransform--) | Obtient une transformation. |
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


Crée un TransformedStroke basé sur un autre Stroke et un AffineTransform.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| base | java.awt.Stroke | Le stroke de base. |
| à | java.awt.geom.AffineTransform | La transformation affine. |

### createStrokedShape(Shape s) {#createStrokedShape-java.awt.Shape-}
```
public Shape createStrokedShape(Shape s)
```


Trace le Shape donné avec ce stroke, créant un contour. Ce contour est déformé par notre AffineTransform par rapport au contour qui serait fourni par le base stroke, mais uniquement en termes d'échelle (c’est‑à‑dire l'épaisseur des lignes), car la translation et la rotation sont annulées après le traçage.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| s | java.awt.Shape | Comme shape à tracer. |

**Returns:**
java.awt.Shape - Un contour du shape.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getBaseStroke() {#getBaseStroke--}
```
public Stroke getBaseStroke()
```


Obtient le stroke de base.

**Returns:**
java.awt.Stroke - Stroke de base.
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


Obtient une transformation.

**Returns:**
java.awt.geom.AffineTransform - Une transformation.
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

