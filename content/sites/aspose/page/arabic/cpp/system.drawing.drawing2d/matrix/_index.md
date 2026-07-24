---
title: "System::Drawing::Drawing2D::Matrix class"
linktitle: "Matrix"
second_title: "Aspose.Page لـ C++"
description: "System::Drawing::Drawing2D::Matrix class. يمثل مصفوفة 3×3 تُعرّف عمليات التحويل. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. يجب دائمًا تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1000
url: /ar/cpp/system.drawing.drawing2d/matrix/
---
## Matrix class


يمثل مصفوفة 3×3 تُعرّف عمليات التحويل. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. يجب دائمًا تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Matrix : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() const | ينشئ نسخة من الكائن الحالي. |
| [Dispose](./dispose/)() | يطلق جميع موارد نظام التشغيل التي تم الحصول عليها بواسطة الكائن الحالي. |
| [Equals](./equals/)(ptr) override | يفحص ما إذا كان الكائن المحدد هو [Matrix](./) ومطابق لهذا الكائن. |
| [get_Elements](./get_elements/)() const | يرجع مصفوفة تحتوي على عناصر المصفوفة بالترتيب التالي: m11, m12, m21, m22, dx, dy. |
| [get_IsIdentity](./get_isidentity/)() const | يحدد ما إذا كانت المصفوفة التي يمثلها الكائن الحالي مصفوفة هوية. |
| [get_IsInvertible](./get_isinvertible/)() const | يحدد ما إذا كانت المصفوفة التي يمثلها الكائن الحالي قابلة للعكس. |
| [get_OffsetX](./get_offsetx/)() const | يرجع قيمة الإزاحة X للمصفوفة التي يمثلها الكائن الحالي. |
| [get_OffsetY](./get_offsety/)() const | يرجع قيمة الإزاحة Y للمصفوفة التي يمثلها الكائن الحالي. |
| [Invert](./invert/)() | يعكس المصفوفة التي يمثلها الكائن الحالي. |
| [Matrix](./matrix/)() | ينشئ مثيلاً جديدًا من الفئة [Matrix](./) التي تمثل مصفوفة هوية. |
| [Matrix](./matrix/)(float, float, float, float, float, float) | ينشئ مثيلاً جديدًا من الفئة [Matrix](./) ويهيئه بالقيم المحددة. |
| [Matrix](./matrix/)(const Rectangle\&, const ArrayPtr\<Point\>\&) | ينشئ مثيلاً جديدًا من الفئة [Matrix](./) للتحويل الهندسي المحدد بالمستطيل المحدد ومصفوفة النقاط. |
| [Matrix](./matrix/)(const RectangleF\&, const ArrayPtr\<PointF\>\&) | ينشئ مثيلاً جديدًا من الفئة [Matrix](./) للتحويل الهندسي المحدد بالمستطيل المحدد ومصفوفة النقاط. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&) | يضرب المصفوفة التي يمثلها الكائن الحالي بالمصفوفة المحددة. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | يضرب المصفوفة التي يمثلها الكائن الحالي بالمصفوفة المحددة. |
| [Reset](./reset/)() | يعيد تعيين المصفوفة التي يمثلها الكائن الحالي لتصبح مصفوفة هوية. |
| [Rotate](./rotate/)(float) | يدور المصفوفة التي يمثلها الكائن الحالي باتجاه عقارب الساعة بالزاوية المحددة. |
| [Rotate](./rotate/)(float, MatrixOrder) | يدور المصفوفة التي يمثلها الكائن الحالي باتجاه عقارب الساعة حول الأصل بالزاوية المحددة. |
| [RotateAt](./rotateat/)(float, const PointF\&) | يدور المصفوفة التي يمثلها الكائن الحالي باتجاه عقارب الساعة حول النقطة المحددة بالزاوية المحددة. |
| [RotateAt](./rotateat/)(float, const PointF\&, MatrixOrder) | يدور المصفوفة التي يمثلها الكائن الحالي باتجاه عقارب الساعة حول النقطة المحددة بالزاوية المحددة. |
| [Scale](./scale/)(float, float) | يطبق متجه التحجيم المحدد على المصفوفة التي يمثلها الكائن الحالي. |
| [Scale](./scale/)(float, float, MatrixOrder) | يطبق متجه التحجيم المحدد على المصفوفة التي يمثلها الكائن الحالي. |
| [Shear](./shear/)(float, float) | يطبق متجه القص المحدد على المصفوفة التي يمثلها الكائن الحالي. |
| [Shear](./shear/)(float, float, MatrixOrder) | يطبق متجه القص المحدد على المصفوفة التي يمثلها الكائن الحالي. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<Point\>\&) | يطبق التحويل الهندسي المحدد بالمصفوفة التي يمثلها الكائن الحالي على النقاط المحددة. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<Point\>\&) | يطبق التحويل الهندسي المحدد بالمصفوفة التي يمثلها الكائن الحالي على النقاط المحددة. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<PointF\>\&) | يطبق التحويل الهندسي المحدد بالمصفوفة التي يمثلها الكائن الحالي على النقاط المحددة. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<PointF\>\&) | يطبق التحويل الهندسي المحدد بالمصفوفة التي يمثلها الكائن الحالي على النقاط المحددة. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<Point\>\&) | يطبق فقط مكونات التحجيم والدوران للمصفوفة التي يمثلها الكائن الحالي على النقاط المحددة. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<Point\>\&) | يطبق فقط مكونات التحجيم والدوران للمصفوفة التي يمثلها الكائن الحالي على النقاط المحددة. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<PointF\>\&) | يطبق فقط مكونات التحجيم والدوران للمصفوفة التي يمثلها الكائن الحالي على النقاط المحددة. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<PointF\>\&) | يطبق فقط مكونات التحجيم والدوران للمصفوفة التي يمثلها الكائن الحالي على النقاط المحددة. |
| [Translate](./translate/)(float, float) | يطبق متجه الإزاحة المحدد على المصفوفة التي يمثلها الكائن الحالي. |
| [Translate](./translate/)(float, float, MatrixOrder) | يطبق متجه الإزاحة المحدد على المصفوفة التي يمثلها الكائن الحالي. |
| [VectorTransformPoints](./vectortransformpoints/)(const ArrayPtr\<Point\>\&) | يضرب كل متجه في المصفوفة بالمصفوفة التي يمثلها الكائن الحالي. |
| [VectorTransformPoints](./vectortransformpoints/)(const System::Details::ArrayView\<Point\>\&) | يضرب كل متجه في المصفوفة بالمصفوفة التي يمثلها الكائن الحالي. |
| virtual [~Matrix](./~matrix/)() | المدمر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
