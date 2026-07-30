---
title: "فئة System::Collections::Generic::DefaultComparer"
linktitle: "DefaultComparer"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::DefaultComparer. فئة المقارن الافتراضية. تستخدم المشغل < والمشغل == لمقارنة القيم. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1000
url: /ar/cpp/system.collections.generic/defaultcomparer/
---
## DefaultComparer class


فئة المقارن الافتراضية. تستخدم المشغل < والمشغل == لمقارنة القيم. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<class T>class DefaultComparer : public System::Collections::Generic::IComparer<T>
```


| معامل | الوصف |
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
* Library [Aspose.Font for C++](../../)
