---
title: Class GeoJsonOptions
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.Formats.GeoJson.GeoJsonOptions klass. Drivrutinsspecifika alternativ för GeoJSONformat.
type: docs
weight: 310
url: /sv/net/aspose.gis.formats.geojson/geojsonoptions/
---
## GeoJsonOptions class

Drivrutinsspecifika alternativ för GeoJSON-format.

```csharp
public class GeoJsonOptions : DriverOptions
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [GeoJsonOptions](geojsonoptions/)() | Skapa ny instans. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [ArrayAsString](../../aspose.gis.formats.geojson/geojsonoptions/arrayasstring/) { get; set; } | Om JSon-matriser av strängar, heltal eller reella ska exponeras som sträng. |
| [AttributesSkip](../../aspose.gis.formats.geojson/geojsonoptions/attributesskip/) { get; set; } | styr översättning av attribut: ja - hoppa över alla attribut |
| [AutoId](../../aspose.gis.formats.geojson/geojsonoptions/autoid/) { get; set; } | Generera ids automatiskt |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Bestämmer om stänga en ostängdLinearRing i varje geometri. Standard till`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Bestämmer om lägga till en ny punkt i mitten till varje segment av geometri. Standard till`false` . |
| [DateAsString](../../aspose.gis.formats.geojson/geojsonoptions/dateasstring/) { get; set; } | Om JSon datum/tid/datum-tid ska exponeras som sträng. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Bestämmer om radera nära punkter i varje geometri. Standard till`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Bestämmer avstånd för[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Standard till`0` . |
| [Description](../../aspose.gis.formats.geojson/geojsonoptions/description/) { get; set; } | Beskrivning på funktionssamlingsnivå (för att skapa lager) |
| [GeometryAsCollection](../../aspose.gis.formats.geojson/geojsonoptions/geometryascollection/) { get; set; } | styr översättning av geometrier: ja - linda geometrier med GeometryCollection type |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | En tolerans att använda för att linjärisera kurvgeometrier. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) som kommer att tillämpas på M coordinate när geometrier läggs till[`VectorLayer`](../../aspose.gis/vectorlayer/) eller när de läses från[`VectorLayer`](../../aspose.gis/vectorlayer/) . Standardvärdet är[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [Name](../../aspose.gis.formats.geojson/geojsonoptions/name/) { get; set; } | Namn på funktionssamlingsnivå (för att skapa lager) |
| [NestedPropertiesSeparator](../../aspose.gis.formats.geojson/geojsonoptions/nestedpropertiesseparator/) { get; set; } | Hämtar eller ställer in en sträng som används för att separera komponenter av kapslade attribut. Standard är "_". |
| [ReadBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/readboundingboxes/) { get; set; } | Bestämmer om Bounding Boxes ('bbox') ska läsas som attribut med namnet 'bbox_0', 'bbox_1', etc. Standardvärdet är`false` . Den[`NestedPropertiesSeparator`](./nestedpropertiesseparator/) sträng används i bbox_0, bbox_1,.. names. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Bestämmer om raderingspunkter som ligger på samma segment i varje geometri. Standard till`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Bestämmer avstånd för[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Standard till`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Bestämmer om geometrier ska valideras när de läggs till i lagret. Om satt till`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) anropas för each geometri när den läggs till i lagret och om valideringen misslyckas ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) är`false` ),[`GisException`](../../aspose.gis/gisexception/) kastas. |
| [WriteBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/writeboundingboxes/) { get; set; } | Bestämmer om GeoJSON-objekt ska inkluderas information om koordinatområdet för dess geometrier. Om satt till`true` , en medlem "bbox" genereras för varje geometri (inte null) när den läggs till i lagret. Standardvärdet är`false` . |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Bestämmer om transformation av polygon eller multipolygon till linjesträng är tillåten. Standard till`false` . |
| [WriteUnsetAttribute](../../aspose.gis.formats.geojson/geojsonoptions/writeunsetattribute/) { get; set; } | Om man ska skriva oinställda attribut genom att lägga till "null" värde |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) som kommer att tillämpas på X- och Y-koordinater när geometrier läggs till[`VectorLayer`](../../aspose.gis/vectorlayer/) eller när de läses från[`VectorLayer`](../../aspose.gis/vectorlayer/) . Standardvärdet är[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) som kommer att tillämpas på Z coordinate när geometrier läggs till[`VectorLayer`](../../aspose.gis/vectorlayer/) eller när de läses från[`VectorLayer`](../../aspose.gis/vectorlayer/) . Standardvärdet är[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Se även

* class [DriverOptions](../../aspose.gis/driveroptions/)
* namnutrymme [Aspose.Gis.Formats.GeoJson](../../aspose.gis.formats.geojson/)
* hopsättning [Aspose.GIS](../../)


