---
title: "System::Net::CookieComparer فئة"
linktitle: "CookieComparer"
second_title: "Aspose.Page لـ C++"
description: "System::Net::CookieComparer فئة. تُستخدم لمقارنة مثيلات الفئة Cookie. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.net/cookiecomparer/
---
## CookieComparer class


تُستخدم لمقارنة مثيلات الفئة [Cookie](../cookie/). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

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
* Library [Aspose.Page for C++](../../)
