---
title: SpatialReferenceSystem.CreateProjected
second_title: Aspose.GIS for .NET API Referansı
description: SpatialReferenceSystem yöntem. Özel parametrelerden öngörülen SRSyi oluşturun.
type: docs
weight: 380
url: /tr/net/aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/
---
## SpatialReferenceSystem.CreateProjected method

Özel parametrelerden öngörülen SRS'yi oluşturun.

```csharp
public static ProjectedSpatialReferenceSystem CreateProjected(
    ProjectedSpatialReferenceSystemParameters parameters, Identifier identifier = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| parameters | ProjectedSpatialReferenceSystemParameters | Oluşturulacak parametreler. |
| identifier | Identifier | Tanımlayıcı, SRS'ye eklenecek. Tanımlayıcı eklemek, diğer SRS parametrelerini değiştirmeyecektir. Tanımlayıcı ve SRS parametrelerinin tutarlılığını sağlamak size kalmıştır. |

### Geri dönüş değeri

Yeni Öngörülen SRS.

### istisnalar

| istisna | şart |
| --- | --- |
| InvalidOperationException | Parametrelerdeki Temel SRS:`null` . Parametrelerdeki projeksiyon yöntemi:`null` . |

### Ayrıca bakınız

* class [ProjectedSpatialReferenceSystem](../../projectedspatialreferencesystem/)
* class [ProjectedSpatialReferenceSystemParameters](../../projectedspatialreferencesystemparameters/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* ad alanı [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* toplantı [Aspose.GIS](../../../)


