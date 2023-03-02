---
title: IGeometry.SpatiallyContains
second_title: Aspose.GIS für .NET-API-Referenz
description: IGeometry methode. Bestimmt ob diese Geometrie räumlich eine bestimmte Geometrie enthält.
type: docs
weight: 310
url: /de/net/aspose.gis.geometries/igeometry/spatiallycontains/
---
## IGeometry.SpatiallyContains method

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
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) von Geometrien sind nicht gleichwertig. Sie können verwenden[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) um Geometrien in dasselbe räumliche Bezugssystem umzuwandeln. |

### Bemerkungen

Diese Methode testet, ob eine Geometrie eine andere in Bezug auf die DE-9IM-Schnittmatrix enthält. Diese Methode entspricht:

```csharp
other.Within(this);
```

### Siehe auch

* method [Within](../within/)
* method [Covers](../covers/)
* interface [IGeometry](../)
* namensraum [Aspose.Gis.Geometries](../../igeometry/)
* Montage [Aspose.GIS](../../../)


