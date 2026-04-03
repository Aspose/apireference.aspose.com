---
title: RecognitionResult
second_title: Aspose.OCR 适用于 .NET API 参考
description: 图像识别的结果。包含带有识别信息的元素以及用于导出结果的方法。
type: docs
weight: 140
url: /zh/net/aspose.ocr/recognitionresult/
---
## RecognitionResult class

图像识别的结果。包含带有识别信息的元素以及用于导出结果的方法。

```csharp
public class RecognitionResult
```

## 属性

| 名称 | 描述 |
| --- | --- |
| [FileName](../../aspose.ocr/recognitionresult/filename) { get; set; } | 文件的完整路径。 |
| [Image](../../aspose.ocr/recognitionresult/image) { get; set; } | 获取或设置用于 PDF 创建的图像。 |
| [RecognitionCharactersList](../../aspose.ocr/recognitionresult/recognitioncharacterslist) { get; } | 识别算法找到的一组字符，按概率降序排列。 |
| [RecognitionLinesResult](../../aspose.ocr/recognitionresult/recognitionlinesresult) { get; } | 获取包含行列表（矩形）的识别结果列表。 |
| [RecognitionText](../../aspose.ocr/recognitionresult/recognitiontext) { get; set; } | 以单个字符串获取识别结果。 |
| [Warnings](../../aspose.ocr/recognitionresult/warnings) { get; } | 获取描述生成过程中出现的非关键错误的警告消息列表。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [GetJson](../../aspose.ocr/recognitionresult/getjson)(bool) | 生成包含识别结果的 JSON 字符串。 |
| [GetKeywords](../../aspose.ocr/recognitionresult/getkeywords)() | 从护照获取关键字（测试模式，仅适用于美国和马达加斯加护照）。 |
| [GetSpellCheckCorrectedText](../../aspose.ocr/recognitionresult/getspellcheckcorrectedtext)(SpellCheckLanguage, string) | 纠正文本（替换拼写错误的单词）。 |
| [GetSpellCheckErrorList](../../aspose.ocr/recognitionresult/getspellcheckerrorlist)(SpellCheckLanguage, string) | 查找给定输入文本中拼写错误的单词并提供建议拼写。 |
| [GetXml](../../aspose.ocr/recognitionresult/getxml)() | 生成包含识别结果的 XML 字符串。 |
| [Save](../../aspose.ocr/recognitionresult/save#save_1)(MemoryStream, SaveFormat, string, PdfOptimizationMode) | 将文档保存为纯文本、PDF 或 Microsoft Word 文档。 |
| [Save](../../aspose.ocr/recognitionresult/save#save_3)(string, SaveFormat, string, PdfOptimizationMode) | 将文档保存为纯文本、PDF 或 Microsoft Word 文档。 |
| [Save](../../aspose.ocr/recognitionresult/save#save)(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string, string, PdfOptimizationMode) | 将文档保存为纯文本、PDF 或 Microsoft Word 文档。 |
| [Save](../../aspose.ocr/recognitionresult/save#save_2)(string, SaveFormat, bool, SpellCheckLanguage, string, string, PdfOptimizationMode) | 将文档保存为纯文本、PDF 或 Microsoft Word 文档。 |
| [operator +](../../aspose.ocr/recognitionresult/op_addition) | 完成来自已识别片段（行）的完整结果。 |

## 其他成员

| 名称 | 描述 |
| --- | --- |
| class [LinesResult](recognitionresult.linesresult) | 带有行坐标的已识别行文本。 |

### 另请参见

* namespace [Aspose.OCR](../../aspose.ocr)
* assembly [Aspose.OCR](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
