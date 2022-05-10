---
title: Image
second_title: Aspose.Drawing for .NET API Reference
description: 
type: docs
weight: 570
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
| [Image](image)() | Initializes a new instance of the [`Image`](../image) class. |

## Properties

| Name | Description |
| --- | --- |
| [Flags](flags) { get; } | Gets the integer representing a bitwise combination of [`ImageFlags`](../../system.drawing.imaging/imageflags) for this Image. |
| abstract [FrameDimensionsList](framedimensionslist) { get; } | Gets an array of GUIDs that represent the dimensions of frames within this Image. |
| abstract [Height](height) { get; } | Gets the height, in pixels, of this Image. |
| [HorizontalResolution](horizontalresolution) { get; } | Gets the horizontal resolution, in pixels per inch, of this Image. |
| abstract [Palette](palette) { get; set; } | Gets or sets the color palette used for this Image. |
| [PhysicalDimension](physicaldimension) { get; } | Gets the width and height of this image. |
| abstract [PixelFormat](pixelformat) { get; } | Gets the pixel format for this Image. |
| abstract [PropertyIdList](propertyidlist) { get; } | Gets IDs of the property items stored in this Image. |
| abstract [PropertyItems](propertyitems) { get; } | Gets all the property items (pieces of metadata) stored in this Image. |
| abstract [RawFormat](rawformat) { get; } | Gets the file format of this Image. |
| [Size](size) { get; } | Gets the width and height, in pixels, of this image. |
| [Tag](tag) { get; set; } | Gets or sets an object that provides additional data about the image. |
| [VerticalResolution](verticalresolution) { get; } | Gets the vertical resolution, in pixels per inch, of this Image. |
| abstract [Width](width) { get; } | Gets the width, in pixels, of this Image. |

## Methods

| Name | Description |
| --- | --- |
| static [FromFile](fromfile)(string) | Creates an Image from the specified file. |
| static [FromStream](fromstream)(Stream) | Creates an Image from the specified data stream. |
| static [FromStream](fromstream)(Stream, bool) | Creates an Image from the specified data stream, optionally using embedded color management information in that stream. |
| [Clone](clone)() | Creates an exact copy of this Image. |
| virtual [Dispose](dispose)() | Releases all resources used by this Image. |
| [GetBounds](getbounds)(ref GraphicsUnit) | Gets the bounds of the image in the specified unit. |
| [GetFrameCount](getframecount)(FrameDimension) | Returns the number of frames of the specified dimension. |
| abstract [GetPropertyItem](getpropertyitem)(int) | Gets the specified property item from this Image. |
| [GetThumbnailImage](getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Returns a thumbnail for this Image. |
| abstract [RemovePropertyItem](removepropertyitem)(int) | Removes the specified property item from this Image. |
| abstract [RotateFlip](rotateflip)(RotateFlipType) | This method rotates, flips, or rotates and flips the Image. |
| [Save](save)(string) | Saves this Image to the specified file or stream. |
| [Save](save)(Stream, ImageFormat) | Saves this image to the specified stream in the specified format. |
| [Save](save)(string, ImageFormat) | Saves this Image to the specified file in the specified format. |
| [Save](save)(Stream, ImageCodecInfo, EncoderParameters) | Saves this image to the specified stream, with the specified encoder and image encoder parameters. |
| [Save](save)(string, ImageCodecInfo, EncoderParameters) | Saves this Image to the specified file, with the specified encoder and image-encoder parameters. |
| [SaveAdd](saveadd)(EncoderParameters) | Adds a frame to the file or stream specified in a previous call to the one of Image.Save(...) methods. Use this method to save selected frames from a multiple-frame image to another multiple-frame image. |
| [SaveAdd](saveadd)(Image, EncoderParameters) | Adds a frame to the file or stream specified in a previous call to the one of Image.Save(...) methods. |
| [SelectActiveFrame](selectactiveframe)(FrameDimension, int) | Selects the frame specified by the dimension and index. |
| abstract [SetPropertyItem](setpropertyitem)(PropertyItem) | Stores a property item (piece of metadata) in this Image. |
| static [FromHbitmap](fromhbitmap)(IntPtr) | Creates a Bitmap from a handle to a GDI bitmap. |
| static [GetPixelFormatSize](getpixelformatsize)(PixelFormat) | Returns the color depth, in number of bits per pixel, of the specified pixel format. |
| static [IsAlphaPixelFormat](isalphapixelformat)(PixelFormat) | Returns a value that indicates whether the pixel format for this Image contains alpha information. |

## Other Members

| Name | Description |
| --- | --- |
| delegate [GetThumbnailImageAbort](image.getthumbnailimageabort) | Provides a callback method for determining when the [`GetThumbnailImage`](./getthumbnailimage) method should prematurely cancel execution. |

### See Also

* namespace [System.Drawing](../../system.drawing)
* assembly [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
