---
title: ReceiptRecognitionSettings
second_title: Aspose.OCR 适用于 .NET API 参考
description: 收据识别的设置。包含可自定义识别过程的元素。
type: docs
weight: 270
url: /zh/net/aspose.ocr/receiptrecognitionsettings/
---
## ReceiptRecognitionSettings class

收据识别的设置。包含可自定义识别过程的元素。

```csharp
public class ReceiptRecognitionSettings : BaseRecognitionSettings
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [ReceiptRecognitionSettings](receiptrecognitionsettings#constructor)() | 使用默认属性集初始化 [`ReceiptRecognitionSettings`](../receiptrecognitionsettings) 类的新实例。 |
| [ReceiptRecognitionSettings](receiptrecognitionsettings#constructor_1)(Language) | 使用完整属性集初始化 [`ReceiptRecognitionSettings`](../receiptrecognitionsettings) 类的新实例。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/baserecognitionsettings/allowedcharacters) { get; set; } | 允许字符集。确定识别结果允许的字符类型。 |
| [AllowedSymbols](../../aspose.ocr/baserecognitionsettings/allowedsymbols) { get; set; } | 使用 alphabet 属性设置允许的字符。 |
| [AutomaticColorInversion](../../aspose.ocr/baserecognitionsettings/automaticcolorinversion) { get; set; } | 检测白色文字位于深色/黑色背景上的图像，并自动为其选择专用 OCR 算法。 |
| [IgnoredSymbols](../../aspose.ocr/baserecognitionsettings/ignoredsymbols) { get; set; } | 设置识别符号的黑名单。 |
| [Language](../../aspose.ocr/baserecognitionsettings/language) { get; set; } | 获取或设置用于 OCR 的语言。确定识别期间使用的字母表。默认情况下为多语言。 |
| [RecognizeVerticalLines](../../aspose.ocr/baserecognitionsettings/recognizeverticallines) { get; set; } | 获取或设置一个值，指示是否应在检测和识别水平文本行的基础上检测和识别垂直文本行。默认值为 `false`。 |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount) { get; set; } | 获取或设置用于处理的线程数。默认情况下，0 表示图像将使用等于处理器数量的线程数进行处理。ThreadsCount = 1 表示图像将在主线程中处理。 |

### 另请参见

* class [BaseRecognitionSettings](../baserecognitionsettings)
* namespace [Aspose.OCR](../../aspose.ocr)
* assembly [Aspose.OCR](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
