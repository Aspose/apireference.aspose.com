---
title: "System::Nullable::operator-= मेथड"
linktitle: "operator-="
second_title: "Aspose.Page C++ के लिए"
description: "System::Nullable::operator-= मेथड। C++ में निर्दिष्ट Nullable ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान को दाएँ‑पक्षीय तर्क के रूप में उपयोग करके वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान पर operator-=() लागू करता है।"
type: docs
weight: 1500
url: /hi/cpp/system/nullable/operator-=/
---
## Nullable::operator-=(const Nullable\<T1\>\&) method


निर्दिष्ट [Nullable](../) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान को दाएँ‑पक्षीय तर्क के रूप में उपयोग करके वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान पर [operator-=()](./) लागू करता है।

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator-=(const Nullable<T1> &other)
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | [operator-=()](./) के दाएँ‑पक्षीय तर्क के रूप में उपयोग किए जाने वाले मान द्वारा प्रतिनिधित्व किए गए [Nullable](../) ऑब्जेक्ट का अंतर्निहित प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान पर लागू [operator-=()](./) के दाएँ‑पक्षीय तर्क के रूप में उपयोग किए जाने वाले मान द्वारा प्रतिनिधित्व किए गए [Nullable](../) ऑब्जेक्ट का एक स्थिर रेफ़रेंस। |

### ReturnValue

स्वयं का संदर्भ

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-=(const T1\&) method


निर्दिष्ट मान को दाएँ‑पक्षीय तर्क के रूप में उपयोग करके वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान पर [operator-=()](./) लागू करता है।

```cpp
template<typename T1,typename> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator-=(const T1 &other)
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | [operator-=()](./) के दाएँ‑पक्षीय मान के रूप में उपयोग किए गए मान का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | const T1\& | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान पर लागू [operator-=()](./) के दाएँ‑पक्षीय मान के रूप में उपयोग किए गए मान का एक स्थिर रेफ़रेंस। |

### ReturnValue

स्वयं का संदर्भ

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-=(T1) method


एक null‑value का प्रतिनिधित्व करने वाले [Nullable](../) क्लास का एक इंस्टेंस लौटाता है।

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-=(T1)
```

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
