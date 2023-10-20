---
title: Class Metafile
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Imaging.Metafile class. Defines a graphic metafile. A metafile contains records that describe a sequence of graphics operations that can be recorded constructed and played back displayed. This class is not inheritable
type: docs
weight: 790
url: /net/system.drawing.imaging/metafile/
---
## Metafile class

Defines a graphic metafile. A metafile contains records that describe a sequence of graphics operations that can be recorded (constructed) and played back (displayed). This class is not inheritable.

```csharp
public sealed class Metafile : Image
```

## Constructors

| Name | Description |
| --- | --- |
| [Metafile](metafile/#constructor_2)(Stream) | Initializes a new instance of the `Metafile` class from the specified data stream. |
| [Metafile](metafile/#constructor_6)(string) | Initializes a new instance of the `Metafile` class from the specified file name. |
| [Metafile](metafile/#constructor)(IntPtr, bool) | Initializes a new instance of the `Metafile` class from the specified handle. |
| [Metafile](metafile/#constructor_1)(IntPtr, EmfType) | Initializes a new instance of the `Metafile` class from the specified handle to a device context and an EmfType enumeration that specifies the format of the Metafile. |
| [Metafile](metafile/#constructor_3)(Stream, IntPtr) | Initializes a new instance of the `Metafile` class from the specified data stream and a Windows handle to a device context. /&gt;. |
| [Metafile](metafile/#constructor_7)(string, IntPtr) | Initializes a new instance of the `Metafile` class from the specified file name. |
| [Metafile](metafile/#constructor_4)(Stream, IntPtr, EmfType) | Initializes a new instance of the `Metafile` class from the specified data stream, a Windows handle to a device context, and an EmfType enumeration that specifies the format of the Metafile. |
| [Metafile](metafile/#constructor_5)(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | Initializes a new instance of the `Metafile` class from the specified data stream, a Windows handle to a device context, and an EmfType enumeration that specifies the format of the Metafile. |

## Properties

| Name | Description |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | Gets the integer representing a bitwise combination of [`ImageFlags`](../imageflags/) for this Image. |
| override [FrameDimensionsList](../../system.drawing.imaging/metafile/framedimensionslist/) { get; } | Gets an array of GUIDs that represent the dimensions of frames within this Image. |
| override [Height](../../system.drawing.imaging/metafile/height/) { get; } | Gets the height, in pixels, of this Metafile. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | Gets the horizontal resolution, in pixels per inch, of this Image. |
| override [Palette](../../system.drawing.imaging/metafile/palette/) { get; set; } | Gets or sets the color palette used for this Image. |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | Gets the width and height of this image. |
| override [PixelFormat](../../system.drawing.imaging/metafile/pixelformat/) { get; } | Gets the pixel format for this Image. |
| override [PropertyIdList](../../system.drawing.imaging/metafile/propertyidlist/) { get; } | Gets IDs of the property items stored in this Image. |
| override [PropertyItems](../../system.drawing.imaging/metafile/propertyitems/) { get; } | Gets all the property items (pieces of metadata) stored in this Image. |
| override [RawFormat](../../system.drawing.imaging/metafile/rawformat/) { get; } | Gets the file format of this Image. |
| [Size](../../system.drawing/image/size/) { get; } | Gets the width and height, in pixels, of this image. |
| [Tag](../../system.drawing/image/tag/) { get; set; } | Gets or sets an object that provides additional data about the image. |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | Gets the vertical resolution, in pixels per inch, of this Image. |
| override [Width](../../system.drawing.imaging/metafile/width/) { get; } | Gets the width, in pixels, of this Metafile. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../system.drawing/image/clone/)() | Creates an exact copy of this Image. |
| virtual [Dispose](../../system.drawing/image/dispose/)() | Releases all resources used by this Image. |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | Gets the bounds of the image in the specified unit. |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | Returns the number of frames of the specified dimension. |
| [GetHenhmetafile](../../system.drawing.imaging/metafile/gethenhmetafile/)() | Returns a Windows handle to an enhanced Metafile. |
| [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/)() | Returns the MetafileHeader associated with this Metafile. |
| override [GetPropertyItem](../../system.drawing.imaging/metafile/getpropertyitem/)(int) | Gets the specified property item from this Image. |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | Returns a thumbnail for this Image. |
| [PlayRecord](../../system.drawing.imaging/metafile/playrecord/)(EmfPlusRecordType, int, int, byte[]) | Plays an individual metafile record. |
| override [RemovePropertyItem](../../system.drawing.imaging/metafile/removepropertyitem/)(int) | Removes the specified property item from this Image. |
| override [RotateFlip](../../system.drawing.imaging/metafile/rotateflip/)(RotateFlipType) | This method rotates, flips, or rotates and flips the Image. |
| [Save](../../system.drawing/image/save/)(string) | Saves this Image to the specified file or stream. |
| [Save](../../system.drawing/image/save/)(Stream, ImageFormat) | Saves this image to the specified stream in the specified format. |
| [Save](../../system.drawing/image/save/)(string, ImageFormat) | Saves this Image to the specified file in the specified format. |
| [Save](../../system.drawing/image/save/)(Stream, ImageCodecInfo, EncoderParameters) | Saves this image to the specified stream, with the specified encoder and image encoder parameters. |
| [Save](../../system.drawing/image/save/)(string, ImageCodecInfo, EncoderParameters) | Saves this Image to the specified file, with the specified encoder and image-encoder parameters. |
| [SaveAdd](../../system.drawing/image/saveadd/)(EncoderParameters) | Adds a frame to the file or stream specified in a previous call to the one of Image.Save(...) methods. Use this method to save selected frames from a multiple-frame image to another multiple-frame image. |
| [SaveAdd](../../system.drawing/image/saveadd/)(Image, EncoderParameters) | Adds a frame to the file or stream specified in a previous call to the one of Image.Save(...) methods. |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | Selects the frame specified by the dimension and index. |
| override [SetPropertyItem](../../system.drawing.imaging/metafile/setpropertyitem/)(PropertyItem) | Stores a property item (piece of metadata) in this Image. |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/#getmetafileheader)(Stream) | Returns the MetafileHeader associated with the specified Metafile. |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/#getmetafileheader_1)(string) | Returns the MetafileHeader associated with the specified Metafile. |

### See Also

* class [Image](../../system.drawing/image/)
* namespace [System.Drawing.Imaging](../../system.drawing.imaging/)
* assembly [Aspose.Drawing](../../)


