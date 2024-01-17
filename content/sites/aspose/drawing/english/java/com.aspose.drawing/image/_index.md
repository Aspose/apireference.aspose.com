---
title: Image
second_title: Aspose.Drawing for Java API Reference
description: An abstract base class that provides functionality for the Bitmap and Metafile descended classes.
type: docs
weight: 29
url: /java/com.aspose.drawing/image/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.ms.System.IDisposable
```
public abstract class Image implements System.IDisposable
```

An abstract base class that provides functionality for the Bitmap and Metafile descended classes.
## Constructors

| Constructor | Description |
| --- | --- |
| [Image()](#Image--) | Initializes a new instance of the [Image](../../com.aspose.drawing/image) class. |
## Methods

| Method | Description |
| --- | --- |
| [fromFile(String filename)](#fromFile-java.lang.String-) | Creates an [Image](../../com.aspose.drawing/image) from the specified file. |
| [fromStream(InputStream stream)](#fromStream-java.io.InputStream-) | Creates an [Image](../../com.aspose.drawing/image) from the specified data stream. |
| [fromStream(InputStream stream, boolean useEmbeddedColorManagement)](#fromStream-java.io.InputStream-boolean-) | Creates an [Image](../../com.aspose.drawing/image) from the specified data stream, optionally using embedded color management information in that stream. |
| [fromHbitmap(byte[] hbitmap)](#fromHbitmap-byte---) | Creates a [Bitmap](../../com.aspose.drawing/bitmap) from a handle to a GDI bitmap. |
| [getPixelFormatSize(int pixfmt)](#getPixelFormatSize-int-) | Returns the color depth, in number of bits per pixel, of the specified pixel format. |
| [isAlphaPixelFormat(int pixfmt)](#isAlphaPixelFormat-int-) | Returns a value that indicates whether the pixel format for this [Image](../../com.aspose.drawing/image) contains alpha information. |
| [getWidth()](#getWidth--) | Gets the width, in pixels, of this [Image](../../com.aspose.drawing/image). |
| [getHeight()](#getHeight--) | Gets the height, in pixels, of this [Image](../../com.aspose.drawing/image). |
| [getSize()](#getSize--) | Gets the width and height, in pixels, of this image. |
| [getHorizontalResolution()](#getHorizontalResolution--) | Gets the horizontal resolution, in pixels per inch, of this [Image](../../com.aspose.drawing/image). |
| [getVerticalResolution()](#getVerticalResolution--) | Gets the vertical resolution, in pixels per inch, of this [Image](../../com.aspose.drawing/image). |
| [getRawFormat()](#getRawFormat--) | Gets the file format of this [Image](../../com.aspose.drawing/image). |
| [getPixelFormat()](#getPixelFormat--) | Gets the pixel format for this [Image](../../com.aspose.drawing/image). |
| [getPalette()](#getPalette--) | Gets the color palette used for this [Image](../../com.aspose.drawing/image). |
| [setPalette(ColorPalette value)](#setPalette-com.aspose.drawing.imaging.ColorPalette-) | Sets the color palette used for this [Image](../../com.aspose.drawing/image). |
| [getPhysicalDimension()](#getPhysicalDimension--) | Gets the width and height of this image. |
| [getFrameDimensionsList()](#getFrameDimensionsList--) | Gets an array of GUIDs that represent the dimensions of frames within this [Image](../../com.aspose.drawing/image). |
| [getFlags()](#getFlags--) | Gets the integer representing a bitwise combination of [ImageFlags](../../com.aspose.drawing.imaging/imageflags) for this Image. |
| [getPropertyIdList()](#getPropertyIdList--) | Gets IDs of the property items stored in this [Image](../../com.aspose.drawing/image). |
| [getPropertyItems()](#getPropertyItems--) | Gets all the property items (pieces of metadata) stored in this [Image](../../com.aspose.drawing/image). |
| [getTag()](#getTag--) | Gets an object that provides additional data about the image. |
| [setTag(Object value)](#setTag-java.lang.Object-) | Sets an object that provides additional data about the image. |
| [getThumbnailImage(int thumbWidth, int thumbHeight, Image.GetThumbnailImageAbort callback, byte[] callbackData)](#getThumbnailImage-int-int-com.aspose.drawing.Image.GetThumbnailImageAbort-byte---) | Returns a thumbnail for this [Image](../../com.aspose.drawing/image). |
| [dispose()](#dispose--) | Releases all resources used by this Image. |
| [deepClone()](#deepClone--) | Creates an exact copy of this [Image](../../com.aspose.drawing/image). |
| [getBounds(int[] pageUnit)](#getBounds-int---) | Gets the bounds of the image in the specified unit. |
| [getFrameCount(FrameDimension dimension)](#getFrameCount-com.aspose.drawing.imaging.FrameDimension-) | Returns the number of frames of the specified dimension. |
| [save(String filename)](#save-java.lang.String-) | Saves this [Image](../../com.aspose.drawing/image) to the specified file or stream. |
| [save(String filename, int format)](#save-java.lang.String-int-) | Saves this [Image](../../com.aspose.drawing/image) to the specified file in the specified format. |
| [save(String filename, ImageCodecInfo encoder, EncoderParameters encoderParams)](#save-java.lang.String-com.aspose.drawing.imaging.ImageCodecInfo-com.aspose.drawing.imaging.EncoderParameters-) | Saves this [Image](../../com.aspose.drawing/image) to the specified file, with the specified encoder and image-encoder parameters. |
| [save(OutputStream stream, int format)](#save-java.io.OutputStream-int-) | Saves this image to the specified stream in the specified format. |
| [save(OutputStream stream, ImageCodecInfo encoder, EncoderParameters encoderParams)](#save-java.io.OutputStream-com.aspose.drawing.imaging.ImageCodecInfo-com.aspose.drawing.imaging.EncoderParameters-) | Saves this image to the specified stream, with the specified encoder and image encoder parameters. |
| [saveAdd(EncoderParameters encoderParams)](#saveAdd-com.aspose.drawing.imaging.EncoderParameters-) | Adds a frame to the file or stream specified in a previous call to the one of Image.Save(...) methods. |
| [saveAdd(Image image, EncoderParameters encoderParams)](#saveAdd-com.aspose.drawing.Image-com.aspose.drawing.imaging.EncoderParameters-) | Adds a frame to the file or stream specified in a previous call to the one of Image.Save(...) methods. |
| [rotateFlip(int rotateFlipType)](#rotateFlip-int-) | This method rotates, flips, or rotates and flips the [Image](../../com.aspose.drawing/image). |
| [selectActiveFrame(FrameDimension dimension, int frameIndex)](#selectActiveFrame-com.aspose.drawing.imaging.FrameDimension-int-) | Selects the frame specified by the dimension and index. |
| [getPropertyItem(int propid)](#getPropertyItem-int-) | Gets the specified property item from this [Image](../../com.aspose.drawing/image). |
| [removePropertyItem(int propid)](#removePropertyItem-int-) | Removes the specified property item from this [Image](../../com.aspose.drawing/image). |
| [setPropertyItem(PropertyItem propitem)](#setPropertyItem-com.aspose.drawing.imaging.PropertyItem-) | Stores a property item (piece of metadata) in this [Image](../../com.aspose.drawing/image). |
### Image() {#Image--}
```
public Image()
```


Initializes a new instance of the [Image](../../com.aspose.drawing/image) class.

### fromFile(String filename) {#fromFile-java.lang.String-}
```
public static Image fromFile(String filename)
```


Creates an [Image](../../com.aspose.drawing/image) from the specified file.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| filename | java.lang.String | A string that contains the name of the file from which to create the [Image](../../com.aspose.drawing/image). |

**Returns:**
[Image](../../com.aspose.drawing/image) - The [Image](../../com.aspose.drawing/image) this method creates.
### fromStream(InputStream stream) {#fromStream-java.io.InputStream-}
```
public static Image fromStream(InputStream stream)
```


Creates an [Image](../../com.aspose.drawing/image) from the specified data stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | A java.io.InputStream that contains the data for this [Image](../../com.aspose.drawing/image). |

**Returns:**
[Image](../../com.aspose.drawing/image) - The [Image](../../com.aspose.drawing/image) this method creates.
### fromStream(InputStream stream, boolean useEmbeddedColorManagement) {#fromStream-java.io.InputStream-boolean-}
```
public static Image fromStream(InputStream stream, boolean useEmbeddedColorManagement)
```


Creates an [Image](../../com.aspose.drawing/image) from the specified data stream, optionally using embedded color management information in that stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | A java.io.InputStream that contains the data for this [Image](../../com.aspose.drawing/image). |
| useEmbeddedColorManagement | boolean | true to use color management information embedded in the data stream; otherwise, false. |

**Returns:**
[Image](../../com.aspose.drawing/image) - The [Image](../../com.aspose.drawing/image) this method creates.
### fromHbitmap(byte[] hbitmap) {#fromHbitmap-byte---}
```
public static Bitmap fromHbitmap(byte[] hbitmap)
```


Creates a [Bitmap](../../com.aspose.drawing/bitmap) from a handle to a GDI bitmap.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| hbitmap | byte[] | The GDI bitmap handle from which to create the [Bitmap](../../com.aspose.drawing/bitmap). |

**Returns:**
[Bitmap](../../com.aspose.drawing/bitmap) - The [Bitmap](../../com.aspose.drawing/bitmap) this method creates.
### getPixelFormatSize(int pixfmt) {#getPixelFormatSize-int-}
```
public static int getPixelFormatSize(int pixfmt)
```


Returns the color depth, in number of bits per pixel, of the specified pixel format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pixfmt | int | The `PixelFormat`([.getPixelFormat](../../null/\#getPixelFormat)) member that specifies the format for which to find the size. |

**Returns:**
int - The color depth of the specified pixel format.
### isAlphaPixelFormat(int pixfmt) {#isAlphaPixelFormat-int-}
```
public static boolean isAlphaPixelFormat(int pixfmt)
```


Returns a value that indicates whether the pixel format for this [Image](../../com.aspose.drawing/image) contains alpha information.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pixfmt | int | The `PixelFormat`([.getPixelFormat](../../null/\#getPixelFormat)) to test. |

**Returns:**
boolean - true if `pixfmt` contains alpha information; otherwise, false.
### getWidth() {#getWidth--}
```
public abstract int getWidth()
```


Gets the width, in pixels, of this [Image](../../com.aspose.drawing/image).

**Returns:**
int - the width, in pixels, of this [Image](../../com.aspose.drawing/image).
### getHeight() {#getHeight--}
```
public abstract int getHeight()
```


Gets the height, in pixels, of this [Image](../../com.aspose.drawing/image).

**Returns:**
int - the height, in pixels, of this [Image](../../com.aspose.drawing/image).
### getSize() {#getSize--}
```
public final Size getSize()
```


Gets the width and height, in pixels, of this image.

**Returns:**
[Size](../../com.aspose.drawing/size) - A `Size`([.getSize](../../null/\#getSize)) structure that represents the width and height, in pixels, of this image.
### getHorizontalResolution() {#getHorizontalResolution--}
```
public final float getHorizontalResolution()
```


Gets the horizontal resolution, in pixels per inch, of this [Image](../../com.aspose.drawing/image).

**Returns:**
float - the horizontal resolution, in pixels per inch, of this [Image](../../com.aspose.drawing/image).
### getVerticalResolution() {#getVerticalResolution--}
```
public final float getVerticalResolution()
```


Gets the vertical resolution, in pixels per inch, of this [Image](../../com.aspose.drawing/image).

**Returns:**
float - the vertical resolution, in pixels per inch, of this [Image](../../com.aspose.drawing/image).
### getRawFormat() {#getRawFormat--}
```
public abstract ImageFormat getRawFormat()
```


Gets the file format of this [Image](../../com.aspose.drawing/image).

**Returns:**
[ImageFormat](../../com.aspose.drawing.imaging/imageformat) - The [ImageFormat](../../com.aspose.drawing.imaging/imageformat) that represents the file format of this [Image](../../com.aspose.drawing/image).
### getPixelFormat() {#getPixelFormat--}
```
public abstract int getPixelFormat()
```


Gets the pixel format for this [Image](../../com.aspose.drawing/image).

**Returns:**
int - A `PixelFormat`([.getPixelFormat](../../null/\#getPixelFormat)) that represents the pixel format for this [Image](../../com.aspose.drawing/image).
### getPalette() {#getPalette--}
```
public abstract ColorPalette getPalette()
```


Gets the color palette used for this [Image](../../com.aspose.drawing/image).

**Returns:**
[ColorPalette](../../com.aspose.drawing.imaging/colorpalette) - A [ColorPalette](../../com.aspose.drawing.imaging/colorpalette) that represents the color palette used for this [Image](../../com.aspose.drawing/image).
### setPalette(ColorPalette value) {#setPalette-com.aspose.drawing.imaging.ColorPalette-}
```
public abstract void setPalette(ColorPalette value)
```


Sets the color palette used for this [Image](../../com.aspose.drawing/image).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ColorPalette](../../com.aspose.drawing.imaging/colorpalette) | the color palette used for this [Image](../../com.aspose.drawing/image). |

### getPhysicalDimension() {#getPhysicalDimension--}
```
public final SizeF getPhysicalDimension()
```


Gets the width and height of this image.

**Returns:**
[SizeF](../../com.aspose.drawing/sizef) - A [SizeF](../../com.aspose.drawing/sizef) structure that represents the width and height of this [Image](../../com.aspose.drawing/image).
### getFrameDimensionsList() {#getFrameDimensionsList--}
```
public UUID[] getFrameDimensionsList()
```


Gets an array of GUIDs that represent the dimensions of frames within this [Image](../../com.aspose.drawing/image).

**Returns:**
java.util.UUID[] - An array of GUIDs that specify the dimensions of frames within this [Image](../../com.aspose.drawing/image) from most significant to least significant.
### getFlags() {#getFlags--}
```
public final int getFlags()
```


Gets the integer representing a bitwise combination of [ImageFlags](../../com.aspose.drawing.imaging/imageflags) for this Image.

**Returns:**
int - the integer representing a bitwise combination of [ImageFlags](../../com.aspose.drawing.imaging/imageflags) for this Image.
### getPropertyIdList() {#getPropertyIdList--}
```
public abstract int[] getPropertyIdList()
```


Gets IDs of the property items stored in this [Image](../../com.aspose.drawing/image).

**Returns:**
int[] - An array of the property IDs, one for each property item stored in this image.
### getPropertyItems() {#getPropertyItems--}
```
public abstract PropertyItem[] getPropertyItems()
```


Gets all the property items (pieces of metadata) stored in this [Image](../../com.aspose.drawing/image).

**Returns:**
com.aspose.drawing.imaging.PropertyItem[] - An array of [PropertyItem](../../com.aspose.drawing.imaging/propertyitem) objects, one for each property item stored in the image.
### getTag() {#getTag--}
```
public final Object getTag()
```


Gets an object that provides additional data about the image.

**Returns:**
java.lang.Object - an object that provides additional data about the image.
### setTag(Object value) {#setTag-java.lang.Object-}
```
public final void setTag(Object value)
```


Sets an object that provides additional data about the image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.Object | an object that provides additional data about the image. |

### getThumbnailImage(int thumbWidth, int thumbHeight, Image.GetThumbnailImageAbort callback, byte[] callbackData) {#getThumbnailImage-int-int-com.aspose.drawing.Image.GetThumbnailImageAbort-byte---}
```
public final Image getThumbnailImage(int thumbWidth, int thumbHeight, Image.GetThumbnailImageAbort callback, byte[] callbackData)
```


Returns a thumbnail for this [Image](../../com.aspose.drawing/image).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| thumbWidth | int | The width, in pixels, of the requested thumbnail image. |
| thumbHeight | int | The height, in pixels, of the requested thumbnail image. |
| callback | [GetThumbnailImageAbort](../../com.aspose.drawing/getthumbnailimageabort) | A [GetThumbnailImageAbort](../../com.aspose.drawing/getthumbnailimageabort) delegate. Note   You must create a delegate and pass a reference to the delegate as the `callback` parameter, but the delegate is not used. |
| callbackData | byte[] | Must be `F:IntPtr.Zero`. |

**Returns:**
[Image](../../com.aspose.drawing/image) - An [Image](../../com.aspose.drawing/image) that represents the thumbnail.
### dispose() {#dispose--}
```
public void dispose()
```


Releases all resources used by this Image.

--------------------

This method actually does nothing. It's just for compatibility with System.Drawing API.

### deepClone() {#deepClone--}
```
public final Object deepClone()
```


Creates an exact copy of this [Image](../../com.aspose.drawing/image).

**Returns:**
java.lang.Object - The [Image](../../com.aspose.drawing/image) this method creates, cast as an object.
### getBounds(int[] pageUnit) {#getBounds-int---}
```
public final RectangleF getBounds(int[] pageUnit)
```


Gets the bounds of the image in the specified unit.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pageUnit | int[] | One of the [GraphicsUnit](../../com.aspose.drawing/graphicsunit) values indicating the unit of measure for the bounding rectangle. |

**Returns:**
[RectangleF](../../com.aspose.drawing/rectanglef) - The [RectangleF](../../com.aspose.drawing/rectanglef) that represents the bounds of the image, in the specified unit.
### getFrameCount(FrameDimension dimension) {#getFrameCount-com.aspose.drawing.imaging.FrameDimension-}
```
public final int getFrameCount(FrameDimension dimension)
```


Returns the number of frames of the specified dimension.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dimension | [FrameDimension](../../com.aspose.drawing.imaging/framedimension) | A [FrameDimension](../../com.aspose.drawing.imaging/framedimension) that specifies the identity of the dimension type. |

**Returns:**
int - The number of frames in the specified dimension.
### save(String filename) {#save-java.lang.String-}
```
public final void save(String filename)
```


Saves this [Image](../../com.aspose.drawing/image) to the specified file or stream.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| filename | java.lang.String | A string that contains the name of the file to which to save this [Image](../../com.aspose.drawing/image). |

### save(String filename, int format) {#save-java.lang.String-int-}
```
public final void save(String filename, int format)
```


Saves this [Image](../../com.aspose.drawing/image) to the specified file in the specified format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| filename | java.lang.String | A string that contains the name of the file to which to save this [Image](../../com.aspose.drawing/image). |
| format | int | The [ImageFormat](../../com.aspose.drawing.imaging/imageformat) for this [Image](../../com.aspose.drawing/image). |

### save(String filename, ImageCodecInfo encoder, EncoderParameters encoderParams) {#save-java.lang.String-com.aspose.drawing.imaging.ImageCodecInfo-com.aspose.drawing.imaging.EncoderParameters-}
```
public final void save(String filename, ImageCodecInfo encoder, EncoderParameters encoderParams)
```


Saves this [Image](../../com.aspose.drawing/image) to the specified file, with the specified encoder and image-encoder parameters.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| filename | java.lang.String | A string that contains the name of the file to which to save this [Image](../../com.aspose.drawing/image). |
| encoder | [ImageCodecInfo](../../com.aspose.drawing.imaging/imagecodecinfo) | The [ImageCodecInfo](../../com.aspose.drawing.imaging/imagecodecinfo) for this [Image](../../com.aspose.drawing/image). |
| encoderParams | [EncoderParameters](../../com.aspose.drawing.imaging/encoderparameters) | An [EncoderParameters](../../com.aspose.drawing.imaging/encoderparameters) to use for this [Image](../../com.aspose.drawing/image). |

### save(OutputStream stream, int format) {#save-java.io.OutputStream-int-}
```
public final void save(OutputStream stream, int format)
```


Saves this image to the specified stream in the specified format.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | The java.io.InputStream where the image will be saved. |
| format | int | An [ImageFormat](../../com.aspose.drawing.imaging/imageformat) that specifies the format of the saved image. |

### save(OutputStream stream, ImageCodecInfo encoder, EncoderParameters encoderParams) {#save-java.io.OutputStream-com.aspose.drawing.imaging.ImageCodecInfo-com.aspose.drawing.imaging.EncoderParameters-}
```
public final void save(OutputStream stream, ImageCodecInfo encoder, EncoderParameters encoderParams)
```


Saves this image to the specified stream, with the specified encoder and image encoder parameters.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | The java.io.InputStream where the image will be saved. |
| encoder | [ImageCodecInfo](../../com.aspose.drawing.imaging/imagecodecinfo) | The [ImageCodecInfo](../../com.aspose.drawing.imaging/imagecodecinfo) for this [Image](../../com.aspose.drawing/image). |
| encoderParams | [EncoderParameters](../../com.aspose.drawing.imaging/encoderparameters) | An [EncoderParameters](../../com.aspose.drawing.imaging/encoderparameters) that specifies parameters used by the image encoder. |

### saveAdd(EncoderParameters encoderParams) {#saveAdd-com.aspose.drawing.imaging.EncoderParameters-}
```
public final void saveAdd(EncoderParameters encoderParams)
```


Adds a frame to the file or stream specified in a previous call to the one of Image.Save(...) methods. Use this method to save selected frames from a multiple-frame image to another multiple-frame image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| encoderParams | [EncoderParameters](../../com.aspose.drawing.imaging/encoderparameters) | An [EncoderParameters](../../com.aspose.drawing.imaging/encoderparameters) that holds parameters required by the image encoder that is used by the save-add operation. |

### saveAdd(Image image, EncoderParameters encoderParams) {#saveAdd-com.aspose.drawing.Image-com.aspose.drawing.imaging.EncoderParameters-}
```
public final void saveAdd(Image image, EncoderParameters encoderParams)
```


Adds a frame to the file or stream specified in a previous call to the one of Image.Save(...) methods.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | An [Image](../../com.aspose.drawing/image) that contains the frame to add. |
| encoderParams | [EncoderParameters](../../com.aspose.drawing.imaging/encoderparameters) | An [EncoderParameters](../../com.aspose.drawing.imaging/encoderparameters) that holds parameters required by the image encoder that is used by the save-add operation. |

### rotateFlip(int rotateFlipType) {#rotateFlip-int-}
```
public abstract void rotateFlip(int rotateFlipType)
```


This method rotates, flips, or rotates and flips the [Image](../../com.aspose.drawing/image).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rotateFlipType | int | A [RotateFlipType](../../com.aspose.drawing/rotatefliptype) member that specifies the type of rotation and flip to apply to the image. |

### selectActiveFrame(FrameDimension dimension, int frameIndex) {#selectActiveFrame-com.aspose.drawing.imaging.FrameDimension-int-}
```
public final int selectActiveFrame(FrameDimension dimension, int frameIndex)
```


Selects the frame specified by the dimension and index.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dimension | [FrameDimension](../../com.aspose.drawing.imaging/framedimension) | A [FrameDimension](../../com.aspose.drawing.imaging/framedimension) that specifies the identity of the dimension type. |
| frameIndex | int | The index of the active frame. |

**Returns:**
int - Always returns 0.
### getPropertyItem(int propid) {#getPropertyItem-int-}
```
public abstract PropertyItem getPropertyItem(int propid)
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
public abstract void removePropertyItem(int propid)
```


Removes the specified property item from this [Image](../../com.aspose.drawing/image).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| propid | int | The ID of the property item to remove. |

### setPropertyItem(PropertyItem propitem) {#setPropertyItem-com.aspose.drawing.imaging.PropertyItem-}
```
public abstract void setPropertyItem(PropertyItem propitem)
```


Stores a property item (piece of metadata) in this [Image](../../com.aspose.drawing/image).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| propitem | [PropertyItem](../../com.aspose.drawing.imaging/propertyitem) | The [PropertyItem](../../com.aspose.drawing.imaging/propertyitem) to be stored. |

