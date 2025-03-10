---
title: CompareFunction
second_title: Aspose.3D for Java API Reference
description: The compare function used in depth/stencil testing.
type: docs
weight: 266
url: /java/com.aspose.threed/comparefunction/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum CompareFunction extends Enum<CompareFunction>
```

The compare function used in depth/stencil testing.
## Fields

| Field | Description |
| --- | --- |
| [ALWAYS](#ALWAYS) | Always passes |
| [EQUAL](#EQUAL) | Pass if the incoming value is equal to the stored value. |
| [GREATER](#GREATER) | Pass if the incoming value is greater than the stored value. |
| [G_EQUAL](#G-EQUAL) | Pass if the incoming value is greater than or equal to the stored value. |
| [LESS](#LESS) | Pass if the incoming value is less than the stored value. |
| [L_EQUAL](#L-EQUAL) | Pass if the incoming value is less than or equal to the stored value. |
| [NEVER](#NEVER) | Never passes |
| [NOT_EQUAL](#NOT-EQUAL) | Pass if the incoming value is not equal to the stored value. |
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
### ALWAYS {#ALWAYS}
```
public static final CompareFunction ALWAYS
```


Always passes

### EQUAL {#EQUAL}
```
public static final CompareFunction EQUAL
```


Pass if the incoming value is equal to the stored value.

### GREATER {#GREATER}
```
public static final CompareFunction GREATER
```


Pass if the incoming value is greater than the stored value.

### G_EQUAL {#G-EQUAL}
```
public static final CompareFunction G_EQUAL
```


Pass if the incoming value is greater than or equal to the stored value.

### LESS {#LESS}
```
public static final CompareFunction LESS
```


Pass if the incoming value is less than the stored value.

### L_EQUAL {#L-EQUAL}
```
public static final CompareFunction L_EQUAL
```


Pass if the incoming value is less than or equal to the stored value.

### NEVER {#NEVER}
```
public static final CompareFunction NEVER
```


Never passes

### NOT_EQUAL {#NOT-EQUAL}
```
public static final CompareFunction NOT_EQUAL
```


Pass if the incoming value is not equal to the stored value.

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
public static CompareFunction valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[CompareFunction](../../com.aspose.threed/comparefunction)
### values() {#values--}
```
public static CompareFunction[] values()
```




**Returns:**
com.aspose.threed.CompareFunction[]
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

