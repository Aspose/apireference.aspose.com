---
title: IGeometry.Overlaps
second_title: Aspose.GIS لمرجع .NET API
description: IGeometry طريقة. تحديد ما إذا كان هذا الشكل الهندسي يتداخل مع شكل هندسي محدد.
type: docs
weight: 280
url: /ar/net/aspose.gis.geometries/igeometry/overlaps/
---
## IGeometry.Overlaps method

تحديد ما إذا كان هذا الشكل الهندسي يتداخل مع شكل هندسي محدد.

```csharp
public bool Overlaps(IGeometry other)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| other | IGeometry | هندسة. |

### قيمة الإرجاع

`true` إذا كانت هذه الهندسة "تتداخل مكانيًا" مع هندسة أخرى.`false` خلاف ذلك.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |
| ArgumentException | إحدى الأشكال الهندسية غير صالحة بحيث لا يمكن إنهاء العملية . |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) من الأشكال الهندسية غير متكافئة . يمكنك استخدام[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) من أجل تحويل الأشكال الهندسية إلى نفس النظام المرجعي spatial . |

### ملاحظات

تختبر هذه الطريقة ما إذا كانت الأشكال الهندسية متداخلة من حيث مصفوفة تقاطع DE-9IM. يتداخل شكلان هندسيان إذا كان بينهما بعض وليس كل النقاط الداخلية المشتركة وكان تقاطع الأشكال الهندسية له نفس أبعاد الأشكال الهندسية نفسها. لشخصينPoint هندسة أو اثنتينSurface الأشكال الهندسية تعادل هذه الطريقة _: لشخصينLine الأشكال الهندسية تعادل هذه الطريقة: لشكلين هندسيين بدون تساوي[`Dimension`](../dimension/) هذه الطريقة تعود دائما`false`. راجع مواصفات ميزات OpenGIS البسيطة للحصول على مزيد من التفاصيل حول DE-9IM وعلاقة "التداخل المكاني".

```csharp
this.Relate(other, "T*T***T**");
```

```csharp
this.Relate(other, "1*T***T**");
```

### أنظر أيضا

* interface [IGeometry](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../igeometry/)
* المجسم [Aspose.GIS](../../../)


