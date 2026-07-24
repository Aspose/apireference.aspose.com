---
title: "System::ObjectExt::UnknownToObject मेथड"
linktitle: "UnknownToObject"
second_title: "Aspose.Page C++ के लिए"
description: "System::ObjectExt::UnknownToObject मेथड. अज्ञात प्रकार को Object में परिवर्तित करता है, C++ में स्मार्ट पॉइंटर प्रकार और वैल्यू टाइप दोनों स्थितियों को संभालते हुए।"
type: docs
weight: 1800
url: /hi/cpp/system/objectext/unknowntoobject/
---
## ObjectExt::UnknownToObject(const T\&) method


अज्ञात प्रकार को [Object](../../object/) में परिवर्तित करता है, स्मार्ट पॉइंटर प्रकार और वैल्यू टाइप दोनों स्थितियों को संभालते हुए।

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(const T &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [Object](../../object/) में परिवर्तित करने के लिए प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const T\& | परिवर्तित करने के लिए [Object](../../object/). |

### ReturnValue

[Object](../../object/) के लिए स्मार्ट पॉइंटर, जो या तो परिवर्तित पॉइंटर या बॉक्स्ड वैल्यू हो सकता है।

## संबंधित देखें

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownToObject(T) method


अज्ञात प्रकार को [Object](../../object/) में परिवर्तित करता है, स्मार्ट पॉइंटर प्रकार और वैल्यू टाइप दोनों स्थितियों को संभालते हुए।

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(T obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [Object](../../object/) में परिवर्तित करने के लिए प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | T | परिवर्तित करने के लिए [Object](../../object/). |

### ReturnValue

[Object](../../object/) के लिए स्मार्ट पॉइंटर, जो या तो परिवर्तित पॉइंटर या बॉक्स्ड वैल्यू हो सकता है।

## संबंधित देखें

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
