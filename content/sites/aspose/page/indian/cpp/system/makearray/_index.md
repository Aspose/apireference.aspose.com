---
title: "System::MakeArray method"
linktitle: "ऐरेबनाएँ"
second_title: "Aspose.Page C++ के लिए"
description: "System::MakeArray मेथड। एक फ़ैक्टरी फ़ंक्शन जो C++ में निर्दिष्ट तर्कों को कंस्ट्रक्टर में पास करके नया Array ऑब्जेक्ट बनाता है।"
type: docs
weight: 24000
url: /hi/cpp/system/makearray/
---
## System::MakeArray(Args\&&...) method


एक फ़ैक्टरी फ़ंक्शन जो निर्दिष्ट तर्कों को कंस्ट्रक्टर में पास करके नया [Array](../array/) ऑब्जेक्ट बनाता है।

```cpp
template<class T,class...> ArrayPtr<T> System::MakeArray(Args &&... args)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | फ़ंक्शन द्वारा निर्मित [Array](../array/) ऑब्जेक्ट के तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| args | Args\&&... | निर्मित किए जा रहे [Array](../array/) ऑब्जेक्ट के कंस्ट्रक्टर को पास किए जाने वाले तर्क |

### ReturnValue

निर्मित [Array](../array/) ऑब्जेक्ट की ओर संकेत करने वाला स्मार्ट पॉइंटर

## संबंधित देखें

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(Integral, Args\&&...) method


एक फ़ैक्टरी फ़ंक्शन जो निर्दिष्ट तर्कों को कंस्ट्रक्टर में पास करके नया [Array](../array/) ऑब्जेक्ट बनाता है।

```cpp
template<class T,class Integral,class...> std::enable_if<std::is_integral<Integral>::value, ArrayPtr<T>>::type System::MakeArray(Integral size, Args &&... args)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | फ़ंक्शन द्वारा निर्मित [Array](../array/) ऑब्जेक्ट के तत्वों का प्रकार |
| Integral | ऐरे आकार का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| size | Integral | निर्माणाधीन ऐरे का आकार। |
| args | Args\&&... | निर्मित किए जा रहे [Array](../array/) ऑब्जेक्ट के कंस्ट्रक्टर को पास किए जाने वाले तर्क |

### ReturnValue

निर्मित [Array](../array/) ऑब्जेक्ट की ओर संकेत करने वाला स्मार्ट पॉइंटर

## संबंधित देखें

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(std::initializer_list\<T\>) method


एक फ़ैक्टरी फ़ंक्शन जो नया [Array](../array/) ऑब्जेक्ट बनाता है, उसे निर्दिष्ट इनिशियलाइज़ेशन सूची के तत्वों से भरता है और उस [Array](../array/) ऑब्जेक्ट की ओर संकेत करने वाला स्मार्ट पॉइंटर लौटाता है।

```cpp
template<typename T> ArrayPtr<T> System::MakeArray(std::initializer_list<T> init)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | फ़ंक्शन द्वारा निर्मित [Array](../array/) ऑब्जेक्ट के तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| init | std::initializer_list\<T\> | ऐरे को भरने के लिए तत्वों को शामिल करने वाली प्रारम्भिक सूची |

### ReturnValue

निर्मित [Array](../array/) ऑब्जेक्ट की ओर संकेत करने वाला स्मार्ट पॉइंटर

## संबंधित देखें

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
