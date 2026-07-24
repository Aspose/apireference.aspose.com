---
title: "System::Net::Http::HttpRequestMessage क्लास"
linktitle: "HttpRequestMessage"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::HttpRequestMessage क्लास। यह एक HTTP अनुरोध संदेश का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार को स्टैक पर या operator new का उपयोग करके इंस्टेंस न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 800
url: /hi/cpp/system.net.http/httprequestmessage/
---
## HttpRequestMessage class


एक HTTP अनुरोध संदेश का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class HttpRequestMessage : public System::IDisposable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Dispose](./dispose/)() override | वर्तमान इंस्टेंस को नष्ट करता है। यह मेथड HTTP अनुरोध की सामग्री को भी नष्ट करता है। |
| [get_Content](./get_content/)() | HTTP अनुरोध की सामग्री प्राप्त करता है। |
| [get_Headers](./get_headers/)() | HTTP सामग्री हेडर लौटाता है। |
| [get_Method](./get_method/)() | HTTP अनुरोध विधि प्राप्त करता है। |
| [get_Properties](./get_properties/)() | HTTP अनुरोध गुणों का संग्रह लौटाता है। |
| [get_RequestUri](./get_requesturi/)() | अनुरोधित संसाधन का URI प्राप्त करता है। |
| [get_Version](./get_version/)() | RTTI जानकारी। |
| [HttpRequestMessage](./httprequestmessage/)() | एक नया उदाहरण बनाता है। |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, System::SharedPtr\<Uri\>) | एक नया उदाहरण बनाता है। |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, String) | एक नया उदाहरण बनाता है। |
| [MarkAsSent](./markassent/)() | वर्तमान अनुरोध को भेजा गया चिह्नित करता है। |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | HTTP अनुरोध की सामग्री सेट करता है। |
| [set_Method](./set_method/)(System::SharedPtr\<HttpMethod\>) | HTTP अनुरोध विधि सेट करता है। |
| [set_RequestUri](./set_requesturi/)(System::SharedPtr\<Uri\>) | अनुरोधित संसाधन का URI सेट करता है। |
| [set_Version](./set_version/)(System::Version) | HTTP संस्करण सेट करता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
## संबंधित देखें

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
