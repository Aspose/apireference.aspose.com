---
title: AsposeOcr.RecognizeDjvu
second_title: Aspose.OCR for .NET API Referansı
description: AsposeOcr yöntem. Çok sayfalı DJVU görüntüsündeki metni tanıyın.  Belirtme yeteneği ile DJVU dosyasını tanırDocumentRecognitionSettings . Yalnızca DJVUyu destekler. Diğer resim türlerini desteklemiyor.
type: docs
weight: 120
url: /tr/net/aspose.ocr/asposeocr/recognizedjvu/
---
## RecognizeDjvu(string, DocumentRecognitionSettings) {#recognizedjvu_1}

Çok sayfalı DJVU görüntüsündeki metni tanıyın.  Belirtme yeteneği ile DJVU dosyasını tanır[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Yalnızca DJVU'yu destekler. Diğer resim türlerini desteklemiyor.

```csharp
public List<RecognitionResult> RecognizeDjvu(string fullPath, DocumentRecognitionSettings settings)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| fullPath | String | Resmin tam yolu. |
| settings | DocumentRecognitionSettings | Tanıma ayarları. |

### Geri dönüş değeri

bu[`RecognitionResult`](../../recognitionresult/) görüntü tanıma sonuçları olan nesnelerin listesi.

### Ayrıca bakınız

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)

---

## RecognizeDjvu(MemoryStream, DocumentRecognitionSettings) {#recognizedjvu}

Çok sayfalı DJVU görüntüsündeki metni tanıyın.  Belirtme yeteneği ile DJVU dosyasını tanır[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Yalnızca DJVU'yu destekler. Diğer resim türlerini desteklemiyor.

```csharp
public List<RecognitionResult> RecognizeDjvu(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| stream | MemoryStream | DJVU dosyası ile bellek akışı. |
| settings | DocumentRecognitionSettings | Tanıma ayarları. |

### Geri dönüş değeri

bu[`RecognitionResult`](../../recognitionresult/) görüntü tanıma sonuçları olan nesnelerin listesi.

### Ayrıca bakınız

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)


