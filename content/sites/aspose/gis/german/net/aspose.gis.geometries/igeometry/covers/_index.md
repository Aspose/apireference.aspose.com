---
title: IGeometry.Covers
second_title: Aspose.GIS für .NET-API-Referenz
description: IGeometry methode. Bestimmt ob diese Geometrie eine bestimmte Geometrie abdeckt.
type: docs
weight: 150
url: /de/net/aspose.gis.geometries/igeometry/covers/
---
## IGeometry.Covers method

Bestimmt, ob diese Geometrie eine bestimmte Geometrie abdeckt.

```csharp
public bool Covers(IGeometry other)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | IGeometry | Eine Geometrie. |

### Rückgabewert

`true` wenn diese Geometrie eine andere Geometrie "räumlich überdeckt".`false` andernfalls.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |
| ArgumentException | Eine der Geometrien ist ungültig, sodass der Vorgang nicht abgeschlossen werden kann. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) von Geometrien sind nicht gleichwertig. Sie können verwenden[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) um Geometrien in dasselbe räumliche Bezugssystem umzuwandeln. |

### Bemerkungen

Diese Methode testet, ob eine Geometrie eine andere in Bezug auf die DE-9IM-Schnittmatrix überdeckt. Eine Geometrie überdeckt eine andere, wenn die Geometrie jeden Punkt einer anderen Geometrie enthält. Diese Methode ähnelt[`SpatiallyContains`](../spatiallycontains/) , kehrt aber zurück`true` häufiger, , da es nicht zwischen inneren und Grenzpunkten unterscheidet. Wenn also Geometrie A auf der Grenze von Geometrie B liegt,[`SpatiallyContains`](../spatiallycontains/) kehrt zurück`false` , während diese Methode zurückkehrt`true`. Diese Methode entspricht:

```csharp
this.Relate(other, "T*****FF*") || this.Relate(other, "*T****FF*") || this.Relate(other, "***T**FF*) || this.Relate(other, "***T*FF*");
```

### Siehe auch

* method [SpatiallyContains](../spatiallycontains/)
* method [CoveredBy](../coveredby/)
* interface [IGeometry](../)
* namensraum [Aspose.Gis.Geometries](../../igeometry/)
* Montage [Aspose.GIS](../../../)


