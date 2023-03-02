---
title: Class RuleBasedSymbolizer
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.Rendering.Symbolizers.RuleBasedSymbolizer clase. Aplica un símbolo a las geometrías de entidades de acuerdo con las reglas definidas por el usuario.
type: docs
weight: 1930
url: /es/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/
---
## RuleBasedSymbolizer class

Aplica un símbolo a las geometrías de entidades de acuerdo con las reglas definidas por el usuario.

```csharp
public class RuleBasedSymbolizer : VectorSymbolizer, IReadOnlyList<Rule>
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [RuleBasedSymbolizer](rulebasedsymbolizer/)() | Constructor predeterminado |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Count](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/count/) { get; } | Obtiene el número de reglas. |
| [Item](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/item/) { get; } | Obtiene la regla en el índice especificado. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Add](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/#add)(Rule) | Agrega una regla. |
| [Add](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/#add_1)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | Agrega nuevo[`Rule`](../rule/) . |
| [AddElseRule](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/addelserule/)(VectorSymbolizer) | Agrega un símbolo que se aplicará a las entidades que no coincidan con ninguna regla de filtrado. |
| [GetEnumerator](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/getenumerator/)() | Devuelve un enumerador que itera a través de las reglas. |

### Ver también

* class [VectorSymbolizer](../vectorsymbolizer/)
* class [Rule](../rule/)
* espacio de nombres [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* asamblea [Aspose.GIS](../../)


