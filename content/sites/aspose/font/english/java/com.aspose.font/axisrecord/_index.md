---
title: AxisRecord
second_title: Aspose.Font for Java API Reference
description: Represents Axis Record structure.
type: docs
weight: 10
url: /java/com.aspose.font/axisrecord/
---
**Inheritance:**
java.lang.Object
```
public class AxisRecord
```

Represents Axis Record structure. Spec: the axis record provides information about a single design axis.
## Constructors

| Constructor | Description |
| --- | --- |
| [AxisRecord(String tag, int axisNameId, int axisOrdering)](#AxisRecord-java.lang.String-int-int-) | Constructor |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisNameId()](#getAxisNameId--) | Returns axisNameID field. |
| [getAxisOrdering()](#getAxisOrdering--) | Returns axisOrdering field. |
| [getClass()](#getClass--) |  |
| [getTag()](#getTag--) | Returns a tag identifying the axis of design variation. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AxisRecord(String tag, int axisNameId, int axisOrdering) {#AxisRecord-java.lang.String-int-int-}
```
public AxisRecord(String tag, int axisNameId, int axisOrdering)
```


Constructor

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| tag | java.lang.String | Tag, spec: A tag identifying the axis of design variation |
| axisNameId | int | The name ID for entries in the 'name' table that provide a display string for this axis |
| axisOrdering | int | The value that applications can use to determine primary sorting of face names, or for ordering of labels when composing family or face names. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAxisNameId() {#getAxisNameId--}
```
public int getAxisNameId()
```


Returns axisNameID field. Spec: The axisNameID field provides a name ID that can be used to obtain strings from the 'name' table that can be used to refer to the axis in application user interfaces.

**Returns:**
int - The axisNameID field.
### getAxisOrdering() {#getAxisOrdering--}
```
public int getAxisOrdering()
```


Returns axisOrdering field. Spec:A value that applications can use to determine primary sorting of face names, or for ordering of labels when composing family or face names.

**Returns:**
int - The axisOrdering field.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getTag() {#getTag--}
```
public String getTag()
```


Returns a tag identifying the axis of design variation. Spec: Each axis record has a tag designating the axis. Tag values must follow the rules for axis tags described in the OpenType Design-Variation Axis Tag Registry.

**Returns:**
java.lang.String - A tag identifying the axis of design variation.
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

