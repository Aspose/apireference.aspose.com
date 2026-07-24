---
title: "System::Web::Services::Protocols::HttpWebClientProtocol क्लास"
linktitle: "HttpWebClientProtocol"
second_title: "Aspose.Page C++ के लिए"
description: "System::Web::Services::Protocols::HttpWebClientProtocol क्लास। यह बेस क्लास सभी XML Web सेवा क्लाइंट प्रॉक्सी में उपयोग होती है जो HTTP का उपयोग करते हैं। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 100
url: /hi/cpp/system.web.services.protocols/httpwebclientprotocol/
---
## HttpWebClientProtocol class


यह बेस क्लास सभी XML [Web](../../system.web/) सेवा क्लाइंट प्रॉक्सी में उपयोग होती है जो HTTP का उपयोग करते हैं। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class HttpWebClientProtocol : public System::Web::Services::Protocols::WebClientProtocol
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [CheckForCookies](./checkforcookies/)(System::SharedPtr\<Net::HttpWebResponse\>) | निर्दिष्ट अनुरोध से कुकीज़ को आंतरिक कुकी कंटेनर में जोड़ता है। |
| [get_AllowAutoRedirect](./get_allowautoredirect/)() | एक मान प्राप्त करता है जो दर्शाता है कि क्लाइंट सर्वर रीडायरेक्ट्स का पालन करता है या नहीं। |
| [get_ClientCertificates](./get_clientcertificates/)() | क्लाइंट प्रमाणपत्रों का संग्रह लौटाता है। |
| [get_CookieContainer](./get_cookiecontainer/)() | एक कंटेनर प्राप्त करता है जिसका उपयोग कुकीज़ को संग्रहीत करने के लिए किया जाता है। |
| [get_EnableDecompression](./get_enabledecompression/)() | एक मान प्राप्त करता है जो दर्शाता है कि डीकंप्रेशन सक्षम है या नहीं। |
| [get_Proxy](./get_proxy/)() | प्रॉक्सी जानकारी प्राप्त करता है। |
| [get_UnsafeAuthenticatedConnectionSharing](./get_unsafeauthenticatedconnectionsharing/)() | एक मान प्राप्त करता है जो दर्शाता है कि जब क्लाइंट NTLM प्रमाणीकरण का उपयोग करता है तो कनेक्शन शेयरिंग सक्षम है या नहीं। |
| [get_UserAgent](./get_useragent/)() | 'User-Agent' हेडर का मान प्राप्त करता है। |
| [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | एक मान सेट करता है जो दर्शाता है कि क्लाइंट सर्वर रीडायरेक्ट्स का पालन करता है या नहीं। |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | एक कंटेनर सेट करता है जिसका उपयोग कुकीज़ को संग्रहीत करने के लिए किया जाता है। |
| [set_EnableDecompression](./set_enabledecompression/)(bool) | एक मान सेट करता है जो दर्शाता है कि डीकंप्रेशन सक्षम है या नहीं। |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<Net::IWebProxy\>) | प्रॉक्सी जानकारी सेट करता है। |
| [set_UnsafeAuthenticatedConnectionSharing](./set_unsafeauthenticatedconnectionsharing/)(bool) | एक मान सेट करता है जो दर्शाता है कि जब क्लाइंट NTLM प्रमाणीकरण का उपयोग करता है तो कनेक्शन शेयरिंग सक्षम है या नहीं। |
| [set_UserAgent](./set_useragent/)(String) | सेट करता है 'User-Agent' हेडर का मान। |
| [UnregisterMapping](./unregistermapping/)(System::SharedPtr\<Object\>) |  |
## संबंधित देखें

* Class [WebClientProtocol](../webclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
