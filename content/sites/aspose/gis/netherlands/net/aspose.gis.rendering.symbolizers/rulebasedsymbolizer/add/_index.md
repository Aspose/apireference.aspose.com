---
title: RuleBasedSymbolizer.Add
second_title: Aspose.GIS voor .NET API-referentie
description: RuleBasedSymbolizer methode. Voegt nieuwe toeRule .
type: docs
weight: 40
url: /nl/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/
---
## Add(Func&lt;Feature, bool&gt;, VectorSymbolizer) {#add_1}

Voegt nieuwe toe[`Rule`](../../rule/) .

```csharp
public void Add(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| filter | Func`2 | Bepaalt wanneer symbolizer moet worden toegepast op een object. |
| symbolizer | VectorSymbolizer | Symbolizer om toe te passen op een functie wanneer*filter* retourneert waar. |

### Zie ook

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [RuleBasedSymbolizer](../)
* naamruimte [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* montage [Aspose.GIS](../../../)

---

## Add(Rule) {#add}

Voegt een regel toe.

```csharp
public void Add(Rule rule)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rule | Rule | Regel om toe te voegen. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |

### Zie ook

* class [Rule](../../rule/)
* class [RuleBasedSymbolizer](../)
* naamruimte [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* montage [Aspose.GIS](../../../)


