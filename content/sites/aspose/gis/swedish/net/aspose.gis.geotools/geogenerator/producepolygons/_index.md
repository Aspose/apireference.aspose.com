---
title: GeoGenerator.ProducePolygons
second_title: Aspose.GIS för .NET API Referens
description: GeoGenerator metod. Skapar en ny IPolygon Enumerator med ett givet antal slumpmässiga objekt alla inom en given omfattning.
type: docs
weight: 30
url: /sv/net/aspose.gis.geotools/geogenerator/producepolygons/
---
## GeoGenerator.ProducePolygons method

Skapar en ny IPolygon Enumerator med ett givet antal slumpmässiga objekt, alla inom en given omfattning.

```csharp
public static IEnumerable<IPolygon> ProducePolygons(Extent rect, PolygonGeneratorOptions options)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| rect | Extent | Specificerat område (se[`Utsträckning`](../../../aspose.gis/extent/)) |
| options | PolygonGeneratorOptions | Alternativ för att skapa polygoner (se[`PolygonGeneratorOptions`](../../polygongeneratoroptions/)) |

### Returvärde

Array av polygoner (se uppräkning av[`Ipolygon`](../../../aspose.gis.geometries/ipolygon/))

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentOutOfRangeException | Antalet polygoner måste vara rivjärn än en. |
| NullReferenceException | Omfattning måste ha ett värde (inte vara NULL) |
| ArgumentException | Minsta och största längder måste vara olika och större än 0 |
| ArgumentException | Den maximala längden måste vara större än den minsta |

### Se även

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [PolygonGeneratorOptions](../../polygongeneratoroptions/)
* class [GeoGenerator](../)
* namnutrymme [Aspose.Gis.GeoTools](../../geogenerator/)
* hopsättning [Aspose.GIS](../../../)


