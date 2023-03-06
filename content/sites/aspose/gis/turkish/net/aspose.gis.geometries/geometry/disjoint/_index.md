---
title: Geometry.Disjoint
second_title: Aspose.GIS for .NET API Referansı
description: Geometry yöntem. Bu geometrinin belirli bir geometriden ayrık olup olmadığını belirler.
type: docs
weight: 190
url: /tr/net/aspose.gis.geometries/geometry/disjoint/
---
## Geometry.Disjoint method

Bu geometrinin belirli bir geometriden ayrık olup olmadığını belirler.

```csharp
public bool Disjoint(IGeometry other)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| other | IGeometry | Bir geometri. |

### Geri dönüş değeri

`true` bu geometri başka bir geometriden "uzaysal olarak ayrık" ise.`false` aksi halde.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | Geometrilerden biri, işlemin tamamlanamayacağı şekilde geçersiz. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) geometrilerin eşdeğer değil. Kullanabilirsiniz[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) geometrileri aynı uzamsal referans sistemine dönüştürmek için. |

### Notlar

Bu yöntem, DE-9IM kesişim matrisi açısından geometrilerin ayrık olup olmadığını test eder. Temel olarak, iki geometrinin ortak noktalarının olmadığını test eder. Bu yöntem şuna eşdeğerdir: DE-9IM. hakkında daha fazla ayrıntı için OpenGIS Basit Özellikler Spesifikasyonuna bakın.

```csharp
this.Relate(other, "FF*FF****");
```

### Ayrıca bakınız

* method [Intersects](../../igeometry/intersects/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)


