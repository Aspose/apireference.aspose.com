---
title: Extent.Contains
second_title: Aspose.GIS لمرجع .NET API
description: Extent طريقة. لتحديد ما إذا كان هذا النطاق يحتوي على إحداثي محدد بواسطة الوسيطات.
type: docs
weight: 120
url: /ar/net/aspose.gis/extent/contains/
---
## Contains(double, double) {#contains_2}

لتحديد ما إذا كان هذا النطاق يحتوي على إحداثي محدد بواسطة الوسيطات.

```csharp
public bool Contains(double x, double y)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| x | Double | X للإحداثيات. |
| y | Double | Y للإحداثيات. |

### قيمة الإرجاع

القيمة ، تشير إلى ما إذا كان التنسيق داخل المربع المحيط.

### ملاحظات

الإحداثيات الموجودة في حدود هذا[`Extent`](../) are الواردة في هذا[`Extent`](../) .

### أنظر أيضا

* class [Extent](../)
* مساحة الاسم [Aspose.Gis](../../extent/)
* المجسم [Aspose.GIS](../../../)

---

## Contains(Extent) {#contains}

لتحديد ما إذا كان هذا النطاق يحتوي على الوسيطة.

```csharp
public bool Contains(Extent extent)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| extent | Extent | مدى آخر. |

### قيمة الإرجاع

القيمة ، تشير إلى ما إذا كان هذا المدى يحتوي على الوسيطة.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) من هذا المدى والحجة كلاهما ليس كذلك`null` ولا تساوي بعضها البعض. |

### ملاحظات

الإحداثيات الموجودة في حدود هذا[`Extent`](../) are الواردة في هذا[`Extent`](../) . لهذا السبب ، تعتبر النطاقات المتساوية لتحتوي على بعضها البعض.

### أنظر أيضا

* class [Extent](../)
* مساحة الاسم [Aspose.Gis](../../extent/)
* المجسم [Aspose.GIS](../../../)

---

## Contains(IGeometry) {#contains_1}

لتحديد ما إذا كان هذا النطاق يحتوي على الوسيطة.

```csharp
public bool Contains(IGeometry geometry)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| geometry | IGeometry | هندسة لاختبار الاحتواء. |

### قيمة الإرجاع

القيمة ، تشير إلى ما إذا كان هذا المدى يحتوي على الوسيطة.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الحجة`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) من هذا المدى والحجة كلاهما ليس كذلك`null` ولا تساوي بعضها البعض. |

### ملاحظات

الإحداثيات الموجودة في حدود هذا[`Extent`](../) are الواردة في هذا[`Extent`](../) .

### أنظر أيضا

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* مساحة الاسم [Aspose.Gis](../../extent/)
* المجسم [Aspose.GIS](../../../)


