---
title: Class CsvOptions
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Formats.Csv.CsvOptions class. Driverspecific options for CSV format
type: docs
weight: 1700
url: /net/aspose.gis.formats.csv/csvoptions/
---
## CsvOptions class

Driver-specific options for CSV format.

```csharp
public class CsvOptions : DriverOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [CsvOptions](csvoptions/)() | Create new instance. |

## Properties

| Name | Description |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Determines if close a unclosed LinearRing in each geometry. Defaults to `false`. |
| [ColumnM](../../aspose.gis.formats.csv/csvoptions/columnm/) { get; set; } | Gets or sets a name of column contains M coordinate value. Default is `null`. |
| [ColumnWkt](../../aspose.gis.formats.csv/csvoptions/columnwkt/) { get; set; } | Gets or sets a name of column contains Well-Known Text for representing geometry. Default is `null`. |
| [ColumnX](../../aspose.gis.formats.csv/csvoptions/columnx/) { get; set; } | Gets or sets a name of column contains X coordinate value. Default is `null`. |
| [ColumnY](../../aspose.gis.formats.csv/csvoptions/columny/) { get; set; } | Gets or sets a name of column contains Y coordinate value. Default is `null`. |
| [ColumnZ](../../aspose.gis.formats.csv/csvoptions/columnz/) { get; set; } | Gets or sets a name of column contains Z coordinate value. Default is `null`. |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Determines if add a new point in the middle to each segment of geometry. Defaults to `false`. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Determines if delete near points in each geometry. Defaults to `false`. |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Determines distance for [`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/). Defaults to `0`. |
| [Delimiter](../../aspose.gis.formats.csv/csvoptions/delimiter/) { get; set; } | Gets or sets a character that is used as delimiter to separate values. Default is ','. |
| [DoubleQuoteEscape](../../aspose.gis.formats.csv/csvoptions/doublequoteescape/) { get; set; } | Gets or sets a character that is used as escape letter for double-quotes. Default is '"'. |
| [HasAttributeNames](../../aspose.gis.formats.csv/csvoptions/hasattributenames/) { get; set; } | Determines if a header row with attribute names exists. Default is `true`. |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | A tolerance to use to linearize curve geometries. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A [`PrecisionModel`](../../aspose.gis/precisionmodel/) that will be applied to M coordinate when geometries are added to the [`VectorLayer`](../../aspose.gis/vectorlayer/) or when they are read from the [`VectorLayer`](../../aspose.gis/vectorlayer/). The default value is [`Exact`](../../aspose.gis/precisionmodel/exact/). |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Determines if delete points lying on the same segment in each geometry. Defaults to `false`. |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Determines distance for [`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/). Defaults to `0`. |
| [StartLineNumber](../../aspose.gis.formats.csv/csvoptions/startlinenumber/) { get; set; } | Gets or sets a zero-based number of line that will be first when read the data. Default is 0. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Determines if geometries should be validated when they are added to the layer. If set to `true`, [`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) is called for each geometry when it's added to the layer, and if validation fails ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) is `false`), [`GisException`](../../aspose.gis/gisexception/) is thrown. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Determines if transformation of polygon or multipolygon to linestring is allowed. Defaults to `false`. |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A [`PrecisionModel`](../../aspose.gis/precisionmodel/) that will be applied to X and Y coordinates when geometries are added to the [`VectorLayer`](../../aspose.gis/vectorlayer/) or when they are read from the [`VectorLayer`](../../aspose.gis/vectorlayer/). The default value is [`Exact`](../../aspose.gis/precisionmodel/exact/). |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A [`PrecisionModel`](../../aspose.gis/precisionmodel/) that will be applied to Z coordinate when geometries are added to the [`VectorLayer`](../../aspose.gis/vectorlayer/) or when they are read from the [`VectorLayer`](../../aspose.gis/vectorlayer/). The default value is [`Exact`](../../aspose.gis/precisionmodel/exact/). |

### See Also

* class [DriverOptions](../../aspose.gis/driveroptions/)
* namespace [Aspose.Gis.Formats.Csv](../../aspose.gis.formats.csv/)
* assembly [Aspose.GIS](../../)


