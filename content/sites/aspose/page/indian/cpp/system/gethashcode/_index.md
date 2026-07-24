---
title: "System::GetHashCode method"
linktitle: "हैशकोडप्राप्तकरें"
second_title: "Aspose.Page C++ के लिए"
description: "System::GetHashCode method. std::thread::id के लिए विशेषीकरण; C++ में निर्दिष्ट थ्रेड ऑब्जेक्ट के लिए हैश कोड लौटाता है।"
type: docs
weight: 21200
url: /hi/cpp/system/gethashcode/
---
## System::GetHashCode(const std::thread::id\&) method


std::thread::id के लिए विशेषीकरण; निर्दिष्ट थ्रेड ऑब्जेक्ट के लिए हैश कोड लौटाता है।

```cpp
int System::GetHashCode(const std::thread::id &id)
```

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


निर्दिष्ट स्केलर मान के लिए हैश कोड लौटाता है।

```cpp
template<typename T> std::enable_if<std::is_scalar<T>::value, int>::type System::GetHashCode(const T &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | उस मान का प्रकार जिसके लिए फ़ंक्शन हैश कोड उत्पन्न करता है |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const T\& | हैश कोड उत्पन्न करने के लिए मान |

### ReturnValue

निर्दिष्ट मान के लिए उत्पन्न किया गया हैश कोड

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


निर्दिष्ट ऑब्जेक्ट के लिए हैश कोड लौटाता है।

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&System::IsSmartPtr<T>::value, int>::type System::GetHashCode(const T &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | फ़ंक्शन हैश कोड उत्पन्न करने वाले ऑब्जेक्ट का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const T\& | ऑब्जेक्ट की ओर इशारा करने वाला [SmartPtr](../smartptr/) जिसका हैश कोड उत्पन्न किया जाना है |

### ReturnValue

निर्दिष्ट ऑब्जेक्ट के लिए उत्पन्न किया गया हैश कोड

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


एक्सेप्शन होने वाले निर्दिष्ट ऑब्जेक्ट के लिए हैश कोड लौटाता है।

```cpp
template<typename T> std::enable_if<System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | फ़ंक्शन हैश कोड उत्पन्न करने वाले ऑब्जेक्ट का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const T\& | [Exception](../exception/) रैपर जो हैश कोड उत्पन्न करने वाले ऑब्जेक्ट को सम्मिलित करता है |

### ReturnValue

निर्दिष्ट ऑब्जेक्ट के लिए उत्पन्न किया गया हैश कोड

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


न स्मार्ट पॉइंटर न ही एक्सेप्शन वाले निर्दिष्ट ऑब्जेक्ट के लिए हैश कोड लौटाता है।

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&!System::IsSmartPtr<T>::value &&!System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | फ़ंक्शन हैश कोड उत्पन्न करने वाले ऑब्जेक्ट का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const T\& | हैश कोड उत्पन्न करने वाले ऑब्जेक्ट का एक कॉन्स्ट रेफ़रेंस |

### ReturnValue

निर्दिष्ट ऑब्जेक्ट के लिए उत्पन्न किया गया हैश कोड

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
