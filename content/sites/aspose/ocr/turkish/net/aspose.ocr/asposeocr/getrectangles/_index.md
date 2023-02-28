---
title: AsposeOcr.GetRectangles
second_title: Aspose.OCR for .NET API Referansı
description: AsposeOcr yöntem. Görüntüdeki metin alanlarını algılar.  Otomatik görüntü eğriliği düzeltmesi uygulanmaz. GIF PNG JPEG BMP TIFF JFIFi destekler.
type: docs
weight: 70
url: /tr/net/aspose.ocr/asposeocr/getrectangles/
---
## GetRectangles(string, AreasType, bool) {#getrectangles_1}

Görüntüdeki metin alanlarını algılar.  Otomatik görüntü eğriliği düzeltmesi uygulanmaz. GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler.

```csharp
public List<Rectangle> GetRectangles(string fullPath, AreasType areasType = AreasType.PARAGRAPHS, 
    bool detectAreas = true)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| fullPath | String | Resmin yolu. |
| areasType | AreasType | Hangi dikdörtgenlerin döndürüleceğini belirler - satır veya paragraflar. |
| detectAreas | Boolean | Otomatik metin alanları algılamayı etkinleştirin. |

### Geri dönüş değeri

Algılanan metin alanlarının veya satırların listesi.

### Ayrıca bakınız

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)

---

## GetRectangles(MemoryStream, AreasType, bool) {#getrectangles}

Görüntüdeki metin alanlarını algılar.  Otomatik görüntü eğriliği düzeltmesi uygulanmaz. GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler.

```csharp
public List<Rectangle> GetRectangles(MemoryStream image, 
    AreasType areasType = AreasType.PARAGRAPHS, bool detectAreas = true)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| image | MemoryStream | Görüntüyü içeren bellek akışı. |
| areasType | AreasType | Hangi dikdörtgenlerin döndürüleceğini belirler - satır veya paragraflar. |
| detectAreas | Boolean | Otomatik metin alanları algılamayı etkinleştirin. |

### Geri dönüş değeri

Algılanan metin alanlarının veya satırların listesi.

### Ayrıca bakınız

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)


