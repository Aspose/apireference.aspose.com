---
title: KeywordsAIProcessor
second_title: Aspose.OCR 适用于 .NET API 参考
description: 分析 OCR 结果并提取关键字和数值的 AI 后处理器。
type: docs
weight: 590
url: /zh/net/aspose.ocr.ai/keywordsaiprocessor/
---
## KeywordsAIProcessor class

分析 OCR 结果并提取关键字和数值的 AI 后处理器。

```csharp
public class KeywordsAIProcessor : IOcrAIPostProcessor
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [KeywordsAIProcessor](keywordsaiprocessor)() | 初始化一个新的 [`KeywordsAIProcessor`](../keywordsaiprocessor) 类实例。对 OCR 识别的文本执行基于 AI 的关键字和数值搜索。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [GetResult](../../aspose.ocr.ai/keywordsaiprocessor/getresult)() | 返回 AI 处理后的识别结果。识别输出以 JSON 格式的字符串返回，结构如下： |
| [SaveMd](../../aspose.ocr.ai/keywordsaiprocessor/savemd)(string) | 将提取的结构化表格保存为 Markdown（.md）文件。 |
| [SaveTxt](../../aspose.ocr.ai/keywordsaiprocessor/savetxt)(string) | 将提取的表格和处理后的文本结果保存到 TXT 文件中。 |
| [SaveXlsx](../../aspose.ocr.ai/keywordsaiprocessor/savexlsx)(string) | 将提取的结构化表格保存为 XLSX（Excel）文件。 |
| [SetKeywords](../../aspose.ocr.ai/keywordsaiprocessor/setkeywords)(string[]) | 设置用于搜索 OCR 识别文本的关键字。 |

### 另请参见

* interface [IOcrAIPostProcessor](../iocraipostprocessor)
* namespace [Aspose.OCR.AI](../../aspose.ocr.ai)
* assembly [Aspose.OCR](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
