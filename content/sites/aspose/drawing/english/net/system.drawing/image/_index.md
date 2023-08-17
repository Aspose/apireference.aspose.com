---
title: Class Image
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Image class. An abstract base class that provides functionality for the Bitmap and Metafile descended classes
type: docs
weight: 590
url: /net/system.drawing/image/
---
## Image class

An abstract base class that provides functionality for the Bitmap and Metafile descended classes.

```csharp
public abstract class Image : IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [Image](image/)() | Initializes a new instance of the `Image` class. |

## Properties

| Name | Description |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | Gets the integer representing a bitwise combination of [`ImageFlags`](../../system.drawing.imaging/imageflags/) for this Image. |
| abstract [FrameDimensionsList](../../system.drawing/image/framedimensionslist/) { get; } | Gets an array of GUIDs that represent the dimensions of frames within this Image. |
| abstract [Height](../../system.drawing/image/height/) { get; } | Gets the height, in pixels, of this Image. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | Gets the horizontal resolution, in pixels per inch, of this Image. |
| abstract [Palette](../../system.drawing/image/palette/) { get; set; } | Gets or sets the color palette used for this Image. |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | Gets the width and height of this image. |
| abstract [PixelFormat](../../system.drawing/image/pixelformat/) { get; } | Gets the pixel format for this Image. |
| abstract [PropertyIdList](../../system.drawing/image/propertyidlist/) { get; } | Gets IDs of the property items stored in this Image. |
| abstract [PropertyItems](../../system.drawing/image/propertyitems/) { get; } | Gets all the property items (pieces of metadata) stored in this Image. |
| abstract [RawFormat](../../system.drawing/image/rawformat/) { get; } | Gets the file format of this Image. |
| [Size](../../system.drawing/image/size/) { get; } | Gets the width and height, in pixels, of this image. |
| [Tag](../../system.drawing/image/tag/) { get; set; } | Gets or sets an object that provides additional data about the image. |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | Gets the vertical resolution, in pixels per inch, of this Image. |
| abstract [Width](../../system.drawing/image/width/) { get; } | Gets the width, in pixels, of this Image. |

## Methods

| Name | Description |
| --- | --- |
| static [FromFile](../../system.drawing/image/fromfile/)(string) | Creates an Image from the specified file. |
| static [FromStream](../../system.drawing/image/fromstream/#fromstream)(Stream) | Creates an Image from the specified data stream. |
| static [FromStream](../../system.drawing/image/fromstream/#fromstream_1)(Stream, bool) | Creates an Image from the specified data stream, optionally using embedded color management information in that stream. |
| [Clone](../../system.drawing/image/clone/)() | Creates an exact copy of this Image. |
| virtual [Dispose](../../system.drawing/image/dispose/)() | Releases all resources used by this Image. |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | Gets the bounds of the image in the specified unit. |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | Returns the number of frames of the specified dimension. |
| abstract [GetPropertyItem](../../system.drawing/image/getpropertyitem/)(int) | Gets the specified property item from this Image. |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | Returns a thumbnail for this Image. |
| abstract [RemovePropertyItem](../../system.drawing/image/removepropertyitem/)(int) | Removes the specified property item from this Image. |
| abstract [RotateFlip](../../system.drawing/image/rotateflip/)(RotateFlipType) | This method rotates, flips, or rotates and flips the Image. |
| [Save](../../system.drawing/image/save/#save_2)(string) | Saves this Image to the specified file or stream. |
| [Save](../../system.drawing/image/save/#save_1)(Stream, ImageFormat) | Saves this image to the specified stream in the specified format. |
| [Save](../../system.drawing/image/save/#save_4)(string, ImageFormat) | Saves this Image to the specified file in the specified format. |
| [Save](../../system.drawing/image/save/#save)(Stream, ImageCodecInfo, EncoderParameters) | Saves this image to the specified stream, with the specified encoder and image encoder parameters. |
| [Save](../../system.drawing/image/save/#save_3)(string, ImageCodecInfo, EncoderParameters) | Saves this Image to the specified file, with the specified encoder and image-encoder parameters. |
| [SaveAdd](../../system.drawing/image/saveadd/#saveadd_1)(EncoderParameters) | Adds a frame to the file or stream specified in a previous call to the one of Image.Save(...) methods. Use this method to save selected frames from a multiple-frame image to another multiple-frame image. |
| [SaveAdd](../../system.drawing/image/saveadd/#saveadd)(Image, EncoderParameters) | Adds a frame to the file or stream specified in a previous call to the one of Image.Save(...) methods. |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | Selects the frame specified by the dimension and index. |
| abstract [SetPropertyItem](../../system.drawing/image/setpropertyitem/)(PropertyItem) | Stores a property item (piece of metadata) in this Image. |
| static [FromHbitmap](../../system.drawing/image/fromhbitmap/)(IntPtr) | Creates a Bitmap from a handle to a GDI bitmap. |
| static [GetPixelFormatSize](../../system.drawing/image/getpixelformatsize/)(PixelFormat) | Returns the color depth, in number of bits per pixel, of the specified pixel format. |
| static [IsAlphaPixelFormat](../../system.drawing/image/isalphapixelformat/)(PixelFormat) | Returns a value that indicates whether the pixel format for this Image contains alpha information. |

## Other Members

| Name | Description |
| --- | --- |
| delegate [GetThumbnailImageAbort](../../system.drawing/image.getthumbnailimageabort) | Provides a callback method for determining when the [`GetThumbnailImage`](./getthumbnailimage/) method should prematurely cancel execution. |

### See Also

* namespace [System.Drawing](../../system.drawing/)
* assembly [Aspose.Drawing](../../)


