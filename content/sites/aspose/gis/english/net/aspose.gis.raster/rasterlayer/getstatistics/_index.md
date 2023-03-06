---
title: RasterLayer.GetStatistics
second_title: Aspose.GIS for .NET API Reference
description: RasterLayer method. Calculate summary statistics consisting of count sum mean min max.
type: docs
weight: 160
url: /net/aspose.gis.raster/rasterlayer/getstatistics/
---
## RasterLayer.GetStatistics method

Calculate summary statistics consisting of count, sum, mean, min, max.

```csharp
public RasterStatistics GetStatistics(int bandIndex = 0, bool excludeNodataValue = true)
```

| Parameter | Type | Description |
| --- | --- | --- |
| bandIndex | Int32 | The index of the band. Numbering starts from 0. |
| excludeNodataValue | Boolean | Allows to exclude 'nodata' values. If 'excludeNodataValue' is set to false, then all pixels are considered. |

### Return Value

The summary statistics.

### See Also

* class [RasterStatistics](../../rasterstatistics/)
* class [RasterLayer](../)
* namespace [Aspose.Gis.Raster](../../rasterlayer/)
* assembly [Aspose.GIS](../../../)


