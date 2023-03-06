---
title: Class CsvOptions
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.Formats.Csv.CsvOptions klas. Driverspecifieke opties voor CSVindeling.
type: docs
weight: 200
url: /nl/net/aspose.gis.formats.csv/csvoptions/
---
## CsvOptions class

Driverspecifieke opties voor CSV-indeling.

```csharp
public class CsvOptions : DriverOptions
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [CsvOptions](csvoptions/)() | Nieuwe instantie maken. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Bepaalt of een niet geslotenLinearRing in elke geometrie. Standaard naar`false` . |
| [ColumnM](../../aspose.gis.formats.csv/csvoptions/columnm/) { get; set; } | Haalt of stelt een kolomnaam in die M-coördinaatwaarde bevat. Standaard is`null` . |
| [ColumnWkt](../../aspose.gis.formats.csv/csvoptions/columnwkt/) { get; set; } | Haalt of stelt een kolomnaam in bevat bekende tekst voor het weergeven van geometrie. Standaard is`null` . |
| [ColumnX](../../aspose.gis.formats.csv/csvoptions/columnx/) { get; set; } | Haalt of stelt een kolomnaam in die X-coördinaatwaarde bevat. Standaard is`null` . |
| [ColumnY](../../aspose.gis.formats.csv/csvoptions/columny/) { get; set; } | Haalt of stelt een kolomnaam in die Y-coördinaatwaarde bevat. Standaard is`null` . |
| [ColumnZ](../../aspose.gis.formats.csv/csvoptions/columnz/) { get; set; } | Haalt of stelt een kolomnaam in die Z-coördinaatwaarde bevat. Standaard is`null` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Bepaalt of een nieuw punt in het midden wordt toegevoegd aan elk geometriesegment. Standaard naar`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Bepaalt of nabije punten in elke geometrie moeten worden verwijderd. Standaard naar`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Bepaalt de afstand voor[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Standaard naar`0` . |
| [Delimiter](../../aspose.gis.formats.csv/csvoptions/delimiter/) { get; set; } | Hiermee wordt een teken opgehaald of ingesteld dat wordt gebruikt als scheidingsteken om waarden te scheiden. Standaard is ','. |
| [DoubleQuoteEscape](../../aspose.gis.formats.csv/csvoptions/doublequoteescape/) { get; set; } | Hiermee wordt een teken opgehaald of ingesteld dat wordt gebruikt als ontsnappingsletter voor dubbele aanhalingstekens. Standaard is '"'. |
| [HasAttributeNames](../../aspose.gis.formats.csv/csvoptions/hasattributenames/) { get; set; } | Bepaalt of er een veldnamenrij met attribuutnamen bestaat. Standaard is`true` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Een tolerantie om te gebruiken om krommegeometrieën te lineariseren. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | EEN[`PrecisionModel`](../../aspose.gis/precisionmodel/) die zal worden toegepast op M coordinate wanneer geometrieën worden toegevoegd aan de[`VectorLayer`](../../aspose.gis/vectorlayer/) of wanneer ze worden voorgelezen uit de[`VectorLayer`](../../aspose.gis/vectorlayer/) . De standaardwaarde is[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Bepaalt of verwijder punten die op hetzelfde segment in elke geometrie liggen. Standaard naar`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Bepaalt de afstand voor[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Standaard naar`0` . |
| [StartLineNumber](../../aspose.gis.formats.csv/csvoptions/startlinenumber/) { get; set; } | Haalt of stelt een op nul gebaseerd regelnummer in dat als eerste wordt gebruikt wanneer de gegevens worden gelezen. Standaard is 0. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Bepaalt of geometrieën moeten worden gevalideerd wanneer ze aan de laag worden toegevoegd. Indien ingesteld op`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) wordt aangeroepen voor elke geometrie wanneer deze wordt toegevoegd aan de laag en als de validatie mislukt ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) is`false` ),[`GisException`](../../aspose.gis/gisexception/) wordt gegooid. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Bepaalt of transformatie van polygoon of multipolygoon naar lijnstring is toegestaan. Standaard naar`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | EEN[`PrecisionModel`](../../aspose.gis/precisionmodel/) die zal worden toegepast op X- en Y-coördinaten wanneer geometrieën worden toegevoegd aan de[`VectorLayer`](../../aspose.gis/vectorlayer/) of wanneer ze worden voorgelezen uit de[`VectorLayer`](../../aspose.gis/vectorlayer/) . De standaardwaarde is[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | EEN[`PrecisionModel`](../../aspose.gis/precisionmodel/) die zal worden toegepast op Z coordinate wanneer geometrieën worden toegevoegd aan de[`VectorLayer`](../../aspose.gis/vectorlayer/) of wanneer ze worden voorgelezen uit de[`VectorLayer`](../../aspose.gis/vectorlayer/) . De standaardwaarde is[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Zie ook

* class [DriverOptions](../../aspose.gis/driveroptions/)
* naamruimte [Aspose.Gis.Formats.Csv](../../aspose.gis.formats.csv/)
* montage [Aspose.GIS](../../)


