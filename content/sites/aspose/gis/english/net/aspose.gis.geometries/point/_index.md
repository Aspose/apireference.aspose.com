---
title: Class Point
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Geometries.Point class. A Point represents a single location in coordinate space
type: docs
weight: 2970
url: /net/aspose.gis.geometries/point/
---
## Point class

A `Point` represents a single location in coordinate space.

```csharp
public class Point : Geometry, IPoint
```

## Constructors

| Name | Description |
| --- | --- |
| [Point](point/#constructor)() | Initializes a new instance of the `Point` class. |
| [Point](point/#constructor_1)(IPoint) | Initializes a new instance of the `Point` class. |
| [Point](point/#constructor_2)(double, double) | Initializes a new instance of the `Point` class. |
| [Point](point/#constructor_3)(double, double, double) | Initializes a new instance of the `Point` class. |
| [Point](point/#constructor_4)(double, double, double, double) | Initializes a new instance of the `Point` class. |

## Properties

| Name | Description |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Gets the number of coordinate dimensions for this [`Geometry`](../geometry/). |
| override [Dimension](../../aspose.gis.geometries/point/dimension/) { get; } | Gets the topological dimension of this [`Geometry`](../geometry/). |
| override [GeometryType](../../aspose.gis.geometries/point/geometrytype/) { get; } | Gets the type of the geometry. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | Gets a value indicating whether this geometry is or contains curve (not linear) geometry. |
| override [HasM](../../aspose.gis.geometries/point/hasm/) { get; set; } | Gets a value indicating whether this instance has an M coordinate. |
| override [HasZ](../../aspose.gis.geometries/point/hasz/) { get; set; } | Gets a value indicating whether this instance has Z coordinate. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty/) { get; } | Gets a value indicating whether this instance is empty. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Gets a value indicating whether this instance is simple from SFA point of view. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Gets a value indicating whether this instance is valid. |
| [M](../../aspose.gis.geometries/point/m/) { get; set; } | Gets or sets a value for the m-coordinate. |
| override [SpatialReferenceSystem](../../aspose.gis.geometries/point/spatialreferencesystem/) { get; set; } | Gets SpatialReferenceSystem of this instance. This property can be `null`, is SpatialReferenceSystem is unknown. Assigning new SpatialReferenceSystem will not perform any coordinate transformation, only reference will change. |
| [X](../../aspose.gis.geometries/point/x/) { get; set; } | Gets or sets a value for the x-coordinate. |
| [Y](../../aspose.gis.geometries/point/y/) { get; set; } | Gets or sets a value for the y-coordinate. |
| [Z](../../aspose.gis.geometries/point/z/) { get; set; } | Gets or sets a value for the z-coordinate. |

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
| override [Clone](../../aspose.gis.geometries/point/clone/)() | Clones this instance. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Determines whether this geometry is covered by a specified geometry. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Determines whether this geometry covers a specified geometry. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Determines if this geometry and a specified geometry cross. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Subtracts a specified geometry from this geometry. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Determines if this geometry is disjoint from a specified geometry. |
| [Equals](../../aspose.gis.geometries/point/equals/#equals)(IPoint) | Indicates whether the current object is equal to another object of the same type. |
| override [Equals](../../aspose.gis.geometries/point/equals/#equals_1)(object) | Determines whether the specified object is equal to the current object. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Computes the area of this geometry. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Computes a buffer region around this geometry. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Computes the centroid of this geometry. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Computes the convex hull of this geometry. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Computes the minimum distance between this geometry and a specified geometry. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Computes and returns a bounding extent of this geometry. |
| override [GetHashCode](../../aspose.gis.geometries/point/gethashcode/)() | Serves as the default hash function. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Computes the length of this geometry. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Builds an intersection between this geometry and a specified geometry. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Determines whether this geometry intersects a specified extent. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Determines if this geometry and a specified geometry intersects. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Determines whether this geometry overlap with a specified geometry. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Determines if DE-9IM intersection matrix of this geometry and a specified geometry matches provided pattern. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Gets polygons represented as lines of this geometry. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Rounds M coordinate to a specified number of fractional digits. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Rounds X and Y coordinates to a specified number of fractional digits. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Rounds Z coordinate to a specified number of fractional digits. |
| override [SetEmpty](../../aspose.gis.geometries/point/setempty/)() | Makes this [`Geometry`](../geometry/) empty. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Determines whether this geometry spatially contains a specified geometry. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Determines if this geometry spatially equal to a specified geometry. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Builds a symmetric difference between this geometry and a specified geometry. |
| [ToEditable](../../aspose.gis.geometries/point/toeditable/#toeditable_1)() | Gets an editable copy of this geometry. (2 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Gets an editable copy of this geometry. |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry/)() | Gets approximate or equivalent non-curve version of this geometry using the default `tolerance`. |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry/)(double) | Gets approximate or equivalent non-curve version of this geometry using the specified `tolerance`. |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Returns a string that represents the current object. |
| [ToSvg](../../aspose.gis.geometries/geometry/tosvg/)(Extent) | Translates this geometry to Svg representation. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Determines if this geometry and a specified geometry touch. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Unites this geometry and a specified geometry. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Determines whether this geometry is within a specified extent. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Determines whether this geometry is within a specified geometry. |
| [operator ==](../../aspose.gis.geometries/point/op_equality/) | Implements the operator ==. |
| [operator !=](../../aspose.gis.geometries/point/op_inequality/) | Implements the operator !=. |

### See Also

* class [Geometry](../geometry/)
* interface [IPoint](../ipoint/)
* namespace [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* assembly [Aspose.GIS](../../)


