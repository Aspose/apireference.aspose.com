---
title: Extent.Grow
second_title: Aspose.GIS voor .NET API-referentie
description: Extent methode. Groeit zo dus het bevat het argument.
type: docs
weight: 160
url: /nl/net/aspose.gis/extent/grow/
---
## Grow(Extent) {#grow}

Groeit zo, dus het bevat het argument.

```csharp
public void Grow(Extent extent)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| extent | Extent | Andere mate. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) van deze omvang en het argument zijn beide niet`null` en niet gelijk aan elkaar. |

### Opmerkingen

Als[`SpatialReferenceSystem`](../spatialreferencesystem/) van deze SRS is`null` dan wordt het bijgewerkt met SRS van het argument.

### Zie ook

* class [Extent](../)
* naamruimte [Aspose.Gis](../../extent/)
* montage [Aspose.GIS](../../../)

---

## Grow(double, double) {#grow_1}

Groeit zo ver zodat het het gespecificeerde punt bevat.

```csharp
public void Grow(double x, double y)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | Double | X-coördinaat om op te nemen. |
| y | Double | Y-coördinaat om op te nemen. |

### Zie ook

* class [Extent](../)
* naamruimte [Aspose.Gis](../../extent/)
* montage [Aspose.GIS](../../../)


