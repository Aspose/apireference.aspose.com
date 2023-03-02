---
title: IGeometry.SpatiallyEquals
second_title: Aspose.GIS لمرجع .NET API
description: IGeometry طريقة. يحدد ما إذا كانت هذه الهندسة مساوية مكانيًا لهندسة محددة.
type: docs
weight: 320
url: /ar/net/aspose.gis.geometries/igeometry/spatiallyequals/
---
## IGeometry.SpatiallyEquals method

يحدد ما إذا كانت هذه الهندسة مساوية مكانيًا لهندسة محددة.

```csharp
public bool SpatiallyEquals(IGeometry other)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| other | IGeometry | هندسة. |

### قيمة الإرجاع

`true` إذا كانت هذه الهندسة "مساوية مكانيًا" للهندسة المحددة.`false` خلاف ذلك.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |
| ArgumentException | إحدى الأشكال الهندسية غير صالحة بحيث لا يمكن إنهاء العملية . |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) من الأشكال الهندسية غير متكافئة . يمكنك استخدام[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) من أجل تحويل الأشكال الهندسية إلى نفس النظام المرجعي spatial . |

### ملاحظات

تختبر هذه الطريقة المساواة من حيث مصفوفة تقاطع DE-9IM. وهي لا تعتمد على order للمكونات (على سبيل المثال ترتيب الحلقات الداخلية في المضلع) وقيم Z و M. في الأساس ، تختبر أن شكلين هندسيين يشغلان نفس "الفضاء" عند عرضهما على مساحة ثنائية الأبعاد. هذه الطريقة تعادل: راجع مواصفات ميزات OpenGIS البسيطة للحصول على مزيد من التفاصيل حول DE-9IM.

```csharp
this.Relate(other, "T*F**FFF*");
```

### أنظر أيضا

* interface [IGeometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../igeometry/)
* المجسم [Aspose.GIS](../../../)


