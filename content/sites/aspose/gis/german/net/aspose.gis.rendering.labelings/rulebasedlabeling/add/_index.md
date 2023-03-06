---
title: RuleBasedLabeling.Add
second_title: Aspose.GIS für .NET-API-Referenz
description: RuleBasedLabeling methode. Fügt neu hinzuLabelingRule .
type: docs
weight: 40
url: /de/net/aspose.gis.rendering.labelings/rulebasedlabeling/add/
---
## Add(Func&lt;Feature, bool&gt;, Labeling) {#add_1}

Fügt neu hinzu[`LabelingRule`](../../labelingrule/) .

```csharp
public void Add(Func<Feature, bool> filter, Labeling labeling)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| filter | Func`2 | Legt fest, wann eine Beschriftung auf ein Feature angewendet werden soll. |
| labeling | Labeling | Beschriftung, die wann auf ein Feature angewendet werden soll*filter* gibt wahr zurück. |

### Siehe auch

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [RuleBasedLabeling](../)
* namensraum [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* Montage [Aspose.GIS](../../../)

---

## Add(LabelingRule) {#add}

Fügt eine Regel hinzu.

```csharp
public void Add(LabelingRule rule)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rule | LabelingRule | Regel hinzuzufügen. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |

### Siehe auch

* class [LabelingRule](../../labelingrule/)
* class [RuleBasedLabeling](../)
* namensraum [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* Montage [Aspose.GIS](../../../)


