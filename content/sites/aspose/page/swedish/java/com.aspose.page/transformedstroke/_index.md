---
title: "TransformedStroke"
second_title: "Aspose.Page för Java API-referens"
description: "Ett stroke som innehåller transformation."
type: docs
weight: 17
url: /sv/java/com.aspose.page/transformedstroke/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.awt.Stroke
```
public class TransformedStroke implements Stroke
```

Ett stroke som innehåller transformation.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [TransformedStroke(Stroke base, AffineTransform at)](#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-) | Skapar en TransformedStroke baserad på en annan Stroke och en AffineTransform. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [createStrokedShape(Shape s)](#createStrokedShape-java.awt.Shape-) | Ritar den givna Shape med detta stroke och skapar en kontur. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBaseStroke()](#getBaseStroke--) | Hämtar grundläggande stroke. |
| [getClass()](#getClass--) |  |
| [getTransform()](#getTransform--) | Hämtar en transformation. |
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


Skapar en TransformedStroke baserad på en annan Stroke och en AffineTransform.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| bas | java.awt.Stroke | Stroke-bas. |
| vid | java.awt.geom.AffineTransform | Den affina transformationen. |

### createStrokedShape(Shape s) {#createStrokedShape-java.awt.Shape-}
```
public Shape createStrokedShape(Shape s)
```


Ritar den givna Shape med detta streck och skapar en kontur. Denna kontur förvrängs av vår AffineTransform i förhållande till den kontur som skulle ges av basstrecket, men endast vad gäller skalning (dvs. linjernas tjocklek), eftersom förflyttning och rotation återställs efter streckningen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| s | java.awt.Shape | Som shape som ska kontureras. |

**Returns:**
java.awt.Shape - En kontur av shape.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getBaseStroke() {#getBaseStroke--}
```
public Stroke getBaseStroke()
```


Hämtar grundläggande stroke.

**Returns:**
java.awt.Stroke - Grundläggande streck.
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


Hämtar en transformation.

**Returns:**
java.awt.geom.AffineTransform - En transformation.
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

