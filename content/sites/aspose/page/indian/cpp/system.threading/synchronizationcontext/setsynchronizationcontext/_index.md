---
title: "System::Threading::SynchronizationContext::SetSynchronizationContext मेथड"
linktitle: "SetSynchronizationContext"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::SynchronizationContext::SetSynchronizationContext मेथड. वर्तमान थ्रेड के लिए C++ में सिंक्रोनाइज़ेशन कॉन्टेक्स्ट सेट करता है।"
type: docs
weight: 300
url: /hi/cpp/system.threading/synchronizationcontext/setsynchronizationcontext/
---
## SynchronizationContext::SetSynchronizationContext method


वर्तमान थ्रेड के लिए सिंक्रनाइज़ेशन कॉन्टेक्स्ट सेट करता है।

```cpp
static void System::Threading::SynchronizationContext::SetSynchronizationContext(const SharedPtr<SynchronizationContext> &syncContext)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| syncContext | const SharedPtr\<SynchronizationContext\>\& | वर्तमान थ्रेड के लिए सेट करने वाला सिंक्रोनाइज़ेशन कॉन्टेक्स्ट। |
## टिप्पणियाँ



nullptr पास करने से वर्तमान थ्रेड के लिए सिंक्रोनाइज़ेशन कॉन्टेक्स्ट साफ़ हो जाएगा।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SynchronizationContext](../)
* Class [SynchronizationContext](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
