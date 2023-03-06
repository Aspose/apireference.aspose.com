---
title: IGeometry.GetBuffer
second_title: Aspose.GIS für .NET-API-Referenz
description: IGeometry methode. Berechnet einen Pufferbereich um diese Geometrie herum.
type: docs
weight: 200
url: /de/net/aspose.gis.geometries/igeometry/getbuffer/
---
## IGeometry.GetBuffer method

Berechnet einen Pufferbereich um diese Geometrie herum.

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| distance | Double | Die Breite der Pufferregion (in Raumbezugseinheiten). |
| quadrantSegments | Int32 | Anzahl der Segmente, die verwendet werden, um eine 90-Grad-Krümmung anzunähern. Je größer diese Zahl ist, desto besser wird die Annäherung der Kurven erzeugt. Standard ist 30. |

### Rückgabewert

Eine Geometrie, die alle Punkte darstellt, die sich innerhalb eines angegebenen Abstands von dieser Geometrie befinden. Der Ergebnistyp ist entweder[`Null`](../../geometry/null/) ,[`IPolygon`](../../ipolygon/) oder[`IMultiPolygon`](../../imultipolygon/) .

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | Diese Geometrie ist so ungültig, dass der Vorgang nicht abgeschlossen werden kann. |
| ArgumentOutOfRangeException | Quadrantensegmente sind kleiner oder gleich 0. |

### Siehe auch

* interface [IGeometry](../)
* namensraum [Aspose.Gis.Geometries](../../igeometry/)
* Montage [Aspose.GIS](../../../)


