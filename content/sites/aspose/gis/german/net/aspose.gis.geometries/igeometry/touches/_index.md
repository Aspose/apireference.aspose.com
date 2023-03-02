---
title: IGeometry.Touches
second_title: Aspose.GIS für .NET-API-Referenz
description: IGeometry methode. Bestimmt ob sich diese Geometrie und eine bestimmte Geometrie berühren.
type: docs
weight: 360
url: /de/net/aspose.gis.geometries/igeometry/touches/
---
## IGeometry.Touches method

Bestimmt, ob sich diese Geometrie und eine bestimmte Geometrie berühren.

```csharp
public bool Touches(IGeometry other)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | IGeometry | Eine Geometrie. |

### Rückgabewert

`true` wenn diese Geometrie eine andere Geometrie "räumlich berührt".`false` andernfalls.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |
| ArgumentException | Eine der Geometrien ist ungültig, sodass der Vorgang nicht abgeschlossen werden kann. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) von Geometrien sind nicht gleichwertig. Sie können verwenden[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) um Geometrien in dasselbe räumliche Bezugssystem umzuwandeln. |

### Bemerkungen

Diese Methode testet, ob sich Geometrien in Bezug auf die DE-9IM-Schnittmatrix berühren. Zwei Geometrien berühren sich, wenn sie mindestens einen Grenzpunkt gemeinsam haben, aber keine inneren Punkte. Das heißt: zwei[`LineString`](../../linestring/)einander berühren, wenn sie einen gemeinsamen Endpunkt, aber kein Segment teilen, zwei Polygone einander berühren, wenn sie einen Teil des äußeren oder inneren Rings teilen, aber ihr Inneres nicht überlappt. Diese Methode entspricht: Weitere Einzelheiten zu DE-9IM und der Beziehung „räumliche Berührungen“ finden Sie in der OpenGIS Simple Features Specification.

```csharp
this.Relate(other, "FT*******") || this.Relate(other, "F**T*****") || this.Relate(other, "F***T****");
```

### Siehe auch

* interface [IGeometry](../)
* namensraum [Aspose.Gis.Geometries](../../igeometry/)
* Montage [Aspose.GIS](../../../)


