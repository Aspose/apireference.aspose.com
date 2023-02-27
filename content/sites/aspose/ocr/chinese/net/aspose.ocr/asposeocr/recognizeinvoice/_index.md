---
title: AsposeOcr.RecognizeInvoice
second_title: Aspose.OCR for .NET API 参考
description: AsposeOcr 方法. 识别发票图像上的文本
type: docs
weight: 180
url: /zh/net/aspose.ocr/asposeocr/recognizeinvoice/
---
## RecognizeInvoice(string, InvoiceRecognitionSettings) {#recognizeinvoice_1}

识别发票图像上的文本。

```csharp
public RecognitionResult RecognizeInvoice(string fullPath, 
    InvoiceRecognitionSettings settings = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| fullPath | String | 图片的路径。 |
| settings | InvoiceRecognitionSettings | 识别设置[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). |

### 返回值

这[`RecognitionResult`](../../recognitionresult/)具有图像识别结果的对象。

### 评论

识别具有指定能力的图像[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [InvoiceRecognitionSettings](../../invoicerecognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)

---

## RecognizeInvoice(MemoryStream, InvoiceRecognitionSettings) {#recognizeinvoice}

识别发票图像上的文本。

```csharp
public RecognitionResult RecognizeInvoice(MemoryStream stream, 
    InvoiceRecognitionSettings settings = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| stream | MemoryStream | 包含收据图像的内存流。 |
| settings | InvoiceRecognitionSettings | 识别设置[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). |

### 返回值

这[`RecognitionResult`](../../recognitionresult/)具有图像识别结果的对象。

### 评论

识别具有指定能力的图像[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). 支持 GIF、PNG、JPEG、BMP、TIFF、JFIF。

### 也可以看看

* class [RecognitionResult](../../recognitionresult/)
* class [InvoiceRecognitionSettings](../../invoicerecognitionsettings/)
* class [AsposeOcr](../)
* 命名空间 [Aspose.OCR](../../asposeocr/)
* 部件 [Aspose.OCR](../../../)


