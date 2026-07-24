---
title: "System::Nullable::operator- मेथड"
linktitle: "operator-"
second_title: "Aspose.Page C++ के लिए"
description: "System::Nullable::operator- मेथड. C++ में nullable मानों को घटाता है।"
type: docs
weight: 1400
url: /hi/cpp/system/nullable/operator-/
---
## Nullable::operator-(const Nullable\<T1\>\&) const method


nullable मानों को घटाता है।

```cpp
template<typename T1> System::Nullable<decltype(get_Value() - other.get_Value())> System::Nullable<T>::operator-(const Nullable<T1> &other) const
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | दाएँ ऑपरेण्ड प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| अन्य | const Nullable\<T1\>\& | घटाने के लिए मान। |

### ReturnValue

घटाव परिणाम।

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-(const T1\&) const method


nullable और non-nullable मानों को घटाता है।

```cpp
template<typename T1,typename> Nullable<decltype(get_Value() - other)> System::Nullable<T>::operator-(const T1 &other) const
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | दाएँ ऑपरेण्ड प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| अन्य | const T1\& | घटाने के लिए मान। |

### ReturnValue

घटाव परिणाम।

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-(T1) const method


nullable और null-निर्देशित मानों को घटाता है।

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-(T1) const
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | दाएँ ऑपरेण्ड का प्रकार, nullptr_t होना चाहिए। |

### ReturnValue

खाली [Nullable](../) वस्तु।

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
