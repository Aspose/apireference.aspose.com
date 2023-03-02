---
title: MultiCurve.ToLinearGeometry
second_title: Aspose.GIS لمرجع .NET API
description: MultiCurve طريقة. الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام المحددتسامح .
type: docs
weight: 70
url: /ar/net/aspose.gis.geometries/multicurve/tolineargeometry/
---
## ToLinearGeometry(double) {#tolineargeometry_5}

الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام المحدد`تسامح` .

```csharp
public IMultiLineString ToLinearGeometry(double tolerance)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| tolerance | Double | ملف`تسامح`ليستخدم. النتيجة مضمونة أن تكون أقل من`تسامح` بعيدًا عن الهندسة المنحنية ، ما لم يتجاوز عدد النقاط المطلوبة لخطية الشكل الهندسي الحد الأقصى لكل ربع ، يساوي حاليًا 10000 نقطة. |

### قيمة الإرجاع

أ[`IMultiLineString`](../../imultilinestring/) التي تقترب أو تعادل هذا[`IMultiCurve`](../../imulticurve/) :  إذا كان هذا الكائن[`IMultiLineString`](../../imultilinestring/) النتيجة نفسها تكون مكافئة لهذا الكائن إذا لم يكن هذا الكائن[`IMultiLineString`](../../imultilinestring/) - جميع المنحنيات خطية وجديدة`IMultiLineString` تم إنشاؤه

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentOutOfRangeException | `تسامح` أصغر من أو يساوي`0` . |
| InvalidOperationException | هذه الهندسة غير صالحة من هذا القبيل ، ولا يمكن إتمام هذه العملية . |

### أنظر أيضا

* interface [IMultiLineString](../../imultilinestring/)
* class [MultiCurve](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../multicurve/)
* المجسم [Aspose.GIS](../../../)

---

## ToLinearGeometry() {#tolineargeometry_4}

الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضي`تسامح` .

```csharp
public IMultiLineString ToLinearGeometry()
```

### قيمة الإرجاع

أ[`IMultiLineString`](../../imultilinestring/) التي تقترب أو تعادل هذا[`IMultiCurve`](../../imulticurve/). هذا ما يعادل[`ToLinearGeometry`](../../imulticurve/tolineargeometry/) with افتراضي`تسامح` . تقصير`تسامح` تعتمد قيمة s على[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) من هذه الهندسة:  بالنسبة لـ SRS Tolerance المتوقع هو 0.001 متر (بوحدات SRS) بالنسبة لـ SRS Tolerance الجغرافي هو`1e-5` درجات (بوحدات SRS) بالنسبة إلى غير معروف SRS Tolerance هو`1e-5` لمزيد من التفاصيل حول ماهية التحويلات المطبقة ، يرجى الرجوع إلى[`ToLinearGeometry`](../../imulticurve/tolineargeometry/) المواصفات .

### استثناءات

| استثناء | حالة |
| --- | --- |
| InvalidOperationException | هذه الهندسة غير صالحة من هذا القبيل ، ولا يمكن إتمام هذه العملية . |

### أنظر أيضا

* interface [IMultiLineString](../../imultilinestring/)
* class [MultiCurve](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../multicurve/)
* المجسم [Aspose.GIS](../../../)


