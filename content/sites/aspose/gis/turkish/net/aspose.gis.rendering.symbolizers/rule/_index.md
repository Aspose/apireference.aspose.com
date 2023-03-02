---
title: Class Rule
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Rendering.Symbolizers.Rule sınıf. için kullanıcı tanımlı bir kuralRuleBasedSymbolizer .
type: docs
weight: 1920
url: /tr/net/aspose.gis.rendering.symbolizers/rule/
---
## Rule class

için kullanıcı tanımlı bir kural[`RuleBasedSymbolizer`](../rulebasedsymbolizer/) .

```csharp
public class Rule
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Filter](../../aspose.gis.rendering.symbolizers/rule/filter/) { get; } | "Filtre kuralı"nın özelliğe sembolleştirici uygulayıp uygulamayacağını belirler. Dönerse`true` sembolize edici kullanılır; aksi halde özellik atlanır. |
| [IsElseRule](../../aspose.gis.rendering.symbolizers/rule/iselserule/) { get; } | Bu kuralın "else-rule" olup olmadığını gösteren bir değer alır. |
| [IsFilterRule](../../aspose.gis.rendering.symbolizers/rule/isfilterrule/) { get; } | Bu kuralın "filter-rule" olup olmadığını gösteren bir değer alır. |
| [Symbolizer](../../aspose.gis.rendering.symbolizers/rule/symbolizer/) { get; } | Özelliğe uygulanacak Simgeleştirici. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.symbolizers/rule/createelserule/)(VectorSymbolizer) | Herhangi bir filtre kuralıyla eşleşmediğinde özelliğe bir sembolleştirici uygulayan yeni kural oluşturur. |
| static [CreateFilterRule](../../aspose.gis.rendering.symbolizers/rule/createfilterrule/)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | Filter. özelliğini her geçtiğinde özelliğe bir sembol uygulayan yeni kural oluşturur. |

### Ayrıca bakınız

* ad alanı [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* toplantı [Aspose.GIS](../../)


