---
title: Geometry.Crosses
second_title: Aspose.GIS لمرجع .NET API
description: Geometry طريقة. تحديد ما إذا كانت هذه الهندسة مع تقاطع هندسي محدد.
type: docs
weight: 170
url: /ar/net/aspose.gis.geometries/geometry/crosses/
---
## Geometry.Crosses method

تحديد ما إذا كانت هذه الهندسة مع تقاطع هندسي محدد.

```csharp
public bool Crosses(IGeometry other)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| other | IGeometry | هندسة. |

### قيمة الإرجاع

`true` إذا كانت هذه الهندسة "تتقاطع مكانيًا" مع هندسة أخرى.`false` خلاف ذلك.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |
| ArgumentException | إحدى الأشكال الهندسية غير صالحة بحيث لا يمكن إنهاء العملية . |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) من الأشكال الهندسية غير متكافئة . يمكنك استخدام[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) من أجل تحويل الأشكال الهندسية إلى نفس النظام المرجعي spatial . |

### ملاحظات

تختبر هذه الطريقة ما إذا كانت الأشكال الهندسية عبارة عن تقاطعات من حيث مصفوفة تقاطع DE-9IM . يتقاطع شكلان هندسيان إذا كان لديهما بعض وليس كل النقاط الداخلية المشتركة و يكون بُعد التقاطع أقل من بُعد واحد على الأقل من الهندسة . أي: اثنان[`LineString`](../../linestring/) تقاطع s ، إذا كانوا يشكلون حرف "X" ، و LineString و a[`Polygon`](../../polygon/) تقاطع إذا كانت LineString تمر عبر داخل Polygon. راجع مواصفات ميزات OpenGIS البسيطة للحصول على مزيد من التفاصيل حول علاقة DE-9IM وعلاقة "التقاطع المكاني".

### أنظر أيضا

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometry/)
* المجسم [Aspose.GIS](../../../)


