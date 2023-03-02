---
title: Rule.CreateFilterRule
second_title: Riferimento API Aspose.GIS per .NET
description: Rule metodo. Crea una nuova regola che applica un simbolo allelemento ogni volta che supera il filtro.
type: docs
weight: 20
url: /it/net/aspose.gis.rendering.symbolizers/rule/createfilterrule/
---
## Rule.CreateFilterRule method

Crea una nuova regola che applica un simbolo all'elemento ogni volta che supera il filtro.

```csharp
public static Rule CreateFilterRule(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| filter | Func`2 | Determina quando deve essere utilizzato il simbolo. |
| symbolizer | VectorSymbolizer | Simbolizzatore da applicare. |

### Valore di ritorno

Nuovo oggetto Regola.

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Il filtro è`null`. |

### Guarda anche

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [Rule](../)
* spazio dei nomi [Aspose.Gis.Rendering.Symbolizers](../../rule/)
* assemblea [Aspose.GIS](../../../)


