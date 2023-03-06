---
title: GeometryCollection.ToLinearGeometry
second_title: Aspose.GIS لمرجع .NET API
description: GeometryCollection طريقة. الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضيتسامح .
type: docs
weight: 220
url: /ar/net/aspose.gis.geometries/geometrycollection/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_2}

الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام الإعداد الافتراضي`تسامح` .

```csharp
public IGeometryCollection ToLinearGeometry()
```

### قيمة الإرجاع

شكل هندسي لا يحتوي على أشكال هندسية لمنحنى. هذا يعادل[`ToLinearGeometry`](../../igeometrycollection/tolineargeometry/) with افتراضي`تسامح` . تقصير`تسامح` تعتمد قيمة s على[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) من هذه الهندسة:  بالنسبة لـ SRS Tolerance المتوقع هو 0.001 متر (بوحدات SRS) بالنسبة لـ SRS Tolerance الجغرافي هو`1e-5` درجات (بوحدات SRS) بالنسبة إلى غير معروف SRS Tolerance هو`1e-5` لمزيد من التفاصيل حول ماهية التحويلات المطبقة ، يرجى الرجوع إلى[`ToLinearGeometry`](../../igeometrycollection/tolineargeometry/) المواصفات .

### استثناءات

| استثناء | حالة |
| --- | --- |
| InvalidOperationException | هذه الهندسة غير صالحة من هذا القبيل ، ولا يمكن إتمام هذه العملية . |

### أنظر أيضا

* interface [IGeometryCollection](../../igeometrycollection/)
* class [GeometryCollection](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometrycollection/)
* المجسم [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_3}

الحصول على إصدار تقريبي أو مكافئ غير منحني من هذه الهندسة باستخدام المحدد`تسامح` .

```csharp
public IGeometryCollection ToLinearGeometry(double tolerance)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| tolerance | Double | ملف`تسامح`ليستخدم. النتيجة مضمونة أن تكون أقل من`تسامح` بعيدًا عن الهندسة المنحنية _ . |

### قيمة الإرجاع

شكل هندسي لا يحتوي على أشكال هندسية لمنحنى. يتم تطبيق التحولات التالية: CircularString s هي linearized (تتحول إلىLineString ق مع المحدد*tolerance* )CompoundCurve انضمت إلى s`LineString` سCurvePolygon يتم تحويل الصورة إلىPolygon سMultiCurve يتم تحويل الصورة إلىMultiCurve سMultiSurface يتم تحويل الصورة إلىMultiPolygon س نتيجة لذلك ،[`HasCurveGeometry`](../../igeometry/hascurvegeometry/) من هندسة الإخراج`false` .

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentOutOfRangeException | `تسامح` أصغر من أو يساوي`0` . |
| InvalidOperationException | هذه الهندسة غير صالحة من هذا القبيل ، ولا يمكن إتمام هذه العملية . |

### أنظر أيضا

* interface [IGeometryCollection](../../igeometrycollection/)
* class [GeometryCollection](../)
* مساحة الاسم [Aspose.Gis.Geometries](../../geometrycollection/)
* المجسم [Aspose.GIS](../../../)


