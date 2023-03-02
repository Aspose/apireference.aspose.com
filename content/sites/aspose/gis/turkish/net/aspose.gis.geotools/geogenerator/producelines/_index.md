---
title: GeoGenerator.ProduceLines
second_title: Aspose.GIS for .NET API Referansı
description: GeoGenerator yöntem. Hepsi belirli bir kapsam içinde olmak üzere belirli sayıda rasgele öğe içeren yeni bir IlineString Numaralandırıcı oluşturur.
type: docs
weight: 10
url: /tr/net/aspose.gis.geotools/geogenerator/producelines/
---
## GeoGenerator.ProduceLines method

Hepsi belirli bir kapsam içinde olmak üzere, belirli sayıda rasgele öğe içeren yeni bir IlineString Numaralandırıcı oluşturur.

```csharp
public static IEnumerable<ILineString> ProduceLines(Extent rect, LineGeneratorOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| rect | Extent | Belirtilen alan (bkz.[`Kapsam`](../../../aspose.gis/extent/)) |
| options | LineGeneratorOptions | Satır oluşturma seçenekleri (bkz.[`LineGeneratorOptions`](../../linegeneratoroptions/)) |

### Geri dönüş değeri

Satır dizisi (bkz.[`IlineString`](../../../aspose.gis.geometries/ilinestring/))

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentOutOfRangeException | Satır sayısı birden fazla olmalıdır. |
| NullReferenceException | Kapsam bir değere sahip olmalıdır (NULL olmamalıdır) |

### Ayrıca bakınız

* interface [ILineString](../../../aspose.gis.geometries/ilinestring/)
* class [Extent](../../../aspose.gis/extent/)
* class [LineGeneratorOptions](../../linegeneratoroptions/)
* class [GeoGenerator](../)
* ad alanı [Aspose.Gis.GeoTools](../../geogenerator/)
* toplantı [Aspose.GIS](../../../)


