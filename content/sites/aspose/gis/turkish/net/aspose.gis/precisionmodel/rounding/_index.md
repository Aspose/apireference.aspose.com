---
title: PrecisionModel.Rounding
second_title: Aspose.GIS for .NET API Referansı
description: PrecisionModel yöntem. Bir yuvarlama kesinliği modeli döndürür. Yuvarlama kesinliği modeline göre yalnızca sınırlı sayıda rakam önemlidir.
type: docs
weight: 20
url: /tr/net/aspose.gis/precisionmodel/rounding/
---
## PrecisionModel.Rounding method

Bir yuvarlama kesinliği modeli döndürür. Yuvarlama kesinliği modeline göre yalnızca sınırlı sayıda rakam önemlidir.

```csharp
public static PrecisionModel Rounding(int significantDigits)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| significantDigits | Int32 | Anlamlı basamak sayısı. |

### Geri dönüş değeri

Yuvarlama Hassasiyet modeli.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentOutOfRangeException | Anlamlı basamak sayısı 0'dan küçük veya 15'ten fazla. |

### Notlar

Bir koordinata uygulandığında kesinliği azaltmak için aşağıdaki kod kullanılır:

```csharp
double rounded = Math.Round(value, significantDigits);
```

### Ayrıca bakınız

* class [PrecisionModel](../)
* ad alanı [Aspose.Gis](../../precisionmodel/)
* toplantı [Aspose.GIS](../../../)


