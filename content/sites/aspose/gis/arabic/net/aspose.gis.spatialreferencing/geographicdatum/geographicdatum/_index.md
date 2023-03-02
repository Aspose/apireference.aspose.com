---
title: GeographicDatum.GeographicDatum
second_title: Aspose.GIS لمرجع .NET API
description: GeographicDatum البناء. إنشاء مثيل جديد .
type: docs
weight: 10
url: /ar/net/aspose.gis.spatialreferencing/geographicdatum/geographicdatum/
---
## GeographicDatum constructor

إنشاء مثيل جديد .

```csharp
public GeographicDatum(string name, Ellipsoid ellipsoid, 
    BursaWolfParameters toWgs84Parameters = null, Identifier identifier = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| name | String | اسم هذا المرجع. |
| ellipsoid | Ellipsoid | الإليبسويد من هذا الإسناد. لا يمكن أن يكون فارغًا. |
| toWgs84Parameters | BursaWolfParameters | المعلمات ، التي يمكن إعطاؤها لصيغة ذئب الجراب ، لتحويل الإحداثيات في هذا المرجع إلى إحداثيات في مرجع WGS84. إذا كان هذا المرجع قريبًا من WGS84 وليس هناك حاجة للتحويل ، قم بتمرير معلمات ذئب الجراب مع تعيين جميع القيم على 0. إذا خالية ، سيتم تعيين ToWgs84 على[`IsNull`](../../bursawolfparameters/isnull/) المعلمات . |
| identifier | Identifier | معرّف هذا الإسناد. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | ellipsoid باطل. |

### أنظر أيضا

* class [Ellipsoid](../../ellipsoid/)
* class [BursaWolfParameters](../../bursawolfparameters/)
* class [Identifier](../../identifier/)
* class [GeographicDatum](../)
* مساحة الاسم [Aspose.Gis.SpatialReferencing](../../geographicdatum/)
* المجسم [Aspose.GIS](../../../)


