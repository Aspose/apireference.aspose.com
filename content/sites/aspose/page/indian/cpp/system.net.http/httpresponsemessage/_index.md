---
title: "System::Net::Http::HttpResponseMessage क्लास"
linktitle: "HttpResponseMessage"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::HttpResponseMessage क्लास। एक HTTP रिस्पॉन्स मैसेज का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को आर्ग्युमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 900
url: /hi/cpp/system.net.http/httpresponsemessage/
---
## HttpResponseMessage class


एक HTTP रिस्पॉन्स मैसेज का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्युमेंट के रूप में पास करने के लिए करें।

```cpp
class HttpResponseMessage : public System::IDisposable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Dispose](./dispose/)() override | वर्तमान इंस्टेंस को डिस्पोज़ करता है। यह मेथड HTTP रिस्पॉन्स की सामग्री को भी डिस्पोज़ करता है। |
| [EnsureSuccessStatusCode](./ensuresuccessstatuscode/)() | स्टेटस कोड की जाँच करता है। जब स्टेटस कोड 2xx श्रेणी में नहीं होता है तो [HttpRequestException](../httprequestexception/) फेंका जाएगा। |
| [get_Content](./get_content/)() const | HTTP रिस्पॉन्स की सामग्री प्राप्त करता है। |
| [get_Headers](./get_headers/)() const | HTTP सामग्री हेडर लौटाता है। |
| [get_IsSuccessStatusCode](./get_issuccessstatuscode/)() const | जाँचता है कि स्टेटस कोड यह दर्शाता है कि क्लाइंट द्वारा अनुरोधित कार्रवाई प्राप्त, समझी और स्वीकृत हुई है। |
| [get_ReasonPhrase](./get_reasonphrase/)() const | स्टेटस कोड के साथ सर्वर द्वारा भेजे जाने वाले Reason-Phrase को प्राप्त करता है। |
| [get_RequestMessage](./get_requestmessage/)() const | HTTP अनुरोध संदेश को प्राप्त करता है। |
| [get_StatusCode](./get_statuscode/)() const | HTTP स्टेटस कोड को प्राप्त करता है। |
| [get_Version](./get_version/)() const | RTTI जानकारी। |
| [HttpResponseMessage](./httpresponsemessage/)() | एक नया उदाहरण बनाता है। |
| [HttpResponseMessage](./httpresponsemessage/)(HttpStatusCode) | एक नया उदाहरण बनाता है। |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | HTTP रिस्पॉन्स की सामग्री सेट करता है। |
| [set_ReasonPhrase](./set_reasonphrase/)(String) | स्टेटस कोड के साथ सर्वर द्वारा भेजे जाने वाले Reason-Phrase को सेट करता है। |
| [set_RequestMessage](./set_requestmessage/)(System::SharedPtr\<HttpRequestMessage\>) | HTTP अनुरोध संदेश को सेट करता है। |
| [set_StatusCode](./set_statuscode/)(HttpStatusCode) | HTTP स्टेटस कोड को सेट करता है। |
| [set_Version](./set_version/)(System::Version) | HTTP संस्करण सेट करता है। |
| [ToString](./tostring/)() const override | [System::Object::ToString](../../system/object/tostring/). |
## संबंधित देखें

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
