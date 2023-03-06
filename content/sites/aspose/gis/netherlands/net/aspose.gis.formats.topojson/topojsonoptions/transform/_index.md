---
title: TopoJsonOptions.Transform
second_title: Aspose.GIS voor .NET API-referentie
description: TopoJsonOptions eigendom. Specificeert het transformatieobject dat moet worden gebruikt voor het kwantiseren van coördinaten en deltacoderingsbogen in uitvoer TopoJSON.
type: docs
weight: 60
url: /nl/net/aspose.gis.formats.topojson/topojsonoptions/transform/
---
## TopoJsonOptions.Transform property

Specificeert het transformatieobject dat moet worden gebruikt voor het kwantiseren van coördinaten en delta-coderingsbogen in uitvoer TopoJSON.

```csharp
public TopoJsonTransform Transform { get; set; }
```

### Opmerkingen

Dit is een schrijfoptie - het heeft geen invloed op het lezen. Deze optie sluit elkaar uit met[`QuantizationNumber`](../quantizationnumber/) - slechts een van deze twee opties kan dat niet zijn`null` . Als dit niet het geval is`null` - uitvoer TopoJSON-coördinaten worden gekwantiseerd en bogen zijn delta-gecodeerd met het gespecificeerde transformatieobject. Raadpleeg de TopoJSON-specificatie voor meer details over het transformatieobject. Standaard ingesteld op`null` .

### Zie ook

* class [TopoJsonTransform](../../topojsontransform/)
* class [TopoJsonOptions](../)
* naamruimte [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* montage [Aspose.GIS](../../../)


