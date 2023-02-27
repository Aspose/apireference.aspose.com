---
title: Class DocumentRecognitionSettings
second_title: Aspose.OCR for .NET API 参考
description: Aspose.OCR.DocumentRecognitionSettings 班级. pdf 识别设置 包含允许自定义识别过程的元素
type: docs
weight: 70
url: /zh/net/aspose.ocr/documentrecognitionsettings/
---
## DocumentRecognitionSettings class

pdf 识别设置。 包含允许自定义识别过程的元素。

```csharp
public class DocumentRecognitionSettings : BaseRecognitionSettings
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [DocumentRecognitionSettings](documentrecognitionsettings/#constructor)(int, int) | 初始化一个新的实例`DocumentRecognitionSettings`具有短属性集的类. |
| [DocumentRecognitionSettings](documentrecognitionsettings/#constructor_1)(int, int, Language, bool, bool, int) | 初始化一个新的实例`DocumentRecognitionSettings`具有全套属性的类. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/baserecognitionsettings/allowedcharacters/) { get; set; } | 允许的字符集。确定识别结果允许的字符类型。 |
| [AutoContrast](../../aspose.ocr/baserecognitionsettings/autocontrast/) { get; set; } | 允许在识别前对图像使用额外的对比度校正算法。 |
| [AutoDenoising](../../aspose.ocr/baserecognitionsettings/autodenoising/) { get; set; } | 允许使用额外的神经网络来改善图像 - 减少噪声。 适用于具有扫描伪影、失真、斑点、光斑、渐变、外来元素的图像。 |
| [AutoSkew](../../aspose.ocr/baserecognitionsettings/autoskew/) { set; } | 获取或设置一个标志，指示是否应启用自动图像倾斜校正。 默认启用 (true)。 |
| [DetectAreasMode](../../aspose.ocr/baserecognitionsettings/detectareasmode/) { get; set; } | 允许为文档类型区域选择最佳模式：文档、照片、纯文本、列、图像。 |
| [IgnoredCharacters](../../aspose.ocr/baserecognitionsettings/ignoredcharacters/) { get; set; } | 为识别符号设置黑名单。 |
| [Language](../../aspose.ocr/baserecognitionsettings/language/) { set; } | 获取或设置用于 OCR 的语言。  确定识别时使用的字母表。 默认为多语言。 |
| [LinesFiltration](../../aspose.ocr/baserecognitionsettings/linesfiltration/) { get; set; } | 允许识别表格中的文本（区域包围线）。 |
| [PagesNumber](../../aspose.ocr/documentrecognitionsettings/pagesnumber/) { get; set; } | 设置识别多页pdf文件的页数. |
| [PreprocessingFilters](../../aspose.ocr/baserecognitionsettings/preprocessingfilters/) { get; set; } | 允许通过调整预处理方法为 OCR 准备图像。 |
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | 获取或设置图像旋转的角度（以度为单位）。  设置该值将禁用[`AutoSkew`](../baserecognitionsettings/autoskew/)属性，以便不应用自动倾斜校正。 默认为零。 |
| [StartPage](../../aspose.ocr/documentrecognitionsettings/startpage/) { get; set; } | 设置识别第一页。 |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | 获取或设置用于处理的线程数。 默认情况下，0 表示将使用等于处理器数量的线程数处理图像。 ThreadsCount = 1 表示将在主线程中处理图像。 |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | 获取或设置图像二值化的自定义阈值。 范围从 1 到 255. |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | 允许您使用专门用于小字体识别的附加算法。 对于具有小尺寸字符的图像很有用。 |

### 也可以看看

* class [BaseRecognitionSettings](../baserecognitionsettings/)
* 命名空间 [Aspose.OCR](../../aspose.ocr/)
* 部件 [Aspose.OCR](../../)


