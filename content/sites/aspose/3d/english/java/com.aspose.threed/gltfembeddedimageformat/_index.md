---
title: GltfEmbeddedImageFormat
second_title: Aspose.3D for Java API Reference
description: How glTF exporter will embed the textures during the exporting.
type: docs
weight: 252
url: /java/com.aspose.threed/gltfembeddedimageformat/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum GltfEmbeddedImageFormat extends Enum<GltfEmbeddedImageFormat>
```

How glTF exporter will embed the textures during the exporting.
## Fields

| Field | Description |
| --- | --- |
| [NO_CHANGE](#NO-CHANGE) | Do not convert the image and keep it as it is. |
| [JPEG](#JPEG) | All non-supported images formats will be converted to jpeg if possible. |
| [PNG](#PNG) | All non-supported images formats will be converted to png if possible. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### NO_CHANGE {#NO-CHANGE}
```
public static final GltfEmbeddedImageFormat NO_CHANGE
```


Do not convert the image and keep it as it is.

### JPEG {#JPEG}
```
public static final GltfEmbeddedImageFormat JPEG
```


All non-supported images formats will be converted to jpeg if possible.

### PNG {#PNG}
```
public static final GltfEmbeddedImageFormat PNG
```


All non-supported images formats will be converted to png if possible.

### values() {#values--}
```
public static GltfEmbeddedImageFormat[] values()
```




**Returns:**
com.aspose.threed.GltfEmbeddedImageFormat[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static GltfEmbeddedImageFormat valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[GltfEmbeddedImageFormat](../../com.aspose.threed/gltfembeddedimageformat)
