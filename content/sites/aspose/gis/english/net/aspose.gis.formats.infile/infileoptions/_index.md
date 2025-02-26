---
title: Class InFileOptions
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Formats.InFile.InFileOptions class. Driverspecific options for InFile layer
type: docs
weight: 2000
url: /net/aspose.gis.formats.infile/infileoptions/
---
## InFileOptions class

Driver-specific options for InFile layer.

```csharp
public class InFileOptions : DriverOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [InFileOptions](infileoptions/)() | Create new instance. |

## Properties

| Name | Description |
| --- | --- |
| [ArrayAsString](../../aspose.gis.formats.infile/infileoptions/arrayasstring/) { get; set; } | Whether to expose JSon arrays of strings, integers or reals as string. |
| [AttributesSkip](../../aspose.gis.formats.infile/infileoptions/attributesskip/) { get; set; } | controls translation of attributes: yes - skip all attributes |
| [AutoId](../../aspose.gis.formats.infile/infileoptions/autoid/) { get; set; } | Auto-generate ids |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Determines if close a unclosed LinearRing in each geometry. Defaults to `false`. |
| [CountOfFeatureInPart](../../aspose.gis.formats.infile/infileoptions/countoffeatureinpart/) { get; set; } | Max count of features in every part of the file |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Determines if add a new point in the middle to each segment of geometry. Defaults to `false`. |
| [DateAsString](../../aspose.gis.formats.infile/infileoptions/dateasstring/) { get; set; } | Whether to expose JSon date/time/date-time as string. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Determines if delete near points in each geometry. Defaults to `false`. |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Determines distance for [`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/). Defaults to `0`. |
| [GeometryAsCollection](../../aspose.gis.formats.infile/infileoptions/geometryascollection/) { get; set; } | control translation of geometries: yes - wrap geometries with GeometryCollection type |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | A tolerance to use to linearize curve geometries. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A [`PrecisionModel`](../../aspose.gis/precisionmodel/) that will be applied to M coordinate when geometries are added to the [`VectorLayer`](../../aspose.gis/vectorlayer/) or when they are read from the [`VectorLayer`](../../aspose.gis/vectorlayer/). The default value is [`Exact`](../../aspose.gis/precisionmodel/exact/). |
| [NestedPropertiesSeparator](../../aspose.gis.formats.infile/infileoptions/nestedpropertiesseparator/) { get; set; } | Gets or sets a string that is used to separate components of nested attributes. Default is "_". |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Determines if delete points lying on the same segment in each geometry. Defaults to `false`. |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Determines distance for [`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/). Defaults to `0`. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Determines if geometries should be validated when they are added to the layer. If set to `true`, [`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) is called for each geometry when it's added to the layer, and if validation fails ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) is `false`), [`GisException`](../../aspose.gis/gisexception/) is thrown. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Determines if transformation of polygon or multipolygon to linestring is allowed. Defaults to `false`. |
| [WriteUnsetAttribute](../../aspose.gis.formats.infile/infileoptions/writeunsetattribute/) { get; set; } | Whether to write unset attributes by adding 'null' value |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A [`PrecisionModel`](../../aspose.gis/precisionmodel/) that will be applied to X and Y coordinates when geometries are added to the [`VectorLayer`](../../aspose.gis/vectorlayer/) or when they are read from the [`VectorLayer`](../../aspose.gis/vectorlayer/). The default value is [`Exact`](../../aspose.gis/precisionmodel/exact/). |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A [`PrecisionModel`](../../aspose.gis/precisionmodel/) that will be applied to Z coordinate when geometries are added to the [`VectorLayer`](../../aspose.gis/vectorlayer/) or when they are read from the [`VectorLayer`](../../aspose.gis/vectorlayer/). The default value is [`Exact`](../../aspose.gis/precisionmodel/exact/). |

### See Also

* class [DriverOptions](../../aspose.gis/driveroptions/)
* namespace [Aspose.Gis.Formats.InFile](../../aspose.gis.formats.infile/)
* assembly [Aspose.GIS](../../)


