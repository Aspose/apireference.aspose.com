---
title: IGeometryCollection.ReplacePolygonsByLines
second_title: Aspose.GIS for .NET API Reference
description: IGeometryCollection method. Gets polygons represented as lines of this geometry
type: docs
weight: 40
url: /net/aspose.gis.geometries/igeometrycollection/replacepolygonsbylines/
---
## IGeometryCollection.ReplacePolygonsByLines method

Gets polygons represented as lines of this geometry.

```csharp
public IGeometryCollection ReplacePolygonsByLines()
```

### Return Value

A geometry, that has no polygon geometries. The following transformation are applied: Polygons are linearized (transformed into LineStrings)MultiPolygons are joined into MultiLineStrings

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException |  |

### See Also

* interface [IGeometryCollection](../)
* namespace [Aspose.Gis.Geometries](../../igeometrycollection/)
* assembly [Aspose.GIS](../../../)


