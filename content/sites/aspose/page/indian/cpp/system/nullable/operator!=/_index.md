---
title: "System::Nullable::operator!= मेथड"
linktitle: "operator!="
second_title: "Aspose.Page C++ के लिए"
description: "System::Nullable::operator!= मेथड। C++ में निर्दिष्ट Nullable ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान से वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान असमान है या नहीं निर्धारित करता है।"
type: docs
weight: 1000
url: /hi/cpp/system/nullable/operator!=/
---
## Nullable::operator!=(const Nullable\<T1\>\&) const method


निर्धारित करता है कि वर्तमान वस्तु द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट [Nullable](../) वस्तु द्वारा प्रतिनिधित्व किए गए मान के बराबर नहीं है।

```cpp
template<typename T1> bool System::Nullable<T>::operator!=(const Nullable<T1> &other) const
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | निर्दिष्ट [Nullable](../) वस्तु के साथ तुलना करने के लिए आधारभूत प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | निर्दिष्ट [Nullable](../) वस्तु के साथ तुलना करने के लिए एक स्थिर संदर्भ |

### ReturnValue

सही यदि वर्तमान वस्तु द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट [Nullable](../) वस्तु द्वारा प्रतिनिधित्व किए गए मान के बराबर नहीं है, अन्यथा - गलत

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator!=(const T1\&) const method


निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट मान के बराबर नहीं है या नहीं।

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator!=(const T1 &other) const
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | तुलना करने के लिए मान का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| अन्य | const T1\& | तुलना करने के लिए मान का एक स्थिर संदर्भ |

### ReturnValue

सही यदि वर्तमान वस्तु द्वारा प्रतिनिधित्व किया गया मान निर्दिष्ट मान के बराबर नहीं है, अन्यथा - गलत

## संबंधित देखें

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator!=(std::nullptr_t) const method


निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया मान null नहीं है या नहीं।

```cpp
bool System::Nullable<T>::operator!=(std::nullptr_t) const
```


### ReturnValue

सही यदि वर्तमान वस्तु द्वारा प्रतिनिधित्व किया गया मान शून्य नहीं है, अन्यथा - गलत

## संबंधित देखें

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
