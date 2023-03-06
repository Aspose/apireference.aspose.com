---
title: GeoGenerator.ProducePoints
second_title: Aspose.GIS voor .NET API-referentie
description: GeoGenerator methode. Creëert een reeks punten die tot het gespecificeerde gebied behoren.
type: docs
weight: 20
url: /nl/net/aspose.gis.geotools/geogenerator/producepoints/
---
## GeoGenerator.ProducePoints method

Creëert een reeks punten die tot het gespecificeerde gebied behoren.

```csharp
public static IEnumerable<IGeometry> ProducePoints(Extent rect, PointGeneratorOptions options)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rect | Extent | Gespecificeerd gebied (zie[`Omvang`](../../../aspose.gis/extent/)). |
| options | PointGeneratorOptions | Opties voor het maken van punten (zie[`PointGeneratorOptions`](../../pointgeneratoroptions/)). |

### Winstwaarde

Reeks punten (zie opsomming van[`IGeometrie`](../../../aspose.gis.geometries/igeometry/)).

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentOutOfRangeException | Het aantal punten moet groter zijn dan één. |
| NullReferenceException | Omvang moet een waarde hebben (niet NULL zijn). |

### Zie ook

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../../../aspose.gis/extent/)
* class [PointGeneratorOptions](../../pointgeneratoroptions/)
* class [GeoGenerator](../)
* naamruimte [Aspose.Gis.GeoTools](../../geogenerator/)
* montage [Aspose.GIS](../../../)


