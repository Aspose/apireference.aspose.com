---
title: Interface IGeometryCollection
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.Geometries.IGeometryCollection gränssnitt. AIGeometryCollection är enIGeometry som är en samling av en eller flera geometrier.
type: docs
weight: 1010
url: /sv/net/aspose.gis.geometries/igeometrycollection/
---
## IGeometryCollection interface

A`IGeometryCollection` är en[`IGeometry`](../igeometry/) som är en samling av en eller flera geometrier.

```csharp
public interface IGeometryCollection : IEnumerable<IGeometry>, IEquatable<IGeometryCollection>, 
    IGeometry
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Count](../../aspose.gis.geometries/igeometrycollection/count/) { get; } | Får antalet geometrier i den här samlingen. |
| [Item](../../aspose.gis.geometries/igeometrycollection/item/) { get; } | Får en[`IGeometry`](../igeometry/) vid angivet index. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [GetPointOnSurface](../../aspose.gis.geometries/igeometrycollection/getpointonsurface/)() | Hittar en punkt som garanterat finns på en av ytorna i denna samling. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometrycollection/replacepolygonsbylines/)() | Får polygoner representerade som linjer i denna geometri. |
| [ToEditable](../../aspose.gis.geometries/igeometrycollection/toeditable/)() | Får en redigerbar kopia av denna geometri. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry)() | Får ungefärlig eller likvärdig icke-kurv version av denna geometri med standard`tolerans` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry_1)(double) | Får ungefärlig eller likvärdig icke-kurv version av denna geometri med den angivna`tolerans` . |

### Se även

* interface [IGeometry](../igeometry/)
* namnutrymme [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* hopsättning [Aspose.GIS](../../)


