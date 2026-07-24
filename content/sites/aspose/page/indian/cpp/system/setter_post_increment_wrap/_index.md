---
title: "System::setter_post_increment_wrap मेथड"
linktitle: "setter_post_increment_wrap"
second_title: "Aspose.Page C++ के लिए"
description: "System::setter_post_increment_wrap मेथड. ट्रांसलेटर C#''s post-increment अभिव्यक्तियों को, जो ऐसे instance''s प्रॉपर्टी को लक्षित करती हैं जिनमें setter और getter परिभाषित हैं, C++ में इस फ़ंक्शन (const getter के लिए ओवरलोड) के invocation में बदल देता है।"
type: docs
weight: 37900
url: /hi/cpp/system/setter_post_increment_wrap/
---
## System::setter_post_increment_wrap(Host *const, T(HostConstGet::*)() const, void(HostSet::*)(T)) method


ट्रांसलेटर C#'s post-increment अभिव्यक्तियों को, जो instance's प्रॉपर्टी को लक्षित करती हैं जिसमें setter और getter परिभाषित हैं, इस फ़ंक्शन (const getter के लिए ओवरलोड) के invocation में बदल देता है।

```cpp
template<typename T,typename Host,typename HostConstGet,typename HostSet> std::enable_if<std::is_base_of<HostConstGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_post_increment_wrap(Host *const host, T(HostConstGet::*pGetter)() const, void(HostSet::*pSetter)(T))
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
## System::setter_post_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


ट्रांसलेटर C# के पोस्ट-इन्क्रीमेंट एक्सप्रेशन्स को, जो इंस्टेंस की प्रॉपर्टी को टार्गेट करते हैं और जिनके लिए सेट्टर और गेट्टर परिभाषित हैं, इस फ़ंक्शन के कॉल में बदल देता है (नॉन-कॉन्स्ट गेट्टर के ओवरलोड के लिए)।

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_post_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
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
## System::setter_post_increment_wrap(T(*)(), void(*)(T)) method


ट्रांसलेटर C# के पोस्ट-इन्क्रीमेंट एक्सप्रेशन्स को, जो क्लास की प्रॉपर्टी को टार्गेट करते हैं और जिनके लिए सेट्टर और गेट्टर परिभाषित हैं, इस फ़ंक्शन के कॉल में बदल देता है।

```cpp
template<typename T> T System::setter_post_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
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
