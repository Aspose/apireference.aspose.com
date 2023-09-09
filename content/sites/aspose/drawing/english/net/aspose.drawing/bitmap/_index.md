---
title: Class Bitmap
second_title: Aspose.Drawing for .NET API Reference
description: Aspose.Drawing.Bitmap class. 
type: docs
weight: 10
url: /net/aspose.drawing/bitmap/
---
## Bitmap class

```csharp
public class Bitmap : Image
```

## Constructors

| Name | Description |
| --- | --- |
| [Bitmap](bitmap/#constructor)(Image) |  |
| [Bitmap](bitmap/#constructor_6)(Stream) |  |
| [Bitmap](bitmap/#constructor_8)(string) |  |
| [Bitmap](bitmap/#constructor_1)(Image, Size) |  |
| [Bitmap](bitmap/#constructor_3)(int, int) |  |
| [Bitmap](bitmap/#constructor_7)(Stream, bool) |  |
| [Bitmap](bitmap/#constructor_9)(string, bool) |  |
| [Bitmap](bitmap/#constructor_2)(Image, int, int) |  |
| [Bitmap](bitmap/#constructor_4)(int, int, PixelFormat) |  |
| [Bitmap](bitmap/#constructor_5)(int, int, int, PixelFormat, int[]) |  |

## Properties

| Name | Description |
| --- | --- |
| [Flags](../../aspose.drawing/image/flags/) { get; } |  |
| override [FrameDimensionsList](../../aspose.drawing/bitmap/framedimensionslist/) { get; } |  |
| override [Height](../../aspose.drawing/bitmap/height/) { get; } |  |
| [HorizontalResolution](../../aspose.drawing/image/horizontalresolution/) { get; } |  |
| override [Palette](../../aspose.drawing/bitmap/palette/) { get; set; } |  |
| [PhysicalDimension](../../aspose.drawing/image/physicaldimension/) { get; } |  |
| override [PixelFormat](../../aspose.drawing/bitmap/pixelformat/) { get; } |  |
| override [PropertyIdList](../../aspose.drawing/bitmap/propertyidlist/) { get; } |  |
| override [PropertyItems](../../aspose.drawing/bitmap/propertyitems/) { get; } |  |
| override [RawFormat](../../aspose.drawing/bitmap/rawformat/) { get; } |  |
| [Size](../../aspose.drawing/image/size/) { get; } |  |
| [Tag](../../aspose.drawing/image/tag/) { get; set; } |  |
| [VerticalResolution](../../aspose.drawing/image/verticalresolution/) { get; } |  |
| override [Width](../../aspose.drawing/bitmap/width/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.drawing/image/clone/)() |  |
| [Clone](../../aspose.drawing/bitmap/clone/#clone)(Rectangle, PixelFormat) |  |
| [Clone](../../aspose.drawing/bitmap/clone/#clone_1)(RectangleF, PixelFormat) |  |
| virtual [Dispose](../../aspose.drawing/image/dispose/)() |  |
| [GetBounds](../../aspose.drawing/image/getbounds/)(ref GraphicsUnit) |  |
| [GetFrameCount](../../aspose.drawing/image/getframecount/)(FrameDimension) |  |
| [GetPixel](../../aspose.drawing/bitmap/getpixel/)(int, int) |  |
| override [GetPropertyItem](../../aspose.drawing/bitmap/getpropertyitem/)(int) |  |
| [GetThumbnailImage](../../aspose.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) |  |
| [LockBits](../../aspose.drawing/bitmap/lockbits/)(Rectangle, ImageLockMode, PixelFormat) |  |
| [MakeTransparent](../../aspose.drawing/bitmap/maketransparent/#maketransparent)() |  |
| [MakeTransparent](../../aspose.drawing/bitmap/maketransparent/#maketransparent_1)(Color) |  |
| [ReadArgb32Pixels](../../aspose.drawing/bitmap/readargb32pixels/)(int[]) |  |
| override [RemovePropertyItem](../../aspose.drawing/bitmap/removepropertyitem/)(int) |  |
| override [RotateFlip](../../aspose.drawing/bitmap/rotateflip/)(RotateFlipType) |  |
| [Save](../../aspose.drawing/image/save/)(string) |  |
| [Save](../../aspose.drawing/image/save/)(Stream, ImageFormat) |  |
| [Save](../../aspose.drawing/image/save/)(string, ImageFormat) |  |
| [Save](../../aspose.drawing/image/save/)(Stream, ImageCodecInfo, EncoderParameters) |  |
| [Save](../../aspose.drawing/image/save/)(string, ImageCodecInfo, EncoderParameters) |  |
| [SaveAdd](../../aspose.drawing/image/saveadd/)(EncoderParameters) |  |
| [SaveAdd](../../aspose.drawing/image/saveadd/)(Image, EncoderParameters) |  |
| [SelectActiveFrame](../../aspose.drawing/image/selectactiveframe/)(FrameDimension, int) |  |
| [SetPixel](../../aspose.drawing/bitmap/setpixel/)(int, int, Color) |  |
| override [SetPropertyItem](../../aspose.drawing/bitmap/setpropertyitem/)(PropertyItem) |  |
| [SetResolution](../../aspose.drawing/bitmap/setresolution/)(float, float) |  |
| [UnlockBits](../../aspose.drawing/bitmap/unlockbits/)(BitmapData) |  |
| [WriteArgb32Pixels](../../aspose.drawing/bitmap/writeargb32pixels/)(int[]) |  |

### See Also

* class [Image](../image/)
* namespace [Aspose.Drawing](../../aspose.drawing/)
* assembly [Aspose.Drawing.Common](../../)


