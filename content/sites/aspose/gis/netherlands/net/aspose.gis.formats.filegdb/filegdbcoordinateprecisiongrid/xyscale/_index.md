---
title: FileGdbCoordinatePrecisionGrid.XYScale
second_title: Aspose.GIS voor .NET API-referentie
description: FileGdbCoordinatePrecisionGrid eigendom. Haalt of stelt de schaal van X en Ycoördinaten in. Indien ingesteld opnull de standaard wordt gebruikt.
type: docs
weight: 60
url: /nl/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/
---
## FileGdbCoordinatePrecisionGrid.XYScale property

Haalt of stelt de schaal van X- en Y-coördinaten in. Indien ingesteld op`null` de standaard wordt gebruikt.

```csharp
public double? XYScale { get; set; }
```

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentOutOfRangeException | Argument is niet positief. |

### Opmerkingen

Standaardwaarde is`1e9` voor[`VectorLayer`](../../../aspose.gis/vectorlayer/)met geografisch[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) en`XYScale = 1 / XYTolerantie * 10` voor[`VectorLayer`](../../../aspose.gis/vectorlayer/) met geprojecteerd[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) .

### Zie ook

* class [FileGdbCoordinatePrecisionGrid](../)
* naamruimte [Aspose.Gis.Formats.FileGdb](../../filegdbcoordinateprecisiongrid/)
* montage [Aspose.GIS](../../../)


