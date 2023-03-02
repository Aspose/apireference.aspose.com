---
title: Geometry.Difference
second_title: Aspose.GIS for .NET API Referansı
description: Geometry yöntem. Belirtilen geometriyi bu geometriden çıkarır.
type: docs
weight: 180
url: /tr/net/aspose.gis.geometries/geometry/difference/
---
## Geometry.Difference method

Belirtilen geometriyi bu geometriden çıkarır.

```csharp
public IGeometry Difference(IGeometry other)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| other | IGeometry | Çıkarılacak bir geometri. |

### Geri dönüş değeri

Bu geometrinin bir farkını ve bir bağımsız değişkeni temsil eden bir geometri. Sonuç geometrisi, bu geometride bulunan ancak bir bağımsız değişkende bulunmayan nokta kümesini içerir.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | *other* dır-dir`null`. |
| ArgumentException | Geometrilerden biri, işlemin tamamlanamayacağı şekilde geçersiz. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) geometrilerin eşdeğer değil. Kullanabilirsiniz[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) geometrileri aynı uzamsal referans sistemine dönüştürmek için. |

### Ayrıca bakınız

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)


