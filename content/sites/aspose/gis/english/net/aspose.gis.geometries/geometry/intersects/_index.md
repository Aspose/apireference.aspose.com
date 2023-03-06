---
title: Geometry.Intersects
second_title: Aspose.GIS for .NET API Reference
description: Geometry method. Determines whether this geometry intersects a specified extent.
type: docs
weight: 280
url: /net/aspose.gis.geometries/geometry/intersects/
---
## Intersects(Extent) {#intersects}

Determines whether this geometry intersects a specified extent.

```csharp
public bool Intersects(Extent extent)
```

| Parameter | Type | Description |
| --- | --- | --- |
| extent | Extent | The extent. |

### Return Value

`true` if this geometry intersects the extent; `false` otherwise.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |

### See Also

* method [Intersects](../../../aspose.gis/extent/intersects/)
* class [Extent](../../../aspose.gis/extent/)
* class [Geometry](../)
* namespace [Aspose.Gis.Geometries](../../geometry/)
* assembly [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

Determines if this geometry and a specified geometry intersects.

```csharp
public bool Intersects(IGeometry other)
```

| Parameter | Type | Description |
| --- | --- | --- |
| other | IGeometry | A geometry. |

### Return Value

`true` if this geometry "spatially intersects" another geometry. `false` otherwise.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |
| ArgumentException | One of the geometries is invalid in such way that operation can not be finished. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) of geometries are not equivalent. You can use [`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) in order to convert geometries to the same spatial reference system. |

### Remarks

This method is equivalent to:

```csharp
!this.Disjoint(other);
```

This is the negation of [`Disjoint`](../../igeometry/disjoint/). See [`Disjoint`](../../igeometry/disjoint/) for more details.

### See Also

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namespace [Aspose.Gis.Geometries](../../geometry/)
* assembly [Aspose.GIS](../../../)


