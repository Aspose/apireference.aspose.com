---
title: Aspose.Gis.Geometries
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Geometriesnamespacecontainsclassesthatrepresentgeometrydata.
type: docs
weight: 190
url: /net/aspose.gis.geometries/
---
`Aspose.Gis.Geometries` namespace contains classes that represent geometry data.

## Classes

| Class | Description |
| --- | --- |
| class [CircularString](./circularstring) | A multi-vertex curve with circular interpolation between points. |
| class [CompoundCurve](./compoundcurve) | A curve that represents a sequence of contiguous curves such that adjacent curves are joined at their end points. |
| abstract class [Curve](./curve) | A [`Curve`](aspose.gis.geometries/curve) is a sequence of points. |
| class [CurvePolygon](./curvepolygon) | A planar surface, defined by 1 exterior boundary and 0 or more interior boundaries. |
| abstract class [Geometry](./geometry) | The abstract root class of the geometries hierarchy. |
| class [GeometryCollection](./geometrycollection) | A [`GeometryCollection`](aspose.gis.geometries/geometrycollection) is a [`Geometry`](aspose.gis.geometries/geometry) that is a collection of one or more geometries. |
| class [LinearRing](./linearring) | A [`LinearRing`](aspose.gis.geometries/linearring) is a [`LineString`](aspose.gis.geometries/linestring) that is both closed and simple. |
| class [LineString](./linestring) | A multi-vertex line. |
| class [MultiCurve](./multicurve) | A [`MultiCurve`](aspose.gis.geometries/multicurve) is a one-dimensional [`GeometryCollection`](aspose.gis.geometries/geometrycollection) whose elements are [`Curve`](aspose.gis.geometries/curve)s. |
| class [MultiLineString](./multilinestring) | A [`MultiLineString`](aspose.gis.geometries/multilinestring) is a one-dimensional [`GeometryCollection`](aspose.gis.geometries/geometrycollection) whose elements are [`LineString`](aspose.gis.geometries/linestring)s. |
| class [MultiPoint](./multipoint) | A [`MultiPoint`](aspose.gis.geometries/multipoint) is a one-dimensional [`GeometryCollection`](aspose.gis.geometries/geometrycollection) whose elements are [`Point`](aspose.gis.geometries/point)s. |
| class [MultiPolygon](./multipolygon) | A [`MultiPolygon`](aspose.gis.geometries/multipolygon) is a one-dimensional [`GeometryCollection`](aspose.gis.geometries/geometrycollection) whose elements are [`Polygon`](aspose.gis.geometries/polygon)s. |
| class [MultiSurface](./multisurface) | A [`MultiSurface`](aspose.gis.geometries/multisurface) is a one-dimensional [`GeometryCollection`](aspose.gis.geometries/geometrycollection) whose elements are [`ISurface`](aspose.gis.geometries/isurface)s. |
| class [Point](./point) | A [`Point`](aspose.gis.geometries/point) represents a single location in coordinate space. |
| class [Polygon](./polygon) | A [`Polygon`](aspose.gis.geometries/polygon) is a planar surface, defined by 1 exterior boundary and 0 or more interior boundaries. |
| abstract class [Surface](./surface) | A [`Surface`](aspose.gis.geometries/surface) is a two-dimensional geometric object. |
## Interfaces

| Interface | Description |
| --- | --- |
| interface [ICircularString](./icircularstring) | A multi-vertex curve with circular interpolation between points. |
| interface [ICompoundCurve](./icompoundcurve) | A curve that represents a sequence of contiguous curves such that adjacent curves are joined at their end points. |
| interface [ICurve](./icurve) | A [`ICurve`](aspose.gis.geometries/icurve) is a sequence of points. |
| interface [ICurvePolygon](./icurvepolygon) | A planar surface, defined by 1 exterior boundary and 0 or more interior boundaries. |
| interface [IGeometry](./igeometry) | The interface root class of Geometries hierarchy |
| interface [IGeometryCollection](./igeometrycollection) | A [`IGeometryCollection`](aspose.gis.geometries/igeometrycollection) is a [`IGeometry`](aspose.gis.geometries/igeometry) that is a collection of one or more geometries. |
| interface [ILinearRing](./ilinearring) | A multi-vertex ring. |
| interface [ILineString](./ilinestring) | A multi-vertex curve with linear interpolation between points. |
| interface [IMultiCurve](./imulticurve) | A [`MultiCurve`](aspose.gis.geometries/multicurve) is a one-dimensional [`GeometryCollection`](aspose.gis.geometries/geometrycollection) whose elements are [`Curve`](aspose.gis.geometries/curve)s. |
| interface [IMultiLineString](./imultilinestring) | A [`MultiLineString`](aspose.gis.geometries/multilinestring) is a one-dimensional [`GeometryCollection`](aspose.gis.geometries/geometrycollection) whose elements are [`LineString`](aspose.gis.geometries/linestring)s. |
| interface [IMultiPoint](./imultipoint) | A [`IMultiPoint`](aspose.gis.geometries/imultipoint) is a one-dimensional [`IGeometryCollection`](aspose.gis.geometries/igeometrycollection) whose elements are [`IPoint`](aspose.gis.geometries/ipoint)s. |
| interface [IMultiPolygon](./imultipolygon) | A [`IMultiPolygon`](aspose.gis.geometries/imultipolygon) is a one-dimensional [`IGeometryCollection`](aspose.gis.geometries/igeometrycollection) whose elements are [`IPolygon`](aspose.gis.geometries/ipolygon)s. |
| interface [IMultiSurface](./imultisurface) | A [`IMultiPolygon`](aspose.gis.geometries/imultipolygon) is a one-dimensional [`IGeometryCollection`](aspose.gis.geometries/igeometrycollection) whose elements are [`ISurface`](aspose.gis.geometries/isurface)s. |
| interface [IPoint](./ipoint) | A single location in coordinate space. |
| interface [IPolygon](./ipolygon) | A [`ICurvePolygon`](aspose.gis.geometries/icurvepolygon) whose boundaries are defined by linear rings. |
| interface [ISurface](./isurface) | A [`ISurface`](aspose.gis.geometries/isurface) is a two-dimensional geometric object. |
## Enumeration

| Enumeration | Description |
| --- | --- |
| enum [GeometryDimension](./geometrydimension) | Topological dimension of a [`Geometry`](aspose.gis.geometries/geometry). |
| enum [GeometryType](./geometrytype) | The type of a geometry in a layer. |
| enum [WkbVariant](./wkbvariant) | The variant of Well-Known Binary |
| enum [WktVariant](./wktvariant) | The variant of Well-Known Text |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
