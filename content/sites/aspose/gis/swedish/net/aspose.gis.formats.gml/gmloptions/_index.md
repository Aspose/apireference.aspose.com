---
title: GmlOptions
second_title: Aspose.GIS för .NET API Referens
description: Drivrutinsspecifika alternativ för GMLformat.
type: docs
weight: 300
url: /sv/net/aspose.gis.formats.gml/gmloptions/
---
## GmlOptions class

Drivrutinsspecifika alternativ för GML-format.

```csharp
public class GmlOptions : DriverOptions
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [GmlOptions](gmloptions)() | Skapa ny instans. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring) { get; set; } | Bestämmer om stänga en ostängdLinearRing i varje geometri. Standard till`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints) { get; set; } | Bestämmer om lägga till en ny punkt i mitten till varje segment av geometri. Standard till`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints) { get; set; } | Bestämmer om radera nära punkter i varje geometri. Standard till`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance) { get; set; } | Bestämmer avstånd för[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints) . Standard till`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance) { get; set; } | En tolerans att använda för att linjärisera kurvgeometrier. |
| [LoadSchemasFromInternet](../../aspose.gis.formats.gml/gmloptions/loadschemasfrominternet) { get; set; } | Avgör om Aspose.GIS tillåts ladda XML-schema från Internet. Om inställt på`false` , scheman med absoluta URI:er som inte börjar med 'file://' skulle inte laddas. Standard är`false` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) som kommer att tillämpas på M coordinate när geometrier läggs till[`VectorLayer`](../../aspose.gis/vectorlayer) eller när de läses från[`VectorLayer`](../../aspose.gis/vectorlayer) . Standardvärdet är[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.gml/gmloptions/nestedpropertiesseparator) { get; set; } | Hämtar eller ställer in en sträng som används för att separera komponenter av kapslade attribut. Standard är "_". |
| [RestoreSchema](../../aspose.gis.formats.gml/gmloptions/restoreschema) { get; set; } | Bestämmer om Aspose.GIS får tolka attribut i en Gml-fil där ett XML-schema saknas eller inte kan laddas. Om inställt på`true` , Aspose.GIS-läsaren kräver inte närvaron av ett XML-schema. Standard är`false` . |
| [SchemaLocation](../../aspose.gis.formats.gml/gmloptions/schemalocation) { get; set; } | Mellanslagsseparerad lista med URI-par. Första URI i varje par är en URI för namnutrymmet, andra URI är ett sökväg till XML-schema för namnutrymmet. Om satt till`null` ,[`GmlDriver`](../gmldriver) kommer att försöka läsa schemaLocation från rotelementet i dokumentet. Standard är`null` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments) { get; set; } | Bestämmer om raderingspunkter som ligger på samma segment i varje geometri. Standard till`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance) { get; set; } | Bestämmer avstånd för[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments) . Standard till`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite) { get; set; } | Bestämmer om geometrier ska valideras när de läggs till i lagret. Om satt till`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid)anropas för each geometri när den läggs till i lagret och om valideringen misslyckas ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid) är`false` ),[`GisException`](../../aspose.gis/gisexception) kastas. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines) { get; set; } | Bestämmer om transformation av polygon eller multipolygon till linjesträng är tillåten. Standard till`false` . |
| [XmlResolver](../../aspose.gis.formats.gml/gmloptions/xmlresolver) { get; set; } | A[`XmlResolver`](./xmlresolver) används för att lösa externa resurser. Standard ärXmlUrlResolver . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel)som kommer att tillämpas på X- och Y-koordinater när geometrier läggs till[`VectorLayer`](../../aspose.gis/vectorlayer) eller när de läses från[`VectorLayer`](../../aspose.gis/vectorlayer) . Standardvärdet är[`Exact`](../../aspose.gis/precisionmodel/exact) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel) som kommer att tillämpas på Z coordinate när geometrier läggs till[`VectorLayer`](../../aspose.gis/vectorlayer) eller när de läses från[`VectorLayer`](../../aspose.gis/vectorlayer) . Standardvärdet är[`Exact`](../../aspose.gis/precisionmodel/exact) . |

### Se även

* class [DriverOptions](../../aspose.gis/driveroptions)
* namnutrymme [Aspose.Gis.Formats.Gml](../../aspose.gis.formats.gml)
* hopsättning [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
