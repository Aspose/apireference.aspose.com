---
title: "الفئة System::Drawing::Drawing2D::CustomLineCap"
linktitle: "CustomLineCap"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Drawing::Drawing2D::CustomLineCap. تمثل غطاء خط معرف من قبل المستخدم. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class


تمثل غطاء خط معرف من قبل المستخدم. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class CustomLineCap : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Clone](./clone/)() | يعيد نسخة من الكائن الحالي. |
| [CustomLineCap](./customlinecap/)(const SharedPtr\<GraphicsPath\>\&, const SharedPtr\<GraphicsPath\>\&, LineCap, float) | ينشئ مثيلاً جديدًا من الفئة [CustomLineCap](./) التي تمثل غطاء خط معرف من قبل المستخدم بالخصائص المحددة. |
| [Dispose](./dispose/)() | يطلق جميع موارد نظام التشغيل التي تم الحصول عليها بواسطة الكائن الحالي. |
| [get_BaseCap](./get_basecap/)() const | إرجاع قابض الخط الأساسي الذي تم إنشاء هذا الغطاء المخصص منه. |
| [get_BaseInset](./get_baseinset/)() const | إرجاع المسافة بين الخط والغطاء. |
| [get_StrokeJoin](./get_strokejoin/)() const | إرجاع قيمة [LineJoin](../linejoin/) التي تحدد كيفية ربط خطوط هذا الغطاء المخصص. |
| [get_WidthScale](./get_widthscale/)() const | إرجاع مقياس هذا الغطاء المخصص. |
| [GetStrokeCaps](./getstrokecaps/)(LineCap\&, LineCap\&) | يحصل على قابضات الخط البداية والنهاية للغطاء المخصص الممثل بالكائن الحالي. |
| [set_BaseCap](./set_basecap/)(LineCap) | يضبط قيمة قابض الخط الأساسي لهذا الغطاء المخصص. |
| [set_BaseInset](./set_baseinset/)(float) | يضبط المسافة بين الخط والغطاء. |
| [set_StrokeJoin](./set_strokejoin/)(LineJoin) | يضبط قيمة [LineJoin](../linejoin/) التي تحدد كيفية ربط خطوط هذا الغطاء المخصص. |
| [set_WidthScale](./set_widthscale/)(float) | يضبط قيمة المقياس لهذا الغطاء المخصص. |
| [SetStrokeCaps](./setstrokecaps/)(LineCap, LineCap) | يضبط قابضات الخط البداية والنهاية للغطاء المخصص الممثل بالكائن الحالي. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
