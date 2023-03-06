---
title: IGeometry.Overlaps
second_title: Aspose.GIS für .NET-API-Referenz
description: IGeometry methode. Bestimmt ob sich diese Geometrie mit einer bestimmten Geometrie überschneidet.
type: docs
weight: 280
url: /de/net/aspose.gis.geometries/igeometry/overlaps/
---
## IGeometry.Overlaps method

Bestimmt, ob sich diese Geometrie mit einer bestimmten Geometrie überschneidet.

```csharp
public bool Overlaps(IGeometry other)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | IGeometry | Eine Geometrie. |

### Rückgabewert

`true` wenn diese Geometrie eine andere Geometrie "räumlich überlappt".`false` andernfalls.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |
| ArgumentException | Eine der Geometrien ist ungültig, sodass der Vorgang nicht abgeschlossen werden kann. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) von Geometrien sind nicht gleichwertig. Sie können verwenden[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) um Geometrien in dasselbe räumliche Bezugssystem umzuwandeln. |

### Bemerkungen

Diese Methode testet, ob sich Geometrien in Bezug auf die DE-9IM-Schnittpunktmatrix überlappen. Zwei Geometrien überlappen sich, wenn sie einige, aber nicht alle inneren Punkte gemeinsam haben und der Schnittpunkt der Geometrien die gleiche Dimension wie die Geometrien selbst hat. Für zweiPoint Geometrien oder zweiSurface Geometrien this Methode ist äquivalent zu: Für zweiLine Geometrien entspricht diese Methode: Für zwei Geometrien mit ungleich[`Dimension`](../dimension/) diese Methode kehrt immer zurück`false`. Weitere Einzelheiten zu DE-9IM und der Beziehung „räumliche Überlappungen“ finden Sie in der OpenGIS Simple Features Specification.

```csharp
this.Relate(other, "T*T***T**");
```

```csharp
this.Relate(other, "1*T***T**");
```

### Siehe auch

* interface [IGeometry](../)
* namensraum [Aspose.Gis.Geometries](../../igeometry/)
* Montage [Aspose.GIS](../../../)


