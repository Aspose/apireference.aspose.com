---
title: "XpsTransformableBrush"
second_title: "Aspose.Page for Java API-Referenz"
description: "Klasse, die gemeinsame Merkmale von transformierbaren Pinsel-Elementen kapselt, alle außer SolidColorBrush."
type: docs
weight: 52
url: /de/java/com.aspose.xps/xpstransformablebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush)

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public abstract class XpsTransformableBrush extends XpsBrush implements ITransformableProperty
```

Klasse, die gemeinsame Merkmale von transformierbaren Pinsel-Elementen (alle außer SolidColorBrush) kapselt.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | Gibt den Wert zurück, der die einheitliche Transparenz der Pinselfüllung definiert. |
| [getTransform()](#getTransform--) | Gibt die Matrixtransformation zurück, die auf den Koordinatenraum des Pinsels angewendet wird. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Setzt den Wert, der die einheitliche Transparenz der Pinselfüllung definiert. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Setzt die Matrixtransformation, die auf den Koordinatenraum des Pinsels angewendet wird. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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


Gibt den Wert zurück, der die einheitliche Transparenz der Pinselfüllung definiert.

**Returns:**
float – Wert, der die einheitliche Transparenz der Pinselfüllung definiert.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Gibt die Matrixtransformation zurück, die auf den Koordinatenraum des Pinsels angewendet wird. Die Transform‑Eigenschaft wird mit der aktuellen effektiven Rendering‑Transformation verkettet, um eine effektive Rendering‑Transformation zu erzeugen, die lokal für den Pinsel gilt. Der Ansichtsbereich für den Pinsel wird mithilfe der lokalen effektiven Rendering‑Transformation transformiert.

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


Setzt den Wert, der die einheitliche Transparenz der Pinselfüllung definiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Wert, der die einheitliche Transparenz der Pinselfüllung definiert. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Setzt die Matrixtransformation, die auf den Koordinatenraum des Pinsels angewendet wird. Die Transform‑Eigenschaft wird mit der aktuellen effektiven Rendering‑Transformation verkettet, um eine effektive Rendering‑Transformation zu erzeugen, die lokal für den Pinsel gilt. Der Ansichtsbereich für den Pinsel wird mithilfe der lokalen effektiven Rendering‑Transformation transformiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Die Matrixtransformation, die auf den Koordinatenraum des Pinsels angewendet wird. |

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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

