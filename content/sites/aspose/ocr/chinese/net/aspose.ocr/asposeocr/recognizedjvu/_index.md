---
title: RecognizeDjvu
second_title: Aspose.OCR 适用于 .NET API 参考
description: 从多页 DJVU 图像中识别文本。识别 DJVU 文件，并可指定 DocumentRecognitionSettingsaspose.ocr/documentrecognitionsettings。仅支持 DJVU。不支持其他图像类型。
type: docs
weight: 120
url: /zh/net/aspose.ocr/asposeocr/recognizedjvu/
---
## RecognizeDjvu(string, DocumentRecognitionSettings) {#recognizedjvu_1}

从多页 DJVU 图像中识别文本。识别 DJVU 文件，并可指定 [`DocumentRecognitionSettings`](../../documentrecognitionsettings)。仅支持 DJVU。不支持其他图像类型。

```csharp
public List<RecognitionResult> RecognizeDjvu(string fullPath, DocumentRecognitionSettings settings)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| fullPath | String | 图像的完整路径。 |
| settings | DocumentRecognitionSettings | Recognition settings. |

### 返回值

包含图像识别结果的对象列表 [`RecognitionResult`](../../recognitionresult)。

### 另请参见

* class [RecognitionResult](../../recognitionresult)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

---

## RecognizeDjvu(MemoryStream, DocumentRecognitionSettings) {#recognizedjvu}

从多页 DJVU 图像中识别文本。识别 DJVU 文件，并可指定 [`DocumentRecognitionSettings`](../../documentrecognitionsettings)。仅支持 DJVU。不支持其他图像类型。

```csharp
public List<RecognitionResult> RecognizeDjvu(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | MemoryStream | 包含 DJVU 文件的内存流。 |
| settings | DocumentRecognitionSettings | Recognition settings. |

### 返回值

包含图像识别结果的对象列表 [`RecognitionResult`](../../recognitionresult)。

### 另请参见

* class [RecognitionResult](../../recognitionresult)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings)
* class [AsposeOcr](../../asposeocr)
* namespace [Aspose.OCR](../../asposeocr)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
