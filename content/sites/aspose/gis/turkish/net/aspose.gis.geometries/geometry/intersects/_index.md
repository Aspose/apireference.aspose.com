---
title: Geometry.Intersects
second_title: Aspose.GIS for .NET API Referansı
description: Geometry yöntem. Bu geometrinin belirli bir kapsamla kesişip kesişmediğini belirler.
type: docs
weight: 280
url: /tr/net/aspose.gis.geometries/geometry/intersects/
---
## Intersects(Extent) {#intersects}

Bu geometrinin belirli bir kapsamla kesişip kesişmediğini belirler.

```csharp
public bool Intersects(Extent extent)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| extent | Extent | kapsam. |

### Geri dönüş değeri

`true` bu geometri uzantıyı kesiyorsa;`false` aksi halde.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |

### Ayrıca bakınız

* method [Intersects](../../../aspose.gis/extent/intersects/)
* class [Extent](../../../aspose.gis/extent/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

Bu geometri ile belirli bir geometrinin kesişip kesişmediğini belirler.

```csharp
public bool Intersects(IGeometry other)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| other | IGeometry | Bir geometri. |

### Geri dönüş değeri

`true` eğer bu geometri başka bir geometriyi "uzaysal olarak kesiyorsa".`false` aksi halde.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | Geometrilerden biri, işlemin tamamlanamayacağı şekilde geçersiz. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) geometrilerin eşdeğer değil. Kullanabilirsiniz[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) geometrileri aynı uzamsal referans sistemine dönüştürmek için. |

### Notlar

Bu yöntem şuna eşdeğerdir: Bu,[`Disjoint`](../../igeometry/disjoint/) . Görmek[`Disjoint`](../../igeometry/disjoint/) daha fazla ayrıntı için.

```csharp
!this.Disjoint(other);
```

### Ayrıca bakınız

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)


