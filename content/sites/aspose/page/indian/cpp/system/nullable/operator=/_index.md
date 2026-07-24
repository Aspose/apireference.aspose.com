---
title: "System::Nullable::operator= विधि"
linktitle: "operator="
second_title: "Aspose.Page C++ के लिए"
description: "System::Nullable::operator= विधि। वर्तमान वस्तु के प्रतिनिधित्व मान को C++ में निर्दिष्ट मान से बदलता है।"
type: docs
weight: 1800
url: /hi/cpp/system/nullable/operator=/
---
## Nullable::operator=(const Nullable\<T1\>\&) method


ऑब्जेक्ट के वर्तमान में प्रतिनिधित्व किए गए मान को निर्दिष्ट मान से बदलता है।

```cpp
template<typename T1> Nullable<T> & System::Nullable<T>::operator=(const Nullable<T1> &x)
```


| पैरामीटर | विवरण |
| --- | --- |
| यह | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए जाने वाले नए मान का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | const Nullable\<T1\>\& | वर्तमान वस्तु द्वारा प्रतिनिधित्व किया जाने वाला नया मान |

### ReturnValue

स्वयं का संदर्भ

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator=(const T1\&) method


ऑब्जेक्ट के वर्तमान में प्रतिनिधित्व किए गए मान को निर्दिष्ट मान से बदलता है।

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value &&!std::is_null_pointer<T1>::value, Nullable<T> &>::type System::Nullable<T>::operator=(const T1 &x)
```


| पैरामीटर | विवरण |
| --- | --- |
| यह | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए जाने वाले नए मान का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | const T1\& | वर्तमान वस्तु द्वारा प्रतिनिधित्व किया जाने वाला नया मान |

### ReturnValue

स्वयं का संदर्भ

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator=(std::nullptr_t) method


वर्तमान ऑब्जेक्ट को null असाइन करता है।

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator=(std::nullptr_t)
```


### ReturnValue

एक [Nullable](../) वस्तु जो शून्य‑मान का प्रतिनिधित्व करती है।

## संबंधित देखें

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
