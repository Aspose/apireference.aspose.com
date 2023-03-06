---
title: Class RuleBasedLabeling
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.Rendering.Labelings.RuleBasedLabeling classe. Applique un étiquetage à lentité selon des règles définies par lutilisateur.
type: docs
weight: 1690
url: /fr/net/aspose.gis.rendering.labelings/rulebasedlabeling/
---
## RuleBasedLabeling class

Applique un étiquetage à l'entité selon des règles définies par l'utilisateur.

```csharp
public class RuleBasedLabeling : Labeling, IReadOnlyList<LabelingRule>
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [RuleBasedLabeling](rulebasedlabeling/)() | Default_Constructor |

## Propriétés

| Nom | La description |
| --- | --- |
| [Count](../../aspose.gis.rendering.labelings/rulebasedlabeling/count/) { get; } | Obtient le nombre de règles. |
| [Item](../../aspose.gis.rendering.labelings/rulebasedlabeling/item/) { get; } | Obtient la règle à l'index spécifié. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Add](../../aspose.gis.rendering.labelings/rulebasedlabeling/add/#add)(LabelingRule) | Ajoute une règle. |
| [Add](../../aspose.gis.rendering.labelings/rulebasedlabeling/add/#add_1)(Func&lt;Feature, bool&gt;, Labeling) | Ajoute de nouveaux[`LabelingRule`](../labelingrule/) . |
| [AddElseRule](../../aspose.gis.rendering.labelings/rulebasedlabeling/addelserule/)(Labeling) | Ajoute un étiquetage qui sera appliqué aux fonctionnalités qui ne correspondent à aucune règle de filtrage. |
| [GetEnumerator](../../aspose.gis.rendering.labelings/rulebasedlabeling/getenumerator/)() | Retourne un énumérateur qui parcourt les règles. |

### Voir également

* class [Labeling](../labeling/)
* class [LabelingRule](../labelingrule/)
* espace de noms [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* Assemblée [Aspose.GIS](../../)


