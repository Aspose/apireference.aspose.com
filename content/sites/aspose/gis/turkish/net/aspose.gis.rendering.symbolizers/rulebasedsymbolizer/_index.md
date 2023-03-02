---
title: Class RuleBasedSymbolizer
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Rendering.Symbolizers.RuleBasedSymbolizer sınıf. Kullanıcı tanımlı kurallara göre özellik geometrilerine bir sembolleştirici uygular.
type: docs
weight: 1930
url: /tr/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/
---
## RuleBasedSymbolizer class

Kullanıcı tanımlı kurallara göre özellik geometrilerine bir sembolleştirici uygular.

```csharp
public class RuleBasedSymbolizer : VectorSymbolizer, IReadOnlyList<Rule>
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [RuleBasedSymbolizer](rulebasedsymbolizer/)() | Default_Constructor |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Count](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/count/) { get; } | Kural sayısını alır. |
| [Item](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/item/) { get; } | Belirtilen dizindeki kuralı alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Add](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/#add)(Rule) | Bir kural ekler. |
| [Add](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/#add_1)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | Yeni ekler[`Rule`](../rule/) . |
| [AddElseRule](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/addelserule/)(VectorSymbolizer) | Herhangi bir filtreleme kuralına uymayan özelliklere uygulanacak bir simgeleyici ekler. |
| [GetEnumerator](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/getenumerator/)() | Kurallar arasında yinelenen bir Numaralandırıcı döndürür. |

### Ayrıca bakınız

* class [VectorSymbolizer](../vectorsymbolizer/)
* class [Rule](../rule/)
* ad alanı [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* toplantı [Aspose.GIS](../../)


