---
title: Class LabelingRule
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Rendering.Labelings.LabelingRule kelas. Aturan yang ditentukan pengguna untukRuleBasedLabeling .
type: docs
weight: 1630
url: /id/net/aspose.gis.rendering.labelings/labelingrule/
---
## LabelingRule class

Aturan yang ditentukan pengguna untuk[`RuleBasedLabeling`](../rulebasedlabeling/) .

```csharp
public class LabelingRule
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [Filter](../../aspose.gis.rendering.labelings/labelingrule/filter/) { get; } | Menentukan apakah "aturan filter" harus menerapkan pelabelan ke fitur. Jika kembali`true` pelabelan digunakan; jika tidak, fitur akan dilewati. |
| [IsElseRule](../../aspose.gis.rendering.labelings/labelingrule/iselserule/) { get; } | Mendapat nilai yang menunjukkan apakah aturan ini adalah "aturan lain". |
| [IsFilterRule](../../aspose.gis.rendering.labelings/labelingrule/isfilterrule/) { get; } | Mendapat nilai yang menunjukkan apakah aturan ini adalah "aturan filter". |
| [Labeling](../../aspose.gis.rendering.labelings/labelingrule/labeling/) { get; } | Pemberian label untuk diterapkan pada fitur. |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.labelings/labelingrule/createelserule/)(Labeling) | Membuat aturan baru yang menerapkan pelabelan ke fitur setiap kali tidak cocok dengan aturan filter apa pun. |
| static [CreateFilterRule](../../aspose.gis.rendering.labelings/labelingrule/createfilterrule/)(Func&lt;Feature, bool&gt;, Labeling) | Membuat aturan baru yang menerapkan pelabelan ke fitur setiap kali melewati filter. |

### Lihat juga

* ruang nama [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* perakitan [Aspose.GIS](../../)


