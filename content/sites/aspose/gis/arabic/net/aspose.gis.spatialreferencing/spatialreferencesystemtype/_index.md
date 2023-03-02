---
title: Enum SpatialReferenceSystemType
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystemType تعداد. يمثل نوع نظام الإسناد المكاني.
type: docs
weight: 2270
url: /ar/net/aspose.gis.spatialreferencing/spatialreferencesystemtype/
---
## SpatialReferenceSystemType enumeration

يمثل نوع نظام الإسناد المكاني.

```csharp
public enum SpatialReferenceSystemType
```

### قيم

| اسم | قيمة | وصف |
| --- | --- | --- |
| Unknown | `0` | القيمة الافتراضية . يمكن إرجاعها من[`Type`](../spatialreferencesystem/type/) إذا كان هذا عبارة عن SRS مركب مع تركيبة غير صالحة من SRSs الأساسية. يرى[`IsCompound`](../spatialreferencesystem/iscompound/) . |
| Geographic | `1` | يعتمد SRS الجغرافي على خط الطول الزاوي وخط العرض الزاوي . يمكن تحويل SRS الجغرافي إلى[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) عبر[`AsGeographic`](../spatialreferencesystem/asgeographic/) طريقة . |
| Geocentric | `2` | SRS هي عبارة عن SRS ديكارتية ثلاثية الأبعاد أصلها في مركز الأرض . يمكن تحويل SRS إلى Geocentric[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) عبر[`AsGeocentric`](../spatialreferencesystem/asgeocentric/) طريقة . |
| Projected | `3` | يعتمد SRS المسقط على X الخطي و Y الخطي. وهو نتيجة لتطبيق إسقاط علىGeographic SRS. يمكن تحويل SRS المتوقع إلى[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) عبر[`AsProjected`](../spatialreferencesystem/asprojected/) طريقة . |
| Vertical | `4` | يصف SRS العمودي إحداثيات الارتفاع الخطي . يمكن تحويل SRS العمودي إلى[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) عبر[`AsVertical`](../spatialreferencesystem/asvertical/) طريقة . |
| Local | `5` | يربط SRS المحلي إحداثيات بجسم ما ، وآخرها Earth . يمكن تحويل SRS المحلي إلى[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) عبر[`AsLocal`](../spatialreferencesystem/aslocal/) طريقة . |

### أنظر أيضا

* مساحة الاسم [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* المجسم [Aspose.GIS](../../)


