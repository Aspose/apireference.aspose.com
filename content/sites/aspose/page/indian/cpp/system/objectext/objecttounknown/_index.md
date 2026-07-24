---
title: "System::ObjectExt::ObjectToUnknown मेथड"
linktitle: "ObjectToUnknown"
second_title: "Aspose.Page C++ के लिए"
description: "System::ObjectExt::ObjectToUnknown मेथड। ऑब्जेक्ट को अज्ञात प्रकार में परिवर्तित करता है, C++ में स्मार्ट पॉइंटर प्रकार और बॉक्स्ड मान स्थितियों दोनों को संभालता है।"
type: docs
weight: 1200
url: /hi/cpp/system/objectext/objecttounknown/
---
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


[Object](../../object/) को अज्ञात प्रकार में परिवर्तित करता है, स्मार्ट पॉइंटर प्रकार और बॉक्स्ड मान स्थितियों दोनों को संभालता है।

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [Object](../../object/) को परिवर्तित करने के लिए प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | परिवर्तित करने के लिए [Object](../../object/). |

### ReturnValue

या तो अनबॉक्स्ड मान या परिवर्तित पॉइंटर।

## संबंधित देखें

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


[Object](../../object/) को अज्ञात प्रकार में परिवर्तित करता है, स्मार्ट पॉइंटर प्रकार और बॉक्स्ड मान स्थितियों दोनों को संभालता है।

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [Object](../../object/) को परिवर्तित करने के लिए प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | परिवर्तित करने के लिए [Object](../../object/). |

### ReturnValue

या तो अनबॉक्स्ड मान या परिवर्तित पॉइंटर।

## संबंधित देखें

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
