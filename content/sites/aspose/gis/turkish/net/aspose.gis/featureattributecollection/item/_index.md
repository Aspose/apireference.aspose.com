---
title: FeatureAttributeCollection.Item
second_title: Aspose.GIS for .NET API Referansı
description: FeatureAttributeCollection mülk. Şunu alır veya ayarlarFeatureAttribute belirtilen dizinde.
type: docs
weight: 30
url: /tr/net/aspose.gis/featureattributecollection/item/
---
## FeatureAttributeCollection indexer (1 of 2)

Şunu alır veya ayarlar:[`FeatureAttribute`](../../featureattribute/) belirtilen dizinde.

```csharp
public FeatureAttribute this[int index] { get; set; }
```

| Parametre | Tanım |
| --- | --- |
| index | Alınacak veya ayarlanacak özniteliğin sıfır tabanlı dizini. |

### Geri dönüş değeri

Belirtilen dizindeki öznitelik.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentOutOfRangeException | Endeks aralığın dışında. |
| InvalidOperationException | Kilitli bir koleksiyonu değiştirmeyi deneyin. |

### Ayrıca bakınız

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* ad alanı [Aspose.Gis](../../featureattributecollection/)
* toplantı [Aspose.GIS](../../../)

---

## FeatureAttributeCollection indexer (2 of 2)

Şunu alır veya ayarlar:[`FeatureAttribute`](../../featureattribute/) belirtilen bir adla.

```csharp
public FeatureAttribute this[string name] { get; }
```

| Parametre | Tanım |
| --- | --- |
| name | Niteliklerin adı. |

### Geri dönüş değeri

Belirtilen ada sahip öznitelik veya`null` eğer bulunmazsa

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | öznitelik adı`null`. |

### Ayrıca bakınız

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* ad alanı [Aspose.Gis](../../featureattributecollection/)
* toplantı [Aspose.GIS](../../../)


