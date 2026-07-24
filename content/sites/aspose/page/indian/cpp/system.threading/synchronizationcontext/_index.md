---
title: "System::Threading::SynchronizationContext class"
linktitle: "SynchronizationContext"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::SynchronizationContext class. C++ में विभिन्न सिंक्रनाइज़ेशन ऑपरेशनों के बीच एक सिंक्रनाइज़ेशन कॉन्टेक्स्ट को प्रसारित करने के लिए मूल कार्यक्षमता प्रदान करता है।"
type: docs
weight: 1100
url: /hi/cpp/system.threading/synchronizationcontext/
---
## SynchronizationContext class


विभिन्न समकालिक संचालन में समकालिक संदर्भ को प्रसारित करने के लिए मूल कार्यक्षमता प्रदान करता है।

```cpp
class SynchronizationContext : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [get_Current](./get_current/)() | वर्तमान थ्रेड के लिए सिंक्रनाइज़ेशन कॉन्टेक्स्ट प्राप्त करता है। |
| static [SetSynchronizationContext](./setsynchronizationcontext/)(const SharedPtr\<SynchronizationContext\>\&) | वर्तमान थ्रेड के लिए सिंक्रनाइज़ेशन कॉन्टेक्स्ट सेट करता है। |
| [SynchronizationContext](./synchronizationcontext/)() | RTTI जानकारी। |
## टिप्पणियाँ


यह क्लास थ्रेड्स के बीच सिंक्रनाइज़ेशन कॉन्टेक्स्ट के प्रसार को सक्षम करती है और उपयुक्त थ्रेड या सिंक्रनाइज़ेशन कॉन्टेक्स्ट को कॉलबैक्स या इनवोकेशन्स भेजने के लिए उपयोग की जाती है।
डमी कार्यान्वयन।

## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
