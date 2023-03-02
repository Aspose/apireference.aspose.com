---
title: Class SqlServerOptions
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Formats.SqlServer.SqlServerOptions classe. Opzioni specifiche del driver per il formato SqlServer. Al momento il driver non fornisce opzioni personalizzabili.
type: docs
weight: 690
url: /it/net/aspose.gis.formats.sqlserver/sqlserveroptions/
---
## SqlServerOptions class

Opzioni specifiche del driver per il formato SqlServer. Al momento, il driver non fornisce opzioni personalizzabili.

```csharp
public class SqlServerOptions : DatabaseDriverOptions
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [SqlServerOptions](sqlserveroptions/)() | Crea nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Determina se chiudere un non chiusoLinearRing in ogni geometria. L'impostazione predefinita è`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Determina se aggiungere un nuovo punto nel mezzo a ciascun segmento della geometria. L'impostazione predefinita è`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Determina se eliminare i punti vicini in ciascuna geometria. L'impostazione predefinita è`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Determina la distanza per[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . L'impostazione predefinita è`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Una tolleranza da utilizzare per linearizzare le geometrie delle curve. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) che verrà applicato a M coordinate quando le geometrie vengono aggiunte a[`VectorLayer`](../../aspose.gis/vectorlayer/) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer/) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Determina se eliminare i punti che giacciono sullo stesso segmento in ciascuna geometria. L'impostazione predefinita è`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Determina la distanza per[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . L'impostazione predefinita è`0` . |
| [SpatialReferenceSystemMode](../../aspose.gis/databasedriveroptions/spatialreferencesystemmode/) { get; set; } | Determina come deve essere gestito l'SRS delle geometrie sconosciute per il database quando vengono aggiunte al layer. Il valore predefinito èThrowException . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Determina se le geometrie devono essere convalidate quando vengono aggiunte al layer. Se impostato su`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) viene chiamato per each geometria quando viene aggiunto al livello e se la convalida fallisce ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) È`false` ),[`GisException`](../../aspose.gis/gisexception/) viene lanciato. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Determina se è consentita la trasformazione di poligono o multipoligono in stringa lineare. L'impostazione predefinita è`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) che verrà applicato alle coordinate X e Y quando le geometrie vengono aggiunte a[`VectorLayer`](../../aspose.gis/vectorlayer/) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer/) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) che verrà applicato alla coordinata Z quando le geometrie vengono aggiunte a[`VectorLayer`](../../aspose.gis/vectorlayer/) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer/) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Guarda anche

* class [DatabaseDriverOptions](../../aspose.gis/databasedriveroptions/)
* spazio dei nomi [Aspose.Gis.Formats.SqlServer](../../aspose.gis.formats.sqlserver/)
* assemblea [Aspose.GIS](../../)


