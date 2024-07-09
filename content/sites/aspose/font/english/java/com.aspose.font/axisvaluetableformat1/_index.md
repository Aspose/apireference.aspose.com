---
title: TtfStatTable.AxisValueTableFormat1
second_title: Aspose.Font for Java API Reference
description: Represents Axis value table format 1
type: docs
weight: 13
url: /java/com.aspose.font/ttfstattable.axisvaluetableformat1/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfStatTable.AxisValueTableBase](../../com.aspose.font/axisvaluetablebase)
```
public static class TtfStatTable.AxisValueTableFormat1 extends TtfStatTable.AxisValueTableBase
```

Represents Axis value table format 1
## Constructors

| Constructor | Description |
| --- | --- |
| [AxisValueTableFormat1(int flags, int valueNameId, int axisIndex, float value)](#AxisValueTableFormat1-int-int-int-float-) | Constructor |
## Methods

| Method | Description |
| --- | --- |
| [getAxisIndex()](#getAxisIndex--) | Gets Zero-base index into the axis record array identifying the axis of design variation to which the axis value table applies. |
| [getValue()](#getValue--) | The numeric value for this attribute value. |
### AxisValueTableFormat1(int flags, int valueNameId, int axisIndex, float value) {#AxisValueTableFormat1-int-int-int-float-}
```
public AxisValueTableFormat1(int flags, int valueNameId, int axisIndex, float value)
```


Constructor

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| flags | int | Flags |
| valueNameId | int | The name ID for entries in the 'name' table that provide a display string for this attribute value |
| axisIndex | int | Spec: Zero-base index into the axis record array identifying the axis of design variation to which the axis value table applies. Must be less than designAxisCount. |
| value | float | The numeric value for this attribute value. |

### getAxisIndex() {#getAxisIndex--}
```
public int getAxisIndex()
```


Gets Zero-base index into the axis record array identifying the axis of design variation to which the axis value table applies.

**Returns:**
int - Zero-base index into the axis record array identifying the axis of design variation to which the axis value table applies.
### getValue() {#getValue--}
```
public float getValue()
```


The numeric value for this attribute value.

**Returns:**
float - The numeric value for this attribute value.
