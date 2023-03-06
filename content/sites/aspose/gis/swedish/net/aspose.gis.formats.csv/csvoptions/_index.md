---
title: Class CsvOptions
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.Formats.Csv.CsvOptions klass. Drivrutinsspecifika alternativ för CSVformat.
type: docs
weight: 200
url: /sv/net/aspose.gis.formats.csv/csvoptions/
---
## CsvOptions class

Drivrutinsspecifika alternativ för CSV-format.

```csharp
public class CsvOptions : DriverOptions
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [CsvOptions](csvoptions/)() | Skapa ny instans. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Bestämmer om stänga en ostängdLinearRing i varje geometri. Standard till`false` . |
| [ColumnM](../../aspose.gis.formats.csv/csvoptions/columnm/) { get; set; } | Hämtar eller ställer in ett namn på kolumnen innehåller M-koordinatvärde. Standard är`null` . |
| [ColumnWkt](../../aspose.gis.formats.csv/csvoptions/columnwkt/) { get; set; } | Hämtar eller ställer in ett namn på kolumn som innehåller välkänd text för att representera geometri. Standard är`null` . |
| [ColumnX](../../aspose.gis.formats.csv/csvoptions/columnx/) { get; set; } | Hämtar eller ställer in ett namn på kolumn innehåller X-koordinatvärde. Standard är`null` . |
| [ColumnY](../../aspose.gis.formats.csv/csvoptions/columny/) { get; set; } | Hämtar eller ställer in ett namn på kolumn innehåller Y-koordinatvärde. Standard är`null` . |
| [ColumnZ](../../aspose.gis.formats.csv/csvoptions/columnz/) { get; set; } | Hämtar eller ställer in ett namn på kolumn som innehåller Z-koordinatvärde. Standard är`null` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Bestämmer om lägga till en ny punkt i mitten till varje segment av geometri. Standard till`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Bestämmer om radera nära punkter i varje geometri. Standard till`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Bestämmer avstånd för[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Standard till`0` . |
| [Delimiter](../../aspose.gis.formats.csv/csvoptions/delimiter/) { get; set; } | Hämtar eller ställer in ett tecken som används som avgränsare för separata värden. Standard är ','. |
| [DoubleQuoteEscape](../../aspose.gis.formats.csv/csvoptions/doublequoteescape/) { get; set; } | Hämtar eller ställer in ett tecken som används som escape-bokstav för dubbla citattecken. Standard är '"'. |
| [HasAttributeNames](../../aspose.gis.formats.csv/csvoptions/hasattributenames/) { get; set; } | Bestämmer om en rubrikrad med attributnamn finns. Standard är`true` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | En tolerans att använda för att linjärisera kurvgeometrier. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) som kommer att tillämpas på M coordinate när geometrier läggs till[`VectorLayer`](../../aspose.gis/vectorlayer/) eller när de läses från[`VectorLayer`](../../aspose.gis/vectorlayer/) . Standardvärdet är[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Bestämmer om raderingspunkter som ligger på samma segment i varje geometri. Standard till`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Bestämmer avstånd för[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Standard till`0` . |
| [StartLineNumber](../../aspose.gis.formats.csv/csvoptions/startlinenumber/) { get; set; } | Hämtar eller ställer in ett nollbaserat antal rader som kommer att vara först när data läses. Standard är 0. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Bestämmer om geometrier ska valideras när de läggs till i lagret. Om satt till`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) anropas för each geometri när den läggs till i lagret och om valideringen misslyckas ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) är`false` ),[`GisException`](../../aspose.gis/gisexception/) kastas. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Bestämmer om transformation av polygon eller multipolygon till linjesträng är tillåten. Standard till`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) som kommer att tillämpas på X- och Y-koordinater när geometrier läggs till[`VectorLayer`](../../aspose.gis/vectorlayer/) eller när de läses från[`VectorLayer`](../../aspose.gis/vectorlayer/) . Standardvärdet är[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) som kommer att tillämpas på Z coordinate när geometrier läggs till[`VectorLayer`](../../aspose.gis/vectorlayer/) eller när de läses från[`VectorLayer`](../../aspose.gis/vectorlayer/) . Standardvärdet är[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Se även

* class [DriverOptions](../../aspose.gis/driveroptions/)
* namnutrymme [Aspose.Gis.Formats.Csv](../../aspose.gis.formats.csv/)
* hopsättning [Aspose.GIS](../../)


