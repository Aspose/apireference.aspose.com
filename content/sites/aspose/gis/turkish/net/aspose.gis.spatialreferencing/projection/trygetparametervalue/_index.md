---
title: Projection.TryGetParameterValue
second_title: Aspose.GIS for .NET API Referansı
description: Projection yöntem. Bu projeksiyonun belirtilen adına sahip parametreyi alır. Böyle bir parametre yoksa  döndürürnull .
type: docs
weight: 60
url: /tr/net/aspose.gis.spatialreferencing/projection/trygetparametervalue/
---
## Projection.TryGetParameterValue method

Bu projeksiyonun belirtilen adına sahip parametreyi alır. Böyle bir parametre yoksa - döndürür`null` .

```csharp
public double? TryGetParameterValue(string name, ParameterType type = ParameterType.Other)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| name | String | Parametrenin adı. |
| type | ParameterType | Parametre türü. Uygulanmayacak birim faktörünü tanımlar: , eğer tür iseLinear Daha sonra[`LinearParametersUnit`](../linearparametersunit/) tip ise uygulamadan kaldırılacak ve sonuç metre cinsinden olacaktır. Angular Daha sonra[`AngularParametersUnit`](../angularparametersunit/) tip ise uygulamadan kaldırılacak ve sonuç radyan cinsinden olacaktır. Otherparametre değeri 'olduğu gibi' döndürülecektir. |

### Geri dönüş değeri

Belirtilen ada sahip parametre veya`null` mevcut değilse.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Argüman boş. |

### Ayrıca bakınız

* enum [ParameterType](../../parametertype/)
* class [Projection](../)
* ad alanı [Aspose.Gis.SpatialReferencing](../../projection/)
* toplantı [Aspose.GIS](../../../)


