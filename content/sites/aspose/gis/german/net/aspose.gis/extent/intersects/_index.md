---
title: Extent.Intersects
second_title: Aspose.GIS für .NET-API-Referenz
description: Extent methode. Bestimmt ob sich diese Ausdehnung mit dem Argument schneidet.
type: docs
weight: 190
url: /de/net/aspose.gis/extent/intersects/
---
## Intersects(Extent) {#intersects}

Bestimmt, ob sich diese Ausdehnung mit dem Argument schneidet.

```csharp
public bool Intersects(Extent extent)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| extent | Extent | Anderes Ausmaß. |

### Rückgabewert

Wert, der angibt, ob sich diese Ausdehnung mit dem Argument überschneidet.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) in diesem Umfang und das Argument sind beide nicht`null` und nicht gleich. |

### Siehe auch

* class [Extent](../)
* namensraum [Aspose.Gis](../../extent/)
* Montage [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

Bestimmt, ob sich diese Ausdehnung mit dem Argument schneidet.

```csharp
public bool Intersects(IGeometry geometry)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| geometry | IGeometry | Eine Geometrie, die auf Schnittpunkte getestet werden soll |

### Rückgabewert

Wert, der angibt, ob sich diese Ausdehnung mit dem Argument überschneidet.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) in diesem Umfang und das Argument sind beide nicht`null` und nicht gleich. |

### Siehe auch

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* namensraum [Aspose.Gis](../../extent/)
* Montage [Aspose.GIS](../../../)


