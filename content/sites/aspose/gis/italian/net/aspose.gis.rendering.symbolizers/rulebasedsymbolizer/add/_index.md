---
title: RuleBasedSymbolizer.Add
second_title: Riferimento API Aspose.GIS per .NET
description: RuleBasedSymbolizer metodo. Aggiunge nuovoRule .
type: docs
weight: 40
url: /it/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/
---
## Add(Func&lt;Feature, bool&gt;, VectorSymbolizer) {#add_1}

Aggiunge nuovo[`Rule`](../../rule/) .

```csharp
public void Add(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| filter | Func`2 | Determina quando il simbolo deve essere applicato a una feature. |
| symbolizer | VectorSymbolizer | Simbolizzatore da applicare a una caratteristica quando*filter* restituisce vero. |

### Guarda anche

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [RuleBasedSymbolizer](../)
* spazio dei nomi [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* assemblea [Aspose.GIS](../../../)

---

## Add(Rule) {#add}

Aggiunge una regola.

```csharp
public void Add(Rule rule)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rule | Rule | Regola da aggiungere. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |

### Guarda anche

* class [Rule](../../rule/)
* class [RuleBasedSymbolizer](../)
* spazio dei nomi [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* assemblea [Aspose.GIS](../../../)


