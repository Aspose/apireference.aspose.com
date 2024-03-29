---
title: ApngOptions
second_title: Aspose.Imaging for .NET API 参考
description: 动画 PNG 文件格式选项
type: docs
weight: 9900
url: /zh/net/aspose.imaging.imageoptions/apngoptions/
---
## ApngOptions class

动画 PNG 文件格式选项

```csharp
public class ApngOptions : PngOptions
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [ApngOptions](apngoptions)() | 默认构造函数。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [BitDepth](../../aspose.imaging.imageoptions/pngoptions/bitdepth) { get; set; } | 位深度。 |
| [BufferSizeHint](../../aspose.imaging/imageoptionsbase/buffersizehint) { get; set; } | 获取或设置缓冲区大小提示，该提示定义了所有内部缓冲区的最大允许大小。 |
| [ColorType](../../aspose.imaging.imageoptions/pngoptions/colortype) { get; set; } | 获取或设置颜色的类型。 |
| [CompressionLevel](../../aspose.imaging.imageoptions/pngoptions/compressionlevel) { get; set; } | png 图片压缩级别在 0-9 范围内，其中 9 为最大压缩，0 为存储模式。 |
| [DefaultFrameTime](../../aspose.imaging.imageoptions/apngoptions/defaultframetime) { get; set; } | 获取或设置默认帧持续时间。 |
| [Disposed](../../aspose.imaging/disposableobject/disposed) { get; } | 获取一个值，该值指示此实例是否被释放。 |
| [FilterType](../../aspose.imaging.imageoptions/pngoptions/filtertype) { get; set; } | 获取或设置 png 文件保存过程中使用的过滤器类型。 |
| [FullFrame](../../aspose.imaging/imageoptionsbase/fullframe) { get; set; } | 获取或设置一个值，指示是否[全帧]. |
| [MultiPageOptions](../../aspose.imaging/imageoptionsbase/multipageoptions) { get; set; } | 多页选项 |
| [NumPlays](../../aspose.imaging.imageoptions/apngoptions/numplays) { get; set; } | 获取或设置循环动画的次数。 0表示无限循环。 |
| virtual [Palette](../../aspose.imaging/imageoptionsbase/palette) { get; set; } | 获取或设置调色板。 |
| [ProgressEventHandler](../../aspose.imaging/imageoptionsbase/progresseventhandler) { get; set; } | 获取或设置进度事件处理程序。 |
| [Progressive](../../aspose.imaging.imageoptions/pngoptions/progressive) { get; set; } | 获取或设置一个值，该值指示是否[`PngOptions`](../pngoptions)是进步的。 |
| virtual [ResolutionSettings](../../aspose.imaging/imageoptionsbase/resolutionsettings) { get; set; } | 获取或设置分辨率设置。 |
| [Source](../../aspose.imaging/imageoptionsbase/source) { get; set; } | 获取或设置要在其中创建图像的源。 |
| [VectorRasterizationOptions](../../aspose.imaging/imageoptionsbase/vectorrasterizationoptions) { get; set; } | 获取或设置矢量光栅化选项。 |
| override [XmpData](../../aspose.imaging.imageoptions/pngoptions/xmpdata) { get; set; } | 获取或设置 XMP 元数据容器。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| virtual [Clone](../../aspose.imaging/imageoptionsbase/clone)() | 克隆此实例。 |
| [Dispose](../../aspose.imaging/disposableobject/dispose)() | 处理当前实例。 |

### 例子

以下示例显示如何从其他非动画多页格式导出 apng APNG 文件格式。

```csharp
[C#]

using Aspose.Imaging;
using Aspose.Imaging.ImageOptions;

using (Image image = Image.Load("img4.tif")) {
    // 设置默认帧时长
    image.Save("img4.tif.500ms.png", new ApngOptions() { DefaultFrameTime = 500 }); // 500 毫秒
    image.Save("img4.tif.250ms.png", new ApngOptions() { DefaultFrameTime = 250 }); // 250 毫秒
}
```

以下示例显示了如何导出为 APNG 文件格式。

```csharp
[C#]

using Aspose.Imaging;
using Aspose.Imaging.ImageOptions;

using (Image image = Image.Load("Animation1.webp")) {
    // 默认导出为无限动画周期的 APNG 动画
    image.Save("Animation1.webp.png", new ApngOptions());
    // 设置动画循环
    image.Save("Animation2.webp.png", new ApngOptions() { NumPlays = 5 }); // 5 个周期
}
```

以下示例显示如何从另一个光栅单页图像创建 APNG 图像。

```csharp
[C#]

using Aspose.Imaging;
using Aspose.Imaging.ImageOptions;
using Aspose.Imaging.FileFormats.Apng;

const int AnimationDuration = 1000; // 1 秒
const int FrameDuration = 70; // 70 毫秒
using (RasterImage sourceImage = (RasterImage)Image.Load("not_animated.png"))
{
    ApngOptions createOptions = new ApngOptions
    {
        Source = new FileCreateSource("raster_animation.png", false),
        DefaultFrameTime = (uint)FrameDuration,
        ColorType = PngColorType.TruecolorWithAlpha,
    };

    using (ApngImage apngImage = (ApngImage)Image.Create(
        createOptions,
        sourceImage.Width,
        sourceImage.Height))
    {
        // 可以在那里设置图像默认帧时间：apngImage.DefaultFrameTime = (uint)FrameDuration;

        int numOfFrames = AnimationDuration / FrameDuration;
        int numOfFrames2 = numOfFrames / 2;

        // 清理因为图片默认包含一帧
        apngImage.RemoveAllFrames();

        // 添加第一帧
        apngImage.AddFrame(sourceImage);

        // 添加中间帧
        for (int frameIndex = 1; frameIndex < numOfFrames - 1; ++frameIndex)
        {
            apngImage.AddFrame(sourceImage);
            ApngFrame lastFrame = (ApngFrame)apngImage.Pages[apngImage.PageCount - 1];
            float gamma = frameIndex >= numOfFrames2 ? numOfFrames - frameIndex - 1 : frameIndex;
            lastFrame.AdjustGamma(gamma);
        }

        // 添加最后一帧
        apngImage.AddFrame(sourceImage);

        apngImage.Save();
    }
}
```

### 也可以看看

* class [PngOptions](../pngoptions)
* 命名空间 [Aspose.Imaging.ImageOptions](../../aspose.imaging.imageoptions)
* 部件 [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
