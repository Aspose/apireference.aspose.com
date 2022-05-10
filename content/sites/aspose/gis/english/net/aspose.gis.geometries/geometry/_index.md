---
title: Geometry
second_title: Aspose.GIS for .NET API Reference
description: 
type: docs
weight: 780
url: /net/aspose.gis.geometries/geometry/
---
## Geometry class

The abstract root class of the geometries hierarchy.

```csharp
public abstract class Geometry : IGeometry
```

## Properties

| Name | Description |
| --- | --- |
| [CoordinateDimension](coordinatedimension) { get; } | Gets the number of coordinate dimensions for this [`Geometry`](../geometry). |
| abstract [Dimension](dimension) { get; } | Gets the topological dimension of this [`Geometry`](../geometry). If the dimension is unknown (e.g. for an empty GEOMETRYCOLLECTION) Point is returned. |
| abstract [GeometryType](geometrytype) { get; } | Gets the type of the geometry. |
| virtual [HasCurveGeometry](hascurvegeometry) { get; } | Gets a value indicating whether this geometry is or contains curve (not linear) geometry. |
| virtual [HasM](hasm) { get; set; } | Gets a value indicating whether this instance has M coordinate. |
| virtual [HasZ](hasz) { get; set; } | Gets a value indicating whether this instance has Z coordinate. |
| virtual [IsEmpty](isempty) { get; } | Gets a value indicating whether this instance is empty. |
| [IsSimple](issimple) { get; } | Gets a value indicating whether this instance is simple from SFA point of view. |
| [IsValid](isvalid) { get; } | Gets a value indicating whether this instance is valid. |
| abstract [SpatialReferenceSystem](spatialreferencesystem) { get; set; } | Gets SpatialReferenceSystem of this instance. This property can be `null`, is SpatialReferenceSystem is unknown. Assigning new SpatialReferenceSystem will not perform any coordinate transformation, only reference will change. |
| static [Null](null) { get; } | Gets an instance of null geometry. |

## Methods

| Name | Description |
| --- | --- |
| [AsBinary](asbinary)() | Translates this geometry to its Well-Known Binary representation. |
| [AsBinary](asbinary)(WkbVariant) | Translates this geometry to its Well-Known Binary representation. |
| [AsText](astext)() | Translates this geometry to its Well-Known Text representation. |
| [AsText](astext)(WktVariant) | Translates this geometry to its Well-Known Text representation. |
| [AsText](astext)(WktVariant, NumericFormat) | Translates this geometry to its Well-Known Text representation. |
| abstract [Clone](clone)() | Clones this instance. |
| [CoveredBy](coveredby)(IGeometry) | Determines whether this geometry is covered by a specified geometry. |
| [Covers](covers)(IGeometry) | Determines whether this geometry covers a specified geometry. |
| [Crosses](crosses)(IGeometry) | Determines if this geometry and a specified geometry cross. |
| [Difference](difference)(IGeometry) | Subtracts a specified geometry from this geometry. |
| [Disjoint](disjoint)(IGeometry) | Determines if this geometry is disjoint from a specified geometry. |
| [GetArea](getarea)() | Computes the area of this geometry. |
| [GetBuffer](getbuffer)(double, int) | Computes a buffer region around this geometry. |
| [GetCentroid](getcentroid)() | Computes the centroid of this geometry. |
| [GetConvexHull](getconvexhull)() | Computes the convex hull of this geometry. |
| [GetDistanceTo](getdistanceto)(IGeometry) | Computes the minimum distance between this geometry and a specified geometry. |
| [GetExtent](getextent)() | Computes and returns a bounding extent of this geometry. |
| [GetLength](getlength)() | Computes the length of this geometry. |
| [Intersection](intersection)(IGeometry) | Builds an intersection between this geometry and a specified geometry. |
| [Intersects](intersects)(Extent) | Determines whether this geometry intersects a specified extent. |
| [Intersects](intersects)(IGeometry) | Determines if this geometry and a specified geometry intersects. |
| [Overlaps](overlaps)(IGeometry) | Determines whether this geometry overlap with a specified geometry. |
| [Relate](relate)(IGeometry, string) | Determines if DE-9IM intersection matrix of this geometry and a specified geometry matches provided pattern. |
| [ReplacePolygonsByLines](replacepolygonsbylines)() | Gets polygons represented as lines of this geometry. |
| [RoundM](roundm)(int) | Rounds M coordinate to a specified number of fractional digits. |
| [RoundXY](roundxy)(int) | Rounds X and Y coordinates to a specified number of fractional digits. |
| [RoundZ](roundz)(int) | Rounds Z coordinate to a specified number of fractional digits. |
| virtual [SetEmpty](setempty)() | Makes this [`Geometry`](../geometry) empty. |
| [SpatiallyContains](spatiallycontains)(IGeometry) | Determines whether this geometry spatially contains a specified geometry. |
| [SpatiallyEquals](spatiallyequals)(IGeometry) | Determines if this geometry spatially equal to a specified geometry. |
| [SymDifference](symdifference)(IGeometry) | Builds a symmetric difference between this geometry and a specified geometry. |
| [ToEditable](toeditable)() | Gets an editable copy of this geometry. |
| [ToEditable&lt;T&gt;](toeditable)() | Gets an editable copy of this geometry. |
| [ToLinearGeometry](tolineargeometry)() | Gets approximate or equivalent non-curve version of this geometry using the default `tolerance`. |
| [ToLinearGeometry](tolineargeometry)(double) | Gets approximate or equivalent non-curve version of this geometry using the specified `tolerance`. |
| override [ToString](tostring)() | Returns a string that represents the current object. |
| [Touches](touches)(IGeometry) | Determines if this geometry and a specified geometry touch. |
| [Union](union)(IGeometry) | Unites this geometry and a specified geometry. |
| [Within](within)(Extent) | Determines whether this geometry is within a specified extent. |
| [Within](within)(IGeometry) | Determines whether this geometry is within a specified geometry. |
| static [FromBinary](frombinary)(byte[]) | Creates a geometry from its Well-Known Binary representation. |
| static [FromBinary](frombinary)(byte[], SpatialReferenceSystem) | Creates a geometry from its Well-Known Binary representation. |
| static [FromText](fromtext)(string) | Creates a geometry from its Well-Known Text representation. |
| static [FromText](fromtext)(string, SpatialReferenceSystem) | Creates a geometry from its Well-Known Text representation. |

### See Also

* interface [IGeometry](../igeometry)
* namespace [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* assembly [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
