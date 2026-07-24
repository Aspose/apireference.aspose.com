---
title: "System::Func class"
linktitle: "Func"
second_title: "Aspose.Page C++ के लिए"
description: "System::Func class. फ़ंक्शन डेलीगेट। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शनों को मान या रेफ़रेंस द्वारा पास किया जाना चाहिए। C++ में इस प्रकार की वस्तुओं को प्रबंधित करने के लिए System::SmartPtr क्लास का कभी उपयोग न करें।"
type: docs
weight: 2800
url: /hi/cpp/system/func/
---
## Func class


फ़ंक्शन डेलीगेट। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शनों को मान या रेफ़रेंस द्वारा पास किया जाना चाहिए। इस प्रकार की वस्तुओं को प्रबंधित करने के लिए कभी भी [System::SmartPtr](../smartptr/) क्लास का उपयोग न करें।

```cpp
template<typename...>class Func : public System::MulticastDelegate<::System::Detail::FuncArgsReorderer<void(), Args...>::type>
```


| पैरामीटर | विवरण |
| --- | --- |
| आर्ग्युमेंट्स | आर्ग्युमेंट्स कॉल करें, फिर अनिवार्य रिटर्न टाइप। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Func](./func/)() | डिफ़ॉल्ट कंस्ट्रक्टर जो null‑Func बनाता है। |
| [Func](./func/)(T\&&) | कंस्ट्रक्टर जो [Func](./) ऑब्जेक्ट बनाता है और उसे मान (वास्तविक कॉलबैक या nullptr में से कोई भी) असाइन करता है। |
| [Func](./func/)(const Func\&) | कॉपी कंस्ट्रक्टर। |
| [Func](./func/)(Func\&&) | मूव कंस्ट्रक्टर। |
| [operator=](./operator=/)(const Func\&) | कॉपी असाइनमेंट। |
| [operator=](./operator=/)(Func\&&) | मूव असाइनमेंट। |
| [~Func](./~func/)() | डिस्ट्रक्टर। |
## टिप्पणियाँ



```cpp
#include "system/func.h"
#include <iostream>

// यह फ़ंक्शन System::Func डेलीगेट का एक इंस्टेंस पैरामीटर के रूप में स्वीकार करता है।
void Print(int x, const System::Func<int, int> &func)
{
  std::cout << func(x) << std::endl;
}

int main()
{
  // System::Func डेलीगेट का एक इंस्टेंस बनाएँ।
  auto func = static_cast<System::Func<int, int>>([](int x) -> int
  {
    return x * x;
  });

  // बनाए गए इंस्टेंस को फ़ंक्शन आर्ग्यूमेंट के रूप में पास करें।
  Print(1, func);
  Print(2, func);
  Print(3, func);

  return 0;
}
/*
This code example produces the following output:
1
4
9
*/
```

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
