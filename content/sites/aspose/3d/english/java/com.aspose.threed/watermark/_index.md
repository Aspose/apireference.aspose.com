---
title: Watermark
second_title: Aspose.3D for Java API Reference
description: Utility to encode/decode blind watermark  to/from a mesh.
type: docs
weight: 209
url: /java/com.aspose.threed/watermark/
---

**Inheritance:**
java.lang.Object
```
public class Watermark
```

Utility to encode/decode blind watermark to/from a mesh.
## Methods

| Method | Description |
| --- | --- |
| [encodeWatermark(Mesh input, String text, String password)](#encodeWatermark-com.aspose.threed.Mesh-java.lang.String-java.lang.String-) | Encode a text into mesh' blind watermark. |
| [decodeWatermark(Mesh input, String password)](#decodeWatermark-com.aspose.threed.Mesh-java.lang.String-) | Decode the watermark from a mesh |
### encodeWatermark(Mesh input, String text, String password) {#encodeWatermark-com.aspose.threed.Mesh-java.lang.String-java.lang.String-}
```
public static Mesh encodeWatermark(Mesh input, String text, String password)
```


Encode a text into mesh' blind watermark.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [Mesh](../../com.aspose.threed/mesh) | Mesh to encode a blind watermark |
| text | java.lang.String | Text to encode to the mesh |
| password | java.lang.String | Password to protect the watermark, it's optional |

**Returns:**
[Mesh](../../com.aspose.threed/mesh)
### decodeWatermark(Mesh input, String password) {#decodeWatermark-com.aspose.threed.Mesh-java.lang.String-}
```
public static String decodeWatermark(Mesh input, String password)
```


Decode the watermark from a mesh

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| input | [Mesh](../../com.aspose.threed/mesh) | The mesh to extract watermark |
| password | java.lang.String | The password to decrypt the watermark |

**Returns:**
java.lang.String
