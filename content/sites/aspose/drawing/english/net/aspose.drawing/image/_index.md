---
title: Class Image
second_title: Aspose.Drawing for .NET API Reference
description: Aspose.Drawing.Image class. An abstract base class that provides functionality for the Bitmap and Metafile descended classes
type: docs
weight: 550
url: /net/aspose.drawing/image/
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
| [Flags](../../aspose.drawing/image/flags/) { get; } | Gets the integer representing a bitwise combination of [`ImageFlags`](../../aspose.drawing.imaging/imageflags/) for this Image. |
| abstract [FrameDimensionsList](../../aspose.drawing/image/framedimensionslist/) { get; } | Gets an array of GUIDs that represent the dimensions of frames within this Image. |
| abstract [Height](../../aspose.drawing/image/height/) { get; } | Gets the height, in pixels, of this Image. |
| [HorizontalResolution](../../aspose.drawing/image/horizontalresolution/) { get; } | Gets the horizontal resolution, in pixels per inch, of this Image. |
| abstract [Palette](../../aspose.drawing/image/palette/) { get; set; } | Gets or sets the color palette used for this Image. |
| [PhysicalDimension](../../aspose.drawing/image/physicaldimension/) { get; } | Gets the width and height of this image. |
| abstract [PixelFormat](../../aspose.drawing/image/pixelformat/) { get; } | Gets the pixel format for this Image. |
| abstract [PropertyIdList](../../aspose.drawing/image/propertyidlist/) { get; } | Gets IDs of the property items stored in this Image. |
| abstract [PropertyItems](../../aspose.drawing/image/propertyitems/) { get; } | Gets all the property items (pieces of metadata) stored in this Image. |
| abstract [RawFormat](../../aspose.drawing/image/rawformat/) { get; } | Gets the file format of this Image. |
| [Size](../../aspose.drawing/image/size/) { get; } | Gets the width and height, in pixels, of this image. |
| [Tag](../../aspose.drawing/image/tag/) { get; set; } | Gets or sets an object that provides additional data about the image. |
| [VerticalResolution](../../aspose.drawing/image/verticalresolution/) { get; } | Gets the vertical resolution, in pixels per inch, of this Image. |
| abstract [Width](../../aspose.drawing/image/width/) { get; } | Gets the width, in pixels, of this Image. |

## Methods

| Name | Description |
| --- | --- |
| static [FromFile](../../aspose.drawing/image/fromfile/)(string) | Creates an Image from the specified file. |
| static [FromStream](../../aspose.drawing/image/fromstream/#fromstream)(Stream) | Creates an Image from the specified data stream. |
| static [FromStream](../../aspose.drawing/image/fromstream/#fromstream_1)(Stream, bool) | Creates an Image from the specified data stream, optionally using embedded color management information in that stream. |
| [Clone](../../aspose.drawing/image/clone/)() | Creates an exact copy of this Image. |
| virtual [Dispose](../../aspose.drawing/image/dispose/)() | Releases all resources used by this Image. |
| [GetBounds](../../aspose.drawing/image/getbounds/)(ref GraphicsUnit) | Gets the bounds of the image in the specified unit. |
| [GetFrameCount](../../aspose.drawing/image/getframecount/)(FrameDimension) | Returns the number of frames of the specified dimension. |
| abstract [GetPropertyItem](../../aspose.drawing/image/getpropertyitem/)(int) | Gets the specified property item from this Image. |
| [GetThumbnailImage](../../aspose.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | Returns a thumbnail for this Image. |
| abstract [RemovePropertyItem](../../aspose.drawing/image/removepropertyitem/)(int) | Removes the specified property item from this Image. |
| abstract [RotateFlip](../../aspose.drawing/image/rotateflip/)(RotateFlipType) | This method rotates, flips, or rotates and flips the Image. |
| [Save](../../aspose.drawing/image/save/#save_2)(string) | Saves this Image to the specified file or stream. |
| [Save](../../aspose.drawing/image/save/#save_1)(Stream, ImageFormat) | Saves this image to the specified stream in the specified format. |
| [Save](../../aspose.drawing/image/save/#save_4)(string, ImageFormat) | Saves this Image to the specified file in the specified format. |
| [Save](../../aspose.drawing/image/save/#save)(Stream, ImageCodecInfo, EncoderParameters) | Saves this image to the specified stream, with the specified encoder and image encoder parameters. |
| [Save](../../aspose.drawing/image/save/#save_3)(string, ImageCodecInfo, EncoderParameters) | Saves this Image to the specified file, with the specified encoder and image-encoder parameters. |
| [SaveAdd](../../aspose.drawing/image/saveadd/#saveadd_1)(EncoderParameters) | Adds a frame to the file or stream specified in a previous call to the one of Image.Save(...) methods. Use this method to save selected frames from a multiple-frame image to another multiple-frame image. |
| [SaveAdd](../../aspose.drawing/image/saveadd/#saveadd)(Image, EncoderParameters) | Adds a frame to the file or stream specified in a previous call to the one of Image.Save(...) methods. |
| [SelectActiveFrame](../../aspose.drawing/image/selectactiveframe/)(FrameDimension, int) | Selects the frame specified by the dimension and index. |
| abstract [SetPropertyItem](../../aspose.drawing/image/setpropertyitem/)(PropertyItem) | Stores a property item (piece of metadata) in this Image. |
| static [FromHbitmap](../../aspose.drawing/image/fromhbitmap/)(IntPtr) | Creates a Bitmap from a handle to a GDI bitmap. |
| static [GetPixelFormatSize](../../aspose.drawing/image/getpixelformatsize/)(PixelFormat) | Returns the color depth, in number of bits per pixel, of the specified pixel format. |
| static [IsAlphaPixelFormat](../../aspose.drawing/image/isalphapixelformat/)(PixelFormat) | Returns a value that indicates whether the pixel format for this Image contains alpha information. |

## Other Members

| Name | Description |
| --- | --- |
| delegate [GetThumbnailImageAbort](../../aspose.drawing/image.getthumbnailimageabort) | Provides a callback method for determining when the [`GetThumbnailImage`](./getthumbnailimage/) method should prematurely cancel execution. |

### See Also

* namespace [Aspose.Drawing](../../aspose.drawing/)
* assembly [Aspose.Drawing.Common](../../)


