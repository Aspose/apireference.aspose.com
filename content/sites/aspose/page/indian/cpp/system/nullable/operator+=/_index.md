---
title: "System::Nullable::operator+= मेथड"
linktitle: "operator+="
second_title: "Aspose.Page C++ के लिए"
description: "System::Nullable::operator+= मेथड। C++ में निर्दिष्ट Nullable ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान को दाएँ‑साइड तर्क के रूप में उपयोग करके वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान पर operator+=() लागू करता है।"
type: docs
weight: 1300
url: /hi/cpp/system/nullable/operator+=/
---
## Nullable::operator+=(const Nullable\<T1\>\&) method


[operator+=()](./) को वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान पर लागू करता है, जहाँ निर्दिष्ट [Nullable](../) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान को दाएँ‑साइड तर्क के रूप में उपयोग किया जाता है।

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator+=(const Nullable<T1> &other)
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | एक [Nullable](../) ऑब्जेक्ट का मूल प्रकार, जिसका प्रतिनिधित्व किया गया मान [operator+=()](./) के दाएँ‑साइड तर्क के रूप में उपयोग किया जाता है |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | [Nullable](../) ऑब्जेक्ट का स्थिर संदर्भ, जिसका प्रतिनिधित्व किया गया मान वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान पर लागू किए गए [operator+=()](./) के दाएँ‑साइड तर्क के रूप में उपयोग किया जाता है। |

### ReturnValue

स्वयं का संदर्भ

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+=(const T1\&) method


[operator+=()](./) को वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान पर लागू करता है, जहाँ निर्दिष्ट मान को दाएँ‑साइड तर्क के रूप में उपयोग किया जाता है।

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator+=(const T1 &other)
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | [operator+=()](./) के दाएँ‑साइड मान के रूप में उपयोग किए गए मान का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | const T1\& | एक स्थिर संदर्भ उस मान का, जो वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान पर लागू किए गए [operator+=()](./) के दाएँ‑साइड मान के रूप में उपयोग किया जाता है। |

### ReturnValue

स्वयं का संदर्भ

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+=(std::nullptr_t) method


वर्तमान ऑब्जेक्ट को रीसेट करता है ताकि वह null-मान का प्रतिनिधित्व करे।

```cpp
Nullable<T> System::Nullable<T>::operator+=(std::nullptr_t)
```


### ReturnValue

स्वयं की एक प्रति

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
