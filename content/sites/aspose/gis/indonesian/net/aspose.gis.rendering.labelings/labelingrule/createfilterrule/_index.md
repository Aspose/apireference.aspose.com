---
title: LabelingRule.CreateFilterRule
second_title: Aspose.GIS untuk Referensi .NET API
description: LabelingRule metode. Membuat aturan baru yang menerapkan pelabelan ke fitur setiap kali melewati filter.
type: docs
weight: 20
url: /id/net/aspose.gis.rendering.labelings/labelingrule/createfilterrule/
---
## LabelingRule.CreateFilterRule method

Membuat aturan baru yang menerapkan pelabelan ke fitur setiap kali melewati filter.

```csharp
public static LabelingRule CreateFilterRule(Func<Feature, bool> filter, Labeling labeling)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| filter | Func`2 | Menentukan kapan pelabelan harus digunakan. |
| labeling | Labeling | Pelabelan untuk diterapkan. |

### Nilai Pengembalian

Objek LabelingRule baru.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Filter adalah`null`. |

### Lihat juga

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [LabelingRule](../)
* ruang nama [Aspose.Gis.Rendering.Labelings](../../labelingrule/)
* perakitan [Aspose.GIS](../../../)


