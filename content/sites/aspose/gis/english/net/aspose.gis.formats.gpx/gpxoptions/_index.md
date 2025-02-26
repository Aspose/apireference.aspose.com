---
title: Class GpxOptions
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Formats.Gpx.GpxOptions class. Driverspecific options for GPX format
type: docs
weight: 1980
url: /net/aspose.gis.formats.gpx/gpxoptions/
---
## GpxOptions class

Driver-specific options for GPX format.

```csharp
public class GpxOptions : DriverOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [GpxOptions](gpxoptions/)() | Create new instance. |

## Properties

| Name | Description |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Determines if close a unclosed LinearRing in each geometry. Defaults to `false`. |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Determines if add a new point in the middle to each segment of geometry. Defaults to `false`. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Determines if delete near points in each geometry. Defaults to `false`. |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Determines distance for [`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/). Defaults to `0`. |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | A tolerance to use to linearize curve geometries. |
| [MAttribute](../../aspose.gis.formats.gpx/gpxoptions/mattribute/) { get; set; } | Determines which GPX attribute will be exported as 'M' coordinate of waypoints, route points and track points. Behavior is same with [`ZAttribute`](./zattribute/), defaults to `null`. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A [`PrecisionModel`](../../aspose.gis/precisionmodel/) that will be applied to M coordinate when geometries are added to the [`VectorLayer`](../../aspose.gis/vectorlayer/) or when they are read from the [`VectorLayer`](../../aspose.gis/vectorlayer/). The default value is [`Exact`](../../aspose.gis/precisionmodel/exact/). |
| [NestedAttributeSeparator](../../aspose.gis.formats.gpx/gpxoptions/nestedattributeseparator/) { get; } | A string to separate nested attribute name and its indexes. Defaults to double underscore "__". |
| [ReadNestedAttributes](../../aspose.gis.formats.gpx/gpxoptions/readnestedattributes/) { get; set; } | Determines if GPX points, such as 'trkpt' and 'rtept', contain inner attributes and if it should be read. Defaults to `false`. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Determines if delete points lying on the same segment in each geometry. Defaults to `false`. |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Determines distance for [`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/). Defaults to `0`. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Determines if geometries should be validated when they are added to the layer. If set to `true`, [`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) is called for each geometry when it's added to the layer, and if validation fails ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) is `false`), [`GisException`](../../aspose.gis/gisexception/) is thrown. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Determines if transformation of polygon or multipolygon to linestring is allowed. Defaults to `false`. |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A [`PrecisionModel`](../../aspose.gis/precisionmodel/) that will be applied to X and Y coordinates when geometries are added to the [`VectorLayer`](../../aspose.gis/vectorlayer/) or when they are read from the [`VectorLayer`](../../aspose.gis/vectorlayer/). The default value is [`Exact`](../../aspose.gis/precisionmodel/exact/). |
| [ZAttribute](../../aspose.gis.formats.gpx/gpxoptions/zattribute/) { get; set; } | Determines which GPX attribute will be exported as 'Z' coordinate of waypoints, route points and track points. If `null` - no attribute will be exported as 'Z' coordinate. Defaults to "ele". Possible values are names of all GPX XML attribute that can be represented as double (e.g. "speed", "magvar", "geoidheight" etc.) |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A [`PrecisionModel`](../../aspose.gis/precisionmodel/) that will be applied to Z coordinate when geometries are added to the [`VectorLayer`](../../aspose.gis/vectorlayer/) or when they are read from the [`VectorLayer`](../../aspose.gis/vectorlayer/). The default value is [`Exact`](../../aspose.gis/precisionmodel/exact/). |

### See Also

* class [DriverOptions](../../aspose.gis/driveroptions/)
* namespace [Aspose.Gis.Formats.Gpx](../../aspose.gis.formats.gpx/)
* assembly [Aspose.GIS](../../)


