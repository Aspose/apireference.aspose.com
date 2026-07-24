---
title: "System::Object::ReferenceEquals मेथड"
linktitle: "ReferenceEquals"
second_title: "Aspose.Page C++ के लिए"
description: "System::Object::ReferenceEquals मेथड। C++ में स्ट्रिंग और nullptr के केस के लिए Object::ReferenceEquals का विशेषीकरण।"
type: docs
weight: 1200
url: /hi/cpp/system/object/referenceequals/
---
## Object::ReferenceEquals(String const\&, std::nullptr_t) method


स्ट्रिंग और nullptr के केस के लिए [Object::ReferenceEquals](./) का विशेषीकरण।

```cpp
bool System::Object::ReferenceEquals(String const &str, std::nullptr_t)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | String const\& | [String](../../string/) को nullptr से तुलना करने के लिए। |

### ReturnValue

यदि स्ट्रिंग null है तो true, अन्यथा false।

## संबंधित देखें

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(String const\&, String const\&) method


स्ट्रिंग्स के केस के लिए [Object::ReferenceEquals](./) का विशेषीकरण।

```cpp
bool System::Object::ReferenceEquals(String const &str1, String const &str2)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str1 | String const\& | तुलना करने के लिए पहली स्ट्रिंग। |
| str2 | String const\& | तुलना करने के लिए दूसरी स्ट्रिंग। |

### ReturnValue

यदि स्ट्रिंग्स मेल खाती हैं तो true, अन्यथा false।

## संबंधित देखें

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(ptr const\&, ptr const\&) method


ऑब्जेक्ट्स की तुलना रेफ़रेंस द्वारा करता है।

```cpp
static bool System::Object::ReferenceEquals(ptr const &objA, ptr const &objB)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| objA | ptr const\& | तुलना के लिए पहला पॉइंटर। |
| objB | ptr const\& | तुलना के लिए दूसरा पॉइंटर। |

### ReturnValue

यदि पॉइंटर्स मेल खाते हैं तो सत्य, अन्यथा असत्य।

## संबंधित देखें

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(T const\&, std::nullptr_t) method


Reference-की तुलना मान प्रकार की वस्तु से nullptr के साथ करता है।

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, std::nullptr_t)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | तुलना करने के लिए ऑब्जेक्ट का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| objA | T const\& | तुलना करने के लिए पहला ऑब्जेक्ट। |

### ReturnValue

क्योंकि वैल्यू टाइप्स को नल नहीं किया जा सकता, यह हमेशा असत्य लौटाता है।

## संबंधित देखें

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(T const\&, T const\&) method


ऑब्जेक्ट्स की तुलना रेफ़रेंस द्वारा करता है।

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, T const &objB)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | तुलना करने के लिए ऑब्जेक्ट्स का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| objA | T const\& | तुलना करने के लिए पहला ऑब्जेक्ट। |
| objB | T const\& | तुलना करने के लिए दूसरा ऑब्जेक्ट। |

### ReturnValue

यदि ऑब्जेक्ट पते मेल खाते हैं तो सत्य, अन्यथा असत्य।

## संबंधित देखें

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
