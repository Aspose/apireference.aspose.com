---
title: "فئة System::Drawing::TextureBrush"
linktitle: "TextureBrush"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Drawing::TextureBrush. تمثل فرشاة تستخدم صورة لملء داخل الشكل. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2800
url: /ar/cpp/system.drawing/texturebrush/
---
## TextureBrush class


تمثل فرشاة تستخدم صورة لملء داخل الشكل. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class TextureBrush : public System::Drawing::Brush
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | ينشئ نسخة من الكائن الحالي. |
| [get_Image](./get_image/)() | يرجع صورةً يستخدمها كائن [TextureBrush](./) الحالي. |
| [get_Transform](./get_transform/)() | يرجع نسخة من كائن Matrix يحدد التحولات الهندسية للفرشاة الممثلة بواسطة الكائن الحالي. |
| [get_WrapMode](./get_wrapmode/)() | يرجع قيمة تحدد طريقة تجانب الفرشاة الممثلة بواسطة الكائن الحالي. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | يضرب مصفوفة التحويل الخاصة بالكائن الحالي بالمصفوفة المحددة. |
| [ResetTransform](./resettransform/)() | يعيد تعيين مصفوفة التحويل الخاصة بالكائن الحالي لتصبح مصفوفة هوية. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | يدور التحول الهندسي المحلي بالزاوية المحددة وفق الترتيب المحدد. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | يقوم بتكبير/تصغير التحول الهندسي المحلي بالعوامل المحددة وفق الترتيب المحدد. |
| [set_Transform](./set_transform/)(const System::SharedPtr\<Drawing2D::Matrix\>\&) | يضبط كائن Matrix يحدد التحولات الهندسية للفرشاة الممثلة بواسطة الكائن الحالي. |
| [set_WrapMode](./set_wrapmode/)(Drawing2D::WrapMode) | يضبط قيمة تحدد طريقة تجانب الفرشاة الممثلة بواسطة الكائن الحالي. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode) | ينشئ مثيلًا جديدًا من فئة [TextureBrush](./) يستخدم الصورة المحددة. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, RectangleF, const SharedPtr\<Imaging::ImageAttributes\>\&) | ينشئ مثيلًا جديدًا من فئة [TextureBrush](./) يستخدم الصورة المحددة. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Rectangle, const SharedPtr\<Imaging::ImageAttributes\>\&) | ينشئ مثيلًا جديدًا من فئة [TextureBrush](./) يستخدم الصورة المحددة. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, RectangleF) | ينشئ مثيلًا جديدًا من فئة [TextureBrush](./) يستخدم الصورة المحددة. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, Rectangle) | ينشئ مثيلًا جديدًا من فئة [TextureBrush](./) يستخدم الصورة المحددة. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | ينقل التحول الهندسي المحلي بالأبعاد المحددة وفق الترتيب المحدد. |
| virtual [~TextureBrush](./~texturebrush/)() | المدمر. |
## انظر أيضًا

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
