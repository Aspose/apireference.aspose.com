---
title: Rule.CreateFilterRule
second_title: Aspose.GIS untuk Referensi .NET API
description: Rule metode. Membuat aturan baru yang menerapkan simbol ke fitur setiap kali melewati filter.
type: docs
weight: 20
url: /id/net/aspose.gis.rendering.symbolizers/rule/createfilterrule/
---
## Rule.CreateFilterRule method

Membuat aturan baru yang menerapkan simbol ke fitur setiap kali melewati filter.

```csharp
public static Rule CreateFilterRule(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| filter | Func`2 | Menentukan kapan simbol harus digunakan. |
| symbolizer | VectorSymbolizer | Simbol untuk diterapkan. |

### Nilai Pengembalian

Objek Aturan Baru.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Filter adalah`null`. |

### Lihat juga

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [Rule](../)
* ruang nama [Aspose.Gis.Rendering.Symbolizers](../../rule/)
* perakitan [Aspose.GIS](../../../)


