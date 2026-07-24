---
title: "System::Collections::Generic::SortedList::Enumerator فئة"
linktitle: "المُعدِّد"
second_title: "Aspose.Page لـ C++"
description: "System::Collections::Generic::SortedList::Enumerator فئة. فئة تعداد للتنقل عبر القائمة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائماً قم بلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
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
| [Enumerator](./enumerator/)(const Ptr\&) | ينشئ عدادًا يتنقل عبر القاموس المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) اسم مستعار للنوع. |
## انظر أيضًا

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
