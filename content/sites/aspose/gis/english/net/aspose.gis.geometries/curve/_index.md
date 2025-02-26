---
title: Class Curve
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Geometries.Curve class. A Curve is a sequence of points
type: docs
weight: 2680
url: /net/aspose.gis.geometries/curve/
---
## Curve class

A `Curve` is a sequence of points.

```csharp
public abstract class Curve : Geometry, ICurve
```

## Properties

| Name | Description |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Gets the number of coordinate dimensions for this [`Geometry`](../geometry/). |
| [Dimension](../../aspose.gis.geometries/curve/dimension/) { get; } | Gets the topological dimension of this [`Geometry`](../geometry/). |
| abstract [EndPoint](../../aspose.gis.geometries/curve/endpoint/) { get; } | Returns a copy of the end point of the curve. |
| abstract [GeometryType](../../aspose.gis.geometries/geometry/geometrytype/) { get; } | Gets the type of the geometry. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | Gets a value indicating whether this geometry is or contains curve (not linear) geometry. |
| virtual [HasM](../../aspose.gis.geometries/geometry/hasm/) { get; set; } | Gets a value indicating whether this instance has M coordinate. |
| virtual [HasZ](../../aspose.gis.geometries/geometry/hasz/) { get; set; } | Gets a value indicating whether this instance has Z coordinate. |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed/) { get; } | Gets a values indicating whether a curve is closed. A curve is closed if its start point is equal to its end point. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty/) { get; } | Gets a value indicating whether this instance is empty. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Gets a value indicating whether this instance is simple from SFA point of view. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Gets a value indicating whether this instance is valid. |
| abstract [SpatialReferenceSystem](../../aspose.gis.geometries/geometry/spatialreferencesystem/) { get; set; } | Gets SpatialReferenceSystem of this instance. This property can be `null`, is SpatialReferenceSystem is unknown. Assigning new SpatialReferenceSystem will not perform any coordinate transformation, only reference will change. |
| abstract [StartPoint](../../aspose.gis.geometries/curve/startpoint/) { get; } | Returns a copy of the starting point of the curve. |

## Methods

| Name | Description |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | Translates this geometry to its Well-Known Binary representation. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | Translates this geometry to its Well-Known Binary representation. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | Export this geometry to an image representation. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Export this geometry to an image representation. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Export this geometry to an image representation. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | Translates this geometry to its Well-Known Text representation. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | Translates this geometry to its Well-Known Text representation. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | Translates this geometry to its Well-Known Text representation. |
| abstract [Clone](../../aspose.gis.geometries/geometry/clone/)() | Clones this instance. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Determines whether this geometry is covered by a specified geometry. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Determines whether this geometry covers a specified geometry. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Determines if this geometry and a specified geometry cross. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Subtracts a specified geometry from this geometry. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Determines if this geometry is disjoint from a specified geometry. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Computes the area of this geometry. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Computes a buffer region around this geometry. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Computes the centroid of this geometry. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Computes the convex hull of this geometry. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Computes the minimum distance between this geometry and a specified geometry. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Computes and returns a bounding extent of this geometry. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Computes the length of this geometry. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Builds an intersection between this geometry and a specified geometry. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Determines whether this geometry intersects a specified extent. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Determines if this geometry and a specified geometry intersects. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Determines whether this geometry overlap with a specified geometry. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Determines if DE-9IM intersection matrix of this geometry and a specified geometry matches provided pattern. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Gets polygons represented as lines of this geometry. |
| abstract [Reverse](../../aspose.gis.geometries/curve/reverse/)() | Reverses this curve. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Rounds M coordinate to a specified number of fractional digits. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Rounds X and Y coordinates to a specified number of fractional digits. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Rounds Z coordinate to a specified number of fractional digits. |
| virtual [SetEmpty](../../aspose.gis.geometries/geometry/setempty/)() | Makes this [`Geometry`](../geometry/) empty. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Determines whether this geometry spatially contains a specified geometry. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Determines if this geometry spatially equal to a specified geometry. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Builds a symmetric difference between this geometry and a specified geometry. |
| [ToEditable](../../aspose.gis.geometries/curve/toeditable/#toeditable)() | Gets an editable copy of this geometry. (2 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Gets an editable copy of this geometry. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/#tolineargeometry_2)() | Gets approximate or equivalent non-curve version of this geometry using the default `tolerance`. (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/#tolineargeometry_3)(double) | Gets approximate or equivalent non-curve version of this geometry using the specified `tolerance`. (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Returns a string that represents the current object. |
| [ToSvg](../../aspose.gis.geometries/geometry/tosvg/)(Extent) | Translates this geometry to Svg representation. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Determines if this geometry and a specified geometry touch. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Unites this geometry and a specified geometry. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Determines whether this geometry is within a specified extent. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Determines whether this geometry is within a specified geometry. |

### See Also

* class [Geometry](../geometry/)
* interface [ICurve](../icurve/)
* namespace [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* assembly [Aspose.GIS](../../)


