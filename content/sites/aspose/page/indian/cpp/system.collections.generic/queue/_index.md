---
title: "System::Collections::Generic::Queue class"
linktitle: "Queue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::Queue class. C++ में Queue क्लास की फॉरवर्ड डिक्लेरेशन।"
type: docs
weight: 3600
url: /hi/cpp/system.collections.generic/queue/
---
## Queue class


[Queue](./) class forward declaration.

```cpp
template<typename T>class Queue : public System::Collections::Generic::IEnumerable<T>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | तत्व प्रकार। |
## Nested classes

* Class [Enumerator](./enumerator/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Clear](./clear/)() | क्यू में सभी तत्वों को हटाता है। |
| virtual [Contains](./contains/)(const T\&) const | ऑपरेटर == का उपयोग करके तत्वों की तुलना करके जांचता है कि क्यू में विशिष्ट तत्व मौजूद है या नहीं। |
| [data](./data/)() | अधोस्तरीय डेटा संरचना एक्सेसर। |
| [data](./data/)() const | अधोस्तरीय डेटा संरचना एक्सेसर। |
| [Dequeue](./dequeue/)() | क्यू की शुरुआत से आइटम प्राप्त करता है। |
| [Enqueue](./enqueue/)(const T\&) | क्यू के अंत में आइटम डालता है। |
| virtual [get_Count](./get_count/)() const | क्यू में तत्वों की संख्या प्राप्त करता है। |
| [GetEnumerator](./getenumerator/)() override | क्यू के माध्यम से इटरेट करने के लिए एन्यूमरेटर प्राप्त करता है। |
| [Peek](./peek/)() | क्यू की शुरुआत से आइटम प्राप्त करता है, लेकिन क्यू से उसे हटाता नहीं है। |
| [Queue](./queue/)() | खाली क्यू बनाता है। |
| [Queue](./queue/)(int) | खाली क्यू बनाता है। |
| [Queue](./queue/)(const SharedPtr\<IEnumerable\<T\>\>\&) | कॉपी कंस्ट्रक्टर। |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | वर्तमान कंटेनर के लिए begin const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | वर्तमान कंटेनर के लिए begin इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | वर्तमान कंटेनर के लिए end const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | वर्तमान कंटेनर के लिए end इटररेटर का कार्यान्वयन प्राप्त करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | एक ही प्रकार के तत्वों का कंटेनर। |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) प्रकार। |
| [queue_t](./queue_t/) | RTTI जानकारी। |
| [ValueType](./valuetype/) | यह प्रकार। |
## टिप्पणियाँ


[Queue](./) container wrapping STL list. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/queue.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void PrintItems(const SmartPtr<IEnumerable<int>> &queue)
{
  for (const int item: queue)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Queue-क्लास का उदाहरण बनाएँ।
  auto queue = MakeObject<Queue<int>>();

  // क्यू को भरें।
  queue->Enqueue(1);
  queue->Enqueue(2);
  queue->Enqueue(3);

  // पहला क्यू आइटम प्रिंट करें। Peek मेथड क्यू से कोई आइटम नहीं हटाता है।
  std::cout << queue->Peek() << std::endl;
  // क्यू के आइटम प्रिंट करें।
  PrintItems(queue);

  // पहला क्यू आइटम प्रिंट करें। Dequeue मेथड क्यू से एक आइटम हटाता है।
  std::cout << queue->Dequeue() << std::endl;
  // क्यू के आइटम प्रिंट करें।
  PrintItems(queue);

  return 0;
}
/*
This code example produces the following output:
1
1 2 3
1
2 3
*/
```

## संबंधित देखें

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
