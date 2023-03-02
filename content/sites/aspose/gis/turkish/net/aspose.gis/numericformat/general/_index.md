---
title: NumericFormat.General
second_title: Aspose.GIS for .NET API Referansı
description: NumericFormat yöntem. Bir sayıyı sayının türüne ve kesinlik belirticisi olup olmadığına bağlı olarak sabit noktalı veya bilimsel gösterimin daha kompaktına dönüştürür. kullanılması önerilir.
type: docs
weight: 30
url: /tr/net/aspose.gis/numericformat/general/
---
## NumericFormat.General method

Bir sayıyı, sayının türüne ve kesinlik belirticisi olup olmadığına bağlı olarak, sabit noktalı veya bilimsel gösterimin daha kompaktına, dönüştürür. kullanılması önerilir.

```csharp
public static NumericFormat General(int precision = 0)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| precision | Int32 | Duyarlılık, sonuç dizisinde görünebilecek maksimum önemli basamak sayısını tanımlar. Duyarlılık sıfırsa, "15" değeri kullanılır. Kullanılabilir maksimum hassasiyet "17"dir. |

### Geri dönüş değeri

Genel Format Belirleyici.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentOutOfRangeException | Anlamlı basamak sayısı 0'dan küçük veya 17. 'den büyük |

### Notlar

Dahili kod, WKT için sayı dizileri üretiyor:

### Ayrıca bakınız

* class [NumericFormat](../)
* ad alanı [Aspose.Gis](../../numericformat/)
* toplantı [Aspose.GIS](../../../)


