---
title: Class Rule
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.Rendering.Symbolizers.Rule clase. Una regla definida por el usuario paraRuleBasedSymbolizer .
type: docs
weight: 1920
url: /es/net/aspose.gis.rendering.symbolizers/rule/
---
## Rule class

Una regla definida por el usuario para[`RuleBasedSymbolizer`](../rulebasedsymbolizer/) .

```csharp
public class Rule
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Filter](../../aspose.gis.rendering.symbolizers/rule/filter/) { get; } | Determina si la "regla de filtro" debe aplicar el símbolo a la entidad. Si devuelve`true` se utiliza el simbolizador; de lo contrario, se omite la característica. |
| [IsElseRule](../../aspose.gis.rendering.symbolizers/rule/iselserule/) { get; } | Obtiene un valor que indica si esta regla es "else-rule". |
| [IsFilterRule](../../aspose.gis.rendering.symbolizers/rule/isfilterrule/) { get; } | Obtiene un valor que indica si esta regla es "regla-filtro". |
| [Symbolizer](../../aspose.gis.rendering.symbolizers/rule/symbolizer/) { get; } | Simbolizador para aplicar a la característica. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.symbolizers/rule/createelserule/)(VectorSymbolizer) | Crea una nueva regla que aplica un símbolo a la entidad siempre que no coincida con ninguna regla de filtro. |
| static [CreateFilterRule](../../aspose.gis.rendering.symbolizers/rule/createfilterrule/)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | Crea una nueva regla que aplica un símbolo a la entidad cada vez que pasa el filtro. |

### Ver también

* espacio de nombres [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* asamblea [Aspose.GIS](../../)


