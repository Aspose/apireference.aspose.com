---
title: Extent.Intersects
second_title: Aspose.GIS för .NET API Referens
description: Extent metod. Bestämmer om denna utsträckning skär med argumentet.
type: docs
weight: 190
url: /sv/net/aspose.gis/extent/intersects/
---
## Intersects(Extent) {#intersects}

Bestämmer om denna utsträckning skär med argumentet.

```csharp
public bool Intersects(Extent extent)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| extent | Extent | En annan utsträckning. |

### Returvärde

Värde, som indikerar om denna utsträckning korsar argumentet.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argument är`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) av denna omfattning och argumentet är båda inte`null` och inte lika med varandra. |

### Se även

* class [Extent](../)
* namnutrymme [Aspose.Gis](../../extent/)
* hopsättning [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

Bestämmer om denna utsträckning skär med argumentet.

```csharp
public bool Intersects(IGeometry geometry)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| geometry | IGeometry | En geometri att testa för korsning |

### Returvärde

Värde, som indikerar om denna utsträckning korsar argumentet.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argument är`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) av denna omfattning och argumentet är båda inte`null` och inte lika med varandra. |

### Se även

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* namnutrymme [Aspose.Gis](../../extent/)
* hopsättning [Aspose.GIS](../../../)


