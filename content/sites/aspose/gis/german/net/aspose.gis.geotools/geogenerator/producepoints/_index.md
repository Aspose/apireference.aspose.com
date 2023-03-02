---
title: GeoGenerator.ProducePoints
second_title: Aspose.GIS für .NET-API-Referenz
description: GeoGenerator methode. Erstellt ein Array von Punkten die zum angegebenen Bereich gehören.
type: docs
weight: 20
url: /de/net/aspose.gis.geotools/geogenerator/producepoints/
---
## GeoGenerator.ProducePoints method

Erstellt ein Array von Punkten, die zum angegebenen Bereich gehören.

```csharp
public static IEnumerable<IGeometry> ProducePoints(Extent rect, PointGeneratorOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rect | Extent | Angegebener Bereich (vgl[`Ausmaß`](../../../aspose.gis/extent/)). |
| options | PointGeneratorOptions | Optionen zum Erstellen von Punkten (siehe[`PunktgeneratorOptionen`](../../pointgeneratoroptions/)). |

### Rückgabewert

Array von Punkten (siehe Aufzählung von[`IGeometrie`](../../../aspose.gis.geometries/igeometry/)).

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentOutOfRangeException | Die Anzahl der Punkte muss größer als eins sein. |
| NullReferenceException | Extent muss einen Wert haben (nicht NULL sein). |

### Siehe auch

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../../../aspose.gis/extent/)
* class [PointGeneratorOptions](../../pointgeneratoroptions/)
* class [GeoGenerator](../)
* namensraum [Aspose.Gis.GeoTools](../../geogenerator/)
* Montage [Aspose.GIS](../../../)


