---
title: Class MapInfoTabOptions
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Formats.MapInfoTab.MapInfoTabOptions classe. Opzioni specifiche del driver per il formato MapInfo Tab.
type: docs
weight: 610
url: /it/net/aspose.gis.formats.mapinfotab/mapinfotaboptions/
---
## MapInfoTabOptions class

Opzioni specifiche del driver per il formato MapInfo Tab.

```csharp
public class MapInfoTabOptions : DriverOptions
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [MapInfoTabOptions](mapinfotaboptions/)() | Crea nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [BlockSize](../../aspose.gis.formats.mapinfotab/mapinfotaboptions/blocksize/) { get; set; } | Dimensione del blocco per i file '*.map' (multipli di 512). Il valore predefinito è 16384. Valori validi: da 512 a 32256. |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Determina se chiudere un non chiusoLinearRing in ogni geometria. L'impostazione predefinita è`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Determina se aggiungere un nuovo punto nel mezzo a ciascun segmento della geometria. L'impostazione predefinita è`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Determina se eliminare i punti vicini in ciascuna geometria. L'impostazione predefinita è`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Determina la distanza per[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . L'impostazione predefinita è`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Una tolleranza da utilizzare per linearizzare le geometrie delle curve. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) che verrà applicato a M coordinate quando le geometrie vengono aggiunte a[`VectorLayer`](../../aspose.gis/vectorlayer/) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer/) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Determina se eliminare i punti che giacciono sullo stesso segmento in ciascuna geometria. L'impostazione predefinita è`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Determina la distanza per[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . L'impostazione predefinita è`0` . |
| [TextStringAttribute](../../aspose.gis.formats.mapinfotab/mapinfotaboptions/textstringattribute/) { get; set; } | Specifica il nome dell'attributo che rappresenta il testo dell'oggetto grafico 'Testo'. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Determina se le geometrie devono essere convalidate quando vengono aggiunte al layer. Se impostato su`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) viene chiamato per each geometria quando viene aggiunto al livello e se la convalida fallisce ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) È`false` ),[`GisException`](../../aspose.gis/gisexception/) viene lanciato. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Determina se è consentita la trasformazione di poligono o multipoligono in stringa lineare. L'impostazione predefinita è`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) che verrà applicato alle coordinate X e Y quando le geometrie vengono aggiunte a[`VectorLayer`](../../aspose.gis/vectorlayer/) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer/) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) che verrà applicato alla coordinata Z quando le geometrie vengono aggiunte a[`VectorLayer`](../../aspose.gis/vectorlayer/) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer/) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Guarda anche

* class [DriverOptions](../../aspose.gis/driveroptions/)
* spazio dei nomi [Aspose.Gis.Formats.MapInfoTab](../../aspose.gis.formats.mapinfotab/)
* assemblea [Aspose.GIS](../../)


