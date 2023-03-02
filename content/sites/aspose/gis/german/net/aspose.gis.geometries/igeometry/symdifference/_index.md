---
title: IGeometry.SymDifference
second_title: Aspose.GIS für .NET-API-Referenz
description: IGeometry methode. Erstellt eine symmetrische Differenz zwischen dieser Geometrie und einer angegebenen Geometrie.
type: docs
weight: 330
url: /de/net/aspose.gis.geometries/igeometry/symdifference/
---
## IGeometry.SymDifference method

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
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) von Geometrien sind nicht gleichwertig. Sie können verwenden[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) um Geometrien in dasselbe räumliche Bezugssystem umzuwandeln. |

### Siehe auch

* interface [IGeometry](../)
* namensraum [Aspose.Gis.Geometries](../../igeometry/)
* Montage [Aspose.GIS](../../../)


