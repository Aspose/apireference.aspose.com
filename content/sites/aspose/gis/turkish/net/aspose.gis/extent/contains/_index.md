---
title: Extent.Contains
second_title: Aspose.GIS for .NET API Referansı
description: Extent yöntem. Bu kapsamın bağımsız değişkenler tarafından tanımlanan bir koordinat içerip içermediğini belirler.
type: docs
weight: 120
url: /tr/net/aspose.gis/extent/contains/
---
## Contains(double, double) {#contains_2}

Bu kapsamın bağımsız değişkenler tarafından tanımlanan bir koordinat içerip içermediğini belirler.

```csharp
public bool Contains(double x, double y)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| x | Double | koordinatın X'i. |
| y | Double | Y koordinatı. |

### Geri dönüş değeri

Koordinatın sınırlayıcı kutunun içinde olup olmadığını gösteren değer.

### Notlar

Bunun sınırlarında bulunan koordinatlar[`Extent`](../) are bunun içerdiği kabul edilir[`Extent`](../) .

### Ayrıca bakınız

* class [Extent](../)
* ad alanı [Aspose.Gis](../../extent/)
* toplantı [Aspose.GIS](../../../)

---

## Contains(Extent) {#contains}

Bu kapsamın bağımsız değişkeni içerip içermediğini belirler.

```csharp
public bool Contains(Extent extent)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| extent | Extent | Başka bir ölçüde. |

### Geri dönüş değeri

Değer, bu kapsamın bağımsız değişkeni içerip içermediğini gösterir.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) bu ölçüde ve argümanın her ikisi de değil`null` ve birbirine eşit değil. |

### Notlar

Bunun sınırlarında bulunan koordinatlar[`Extent`](../) are bunun içerdiği kabul edilir[`Extent`](../) . Bu nedenle, eşit kapsamların birbirini içermesi olarak kabul edilir.

### Ayrıca bakınız

* class [Extent](../)
* ad alanı [Aspose.Gis](../../extent/)
* toplantı [Aspose.GIS](../../../)

---

## Contains(IGeometry) {#contains_1}

Bu kapsamın bağımsız değişkeni içerip içermediğini belirler.

```csharp
public bool Contains(IGeometry geometry)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| geometry | IGeometry | Muhafaza için test edilecek bir geometri. |

### Geri dönüş değeri

Değer, bu kapsamın bağımsız değişkeni içerip içermediğini gösterir.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) bu ölçüde ve argümanın her ikisi de değil`null` ve birbirine eşit değil. |

### Notlar

Bunun sınırlarında bulunan koordinatlar[`Extent`](../) are bunun içerdiği kabul edilir[`Extent`](../) .

### Ayrıca bakınız

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* ad alanı [Aspose.Gis](../../extent/)
* toplantı [Aspose.GIS](../../../)


