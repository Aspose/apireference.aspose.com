---
title: "System::Delegate< ReturnType(ArgumentTypes...)> क्लास"
linktitle: "Delegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Page C++ के लिए"
description: "System::Delegate< ReturnType(ArgumentTypes...)> क्लास। एक फ़ंक्शन, मेथड या फ़ंक्शन ऑब्जेक्ट के पॉइंटर का प्रतिनिधित्व करता है। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शनों को मान द्वारा या रेफ़रेंस द्वारा पास किया जाना चाहिए। C++ में इस प्रकार की वस्तुओं को प्रबंधित करने के लिए System::SmartPtr क्लास का कभी उपयोग न करें।"
type: docs
weight: 2100
url: /hi/cpp/system/delegate_returntype(argumenttypes...)_/
---
## Delegate< ReturnType(ArgumentTypes...)> class


एक फ़ंक्शन, मेथड या फ़ंक्शन ऑब्जेक्ट के पॉइंटर का प्रतिनिधित्व करता है। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शनों को मान द्वारा या रेफ़रेंस द्वारा पास किया जाना चाहिए। इस प्रकार की वस्तुओं को प्रबंधित करने के लिए कभी भी [System::SmartPtr](../smartptr/) क्लास का उपयोग न करें।

```cpp
template<class ReturnType,class...>class Delegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| पैरामीटर | विवरण |
| --- | --- |
| ReturnType | क्लास द्वारा प्रतिनिधित्व किया गया फ़ंक्शन, मेथड या फ़ंक्शन ऑब्जेक्ट पॉइंटर का रिटर्न टाइप |
| ArgumentTypes | क्लास द्वारा प्रतिनिधित्व किया गया फ़ंक्शन, मेथड या फ़ंक्शन ऑब्जेक्ट पॉइंटर की आर्ग्यूमेंट सूची |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Delegate](./delegate/)() | डिफ़ॉल्ट कंस्ट्रक्टर। वह डेलीगेट ऑब्जेक्ट बनाता है जो किसी भी चीज़ की ओर संकेत नहीं करता। |
| [Delegate](./delegate/)(const Delegate\&) |  |
| [Delegate](./delegate/)(Delegate\&&) | मूविंग कॉपी कंस्ट्रक्टर। निर्दिष्ट डेलीगेट द्वारा संकेतित इकाई का स्वामित्व लेता है। |
| [Delegate](./delegate/)(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) | कंस्ट्रक्टर। निर्दिष्ट फ्री फ़ंक्शन या स्टैटिक मेथड के पॉइंटर से डेलीगेट ऑब्जेक्ट बनाता है। |
| [Delegate](./delegate/)(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) | कंस्ट्रक्टर। std::bind() द्वारा उत्पन्न फ़ंक्शन ऑब्जेक्ट के निर्दिष्ट पॉइंटर से डेलीगेट बनाता है। |
| [Delegate](./delegate/)(int, T\&) | कंस्ट्रक्टर। निर्दिष्ट फ़ंक्शन ऑब्जेक्ट से डेलीगेट बनाता है। |
| [Delegate](./delegate/)(long, T\&&) | मूविंग कंस्ट्रक्टर। निर्दिष्ट फ़ंक्शन ऑब्जेक्ट से डेलीगेट बनाता है। |
| [Delegate](./delegate/)(MemberType ClassType::*, ClassType *) | कंस्ट्रक्टर। निर्दिष्ट ऑब्जेक्ट की निर्दिष्ट नॉन-स्टैटिक मेथड की ओर संकेत करने वाला डेलीगेट बनाता है। |
| [Delegate](./delegate/)(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) | कंस्ट्रक्टर। निर्दिष्ट ऑब्जेक्ट की निर्दिष्ट नॉन-स्टैटिक मेथड की ओर संकेत करने वाला डेलीगेट बनाता है। |
| [Delegate](./delegate/)(std::function\<R(Args...)>) | एक std::function फ़ंक्शन ऑब्जेक्ट की ओर संकेत करने वाला डेलीगेट ऑब्जेक्ट बनाता है। |
| [Empty](./empty/)() const | निर्धारित करता है कि वर्तमान डेलीगेट ऑब्जेक्ट खाली है या नहीं, उदाहरण के लिए यह किसी भी इकाई की ओर संकेत नहीं करता। |
| [operator()](./operator()/)(ArgumentTypes...) const | वर्तमान डेलीगेट ऑब्जेक्ट द्वारा संकेतित फ़ंक्शन, मेथड या फ़ंक्शन ऑब्जेक्ट को कॉल करता है। |
| [operator=](./operator=/)(const Delegate\&) |  |
| [operator=](./operator=/)(Delegate\&&) | मूविंग असाइनमेंट ऑपरेटर। निर्दिष्ट डेलीगेट द्वारा संकेतित इकाई का स्वामित्व लेता है। |
| [operator==](./operator==/)(const Delegate\&) const | दो डेलीगेट ऑब्जेक्ट्स की तुलना करता है यह जांचने के लिए कि वे एक ही इकाई की ओर संकेत करते हैं या नहीं। |
## टिप्पणियाँ



```cpp
#include "system/delegate.h"
#include <iostream>

// डेलीगेट को घोषित करें।
using Message = System::Delegate<void()>;

void PrintMessage()
{
  std::cout << "Hello, world!" << std::endl;
}

int main()
{
  // वेरिएबल को PrintMessage फ़ंक्शन का पता असाइन करें।
  Message mes = Message(&PrintMessage);

  // फ़ंक्शन को कॉल करें।
  mes();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
