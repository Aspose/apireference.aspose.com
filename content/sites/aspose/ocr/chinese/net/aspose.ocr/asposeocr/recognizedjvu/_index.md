---
title: AsposeOcr.RecognizeDjvu
second_title: Aspose.OCR for .NET API 参考
description: AsposeOcr 方法. 从多页 DJVU 图像中识别文本  识别具有指定能力的 DJVU 文件DocumentRecognitionSettings. 仅支持 DJVU不支持其他图像类型
type: docs
weight: 120
url: /zh/net/aspose.ocr/asposeocr/recognizedjvu/
---
## RecognizeDjvu(string, DocumentRecognitionSettings) {#recognizedjvu_1}

从多页 DJVU 图像中识别文本。  识别具有指定能力的 DJVU 文件[`DocumentRecognitionSettings`](../../documentrecognitionsettings/). 仅支持 DJVU。不支持其他图像类型。

```csharp
public List<RecognitionResult> RecognizeDjvu(string fullPath, DocumentRecognitionSettings settings)
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

## RecognizeDjvu(MemoryStream, DocumentRecognitionSettings) {#recognizedjvu}

从多页 DJVU 图像中识别文本。  识别具有指定能力的 DJVU 文件[`DocumentRecognitionSettings`](../../documentrecognitionsettings/). 仅支持 DJVU。不支持其他图像类型。

```csharp
public List<RecognitionResult> RecognizeDjvu(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| stream | MemoryStream | 带有 DJVU 文件的内存流。 |
| settings | DocumentRecognitionSettings | 识别设置。 |

### 返回值

这[`RecognitionResult`](../../recognitionresult/)具有图像识别结果的对象列表。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)


