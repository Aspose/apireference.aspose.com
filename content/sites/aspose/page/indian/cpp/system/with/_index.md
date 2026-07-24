---
title: "System::With मेथड"
linktitle: "के साथ"
second_title: "Aspose.Page C++ के लिए"
description: "System::With मेथड। C++ में रेफ़रेंस रिकॉर्ड को क्लोन करता है और उस पर इनिशियलाइज़र फंक्टर लागू करता है।"
type: docs
weight: 40100
url: /hi/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


रेफ़रेंस रिकॉर्ड को क्लोन करता है और उस पर इनिशियलाइज़र फंक्टर लागू करता है।

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | क्लोन करने के लिए रिकॉर्ड प्रकार। |
| A | इनिशियलाइज़ेशन फंक्टर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| रिकॉर्ड | const SharedPtr\<T\>\& | क्लोन और इनिशियलाइज़ करने के लिए ऑब्जेक्ट का शेयर्ड पॉइंटर। |
| इनिशियलाइज़र | const A\& | रिकॉर्ड क्लोन पर लागू किया जा रहा इनिशियलाइज़ेशन फंक्टर। |

### ReturnValue

क्लोन किए गए रिकॉर्ड के लिए साझा पॉइंटर।

## संबंधित देखें

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::With(const T\&, const A\&) method


struct रिकॉर्ड की प्रतियां बनाता है और उस पर initializer functor लागू करता है।

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | कॉपी करने के लिए रिकॉर्ड प्रकार। |
| A | इनिशियलाइज़ेशन फंक्टर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| रिकॉर्ड | const T\& | कॉपी करने और प्रारंभ करने के लिए रिकॉर्ड। |
| इनिशियलाइज़र | const A\& | रिकॉर्ड कॉपी पर initializer functor लागू किया जा रहा है। |

### ReturnValue

कॉपी किया गया रिकॉर्ड।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
