---
title: PathGradientBrush
second_title: Aspose.Drawing لمرجع NET API
description: يغلف أBrush الكائن الذي يملأ الجزء الداخلي منGraphicsPath كائن بتدرج لوني . لا يمكن توريث هذه الفئة .
type: docs
weight: 400
url: /ar/net/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class

يغلف أBrush الكائن الذي يملأ الجزء الداخلي منGraphicsPath كائن بتدرج لوني . لا يمكن توريث هذه الفئة .

```csharp
public sealed class PathGradientBrush : Brush
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [PathGradientBrush](pathgradientbrush#constructor)(GraphicsPath) | يقوم بتهيئة مثيل جديد لملف[`PathGradientBrush`](../pathgradientbrush) فئة بالمسار المحدد. |
| [PathGradientBrush](pathgradientbrush#constructor_1)(PointF[]) | يقوم بتهيئة مثيل جديد لملف[`PathGradientBrush`](../pathgradientbrush) فئة بالنقاط المحددة. |
| [PathGradientBrush](pathgradientbrush#constructor_3)(Point[]) | يقوم بتهيئة مثيل جديد لملف[`PathGradientBrush`](../pathgradientbrush) فئة بالنقاط المحددة. |
| [PathGradientBrush](pathgradientbrush#constructor_2)(PointF[], WrapMode) | يقوم بتهيئة مثيل جديد لملف[`PathGradientBrush`](../pathgradientbrush) فئة بالنقاط المحددة ووضع الالتفاف. |
| [PathGradientBrush](pathgradientbrush#constructor_4)(Point[], WrapMode) | يقوم بتهيئة مثيل جديد لملف[`PathGradientBrush`](../pathgradientbrush) فئة بالنقاط المحددة ووضع الالتفاف. |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/pathgradientbrush/blend) { get; set; } | يحصل أو يحدد أBlend التي تحدد المواضع والعوامل التي تحدد انخفاض مخصص للتدرج . |
| [CenterColor](../../system.drawing.drawing2d/pathgradientbrush/centercolor) { get; set; } | الحصول على أو تعيين اللون في وسط تدرج المسار. |
| [CenterPoint](../../system.drawing.drawing2d/pathgradientbrush/centerpoint) { get; set; } | الحصول على أو تحديد النقطة المركزية لتدرج المسار. |
| [FocusScales](../../system.drawing.drawing2d/pathgradientbrush/focusscales) { get; set; } | الحصول على أو تعيين نقطة التركيز لانخفاض التدرج اللوني. |
| [InterpolationColors](../../system.drawing.drawing2d/pathgradientbrush/interpolationcolors) { get; set; } | يحصل أو يحدد أColorBlendالتي تحدد تدرج خطي متعدد الألوان. |
| [Rectangle](../../system.drawing.drawing2d/pathgradientbrush/rectangle) { get; } | يحصل على مستطيل محيط لهذاPathGradientBrush . |
| [SurroundColors](../../system.drawing.drawing2d/pathgradientbrush/surroundcolors) { get; set; } | الحصول على أو تعيين مصفوفة من الألوان التي تتوافق مع النقاط الموجودة في المسار هذاPathGradientBrush يملأ . |
| [Transform](../../system.drawing.drawing2d/pathgradientbrush/transform) { get; set; } | الحصول على نسخة من ملفMatrix التي تحدد التحويل الهندسي المحلي لهذا الغرضPathGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/pathgradientbrush/wrapmode) { get; set; } | يحصل أو يحدد أWrapMode يشير إلى التفاف mode لهذا الغرضPathGradientBrush . |

## طُرق

| اسم | وصف |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/pathgradientbrush/clone)() | لإنشاء نسخة طبق الأصل من هذاPathGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose)() | يقوم بإصدار كافة الموارد المستخدمة بواسطة كائن الفرشاة هذا . |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform#multiplytransform)(Matrix) | يقوم بتحديث مصفوفة تحويل الفرشاة بمنتج مصفوفة تحويل الفرشاة مضروبًا في مصفوفة أخرى. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | يقوم بتحديث مصفوفة تحويل الفرشاة بمنتج مصفوفة تحويل الفرشاة مضروبًا في مصفوفة أخرى. |
| [ResetTransform](../../system.drawing.drawing2d/pathgradientbrush/resettransform)() | يعيد تعيين ملفTransform الخاصية للهوية . |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform#rotatetransform)(float) | يقوم بتدوير التحويل الهندسي المحلي بالمقدار المحدد. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | يقوم بتدوير التحويل الهندسي المحلي بالمقدار المحدد بالترتيب المحدد. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform#scaletransform)(float, float) | قياس التحويل الهندسي المحلي بالكميات المحددة. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | قياس التحويل الهندسي المحلي بالمقادير المحددة بالترتيب المحدد. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape#setblendtriangularshape)(float) | ينشئ تدرجًا بلون مركزي وانحدار خطي إلى لون محيط واحد . |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape#setblendtriangularshape_1)(float, float) | ينشئ تدرجًا بلون مركزي وهبوط خطي لكل لون محيط . |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape#setsigmabellshape)(float) | ينشئ فرشاة متدرجة تغير لونها بدءًا من مركز المسار إلى الخارج إلى حدود المسار . يعتمد الانتقال من لون إلى آخر على منحنى على شكل جرس. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape#setsigmabellshape_1)(float, float) | ينشئ فرشاة متدرجة تغير لونها بدءًا من مركز المسار إلى الخارج إلى حدود المسار . يعتمد الانتقال من لون إلى آخر على منحنى على شكل جرس. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform#translatetransform)(float, float) | يطبق الترجمة المحددة على التحويل الهندسي المحلي . هذه الطريقة تسبق الترجمة للتحويل. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | يطبق الترجمة المحددة على التحويل الهندسي المحلي بالترتيب المحدد. |

### أنظر أيضا

* class [Brush](../../system.drawing/brush)
* مساحة الاسم [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* المجسم [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
