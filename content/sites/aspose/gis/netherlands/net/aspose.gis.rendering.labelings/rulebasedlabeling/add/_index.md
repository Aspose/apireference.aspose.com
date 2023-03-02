---
title: RuleBasedLabeling.Add
second_title: Aspose.GIS voor .NET API-referentie
description: RuleBasedLabeling methode. Voegt nieuwe toeLabelingRule .
type: docs
weight: 40
url: /nl/net/aspose.gis.rendering.labelings/rulebasedlabeling/add/
---
## Add(Func&lt;Feature, bool&gt;, Labeling) {#add_1}

Voegt nieuwe toe[`LabelingRule`](../../labelingrule/) .

```csharp
public void Add(Func<Feature, bool> filter, Labeling labeling)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| filter | Func`2 | Bepaalt wanneer labeling moet worden toegepast op een functie. |
| labeling | Labeling | Labels om toe te passen op een functie wanneer*filter* retourneert waar. |

### Zie ook

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [RuleBasedLabeling](../)
* naamruimte [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* montage [Aspose.GIS](../../../)

---

## Add(LabelingRule) {#add}

Voegt een regel toe.

```csharp
public void Add(LabelingRule rule)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rule | LabelingRule | Regel om toe te voegen. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |

### Zie ook

* class [LabelingRule](../../labelingrule/)
* class [RuleBasedLabeling](../)
* naamruimte [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* montage [Aspose.GIS](../../../)


