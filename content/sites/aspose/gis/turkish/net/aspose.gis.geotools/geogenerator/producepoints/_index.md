---
title: GeoGenerator.ProducePoints
second_title: Aspose.GIS for .NET API Referansı
description: GeoGenerator yöntem. Belirtilen alana ait bir nokta dizisi oluşturur.
type: docs
weight: 20
url: /tr/net/aspose.gis.geotools/geogenerator/producepoints/
---
## GeoGenerator.ProducePoints method

Belirtilen alana ait bir nokta dizisi oluşturur.

```csharp
public static IEnumerable<IGeometry> ProducePoints(Extent rect, PointGeneratorOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| rect | Extent | Belirtilen alan (bkz.[`Kapsam`](../../../aspose.gis/extent/)). |
| options | PointGeneratorOptions | Nokta oluşturma seçenekleri (bkz.[`PointGeneratorOptions`](../../pointgeneratoroptions/)). |

### Geri dönüş değeri

Nokta dizisi (bkz.[`Geometri`](../../../aspose.gis.geometries/igeometry/)).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentOutOfRangeException | Puan sayısı birden fazla olmalıdır. |
| NullReferenceException | Kapsam bir değere sahip olmalıdır (NULL olmamalıdır). |

### Ayrıca bakınız

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../../../aspose.gis/extent/)
* class [PointGeneratorOptions](../../pointgeneratoroptions/)
* class [GeoGenerator](../)
* ad alanı [Aspose.Gis.GeoTools](../../geogenerator/)
* toplantı [Aspose.GIS](../../../)


