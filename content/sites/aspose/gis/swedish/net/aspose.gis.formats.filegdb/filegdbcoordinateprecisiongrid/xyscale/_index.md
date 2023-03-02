---
title: FileGdbCoordinatePrecisionGrid.XYScale
second_title: Aspose.GIS för .NET API Referens
description: FileGdbCoordinatePrecisionGrid fast egendom. Hämtar eller ställer in skalan för X och Ykoordinater. Om inställt pånull standarden används.
type: docs
weight: 60
url: /sv/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/
---
## FileGdbCoordinatePrecisionGrid.XYScale property

Hämtar eller ställer in skalan för X- och Y-koordinater. Om inställt på`null` standarden används.

```csharp
public double? XYScale { get; set; }
```

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentOutOfRangeException | Argumentet är inte positivt. |

### Anmärkningar

Standardvärdet är`1e9` för[`VectorLayer`](../../../aspose.gis/vectorlayer/)med geografiska[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) och`XYScale = 1 / XYTolerans * 10` för[`VectorLayer`](../../../aspose.gis/vectorlayer/) with projicerad[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) .

### Se även

* class [FileGdbCoordinatePrecisionGrid](../)
* namnutrymme [Aspose.Gis.Formats.FileGdb](../../filegdbcoordinateprecisiongrid/)
* hopsättning [Aspose.GIS](../../../)


