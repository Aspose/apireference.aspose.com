---
title: Class LabelingRule
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Rendering.Labelings.LabelingRule sınıf. için kullanıcı tanımlı bir kuralRuleBasedLabeling .
type: docs
weight: 1630
url: /tr/net/aspose.gis.rendering.labelings/labelingrule/
---
## LabelingRule class

için kullanıcı tanımlı bir kural[`RuleBasedLabeling`](../rulebasedlabeling/) .

```csharp
public class LabelingRule
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Filter](../../aspose.gis.rendering.labelings/labelingrule/filter/) { get; } | "Filtre kuralı"nın özelliğe etiketleme uygulayıp uygulamayacağını belirler. Dönerse`true` etiketleme kullanılır; aksi halde özellik atlanır. |
| [IsElseRule](../../aspose.gis.rendering.labelings/labelingrule/iselserule/) { get; } | Bu kuralın "else-rule" olup olmadığını gösteren bir değer alır. |
| [IsFilterRule](../../aspose.gis.rendering.labelings/labelingrule/isfilterrule/) { get; } | Bu kuralın "filter-rule" olup olmadığını gösteren bir değer alır. |
| [Labeling](../../aspose.gis.rendering.labelings/labelingrule/labeling/) { get; } | Özelliğe uygulanacak etiketleme. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.labelings/labelingrule/createelserule/)(Labeling) | Herhangi bir filtre kuralıyla eşleşmediğinde özelliğe bir etiketleme uygulayan yeni kural oluşturur. |
| static [CreateFilterRule](../../aspose.gis.rendering.labelings/labelingrule/createfilterrule/)(Func&lt;Feature, bool&gt;, Labeling) | Filtreyi her geçtiğinde özelliğe bir etiketleme uygulayan yeni kural oluşturur. |

### Ayrıca bakınız

* ad alanı [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* toplantı [Aspose.GIS](../../)


