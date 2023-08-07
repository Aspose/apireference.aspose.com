---
title: Geometry.Covers
second_title: Aspose.GIS for .NET API Reference
description: Geometry method. Determines whether this geometry covers a specified geometry
type: docs
weight: 160
url: /net/aspose.gis.geometries/geometry/covers/
---
## Geometry.Covers method

Determines whether this geometry covers a specified geometry.

```csharp
public bool Covers(IGeometry other)
```

| Parameter | Type | Description |
| --- | --- | --- |
| other | IGeometry | A geometry. |

### Return Value

`true` if this geometry is "spatially covers" another geometry. `false` otherwise.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |
| ArgumentException | One of the geometries is invalid in such way that operation can not be finished. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) of geometries are not equivalent. You can use [`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) in order to convert geometries to the same spatial reference system. |

## Remarks

This method tests whether one geometry covers another in terms of DE-9IM intersection matrix. One geometry covers another one, if the geometry contains every point of another geometry. This method is similar to [`SpatiallyContains`](../../igeometry/spatiallycontains/), but returns `true` more often, since it does not distinguish between interior and boundary points. So, if geometry A lies on boundary of geometry B, [`SpatiallyContains`](../../igeometry/spatiallycontains/) returns `false`, while this method returns `true`. This method is equivalent to:

```csharp
this.Relate(other, "T*****FF*") || this.Relate(other, "*T****FF*") || this.Relate(other, "***T**FF*) || this.Relate(other, "***T*FF*");
```

### See Also

* method [SpatiallyContains](../../igeometry/spatiallycontains/)
* method [CoveredBy](../../igeometry/coveredby/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namespace [Aspose.Gis.Geometries](../../geometry/)
* assembly [Aspose.GIS](../../../)


