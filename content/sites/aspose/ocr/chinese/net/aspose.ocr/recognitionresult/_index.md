---
title: Class RecognitionResult
second_title: Aspose.OCR for .NET API 参考
description: Aspose.OCR.RecognitionResult 班级. 图像识别的结果 包含具有识别信息和结果导出方法的元素
type: docs
weight: 220
url: /zh/net/aspose.ocr/recognitionresult/
---
## RecognitionResult class

图像识别的结果。 包含具有识别信息和结果导出方法的元素。

```csharp
public class RecognitionResult
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Image](../../aspose.ocr/recognitionresult/image/) { get; set; } | 获取或设置用于创建 pdf 的图像。 |
| [RecognitionAreasRectangles](../../aspose.ocr/recognitionresult/recognitionareasrectangles/) { get; } | 获取矩形坐标。 |
| [RecognitionAreasText](../../aspose.ocr/recognitionresult/recognitionareastext/) { get; } | 获取区域列表（矩形）的列表识别结果。 |
| [RecognitionCharactersList](../../aspose.ocr/recognitionresult/recognitioncharacterslist/) { get; } | 识别算法找到的一组字符，按概率降序排列。 |
| [RecognitionLinesResult](../../aspose.ocr/recognitionresult/recognitionlinesresult/) { get; } | 获取识别结果列表，其中包含行列表（矩形）。 |
| [RecognitionText](../../aspose.ocr/recognitionresult/recognitiontext/) { get; } | 获取一串识别结果. |
| [Skew](../../aspose.ocr/recognitionresult/skew/) { get; } | 获取倾斜角度。 |
| [Warnings](../../aspose.ocr/recognitionresult/warnings/) { get; } | 获取描述生成期间出现的非严重故障的警告消息列表。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [GetJson](../../aspose.ocr/recognitionresult/getjson/)(bool) | 形成带有识别结果的 JSON 字符串。 |
| [GetSpellCheckCorrectedText](../../aspose.ocr/recognitionresult/getspellcheckcorrectedtext/)(SpellCheckLanguage, string) | 更正文本（替换拼写错误的单词）。 |
| [GetSpellCheckErrorList](../../aspose.ocr/recognitionresult/getspellcheckerrorlist/)(SpellCheckLanguage, string) | 根据给定输入文本的建议拼写查找拼写错误的单词。 |
| [GetXml](../../aspose.ocr/recognitionresult/getxml/)() | 将识别结果形成 XML 字符串。 |
| [Save](../../aspose.ocr/recognitionresult/save/#save)(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) | 将文档另存为纯文本、PDF 或 Microsoft Word 文档。 |
| [Save](../../aspose.ocr/recognitionresult/save/#save_1)(string, SaveFormat, bool, SpellCheckLanguage, string) | 将文档另存为纯文本、PDF 或 Microsoft Word 文档。 |
| [operator +](../../aspose.ocr/recognitionresult/op_addition/) | 完成识别片段（行）的完整结果。 |

## 其他成员

| 姓名 | 描述 |
| --- | --- |
| class [LinesResult](recognitionresult.linesresult/) | 从具有行坐标的行中识别出的文本。 |

### 也可以看看

* 命名空间 [Aspose.OCR](../../aspose.ocr/)
* 部件 [Aspose.OCR](../../)


