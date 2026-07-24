---
title: "XpsGradientStop"
second_title: "Aspose.Page for Java API-Referenz"
description: "Klasse, die die Merkmale des GradientStop-Elements kapselt."
type: docs
weight: 27
url: /de/java/com.aspose.xps/xpsgradientstop/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsGradientStop extends XpsObject
```

Klasse, die die Eigenschaften des GradientStop-Elements kapselt. Dieses Element wird sowohl von den LinearGradientBrush- als auch von den RadialGradientBrush-Elementen verwendet, um den Ort und den Bereich der Farbabstufung für die Darstellung eines Farbverlaufs zu definieren.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [deepClone()](#deepClone--) | Klonen dieses GradientStop. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColor()](#getColor--) | Gibt die Farbe des GradientStop zurück. |
| [getOffset()](#getOffset--) | Gibt den Gradientversatz zurück. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGradientStop deepClone()
```


Klonen dieses GradientStop.

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - Clone of this gradient stop.
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
### getColor() {#getColor--}
```
public XpsColor getColor()
```


Gibt die Farbe des GradientStop zurück.

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - The gradient stop color.
### getOffset() {#getOffset--}
```
public float getOffset()
```


Gibt den Gradientversatz zurück. Der Versatz gibt einen Punkt entlang des Verlaufs an, an dem eine Farbe festgelegt ist. Farben zwischen den Gradientversätzen im Verlauf werden interpoliert.

**Returns:**
float – Der Gradientversatz.
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

