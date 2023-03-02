---
title: Class RuleBasedLabeling
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.Rendering.Labelings.RuleBasedLabeling clase. Aplica un etiquetado a la entidad según las reglas definidas por el usuario.
type: docs
weight: 1690
url: /es/net/aspose.gis.rendering.labelings/rulebasedlabeling/
---
## RuleBasedLabeling class

Aplica un etiquetado a la entidad según las reglas definidas por el usuario.

```csharp
public class RuleBasedLabeling : Labeling, IReadOnlyList<LabelingRule>
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [RuleBasedLabeling](rulebasedlabeling/)() | Constructor predeterminado |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Count](../../aspose.gis.rendering.labelings/rulebasedlabeling/count/) { get; } | Obtiene el número de reglas. |
| [Item](../../aspose.gis.rendering.labelings/rulebasedlabeling/item/) { get; } | Obtiene la regla en el índice especificado. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Add](../../aspose.gis.rendering.labelings/rulebasedlabeling/add/#add)(LabelingRule) | Agrega una regla. |
| [Add](../../aspose.gis.rendering.labelings/rulebasedlabeling/add/#add_1)(Func&lt;Feature, bool&gt;, Labeling) | Agrega nuevo[`LabelingRule`](../labelingrule/) . |
| [AddElseRule](../../aspose.gis.rendering.labelings/rulebasedlabeling/addelserule/)(Labeling) | Agrega un etiquetado que se aplicará a las entidades que no coincidan con ninguna regla de filtrado. |
| [GetEnumerator](../../aspose.gis.rendering.labelings/rulebasedlabeling/getenumerator/)() | Devuelve un enumerador que itera a través de las reglas. |

### Ver también

* class [Labeling](../labeling/)
* class [LabelingRule](../labelingrule/)
* espacio de nombres [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* asamblea [Aspose.GIS](../../)


