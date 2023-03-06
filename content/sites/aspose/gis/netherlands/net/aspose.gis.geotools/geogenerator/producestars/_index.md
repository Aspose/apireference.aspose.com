---
title: GeoGenerator.ProduceStars
second_title: Aspose.GIS voor .NET API-referentie
description: GeoGenerator methode. Creëert een reeks sterren allemaal binnen een bepaald bereik.
type: docs
weight: 40
url: /nl/net/aspose.gis.geotools/geogenerator/producestars/
---
## GeoGenerator.ProduceStars method

Creëert een reeks sterren, allemaal binnen een bepaald bereik.

```csharp
public static IEnumerable<IPolygon> ProduceStars(Extent rect, StarGeneratorOptions options)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rect | Extent | Gespecificeerd gebied (zie[`Omvang`](../../../aspose.gis/extent/)) |
| options | StarGeneratorOptions | Opties voor het maken van veelhoeken (zie[`StarGeneratorOptions`](../../stargeneratoroptions/)) |

### Winstwaarde

Reeks sterren (zie opsomming van[`IPolygoon`](../../../aspose.gis.geometries/ipolygon/))

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentOutOfRangeException | Het aantal sterren moet groter zijn dan één. |
| NullReferenceException | Omvang moet een waarde hebben (niet NULL zijn) |
| ArgumentException | De minimale en maximale lengtes moeten ongelijk zijn en groter dan 3 |
| ArgumentException | De maximale lengte moet groter zijn dan de minimale |

### Zie ook

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [StarGeneratorOptions](../../stargeneratoroptions/)
* class [GeoGenerator](../)
* naamruimte [Aspose.Gis.GeoTools](../../geogenerator/)
* montage [Aspose.GIS](../../../)


