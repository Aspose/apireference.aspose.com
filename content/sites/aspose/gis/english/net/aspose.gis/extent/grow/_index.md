---
title: Extent.Grow
second_title: Aspose.GIS for .NET API Reference
description: Extent method. Grows this extent so it includes the argument.
type: docs
weight: 160
url: /net/aspose.gis/extent/grow/
---
## Grow(Extent) {#grow}

Grows this extent so it includes the argument.

```csharp
public void Grow(Extent extent)
```

| Parameter | Type | Description |
| --- | --- | --- |
| extent | Extent | Other extent. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) of this extent and the argument are both not `null` and not equal to each other. |

### Remarks

If [`SpatialReferenceSystem`](../spatialreferencesystem/) of this SRS is `null` then it is updated with SRS of the argument.

### See Also

* class [Extent](../)
* namespace [Aspose.Gis](../../extent/)
* assembly [Aspose.GIS](../../../)

---

## Grow(double, double) {#grow_1}

Grows this extent so it includes the specified point.

```csharp
public void Grow(double x, double y)
```

| Parameter | Type | Description |
| --- | --- | --- |
| x | Double | X coordinate to include. |
| y | Double | Y coordinate to include. |

### See Also

* class [Extent](../)
* namespace [Aspose.Gis](../../extent/)
* assembly [Aspose.GIS](../../../)


