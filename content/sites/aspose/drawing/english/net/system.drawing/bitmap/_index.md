---
title: Bitmap
second_title: Aspose.Drawing for .NET API Reference
description: 
type: docs
weight: 40
url: /net/system.drawing/bitmap/
---
## Bitmap class

Encapsulates a bitmap, which consists of the pixel data for a graphics image and its attributes. A [`Bitmap`](../bitmap) is an object used to work with images defined by pixel data.

```csharp
public class Bitmap : Image
```

## Constructors

| Name | Description |
| --- | --- |
| [Bitmap](bitmap)(Image) | Initializes a new instance of the [`Bitmap`](../bitmap) class from the specified existing image. |
| [Bitmap](bitmap)(Stream) | Initializes a new instance of the [`Bitmap`](../bitmap) class from the specified data stream. |
| [Bitmap](bitmap)(string) | Initializes a new instance of the [`Bitmap`](../bitmap) class from the specified file. |
| [Bitmap](bitmap)(Image, Size) | Initializes a new instance of the [`Bitmap`](../bitmap) class from the specified existing image, scaled to the specified size. |
| [Bitmap](bitmap)(int, int) | Initializes a new instance of the [`Bitmap`](../bitmap) class with the specified size. |
| [Bitmap](bitmap)(Stream, bool) | Initializes a new instance of the [`Bitmap`](../bitmap) class from the specified data stream. |
| [Bitmap](bitmap)(string, bool) | Initializes a new instance of the [`Bitmap`](../bitmap) class from the specified file. |
| [Bitmap](bitmap)(Image, int, int) | Initializes a new instance of the [`Bitmap`](../bitmap) class from the specified existing image, scaled to the specified size. |
| [Bitmap](bitmap)(int, int, PixelFormat) | Initializes a new instance of the [`Bitmap`](../bitmap) class with the specified size and format. |
| [Bitmap](bitmap)(int, int, int, PixelFormat, int[]) | Initializes a new instance of the [`Bitmap`](../bitmap) class with the specified size and pixel data. |

## Properties

| Name | Description |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Gets the integer representing a bitwise combination of [`ImageFlags`](../../system.drawing.imaging/imageflags) for this Image. |
| override [FrameDimensionsList](../../system.drawing/bitmap/framedimensionslist) { get; } | Gets an array of GUIDs that represent the dimensions of frames within this Image. |
| override [Height](../../system.drawing/bitmap/height) { get; } | Gets the height, in pixels, of this Bitmap. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Gets the horizontal resolution, in pixels per inch, of this Image. |
| override [Palette](../../system.drawing/bitmap/palette) { get; set; } | Gets or sets the color palette used for this Image. |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Gets the width and height of this image. |
| override [PixelFormat](../../system.drawing/bitmap/pixelformat) { get; } | Gets the pixel format for this Image. |
| override [PropertyIdList](../../system.drawing/bitmap/propertyidlist) { get; } | Gets IDs of the property items stored in this Image. |
| override [PropertyItems](../../system.drawing/bitmap/propertyitems) { get; } | Gets all the property items (pieces of metadata) stored in this Image. |
| override [RawFormat](../../system.drawing/bitmap/rawformat) { get; } | Gets the file format of this Image. |
| [Size](../../system.drawing/image/size) { get; } | Gets the width and height, in pixels, of this image. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Gets or sets an object that provides additional data about the image. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Gets the vertical resolution, in pixels per inch, of this Image. |
| override [Width](../../system.drawing/bitmap/width) { get; } | Gets the width, in pixels, of this Bitmap. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | Creates an exact copy of this Image. |
| [Clone](../../system.drawing/bitmap/clone)(Rectangle, PixelFormat) | Creates a copy of the section of this Bitmap defined by Rectangle structure and with a specified PixelFormat enumeration. |
| [Clone](../../system.drawing/bitmap/clone)(RectangleF, PixelFormat) | Creates a copy of the section of this Bitmap defined with a specified PixelFormat enumeration. |
| virtual [Dispose](../../system.drawing/image/dispose)() | Releases all resources used by this Image. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Gets the bounds of the image in the specified unit. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Returns the number of frames of the specified dimension. |
| [GetPixel](../../system.drawing/bitmap/getpixel)(int, int) | Gets the color of the specified pixel in this Bitmap. |
| override [GetPropertyItem](../../system.drawing/bitmap/getpropertyitem)(int) | Gets the specified property item from this Image. |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Returns a thumbnail for this Image. |
| [LockBits](../../system.drawing/bitmap/lockbits)(Rectangle, ImageLockMode, PixelFormat) | Locks a Bitmap into system memory. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent)() | Makes the specified color transparent for this Bitmap. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent)(Color) | Makes the specified color transparent for this Bitmap. |
| [ReadArgb32Pixels](../../system.drawing/bitmap/readargb32pixels)(int[]) | Reads bitmap pixels in ARGB32 format into given array. |
| override [RemovePropertyItem](../../system.drawing/bitmap/removepropertyitem)(int) | Removes the specified property item from this Image. |
| override [RotateFlip](../../system.drawing/bitmap/rotateflip)(RotateFlipType) | This method rotates, flips, or rotates and flips the Image. |
| [Save](../../system.drawing/image/save)(string) | Saves this Image to the specified file or stream. |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | Saves this image to the specified stream in the specified format. |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | Saves this Image to the specified file in the specified format. |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | Saves this image to the specified stream, with the specified encoder and image encoder parameters. |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | Saves this Image to the specified file, with the specified encoder and image-encoder parameters. |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | Adds a frame to the file or stream specified in a previous call to the one of Image.Save(...) methods. Use this method to save selected frames from a multiple-frame image to another multiple-frame image. |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | Adds a frame to the file or stream specified in a previous call to the one of Image.Save(...) methods. |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Selects the frame specified by the dimension and index. |
| [SetPixel](../../system.drawing/bitmap/setpixel)(int, int, Color) | Sets the color of the specified pixel in this Bitmap. |
| override [SetPropertyItem](../../system.drawing/bitmap/setpropertyitem)(PropertyItem) | Stores a property item (piece of metadata) in this Image. |
| [SetResolution](../../system.drawing/bitmap/setresolution)(float, float) | Sets the resolution for this Bitmap. |
| [UnlockBits](../../system.drawing/bitmap/unlockbits)(BitmapData) | Unlocks this Bitmap from system memory. |
| [WriteArgb32Pixels](../../system.drawing/bitmap/writeargb32pixels)(int[]) | Writes pixels to the bitmap. |

### See Also

* class [Image](../image)
* namespace [System.Drawing](../../system.drawing)
* assembly [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
