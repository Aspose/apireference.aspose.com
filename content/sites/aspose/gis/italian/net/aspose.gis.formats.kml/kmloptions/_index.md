---
title: Class KmlOptions
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Formats.Kml.KmlOptions classe. Opzioni specifiche del driver per il formato KML.
type: docs
weight: 410
url: /it/net/aspose.gis.formats.kml/kmloptions/
---
## KmlOptions class

Opzioni specifiche del driver per il formato KML.

```csharp
public class KmlOptions : DriverOptions
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [KmlOptions](kmloptions/)() | Crea nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [AltitudeMode](../../aspose.gis.formats.kml/kmloptions/altitudemode/) { get; set; } | Consente di specificare gli AltitudeModes da utilizzare per le geometrie KML |
| [AutoId](../../aspose.gis.formats.kml/kmloptions/autoid/) { get; set; } | ID generati automaticamente |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Determina se chiudere un non chiusoLinearRing in ogni geometria. L'impostazione predefinita è`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Determina se aggiungere un nuovo punto nel mezzo a ciascun segmento della geometria. L'impostazione predefinita è`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Determina se eliminare i punti vicini in ciascuna geometria. L'impostazione predefinita è`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Determina la distanza per[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . L'impostazione predefinita è`0` . |
| [DocumentId](../../aspose.gis.formats.kml/kmloptions/documentid/) { get; set; } | Usato per specificare l'id del root 'Document' node |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Una tolleranza da utilizzare per linearizzare le geometrie delle curve. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) che verrà applicato a M coordinate quando le geometrie vengono aggiunte a[`VectorLayer`](../../aspose.gis/vectorlayer/) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer/) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Determina se eliminare i punti che giacciono sullo stesso segmento in ciascuna geometria. L'impostazione predefinita è`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Determina la distanza per[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . L'impostazione predefinita è`0` . |
| [SymbolToReplaceInvalidChars](../../aspose.gis.formats.kml/kmloptions/symboltoreplaceinvalidchars/) { get; set; } | Determina quale simbolo verrà utilizzato per sostituire i caratteri non validi durante la lettura. La sostituzione viene saltata se il valore è '\0'. Il valore predefinito è '\0' char. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Determina se le geometrie devono essere convalidate quando vengono aggiunte al layer. Se impostato su`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) viene chiamato per each geometria quando viene aggiunto al livello e se la convalida fallisce ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) È`false` ),[`GisException`](../../aspose.gis/gisexception/) viene lanciato. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Determina se è consentita la trasformazione di poligono o multipoligono in stringa lineare. L'impostazione predefinita è`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) che verrà applicato alle coordinate X e Y quando le geometrie vengono aggiunte a[`VectorLayer`](../../aspose.gis/vectorlayer/) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer/) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) che verrà applicato alla coordinata Z quando le geometrie vengono aggiunte a[`VectorLayer`](../../aspose.gis/vectorlayer/) o quando vengono letti dal[`VectorLayer`](../../aspose.gis/vectorlayer/) . Il valore predefinito è[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Guarda anche

* class [DriverOptions](../../aspose.gis/driveroptions/)
* spazio dei nomi [Aspose.Gis.Formats.Kml](../../aspose.gis.formats.kml/)
* assemblea [Aspose.GIS](../../)


