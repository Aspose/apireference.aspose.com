---
title: AsposeOcr.RecognizeTiff
second_title: Aspose.OCR for .NET API 参考
description: AsposeOcr 方法. 从多页 TIFF 图像中识别文本  识别具有指定能力的 TIFF 文件DocumentRecognitionSettings. 仅支持 TIFF TIF不支持其他图像类型
type: docs
weight: 240
url: /zh/net/aspose.ocr/asposeocr/recognizetiff/
---
## RecognizeTiff(string, DocumentRecognitionSettings) {#recognizetiff_1}

从多页 TIFF 图像中识别文本。  识别具有指定能力的 TIFF 文件[`DocumentRecognitionSettings`](../../documentrecognitionsettings/). 仅支持 TIFF (TIF)。不支持其他图像类型。

```csharp
public List<RecognitionResult> RecognizeTiff(string fullPath, DocumentRecognitionSettings settings)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| fullPath | String | 图片的完整路径。 |
| settings | DocumentRecognitionSettings | 识别设置。 |

### 返回值

这[`RecognitionResult`](../../recognitionresult/)具有图像识别结果的对象列表。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)

---

## RecognizeTiff(MemoryStream, DocumentRecognitionSettings) {#recognizetiff}

从多页 TIFF 图像中识别文本。  识别具有指定能力的 TIFF 文件[`DocumentRecognitionSettings`](../../documentrecognitionsettings/). 仅支持 TIFF (TIF)。不支持其他图像类型。

```csharp
public List<RecognitionResult> RecognizeTiff(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| stream | MemoryStream | 带有 TIFF 文件的内存流。 |
| settings | DocumentRecognitionSettings | 识别设置。 |

### 返回值

这[`RecognitionResult`](../../recognitionresult/)具有图像识别结果的对象列表。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)


