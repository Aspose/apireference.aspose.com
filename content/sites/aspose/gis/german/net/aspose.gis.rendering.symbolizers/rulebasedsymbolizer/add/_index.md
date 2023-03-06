---
title: RuleBasedSymbolizer.Add
second_title: Aspose.GIS für .NET-API-Referenz
description: RuleBasedSymbolizer methode. Fügt neu hinzuRule .
type: docs
weight: 40
url: /de/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/
---
## Add(Func&lt;Feature, bool&gt;, VectorSymbolizer) {#add_1}

Fügt neu hinzu[`Rule`](../../rule/) .

```csharp
public void Add(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| filter | Func`2 | Legt fest, wann der Symbolisierer auf ein Feature angewendet werden soll. |
| symbolizer | VectorSymbolizer | Symbolisierer, der wann auf ein Feature angewendet werden soll*filter* gibt wahr zurück. |

### Siehe auch

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [RuleBasedSymbolizer](../)
* namensraum [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* Montage [Aspose.GIS](../../../)

---

## Add(Rule) {#add}

Fügt eine Regel hinzu.

```csharp
public void Add(Rule rule)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rule | Rule | Regel hinzuzufügen. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |

### Siehe auch

* class [Rule](../../rule/)
* class [RuleBasedSymbolizer](../)
* namensraum [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* Montage [Aspose.GIS](../../../)


