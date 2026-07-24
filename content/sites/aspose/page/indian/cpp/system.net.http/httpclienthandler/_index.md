---
title: "System::Net::Http::HttpClientHandler class"
linktitle: "HttpClientHandler"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::HttpClientHandler class. HttpClient क्लास द्वारा उपयोग किए जाने वाले डिफ़ॉल्ट संदेश हैंडलर को दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 300
url: /hi/cpp/system.net.http/httpclienthandler/
---
## HttpClientHandler class


डिफ़ॉल्ट संदेश हैंडलर को दर्शाता है जो [HttpClient](../httpclient/) क्लास द्वारा उपयोग किया जाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class HttpClientHandler : public System::Net::Http::HttpMessageHandler
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Dispose](./dispose/)() override | कुछ नहीं करता। |
| [get_CookieContainer](./get_cookiecontainer/)() | सर्वर कुकीज़ को संग्रहीत करने के लिए उपयोग किए जाने वाले कुकी कंटेनर को प्राप्त करता है। |
| [get_Credentials](./get_credentials/)() | प्रमाणीकरण जानकारी को प्राप्त करता है। |
| [HttpClientHandler](./httpclienthandler/)() | RTTI जानकारी। |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) override | RTTI जानकारी। |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | सर्वर कुकीज़ को संग्रहीत करने के लिए उपयोग किए जाने वाले कुकी कंटेनर को सेट करता है। |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | प्रमाणीकरण जानकारी को सेट करता है। |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | प्रॉक्सी जानकारी को सेट करता है। |
| [set_Timeout](./set_timeout/)(int32_t) | एक समय अवधि (मिलीसेकंड में) प्राप्त करता है जिसके बाद अनुरोध का समय समाप्त हो जाएगा। |
| [set_UseCookies](./set_usecookies/)(bool) | वर्तमान इंस्टेंस कुकी कंटेनर का उपयोग करके सर्वर कुकीज़ को संग्रहीत करता है या नहीं, और अनुरोध भेजते समय इंस्टेंस सर्वर कुकीज़ का उपयोग करता है या नहीं, यह दर्शाने वाला मान सेट करता है। |
| [set_UseProxy](./set_useproxy/)(bool) | वर्तमान इंस्टेंस द्वारा अनुरोध भेजने के लिए प्रॉक्सी के उपयोग को दर्शाने वाले मान को सेट करता है। |
## संबंधित देखें

* Class [HttpMessageHandler](../httpmessagehandler/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
