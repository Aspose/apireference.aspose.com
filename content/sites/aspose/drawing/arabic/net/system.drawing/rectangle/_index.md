---
title: Rectangle
second_title: Aspose.Drawing لمرجع NET API
description: يخزن مجموعة من أربعة أعداد صحيحة تمثل موقع وحجم المستطيل.
type: docs
weight: 1040
url: /ar/net/system.drawing/rectangle/
---
## Rectangle structure

يخزن مجموعة من أربعة أعداد صحيحة تمثل موقع وحجم المستطيل.

```csharp
public struct Rectangle : IEquatable<Rectangle>
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Rectangle](rectangle#constructor_1)(Point, Size) | يقوم بتهيئة مثيل جديد لملف[`Rectangle`](../rectangle) بناء مع الموقع والحجم المحددين. |
| [Rectangle](rectangle#constructor)(int, int, int, int) | تهيئة مثيل جديد لهيكل المستطيل بالموقع والحجم المحددين. |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Bottom](../../system.drawing/rectangle/bottom) { get; } | الحصول على إحداثي ص الذي يمثل مجموع قيم خصائص ص والارتفاع لهيكل المستطيل. |
| [Height](../../system.drawing/rectangle/height) { get; set; } | الحصول على أو تحديد ارتفاع بنية المستطيل. |
| [IsEmpty](../../system.drawing/rectangle/isempty) { get; } | يحصل على قيمة تشير إلى ما إذا كانت جميع الخصائص الرقمية لهذا[`Rectangle`](../rectangle) لها قيم صفرية . |
| [Left](../../system.drawing/rectangle/left) { get; } | الحصول على إحداثيات x للحافة اليسرى لهيكل المستطيل. |
| [Location](../../system.drawing/rectangle/location) { get; set; } | الحصول على إحداثيات الزاوية اليسرى العلوية أو تحديدهاRectangle هيكل . |
| [Right](../../system.drawing/rectangle/right) { get; } | الحصول على إحداثيات x التي تمثل مجموع قيم خصائص X و Width لبنية المستطيل. |
| [Size](../../system.drawing/rectangle/size) { get; set; } | الحصول على أو تحديد حجم هذاRectangle . |
| [Top](../../system.drawing/rectangle/top) { get; } | الحصول على إحداثيات y للحافة العلوية لهيكل المستطيل. |
| [Width](../../system.drawing/rectangle/width) { get; set; } | الحصول على أو تحديد عرض بنية المستطيل. |
| [X](../../system.drawing/rectangle/x) { get; set; } | الحصول على أو تحديد إحداثيات x للركن الأيسر العلوي لبنية المستطيل. |
| [Y](../../system.drawing/rectangle/y) { get; set; } | الحصول على أو تحديد إحداثيات y للركن الأيسر العلوي لبنية المستطيل. |

## طُرق

| اسم | وصف |
| --- | --- |
| static [Ceiling](../../system.drawing/rectangle/ceiling)(RectangleF) | تحويل المحددRectangleF هيكل لRectangle هيكل عن طريق تقريبRectangleF القيم إلى قيم الأعداد الصحيحة الأعلى التالية. |
| static [FromLTRB](../../system.drawing/rectangle/fromltrb)(int, int, int, int) | ينشئ ملفRectangle هيكل مع مواقع الحافة المحددة. |
| static [Inflate](../../system.drawing/rectangle/inflate)(Rectangle, int, int) | ينشئ ملف[`Rectangle`](../rectangle) التي يتم تضخيمها بالمبلغ المحدد. |
| static [Intersect](../../system.drawing/rectangle/intersect)(Rectangle, Rectangle) | إرجاع ثلثRectangle الهيكل الذي يمثل تقاطع اثنين آخرينRectangle الهياكل. إذا لم يكن هناك تقاطع ، فارغRectangle تم إرجاعه . |
| static [Round](../../system.drawing/rectangle/round)(RectangleF) | تحويل المحددRectangleF إلى أRectangle عن طريق rounding theRectangleFالقيم لأقرب قيم عدد صحيح. |
| static [Truncate](../../system.drawing/rectangle/truncate)(RectangleF) | تحويل المحددRectangleF إلى أRectangle عن طريق اقتطاعRectangleF القيم . |
| static [Union](../../system.drawing/rectangle/union)(Rectangle, Rectangle) | يحصل على أRectangle هيكل يحتوي على اتحاد اثنينRectangle الهياكل . |
| [Contains](../../system.drawing/rectangle/contains#contains_1)(Point) | لتحديد ما إذا كانت النقطة المحددة متضمنة في هذاRectangle هيكل . |
| [Contains](../../system.drawing/rectangle/contains#contains_2)(Rectangle) | لتحديد ما إذا كانت المنطقة المستطيلة ممثلة بـ*rect* موجود بالكامل داخل المنطقة المستطيلة التي يمثلها هذا[`Rectangle`](../rectangle) . |
| [Contains](../../system.drawing/rectangle/contains#contains)(int, int) | لتحديد ما إذا كانت النقطة المحددة متضمنة في هذاRectangle هيكل . |
| override [Equals](../../system.drawing/rectangle/equals#equals_1)(object) | اختبارات ما إذا كان obj هو ملفRectangle هيكل مع نفس الموقع والحجم من هذاRectangle هيكل . |
| [Equals](../../system.drawing/rectangle/equals#equals)(Rectangle) | اختبارات أخرى[`Rectangle`](../rectangle) هيكل له نفس الموقع والحجم من هذا[`Rectangle`](../rectangle) هيكل . |
| override [GetHashCode](../../system.drawing/rectangle/gethashcode)() | إرجاع كود التجزئة لهذاRectangle بنية. للحصول على معلومات حول استخدام أكواد التجزئة ، راجع GetHashCode . |
| [Inflate](../../system.drawing/rectangle/inflate#inflate_1)(Size) | يكبر هذاRectangle بالمبلغ المحدد. |
| [Inflate](../../system.drawing/rectangle/inflate#inflate)(int, int) | يكبر هذاRectangle بالمبلغ المحدد. |
| [Intersect](../../system.drawing/rectangle/intersect)(Rectangle) | يستبدل هذاRectangleمع تقاطع نفسها والمحددةRectangle . |
| [IntersectsWith](../../system.drawing/rectangle/intersectswith)(Rectangle) | لتحديد ما إذا كان هذا المستطيل يتقاطع مع*rect* . |
| [Offset](../../system.drawing/rectangle/offset#offset_1)(Point) | يضبط موقع هذا المستطيل بالمقدار المحدد. |
| [Offset](../../system.drawing/rectangle/offset#offset)(int, int) | يضبط موقع هذا المستطيل بالمقدار المحدد. |
| override [ToString](../../system.drawing/rectangle/tostring)() | تحويل سمات هذا[`Rectangle`](../rectangle) لسلسلة يمكن للبشر قراءتها. |
| [operator ==](../../system.drawing/rectangle/op_equality) | اختبار ما إذا كان اثنانRectangle الهياكل لها موقع وحجم متساويين. |
| [operator !=](../../system.drawing/rectangle/op_inequality) | اختبار ما إذا كان اثنانRectangle تختلف الهياكل في الموقع أو الحجم. |

## مجالات

| اسم | وصف |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectangle/empty) | يمثل أRectangle هيكل مع خصائصه تركت غير مهيأة. |

### أنظر أيضا

* مساحة الاسم [System.Drawing](../../system.drawing)
* المجسم [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
