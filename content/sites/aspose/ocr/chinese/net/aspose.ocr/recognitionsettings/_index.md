---
title: RecognitionSettings
second_title: Aspose.OCR 适用于 .NET API 参考
description: 图像识别的设置。包含允许自定义识别过程的元素。
type: docs
weight: 280
url: /zh/net/aspose.ocr/recognitionsettings/
---
## RecognitionSettings class

图像识别的设置。包含允许自定义识别过程的元素。

```csharp
public class RecognitionSettings : BaseRecognitionSettings
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [RecognitionSettings](recognitionsettings#constructor)() | 使用 auto skew = true 初始化 [`RecognitionSettings`](../recognitionsettings) 类的新实例。 |
| [RecognitionSettings](recognitionsettings#constructor_1)(Language, List&lt;Rectangle&gt;, bool) | 使用完整属性集初始化 [`RecognitionSettings`](../recognitionsettings) 类的新实例。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/baserecognitionsettings/allowedcharacters) { get; set; } | 允许字符集。确定识别结果允许的字符类型。 |
| [AllowedSymbols](../../aspose.ocr/baserecognitionsettings/allowedsymbols) { get; set; } | 使用 alphabet 属性设置允许的字符。 |
| [AutomaticColorInversion](../../aspose.ocr/baserecognitionsettings/automaticcolorinversion) { get; set; } | 检测白色文字位于深色/黑色背景上的图像，并自动为其选择专用 OCR 算法。 |
| [DetectAreasMode](../../aspose.ocr/recognitionsettings/detectareasmode) { get; set; } | 允许为文档类型区域选择最佳模式：文档、照片、纯文本、列、图像。 |
| [IgnoredSymbols](../../aspose.ocr/baserecognitionsettings/ignoredsymbols) { get; set; } | 设置识别符号的黑名单。 |
| [Language](../../aspose.ocr/baserecognitionsettings/language) { get; set; } | 获取或设置用于 OCR 的语言。确定识别期间使用的字母表。默认情况下为多语言。 |
| [LanguageDetectionLevel](../../aspose.ocr/recognitionsettings/languagedetectionlevel) { get; set; } | 指定文本识别的语言检测级别。仅在所选语言为 Multilanguage、Auto 或 Universal 时有效。此过程耗时，并显著降低整体识别速度。 |
| [LinesFiltration](../../aspose.ocr/recognitionsettings/linesfiltration) { get; set; } | 允许识别表格中的文本（被线条包围的区域）。 |
| [RecognitionAreas](../../aspose.ocr/recognitionsettings/recognitionareas) { get; set; } | 获取或设置用于处理的文本区域列表。允许手动指定包含文本的区域以获得更准确的识别。禁用 AutoSkew。 |
| [RecognizeSingleLine](../../aspose.ocr/recognitionsettings/recognizesingleline) { get; set; } | 设置单行图像识别。默认情况下禁用（false）。禁用所有与拆分为行相关的处理步骤。如果图像仅包含一行，请将此参数设为 true。禁用 RecognitionAreas 设置，所有区域设置将被忽略。 |
| [RecognizeVerticalLines](../../aspose.ocr/baserecognitionsettings/recognizeverticallines) { get; set; } | 获取或设置一个值，指示是否应在检测和识别水平文本行的基础上检测和识别垂直文本行。默认值为 `false`。 |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount) { get; set; } | 获取或设置用于处理的线程数。默认情况下，0 表示图像将使用等于处理器数量的线程数进行处理。ThreadsCount = 1 表示图像将在主线程中处理。 |
| [UpscaleSmallFont](../../aspose.ocr/recognitionsettings/upscalesmallfont) { get; set; } | 允许使用专用于小字体识别的额外算法。适用于字符尺寸较小的图像。 |

### 另请参见

* class [BaseRecognitionSettings](../baserecognitionsettings)
* namespace [Aspose.OCR](../../aspose.ocr)
* assembly [Aspose.OCR](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
