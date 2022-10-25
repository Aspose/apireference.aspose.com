---
title: AlphaSource
second_title: Aspose.3D for Java API Reference
description: Defines whether the texture contains the alpha channel.
type: docs
weight: 236
url: /java/com.aspose.threed/alphasource/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum AlphaSource extends Enum<AlphaSource>
```

Defines whether the texture contains the alpha channel.
## Fields

| Field | Description |
| --- | --- |
| [NONE](#NONE) | No alpha is defined in the texture |
| [PIXEL_ALPHA](#PIXEL-ALPHA) | The alpha is defined by pixel's alpha channel |
| [FIXED_VALUE](#FIXED-VALUE) | The Alpha is a fixed value which is defined by com.aspose.threed.TextureBase\#getAlpha |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### NONE {#NONE}
```
public static final AlphaSource NONE
```


No alpha is defined in the texture

### PIXEL_ALPHA {#PIXEL-ALPHA}
```
public static final AlphaSource PIXEL_ALPHA
```


The alpha is defined by pixel's alpha channel

### FIXED_VALUE {#FIXED-VALUE}
```
public static final AlphaSource FIXED_VALUE
```


The Alpha is a fixed value which is defined by com.aspose.threed.TextureBase\#getAlpha

### values() {#values--}
```
public static AlphaSource[] values()
```




**Returns:**
com.aspose.threed.AlphaSource[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static AlphaSource valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[AlphaSource](../../com.aspose.threed/alphasource)
