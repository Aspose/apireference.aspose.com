---
title: TextureData
second_title: Aspose.3D for Java API Reference
description: This class contains the raw data and format definition of a texture.
type: docs
weight: 173
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
| [TextureData(int width, int height, int stride, int bytesPerPixel, PixelFormat pixelFormat, byte[] data)](#TextureData-int-int-int-int-com.aspose.threed.PixelFormat-byte---) | Constructor of [TextureData](../../com.aspose.threed/texturedata) |
| [TextureData(int width, int height, PixelFormat pixelFormat)](#TextureData-int-int-com.aspose.threed.PixelFormat-) | Constructs a new [TextureData](../../com.aspose.threed/texturedata) and allocate pixel data. |
| [TextureData()](#TextureData--) | Constructor of [TextureData](../../com.aspose.threed/texturedata) |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
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
| [mapPixels(PixelMapMode mapMode)](#mapPixels-com.aspose.threed.PixelMapMode-) | Map all pixels for read/write |
| [mapPixels(PixelMapMode mapMode, PixelFormat format)](#mapPixels-com.aspose.threed.PixelMapMode-com.aspose.threed.PixelFormat-) | Map all pixels for read/write in given pixel format |
| [mapPixels(Rect rect, PixelMapMode mapMode, PixelFormat format)](#mapPixels-com.aspose.threed.Rect-com.aspose.threed.PixelMapMode-com.aspose.threed.PixelFormat-) | Map pixels addressed by rect for reading/writing in given pixel format |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [save(Stream stream, String format)](#save-com.aspose.csporter.helpers.Stream-java.lang.String-) | Save texture data into specified image format |
| [save(String fileName)](#save-java.lang.String-) | Save texture data into image file |
| [save(String fileName, String format)](#save-java.lang.String-java.lang.String-) | Save texture data into image file |
| [toString()](#toString--) |  |
| [transformPixelFormat(PixelFormat pixelFormat)](#transformPixelFormat-com.aspose.threed.PixelFormat-) | Transform pixel's layout to new pixel format. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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

### TextureData(int width, int height, PixelFormat pixelFormat) {#TextureData-int-int-com.aspose.threed.PixelFormat-}
```
public TextureData(int width, int height, PixelFormat pixelFormat)
```


Constructs a new [TextureData](../../com.aspose.threed/texturedata) and allocate pixel data.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | int |  |
| height | int |  |
| pixelFormat | [PixelFormat](../../com.aspose.threed/pixelformat) |  |

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
### mapPixels(PixelMapMode mapMode) {#mapPixels-com.aspose.threed.PixelMapMode-}
```
public PixelMapping mapPixels(PixelMapMode mapMode)
```


Map all pixels for read/write

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mapMode | [PixelMapMode](../../com.aspose.threed/pixelmapmode) | Map mode |

**Returns:**
[PixelMapping](../../com.aspose.threed/pixelmapping)
### mapPixels(PixelMapMode mapMode, PixelFormat format) {#mapPixels-com.aspose.threed.PixelMapMode-com.aspose.threed.PixelFormat-}
```
public PixelMapping mapPixels(PixelMapMode mapMode, PixelFormat format)
```


Map all pixels for read/write in given pixel format

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mapMode | [PixelMapMode](../../com.aspose.threed/pixelmapmode) | Map mode |
| format | [PixelFormat](../../com.aspose.threed/pixelformat) | Pixel format |

**Returns:**
[PixelMapping](../../com.aspose.threed/pixelmapping)
### mapPixels(Rect rect, PixelMapMode mapMode, PixelFormat format) {#mapPixels-com.aspose.threed.Rect-com.aspose.threed.PixelMapMode-com.aspose.threed.PixelFormat-}
```
public PixelMapping mapPixels(Rect rect, PixelMapMode mapMode, PixelFormat format)
```


Map pixels addressed by rect for reading/writing in given pixel format

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rect](../../com.aspose.threed/rect) | The area of pixels to be accessed |
| mapMode | [PixelMapMode](../../com.aspose.threed/pixelmapmode) | Map mode |
| format | [PixelFormat](../../com.aspose.threed/pixelformat) | Pixel format |

**Returns:**
[PixelMapping](../../com.aspose.threed/pixelmapping) - Returns a mapping object, it should be disposed when no longer needed.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### save(Stream stream, String format) {#save-com.aspose.csporter.helpers.Stream-java.lang.String-}
```
public void save(Stream stream, String format)
```


Save texture data into specified image format

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | com.aspose.csporter.helpers.Stream | The stream that holds the saved image |
| format | java.lang.String | Image format, usually file extension |

### save(String fileName) {#save-java.lang.String-}
```
public void save(String fileName)
```


Save texture data into image file

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | The file name of where the image will be saved. |

### save(String fileName, String format) {#save-java.lang.String-java.lang.String-}
```
public void save(String fileName, String format)
```


Save texture data into image file

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | The file name of where the image will be saved. |
| format | java.lang.String | Image format of the output file. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### transformPixelFormat(PixelFormat pixelFormat) {#transformPixelFormat-com.aspose.threed.PixelFormat-}
```
public void transformPixelFormat(PixelFormat pixelFormat)
```


Transform pixel's layout to new pixel format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pixelFormat | [PixelFormat](../../com.aspose.threed/pixelformat) | Destination pixel format |

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

