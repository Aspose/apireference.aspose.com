---
title: FileGdbOptions
second_title: Riferimento API Aspose.GIS per .NET
description: Opzioni specifiche del driver per il formato FileGDB.
type: docs
weight: 240
url: /it/net/aspose.gis.formats.filegdb/filegdboptions/
---
## FileGdbOptions class

Opzioni specifiche del driver per il formato FileGDB.

```csharp
public sealed class FileGdbOptions : DriverOptions
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [FileGdbOptions](filegdboptions)() | Crea nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring) { get; set; } | Determina se chiudere un non chiusoLinearRing in ogni geometria. L'impostazione predefinita è`false` . |
| [CoordinatePrecisionGrid](../../aspose.gis.formats.filegdb/filegdboptions/coordinateprecisiongrid) { get; set; } | Una griglia di precisione delle coordinate da utilizzare nel nuovo livello. |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints) { get; set; } | Determina se aggiungere un nuovo punto nel mezzo a ciascun segmento della geometria. L'impostazione predefinita è`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints) { get; set; } | Determina se eliminare i punti vicini in ciascuna geometria. L'impostazione predefinita è`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance) { get; set; } | Determina la distanza per[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints) . L'impostazione predefinita è`0` . |
| [EnsureValidCoordinatesRange](../../aspose.gis.formats.filegdb/filegdboptions/ensurevalidcoordinatesrange) { get; set; } | Indica se le coordinate devono essere comprese nell'intervallo valido. |
| [GeometryFieldName](../../aspose.gis.formats.filegdb/filegdboptions/geometryfieldname) { get; set; } | Nome del campo della geometria. |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance) { get; set; } | Una tolleranza da utilizzare per linearizzare le geometrie delle curve. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) che verrà applicato a M coordinate quando le geometrie vengono aggiunte al file[`VectorLayer`](../../aspose.gis/vectorlayer) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [MTolerance](../../aspose.gis.formats.filegdb/filegdboptions/mtolerance) { get; set; } | Tolleranza snap M. |
| [ObjectIdFieldName](../../aspose.gis.formats.filegdb/filegdboptions/objectidfieldname) { get; set; } | Nome del campo ID oggetto. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments) { get; set; } | Determina se eliminare i punti che giacciono sullo stesso segmento in ciascuna geometria. L'impostazione predefinita è`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance) { get; set; } | Determina la distanza per[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments) . L'impostazione predefinita è`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite) { get; set; } | Determina se le geometrie devono essere convalidate quando vengono aggiunte al livello. Se impostato su`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid)viene chiamato per ogni geometria quando viene aggiunto al livello e se la convalida non riesce ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid) è`false` ),[`GisException`](../../aspose.gis/gisexception) viene lanciato. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines) { get; set; } | Determina se è consentita la trasformazione di poligono o multipoligono in stringa lineare. L'impostazione predefinita è`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel)che verrà applicato alle coordinate X e Y quando le geometrie vengono aggiunte al file[`VectorLayer`](../../aspose.gis/vectorlayer) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [XYTolerance](../../aspose.gis.formats.filegdb/filegdboptions/xytolerance) { get; set; } | Tolleranza snap X e Y. |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) che verrà applicato alla coordinata Z quando le geometrie vengono aggiunte al file[`VectorLayer`](../../aspose.gis/vectorlayer) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [ZTolerance](../../aspose.gis.formats.filegdb/filegdboptions/ztolerance) { get; set; } | Tolleranza snap Z. |

### Guarda anche

* class [DriverOptions](../../aspose.gis/driveroptions)
* spazio dei nomi [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb)
* assemblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
