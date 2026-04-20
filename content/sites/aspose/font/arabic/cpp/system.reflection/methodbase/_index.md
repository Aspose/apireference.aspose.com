---
title: "فئة System::Reflection::MethodBase"
linktitle: "MethodBase"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Reflection::MethodBase. معلومات أساسية عن الطريقة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 800
url: /ar/cpp/system.reflection/methodbase/
---
## MethodBase class


المعلومات الأساسية عن الطريقة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class MethodBase : public System::Reflection::MemberInfo
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | الإشارة إلى نوع العضو - طريقة، مُنشئ، حدث، وما إلى ذلك. |
| static [GetCurrentMethod](./getcurrentmethod/)(const String\&) | تسمح هذه الطريقة بالحصول على اسم الطريقة الحالية. يقوم المترجم باستبدال ASPOSE_CURRENT_FUNCTION كمعامل تلقائيًا. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(MethodBase, CODEPORTING_ARGS(const String\&full_name), CODEPORTING_ARGS(full_name)) |  |
| [MethodBase](./methodbase/)() | يُنشئ نسخة جديدة من الفئة [MethodBase](./). |
## انظر أيضًا

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
