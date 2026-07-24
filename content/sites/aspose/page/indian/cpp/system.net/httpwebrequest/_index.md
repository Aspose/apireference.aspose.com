---
title: "System::Net::HttpWebRequest class"
linktitle: "HttpWebRequest"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::HttpWebRequest क्लास। HTTP वेब अनुरोध का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 2000
url: /hi/cpp/system.net/httpwebrequest/
---
## HttpWebRequest class


HTTP वेब अनुरोध का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class HttpWebRequest : public System::Net::WebRequest
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Abort](./abort/)() override | वर्तमान अनुरोध को रोकता है। |
| virtual [AddRange](./addrange/)(int32_t) | वर्तमान अनुरोध में 'Range' हेडर जोड़ता है। |
| virtual [AddRange](./addrange/)(System::String, int32_t, int32_t) | वर्तमान अनुरोध में 'Range' हेडर जोड़ता है। |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | संसाधन में डेटा लिखने के लिए एक स्ट्रीम प्राप्त करने हेतु असिंक्रोनस ऑपरेशन शुरू करता है। |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | संसाधन के लिए असिंक्रोनस अनुरोध शुरू करता है। |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | स्ट्रीम प्राप्त करने के निर्दिष्ट असिंक्रोनस ऑपरेशन के समाप्त होने तक प्रतीक्षा करता है। |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | संसाधन के लिए निर्दिष्ट असिंक्रोनस अनुरोध के समाप्त होने तक प्रतीक्षा करता है। |
| [get_Accept](./get_accept/)() | 'Accept' HTTP हेडर मान प्राप्त करता है। |
| virtual [get_AllowAutoRedirect](./get_allowautoredirect/)() | एक मान प्राप्त करता है जो दर्शाता है कि अनुरोध को पुनर्निर्देशन का पालन करना चाहिए या नहीं। |
| virtual [get_AllowReadStreamBuffering](./get_allowreadstreambuffering/)() | एक मान प्राप्त करता है जो दर्शाता है कि संसाधन से प्राप्त डेटा को बफ़र किया जाना चाहिए या नहीं। |
| virtual [get_AllowWriteStreamBuffering](./get_allowwritestreambuffering/)() | एक मान प्राप्त करता है जो दर्शाता है कि डेटा भेजने के लिए बफ़रिंग सक्षम है या नहीं। |
| virtual [get_ClientCertificates](./get_clientcertificates/)() | वर्तमान अनुरोध से जुड़े प्रमाणपत्रों का संग्रह प्राप्त करता है। |
| [get_ConnectionGroupName](./get_connectiongroupname/)() override | कनेक्शन समूह का नाम प्राप्त करता है। |
| [get_ContentLength](./get_contentlength/)() override | भेजे जाने वाले अनुरोध डेटा के बाइट्स की संख्या प्राप्त करता है। |
| [get_ContentType](./get_contenttype/)() override | अनुरोध का MIME प्रकार प्राप्त करता है। |
| [get_ContinueTimeout](./get_continuetimeout/)() | 100-Continue स्थिति कोड प्राप्त होने तक प्रतीक्षा करने के लिए टाइमआउट प्राप्त करता है। |
| virtual [get_CookieContainer](./get_cookiecontainer/)() | वर्तमान वेब अनुरोध से जुड़े कुकी कंटेनर को प्राप्त करता है। |
| [get_Credentials](./get_credentials/)() override | वर्तमान अनुरोध से जुड़ी प्रमाणीकरण जानकारी प्राप्त करता है। |
| virtual [get_HaveResponse](./get_haveresponse/)() | एक मान लौटाता है जो दर्शाता है कि प्रतिक्रिया प्राप्त हुई है या नहीं। |
| [get_Headers](./get_headers/)() override | HTTP हेडर का संग्रह प्राप्त करता है। |
| virtual [get_KeepAlive](./get_keepalive/)() | एक मान प्राप्त करता है जो दर्शाता है कि वर्तमान अनुरोध में 'Keep-Alive' हेडर होना चाहिए या नहीं। |
| virtual [get_MaximumAutomaticRedirections](./get_maximumautomaticredirections/)() | अनुमत अधिकतम पुनर्निर्देशन संख्या प्राप्त करता है। |
| [get_Method](./get_method/)() override | HTTP विधि प्राप्त करता है। |
| [get_PreAuthenticate](./get_preauthenticate/)() override | एक मान प्राप्त करता है जो दर्शाता है कि अनुरोध को पूर्व-प्रमाणित होना चाहिए या नहीं। |
| [get_Proxy](./get_proxy/)() override | HTTP प्रॉक्सी प्राप्त करता है। |
| virtual [get_Referer](./get_referer/)() | 'Referer' हेडर का मान प्राप्त करता है। |
| [get_RequestUri](./get_requesturi/)() override | अनुरोध URI लौटाता है। |
| virtual [get_SendChunked](./get_sendchunked/)() | एक मान प्राप्त करता है जो दर्शाता है कि डेटा को खंडों में भेजना चाहिए या नहीं। |
| [get_ServicePoint](./get_servicepoint/)() | एक सर्विस पॉइंट लौटाता है जो संसाधन के नेटवर्क कनेक्शन का प्रतिनिधित्व करता है। |
| virtual [get_SupportsCookieContainer](./get_supportscookiecontainer/)() | एक मान लौटाता है जो दर्शाता है कि वर्तमान अनुरोध कुकी कंटेनर का उपयोग कर सकता है या नहीं। |
| [get_Timeout](./get_timeout/)() override | एक समय अवधि (मिलीसेकंड में) प्राप्त करता है जिसके बाद अनुरोध का समय समाप्त हो जाएगा। |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() override | एक मान प्राप्त करता है जो दर्शाता है कि 'Credential' प्रॉपर्टी 'DefaultCredentials' प्रॉपर्टी के बराबर है या नहीं। |
| virtual [get_UserAgent](./get_useragent/)() | 'User-Agent' हेडर का मान प्राप्त करता है। |
| [GetRequestStream](./getrequeststream/)() override | संसाधन में डेटा लिखने के लिए स्ट्रीम लौटाता है। |
| [GetResponse](./getresponse/)() override | वर्तमान वेब अनुरोध से संबंधित वेब प्रतिक्रिया लौटाता है। |
| [HttpWebRequest](./httpwebrequest/)(System::SharedPtr\<Uri\>) | एक नया उदाहरण बनाता है। |
| [set_Accept](./set_accept/)(String) | 'Accept' HTTP हेडर का मान सेट करता है। |
| virtual [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | एक मान सेट करता है जो दर्शाता है कि अनुरोध को रीडायरेक्शन का पालन करना चाहिए या नहीं। |
| virtual [set_AllowReadStreamBuffering](./set_allowreadstreambuffering/)(bool) | एक मान सेट करता है जो दर्शाता है कि संसाधन से प्राप्त डेटा को बफ़र किया जाना चाहिए या नहीं। |
| virtual [set_AllowWriteStreamBuffering](./set_allowwritestreambuffering/)(bool) | एक मान सेट करता है जो दर्शाता है कि डेटा भेजने के लिए बफ़रिंग सक्षम है या नहीं। |
| virtual [set_ClientCertificates](./set_clientcertificates/)(System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>) | वर्तमान अनुरोध से जुड़े प्रमाणपत्रों का संग्रह सेट करता है। |
| [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) override | कनेक्शन समूह का नाम सेट करता है। |
| [set_ContentLength](./set_contentlength/)(int64_t) override | भेजे जाने वाले अनुरोध डेटा के बाइट्स की संख्या सेट करता है। |
| [set_ContentType](./set_contenttype/)(String) override | अनुरोध का MIME प्रकार सेट करता है। |
| [set_ContinueTimeout](./set_continuetimeout/)(int32_t) | 100-Continue स्थिति कोड प्राप्त होने तक प्रतीक्षा करने के लिए टाइमआउट सेट करता है। |
| virtual [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | वर्तमान वेब अनुरोध से जुड़े कुकी कंटेनर को सेट करता है। |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) override | वर्तमान अनुरोध से जुड़े प्रमाणीकरण जानकारी को सेट करता है। |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | HTTP हेडर का संग्रह सेट करता है। |
| virtual [set_KeepAlive](./set_keepalive/)(bool) | एक मान सेट करता है जो दर्शाता है कि वर्तमान अनुरोध में 'Keep-Alive' हेडर होना चाहिए या नहीं। |
| virtual [set_MaximumAutomaticRedirections](./set_maximumautomaticredirections/)(int) | अनुमत अधिकतम रीडायरेक्शन की संख्या सेट करता है। |
| [set_Method](./set_method/)(String) override | HTTP मेथड सेट करता है। |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) override | एक मान सेट करता है जो दर्शाता है कि अनुरोध को पूर्व-प्रमाणित होना चाहिए या नहीं। |
| [set_ProtocolVersion](./set_protocolversion/)(System::Version) | RTTI जानकारी। |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) override | HTTP प्रॉक्सी सेट करता है। |
| virtual [set_Referer](./set_referer/)(System::String) | सेट करता है 'Referer' हेडर का मान। |
| virtual [set_SendChunked](./set_sendchunked/)(bool) | सेट करता है वह मान जो दर्शाता है कि डेटा को खंडों में भेजना चाहिए। |
| [set_Timeout](./set_timeout/)(int) override | सेट करता है वह समय (मिलीसेकंड में) जिसके बाद अनुरोध टाइम‑आउट हो जाएगा। |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) override | सेट करता है वह मान जो दर्शाता है कि 'Credential' प्रॉपर्टी 'DefaultCredentials' प्रॉपर्टी के बराबर है। |
| virtual [set_UserAgent](./set_useragent/)(System::String) | सेट करता है 'User-Agent' हेडर का मान। |
## संबंधित देखें

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
