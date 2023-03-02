---
title: SpatialReferenceSystem.CreateCompound
second_title: Aspose.GIS for .NET API Referansı
description: SpatialReferenceSystem yöntem. Bileşik SRS. oluştur
type: docs
weight: 340
url: /tr/net/aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/
---
## SpatialReferenceSystem.CreateCompound method

Bileşik SRS. oluştur

```csharp
public static CompoundSpatialReferenceSystem CreateCompound(string name, 
    SpatialReferenceSystem head, SpatialReferenceSystem tail, Identifier identifier = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| name | String | Yeni SRS'nin adı. |
| head | SpatialReferenceSystem | Yeni SRS'nin baş SRS'si. |
| tail | SpatialReferenceSystem | Yeni SRS'nin kuyruk SRS'si. |
| identifier | Identifier | Tanımlayıcı, SRS'ye eklenecek. Tanımlayıcı eklemek, diğer SRS parametrelerini değiştirmeyecektir. Tanımlayıcı ve SRS parametrelerinin tutarlılığını sağlamak size kalmıştır. |

### Geri dönüş değeri

Yeni Bileşik SRS.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | dışında herhangi bir argüman*identifier* dır-dir`null` . |
| InvalidOperationException | *head* veya*tail* bileşik SRS'nin kendileridir. |

### Ayrıca bakınız

* class [CompoundSpatialReferenceSystem](../../compoundspatialreferencesystem/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* ad alanı [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* toplantı [Aspose.GIS](../../../)


