---
title: Rule.CreateFilterRule
second_title: Aspose.GIS for .NET API Referansı
description: Rule yöntem. Filter. özelliğini her geçtiğinde özelliğe bir sembol uygulayan yeni kural oluşturur.
type: docs
weight: 20
url: /tr/net/aspose.gis.rendering.symbolizers/rule/createfilterrule/
---
## Rule.CreateFilterRule method

Filter. özelliğini her geçtiğinde özelliğe bir sembol uygulayan yeni kural oluşturur.

```csharp
public static Rule CreateFilterRule(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| filter | Func`2 | Sembolleştiricinin ne zaman kullanılması gerektiğini belirler. |
| symbolizer | VectorSymbolizer | Uygulanacak simgeleştirici. |

### Geri dönüş değeri

Yeni Kural nesnesi.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Filtre`null`. |

### Ayrıca bakınız

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [Rule](../)
* ad alanı [Aspose.Gis.Rendering.Symbolizers](../../rule/)
* toplantı [Aspose.GIS](../../../)


