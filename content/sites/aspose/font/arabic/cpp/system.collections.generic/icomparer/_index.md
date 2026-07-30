---
title: "الفئة System::Collections::Generic::IComparer"
linktitle: "IComparer"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Collections::Generic::IComparer. واجهة تقارن كائنين من حيث الأكبر-المساوي-الأصغر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال في التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2000
url: /ar/cpp/system.collections.generic/icomparer/
---
## IComparer class


واجهة تقارن كائنين من حيث الأكبر-المساوي-الأصغر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال في التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T>class IComparer : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Compare](./compare/)(args_type, args_type) const | دالة [Comparison](../../system/comparison/) |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [args_type](./args_type/) | معلومات RTTI. |

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
