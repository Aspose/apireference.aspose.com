---
title: AsposeOcr.RecognizePdf
second_title: Aspose.OCR for .NET API Referansı
description: AsposeOcr yöntem. Taranan pdfden metni tanıyın resimleri çıkarın.  Belirtme yeteneği ile pdf dosyasını tanırDocumentRecognitionSettings . Yalnızca Taranan PDFyi destekler. Aranabilir PDFyi desteklemiyor.
type: docs
weight: 220
url: /tr/net/aspose.ocr/asposeocr/recognizepdf/
---
## RecognizePdf(string, DocumentRecognitionSettings) {#recognizepdf_1}

Taranan pdf'den metni tanıyın (resimleri çıkarın).  Belirtme yeteneği ile pdf dosyasını tanır[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Yalnızca Taranan PDF'yi destekler. Aranabilir PDF'yi desteklemiyor.

```csharp
public List<RecognitionResult> RecognizePdf(string fullPath, DocumentRecognitionSettings settings)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| fullPath | String | Resmin tam yolu. |
| settings | DocumentRecognitionSettings | Tanıma ayarları. |

### Geri dönüş değeri

bu[`RecognitionResult`](../../recognitionresult/) görüntü tanıma sonuçları olan nesne.

### Ayrıca bakınız

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)

---

## RecognizePdf(MemoryStream, DocumentRecognitionSettings) {#recognizepdf}

Taranan pdf'den metni tanıyın (resimleri çıkarın).  Belirtme yeteneği ile pdf dosyasını tanır[`RecognitionSettings`](../../recognitionsettings/) . Yalnızca Taranan PDF'yi destekler. Aranabilir PDF'yi desteklemiyor.

```csharp
public List<RecognitionResult> RecognizePdf(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| stream | MemoryStream | Pdf dosyası ile bellek akışı. |
| settings | DocumentRecognitionSettings | Tanıma ayarları. |

### Geri dönüş değeri

bu[`RecognitionResult`](../../recognitionresult/) görüntü tanıma sonuçları olan nesne.

### Ayrıca bakınız

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)


