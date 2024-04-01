---
title: Metafile
second_title: Aspose.Drawing for Java API Reference
description: Defines a graphic metafile.
type: docs
weight: 30
url: /java/com.aspose.drawing.imaging/metafile/
---
**Inheritance:**
java.lang.Object, [com.aspose.drawing.Image](../../com.aspose.drawing/image)
```
public final class Metafile extends Image
```

Defines a graphic metafile. A metafile contains records that describe a sequence of graphics operations that can be recorded (constructed) and played back (displayed). This class is not inheritable.
## Constructors

| Constructor | Description |
| --- | --- |
| [Metafile(byte[] henhmetafile, boolean deleteEmf)](#Metafile-byte---boolean-) | Initializes a new instance of the [Metafile](../../com.aspose.drawing.imaging/metafile) class from the specified handle. |
| [Metafile(byte[] referenceHdc, int emfType)](#Metafile-byte---int-) | Initializes a new instance of the [Metafile](../../com.aspose.drawing.imaging/metafile) class from the specified handle to a device context and an [EmfType](../../com.aspose.drawing.imaging/emftype) enumeration that specifies the format of the [Metafile](../../com.aspose.drawing.imaging/metafile). |
| [Metafile(String filename)](#Metafile-java.lang.String-) | Initializes a new instance of the [Metafile](../../com.aspose.drawing.imaging/metafile) class from the specified file name. |
| [Metafile(String filename, byte[] referenceHdc)](#Metafile-java.lang.String-byte---) | Initializes a new instance of the [Metafile](../../com.aspose.drawing.imaging/metafile) class from the specified file name. |
| [Metafile(InputStream stream)](#Metafile-java.io.InputStream-) | Initializes a new instance of the [Metafile](../../com.aspose.drawing.imaging/metafile) class from the specified data stream. |
| [Metafile(InputStream stream, byte[] referenceHdc)](#Metafile-java.io.InputStream-byte---) | Initializes a new instance of the [Metafile](../../com.aspose.drawing.imaging/metafile) class from the specified data stream and a Windows handle to a device context. |
| [Metafile(InputStream stream, byte[] referenceHdc, int type)](#Metafile-java.io.InputStream-byte---int-) | Initializes a new instance of the [Metafile](../../com.aspose.drawing.imaging/metafile) class from the specified data stream, a Windows handle to a device context, and an [EmfType](../../com.aspose.drawing.imaging/emftype) enumeration that specifies the format of the [Metafile](../../com.aspose.drawing.imaging/metafile). |
| [Metafile(InputStream stream, byte[] referenceHdc, RectangleF frameRect, int frameUnit, int type)](#Metafile-java.io.InputStream-byte---com.aspose.drawing.RectangleF-int-int-) | Initializes a new instance of the [Metafile](../../com.aspose.drawing.imaging/metafile) class from the specified data stream, a Windows handle to a device context, and an [EmfType](../../com.aspose.drawing.imaging/emftype) enumeration that specifies the format of the [Metafile](../../com.aspose.drawing.imaging/metafile). |
## Methods

| Method | Description |
| --- | --- |
| [getWidth()](#getWidth--) | Gets the width, in pixels, of this [Metafile](../../com.aspose.drawing.imaging/metafile). |
| [getHeight()](#getHeight--) | Gets the height, in pixels, of this [Metafile](../../com.aspose.drawing.imaging/metafile). |
| [getRawFormat()](#getRawFormat--) | Gets the file format of this [Image](../../com.aspose.drawing/image). |
| [getPixelFormat()](#getPixelFormat--) | Gets the pixel format for this [Image](../../com.aspose.drawing/image). |
| [getPalette()](#getPalette--) | Gets or sets the color palette used for this [Image](../../com.aspose.drawing/image). |
| [setPalette(ColorPalette value)](#setPalette-com.aspose.drawing.imaging.ColorPalette-) | Gets or sets the color palette used for this [Image](../../com.aspose.drawing/image). |
| [getFrameDimensionsList()](#getFrameDimensionsList--) | Gets an array of GUIDs that represent the dimensions of frames within this [Image](../../com.aspose.drawing/image). |
| [getPropertyIdList()](#getPropertyIdList--) | Gets IDs of the property items stored in this [Image](../../com.aspose.drawing/image). |
| [getPropertyItems()](#getPropertyItems--) | Gets all the property items (pieces of metadata) stored in this [Image](../../com.aspose.drawing/image). |
| [getMetafileHeader(InputStream stream)](#getMetafileHeader-java.io.InputStream-) | Returns the [MetafileHeader](../../com.aspose.drawing.imaging/metafileheader) associated with the specified [Metafile](../../com.aspose.drawing.imaging/metafile). |
| [getMetafileHeader(String fileName)](#getMetafileHeader-java.lang.String-) | Returns the [MetafileHeader](../../com.aspose.drawing.imaging/metafileheader) associated with the specified [Metafile](../../com.aspose.drawing.imaging/metafile). |
| [rotateFlip(int rotateFlipType)](#rotateFlip-int-) | This method rotates, flips, or rotates and flips the [Image](../../com.aspose.drawing/image). |
| [getHenhmetafile()](#getHenhmetafile--) | Returns a Windows handle to an enhanced [Metafile](../../com.aspose.drawing.imaging/metafile). |
| [playRecord(int recordType, int flags, int dataSize, byte[] dataArray)](#playRecord-int-int-int-byte---) | Plays an individual metafile record. |
| [getMetafileHeader()](#getMetafileHeader--) | Returns the [MetafileHeader](../../com.aspose.drawing.imaging/metafileheader) associated with this [Metafile](../../com.aspose.drawing.imaging/metafile). |
| [getPropertyItem(int propid)](#getPropertyItem-int-) | Gets the specified property item from this [Image](../../com.aspose.drawing/image). |
| [removePropertyItem(int propid)](#removePropertyItem-int-) | Removes the specified property item from this [Image](../../com.aspose.drawing/image). |
| [setPropertyItem(PropertyItem propitem)](#setPropertyItem-com.aspose.drawing.imaging.PropertyItem-) | Stores a property item (piece of metadata) in this [Image](../../com.aspose.drawing/image). |
### Metafile(byte[] henhmetafile, boolean deleteEmf) {#Metafile-byte---boolean-}
```
public Metafile(byte[] henhmetafile, boolean deleteEmf)
```


Initializes a new instance of the [Metafile](../../com.aspose.drawing.imaging/metafile) class from the specified handle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| henhmetafile | byte[] | A handle to an enhanced metafile. |
| deleteEmf | boolean | true to delete the enhanced metafile handle when the [Metafile](../../com.aspose.drawing.imaging/metafile) is deleted; otherwise, false. |

### Metafile(byte[] referenceHdc, int emfType) {#Metafile-byte---int-}
```
public Metafile(byte[] referenceHdc, int emfType)
```


Initializes a new instance of the [Metafile](../../com.aspose.drawing.imaging/metafile) class from the specified handle to a device context and an [EmfType](../../com.aspose.drawing.imaging/emftype) enumeration that specifies the format of the [Metafile](../../com.aspose.drawing.imaging/metafile).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| referenceHdc | byte[] | The handle to a device context. |
| emfType | int | An [EmfType](../../com.aspose.drawing.imaging/emftype) that specifies the format of the [Metafile](../../com.aspose.drawing.imaging/metafile). |

### Metafile(String filename) {#Metafile-java.lang.String-}
```
public Metafile(String filename)
```


Initializes a new instance of the [Metafile](../../com.aspose.drawing.imaging/metafile) class from the specified file name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| filename | java.lang.String | A String that represents the file name from which to create the new [Metafile](../../com.aspose.drawing.imaging/metafile). |

### Metafile(String filename, byte[] referenceHdc) {#Metafile-java.lang.String-byte---}
```
public Metafile(String filename, byte[] referenceHdc)
```


Initializes a new instance of the [Metafile](../../com.aspose.drawing.imaging/metafile) class from the specified file name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| filename | java.lang.String | A String that represents the file name from which to create the new [Metafile](../../com.aspose.drawing.imaging/metafile). |
| referenceHdc | byte[] | A Windows handle to a device context. |

### Metafile(InputStream stream) {#Metafile-java.io.InputStream-}
```
public Metafile(InputStream stream)
```


Initializes a new instance of the [Metafile](../../com.aspose.drawing.imaging/metafile) class from the specified data stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | The InputStream from which to create the new [Metafile](../../com.aspose.drawing.imaging/metafile). |

### Metafile(InputStream stream, byte[] referenceHdc) {#Metafile-java.io.InputStream-byte---}
```
public Metafile(InputStream stream, byte[] referenceHdc)
```


Initializes a new instance of the [Metafile](../../com.aspose.drawing.imaging/metafile) class from the specified data stream and a Windows handle to a device context. />.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | A InputStream that contains the data for this [Metafile](../../com.aspose.drawing.imaging/metafile). |
| referenceHdc | byte[] | A Windows handle to a device context of the [Metafile](../../com.aspose.drawing.imaging/metafile) object. |

### Metafile(InputStream stream, byte[] referenceHdc, int type) {#Metafile-java.io.InputStream-byte---int-}
```
public Metafile(InputStream stream, byte[] referenceHdc, int type)
```


Initializes a new instance of the [Metafile](../../com.aspose.drawing.imaging/metafile) class from the specified data stream, a Windows handle to a device context, and an [EmfType](../../com.aspose.drawing.imaging/emftype) enumeration that specifies the format of the [Metafile](../../com.aspose.drawing.imaging/metafile).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | A InputStream that contains the data for this [Metafile](../../com.aspose.drawing.imaging/metafile). |
| referenceHdc | byte[] | A Windows handle to a device context. |
| type | int | An [EmfType](../../com.aspose.drawing.imaging/emftype) that specifies the format of the [Metafile](../../com.aspose.drawing.imaging/metafile). |

### Metafile(InputStream stream, byte[] referenceHdc, RectangleF frameRect, int frameUnit, int type) {#Metafile-java.io.InputStream-byte---com.aspose.drawing.RectangleF-int-int-}
```
public Metafile(InputStream stream, byte[] referenceHdc, RectangleF frameRect, int frameUnit, int type)
```


Initializes a new instance of the [Metafile](../../com.aspose.drawing.imaging/metafile) class from the specified data stream, a Windows handle to a device context, and an [EmfType](../../com.aspose.drawing.imaging/emftype) enumeration that specifies the format of the [Metafile](../../com.aspose.drawing.imaging/metafile).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | A InputStream that contains the data for this [Metafile](../../com.aspose.drawing.imaging/metafile). |
| referenceHdc | byte[] | A Windows handle to a device context. |
| frameRect | [RectangleF](../../com.aspose.drawing/rectanglef) | A [Rectangle](../../com.aspose.drawing/rectangle) that represents the rectangle that bounds the new [Metafile](../../com.aspose.drawing.imaging/metafile). |
| frameUnit | int | A [MetafileFrameUnit](../../com.aspose.drawing.imaging/metafileframeunit) that specifies the unit of measure for frameRect. |
| type | int | An [EmfType](../../com.aspose.drawing.imaging/emftype) that specifies the format of the [Metafile](../../com.aspose.drawing.imaging/metafile). |

### getWidth() {#getWidth--}
```
public int getWidth()
```


Gets the width, in pixels, of this [Metafile](../../com.aspose.drawing.imaging/metafile).

**Returns:**
int
### getHeight() {#getHeight--}
```
public int getHeight()
```


Gets the height, in pixels, of this [Metafile](../../com.aspose.drawing.imaging/metafile).

**Returns:**
int - the height, in pixels, of this [Metafile](../../com.aspose.drawing.imaging/metafile).
### getRawFormat() {#getRawFormat--}
```
public ImageFormat getRawFormat()
```


Gets the file format of this [Image](../../com.aspose.drawing/image).

**Returns:**
[ImageFormat](../../com.aspose.drawing.imaging/imageformat) - The [ImageFormat](../../com.aspose.drawing.imaging/imageformat) that represents the file format of this [Image](../../com.aspose.drawing/image).
### getPixelFormat() {#getPixelFormat--}
```
public int getPixelFormat()
```


Gets the pixel format for this [Image](../../com.aspose.drawing/image).

**Returns:**
int - A `PixelFormat`([Image.getPixelFormat](../../com.aspose.drawing/image\#getPixelFormat)) that represents the pixel format for this [Image](../../com.aspose.drawing/image).
### getPalette() {#getPalette--}
```
public ColorPalette getPalette()
```


Gets or sets the color palette used for this [Image](../../com.aspose.drawing/image).

**Returns:**
[ColorPalette](../../com.aspose.drawing.imaging/colorpalette) - A [ColorPalette](../../com.aspose.drawing.imaging/colorpalette) that represents the color palette used for this [Image](../../com.aspose.drawing/image).
### setPalette(ColorPalette value) {#setPalette-com.aspose.drawing.imaging.ColorPalette-}
```
public void setPalette(ColorPalette value)
```


Gets or sets the color palette used for this [Image](../../com.aspose.drawing/image).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ColorPalette](../../com.aspose.drawing.imaging/colorpalette) |  |

### getFrameDimensionsList() {#getFrameDimensionsList--}
```
public UUID[] getFrameDimensionsList()
```


Gets an array of GUIDs that represent the dimensions of frames within this [Image](../../com.aspose.drawing/image).

**Returns:**
java.util.UUID[] - An array of GUIDs that specify the dimensions of frames within this [Image](../../com.aspose.drawing/image) from most significant to least significant.
### getPropertyIdList() {#getPropertyIdList--}
```
public int[] getPropertyIdList()
```


Gets IDs of the property items stored in this [Image](../../com.aspose.drawing/image).

**Returns:**
int[] - An array of the property IDs, one for each property item stored in this image.
### getPropertyItems() {#getPropertyItems--}
```
public PropertyItem[] getPropertyItems()
```


Gets all the property items (pieces of metadata) stored in this [Image](../../com.aspose.drawing/image).

**Returns:**
com.aspose.drawing.imaging.PropertyItem[] - An array of [PropertyItem](../../com.aspose.drawing.imaging/propertyitem) objects, one for each property item stored in the image.
### getMetafileHeader(InputStream stream) {#getMetafileHeader-java.io.InputStream-}
```
public static MetafileHeader getMetafileHeader(InputStream stream)
```


Returns the [MetafileHeader](../../com.aspose.drawing.imaging/metafileheader) associated with the specified [Metafile](../../com.aspose.drawing.imaging/metafile).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | A InputStream containing the [Metafile](../../com.aspose.drawing.imaging/metafile) for which a header is retrieved. |

**Returns:**
[MetafileHeader](../../com.aspose.drawing.imaging/metafileheader) - The [MetafileHeader](../../com.aspose.drawing.imaging/metafileheader) associated with the specified [Metafile](../../com.aspose.drawing.imaging/metafile).
### getMetafileHeader(String fileName) {#getMetafileHeader-java.lang.String-}
```
public static MetafileHeader getMetafileHeader(String fileName)
```


Returns the [MetafileHeader](../../com.aspose.drawing.imaging/metafileheader) associated with the specified [Metafile](../../com.aspose.drawing.imaging/metafile).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fileName | java.lang.String | A String containing the name of the [Metafile](../../com.aspose.drawing.imaging/metafile) for which a header is retrieved. |

**Returns:**
[MetafileHeader](../../com.aspose.drawing.imaging/metafileheader) - The [MetafileHeader](../../com.aspose.drawing.imaging/metafileheader) associated with the specified [Metafile](../../com.aspose.drawing.imaging/metafile).
### rotateFlip(int rotateFlipType) {#rotateFlip-int-}
```
public void rotateFlip(int rotateFlipType)
```


This method rotates, flips, or rotates and flips the [Image](../../com.aspose.drawing/image).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rotateFlipType | int | A [RotateFlipType](../../com.aspose.drawing/rotatefliptype) member that specifies the type of rotation and flip to apply to the image. |

### getHenhmetafile() {#getHenhmetafile--}
```
public System.IntPtr getHenhmetafile()
```


Returns a Windows handle to an enhanced [Metafile](../../com.aspose.drawing.imaging/metafile).

**Returns:**
com.aspose.ms.System.IntPtr - A Windows handle to this enhanced [Metafile](../../com.aspose.drawing.imaging/metafile).
### playRecord(int recordType, int flags, int dataSize, byte[] dataArray) {#playRecord-int-int-int-byte---}
```
public void playRecord(int recordType, int flags, int dataSize, byte[] dataArray)
```


Plays an individual metafile record.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| recordType | int | Element of the [EmfPlusRecordType](../../com.aspose.drawing.imaging/emfplusrecordtype) that specifies the type of metafile record being played. |
| flags | int | A set of flags that specify attributes of the record. |
| dataSize | int | The number of bytes in the record data. |
| dataArray | byte[] | An array of bytes that contains the record data. |

### getMetafileHeader() {#getMetafileHeader--}
```
public MetafileHeader getMetafileHeader()
```


Returns the [MetafileHeader](../../com.aspose.drawing.imaging/metafileheader) associated with this [Metafile](../../com.aspose.drawing.imaging/metafile).

**Returns:**
[MetafileHeader](../../com.aspose.drawing.imaging/metafileheader) - The [MetafileHeader](../../com.aspose.drawing.imaging/metafileheader) associated with this [Metafile](../../com.aspose.drawing.imaging/metafile).
### getPropertyItem(int propid) {#getPropertyItem-int-}
```
public PropertyItem getPropertyItem(int propid)
```


Gets the specified property item from this [Image](../../com.aspose.drawing/image).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| propid | int | The ID of the property item to get. |

**Returns:**
[PropertyItem](../../com.aspose.drawing.imaging/propertyitem) - The [PropertyItem](../../com.aspose.drawing.imaging/propertyitem) this method gets.
### removePropertyItem(int propid) {#removePropertyItem-int-}
```
public void removePropertyItem(int propid)
```


Removes the specified property item from this [Image](../../com.aspose.drawing/image).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| propid | int | The ID of the property item to remove. |

### setPropertyItem(PropertyItem propitem) {#setPropertyItem-com.aspose.drawing.imaging.PropertyItem-}
```
public void setPropertyItem(PropertyItem propitem)
```


Stores a property item (piece of metadata) in this [Image](../../com.aspose.drawing/image).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| propitem | [PropertyItem](../../com.aspose.drawing.imaging/propertyitem) | The [PropertyItem](../../com.aspose.drawing.imaging/propertyitem) to be stored. |

