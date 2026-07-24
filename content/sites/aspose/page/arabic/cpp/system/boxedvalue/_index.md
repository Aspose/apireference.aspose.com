---
title: "الفئة System::BoxedValue"
linktitle: "BoxedValue"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::BoxedValue. تمثل قيمة مُغَلَّفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثيل لهذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 800
url: /ar/cpp/system/boxedvalue/
---
## BoxedValue class


تمثل قيمة مُغَلَّفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم أبداً بإنشاء مثيل لهذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<class T>class BoxedValue : public System::BoxedValueBase
```


| Parameter | الوصف |
| --- | --- |
| T | نوع القيمة المُغَلَّفة التي تمثلها الفئة |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [BoxedValue](./boxedvalue/)(const T\&) | ينشئ كائناً يمثل القيمة المحددة مُغَلَّفة. |
| [Equals](./equals/)(ptr) override | يحدد مساواة القيم المُغَلَّفة التي تمثلها الكائنات الحالية والمحددة. |
| [GetHashCode](./gethashcode/)() const override | يعيد رمز تجزئة للكائن الحالي. |
| [GetType](./gettype/)() const override | يحصل على النوع الفعلي للكائن. |
| [GetTypeCode](./gettypecode/)() const override | يرجع القيمة التي تمثل نوع القيمة المُغَلَّفة التي يمثلها الكائن الحالي. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | يرجع القيمة الرقمية للكائن المُغَلَّف إذا كان يمكن تحويله، وإلا صفر. |
| [is](./is/)() const | يحدد ما إذا كان نوع القيمة المُغَلَّفة التي يمثلها الكائن الحالي هو **V**. |
| [IsBoxedEnum](./isboxedenum/)() override | يحدد ما إذا كان الكائن الحالي يمثل قيمة مُغَلَّفة من نوع تعداد. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&, bool) | يُغَلِّف قيمة ثابت التعداد المحدد بالاسم المحدد. يحدد أحد المعاملات ما إذا كان يجب تجاهل حالة الأحرف عند تفسير السلسلة التي تحدد اسم ثابت التعداد. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&) | يُغَلِّف قيمة ثابت التعداد المحدد بالاسم المحدد. |
| [ToString](./tostring/)() const override | يحوِّل القيمة المُغَلَّفة التي يمثلها الكائن الحالي إلى سلسلة. |
| [ToString](../boxedvaluebase/tostring/)(const System::String\&) const | يحوِّل الكائن المُغَلَّف إلى سلسلة باستخدام سلسلة تنسيق محددة. |
| [unbox](./unbox/)() const | يفك تغليف القيمة التي يمثلها الكائن الحالي. |

## انظر أيضًا

* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
