---
title: GeoGenerator.ProduceStars
second_title: Aspose.GIS für .NET-API-Referenz
description: GeoGenerator methode. Erstellt eine Reihe von Sternen alle innerhalb einer bestimmten Ausdehnung.
type: docs
weight: 40
url: /de/net/aspose.gis.geotools/geogenerator/producestars/
---
## GeoGenerator.ProduceStars method

Erstellt eine Reihe von Sternen, alle innerhalb einer bestimmten Ausdehnung.

```csharp
public static IEnumerable<IPolygon> ProduceStars(Extent rect, StarGeneratorOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rect | Extent | Angegebener Bereich (vgl[`Ausmaß`](../../../aspose.gis/extent/)) |
| options | StarGeneratorOptions | Optionen zum Erstellen von Polygonen (siehe[`StarGeneratorOptionen`](../../stargeneratoroptions/)) |

### Rückgabewert

Reihe von Sternen (siehe Aufzählung von[`IPolygon`](../../../aspose.gis.geometries/ipolygon/))

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentOutOfRangeException | Die Anzahl der Sterne muss größer als eins sein. |
| NullReferenceException | Extent muss einen Wert haben (nicht NULL sein) |
| ArgumentException | Die minimale und maximale Länge müssen ungleich und größer als 3 sein |
| ArgumentException | Die maximale Länge muss größer sein als die minimale |

### Siehe auch

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [StarGeneratorOptions](../../stargeneratoroptions/)
* class [GeoGenerator](../)
* namensraum [Aspose.Gis.GeoTools](../../geogenerator/)
* Montage [Aspose.GIS](../../../)


