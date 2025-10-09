---
title: Class FileGdbOptions
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Formats.FileGdb.FileGdbOptions class. Driverspecific options for FileGDB format
type: docs
weight: 1860
url: /net/aspose.gis.formats.filegdb/filegdboptions/
---
## FileGdbOptions class

Driver-specific options for FileGDB format.

```csharp
public sealed class FileGdbOptions : DriverOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [FileGdbOptions](filegdboptions/)() | Create new instance. |

## Properties

| Name | Description |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Determines if close a unclosed LinearRing in each geometry. Defaults to `false`. |
| [CoordinatePrecisionGrid](../../aspose.gis.formats.filegdb/filegdboptions/coordinateprecisiongrid/) { get; set; } | A coordinate precision grid to use in new layer. |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Determines if add a new point in the middle to each segment of geometry. Defaults to `false`. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Determines if delete near points in each geometry. Defaults to `false`. |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Determines distance for [`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/). Defaults to `0`. |
| [EnsureValidCoordinatesRange](../../aspose.gis.formats.filegdb/filegdboptions/ensurevalidcoordinatesrange/) { get; set; } | Whether coordinates should be in valid range. |
| [ExpectedGeometryType](../../aspose.gis.formats.filegdb/filegdboptions/expectedgeometrytype/) { get; set; } | Expected geometry type for layer. If this option is set then we allow adding only geometries with this type |
| [GeometryFieldName](../../aspose.gis.formats.filegdb/filegdboptions/geometryfieldname/) { get; set; } | Name of the geometry field. |
| [HasM](../../aspose.gis.formats.filegdb/filegdboptions/hasm/) { get; set; } | Can geometries of layer have 'm' coordinate. By defualt is true |
| [HasZ](../../aspose.gis.formats.filegdb/filegdboptions/hasz/) { get; set; } | Can geometries of layer have 'z' coordinate. By defualt is true |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | A tolerance to use to linearize curve geometries. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A [`PrecisionModel`](../../aspose.gis/precisionmodel/) that will be applied to M coordinate when geometries are added to the [`VectorLayer`](../../aspose.gis/vectorlayer/) or when they are read from the [`VectorLayer`](../../aspose.gis/vectorlayer/). The default value is [`Exact`](../../aspose.gis/precisionmodel/exact/). |
| [MTolerance](../../aspose.gis.formats.filegdb/filegdboptions/mtolerance/) { get; set; } | M snapping tolerance. |
| [ObjectIdFieldName](../../aspose.gis.formats.filegdb/filegdboptions/objectidfieldname/) { get; set; } | Name of the object ID field. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Determines if delete points lying on the same segment in each geometry. Defaults to `false`. |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Determines distance for [`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/). Defaults to `0`. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Determines if geometries should be validated when they are added to the layer. If set to `true`, [`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) is called for each geometry when it's added to the layer, and if validation fails ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) is `false`), [`GisException`](../../aspose.gis/gisexception/) is thrown. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Determines if transformation of polygon or multipolygon to linestring is allowed. Defaults to `false`. |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A [`PrecisionModel`](../../aspose.gis/precisionmodel/) that will be applied to X and Y coordinates when geometries are added to the [`VectorLayer`](../../aspose.gis/vectorlayer/) or when they are read from the [`VectorLayer`](../../aspose.gis/vectorlayer/). The default value is [`Exact`](../../aspose.gis/precisionmodel/exact/). |
| [XYTolerance](../../aspose.gis.formats.filegdb/filegdboptions/xytolerance/) { get; set; } | X and Y snapping tolerance. |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A [`PrecisionModel`](../../aspose.gis/precisionmodel/) that will be applied to Z coordinate when geometries are added to the [`VectorLayer`](../../aspose.gis/vectorlayer/) or when they are read from the [`VectorLayer`](../../aspose.gis/vectorlayer/). The default value is [`Exact`](../../aspose.gis/precisionmodel/exact/). |
| [ZTolerance](../../aspose.gis.formats.filegdb/filegdboptions/ztolerance/) { get; set; } | Z snapping tolerance. |

### See Also

* class [DriverOptions](../../aspose.gis/driveroptions/)
* namespace [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* assembly [Aspose.GIS](../../)


