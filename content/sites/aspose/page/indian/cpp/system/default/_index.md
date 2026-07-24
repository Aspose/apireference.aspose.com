---
title: "System::Default मेथड"
linktitle: "Default"
second_title: "Aspose.Page C++ के लिए"
description: "System::Default मेथड। C++ में एक्सेप्शन टाइप की सिंगल डिफ़ॉल्ट-निर्मित इंस्टेंस का रेफ़रेंस रिटर्न करता है।"
type: docs
weight: 16200
url: /hi/cpp/system/default/
---
## System::Default() method


एक्सेप्शन टाइप की सिंगल डिफ़ॉल्ट-निर्मित इंस्टेंस का रेफ़रेंस रिटर्न करता है।

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| पैरामीटर | विवरण |
| --- | --- |
| T | वह टाइप जिसकी इंस्टेंस रिटर्न की जाती है |

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Default() method


नॉन-एक्सेप्शन टाइप की सिंगल डिफ़ॉल्ट-निर्मित इंस्टेंस का रेफ़रेंस रिटर्न करता है।

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| पैरामीटर | विवरण |
| --- | --- |
| T | वह टाइप जिसकी इंस्टेंस रिटर्न की जाती है |

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
