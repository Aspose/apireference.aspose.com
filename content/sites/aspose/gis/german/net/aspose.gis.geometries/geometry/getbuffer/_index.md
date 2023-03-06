---
title: Geometry.GetBuffer
second_title: Aspose.GIS für .NET-API-Referenz
description: Geometry methode. Berechnet einen Pufferbereich um diese Geometrie herum.
type: docs
weight: 210
url: /de/net/aspose.gis.geometries/geometry/getbuffer/
---
## Geometry.GetBuffer method

Berechnet einen Pufferbereich um diese Geometrie herum.

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| distance | Double | Die Breite der Pufferregion. |
| quadrantSegments | Int32 | Anzahl der Segmente, die verwendet werden, um eine 90-Grad-Krümmung anzunähern. Je größer diese Zahl ist, desto besser wird die Annäherung der Kurven erzeugt. Standard ist 30. |

### Rückgabewert

Eine Geometrie, die alle Punkte darstellt, die sich innerhalb eines angegebenen Abstands von dieser Geometrie befinden. Der Ergebnistyp ist entweder[`Null`](../null/) ,[`IPolygon`](../../ipolygon/) oder[`IMultiPolygon`](../../imultipolygon/) .

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | Diese Geometrie ist so ungültig, dass der Vorgang nicht abgeschlossen werden kann. |
| ArgumentOutOfRangeException | Quadrantensegmente sind kleiner oder gleich 0. |

### Siehe auch

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namensraum [Aspose.Gis.Geometries](../../geometry/)
* Montage [Aspose.GIS](../../../)


