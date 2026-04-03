---
title: DocumentRecognitionSettings
second_title: Aspose.OCR 适用于 .NET API 参考
description: PDF 识别的设置。包含可自定义识别过程的元素。
type: docs
weight: 140
url: /zh/net/aspose.ocr/documentrecognitionsettings/
---
## DocumentRecognitionSettings class

PDF 识别的设置。包含可自定义识别过程的元素。

```csharp
public class DocumentRecognitionSettings : BaseRecognitionSettings
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [DocumentRecognitionSettings](documentrecognitionsettings#constructor)(int, int) | 使用简短属性集初始化 [`DocumentRecognitionSettings`](../documentrecognitionsettings) 类的新实例。 |
| [DocumentRecognitionSettings](documentrecognitionsettings#constructor_1)(int, int, Language, bool, bool, int) | 使用完整属性集初始化 [`DocumentRecognitionSettings`](../documentrecognitionsettings) 类的新实例。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/baserecognitionsettings/allowedcharacters) { get; set; } | 允许字符集。确定识别结果允许的字符类型。 |
| [AutoContrast](../../aspose.ocr/baserecognitionsettings/autocontrast) { get; set; } | 允许在识别前对图像使用额外的对比度校正算法。 |
| [AutoDenoising](../../aspose.ocr/baserecognitionsettings/autodenoising) { get; set; } | 启用额外的神经网络以提升图像——降低噪声。适用于带有扫描伪影、失真、斑点、耀光、渐变或异物的图像。 |
| [AutoSkew](../../aspose.ocr/baserecognitionsettings/autoskew) { set; } | 获取或设置一个标志，指示是否应启用自动图像倾斜校正。默认启用（true）。 |
| [DetectAreasMode](../../aspose.ocr/baserecognitionsettings/detectareasmode) { get; set; } | 允许为文档类型区域选择最佳模式：文档、照片、纯文本、列、图像。 |
| [IgnoredCharacters](../../aspose.ocr/baserecognitionsettings/ignoredcharacters) { get; set; } | 设置识别符号的黑名单。 |
| [Language](../../aspose.ocr/baserecognitionsettings/language) { set; } | 获取或设置用于 OCR 的语言。确定识别期间使用的字母表。默认情况下为多语言。 |
| [LinesFiltration](../../aspose.ocr/baserecognitionsettings/linesfiltration) { get; set; } | 允许识别表格中的文本（被线条包围的区域）。 |
| [PagesNumber](../../aspose.ocr/documentrecognitionsettings/pagesnumber) { get; set; } | 设置多页 PDF 文件的识别页数。 |
| [PreprocessingFilters](../../aspose.ocr/baserecognitionsettings/preprocessingfilters) { get; set; } | 允许通过调整预处理方法来准备图像进行 OCR。 |
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle) { set; } | 获取或设置图像旋转的角度（度）。设置此值将禁用 [`AutoSkew`](../baserecognitionsettings/autoskew) 属性，从而不进行自动倾斜校正。默认值为零。 |
| [StartPage](../../aspose.ocr/documentrecognitionsettings/startpage) { get; set; } | 设置要识别的起始页。 |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount) { set; } | 获取或设置用于处理的线程数。默认情况下，0 表示图像将使用等于处理器数量的线程数进行处理。ThreadsCount = 1 表示图像将在主线程中处理。 |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue) { set; } | 获取或设置图像二值化的自定义阈值。范围为 1 到 255。 |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont) { get; set; } | 允许使用专用于小字体识别的额外算法。适用于字符尺寸较小的图像。 |

### 另请参见

* class [BaseRecognitionSettings](../baserecognitionsettings)
* namespace [Aspose.OCR](../../aspose.ocr)
* assembly [Aspose.OCR](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
