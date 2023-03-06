---
title: Class LabelingRule
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.Rendering.Labelings.LabelingRule classe. Une règle définie par lutilisateur pourRuleBasedLabeling .
type: docs
weight: 1630
url: /fr/net/aspose.gis.rendering.labelings/labelingrule/
---
## LabelingRule class

Une règle définie par l'utilisateur pour[`RuleBasedLabeling`](../rulebasedlabeling/) .

```csharp
public class LabelingRule
```

## Propriétés

| Nom | La description |
| --- | --- |
| [Filter](../../aspose.gis.rendering.labelings/labelingrule/filter/) { get; } | Détermine si "filter-rule" doit appliquer l'étiquetage à l'entité. Si renvoie`true` l'étiquetage est utilisé ; sinon, la fonctionnalité est ignorée. |
| [IsElseRule](../../aspose.gis.rendering.labelings/labelingrule/iselserule/) { get; } | Obtient une valeur indiquant si cette règle est "else-rule". |
| [IsFilterRule](../../aspose.gis.rendering.labelings/labelingrule/isfilterrule/) { get; } | Obtient une valeur indiquant si cette règle est "filter-rule". |
| [Labeling](../../aspose.gis.rendering.labelings/labelingrule/labeling/) { get; } | Libellé à appliquer à l'entité. |

## Méthodes

| Nom | La description |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.labelings/labelingrule/createelserule/)(Labeling) | Crée une nouvelle règle qui applique un étiquetage à l'entité chaque fois qu'elle ne correspond à aucune règle de filtrage. |
| static [CreateFilterRule](../../aspose.gis.rendering.labelings/labelingrule/createfilterrule/)(Func&lt;Feature, bool&gt;, Labeling) | Crée une nouvelle règle qui applique un étiquetage à l'entité chaque fois qu'elle passe le filtre. |

### Voir également

* espace de noms [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* Assemblée [Aspose.GIS](../../)


