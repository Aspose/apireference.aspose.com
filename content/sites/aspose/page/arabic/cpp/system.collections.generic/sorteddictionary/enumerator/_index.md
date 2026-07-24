---
title: "System::Collections::Generic::SortedDictionary::Enumerator فئة"
linktitle: "المُعدِّد"
second_title: "Aspose.Page لـ C++"
description: "System::Collections::Generic::SortedDictionary::Enumerator فئة. نوع عداد للتنقل عبر القاموس. يجب تخصيص كائنات هذه الفئة باستخدام الدالة System::MakeObject() فقط. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2100
url: /ar/cpp/system.collections.generic/sorteddictionary/enumerator/
---
## Enumerator class


[Enumerator](./) type to iterate through dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Enumerator](./enumerator/)(const Ptr\&) | ينشئ عدادًا فوق قاموس محدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) اسم مستعار للنوع. |
## انظر أيضًا

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedDictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
