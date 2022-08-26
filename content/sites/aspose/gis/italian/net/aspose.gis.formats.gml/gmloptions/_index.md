---
title: GmlOptions
second_title: Riferimento API Aspose.GIS per .NET
description: Opzioni specifiche del driver per il formato GML.
type: docs
weight: 300
url: /it/net/aspose.gis.formats.gml/gmloptions/
---
## GmlOptions class

Opzioni specifiche del driver per il formato GML.

```csharp
public class GmlOptions : DriverOptions
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [GmlOptions](gmloptions)() | Crea nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring) { get; set; } | Determina se chiudere un non chiusoLinearRing in ogni geometria. L'impostazione predefinita è`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints) { get; set; } | Determina se aggiungere un nuovo punto nel mezzo a ciascun segmento della geometria. L'impostazione predefinita è`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints) { get; set; } | Determina se eliminare i punti vicini in ciascuna geometria. L'impostazione predefinita è`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance) { get; set; } | Determina la distanza per[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints) . L'impostazione predefinita è`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance) { get; set; } | Una tolleranza da utilizzare per linearizzare le geometrie delle curve. |
| [LoadSchemasFromInternet](../../aspose.gis.formats.gml/gmloptions/loadschemasfrominternet) { get; set; } | Determina se Aspose.GIS può caricare lo schema XML da Internet. Se impostato su`false` , gli schemi con URI assoluti che non iniziano con 'file://' non verrebbero caricati. L'impostazione predefinita è`false` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) che verrà applicato a M coordinate quando le geometrie vengono aggiunte al file[`VectorLayer`](../../aspose.gis/vectorlayer) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.gml/gmloptions/nestedpropertiesseparator) { get; set; } | Ottiene o imposta una stringa utilizzata per separare i componenti degli attributi nidificati. Il valore predefinito è "_". |
| [RestoreSchema](../../aspose.gis.formats.gml/gmloptions/restoreschema) { get; set; } | Determina se Aspose.GIS può analizzare gli attributi in un file Gml in cui uno schema XML manca o non può essere caricato. Se impostato su`true` , il lettore Aspose.GIS non richiede la presenza di uno schema XML. Il valore predefinito è`false` . |
| [SchemaLocation](../../aspose.gis.formats.gml/gmloptions/schemalocation) { get; set; } | Elenco separato da spazi di coppie di URI. Il primo URI in ogni coppia è un URI dello spazio dei nomi, il secondo URI è un percorso dello schema XML dello spazio dei nomi. Se impostato su`null` ,[`GmlDriver`](../gmldriver) proverà a leggere schemaLocation dall'elemento radice del documento. Il valore predefinito è`null` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments) { get; set; } | Determina se eliminare i punti che giacciono sullo stesso segmento in ciascuna geometria. L'impostazione predefinita è`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance) { get; set; } | Determina la distanza per[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments) . L'impostazione predefinita è`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite) { get; set; } | Determina se le geometrie devono essere convalidate quando vengono aggiunte al livello. Se impostato su`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid)viene chiamato per ogni geometria quando viene aggiunto al livello e se la convalida non riesce ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid) è`false` ),[`GisException`](../../aspose.gis/gisexception) viene lanciato. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines) { get; set; } | Determina se è consentita la trasformazione di poligono o multipoligono in stringa lineare. L'impostazione predefinita è`false` . |
| [XmlResolver](../../aspose.gis.formats.gml/gmloptions/xmlresolver) { get; set; } | A[`XmlResolver`](./xmlresolver) utilizzato per risolvere risorse esterne. L'impostazione predefinita èXmlUrlResolver . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel)che verrà applicato alle coordinate X e Y quando le geometrie vengono aggiunte al file[`VectorLayer`](../../aspose.gis/vectorlayer) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) che verrà applicato alla coordinata Z quando le geometrie vengono aggiunte al file[`VectorLayer`](../../aspose.gis/vectorlayer) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact) . |

### Guarda anche

* class [DriverOptions](../../aspose.gis/driveroptions)
* spazio dei nomi [Aspose.Gis.Formats.Gml](../../aspose.gis.formats.gml)
* assemblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
