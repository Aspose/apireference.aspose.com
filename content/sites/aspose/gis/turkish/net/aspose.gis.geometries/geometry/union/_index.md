---
title: Geometry.Union
second_title: Aspose.GIS for .NET API Referansı
description: Geometry yöntem. Bu geometriyi ve belirtilen bir geometriyi birleştirir.
type: docs
weight: 430
url: /tr/net/aspose.gis.geometries/geometry/union/
---
## Geometry.Union method

Bu geometriyi ve belirtilen bir geometriyi birleştirir.

```csharp
public IGeometry Union(IGeometry other)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| other | IGeometry | Birleştirmek için bir geometri. |

### Geri dönüş değeri

Bu geometrinin birleşimini ve bir bağımsız değişkeni temsil eden bir geometri. Sonuç geometrisi, bu geometride veya bir bağımsız değişkende bulunan nokta kümesini içerir.

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


