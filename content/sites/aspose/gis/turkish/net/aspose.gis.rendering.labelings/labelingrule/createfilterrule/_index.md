---
title: LabelingRule.CreateFilterRule
second_title: Aspose.GIS for .NET API Referansı
description: LabelingRule yöntem. Filtreyi her geçtiğinde özelliğe bir etiketleme uygulayan yeni kural oluşturur.
type: docs
weight: 20
url: /tr/net/aspose.gis.rendering.labelings/labelingrule/createfilterrule/
---
## LabelingRule.CreateFilterRule method

Filtreyi her geçtiğinde özelliğe bir etiketleme uygulayan yeni kural oluşturur.

```csharp
public static LabelingRule CreateFilterRule(Func<Feature, bool> filter, Labeling labeling)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| filter | Func`2 | Etiketlemenin ne zaman kullanılması gerektiğini belirler. |
| labeling | Labeling | Uygulanacak etiketleme. |

### Geri dönüş değeri

Yeni LabelingRule nesnesi.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Filtre`null`. |

### Ayrıca bakınız

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [LabelingRule](../)
* ad alanı [Aspose.Gis.Rendering.Labelings](../../labelingrule/)
* toplantı [Aspose.GIS](../../../)


