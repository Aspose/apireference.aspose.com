---
title: Class Metafile
second_title: Aspose.Drawing for .NET API Reference
description: Aspose.Drawing.Imaging.Metafile class. Defines a graphic metafile. A metafile contains records that describe a sequence of graphics operations that can be recorded constructed and played back displayed. This class is not inheritable
type: docs
weight: 770
url: /net/aspose.drawing.imaging/metafile/
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
| [Metafile](metafile/#constructor_1)(IntPtr, bool) | Initializes a new instance of the `Metafile` class from the specified handle. |
| [Metafile](metafile/#constructor)(IntPtr, EmfType) | Initializes a new instance of the `Metafile` class from the specified handle to a device context and an EmfType enumeration that specifies the format of the Metafile. |
| [Metafile](metafile/#constructor_3)(Stream, IntPtr) | Initializes a new instance of the `Metafile` class from the specified data stream and a Windows handle to a device context. /&gt;. |
| [Metafile](metafile/#constructor_7)(string, IntPtr) | Initializes a new instance of the `Metafile` class from the specified file name. |
| [Metafile](metafile/#constructor_4)(Stream, IntPtr, EmfType) | Initializes a new instance of the `Metafile` class from the specified data stream, a Windows handle to a device context, and an EmfType enumeration that specifies the format of the Metafile. |
| [Metafile](metafile/#constructor_5)(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | Initializes a new instance of the `Metafile` class from the specified data stream, a Windows handle to a device context, and an EmfType enumeration that specifies the format of the Metafile. |

## Properties

| Name | Description |
| --- | --- |
| [Flags](../../aspose.drawing/image/flags/) { get; } | Gets the integer representing a bitwise combination of [`ImageFlags`](../imageflags/) for this Image. |
| override [FrameDimensionsList](../../aspose.drawing.imaging/metafile/framedimensionslist/) { get; } | Gets an array of GUIDs that represent the dimensions of frames within this Image. |
| override [Height](../../aspose.drawing.imaging/metafile/height/) { get; } | Gets the height, in pixels, of this Metafile. |
| [HorizontalResolution](../../aspose.drawing/image/horizontalresolution/) { get; } | Gets the horizontal resolution, in pixels per inch, of this Image. |
| override [Palette](../../aspose.drawing.imaging/metafile/palette/) { get; set; } | Gets or sets the color palette used for this Image. |
| [PhysicalDimension](../../aspose.drawing/image/physicaldimension/) { get; } | Gets the width and height of this image. |
| override [PixelFormat](../../aspose.drawing.imaging/metafile/pixelformat/) { get; } | Gets the pixel format for this Image. |
| override [PropertyIdList](../../aspose.drawing.imaging/metafile/propertyidlist/) { get; } | Gets IDs of the property items stored in this Image. |
| override [PropertyItems](../../aspose.drawing.imaging/metafile/propertyitems/) { get; } | Gets all the property items (pieces of metadata) stored in this Image. |
| override [RawFormat](../../aspose.drawing.imaging/metafile/rawformat/) { get; } | Gets the file format of this Image. |
| [Size](../../aspose.drawing/image/size/) { get; } | Gets the width and height, in pixels, of this image. |
| [Tag](../../aspose.drawing/image/tag/) { get; set; } | Gets or sets an object that provides additional data about the image. |
| [VerticalResolution](../../aspose.drawing/image/verticalresolution/) { get; } | Gets the vertical resolution, in pixels per inch, of this Image. |
| override [Width](../../aspose.drawing.imaging/metafile/width/) { get; } | Gets the width, in pixels, of this Metafile. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.drawing/image/clone/)() | Creates an exact copy of this Image. |
| virtual [Dispose](../../aspose.drawing/image/dispose/)() | Releases all resources used by this Image. |
| [GetBounds](../../aspose.drawing/image/getbounds/)(ref GraphicsUnit) | Gets the bounds of the image in the specified unit. |
| [GetFrameCount](../../aspose.drawing/image/getframecount/)(FrameDimension) | Returns the number of frames of the specified dimension. |
| [GetHenhmetafile](../../aspose.drawing.imaging/metafile/gethenhmetafile/)() | Returns a Windows handle to an enhanced Metafile. |
| [GetMetafileHeader](../../aspose.drawing.imaging/metafile/getmetafileheader/)() | Returns the MetafileHeader associated with this Metafile. |
| override [GetPropertyItem](../../aspose.drawing.imaging/metafile/getpropertyitem/)(int) | Gets the specified property item from this Image. |
| [GetThumbnailImage](../../aspose.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | Returns a thumbnail for this Image. |
| [PlayRecord](../../aspose.drawing.imaging/metafile/playrecord/)(EmfPlusRecordType, int, int, byte[]) | Plays an individual metafile record. |
| override [RemovePropertyItem](../../aspose.drawing.imaging/metafile/removepropertyitem/)(int) | Removes the specified property item from this Image. |
| override [RotateFlip](../../aspose.drawing.imaging/metafile/rotateflip/)(RotateFlipType) | This method rotates, flips, or rotates and flips the Image. |
| [Save](../../aspose.drawing/image/save/)(string) | Saves this Image to the specified file or stream. |
| [Save](../../aspose.drawing/image/save/)(Stream, ImageFormat) | Saves this image to the specified stream in the specified format. |
| [Save](../../aspose.drawing/image/save/)(string, ImageFormat) | Saves this Image to the specified file in the specified format. |
| [Save](../../aspose.drawing/image/save/)(Stream, ImageCodecInfo, EncoderParameters) | Saves this image to the specified stream, with the specified encoder and image encoder parameters. |
| [Save](../../aspose.drawing/image/save/)(string, ImageCodecInfo, EncoderParameters) | Saves this Image to the specified file, with the specified encoder and image-encoder parameters. |
| [SaveAdd](../../aspose.drawing/image/saveadd/)(EncoderParameters) | Adds a frame to the file or stream specified in a previous call to the one of Image.Save(...) methods. Use this method to save selected frames from a multiple-frame image to another multiple-frame image. |
| [SaveAdd](../../aspose.drawing/image/saveadd/)(Image, EncoderParameters) | Adds a frame to the file or stream specified in a previous call to the one of Image.Save(...) methods. |
| [SelectActiveFrame](../../aspose.drawing/image/selectactiveframe/)(FrameDimension, int) | Selects the frame specified by the dimension and index. |
| override [SetPropertyItem](../../aspose.drawing.imaging/metafile/setpropertyitem/)(PropertyItem) | Stores a property item (piece of metadata) in this Image. |
| static [GetMetafileHeader](../../aspose.drawing.imaging/metafile/getmetafileheader/#getmetafileheader)(Stream) | Returns the MetafileHeader associated with the specified Metafile. |
| static [GetMetafileHeader](../../aspose.drawing.imaging/metafile/getmetafileheader/#getmetafileheader_1)(string) | Returns the MetafileHeader associated with the specified Metafile. |

### See Also

* class [Image](../../aspose.drawing/image/)
* namespace [Aspose.Drawing.Imaging](../../aspose.drawing.imaging/)
* assembly [Aspose.Drawing.Common](../../)


