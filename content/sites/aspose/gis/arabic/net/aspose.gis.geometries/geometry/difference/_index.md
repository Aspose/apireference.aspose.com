---
title: Geometry.Difference
second_title: Aspose.GIS لمرجع .NET API
description: Geometry طريقة. يطرح هندسة محددة من هذه الهندسة .
type: docs
weight: 180
url: /ar/net/aspose.gis.geometries/geometry/difference/
---
## Geometry.Difference method

يطرح هندسة محددة من هذه الهندسة .

```csharp
public IGeometry Difference(IGeometry other)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| other | IGeometry | هندسة لطرحها. |

### قيمة الإرجاع

شكل هندسي يمثل اختلافًا في هذه الهندسة والوسيطة. تحتوي هندسة النتيجة على مجموعة النقاط الموجودة في هذه الهندسة ولكنها غير موجودة في وسيطة.

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


