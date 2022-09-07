---
title: BlendFactor
second_title: Aspose.3D for Java API Reference
description: Blend factor specify pixel arithmetic.
type: docs
weight: 239
url: /java/com.aspose.threed/blendfactor/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum BlendFactor extends Enum<BlendFactor>
```

Blend factor specify pixel arithmetic.
## Fields

| Field | Description |
| --- | --- |
| [ZERO](#ZERO) | The blend factor is vec4(0) |
| [ONE](#ONE) | The blend factor is vec4(1) |
| [SRC_COLOR](#SRC-COLOR) | The blend factor is src.rgba |
| [ONE_MINUS_SRC_COLOR](#ONE-MINUS-SRC-COLOR) | The blend factor is vec4(1) - src.rgba |
| [DST_COLOR](#DST-COLOR) | The blend factor is dst.rgba |
| [ONE_MINUS_DST_COLOR](#ONE-MINUS-DST-COLOR) | The blend factor is vec4(1) - dst.rgba |
| [SRC_ALPHA](#SRC-ALPHA) | The blend factor is vec4(src.a) |
| [ONE_MINUS_SRC_ALPHA](#ONE-MINUS-SRC-ALPHA) | The blend factor is vec4(1 - src.a) |
| [DST_ALPHA](#DST-ALPHA) | The blend factor is vec4(dst.a) |
| [ONE_MINUS_DST_ALPHA](#ONE-MINUS-DST-ALPHA) | The blend factor is vec4(1 - dst.a) |
| [CONSTANT_COLOR](#CONSTANT-COLOR) | The blend factor is c where c is specified in com.aspose.threed.RenderState\#getBlendColor |
| [ONE_MINUS_CONSTANT_COLOR](#ONE-MINUS-CONSTANT-COLOR) | The blend factor is vec4(1) - c where c is specified in com.aspose.threed.RenderState\#getBlendColor |
| [CONSTANT_ALPHA](#CONSTANT-ALPHA) | The blend factor is vec4(c.a) where c is specified in com.aspose.threed.RenderState\#getBlendColor |
| [ONE_MINUS_CONSTANT_ALPHA](#ONE-MINUS-CONSTANT-ALPHA) | The blend factor is vec4(1 - c.a) where c is specified in com.aspose.threed.RenderState\#getBlendColor |
| [SRC_ALPHA_SATURATE](#SRC-ALPHA-SATURATE) | The blend factor is min(src.a, 1 - dst.a) |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### ZERO {#ZERO}
```
public static final BlendFactor ZERO
```


The blend factor is vec4(0)

### ONE {#ONE}
```
public static final BlendFactor ONE
```


The blend factor is vec4(1)

### SRC_COLOR {#SRC-COLOR}
```
public static final BlendFactor SRC_COLOR
```


The blend factor is src.rgba

### ONE_MINUS_SRC_COLOR {#ONE-MINUS-SRC-COLOR}
```
public static final BlendFactor ONE_MINUS_SRC_COLOR
```


The blend factor is vec4(1) - src.rgba

### DST_COLOR {#DST-COLOR}
```
public static final BlendFactor DST_COLOR
```


The blend factor is dst.rgba

### ONE_MINUS_DST_COLOR {#ONE-MINUS-DST-COLOR}
```
public static final BlendFactor ONE_MINUS_DST_COLOR
```


The blend factor is vec4(1) - dst.rgba

### SRC_ALPHA {#SRC-ALPHA}
```
public static final BlendFactor SRC_ALPHA
```


The blend factor is vec4(src.a)

### ONE_MINUS_SRC_ALPHA {#ONE-MINUS-SRC-ALPHA}
```
public static final BlendFactor ONE_MINUS_SRC_ALPHA
```


The blend factor is vec4(1 - src.a)

### DST_ALPHA {#DST-ALPHA}
```
public static final BlendFactor DST_ALPHA
```


The blend factor is vec4(dst.a)

### ONE_MINUS_DST_ALPHA {#ONE-MINUS-DST-ALPHA}
```
public static final BlendFactor ONE_MINUS_DST_ALPHA
```


The blend factor is vec4(1 - dst.a)

### CONSTANT_COLOR {#CONSTANT-COLOR}
```
public static final BlendFactor CONSTANT_COLOR
```


The blend factor is c where c is specified in com.aspose.threed.RenderState\#getBlendColor

### ONE_MINUS_CONSTANT_COLOR {#ONE-MINUS-CONSTANT-COLOR}
```
public static final BlendFactor ONE_MINUS_CONSTANT_COLOR
```


The blend factor is vec4(1) - c where c is specified in com.aspose.threed.RenderState\#getBlendColor

### CONSTANT_ALPHA {#CONSTANT-ALPHA}
```
public static final BlendFactor CONSTANT_ALPHA
```


The blend factor is vec4(c.a) where c is specified in com.aspose.threed.RenderState\#getBlendColor

### ONE_MINUS_CONSTANT_ALPHA {#ONE-MINUS-CONSTANT-ALPHA}
```
public static final BlendFactor ONE_MINUS_CONSTANT_ALPHA
```


The blend factor is vec4(1 - c.a) where c is specified in com.aspose.threed.RenderState\#getBlendColor

### SRC_ALPHA_SATURATE {#SRC-ALPHA-SATURATE}
```
public static final BlendFactor SRC_ALPHA_SATURATE
```


The blend factor is min(src.a, 1 - dst.a)

### values() {#values--}
```
public static BlendFactor[] values()
```




**Returns:**
com.aspose.threed.BlendFactor[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static BlendFactor valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[BlendFactor](../../com.aspose.threed/blendfactor)
