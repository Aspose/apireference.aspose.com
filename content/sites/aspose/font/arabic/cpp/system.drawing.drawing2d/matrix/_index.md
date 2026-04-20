---
title: "System::Drawing::Drawing2D::Matrix فئة"
linktitle: "Matrix"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Drawing2D::Matrix فئة. تمثل مصفوفة 3×3 تحدد عمليات التحويل. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء مثال لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1000
url: /ar/cpp/system.drawing.drawing2d/matrix/
---
## Matrix class


تمثل مصفوفة 3×3 تحدد عمليات التحويل. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء مثال لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Matrix : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() const | ينشئ نسخة من الكائن الحالي. |
| [Dispose](./dispose/)() | يطلق جميع موارد نظام التشغيل التي حصل عليها الكائن الحالي. |
| [Equals](./equals/)(ptr) override | يفحص ما إذا كان الكائن المحدد هو [Matrix](./) ومطابق لهذا الكائن. |
| [get_Elements](./get_elements/)() const | يرجع مصفوفة تحتوي على عناصر المصفوفة بالترتيب التالي: m11, m12, m21, m22, dx, dy. |
| [get_IsIdentity](./get_isidentity/)() const | يحدد ما إذا كانت المصفوفة الممثلة بواسطة الكائن الحالي مصفوفة هوية. |
| [get_IsInvertible](./get_isinvertible/)() const | يحدد ما إذا كانت المصفوفة الممثلة بواسطة الكائن الحالي قابلة للعكس. |
| [get_OffsetX](./get_offsetx/)() const | يرجع قيمة الإزاحة X للمصفوفة الممثلة بواسطة الكائن الحالي. |
| [get_OffsetY](./get_offsety/)() const | يرجع قيمة الإزاحة Y للمصفوفة الممثلة بواسطة الكائن الحالي. |
| [Invert](./invert/)() | يعكس المصفوفة الممثلة بواسطة الكائن الحالي. |
| [Matrix](./matrix/)() | ينشئ نسخة جديدة من فئة [Matrix](./) التي تمثل مصفوفة هوية. |
| [Matrix](./matrix/)(float, float, float, float, float, float) | ينشئ نسخة جديدة من فئة [Matrix](./) ويُهيئها بالقيم المحددة. |
| [Matrix](./matrix/)(const Rectangle\&, const ArrayPtr\<Point\>\&) | ينشئ نسخة جديدة من فئة [Matrix](./) للتحويل الهندسي المحدد بالمستطيل المحدد ومصفوفة النقاط. |
| [Matrix](./matrix/)(const RectangleF\&, const ArrayPtr\<PointF\>\&) | ينشئ نسخة جديدة من فئة [Matrix](./) للتحويل الهندسي المحدد بالمستطيل المحدد ومصفوفة النقاط. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&) | يضرب المصفوفة الممثلة بواسطة الكائن الحالي بالمصفوفة المحددة. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | يضرب المصفوفة الممثلة بواسطة الكائن الحالي بالمصفوفة المحددة. |
| [Reset](./reset/)() | يعيد تعيين المصفوفة الممثلة بواسطة الكائن الحالي لتصبح مصفوفة هوية. |
| [Rotate](./rotate/)(float) | يدور المصفوفة الممثلة بواسطة الكائن الحالي باتجاه عقارب الساعة بالزاوية المحددة. |
| [Rotate](./rotate/)(float, MatrixOrder) | يدور المصفوفة الممثلة بواسطة الكائن الحالي باتجاه عقارب الساعة حول الأصل بالزاوية المحددة. |
| [RotateAt](./rotateat/)(float, const PointF\&) | يدور المصفوفة الممثلة بواسطة الكائن الحالي باتجاه عقارب الساعة حول النقطة المحددة بالزاوية المحددة. |
| [RotateAt](./rotateat/)(float, const PointF\&, MatrixOrder) | يدور المصفوفة الممثلة بواسطة الكائن الحالي باتجاه عقارب الساعة حول النقطة المحددة بالزاوية المحددة. |
| [Scale](./scale/)(float, float) | يطبق متجه التحجيم المحدد على المصفوفة الممثلة بواسطة الكائن الحالي. |
| [Scale](./scale/)(float, float, MatrixOrder) | يطبق متجه التحجيم المحدد على المصفوفة الممثلة بواسطة الكائن الحالي. |
| [Shear](./shear/)(float, float) | يطبق متجه القص المحدد على المصفوفة الممثلة بواسطة الكائن الحالي. |
| [Shear](./shear/)(float, float, MatrixOrder) | يطبق متجه القص المحدد على المصفوفة الممثلة بواسطة الكائن الحالي. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<Point\>\&) | يطبق التحويل الهندسي المحدد بالمصفوفة الممثلة بواسطة الكائن الحالي على النقاط المحددة. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<Point\>\&) | يطبق التحويل الهندسي المحدد بالمصفوفة الممثلة بواسطة الكائن الحالي على النقاط المحددة. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<PointF\>\&) | يطبق التحويل الهندسي المحدد بالمصفوفة الممثلة بواسطة الكائن الحالي على النقاط المحددة. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<PointF\>\&) | يطبق التحويل الهندسي المحدد بالمصفوفة الممثلة بواسطة الكائن الحالي على النقاط المحددة. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<Point\>\&) | يطبق فقط مكونات التحجيم والدوران للمصفوفة الممثلة بواسطة الكائن الحالي على النقاط المحددة. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<Point\>\&) | يطبق فقط مكونات التحجيم والدوران للمصفوفة الممثلة بواسطة الكائن الحالي على النقاط المحددة. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<PointF\>\&) | يطبق فقط مكونات التحجيم والدوران للمصفوفة الممثلة بواسطة الكائن الحالي على النقاط المحددة. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<PointF\>\&) | يطبق فقط مكونات التحجيم والدوران للمصفوفة الممثلة بواسطة الكائن الحالي على النقاط المحددة. |
| [Translate](./translate/)(float, float) | يطبق متجه الترجمة المحدد على المصفوفة التي يمثلها الكائن الحالي. |
| [Translate](./translate/)(float, float, MatrixOrder) | يطبق متجه الترجمة المحدد على المصفوفة التي يمثلها الكائن الحالي. |
| [VectorTransformPoints](./vectortransformpoints/)(const ArrayPtr\<Point\>\&) | يضرب كل متجه في المصفوفة بالمصفوفة التي يمثلها الكائن الحالي. |
| [VectorTransformPoints](./vectortransformpoints/)(const System::Details::ArrayView\<Point\>\&) | يضرب كل متجه في المصفوفة بالمصفوفة التي يمثلها الكائن الحالي. |
| virtual [~Matrix](./~matrix/)() | المدمر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
