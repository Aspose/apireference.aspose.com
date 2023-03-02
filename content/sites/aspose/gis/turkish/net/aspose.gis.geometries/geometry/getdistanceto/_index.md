---
title: Geometry.GetDistanceTo
second_title: Aspose.GIS for .NET API Referansı
description: Geometry yöntem. Bu geometri ile belirli bir geometri arasındaki minimum mesafeyi hesaplar.
type: docs
weight: 240
url: /tr/net/aspose.gis.geometries/geometry/getdistanceto/
---
## Geometry.GetDistanceTo method

Bu geometri ile belirli bir geometri arasındaki minimum mesafeyi hesaplar.

```csharp
public double GetDistanceTo(IGeometry other)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| other | IGeometry | Mesafeyi bulmak için bir geometri. |

### Geri dönüş değeri

Her iki geometri de değilse[`IsEmpty`](../isempty/) - geometrilerin en yakın noktaları arasındaki mesafe. En az bir geometri boşsa -1 döndürülür.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) geometrilerin eşdeğer değil. Kullanabilirsiniz[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) geometrileri aynı uzamsal referans sistemine dönüştürmek için. |

### Ayrıca bakınız

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)


