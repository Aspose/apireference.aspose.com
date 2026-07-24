---
title: "System::Threading::ThreadPoolImpl क्लास"
linktitle: "ThreadPoolImpl"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::ThreadPoolImpl क्लास। थ्रेड पूल का आंतरिक डेटा। यह एक सिंगलटन प्रकार है जिसमें मेमोरी प्रबंधन एक्सेस फ़ंक्शन(ओं) द्वारा किया जाता है। आपको C++ में इसे सीधे इंस्टेंस नहीं बनाना चाहिए।"
type: docs
weight: 1400
url: /hi/cpp/system.threading/threadpoolimpl/
---
## ThreadPoolImpl class


[Thread](../thread/) pool internal data. This is a singleton type with memory management done by access function(s). You should never create instances of it directly.

```cpp
class ThreadPoolImpl
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | उपलब्ध थ्रेड्स की संख्या प्राप्त करता है। |
| static [GetInitialized](./getinitialized/)() | इनिशियलाइज़ेशन स्टेट सिंगलटन प्राप्त करता है। |
| [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | समकालिक थ्रेड्स की अधिकतम संख्या प्राप्त करता है। |
| [GetMinThreads](./getminthreads/)(int\&, int\&) | पूल द्वारा बनाए जा रहे थ्रेड्स की न्यूनतम संख्या प्राप्त करता है। |
| [JoinAll](./joinall/)() | सभी स्वामित्व वाले थ्रेड्स को जॉइन करता है। अनंतकाल तक इंतजार करता है। |
| [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | वर्क आइटम को कतार में जोड़ता है। |
| [SetMaxThreads](./setmaxthreads/)(int, int) | पूल द्वारा स्वामित्व वाले थ्रेड्स की संख्या सेट करता है। |
| [SetMinThreads](./setminthreads/)(int, int) | पूल द्वारा स्वामित्व वाले थ्रेड्स की न्यूनतम संख्या सेट करता है। |
| [ThreadPoolImpl](./threadpoolimpl/)() | निर्माता। |
| [~ThreadPoolImpl](./~threadpoolimpl/)() | डिस्ट्रक्टर। यदि थ्रेड समाप्त नहीं हुए हों तो सभी थ्रेड को जोड़ता है। |
## संबंधित देखें

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
