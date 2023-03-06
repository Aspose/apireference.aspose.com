---
title: Geometry.SpatiallyContains
second_title: Aspose.GIS für .NET-API-Referenz
description: Geometry methode. Bestimmt ob diese Geometrie räumlich eine bestimmte Geometrie enthält.
type: docs
weight: 360
url: /de/net/aspose.gis.geometries/geometry/spatiallycontains/
---
## Geometry.SpatiallyContains method

Bestimmt, ob diese Geometrie räumlich eine bestimmte Geometrie enthält.

```csharp
public bool SpatiallyContains(IGeometry other)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | IGeometry | Eine Geometrie. |

### Rückgabewert

`true`wenn diese Geometrie eine andere Geometrie "räumlich enthält".`false` andernfalls.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |
| ArgumentException | Eine der Geometrien ist ungültig, sodass der Vorgang nicht abgeschlossen werden kann. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) von Geometrien sind nicht gleichwertig. Sie können verwenden[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) um Geometrien in dasselbe räumliche Bezugssystem umzuwandeln. |

### Bemerkungen

Diese Methode testet, ob eine Geometrie eine andere in Bezug auf die DE-9IM-Schnittmatrix enthält. Diese Methode entspricht:

```csharp
other.Within(this);
```

### Siehe auch

* method [Within](../../igeometry/within/)
* method [Covers](../../igeometry/covers/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namensraum [Aspose.Gis.Geometries](../../geometry/)
* Montage [Aspose.GIS](../../../)


