---
title: Class TopoJsonOptions
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.Formats.TopoJson.TopoJsonOptions klas. Driverspecifieke opties voor TopoJSONindeling.
type: docs
weight: 710
url: /nl/net/aspose.gis.formats.topojson/topojsonoptions/
---
## TopoJsonOptions class

Driverspecifieke opties voor TopoJSON-indeling.

```csharp
public class TopoJsonOptions : DriverOptions
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [TopoJsonOptions](topojsonoptions/)() | Nieuwe instantie maken. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Bepaalt of een niet geslotenLinearRing in elke geometrie. Standaard naar`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Bepaalt of een nieuw punt in het midden wordt toegevoegd aan elk geometriesegment. Standaard naar`false` . |
| [DefaultObjectName](../../aspose.gis.formats.topojson/topojsonoptions/defaultobjectname/) { get; set; } | Naam van het object waarin objecten standaard worden geplaatst. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Bepaalt of nabije punten in elke geometrie moeten worden verwijderd. Standaard naar`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Bepaalt de afstand voor[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Standaard naar`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Een tolerantie om te gebruiken om krommegeometrieën te lineariseren. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | EEN[`PrecisionModel`](../../aspose.gis/precisionmodel/) die zal worden toegepast op M coordinate wanneer geometrieën worden toegevoegd aan de[`VectorLayer`](../../aspose.gis/vectorlayer/) of wanneer ze worden voorgelezen uit de[`VectorLayer`](../../aspose.gis/vectorlayer/) . De standaardwaarde is[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.topojson/topojsonoptions/nestedpropertiesseparator/) { get; set; } | Hiermee wordt een tekenreeks opgehaald of ingesteld die wordt gebruikt om componenten van geneste attributen te scheiden. Standaard is "_". |
| [ObjectNameAttribute](../../aspose.gis.formats.topojson/topojsonoptions/objectnameattribute/) { get; set; } | Naam van het attribuut, dat de naam weergeeft van het object dat een feature bevat. |
| [QuantizationNumber](../../aspose.gis.formats.topojson/topojsonoptions/quantizationnumber/) { get; set; } | Specificeert het kwantiseringsnummer dat moet worden gebruikt om coördinaten en delta-coderingsbogen te kwantiseren in uitvoer TopoJSON. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Bepaalt of verwijder punten die op hetzelfde segment in elke geometrie liggen. Standaard naar`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Bepaalt de afstand voor[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Standaard naar`0` . |
| [Transform](../../aspose.gis.formats.topojson/topojsonoptions/transform/) { get; set; } | Specificeert het transformatieobject dat moet worden gebruikt voor het kwantiseren van coördinaten en delta-coderingsbogen in uitvoer TopoJSON. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Bepaalt of geometrieën moeten worden gevalideerd wanneer ze aan de laag worden toegevoegd. Indien ingesteld op`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) wordt aangeroepen voor elke geometrie wanneer deze wordt toegevoegd aan de laag en als de validatie mislukt ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) is`false` ),[`GisException`](../../aspose.gis/gisexception/) wordt gegooid. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Bepaalt of transformatie van polygoon of multipolygoon naar lijnstring is toegestaan. Standaard naar`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | EEN[`PrecisionModel`](../../aspose.gis/precisionmodel/) die zal worden toegepast op X- en Y-coördinaten wanneer geometrieën worden toegevoegd aan de[`VectorLayer`](../../aspose.gis/vectorlayer/) of wanneer ze worden voorgelezen uit de[`VectorLayer`](../../aspose.gis/vectorlayer/) . De standaardwaarde is[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | EEN[`PrecisionModel`](../../aspose.gis/precisionmodel/) die zal worden toegepast op Z coordinate wanneer geometrieën worden toegevoegd aan de[`VectorLayer`](../../aspose.gis/vectorlayer/) of wanneer ze worden voorgelezen uit de[`VectorLayer`](../../aspose.gis/vectorlayer/) . De standaardwaarde is[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Zie ook

* class [DriverOptions](../../aspose.gis/driveroptions/)
* naamruimte [Aspose.Gis.Formats.TopoJson](../../aspose.gis.formats.topojson/)
* montage [Aspose.GIS](../../)


