---
title: "System::InitObject method"
linktitle: "ऑब्जेक्टआरम्भकरें"
second_title: "Aspose.Page C++ के लिए"
description: "System::InitObject मेथड। C++ में साझा स्वामित्व के साथ ऑब्जेक्ट की इनिशियलाइज़ेशन शुरू करता है।"
type: docs
weight: 21800
url: /hi/cpp/system/initobject/
---
## System::InitObject method


साझा स्वामित्व के साथ ऑब्जेक्ट की इनिशियलाइज़ेशन शुरू करता है।

```cpp
template<typename T> Details::ObjectBuilder<T, SharedPtr<T>> System::InitObject(const SharedPtr<T> &object)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | इनिशियलाइज़ करने वाले ऑब्जेक्ट का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | [Object](../object/) को इनिशियलाइज़ करने के लिए |

### ReturnValue

साझा पॉइंटर निर्माण के लिए कॉन्फ़िगर किया गया ObjectBuilder
## टिप्पणियाँ



[Object](../object/) initialization must be finished with [Get()](../get/) call 

## संबंधित देखें

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
