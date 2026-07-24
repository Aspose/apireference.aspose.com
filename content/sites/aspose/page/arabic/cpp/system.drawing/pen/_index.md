---
title: "System::Drawing::Pen class"
linktitle: "Pen"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Drawing::Pen. تمثل خصائص مثل اللون والعرض وغيرها للخطوط والمنحنيات المرسومة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1500
url: /ar/cpp/system.drawing/pen/
---
## Pen class


تمثل خصائص مثل اللون والعرض وغيرها للخطوط والمنحنيات المرسومة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Pen : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() | يعيد نسخة من الكائن الحالي. |
| [Dispose](./dispose/)() | يطلق جميع موارد التشغيل التي حصل عليها الكائن الحالي. |
| [get_Alignment](./get_alignment/)() const | يرجع قيمة تشير إلى محاذاة كائن [Pen](./) الحالي. |
| [get_Brush](./get_brush/)() | يرجع كائن [Brush](../brush/) لهذا القلم. |
| [get_Color](./get_color/)() const | يرجع لون هذا القلم. |
| [get_CompoundArray](./get_compoundarray/)() const | يرجع مصفوفة من القيم التي تحدد قلمًا مركبًا. |
| [get_DashCap](./get_dashcap/)() const | يرجع قيمة تشير إلى الغطاء المستخدم في كلا طرفي الخط المتقطع. |
| [get_DashOffset](./get_dashoffset/)() const | يرجع المسافة من بداية الخط إلى بداية نمط الشرط. |
| [get_DashPattern](./get_dashpattern/)() const | يرجع مصفوفة تشير إلى نمط الشرط المخصص في خط متقطع. |
| [get_DashStyle](./get_dashstyle/)() const | يرجع قيمة تشير إلى نمط الشرط للعنصر [Pen](./) الحالي. |
| [get_EndCap](./get_endcap/)() const | يرجع قيمة تشير إلى غطاء نهاية الخط للعنصر [Pen](./) الحالي. |
| [get_LineJoin](./get_linejoin/)() const | يرجع قيمة تشير إلى طريقة ربط الخطوط التي يرسمها هذا العنصر [Pen](./). |
| [get_MiterLimit](./get_miterlimit/)() const | يرجع الحد الأقصى لسماكة الوصلة في زاوية ميتة. |
| [get_PenType](./get_pentype/)() const | غير مُنفَّذ. |
| [get_StartCap](./get_startcap/)() const | يرجع قيمة تشير إلى غطاء بداية الخط للعنصر [Pen](./) الحالي. |
| [get_Transform](./get_transform/)() | يرجع نسخة من كائن Matrix يحدد التحويلات الهندسية للقلم الممثّل بواسطة الكائن الحالي. |
| [get_Width](./get_width/)() const | يرجع عرض العنصر [Pen](./) الحالي. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | يضرب مصفوفة التحويل الخاصة بالكائن الحالي بالمصفوفة المحددة. |
| [Pen](./pen/)(const Color\&) | ينشئ كائنًا جديدًا من نوع [Pen](./) يمثل اللون المحدد. |
| [Pen](./pen/)(const Color\&, float) | ينشئ كائنًا جديدًا من نوع [Pen](./) يمثل اللون والعرض المحددين. |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&) | ينشئ كائنًا جديدًا من نوع [Pen](./) ويُهيئه باستخدام كائن [Brush](../brush/) المحدد. |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&, float) | ينشئ كائنًا جديدًا من نوع [Pen](./) ويُهيئه باستخدام كائن [Brush](../brush/) المحدد. |
| [ResetTransform](./resettransform/)() | يعيد تعيين مصفوفة التحويل الخاصة بالكائن الحالي لتصبح مصفوفة هوية. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | يدور التحول الهندسي المحلي بالزاوية المحددة وفق الترتيب المحدد. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | يقوم بتكبير/تصغير التحول الهندسي المحلي بالعوامل المحددة وفق الترتيب المحدد. |
| [set_Alignment](./set_alignment/)(Drawing2D::PenAlignment) | يضبط محاذاة العنصر [Pen](./) الحالي. |
| [set_Brush](./set_brush/)(const SharedPtr\<Brush\>\&) | يضبط كائن [Brush](../brush/) لهذا القلم. |
| [set_Color](./set_color/)(const Color\&) | يضبط لون هذا القلم. |
| [set_CompoundArray](./set_compoundarray/)(const System::ArrayPtr\<float\>\&) | يضبط مصفوفة من القيم التي تحدد قلمًا مركبًا. |
| [set_CustomEndCap](./set_customendcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | يضبط غطاء نهاية الخط المخصص. |
| [set_CustomStartCap](./set_customstartcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | يضبط غطاء بداية الخط المخصص. |
| [set_DashCap](./set_dashcap/)(Drawing2D::DashCap) | يضبط قيمة تحدد الغطاء المستخدم في كلا طرفي الخط المتقطع. |
| [set_DashOffset](./set_dashoffset/)(float) | يضبط المسافة من بداية الخط إلى بداية نمط الشرط. |
| [set_DashPattern](./set_dashpattern/)(const System::ArrayPtr\<float\>\&) | يضبط مصفوفة تحدد نمط الشرط المخصص في خط متقطع. تتكون المصفوفة من أرقام تحدد أطوال الشرط والمسافات المتناوبة. |
| [set_DashStyle](./set_dashstyle/)(Drawing2D::DashStyle) | يضبط قيمة تحدد نمط الشرط للعنصر [Pen](./) الحالي. |
| [set_EndCap](./set_endcap/)(Drawing2D::LineCap) | يضبط غطاء نهاية الخط للعنصر [Pen](./) الحالي. |
| [set_LineJoin](./set_linejoin/)(Drawing2D::LineJoin) | يضبط قيمة تحدد كيفية ربط الخطوط التي يرسمها كائن [Pen](./). |
| [set_MiterLimit](./set_miterlimit/)(float) | يضبط حد سماكة الوصلة في زاوية ميتير. |
| [set_StartCap](./set_startcap/)(Drawing2D::LineCap) | يضبط غطاء الخط الابتدائي لكائن [Pen](./) الحالي. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | يضبط كائن Matrix يحدد التحويلات الهندسية للقلم الممثل بواسطة الكائن الحالي. |
| [set_Width](./set_width/)(float) | يضبط عرض كائن [Pen](./) الحالي. |
| [SetLineCap](./setlinecap/)(Drawing2D::LineCap, Drawing2D::LineCap, Drawing2D::DashCap) | غير مُنفَّذ. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | ينقل التحول الهندسي المحلي بالأبعاد المحددة وفق الترتيب المحدد. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
