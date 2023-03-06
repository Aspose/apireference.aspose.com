---
title: Class Unit
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.SpatialReferencing.Unit sınıf. Ölçü birimini temsil eder.
type: docs
weight: 2290
url: /tr/net/aspose.gis.spatialreferencing/unit/
---
## Unit class

Ölçü birimini temsil eder.

```csharp
public class Unit : IdentifiableObject
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Unit](unit/)(string, double, Identifier) | Yeni örnek oluştur. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| static [Degree](../../aspose.gis.spatialreferencing/unit/degree/) { get; } | Dereceleri temsil eden Birimi alın. |
| static [Meter](../../aspose.gis.spatialreferencing/unit/meter/) { get; } | Metreleri temsil eden Birimi alın. |
| static [Radian](../../aspose.gis.spatialreferencing/unit/radian/) { get; } | Radyanı temsil eden Birimi alın. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Bu nesne tanımlayıcı EPSG tanımlayıcı ise - kodunu döndürün. Aksi takdirde - -1. döndür |
| [Factor](../../aspose.gis.spatialreferencing/unit/factor/) { get; } | Uzunluk birimi ise metreden metreye, açı birimi ise radyandan faktöre. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Bu tanımlanabilir nesnenin tanımlayıcısı. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Bu nesnenin adı. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Apply](../../aspose.gis.spatialreferencing/unit/apply/)(double) | Bağımsız değişkeni bu örnek tarafından açıklanan birime dönüştürür. |
| [Deapply](../../aspose.gis.spatialreferencing/unit/deapply/)(double) | Bu örnek tarafından açıklanan birimden bağımsız değişkeni radyana veya metreye dönüştürür. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Geçerli nesneyi temsil eden bir dize döndürür. |

### Ayrıca bakınız

* class [IdentifiableObject](../identifiableobject/)
* ad alanı [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* toplantı [Aspose.GIS](../../)


