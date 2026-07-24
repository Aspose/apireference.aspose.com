---
title: "فئة System::Drawing::Drawing2D::PathGradientBrush"
linktitle: "PathGradientBrush"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Drawing::Drawing2D::PathGradientBrush. تمثل فرشاة تقوم بملء داخل كائن GraphicsPath بتدرج لوني. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1200
url: /ar/cpp/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class


تمثل فرشاة تقوم بملء داخل كائن [GraphicsPath](../graphicspath/) بتدرج لوني. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class PathGradientBrush : public System::Drawing::Brush
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | ينشئ نسخة من الكائن الحالي. |
| [get_Blend](./get_blend/)() const | غير مُنفَّذ. |
| [get_CenterColor](./get_centercolor/)() const | يعيد لونًا يقع في مركز المسار المملوء بواسطة الكائن الحالي. |
| [get_CenterPoint](./get_centerpoint/)() const | يحصل على نقطة المركز للتدرج. |
| [get_FocusScales](./get_focusscales/)() const | يحصل على نقطة التركيز لتلاشي التدرج. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | يعيد قيمة تُعرّف تدرجًا خطيًا متعدد الألوان. |
| [get_Rectangle](./get_rectangle/)() | غير مُنفَّذ. |
| [get_SurroundColors](./get_surroundcolors/)() const | يعيد ألوانًا تتطابق مع النقاط في المسار الذي تُملئه هذه [PathGradientBrush](./). |
| [get_Transform](./get_transform/)() const | يرجع نسخة من كائن [Matrix](../matrix/) يحدد التحولات الهندسية للفرشاة الممثلة بواسطة الكائن الحالي. |
| [get_WrapMode](./get_wrapmode/)() const | يرجع وضع الالتفاف. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | يضرب مصفوفة التحويل الخاصة بالكائن الحالي بالمصفوفة المحددة. |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<PointF\>\&, WrapMode) | معلومات RTTI. |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<Point\>\&, WrapMode) | ينشئ نسخة جديدة من فئة [PathGradientBrush](./). |
| [PathGradientBrush](./pathgradientbrush/)(const SharedPtr\<GraphicsPath\>\&) | ينشئ نسخة جديدة من فئة [PathGradientBrush](./). |
| [ResetTransform](./resettransform/)() | يعيد تعيين مصفوفة التحويل الخاصة بالكائن الحالي لتصبح مصفوفة هوية. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | يدور التحول الهندسي المحلي بالزاوية المحددة وفق الترتيب المحدد. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | يقوم بتكبير/تصغير التحول الهندسي المحلي بالعوامل المحددة وفق الترتيب المحدد. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | يضبط مزيجًا يحدد العوامل والمواقع للألوان الأساسية لهذه الفرشاة. |
| [set_CenterColor](./set_centercolor/)(Color) | يضبط لونًا يقع في مركز المسار المملوء بواسطة الكائن الحالي. |
| [set_CenterPoint](./set_centerpoint/)(const PointF\&) | يضبط نقطة المركز للتدرج. |
| [set_FocusScales](./set_focusscales/)(const PointF\&) | يضبط نقطة التركيز لتلاشي التدرج. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | يضبط قيمة تُعرّف تدرجًا خطيًا متعدد الألوان. |
| [set_SurroundColors](./set_surroundcolors/)(const ArrayPtr\<Color\>\&) | يضبط ألوانًا تتطابق مع النقاط في المسار الذي تُملئه هذه [PathGradientBrush](./). |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | يضبط كائن [Matrix](../matrix/) الذي يحدد التحويلات الهندسية للفرشاة الممثلة بواسطة الكائن الحالي. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | يضبط وضع الالتفاف. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | غير مُنفَّذ. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | غير مُنفَّذ. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | ينقل التحول الهندسي المحلي بالأبعاد المحددة وفق الترتيب المحدد. |
## انظر أيضًا

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
