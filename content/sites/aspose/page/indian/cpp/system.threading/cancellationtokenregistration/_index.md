---
title: "System::Threading::CancellationTokenRegistration क्लास"
linktitle: "CancellationTokenRegistration"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::CancellationTokenRegistration क्लास। C++ में कैंसलेशन टोकन कॉलबैक के लिए एक पंजीकरण का प्रतिनिधित्व करता है।"
type: docs
weight: 300
url: /hi/cpp/system.threading/cancellationtokenregistration/
---
## CancellationTokenRegistration class


रद्दीकरण टोकन कॉलबैक के लिए पंजीकरण का प्रतिनिधित्व करता है।

```cpp
class CancellationTokenRegistration
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Dispose](./dispose/)() | पंजीकरण को नष्ट करता है और संबंधित [CancellationTokenSource](../cancellationtokensource/) से कॉलबैक को हटा देता है। इस मेथड को कॉल करने के बाद, पंजीकृत कॉलबैक तब नहीं बुलाया जाएगा जब संबंधित [CancellationTokenSource](../cancellationtokensource/) रद्द किया जाता है। |
## टिप्पणियाँ


यह क्लास कैंसलेशन टोकन से कॉलबैक को डीरजिस्ट्री करने की अनुमति देती है। जब नष्ट किया जाता है, यह संबंधित [CancellationTokenSource](../cancellationtokensource/) से कॉलबैक को हटा देता है।
इस क्लास को सीधे नहीं बनाया जाना चाहिए - यह [CancellationToken](../cancellationtoken/) पंजीकरण विधियों द्वारा लौटाई जाती है।

## संबंधित देखें

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
