---
title: DetectAreasMode
second_title: Aspose.OCR 适用于 .NET API 参考
description: 确定用于区域检测的神经网络类型。
type: docs
weight: 90
url: /zh/net/aspose.ocr/detectareasmode/
---
## DetectAreasMode enumeration

确定用于区域检测的神经网络类型。

```csharp
public enum DetectAreasMode
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| LEAN | `0` | 通过省略对复杂布局的支持来优先考虑速度并降低资源消耗。仅适用于没有插图或格式的少量文本行的简单图像。 |
| MULTICOLUMN | `1` | 检测以列格式的大块文本。是书页、文章或合同等多列布局的最佳选择。 |
| UNIVERSAL | `2` | 检测图像中的所有文本块，包括照片上稀疏和不规则的文字。是大多数图像的通用选项，表格和多列布局除外。 |
| TABLE | `4` | 检测图像中的表格结构并提取各单元格的文字。推荐用于扫描的电子表格、报告及其他基于表格的文档。 |
| CURVED_TEXT | `5` | 自动校正图像中弯曲的文字行，提升识别准确率并使更多文字得以恢复和提取。需要大量的处理能力和内存。 |
| FORMULA | `6` | 检测所有包含数学公式的块。 |

### 备注

在 [`RecognitionSettings`](../recognitionsettings) 中使用，用于指定要识别的图像类型。

### 另请参见

* namespace [Aspose.OCR](../../aspose.ocr)
* assembly [Aspose.OCR](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
