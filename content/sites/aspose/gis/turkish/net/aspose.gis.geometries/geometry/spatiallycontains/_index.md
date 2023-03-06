---
title: Geometry.SpatiallyContains
second_title: Aspose.GIS for .NET API Referansı
description: Geometry yöntem. Bu geometrinin uzamsal olarak belirli bir geometri içerip içermediğini belirler.
type: docs
weight: 360
url: /tr/net/aspose.gis.geometries/geometry/spatiallycontains/
---
## Geometry.SpatiallyContains method

Bu geometrinin uzamsal olarak belirli bir geometri içerip içermediğini belirler.

```csharp
public bool SpatiallyContains(IGeometry other)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| other | IGeometry | Bir geometri. |

### Geri dönüş değeri

`true`bu geometri başka bir geometriyi "uzaysal olarak içeriyorsa".`false` aksi halde.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | Geometrilerden biri, işlemin tamamlanamayacağı şekilde geçersiz. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) geometrilerin eşdeğer değil. Kullanabilirsiniz[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) geometrileri aynı uzamsal referans sistemine dönüştürmek için. |

### Notlar

Bu yöntem, DE-9IM kesişim matrisi açısından bir geometrinin diğerini içerip içermediğini test eder. Bu yöntem şuna eşdeğerdir:

```csharp
other.Within(this);
```

### Ayrıca bakınız

* method [Within](../../igeometry/within/)
* method [Covers](../../igeometry/covers/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)


