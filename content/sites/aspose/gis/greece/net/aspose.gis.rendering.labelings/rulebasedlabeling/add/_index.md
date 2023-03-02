---
title: RuleBasedLabeling.Add
second_title: Αναφορά Aspose.GIS για .NET API
description: RuleBasedLabeling μέθοδος. Προσθέτει νέαLabelingRule .
type: docs
weight: 40
url: /el/net/aspose.gis.rendering.labelings/rulebasedlabeling/add/
---
## Add(Func&lt;Feature, bool&gt;, Labeling) {#add_1}

Προσθέτει νέα[`LabelingRule`](../../labelingrule/) .

```csharp
public void Add(Func<Feature, bool> filter, Labeling labeling)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| filter | Func`2 | Καθορίζει πότε πρέπει να εφαρμόζεται η επισήμανση σε ένα χαρακτηριστικό. |
| labeling | Labeling | Επισήμανση για εφαρμογή σε ένα χαρακτηριστικό όταν*filter* επιστρέφει αληθινό. |

### Δείτε επίσης

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [RuleBasedLabeling](../)
* χώρος ονομάτων [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* συνέλευση [Aspose.GIS](../../../)

---

## Add(LabelingRule) {#add}

Προσθέτει έναν κανόνα.

```csharp
public void Add(LabelingRule rule)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| rule | LabelingRule | Κανόνας για προσθήκη. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |

### Δείτε επίσης

* class [LabelingRule](../../labelingrule/)
* class [RuleBasedLabeling](../)
* χώρος ονομάτων [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* συνέλευση [Aspose.GIS](../../../)


