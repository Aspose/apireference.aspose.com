---
title: AxisValueTableFormat2
second_title: Aspose.Font for Java API Reference
description: Represents Axis value table format 2
type: docs
weight: 14
url: /java/com.aspose.font/axisvaluetableformat2/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.AxisValueTableBase](../../com.aspose.font/axisvaluetablebase)
```
public class AxisValueTableFormat2 extends AxisValueTableBase
```

Represents Axis value table format 2
## Constructors

| Constructor | Description |
| --- | --- |
| [AxisValueTableFormat2(int flags, int valueNameId, int axisIndex, float nominalValue, float rangeMinValue, float rangeMaxValue)](#AxisValueTableFormat2-int-int-int-float-float-float-) | Constructor |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisIndex()](#getAxisIndex--) | Gets the Zero-base index in the axis record array identifying the axis of design variation to which the axis value table applies. |
| [getClass()](#getClass--) |  |
| [getFlags()](#getFlags--) | Gets axis value table flags field. |
| [getFormat()](#getFormat--) | Gets format identifier (version number). |
| [getNominalValue()](#getNominalValue--) | A nominal numeric value |
| [getRangeMaxValue()](#getRangeMaxValue--) | The maximum value for a range associated with the specified name ID. |
| [getRangeMinValue()](#getRangeMinValue--) | The minimum value for a range associated with the specified name ID. |
| [getValueName()](#getValueName--) | Gets the name from the 'name' table that provide a display string for this attribute value. |
| [getValueNameId()](#getValueNameId--) | Gets the name ID for entries in the 'name' table that provide a display string for this attribute value. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AxisValueTableFormat2(int flags, int valueNameId, int axisIndex, float nominalValue, float rangeMinValue, float rangeMaxValue) {#AxisValueTableFormat2-int-int-int-float-float-float-}
```
public AxisValueTableFormat2(int flags, int valueNameId, int axisIndex, float nominalValue, float rangeMinValue, float rangeMaxValue)
```


Constructor

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| flags | int | Flags |
| valueNameId | int | The name ID for entries in the 'name' table that provide a display string for this attribute value |
| axisIndex | int | Spec: Zero-base index into the axis record array identifying the axis of design variation to which the axis value table applies. Must be less than designAxisCount. |
| nominalValue | float | The nominal numeric value for this attribute value. |
| rangeMinValue | float | The minimum value for a range associated with the specified name ID. |
| rangeMaxValue | float | The maximum value for a range associated with the specified name ID. |

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
### getAxisIndex() {#getAxisIndex--}
```
public int getAxisIndex()
```


Gets the Zero-base index in the axis record array identifying the axis of design variation to which the axis value table applies.

**Returns:**
int - The Zero-base index in the axis record array identifying the axis of design variation to which the axis value table applies.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFlags() {#getFlags--}
```
public int getFlags()
```


Gets axis value table flags field.

**Returns:**
int - The axis value table flags field.
### getFormat() {#getFormat--}
```
public int getFormat()
```


Gets format identifier (version number).

**Returns:**
int - The format identifier (version number).
### getNominalValue() {#getNominalValue--}
```
public float getNominalValue()
```


A nominal numeric value

**Returns:**
float - A nominal numeric value
### getRangeMaxValue() {#getRangeMaxValue--}
```
public float getRangeMaxValue()
```


The maximum value for a range associated with the specified name ID.

**Returns:**
float - The maximum value for a range associated with the specified name ID.
### getRangeMinValue() {#getRangeMinValue--}
```
public float getRangeMinValue()
```


The minimum value for a range associated with the specified name ID.

**Returns:**
float - The minimum value for a range associated with the specified name ID.
### getValueName() {#getValueName--}
```
public String getValueName()
```


Gets the name from the 'name' table that provide a display string for this attribute value.

**Returns:**
java.lang.String - The name from the 'name' table that provide a display string for this attribute value.
### getValueNameId() {#getValueNameId--}
```
public int getValueNameId()
```


Gets the name ID for entries in the 'name' table that provide a display string for this attribute value.

**Returns:**
int - The name ID for entries in the 'name' table that provide a display string for this attribute value.
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

