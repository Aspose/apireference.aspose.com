---
title: TtfStatTable.AxisValueTableFormat3
second_title: Aspose.Font for Java API Reference
description: Represents Axis value table format 3
type: docs
weight: 15
url: /java/com.aspose.font/ttfstattable.axisvaluetableformat3/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfStatTable.AxisValueTableBase](../../com.aspose.font/axisvaluetablebase)
```
public static class TtfStatTable.AxisValueTableFormat3 extends TtfStatTable.AxisValueTableBase
```

Represents Axis value table format 3
## Constructors

| Constructor | Description |
| --- | --- |
| [AxisValueTableFormat3(int flags, int valueNameId, int axisIndex, float value, float linkedValue)](#AxisValueTableFormat3-int-int-int-float-float-) | Constructor |
## Methods

| Method | Description |
| --- | --- |
| [getAxisIndex()](#getAxisIndex--) | Gets Zero-base index into the axis record array identifying the axis of design variation to which the axis value table applies. |
| [getValue()](#getValue--) | The numeric value for this attribute value. |
| [getLinkedValue()](#getLinkedValue--) | The numeric value for a style-linked mapping from this value. |
### AxisValueTableFormat3(int flags, int valueNameId, int axisIndex, float value, float linkedValue) {#AxisValueTableFormat3-int-int-int-float-float-}
```
public AxisValueTableFormat3(int flags, int valueNameId, int axisIndex, float value, float linkedValue)
```


Constructor

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| flags | int | Flags |
| valueNameId | int | The name ID for entries in the 'name' table that provide a display string for this attribute value |
| axisIndex | int | Spec: Zero-base index into the axis record array identifying the axis of design variation to which the axis value table applies. Must be less than designAxisCount. |
| value | float | The numeric value for this attribute value. |
| linkedValue | float | The numeric value for a style-linked mapping from this value. |

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
### getLinkedValue() {#getLinkedValue--}
```
public float getLinkedValue()
```


The numeric value for a style-linked mapping from this value.

**Returns:**
float - The numeric value for a style-linked mapping from this value.
