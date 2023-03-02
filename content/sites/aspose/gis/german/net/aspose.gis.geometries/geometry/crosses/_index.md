---
title: Geometry.Crosses
second_title: Aspose.GIS für .NET-API-Referenz
description: Geometry methode. Bestimmt ob sich diese Geometrie und eine angegebene Geometrie kreuzen.
type: docs
weight: 170
url: /de/net/aspose.gis.geometries/geometry/crosses/
---
## Geometry.Crosses method

Bestimmt, ob sich diese Geometrie und eine angegebene Geometrie kreuzen.

```csharp
public bool Crosses(IGeometry other)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | IGeometry | Eine Geometrie. |

### Rückgabewert

`true` wenn diese Geometrie eine andere Geometrie "räumlich kreuzt".`false` andernfalls.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |
| ArgumentException | Eine der Geometrien ist ungültig, sodass der Vorgang nicht abgeschlossen werden kann. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) von Geometrien sind nicht gleichwertig. Sie können verwenden[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) um Geometrien in dasselbe räumliche Bezugssystem umzuwandeln. |

### Bemerkungen

Diese Methode testet, ob Geometrien Schnittpunkte in Bezug auf die DE-9IM-Schnittpunktmatrix sind. Zwei Geometrien kreuzen sich, wenn sie einige, aber nicht alle inneren Punkte gemeinsam haben und die Dimension des Schnittpunkts kleiner als die Dimension von mindestens einem der beiden ist Geometrien. Das heißt: zwei[`LineString`](../../linestring/) s Kreuz, wenn sie einen 'X'-Buchstaben, einen LineString und a bilden[`Polygon`](../../polygon/) kreuzen, wenn LineString durch das Innere eines Polygons geht. Siehe OpenGIS Simple Features Specification für weitere Details über DE-9IM und die Beziehung "spatially crosses".

### Siehe auch

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namensraum [Aspose.Gis.Geometries](../../geometry/)
* Montage [Aspose.GIS](../../../)


