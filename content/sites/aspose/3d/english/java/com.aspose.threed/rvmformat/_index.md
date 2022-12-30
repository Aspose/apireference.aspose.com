---
title: RvmFormat
second_title: Aspose.3D for Java API Reference
description: The RVM Format
type: docs
weight: 141
url: /java/com.aspose.threed/rvmformat/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.FileFormat](../../com.aspose.threed/fileformat)
```
public class RvmFormat extends FileFormat
```

The RVM Format
## Methods

| Method | Description |
| --- | --- |
| [loadAttributes(Scene scene, String fileName, String prefix)](#loadAttributes-com.aspose.threed.Scene-java.lang.String-java.lang.String-) | Load the attributes from specified file name |
| [loadAttributes(Scene scene, String fileName)](#loadAttributes-com.aspose.threed.Scene-java.lang.String-) | Load the attributes from specified file name |
| [loadAttributes(Scene scene, Stream stream, String prefix)](#loadAttributes-com.aspose.threed.Scene-com.aspose.csporter.helpers.Stream-java.lang.String-) | Load the attributes from specified stream |
| [loadAttributes(Scene scene, Stream stream)](#loadAttributes-com.aspose.threed.Scene-com.aspose.csporter.helpers.Stream-) | Load the attributes from specified stream |
### loadAttributes(Scene scene, String fileName, String prefix) {#loadAttributes-com.aspose.threed.Scene-java.lang.String-java.lang.String-}
```
public void loadAttributes(Scene scene, String fileName, String prefix)
```


Load the attributes from specified file name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) | The scene where the attributes will be applied to |
| fileName | java.lang.String | The file's name that contains the attributes |
| prefix | java.lang.String | The prefix of the attributes that used to avoid conflict of names, default value is "rvm:" |

### loadAttributes(Scene scene, String fileName) {#loadAttributes-com.aspose.threed.Scene-java.lang.String-}
```
public void loadAttributes(Scene scene, String fileName)
```


Load the attributes from specified file name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) | The scene where the attributes will be applied to |
| fileName | java.lang.String | The file's name that contains the attributes |

### loadAttributes(Scene scene, Stream stream, String prefix) {#loadAttributes-com.aspose.threed.Scene-com.aspose.csporter.helpers.Stream-java.lang.String-}
```
public void loadAttributes(Scene scene, Stream stream, String prefix)
```


Load the attributes from specified stream

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) | The scene where the attributes will be applied to |
| stream | com.aspose.csporter.helpers.Stream | The stream that contains the attributes |
| prefix | java.lang.String | The prefix of the attributes that used to avoid conflict of names, default value is "rvm:" |

### loadAttributes(Scene scene, Stream stream) {#loadAttributes-com.aspose.threed.Scene-com.aspose.csporter.helpers.Stream-}
```
public void loadAttributes(Scene scene, Stream stream)
```


Load the attributes from specified stream

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| scene | [Scene](../../com.aspose.threed/scene) | The scene where the attributes will be applied to |
| stream | com.aspose.csporter.helpers.Stream | The stream that contains the attributes |

