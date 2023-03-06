---
title: Class GeoJsonOptions
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.Formats.GeoJson.GeoJsonOptions klas. Stuurprogrammaspecifieke opties voor GeoJSONindeling.
type: docs
weight: 310
url: /nl/net/aspose.gis.formats.geojson/geojsonoptions/
---
## GeoJsonOptions class

Stuurprogrammaspecifieke opties voor GeoJSON-indeling.

```csharp
public class GeoJsonOptions : DriverOptions
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [GeoJsonOptions](geojsonoptions/)() | Nieuwe instantie maken. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [ArrayAsString](../../aspose.gis.formats.geojson/geojsonoptions/arrayasstring/) { get; set; } | Of JSon-arrays van strings, integers of reals als string moeten worden weergegeven. |
| [AttributesSkip](../../aspose.gis.formats.geojson/geojsonoptions/attributesskip/) { get; set; } | bepaalt de vertaling van attributen: ja - sla alle attributen over |
| [AutoId](../../aspose.gis.formats.geojson/geojsonoptions/autoid/) { get; set; } | ID's automatisch genereren |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Bepaalt of een niet geslotenLinearRing in elke geometrie. Standaard naar`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Bepaalt of een nieuw punt in het midden wordt toegevoegd aan elk geometriesegment. Standaard naar`false` . |
| [DateAsString](../../aspose.gis.formats.geojson/geojsonoptions/dateasstring/) { get; set; } | Of JSon datum/tijd/datum-tijd moet worden weergegeven als tekenreeks. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Bepaalt of nabije punten in elke geometrie moeten worden verwijderd. Standaard naar`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Bepaalt de afstand voor[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Standaard naar`0` . |
| [Description](../../aspose.gis.formats.geojson/geojsonoptions/description/) { get; set; } | Beschrijving op objectverzamelingsniveau (voor het maken van lagen) |
| [GeometryAsCollection](../../aspose.gis.formats.geojson/geojsonoptions/geometryascollection/) { get; set; } | controle vertaling van geometrieën: ja - wikkel geometrieën met GeometryCollection type |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Een tolerantie om te gebruiken om krommegeometrieën te lineariseren. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | EEN[`PrecisionModel`](../../aspose.gis/precisionmodel/) die zal worden toegepast op M coordinate wanneer geometrieën worden toegevoegd aan de[`VectorLayer`](../../aspose.gis/vectorlayer/) of wanneer ze worden voorgelezen uit de[`VectorLayer`](../../aspose.gis/vectorlayer/) . De standaardwaarde is[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [Name](../../aspose.gis.formats.geojson/geojsonoptions/name/) { get; set; } | Naam op objectverzamelingsniveau (voor het maken van lagen) |
| [NestedPropertiesSeparator](../../aspose.gis.formats.geojson/geojsonoptions/nestedpropertiesseparator/) { get; set; } | Hiermee wordt een tekenreeks opgehaald of ingesteld die wordt gebruikt om componenten van geneste attributen te scheiden. Standaard is "_". |
| [ReadBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/readboundingboxes/) { get; set; } | Bepaalt of begrenzingsvakken ('bbox') moeten worden gelezen als attributen met een naam 'bbox_0', 'bbox_1', etc. Standaardwaarde is`false` . De[`NestedPropertiesSeparator`](./nestedpropertiesseparator/) string wordt gebruikt in bbox_0, bbox_1,.. namen. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Bepaalt of verwijder punten die op hetzelfde segment in elke geometrie liggen. Standaard naar`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Bepaalt de afstand voor[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Standaard naar`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Bepaalt of geometrieën moeten worden gevalideerd wanneer ze aan de laag worden toegevoegd. Indien ingesteld op`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) wordt aangeroepen voor elke geometrie wanneer deze wordt toegevoegd aan de laag en als de validatie mislukt ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) is`false` ),[`GisException`](../../aspose.gis/gisexception/) wordt gegooid. |
| [WriteBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/writeboundingboxes/) { get; set; } | Bepaalt of GeoJSON-objecten informatie moeten bevatten over het coördinatenbereik voor zijn geometrieën. Indien ingesteld op`true` , wordt een lid "bbox" gegenereerd voor elke geometrie (niet null) wanneer deze wordt toegevoegd aan de laag. Standaardwaarde is`false` . |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Bepaalt of transformatie van polygoon of multipolygoon naar lijnstring is toegestaan. Standaard naar`false` . |
| [WriteUnsetAttribute](../../aspose.gis.formats.geojson/geojsonoptions/writeunsetattribute/) { get; set; } | Of niet-ingestelde kenmerken moeten worden geschreven door 'null'-waarde toe te voegen |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | EEN[`PrecisionModel`](../../aspose.gis/precisionmodel/) die zal worden toegepast op X- en Y-coördinaten wanneer geometrieën worden toegevoegd aan de[`VectorLayer`](../../aspose.gis/vectorlayer/) of wanneer ze worden voorgelezen uit de[`VectorLayer`](../../aspose.gis/vectorlayer/) . De standaardwaarde is[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | EEN[`PrecisionModel`](../../aspose.gis/precisionmodel/) die zal worden toegepast op Z coordinate wanneer geometrieën worden toegevoegd aan de[`VectorLayer`](../../aspose.gis/vectorlayer/) of wanneer ze worden voorgelezen uit de[`VectorLayer`](../../aspose.gis/vectorlayer/) . De standaardwaarde is[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Zie ook

* class [DriverOptions](../../aspose.gis/driveroptions/)
* naamruimte [Aspose.Gis.Formats.GeoJson](../../aspose.gis.formats.geojson/)
* montage [Aspose.GIS](../../)


