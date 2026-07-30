---
title: "فئة System::BoxedValueBase"
linktitle: "BoxedValueBase"
second_title: "Aspose.Font لـ C++"
description: "فئة System::BoxedValueBase. فئة أساسية تُعرّف واجهة وتُنفّذ بعض الأساليب الأساسية للفئة المشتقة التي تمثل قيمة مُغَلَّفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغّل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 900
url: /ar/cpp/system/boxedvaluebase/
---
## BoxedValueBase class


فئة أساسية تُعرّف واجهة وتُنفّذ بعض الأساليب الأساسية للفئة المشتقة التي تمثل قيمة مُغَلَّفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغّل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class BoxedValueBase : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() const | يرجع القيمة التي تمثل نوع القيمة المُغَلَّفة التي يمثلها الكائن الحالي. |
| virtual [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const | يحوّل القيمة المُغَلَّفة التي يمثلها الكائن الحالي إلى قيمة عدد صحيح 64‑بت. |
| virtual [IsBoxedEnum](./isboxedenum/)() | يحدد ما إذا كان الكائن الحالي يمثل قيمة مُغَلَّفة من نوع تعداد. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&, bool) | يُغَلِّف قيمة ثابت التعداد المحدد بالاسم المحدد. تُحدِّد معلمة ما إذا كان يجب تجاهل حالة الأحرف عند تفسير السلسلة التي تحدد اسم ثابت التعداد. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&) | يُغَلِّف قيمة ثابت التعداد المحدد بالاسم المحدد. |
| [ToString](./tostring/)(const System::String\&) const | يحوِّل الكائن المُغَلَّف إلى سلسلة باستخدام سلسلة تنسيق محددة. |
| virtual [ToString](./tostring/)() const | نظير طريقة C# [Object.ToString()](../object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة نصية. |
## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
