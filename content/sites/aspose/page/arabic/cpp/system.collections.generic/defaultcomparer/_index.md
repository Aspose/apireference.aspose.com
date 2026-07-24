---
title: "System::Collections::Generic::DefaultComparer فئة"
linktitle: "DefaultComparer"
second_title: "Aspose.Page لـ C++"
description: "System::Collections::Generic::DefaultComparer فئة. فئة المقارن الافتراضية. تستخدم العامل < والعامل == لمقارنة القيم. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل في C++."
type: docs
weight: 1000
url: /ar/cpp/system.collections.generic/defaultcomparer/
---
## DefaultComparer class


فئة المقارن الافتراضية. تستخدم العامل < والعامل == لمقارنة القيم. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل.

```cpp
template<class T>class DefaultComparer : public System::Collections::Generic::IComparer<T>
```


| Parameter | الوصف |
| --- | --- |
| T | النوع الجاري مقارنته. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Compare](./compare/)(typename ThisType::args_type, typename ThisType::args_type) const override | معلومات RTTI. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [BaseType](./basetype/) | الواجهة المُنفذة. |
| [ThisType](./thistype/) | النوع الحالي. |

## انظر أيضًا

* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
