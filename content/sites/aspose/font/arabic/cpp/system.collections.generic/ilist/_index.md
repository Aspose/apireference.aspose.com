---
title: "فئة System::Collections::Generic::IList"
linktitle: "IList"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::IList. واجهة حاوية مفهرسة للعناصر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2600
url: /ar/cpp/system.collections.generic/ilist/
---
## IList class


واجهة حاوية مفهرسة للعناصر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T>class IList : public System::Collections::Generic::ICollection<T>
```


| معامل | الوصف |
| --- | --- |
| T | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_IsFixedSize](./get_isfixedsize/)() | يتحقق مما إذا كانت المجموعة ذات حجم ثابت. |
| virtual [idx_get](./idx_get/)(int) const | يحصل على العنصر عند الفهرس المحدد. |
| virtual [idx_set](./idx_set/)(int, T) | يضبط العنصر عند الفهرس المحدد. |
| virtual [IndexOf](./indexof/)(const T\&) const | يحصل على فهرس الظهور الأول للعنصر في الحاوية. |
| virtual [Insert](./insert/)(int, const T\&) | يدرج العنصر في الموضع المحدد، مع إزاحة العناصر الأخرى. |
| virtual [RemoveAt](./removeat/)(int) | يزيل العنصر عند الفهرس المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [BaseType](./basetype/) | معلومات RTTI. |
| [ThisType](./thistype/) | هذا النوع. |
| [ValueType](./valuetype/) | نوع القيمة. |

## انظر أيضًا

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
