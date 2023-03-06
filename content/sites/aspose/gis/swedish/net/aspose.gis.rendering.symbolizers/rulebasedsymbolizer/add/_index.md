---
title: RuleBasedSymbolizer.Add
second_title: Aspose.GIS för .NET API Referens
description: RuleBasedSymbolizer metod. Lägger till nyttRule .
type: docs
weight: 40
url: /sv/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/
---
## Add(Func&lt;Feature, bool&gt;, VectorSymbolizer) {#add_1}

Lägger till nytt[`Rule`](../../rule/) .

```csharp
public void Add(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| filter | Func`2 | Bestämmer när symboliseraren ska tillämpas på en funktion. |
| symbolizer | VectorSymbolizer | Symboliserare att tillämpa på en funktion när*filter* returnerar sant. |

### Se även

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [RuleBasedSymbolizer](../)
* namnutrymme [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* hopsättning [Aspose.GIS](../../../)

---

## Add(Rule) {#add}

Lägger till en regel.

```csharp
public void Add(Rule rule)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| rule | Rule | Regel att lägga till. |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argument är`null`. |

### Se även

* class [Rule](../../rule/)
* class [RuleBasedSymbolizer](../)
* namnutrymme [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* hopsättning [Aspose.GIS](../../../)


