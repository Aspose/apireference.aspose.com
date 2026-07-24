---
title: "XpsTransformableBrush"
second_title: "Aspose.Page för Java API-referens"
description: "Klass som kapslar in gemensamma egenskaper för transformabla penselelement, alla utom SolidColorBrush."
type: docs
weight: 52
url: /sv/java/com.aspose.xps/xpstransformablebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush)

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public abstract class XpsTransformableBrush extends XpsBrush implements ITransformableProperty
```

Klass som kapslar in gemensamma egenskaper för transformabla penselselement (alla förutom SolidColorBrush).
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | Returnerar värdet som definierar den enhetliga transparensen för penselfyllningen. |
| [getTransform()](#getTransform--) | Returnerar matrisomvandlingen som tillämpas på penselns koordinatrymd. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Sätter värdet som definierar den enhetliga transparensen för penselfyllningen. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Ställer in matrisomvandlingen som tillämpas på penselns koordinatrymd. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Returnerar värdet som definierar den enhetliga transparensen för penselfyllningen.

**Returns:**
float - Värde som definierar den enhetliga transparensen för penselfyllningen.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Returnerar matrisomvandlingen som tillämpas på penselns koordinatrymd. Transform‑egenskapen konkateneras med den aktuella effektiva renderingsomvandlingen för att ge en effektiv renderingsomvandling lokal för penseln. Visningsytan för penseln transformeras med den lokala effektiva renderingsomvandlingen.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
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




### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Sätter värdet som definierar den enhetliga transparensen för penselfyllningen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | float | Värde som definierar den enhetliga transparensen för penselfyllningen. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Ställer in matrisomvandlingen som tillämpas på penselns koordinatrymd. Transform‑egenskapen konkateneras med den aktuella effektiva renderingsomvandlingen för att ge en effektiv renderingsomvandling lokal för penseln. Visningsytan för penseln transformeras med den lokala effektiva renderingsomvandlingen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Matrisomvandlingen som tillämpas på penselns koordinatrymd. |

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

