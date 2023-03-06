---
title: IGeometry.GetConvexHull
second_title: Aspose.GIS for .NET API Reference
description: IGeometry method. Computes the convex hull of this geometry.
type: docs
weight: 220
url: /net/aspose.gis.geometries/igeometry/getconvexhull/
---
## IGeometry.GetConvexHull method

Computes the convex hull of this geometry.

```csharp
public IGeometry GetConvexHull()
```

### Return Value

A geometry that represents a convex hull of this geometry. If this geometry has no points then the result is [`Null`](../../geometry/null/). If this geometry has only one point then the result is this point. If this geometry has only two points then the result is [`ILineString`](../../ilinestring/) with the points. If this geometry has three or more points then the result is [`ILinearRing`](../../ilinearring/) that represents a convex hull around all geometries points.

### See Also

* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
* assembly [Aspose.GIS](../../../)


