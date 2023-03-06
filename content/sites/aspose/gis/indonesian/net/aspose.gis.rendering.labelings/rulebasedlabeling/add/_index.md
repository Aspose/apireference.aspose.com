---
title: RuleBasedLabeling.Add
second_title: Aspose.GIS untuk Referensi .NET API
description: RuleBasedLabeling metode. Menambahkan yang baruLabelingRule .
type: docs
weight: 40
url: /id/net/aspose.gis.rendering.labelings/rulebasedlabeling/add/
---
## Add(Func&lt;Feature, bool&gt;, Labeling) {#add_1}

Menambahkan yang baru[`LabelingRule`](../../labelingrule/) .

```csharp
public void Add(Func<Feature, bool> filter, Labeling labeling)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| filter | Func`2 | Menentukan kapan pelabelan harus diterapkan pada fitur. |
| labeling | Labeling | Pelabelan untuk diterapkan ke fitur kapan*filter* mengembalikan benar. |

### Lihat juga

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [RuleBasedLabeling](../)
* ruang nama [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* perakitan [Aspose.GIS](../../../)

---

## Add(LabelingRule) {#add}

Menambahkan aturan.

```csharp
public void Add(LabelingRule rule)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| rule | LabelingRule | Aturan untuk ditambahkan. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |

### Lihat juga

* class [LabelingRule](../../labelingrule/)
* class [RuleBasedLabeling](../)
* ruang nama [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* perakitan [Aspose.GIS](../../../)


