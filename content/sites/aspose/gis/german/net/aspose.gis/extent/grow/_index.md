---
title: Extent.Grow
second_title: Aspose.GIS für .NET-API-Referenz
description: Extent methode. Erhöht diese Ausdehnung sodass es das Argument enthält.
type: docs
weight: 160
url: /de/net/aspose.gis/extent/grow/
---
## Grow(Extent) {#grow}

Erhöht diese Ausdehnung, sodass es das Argument enthält.

```csharp
public void Grow(Extent extent)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| extent | Extent | Anderes Ausmaß. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) in diesem Umfang und das Argument sind beide nicht`null` und nicht gleich. |

### Bemerkungen

Wenn[`SpatialReferenceSystem`](../spatialreferencesystem/) dieser SRS ist`null` dann wird es mit SRS des Arguments aktualisiert.

### Siehe auch

* class [Extent](../)
* namensraum [Aspose.Gis](../../extent/)
* Montage [Aspose.GIS](../../../)

---

## Grow(double, double) {#grow_1}

Vergrößert diese Ausdehnung, sodass sie den angegebenen Punkt enthält.

```csharp
public void Grow(double x, double y)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | Double | Einzuschließende X-Koordinate. |
| y | Double | Einzuschließende Y-Koordinate. |

### Siehe auch

* class [Extent](../)
* namensraum [Aspose.Gis](../../extent/)
* Montage [Aspose.GIS](../../../)


