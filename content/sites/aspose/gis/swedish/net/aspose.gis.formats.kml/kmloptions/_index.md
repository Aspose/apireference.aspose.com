---
title: Class KmlOptions
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.Formats.Kml.KmlOptions klass. Drivrutinsspecifika alternativ för KMLformat.
type: docs
weight: 410
url: /sv/net/aspose.gis.formats.kml/kmloptions/
---
## KmlOptions class

Drivrutinsspecifika alternativ för KML-format.

```csharp
public class KmlOptions : DriverOptions
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [KmlOptions](kmloptions/)() | Skapa ny instans. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [AltitudeMode](../../aspose.gis.formats.kml/kmloptions/altitudemode/) { get; set; } | Låter dig ange de höjdlägen som ska användas för KML geometries |
| [AutoId](../../aspose.gis.formats.kml/kmloptions/autoid/) { get; set; } | Generera ids automatiskt |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Bestämmer om stänga en ostängdLinearRing i varje geometri. Standard till`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Bestämmer om lägga till en ny punkt i mitten till varje segment av geometri. Standard till`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Bestämmer om radera nära punkter i varje geometri. Standard till`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Bestämmer avstånd för[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Standard till`0` . |
| [DocumentId](../../aspose.gis.formats.kml/kmloptions/documentid/) { get; set; } | Används för att ange ID för roten "Dokument" node |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | En tolerans att använda för att linjärisera kurvgeometrier. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) som kommer att tillämpas på M coordinate när geometrier läggs till[`VectorLayer`](../../aspose.gis/vectorlayer/) eller när de läses från[`VectorLayer`](../../aspose.gis/vectorlayer/) . Standardvärdet är[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Bestämmer om raderingspunkter som ligger på samma segment i varje geometri. Standard till`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Bestämmer avstånd för[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Standard till`0` . |
| [SymbolToReplaceInvalidChars](../../aspose.gis.formats.kml/kmloptions/symboltoreplaceinvalidchars/) { get; set; } | Bestämmer vilken symbol som ska användas för att ersätta ogiltiga tecken vid läsning. Ersättning hoppas över om värdet är '\0'. Som standardvärde är '\0' char. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Bestämmer om geometrier ska valideras när de läggs till i lagret. Om satt till`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) anropas för each geometri när den läggs till i lagret och om valideringen misslyckas ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) är`false` ),[`GisException`](../../aspose.gis/gisexception/) kastas. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Bestämmer om transformation av polygon eller multipolygon till linjesträng är tillåten. Standard till`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) som kommer att tillämpas på X- och Y-koordinater när geometrier läggs till[`VectorLayer`](../../aspose.gis/vectorlayer/) eller när de läses från[`VectorLayer`](../../aspose.gis/vectorlayer/) . Standardvärdet är[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../../aspose.gis/precisionmodel/) som kommer att tillämpas på Z coordinate när geometrier läggs till[`VectorLayer`](../../aspose.gis/vectorlayer/) eller när de läses från[`VectorLayer`](../../aspose.gis/vectorlayer/) . Standardvärdet är[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Se även

* class [DriverOptions](../../aspose.gis/driveroptions/)
* namnutrymme [Aspose.Gis.Formats.Kml](../../aspose.gis.formats.kml/)
* hopsättning [Aspose.GIS](../../)


