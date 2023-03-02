---
title: Class RuleBasedSymbolizer
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Rendering.Symbolizers.RuleBasedSymbolizer classe. Applica un simbolo alle geometrie delle caratteristiche in base alle regole definite dallutente.
type: docs
weight: 1930
url: /it/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/
---
## RuleBasedSymbolizer class

Applica un simbolo alle geometrie delle caratteristiche in base alle regole definite dall'utente.

```csharp
public class RuleBasedSymbolizer : VectorSymbolizer, IReadOnlyList<Rule>
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [RuleBasedSymbolizer](rulebasedsymbolizer/)() | Default_Costruttore |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Count](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/count/) { get; } | Ottiene il numero di regole. |
| [Item](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/item/) { get; } | Ottiene la regola in corrispondenza dell'indice specificato. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Add](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/#add)(Rule) | Aggiunge una regola. |
| [Add](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/#add_1)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | Aggiunge nuovo[`Rule`](../rule/) . |
| [AddElseRule](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/addelserule/)(VectorSymbolizer) | Aggiunge un simbolo che verrà applicato alle caratteristiche che non corrispondono a nessuna regola di filtro. |
| [GetEnumerator](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/getenumerator/)() | Restituisce un enumeratore che scorre le regole. |

### Guarda anche

* class [VectorSymbolizer](../vectorsymbolizer/)
* class [Rule](../rule/)
* spazio dei nomi [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* assemblea [Aspose.GIS](../../)


