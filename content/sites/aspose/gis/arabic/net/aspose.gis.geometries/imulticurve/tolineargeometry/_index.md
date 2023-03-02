---
title: IMultiCurve.ToLinearGeometry
second_title: Aspose.GIS لمرجع .NET API
description: IMultiCurve طريقة. الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضيتسامح .
type: docs
weight: 20
url: /ar/net/aspose.gis.geometries/imulticurve/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضي`تسامح` .

```csharp
public IMultiLineString ToLinearGeometry()
```

### قيمة الإرجاع

أ[`IMultiLineString`](../../imultilinestring/) التي تقترب أو تعادل هذا[`IMultiCurve`](../). هذا ما يعادل`ToLinearGeometry` with افتراضي`تسامح` . تقصير`تسامح` تعتمد قيمة s على[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) من هذه الهندسة:  بالنسبة لـ SRS Tolerance المتوقع هو 0.001 متر (بوحدات SRS) بالنسبة لـ SRS Tolerance الجغرافي هو`1e-5` درجات (بوحدات SRS) بالنسبة إلى غير معروف SRS Tolerance هو`1e-5` لمزيد من التفاصيل حول ماهية التحويلات المطبقة ، يرجى الرجوع إلى`ToLinearGeometry` المواصفات .

### استثناءات

| استثناء | حالة |
| --- | --- |
| InvalidOperationException | هذه الهندسة غير صالحة من هذا القبيل ، ولا يمكن إتمام هذه العملية . |

### أنظر أيضا

* interface [IMultiLineString](../../imultilinestring/)
* interface [IMultiCurve](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../imulticurve/)
* المجسم [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام المحدد`تسامح` .

```csharp
public IMultiLineString ToLinearGeometry(double tolerance)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| tolerance | Double | ملف`تسامح`ليستخدم. النتيجة مضمونة أن تكون أقل من`تسامح` بعيدًا عن الهندسة المنحنية ، ما لم يتجاوز عدد النقاط المطلوبة لخطية الشكل الهندسي الحد الأقصى لكل ربع ، يساوي حاليًا 10000 نقطة. |

### قيمة الإرجاع

أ[`IMultiLineString`](../../imultilinestring/) التي تقترب أو تعادل هذا[`IMultiCurve`](../) :  إذا كان هذا الكائن[`IMultiLineString`](../../imultilinestring/) النتيجة نفسها تكون مكافئة لهذا الكائن إذا لم يكن هذا الكائن[`IMultiLineString`](../../imultilinestring/) - جميع المنحنيات خطية وجديدة`IMultiLineString` تم إنشاؤه

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentOutOfRangeException | `تسامح` أصغر من أو يساوي`0` . |
| InvalidOperationException | هذه الهندسة غير صالحة من هذا القبيل ، ولا يمكن إتمام هذه العملية . |

### أنظر أيضا

* interface [IMultiLineString](../../imultilinestring/)
* interface [IMultiCurve](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../imulticurve/)
* المجسم [Aspose.GIS](../../../)


