---
title: "System::setter_increment_wrap मेथड"
linktitle: "setter_increment_wrap"
second_title: "Aspose.Page C++ के लिए"
description: "System::setter_increment_wrap मेथड. अनुवादक C#''s इन्क्रिमेंट एक्सप्रेशन को, जो क्लास'' प्रॉपर्टी को लक्षित करता है और जिसमें सेट्टर और गेट्टर परिभाषित हैं, C++ में इस फ़ंक्शन के कॉल में परिवर्तित करता है।"
type: docs
weight: 37400
url: /hi/cpp/system/setter_increment_wrap/
---
## System::setter_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


अनुवादक C#'s इन्क्रिमेंट एक्सप्रेशन को, जो क्लास' प्रॉपर्टी को लक्षित करता है और जिसमें सेट्टर और गेट्टर परिभाषित हैं, इस फ़ंक्शन के कॉल में परिवर्तित करता है।

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| पैरामीटर | विवरण |
| --- | --- |
| T | प्रॉपर्टी का प्रकार |
| Host | - संशोधित किए जाने वाले instance की क्लास |
| HostGet | - Host स्वयं, या उसका बेस टाइप, जहाँ प्रॉपर्टी का getter परिभाषित है |
| HostSet | - Host स्वयं, या उसका बेस टाइप, जहाँ प्रॉपर्टी का setter परिभाषित है |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| host | Host *const | एक पॉइंटर जो उस ऑब्जेक्ट की ओर इशारा करता है जिसकी प्रॉपर्टी को इन्क्रिमेंट किया जाना है |
| pGetter | T(HostGet::*)() | फ़ंक्शन पॉइंटर जो प्रॉपर्टी के गेट्टर मेथड की ओर इशारा करता है |
| pSetter | void(HostSet::*)(T) | फ़ंक्शन पॉइंटर जो प्रॉपर्टी के सेट्टर मेथड की ओर इशारा करता है |

### ReturnValue

प्रॉपर्टी का इन्क्रिमेंट किया गया मान

## संबंधित देखें

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_increment_wrap(T(*)(), void(*)(T)) method


अनुवादक C#'s इन्क्रिमेंट एक्सप्रेशन को, जो क्लास' प्रॉपर्टी को लक्षित करता है और जिसमें सेट्टर और गेट्टर परिभाषित हैं, इस फ़ंक्शन के कॉल में परिवर्तित करता है।

```cpp
template<typename T> T System::setter_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| पैरामीटर | विवरण |
| --- | --- |
| T | प्रॉपर्टी का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| pGetter | T(*)() | फ़ंक्शन पॉइंटर जो प्रॉपर्टी के गेट्टर फ्री फ़ंक्शन की ओर इशारा करता है |
| pSetter | void(*)(T) | फ़ंक्शन पॉइंटर जो प्रॉपर्टी के सेट्टर फ्री फ़ंक्शन की ओर इशारा करता है |

### ReturnValue

प्रॉपर्टी का इन्क्रिमेंट किया गया मान

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
