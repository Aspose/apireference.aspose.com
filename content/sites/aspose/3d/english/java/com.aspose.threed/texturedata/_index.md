---
title: TextureData
second_title: Aspose.3D for Java API Reference
description: This class contains the raw data and format definition of a texture.
type: docs
weight: 167
url: /java/com.aspose.threed/texturedata/
---

**Inheritance:**
java.lang.Object
```
public class TextureData
```

This class contains the raw data and format definition of a texture.
## Constructors

| Constructor | Description |
| --- | --- |
| [TextureData(int width, int height, int stride, int bytesPerPixel, int pixelFormat, byte[] data)](#TextureData-int-int-int-int-int-byte---) | Constructor of [TextureData](../../com.aspose.threed/texturedata) |
| [TextureData(int width, int height, int stride, int bytesPerPixel, PixelFormat pixelFormat, byte[] data)](#TextureData-int-int-int-int-com.aspose.threed.PixelFormat-byte---) | Constructor of [TextureData](../../com.aspose.threed/texturedata) |
| [TextureData()](#TextureData--) | Constructor of [TextureData](../../com.aspose.threed/texturedata) |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fromBitmap(BufferedImage bitmap)](#fromBitmap-java.awt.image.BufferedImage-) | Convert a java.awt.image.BufferedImage to [TextureData](../../com.aspose.threed/texturedata) |
| [fromFile(String fileName)](#fromFile-java.lang.String-) | Load a texture from file |
| [fromStream(Stream stream)](#fromStream-com.aspose.csporter.helpers.Stream-) | Load a texture from stream |
| [getBytesPerPixel()](#getBytesPerPixel--) | Number of bytes of a pixel |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Raw bytes of pixel data |
| [getHeight()](#getHeight--) | Number of vertical pixels |
| [getPixelFormat()](#getPixelFormat--) | The pixel's format |
| [getStride()](#getStride--) | Number of bytes of a scanline. |
| [getWidth()](#getWidth--) | Number of horizontal pixels |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toBitmap()](#toBitmap--) | Convert the TextureData to a java.awt.image.BufferedImage instance. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TextureData(int width, int height, int stride, int bytesPerPixel, int pixelFormat, byte[] data) {#TextureData-int-int-int-int-int-byte---}
```
public TextureData(int width, int height, int stride, int bytesPerPixel, int pixelFormat, byte[] data)
```


Constructor of [TextureData](../../com.aspose.threed/texturedata)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | int |  |
| height | int |  |
| stride | int |  |
| bytesPerPixel | int |  |
| pixelFormat | int |  |
| data | byte[] |  |

### TextureData(int width, int height, int stride, int bytesPerPixel, PixelFormat pixelFormat, byte[] data) {#TextureData-int-int-int-int-com.aspose.threed.PixelFormat-byte---}
```
public TextureData(int width, int height, int stride, int bytesPerPixel, PixelFormat pixelFormat, byte[] data)
```


Constructor of [TextureData](../../com.aspose.threed/texturedata)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | int |  |
| height | int |  |
| stride | int |  |
| bytesPerPixel | int |  |
| pixelFormat | [PixelFormat](../../com.aspose.threed/pixelformat) |  |
| data | byte[] |  |

### TextureData() {#TextureData--}
```
public TextureData()
```


Constructor of [TextureData](../../com.aspose.threed/texturedata)

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
### fromBitmap(BufferedImage bitmap) {#fromBitmap-java.awt.image.BufferedImage-}
```
public static TextureData fromBitmap(BufferedImage bitmap)
```


Convert a java.awt.image.BufferedImage to [TextureData](../../com.aspose.threed/texturedata)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| bitmap | java.awt.image.BufferedImage |  |

**Returns:**
[TextureData](../../com.aspose.threed/texturedata)
### fromFile(String fileName) {#fromFile-java.lang.String-}
```
public static TextureData fromFile(String fileName)
```


Load a texture from file

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String |  |

**Returns:**
[TextureData](../../com.aspose.threed/texturedata)
### fromStream(Stream stream) {#fromStream-com.aspose.csporter.helpers.Stream-}
```
public static TextureData fromStream(Stream stream)
```


Load a texture from stream

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream |  |

**Returns:**
[TextureData](../../com.aspose.threed/texturedata)
### getBytesPerPixel() {#getBytesPerPixel--}
```
public int getBytesPerPixel()
```


Number of bytes of a pixel

**Returns:**
int
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getData() {#getData--}
```
public byte[] getData()
```


Raw bytes of pixel data

**Returns:**
byte[]
### getHeight() {#getHeight--}
```
public int getHeight()
```


Number of vertical pixels

**Returns:**
int
### getPixelFormat() {#getPixelFormat--}
```
public PixelFormat getPixelFormat()
```


The pixel's format

**Returns:**
[PixelFormat](../../com.aspose.threed/pixelformat)
### getStride() {#getStride--}
```
public int getStride()
```


Number of bytes of a scanline.

**Returns:**
int
### getWidth() {#getWidth--}
```
public int getWidth()
```


Number of horizontal pixels

**Returns:**
int
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




### toBitmap() {#toBitmap--}
```
public BufferedImage toBitmap()
```


Convert the TextureData to a java.awt.image.BufferedImage instance.

**Returns:**
java.awt.image.BufferedImage
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

