---
title: Geometry.SpatiallyEquals
second_title: Aspose.GIS für .NET-API-Referenz
description: Geometry methode. Bestimmt ob diese Geometrie räumlich gleich einer bestimmten Geometrie ist.
type: docs
weight: 370
url: /de/net/aspose.gis.geometries/geometry/spatiallyequals/
---
## Geometry.SpatiallyEquals method

Bestimmt, ob diese Geometrie räumlich gleich einer bestimmten Geometrie ist.

```csharp
public bool SpatiallyEquals(IGeometry other)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | IGeometry | Eine Geometrie. |

### Rückgabewert

`true` wenn diese Geometrie der angegebenen Geometrie "räumlich gleich" ist.`false` andernfalls.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |
| ArgumentException | Eine der Geometrien ist ungültig, sodass der Vorgang nicht abgeschlossen werden kann. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) von Geometrien sind nicht gleichwertig. Sie können verwenden[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) um Geometrien in dasselbe räumliche Bezugssystem umzuwandeln. |

### Bemerkungen

Diese Methode testet die Gleichheit in Bezug auf die DE-9IM-Schnittpunktmatrix. Es hängt nicht von order der Komponenten (zB Reihenfolge der Innenringe im Polygon), Z- und M-Werten ab. Grundsätzlich testet es , dass zwei Geometrien denselben "Raum" einnehmen, wenn sie auf einen zweidimensionalen Raum projiziert werden. Diese Methode entspricht: Siehe OpenGIS Simple Features Specification für weitere Details zu DE-9IM.

```csharp
this.Relate(other, "T*F**FFF*");
```

### Siehe auch

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namensraum [Aspose.Gis.Geometries](../../geometry/)
* Montage [Aspose.GIS](../../../)


