---
title: StencilAction
second_title: Aspose.3D for Java API Reference
description: The stencil test actions
type: docs
weight: 274
url: /java/com.aspose.threed/stencilaction/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum StencilAction extends Enum<StencilAction>
```

The stencil test actions
## Fields

| Field | Description |
| --- | --- |
| [KEEP](#KEEP) | Keep the current value |
| [ZERO](#ZERO) | Sets the stencil buffer value to 0 |
| [REPLACE](#REPLACE) | Sets the stencil buffer to ref where defined in com.aspose.threed.RenderState\#getStencilReference |
| [INCREMENT](#INCREMENT) | Increments the current stencil buffer value, clamps to maximum value. |
| [INCREMENT_WRAP](#INCREMENT-WRAP) | Increments the current stencil buffer value and wrap it to zero when it reaches maximum value. |
| [DECREMENT](#DECREMENT) | Increments the current stencil buffer value, clamps to 0. |
| [DECREMENT_WRAP](#DECREMENT-WRAP) | Decrements the current stencil buffer value and wrap it to maximum value when it reaches zero. |
| [INVERT](#INVERT) | Bit-wise inverts the current stencil buffer value. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### KEEP {#KEEP}
```
public static final StencilAction KEEP
```


Keep the current value

### ZERO {#ZERO}
```
public static final StencilAction ZERO
```


Sets the stencil buffer value to 0

### REPLACE {#REPLACE}
```
public static final StencilAction REPLACE
```


Sets the stencil buffer to ref where defined in com.aspose.threed.RenderState\#getStencilReference

### INCREMENT {#INCREMENT}
```
public static final StencilAction INCREMENT
```


Increments the current stencil buffer value, clamps to maximum value.

### INCREMENT_WRAP {#INCREMENT-WRAP}
```
public static final StencilAction INCREMENT_WRAP
```


Increments the current stencil buffer value and wrap it to zero when it reaches maximum value.

### DECREMENT {#DECREMENT}
```
public static final StencilAction DECREMENT
```


Increments the current stencil buffer value, clamps to 0.

### DECREMENT_WRAP {#DECREMENT-WRAP}
```
public static final StencilAction DECREMENT_WRAP
```


Decrements the current stencil buffer value and wrap it to maximum value when it reaches zero.

### INVERT {#INVERT}
```
public static final StencilAction INVERT
```


Bit-wise inverts the current stencil buffer value.

### values() {#values--}
```
public static StencilAction[] values()
```




**Returns:**
com.aspose.threed.StencilAction[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static StencilAction valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[StencilAction](../../com.aspose.threed/stencilaction)
