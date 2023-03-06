---
title: Geometry.Covers
second_title: Aspose.GIS for .NET API Referansı
description: Geometry yöntem. Bu geometrinin belirli bir geometriyi kapsayıp kapsamadığını belirler.
type: docs
weight: 160
url: /tr/net/aspose.gis.geometries/geometry/covers/
---
## Geometry.Covers method

Bu geometrinin belirli bir geometriyi kapsayıp kapsamadığını belirler.

```csharp
public bool Covers(IGeometry other)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| other | IGeometry | Bir geometri. |

### Geri dönüş değeri

`true` eğer bu geometri başka bir geometriyi "uzaysal olarak kapsıyorsa".`false` aksi halde.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | Geometrilerden biri, işlemin tamamlanamayacağı şekilde geçersiz. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) geometrilerin eşdeğer değil. Kullanabilirsiniz[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) geometrileri aynı uzamsal referans sistemine dönüştürmek için. |

### Notlar

Bu yöntem, DE-9IM kesişim matrisi açısından bir geometrinin diğerini kapsayıp kapsamadığını test eder. Geometri başka bir geometrinin her noktasını içeriyorsa, bir geometri diğerini kapsar. Bu yöntem şuna benzer:[`SpatiallyContains`](../../igeometry/spatiallycontains/) , ancak geri döner`true` iç ve sınır noktaları arasında ayrım yapmadığından daha sık, . Yani, A geometrisi geometri B'nin sınırında yer alıyorsa,[`SpatiallyContains`](../../igeometry/spatiallycontains/) İadeler`false` , bu yöntem dönerken`true`. Bu yöntem şuna eşdeğerdir:

```csharp
this.Relate(other, "T*****FF*") || this.Relate(other, "*T****FF*") || this.Relate(other, "***T**FF*) || this.Relate(other, "***T*FF*");
```

### Ayrıca bakınız

* method [SpatiallyContains](../../igeometry/spatiallycontains/)
* method [CoveredBy](../../igeometry/coveredby/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)


