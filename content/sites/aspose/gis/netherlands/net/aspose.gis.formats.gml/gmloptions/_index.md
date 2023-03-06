---
title: Class GmlOptions
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.Formats.Gml.GmlOptions klas. Driverspecifieke opties voor GMLindeling.
type: docs
weight: 350
url: /nl/net/aspose.gis.formats.gml/gmloptions/
---
## GmlOptions class

Driverspecifieke opties voor GML-indeling.

```csharp
public class GmlOptions : DriverOptions
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [GmlOptions](gmloptions/)() | Nieuwe instantie maken. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Bepaalt of een niet geslotenLinearRing in elke geometrie. Standaard naar`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Bepaalt of een nieuw punt in het midden wordt toegevoegd aan elk geometriesegment. Standaard naar`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Bepaalt of nabije punten in elke geometrie moeten worden verwijderd. Standaard naar`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Bepaalt de afstand voor[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Standaard naar`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Een tolerantie om te gebruiken om krommegeometrieën te lineariseren. |
| [LoadSchemasFromInternet](../../aspose.gis.formats.gml/gmloptions/loadschemasfrominternet/) { get; set; } | Bepaalt of Aspose.GIS XML-schema mag laden van internet. Indien ingesteld op`false` worden schema's met absolute URI's die niet beginnen met 'file://' niet geladen. Standaard is`false` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | EEN[`PrecisionModel`](../../aspose.gis/precisionmodel/) die zal worden toegepast op M coordinate wanneer geometrieën worden toegevoegd aan de[`VectorLayer`](../../aspose.gis/vectorlayer/) of wanneer ze worden voorgelezen uit de[`VectorLayer`](../../aspose.gis/vectorlayer/) . De standaardwaarde is[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.gml/gmloptions/nestedpropertiesseparator/) { get; set; } | Hiermee wordt een tekenreeks opgehaald of ingesteld die wordt gebruikt om componenten van geneste attributen te scheiden. Standaard is "_". |
| [RestoreSchema](../../aspose.gis.formats.gml/gmloptions/restoreschema/) { get; set; } | Bepaalt of Aspose.GIS attributen mag parseren in een Gml-bestand waarin een XML-schema ontbreekt of niet kan worden geladen. Indien ingesteld op`true` , Aspose.GIS-lezer vereist niet de aanwezigheid van een XML-schema. Standaard is`false` . |
| [SchemaLocation](../../aspose.gis.formats.gml/gmloptions/schemalocation/) { get; set; } | Door spaties gescheiden lijst met URI-paren. De eerste URI in elk paar is een URI van de naamruimte, de tweede URI is een pad naar XML-schema van de naamruimte. Indien ingesteld op`null` ,[`GmlDriver`](../gmldriver/) zal proberen schemaLocation te lezen van het root-element van het document. Standaard is`null` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Bepaalt of verwijder punten die op hetzelfde segment in elke geometrie liggen. Standaard naar`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Bepaalt de afstand voor[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Standaard naar`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Bepaalt of geometrieën moeten worden gevalideerd wanneer ze aan de laag worden toegevoegd. Indien ingesteld op`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) wordt aangeroepen voor elke geometrie wanneer deze wordt toegevoegd aan de laag en als de validatie mislukt ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) is`false` ),[`GisException`](../../aspose.gis/gisexception/) wordt gegooid. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Bepaalt of transformatie van polygoon of multipolygoon naar lijnstring is toegestaan. Standaard naar`false` . |
| [XmlResolver](../../aspose.gis.formats.gml/gmloptions/xmlresolver/) { get; set; } | EEN[`XmlResolver`](./xmlresolver/) gebruikt om externe bronnen op te lossen. Standaard isXmlUrlResolver . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | EEN[`PrecisionModel`](../../aspose.gis/precisionmodel/) die zal worden toegepast op X- en Y-coördinaten wanneer geometrieën worden toegevoegd aan de[`VectorLayer`](../../aspose.gis/vectorlayer/) of wanneer ze worden voorgelezen uit de[`VectorLayer`](../../aspose.gis/vectorlayer/) . De standaardwaarde is[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | EEN[`PrecisionModel`](../../aspose.gis/precisionmodel/) die zal worden toegepast op Z coordinate wanneer geometrieën worden toegevoegd aan de[`VectorLayer`](../../aspose.gis/vectorlayer/) of wanneer ze worden voorgelezen uit de[`VectorLayer`](../../aspose.gis/vectorlayer/) . De standaardwaarde is[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Zie ook

* class [DriverOptions](../../aspose.gis/driveroptions/)
* naamruimte [Aspose.Gis.Formats.Gml](../../aspose.gis.formats.gml/)
* montage [Aspose.GIS](../../)


