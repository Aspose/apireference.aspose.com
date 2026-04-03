---
title: SetKeywords
second_title: Aspose.OCR 适用于 .NET API 参考
description: 设置用于搜索 OCR 识别文本的关键字。
type: docs
weight: 60
url: /zh/net/aspose.ocr.ai/keywordsaiprocessor/setkeywords/
---
## KeywordsAIProcessor.SetKeywords method

设置用于搜索 OCR 识别文本的关键字。

```csharp
public void SetKeywords(string[] keywords)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| keywords | String[] | 要搜索的关键字。匹配不区分大小写且顺序无关。 |

### 示例

```csharp
var processor = new KeywordsAIProcessor();
processor.SetKeywords(new[] { "Total", "Subtotal", "Discount", "Quantity" });
```

### 另请参见

* class [KeywordsAIProcessor](../../keywordsaiprocessor)
* namespace [Aspose.OCR.AI](../../keywordsaiprocessor)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
