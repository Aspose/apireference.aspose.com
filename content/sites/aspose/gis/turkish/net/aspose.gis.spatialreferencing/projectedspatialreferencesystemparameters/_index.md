---
title: Class ProjectedSpatialReferenceSystemParameters
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystemParameters sınıf. Projeksiyonlu SRS oluşturmak için parametreler. Bazı parametrelerin varsayılanları vardır. Bazı parametrelerin makul varsayılanları vardır bu nedenle yalnızca bunları atamanız gerekmez. Eğer atarsanıznull bu parametreler için varsayılan bir değer kullanılacaktır. ProjectionMethodName VeBase varsayılanlarınız yok  bazı olmayanları atamanız gerekirnull bu özelliklere değer.
type: docs
weight: 2230
url: /tr/net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/
---
## ProjectedSpatialReferenceSystemParameters class

Projeksiyonlu SRS oluşturmak için parametreler. Bazı parametrelerin varsayılanları vardır. Bazı parametrelerin makul varsayılanları vardır, bu nedenle yalnızca bunları atamanız gerekmez. Eğer atarsanız`null` bu parametreler için varsayılan bir değer kullanılacaktır. [`ProjectionMethodName`](./projectionmethodname/) Ve[`Base`](./base/) varsayılanlarınız yok - bazı olmayanları atamanız gerekir`null` bu özelliklere değer.

```csharp
public class ProjectedSpatialReferenceSystemParameters
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [ProjectedSpatialReferenceSystemParameters](projectedspatialreferencesystemparameters/)() | Default_Constructor |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/axisesorder/) { get; set; } | Eksen sırası. varsayılanlarXY . |
| [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) { get; set; } | Temel coğrafi SRS (projeksiyonun uygulandığı SRS). Bu özelliği değil olarak ayarlamanız GEREKİR`null` geçerli bir SRS oluşturmak için değer, bu özelliğin herhangi bir öndeğeri yoktur. |
| [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/linearunit/) { get; set; } | Bu SRS'de kullanılacak birimler. varsayılan[`Meter`](../unit/meter/) . |
| [Name](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/name/) { get; set; } | Öngörülen SRS'nin adı. Varsayılan "Adsız"dır. |
| [ProjectionMethodIdentifier](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodidentifier/) { get; set; } | Projeksiyon yönteminin tanımlayıcısı. Varsayılan bir değer yoktur, bu parametreyi değil olarak ayarlayabilirsiniz.`null` Projeksiyona tanımlayıcı eklemek istiyorsanız, value, . Bunu yaparsanız - tanımlayıcının tutarlı projeksiyonda olmasını sağlamak size kalmış method name (bu özelliği ayarladığınızda projeksiyon yöntemi adı değişmeyecektir). |
| [ProjectionMethodName](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) { get; set; } | Projeksiyon yönteminin adı. Varsayılan yoktur ve bu parametreyi değil olarak ayarlamanız GEREKİR.`null` değer, çünkü projeksiyon adı olmadan öngörülen SRS işe yaramaz. |
| [XAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/xaxis/) { get; set; } | X (yatay) boyutunu açıklayan eksen. Varsayılan olarak doğu yönüne sahip eksendir. |
| [YAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/yaxis/) { get; set; } | Y (dikey) boyutunu tanımlayan eksen. Varsayılan olarak kuzey yönüne sahip eksendir. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AddProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/addprojectionparameter/)(string, double) | Bu SRS'ye projeksiyon parametresi ekler. Bu ada sahip parametre zaten eklenmişse - güncelleyin. |
| [GetProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/getprojectionparameter/)(string) | Belirtilen ada sahip projeksiyon parametresini alır. |

### Ayrıca bakınız

* ad alanı [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* toplantı [Aspose.GIS](../../)


