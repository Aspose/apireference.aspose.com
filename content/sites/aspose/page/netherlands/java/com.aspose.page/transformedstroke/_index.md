---
title: "TransformedStroke"
second_title: "Aspose.Page voor Java API-referentie"
description: "Een stroke die een transformatie bevat."
type: docs
weight: 17
url: /nl/java/com.aspose.page/transformedstroke/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.awt.Stroke
```
public class TransformedStroke implements Stroke
```

Een stroke die een transformatie bevat.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [TransformedStroke(Stroke base, AffineTransform at)](#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-) | Maakt een TransformedStroke op basis van een andere Stroke en een AffineTransform. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [createStrokedShape(Shape s)](#createStrokedShape-java.awt.Shape-) | Tekent de opgegeven Shape met deze stroke, waardoor een omtrek ontstaat. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBaseStroke()](#getBaseStroke--) | Haalt de basisstroke op. |
| [getClass()](#getClass--) |  |
| [getTransform()](#getTransform--) | Haalt een transformatie op. |
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


Maakt een TransformedStroke op basis van een andere Stroke en een AffineTransform.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| base | java.awt.Stroke | De basis van de stroke. |
| at | java.awt.geom.AffineTransform | De affine transformatie. |

### createStrokedShape(Shape s) {#createStrokedShape-java.awt.Shape-}
```
public Shape createStrokedShape(Shape s)
```


Tekent de opgegeven Shape met deze stroke, waardoor een omtrek ontstaat. Deze omtrek wordt vervormd door onze AffineTransform ten opzichte van de omtrek die zou worden gegeven door de basis‑stroke, maar alleen wat betreft schalen (d.w.z. de dikte van de lijnen), aangezien translatie en rotatie na het tekenen worden ongedaan gemaakt.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | java.awt.Shape | Als vorm die moet worden omranden. |

**Returns:**
java.awt.Shape - Een omtrek van de vorm.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getBaseStroke() {#getBaseStroke--}
```
public Stroke getBaseStroke()
```


Haalt de basisstroke op.

**Returns:**
java.awt.Stroke - Basisstroke.
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


Haalt een transformatie op.

**Returns:**
java.awt.geom.AffineTransform - Een transformatie.
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

