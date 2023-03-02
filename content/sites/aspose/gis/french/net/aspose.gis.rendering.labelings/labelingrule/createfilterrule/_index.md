---
title: LabelingRule.CreateFilterRule
second_title: Référence de l'API Aspose.GIS pour .NET
description: LabelingRule méthode. Crée une nouvelle règle qui applique un étiquetage à lentité chaque fois quelle passe le filtre.
type: docs
weight: 20
url: /fr/net/aspose.gis.rendering.labelings/labelingrule/createfilterrule/
---
## LabelingRule.CreateFilterRule method

Crée une nouvelle règle qui applique un étiquetage à l'entité chaque fois qu'elle passe le filtre.

```csharp
public static LabelingRule CreateFilterRule(Func<Feature, bool> filter, Labeling labeling)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| filter | Func`2 | Détermine quand l'étiquetage doit être utilisé. |
| labeling | Labeling | Etiquetage à appliquer. |

### Return_Value

Nouvel objet LabelingRule.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le filtre est`null`. |

### Voir également

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [LabelingRule](../)
* espace de noms [Aspose.Gis.Rendering.Labelings](../../labelingrule/)
* Assemblée [Aspose.GIS](../../../)


