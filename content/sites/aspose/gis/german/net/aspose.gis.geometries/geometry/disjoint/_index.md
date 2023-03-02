---
title: Geometry.Disjoint
second_title: Aspose.GIS für .NET-API-Referenz
description: Geometry methode. Bestimmt ob diese Geometrie von einer angegebenen Geometrie disjunkt ist.
type: docs
weight: 190
url: /de/net/aspose.gis.geometries/geometry/disjoint/
---
## Geometry.Disjoint method

Bestimmt, ob diese Geometrie von einer angegebenen Geometrie disjunkt ist.

```csharp
public bool Disjoint(IGeometry other)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | IGeometry | Eine Geometrie. |

### Rückgabewert

`true` wenn diese Geometrie "räumlich disjunkt" von einer anderen Geometrie ist.`false` andernfalls.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |
| ArgumentException | Eine der Geometrien ist ungültig, sodass der Vorgang nicht abgeschlossen werden kann. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) von Geometrien sind nicht gleichwertig. Sie können verwenden[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) um Geometrien in dasselbe räumliche Bezugssystem umzuwandeln. |

### Bemerkungen

Diese Methode testet, ob Geometrien in Bezug auf die DE-9IM-Schnittpunktmatrix disjunkt sind. Grundsätzlich testet sie, dass zwei Geometrien keine gemeinsamen Punkte haben. Diese Methode entspricht: Siehe OpenGIS Simple Features Specification für weitere Details zu DE-9IM.

```csharp
this.Relate(other, "FF*FF****");
```

### Siehe auch

* method [Intersects](../../igeometry/intersects/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namensraum [Aspose.Gis.Geometries](../../geometry/)
* Montage [Aspose.GIS](../../../)


