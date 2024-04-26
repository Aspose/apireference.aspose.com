---
title: Class Bitmap
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.Drawing.Bitmap class. Encapsulates a bitmap which consists of the pixel data for a graphics image and its attributes. A Bitmap is an object used to work with images defined by pixel data
type: docs
weight: 50
url: /net/aspose.page.drawing/bitmap/
---
## Bitmap class

Encapsulates a bitmap, which consists of the pixel data for a graphics image and its attributes. A `Bitmap` is an object used to work with images defined by pixel data.

```csharp
public sealed class Bitmap : ICloneable, IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [Bitmap](bitmap/#constructor)(Bitmap) | Initializes a new instance of the `Bitmap` class from the specified existing image. |
| [Bitmap](bitmap/#constructor_5)(Stream) | Initializes a new instance of the `Bitmap` class from the specified data stream. |
| [Bitmap](bitmap/#constructor_7)(string) | Initializes a new instance of the `Bitmap` class from the specified file. |
| [Bitmap](bitmap/#constructor_1)(Bitmap, Size) | Initializes a new instance of the `Bitmap` class from the specified existing image, scaled to the specified size. |
| [Bitmap](bitmap/#constructor_3)(int, int) | Initializes a new instance of the `Bitmap` class with the specified size. |
| [Bitmap](bitmap/#constructor_6)(Stream, bool) | Initializes a new instance of the `Bitmap` class from the specified data stream. |
| [Bitmap](bitmap/#constructor_8)(string, bool) | Initializes a new instance of the `Bitmap` class from the specified file. |
| [Bitmap](bitmap/#constructor_2)(Bitmap, int, int) | Initializes a new instance of the `Bitmap` class from the specified existing image, scaled to the specified size. |
| [Bitmap](bitmap/#constructor_4)(int, int, PixelFormat) | Initializes a new instance of the `Bitmap` class with the specified size and format. |

## Properties

| Name | Description |
| --- | --- |
| [Flags](../../aspose.page.drawing/bitmap/flags/) { get; } | Gets attribute flags for the pixel data of this Image. |
| [Height](../../aspose.page.drawing/bitmap/height/) { get; } | Gets the height, in pixels, of this Image. |
| [HorizontalResolution](../../aspose.page.drawing/bitmap/horizontalresolution/) { get; } | Gets the horizontal resolution, in pixels per inch, of this Image. |
| [Palette](../../aspose.page.drawing/bitmap/palette/) { get; set; } | Gets or sets the color palette used for this Image. |
| [PhysicalDimension](../../aspose.page.drawing/bitmap/physicaldimension/) { get; } | Gets the width and height of this image. |
| [PixelFormat](../../aspose.page.drawing/bitmap/pixelformat/) { get; } | Gets the pixel format for this Image. |
| [RawFormat](../../aspose.page.drawing/bitmap/rawformat/) { get; } | Gets the file format of this Image. |
| [Size](../../aspose.page.drawing/bitmap/size/) { get; } | Gets the width and height, in pixels, of this image. |
| [Tag](../../aspose.page.drawing/bitmap/tag/) { get; set; } | Gets or sets an object that provides additional data about the image. |
| [VerticalResolution](../../aspose.page.drawing/bitmap/verticalresolution/) { get; } | Gets the vertical resolution, in pixels per inch, of this Image. |
| [Width](../../aspose.page.drawing/bitmap/width/) { get; } | Gets the width, in pixels, of this Image. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.page.drawing/bitmap/clone/#clone_1)() | Creates an exact copy of this Image. |
| [Clone](../../aspose.page.drawing/bitmap/clone/#clone)(RectangleF, PixelFormat) | Creates a copy of the section of this `Bitmap` defined with a specified [`PixelFormat`](../../aspose.page.drawing.imaging/pixelformat/) enumeration. |
| [Dispose](../../aspose.page.drawing/bitmap/dispose/)() | Releases all resources used by this Image. |
| [GetPixel](../../aspose.page.drawing/bitmap/getpixel/)(int, int) | Gets the color of the specified pixel in this `Bitmap`. |
| [LockBits](../../aspose.page.drawing/bitmap/lockbits/)(RectangleF, ImageLockMode, PixelFormat) | Locks a `Bitmap` into system memory. |
| [MakeTransparent](../../aspose.page.drawing/bitmap/maketransparent/#maketransparent)() | Makes the default transparent color transparent for this `Bitmap`. |
| [MakeTransparent](../../aspose.page.drawing/bitmap/maketransparent/#maketransparent_1)(Color) | Makes the specified color transparent for this `Bitmap`. |
| [RotateFlip](../../aspose.page.drawing/bitmap/rotateflip/)(RotateFlipType) | This method rotates, flips, or rotates and flips the Image. |
| [Save](../../aspose.page.drawing/bitmap/save/#save_1)(string) | Saves this Image to the specified file or stream. |
| [Save](../../aspose.page.drawing/bitmap/save/#save)(Stream, ImageFormat) | Saves this image to the specified stream in the specified format. |
| [Save](../../aspose.page.drawing/bitmap/save/#save_2)(string, ImageFormat) | Saves this Image to the specified file in the specified format. |
| [SetPixel](../../aspose.page.drawing/bitmap/setpixel/)(int, int, Color) | Sets the color of the specified pixel in this `Bitmap`. |
| [SetResolution](../../aspose.page.drawing/bitmap/setresolution/)(float, float) | Sets the resolution for this `Bitmap`. |
| [UnlockBits](../../aspose.page.drawing/bitmap/unlockbits/)(BitmapData) | Unlocks this `Bitmap` from system memory. |
| static [GetPixelFormatSize](../../aspose.page.drawing/bitmap/getpixelformatsize/)(PixelFormat) | Returns the color depth, in number of bits per pixel, of the specified pixel format. |
| static [IsAlphaPixelFormat](../../aspose.page.drawing/bitmap/isalphapixelformat/)(PixelFormat) | Returns a value that indicates whether the pixel format for this Image contains alpha information. |

### See Also

* namespace [Aspose.Page.Drawing](../../aspose.page.drawing/)
* assembly [Aspose.Page](../../)


