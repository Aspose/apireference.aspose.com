---
title: Class GeometryOperations
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.GeoTools.GeometryOperations class. The geometry operations class provides additional geoprocessing algorithms for geometries
type: docs
weight: 2490
url: /net/aspose.gis.geotools/geometryoperations/
---
## GeometryOperations class

The geometry operations class provides additional geoprocessing algorithms for geometries.

```csharp
public static class GeometryOperations
```

## Methods

| Name | Description |
| --- | --- |
| static [BuildCenterline](../../aspose.gis.geotools/geometryoperations/buildcenterline/#buildcenterline_1)(IEnumerable&lt;Point&gt;) | Build centerline diagram for collection of points (sites) |
| static [BuildCenterline](../../aspose.gis.geotools/geometryoperations/buildcenterline/#buildcenterline)(Polygon) | Build centerline diagram for polygon |
| static [CloseLinearRing](../../aspose.gis.geotools/geometryoperations/closelinearring/)(IGeometry) | Closes geometric segments in rings if it needs. |
| static [CreateMidpoints](../../aspose.gis.geotools/geometryoperations/createmidpoints/)(IGeometry) | Create midpoints by adding a new point in the middle to each segment. |
| static [DeleteNearPoints](../../aspose.gis.geotools/geometryoperations/deletenearpoints/)(IGeometry, NearPointsCleanerOptions) | Delete points that are too close to each other. |
| static [ExtractGeometryCollection](../../aspose.gis.geotools/geometryoperations/extractgeometrycollection/)(VectorLayer) | Extract geometry collection from layer |
| static [GetCenterlineLength](../../aspose.gis.geotools/geometryoperations/getcenterlinelength/#getcenterlinelength_1)(IEnumerable&lt;Point&gt;) | Get centerline Length |
| static [GetCenterlineLength](../../aspose.gis.geotools/geometryoperations/getcenterlinelength/#getcenterlinelength)(Polygon) | Get centerline Length |
| static [MakeVoronoiGraph](../../aspose.gis.geotools/geometryoperations/makevoronoigraph/)(IEnumerable&lt;IPoint&gt;) | Build "Voronoi" diagram for collection of points (sites) |
| static [OrderGeometryCollection](../../aspose.gis.geotools/geometryoperations/ordergeometrycollection/)(IGeometry) | Order geometry collection by type to four collection (point, line, polygon and other type) |
| static [SimplifySegments](../../aspose.gis.geotools/geometryoperations/simplifysegments/)(IGeometry, SimplifySegmentsOptions) | Delete points lying on the same segment. |

## Remarks

Other algorithms you can find in the methods of [`Geometry`](../../aspose.gis.geometries/geometry/)

### See Also

* namespace [Aspose.Gis.GeoTools](../../aspose.gis.geotools/)
* assembly [Aspose.GIS](../../)


