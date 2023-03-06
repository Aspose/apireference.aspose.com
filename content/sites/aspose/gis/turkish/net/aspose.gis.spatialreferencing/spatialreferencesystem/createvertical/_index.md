---
title: SpatialReferenceSystem.CreateVertical
second_title: Aspose.GIS for .NET API Referansı
description: SpatialReferenceSystem yöntem. Dikey SRS. oluştur
type: docs
weight: 390
url: /tr/net/aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/
---
## SpatialReferenceSystem.CreateVertical method

Dikey SRS. oluştur

```csharp
public static VerticalSpatialReferenceSystem CreateVertical(string name, 
    VerticalDatum verticalDatum, Unit verticalUnit = null, Axis verticalAxis = null, 
    Identifier identifier = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| name | String | SRS'nin adı. Eğer`null` . |
| verticalDatum | VerticalDatum | SRS'de kullanılacak veri. |
| verticalUnit | Unit | SRS'de kullanılacak birim. Eğer`null` ,[`Meter`](../../unit/meter/) kullanılacak. |
| verticalAxis | Axis | SRS'de kullanılmak üzere "yukarı" veya "aşağı" yönlü eksen. Eğer`null` , yukarı yönlü eksen kullanılacaktır. |
| identifier | Identifier | Tanımlayıcı, SRS'ye eklenecek. Tanımlayıcı eklemek, diğer SRS parametrelerini değiştirmeyecektir. Tanımlayıcı ve SRS parametrelerinin tutarlılığını sağlamak size kalmıştır. |

### Geri dönüş değeri

Yeni Dikey SRS.

### istisnalar

| istisna | şart |
| --- | --- |
| InvalidOperationException | *verticalAxis* yön yukarı veya aşağı değildir. |
| ArgumentNullException | Gerekli parametrelerden bazıları boş. |

### Ayrıca bakınız

* class [VerticalSpatialReferenceSystem](../../verticalspatialreferencesystem/)
* class [VerticalDatum](../../verticaldatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* ad alanı [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* toplantı [Aspose.GIS](../../../)


