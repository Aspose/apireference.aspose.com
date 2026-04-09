---
title: StencilAction
second_title: Aspose.3D für Java API-Referenz
description: Die Stencil-Testaktionen
type: docs
weight: 303
url: /de/java/com.aspose.threed/stencilaction/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum StencilAction extends Enum<StencilAction>
```

Die Stencil-Testaktionen
## Felder

| Feld | Beschreibung |
| --- | --- |
| [DECREMENT](#DECREMENT) | Erhöht den aktuellen Stencil-Pufferwert und begrenzt ihn auf 0. |
| [DECREMENT_WRAP](#DECREMENT-WRAP) | Verringert den aktuellen Stencil-Pufferwert und wickelt ihn auf den Maximalwert zurück, wenn er null erreicht. |
| [INCREMENT](#INCREMENT) | Erhöht den aktuellen Stencil-Pufferwert und begrenzt ihn auf den Maximalwert. |
| [INCREMENT_WRAP](#INCREMENT-WRAP) | Erhöht den aktuellen Stencil-Pufferwert und wickelt ihn auf null zurück, wenn er den Maximalwert erreicht. |
| [INVERT](#INVERT) | Invertiert den aktuellen Stencil-Pufferwert bitweise. |
| [KEEP](#KEEP) | Behalte den aktuellen Wert |
| [REPLACE](#REPLACE) | Setzt den Stencil-Puffer auf ref, wie in [RenderState.getStencilReference](../../com.aspose.threed/renderstate\#getStencilReference) definiert. |
| [ZERO](#ZERO) | Setzt den Stencil-Pufferwert auf 0 |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DECREMENT {#DECREMENT}
```
public static final StencilAction DECREMENT
```


Erhöht den aktuellen Stencil-Pufferwert und begrenzt ihn auf 0.

### DECREMENT_WRAP {#DECREMENT-WRAP}
```
public static final StencilAction DECREMENT_WRAP
```


Verringert den aktuellen Stencil-Pufferwert und wickelt ihn auf den Maximalwert zurück, wenn er null erreicht.

### INCREMENT {#INCREMENT}
```
public static final StencilAction INCREMENT
```


Erhöht den aktuellen Stencil-Pufferwert und begrenzt ihn auf den Maximalwert.

### INCREMENT_WRAP {#INCREMENT-WRAP}
```
public static final StencilAction INCREMENT_WRAP
```


Erhöht den aktuellen Stencil-Pufferwert und wickelt ihn auf null zurück, wenn er den Maximalwert erreicht.

### INVERT {#INVERT}
```
public static final StencilAction INVERT
```


Invertiert den aktuellen Stencil-Pufferwert bitweise.

### KEEP {#KEEP}
```
public static final StencilAction KEEP
```


Behalte den aktuellen Wert

### REPLACE {#REPLACE}
```
public static final StencilAction REPLACE
```


Setzt den Stencil-Puffer auf ref, wie in [RenderState.getStencilReference](../../com.aspose.threed/renderstate\#getStencilReference) definiert.

### ZERO {#ZERO}
```
public static final StencilAction ZERO
```


Setzt den Stencil-Pufferwert auf 0

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static StencilAction valueOf(String name)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String |  |

**Returns:**
[StencilAction](../../com.aspose.threed/stencilaction)
### values() {#values--}
```
public static StencilAction[] values()
```




**Returns:**
com.aspose.threed.StencilAction[]
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
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

