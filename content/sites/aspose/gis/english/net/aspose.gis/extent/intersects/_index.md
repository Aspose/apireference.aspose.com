---
title: Extent.Intersects
second_title: Aspose.GIS for .NET API Reference
description: Extent method. Determines whether this extent intersects with the argument.
type: docs
weight: 190
url: /net/aspose.gis/extent/intersects/
---
## Intersects(Extent) {#intersects}

Determines whether this extent intersects with the argument.

```csharp
public bool Intersects(Extent extent)
```

| Parameter | Type | Description |
| --- | --- | --- |
| extent | Extent | Another extent. |

### Return Value

Value, indicating whether this extent intersects with the argument.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) of this extent and the argument are both not `null` and not equal to each other. |

### See Also

* class [Extent](../)
* namespace [Aspose.Gis](../../extent/)
* assembly [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

Determines whether this extent intersects with the argument.

```csharp
public bool Intersects(IGeometry geometry)
```

| Parameter | Type | Description |
| --- | --- | --- |
| geometry | IGeometry | A geometry to test for intersection |

### Return Value

Value, indicating whether this extent intersects with the argument.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) of this extent and the argument are both not `null` and not equal to each other. |

### See Also

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* namespace [Aspose.Gis](../../extent/)
* assembly [Aspose.GIS](../../../)


