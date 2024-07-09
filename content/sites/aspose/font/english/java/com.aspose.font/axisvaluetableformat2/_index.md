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
| [getAxisIndex()](#getAxisIndex--) | Gets the Zero-base index in the axis record array identifying the axis of design variation to which the axis value table applies. |
| [getNominalValue()](#getNominalValue--) | A nominal numeric value |
| [getRangeMinValue()](#getRangeMinValue--) | The minimum value for a range associated with the specified name ID. |
| [getRangeMaxValue()](#getRangeMaxValue--) | The maximum value for a range associated with the specified name ID. |
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

### getAxisIndex() {#getAxisIndex--}
```
public int getAxisIndex()
```


Gets the Zero-base index in the axis record array identifying the axis of design variation to which the axis value table applies.

**Returns:**
int - The Zero-base index in the axis record array identifying the axis of design variation to which the axis value table applies.
### getNominalValue() {#getNominalValue--}
```
public float getNominalValue()
```


A nominal numeric value

**Returns:**
float - A nominal numeric value
### getRangeMinValue() {#getRangeMinValue--}
```
public float getRangeMinValue()
```


The minimum value for a range associated with the specified name ID.

**Returns:**
float - The minimum value for a range associated with the specified name ID.
### getRangeMaxValue() {#getRangeMaxValue--}
```
public float getRangeMaxValue()
```


The maximum value for a range associated with the specified name ID.

**Returns:**
float - The maximum value for a range associated with the specified name ID.
