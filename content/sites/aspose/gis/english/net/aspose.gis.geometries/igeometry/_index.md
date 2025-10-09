---
title: Interface IGeometry
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Geometries.IGeometry interface. The interface root class of Geometries hierarchy
type: docs
weight: 2780
url: /net/aspose.gis.geometries/igeometry/
---
## IGeometry interface

The interface root class of Geometries hierarchy

```csharp
public interface IGeometry
```

## Properties

| Name | Description |
| --- | --- |
| [Dimension](../../aspose.gis.geometries/igeometry/dimension/) { get; } | Gets the topological dimension of this `IGeometry`. If the dimension is unknown (e.g. for an empty GEOMETRYCOLLECTION) Point is returned. |
| [GeometryType](../../aspose.gis.geometries/igeometry/geometrytype/) { get; } | Gets the type of the geometry. |
| [HasCurveGeometry](../../aspose.gis.geometries/igeometry/hascurvegeometry/) { get; } | Gets a value indicating whether this geometry is or contains curve (not linear) geometry. |
| [HasM](../../aspose.gis.geometries/igeometry/hasm/) { get; } | Gets a value indicating whether this instance has M coordinate. |
| [HasZ](../../aspose.gis.geometries/igeometry/hasz/) { get; } | Gets a value indicating whether this instance has Z coordinate. |
| [IsEmpty](../../aspose.gis.geometries/igeometry/isempty/) { get; } | Gets a value indicating whether this instance is empty (represents the empty point set). |
| [IsSimple](../../aspose.gis.geometries/igeometry/issimple/) { get; } | Gets a value indicating whether this instance is simple from SFA point of view. |
| [IsValid](../../aspose.gis.geometries/igeometry/isvalid/) { get; } | Gets a value indicating whether this instance is valid. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/igeometry/spatialreferencesystem/) { get; } | Gets SpatialReferenceSystem of this instance. This property can be `null`, if SpatialReferenceSystem is unknown. |

## Methods

| Name | Description |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary/#asbinary)() | Translates this geometry to its Well-Known Binary representation. |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary/#asbinary_1)(WkbVariant) | Translates this geometry to its Well-Known Binary representation. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage/#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Export this geometry to an image representation. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage/#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Export this geometry to an image representation. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage/#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Export this geometry to an image representation. |
| [AsText](../../aspose.gis.geometries/igeometry/astext/#astext)() | Translates this geometry to its Well-Known Text representation. |
| [AsText](../../aspose.gis.geometries/igeometry/astext/#astext_1)(WktVariant) | Translates this geometry to its Well-Known Text representation. |
| [AsText](../../aspose.gis.geometries/igeometry/astext/#astext_2)(WktVariant, NumericFormat) | Translates this geometry to its Well-Known Text representation. |
| [Clone](../../aspose.gis.geometries/igeometry/clone/)() | Clones this instance. |
| [CoveredBy](../../aspose.gis.geometries/igeometry/coveredby/)(IGeometry) | Determines whether this geometry is covered by a specified geometry. |
| [Covers](../../aspose.gis.geometries/igeometry/covers/)(IGeometry) | Determines whether this geometry covers a specified geometry. |
| [Crosses](../../aspose.gis.geometries/igeometry/crosses/)(IGeometry) | Determines if this geometry and a specified geometry cross. |
| [Difference](../../aspose.gis.geometries/igeometry/difference/)(IGeometry) | Subtracts a specified geometry from this geometry. |
| [Disjoint](../../aspose.gis.geometries/igeometry/disjoint/)(IGeometry) | Determines if this geometry is disjoint from a specified geometry. |
| [GetArea](../../aspose.gis.geometries/igeometry/getarea/)() | Computes the area of this geometry. |
| [GetBuffer](../../aspose.gis.geometries/igeometry/getbuffer/)(double, int) | Computes a buffer region around this geometry. |
| [GetCentroid](../../aspose.gis.geometries/igeometry/getcentroid/)() | Computes the centroid of this geometry. |
| [GetConvexHull](../../aspose.gis.geometries/igeometry/getconvexhull/)() | Computes the convex hull of this geometry. |
| [GetDistanceTo](../../aspose.gis.geometries/igeometry/getdistanceto/)(IGeometry) | Computes the minimum distance between this geometry and a specified geometry. |
| [GetExtent](../../aspose.gis.geometries/igeometry/getextent/)() | Computes and returns a bounding extent of this geometry. |
| [GetLength](../../aspose.gis.geometries/igeometry/getlength/)() | Computes the length of this geometry. |
| [Intersection](../../aspose.gis.geometries/igeometry/intersection/)(IGeometry) | Builds an intersection between this geometry and a specified geometry. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects/#intersects)(Extent) | Determines whether this geometry intersects a specified extent. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects/#intersects_1)(IGeometry) | Determines if this geometry and a specified geometry intersects. |
| [Overlaps](../../aspose.gis.geometries/igeometry/overlaps/)(IGeometry) | Determines whether this geometry overlap with a specified geometry. |
| [Relate](../../aspose.gis.geometries/igeometry/relate/)(IGeometry, string) | Determines if DE-9IM intersection matrix of this geometry and a specified geometry matches provided pattern. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometry/replacepolygonsbylines/)() | Gets polygons represented as lines of this geometry. |
| [SpatiallyContains](../../aspose.gis.geometries/igeometry/spatiallycontains/)(IGeometry) | Determines whether this geometry spatially contains a specified geometry. |
| [SpatiallyEquals](../../aspose.gis.geometries/igeometry/spatiallyequals/)(IGeometry) | Determines if this geometry spatially equal to a specified geometry. |
| [SymDifference](../../aspose.gis.geometries/igeometry/symdifference/)(IGeometry) | Builds a symmetric difference between this geometry and a specified geometry. |
| [ToEditable](../../aspose.gis.geometries/igeometry/toeditable/#toeditable)() | Gets an editable copy of this geometry. |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/igeometry/toeditable/#toeditable_1)() | Gets an editable copy of this geometry. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry/#tolineargeometry)() | Gets approximate or equivalent non-curve version of this geometry using the default `tolerance`. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry/#tolineargeometry_1)(double) | Gets approximate or equivalent non-curve version of this geometry using the specified `tolerance`. |
| [Touches](../../aspose.gis.geometries/igeometry/touches/)(IGeometry) | Determines if this geometry and a specified geometry touch. |
| [Union](../../aspose.gis.geometries/igeometry/union/)(IGeometry) | Unites this geometry and a specified geometry. |
| [Within](../../aspose.gis.geometries/igeometry/within/#within)(Extent) | Determines whether this geometry is within a specified extent. |
| [Within](../../aspose.gis.geometries/igeometry/within/#within_1)(IGeometry) | Determines whether this geometry is within a specified geometry. |

### See Also

* namespace [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* assembly [Aspose.GIS](../../)


