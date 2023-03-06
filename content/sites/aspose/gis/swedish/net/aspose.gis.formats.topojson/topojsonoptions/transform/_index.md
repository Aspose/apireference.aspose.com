---
title: TopoJsonOptions.Transform
second_title: Aspose.GIS för .NET API Referens
description: TopoJsonOptions fast egendom. Anger transformobjekt som ska användas för att kvantisera koordinater och deltakoda bågar i utdata TopoJSON.
type: docs
weight: 60
url: /sv/net/aspose.gis.formats.topojson/topojsonoptions/transform/
---
## TopoJsonOptions.Transform property

Anger transformobjekt som ska användas för att kvantisera koordinater och delta-koda bågar i utdata TopoJSON.

```csharp
public TopoJsonTransform Transform { get; set; }
```

### Anmärkningar

Det här är skrivalternativ - det påverkar inte läsningen. Det här alternativet utesluter varandra med[`QuantizationNumber`](../quantizationnumber/) - endast ett av dessa två alternativ kan inte vara det`null` . Om detta inte är det`null` - Output TopoJSON-koordinater kvantiseras och bågar deltakodas med det specificerade transformobjektet. Se TopoJSON-specifikationen för mer information om transformeringsobjekt. Standardinställning till`null` .

### Se även

* class [TopoJsonTransform](../../topojsontransform/)
* class [TopoJsonOptions](../)
* namnutrymme [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* hopsättning [Aspose.GIS](../../../)


