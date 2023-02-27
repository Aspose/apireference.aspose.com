---
title: AsposeOcr.ImageTextDiff
second_title: Aspose.OCR for .NET API Referansı
description: AsposeOcr yöntem. İki resimdeki metinleri karşılaştırın ve ne kadar benzer olduklarını gösteren bir sayı döndürün 0dan 1e.
type: docs
weight: 90
url: /tr/net/aspose.ocr/asposeocr/imagetextdiff/
---
## AsposeOcr.ImageTextDiff method

İki resimdeki metinleri karşılaştırın ve ne kadar benzer olduklarını gösteren bir sayı döndürün (0'dan 1'e).

```csharp
public float ImageTextDiff(string fullPath1, string fullPath2, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| fullPath1 | String | İlk görüntünün yolu. |
| fullPath2 | String | İkinci görüntünün yolu. |
| settings | RecognitionSettings | Tanıma ayarları. |
| ignoreCase | Boolean | True - büyük/küçük harfe duyarsız arama anlamına gelir. |

### Geri dönüş değeri

0, metinlerin tamamen farklı olduğu anlamına gelir; 1, metinlerin aynı olduğu anlamına gelir.

### Ayrıca bakınız

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)


