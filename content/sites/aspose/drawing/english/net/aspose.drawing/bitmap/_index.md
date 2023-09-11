---
title: Class Bitmap
second_title: Aspose.Drawing for .NET API Reference
description: Aspose.Drawing.Bitmap class. Encapsulates a bitmap which consists of the pixel data for a graphics image and its attributes. A Bitmap is an object used to work with images defined by pixel data
type: docs
weight: 10
url: /net/aspose.drawing/bitmap/
---
## Bitmap class

Encapsulates a bitmap, which consists of the pixel data for a graphics image and its attributes. A `Bitmap` is an object used to work with images defined by pixel data.

```csharp
public class Bitmap : Image
```

## Constructors

| Name | Description |
| --- | --- |
| [Bitmap](bitmap/#constructor)(Image) | Initializes a new instance of the `Bitmap` class from the specified existing image. |
| [Bitmap](bitmap/#constructor_6)(Stream) | Initializes a new instance of the `Bitmap` class from the specified data stream. |
| [Bitmap](bitmap/#constructor_8)(string) | Initializes a new instance of the `Bitmap` class from the specified file. |
| [Bitmap](bitmap/#constructor_1)(Image, Size) | Initializes a new instance of the `Bitmap` class from the specified existing image, scaled to the specified size. |
| [Bitmap](bitmap/#constructor_3)(int, int) | Initializes a new instance of the `Bitmap` class with the specified size. |
| [Bitmap](bitmap/#constructor_7)(Stream, bool) | Initializes a new instance of the `Bitmap` class from the specified data stream. |
| [Bitmap](bitmap/#constructor_9)(string, bool) | Initializes a new instance of the `Bitmap` class from the specified file. |
| [Bitmap](bitmap/#constructor_2)(Image, int, int) | Initializes a new instance of the `Bitmap` class from the specified existing image, scaled to the specified size. |
| [Bitmap](bitmap/#constructor_4)(int, int, PixelFormat) | Initializes a new instance of the `Bitmap` class with the specified size and format. |
| [Bitmap](bitmap/#constructor_5)(int, int, int, PixelFormat, int[]) | Initializes a new instance of the `Bitmap` class with the specified size and pixel data. |

## Properties

| Name | Description |
| --- | --- |
| [Flags](../../aspose.drawing/image/flags/) { get; } | Gets the integer representing a bitwise combination of [`ImageFlags`](../../aspose.drawing.imaging/imageflags/) for this Image. |
| override [FrameDimensionsList](../../aspose.drawing/bitmap/framedimensionslist/) { get; } | Gets an array of GUIDs that represent the dimensions of frames within this Image. |
| override [Height](../../aspose.drawing/bitmap/height/) { get; } | Gets the height, in pixels, of this Bitmap. |
| [HorizontalResolution](../../aspose.drawing/image/horizontalresolution/) { get; } | Gets the horizontal resolution, in pixels per inch, of this Image. |
| override [Palette](../../aspose.drawing/bitmap/palette/) { get; set; } | Gets or sets the color palette used for this Image. |
| [PhysicalDimension](../../aspose.drawing/image/physicaldimension/) { get; } | Gets the width and height of this image. |
| override [PixelFormat](../../aspose.drawing/bitmap/pixelformat/) { get; } | Gets the pixel format for this Image. |
| override [PropertyIdList](../../aspose.drawing/bitmap/propertyidlist/) { get; } | Gets IDs of the property items stored in this Image. |
| override [PropertyItems](../../aspose.drawing/bitmap/propertyitems/) { get; } | Gets all the property items (pieces of metadata) stored in this Image. |
| override [RawFormat](../../aspose.drawing/bitmap/rawformat/) { get; } | Gets the file format of this Image. |
| [Size](../../aspose.drawing/image/size/) { get; } | Gets the width and height, in pixels, of this image. |
| [Tag](../../aspose.drawing/image/tag/) { get; set; } | Gets or sets an object that provides additional data about the image. |
| [VerticalResolution](../../aspose.drawing/image/verticalresolution/) { get; } | Gets the vertical resolution, in pixels per inch, of this Image. |
| override [Width](../../aspose.drawing/bitmap/width/) { get; } | Gets the width, in pixels, of this Bitmap. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.drawing/image/clone/)() | Creates an exact copy of this Image. |
| [Clone](../../aspose.drawing/bitmap/clone/#clone)(Rectangle, PixelFormat) | Creates a copy of the section of this Bitmap defined by Rectangle structure and with a specified PixelFormat enumeration. |
| [Clone](../../aspose.drawing/bitmap/clone/#clone_1)(RectangleF, PixelFormat) | Creates a copy of the section of this Bitmap defined with a specified PixelFormat enumeration. |
| virtual [Dispose](../../aspose.drawing/image/dispose/)() | Releases all resources used by this Image. |
| [GetBounds](../../aspose.drawing/image/getbounds/)(ref GraphicsUnit) | Gets the bounds of the image in the specified unit. |
| [GetFrameCount](../../aspose.drawing/image/getframecount/)(FrameDimension) | Returns the number of frames of the specified dimension. |
| [GetPixel](../../aspose.drawing/bitmap/getpixel/)(int, int) | Gets the color of the specified pixel in this Bitmap. |
| override [GetPropertyItem](../../aspose.drawing/bitmap/getpropertyitem/)(int) | Gets the specified property item from this Image. |
| [GetThumbnailImage](../../aspose.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | Returns a thumbnail for this Image. |
| [LockBits](../../aspose.drawing/bitmap/lockbits/)(Rectangle, ImageLockMode, PixelFormat) | Locks a Bitmap into system memory. |
| [MakeTransparent](../../aspose.drawing/bitmap/maketransparent/#maketransparent)() | Makes the specified color transparent for this Bitmap. |
| [MakeTransparent](../../aspose.drawing/bitmap/maketransparent/#maketransparent_1)(Color) | Makes the specified color transparent for this Bitmap. |
| [ReadArgb32Pixels](../../aspose.drawing/bitmap/readargb32pixels/)(int[]) | Reads bitmap pixels in ARGB32 format into given array. |
| override [RemovePropertyItem](../../aspose.drawing/bitmap/removepropertyitem/)(int) | Removes the specified property item from this Image. |
| override [RotateFlip](../../aspose.drawing/bitmap/rotateflip/)(RotateFlipType) | This method rotates, flips, or rotates and flips the Image. |
| [Save](../../aspose.drawing/image/save/)(string) | Saves this Image to the specified file or stream. |
| [Save](../../aspose.drawing/image/save/)(Stream, ImageFormat) | Saves this image to the specified stream in the specified format. |
| [Save](../../aspose.drawing/image/save/)(string, ImageFormat) | Saves this Image to the specified file in the specified format. |
| [Save](../../aspose.drawing/image/save/)(Stream, ImageCodecInfo, EncoderParameters) | Saves this image to the specified stream, with the specified encoder and image encoder parameters. |
| [Save](../../aspose.drawing/image/save/)(string, ImageCodecInfo, EncoderParameters) | Saves this Image to the specified file, with the specified encoder and image-encoder parameters. |
| [SaveAdd](../../aspose.drawing/image/saveadd/)(EncoderParameters) | Adds a frame to the file or stream specified in a previous call to the one of Image.Save(...) methods. Use this method to save selected frames from a multiple-frame image to another multiple-frame image. |
| [SaveAdd](../../aspose.drawing/image/saveadd/)(Image, EncoderParameters) | Adds a frame to the file or stream specified in a previous call to the one of Image.Save(...) methods. |
| [SelectActiveFrame](../../aspose.drawing/image/selectactiveframe/)(FrameDimension, int) | Selects the frame specified by the dimension and index. |
| [SetPixel](../../aspose.drawing/bitmap/setpixel/)(int, int, Color) | Sets the color of the specified pixel in this Bitmap. |
| override [SetPropertyItem](../../aspose.drawing/bitmap/setpropertyitem/)(PropertyItem) | Stores a property item (piece of metadata) in this Image. |
| [SetResolution](../../aspose.drawing/bitmap/setresolution/)(float, float) | Sets the resolution for this Bitmap. |
| [UnlockBits](../../aspose.drawing/bitmap/unlockbits/)(BitmapData) | Unlocks this Bitmap from system memory. |
| [WriteArgb32Pixels](../../aspose.drawing/bitmap/writeargb32pixels/)(int[]) | Writes pixels to the bitmap. |

### See Also

* class [Image](../image/)
* namespace [Aspose.Drawing](../../aspose.drawing/)
* assembly [Aspose.Drawing.Common](../../)


