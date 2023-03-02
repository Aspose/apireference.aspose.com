---
title: RuleBasedSymbolizer.Add
second_title: Referencia de API de Aspose.GIS para .NET
description: RuleBasedSymbolizer método. Agrega nuevoRule .
type: docs
weight: 40
url: /es/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/
---
## Add(Func&lt;Feature, bool&gt;, VectorSymbolizer) {#add_1}

Agrega nuevo[`Rule`](../../rule/) .

```csharp
public void Add(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| filter | Func`2 | Determina cuándo se debe aplicar el símbolo a una entidad. |
| symbolizer | VectorSymbolizer | Simbolizador para aplicar a una entidad cuando*filter* devuelve verdadero. |

### Ver también

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [RuleBasedSymbolizer](../)
* espacio de nombres [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* asamblea [Aspose.GIS](../../../)

---

## Add(Rule) {#add}

Agrega una regla.

```csharp
public void Add(Rule rule)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| rule | Rule | Regla para agregar. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | El argumento es`null`. |

### Ver también

* class [Rule](../../rule/)
* class [RuleBasedSymbolizer](../)
* espacio de nombres [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* asamblea [Aspose.GIS](../../../)


