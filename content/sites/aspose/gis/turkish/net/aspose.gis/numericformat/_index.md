---
title: Class NumericFormat
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.NumericFormat sınıf. NumericFormat metindeki yaygın sayısal türleri biçimlendirmek için kullanılır.
type: docs
weight: 1290
url: /tr/net/aspose.gis/numericformat/
---
## NumericFormat class

`NumericFormat` metindeki yaygın sayısal türleri biçimlendirmek için kullanılır.

```csharp
public abstract class NumericFormat
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| static [RoundTrip](../../aspose.gis/numericformat/roundtrip/) { get; } | Dönüştürür ve bir dizeye dönüştürülen sayısal bir değerin aynı sayısal değere ayrıştırılmasını sağlamaya çalışır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [Flat](../../aspose.gis/numericformat/flat/)(int) | Bir sayıyı bilimsel gösterim olmadan sabit noktalı bir metne dönüştürür. |
| static [General](../../aspose.gis/numericformat/general/)(int) | Bir sayıyı, sayının türüne ve kesinlik belirticisi olup olmadığına bağlı olarak, sabit noktalı veya bilimsel gösterimin daha kompaktına, dönüştürür. kullanılması önerilir. |

### Notlar

Üç tür vardır`NumericFormat` :  Genel - sabit nokta veya bilimsel gösterim. Bazı basamak sayıları önemlidir. RoundTrip - sabit nokta veya bilimsel gösterim. Maks. basamak anlamlıdır. Düz - sabit nokta gösterimi. Bazı basamak sayıları önemlidir. bir`NumericFormat` olarak ayarlanabilir[`IGeometry`](../../aspose.gis.geometries/igeometry/) aracılığıyla[`AsText`](../../aspose.gis.geometries/igeometry/astext/) , geometriyi İyi Bilinen Metin (WKT) temsiline çevirirken sayısal biçimi belirtmek için.

### Ayrıca bakınız

* ad alanı [Aspose.Gis](../../aspose.gis/)
* toplantı [Aspose.GIS](../../)


