---
title: AsposeOcr.RecognizeReceipt
second_title: Aspose.OCR for .NET API 参考
description: AsposeOcr 方法. 识别图像上的文本
type: docs
weight: 230
url: /zh/net/aspose.ocr/asposeocr/recognizereceipt/
---
## RecognizeReceipt(string, ReceiptRecognitionSettings) {#recognizereceipt_1}

识别图像上的文本。

```csharp
public RecognitionResult RecognizeReceipt(string fullPath, 
    ReceiptRecognitionSettings settings = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| fullPath | String | 图片的路径。 |
| settings | ReceiptRecognitionSettings | 识别设置[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/). |

### 返回值

这[`RecognitionResult`](../../recognitionresult/)具有图像识别结果的对象。

### 评论

识别具有指定能力的图像[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/). 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [ReceiptRecognitionSettings](../../receiptrecognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)

---

## RecognizeReceipt(MemoryStream, ReceiptRecognitionSettings) {#recognizereceipt}

识别图像上的文本。

```csharp
public RecognitionResult RecognizeReceipt(MemoryStream stream, 
    ReceiptRecognitionSettings settings = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| stream | MemoryStream | 包含收据图像的内存流。 |
| settings | ReceiptRecognitionSettings | 识别设置[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/). |

### 返回值

这[`RecognitionResult`](../../recognitionresult/)具有图像识别结果的对象。

### 评论

识别具有指定能力的图像[`ReceiptRecognitionSettings`](../../receiptrecognitionsettings/). 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [ReceiptRecognitionSettings](../../receiptrecognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)


