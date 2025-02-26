---
title: Class OsmXmlOptions
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Formats.OsmXml.OsmXmlOptions class. Driverspecific options for OSM XML format
type: docs
weight: 2270
url: /net/aspose.gis.formats.osmxml/osmxmloptions/
---
## OsmXmlOptions class

Driver-specific options for OSM XML format.

```csharp
public class OsmXmlOptions : DriverOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [OsmXmlOptions](osmxmloptions/)() | Create new instance. |

## Properties

| Name | Description |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Determines if close a unclosed LinearRing in each geometry. Defaults to `false`. |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Determines if add a new point in the middle to each segment of geometry. Defaults to `false`. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Determines if delete near points in each geometry. Defaults to `false`. |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Determines distance for [`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/). Defaults to `0`. |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | A tolerance to use to linearize curve geometries. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A [`PrecisionModel`](../../aspose.gis/precisionmodel/) that will be applied to M coordinate when geometries are added to the [`VectorLayer`](../../aspose.gis/vectorlayer/) or when they are read from the [`VectorLayer`](../../aspose.gis/vectorlayer/). The default value is [`Exact`](../../aspose.gis/precisionmodel/exact/). |
| [ReportAllNodes](../../aspose.gis.formats.osmxml/osmxmloptions/reportallnodes/) { get; set; } | Report all nodes as features, even if they don't have any significant tags. |
| [ReportAllWays](../../aspose.gis.formats.osmxml/osmxmloptions/reportallways/) { get; set; } | Report all ways as features, even if they don't have any significant tags or don't have any nodes. |
| [ReportCommonAttributes](../../aspose.gis.formats.osmxml/osmxmloptions/reportcommonattributes/) { get; set; } | Report common OSM attributes: visible, version, changeset, timestamp, user and uid. Common attributes will be reported as feature attributes with "osm_" prefix, e.g. osm_user, osm_timestamp, etc. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Determines if delete points lying on the same segment in each geometry. Defaults to `false`. |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Determines distance for [`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/). Defaults to `0`. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Determines if geometries should be validated when they are added to the layer. If set to `true`, [`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) is called for each geometry when it's added to the layer, and if validation fails ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) is `false`), [`GisException`](../../aspose.gis/gisexception/) is thrown. |
| [WriteCommonAttributes](../../aspose.gis.formats.osmxml/osmxmloptions/writecommonattributes/) { get; set; } | Write common OSM attributes: visible, version, changeset, timestamp, user and uid. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Determines if transformation of polygon or multipolygon to linestring is allowed. Defaults to `false`. |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A [`PrecisionModel`](../../aspose.gis/precisionmodel/) that will be applied to X and Y coordinates when geometries are added to the [`VectorLayer`](../../aspose.gis/vectorlayer/) or when they are read from the [`VectorLayer`](../../aspose.gis/vectorlayer/). The default value is [`Exact`](../../aspose.gis/precisionmodel/exact/). |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A [`PrecisionModel`](../../aspose.gis/precisionmodel/) that will be applied to Z coordinate when geometries are added to the [`VectorLayer`](../../aspose.gis/vectorlayer/) or when they are read from the [`VectorLayer`](../../aspose.gis/vectorlayer/). The default value is [`Exact`](../../aspose.gis/precisionmodel/exact/). |

### See Also

* class [DriverOptions](../../aspose.gis/driveroptions/)
* namespace [Aspose.Gis.Formats.OsmXml](../../aspose.gis.formats.osmxml/)
* assembly [Aspose.GIS](../../)


