---
title: RectangleF
second_title: Aspose.Drawing لمرجع NET API
description: يخزن مجموعة من أربعة أرقام فاصلة عائمة تمثل موقع المستطيل وحجمه . لمزيد من وظائف المنطقة المتقدمة  استخدم كائن المنطقة.
type: docs
weight: 1050
url: /ar/net/system.drawing/rectanglef/
---
## RectangleF structure

يخزن مجموعة من أربعة أرقام فاصلة عائمة تمثل موقع المستطيل وحجمه . لمزيد من وظائف المنطقة المتقدمة ، استخدم كائن المنطقة.

```csharp
public struct RectangleF : IEquatable<RectangleF>
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [RectangleF](rectanglef#constructor_1)(PointF, SizeF) | تهيئة مثيل جديد لبنية RectangleF بالموقع والحجم المحددين. |
| [RectangleF](rectanglef#constructor)(float, float, float, float) | تهيئة مثيل جديد لبنية RectangleF بالموقع والحجم المحددين. |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Bottom](../../system.drawing/rectanglef/bottom) { get; } | الحصول على إحداثيات y التي تمثل مجموع Y والارتفاع لبنية RectangleF . |
| [Height](../../system.drawing/rectanglef/height) { get; set; } | الحصول على أو تحديد ارتفاع بنية RectangleF . |
| [IsEmpty](../../system.drawing/rectanglef/isempty) { get; } | يحصل على قيمة تشير إلى ما إذا كان ملفWidth أوHeight property من هذاRectangleFبقيمة صفر . |
| [Left](../../system.drawing/rectanglef/left) { get; } | الحصول على إحداثيات x للحافة اليسرى لهيكل المستطيل F. |
| [Location](../../system.drawing/rectanglef/location) { get; set; } | الحصول على إحداثيات الزاوية اليسرى العلوية أو تحديدهاRectangleF هيكل . |
| [Right](../../system.drawing/rectanglef/right) { get; } | الحصول على إحداثيات x التي تمثل مجموع X وعرض بنية RectangleF . |
| [Size](../../system.drawing/rectanglef/size) { get; set; } | الحصول على أو تحديد حجم هذاRectangleF . |
| [Top](../../system.drawing/rectanglef/top) { get; } | الحصول على إحداثيات y للحافة العلوية لبنية RectangleF . |
| [Width](../../system.drawing/rectanglef/width) { get; set; } | الحصول على أو تحديد عرض بنية RectangleF. |
| [X](../../system.drawing/rectanglef/x) { get; set; } | الحصول على أو تعيين إحداثيات x للركن الأيسر العلوي لبنية RectangleF . |
| [Y](../../system.drawing/rectanglef/y) { get; set; } | الحصول على أو تعيين إحداثيات x للركن الأيسر العلوي لبنية RectangleF . |

## طُرق

| اسم | وصف |
| --- | --- |
| static [FromLTRB](../../system.drawing/rectanglef/fromltrb)(float, float, float, float) | إنشاء هيكل RectangleF مع الزاوية العلوية اليسرى والزاوية اليمنى السفلية في المواقع المحددة . |
| static [Inflate](../../system.drawing/rectanglef/inflate)(RectangleF, float, float) | إنشاء وإرجاع نسخة مضخمة من المحددRectangleF هيكل . تضخم النسخة بالمقدار المحدد. يبقى المستطيل الأصلي بدون تعديل. |
| static [Intersect](../../system.drawing/rectanglef/intersect)(RectangleF, RectangleF) | إرجاع أRectangleF الهيكل الذي يمثل تقاطع مستطيلين . إذا لم يكن هناك تقاطع ، وفارغRectangleF تم إرجاعه . |
| static [Union](../../system.drawing/rectanglef/union)(RectangleF, RectangleF) | لإنشاء أصغر مستطيل ثالث ممكن يمكن أن يحتوي على كلا المستطيلين اللذين يشكلان اتحادًا. |
| [Contains](../../system.drawing/rectanglef/contains#contains_1)(PointF) | لتحديد ما إذا كانت النقطة المحددة متضمنة في هذاRectangleF هيكل . |
| [Contains](../../system.drawing/rectanglef/contains#contains_2)(RectangleF) | لتحديد ما إذا كانت المنطقة المستطيلة ممثلة بـ*rect* موجود بالكامل في هذاRectangleF هيكل . |
| [Contains](../../system.drawing/rectanglef/contains#contains)(float, float) | لتحديد ما إذا كانت النقطة المحددة متضمنة في هذاRectangleF هيكل . |
| override [Equals](../../system.drawing/rectanglef/equals#equals_1)(object) | تحديد ما إذا كان الملف المحددObject ، يساوي هذا المثال. |
| [Equals](../../system.drawing/rectanglef/equals#equals)(RectangleF) | اختبارات أخرى[`RectangleF`](../rectanglef) هيكل له نفس الموقع والحجم من هذا[`RectangleF`](../rectanglef) هيكل . |
| override [GetHashCode](../../system.drawing/rectanglef/gethashcode)() | إرجاع رمز تجزئة لهذا المثال. |
| [Inflate](../../system.drawing/rectanglef/inflate#inflate_1)(SizeF) | ينفخ هذاRectangleF بالمبلغ المحدد. |
| [Inflate](../../system.drawing/rectanglef/inflate#inflate)(float, float) | ينفخ هذاRectangleF هيكل بالمبلغ المحدد. |
| [Intersect](../../system.drawing/rectanglef/intersect)(RectangleF) | يستبدل هذاRectangleF هيكل مع تقاطع نفسه و المحدد RectangleF هيكل . |
| [IntersectsWith](../../system.drawing/rectanglef/intersectswith)(RectangleF) | لتحديد ما إذا كان هذا المستطيل يتقاطع مع*rect* . |
| [Offset](../../system.drawing/rectanglef/offset#offset_1)(PointF) | يضبط موقع هذا المستطيل بالمقدار المحدد. |
| [Offset](../../system.drawing/rectanglef/offset#offset)(float, float) | يضبط موقع هذا المستطيل بالمقدار المحدد. |
| override [ToString](../../system.drawing/rectanglef/tostring)() | تحويل سمات هذا[`Rectangle`](../rectangle) لسلسلة يمكن للبشر قراءتها. |
| [operator ==](../../system.drawing/rectanglef/op_equality) | اختبار ما إذا كان اثنانRectangleF الهياكل لها موقع وحجم متساويين. |
| [implicit operator](../../system.drawing/rectanglef/op_implicit) | تحويل بنية المستطيل المحددة إلى بنية RectangleF. |
| [operator !=](../../system.drawing/rectanglef/op_inequality) | اختبار ما إذا كان اثنانRectangleF تختلف الهياكل في الموقع أو الحجم. |

## مجالات

| اسم | وصف |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectanglef/empty) | يمثل مثيلاً لملفRectangleF فئة مع أعضائها غير مهيأ. |

### أنظر أيضا

* مساحة الاسم [System.Drawing](../../system.drawing)
* المجسم [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
