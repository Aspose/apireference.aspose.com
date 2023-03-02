---
title: Class FileGdbOptions
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.Formats.FileGdb.FileGdbOptions klass. Drivrutinsspecifika alternativ för FileGDBformat.
type: docs
weight: 270
url: /sv/net/aspose.gis.formats.filegdb/filegdboptions/
---
## FileGdbOptions class

Drivrutinsspecifika alternativ för FileGDB-format.

```csharp
public sealed class FileGdbOptions : DriverOptions
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [FileGdbOptions](filegdboptions/)() | Skapa ny instans. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Bestämmer om stänga en ostängdLinearRing i varje geometri. Standard till`false` . |
| [CoordinatePrecisionGrid](../../aspose.gis.formats.filegdb/filegdboptions/coordinateprecisiongrid/) { get; set; } | Ett koordinatprecisionsnät att använda i nytt lager. |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Bestämmer om lägga till en ny punkt i mitten till varje segment av geometri. Standard till`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Bestämmer om radera nära punkter i varje geometri. Standard till`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Bestämmer avstånd för[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Standard till`0` . |
| [EnsureValidCoordinatesRange](../../aspose.gis.formats.filegdb/filegdboptions/ensurevalidcoordinatesrange/) { get; set; } | Om koordinaterna ska vara inom giltigt område. |
| [GeometryFieldName](../../aspose.gis.formats.filegdb/filegdboptions/geometryfieldname/) { get; set; } | Namn på geometrifältet. |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | En tolerans att använda för att linjärisera kurvgeometrier. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) som kommer att tillämpas på M coordinate när geometrier läggs till[`VectorLayer`](../../aspose.gis/vectorlayer/) eller när de läses från[`VectorLayer`](../../aspose.gis/vectorlayer/) . Standardvärdet är[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [MTolerance](../../aspose.gis.formats.filegdb/filegdboptions/mtolerance/) { get; set; } | M snäpptolerans. |
| [ObjectIdFieldName](../../aspose.gis.formats.filegdb/filegdboptions/objectidfieldname/) { get; set; } | Namn på objekt-ID-fältet. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Bestämmer om raderingspunkter som ligger på samma segment i varje geometri. Standard till`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Bestämmer avstånd för[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Standard till`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Bestämmer om geometrier ska valideras när de läggs till i lagret. Om satt till`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) anropas för each geometri när den läggs till i lagret och om valideringen misslyckas ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) är`false` ),[`GisException`](../../aspose.gis/gisexception/) kastas. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Bestämmer om transformation av polygon eller multipolygon till linjesträng är tillåten. Standard till`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) som kommer att tillämpas på X- och Y-koordinater när geometrier läggs till[`VectorLayer`](../../aspose.gis/vectorlayer/) eller när de läses från[`VectorLayer`](../../aspose.gis/vectorlayer/) . Standardvärdet är[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [XYTolerance](../../aspose.gis.formats.filegdb/filegdboptions/xytolerance/) { get; set; } | X- och Y-snäpptolerans. |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) som kommer att tillämpas på Z coordinate när geometrier läggs till[`VectorLayer`](../../aspose.gis/vectorlayer/) eller när de läses från[`VectorLayer`](../../aspose.gis/vectorlayer/) . Standardvärdet är[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZTolerance](../../aspose.gis.formats.filegdb/filegdboptions/ztolerance/) { get; set; } | Z snäpptolerans. |

### Se även

* class [DriverOptions](../../aspose.gis/driveroptions/)
* namnutrymme [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* hopsättning [Aspose.GIS](../../)


