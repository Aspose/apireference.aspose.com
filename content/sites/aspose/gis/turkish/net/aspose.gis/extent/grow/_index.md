---
title: Extent.Grow
second_title: Aspose.GIS for .NET API Referansı
description: Extent yöntem. Argümanı içerecek şekilde bu kapsamı büyütür.
type: docs
weight: 160
url: /tr/net/aspose.gis/extent/grow/
---
## Grow(Extent) {#grow}

Argümanı içerecek şekilde bu kapsamı büyütür.

```csharp
public void Grow(Extent extent)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| extent | Extent | Diğer ölçüde. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) bu ölçüde ve argümanın her ikisi de değil`null` ve birbirine eşit değil. |

### Notlar

Eğer[`SpatialReferenceSystem`](../spatialreferencesystem/) bu SRS'nin`null` sonra argümanın SRS'si ile güncellenir.

### Ayrıca bakınız

* class [Extent](../)
* ad alanı [Aspose.Gis](../../extent/)
* toplantı [Aspose.GIS](../../../)

---

## Grow(double, double) {#grow_1}

Belirtilen noktayı içerecek şekilde bu ölçüde büyür.

```csharp
public void Grow(double x, double y)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| x | Double | Eklenecek X koordinatı. |
| y | Double | Dahil edilecek Y koordinatı. |

### Ayrıca bakınız

* class [Extent](../)
* ad alanı [Aspose.Gis](../../extent/)
* toplantı [Aspose.GIS](../../../)


