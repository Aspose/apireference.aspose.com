---
title: Class Projection
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.SpatialReferencing.Projection sınıf. boylam enlemi x y. ye dönüştüren parametrelere sahip bir projeksiyon yöntemini temsil eder.
type: docs
weight: 2240
url: /tr/net/aspose.gis.spatialreferencing/projection/
---
## Projection class

(boylam, enlem)'i (x, y). 'ye dönüştüren parametrelere sahip bir projeksiyon yöntemini temsil eder.

```csharp
public class Projection : IdentifiableObject
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [AngularParametersUnit](../../aspose.gis.spatialreferencing/projection/angularparametersunit/) { get; } | Açısal parametreler için kullanılan birim. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Bu nesne tanımlayıcı EPSG tanımlayıcı ise - kodunu döndürün. Aksi takdirde - -1. döndür |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Bu tanımlanabilir nesnenin tanımlayıcısı. |
| [LinearParametersUnit](../../aspose.gis.spatialreferencing/projection/linearparametersunit/) { get; } | Doğrusal parametreler için kullanılan birim. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Bu nesnenin adı. |
| [ParametersNames](../../aspose.gis.spatialreferencing/projection/parametersnames/) { get; } | Bu projeksiyona verilen parametrelerin adlarının numaralandırılabilir bir koleksiyonunu alır |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [GetParameterValue](../../aspose.gis.spatialreferencing/projection/getparametervalue/)(string, ParameterType) | Bu projeksiyonun belirtilen adına sahip parametreyi alır. |
| [IsEquivalent](../../aspose.gis.spatialreferencing/projection/isequivalent/)(Projection) | İki projeksiyonun eşdeğer olduğunu belirler. Eşdeğer projeksiyonlar (boylam, enlem) ile (x, y)'yi the aynı şekilde eşler. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Geçerli nesneyi temsil eden bir dize döndürür. |
| [TryGetParameterValue](../../aspose.gis.spatialreferencing/projection/trygetparametervalue/)(string, ParameterType) | Bu projeksiyonun belirtilen adına sahip parametreyi alır. Böyle bir parametre yoksa - döndürür`null` . |

### Ayrıca bakınız

* class [IdentifiableObject](../identifiableobject/)
* ad alanı [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* toplantı [Aspose.GIS](../../)


