---
title: "System::ObjectExt::Box मेथड"
linktitle: "बॉक्स"
second_title: "Aspose.Page C++ के लिए"
description: "System::ObjectExt::Box मेथड। C++ में स्ट्रिंग मानों को बॉक्स करता है।"
type: docs
weight: 200
url: /hi/cpp/system/objectext/box/
---
## ObjectExt::Box(const String\&) method


स्ट्रिंग मानों को बॉक्स करता है।

```cpp
SmartPtr<Object> System::ObjectExt::Box(const String &value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const String\& | बॉक्स करने के लिए मान। |

### ReturnValue

बॉक्स किया गया मान या null, यदि स्रोत स्ट्रिंग null है।

## संबंधित देखें

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


वैल्यू प्रकारों को [Object](../../object/) में परिवर्तित करने के लिए बॉक्स करता है। एनोम प्रकारों के लिए कार्यान्वयन।

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [Enum](../../enum/) प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const T\& | [Enum](../../enum/) मान को बॉक्स करने के लिए। |

### ReturnValue

बॉक्स किए हुए मान को रखने वाले ऑब्जेक्ट के लिए स्मार्ट पॉइंटर।

## संबंधित देखें

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


वैल्यू प्रकारों को [Object](../../object/) में परिवर्तित करने के लिए बॉक्स करता है। गैर-एनोम प्रकारों के लिए कार्यान्वयन।

```cpp
template<typename T> static std::enable_if<!std::is_enum<T>::value &&!IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | वैल्यू टाइप। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const T\& | बॉक्स करने के लिए मान। |

### ReturnValue

बॉक्स किए हुए मान को रखने वाले ऑब्जेक्ट के लिए स्मार्ट पॉइंटर।

## संबंधित देखें

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


[Nullable](../../nullable/) प्रकारों को [Object](../../object/) में परिवर्तित करने के लिए बॉक्स करता है।

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | वैल्यू टाइप। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const T\& | बॉक्स करने के लिए मान। |

### ReturnValue

बॉक्स किए हुए मान को रखने वाले ऑब्जेक्ट के लिए स्मार्ट पॉइंटर।

## संबंधित देखें

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
