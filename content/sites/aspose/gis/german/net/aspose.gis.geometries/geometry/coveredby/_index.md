---
title: Geometry.CoveredBy
second_title: Aspose.GIS für .NET-API-Referenz
description: Geometry methode. Bestimmt ob diese Geometrie von einer angegebenen Geometrie abgedeckt wird.
type: docs
weight: 150
url: /de/net/aspose.gis.geometries/geometry/coveredby/
---
## Geometry.CoveredBy method

Bestimmt, ob diese Geometrie von einer angegebenen Geometrie abgedeckt wird.

```csharp
public bool CoveredBy(IGeometry other)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | IGeometry | Eine Geometrie. |

### Rückgabewert

`true`wenn diese Geometrie von einer anderen Geometrie "räumlich überdeckt" wird.`false` andernfalls.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |
| ArgumentException | Eine der Geometrien ist ungültig, sodass der Vorgang nicht abgeschlossen werden kann. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) von Geometrien sind nicht gleichwertig. Sie können verwenden[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) um Geometrien in dasselbe räumliche Bezugssystem umzuwandeln. |

### Bemerkungen

Diese Methode testet, ob eine Geometrie durch eine andere in Bezug auf die DE-9IM-Schnittmatrix abgedeckt wird. Diese Methode entspricht:

```csharp
other.Covers(this);
```

### Siehe auch

* method [SpatiallyContains](../../igeometry/spatiallycontains/)
* method [Covers](../../igeometry/covers/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namensraum [Aspose.Gis.Geometries](../../geometry/)
* Montage [Aspose.GIS](../../../)


