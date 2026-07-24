---
title: "System::Collections::Concurrent::ConcurrentDictionary क्लास"
linktitle: "ConcurrentDictionary"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Concurrent::ConcurrentDictionary क्लास। थ्रेड-सेफ़ डिक्शनरी इम्प्लीमेंटेशन। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही अलोकेट किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग C++ में फ़ंक्शन्स को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 100
url: /hi/cpp/system.collections.concurrent/concurrentdictionary/
---
## ConcurrentDictionary class


थ्रेड-सेफ़ डिक्शनरी इम्प्लीमेंटेशन। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही अलोकेट किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन्स को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
template<class TKey,class TValue>class ConcurrentDictionary : public System::Collections::Generic::Dictionary<TKey, TValue>
```


| पैरामीटर | विवरण |
| --- | --- |
| TKey | कुंजी प्रकार। |
| TValue | वैल्यू टाइप। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const TKey\&, const TValue\&) override | डिक्शनरी में मान जोड़ता है। |
| [Clear](./clear/)() override | कंटेनर में सभी तत्वों को हटाता है। |
| [CopyTo](./copyto/)(ArrayPtr\<System::Collections::Generic::KeyValuePair\<TKey, TValue\>\>, int) override | कंटेनर के तत्वों को मौजूदा एरे के तत्वों में कॉपी करता है। |
| [get_KeysInternal](./get_keysinternal/)() const override | डिक्शनरी कुंजियों तक पहुँचने के लिए रैपर कलेक्शन प्राप्त करता है। |
| [idx_set](./idx_set/)(const TKey\&, TValue) override | RTTI जानकारी। |
| [Remove](./remove/)(const TKey\&) override | कंटेनर से तत्व हटाता है। |
| [TryAdd](./tryadd/)(const TKey\&, const TValue\&) | डिक्शनरी में कुंजी/मान जोड़ी जोड़ने का प्रयास करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [BaseType](./basetype/) | इम्प्लीमेंटेशन प्रकार। |
| [ThisType](./thistype/) | यह प्रकार। |
## टिप्पणियाँ



```cpp
#include <system/collections/concurrent/concurrent_dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  const int itemsCount = 32;

  // ConcurrentDictionary-क्लास का उदाहरण बनाएं।
  auto concurrentDictionary = MakeObject<ConcurrentDictionary<int, int>>();

  // समकालिक शब्दकोश को भरें।
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

## संबंधित देखें

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [System::Collections::Concurrent](../)
* Library [Aspose.Page for C++](../../)
