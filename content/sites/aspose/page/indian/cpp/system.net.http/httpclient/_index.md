---
title: "System::Net::Http::HttpClient क्लास"
linktitle: "HttpClient"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::HttpClient क्लास। अनुरोध भेजने और प्रतिक्रियाएँ प्राप्त करने के लिए HTTP क्लाइंट की बेस क्लास को दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 200
url: /hi/cpp/system.net.http/httpclient/
---
## HttpClient class


अनुरोध भेजने और प्रतिक्रियाएँ प्राप्त करने के लिए HTTP क्लाइंट की बेस क्लास को दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class HttpClient : public System::Net::Http::HttpMessageInvoker
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CancelPendingRequests](./cancelpendingrequests/)() | सभी लंबित अनुरोधों को रद्द करता है। |
| [get_BaseAddress](./get_baseaddress/)() | अनुरोध भेजने के लिए उपयोग किए जाने वाले संसाधन का बेस पता प्राप्त करता है। |
| [get_DefaultRequestHeaders](./get_defaultrequestheaders/)() | RTTI जानकारी। |
| [get_MaxResponseContentBufferSize](./get_maxresponsecontentbuffersize/)() | प्रतिक्रिया सामग्री के अधिकतम बाइट्स की संख्या प्राप्त करता है। |
| [get_Timeout](./get_timeout/)() | अनुरोध के टाइम‑आउट होने से पहले प्रतीक्षा करने के समय अंतराल को प्राप्त करता है। |
| [HttpClient](./httpclient/)() | एक नया उदाहरण बनाता है। |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>) | एक नया उदाहरण बनाता है। |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>, bool) | एक नया उदाहरण बनाता है। |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>, HttpCompletionOption) | निर्दिष्ट HTTP अनुरोध भेजता है। |
| [set_BaseAddress](./set_baseaddress/)(System::SharedPtr\<Uri\>) | संसाधन का बेस पता सेट करता है जिसका उपयोग अनुरोध भेजने के लिए किया जाता है. |
| [set_MaxResponseContentBufferSize](./set_maxresponsecontentbuffersize/)(int64_t) | प्रतिक्रिया सामग्री के अधिकतम बाइट्स की संख्या सेट करता है. |
| [set_Timeout](./set_timeout/)(TimeSpan) | अनुरोध के टाइम‑आउट होने से पहले प्रतीक्षा करने की अवधि सेट करता है. |
## संबंधित देखें

* Class [HttpMessageInvoker](../httpmessageinvoker/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
