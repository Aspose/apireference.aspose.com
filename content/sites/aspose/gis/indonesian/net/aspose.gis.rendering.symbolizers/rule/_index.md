---
title: Class Rule
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Rendering.Symbolizers.Rule kelas. Aturan yang ditentukan pengguna untukRuleBasedSymbolizer .
type: docs
weight: 1920
url: /id/net/aspose.gis.rendering.symbolizers/rule/
---
## Rule class

Aturan yang ditentukan pengguna untuk[`RuleBasedSymbolizer`](../rulebasedsymbolizer/) .

```csharp
public class Rule
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [Filter](../../aspose.gis.rendering.symbolizers/rule/filter/) { get; } | Menentukan apakah "aturan filter" harus menerapkan simbol ke fitur. Jika kembali`true` simbol digunakan; jika tidak, fitur akan dilewati. |
| [IsElseRule](../../aspose.gis.rendering.symbolizers/rule/iselserule/) { get; } | Mendapat nilai yang menunjukkan apakah aturan ini adalah "aturan lain". |
| [IsFilterRule](../../aspose.gis.rendering.symbolizers/rule/isfilterrule/) { get; } | Mendapat nilai yang menunjukkan apakah aturan ini adalah "aturan filter". |
| [Symbolizer](../../aspose.gis.rendering.symbolizers/rule/symbolizer/) { get; } | Symbolizer untuk diterapkan pada fitur. |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.symbolizers/rule/createelserule/)(VectorSymbolizer) | Membuat aturan baru yang menerapkan simbol ke fitur setiap kali tidak cocok dengan aturan filter apa pun. |
| static [CreateFilterRule](../../aspose.gis.rendering.symbolizers/rule/createfilterrule/)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | Membuat aturan baru yang menerapkan simbol ke fitur setiap kali melewati filter. |

### Lihat juga

* ruang nama [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* perakitan [Aspose.GIS](../../)


