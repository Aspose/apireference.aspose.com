---
title: IGeometry.Intersects
second_title: Aspose.GIS for .NET API Reference
description: IGeometry method. Determines whether this geometry intersects a specified extent.
type: docs
weight: 270
url: /net/aspose.gis.geometries/igeometry/intersects/
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
* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
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
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) of geometries are not equivalent. You can use [`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) in order to convert geometries to the same spatial reference system. |

### Remarks

This method is equivalent to:

```csharp
!this.Disjoint(other);
```

This is the negation of [`Disjoint`](../disjoint/). See [`Disjoint`](../disjoint/) for more details.

### See Also

* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
* assembly [Aspose.GIS](../../../)


