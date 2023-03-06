---
title: IGeometry.Within
second_title: Aspose.GIS für .NET-API-Referenz
description: IGeometry methode. Bestimmt ob sich diese Geometrie innerhalb einer bestimmten Ausdehnung befindet.
type: docs
weight: 380
url: /de/net/aspose.gis.geometries/igeometry/within/
---
## Within(Extent) {#within}

Bestimmt, ob sich diese Geometrie innerhalb einer bestimmten Ausdehnung befindet.

```csharp
public bool Within(Extent extent)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| extent | Extent | Das Ausmaß. |

### Rückgabewert

`true` wenn diese Geometrie innerhalb der Ausdehnung liegt;`false` andernfalls.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |

### Siehe auch

* method [Contains](../../../aspose.gis/extent/contains/)
* class [Extent](../../../aspose.gis/extent/)
* interface [IGeometry](../)
* namensraum [Aspose.Gis.Geometries](../../igeometry/)
* Montage [Aspose.GIS](../../../)

---

## Within(IGeometry) {#within_1}

Bestimmt, ob diese Geometrie innerhalb einer angegebenen Geometrie liegt.

```csharp
public bool Within(IGeometry other)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | IGeometry | Eine Geometrie. |

### Rückgabewert

`true` wenn diese Geometrie "räumlich innerhalb" einer anderen Geometrie ist.`false` andernfalls.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |
| ArgumentException | Eine der Geometrien ist ungültig, sodass der Vorgang nicht abgeschlossen werden kann. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) von Geometrien sind nicht gleichwertig. Sie können verwenden[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) um Geometrien in dasselbe räumliche Bezugssystem umzuwandeln. |

### Bemerkungen

Diese Methode testet, ob eine Geometrie in Bezug auf die DE-9IM-Schnittmatrix in einer anderen liegt. Eine Geometrie liegt in einer anderen, wenn eine andere Geometrie jeden Punkt der Geometrie enthält und Geometrien Innenräume schneiden. Diese Methode entspricht: Siehe OpenGIS Simple Features Specification für weitere Einzelheiten über DE-9IM und die „räumlich innerhalb“-Beziehung.

```csharp
this.Relate(other, "T*F**F***");
```

### Siehe auch

* method [SpatiallyContains](../spatiallycontains/)
* method [CoveredBy](../coveredby/)
* interface [IGeometry](../)
* namensraum [Aspose.Gis.Geometries](../../igeometry/)
* Montage [Aspose.GIS](../../../)


