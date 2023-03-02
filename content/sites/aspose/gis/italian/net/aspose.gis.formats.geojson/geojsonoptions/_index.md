---
title: Class GeoJsonOptions
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Formats.GeoJson.GeoJsonOptions classe. Opzioni specifiche del driver per il formato GeoJSON.
type: docs
weight: 310
url: /it/net/aspose.gis.formats.geojson/geojsonoptions/
---
## GeoJsonOptions class

Opzioni specifiche del driver per il formato GeoJSON.

```csharp
public class GeoJsonOptions : DriverOptions
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [GeoJsonOptions](geojsonoptions/)() | Crea nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [ArrayAsString](../../aspose.gis.formats.geojson/geojsonoptions/arrayasstring/) { get; set; } | Indica se esporre array JSon di stringhe, numeri interi o reali come stringa. |
| [AttributesSkip](../../aspose.gis.formats.geojson/geojsonoptions/attributesskip/) { get; set; } | controlla la traduzione degli attributi: sì - salta tutti gli attributi |
| [AutoId](../../aspose.gis.formats.geojson/geojsonoptions/autoid/) { get; set; } | ID generati automaticamente |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Determina se chiudere un non chiusoLinearRing in ogni geometria. L'impostazione predefinita è`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Determina se aggiungere un nuovo punto nel mezzo a ciascun segmento della geometria. L'impostazione predefinita è`false` . |
| [DateAsString](../../aspose.gis.formats.geojson/geojsonoptions/dateasstring/) { get; set; } | Indica se esporre JSon data/ora/data-ora come stringa. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Determina se eliminare i punti vicini in ciascuna geometria. L'impostazione predefinita è`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Determina la distanza per[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . L'impostazione predefinita è`0` . |
| [Description](../../aspose.gis.formats.geojson/geojsonoptions/description/) { get; set; } | Descrizione a livello di raccolta di elementi (per la creazione di layer) |
| [GeometryAsCollection](../../aspose.gis.formats.geojson/geojsonoptions/geometryascollection/) { get; set; } | controlla la traduzione delle geometrie: sì - avvolge le geometrie con GeometryCollection type |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Una tolleranza da utilizzare per linearizzare le geometrie delle curve. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) che verrà applicato a M coordinate quando le geometrie vengono aggiunte a[`VectorLayer`](../../aspose.gis/vectorlayer/) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer/) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [Name](../../aspose.gis.formats.geojson/geojsonoptions/name/) { get; set; } | Nome a livello di raccolta di elementi (per la creazione di layer) |
| [NestedPropertiesSeparator](../../aspose.gis.formats.geojson/geojsonoptions/nestedpropertiesseparator/) { get; set; } | Ottiene o imposta una stringa utilizzata per separare i componenti degli attributi nidificati. Il valore predefinito è "_". |
| [ReadBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/readboundingboxes/) { get; set; } | Determina se i Bounding Box ('bbox') devono essere letti come attributi con un nome 'bbox_0', 'bbox_1', ecc. Il valore predefinito è`false` . Il[`NestedPropertiesSeparator`](./nestedpropertiesseparator/) la stringa è usata in bbox_0, bbox_1,.. names. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Determina se eliminare i punti che giacciono sullo stesso segmento in ciascuna geometria. L'impostazione predefinita è`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Determina la distanza per[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . L'impostazione predefinita è`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Determina se le geometrie devono essere convalidate quando vengono aggiunte al layer. Se impostato su`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) viene chiamato per each geometria quando viene aggiunto al livello e se la convalida fallisce ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) È`false` ),[`GisException`](../../aspose.gis/gisexception/) viene lanciato. |
| [WriteBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/writeboundingboxes/) { get; set; } | Determina se gli oggetti GeoJSON devono includere informazioni sull'intervallo di coordinate per le relative geometrie. Se impostato su`true` , viene generato un membro "bbox" per ogni geometria (non nullo) quando viene aggiunto al layer. Il valore predefinito è`false` . |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Determina se è consentita la trasformazione di poligono o multipoligono in stringa lineare. L'impostazione predefinita è`false` . |
| [WriteUnsetAttribute](../../aspose.gis.formats.geojson/geojsonoptions/writeunsetattribute/) { get; set; } | Indica se scrivere attributi non impostati aggiungendo il valore 'null' |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) che verrà applicato alle coordinate X e Y quando le geometrie vengono aggiunte a[`VectorLayer`](../../aspose.gis/vectorlayer/) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer/) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) che verrà applicato alla coordinata Z quando le geometrie vengono aggiunte a[`VectorLayer`](../../aspose.gis/vectorlayer/) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer/) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Guarda anche

* class [DriverOptions](../../aspose.gis/driveroptions/)
* spazio dei nomi [Aspose.Gis.Formats.GeoJson](../../aspose.gis.formats.geojson/)
* assemblea [Aspose.GIS](../../)


