---
title: TopoJsonOptions.QuantizationNumber
second_title: Aspose.GIS for .NET API Referansı
description: TopoJsonOptions mülk. TopoJSON. çıktısında koordinatları nicelemek ve yayları delta kodlamak için kullanılacak niceleme sayısını belirtir
type: docs
weight: 50
url: /tr/net/aspose.gis.formats.topojson/topojsonoptions/quantizationnumber/
---
## TopoJsonOptions.QuantizationNumber property

TopoJSON. çıktısında koordinatları nicelemek ve yayları delta kodlamak için kullanılacak niceleme sayısını belirtir

```csharp
public int? QuantizationNumber { get; set; }
```

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentOutOfRangeException | Bağımsız değişken ikiden küçüktür. |

### Notlar

Bu yazma seçeneğidir - okumayı etkilemez. Bu seçenek ile birbirini dışlar[`Transform`](../transform/) - bu iki seçenekten sadece biri olamaz`null` . Bu değilse`null` - çıktı TopoJSON koordinatları nicelenir ve yaylar, belirtilen niceleme numarasıyla delta kodlanır. Niceleme sayısı, ortaya çıkan nicelenmiş koordinatlarda her boyut için maksimum ifade edilebilir değer sayısını belirler; tipik olarak on'un katı seçilir. Varsayılanlar`null` .

### Ayrıca bakınız

* class [TopoJsonOptions](../)
* ad alanı [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* toplantı [Aspose.GIS](../../../)


