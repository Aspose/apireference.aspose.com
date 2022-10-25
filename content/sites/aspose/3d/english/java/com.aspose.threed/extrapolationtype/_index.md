---
title: ExtrapolationType
second_title: Aspose.3D for Java API Reference
description: Extrapolation type.
type: docs
weight: 249
url: /java/com.aspose.threed/extrapolationtype/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum ExtrapolationType extends Enum<ExtrapolationType>
```

Extrapolation type.
## Fields

| Field | Description |
| --- | --- |
| [CONSTANT](#CONSTANT) | Value will keep the same value of the last value |
| [GRADIENT](#GRADIENT) | Value will keep the same slope by time |
| [CYCLE](#CYCLE) | The repetition. |
| [CYCLE_RELATIVE](#CYCLE-RELATIVE) | Repeat the previous pattern based on the last value |
| [OSCILLATE](#OSCILLATE) | The mirror repetition. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### CONSTANT {#CONSTANT}
```
public static final ExtrapolationType CONSTANT
```


Value will keep the same value of the last value

### GRADIENT {#GRADIENT}
```
public static final ExtrapolationType GRADIENT
```


Value will keep the same slope by time

### CYCLE {#CYCLE}
```
public static final ExtrapolationType CYCLE
```


The repetition.

### CYCLE_RELATIVE {#CYCLE-RELATIVE}
```
public static final ExtrapolationType CYCLE_RELATIVE
```


Repeat the previous pattern based on the last value

### OSCILLATE {#OSCILLATE}
```
public static final ExtrapolationType OSCILLATE
```


The mirror repetition.

### values() {#values--}
```
public static ExtrapolationType[] values()
```




**Returns:**
com.aspose.threed.ExtrapolationType[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static ExtrapolationType valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[ExtrapolationType](../../com.aspose.threed/extrapolationtype)
