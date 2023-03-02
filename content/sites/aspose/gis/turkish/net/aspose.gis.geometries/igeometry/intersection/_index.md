---
title: IGeometry.Intersection
second_title: Aspose.GIS for .NET API Referansı
description: IGeometry yöntem. Bu geometri ile belirtilen bir geometri arasında bir kesişim oluşturur.
type: docs
weight: 260
url: /tr/net/aspose.gis.geometries/igeometry/intersection/
---
## IGeometry.Intersection method

Bu geometri ile belirtilen bir geometri arasında bir kesişim oluşturur.

```csharp
public IGeometry Intersection(IGeometry other)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| other | IGeometry | Kesişimi hesaplamak için bir geometri. |

### Geri dönüş değeri

Bu geometrinin ve bir bağımsız değişkenin kesişimini temsil eden bir geometri. Sonuç geometrisi, hem bu geometride hem de bir bağımsız değişkende bulunan, içeren nokta kümesini içerir.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | *other* dır-dir`null`. |
| ArgumentException | Geometrilerden biri, işlemin tamamlanamayacağı şekilde geçersiz. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) geometrilerin eşdeğer değil. Kullanabilirsiniz[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) geometrileri aynı uzamsal referans sistemine dönüştürmek için. |

### Ayrıca bakınız

* interface [IGeometry](../)
* ad alanı [Aspose.Gis.Geometries](../../igeometry/)
* toplantı [Aspose.GIS](../../../)


