---
title: Class Rule
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Rendering.Symbolizers.Rule classe. Una regola definita dallutente perRuleBasedSymbolizer .
type: docs
weight: 1920
url: /it/net/aspose.gis.rendering.symbolizers/rule/
---
## Rule class

Una regola definita dall'utente per[`RuleBasedSymbolizer`](../rulebasedsymbolizer/) .

```csharp
public class Rule
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Filter](../../aspose.gis.rendering.symbolizers/rule/filter/) { get; } | Determina se "filter-rule" deve applicare il simbolo all'elemento. Se restituisce`true` viene utilizzato il simbolista; in caso contrario, la funzione viene saltata. |
| [IsElseRule](../../aspose.gis.rendering.symbolizers/rule/iselserule/) { get; } | Ottiene un valore che indica se questa regola è "altrimenti". |
| [IsFilterRule](../../aspose.gis.rendering.symbolizers/rule/isfilterrule/) { get; } | Ottiene un valore che indica se questa regola è "filter-rule". |
| [Symbolizer](../../aspose.gis.rendering.symbolizers/rule/symbolizer/) { get; } | Simbolo da applicare alla caratteristica. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.symbolizers/rule/createelserule/)(VectorSymbolizer) | Crea una nuova regola che applica un simbolo all'elemento ogni volta che non corrisponde a nessuna regola di filtro. |
| static [CreateFilterRule](../../aspose.gis.rendering.symbolizers/rule/createfilterrule/)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | Crea una nuova regola che applica un simbolo all'elemento ogni volta che supera il filtro. |

### Guarda anche

* spazio dei nomi [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* assemblea [Aspose.GIS](../../)


