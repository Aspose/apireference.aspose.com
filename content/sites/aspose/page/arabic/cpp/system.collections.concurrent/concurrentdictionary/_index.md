---
title: "فئة System::Collections::Concurrent::ConcurrentDictionary"
linktitle: "ConcurrentDictionary"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Collections::Concurrent::ConcurrentDictionary. تنفيذ قاموس آمن للخيوط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.collections.concurrent/concurrentdictionary/
---
## ConcurrentDictionary class


تنفيذ قاموس آمن للخيوط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<class TKey,class TValue>class ConcurrentDictionary : public System::Collections::Generic::Dictionary<TKey, TValue>
```


| Parameter | الوصف |
| --- | --- |
| TKey | نوع المفتاح. |
| TValue | نوع القيمة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const TKey\&, const TValue\&) override | يضيف قيمة إلى القاموس. |
| [Clear](./clear/)() override | يحذف جميع العناصر في الحاوية. |
| [CopyTo](./copyto/)(ArrayPtr\<System::Collections::Generic::KeyValuePair\<TKey, TValue\>\>, int) override | ينسخ عناصر الحاوية إلى عناصر مصفوفة موجودة. |
| [get_KeysInternal](./get_keysinternal/)() const override | يحصل على مجموعة مغلفة للوصول إلى مفاتيح القاموس. |
| [idx_set](./idx_set/)(const TKey\&, TValue) override | معلومات RTTI. |
| [Remove](./remove/)(const TKey\&) override | يزيل العنصر من الحاوية. |
| [TryAdd](./tryadd/)(const TKey\&, const TValue\&) | يحاول إضافة زوج المفتاح/القيمة إلى القاموس. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [BaseType](./basetype/) | نوع التنفيذ. |
| [ThisType](./thistype/) | هذا النوع. |
## ملاحظات



```cpp
#include <system/collections/concurrent/concurrent_dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  const int itemsCount = 32;

  // إنشاء نسخة من الفئة ConcurrentDictionary-class.
  auto concurrentDictionary = MakeObject<ConcurrentDictionary<int, int>>();

  // ملء القاموس المتزامن.
  for (auto i = 0; i < itemsCount; ++i)
  {
    concurrentDictionary->Add(i, i * i);
  }

  Console::WriteLine(concurrentDictionary->idx_get(3));

  return 0;
}
/*
This code example produces the following output:
9
*/
```

## انظر أيضًا

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [System::Collections::Concurrent](../)
* Library [Aspose.Page for C++](../../)
