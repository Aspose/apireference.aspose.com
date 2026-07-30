---
title: "System::Drawing::Drawing2D::LinearGradientBrush class"
linktitle: "LinearGradientBrush"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Drawing2D::LinearGradientBrush class. يمثل فرشاة تدرج خطي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 900
url: /ar/cpp/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class


يمثل فرشاة تدرج خطي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class LinearGradientBrush : public System::Drawing::Brush
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | ينشئ نسخة من الكائن الحالي. |
| [get_Blend](./get_blend/)() const | يعيد مزيجًا يحدد العوامل والمواقع للألوان الأساسية لهذه الفرشاة. |
| [get_GammaCorrection](./get_gammacorrection/)() const | يعيد قيمة تشير إلى أن تصحيح غاما مفعّل لهذه الفرشاة. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | يعيد كائنًا من نوع [ColorBlend](../colorblend/) يحدد تدرجًا خطيًا متعدد الألوان. |
| [get_LinearColors](./get_linearcolors/)() const | يعيد ألوان البدء والنهاية لهذا التدرج. |
| [get_Rectangle](./get_rectangle/)() | يعيد مستطيلًا محيطًا. |
| [get_Transform](./get_transform/)() const | يعيد نسخة من كائن [Matrix](../matrix/) يحدد التحولات الهندسية للفرشاة التي يمثلها الكائن الحالي. |
| [get_WrapMode](./get_wrapmode/)() const | يعيد وضع الالتفاف. |
| [LinearGradientBrush](./lineargradientbrush/)(const PointF\&, const PointF\&, const Color\&, const Color\&) | معلومات RTTI. |
| [LinearGradientBrush](./lineargradientbrush/)(const Point\&, const Point\&, const Color\&, const Color\&) | ينشئ نسخة جديدة من [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, LinearGradientMode) | ينشئ نسخة جديدة من [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, LinearGradientMode) | ينشئ نسخة جديدة من [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, float, bool) | ينشئ نسخة جديدة من [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, float, bool) | ينشئ نسخة جديدة من [LinearGradientBrush](./). |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | يضرب مصفوفة التحويل الخاصة بالكائن الحالي بالمصفوفة المحددة. |
| [ResetTransform](./resettransform/)() | يعيد تعيين مصفوفة تحويل الكائن الحالي. |
| [RotateTransform](./rotatetransform/)(float, MatrixOrder) | يدور مصفوفة تحويل الكائن الحالي. |
| [ScaleTransform](./scaletransform/)(float, float, MatrixOrder) | يقوم بتغيير حجم مصفوفة تحويل الكائن الحالي. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | يضبط مزيجًا يحدد العوامل والمواضع للألوان الأساسية لهذه الفرشاة. |
| [set_GammaCorrection](./set_gammacorrection/)(bool) | يضبط حالة تصحيح غاما لهذه الفرشاة. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | يضبط كائن [ColorBlend](../colorblend/) يعرّف تدرجًا خطيًا متعدد الألوان. |
| [set_LinearColors](./set_linearcolors/)(const ArrayPtr\<Color\>\&) | يضبط ألوان البداية والنهاية لهذا التدرج. |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | يضبط كائن [Matrix](../matrix/) يحدد التحويلات الهندسية للفرشاة التي يمثلها الكائن الحالي. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | يضبط وضع الالتفاف. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | غير مُنفّذ. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | غير مُنفّذ. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | يترجم مصفوفة التحويل للكائن الحالي. |
## انظر أيضًا

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
