---
title: Class Image
second_title: Aspose.Drawing for .NET API Reference
description: Aspose.Drawing.Image class. 
type: docs
weight: 550
url: /net/aspose.drawing/image/
---
## Image class

```csharp
public abstract class Image : IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [Image](image/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Flags](../../aspose.drawing/image/flags/) { get; } |  |
| abstract [FrameDimensionsList](../../aspose.drawing/image/framedimensionslist/) { get; } |  |
| abstract [Height](../../aspose.drawing/image/height/) { get; } |  |
| [HorizontalResolution](../../aspose.drawing/image/horizontalresolution/) { get; } |  |
| abstract [Palette](../../aspose.drawing/image/palette/) { get; set; } |  |
| [PhysicalDimension](../../aspose.drawing/image/physicaldimension/) { get; } |  |
| abstract [PixelFormat](../../aspose.drawing/image/pixelformat/) { get; } |  |
| abstract [PropertyIdList](../../aspose.drawing/image/propertyidlist/) { get; } |  |
| abstract [PropertyItems](../../aspose.drawing/image/propertyitems/) { get; } |  |
| abstract [RawFormat](../../aspose.drawing/image/rawformat/) { get; } |  |
| [Size](../../aspose.drawing/image/size/) { get; } |  |
| [Tag](../../aspose.drawing/image/tag/) { get; set; } |  |
| [VerticalResolution](../../aspose.drawing/image/verticalresolution/) { get; } |  |
| abstract [Width](../../aspose.drawing/image/width/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| static [FromFile](../../aspose.drawing/image/fromfile/)(string) |  |
| static [FromStream](../../aspose.drawing/image/fromstream/#fromstream)(Stream) |  |
| static [FromStream](../../aspose.drawing/image/fromstream/#fromstream_1)(Stream, bool) |  |
| [Clone](../../aspose.drawing/image/clone/)() |  |
| virtual [Dispose](../../aspose.drawing/image/dispose/)() |  |
| [GetBounds](../../aspose.drawing/image/getbounds/)(ref GraphicsUnit) |  |
| [GetFrameCount](../../aspose.drawing/image/getframecount/)(FrameDimension) |  |
| abstract [GetPropertyItem](../../aspose.drawing/image/getpropertyitem/)(int) |  |
| [GetThumbnailImage](../../aspose.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) |  |
| abstract [RemovePropertyItem](../../aspose.drawing/image/removepropertyitem/)(int) |  |
| abstract [RotateFlip](../../aspose.drawing/image/rotateflip/)(RotateFlipType) |  |
| [Save](../../aspose.drawing/image/save/#save_2)(string) |  |
| [Save](../../aspose.drawing/image/save/#save_1)(Stream, ImageFormat) |  |
| [Save](../../aspose.drawing/image/save/#save_4)(string, ImageFormat) |  |
| [Save](../../aspose.drawing/image/save/#save)(Stream, ImageCodecInfo, EncoderParameters) |  |
| [Save](../../aspose.drawing/image/save/#save_3)(string, ImageCodecInfo, EncoderParameters) |  |
| [SaveAdd](../../aspose.drawing/image/saveadd/#saveadd_1)(EncoderParameters) |  |
| [SaveAdd](../../aspose.drawing/image/saveadd/#saveadd)(Image, EncoderParameters) |  |
| [SelectActiveFrame](../../aspose.drawing/image/selectactiveframe/)(FrameDimension, int) |  |
| abstract [SetPropertyItem](../../aspose.drawing/image/setpropertyitem/)(PropertyItem) |  |
| static [FromHbitmap](../../aspose.drawing/image/fromhbitmap/)(IntPtr) |  |
| static [GetPixelFormatSize](../../aspose.drawing/image/getpixelformatsize/)(PixelFormat) |  |
| static [IsAlphaPixelFormat](../../aspose.drawing/image/isalphapixelformat/)(PixelFormat) |  |

## Other Members

| Name | Description |
| --- | --- |
| delegate [GetThumbnailImageAbort](../../aspose.drawing/image.getthumbnailimageabort) |  |

### See Also

* namespace [Aspose.Drawing](../../aspose.drawing/)
* assembly [Aspose.Drawing.Common](../../)


