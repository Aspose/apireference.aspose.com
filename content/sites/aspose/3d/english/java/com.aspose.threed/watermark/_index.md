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
| [decodeWatermark(Mesh input, String password)](#decodeWatermark-com.aspose.threed.Mesh-java.lang.String-) | Decode the watermark from a mesh |
| [encodeWatermark(Mesh input, String text, String password)](#encodeWatermark-com.aspose.threed.Mesh-java.lang.String-java.lang.String-) | Encode a text into mesh' blind watermark. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
java.lang.String - Blind watermark or null if no watermark decoded.
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
[Mesh](../../com.aspose.threed/mesh) - A new mesh instance with blind watermark encoded
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

