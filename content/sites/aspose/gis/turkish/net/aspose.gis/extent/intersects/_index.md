---
title: Extent.Intersects
second_title: Aspose.GIS for .NET API Referansı
description: Extent yöntem. Bu kapsamın bağımsız değişkenle kesişip kesişmediğini belirler.
type: docs
weight: 190
url: /tr/net/aspose.gis/extent/intersects/
---
## Intersects(Extent) {#intersects}

Bu kapsamın bağımsız değişkenle kesişip kesişmediğini belirler.

```csharp
public bool Intersects(Extent extent)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| extent | Extent | Başka bir ölçüde. |

### Geri dönüş değeri

Değer, bu kapsamın bağımsız değişkenle kesişip kesişmediğini gösterir.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) bu ölçüde ve argümanın her ikisi de değil`null` ve birbirine eşit değil. |

### Ayrıca bakınız

* class [Extent](../)
* ad alanı [Aspose.Gis](../../extent/)
* toplantı [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

Bu kapsamın bağımsız değişkenle kesişip kesişmediğini belirler.

```csharp
public bool Intersects(IGeometry geometry)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| geometry | IGeometry | Kesişim için test edilecek bir geometri |

### Geri dönüş değeri

Değer, bu kapsamın bağımsız değişkenle kesişip kesişmediğini gösterir.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) bu ölçüde ve argümanın her ikisi de değil`null` ve birbirine eşit değil. |

### Ayrıca bakınız

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* ad alanı [Aspose.Gis](../../extent/)
* toplantı [Aspose.GIS](../../../)


