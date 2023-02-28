---
title: AsposeOcr.ImageHasText
second_title: Aspose.OCR for .NET API Referansı
description: AsposeOcr yöntem. Görüntünün sağlanan metin parçasını içerip içermediğini kontrol edin.
type: docs
weight: 80
url: /tr/net/aspose.ocr/asposeocr/imagehastext/
---
## ImageHasText(string, string, RecognitionSettings, bool) {#imagehastext}

Görüntünün sağlanan metin parçasını içerip içermediğini kontrol edin.

```csharp
public bool ImageHasText(string fullPath, string text, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| fullPath | String | Resmin yolu. |
| text | String | Görüntü üzerinde arama yapmak için metin parçası. |
| settings | RecognitionSettings | Tanıma ayarları. |
| ignoreCase | Boolean | True - büyük/küçük harfe duyarsız arama anlamına gelir. |

### Geri dönüş değeri

Görüntü metin parçası içeriyorsa doğrudur. Yanlış - resim metin parçası içermiyor.

### Notlar

Belirtme yeteneği ile görüntüyü tanır[`RecognitionSettings`](../../recognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler.

### Ayrıca bakınız

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)

---

## ImageHasText(string, Regex, RecognitionSettings) {#imagehastext_1}

Resim metninin sağlanan normal ifadeyle eşleşip eşleşmediğini kontrol edin.

```csharp
public bool ImageHasText(string fullPath, Regex regex, RecognitionSettings settings = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| fullPath | String | Resmin yolu. |
| regex | Regex | Sağlanan kalıp ve seçeneklerle System.Text.RegularExpressions nesnesi. |
| settings | RecognitionSettings | Tanıma ayarları. |

### Geri dönüş değeri

Görüntü metni sağlanan normal ifadeyle eşleşirse doğrudur.

### Notlar

Belirtme yeteneği ile görüntüyü tanır[`RecognitionSettings`](../../recognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler.

### Ayrıca bakınız

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)


