---
title: Pen
second_title: Aspose.Drawing لمرجع NET API
description: يحدد كائنًا يستخدم لرسم الخطوط والمنحنيات .
type: docs
weight: 910
url: /ar/net/system.drawing/pen/
---
## Pen class

يحدد كائنًا يستخدم لرسم الخطوط والمنحنيات .

```csharp
public class Pen : IDisposable
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Pen](pen#constructor)(Brush) | يقوم بتهيئة مثيل جديد لملف[`Pen`](../pen) فئة مع المحددBrush . |
| [Pen](pen#constructor_2)(Color) | يقوم بتهيئة مثيل جديد لملف[`Pen`](../pen) فئة مع المحددColor . |
| [Pen](pen#constructor_1)(Brush, float) | تهيئة مثيل جديد لفئة القلم باستخدام الفرشاة والعرض المحددين. |
| [Pen](pen#constructor_3)(Color, float) | تهيئة مثيل جديد لفئة القلم بخصائص اللون والعرض المحددة. |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Alignment](../../system.drawing/pen/alignment) { get; set; } | الحصول على أو تعيين المحاذاة لهذا الغرضPen . |
| [Brush](../../system.drawing/pen/brush) { get; set; } | الحصول على أو تعيين الفرشاة التي تحدد سمات هذاPen . |
| [Color](../../system.drawing/pen/color) { get; set; } | الحصول على اللون أو تحديدهPen . |
| [CompoundArray](../../system.drawing/pen/compoundarray) { get; set; } | الحصول على أو تعيين مصفوفة من القيم التي تحدد قلمًا مركبًا. قلم مركب يرسم خط مركب يتكون من خطوط ومسافات متوازية. |
| [CustomEndCap](../../system.drawing/pen/customendcap) { get; set; } | الحصول على أو تعيين حد أقصى مخصص لاستخدامه في نهاية السطور المرسومة بهذاPen . |
| [CustomStartCap](../../system.drawing/pen/customstartcap) { get; set; } | الحصول على غطاء مخصص أو تعيينه لاستخدامه في بداية السطور المرسومة بهذاPen . |
| [DashCap](../../system.drawing/pen/dashcap) { get; set; } | الحصول على أو تعيين نمط الغطاء المستخدم في نهاية الشرطات التي تشكل خطوطًا متقطعة مرسومة باستخدام this Pen . |
| [DashOffset](../../system.drawing/pen/dashoffset) { get; set; } | الحصول على المسافة من بداية السطر إلى بداية نمط الشرطة أو تحديدها . |
| [DashPattern](../../system.drawing/pen/dashpattern) { get; set; } | الحصول على أو تعيين مصفوفة من الشرطات والمسافات المخصصة. |
| [DashStyle](../../system.drawing/pen/dashstyle) { get; set; } | الحصول على أو تحديد النمط المستخدم للخطوط المتقطعة المرسومة بهذاPen . |
| [EndCap](../../system.drawing/pen/endcap) { get; set; } | الحصول على أو تحديد نمط الغطاء المستخدم في نهاية السطور المرسومة باستخدام هذا القلم . |
| [LineJoin](../../system.drawing/pen/linejoin) { get; set; } | الحصول على أو تحديد نمط الصلة لنهايات سطرين متتاليين مرسومين باستخدام هذا القلم . |
| [MiterLimit](../../system.drawing/pen/miterlimit) { get; set; } | الحصول على أو تعيين حد سماكة الوصلة في الزاوية الميتة . |
| [PenType](../../system.drawing/pen/pentype) { get; } | الحصول على نمط الخطوط المرسومة بهذا القلم. |
| [StartCap](../../system.drawing/pen/startcap) { get; set; } | الحصول على أو تحديد نمط الغطاء المستخدم في بداية الخطوط المرسومة باستخدام هذا القلم. |
| [Transform](../../system.drawing/pen/transform) { get; set; } | الحصول على نسخة من التحويل الهندسي لهذا الغرض أو تعيينهاPen . |
| [Width](../../system.drawing/pen/width) { get; set; } | الحصول على عرض هذا القلم أو تحديده ، بوحدات كائن الرسومات المستخدمة في الرسم . |

## طُرق

| اسم | وصف |
| --- | --- |
| [Clone](../../system.drawing/pen/clone)() | لإنشاء نسخة طبق الأصل من هذاPen . |
| [Dispose](../../system.drawing/pen/dispose)() | يصدر جميع الموارد التي يستخدمها هذا القلم . |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform#multiplytransform)(Matrix) | تضرب مصفوفة التحويل لهذا الغرضPen حسب المحددMatrix . |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | تضرب مصفوفة التحويل لهذا الغرضPen حسب المحددMatrix بالترتيب المحدد. |
| [ResetTransform](../../system.drawing/pen/resettransform)() | يعيد تعيين مصفوفة التحويل الهندسي لهذا الغرضPen للهوية . |
| [RotateTransform](../../system.drawing/pen/rotatetransform#rotatetransform)(float) | يدير التحويل الهندسي المحلي بالزاوية المحددة. تعمل هذه الطريقة على تمهيد الدوران للتحويل. |
| [RotateTransform](../../system.drawing/pen/rotatetransform#rotatetransform_1)(float, MatrixOrder) | يقوم بتدوير التحويل الهندسي المحلي بالزاوية المحددة بالترتيب المحدد. |
| [ScaleTransform](../../system.drawing/pen/scaletransform#scaletransform)(float, float) | مقياس التحويل الهندسي المحلي بالعوامل المحددة. تضيف هذه الطريقة مصفوفة القياس إلى التحويل. |
| [ScaleTransform](../../system.drawing/pen/scaletransform#scaletransform_1)(float, float, MatrixOrder) | مقياس التحويل الهندسي المحلي بواسطة العوامل المحددة بالترتيب المحدد. |
| [SetLineCap](../../system.drawing/pen/setlinecap)(LineCap, LineCap, DashCap) | يضبط القيم التي تحدد نمط الغطاء المستخدم لإنهاء الخطوط المرسومة بواسطة هذا[`Pen`](../pen) . |
| [TranslateTransform](../../system.drawing/pen/translatetransform#translatetransform)(float, float) | يترجم التحويل الهندسي المحلي بالأبعاد المحددة. تضيف هذه الطريقة الترجمة إلى التحويل. |
| [TranslateTransform](../../system.drawing/pen/translatetransform#translatetransform_1)(float, float, MatrixOrder) | يترجم التحويل الهندسي المحلي بالأبعاد المحددة بالترتيب المحدد. |

### أنظر أيضا

* مساحة الاسم [System.Drawing](../../system.drawing)
* المجسم [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
