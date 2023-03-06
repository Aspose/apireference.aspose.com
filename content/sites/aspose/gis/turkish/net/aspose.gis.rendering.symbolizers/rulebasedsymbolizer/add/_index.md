---
title: RuleBasedSymbolizer.Add
second_title: Aspose.GIS for .NET API Referansı
description: RuleBasedSymbolizer yöntem. Yeni eklerRule .
type: docs
weight: 40
url: /tr/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/
---
## Add(Func&lt;Feature, bool&gt;, VectorSymbolizer) {#add_1}

Yeni ekler[`Rule`](../../rule/) .

```csharp
public void Add(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| filter | Func`2 | Bir özelliğe sembolleştiricinin ne zaman uygulanması gerektiğini belirler. |
| symbolizer | VectorSymbolizer | Ne zaman bir özelliğe uygulanacak sembolleştirici*filter* doğru döndürür. |

### Ayrıca bakınız

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [RuleBasedSymbolizer](../)
* ad alanı [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* toplantı [Aspose.GIS](../../../)

---

## Add(Rule) {#add}

Bir kural ekler.

```csharp
public void Add(Rule rule)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| rule | Rule | Eklenecek kural. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |

### Ayrıca bakınız

* class [Rule](../../rule/)
* class [RuleBasedSymbolizer](../)
* ad alanı [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* toplantı [Aspose.GIS](../../../)


