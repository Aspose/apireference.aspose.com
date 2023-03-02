---
title: IMultiSurface.ToLinearGeometry
second_title: Aspose.GIS لمرجع .NET API
description: IMultiSurface طريقة. الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضيتسامح .
type: docs
weight: 20
url: /ar/net/aspose.gis.geometries/imultisurface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضي`تسامح` .

```csharp
public IMultiPolygon ToLinearGeometry()
```

### قيمة الإرجاع

أ[`IMultiPolygon`](../../imultipolygon/) التي تقترب أو تعادل هذا[`IMultiSurface`](../). هذا ما يعادل`ToLinearGeometry` with افتراضي`تسامح` . تقصير`تسامح` تعتمد قيمة s على[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) من هذه الهندسة:  بالنسبة لـ SRS Tolerance المتوقع هو 0.001 متر (بوحدات SRS) بالنسبة لـ SRS Tolerance الجغرافي هو`1e-5` درجات (بوحدات SRS) بالنسبة إلى غير معروف SRS Tolerance هو`1e-5` لمزيد من التفاصيل حول ماهية التحويلات المطبقة ، يرجى الرجوع إلى`ToLinearGeometry` المواصفات .

### استثناءات

| استثناء | حالة |
| --- | --- |
| InvalidOperationException | هذه الهندسة غير صالحة من هذا القبيل ، ولا يمكن إتمام هذه العملية . |

### أنظر أيضا

* interface [IMultiPolygon](../../imultipolygon/)
* interface [IMultiSurface](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../imultisurface/)
* المجسم [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام المحدد`تسامح` .

```csharp
public IMultiPolygon ToLinearGeometry(double tolerance)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| tolerance | Double | ملف`تسامح`ليستخدم. النتيجة مضمونة أن تكون أقل من`تسامح` بعيدًا عن الهندسة المنحنية ، ما لم يتجاوز عدد النقاط المطلوبة لخطية الشكل الهندسي الحد الأقصى لكل ربع ، يساوي حاليًا 10000 نقطة. |

### قيمة الإرجاع

أ[`IMultiPolygon`](../../imultipolygon/) التي تقترب أو تعادل هذا[`IMultiSurface`](../) :  إذا كان هذا الكائن[`IMultiPolygon`](../../imultipolygon/) النتيجة نفسها تكون مكافئة لهذا الكائن إذا لم يكن هذا الكائن[`IMultiPolygon`](../../imultipolygon/) - جميع الأسطح مستقيمة وجديدة`متعدد المضلع` تم إنشاؤه

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentOutOfRangeException | `تسامح` أصغر من أو يساوي`0` . |
| InvalidOperationException | هذه الهندسة غير صالحة من هذا القبيل ، ولا يمكن إتمام هذه العملية . |

### أنظر أيضا

* interface [IMultiPolygon](../../imultipolygon/)
* interface [IMultiSurface](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../imultisurface/)
* المجسم [Aspose.GIS](../../../)


