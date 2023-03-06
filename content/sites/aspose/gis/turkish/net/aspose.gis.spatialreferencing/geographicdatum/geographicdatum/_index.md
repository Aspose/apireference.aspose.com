---
title: GeographicDatum.GeographicDatum
second_title: Aspose.GIS for .NET API Referansı
description: GeographicDatum inşaatçı. Yeni örnek oluşturur.
type: docs
weight: 10
url: /tr/net/aspose.gis.spatialreferencing/geographicdatum/geographicdatum/
---
## GeographicDatum constructor

Yeni örnek oluşturur.

```csharp
public GeographicDatum(string name, Ellipsoid ellipsoid, 
    BursaWolfParameters toWgs84Parameters = null, Identifier identifier = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| name | String | Bu verinin adı. |
| ellipsoid | Ellipsoid | Bu verinin elipsoidi. Boş olamaz. |
| toWgs84Parameters | BursaWolfParameters | Bu datumdaki koordinatları WGS84 datumdaki koordinatlara dönüştürmek için bursa wolf formülüne verilebilecek parametreler. Bu datum WGS84'e yakınsa ve dönüştürme gerekmiyorsa, bursa wolf parametrelerini tüm değerleri 0. olarak ayarlı olarak geçirin. null, ToWgs84 olarak ayarlanacak[`IsNull`](../../bursawolfparameters/isnull/) parametreler. |
| identifier | Identifier | Bu verinin tanımlayıcısı. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | ellipsoid boş. |

### Ayrıca bakınız

* class [Ellipsoid](../../ellipsoid/)
* class [BursaWolfParameters](../../bursawolfparameters/)
* class [Identifier](../../identifier/)
* class [GeographicDatum](../)
* ad alanı [Aspose.Gis.SpatialReferencing](../../geographicdatum/)
* toplantı [Aspose.GIS](../../../)


