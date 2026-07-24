---
title: "System::Ref विधि"
linktitle: "Ref"
second_title: "Aspose.Page C++ के लिए"
description: "System::Ref विधि। यह रैपर सुनिश्चित करता है कि Ref(std::ref(DynamicWeakPtr)) C++ में काम करे।"
type: docs
weight: 36600
url: /hi/cpp/system/ref/
---
## System::Ref(const std::reference_wrapper\<T\>\&) method


Ref(std::ref(DynamicWeakPtr)) के काम करने को सुनिश्चित करने वाला रैपर।

```cpp
template<typename T> decltype(Ref(std::declval<T &>())) System::Ref(const std::reference_wrapper<T> &wrapper)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | संदर्भित प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| रैपर | const std::reference_wrapper\<T\>\& | std रैपर को अनरैप करने के लिए। |

### ReturnValue

Reference प्रकार [System](../):: में परिभाषित है, न कि std में।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Ref(DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\&) method


[DynamicWeakPtr](../dynamicweakptr/) ऑब्जेक्ट का संदर्भ बनाता है। जब फ़ंक्शन तर्कों को संदर्भ द्वारा पास किया जाता है तो अनुवादक द्वारा उपयोग किया जाता है।

```cpp
template<typename T,SmartPtrMode,unsigned int ...> DynamicWeakPtr<T, trunkMode, weakLeafs...>::Reference System::Ref(DynamicWeakPtr<T, trunkMode, weakLeafs...> &ptr)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | पॉइंटी प्रकार। |
| trunkMode | स्मार्ट पॉइंटर स्वयं का मोड। |
| weakLeafs | टेम्पलेट तर्कों के इंडेक्स जिनके लिए SetTemplateWeakPtr विधि को कॉल करना आवश्यक है। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ptr | DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\& | संदर्भ बनाने के लिए स्मार्ट पॉइंटर। |

### ReturnValue

स्मार्ट पॉइंटर संदर्भ।

## संबंधित देखें

* Class [DynamicWeakPtr](../dynamicweakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Ref(T\&) method


ऑब्जेक्ट्स के संदर्भ प्राप्त करने के लिए सहायक फ़ंक्शन। यह सुनिश्चित करने के लिए उपयोग किया जाता है कि [System::DynamicWeakPtr](../dynamicweakptr/) असाइनमेंट के बाद संदर्भित ऑब्जेक्ट को अपडेट करे।

```cpp
template<typename T> T & System::Ref(T &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | संदर्भ बनाने के लिए प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | T\& | संदर्भ बनाने के लिए मान। |

### ReturnValue

इस फ़ंक्शन को पास किए गए मान का संदर्भ।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
