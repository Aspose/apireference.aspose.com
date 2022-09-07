---
title: WrapMode
second_title: Aspose.3D for Java API Reference
description: Textures wrap mode.
type: docs
weight: 281
url: /java/com.aspose.threed/wrapmode/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum WrapMode extends Enum<WrapMode>
```

Texture's wrap mode.
## Fields

| Field | Description |
| --- | --- |
| [WRAP](#WRAP) | Tiles the texture on the model's surface, creating a repeating pattern. |
| [CLAMP](#CLAMP) | Clamps the texture to the last pixel at the border. |
| [MIRROR](#MIRROR) | The texture will be repeated, but it will be mirrored when the integer part of the coordinate is odd. |
| [MIRROR_ONCE](#MIRROR-ONCE) | The texture will be mirrored once, and then clamps to the maximum value. |
| [BORDER](#BORDER) | The coordinates that outside of the range [0.0, 1.0] are set to a specified border color. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### WRAP {#WRAP}
```
public static final WrapMode WRAP
```


Tiles the texture on the model's surface, creating a repeating pattern.

### CLAMP {#CLAMP}
```
public static final WrapMode CLAMP
```


Clamps the texture to the last pixel at the border.

### MIRROR {#MIRROR}
```
public static final WrapMode MIRROR
```


The texture will be repeated, but it will be mirrored when the integer part of the coordinate is odd.

### MIRROR_ONCE {#MIRROR-ONCE}
```
public static final WrapMode MIRROR_ONCE
```


The texture will be mirrored once, and then clamps to the maximum value.

### BORDER {#BORDER}
```
public static final WrapMode BORDER
```


The coordinates that outside of the range [0.0, 1.0] are set to a specified border color.

### values() {#values--}
```
public static WrapMode[] values()
```




**Returns:**
com.aspose.threed.WrapMode[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static WrapMode valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[WrapMode](../../com.aspose.threed/wrapmode)
