---
title: Class PngSaveOptions
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.Presentation.Image.PngSaveOptions 班级. XPSasPNG 保存选项的类
type: docs
weight: 380
url: /zh/net/aspose.page.xps.presentation.image/pngsaveoptions/
---
## PngSaveOptions class

XPS-as-PNG 保存选项的类。

```csharp
public class PngSaveOptions : ImageSaveOptions
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [PngSaveOptions](pngsaveoptions/)() | 创建选项的新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | 指定转换器应在其中为输入文档查找字体的其他文件夹。 默认文件夹是标准字体文件夹，操作系统在其中查找内部需要的字体。 |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | 指定是否必须将调试信息打印到标准输出流。 |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | 返回抑制的转换错误列表 如果!:SuppressErrors是真的。 |
| [InterpolationMode](../../aspose.page.xps.presentation.image/imagesaveoptions/interpolationmode/) { get; set; } | 获取/设置插值模式。 |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | 质量类别指定图像的压缩级别。 可用值为 0 到 100。 指定的数字越小，压缩越高，因此图像质量越低。 0 值导致图像质量最低，而 100 导致图像质量最高。 |
| [PageNumbers](../../aspose.page.xps.presentation.image/imagesaveoptions/pagenumbers/) { get; set; } | 获取/设置要转换的页数数组。 |
| [Resolution](../../aspose.page.xps.presentation.image/imagesaveoptions/resolution/) { get; set; } | 获取/设置图像分辨率。 |
| [SmoothingMode](../../aspose.page.xps.presentation.image/imagesaveoptions/smoothingmode/) { get; set; } | 获取/设置平滑模式。 |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | 指定是否必须抑制错误。 如果 true 抑制错误添加到[`Exceptions`](../../aspose.page/saveoptions/exceptions/)list. 如果为假，第一个错误将终止程序。 |
| [TextRenderingHint](../../aspose.page.xps.presentation.image/imagesaveoptions/textrenderinghint/) { get; set; } | 获取/设置文本渲染提示。 |

### 也可以看看

* class [ImageSaveOptions](../imagesaveoptions/)
* 命名空间 [Aspose.Page.XPS.Presentation.Image](../../aspose.page.xps.presentation.image/)
* 部件 [Aspose.Page](../../)


