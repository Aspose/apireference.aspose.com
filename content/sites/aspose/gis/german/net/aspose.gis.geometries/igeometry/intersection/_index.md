---
title: IGeometry.Intersection
second_title: Aspose.GIS für .NET-API-Referenz
description: IGeometry methode. Erstellt einen Schnittpunkt zwischen dieser Geometrie und einer angegebenen Geometrie.
type: docs
weight: 260
url: /de/net/aspose.gis.geometries/igeometry/intersection/
---
## IGeometry.Intersection method

Erstellt einen Schnittpunkt zwischen dieser Geometrie und einer angegebenen Geometrie.

```csharp
public IGeometry Intersection(IGeometry other)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | IGeometry | Eine Geometrie, mit der der Schnittpunkt berechnet werden soll. |

### Rückgabewert

Eine Geometrie, die eine Schnittmenge dieser Geometrie und eines Arguments darstellt. Die Ergebnisgeometrie enthält Punktmenge, die sowohl in dieser Geometrie als auch in einem Argument vorhanden ist.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | *other* Ist`null`. |
| ArgumentException | Eine der Geometrien ist ungültig, sodass der Vorgang nicht abgeschlossen werden kann. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) von Geometrien sind nicht gleichwertig. Sie können verwenden[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) um Geometrien in dasselbe räumliche Bezugssystem umzuwandeln. |

### Siehe auch

* interface [IGeometry](../)
* namensraum [Aspose.Gis.Geometries](../../igeometry/)
* Montage [Aspose.GIS](../../../)


