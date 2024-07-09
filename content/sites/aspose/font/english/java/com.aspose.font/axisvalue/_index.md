---
title: AxisValue
second_title: Aspose.Font for Java API Reference
description: Represents AxisValue record.
type: docs
weight: 11
url: /java/com.aspose.font/axisvalue/
---
**Inheritance:**
java.lang.Object
```
public class AxisValue
```

Represents AxisValue record.
## Constructors

| Constructor | Description |
| --- | --- |
| [AxisValue(int axisIndex, float value)](#AxisValue-int-float-) | Constructor |
## Methods

| Method | Description |
| --- | --- |
| [getAxisIndex()](#getAxisIndex--) | Gets axisIndex field. |
| [getValue()](#getValue--) | Gets a numeric value for this attribute value. |
### AxisValue(int axisIndex, float value) {#AxisValue-int-float-}
```
public AxisValue(int axisIndex, float value)
```


Constructor

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| axisIndex | int | Zero-base index into the axis record array identifying the axis to which this value applies. Must be less than designAxisCount. |
| value | float | The numeric value for this attribute value. |

### getAxisIndex() {#getAxisIndex--}
```
public int getAxisIndex()
```


Gets axisIndex field. Spec: Zero-base index into the axis record array identifying the axis to which this value applies. Must be less than designAxisCount.

**Returns:**
int - The axisIndex field.
### getValue() {#getValue--}
```
public float getValue()
```


Gets a numeric value for this attribute value.

**Returns:**
float - A numeric value for this attribute value.
