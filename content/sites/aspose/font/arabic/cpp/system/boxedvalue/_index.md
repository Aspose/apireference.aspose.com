---
title: "الفئة System::BoxedValue"
linktitle: "BoxedValue"
second_title: "Aspose.Font لـ C++"
description: "فئة System::BoxedValue. تمثل قيمة مُغَلَّفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغّل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة بمؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 800
url: /ar/cpp/system/boxedvalue/
---
## BoxedValue class


تمثل قيمة مُغَلَّفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغّل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة بمؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<class T>class BoxedValue : public System::BoxedValueBase
```


| معامل | الوصف |
| --- | --- |
| T | نوع القيمة المُغَلَّفة التي تمثلها الفئة |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [BoxedValue](./boxedvalue/)(const T\&) | ينشئ كائنًا يمثل القيمة المحددة مُغَلَّفة. |
| [Equals](./equals/)(ptr) override | يحدد مساواة القيم المُغَلَّفة التي تمثلها الكائنات الحالية والمحددة. |
| [GetHashCode](./gethashcode/)() const override | يعيد رمز تجزئة للكائن الحالي. |
| [GetType](./gettype/)() const override | يحصل على النوع الفعلي للكائن. |
| [GetTypeCode](./gettypecode/)() const override | يرجع القيمة التي تمثل نوع القيمة المُغَلَّفة التي يمثلها الكائن الحالي. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | يرجع القيمة الرقمية للكائن المُغَلَّف إذا كان يمكن تحويله، وإلا صفر. |
| [is](./is/)() const | يحدد ما إذا كان نوع القيمة المُغَلَّفة التي يمثلها الكائن الحالي هو **V**. |
| [IsBoxedEnum](./isboxedenum/)() override | يحدد ما إذا كان الكائن الحالي يمثل قيمة مُغَلَّفة من نوع تعداد. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&, bool) | يُغَلِّف قيمة ثابت التعداد المحدد بالاسم المحدد. تُحدِّد معلمة ما إذا كان يجب تجاهل حالة الأحرف عند تفسير السلسلة التي تحدد اسم ثابت التعداد. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&) | يُغَلِّف قيمة ثابت التعداد المحدد بالاسم المحدد. |
| [ToString](./tostring/)() const override | يحوِّل القيمة المُغَلَّفة التي يمثلها الكائن الحالي إلى سلسلة. |
| [ToString](../boxedvaluebase/tostring/)(const System::String\&) const | يحوِّل الكائن المُغَلَّف إلى سلسلة باستخدام سلسلة تنسيق محددة. |
| [unbox](./unbox/)() const | يفكّ تغليف القيمة التي يمثلها الكائن الحالي. |

## انظر أيضًا

* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
