---
title: Class RasterDriverOptions
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.RasterDriverOptions class. Options for a RasterDriver
type: docs
weight: 3910
url: /net/aspose.gis/rasterdriveroptions/
---
## RasterDriverOptions class

Options for a [`RasterDriver`](../rasterdriver/).

```csharp
public abstract class RasterDriverOptions : DriverOptions
```

## Properties

| Name | Description |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Determines if close a unclosed LinearRing in each geometry. Defaults to `false`. |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Determines if add a new point in the middle to each segment of geometry. Defaults to `false`. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Determines if delete near points in each geometry. Defaults to `false`. |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Determines distance for [`DeleteNearPoints`](../driveroptions/deletenearpoints/). Defaults to `0`. |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | A tolerance to use to linearize curve geometries. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A [`PrecisionModel`](../precisionmodel/) that will be applied to M coordinate when geometries are added to the [`VectorLayer`](../vectorlayer/) or when they are read from the [`VectorLayer`](../vectorlayer/). The default value is [`Exact`](../precisionmodel/exact/). |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Determines if delete points lying on the same segment in each geometry. Defaults to `false`. |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Determines distance for [`SimplifySegments`](../driveroptions/simplifysegments/). Defaults to `0`. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Determines if geometries should be validated when they are added to the layer. If set to `true`, [`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) is called for each geometry when it's added to the layer, and if validation fails ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) is `false`), [`GisException`](../gisexception/) is thrown. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Determines if transformation of polygon or multipolygon to linestring is allowed. Defaults to `false`. |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A [`PrecisionModel`](../precisionmodel/) that will be applied to X and Y coordinates when geometries are added to the [`VectorLayer`](../vectorlayer/) or when they are read from the [`VectorLayer`](../vectorlayer/). The default value is [`Exact`](../precisionmodel/exact/). |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A [`PrecisionModel`](../precisionmodel/) that will be applied to Z coordinate when geometries are added to the [`VectorLayer`](../vectorlayer/) or when they are read from the [`VectorLayer`](../vectorlayer/). The default value is [`Exact`](../precisionmodel/exact/). |

### See Also

* class [DriverOptions](../driveroptions/)
* namespace [Aspose.Gis](../../aspose.gis/)
* assembly [Aspose.GIS](../../)


