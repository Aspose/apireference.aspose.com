---
title: ICurve.ToLinearGeometry
second_title: Aspose.GIS لمرجع .NET API
description: ICurve طريقة. الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضيتسامح .
type: docs
weight: 50
url: /ar/net/aspose.gis.geometries/icurve/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضي`تسامح` .

```csharp
public ILineString ToLinearGeometry()
```

### قيمة الإرجاع

أ[`ILineString`](../../ilinestring/) الذي يقارب أو يكافئ هذا المنحنى . هذا ما يعادل`ToLinearGeometry` with افتراضي`تسامح` . تقصير`تسامح` تعتمد قيمة s على[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) من هذه الهندسة:  بالنسبة لـ SRS Tolerance المتوقع هو 0.001 متر (بوحدات SRS) بالنسبة لـ SRS Tolerance الجغرافي هو`1e-5` درجات (بوحدات SRS) بالنسبة إلى غير معروف SRS Tolerance هو`1e-5` لمزيد من التفاصيل حول ماهية التحويلات المطبقة ، يرجى الرجوع إلى`ToLinearGeometry` المواصفات .

### استثناءات

| استثناء | حالة |
| --- | --- |
| InvalidOperationException | هذه الهندسة غير صالحة من هذا القبيل ، ولا يمكن إتمام هذه العملية . |

### أنظر أيضا

* interface [ILineString](../../ilinestring/)
* interface [ICurve](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../icurve/)
* المجسم [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام المحدد`تسامح` .

```csharp
public ILineString ToLinearGeometry(double tolerance)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| tolerance | Double | ملف`تسامح`ليستخدم. النتيجة مضمونة أن تكون أقل من`تسامح` بعيدًا عن الهندسة المنحنية ، ما لم يتجاوز عدد النقاط المطلوبة لخطية الشكل الهندسي الحد الأقصى لكل ربع ، يساوي حاليًا 10000 نقطة. |

### قيمة الإرجاع

أ[`ILineString`](../../ilinestring/) التي تقارب هذا المنحنى أو مكافئته:  إذا كان هذا الكائن[`ILineString`](../../ilinestring/) النتيجة نفسها تعادل هذا الكائن إذا كان هذا الكائن[`ICircularString`](../../icircularstring/) والنتيجة هي سلسلة دائرية خطية مع المحدد*tolerance* إذا كان هذا الكائن[`ICompoundCurve`](../../icompoundcurve/) - جميع المنحنيات منه خطية ثم يتم ضمها[`ILineString`](../../ilinestring/)

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentOutOfRangeException | `تسامح` أصغر من أو يساوي`0` . |
| InvalidOperationException | هذه الهندسة غير صالحة من هذا القبيل ، ولا يمكن إتمام هذه العملية . |

### أنظر أيضا

* interface [ILineString](../../ilinestring/)
* interface [ICurve](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../icurve/)
* المجسم [Aspose.GIS](../../../)


