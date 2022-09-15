---
title: Metafile
second_title: Aspose.Drawing for .NET API 参考
description: 定义图形元文件 元文件包含描述一系列图形操作的记录 可以记录构造和回放显示 此类不可继承
type: docs
weight: 800
url: /zh/net/system.drawing.imaging/metafile/
---
## Metafile class

定义图形元文件。 元文件包含描述一系列图形操作的记录 ，可以记录（构造）和回放（显示）。 此类不可继承。

```csharp
public sealed class Metafile : Image
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [Metafile](metafile#constructor_2)(Stream) | 初始化[`Metafile`](../metafile)来自指定数据流的类。 |
| [Metafile](metafile#constructor_6)(string) | 初始化[`Metafile`](../metafile)来自指定文件名的类。 |
| [Metafile](metafile#constructor)(IntPtr, bool) | 初始化[`Metafile`](../metafile)来自指定句柄的类。 |
| [Metafile](metafile#constructor_1)(IntPtr, EmfType) | 初始化[`Metafile`](../metafile)类从指定句柄到设备上下文 和EmfType指定格式的枚举Metafile. |
| [Metafile](metafile#constructor_3)(Stream, IntPtr) | 初始化[`Metafile`](../metafile)来自指定 数据流的类和设备上下文的 Windows 句柄。 /&gt;. |
| [Metafile](metafile#constructor_7)(string, IntPtr) | 初始化[`Metafile`](../metafile)来自指定文件名的类。 |
| [Metafile](metafile#constructor_4)(Stream, IntPtr, EmfType) | 初始化[`Metafile`](../metafile)来自指定 数据流的类、设备上下文的 Windows 句柄和EmfTypeenumeration 指定的格式Metafile. |
| [Metafile](metafile#constructor_5)(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | 初始化[`Metafile`](../metafile)来自指定 数据流的类、设备上下文的 Windows 句柄和EmfTypeenumeration 指定的格式Metafile. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | 获取表示按位组合的整数[`ImageFlags`](../imageflags)对于这个 Image. |
| override [FrameDimensionsList](../../system.drawing.imaging/metafile/framedimensionslist) { get; } | 获取一个 GUID 数组，这些 GUID 表示此框架内的框架的尺寸Image. |
| override [Height](../../system.drawing.imaging/metafile/height) { get; } | 获取此高度（以像素为单位）Metafile. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | 获取水平分辨率（以每英寸像素为单位）Image. |
| override [Palette](../../system.drawing.imaging/metafile/palette) { get; set; } | 获取或设置用于此的调色板Image. |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | 获取此图像的宽度和高度。 |
| override [PixelFormat](../../system.drawing.imaging/metafile/pixelformat) { get; } | 获取此像素格式Image. |
| override [PropertyIdList](../../system.drawing.imaging/metafile/propertyidlist) { get; } | 获取存储在此的属性项的 IDImage. |
| override [PropertyItems](../../system.drawing.imaging/metafile/propertyitems) { get; } | 获取存储在此的所有属性项（元数据）Image. |
| override [RawFormat](../../system.drawing.imaging/metafile/rawformat) { get; } | 获取此文件的文件格式Image. |
| [Size](../../system.drawing/image/size) { get; } | 获取此图像的宽度和高度，以像素为单位。 |
| [Tag](../../system.drawing/image/tag) { get; set; } | 获取或设置提供有关图像的附加数据的对象。 |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | 获取垂直分辨率（以每英寸像素为单位）Image. |
| override [Width](../../system.drawing.imaging/metafile/width) { get; } | 获取此宽度（以像素为单位）Metafile. |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | 创建一个精确的副本Image. |
| virtual [Dispose](../../system.drawing/image/dispose)() | 释放此 Image 使用的所有资源。 |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | 以指定单位获取图像的边界。 |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | 返回指定维度的帧数。 |
| [GetHenhmetafile](../../system.drawing.imaging/metafile/gethenhmetafile)() | 将 Windows 句柄返回到增强的Metafile. |
| [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader)() | 返回MetafileHeader与此相关Metafile. |
| override [GetPropertyItem](../../system.drawing.imaging/metafile/getpropertyitem)(int) | 从中获取指定的属性项Image. |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | 返回一个缩略图Image. |
| [PlayRecord](../../system.drawing.imaging/metafile/playrecord)(EmfPlusRecordType, int, int, byte[]) | 播放单个元文件记录。 |
| override [RemovePropertyItem](../../system.drawing.imaging/metafile/removepropertyitem)(int) | 从中删除指定的属性项Image. |
| override [RotateFlip](../../system.drawing.imaging/metafile/rotateflip)(RotateFlipType) | 这个方法旋转，翻转，或者旋转和翻转Image. |
| [Save](../../system.drawing/image/save)(string) | 保存这个Image到指定的文件或流。 |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | 将此图像以指定格式保存到指定流中。 |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | 保存这个Image到指定格式的指定文件。 |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | 使用指定的编码器和图像编码器参数将此图像保存到指定的流中。 |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | 保存这个Image到指定的文件，带有指定的编码器和图像编码器参数。 |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | 将帧添加到在先前调用 Image.Save(...) 方法之一中指定的文件或流中。 使用此方法将选定帧从多帧图像保存到另一个多帧图像。 |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | 将帧添加到在先前调用 Image.Save(...) 方法之一中指定的文件或流中。 |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | 选择由尺寸和索引指定的框架。 |
| override [SetPropertyItem](../../system.drawing.imaging/metafile/setpropertyitem)(PropertyItem) | 在此存储一个属性项（元数据）Image. |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader#getmetafileheader)(Stream) | 返回MetafileHeader与指定的相关联Metafile. |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader#getmetafileheader_1)(string) | 返回MetafileHeader与指定的相关联Metafile. |

### 也可以看看

* class [Image](../../system.drawing/image)
* 命名空间 [System.Drawing.Imaging](../../system.drawing.imaging)
* 部件 [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
