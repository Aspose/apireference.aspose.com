---
title: "System::Nullable::operator+ मेथड"
linktitle: "operator+"
second_title: "Aspose.Page C++ के लिए"
description: "System::Nullable::operator+ मेथड. C++ में nullable मानों को जोड़ता है।"
type: docs
weight: 1200
url: /hi/cpp/system/nullable/operator+/
---
## Nullable::operator+(const Nullable\<T1\>\&) const method


nullable मानों को जोड़ता है।

```cpp
template<typename T1> System::Nullable<decltype(get_Value()+other.get_Value())> System::Nullable<T>::operator+(const Nullable<T1> &other) const
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | दाएँ ऑपरेण्ड प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| अन्य | const Nullable\<T1\>\& | जोड़ने के लिए मान। |

### ReturnValue

जोड़ने का परिणाम।

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+(const T1\&) const method


nullable और non-nullable मानों को जोड़ता है।

```cpp
template<typename T1,typename> Nullable<decltype(get_Value()+other)> System::Nullable<T>::operator+(const T1 &other) const
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | दाएँ ऑपरेण्ड प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| अन्य | const T1\& | जोड़ने के लिए मान। |

### ReturnValue

जोड़ने का परिणाम।

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+(std::nullptr_t) const method


Nullable<T> क्लास का डिफ़ॉल्ट निर्मित इंस्टेंस लौटाता है।

```cpp
Nullable<T> System::Nullable<T>::operator+(std::nullptr_t) const
```

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
