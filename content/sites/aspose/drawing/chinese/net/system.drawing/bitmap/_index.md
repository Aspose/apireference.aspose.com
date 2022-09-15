---
title: Bitmap
second_title: Aspose.Drawing for .NET API 参考
description: 封装位图由图形图像的像素数据及其属性组成 ABitmap./bitmap是用于处理由像素数据定义的图像的对象
type: docs
weight: 40
url: /zh/net/system.drawing/bitmap/
---
## Bitmap class

封装位图，由图形图像的像素数据及其属性组成。 A[`Bitmap`](../bitmap)是用于处理由像素数据定义的图像的对象。

```csharp
public class Bitmap : Image
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [Bitmap](bitmap#constructor_3)(Image) | 初始化[`Bitmap`](../bitmap)来自指定的现有图像的类。 |
| [Bitmap](bitmap#constructor_6)(Stream) | 初始化[`Bitmap`](../bitmap)来自指定数据流的类。 |
| [Bitmap](bitmap#constructor_8)(string) | 初始化[`Bitmap`](../bitmap)来自指定文件的类。 |
| [Bitmap](bitmap#constructor_5)(Image, Size) | 初始化[`Bitmap`](../bitmap)来自指定的现有图像的类，缩放到指定的大小。 |
| [Bitmap](bitmap#constructor)(int, int) | 初始化[`Bitmap`](../bitmap)具有指定大小的类。 |
| [Bitmap](bitmap#constructor_7)(Stream, bool) | 初始化[`Bitmap`](../bitmap)来自指定数据流的类。 |
| [Bitmap](bitmap#constructor_9)(string, bool) | 初始化[`Bitmap`](../bitmap)来自指定文件的类。 |
| [Bitmap](bitmap#constructor_4)(Image, int, int) | 初始化[`Bitmap`](../bitmap)来自指定现有图像的类， 缩放到指定大小。 |
| [Bitmap](bitmap#constructor_2)(int, int, PixelFormat) | 初始化[`Bitmap`](../bitmap)具有指定大小和格式的类。 |
| [Bitmap](bitmap#constructor_1)(int, int, int, PixelFormat, int[]) | 初始化[`Bitmap`](../bitmap)具有指定大小和像素数据的类。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | 获取表示按位组合的整数[`ImageFlags`](../../system.drawing.imaging/imageflags)对于这个 Image. |
| override [FrameDimensionsList](../../system.drawing/bitmap/framedimensionslist) { get; } | 获取一个 GUID 数组，这些 GUID 表示此框架内的框架的尺寸Image. |
| override [Height](../../system.drawing/bitmap/height) { get; } | 获取此位图的高度，以像素为单位。 |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | 获取水平分辨率（以每英寸像素为单位）Image. |
| override [Palette](../../system.drawing/bitmap/palette) { get; set; } | 获取或设置用于此的调色板Image. |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | 获取此图像的宽度和高度。 |
| override [PixelFormat](../../system.drawing/bitmap/pixelformat) { get; } | 获取此像素格式Image. |
| override [PropertyIdList](../../system.drawing/bitmap/propertyidlist) { get; } | 获取存储在此的属性项的 IDImage. |
| override [PropertyItems](../../system.drawing/bitmap/propertyitems) { get; } | 获取存储在此的所有属性项（元数据）Image. |
| override [RawFormat](../../system.drawing/bitmap/rawformat) { get; } | 获取此文件的文件格式Image. |
| [Size](../../system.drawing/image/size) { get; } | 获取此图像的宽度和高度，以像素为单位。 |
| [Tag](../../system.drawing/image/tag) { get; set; } | 获取或设置提供有关图像的附加数据的对象。 |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | 获取垂直分辨率（以每英寸像素为单位）Image. |
| override [Width](../../system.drawing/bitmap/width) { get; } | 获取此位图的宽度，以像素为单位。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | 创建一个精确的副本Image. |
| [Clone](../../system.drawing/bitmap/clone#clone)(Rectangle, PixelFormat) | 创建此部分的副本Bitmap被定义为Rectanglestructure 并具有指定的PixelFormat枚举. |
| [Clone](../../system.drawing/bitmap/clone#clone_1)(RectangleF, PixelFormat) | 创建此部分的副本Bitmap用指定的定义PixelFormat枚举. |
| virtual [Dispose](../../system.drawing/image/dispose)() | 释放此 Image 使用的所有资源。 |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | 以指定单位获取图像的边界。 |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | 返回指定维度的帧数。 |
| [GetPixel](../../system.drawing/bitmap/getpixel)(int, int) | 获取此中指定像素的颜色Bitmap. |
| override [GetPropertyItem](../../system.drawing/bitmap/getpropertyitem)(int) | 从中获取指定的属性项Image. |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | 返回一个缩略图Image. |
| [LockBits](../../system.drawing/bitmap/lockbits)(Rectangle, ImageLockMode, PixelFormat) | 锁定一个Bitmap进入系统内存. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent#maketransparent)() | 使指定的颜色为此透明Bitmap. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent#maketransparent_1)(Color) | 使指定的颜色为此透明Bitmap. |
| [ReadArgb32Pixels](../../system.drawing/bitmap/readargb32pixels)(int[]) | 将 ARGB32 格式的位图像素读取到给定的数组中。 |
| override [RemovePropertyItem](../../system.drawing/bitmap/removepropertyitem)(int) | 从中删除指定的属性项Image. |
| override [RotateFlip](../../system.drawing/bitmap/rotateflip)(RotateFlipType) | 这个方法旋转，翻转，或者旋转和翻转Image. |
| [Save](../../system.drawing/image/save)(string) | 保存这个Image到指定的文件或流。 |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | 将此图像以指定格式保存到指定流中。 |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | 保存这个Image到指定格式的指定文件。 |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | 使用指定的编码器和图像编码器参数将此图像保存到指定的流中。 |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | 保存这个Image到指定的文件，带有指定的编码器和图像编码器参数。 |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | 将帧添加到在先前调用 Image.Save(...) 方法之一中指定的文件或流中。 使用此方法将选定帧从多帧图像保存到另一个多帧图像。 |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | 将帧添加到在先前调用 Image.Save(...) 方法之一中指定的文件或流中。 |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | 选择由尺寸和索引指定的框架。 |
| [SetPixel](../../system.drawing/bitmap/setpixel)(int, int, Color) | 设置此中指定像素的颜色Bitmap. |
| override [SetPropertyItem](../../system.drawing/bitmap/setpropertyitem)(PropertyItem) | 在此存储一个属性项（元数据）Image. |
| [SetResolution](../../system.drawing/bitmap/setresolution)(float, float) | 为此设置分辨率Bitmap. |
| [UnlockBits](../../system.drawing/bitmap/unlockbits)(BitmapData) | 解锁这个Bitmap从系统内存. |
| [WriteArgb32Pixels](../../system.drawing/bitmap/writeargb32pixels)(int[]) | 将像素写入位图。 |

### 也可以看看

* class [Image](../image)
* 命名空间 [System.Drawing](../../system.drawing)
* 部件 [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
