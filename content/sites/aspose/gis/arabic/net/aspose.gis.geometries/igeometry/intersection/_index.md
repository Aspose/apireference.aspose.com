---
title: IGeometry.Intersection
second_title: Aspose.GIS لمرجع .NET API
description: IGeometry طريقة. يبني تقاطعًا بين هذه الهندسة وهندسة محددة.
type: docs
weight: 260
url: /ar/net/aspose.gis.geometries/igeometry/intersection/
---
## IGeometry.Intersection method

يبني تقاطعًا بين هذه الهندسة وهندسة محددة.

```csharp
public IGeometry Intersection(IGeometry other)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| other | IGeometry | هندسة لحساب التقاطع معها. |

### قيمة الإرجاع

هندسة تمثل تقاطع هذه الهندسة ووسيطة. تحتوي هندسة النتيجة على مجموعة النقاط الموجودة في كل من هذه الهندسة والوسيطة.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | *other* يكون`null`. |
| ArgumentException | إحدى الأشكال الهندسية غير صالحة بحيث لا يمكن إنهاء العملية . |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) من الأشكال الهندسية غير متكافئة . يمكنك استخدام[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) من أجل تحويل الأشكال الهندسية إلى نفس النظام المرجعي spatial . |

### أنظر أيضا

* interface [IGeometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../igeometry/)
* المجسم [Aspose.GIS](../../../)


