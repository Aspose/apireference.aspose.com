---
title: Geometry.Intersection
second_title: Aspose.GIS لمرجع .NET API
description: Geometry طريقة. يبني تقاطعًا بين هذه الهندسة وهندسة محددة.
type: docs
weight: 270
url: /ar/net/aspose.gis.geometries/geometry/intersection/
---
## Geometry.Intersection method

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
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) من الأشكال الهندسية غير متكافئة . يمكنك استخدام[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) من أجل تحويل الأشكال الهندسية إلى نفس النظام المرجعي spatial . |

### أنظر أيضا

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometry/)
* المجسم [Aspose.GIS](../../../)


