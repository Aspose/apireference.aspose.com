---
title: "فئة System::Net::CookieComparer"
linktitle: "CookieComparer"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Net::CookieComparer. تُستخدم لمقارنة كائنات الفئة Cookie. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.net/cookiecomparer/
---
## CookieComparer class


تُستخدم لمقارنة كائنات الفئة [Cookie](../cookie/). يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class CookieComparer : public System::Collections::Generic::IComparer<System::SharedPtr<System::Net::Cookie>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | يقارن الكائنات المحددة. |
| static [get_Instance](./get_instance/)() | معلومات RTTI. |
## انظر أيضًا

* Class [IComparer](../../system.collections.generic/icomparer/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
