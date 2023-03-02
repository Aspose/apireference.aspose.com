---
title: Class Ellipsoid
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.SpatialReferencing.Ellipsoid sınıf. Elipsoid dünyaya yaklaşan bir elipsoidi temsil eder.
type: docs
weight: 2070
url: /tr/net/aspose.gis.spatialreferencing/ellipsoid/
---
## Ellipsoid class

Elipsoid, dünyaya yaklaşan bir elipsoidi temsil eder.

```csharp
public class Ellipsoid : IdentifiableObject
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Ellipsoid](ellipsoid/)(string, double, double, Identifier) | Yeni Elipsoid. oluşturur |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| static [Airy](../../aspose.gis.spatialreferencing/ellipsoid/airy/) { get; } | Havadar elipsoid. |
| static [Grs80](../../aspose.gis.spatialreferencing/ellipsoid/grs80/) { get; } | GRS 1980 Elipsoid. |
| static [Wgs72](../../aspose.gis.spatialreferencing/ellipsoid/wgs72/) { get; } | WGS 72 Elipsoid. |
| static [Wgs84](../../aspose.gis.spatialreferencing/ellipsoid/wgs84/) { get; } | WGS 84 Elipsoid. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Bu nesne tanımlayıcı EPSG tanımlayıcı ise - kodunu döndürün. Aksi takdirde - -1. döndür |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Bu tanımlanabilir nesnenin tanımlayıcısı. |
| [InverseFlattening](../../aspose.gis.spatialreferencing/ellipsoid/inverseflattening/) { get; } | Elipsoidin ters düzleşmesi. 0, eğer bu bir küre ise. |
| [IsSphere](../../aspose.gis.spatialreferencing/ellipsoid/issphere/) { get; } | Bu elipsoidin bir küre olup olmadığını algılar. |
| [IsValid](../../aspose.gis.spatialreferencing/ellipsoid/isvalid/) { get; } | Elipsoidin geçerli olup olmadığını algılar: yarı ana ekseni 0'dan fazladır ve ters düzleştirme pozitif veya 0'a eşittir. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Bu nesnenin adı. |
| [SemiMajorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semimajoraxis/) { get; } | Elipsoidin yarı ana ekseni. |
| [SemiMinorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semiminoraxis/) { get; } | Elipsoidin yarı küçük ekseni. Bu bir küre ise yarı ana eksene eşittir. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid) | İki elipsoidin eşdeğer olup olmadığını belirler. Elipsoid A, elipsoid B'ye eşdeğerse, aynı yarı ana eksene ve ters düzleşmeye sahiptirler. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Geçerli nesneyi temsil eden bir dize döndürür. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid, Ellipsoid) | İki elipsoidin eşdeğer olup olmadığını belirler. Elipsoid A, elipsoid B'ye eşdeğerse, aynı yarı ana eksene ve ters düzleşmeye sahiptirler. |

### Ayrıca bakınız

* class [IdentifiableObject](../identifiableobject/)
* ad alanı [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* toplantı [Aspose.GIS](../../)


