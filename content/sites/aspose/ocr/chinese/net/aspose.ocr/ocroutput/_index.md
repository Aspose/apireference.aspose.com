---
title: OcrOutput
second_title: Aspose.OCR 适用于 .NET API 参考
description: 用于存储和管理 OCR 操作结果的容器类。
type: docs
weight: 420
url: /zh/net/aspose.ocr/ocroutput/
---
## OcrOutput class

用于存储和管理 OCR 操作结果的容器类。

```csharp
public class OcrOutput : List<RecognitionResult>
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [OcrOutput](ocroutput#constructor)() | 使用空集合初始化 [`OcrOutput`](../ocroutput) 类的新实例。此构造函数调用基类构造函数来初始化空的 [`RecognitionResult`](../recognitionresult) 列表。 |
| [OcrOutput](ocroutput#constructor_1)(int) | 使用指定的初始容量初始化 [`OcrOutput`](../ocroutput) 类的新实例。此构造函数创建一个预先分配了指定数量元素的 [`OcrOutput`](../ocroutput)，在事先已知大小时可优化性能。 |
| [OcrOutput](ocroutput#constructor_2)(IEnumerable&lt;RecognitionResult&gt;, OcrInput) | 使用指定的 [`RecognitionResult`](../recognitionresult) 集合初始化 [`OcrOutput`](../ocroutput) 类的新实例。此构造函数通过复制提供的集合中的元素来创建新的 [`OcrOutput`](../ocroutput)。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [IsReadOnly](../../aspose.ocr/ocroutput/isreadonly) { get; } | 始终返回 false，因为 OcrOutput 是可变的。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [AddRange](../../aspose.ocr/ocroutput/addrange#addrange)(IEnumerable&lt;RecognitionResult&gt;) | 将指定集合的元素添加到 [`OcrOutput`](../ocroutput) 列表的末尾。此方法覆盖默认的 AddRange 行为，以在需要时执行额外操作。 |
| [GetTableData](../../aspose.ocr/ocroutput/gettabledata)() | 返回从所有已识别页面提取的结构化表格数据。如果整页都是一个表格，则非常有用。 |
| [Save](../../aspose.ocr/ocroutput/save#save)(MemoryStream, SaveFormat, string, PdfOptimizationMode) | 将所有识别结果以指定格式保存到内存流中。 |
| [Save](../../aspose.ocr/ocroutput/save#save_1)(string, SaveFormat, string, PdfOptimizationMode) | 将所有识别结果保存到文件中。 |
| [SavePdf](../../aspose.ocr/ocroutput/savepdf#savepdf)(MemoryStream, string, PdfOptimizationMode) | 将所有识别结果保存为内存中的可搜索 PDF 文档，并将原始图像嵌入为背景。 |
| [SavePdf](../../aspose.ocr/ocroutput/savepdf#savepdf_1)(string, string, PdfOptimizationMode) | 将所有识别结果保存为可搜索的 PDF 文件，并将原始图像设置为背景。 |

### 另请参见

* class [RecognitionResult](../recognitionresult)
* namespace [Aspose.OCR](../../aspose.ocr)
* assembly [Aspose.OCR](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
