---
title: Geometry.Union
second_title: Aspose.GIS für .NET-API-Referenz
description: Geometry methode. Vereint diese Geometrie und eine angegebene Geometrie.
type: docs
weight: 430
url: /de/net/aspose.gis.geometries/geometry/union/
---
## Geometry.Union method

Vereint diese Geometrie und eine angegebene Geometrie.

```csharp
public IGeometry Union(IGeometry other)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | IGeometry | Eine Geometrie, mit der man sich vereinen kann. |

### Rückgabewert

Eine Geometrie, die eine Vereinigung dieser Geometrie und eines Arguments darstellt. Die Ergebnisgeometrie enthält Punktsätze, die in dieser Geometrie oder in einem Argument vorhanden sind.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | *other* Ist`null`. |
| ArgumentException | Eine der Geometrien ist ungültig, sodass der Vorgang nicht abgeschlossen werden kann. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) von Geometrien sind nicht gleichwertig. Sie können verwenden[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) um Geometrien in dasselbe räumliche Bezugssystem umzuwandeln. |

### Siehe auch

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namensraum [Aspose.Gis.Geometries](../../geometry/)
* Montage [Aspose.GIS](../../../)


