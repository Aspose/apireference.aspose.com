---
title: "System::Random क्लास"
linktitle: "Random"
second_title: "Aspose.Page C++ के लिए"
description: "System::Random क्लास। एक pseudo-random नंबर जेनरेटर का प्रतिनिधित्व करता है। इस क्लास की objects को केवल System::MakeObject() फ़ंक्शन का उपयोग करके allocate किया जाना चाहिए। कभी भी इस प्रकार का instance stack पर या operator new का उपयोग करके न बनाएं, क्योंकि इससे runtime errors और/या assertion faults हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में wrap करें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के argument के रूप में पास करें।"
type: docs
weight: 5200
url: /hi/cpp/system/random/
---
## Random class


एक pseudo-random नंबर जेनरेटर का प्रतिनिधित्व करता है। इस क्लास की objects को केवल [System::MakeObject()](../makeobject/) फ़ंक्शन का उपयोग करके allocate किया जाना चाहिए। कभी भी इस प्रकार का instance stack पर या operator new का उपयोग करके न बनाएं, क्योंकि इससे runtime errors और/या assertion faults हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../smartptr/) पॉइंटर में wrap करें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों के argument के रूप में पास करें।

```cpp
class Random : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [IsNull](./isnull/)() const | हमेशा false लौटाता है। |
| virtual [Next](./next/)() | int32 अधिकतम मान से कम एक गैर-नकारात्मक random संख्या लौटाता है। |
| virtual [Next](./next/)(int32_t) | निर्दिष्ट अधिकतम मान से कम एक गैर-नकारात्मक random संख्या लौटाता है। |
| virtual [Next](./next/)(int32_t, int32_t) | निर्दिष्ट रेंज के भीतर एक random संख्या लौटाता है। |
| virtual [NextBytes](./nextbytes/)(const ArrayPtr\<uint8_t\>\&) | निर्दिष्ट बाइट्स की array के तत्वों को random संख्याओं से भरता है। |
| virtual [NextDouble](./nextdouble/)() | 0.0 और 1.0 के बीच एक random संख्या लौटाता है। |
| [Random](./random/)() | समय-निर्भर डिफ़ॉल्ट seed मान का उपयोग करके एक नया instance प्रारंभ करता है। |
| [Random](./random/)(int32_t) | [System.Random](./) क्लास का एक नया instance, निर्दिष्ट seed मान का उपयोग करके, प्रारंभ करता है। |
## टिप्पणियाँ



```cpp
#include "system/random.h"
#include "system/smart_ptr.h"
#include <iostream>

int main()
{
  const auto rnd = System::MakeObject<System::Random>();

  // एक random महीने का नंबर प्राप्त करें और उसे प्रिंट करें।
  auto monthNumber = rnd->Next(1, 13);
  std::cout << "Month: " << monthNumber << std::endl;

  // array को random संख्याओं से भरें।
  auto arr = System::MakeObject<System::Array<uint8_t>>(12);
  rnd->NextBytes(arr);

  // ऐरे को प्रिंट करें।
  for (auto i = 0; i < arr->get_Length(); ++i)
  {
    std::cout << static_cast<int>(arr[i]) << ' ';
  }
  std::cout << std::endl;

  return 0;
}
/*
This code example produces the following output:
Month: 4
177 213 89 240 68 182 18 96 109 131 1 78
*/
```

## संबंधित देखें

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
