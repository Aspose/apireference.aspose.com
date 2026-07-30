---
title: "فئة System::Drawing::Pen"
linktitle: "Pen"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Drawing::Pen. يمثل خصائص مثل اللون والعرض وما إلى ذلك للخطوط والمنحنيات المرسومة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أخطاء تأكيد. دائمًا قم بلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1500
url: /ar/cpp/system.drawing/pen/
---
## Pen class


يمثل خصائص مثل اللون والعرض وما إلى ذلك للخطوط والمنحنيات المرسومة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أخطاء تأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Pen : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() | يعيد نسخة من الكائن الحالي. |
| [Dispose](./dispose/)() | يطلق جميع الموارد التشغيلية التي حصل عليها الكائن الحالي. |
| [get_Alignment](./get_alignment/)() const | يرجع قيمة تشير إلى محاذاة كائن [Pen](./) الحالي. |
| [get_Brush](./get_brush/)() | يرجع كائن [Brush](../brush/) لهذا القلم. |
| [get_Color](./get_color/)() const | يرجع لون هذا القلم. |
| [get_CompoundArray](./get_compoundarray/)() const | يرجع مصفوفة من القيم التي تحدد قلمًا مركبًا. |
| [get_DashCap](./get_dashcap/)() const | يرجع قيمة تشير إلى الغطاء المستخدم في طرفي الخط المتقطع. |
| [get_DashOffset](./get_dashoffset/)() const | يرجع المسافة من بداية الخط إلى بداية نمط الشرط. |
| [get_DashPattern](./get_dashpattern/)() const | يرجع مصفوفة تشير إلى نمط الشرط المخصص في خط متقطع. |
| [get_DashStyle](./get_dashstyle/)() const | يعيد قيمة تشير إلى نمط الشرط في كائن [Pen](./) الحالي. |
| [get_EndCap](./get_endcap/)() const | يعيد قيمة تشير إلى غطاء نهاية الخط لكائن [Pen](./) الحالي. |
| [get_LineJoin](./get_linejoin/)() const | يعيد قيمة تشير إلى كيفية ربط الخطوط التي يرسمها كائن [Pen](./) هذا. |
| [get_MiterLimit](./get_miterlimit/)() const | يعيد الحد الأقصى لسماكة الوصلة عند زاوية ميتة. |
| [get_PenType](./get_pentype/)() const | غير مُنفّذ. |
| [get_StartCap](./get_startcap/)() const | يعيد قيمة تشير إلى غطاء بداية الخط لكائن [Pen](./) الحالي. |
| [get_Transform](./get_transform/)() | يعيد نسخة من كائن Matrix يحدد التحويلات الهندسية للقلم الممثل في الكائن الحالي. |
| [get_Width](./get_width/)() const | يعيد عرض كائن [Pen](./) الحالي. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | يضرب مصفوفة التحويل الخاصة بالكائن الحالي بالمصفوفة المحددة. |
| [Pen](./pen/)(const Color\&) | ينشئ كائن [Pen](./) جديد يمثل اللون المحدد. |
| [Pen](./pen/)(const Color\&, float) | ينشئ كائن [Pen](./) جديد يمثل اللون والعرض المحددين. |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&) | ينشئ كائن [Pen](./) جديد ويهيئه باستخدام كائن [Brush](../brush/) المحدد. |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&, float) | ينشئ كائن [Pen](./) جديد ويهيئه باستخدام كائن [Brush](../brush/) المحدد. |
| [ResetTransform](./resettransform/)() | يعيد ضبط مصفوفة التحويل الخاصة بالكائن الحالي لتصبح مصفوفة هوية. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | يدور التحويل الهندسي المحلي بالزاوية المحددة وفق الترتيب المحدد. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | يقوم بتكبير التحويل الهندسي المحلي بالعوامل المحددة وفق الترتيب المحدد. |
| [set_Alignment](./set_alignment/)(Drawing2D::PenAlignment) | يضبط محاذاة كائن [Pen](./) الحالي. |
| [set_Brush](./set_brush/)(const SharedPtr\<Brush\>\&) | يضبط كائن [Brush](../brush/) لهذا القلم. |
| [set_Color](./set_color/)(const Color\&) | يضبط لون هذا القلم. |
| [set_CompoundArray](./set_compoundarray/)(const System::ArrayPtr\<float\>\&) | يضبط مصفوفة من القيم التي تحدد قلمًا مركبًا. |
| [set_CustomEndCap](./set_customendcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | يضبط غطاء نهاية الخط المخصص. |
| [set_CustomStartCap](./set_customstartcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | يضبط غطاء بداية الخط المخصص. |
| [set_DashCap](./set_dashcap/)(Drawing2D::DashCap) | يضبط قيمة تحدد الغطاء المستخدم في كلا طرفي الخط المتقطع. |
| [set_DashOffset](./set_dashoffset/)(float) | يضبط المسافة من بداية الخط إلى بداية نمط الشرط. |
| [set_DashPattern](./set_dashpattern/)(const System::ArrayPtr\<float\>\&) | يضبط مصفوفة تحدد نمط شرط مخصص في خط متقطع. تتكون المصفوفة من أرقام تحدد أطوال الشرط والمسافات المتناوبة. |
| [set_DashStyle](./set_dashstyle/)(Drawing2D::DashStyle) | يضبط قيمة تحدد نمط الشرط لكائن [Pen](./) الحالي. |
| [set_EndCap](./set_endcap/)(Drawing2D::LineCap) | يضبط غطاء نهاية الخط لكائن [Pen](./) الحالي. |
| [set_LineJoin](./set_linejoin/)(Drawing2D::LineJoin) | يضبط قيمة تحدد كيفية ربط الخطوط التي يرسمها كائن [Pen](./) هذا. |
| [set_MiterLimit](./set_miterlimit/)(float) | يضبط حد سماكة الوصلة عند زاوية ميتة. |
| [set_StartCap](./set_startcap/)(Drawing2D::LineCap) | يضبط غطاء بداية الخط لكائن [Pen](./) الحالي. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | يضبط كائن Matrix يحدد التحويلات الهندسية للقلم الممثل في الكائن الحالي. |
| [set_Width](./set_width/)(float) | يضبط عرض كائن [Pen](./) الحالي. |
| [SetLineCap](./setlinecap/)(Drawing2D::LineCap, Drawing2D::LineCap, Drawing2D::DashCap) | غير مُنفّذ. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | ينقل التحويل الهندسي المحلي بالأبعاد المحددة وفق الترتيب المحدد. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
