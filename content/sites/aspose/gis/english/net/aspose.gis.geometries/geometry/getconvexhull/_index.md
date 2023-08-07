---
title: Geometry.GetConvexHull
second_title: Aspose.GIS for .NET API Reference
description: Geometry method. Computes the convex hull of this geometry
type: docs
weight: 230
url: /net/aspose.gis.geometries/geometry/getconvexhull/
---
## Geometry.GetConvexHull method

Computes the convex hull of this geometry.

```csharp
public IGeometry GetConvexHull()
```

### Return Value

A geometry that represents a convex hull of this geometry. If this geometry has no points then the result is [`Null`](../null/). If this geometry has only one point then the result is this point. If this geometry has only two points then the result is [`ILineString`](../../ilinestring/) with the points. If this geometry has three or more points then the result is [`ILinearRing`](../../ilinearring/) that represents a convex hull around all geometries points.

### See Also

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namespace [Aspose.Gis.Geometries](../../geometry/)
* assembly [Aspose.GIS](../../../)


