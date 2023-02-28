---
title: AsposeOcr.RecognizePdf
second_title: Aspose.OCR for .NET API 参考
description: AsposeOcr 方法. 从扫描的 pdf 中识别文本提取图像  识别具有指定能力的 pdf 文件DocumentRecognitionSettings. 仅支持扫描的 PDF不支持可搜索的 PDF.
type: docs
weight: 220
url: /zh/net/aspose.ocr/asposeocr/recognizepdf/
---
## RecognizePdf(string, DocumentRecognitionSettings) {#recognizepdf_1}

从扫描的 pdf 中识别文本（提取图像）。  识别具有指定能力的 pdf 文件[`DocumentRecognitionSettings`](../../documentrecognitionsettings/). 仅支持扫描的 PDF。不支持可搜索的 PDF.

```csharp
public List<RecognitionResult> RecognizePdf(string fullPath, DocumentRecognitionSettings settings)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| fullPath | String | 图片的完整路径。 |
| settings | DocumentRecognitionSettings | 识别设置。 |

### 返回值

这[`RecognitionResult`](../../recognitionresult/)具有图像识别结果的对象。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)

---

## RecognizePdf(MemoryStream, DocumentRecognitionSettings) {#recognizepdf}

从扫描的 pdf 中识别文本（提取图像）。  识别具有指定能力的 pdf 文件[`RecognitionSettings`](../../recognitionsettings/). 仅支持扫描的 PDF。不支持可搜索的 PDF.

```csharp
public List<RecognitionResult> RecognizePdf(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| stream | MemoryStream | 带有 pdf 文件的内存流。 |
| settings | DocumentRecognitionSettings | 识别设置。 |

### 返回值

这[`RecognitionResult`](../../recognitionresult/)具有图像识别结果的对象。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)


