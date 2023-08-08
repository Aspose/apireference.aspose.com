---
title: RuleBasedSymbolizer.Add
second_title: Aspose.GIS for .NET API Reference
description: RuleBasedSymbolizer method. Adds new Rule
type: docs
weight: 40
url: /net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/
---
## Add(Func&lt;Feature, bool&gt;, VectorSymbolizer) {#add_1}

Adds new [`Rule`](../../rule/).

```csharp
public void Add(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filter | Func`2 | Determines when symbolizer should be applied to a feature. |
| symbolizer | VectorSymbolizer | Symbolizer to apply to a feature when *filter* returns true. |

### See Also

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [RuleBasedSymbolizer](../)
* namespace [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* assembly [Aspose.GIS](../../../)

---

## Add(Rule) {#add}

Adds a rule.

```csharp
public void Add(Rule rule)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rule | Rule | Rule to add. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |

### See Also

* class [Rule](../../rule/)
* class [RuleBasedSymbolizer](../)
* namespace [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* assembly [Aspose.GIS](../../../)


