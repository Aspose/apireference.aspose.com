---
title: TextureFilter
second_title: Aspose.3D for Java API Reference
description: Filter options during texture sampling.
type: docs
weight: 276
url: /java/com.aspose.threed/texturefilter/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TextureFilter extends Enum<TextureFilter>
```

Filter options during texture sampling.
## Fields

| Field | Description |
| --- | --- |
| [NONE](#NONE) | No minification, this is only used by minification filter. |
| [POINT](#POINT) | Use point sampling |
| [LINEAR](#LINEAR) | Use linear interpolation for sampling |
| [ANISOTROPIC](#ANISOTROPIC) | Use anisotropic interpolation for sampling, this is only used by minification filter. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### NONE {#NONE}
```
public static final TextureFilter NONE
```


No minification, this is only used by minification filter.

### POINT {#POINT}
```
public static final TextureFilter POINT
```


Use point sampling

### LINEAR {#LINEAR}
```
public static final TextureFilter LINEAR
```


Use linear interpolation for sampling

### ANISOTROPIC {#ANISOTROPIC}
```
public static final TextureFilter ANISOTROPIC
```


Use anisotropic interpolation for sampling, this is only used by minification filter.

### values() {#values--}
```
public static TextureFilter[] values()
```




**Returns:**
com.aspose.threed.TextureFilter[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static TextureFilter valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[TextureFilter](../../com.aspose.threed/texturefilter)
