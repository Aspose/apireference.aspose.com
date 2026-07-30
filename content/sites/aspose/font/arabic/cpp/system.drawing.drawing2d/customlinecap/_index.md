---
title: "الفئة System::Drawing::Drawing2D::CustomLineCap"
linktitle: "CustomLineCap"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Drawing::Drawing2D::CustomLineCap. تمثل غطاء خط معرف من قبل المستخدم. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class


تمثل غطاء خط معرف من قبل المستخدم. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class CustomLineCap : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Clone](./clone/)() | يعيد نسخة من الكائن الحالي. |
| [CustomLineCap](./customlinecap/)(const SharedPtr\<GraphicsPath\>\&, const SharedPtr\<GraphicsPath\>\&, LineCap, float) | ينشئ نسخة جديدة من الفئة [CustomLineCap](./) التي تمثل غطاء خط معرف من قبل المستخدم بالخصائص المحددة. |
| [Dispose](./dispose/)() | يطلق جميع موارد نظام التشغيل التي حصل عليها الكائن الحالي. |
| [get_BaseCap](./get_basecap/)() const | يرجع غطاء الخط الأساسي الذي تم إنشاء هذا الغطاء المخصص منه. |
| [get_BaseInset](./get_baseinset/)() const | يرجع المسافة بين الخط والغطاء. |
| [get_StrokeJoin](./get_strokejoin/)() const | يرجع قيمة [LineJoin](../linejoin/) التي تحدد كيفية ربط خطوط هذا الغطاء المخصص. |
| [get_WidthScale](./get_widthscale/)() const | يرجع مقياس هذا الغطاء المخصص. |
| [GetStrokeCaps](./getstrokecaps/)(LineCap\&, LineCap\&) | يحصل على أغطية الخط البداية والنهاية للغطاء المخصص الذي يمثله الكائن الحالي. |
| [set_BaseCap](./set_basecap/)(LineCap) | يضبط قيمة غطاء الخط الأساسي لهذا الغطاء المخصص. |
| [set_BaseInset](./set_baseinset/)(float) | يضبط المسافة بين الخط والغطاء. |
| [set_StrokeJoin](./set_strokejoin/)(LineJoin) | يضبط قيمة [LineJoin](../linejoin/) التي تحدد كيفية ربط خطوط هذا الغطاء المخصص. |
| [set_WidthScale](./set_widthscale/)(float) | يضبط قيمة المقياس لهذا الغطاء المخصص. |
| [SetStrokeCaps](./setstrokecaps/)(LineCap, LineCap) | يضبط أغطية الخط البداية والنهاية للغطاء المخصص الذي يمثله الكائن الحالي. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
