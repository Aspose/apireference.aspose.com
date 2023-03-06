---
title: RuleBasedLabeling.Add
second_title: Aspose.GIS for .NET API Referansı
description: RuleBasedLabeling yöntem. Yeni eklerLabelingRule .
type: docs
weight: 40
url: /tr/net/aspose.gis.rendering.labelings/rulebasedlabeling/add/
---
## Add(Func&lt;Feature, bool&gt;, Labeling) {#add_1}

Yeni ekler[`LabelingRule`](../../labelingrule/) .

```csharp
public void Add(Func<Feature, bool> filter, Labeling labeling)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| filter | Func`2 | Bir özelliğe etiketlemenin ne zaman uygulanması gerektiğini belirler. |
| labeling | Labeling | Ne zaman bir özelliğe uygulanacak etiketleme*filter* doğru döndürür. |

### Ayrıca bakınız

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [RuleBasedLabeling](../)
* ad alanı [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* toplantı [Aspose.GIS](../../../)

---

## Add(LabelingRule) {#add}

Bir kural ekler.

```csharp
public void Add(LabelingRule rule)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| rule | LabelingRule | Eklenecek kural. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |

### Ayrıca bakınız

* class [LabelingRule](../../labelingrule/)
* class [RuleBasedLabeling](../)
* ad alanı [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* toplantı [Aspose.GIS](../../../)


