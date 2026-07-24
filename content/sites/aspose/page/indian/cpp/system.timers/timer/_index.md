---
title: "System::Timers::Timer class"
linktitle: "Timer"
second_title: "Aspose.Page C++ के लिए"
description: "System::Timers::Timer class. C++ में लूप में डेलीगेट को कॉल करने वाला टाइमर।"
type: docs
weight: 200
url: /hi/cpp/system.timers/timer/
---
## Timer class


[Timer](./) that calls delegate in a loop.

```cpp
class Timer : public System::ComponentModel::Component
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Close](./close/)() | टाइमर को रोकता है, आवंटित संसाधनों को मुक्त करता है। |
| [Dispose](./dispose/)() | टाइमर को रोकता है, आवंटित संसाधनों को मुक्त करता है। |
| [get_AutoReset](./get_autoreset/)() const | जाँचता है कि टाइमर ऑटो-रीसेट मोड में है या नहीं। |
| [get_Enabled](./get_enabled/)() const | जाँचता है कि टाइमर सक्रिय है या नहीं। |
| [get_Interval](./get_interval/)() const | टाइमर अंतराल प्राप्त करता है। |
| [get_IsStopped](./get_isstopped/)() const | जाँचता है कि टाइमर बंद है या नहीं। |
| [set_AutoReset](./set_autoreset/)(bool) | टाइमर को ऑटो-रीसेट मोड में सेट करता है या उससे बाहर करता है। |
| [set_Enabled](./set_enabled/)(bool) | टाइमर को शुरू या रोकता है। टाइमर को शुरू करने से समय गिनती पुनः शुरू नहीं होती यदि टाइमर पहले से चल रहा है। |
| [set_Interval](./set_interval/)(double) | टाइमर अंतराल सेट करता है। |
| [Start](./start/)() | टाइमर को शुरू करता है। यदि टाइमर पहले से चल रहा है तो समय गिनती पुनः शुरू नहीं होती। |
| [Stop](./stop/)() | टाइमर को रोकता है। |
| [Timer](./timer/)() | RTTI जानकारी। |
| [Timer](./timer/)(double) | निर्दिष्ट अंतराल के साथ रोक दिया गया टाइमर बनाता है। |
## संबंधित देखें

* Class [Component](../../system.componentmodel/component/)
* Namespace [System::Timers](../)
* Library [Aspose.Page for C++](../../)
