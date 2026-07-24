---
title: "System::BuildObject मेथड"
linktitle: "BuildObject"
second_title: "Aspose.Page C++ के लिए"
description: "System::BuildObject मेथड। C++ में साझा स्वामित्व के साथ एक ऑब्जेक्ट बनाएं।"
type: docs
weight: 15200
url: /hi/cpp/system/buildobject/
---
## System::BuildObject method


साझा स्वामित्व के साथ एक ऑब्जेक्ट बनाएं।

```cpp
template<typename T,typename...> Details::ObjectBuilder<T, SharedPtr<T>> System::BuildObject(Args &&... args)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | बनाने के लिए ऑब्जेक्ट का प्रकार |
| आर्ग्युमेंट्स | ऑब्जेक्ट निर्माण के लिए तर्क प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| args | Args\&&... | ऑब्जेक्ट कंस्ट्रक्टर को अग्रेषित करने के लिए तर्क |

### ReturnValue

साझा पॉइंटर निर्माण के लिए कॉन्फ़िगर किया गया ObjectBuilder
## टिप्पणियाँ



एक [SharedPtr<T>](../sharedptr/) बनाता है और उसके लिए एक बिल्डर लौटाता है
[Object](../object/) construction must be finished with [Get()](../get/) call 

## संबंधित देखें

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
