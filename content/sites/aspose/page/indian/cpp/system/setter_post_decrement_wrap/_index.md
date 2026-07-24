---
title: "System::setter_post_decrement_wrap मेथड"
linktitle: "setter_post_decrement_wrap"
second_title: "Aspose.Page C++ के लिए"
description: "System::setter_post_decrement_wrap मेथड। ट्रांसलेटर C#''s पोस्ट-डिक्रीमेंट एक्सप्रेशन्स को जो इंस्टेंस की प्रॉपर्टी को टार्गेट करती हैं और जिनमें सेटर और गेटर परिभाषित हैं, को C++ में इस फ़ंक्शन (कॉनस्ट गेटर के लिए ओवरलोड) के इनवोकेशन में अनुवादित करता है।"
type: docs
weight: 37600
url: /hi/cpp/system/setter_post_decrement_wrap/
---
## System::setter_post_decrement_wrap(Host *const, T(HostConstGet::*)() const, void(HostSet::*)(T)) method


ट्रांसलेटर C#'s पोस्ट-डिक्रीमेंट एक्सप्रेशन्स को जो इंस्टेंस की प्रॉपर्टी को टार्गेट करती हैं और जिनमें सेटर और गेटर परिभाषित हैं, को इस फ़ंक्शन (कॉनस्ट गेटर के लिए ओवरलोड) के इनवोकेशन में अनुवादित करता है।

```cpp
template<typename T,typename Host,typename HostConstGet,typename HostSet> std::enable_if<std::is_base_of<HostConstGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_post_decrement_wrap(Host *const host, T(HostConstGet::*pGetter)() const, void(HostSet::*pSetter)(T))
```


| पैरामीटर | विवरण |
| --- | --- |
| T | प्रॉपर्टी का प्रकार। |
| Host | - संशोधित किए जाने वाले instance की क्लास |
| HostConstGet | - Host स्वयं, या उसका बेस टाइप, जहाँ प्रॉपर्टी का getter परिभाषित है |
| HostSet | - Host स्वयं, या उसका बेस टाइप, जहाँ प्रॉपर्टी का setter परिभाषित है |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| host | Host *const | getter और setter को कॉल करने के लिए instance। |
| pGetter | T(HostConstGet::*)() const | प्रॉपर्टी के getter फ़ंक्शन की ओर इशारा करने वाला फ़ंक्शन पॉइंटर |
| pSetter | void(HostSet::*)(T) | फ़ंक्शन पॉइंटर जो प्रॉपर्टी के सेट्टर फ़ंक्शन की ओर इशारा करता है |

### ReturnValue

इन्क्रीमेंट करने से पहले प्रॉपर्टी का मान

## संबंधित देखें

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_post_decrement_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


ट्रांसलेटर C#'s पोस्ट-डिक्रीमेंट एक्सप्रेशन्स को जो इंस्टेंस की प्रॉपर्टी को टार्गेट करती हैं और जिनमें सेटर और गेटर परिभाषित हैं, को इस फ़ंक्शन (नॉन-कॉनस्ट गेटर के लिए ओवरलोड) के इनवोकेशन में अनुवादित करता है।

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_post_decrement_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| पैरामीटर | विवरण |
| --- | --- |
| T | प्रॉपर्टी का प्रकार। |
| Host | - संशोधित किए जाने वाले instance की क्लास |
| HostGet | - Host स्वयं, या उसका बेस टाइप, जहाँ प्रॉपर्टी का getter परिभाषित है |
| HostSet | - Host स्वयं, या उसका बेस टाइप, जहाँ प्रॉपर्टी का setter परिभाषित है |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| host | Host *const | getter और setter को कॉल करने के लिए instance। |
| pGetter | T(HostGet::*)() | प्रॉपर्टी के getter फ़ंक्शन की ओर इशारा करने वाला फ़ंक्शन पॉइंटर |
| pSetter | void(HostSet::*)(T) | फ़ंक्शन पॉइंटर जो प्रॉपर्टी के सेट्टर फ़ंक्शन की ओर इशारा करता है |

### ReturnValue

इन्क्रीमेंट करने से पहले प्रॉपर्टी का मान

## संबंधित देखें

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_post_decrement_wrap(T(*)(), void(*)(T)) method


ट्रांसलेटर C#'s पोस्ट-डिक्रीमेंट एक्सप्रेशन्स को जो क्लास की प्रॉपर्टी को टार्गेट करती हैं और जिनमें सेटर और गेटर परिभाषित हैं, को इस फ़ंक्शन के इनवोकेशन में अनुवादित करता है।

```cpp
template<typename T> T System::setter_post_decrement_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| पैरामीटर | विवरण |
| --- | --- |
| T | प्रॉपर्टी का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| pGetter | T(*)() | फ़ंक्शन पॉइंटर जो प्रॉपर्टी के गेट्टर फ्री फ़ंक्शन की ओर इशारा करता है |
| pSetter | void(*)(T) | फ़ंक्शन पॉइंटर जो प्रॉपर्टी के सेट्टर फ्री फ़ंक्शन की ओर इशारा करता है |

### ReturnValue

इन्क्रीमेंट करने से पहले प्रॉपर्टी का मान

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
