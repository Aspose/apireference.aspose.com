---
title: CsvOptions
second_title: Riferimento API Aspose.GIS per .NET
description: Opzioni specifiche del driver per il formato CSV.
type: docs
weight: 190
url: /it/net/aspose.gis.formats.csv/csvoptions/
---
## CsvOptions class

Opzioni specifiche del driver per il formato CSV.

```csharp
public class CsvOptions : DriverOptions
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [CsvOptions](csvoptions)() | Crea nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring) { get; set; } | Determina se chiudere un non chiusoLinearRing in ogni geometria. L'impostazione predefinita è`false` . |
| [ColumnM](../../aspose.gis.formats.csv/csvoptions/columnm) { get; set; } | Ottiene o imposta un nome di colonna contenente il valore della coordinata M. Il valore predefinito è`null` . |
| [ColumnWkt](../../aspose.gis.formats.csv/csvoptions/columnwkt) { get; set; } | Ottiene o imposta un nome di colonna contenente testo noto per rappresentare la geometria. L'impostazione predefinita è`null` . |
| [ColumnX](../../aspose.gis.formats.csv/csvoptions/columnx) { get; set; } | Ottiene o imposta un nome di colonna contenente il valore della coordinata X. Il valore predefinito è`null` . |
| [ColumnY](../../aspose.gis.formats.csv/csvoptions/columny) { get; set; } | Ottiene o imposta un nome di colonna contenente il valore della coordinata Y. Il valore predefinito è`null` . |
| [ColumnZ](../../aspose.gis.formats.csv/csvoptions/columnz) { get; set; } | Ottiene o imposta un nome di colonna contenente il valore della coordinata Z. Il valore predefinito è`null` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints) { get; set; } | Determina se aggiungere un nuovo punto nel mezzo a ciascun segmento della geometria. L'impostazione predefinita è`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints) { get; set; } | Determina se eliminare i punti vicini in ciascuna geometria. L'impostazione predefinita è`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance) { get; set; } | Determina la distanza per[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints) . L'impostazione predefinita è`0` . |
| [Delimiter](../../aspose.gis.formats.csv/csvoptions/delimiter) { get; set; } | Ottiene o imposta un carattere che viene utilizzato come delimitatore per separare i valori. Il valore predefinito è ','. |
| [DoubleQuoteEscape](../../aspose.gis.formats.csv/csvoptions/doublequoteescape) { get; set; } | Ottiene o imposta un carattere utilizzato come lettera di escape per le virgolette doppie. Il valore predefinito è '"'. |
| [HasAttributeNames](../../aspose.gis.formats.csv/csvoptions/hasattributenames) { get; set; } | Determina se esiste una riga di intestazione con nomi di attributo. L'impostazione predefinita è`true` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance) { get; set; } | Una tolleranza da utilizzare per linearizzare le geometrie delle curve. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) che verrà applicato a M coordinate quando le geometrie vengono aggiunte al file[`VectorLayer`](../../aspose.gis/vectorlayer) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments) { get; set; } | Determina se eliminare i punti che giacciono sullo stesso segmento in ciascuna geometria. L'impostazione predefinita è`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance) { get; set; } | Determina la distanza per[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments) . L'impostazione predefinita è`0` . |
| [StartLineNumber](../../aspose.gis.formats.csv/csvoptions/startlinenumber) { get; set; } | Ottiene o imposta un numero di riga in base zero che sarà la prima alla lettura dei dati. Il valore predefinito è 0. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite) { get; set; } | Determina se le geometrie devono essere convalidate quando vengono aggiunte al livello. Se impostato su`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid)viene chiamato per ogni geometria quando viene aggiunto al livello e se la convalida non riesce ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid) è`false` ),[`GisException`](../../aspose.gis/gisexception) viene lanciato. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines) { get; set; } | Determina se è consentita la trasformazione di poligono o multipoligono in stringa lineare. L'impostazione predefinita è`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel)che verrà applicato alle coordinate X e Y quando le geometrie vengono aggiunte al file[`VectorLayer`](../../aspose.gis/vectorlayer) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) che verrà applicato alla coordinata Z quando le geometrie vengono aggiunte al file[`VectorLayer`](../../aspose.gis/vectorlayer) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact) . |

### Guarda anche

* class [DriverOptions](../../aspose.gis/driveroptions)
* spazio dei nomi [Aspose.Gis.Formats.Csv](../../aspose.gis.formats.csv)
* assemblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
