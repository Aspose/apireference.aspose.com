---
title: "Aspose::Page::EPS::Util::ThreadLocal क्लास"
linktitle: "ThreadLocal"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::EPS::Util::ThreadLocal क्लास। क्लास का उपयोग .NET Framework 4.0 और 4.5 की System.Threading.ThreadLocal रैपर टाइप द्वारा प्रदान की गई कार्यक्षमता को दोहराने के लिए किया जाता है। यह थ्रेड-लोकल इंस्टेंस और स्थैतिक प्रकारों को लागू करता है जो विभिन्न थ्रेड्स में अलग-अलग इंस्टेंस को संदर्भित करते हैं, भले ही वास्तविक इंस्टेंस टाइप जो क्लास का एक समुच्चय है, C++ में समान हो सकता है।"
type: docs
weight: 100
url: /hi/cpp/aspose.page.eps.util/threadlocal/
---
## ThreadLocal class


.NET Framework 4.0 और 4.5 के System.Threading.ThreadLocal रैपर टाइप द्वारा प्रदान की गई कार्यक्षमता को दोहराने के लिए उपयोग की जाने वाली क्लास। यह थ्रेड-लोकल इंस्टेंस और स्टैटिक टाइप्स को लागू करता है जो विभिन्न थ्रेड्स में अलग-अलग इंस्टेंस को संदर्भित करते हैं, भले ही वास्तविक इंस्टेंस टाइप जो क्लास का भाग है समान हो सकता है।

```cpp
template<typename T>class ThreadLocal : public System::IDisposable
```


| पैरामीटर | विवरण |
| --- | --- |
| T | थ्रेड चयन लॉजिक में लपेटने के लिए वेरिएबल प्रकार |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Dispose](./dispose/)() override | कुछ नहीं करता। |
| [get_Value](./get_value/)() |  |
| [isValueCreated](./isvaluecreated/)() |  |
| [set_Value](./set_value/)(T) |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override |  n'th टेम्पलेट आर्ग्युमेंट को एक weak पॉइंटर सेट करें (shared के बजाय)। कंटेनरों में पॉइंटर्स को weak मोड में स्विच करने की अनुमति देता है। |
| [ThreadLocal](./threadlocal/)(Factory) |  |
| static [to_T](./to_t/)(System::SharedPtr\<ThreadLocal\<T\>\>) |  |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Factory](./factory/) |  |

## संबंधित देखें

* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::EPS::Util](../)
* Library [Aspose.Page for C++](../../)
