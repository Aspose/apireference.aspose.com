---
title: Surface.ToLinearGeometry
second_title: Aspose.GIS لمرجع .NET API
description: Surface طريقة. الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضيتسامح .
type: docs
weight: 40
url: /ar/net/aspose.gis.geometries/surface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_2}

الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضي`تسامح` .

```csharp
public IPolygon ToLinearGeometry()
```

### قيمة الإرجاع

أ[`IPolygon`](../../ipolygon/) التي تقترب أو تعادل هذا`ISurface`. هذا ما يعادل[`ToLinearGeometry`](../../isurface/tolineargeometry/) with افتراضي`تسامح` . تقصير`تسامح` تعتمد قيمة s على[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) من هذه الهندسة:  بالنسبة لـ SRS Tolerance المتوقع هو 0.001 متر (بوحدات SRS) بالنسبة لـ SRS Tolerance الجغرافي هو`1e-5` درجات (بوحدات SRS) بالنسبة إلى غير معروف SRS Tolerance هو`1e-5` لمزيد من التفاصيل حول ماهية التحويلات المطبقة ، يرجى الرجوع إلى[`ToLinearGeometry`](../../isurface/tolineargeometry/) المواصفات .

### استثناءات

| استثناء | حالة |
| --- | --- |
| InvalidOperationException | هذه الهندسة غير صالحة من هذا القبيل ، ولا يمكن إتمام هذه العملية . |

### أنظر أيضا

* interface [IPolygon](../../ipolygon/)
* class [Surface](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../surface/)
* المجسم [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_3}

الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام المحدد`تسامح` .

```csharp
public IPolygon ToLinearGeometry(double tolerance)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| tolerance | Double | ملف`تسامح`ليستخدم. النتيجة مضمونة أن تكون أقل من`تسامح` بعيدًا عن الهندسة المنحنية ، ما لم يتجاوز عدد النقاط المطلوبة لخطية الشكل الهندسي الحد الأقصى لكل ربع ، يساوي حاليًا 10000 نقطة. |

### قيمة الإرجاع

أ[`IPolygon`](../../ipolygon/) التي تقترب أو تعادل هذا`ISurface` :  إذا كان هذا الكائن[`IPolygon`](../../ipolygon/) النتيجة نفسها تكون مكافئة لهذا الكائن إذا لم يكن هذا الكائن[`IPolygon`](../../ipolygon/) هو خطي و[`IPolygon`](../../ipolygon/) تم إنشاؤه

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentOutOfRangeException | `تسامح` أصغر من أو يساوي`0` . |
| InvalidOperationException | هذه الهندسة غير صالحة من هذا القبيل ، ولا يمكن إتمام هذه العملية . |

### أنظر أيضا

* interface [IPolygon](../../ipolygon/)
* class [Surface](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../surface/)
* المجسم [Aspose.GIS](../../../)


