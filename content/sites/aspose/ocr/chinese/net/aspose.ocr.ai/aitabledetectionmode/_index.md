---
title: AITableDetectionMode
second_title: Aspose.OCR 适用于 .NET API 参考
description: 定义用于改进表格布局识别的表格检测模式。
type: docs
weight: 560
url: /zh/net/aspose.ocr.ai/aitabledetectionmode/
---
## AITableDetectionMode enumeration

定义用于改进表格布局识别的表格检测模式。

```csharp
public enum AITableDetectionMode
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| NONE | `0` | 不显式检测表格，而是将整幅图像视为单个表格进行处理。返回识别的文本以及任何检测到的表格，同时改进整体布局。表格会被检测到，但不会从图像中裁剪。 |
| AUTO | `1` | 自动检测表格，将其从周围文本中提取，应用适当的表格布局，并返回完整结构化且带标记的表格。 |

### 另请参见

* namespace [Aspose.OCR.AI](../../aspose.ocr.ai)
* assembly [Aspose.OCR](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
