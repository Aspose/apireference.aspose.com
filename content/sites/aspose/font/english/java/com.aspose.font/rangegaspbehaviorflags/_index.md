---
title: RangeGaspBehaviorFlags
second_title: Aspose.Font for Java API Reference
description: Flags describing desired rasterizer behavior.
type: docs
weight: 141
url: /java/com.aspose.font/rangegaspbehaviorflags/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum RangeGaspBehaviorFlags extends Enum<RangeGaspBehaviorFlags>
```

Flags describing desired rasterizer behavior.
## Fields

| Field | Description |
| --- | --- |
| [GASP_DOGRAY](#GASP-DOGRAY) | Use grayscale rendering (0x0002). |
| [GASP_GRIDFIT](#GASP-GRIDFIT) | Use gridfitting (0x0001). |
| [GASP_SYMMETRIC_GRIDFIT](#GASP-SYMMETRIC-GRIDFIT) | Use gridfitting with ClearType symmetric smoothing (0x0004). |
| [GASP_SYMMETRIC_SMOOTHING](#GASP-SYMMETRIC-SMOOTHING) | Use smoothing along multiple axes with ClearType® (0x0008). |
| [Reserved](#Reserved) | Reserved flags - set to 0 (0xfff0). |
| [neither](#neither) | Optional for very large sizes, typically ppem > 2048 (0x0000). |
## Methods

| Method | Description |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [getFlags(int value)](#getFlags-int-) | Returns a set of flags corresponding to an integer value. |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toInteger(AsFoEnumSet<RangeGaspBehaviorFlags> flags)](#toInteger-com.aspose.font.util.AsFoEnumSet-com.aspose.font.RangeGaspBehaviorFlags--) | Returns the integer value corresponding to a set of flags. |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### GASP_DOGRAY {#GASP-DOGRAY}
```
public static final RangeGaspBehaviorFlags GASP_DOGRAY
```


Use grayscale rendering (0x0002).

### GASP_GRIDFIT {#GASP-GRIDFIT}
```
public static final RangeGaspBehaviorFlags GASP_GRIDFIT
```


Use gridfitting (0x0001).

### GASP_SYMMETRIC_GRIDFIT {#GASP-SYMMETRIC-GRIDFIT}
```
public static final RangeGaspBehaviorFlags GASP_SYMMETRIC_GRIDFIT
```


Use gridfitting with ClearType symmetric smoothing (0x0004). Only supported in version 1 'gasp'.

### GASP_SYMMETRIC_SMOOTHING {#GASP-SYMMETRIC-SMOOTHING}
```
public static final RangeGaspBehaviorFlags GASP_SYMMETRIC_SMOOTHING
```


Use smoothing along multiple axes with ClearType® (0x0008). Only supported in version 1 'gasp'.

### Reserved {#Reserved}
```
public static final RangeGaspBehaviorFlags Reserved
```


Reserved flags - set to 0 (0xfff0).

### neither {#neither}
```
public static final RangeGaspBehaviorFlags neither
```


Optional for very large sizes, typically ppem > 2048 (0x0000).

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
### getFlags(int value) {#getFlags-int-}
```
public static AsFoEnumSet<RangeGaspBehaviorFlags> getFlags(int value)
```


Returns a set of flags corresponding to an integer value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The integer value. |

**Returns:**
[AsFoEnumSet](../../com.aspose.font.util/asfoenumset) - The set of flags corresponding to the integer value.
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
### toInteger(AsFoEnumSet<RangeGaspBehaviorFlags> flags) {#toInteger-com.aspose.font.util.AsFoEnumSet-com.aspose.font.RangeGaspBehaviorFlags--}
```
public static int toInteger(AsFoEnumSet<RangeGaspBehaviorFlags> flags)
```


Returns the integer value corresponding to a set of flags.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| flags | com.aspose.font.util.AsFoEnumSet<com.aspose.font.RangeGaspBehaviorFlags> | A set of flags. |

**Returns:**
int - The integer value corresponding to a set of flags.
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static RangeGaspBehaviorFlags valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[RangeGaspBehaviorFlags](../../com.aspose.font/rangegaspbehaviorflags)
### values() {#values--}
```
public static RangeGaspBehaviorFlags[] values()
```




**Returns:**
com.aspose.font.RangeGaspBehaviorFlags[]
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
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

