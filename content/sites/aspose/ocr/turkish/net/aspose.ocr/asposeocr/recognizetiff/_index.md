---
title: AsposeOcr.RecognizeTiff
second_title: Aspose.OCR for .NET API Referansı
description: AsposeOcr yöntem. Çok sayfalı TIFF görüntüsündeki metni tanıyın.  TIFF dosyasını belirleme yeteneği ile tanırDocumentRecognitionSettings . Yalnızca TIFFi TIF destekler. Diğer resim türlerini desteklemiyor.
type: docs
weight: 240
url: /tr/net/aspose.ocr/asposeocr/recognizetiff/
---
## RecognizeTiff(string, DocumentRecognitionSettings) {#recognizetiff_1}

Çok sayfalı TIFF görüntüsündeki metni tanıyın.  TIFF dosyasını belirleme yeteneği ile tanır[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Yalnızca TIFF'i (TIF) destekler. Diğer resim türlerini desteklemiyor.

```csharp
public List<RecognitionResult> RecognizeTiff(string fullPath, DocumentRecognitionSettings settings)
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

## RecognizeTiff(MemoryStream, DocumentRecognitionSettings) {#recognizetiff}

Çok sayfalı TIFF görüntüsündeki metni tanıyın.  TIFF dosyasını belirleme yeteneği ile tanır[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Yalnızca TIFF'i (TIF) destekler. Diğer resim türlerini desteklemiyor.

```csharp
public List<RecognitionResult> RecognizeTiff(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| stream | MemoryStream | TIFF dosyası ile bellek akışı. |
| settings | DocumentRecognitionSettings | Tanıma ayarları. |

### Geri dönüş değeri

bu[`RecognitionResult`](../../recognitionresult/) görüntü tanıma sonuçları olan nesnelerin listesi.

### Ayrıca bakınız

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)


