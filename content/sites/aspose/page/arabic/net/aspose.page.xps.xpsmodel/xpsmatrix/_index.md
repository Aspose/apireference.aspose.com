---
title: XpsMatrix
second_title: Aspose.Page لمرجع NET API
description: فئة تتضمن ميزات عنصر خاصية تحويل المصفوفة . يعرّف هذا العنصر تحويل المصفوفة التبادلي التعسفي المستخدم للتعامل مع أنظمة الإحداثيات للعناصر .
type: docs
weight: 3150
url: /ar/net/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class

فئة تتضمن ميزات عنصر خاصية تحويل المصفوفة . يعرّف هذا العنصر تحويل المصفوفة التبادلي التعسفي المستخدم للتعامل مع أنظمة الإحداثيات للعناصر .

```csharp
public sealed class XpsMatrix : XpsObject
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [IsIdentity](../../aspose.page.xps.xpsmodel/xpsmatrix/isidentity) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذا المثيل عبارة عن مصفوفة هوية. |
| [M11](../../aspose.page.xps.xpsmodel/xpsmatrix/m11) { get; } | يحصل على عنصر M11 . |
| [M12](../../aspose.page.xps.xpsmodel/xpsmatrix/m12) { get; } | يحصل على عنصر M12 . |
| [M21](../../aspose.page.xps.xpsmodel/xpsmatrix/m21) { get; } | يحصل على عنصر M21 . |
| [M22](../../aspose.page.xps.xpsmodel/xpsmatrix/m22) { get; } | يحصل على عنصر M22 . |
| [M31](../../aspose.page.xps.xpsmodel/xpsmatrix/m31) { get; } | يحصل على عنصر M31 . |
| [M32](../../aspose.page.xps.xpsmodel/xpsmatrix/m32) { get; } | يحصل على عنصر M32 . |

## طُرق

| اسم | وصف |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsmatrix/clone)() | استنساخ مصفوفة التحويل هذه. |
| override [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals)(object) | تحديد ما إذا كان الملف المحددObject يساوي هذا المثال. |
| override [GetHashCode](../../aspose.page.xps.xpsmodel/xpsmatrix/gethashcode)() | إرجاع رمز تجزئة لهذا المثال. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply#multiply_2)(Matrix) | ضرب هذه المصفوفة بالمصفوفة المحددة بواسطة*matrix* بالترتيب الافتراضي (الإيداع المسبق) . |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply#multiply)(XpsMatrix) | ضرب هذه المصفوفة بالمصفوفة المحددة بواسطة*matrix* بالترتيب الافتراضي (الإيداع المسبق) . |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply#multiply_3)(Matrix, MatrixOrder) | ضرب هذه المصفوفة بالمصفوفة المحددة بواسطة*matrix* بالترتيب المحدد بواسطة*matrixOrder* . |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply#multiply_1)(XpsMatrix, MatrixOrder) | ضرب هذه المصفوفة بالمصفوفة المحددة بواسطة*matrix* بالترتيب المحدد بواسطة*matrixOrder* . |
| [Reset](../../aspose.page.xps.xpsmodel/xpsmatrix/reset)() | إعادة تعيين هذه المصفوفة إلى مصفوفة الهوية. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate#rotate)(float) | يطبق الاستدارة في اتجاه عقارب الساعة بمقدار*angle* إلى هذه المصفوفة بالترتيب الافتراضي (الإيداع المسبق). |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate#rotate_1)(float, MatrixOrder) | يطبق الاستدارة في اتجاه عقارب الساعة بمقدار*angle* لهذه المصفوفة بالترتيب المحدد بواسطة*matrixOrder* . |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound#rotatearound)(float, PointF) | يطبق الاستدارة في اتجاه عقارب الساعة بمقدار*angle* حول ال*pivot* إلى هذه المصفوفة بالترتيب الافتراضي (الإيداع المسبق). |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound#rotatearound_1)(float, PointF, MatrixOrder) | يطبق الاستدارة في اتجاه عقارب الساعة بمقدار*angle* حول ال*pivot* إلى هذه المصفوفة بالترتيب المحدد بواسطة*matrixOrder* . |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale#scale)(float, float) | يطبق متجه المقياس المحدد (scaleX و scaleY) على هذه المصفوفة بالترتيب الافتراضي (Prepend) . |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale#scale_1)(float, float, MatrixOrder) | يطبق متجه المقياس المحدد (scaleX و scaleY) على هذه المصفوفة بالترتيب المحدد بواسطة*matrixOrder* . |
| [Skew](../../aspose.page.xps.xpsmodel/xpsmatrix/skew)(double, double) | يطبق تحويل الانحراف المحدد على هذه المصفوفة. |
| override [ToString](../../aspose.page.xps.xpsmodel/xpsmatrix/tostring)() | إرجاع تمثيل السلسلة لهذا[`XpsMatrix`](../xpsmatrix) المثال. |
| [Transform](../../aspose.page.xps.xpsmodel/xpsmatrix/transform)(RectangleF) | يطبق التحويل الأفيني الذي تمثله هذه المصفوفة على مستطيل محدد. |
| [TransformPoint](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoint)(PointF) | يطبق التحويل الأفيني الذي تمثله هذه المصفوفة على نقطة محددة. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints#transformpoints)(PointF[]) | يطبق التحويل الأفيني الذي تمثله هذه المصفوفة على مصفوفة محددة من النقاط. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints#transformpoints_1)(PointF[], int, int) | يطبق التحويل الأفيني الذي تمثله هذه المصفوفة على جزء محدد من مصفوفة النقاط. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate#translate)(float, float) | يطبق متجه الترجمة المحدد على هذه المصفوفة. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate#translate_1)(float, float, MatrixOrder) | يطبق متجه الترجمة المحدد على هذه المصفوفة بالترتيب المحدد بواسطة*matrixOrder* . |
| static [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals)(XpsMatrix, XpsMatrix) | التنفيذ الفعلي . |
| [operator ==](../../aspose.page.xps.xpsmodel/xpsmatrix/op_equality) | تنفيذ عامل التشغيل == . |
| [operator !=](../../aspose.page.xps.xpsmodel/xpsmatrix/op_inequality) | تنفذ عامل التشغيل! = . |

### أنظر أيضا

* class [XpsObject](../xpsobject)
* مساحة الاسم [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel)
* المجسم [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
