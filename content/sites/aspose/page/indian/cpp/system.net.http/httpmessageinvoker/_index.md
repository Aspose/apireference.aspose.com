---
title: "System::Net::Http::HttpMessageInvoker क्लास"
linktitle: "HttpMessageInvoker"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::HttpMessageInvoker क्लास। HTTP हैंडलर चेन पर Send मेथड को कॉल करने की अनुमति देता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को आर्ग्युमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 600
url: /hi/cpp/system.net.http/httpmessageinvoker/
---
## HttpMessageInvoker class


ऐप्लिकेशन को HTTP हैंडलर चेन पर Send मेथड को कॉल करने की अनुमति देता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्युमेंट के रूप में पास करने के लिए करें।

```cpp
class HttpMessageInvoker : public System::IDisposable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Dispose](./dispose/)() override | वर्तमान इंस्टेंस को डिस्पोज़ करता है। यह मेथड आवश्यक होने पर हैंडलर को भी डिस्पोज़ करता है। |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>) | RTTI जानकारी। |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>, bool) | एक नया उदाहरण बनाता है। |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | निर्दिष्ट अनुरोध को भेजता है। |
## संबंधित देखें

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
