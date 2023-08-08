---
title: IGeometry.GetBuffer
second_title: Aspose.GIS for .NET API Reference
description: IGeometry method. Computes a buffer region around this geometry
type: docs
weight: 200
url: /net/aspose.gis.geometries/igeometry/getbuffer/
---
## IGeometry.GetBuffer method

Computes a buffer region around this geometry.

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| Parameter | Type | Description |
| --- | --- | --- |
| distance | Double | The buffer region width (in Spatial Reference units). |
| quadrantSegments | Int32 | Number of segments used to approximate a 90 degree of curvature. The larger this number is the better approximation of curves is produced. Default is 30. |

### Return Value

A geometry that represents all points that are within a specified distance from this geometry. The type of result is either [`Null`](../../geometry/null/), [`IPolygon`](../../ipolygon/) or [`IMultiPolygon`](../../imultipolygon/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | This geometry is invalid in a such way that operation can not be completed. |
| ArgumentOutOfRangeException | Quadrant segments is less or equal to 0. |

### See Also

* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
* assembly [Aspose.GIS](../../../)


