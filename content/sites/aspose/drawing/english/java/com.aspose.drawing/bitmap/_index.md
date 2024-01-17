---
title: Bitmap
second_title: Aspose.Drawing for Java API Reference
description: Encapsulates a bitmap which consists of the pixel data for a graphics image and its attributes.
type: docs
weight: 10
url: /java/com.aspose.drawing/bitmap/
---
**Inheritance:**
java.lang.Object, [com.aspose.drawing.Image](../../com.aspose.drawing/image)
```
public class Bitmap extends Image
```

Encapsulates a bitmap, which consists of the pixel data for a graphics image and its attributes. A [Bitmap](../../com.aspose.drawing/bitmap) is an object used to work with images defined by pixel data.
## Constructors

| Constructor | Description |
| --- | --- |
| [Bitmap(int width, int height)](#Bitmap-int-int-) | Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class with the specified size. |
| [Bitmap(String filename)](#Bitmap-java.lang.String-) | Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class from the specified file. |
| [Bitmap(String filename, boolean useIcm)](#Bitmap-java.lang.String-boolean-) | Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class from the specified file. |
| [Bitmap(InputStream stream)](#Bitmap-java.io.InputStream-) | Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class from the specified data stream. |
| [Bitmap(InputStream stream, boolean useIcm)](#Bitmap-java.io.InputStream-boolean-) | Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class from the specified data stream. |
| [Bitmap(int width, int height, int format)](#Bitmap-int-int-int-) | Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class with the specified size and format. |
| [Bitmap(int width, int height, int stride, int format, int[] data)](#Bitmap-int-int-int-int-int---) | Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class with the specified size and pixel data. |
| [Bitmap(Image original)](#Bitmap-com.aspose.drawing.Image-) | Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class from the specified existing image. |
| [Bitmap(Image original, Size newSize)](#Bitmap-com.aspose.drawing.Image-com.aspose.drawing.Size-) | Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class from the specified existing image, scaled to the specified size. |
| [Bitmap(Image original, int width, int height)](#Bitmap-com.aspose.drawing.Image-int-int-) | Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class from the specified existing image, scaled to the specified size. |
## Methods

| Method | Description |
| --- | --- |
| [getWidth()](#getWidth--) | Gets the width, in pixels, of this Bitmap. |
| [getHeight()](#getHeight--) | Gets the height, in pixels, of this Bitmap. |
| [getRawFormat()](#getRawFormat--) | Gets the file format of this [Image](../../com.aspose.drawing/image). |
| [getPixelFormat()](#getPixelFormat--) | Gets the pixel format for this [Image](../../com.aspose.drawing/image). |
| [getPalette()](#getPalette--) | Gets the color palette used for this [Image](../../com.aspose.drawing/image). |
| [setPalette(ColorPalette value)](#setPalette-com.aspose.drawing.imaging.ColorPalette-) | Sets the color palette used for this [Image](../../com.aspose.drawing/image). |
| [getFrameDimensionsList()](#getFrameDimensionsList--) | Gets an array of GUIDs that represent the dimensions of frames within this [Image](../../com.aspose.drawing/image). |
| [getPropertyIdList()](#getPropertyIdList--) | Gets IDs of the property items stored in this [Image](../../com.aspose.drawing/image). |
| [getPropertyItems()](#getPropertyItems--) | Gets all the property items (pieces of metadata) stored in this [Image](../../com.aspose.drawing/image). |
| [deepClone(Rectangle rect, int format)](#deepClone-com.aspose.drawing.Rectangle-int-) | Creates a copy of the section of this [Bitmap](../../com.aspose.drawing/bitmap) defined by [Rectangle](../../com.aspose.drawing/rectangle) structure and with a specified `PixelFormat`([Image.getPixelFormat](../../com.aspose.drawing/image\#getPixelFormat)) enumeration. |
| [deepClone(RectangleF rect, int format)](#deepClone-com.aspose.drawing.RectangleF-int-) | Creates a copy of the section of this [Bitmap](../../com.aspose.drawing/bitmap) defined with a specified ImagingPixelFormat enumeration. |
| [setResolution(float xDpi, float yDpi)](#setResolution-float-float-) | Sets the resolution for this [Bitmap](../../com.aspose.drawing/bitmap). |
| [lockBits(Rectangle rect, int flags, int format)](#lockBits-com.aspose.drawing.Rectangle-int-int-) | Locks a [Bitmap](../../com.aspose.drawing/bitmap) into system memory. |
| [unlockBits(BitmapData bitmapData)](#unlockBits-com.aspose.drawing.imaging.BitmapData-) | Unlocks this [Bitmap](../../com.aspose.drawing/bitmap) from system memory. |
| [getPixel(int x, int y)](#getPixel-int-int-) | Gets the color of the specified pixel in this [Bitmap](../../com.aspose.drawing/bitmap). |
| [setPixel(int x, int y, Color color)](#setPixel-int-int-com.aspose.drawing.Color-) | Sets the color of the specified pixel in this [Bitmap](../../com.aspose.drawing/bitmap). |
| [readArgb32Pixels(int[] pixels)](#readArgb32Pixels-int---) | Reads bitmap pixels in ARGB32 format into given array. |
| [writeArgb32Pixels(int[] pixels)](#writeArgb32Pixels-int---) | Writes pixels to the bitmap. |
| [makeTransparent()](#makeTransparent--) | Makes the specified color transparent for this [Bitmap](../../com.aspose.drawing/bitmap). |
| [makeTransparent(Color transparentColor)](#makeTransparent-com.aspose.drawing.Color-) | Makes the specified color transparent for this [Bitmap](../../com.aspose.drawing/bitmap). |
| [rotateFlip(int rotateFlipType)](#rotateFlip-int-) | This method rotates, flips, or rotates and flips the [Image](../../com.aspose.drawing/image). |
| [getPropertyItem(int propid)](#getPropertyItem-int-) | Gets the specified property item from this [Image](../../com.aspose.drawing/image). |
| [removePropertyItem(int propid)](#removePropertyItem-int-) | Removes the specified property item from this [Image](../../com.aspose.drawing/image). |
| [setPropertyItem(PropertyItem propitem)](#setPropertyItem-com.aspose.drawing.imaging.PropertyItem-) | Stores a property item (piece of metadata) in this [Image](../../com.aspose.drawing/image). |
### Bitmap(int width, int height) {#Bitmap-int-int-}
```
public Bitmap(int width, int height)
```


Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class with the specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | int | The width, in pixels, of the new Bitmap. |
| height | int | The height, in pixels, of the new Bitmap.

--------------------

The only supported internal bitmap format at the moment is equivalent to `PixelFormat.Format32bppPArgb`. |

### Bitmap(String filename) {#Bitmap-java.lang.String-}
```
public Bitmap(String filename)
```


Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class from the specified file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| filename | java.lang.String | The name of the bitmap file. |

### Bitmap(String filename, boolean useIcm) {#Bitmap-java.lang.String-boolean-}
```
public Bitmap(String filename, boolean useIcm)
```


Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class from the specified file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| filename | java.lang.String | The name of the bitmap file. |
| useIcm | boolean | true to use color correction for this [Bitmap](../../com.aspose.drawing/bitmap); otherwise, false. |

### Bitmap(InputStream stream) {#Bitmap-java.io.InputStream-}
```
public Bitmap(InputStream stream)
```


Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class from the specified data stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | The data stream used to load the image. |

### Bitmap(InputStream stream, boolean useIcm) {#Bitmap-java.io.InputStream-boolean-}
```
public Bitmap(InputStream stream, boolean useIcm)
```


Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class from the specified data stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | The data stream used to load the image. |
| useIcm | boolean | `true` to use color correction for this [Bitmap](../../com.aspose.drawing/bitmap); otherwise, `false`. |

### Bitmap(int width, int height, int format) {#Bitmap-int-int-int-}
```
public Bitmap(int width, int height, int format)
```


Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class with the specified size and format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | int | The width, in pixels, of the new [Bitmap](../../com.aspose.drawing/bitmap). |
| height | int | The height, in pixels, of the new [Bitmap](../../com.aspose.drawing/bitmap). |
| format | int | The `PixelFormat`([Image.getPixelFormat](../../com.aspose.drawing/image\#getPixelFormat)) enumeration for the new [Bitmap](../../com.aspose.drawing/bitmap). |

### Bitmap(int width, int height, int stride, int format, int[] data) {#Bitmap-int-int-int-int-int---}
```
public Bitmap(int width, int height, int stride, int format, int[] data)
```


Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class with the specified size and pixel data.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| width | int | The width, in pixels, of the new [Bitmap](../../com.aspose.drawing/bitmap). |
| height | int | The height, in pixels, of the new [Bitmap](../../com.aspose.drawing/bitmap). |
| stride | int | The byte offset between the beginning of one scan line and the next, must be a multiple of four. |
| format | int | The `PixelFormat`([Image.getPixelFormat](../../com.aspose.drawing/image\#getPixelFormat)) enumeration for the new [Bitmap](../../com.aspose.drawing/bitmap). |
| data | int[] | The pixel data. |

### Bitmap(Image original) {#Bitmap-com.aspose.drawing.Image-}
```
public Bitmap(Image original)
```


Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class from the specified existing image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| original | [Image](../../com.aspose.drawing/image) | The [Image](../../com.aspose.drawing/image) from which to create the new [Bitmap](../../com.aspose.drawing/bitmap). |

### Bitmap(Image original, Size newSize) {#Bitmap-com.aspose.drawing.Image-com.aspose.drawing.Size-}
```
public Bitmap(Image original, Size newSize)
```


Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class from the specified existing image, scaled to the specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| original | [Image](../../com.aspose.drawing/image) | The [Image](../../com.aspose.drawing/image) from which to create the new [Bitmap](../../com.aspose.drawing/bitmap) |
| newSize | [Size](../../com.aspose.drawing/size) | The `Size`([Image.getSize](../../com.aspose.drawing/image\#getSize)) structure that represent the size of the new [Bitmap](../../com.aspose.drawing/bitmap). |

### Bitmap(Image original, int width, int height) {#Bitmap-com.aspose.drawing.Image-int-int-}
```
public Bitmap(Image original, int width, int height)
```


Initializes a new instance of the [Bitmap](../../com.aspose.drawing/bitmap) class from the specified existing image, scaled to the specified size.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| original | [Image](../../com.aspose.drawing/image) | The [Image](../../com.aspose.drawing/image) from which to create the new [Bitmap](../../com.aspose.drawing/bitmap). |
| width | int | The width, in pixels, of the new [Bitmap](../../com.aspose.drawing/bitmap). |
| height | int | The height, in pixels, of the new [Bitmap](../../com.aspose.drawing/bitmap). |

### getWidth() {#getWidth--}
```
public int getWidth()
```


Gets the width, in pixels, of this Bitmap.

**Returns:**
int - the width, in pixels, of this Bitmap.
### getHeight() {#getHeight--}
```
public int getHeight()
```


Gets the height, in pixels, of this Bitmap.

**Returns:**
int - the height, in pixels, of this Bitmap.
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


Gets the color palette used for this [Image](../../com.aspose.drawing/image).

**Returns:**
[ColorPalette](../../com.aspose.drawing.imaging/colorpalette) - A [ColorPalette](../../com.aspose.drawing.imaging/colorpalette) that represents the color palette used for this [Image](../../com.aspose.drawing/image).
### setPalette(ColorPalette value) {#setPalette-com.aspose.drawing.imaging.ColorPalette-}
```
public void setPalette(ColorPalette value)
```


Sets the color palette used for this [Image](../../com.aspose.drawing/image).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ColorPalette](../../com.aspose.drawing.imaging/colorpalette) | the color palette used for this [Image](../../com.aspose.drawing/image). |

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
### deepClone(Rectangle rect, int format) {#deepClone-com.aspose.drawing.Rectangle-int-}
```
public final Bitmap deepClone(Rectangle rect, int format)
```


Creates a copy of the section of this [Bitmap](../../com.aspose.drawing/bitmap) defined by [Rectangle](../../com.aspose.drawing/rectangle) structure and with a specified `PixelFormat`([Image.getPixelFormat](../../com.aspose.drawing/image\#getPixelFormat)) enumeration.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | Defines the portion of this [Bitmap](../../com.aspose.drawing/bitmap) to copy. Coordinates are relative to this [Bitmap](../../com.aspose.drawing/bitmap). |
| format | int | Specifies the `PixelFormat`([Image.getPixelFormat](../../com.aspose.drawing/image\#getPixelFormat)) enumeration for the destination [Bitmap](../../com.aspose.drawing/bitmap). |

**Returns:**
[Bitmap](../../com.aspose.drawing/bitmap) - The new [Bitmap](../../com.aspose.drawing/bitmap) that this method creates.
### deepClone(RectangleF rect, int format) {#deepClone-com.aspose.drawing.RectangleF-int-}
```
public final Bitmap deepClone(RectangleF rect, int format)
```


Creates a copy of the section of this [Bitmap](../../com.aspose.drawing/bitmap) defined with a specified ImagingPixelFormat enumeration.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | Defines the portion of this [Bitmap](../../com.aspose.drawing/bitmap) to copy. |
| format | int | Specifies the ImagingPixelFormat enumeration for the destination [Bitmap](../../com.aspose.drawing/bitmap). |

**Returns:**
[Bitmap](../../com.aspose.drawing/bitmap) - The [Bitmap](../../com.aspose.drawing/bitmap) that this method creates.
### setResolution(float xDpi, float yDpi) {#setResolution-float-float-}
```
public final void setResolution(float xDpi, float yDpi)
```


Sets the resolution for this [Bitmap](../../com.aspose.drawing/bitmap).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| xDpi | float | The horizontal resolution, in dots per inch, of the [Bitmap](../../com.aspose.drawing/bitmap). |
| yDpi | float | The vertical resolution, in dots per inch, of the [Bitmap](../../com.aspose.drawing/bitmap). |

### lockBits(Rectangle rect, int flags, int format) {#lockBits-com.aspose.drawing.Rectangle-int-int-}
```
public final BitmapData lockBits(Rectangle rect, int flags, int format)
```


Locks a [Bitmap](../../com.aspose.drawing/bitmap) into system memory.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | A [Rectangle](../../com.aspose.drawing/rectangle) structure specifying the portion of the [Bitmap](../../com.aspose.drawing/bitmap) to lock. |
| flags | int | An [ImageLockMode](../../com.aspose.drawing.imaging/imagelockmode) enumeration specifying the access level (read/write) for the [Bitmap](../../com.aspose.drawing/bitmap). |
| format | int | A `PixelFormat`([Image.getPixelFormat](../../com.aspose.drawing/image\#getPixelFormat)) enumeration specifying the data format of this [Bitmap](../../com.aspose.drawing/bitmap). |

**Returns:**
[BitmapData](../../com.aspose.drawing.imaging/bitmapdata) - A [BitmapData](../../com.aspose.drawing.imaging/bitmapdata) containing information about this lock operation.
### unlockBits(BitmapData bitmapData) {#unlockBits-com.aspose.drawing.imaging.BitmapData-}
```
public final void unlockBits(BitmapData bitmapData)
```


Unlocks this [Bitmap](../../com.aspose.drawing/bitmap) from system memory.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| bitmapData | [BitmapData](../../com.aspose.drawing.imaging/bitmapdata) | A [BitmapData](../../com.aspose.drawing.imaging/bitmapdata) specifying information about the lock operation. |

### getPixel(int x, int y) {#getPixel-int-int-}
```
public final Color getPixel(int x, int y)
```


Gets the color of the specified pixel in this [Bitmap](../../com.aspose.drawing/bitmap).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | int | The x-coordinate of the pixel to retrieve. |
| y | int | The y-coordinate of the pixel to retrieve. |

**Returns:**
[Color](../../com.aspose.drawing/color) - A [Color](../../com.aspose.drawing/color) structure that represents the color of the specified pixel.
### setPixel(int x, int y, Color color) {#setPixel-int-int-com.aspose.drawing.Color-}
```
public final void setPixel(int x, int y, Color color)
```


Sets the color of the specified pixel in this [Bitmap](../../com.aspose.drawing/bitmap).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | int | The x-coordinate of the pixel to set. |
| y | int | The y-coordinate of the pixel to set. |
| color | [Color](../../com.aspose.drawing/color) | A [Color](../../com.aspose.drawing/color) structure that represents the color to assign to the specified pixel. |

### readArgb32Pixels(int[] pixels) {#readArgb32Pixels-int---}
```
public final void readArgb32Pixels(int[] pixels)
```


Reads bitmap pixels in ARGB32 format into given array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pixels | int[] | Array to place bitmap pixels. Must have enough capacity. |

### writeArgb32Pixels(int[] pixels) {#writeArgb32Pixels-int---}
```
public final void writeArgb32Pixels(int[] pixels)
```


Writes pixels to the bitmap.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pixels | int[] | Array with source pixels in ARGB32 format. Must have enough length. |

### makeTransparent() {#makeTransparent--}
```
public final void makeTransparent()
```


Makes the specified color transparent for this [Bitmap](../../com.aspose.drawing/bitmap).

### makeTransparent(Color transparentColor) {#makeTransparent-com.aspose.drawing.Color-}
```
public final void makeTransparent(Color transparentColor)
```


Makes the specified color transparent for this [Bitmap](../../com.aspose.drawing/bitmap).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| transparentColor | [Color](../../com.aspose.drawing/color) | The [Color](../../com.aspose.drawing/color) structure that represents the color to make transparent. |

### rotateFlip(int rotateFlipType) {#rotateFlip-int-}
```
public void rotateFlip(int rotateFlipType)
```


This method rotates, flips, or rotates and flips the [Image](../../com.aspose.drawing/image).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rotateFlipType | int | A [RotateFlipType](../../com.aspose.drawing/rotatefliptype) member that specifies the type of rotation and flip to apply to the image. |

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

