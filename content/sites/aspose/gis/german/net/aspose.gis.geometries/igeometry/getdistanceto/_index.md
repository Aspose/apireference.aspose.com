---
title: IGeometry.GetDistanceTo
second_title: Aspose.GIS für .NET-API-Referenz
description: IGeometry methode. Berechnet den Mindestabstand zwischen dieser Geometrie und einer angegebenen Geometrie.
type: docs
weight: 230
url: /de/net/aspose.gis.geometries/igeometry/getdistanceto/
---
## IGeometry.GetDistanceTo method

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
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) von Geometrien sind nicht gleichwertig. Sie können verwenden[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) um Geometrien in dasselbe räumliche Bezugssystem umzuwandeln. |

### Siehe auch

* interface [IGeometry](../)
* namensraum [Aspose.Gis.Geometries](../../igeometry/)
* Montage [Aspose.GIS](../../../)


