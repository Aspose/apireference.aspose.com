---
title: Geometry.GetDistanceTo
second_title: Aspose.GIS für .NET-API-Referenz
description: Geometry methode. Berechnet den Mindestabstand zwischen dieser Geometrie und einer angegebenen Geometrie.
type: docs
weight: 240
url: /de/net/aspose.gis.geometries/geometry/getdistanceto/
---
## Geometry.GetDistanceTo method

Berechnet den Mindestabstand zwischen dieser Geometrie und einer angegebenen Geometrie.

```csharp
public double GetDistanceTo(IGeometry other)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | IGeometry | Eine Geometrie, zu der die Entfernung ermittelt werden soll. |

### Rückgabewert

Wenn beide Geometrien nicht sind[`IsEmpty`](../isempty/) - ein Abstand zwischen den nächstgelegenen Punkten der Geometrien. Wenn mindestens eine Geometrie leer ist, wird -1 zurückgegeben.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) von Geometrien sind nicht gleichwertig. Sie können verwenden[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) um Geometrien in dasselbe räumliche Bezugssystem umzuwandeln. |

### Siehe auch

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namensraum [Aspose.Gis.Geometries](../../geometry/)
* Montage [Aspose.GIS](../../../)


