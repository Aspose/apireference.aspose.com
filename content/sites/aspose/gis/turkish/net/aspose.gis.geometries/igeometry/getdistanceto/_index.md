---
title: IGeometry.GetDistanceTo
second_title: Aspose.GIS for .NET API Referansı
description: IGeometry yöntem. Bu geometri ile belirli bir geometri arasındaki minimum mesafeyi hesaplar.
type: docs
weight: 230
url: /tr/net/aspose.gis.geometries/igeometry/getdistanceto/
---
## IGeometry.GetDistanceTo method

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
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) geometrilerin eşdeğer değil. Kullanabilirsiniz[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) geometrileri aynı uzamsal referans sistemine dönüştürmek için. |

### Ayrıca bakınız

* interface [IGeometry](../)
* ad alanı [Aspose.Gis.Geometries](../../igeometry/)
* toplantı [Aspose.GIS](../../../)


