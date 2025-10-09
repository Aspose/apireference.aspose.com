---
title: Class LinearRing
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Geometries.LinearRing class. A LinearRing is a LineString that is both closed and simple
type: docs
weight: 2910
url: /net/aspose.gis.geometries/linearring/
---
## LinearRing class

A `LinearRing` is a [`LineString`](../linestring/) that is both closed and simple.

```csharp
public class LinearRing : LineString, ILinearRing
```

## Constructors

| Name | Description |
| --- | --- |
| [LinearRing](linearring/#constructor)() | Initializes a new instance of the `LinearRing` class. |
| [LinearRing](linearring/#constructor_2)(IEnumerable&lt;IPoint&gt;) | Initializes a new instance of the `LinearRing` class. |
| [LinearRing](linearring/#constructor_1)(ILineString) | Initializes a new instance of the `LinearRing` class. |

## Properties

| Name | Description |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Gets the number of coordinate dimensions for this [`Geometry`](../geometry/). |
| [Count](../../aspose.gis.geometries/linestring/count/) { get; } | Gets the number of points in the [`LineString`](../linestring/). |
| [Dimension](../../aspose.gis.geometries/curve/dimension/) { get; } | Gets the topological dimension of this [`Geometry`](../geometry/). |
| override [EndPoint](../../aspose.gis.geometries/linestring/endpoint/) { get; } | Returns a copy of the end point of the curve. |
| override [GeometryType](../../aspose.gis.geometries/linearring/geometrytype/) { get; } | Gets the type of the geometry. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | Gets a value indicating whether this geometry is or contains curve (not linear) geometry. |
| [HasM](../../aspose.gis.geometries/linestring/hasm/) { get; set; } | Gets a value indicating whether this instance has M coordinate. |
| [HasZ](../../aspose.gis.geometries/linestring/hasz/) { get; set; } | Gets a value indicating whether this instance has Z coordinate. |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed/) { get; } | Gets a values indicating whether a curve is closed. A curve is closed if its start point is equal to its end point. |
| override [IsEmpty](../../aspose.gis.geometries/linestring/isempty/) { get; } | Gets a value indicating whether this instance is empty. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Gets a value indicating whether this instance is simple from SFA point of view. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Gets a value indicating whether this instance is valid. |
| [Item](../../aspose.gis.geometries/linestring/item/) { get; set; } | Gets or sets the [`IPoint`](../ipoint/) at the specified index. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/linestring/spatialreferencesystem/) { get; set; } | Gets SpatialReferenceSystem of this instance. This property can be `null`, if SpatialReferenceSystem is unset. Assigning new SpatialReferenceSystem will not perform any coordinate transformation, only reference will change. |
| override [StartPoint](../../aspose.gis.geometries/linestring/startpoint/) { get; } | Returns a copy of the starting point of the curve. |

## Methods

| Name | Description |
| --- | --- |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/)(IPoint) | Adds a point to the end of the line. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/)(double, double) | Adds a point to the end of the line. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/)(double, double, double) | Adds a point to the end of the line. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/)(double, double, double, double) | Adds a point to the end of the line. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | Translates this geometry to its Well-Known Binary representation. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | Translates this geometry to its Well-Known Binary representation. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | Export this geometry to an image representation. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Export this geometry to an image representation. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Export this geometry to an image representation. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | Translates this geometry to its Well-Known Text representation. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | Translates this geometry to its Well-Known Text representation. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | Translates this geometry to its Well-Known Text representation. |
| override [Clone](../../aspose.gis.geometries/linearring/clone/)() | Clones this instance. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Determines whether this geometry is covered by a specified geometry. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Determines whether this geometry covers a specified geometry. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Determines if this geometry and a specified geometry cross. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Subtracts a specified geometry from this geometry. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Determines if this geometry is disjoint from a specified geometry. |
| [Equals](../../aspose.gis.geometries/linestring/equals/)(ILineString) | Indicates whether the current object is equal to another object of the same type. |
| override [Equals](../../aspose.gis.geometries/linestring/equals/)(object) | Determines whether the specified object is equal to the current object. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Computes the area of this geometry. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Computes a buffer region around this geometry. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Computes the centroid of this geometry. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Computes the convex hull of this geometry. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Computes the minimum distance between this geometry and a specified geometry. |
| [GetEnumerator](../../aspose.gis.geometries/linestring/getenumerator/)() | Returns an enumerator that iterates through the collection. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Computes and returns a bounding extent of this geometry. |
| override [GetHashCode](../../aspose.gis.geometries/linestring/gethashcode/)() | Serves as the default hash function. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Computes the length of this geometry. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Builds an intersection between this geometry and a specified geometry. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Determines whether this geometry intersects a specified extent. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Determines if this geometry and a specified geometry intersects. |
| [IsClockwise](../../aspose.gis.geometries/linearring/isclockwise/)() | Determines if the ring has clockwise winding. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Determines whether this geometry overlap with a specified geometry. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Determines if DE-9IM intersection matrix of this geometry and a specified geometry matches provided pattern. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Gets polygons represented as lines of this geometry. |
| override [Reverse](../../aspose.gis.geometries/linestring/reverse/)() | Reverses order of points in this [`LineString`](../linestring/). |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Rounds M coordinate to a specified number of fractional digits. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Rounds X and Y coordinates to a specified number of fractional digits. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Rounds Z coordinate to a specified number of fractional digits. |
| override [SetEmpty](../../aspose.gis.geometries/linestring/setempty/)() | Makes this [`Geometry`](../geometry/) empty. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Determines whether this geometry spatially contains a specified geometry. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Determines if this geometry spatially equal to a specified geometry. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Builds a symmetric difference between this geometry and a specified geometry. |
| [ToEditable](../../aspose.gis.geometries/linearring/toeditable/#toeditable_2)() | Gets an editable copy of this geometry. (4 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Gets an editable copy of this geometry. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)() | Gets approximate or equivalent non-curve version of this geometry using the default `tolerance`. (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)(double) | Gets approximate or equivalent non-curve version of this geometry using the specified `tolerance`. (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Returns a string that represents the current object. |
| [ToSvg](../../aspose.gis.geometries/geometry/tosvg/)(Extent) | Translates this geometry to Svg representation. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Determines if this geometry and a specified geometry touch. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Unites this geometry and a specified geometry. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Determines whether this geometry is within a specified extent. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Determines whether this geometry is within a specified geometry. |

### See Also

* class [LineString](../linestring/)
* interface [ILinearRing](../ilinearring/)
* namespace [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* assembly [Aspose.GIS](../../)


