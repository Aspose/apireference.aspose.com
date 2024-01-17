---
title: BitmapData
second_title: Aspose.Drawing for Java API Reference
description: Specifies the attributes of a bitmap image.
type: docs
weight: 10
url: /java/com.aspose.drawing.imaging/bitmapdata/
---
**Inheritance:**
java.lang.Object
```
public final class BitmapData
```

Specifies the attributes of a bitmap image. The [BitmapData](../../com.aspose.drawing.imaging/bitmapdata) class is used by the `E:Bitmap.LockBits` and `M:Bitmap.UnlockBits(BitmapData)` methods of the [Bitmap](../../com.aspose.drawing/bitmap) class. Not inheritable.
## Constructors

| Constructor | Description |
| --- | --- |
| [BitmapData()](#BitmapData--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getWidth()](#getWidth--) | Gets the pixel width of the [Bitmap](../../com.aspose.drawing/bitmap) object. |
| [setWidth(int value)](#setWidth-int-) | Sets the pixel width of the [Bitmap](../../com.aspose.drawing/bitmap) object. |
| [getHeight()](#getHeight--) | Gets the pixel height of the [Bitmap](../../com.aspose.drawing/bitmap) object. |
| [setHeight(int value)](#setHeight-int-) | Sets the pixel height of the [Bitmap](../../com.aspose.drawing/bitmap) object. |
| [getStride()](#getStride--) | Gets the stride width (also called scan width) of the [Bitmap](../../com.aspose.drawing/bitmap) object. |
| [setStride(int value)](#setStride-int-) | Sets the stride width (also called scan width) of the [Bitmap](../../com.aspose.drawing/bitmap) object. |
| [getPixelFormat()](#getPixelFormat--) | Gets the format of the pixel information in the [Bitmap](../../com.aspose.drawing/bitmap) object that returned this [BitmapData](../../com.aspose.drawing.imaging/bitmapdata) object. |
| [setPixelFormat(int value)](#setPixelFormat-int-) | Sets the format of the pixel information in the [Bitmap](../../com.aspose.drawing/bitmap) object that returned this [BitmapData](../../com.aspose.drawing.imaging/bitmapdata) object. |
| [getScan0()](#getScan0--) | Gets the address of the first pixel data in the bitmap. |
| [setScan0(int[] value)](#setScan0-int---) | Sets the address of the first pixel data in the bitmap. |
### BitmapData() {#BitmapData--}
```
public BitmapData()
```


### getWidth() {#getWidth--}
```
public int getWidth()
```


Gets the pixel width of the [Bitmap](../../com.aspose.drawing/bitmap) object. This can also be thought of as the number of pixels in one scan line.

**Returns:**
int - The pixel width of the [Bitmap](../../com.aspose.drawing/bitmap) object.
### setWidth(int value) {#setWidth-int-}
```
public void setWidth(int value)
```


Sets the pixel width of the [Bitmap](../../com.aspose.drawing/bitmap) object. This can also be thought of as the number of pixels in one scan line.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the pixel width of the [Bitmap](../../com.aspose.drawing/bitmap) object. |

### getHeight() {#getHeight--}
```
public int getHeight()
```


Gets the pixel height of the [Bitmap](../../com.aspose.drawing/bitmap) object. Also sometimes referred to as the number of scan lines.

**Returns:**
int - The pixel height of the [Bitmap](../../com.aspose.drawing/bitmap) object.
### setHeight(int value) {#setHeight-int-}
```
public void setHeight(int value)
```


Sets the pixel height of the [Bitmap](../../com.aspose.drawing/bitmap) object. Also sometimes referred to as the number of scan lines.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the pixel height of the [Bitmap](../../com.aspose.drawing/bitmap) object. |

### getStride() {#getStride--}
```
public int getStride()
```


Gets the stride width (also called scan width) of the [Bitmap](../../com.aspose.drawing/bitmap) object.

**Returns:**
int - The stride width, in bytes, of the [Bitmap](../../com.aspose.drawing/bitmap) object.
### setStride(int value) {#setStride-int-}
```
public void setStride(int value)
```


Sets the stride width (also called scan width) of the [Bitmap](../../com.aspose.drawing/bitmap) object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the stride width (also called scan width) of the [Bitmap](../../com.aspose.drawing/bitmap) object. |

### getPixelFormat() {#getPixelFormat--}
```
public int getPixelFormat()
```


Gets the format of the pixel information in the [Bitmap](../../com.aspose.drawing/bitmap) object that returned this [BitmapData](../../com.aspose.drawing.imaging/bitmapdata) object.

**Returns:**
int - A `PixelFormat`([.getPixelFormat](../../null/\#getPixelFormat)/[.setPixelFormat(int)](../../null/\#setPixelFormat-int-)) that specifies the format of the pixel information in the associated [Bitmap](../../com.aspose.drawing/bitmap) object.
### setPixelFormat(int value) {#setPixelFormat-int-}
```
public void setPixelFormat(int value)
```


Sets the format of the pixel information in the [Bitmap](../../com.aspose.drawing/bitmap) object that returned this [BitmapData](../../com.aspose.drawing.imaging/bitmapdata) object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the format of the pixel information in the [Bitmap](../../com.aspose.drawing/bitmap) object that returned this [BitmapData](../../com.aspose.drawing.imaging/bitmapdata) object. |

### getScan0() {#getScan0--}
```
public int[] getScan0()
```


Gets the address of the first pixel data in the bitmap. This can also be thought of as the first scan line in the bitmap.

**Returns:**
int[] - The address of the first pixel data in the bitmap.
### setScan0(int[] value) {#setScan0-int---}
```
public void setScan0(int[] value)
```


Sets the address of the first pixel data in the bitmap. This can also be thought of as the first scan line in the bitmap.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int[] | the address of the first pixel data in the bitmap. |

