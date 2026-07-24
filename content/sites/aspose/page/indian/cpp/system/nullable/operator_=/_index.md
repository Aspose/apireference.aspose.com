---
title: "System::Nullable::operator<= विधि"
linktitle: "operator<="
second_title: "Aspose.Page C++ के लिए"
description: "System::Nullable::operator<= विधि। निर्धारित करता है कि वर्तमान वस्तु द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट Nullable वस्तु द्वारा प्रतिनिधित्व किए गए मान से कम या बराबर है, इन मानों पर C++ में operator<=() लागू करके।"
type: docs
weight: 1700
url: /hi/cpp/system/nullable/operator_=/
---
## Nullable::operator<=(const Nullable\<T1\>\&) const method


निर्धारित करता है कि वर्तमान वस्तु द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट [Nullable](../) वस्तु द्वारा प्रतिनिधित्व किए गए मान से कम या बराबर है, इन मानों पर [operator<=()](./) लागू करके।

```cpp
template<typename T1> bool System::Nullable<T>::operator<=(const Nullable<T1> &other) const
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | निर्दिष्ट [Nullable](../) वस्तु के साथ तुलना करने के लिए आधारभूत प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | निर्दिष्ट [Nullable](../) वस्तु के साथ तुलना करने के लिए एक स्थिर संदर्भ |

### ReturnValue

सही यदि वर्तमान वस्तु द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट [Nullable](../) वस्तु द्वारा प्रतिनिधित्व किए गए मान से कम या बराबर है, अन्यथा - गलत

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<=(const T1\&) const method


निर्धारित करता है कि वर्तमान वस्तु द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट मान से कम या बराबर है, इन मानों पर [operator<=()](./) लागू करके।

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<=(const T1 &other) const
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | तुलना करने के लिए मान का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| अन्य | const T1\& | तुलना करने के लिए मान का एक स्थिर संदर्भ |

### ReturnValue

सही यदि वर्तमान वस्तु द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट मान से कम या बराबर है, अन्यथा - गलत

## संबंधित देखें

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<=(std::nullptr_t) const method


हमेशा false लौटाता है।

```cpp
bool System::Nullable<T>::operator<=(std::nullptr_t) const
```

## संबंधित देखें

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
title: System::Nullable::operator>= विधि
लिंकशीर्षक: operator>=
second_title: Aspose.Page for C++
description: 'System::Nullable::operator>= विधि। निर्धारित करता है कि वर्तमान वस्तु द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट Nullable वस्तु द्वारा प्रतिनिधित्व किए गए मान से बड़ा या बराबर है, इन मानों पर C++ में operator>=() लागू करके।'
type: docs
weight: 2100
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator>=(const Nullable\<T1\>\&) const method


निर्धारित करता है कि वर्तमान वस्तु द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट [Nullable](../) वस्तु द्वारा प्रतिनिधित्व किए गए मान से बड़ा या बराबर है, इन मानों पर [operator>=()](./) लागू करके।

```cpp
template<typename T1> bool System::Nullable<T>::operator>=(const Nullable<T1> &other) const
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | निर्दिष्ट [Nullable](../) वस्तु के साथ तुलना करने के लिए आधारभूत प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | निर्दिष्ट [Nullable](../) वस्तु के साथ तुलना करने के लिए एक स्थिर संदर्भ |

### ReturnValue

सही यदि वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट [Nullable](../) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से बड़ा या बराबर हो, अन्यथा - गलत

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>=(const T1\&) const method


इन मानों पर [operator>=()](./) लागू करके निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से बड़ा या बराबर है या नहीं।

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>=(const T1 &other) const
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान की तुलना करने के लिए मूल प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| अन्य | const T1\& | वर्तमान ऑब्जेक्ट की तुलना करने के लिए एक ऑब्जेक्ट का स्थिर संदर्भ |

### ReturnValue

सही यदि वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से बड़ा या बराबर हो, अन्यथा - गलत

## संबंधित देखें

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>=(std::nullptr_t) const method


हमेशा false लौटाता है।

```cpp
bool System::Nullable<T>::operator>=(std::nullptr_t) const
```


### ReturnValue

हमेशा - गलत

## संबंधित देखें

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
शीर्षक: System::Nullable::operator|= method
लिंकशीर्षक: operator|=
second_title: Aspose.Page for C++
विवरण: 'System::Nullable::operator|= method. C++ में निर्दिष्ट मान को दाएँ‑साइड तर्क के रूप में उपयोग करके वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान पर operator|=() लागू करता है।'
type: docs
वजन: 2200
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator|= method


[operator|=()](./) को वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान पर लागू करता है, जहाँ निर्दिष्ट मान को दाएँ‑साइड तर्क के रूप में उपयोग किया जाता है।

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator|=(bool other)
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | SFINAE को कार्य करने के लिए टेम्प्लेट पैरामीटर। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| अन्य | bool | एक बूलियन मान जो [operator के दाएँ‑साइड मान के रूप में उपयोग किया जाता है | =()](./) को वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान पर लागू किया जाता है। |

### ReturnValue

स्वयं का एक रेफ़रेंस।

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
