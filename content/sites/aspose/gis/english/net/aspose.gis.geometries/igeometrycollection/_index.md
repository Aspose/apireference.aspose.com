---
title: Interface IGeometryCollection
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Geometries.IGeometryCollection interface. A IGeometryCollection is a IGeometry that is a collection of one or more geometries
type: docs
weight: 2790
url: /net/aspose.gis.geometries/igeometrycollection/
---
## IGeometryCollection interface

A `IGeometryCollection` is a [`IGeometry`](../igeometry/) that is a collection of one or more geometries.

```csharp
public interface IGeometryCollection : IEnumerable<IGeometry>, IEquatable<IGeometryCollection>, 
    IGeometry
```

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.gis.geometries/igeometrycollection/count/) { get; } | Gets the number of geometries in this collection. |
| [Item](../../aspose.gis.geometries/igeometrycollection/item/) { get; } | Gets a [`IGeometry`](../igeometry/) at the specified index. |

## Methods

| Name | Description |
| --- | --- |
| [GetPointOnSurface](../../aspose.gis.geometries/igeometrycollection/getpointonsurface/)() | Finds a point that is guaranteed to be on one of the surfaces in this collection. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometrycollection/replacepolygonsbylines/)() | Gets polygons represented as lines of this geometry. |
| [ToEditable](../../aspose.gis.geometries/igeometrycollection/toeditable/)() | Gets an editable copy of this geometry. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry)() | Gets approximate or equivalent non-curve version of this geometry using the default `tolerance`. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry_1)(double) | Gets approximate or equivalent non-curve version of this geometry using the specified `tolerance`. |

### See Also

* interface [IGeometry](../igeometry/)
* namespace [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* assembly [Aspose.GIS](../../)


