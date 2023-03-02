---
title: GeoGenerator.ProduceStars
second_title: Aspose.GIS för .NET API Referens
description: GeoGenerator metod. Skapar en rad stjärnor alla inom en given omfattning.
type: docs
weight: 40
url: /sv/net/aspose.gis.geotools/geogenerator/producestars/
---
## GeoGenerator.ProduceStars method

Skapar en rad stjärnor, alla inom en given omfattning.

```csharp
public static IEnumerable<IPolygon> ProduceStars(Extent rect, StarGeneratorOptions options)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| rect | Extent | Specificerat område (se[`Utsträckning`](../../../aspose.gis/extent/)) |
| options | StarGeneratorOptions | Alternativ för att skapa polygoner (se[`StarGeneratorOptions`](../../stargeneratoroptions/)) |

### Returvärde

Array av stjärnor (se uppräkning av[`Ipolygon`](../../../aspose.gis.geometries/ipolygon/))

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentOutOfRangeException | Antal stjärnor måste vara rivjärn än en. |
| NullReferenceException | Omfattning måste ha ett värde (inte vara NULL) |
| ArgumentException | Minsta och största längder måste vara olika och större än 3 |
| ArgumentException | Den maximala längden måste vara större än den minsta |

### Se även

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [StarGeneratorOptions](../../stargeneratoroptions/)
* class [GeoGenerator](../)
* namnutrymme [Aspose.Gis.GeoTools](../../geogenerator/)
* hopsättning [Aspose.GIS](../../../)


