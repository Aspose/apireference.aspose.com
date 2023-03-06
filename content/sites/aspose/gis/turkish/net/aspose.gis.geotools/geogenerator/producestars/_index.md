---
title: GeoGenerator.ProduceStars
second_title: Aspose.GIS for .NET API Referansı
description: GeoGenerator yöntem. Hepsi belirli bir kapsamda olan bir dizi yıldız oluşturur.
type: docs
weight: 40
url: /tr/net/aspose.gis.geotools/geogenerator/producestars/
---
## GeoGenerator.ProduceStars method

Hepsi belirli bir kapsamda olan bir dizi yıldız oluşturur.

```csharp
public static IEnumerable<IPolygon> ProduceStars(Extent rect, StarGeneratorOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| rect | Extent | Belirtilen alan (bkz.[`Kapsam`](../../../aspose.gis/extent/)) |
| options | StarGeneratorOptions | Çokgen oluşturma seçenekleri (bkz.[`StarJeneratorSeçenekleri`](../../stargeneratoroptions/)) |

### Geri dönüş değeri

Yıldız dizisi (bkz.[`IPoligon`](../../../aspose.gis.geometries/ipolygon/))

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentOutOfRangeException | Yıldız sayısı birden fazla olmalıdır. |
| NullReferenceException | Kapsam bir değere sahip olmalıdır (NULL olmamalıdır) |
| ArgumentException | Minimum ve maksimum uzunluklar eşit olmamalı ve 3'ten büyük olmalıdır |
| ArgumentException | Maksimum uzunluk minimumdan daha büyük olmalıdır |

### Ayrıca bakınız

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [StarGeneratorOptions](../../stargeneratoroptions/)
* class [GeoGenerator](../)
* ad alanı [Aspose.Gis.GeoTools](../../geogenerator/)
* toplantı [Aspose.GIS](../../../)


