---
title: CompareFunction
second_title: Aspose.3D for Java API Reference
description: The compare function used in depth/stencil testing.
type: docs
weight: 242
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
| [NEVER](#NEVER) | Never passes |
| [LESS](#LESS) | Pass if the incoming value is less than the stored value. |
| [EQUAL](#EQUAL) | Pass if the incoming value is equal to the stored value. |
| [L_EQUAL](#L-EQUAL) | Pass if the incoming value is less than or equal to the stored value. |
| [GREATER](#GREATER) | Pass if the incoming value is greater than the stored value. |
| [NOT_EQUAL](#NOT-EQUAL) | Pass if the incoming value is not equal to the stored value. |
| [G_EQUAL](#G-EQUAL) | Pass if the incoming value is greater than or equal to the stored value. |
| [ALWAYS](#ALWAYS) | Always passes |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### NEVER {#NEVER}
```
public static final CompareFunction NEVER
```


Never passes

### LESS {#LESS}
```
public static final CompareFunction LESS
```


Pass if the incoming value is less than the stored value.

### EQUAL {#EQUAL}
```
public static final CompareFunction EQUAL
```


Pass if the incoming value is equal to the stored value.

### L_EQUAL {#L-EQUAL}
```
public static final CompareFunction L_EQUAL
```


Pass if the incoming value is less than or equal to the stored value.

### GREATER {#GREATER}
```
public static final CompareFunction GREATER
```


Pass if the incoming value is greater than the stored value.

### NOT_EQUAL {#NOT-EQUAL}
```
public static final CompareFunction NOT_EQUAL
```


Pass if the incoming value is not equal to the stored value.

### G_EQUAL {#G-EQUAL}
```
public static final CompareFunction G_EQUAL
```


Pass if the incoming value is greater than or equal to the stored value.

### ALWAYS {#ALWAYS}
```
public static final CompareFunction ALWAYS
```


Always passes

### values() {#values--}
```
public static CompareFunction[] values()
```




**Returns:**
com.aspose.threed.CompareFunction[]
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
