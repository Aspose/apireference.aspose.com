---
title: GeoGenerator.ProducePolygons
second_title: Aspose.GIS for .NET API Referansı
description: GeoGenerator yöntem. Hepsi belirli bir kapsamda olmak üzere belirli sayıda rasgele öğe içeren yeni bir IPolygon Numaralandırıcı oluşturur.
type: docs
weight: 30
url: /tr/net/aspose.gis.geotools/geogenerator/producepolygons/
---
## GeoGenerator.ProducePolygons method

Hepsi belirli bir kapsamda olmak üzere, belirli sayıda rasgele öğe içeren yeni bir IPolygon Numaralandırıcı oluşturur.

```csharp
public static IEnumerable<IPolygon> ProducePolygons(Extent rect, PolygonGeneratorOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| rect | Extent | Belirtilen alan (bkz.[`Kapsam`](../../../aspose.gis/extent/)) |
| options | PolygonGeneratorOptions | Çokgen oluşturma seçenekleri (bkz.[`Poligon Oluşturucu Seçenekleri`](../../polygongeneratoroptions/)) |

### Geri dönüş değeri

Çokgen dizisi (bkz.[`IPoligon`](../../../aspose.gis.geometries/ipolygon/))

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentOutOfRangeException | Poligon sayısı birden fazla olmalıdır. |
| NullReferenceException | Kapsam bir değere sahip olmalıdır (NULL olmamalıdır) |
| ArgumentException | Minimum ve maksimum uzunluklar eşit olmamalı ve 0'dan büyük olmalıdır |
| ArgumentException | Maksimum uzunluk minimumdan daha büyük olmalıdır |

### Ayrıca bakınız

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [PolygonGeneratorOptions](../../polygongeneratoroptions/)
* class [GeoGenerator](../)
* ad alanı [Aspose.Gis.GeoTools](../../geogenerator/)
* toplantı [Aspose.GIS](../../../)


