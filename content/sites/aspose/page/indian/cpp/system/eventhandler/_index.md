---
title: "System::EventHandler typedef"
linktitle: "EventHandler"
second_title: "Aspose.Page C++ के लिए"
description: "System::EventHandler typedef. एक विधि को दर्शाता है जो किसी इवेंट पर प्रतिक्रिया देती है और उसे प्रोसेस करती है। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शनों को मान या रेफ़रेंस द्वारा पास किया जाना चाहिए। C++ में इस प्रकार की वस्तुओं को प्रबंधित करने के लिए System::SmartPtr क्लास का कभी उपयोग न करें।"
type: docs
weight: 11400
url: /hi/cpp/system/eventhandler/
---
## EventHandler typedef


एक विधि को दर्शाता है जो किसी इवेंट पर प्रतिक्रिया देती है और उसे प्रोसेस करती है। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शनों को मान या रेफ़रेंस द्वारा पास किया जाना चाहिए। इस प्रकार की वस्तुओं को प्रबंधित करने के लिए कभी भी [System::SmartPtr](../smartptr/) क्लास का उपयोग न करें।

```cpp
using System::EventHandler =  MulticastDelegate<void(System::SharedPtr<Object>, TEventArgs)>
```


## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
