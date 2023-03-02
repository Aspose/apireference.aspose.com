---
title: Rule.CreateFilterRule
second_title: Aspose.GIS för .NET API Referens
description: Rule metod. Skapar en ny regel som tillämpar en symboliserare på funktion närhelst den passerar filter.
type: docs
weight: 20
url: /sv/net/aspose.gis.rendering.symbolizers/rule/createfilterrule/
---
## Rule.CreateFilterRule method

Skapar en ny regel som tillämpar en symboliserare på funktion närhelst den passerar filter.

```csharp
public static Rule CreateFilterRule(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| filter | Func`2 | Bestämmer när symboliseraren ska användas. |
| symbolizer | VectorSymbolizer | Symboliserare att applicera. |

### Returvärde

Nytt regelobjekt.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Filter är`null`. |

### Se även

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [Rule](../)
* namnutrymme [Aspose.Gis.Rendering.Symbolizers](../../rule/)
* hopsättning [Aspose.GIS](../../../)


