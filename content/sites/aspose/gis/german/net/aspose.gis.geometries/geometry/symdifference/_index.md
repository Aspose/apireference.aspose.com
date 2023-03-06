---
title: Geometry.SymDifference
second_title: Aspose.GIS für .NET-API-Referenz
description: Geometry methode. Erstellt eine symmetrische Differenz zwischen dieser Geometrie und einer angegebenen Geometrie.
type: docs
weight: 380
url: /de/net/aspose.gis.geometries/geometry/symdifference/
---
## Geometry.SymDifference method

Erstellt eine symmetrische Differenz zwischen dieser Geometrie und einer angegebenen Geometrie.

```csharp
public IGeometry SymDifference(IGeometry other)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | IGeometry | Eine Geometrie, mit der symmetrische Differenzen berechnet werden. |

### Rückgabewert

Eine Geometrie, die eine symmetrische Differenz dieser Geometrie und eines Arguments darstellt. Die Ergebnisgeometrie enthält Punktsätze, die in einer der Geometrien vorhanden sind, aber nicht in beiden.

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


