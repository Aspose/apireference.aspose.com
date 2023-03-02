---
title: GeoGenerator.ProduceLines
second_title: Aspose.GIS voor .NET API-referentie
description: GeoGenerator methode. Maakt een nieuwe ILineString Enumerator met een bepaald aantal willekeurige items allemaal binnen een bepaald bereik.
type: docs
weight: 10
url: /nl/net/aspose.gis.geotools/geogenerator/producelines/
---
## GeoGenerator.ProduceLines method

Maakt een nieuwe ILineString Enumerator met een bepaald aantal willekeurige items, allemaal binnen een bepaald bereik.

```csharp
public static IEnumerable<ILineString> ProduceLines(Extent rect, LineGeneratorOptions options)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rect | Extent | Gespecificeerd gebied (zie[`Omvang`](../../../aspose.gis/extent/)) |
| options | LineGeneratorOptions | Opties voor het maken van lijnen (zie[`LineGeneratorOpties`](../../linegeneratoroptions/)) |

### Winstwaarde

Reeks lijnen (zie opsomming van[`ILineString`](../../../aspose.gis.geometries/ilinestring/))

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentOutOfRangeException | Het aantal regels moet groter zijn dan één. |
| NullReferenceException | Omvang moet een waarde hebben (niet NULL zijn) |

### Zie ook

* interface [ILineString](../../../aspose.gis.geometries/ilinestring/)
* class [Extent](../../../aspose.gis/extent/)
* class [LineGeneratorOptions](../../linegeneratoroptions/)
* class [GeoGenerator](../)
* naamruimte [Aspose.Gis.GeoTools](../../geogenerator/)
* montage [Aspose.GIS](../../../)


