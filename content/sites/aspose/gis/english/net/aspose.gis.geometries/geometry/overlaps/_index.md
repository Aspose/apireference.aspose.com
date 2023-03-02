---
title: Geometry.Overlaps
second_title: Aspose.GIS for .NET API Reference
description: Geometry method. Determines whether this geometry overlap with a specified geometry.
type: docs
weight: 290
url: /net/aspose.gis.geometries/geometry/overlaps/
---
## Geometry.Overlaps method

Determines whether this geometry overlap with a specified geometry.

```csharp
public bool Overlaps(IGeometry other)
```

| Parameter | Type | Description |
| --- | --- | --- |
| other | IGeometry | A geometry. |

### Return Value

`true` if this geometry is "spatially overlaps" another geometry. `false` otherwise.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |
| ArgumentException | One of the geometries is invalid in such way that operation can not be finished. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) of geometries are not equivalent. You can use [`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) in order to convert geometries to the same spatial reference system. |

### Remarks

This method tests whether geometries are overlaps in terms of DE-9IM intersection matrix. Two geometries overlap if they have some but not all interior points in common and the intersection of the geometries have the same dimension as the geometries themselves. For two Point geometries or two Surface geometries this method is equivalent to:

```csharp
this.Relate(other, "T*T***T**");
```

For two Line geometries this method is equivalent to:

```csharp
this.Relate(other, "1*T***T**");
```

For two geometries with not equal [`Dimension`](../../igeometry/dimension/) this method always returns `false`. See OpenGIS Simple Features Specification for more details about DE-9IM and "spatially overlaps" relation.

### See Also

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namespace [Aspose.Gis.Geometries](../../geometry/)
* assembly [Aspose.GIS](../../../)


