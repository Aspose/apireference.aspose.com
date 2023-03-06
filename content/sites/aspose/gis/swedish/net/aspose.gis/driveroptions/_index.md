---
title: Class DriverOptions
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.DriverOptions klass. Alternativ för enDriver .
type: docs
weight: 100
url: /sv/net/aspose.gis/driveroptions/
---
## DriverOptions class

Alternativ för en[`Driver`](../driver/) .

```csharp
public abstract class DriverOptions
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Bestämmer om stänga en ostängdLinearRing i varje geometri. Standard till`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Bestämmer om lägga till en ny punkt i mitten till varje segment av geometri. Standard till`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Bestämmer om radera nära punkter i varje geometri. Standard till`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Bestämmer avstånd för[`DeleteNearPoints`](./deletenearpoints/) . Standard till`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | En tolerans att använda för att linjärisera kurvgeometrier. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | A[`PrecisionModel`](../precisionmodel/) som kommer att tillämpas på M coordinate när geometrier läggs till[`VectorLayer`](../vectorlayer/) eller när de läses från[`VectorLayer`](../vectorlayer/) . Standardvärdet är[`Exact`](../precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Bestämmer om raderingspunkter som ligger på samma segment i varje geometri. Standard till`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Bestämmer avstånd för[`SimplifySegments`](./simplifysegments/) . Standard till`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Bestämmer om geometrier ska valideras när de läggs till i lagret. Om satt till`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) anropas för each geometri när den läggs till i lagret och om valideringen misslyckas ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) är`false` ),[`GisException`](../gisexception/) kastas. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Bestämmer om transformation av polygon eller multipolygon till linjesträng är tillåten. Standard till`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | A[`PrecisionModel`](../precisionmodel/) som kommer att tillämpas på X- och Y-koordinater när geometrier läggs till[`VectorLayer`](../vectorlayer/) eller när de läses från[`VectorLayer`](../vectorlayer/) . Standardvärdet är[`Exact`](../precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | A[`PrecisionModel`](../precisionmodel/) som kommer att tillämpas på Z coordinate när geometrier läggs till[`VectorLayer`](../vectorlayer/) eller när de läses från[`VectorLayer`](../vectorlayer/) . Standardvärdet är[`Exact`](../precisionmodel/exact/) . |

### Se även

* namnutrymme [Aspose.Gis](../../aspose.gis/)
* hopsättning [Aspose.GIS](../../)


