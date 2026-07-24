---
title: "System::Drawing::Drawing2D::LinearGradientBrush فئة"
linktitle: "LinearGradientBrush"
second_title: "Aspose.Page لـ C++"
description: "System::Drawing::Drawing2D::LinearGradientBrush فئة. تمثل فرشاة تدرج خطي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 900
url: /ar/cpp/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class


تمثل فرشاة تدرج خطي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class LinearGradientBrush : public System::Drawing::Brush
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | ينشئ نسخة من الكائن الحالي. |
| [get_Blend](./get_blend/)() const | يرجع مزيجاً يحدد العوامل والمواقع للألوان الأساسية لهذه الفرشاة. |
| [get_GammaCorrection](./get_gammacorrection/)() const | يرجع قيمة تشير إلى أن تصحيح غاما مفعّل لهذه الفرشاة. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | يرجع كائنًا من نوع [ColorBlend](../colorblend/) يحدد تدرجًا خطيًا متعدد الألوان. |
| [get_LinearColors](./get_linearcolors/)() const | يرجع الألوان الابتدائية والنهائية لهذا التدرج. |
| [get_Rectangle](./get_rectangle/)() | يرجع مستطيلًا محيطًا. |
| [get_Transform](./get_transform/)() const | يرجع نسخة من كائن [Matrix](../matrix/) يحدد التحولات الهندسية للفرشاة الممثلة بواسطة الكائن الحالي. |
| [get_WrapMode](./get_wrapmode/)() const | يرجع وضع الالتفاف. |
| [LinearGradientBrush](./lineargradientbrush/)(const PointF\&, const PointF\&, const Color\&, const Color\&) | معلومات RTTI. |
| [LinearGradientBrush](./lineargradientbrush/)(const Point\&, const Point\&, const Color\&, const Color\&) | ينشئ مثالًا جديدًا من [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, LinearGradientMode) | ينشئ مثالًا جديدًا من [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, LinearGradientMode) | ينشئ مثالًا جديدًا من [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, float, bool) | ينشئ مثالًا جديدًا من [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, float, bool) | ينشئ مثالًا جديدًا من [LinearGradientBrush](./). |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | يضرب مصفوفة التحويل الخاصة بالكائن الحالي بالمصفوفة المحددة. |
| [ResetTransform](./resettransform/)() | يعيد ضبط مصفوفة التحويل للكائن الحالي. |
| [RotateTransform](./rotatetransform/)(float, MatrixOrder) | يدور مصفوفة التحويل للكائن الحالي. |
| [ScaleTransform](./scaletransform/)(float, float, MatrixOrder) | يقوم بتحجيم مصفوفة التحويل للكائن الحالي. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | يضبط مزيجًا يحدد العوامل والمواقع للألوان الأساسية لهذه الفرشاة. |
| [set_GammaCorrection](./set_gammacorrection/)(bool) | يضبط حالة تصحيح غاما لهذه الفرشاة. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | يضبط كائنًا من نوع [ColorBlend](../colorblend/) يحدد تدرجًا خطيًا متعدد الألوان. |
| [set_LinearColors](./set_linearcolors/)(const ArrayPtr\<Color\>\&) | يضبط ألوان البداية والنهاية لهذا التدرج. |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | يضبط كائن [Matrix](../matrix/) الذي يحدد التحويلات الهندسية للفرشاة الممثلة بواسطة الكائن الحالي. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | يضبط وضع الالتفاف. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | غير مُنفَّذ. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | غير مُنفَّذ. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | يترجم مصفوفة التحويل الخاصة بالكائن الحالي. |
## انظر أيضًا

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
