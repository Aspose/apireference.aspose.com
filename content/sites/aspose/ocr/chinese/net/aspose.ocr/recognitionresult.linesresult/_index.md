---
title: RecognitionResult.LinesResult
second_title: Aspose.OCR 适用于 .NET API 参考
description: 带有行坐标的已识别行文本。
type: docs
weight: 640
url: /zh/net/aspose.ocr/recognitionresult.linesresult/
---
## RecognitionResult.LinesResult class

带有行坐标的已识别行文本。

```csharp
public class LinesResult
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [LinesResult](linesresult)() | LinesResult 对象的构造函数。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [Confidence](../../aspose.ocr/linesresult/confidence) { get; set; } | 分配给识别文本行的置信度分数，以 0.0 到 1.0 之间的浮点值表示。分数为 1.0 表示最高的识别确定性。使用临时许可证时，此值始终设为 0。置信度仅对以下语言计算：中文语言组、阿拉伯语、印地语、欧洲语言、韩语、日语、泰卢固语、泰米尔语和卡纳达语。对 ExtLatin 或包含变音符号的语言不计算置信度。 |
| [Line](../../aspose.ocr/linesresult/line) { get; set; } | 行坐标。 |
| [TextInLine](../../aspose.ocr/linesresult/textinline) { get; set; } | 来自行的识别文本。 |

### 另请参见

* class [RecognitionResult](../recognitionresult)
* namespace [Aspose.OCR](../../aspose.ocr)
* assembly [Aspose.OCR](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
