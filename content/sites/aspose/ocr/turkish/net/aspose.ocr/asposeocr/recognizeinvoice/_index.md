---
title: AsposeOcr.RecognizeInvoice
second_title: Aspose.OCR for .NET API Referansı
description: AsposeOcr yöntem. Fatura resmindeki metni tanır.
type: docs
weight: 180
url: /tr/net/aspose.ocr/asposeocr/recognizeinvoice/
---
## RecognizeInvoice(string, InvoiceRecognitionSettings) {#recognizeinvoice_1}

Fatura resmindeki metni tanır.

```csharp
public RecognitionResult RecognizeInvoice(string fullPath, 
    InvoiceRecognitionSettings settings = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| fullPath | String | Resmin yolu. |
| settings | InvoiceRecognitionSettings | tanıma ayarları[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). |

### Geri dönüş değeri

bu[`RecognitionResult`](../../recognitionresult/) görüntü tanıma sonuçları olan nesne.

### Notlar

Belirtme yeteneği ile görüntüyü tanır[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler.

### Ayrıca bakınız

* class [RecognitionResult](../../recognitionresult/)
* class [InvoiceRecognitionSettings](../../invoicerecognitionsettings/)
* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)

---

## RecognizeInvoice(MemoryStream, InvoiceRecognitionSettings) {#recognizeinvoice}

Fatura resmindeki metni tanır.

```csharp
public RecognitionResult RecognizeInvoice(MemoryStream stream, 
    InvoiceRecognitionSettings settings = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| stream | MemoryStream | Makbuz görüntüsünü içeren bellek akışı. |
| settings | InvoiceRecognitionSettings | tanıma ayarları[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). |

### Geri dönüş değeri

bu[`RecognitionResult`](../../recognitionresult/) görüntü tanıma sonuçları olan nesne.

### Notlar

Belirtme yeteneği ile görüntüyü tanır[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler.

### Ayrıca bakınız

* class [RecognitionResult](../../recognitionresult/)
* class [InvoiceRecognitionSettings](../../invoicerecognitionsettings/)
* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)


