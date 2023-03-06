---
title: Projection.GetParameterValue
second_title: Aspose.GIS for .NET API Referansı
description: Projection yöntem. Bu projeksiyonun belirtilen adına sahip parametreyi alır.
type: docs
weight: 40
url: /tr/net/aspose.gis.spatialreferencing/projection/getparametervalue/
---
## Projection.GetParameterValue method

Bu projeksiyonun belirtilen adına sahip parametreyi alır.

```csharp
public double GetParameterValue(string name, ParameterType type = ParameterType.Other)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| name | String | Parametrenin adı. |
| type | ParameterType | Parametre türü. Uygulanmayacak birim faktörünü tanımlar: , eğer tür iseLinear Daha sonra[`LinearParametersUnit`](../linearparametersunit/) tip ise uygulamadan kaldırılacak ve sonuç metre cinsinden olacaktır. Angular Daha sonra[`AngularParametersUnit`](../angularparametersunit/) tip ise uygulamadan kaldırılacak ve sonuç radyan cinsinden olacaktır. Otherparametre değeri 'olduğu gibi' döndürülecektir. |

### Geri dönüş değeri

Belirtilen ada sahip parametre.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Argüman boş. |
| InvalidOperationException | Bu ada sahip bir parametre yok. |

### Ayrıca bakınız

* enum [ParameterType](../../parametertype/)
* class [Projection](../)
* ad alanı [Aspose.Gis.SpatialReferencing](../../projection/)
* toplantı [Aspose.GIS](../../../)


