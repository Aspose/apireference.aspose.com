---
title: GeoGenerator.ProducePolygons
second_title: Aspose.GIS voor .NET API-referentie
description: GeoGenerator methode. Creëert een nieuwe IPolygon Enumerator met een bepaald aantal willekeurige items allemaal binnen een bepaald bereik.
type: docs
weight: 30
url: /nl/net/aspose.gis.geotools/geogenerator/producepolygons/
---
## GeoGenerator.ProducePolygons method

Creëert een nieuwe IPolygon Enumerator met een bepaald aantal willekeurige items, allemaal binnen een bepaald bereik.

```csharp
public static IEnumerable<IPolygon> ProducePolygons(Extent rect, PolygonGeneratorOptions options)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rect | Extent | Gespecificeerd gebied (zie[`Omvang`](../../../aspose.gis/extent/)) |
| options | PolygonGeneratorOptions | Opties voor het maken van veelhoeken (zie[`PolygonGeneratorOptions`](../../polygongeneratoroptions/)) |

### Winstwaarde

Reeks veelhoeken (zie opsomming van[`IPolygoon`](../../../aspose.gis.geometries/ipolygon/))

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentOutOfRangeException | Het aantal polygonen moet groter zijn dan één. |
| NullReferenceException | Omvang moet een waarde hebben (niet NULL zijn) |
| ArgumentException | De minimale en maximale lengtes moeten ongelijk zijn en groter dan 0 |
| ArgumentException | De maximale lengte moet groter zijn dan de minimale |

### Zie ook

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [PolygonGeneratorOptions](../../polygongeneratoroptions/)
* class [GeoGenerator](../)
* naamruimte [Aspose.Gis.GeoTools](../../geogenerator/)
* montage [Aspose.GIS](../../../)


