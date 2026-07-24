---
title: "System::Collections::Generic::Dictionary क्लास"
linktitle: "डिक्शनरी"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::Dictionary क्लास। C++ में डिक्शनरी क्लास की फॉरवर्ड डिक्लेरेशन।"
type: docs
weight: 1100
url: /hi/cpp/system.collections.generic/dictionary/
---
## Dictionary class


फॉरवर्ड डिक्लेरेशन ऑफ [Dictionary](./) क्लास।

```cpp
template<typename TKey,typename TValue>class Dictionary : public System::Collections::Generic::BaseDictionary<std::unordered_map<TKey, TValue, EqualityComparerHashAdapter<TKey>, EqualityComparerAdapter<TKey>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
```


| पैरामीटर | विवरण |
| --- | --- |
| TKey | कुंजी प्रकार। |
| TValue | वैल्यू टाइप। |
## Nested classes

* Class [Enumerator](./enumerator/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Dictionary](./dictionary/)() | खाली डिक्शनरी बनाता है। |
| [Dictionary](./dictionary/)(const map_t\&) | मैप से डेटा कॉपी करता है। |
| [Dictionary](./dictionary/)(int) | ओवरलोड जो प्री-एलोकेटेड डिक्शनरी बनाने से मेल खाता है; वास्तव में कोई एलोकेशन नहीं करता। |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | कॉपी कंस्ट्रक्टर। |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | कॉपी कंस्ट्रक्टर। |
| [Dictionary](./dictionary/)(const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | खाली डिक्शनरी बनाता है। |
| [Dictionary](./dictionary/)(int, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | खाली डिक्शनरी बनाता है। |
| [GetEnumerator](./getenumerator/)() override | एन्यूमरेटर ऑब्जेक्ट बनाता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | एन्यूमेरेबल इंटरफ़ेस का पॉइंटर। |
| [IEnumeratorPtr](./ienumeratorptr/) | एन्यूमेरेटर का पॉइंटर। |
| [KeyCollection](./keycollection/) | RTTI जानकारी। |
| [KVPair](./kvpair/) | की-वैल्यू जोड़ी प्रकार। |
| [map_t](./map_t/) | अधोस्थ डेटा प्रकार। |
| [Ptr](./ptr/) | पॉइंटर प्रकार। |
| [ValueCollection](./valuecollection/) | निकालने के लिए मानों का संग्रह। |
## टिप्पणियाँ


[Dictionary](./) that maps values to keys. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Dictionary-क्लास का इंस्टेंस बनाएं।
  auto dictionary = MakeObject<Dictionary<int, String>>();

  // डिक्शनरी को भरें।
  dictionary->Add(0, u"Foo");
  dictionary->Add(1, u"Bar");
  dictionary->Add(2, u"Baz");

  // डिक्शनरी आइटम्स को प्रिंट करें।
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

## संबंधित देखें

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
