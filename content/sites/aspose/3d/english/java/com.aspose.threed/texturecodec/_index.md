---
title: TextureCodec
second_title: Aspose.3D for Java API Reference
description: Class to manage encoders and decoders for textures.
type: docs
weight: 172
url: /java/com.aspose.threed/texturecodec/
---

**Inheritance:**
java.lang.Object
```
public class TextureCodec
```

Class to manage encoders and decoders for textures.
## Constructors

| Constructor | Description |
| --- | --- |
| [TextureCodec()](#TextureCodec--) |  |
## Methods

| Method | Description |
| --- | --- |
| [decode(Stream stream, boolean reverseY)](#decode-com.aspose.csporter.helpers.Stream-boolean-) | Decode texture data from stream |
| [encode(TextureData texture, Stream stream, String format)](#encode-com.aspose.threed.TextureData-com.aspose.csporter.helpers.Stream-java.lang.String-) | Encode texture data into stream using specified format |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getSupportedEncoderFormats()](#getSupportedEncoderFormats--) | Gets all supported encoder formats |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [registerCodec(ITextureCodec codec)](#registerCodec-com.aspose.threed.ITextureCodec-) | Register a set of texture encoders and decoders |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TextureCodec() {#TextureCodec--}
```
public TextureCodec()
```


### decode(Stream stream, boolean reverseY) {#decode-com.aspose.csporter.helpers.Stream-boolean-}
```
public static TextureData decode(Stream stream, boolean reverseY)
```


Decode texture data from stream

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream |  |
| reverseY | boolean |  |

**Returns:**
[TextureData](../../com.aspose.threed/texturedata)
### encode(TextureData texture, Stream stream, String format) {#encode-com.aspose.threed.TextureData-com.aspose.csporter.helpers.Stream-java.lang.String-}
```
public static void encode(TextureData texture, Stream stream, String format)
```


Encode texture data into stream using specified format

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| texture | [TextureData](../../com.aspose.threed/texturedata) | The texture to be encoded |
| stream | com.aspose.csporter.helpers.Stream | The output stream |
| format | java.lang.String | The image format of encoded data, like png/jpg |

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
### getSupportedEncoderFormats() {#getSupportedEncoderFormats--}
```
public static String[] getSupportedEncoderFormats()
```


Gets all supported encoder formats

**Returns:**
java.lang.String[]
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




### registerCodec(ITextureCodec codec) {#registerCodec-com.aspose.threed.ITextureCodec-}
```
public static void registerCodec(ITextureCodec codec)
```


Register a set of texture encoders and decoders

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| codec | [ITextureCodec](../../com.aspose.threed/itexturecodec) |  |

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

