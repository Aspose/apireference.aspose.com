---
title: StencilAction
second_title: Aspose.3D for Java API Reference
description: The stencil test actions
type: docs
weight: 298
url: /java/com.aspose.threed/stencilaction/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum StencilAction extends Enum<StencilAction>
```

The stencil test actions
## Fields

| Field | Description |
| --- | --- |
| [DECREMENT](#DECREMENT) | Increments the current stencil buffer value, clamps to 0. |
| [DECREMENT_WRAP](#DECREMENT-WRAP) | Decrements the current stencil buffer value and wrap it to maximum value when it reaches zero. |
| [INCREMENT](#INCREMENT) | Increments the current stencil buffer value, clamps to maximum value. |
| [INCREMENT_WRAP](#INCREMENT-WRAP) | Increments the current stencil buffer value and wrap it to zero when it reaches maximum value. |
| [INVERT](#INVERT) | Bit-wise inverts the current stencil buffer value. |
| [KEEP](#KEEP) | Keep the current value |
| [REPLACE](#REPLACE) | Sets the stencil buffer to ref where defined in [RenderState.getStencilReference](../../com.aspose.threed/renderstate\#getStencilReference) |
| [ZERO](#ZERO) | Sets the stencil buffer value to 0 |
## Methods

| Method | Description |
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


Increments the current stencil buffer value, clamps to 0.

### DECREMENT_WRAP {#DECREMENT-WRAP}
```
public static final StencilAction DECREMENT_WRAP
```


Decrements the current stencil buffer value and wrap it to maximum value when it reaches zero.

### INCREMENT {#INCREMENT}
```
public static final StencilAction INCREMENT
```


Increments the current stencil buffer value, clamps to maximum value.

### INCREMENT_WRAP {#INCREMENT-WRAP}
```
public static final StencilAction INCREMENT_WRAP
```


Increments the current stencil buffer value and wrap it to zero when it reaches maximum value.

### INVERT {#INVERT}
```
public static final StencilAction INVERT
```


Bit-wise inverts the current stencil buffer value.

### KEEP {#KEEP}
```
public static final StencilAction KEEP
```


Keep the current value

### REPLACE {#REPLACE}
```
public static final StencilAction REPLACE
```


Sets the stencil buffer to ref where defined in [RenderState.getStencilReference](../../com.aspose.threed/renderstate\#getStencilReference)

### ZERO {#ZERO}
```
public static final StencilAction ZERO
```


Sets the stencil buffer value to 0

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

