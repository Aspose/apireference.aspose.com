---
title: LabelingRule.CreateFilterRule
second_title: Riferimento API Aspose.GIS per .NET
description: LabelingRule metodo. Crea una nuova regola che applica unetichettatura allelemento ogni volta che supera il filtro.
type: docs
weight: 20
url: /it/net/aspose.gis.rendering.labelings/labelingrule/createfilterrule/
---
## LabelingRule.CreateFilterRule method

Crea una nuova regola che applica un'etichettatura all'elemento ogni volta che supera il filtro.

```csharp
public static LabelingRule CreateFilterRule(Func<Feature, bool> filter, Labeling labeling)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| filter | Func`2 | Determina quando deve essere utilizzata l'etichettatura. |
| labeling | Labeling | Etichettatura da applicare. |

### Valore di ritorno

Nuovo oggetto LabelingRule.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il filtro è`null`. |

### Guarda anche

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [LabelingRule](../)
* spazio dei nomi [Aspose.Gis.Rendering.Labelings](../../labelingrule/)
* assemblea [Aspose.GIS](../../../)


