---
title: "System::Collections::Generic::Stack क्लास"
linktitle: "स्टैक"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::Stack क्लास। C++ में स्टैक क्लास की अग्र घोषणा।"
type: docs
weight: 4600
url: /hi/cpp/system.collections.generic/stack/
---
## Stack class


[Stack](./) class forward declaration.

```cpp
template<typename T>class Stack : public System::Collections::Generic::IEnumerable<T>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | तत्व प्रकार। |
## Nested classes

* Class [Enumerator](./enumerator/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AddRange](./addrange/)(IEnumerablePtr) | तत्वों को स्टैक में रखता है। |
| virtual [Clear](./clear/)() | स्टैक से सभी तत्वों को हटाता है। |
| virtual [Contains](./contains/)(const T\&) const | जाँचता है कि विशिष्ट आइटम कंटेनर में मौजूद है या नहीं; तुलना के लिए ऑपरेटर == का उपयोग करता है। |
| [data](./data/)() | आंतरिक डेटा संरचना अभिगमकर्ता। |
| [data](./data/)() const | आंतरिक डेटा संरचना अभिगमकर्ता। |
| virtual [get_Count](./get_count/)() const | स्टैक में तत्वों की संख्या प्राप्त करता है। |
| [GetEnumerator](./getenumerator/)() override | वर्तमान स्टैक के माध्यम से इटररेट करने के लिए एन्यूमरेटर प्राप्त करता है। |
| [Peek](./peek/)() | स्टैक के शीर्ष से तत्व प्राप्त करता है, लेकिन उसे स्टैक में रखता है। |
| [Pop](./pop/)() | स्टैक के शीर्ष से तत्व प्राप्त करता है। |
| [Push](./push/)(const T\&) | स्टैक के शीर्ष पर तत्व रखता है। |
| [Stack](./stack/)() | खाली स्टैक बनाता है। |
| [Stack](./stack/)(int) | खाली स्टैक बनाता है। |
| [Stack](./stack/)(IEnumerablePtr) | कॉपी कंस्ट्रक्टर। |
| virtual [ToArray](./toarray/)() | स्टैक को एरे में परिवर्तित करता है। |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | वर्तमान कंटेनर के लिए begin const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | वर्तमान कंटेनर के लिए begin इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | वर्तमान कंटेनर के लिए end const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | वर्तमान कंटेनर के लिए end इटररेटर का कार्यान्वयन प्राप्त करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | एक ही प्रकार के तत्वों को शामिल करने वाला संग्रह। |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) प्रकार। |
| [stack_t](./stack_t/) | RTTI जानकारी। |
| [ValueType](./valuetype/) | वैल्यू टाइप। |
## टिप्पणियाँ


[Stack](./) class wrapping std::list. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/stack.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void PrintItems(const SmartPtr<IEnumerable<int>> &stack)
{
  for (const auto item: stack)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Stack-क्लास का इंस्टेंस बनाएं।
  auto stack = MakeObject<Stack<int>>();

  // स्टैक को भरें।
  stack->Push(1);
  stack->Push(2);
  stack->Push(3);

  // स्टैक का अंतिम आइटम प्रिंट करें। Peek मेथड स्टैक से कोई आइटम नहीं हटाता है।
  std::cout << stack->Peek() << std::endl;
  PrintItems(stack);

  // स्टैक का अंतिम आइटम प्रिंट करें। Pop मेथड स्टैक से एक आइटम हटाता है।
  std::cout << stack->Pop() << std::endl;
  PrintItems(stack);

  return 0;
}
/*
This code example produces the following output:
3
3 2 1
3
2 1
*/
```

## संबंधित देखें

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
