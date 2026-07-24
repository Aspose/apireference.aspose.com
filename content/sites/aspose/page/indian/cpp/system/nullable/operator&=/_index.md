---
title: "System::Nullable::operator&= मेथड"
linktitle: "operator&="
second_title: "Aspose.Page C++ के लिए"
description: "System::Nullable::operator&= मेथड। C++ में निर्दिष्ट मान को दाएँ‑पक्षीय तर्क के रूप में उपयोग करके वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान पर operator&=() लागू करता है।"
type: docs
weight: 1100
url: /hi/cpp/system/nullable/operator&=/
---
## Nullable::operator&= method


निर्दिष्ट मान को दाएँ‑पक्षीय तर्क के रूप में उपयोग करके वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान पर [operator&=()](./) लागू करता है।

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator&=(bool other)
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | SFINAE को कार्य करने के लिए टेम्प्लेट पैरामीटर। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | bool | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान पर लागू [operator&=()](./) के दाएँ‑पक्षीय मान के रूप में उपयोग किया जाने वाला बूलियन मान। |

### ReturnValue

स्वयं का एक रेफ़रेंस।

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
