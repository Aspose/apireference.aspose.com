---
title: IGeometry.ReplacePolygonsByLines
second_title: Aspose.GIS for .NET API Reference
description: IGeometry method. Gets polygons represented as lines of this geometry
type: docs
weight: 300
url: /net/aspose.gis.geometries/igeometry/replacepolygonsbylines/
---
## IGeometry.ReplacePolygonsByLines method

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

* interface [IGeometry](../)
* namespace [Aspose.Gis.Geometries](../../igeometry/)
* assembly [Aspose.GIS](../../../)


