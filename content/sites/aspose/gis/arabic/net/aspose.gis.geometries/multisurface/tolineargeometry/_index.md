---
title: MultiSurface.ToLinearGeometry
second_title: Aspose.GIS لمرجع .NET API
description: MultiSurface طريقة. الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضيتسامح .
type: docs
weight: 60
url: /ar/net/aspose.gis.geometries/multisurface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_4}

الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضي`تسامح` .

```csharp
public IMultiPolygon ToLinearGeometry()
```

### قيمة الإرجاع

أ[`IMultiPolygon`](../../imultipolygon/) التي تقترب أو تعادل هذا[`IMultiSurface`](../../imultisurface/). هذا ما يعادل[`ToLinearGeometry`](../../imultisurface/tolineargeometry/) with افتراضي`تسامح` . تقصير`تسامح` تعتمد قيمة s على[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) من هذه الهندسة:  بالنسبة لـ SRS Tolerance المتوقع هو 0.001 متر (بوحدات SRS) بالنسبة لـ SRS Tolerance الجغرافي هو`1e-5` درجات (بوحدات SRS) بالنسبة إلى غير معروف SRS Tolerance هو`1e-5` لمزيد من التفاصيل حول ماهية التحويلات المطبقة ، يرجى الرجوع إلى[`ToLinearGeometry`](../../imultisurface/tolineargeometry/) المواصفات .

### استثناءات

| استثناء | حالة |
| --- | --- |
| InvalidOperationException | هذه الهندسة غير صالحة من هذا القبيل ، ولا يمكن إتمام هذه العملية . |

### أنظر أيضا

* interface [IMultiPolygon](../../imultipolygon/)
* class [MultiSurface](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../multisurface/)
* المجسم [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_5}

الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام المحدد`تسامح` .

```csharp
public IMultiPolygon ToLinearGeometry(double tolerance)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| tolerance | Double | ملف`تسامح`ليستخدم. النتيجة مضمونة أن تكون أقل من`تسامح` بعيدًا عن الهندسة المنحنية ، ما لم يتجاوز عدد النقاط المطلوبة لخطية الشكل الهندسي الحد الأقصى لكل ربع ، يساوي حاليًا 10000 نقطة. |

### قيمة الإرجاع

أ[`IMultiPolygon`](../../imultipolygon/) التي تقترب أو تعادل هذا[`IMultiSurface`](../../imultisurface/) :  إذا كان هذا الكائن[`IMultiPolygon`](../../imultipolygon/) النتيجة نفسها تكون مكافئة لهذا الكائن إذا لم يكن هذا الكائن[`IMultiPolygon`](../../imultipolygon/) - جميع الأسطح مستقيمة وجديدة`متعدد المضلع` تم إنشاؤه

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentOutOfRangeException | `تسامح` أصغر من أو يساوي`0` . |
| InvalidOperationException | هذه الهندسة غير صالحة من هذا القبيل ، ولا يمكن إتمام هذه العملية . |

### أنظر أيضا

* interface [IMultiPolygon](../../imultipolygon/)
* class [MultiSurface](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../multisurface/)
* المجسم [Aspose.GIS](../../../)


