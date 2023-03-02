---
title: Class Identifier
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.SpatialReferencing.Identifier sınıf. Bir tanımlayıcıyı temsil eder  bir nesnenin harici açıklamasına bir referans. WKTden bir SRS oluşturursanızIdentifier AUTHORITY anahtar sözcüğüne karşılık gelir.
type: docs
weight: 2160
url: /tr/net/aspose.gis.spatialreferencing/identifier/
---
## Identifier class

Bir tanımlayıcıyı temsil eder - bir nesnenin harici açıklamasına bir referans. WKT'den bir SRS oluşturursanız,`Identifier` "AUTHORITY" anahtar sözcüğüne karşılık gelir.

```csharp
public class Identifier : IEquatable<Identifier>
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Identifier](identifier/)(string, string) | Yeni örnek oluştur. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [AuthorityName](../../aspose.gis.spatialreferencing/identifier/authorityname/) { get; } | Veren bir otorite adı[`AuthorityUniqueIdentifier`](./authorityuniqueidentifier/) . |
| [AuthorityUniqueIdentifier](../../aspose.gis.spatialreferencing/identifier/authorityuniqueidentifier/) { get; } | İçinde bir nesneyi temsil etmenin benzersiz bir yolu[`AuthorityName`](./authorityname/) . |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [Epsg](../../aspose.gis.spatialreferencing/identifier/epsg/)(int) | Kodlu EPSG tanımlayıcısını temsil eden yeni Tanımlayıcı oluşturur*epsgCode* . |
| [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals)(Identifier) | Geçerli nesnenin aynı türden başka bir nesneye eşit olup olmadığını gösterir. |
| override [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals_1)(object) | Belirtilen nesnenin geçerli nesneye eşit olup olmadığını belirler. |
| [GetEpsgCode](../../aspose.gis.spatialreferencing/identifier/getepsgcode/)() | Bu nesne geçerli bir EPSG tanımlayıcısını temsil ediyorsa (örn. - yetki adı "EPSG" ve yetki benzersiz tanımlayıcısı tam sayıdır) - onu döndürür. Aksi takdirde - -1. döndür |
| override [GetHashCode](../../aspose.gis.spatialreferencing/identifier/gethashcode/)() | Varsayılan karma işlevi olarak işlev görür. |
| [operator ==](../../aspose.gis.spatialreferencing/identifier/op_equality/) | ==. operatörünü uygular |
| [operator !=](../../aspose.gis.spatialreferencing/identifier/op_inequality/) | !=. operatörünü uygular |

### Örnekler

WGS 84 Mekansal referans sistemi EPSG kodu 4326'ya sahiptir, dolayısıyla tanımlayıcı: içerebilir WGS 84 Elipsoid, EPSG kodu 7030'a sahiptir ve tanımlayıcı: içerebilir

```csharp
new  {  = "EPSG",  = 4326 };
```

```csharp
new  {  = "EPSG",  = 7030 };
```

### Ayrıca bakınız

* ad alanı [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* toplantı [Aspose.GIS](../../)


