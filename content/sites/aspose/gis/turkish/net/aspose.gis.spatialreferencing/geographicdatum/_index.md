---
title: Class GeographicDatum
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.SpatialReferencing.GeographicDatum sınıf. Coğrafi veri dünyadaki belirli bir yerle enlem ve boylamı ilişkilendirir.
type: docs
weight: 2120
url: /tr/net/aspose.gis.spatialreferencing/geographicdatum/
---
## GeographicDatum class

Coğrafi veri, dünyadaki belirli bir yerle enlem ve boylamı ilişkilendirir.

```csharp
public class GeographicDatum : IdentifiableObject
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [GeographicDatum](geographicdatum/)(string, Ellipsoid, BursaWolfParameters, Identifier) | Yeni örnek oluşturur. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| static [Etrs89](../../aspose.gis.spatialreferencing/geographicdatum/etrs89/) { get; } | ETRS 89 verisi. |
| static [Nad83](../../aspose.gis.spatialreferencing/geographicdatum/nad83/) { get; } | NAD 83 verisi. |
| static [Osgb36](../../aspose.gis.spatialreferencing/geographicdatum/osgb36/) { get; } | OSGB 1936 verisi. |
| static [Wgs72](../../aspose.gis.spatialreferencing/geographicdatum/wgs72/) { get; } | WGS 72 verisi. |
| static [Wgs84](../../aspose.gis.spatialreferencing/geographicdatum/wgs84/) { get; } | WGS 84 verisi. |
| [Ellipsoid](../../aspose.gis.spatialreferencing/geographicdatum/ellipsoid/) { get; } | Elipsoid, bu veride Dünya'ya yaklaşmak için kullanıldı. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Bu nesne tanımlayıcı EPSG tanımlayıcı ise - kodunu döndürün. Aksi takdirde - -1. döndür |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Bu tanımlanabilir nesnenin tanımlayıcısı. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Bu nesnenin adı. |
| [ToWgs84Parameters](../../aspose.gis.spatialreferencing/geographicdatum/towgs84parameters/) { get; } | Bu verideki koordinatları WGS84 verisindeki koordinatlara dönüştürmek için kullanılabilecek BursaWolfParamters. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum) | İki datumun eşdeğer olup olmadığını belirler. Eşdeğer datumların aynı koordinatları Dünya'daki aynı yerle eşleşir. Eşdeğer datumların bazı parametreleri farklı olabilir, örneğin[`Name`](../identifiableobject/name/) . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Geçerli nesneyi temsil eden bir dize döndürür. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum, GeographicDatum) | İki datumun eşdeğer olup olmadığını belirler. Eşdeğer datumların aynı koordinatları Dünya'daki aynı yerle eşleşir. Eşdeğer datumların bazı parametreleri farklı olabilir, örneğin[`Name`](../identifiableobject/name/) . |

### Ayrıca bakınız

* class [IdentifiableObject](../identifiableobject/)
* ad alanı [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* toplantı [Aspose.GIS](../../)


