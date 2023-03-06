---
title: GeoGenerator.ProducePoints
second_title: Aspose.GIS för .NET API Referens
description: GeoGenerator metod. Skapar en matris med punkter som tillhör det angivna området.
type: docs
weight: 20
url: /sv/net/aspose.gis.geotools/geogenerator/producepoints/
---
## GeoGenerator.ProducePoints method

Skapar en matris med punkter som tillhör det angivna området.

```csharp
public static IEnumerable<IGeometry> ProducePoints(Extent rect, PointGeneratorOptions options)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| rect | Extent | Specificerat område (se[`Utsträckning`](../../../aspose.gis/extent/)). |
| options | PointGeneratorOptions | Alternativ för att skapa punkt (se[`PointGeneratorOptions`](../../pointgeneratoroptions/)). |

### Returvärde

Array av punkter (se uppräkning av[`IGeometri`](../../../aspose.gis.geometries/igeometry/)).

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentOutOfRangeException | Antalet poäng måste vara rivjärn än ett. |
| NullReferenceException | Omfattning måste ha ett värde (inte vara NULL). |

### Se även

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../../../aspose.gis/extent/)
* class [PointGeneratorOptions](../../pointgeneratoroptions/)
* class [GeoGenerator](../)
* namnutrymme [Aspose.Gis.GeoTools](../../geogenerator/)
* hopsättning [Aspose.GIS](../../../)


