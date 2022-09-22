---
title: LinearGradientBrush
second_title: Aspose.Drawing لمرجع NET API
description: يغلف أBrush مع تدرج خطي. لا يمكن توريث هذه الفئة.
type: docs
weight: 340
url: /ar/net/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class

يغلف أBrush مع تدرج خطي. لا يمكن توريث هذه الفئة.

```csharp
public sealed class LinearGradientBrush : Brush
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [LinearGradientBrush](lineargradientbrush#constructor)(Point, Point, Color, Color) | يقوم بتهيئة مثيل جديد لملف[`LinearGradientBrush`](../lineargradientbrush) فئة بالنقاط والألوان المحددة. |
| [LinearGradientBrush](lineargradientbrush#constructor_1)(PointF, PointF, Color, Color) | يقوم بتهيئة مثيل جديد لملف[`LinearGradientBrush`](../lineargradientbrush) فئة بالنقاط والألوان المحددة. |
| [LinearGradientBrush](lineargradientbrush#constructor_2)(Rectangle, Color, Color, float) | يقوم بتهيئة مثيل جديد لملف[`LinearGradientBrush`](../lineargradientbrush)فئة تستند إلى مستطيل ، ألوان البداية والنهاية ، وزاوية الاتجاه. |
| [LinearGradientBrush](lineargradientbrush#constructor_4)(Rectangle, Color, Color, LinearGradientMode) | يقوم بتهيئة مثيل جديد لملف[`LinearGradientBrush`](../lineargradientbrush) فئة تستند إلى مستطيل ، ألوان البداية والنهاية والاتجاه. |
| [LinearGradientBrush](lineargradientbrush#constructor_5)(RectangleF, Color, Color, float) | يقوم بتهيئة مثيل جديد لملف[`LinearGradientBrush`](../lineargradientbrush)فئة تستند إلى مستطيل ، ألوان البداية والنهاية ، وزاوية الاتجاه. |
| [LinearGradientBrush](lineargradientbrush#constructor_7)(RectangleF, Color, Color, LinearGradientMode) | يقوم بتهيئة مثيل جديد لملف[`LinearGradientBrush`](../lineargradientbrush) فئة تستند إلى مستطيل ، ألوان البداية والنهاية ، ووضع الاتجاه. |
| [LinearGradientBrush](lineargradientbrush#constructor_3)(Rectangle, Color, Color, float, bool) | يقوم بتهيئة مثيل جديد لملف[`LinearGradientBrush`](../lineargradientbrush)فئة تستند إلى مستطيل ، ألوان البداية والنهاية ، وزاوية الاتجاه. |
| [LinearGradientBrush](lineargradientbrush#constructor_6)(RectangleF, Color, Color, float, bool) | يقوم بتهيئة مثيل جديد لملف[`LinearGradientBrush`](../lineargradientbrush)فئة تستند إلى مستطيل ، ألوان البداية والنهاية ، وزاوية الاتجاه. |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/lineargradientbrush/blend) { get; set; } | يحصل أو يحدد أBlend التي تحدد المواضع والعوامل التي تحدد انخفاض custom للتدرج اللوني. |
| [GammaCorrection](../../system.drawing.drawing2d/lineargradientbrush/gammacorrection) { get; set; } | الحصول على أو تعيين قيمة تشير إلى ما إذا كان تصحيح جاما ممكّنًا لذلكLinearGradientBrush . |
| [InterpolationColors](../../system.drawing.drawing2d/lineargradientbrush/interpolationcolors) { get; set; } | يحصل أو يحدد أColorBlendالتي تحدد تدرج خطي متعدد الألوان. |
| [LinearColors](../../system.drawing.drawing2d/lineargradientbrush/linearcolors) { get; set; } | الحصول على أو تعيين ألوان البداية والنهاية للتدرج. |
| [Rectangle](../../system.drawing.drawing2d/lineargradientbrush/rectangle) { get; } | يحصل على منطقة مستطيلة تحدد نقطتي البداية والنهاية للتدرج اللوني. |
| [Transform](../../system.drawing.drawing2d/lineargradientbrush/transform) { get; set; } | الحصول على نسخة أو تعيينهاMatrix التي تحدد التحويل الهندسي المحلي لهذا الغرضLinearGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/lineargradientbrush/wrapmode) { get; set; } | يحصل أو يحدد أWrapMode التعداد الذي يشير إلى التفاف mode لهذاLinearGradientBrush . |

## طُرق

| اسم | وصف |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/lineargradientbrush/clone)() | لإنشاء نسخة طبق الأصل من هذاLinearGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose)() | يقوم بإصدار كافة الموارد المستخدمة بواسطة كائن الفرشاة هذا . |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform#multiplytransform)(Matrix) | يضاعفMatrix الذي يمثل التحويل الهندسي المحلي لهذاLinearGradientBrush حسب المحددMatrix عن طريق prepending المحددMatrix . |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | يضاعفMatrix الذي يمثل التحويل الهندسي المحلي لهذاLinearGradientBrush حسب المحددMatrix بالترتيب المحدد. |
| [ResetTransform](../../system.drawing.drawing2d/lineargradientbrush/resettransform)() | يعيد تعيين ملفTransform الخاصية للهوية . |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform#rotatetransform)(float) | يقوم بتدوير التحويل الهندسي المحلي بالمقدار المحدد. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | يقوم بتدوير التحويل الهندسي المحلي بالمقدار المحدد بالترتيب المحدد. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform#scaletransform)(float, float) | قياس التحويل الهندسي المحلي بالكميات المحددة. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | قياس التحويل الهندسي المحلي بالمقادير المحددة بالترتيب المحدد. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape#setblendtriangularshape)(float) | ينشئ تدرجًا خطيًا بلون مركزي وانحدار خطي إلى لون واحد على كلا الطرفين. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape#setblendtriangularshape_1)(float, float) | ينشئ تدرجًا خطيًا بلون مركزي وانحدار خطي إلى لون واحد على كلا الطرفين. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape#setsigmabellshape)(float) | إنشاء انخفاض في التدرج بناءً على منحنى على شكل جرس . |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape#setsigmabellshape_1)(float, float) | إنشاء انخفاض في التدرج بناءً على منحنى على شكل جرس . |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform#translatetransform)(float, float) | يترجم التحويل الهندسي المحلي بالأبعاد المحددة. هذه الطريقة تسبق الترجمة إلى التحويل. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | يترجم التحويل الهندسي المحلي بالأبعاد المحددة بالترتيب المحدد. |

### أنظر أيضا

* class [Brush](../../system.drawing/brush)
* مساحة الاسم [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* المجسم [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
