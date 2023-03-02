---
title: Class LayeredSymbolizer
second_title: Aspose.GIS för .NET API Referens
description: Aspose.Gis.Rendering.Symbolizers.LayeredSymbolizer klass. En symboliserare som återger flera andra symboliserare.
type: docs
weight: 1830
url: /sv/net/aspose.gis.rendering.symbolizers/layeredsymbolizer/
---
## LayeredSymbolizer class

En symboliserare som återger flera andra symboliserare.

```csharp
public class LayeredSymbolizer : VectorSymbolizer, IReadOnlyList<VectorSymbolizer>
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [LayeredSymbolizer](layeredsymbolizer/#constructor)() | Skapar ny instans. |
| [LayeredSymbolizer](layeredsymbolizer/#constructor_1)(RenderingOrder) | Skapar ny instans. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Count](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/count/) { get; } | Får antalet symboliserar. |
| [Item](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/item/) { get; } | Hämtar symboliseraren vid det angivna indexet. |
| [RenderingOrder](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/renderingorder/) { get; set; } | Bestämmer renderingsordningen. ByFeatures - rendera alla symboliserar för funktionen, fortsätt sedan till nästa funktion.ByLayers - rendera alla funktioner med symbolizern, fortsätt sedan till nästa symbolizer. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Add](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/add/)(VectorSymbolizer) | Lägger till den angivna symboliseraren. |
| [GetEnumerator](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/getenumerator/)() | Returnerar en uppräkning som itererar genom samlingen. |

### Se även

* class [VectorSymbolizer](../vectorsymbolizer/)
* namnutrymme [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* hopsättning [Aspose.GIS](../../)


