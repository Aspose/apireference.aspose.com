---
title: RasterImage
second_title: Aspose.CAD for .NET API 参考
description: 表示支持光栅图形操作的光栅图像
type: docs
weight: 30230
url: /zh/net/aspose.cad/rasterimage/
---
## RasterImage class

表示支持光栅图形操作的光栅图像。

```csharp
public abstract class RasterImage : Image, IRasterImageArgb32PixelLoader
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| abstract [BitsPerPixel](../../aspose.cad/rasterimage/bitsperpixel) { get; } | 获取每像素的图像位数。 |
| [Bounds](../../aspose.cad/image/bounds) { get; } | 获取图像边界。 |
| [Container](../../aspose.cad/image/container) { get; } | 获取[`Image`](../image)容器。 |
| [DataStreamContainer](../../aspose.cad/datastreamsupporter/datastreamcontainer) { get; } |  |
| [Disposed](../../aspose.cad/disposableobject/disposed) { get; } |  |
| virtual [HasAlpha](../../aspose.cad/rasterimage/hasalpha) { get; } | 获取一个值，该值指示此实例是否具有 alpha。 |
| virtual [HasTransparentColor](../../aspose.cad/rasterimage/hastransparentcolor) { get; set; } | 获取图像是否具有透明色的值。 |
| abstract [Height](../../aspose.cad/image/height) { get; } | 获取图像高度。 |
| virtual [HorizontalResolution](../../aspose.cad/rasterimage/horizontalresolution) { get; set; } | 获取或设置此[`RasterImage`](../rasterimage)的水平分辨率，以每英寸像素为单位。 |
| abstract [IsCached](../../aspose.cad/datastreamsupporter/iscached) { get; } |  |
| [IsRawDataAvailable](../../aspose.cad/rasterimage/israwdataavailable) { get; } | 获取一个值，该值指示是否可以加载原始数据。 |
| [Palette](../../aspose.cad/image/palette) { get; set; } | 获取或设置调色板。 |
| [RawCustomColorConverter](../../aspose.cad/rasterimage/rawcustomcolorconverter) { get; set; } | 获取或设置自定义颜色转换器 |
| virtual [RawDataFormat](../../aspose.cad/rasterimage/rawdataformat) { get; } | 获取原始数据格式。 |
| [RawDataSettings](../../aspose.cad/rasterimage/rawdatasettings) { get; } | 获取当前原始数据设置。请注意，使用这些设置时，数据加载时无需转换。 |
| [RawFallbackIndex](../../aspose.cad/rasterimage/rawfallbackindex) { get; set; } | 获取或设置调色板索引超出范围时使用的后备索引 |
| [RawIndexedColorConverter](../../aspose.cad/rasterimage/rawindexedcolorconverter) { get; set; } | 获取或设置索引颜色转换器 |
| virtual [RawLineSize](../../aspose.cad/rasterimage/rawlinesize) { get; } | 获取原始行大小（以字节为单位）。 |
| [Size](../../aspose.cad/image/size) { get; } | 获取图片大小。 |
| virtual [TransparentColor](../../aspose.cad/rasterimage/transparentcolor) { get; set; } | 获取图像透明色。 |
| virtual [UnitlessDefaultUnitType](../../aspose.cad/image/unitlessdefaultunittype) { get; } | UnitType 设置为 Unitless 时的假定单位类型 |
| [UnitType](../../aspose.cad/image/unittype) { get; } | 获取当前单位类型。 |
| virtual [VerticalResolution](../../aspose.cad/rasterimage/verticalresolution) { get; set; } | 获取或设置此[`RasterImage`](../rasterimage)的垂直分辨率，以每英寸像素为单位。 |
| abstract [Width](../../aspose.cad/image/width) { get; } | 获取图像宽度。 |
| virtual [XmpData](../../aspose.cad/rasterimage/xmpdata) { get; set; } | 获取或设置 XMP 元数据。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| abstract [AdjustBrightness](../../aspose.cad/rasterimage/adjustbrightness)(int) | 调整图像的亮度。 |
| abstract [AdjustContrast](../../aspose.cad/rasterimage/adjustcontrast)(float) | 图像对比度 |
| abstract [AdjustGamma](../../aspose.cad/rasterimage/adjustgamma#adjustgamma)(float) | 图像的伽玛校正。 |
| abstract [AdjustGamma](../../aspose.cad/rasterimage/adjustgamma#adjustgamma_1)(float, float, float) | 图像的伽玛校正。 |
| abstract [BinarizeBradley](../../aspose.cad/rasterimage/binarizebradley)(double) | 使用 Bradley 自适应阈值算法对图像进行二值化，使用积分图像阈值 |
| abstract [BinarizeFixed](../../aspose.cad/rasterimage/binarizefixed)(byte) | 具有预定义阈值的图像二值化 |
| abstract [BinarizeOtsu](../../aspose.cad/rasterimage/binarizeotsu)() | 使用 Otsu 阈值对图像进行二值化 |
| abstract [CacheData](../../aspose.cad/datastreamsupporter/cachedata)() |  |
| [CanSave](../../aspose.cad/image/cansave)(ImageOptionsBase) | 确定图像是否可以保存为传递的保存选项表示的指定文件格式。 |
| abstract [Crop](../../aspose.cad/rasterimage/crop#crop)(Rectangle) | 裁剪图像。 |
| virtual [Crop](../../aspose.cad/rasterimage/crop#crop_1)(int, int, int, int) | 带班次的裁剪图像。 |
| [Dispose](../../aspose.cad/disposableobject/dispose)() |  |
| [Dither](../../aspose.cad/rasterimage/dither#dither)(DitheringMethod, int) | 对当前图像执行抖动。 |
| abstract [Dither](../../aspose.cad/rasterimage/dither#dither_1)(DitheringMethod, int, IColorPalette) | 对当前图像执行抖动。 |
| virtual [Filter](../../aspose.cad/rasterimage/filter)(Rectangle, FilterOptionsBase) | 过滤指定的矩形。 |
| [GetArgb32Pixel](../../aspose.cad/rasterimage/getargb32pixel)(int, int) | 获取图像 32 位 ARGB 像素。 |
| [GetDefaultArgb32Pixels](../../aspose.cad/rasterimage/getdefaultargb32pixels)(Rectangle) | 获取默认的 32 位 ARGB 像素数组。 |
| [GetDefaultPixels](../../aspose.cad/rasterimage/getdefaultpixels)(Rectangle, IPartialArgb32PixelLoader) | 使用部分像素加载器获取默认像素数组。 |
| [GetDefaultRawData](../../aspose.cad/rasterimage/getdefaultrawdata#getdefaultrawdata)(Rectangle, RawDataSettings) | 获取默认的原始数据数组。 |
| [GetDefaultRawData](../../aspose.cad/rasterimage/getdefaultrawdata#getdefaultrawdata_1)(Rectangle, IPartialRawDataLoader, RawDataSettings) | 使用部分像素加载器获取默认原始数据数组。 |
| [GetPixel](../../aspose.cad/rasterimage/getpixel)(int, int) | 获取图像像素。 |
| virtual [GetStrings](../../aspose.cad/image/getstrings)() | 从image中获取所有字符串值。 |
| abstract [Grayscale](../../aspose.cad/rasterimage/grayscale)() | 将图像转换为其灰度表示 |
| [LoadArgb32Pixels](../../aspose.cad/rasterimage/loadargb32pixels)(Rectangle) | 加载 32 位 ARGB 像素。 |
| [LoadCmykPixels](../../aspose.cad/rasterimage/loadcmykpixels)(Rectangle) | 以 CMYK 格式加载像素。 |
| [LoadPartialArgb32Pixels](../../aspose.cad/rasterimage/loadpartialargb32pixels)(Rectangle, IPartialArgb32PixelLoader) | 部分按包加载 32 位 ARGB 像素。 |
| [LoadPartialPixels](../../aspose.cad/rasterimage/loadpartialpixels)(Rectangle, IPartialPixelLoader) | 部分按包加载像素。 |
| [LoadPixels](../../aspose.cad/rasterimage/loadpixels)(Rectangle) | 加载像素。 |
| [LoadRawData](../../aspose.cad/rasterimage/loadrawdata)(Rectangle, RawDataSettings, IPartialRawDataLoader) | 加载原始数据。 |
| [ReadScanLine](../../aspose.cad/rasterimage/readscanline)(int) | 通过指定的扫描线索引读取整个扫描线。 |
| [ReadScanLineArgb](../../aspose.cad/rasterimage/readscanlineargb)(int) | 通过指定的扫描线索引读取整个扫描线。 |
| abstract [Resize](../../aspose.cad/rasterimage/resize#resize)(int, int, ImageResizeSettings) | 调整图像大小。 |
| abstract [Resize](../../aspose.cad/rasterimage/resize#resize_1)(int, int, ResizeType) | 调整图像大小。 |
| abstract [Rotate](../../aspose.cad/rasterimage/rotate)(float, bool, Color) | 围绕中心旋转图像。 |
| [Save](../../aspose.cad/image/save)() | 将图像数据保存到底层流。 |
| [Save](../../aspose.cad/datastreamsupporter/save)(Stream) |  |
| virtual [Save](../../aspose.cad/datastreamsupporter/save)(string) |  |
| [Save](../../aspose.cad/image/save)(Stream, ImageOptionsBase) | 根据保存选项将图片数据以指定的文件格式保存到指定的流中。 |
| virtual [Save](../../aspose.cad/datastreamsupporter/save)(string, bool) |  |
| virtual [Save](../../aspose.cad/image/save)(string, ImageOptionsBase) | 根据保存选项将对象的数据以指定的文件格式保存到指定的文件位置。 |
| [SaveArgb32Pixels](../../aspose.cad/rasterimage/saveargb32pixels)(Rectangle, int[]) | 保存 32 位 ARGB 像素。 |
| [SaveCmykPixels](../../aspose.cad/rasterimage/savecmykpixels)(Rectangle, CmykColor[]) | 保存像素。 |
| [SavePixels](../../aspose.cad/rasterimage/savepixels)(Rectangle, Color[]) | 保存像素。 |
| [SaveRawData](../../aspose.cad/rasterimage/saverawdata)(byte[], int, Rectangle, RawDataSettings) | 保存原始数据。 |
| [SetArgb32Pixel](../../aspose.cad/rasterimage/setargb32pixel)(int, int, int) | 为指定位置设置图像 32 位 ARGB 像素。 |
| virtual [SetPalette](../../aspose.cad/rasterimage/setpalette)(IColorPalette, bool) | 设置图像调色板。 |
| [SetPixel](../../aspose.cad/rasterimage/setpixel)(int, int, Color) | 为指定位置设置图像像素。 |
| virtual [SetResolution](../../aspose.cad/rasterimage/setresolution)(double, double) | 设置分辨率[`RasterImage`](../rasterimage). |
| [WriteScanLine](../../aspose.cad/rasterimage/writescanline#writescanline)(int, Color[]) | 将整个扫描线写入指定的扫描线索引。 |
| [WriteScanLine](../../aspose.cad/rasterimage/writescanline#writescanline_1)(int, int[]) | 将整个扫描线写入指定的扫描线索引。 |

### 也可以看看

* class [Image](../image)
* interface [IRasterImageArgb32PixelLoader](../irasterimageargb32pixelloader)
* 命名空间 [Aspose.CAD](../../aspose.cad)
* 部件 [Aspose.CAD](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.CAD.dll -->
