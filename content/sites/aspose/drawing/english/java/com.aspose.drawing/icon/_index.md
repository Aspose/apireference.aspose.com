---
title: Icon
second_title: Aspose.Drawing for Java API Reference
description: Represents a Windows icon which is a small bitmap image that is used to represent an object.
type: docs
weight: 29
url: /java/com.aspose.drawing/icon/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.ms.System.ICloneable, com.aspose.ms.System.IDisposable
```
public final class Icon implements System.ICloneable, System.IDisposable
```

Represents a Windows icon, which is a small bitmap image that is used to represent an object. Icons can be thought of as transparent bitmaps, although their size is determined by the system.
## Constructors

| Constructor | Description |
| --- | --- |
| [Icon(String fileName)](#Icon-java.lang.String-) | Initializes a new instance of the [Icon](../../com.aspose.drawing/icon) class from the specified file name. |
| [Icon(InputStream stream)](#Icon-java.io.InputStream-) | Initializes a new instance of the [Icon](../../com.aspose.drawing/icon) class from the specified data stream. |
| [Icon(String fileName, Size size)](#Icon-java.lang.String-com.aspose.drawing.Size-) | Initializes a new instance of the [Icon](../../com.aspose.drawing/icon) class of the specified size from the specified file. |
| [Icon(Icon original, Size size)](#Icon-com.aspose.drawing.Icon-com.aspose.drawing.Size-) | Initializes a new instance of the [Icon](../../com.aspose.drawing/icon) class and attempts to find a version of the icon that matches the requested size. |
| [Icon(Object type, String resource)](#Icon-java.lang.Object-java.lang.String-) | Initializes a new instance of the [Icon](../../com.aspose.drawing/icon) class from a resource in the specified assembly. |
| [Icon(InputStream stream, Size size)](#Icon-java.io.InputStream-com.aspose.drawing.Size-) | Initializes a new instance of the [Icon](../../com.aspose.drawing/icon) class of the specified size from the specified stream. |
| [Icon(String fileName, int width, int height)](#Icon-java.lang.String-int-int-) | Initializes a new instance of the [Icon](../../com.aspose.drawing/icon) class with the specified width and height from the specified file. |
| [Icon(Icon original, int width, int height)](#Icon-com.aspose.drawing.Icon-int-int-) | Initializes a new instance of the [Icon](../../com.aspose.drawing/icon) class and attempts to find a version of the icon that matches the requested size.. |
| [Icon(InputStream stream, int width, int height)](#Icon-java.io.InputStream-int-int-) | Initializes a new instance of the [Icon](../../com.aspose.drawing/icon) class from the specified data stream and with the specified width and height. |
## Methods

| Method | Description |
| --- | --- |
| [getHandle()](#getHandle--) | Gets the handle for this [Icon](../../com.aspose.drawing/icon). |
| [getHeight()](#getHeight--) | Gets the height of this [Icon](../../com.aspose.drawing/icon). |
| [getSize()](#getSize--) | Gets the size of this [Icon](../../com.aspose.drawing/icon). |
| [getWidth()](#getWidth--) | Gets the width of this [Icon](../../com.aspose.drawing/icon). |
| [extractAssociatedIcon(String filePath)](#extractAssociatedIcon-java.lang.String-) | Returns an icon representation of an image that is contained in the specified file. |
| [fromHandle(byte[] handle)](#fromHandle-byte---) | Creates a GDI+ [Icon](../../com.aspose.drawing/icon) from the specified Windows handle to an icon (HICON). |
| [deepClone()](#deepClone--) | Clones the [Icon](../../com.aspose.drawing/icon), creating a duplicate image. |
| [dispose()](#dispose--) | Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources. |
| [save(OutputStream outputStream)](#save-java.io.OutputStream-) | Saves this [Icon](../../com.aspose.drawing/icon) to the specified output java.io.InputStream. |
| [toBitmap()](#toBitmap--) | Converts this [Icon](../../com.aspose.drawing/icon) to a GDI+ [Bitmap](../../com.aspose.drawing/bitmap). |
| [toString()](#toString--) | Gets a human-readable string that describes the [Icon](../../com.aspose.drawing/icon). |
### Icon(String fileName) {#Icon-java.lang.String-}
```
public Icon(String fileName)
```


Initializes a new instance of the [Icon](../../com.aspose.drawing/icon) class from the specified file name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | The file to load the [Icon](../../com.aspose.drawing/icon) from. |

### Icon(InputStream stream) {#Icon-java.io.InputStream-}
```
public Icon(InputStream stream)
```


Initializes a new instance of the [Icon](../../com.aspose.drawing/icon) class from the specified data stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | The data stream from which to load the [Icon](../../com.aspose.drawing/icon). |

### Icon(String fileName, Size size) {#Icon-java.lang.String-com.aspose.drawing.Size-}
```
public Icon(String fileName, Size size)
```


Initializes a new instance of the [Icon](../../com.aspose.drawing/icon) class of the specified size from the specified file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | The name and path to the file that contains the icon data. |
| size | [Size](../../com.aspose.drawing/size) | The desired size of the icon. |

### Icon(Icon original, Size size) {#Icon-com.aspose.drawing.Icon-com.aspose.drawing.Size-}
```
public Icon(Icon original, Size size)
```


Initializes a new instance of the [Icon](../../com.aspose.drawing/icon) class and attempts to find a version of the icon that matches the requested size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| original | [Icon](../../com.aspose.drawing/icon) | The [Icon](../../com.aspose.drawing/icon) from which to load the newly sized icon. |
| size | [Size](../../com.aspose.drawing/size) | A `Size`([.getSize](../../null/\#getSize)) structure that specifies the height and width of the new [Icon](../../com.aspose.drawing/icon). |

### Icon(Object type, String resource) {#Icon-java.lang.Object-java.lang.String-}
```
public Icon(Object type, String resource)
```


Initializes a new instance of the [Icon](../../com.aspose.drawing/icon) class from a resource in the specified assembly.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| type | java.lang.Object | A Type that specifies the assembly in which to look for the resource. |
| resource | java.lang.String | The resource name to load. |

### Icon(InputStream stream, Size size) {#Icon-java.io.InputStream-com.aspose.drawing.Size-}
```
public Icon(InputStream stream, Size size)
```


Initializes a new instance of the [Icon](../../com.aspose.drawing/icon) class of the specified size from the specified stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | The stream that contains the icon data. |
| size | [Size](../../com.aspose.drawing/size) | The desired size of the icon. |

### Icon(String fileName, int width, int height) {#Icon-java.lang.String-int-int-}
```
public Icon(String fileName, int width, int height)
```


Initializes a new instance of the [Icon](../../com.aspose.drawing/icon) class with the specified width and height from the specified file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | The name and path to the file that contains the [Icon](../../com.aspose.drawing/icon) data. |
| width | int | The desired width of the [Icon](../../com.aspose.drawing/icon). |
| height | int | The desired height of the [Icon](../../com.aspose.drawing/icon). |

### Icon(Icon original, int width, int height) {#Icon-com.aspose.drawing.Icon-int-int-}
```
public Icon(Icon original, int width, int height)
```


Initializes a new instance of the [Icon](../../com.aspose.drawing/icon) class and attempts to find a version of the icon that matches the requested size..

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| original | [Icon](../../com.aspose.drawing/icon) | The icon to load the different size from. |
| width | int | The width of the new icon. |
| height | int | The height of the new icon. |

### Icon(InputStream stream, int width, int height) {#Icon-java.io.InputStream-int-int-}
```
public Icon(InputStream stream, int width, int height)
```


Initializes a new instance of the [Icon](../../com.aspose.drawing/icon) class from the specified data stream and with the specified width and height.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | The data stream from which to load the icon. |
| width | int | The width, in pixels, of the icon. |
| height | int | The height, in pixels, of the icon. |

### getHandle() {#getHandle--}
```
public System.IntPtr getHandle()
```


Gets the handle for this [Icon](../../com.aspose.drawing/icon). This is not a copy of the handle; do not free it.

Value: The Windows handle for the icon.

**Returns:**
com.aspose.ms.System.IntPtr
### getHeight() {#getHeight--}
```
public int getHeight()
```


Gets the height of this [Icon](../../com.aspose.drawing/icon).

Value: The height of this [Icon](../../com.aspose.drawing/icon).

**Returns:**
int
### getSize() {#getSize--}
```
public Size getSize()
```


Gets the size of this [Icon](../../com.aspose.drawing/icon).

Value: A `Size`([.getSize](../../null/\#getSize)) structure that specifies the width and height of this [Icon](../../com.aspose.drawing/icon).

**Returns:**
[Size](../../com.aspose.drawing/size)
### getWidth() {#getWidth--}
```
public int getWidth()
```


Gets the width of this [Icon](../../com.aspose.drawing/icon).

Value: The width of this [Icon](../../com.aspose.drawing/icon).

**Returns:**
int
### extractAssociatedIcon(String filePath) {#extractAssociatedIcon-java.lang.String-}
```
public static Icon extractAssociatedIcon(String filePath)
```


Returns an icon representation of an image that is contained in the specified file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| filePath | java.lang.String | The path to the file that contains an image. |

**Returns:**
[Icon](../../com.aspose.drawing/icon) - The [Icon](../../com.aspose.drawing/icon) representation of the image that is contained in the specified file.
### fromHandle(byte[] handle) {#fromHandle-byte---}
```
public static Icon fromHandle(byte[] handle)
```


Creates a GDI+ [Icon](../../com.aspose.drawing/icon) from the specified Windows handle to an icon (HICON).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| handle | byte[] | A Windows handle to an icon. |

**Returns:**
[Icon](../../com.aspose.drawing/icon) - The [Icon](../../com.aspose.drawing/icon) this method creates.
### deepClone() {#deepClone--}
```
public Object deepClone()
```


Clones the [Icon](../../com.aspose.drawing/icon), creating a duplicate image.

**Returns:**
java.lang.Object - An object that can be cast to an [Icon](../../com.aspose.drawing/icon).
### dispose() {#dispose--}
```
public void dispose()
```


Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources.

### save(OutputStream outputStream) {#save-java.io.OutputStream-}
```
public void save(OutputStream outputStream)
```


Saves this [Icon](../../com.aspose.drawing/icon) to the specified output java.io.InputStream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| outputStream | java.io.OutputStream | The java.io.InputStream to save to. |

### toBitmap() {#toBitmap--}
```
public Bitmap toBitmap()
```


Converts this [Icon](../../com.aspose.drawing/icon) to a GDI+ [Bitmap](../../com.aspose.drawing/bitmap).

**Returns:**
[Bitmap](../../com.aspose.drawing/bitmap) - A [Bitmap](../../com.aspose.drawing/bitmap) that represents the converted [Icon](../../com.aspose.drawing/icon).
### toString() {#toString--}
```
public String toString()
```


Gets a human-readable string that describes the [Icon](../../com.aspose.drawing/icon).

**Returns:**
java.lang.String - A string that describes the [Icon](../../com.aspose.drawing/icon).
