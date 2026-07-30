---
title: "System::Collections::Generic::SortedList::Enumerator فئة"
linktitle: "المُعدِّد"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::Generic::SortedList::Enumerator فئة. فئة المُعدِّد للتنقل عبر القائمة. يجب تخصيص كائنات هذه الفئة باستخدام الدالة System::MakeObject() فقط. لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2600
url: /ar/cpp/system.collections.generic/sortedlist/enumerator/
---
## Enumerator class


[Enumerator](./) class to iterate through list. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Enumerator](./enumerator/)(const Ptr\&) | ينشئ مُعدِّداً يتنقل عبر القاموس المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) اسم مستعار للنوع. |
## انظر أيضًا

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
