---
title: Class MultiLineString
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Geometries.MultiLineString class. A MultiLineString is a onedimensional GeometryCollection whose elements are LineStrings
type: docs
weight: 2930
url: /net/aspose.gis.geometries/multilinestring/
---
## MultiLineString class

A `MultiLineString` is a one-dimensional [`GeometryCollection`](../geometrycollection/) whose elements are [`LineString`](../linestring/)s.

```csharp
public class MultiLineString : MultiCurve, IMultiLineString
```

## Constructors

| Name | Description |
| --- | --- |
| [MultiLineString](multilinestring/)() | Initializes a new instance of the `MultiLineString` class. |

## Properties

| Name | Description |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Gets the number of coordinate dimensions for this [`Geometry`](../geometry/). |
| [Count](../../aspose.gis.geometries/geometrycollection/count/) { get; } | Gets the number of geometries in this collection. |
| [Dimension](../../aspose.gis.geometries/multicurve/dimension/) { get; } | Gets the topological dimension of this [`Geometry`](../geometry/). |
| override [GeometryType](../../aspose.gis.geometries/multilinestring/geometrytype/) { get; } | Gets the type of the geometry. |
| override [HasCurveGeometry](../../aspose.gis.geometries/geometrycollection/hascurvegeometry/) { get; } | Gets a value indicating whether this geometry is or contains curve (not linear) geometry. |
| override [HasM](../../aspose.gis.geometries/geometrycollection/hasm/) { get; set; } | Gets a value indicating whether this instance has M coordinate. |
| override [HasZ](../../aspose.gis.geometries/geometrycollection/hasz/) { get; set; } | Gets a value indicating whether this instance has Z coordinate. |
| virtual [IsClosed](../../aspose.gis.geometries/multicurve/isclosed/) { get; } | Determines whether this curve is closed. |
| override [IsEmpty](../../aspose.gis.geometries/geometrycollection/isempty/) { get; } | Gets a value indicating whether this instance is empty. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Gets a value indicating whether this instance is simple from SFA point of view. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Gets a value indicating whether this instance is valid. |
| [Item](../../aspose.gis.geometries/geometrycollection/item/) { get; } | Gets a [`IGeometry`](../igeometry/) at the specified index. |
| override [SpatialReferenceSystem](../../aspose.gis.geometries/geometrycollection/spatialreferencesystem/) { get; set; } | Gets SpatialReferenceSystem of this instance. This property can be `null`, is SpatialReferenceSystem is unknown. Assigning new SpatialReferenceSystem will not perform any coordinate transformation, only reference will change. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.gis.geometries/geometrycollection/add/)(IGeometry) | Adds the specified geometry to the collection. |
| [AddRange](../../aspose.gis.geometries/geometrycollection/addrange/)(IEnumerable&lt;IGeometry&gt;) | Adds the specified geometries to the collection. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | Translates this geometry to its Well-Known Binary representation. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | Translates this geometry to its Well-Known Binary representation. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | Export this geometry to an image representation. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Export this geometry to an image representation. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Export this geometry to an image representation. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | Translates this geometry to its Well-Known Text representation. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | Translates this geometry to its Well-Known Text representation. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | Translates this geometry to its Well-Known Text representation. |
| override [Clone](../../aspose.gis.geometries/multilinestring/clone/)() | Clones this instance. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Determines whether this geometry is covered by a specified geometry. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Determines whether this geometry covers a specified geometry. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Determines if this geometry and a specified geometry cross. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Subtracts a specified geometry from this geometry. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Determines if this geometry is disjoint from a specified geometry. |
| [Equals](../../aspose.gis.geometries/geometrycollection/equals/)(IGeometryCollection) | Indicates whether the current object is equal to another object of the same type. |
| override [Equals](../../aspose.gis.geometries/geometrycollection/equals/)(object) | Determines whether the specified object is equal to the current object. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Computes the area of this geometry. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Computes a buffer region around this geometry. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Computes the centroid of this geometry. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Computes the convex hull of this geometry. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Computes the minimum distance between this geometry and a specified geometry. |
| [GetEnumerator](../../aspose.gis.geometries/geometrycollection/getenumerator/)() | Returns an enumerator that iterates through the collection. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Computes and returns a bounding extent of this geometry. |
| override [GetHashCode](../../aspose.gis.geometries/geometrycollection/gethashcode/)() | Serves as the default hash function. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Computes the length of this geometry. |
| [GetPointOnSurface](../../aspose.gis.geometries/geometrycollection/getpointonsurface/)() | Finds a point that is guaranteed to be on one of the surfaces in this collection. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Builds an intersection between this geometry and a specified geometry. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Determines whether this geometry intersects a specified extent. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Determines if this geometry and a specified geometry intersects. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Determines whether this geometry overlap with a specified geometry. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Determines if DE-9IM intersection matrix of this geometry and a specified geometry matches provided pattern. |
| [RemoveAt](../../aspose.gis.geometries/geometrycollection/removeat/)(int) | Removes the specified geometry from the collection. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometrycollection/replacepolygonsbylines/)() | Gets polygons represented as lines of this geometry. (2 methods) |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Rounds M coordinate to a specified number of fractional digits. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Rounds X and Y coordinates to a specified number of fractional digits. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Rounds Z coordinate to a specified number of fractional digits. |
| override [SetEmpty](../../aspose.gis.geometries/geometrycollection/setempty/)() | Makes this [`Geometry`](../geometry/) empty. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Determines whether this geometry spatially contains a specified geometry. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Determines if this geometry spatially equal to a specified geometry. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Builds a symmetric difference between this geometry and a specified geometry. |
| [ToEditable](../../aspose.gis.geometries/multilinestring/toeditable/#toeditable_3)() | Gets an editable copy of this geometry. (4 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Gets an editable copy of this geometry. |
| [ToLinearGeometry](../../aspose.gis.geometries/multicurve/tolineargeometry/)() | Gets approximate or equivalent non-curve version of this geometry using the default `tolerance`. (3 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/multicurve/tolineargeometry/)(double) | Gets approximate or equivalent non-curve version of this geometry using the specified `tolerance`. (3 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Returns a string that represents the current object. |
| [ToSvg](../../aspose.gis.geometries/geometry/tosvg/)(Extent) | Translates this geometry to Svg representation. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Determines if this geometry and a specified geometry touch. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Unites this geometry and a specified geometry. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Determines whether this geometry is within a specified extent. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Determines whether this geometry is within a specified geometry. |

### See Also

* class [MultiCurve](../multicurve/)
* interface [IMultiLineString](../imultilinestring/)
* namespace [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* assembly [Aspose.GIS](../../)


