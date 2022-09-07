---
title: GpxOptions
second_title: Riferimento API Aspose.GIS per .NET
description: Opzioni specifiche del driver per il formato GPX.
type: docs
weight: 320
url: /it/net/aspose.gis.formats.gpx/gpxoptions/
---
## GpxOptions class

Opzioni specifiche del driver per il formato GPX.

```csharp
public class GpxOptions : DriverOptions
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [GpxOptions](gpxoptions)() | Crea nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring) { get; set; } | Determina se chiudere un non chiusoLinearRing in ogni geometria. L'impostazione predefinita è`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints) { get; set; } | Determina se aggiungere un nuovo punto nel mezzo a ciascun segmento della geometria. L'impostazione predefinita è`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints) { get; set; } | Determina se eliminare i punti vicini in ciascuna geometria. L'impostazione predefinita è`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance) { get; set; } | Determina la distanza per[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints) . L'impostazione predefinita è`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance) { get; set; } | Una tolleranza da utilizzare per linearizzare le geometrie delle curve. |
| [MAttribute](../../aspose.gis.formats.gpx/gpxoptions/mattribute) { get; set; } | Determina quale attributo GPX verrà esportato come coordinata 'M' di waypoint, route point e track point. Il comportamento è lo stesso di[`ZAttribute`](./zattribute) , per impostazione predefinita`null` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) che verrà applicato a M coordinate quando le geometrie vengono aggiunte al file[`VectorLayer`](../../aspose.gis/vectorlayer) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [NestedAttributeSeparator](../../aspose.gis.formats.gpx/gpxoptions/nestedattributeseparator) { get; } | Una stringa per separare il nome dell'attributo nidificato ei relativi indici. Il valore predefinito è il doppio trattino basso "__". |
| [ReadNestedAttributes](../../aspose.gis.formats.gpx/gpxoptions/readnestedattributes) { get; set; } | Determina se i punti GPX, come 'trkpt' e 'rtept', contengono attributi interni e se devono essere letti. L'impostazione predefinita è`false` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments) { get; set; } | Determina se eliminare i punti che giacciono sullo stesso segmento in ciascuna geometria. L'impostazione predefinita è`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance) { get; set; } | Determina la distanza per[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments) . L'impostazione predefinita è`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite) { get; set; } | Determina se le geometrie devono essere convalidate quando vengono aggiunte al livello. Se impostato su`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid)viene chiamato per ogni geometria quando viene aggiunto al livello e se la convalida non riesce ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid) è`false` ),[`GisException`](../../aspose.gis/gisexception) viene lanciato. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines) { get; set; } | Determina se è consentita la trasformazione di poligono o multipoligono in stringa lineare. L'impostazione predefinita è`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel)che verrà applicato alle coordinate X e Y quando le geometrie vengono aggiunte al file[`VectorLayer`](../../aspose.gis/vectorlayer) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [ZAttribute](../../aspose.gis.formats.gpx/gpxoptions/zattribute) { get; set; } | Determina quale attributo GPX verrà esportato come coordinata 'Z' di waypoint, route point e track point. If`null` - nessun attributo verrà esportato come coordinata 'Z'. Il valore predefinito è "ele". I valori possibili sono i nomi di tutti gli attributi XML GPX che possono essere rappresentati come double (es. "speed", "magvar", "geoidheight" ecc. ) |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) che verrà applicato alla coordinata Z quando le geometrie vengono aggiunte al file[`VectorLayer`](../../aspose.gis/vectorlayer) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact) . |

### Guarda anche

* class [DriverOptions](../../aspose.gis/driveroptions)
* spazio dei nomi [Aspose.Gis.Formats.Gpx](../../aspose.gis.formats.gpx)
* assemblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
