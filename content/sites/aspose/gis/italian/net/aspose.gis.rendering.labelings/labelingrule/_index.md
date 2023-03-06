---
title: Class LabelingRule
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Rendering.Labelings.LabelingRule classe. Una regola definita dallutente perRuleBasedLabeling .
type: docs
weight: 1630
url: /it/net/aspose.gis.rendering.labelings/labelingrule/
---
## LabelingRule class

Una regola definita dall'utente per[`RuleBasedLabeling`](../rulebasedlabeling/) .

```csharp
public class LabelingRule
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Filter](../../aspose.gis.rendering.labelings/labelingrule/filter/) { get; } | Determina se "filter-rule" deve applicare l'etichettatura all'elemento. Se restituisce`true` viene utilizzata l'etichettatura; in caso contrario, la funzione viene saltata. |
| [IsElseRule](../../aspose.gis.rendering.labelings/labelingrule/iselserule/) { get; } | Ottiene un valore che indica se questa regola è "altrimenti". |
| [IsFilterRule](../../aspose.gis.rendering.labelings/labelingrule/isfilterrule/) { get; } | Ottiene un valore che indica se questa regola è "filter-rule". |
| [Labeling](../../aspose.gis.rendering.labelings/labelingrule/labeling/) { get; } | Etichettatura da applicare alla caratteristica. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.labelings/labelingrule/createelserule/)(Labeling) | Crea una nuova regola che applica un'etichettatura all'elemento ogni volta che non corrisponde a nessuna regola di filtro. |
| static [CreateFilterRule](../../aspose.gis.rendering.labelings/labelingrule/createfilterrule/)(Func&lt;Feature, bool&gt;, Labeling) | Crea una nuova regola che applica un'etichettatura all'elemento ogni volta che supera il filtro. |

### Guarda anche

* spazio dei nomi [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* assemblea [Aspose.GIS](../../)


