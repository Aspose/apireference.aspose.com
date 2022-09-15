---
title: Matrix
second_title: Aspose.Drawing لمرجع NET API
description: لتضمين مصفوفة أفينية 3  3 تمثل تحويلًا هندسيًا. لا يمكن توريث هذه الفئة.
type: docs
weight: 360
url: /ar/net/system.drawing.drawing2d/matrix/
---
## Matrix class

لتضمين مصفوفة أفينية 3 × 3 تمثل تحويلًا هندسيًا. لا يمكن توريث هذه الفئة.

```csharp
public sealed class Matrix : IDisposable
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Matrix](matrix#constructor)() | تهيئة مثيل جديد لفئة Matrix كمصفوفة الهوية. |
| [Matrix](matrix#constructor_2)(Rectangle, Point[]) | يقوم بتهيئة مثيل جديد لملف[`Matrix`](../matrix) فئة للتحويل الهندسي المحدد بواسطة المستطيل المحدد ومجموعة من النقاط. |
| [Matrix](matrix#constructor_3)(RectangleF, PointF[]) | يقوم بتهيئة مثيل جديد لملف[`Matrix`](../matrix) فئة للتحويل الهندسي المحدد بواسطة المستطيل المحدد ومجموعة من النقاط. |
| [Matrix](matrix#constructor_1)(float, float, float, float, float, float) | تهيئة مثيل جديد لفئة Matrix بالعناصر المحددة. |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Elements](../../system.drawing.drawing2d/matrix/elements) { get; } | الحصول على صفيف من قيم الفاصلة العائمة التي تمثل عناصر هذه المصفوفة. |
| [IsIdentity](../../system.drawing.drawing2d/matrix/isidentity) { get; } | يحصل على قيمة تشير إلى ما إذا كانت هذه المصفوفة هي مصفوفة الهوية. |
| [IsInvertible](../../system.drawing.drawing2d/matrix/isinvertible) { get; } | يحصل على قيمة تشير إلى ما إذا كانت هذه المصفوفة قابلة للعكس. |
| [OffsetX](../../system.drawing.drawing2d/matrix/offsetx) { get; } | الحصول على قيمة ترجمة x (قيمة dx ، أو العنصر الموجود في الصف الثالث والعمود الأول) لهذه المصفوفة. |
| [OffsetY](../../system.drawing.drawing2d/matrix/offsety) { get; } | يحصل على قيمة الترجمة y (ملف`دى` القيمة ، أو العنصر الموجود في الصف الثالث والعمود الثاني) من هذه المصفوفة. |

## طُرق

| اسم | وصف |
| --- | --- |
| [Clone](../../system.drawing.drawing2d/matrix/clone)() | لإنشاء نسخة طبق الأصل من هذه المصفوفة. |
| [Dispose](../../system.drawing.drawing2d/matrix/dispose)() | يصدر جميع الموارد المستخدمة بواسطة هذه المصفوفة. |
| [Invert](../../system.drawing.drawing2d/matrix/invert)() | عكس هذه المصفوفة ، إذا كانت قابلة للعكس. |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply#multiply)(Matrix) | تضرب هذاMatrix بواسطة المصفوفة المحددة في*matrix* المعلمة ، قبل إضافة المحددMatrix . |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply#multiply_1)(Matrix, MatrixOrder) | تضرب هذاMatrix بواسطة المصفوفة المحددة في*matrix* المعلمة ، وبالترتيب المحدد في ملف*order* المعلمة . |
| [Reset](../../system.drawing.drawing2d/matrix/reset)() | يعيد تعيين هذاMatrixللحصول على عناصر مصفوفة الهوية . |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate#rotate)(float) | قبل ذلكMatrix دوران في اتجاه عقارب الساعة ، حول الأصل والزاوية المحددة. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate#rotate_1)(float, MatrixOrder) | يطبق دورانًا في اتجاه عقارب الساعة لمقدار محدد في معلمة الزاوية ، حول الأصل (إحداثيات صفر x و y) لهذاMatrix . |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat#rotateat)(float, PointF) | يطبق دوران في اتجاه عقارب الساعة على هذه المصفوفة حول النقطة المحددة في معلمة النقطة ، وبتقديم الاستدارة. |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat#rotateat_1)(float, PointF, MatrixOrder) | يطبق دوران في اتجاه عقارب الساعة حول النقطة المحددة على هذه المصفوفة بالترتيب المحدد. |
| [Scale](../../system.drawing.drawing2d/matrix/scale#scale)(float, float) | يطبق متجه المقياس المحدد على هذه المصفوفة عن طريق إضافة متجه المقياس مسبقًا. |
| [Scale](../../system.drawing.drawing2d/matrix/scale#scale_1)(float, float, MatrixOrder) | يطبق متجه المقياس المحدد (scaleX و scaleY) على هذه المصفوفة باستخدام الترتيب المحدد. |
| [Shear](../../system.drawing.drawing2d/matrix/shear#shear)(float, float) | يطبق متجه القص المحدد على هذه المصفوفة عن طريق إضافة تحويل القص. |
| [Shear](../../system.drawing.drawing2d/matrix/shear#shear_1)(float, float, MatrixOrder) | يطبق متجه القص المحدد على هذه المصفوفة بالترتيب المحدد. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints#transformpoints)(PointF[]) | يطبق التحويل الهندسي الذي يمثله هذاMatrix إلى مجموعة محددة من النقاط. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints#transformpoints_1)(Point[]) | يطبق التحويل الهندسي الذي يمثله هذاMatrix إلى مجموعة محددة من النقاط. |
| [TransformVectors](../../system.drawing.drawing2d/matrix/transformvectors)(PointF[]) | تضرب كل متجه في مصفوفة في المصفوفة. تم تجاهل عناصر ترجمة هذه المصفوفة (الصف الثالث). |
| [Translate](../../system.drawing.drawing2d/matrix/translate#translate)(float, float) | يطبق متجه الترجمة المحدد (offsetX و offsetY) على هذه المصفوفة عن طريق إضافة متجه الترجمة. |
| [Translate](../../system.drawing.drawing2d/matrix/translate#translate_1)(float, float, MatrixOrder) | يطبق متجه الترجمة المحدد على هذه المصفوفة بالترتيب المحدد. |

### أنظر أيضا

* مساحة الاسم [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* المجسم [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
