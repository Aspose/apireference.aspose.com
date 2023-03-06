---
title: RuleBasedSymbolizer.Add
second_title: Aspose.GIS untuk Referensi .NET API
description: RuleBasedSymbolizer metode. Menambahkan yang baruRule .
type: docs
weight: 40
url: /id/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/
---
## Add(Func&lt;Feature, bool&gt;, VectorSymbolizer) {#add_1}

Menambahkan yang baru[`Rule`](../../rule/) .

```csharp
public void Add(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| filter | Func`2 | Menentukan kapan simbol harus diterapkan ke fitur. |
| symbolizer | VectorSymbolizer | Symbolizer untuk diterapkan pada fitur kapan*filter* mengembalikan benar. |

### Lihat juga

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [RuleBasedSymbolizer](../)
* ruang nama [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* perakitan [Aspose.GIS](../../../)

---

## Add(Rule) {#add}

Menambahkan aturan.

```csharp
public void Add(Rule rule)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| rule | Rule | Aturan untuk ditambahkan. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |

### Lihat juga

* class [Rule](../../rule/)
* class [RuleBasedSymbolizer](../)
* ruang nama [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* perakitan [Aspose.GIS](../../../)


