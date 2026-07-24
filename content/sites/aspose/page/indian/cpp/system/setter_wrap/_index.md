---
title: "System::setter_wrap मेथड"
linktitle: "setter_wrap"
second_title: "Aspose.Page C++ के लिए"
description: "System::setter_wrap मेथड. C++ में टाइप कन्वर्ज़न के साथ इंस्टेंस सेट्टर फ़ंक्शन्स के लिए ओवरलोड।"
type: docs
weight: 38200
url: /hi/cpp/system/setter_wrap/
---
## System::setter_wrap(Host *const, void(HostSet::*)(T2), T) method


टाइप कन्वर्ज़न के साथ इंस्टेंस सेट्टर फ़ंक्शन्स के लिए ओवरलोड।

```cpp
template<typename T,typename T2,typename Host,typename HostSet> std::enable_if<std::is_base_of<HostSet, Host>::value, T>::type System::setter_wrap(Host *const host, void(HostSet::*pSetter)(T2), T value)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | वैल्यू टाइप। |
| T2 | सेट्टर फ़ंक्शन द्वारा अपेक्षित प्रकार। |
| Host | इंस्टेंस प्रकार। |
| HostSet | - होस्ट स्वयं, या इसका बेस टाइप, जहाँ प्रॉपर्टी का सेट्टर परिभाषित है। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| host | Host *const | [Object](../object/) के लिए सेट्टर फ़ंक्शन को कॉल करने हेतु। |
| pSetter | void(HostSet::*)(T2) | सेटर फ़ंक्शन रेफ़रेंस। |
| मान | T | सेट करने के लिए मान। |

### ReturnValue

मान सेट करें।

## संबंधित देखें

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_wrap(void(*)(T2), T) method


टाइप रूपांतरण के साथ स्थैतिक सेट्टर फ़ंक्शनों के लिए ओवरलोड।

```cpp
template<typename T,typename T2> T System::setter_wrap(void(*pSetter)(T2), T value)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | वैल्यू टाइप। |
| T2 | सेट्टर फ़ंक्शन द्वारा अपेक्षित प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| pSetter | void(*)(T2) | स्थैतिक सेट्टर फ़ंक्शन रेफ़रेंस। |
| मान | T | सेट करने के लिए मान। |

### ReturnValue

मान सेट करें।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
