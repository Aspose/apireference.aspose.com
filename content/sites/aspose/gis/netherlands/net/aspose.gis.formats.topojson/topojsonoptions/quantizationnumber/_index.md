---
title: TopoJsonOptions.QuantizationNumber
second_title: Aspose.GIS voor .NET API-referentie
description: TopoJsonOptions eigendom. Specificeert het kwantiseringsnummer dat moet worden gebruikt om coördinaten en deltacoderingsbogen te kwantiseren in uitvoer TopoJSON.
type: docs
weight: 50
url: /nl/net/aspose.gis.formats.topojson/topojsonoptions/quantizationnumber/
---
## TopoJsonOptions.QuantizationNumber property

Specificeert het kwantiseringsnummer dat moet worden gebruikt om coördinaten en delta-coderingsbogen te kwantiseren in uitvoer TopoJSON.

```csharp
public int? QuantizationNumber { get; set; }
```

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentOutOfRangeException | Argument is minder dan twee. |

### Opmerkingen

Dit is een schrijfoptie - het heeft geen invloed op het lezen. Deze optie sluit elkaar uit met[`Transform`](../transform/) - slechts een van deze twee opties kan dat niet zijn`null` . Als dit niet het geval is`null` - uitvoer TopoJSON-coördinaten worden gekwantiseerd en bogen zijn delta-gecodeerd met het gespecificeerde kwantiseringsnummer. Kwantiseringsgetal bepaalt het maximale aantal uitdrukbare waarden per dimensie in de resulterende gekwantiseerde coördinaten; meestal wordt een macht van tien gekozen. Standaard ingesteld op`null` .

### Zie ook

* class [TopoJsonOptions](../)
* naamruimte [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* montage [Aspose.GIS](../../../)


