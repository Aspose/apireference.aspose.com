---
title: "فئة System::Collections::Generic::Dictionary"
linktitle: "Dictionary"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::Dictionary. إعلان مسبق لفئة Dictionary في C++."
type: docs
weight: 1100
url: /ar/cpp/system.collections.generic/dictionary/
---
## Dictionary class


إعلان مسبق لفئة [Dictionary](./).

```cpp
template<typename TKey,typename TValue>class Dictionary : public System::Collections::Generic::BaseDictionary<std::unordered_map<TKey, TValue, EqualityComparerHashAdapter<TKey>, EqualityComparerAdapter<TKey>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
```


| معامل | الوصف |
| --- | --- |
| TKey | نوع المفتاح. |
| TValue | نوع القيمة. |
## Nested classes

* Class [Enumerator](./enumerator/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Dictionary](./dictionary/)() | ينشئ قاموسًا فارغًا. |
| [Dictionary](./dictionary/)(const map_t\&) | ينسخ البيانات من الخريطة. |
| [Dictionary](./dictionary/)(int) | تجاوز الذي يتCorrespond إلى إنشاء قاموس مُخصص مسبقًا؛ لا يقوم بأي تخصيص فعليًا. |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | منشئ النسخ. |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | منشئ النسخ. |
| [Dictionary](./dictionary/)(const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | ينشئ قاموسًا فارغًا. |
| [Dictionary](./dictionary/)(int, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | ينشئ قاموسًا فارغًا. |
| [GetEnumerator](./getenumerator/)() override | ينشئ كائن عداد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | مؤشر إلى واجهة قابلة للتعداد. |
| [IEnumeratorPtr](./ienumeratorptr/) | مؤشر إلى المكرّر. |
| [KeyCollection](./keycollection/) | معلومات RTTI. |
| [KVPair](./kvpair/) | نوع زوج المفتاح والقيمة. |
| [map_t](./map_t/) | نوع البيانات الأساسي. |
| [Ptr](./ptr/) | نوع المؤشر. |
| [ValueCollection](./valuecollection/) | مجموعة القيم لاستخراجها. |
## ملاحظات


[Dictionary](./) that maps values to keys. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // إنشاء مثال فئة Dictionary.
  auto dictionary = MakeObject<Dictionary<int, String>>();

  // املأ القاموس.
  dictionary->Add(0, u"Foo");
  dictionary->Add(1, u"Bar");
  dictionary->Add(2, u"Baz");

  // اطبع عناصر القاموس.
  for (const auto &pair: dictionary)
  {
    std::cout << pair.get_Key() << " - " << pair.get_Value() << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
0 - Foo
1 - Bar
2 - Baz
*/
```

## انظر أيضًا

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
