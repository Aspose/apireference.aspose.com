---
title: Geometry.ReplacePolygonsByLines
second_title: Aspose.GIS for .NET API Reference
description: Geometry method. Gets polygons represented as lines of this geometry
type: docs
weight: 310
url: /net/aspose.gis.geometries/geometry/replacepolygonsbylines/
---
## Geometry.ReplacePolygonsByLines method

Gets polygons represented as lines of this geometry.

```csharp
public IGeometry ReplacePolygonsByLines()
```

### Return Value

A geometry, that has no polygon geometries. The following transformation are applied: Polygons are linearized (transformed into LineStrings)MultiPolygons are joined into MultiLineStrings

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException |  |

### See Also

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namespace [Aspose.Gis.Geometries](../../geometry/)
* assembly [Aspose.GIS](../../../)


