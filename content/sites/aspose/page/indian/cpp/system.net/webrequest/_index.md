---
title: "System::Net::WebRequest क्लास"
linktitle: "WebRequest"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::WebRequest क्लास। एक वेब अनुरोध का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 3800
url: /hi/cpp/system.net/webrequest/
---
## WebRequest class


एक वेब अनुरोध का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class WebRequest : public virtual System::Object
```

## Nested classes

* Class [HttpRequestCreator](./httprequestcreator/)
* Class [WebRequestPrefixElement](./webrequestprefixelement/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Abort](./abort/)() | वर्तमान अनुरोध को रोकता है। |
| virtual [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) | संसाधन में डेटा लिखने के लिए एक स्ट्रीम प्राप्त करने हेतु असिंक्रोनस ऑपरेशन शुरू करता है। |
| virtual [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) | संसाधन के लिए असिंक्रोनस अनुरोध शुरू करता है। |
| static [Create](./create/)(String) | निर्दिष्ट URI का उपयोग करके [WebRequest](./) क्लास का नया इंस्टेंस बनाता है। |
| static [Create](./create/)(System::SharedPtr\<Uri\>) | निर्दिष्ट URI का उपयोग करके [WebRequest](./) क्लास का नया इंस्टेंस बनाता है। |
| static [CreateDefault](./createdefault/)(System::SharedPtr\<Uri\>) | निर्दिष्ट URI स्कीम के लिए एक [WebRequest](./) डीसेंडेंट बनाता है। |
| static [CreateHttp](./createhttp/)(String) | निर्दिष्ट URI का उपयोग करके [WebRequest](./) क्लास का नया इंस्टेंस बनाता है। |
| static [CreateHttp](./createhttp/)(System::SharedPtr\<Uri\>) | निर्दिष्ट URI का उपयोग करके [WebRequest](./) क्लास का नया इंस्टेंस बनाता है। |
| virtual [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) | स्ट्रीम प्राप्त करने के निर्दिष्ट असिंक्रोनस ऑपरेशन के समाप्त होने तक प्रतीक्षा करता है। |
| virtual [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) | संसाधन के लिए निर्दिष्ट असिंक्रोनस अनुरोध के समाप्त होने तक प्रतीक्षा करता है। |
| virtual [get_CachePolicy](./get_cachepolicy/)() | कैश नीति प्राप्त करता है। |
| virtual [get_ConnectionGroupName](./get_connectiongroupname/)() | कनेक्शन समूह का नाम प्राप्त करता है। |
| virtual [get_ContentLength](./get_contentlength/)() | भेजे जाने वाले अनुरोध डेटा के बाइट्स की संख्या प्राप्त करता है। |
| virtual [get_ContentType](./get_contenttype/)() | अनुरोध का MIME प्रकार प्राप्त करता है। |
| virtual [get_Credentials](./get_credentials/)() | वर्तमान अनुरोध से जुड़ी प्रमाणीकरण जानकारी प्राप्त करता है। |
| static [get_DefaultWebProxy](./get_defaultwebproxy/)() | वैश्विक HTTP प्रॉक्सी प्राप्त करता है। |
| virtual [get_Headers](./get_headers/)() | HTTP हेडर का संग्रह प्राप्त करता है। |
| virtual [get_Method](./get_method/)() | HTTP विधि प्राप्त करता है। |
| virtual [get_PreAuthenticate](./get_preauthenticate/)() | एक मान प्राप्त करता है जो दर्शाता है कि अनुरोध को पूर्व-प्रमाणित होना चाहिए या नहीं। |
| static [get_PrefixList](./get_prefixlist/)() | प्रिफिक्स सूची प्राप्त करता है। |
| virtual [get_Proxy](./get_proxy/)() | HTTP प्रॉक्सी प्राप्त करता है। |
| virtual [get_RequestUri](./get_requesturi/)() | अनुरोध URI लौटाता है। |
| virtual [get_Timeout](./get_timeout/)() | एक समय अवधि (मिलीसेकंड में) प्राप्त करता है जिसके बाद अनुरोध का समय समाप्त हो जाएगा। |
| virtual [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | एक मान प्राप्त करता है जो दर्शाता है कि 'Credential' प्रॉपर्टी 'DefaultCredentials' प्रॉपर्टी के बराबर है या नहीं। |
| virtual [GetRequestStream](./getrequeststream/)() | संसाधन में डेटा लिखने के लिए स्ट्रीम लौटाता है। |
| virtual [GetResponse](./getresponse/)() | वर्तमान वेब अनुरोध से संबंधित वेब प्रतिक्रिया लौटाता है। |
| static [RegisterPrefix](./registerprefix/)(String, System::SharedPtr\<IWebRequestCreate\>) | निर्दिष्ट URI के लिए [WebRequest](./) डीसेंडेंट को रजिस्टर करता है। |
| virtual [set_CachePolicy](./set_cachepolicy/)(System::SharedPtr\<System::Net::Cache::RequestCachePolicy\>) | कैश नीति सेट करता है। |
| virtual [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) | कनेक्शन समूह का नाम सेट करता है। |
| virtual [set_ContentLength](./set_contentlength/)(int64_t) | भेजे जाने वाले अनुरोध डेटा के बाइट्स की संख्या सेट करता है। |
| virtual [set_ContentType](./set_contenttype/)(String) | अनुरोध का MIME प्रकार सेट करता है। |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | वर्तमान अनुरोध से जुड़े प्रमाणीकरण जानकारी को सेट करता है। |
| static [set_DefaultWebProxy](./set_defaultwebproxy/)(System::SharedPtr\<IWebProxy\>) | वैश्विक HTTP प्रॉक्सी सेट करता है। |
| virtual [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) | HTTP हेडर का संग्रह सेट करता है। |
| virtual [set_Method](./set_method/)(String) | HTTP मेथड सेट करता है। |
| virtual [set_PreAuthenticate](./set_preauthenticate/)(bool) | एक मान सेट करता है जो दर्शाता है कि अनुरोध को पूर्व-प्रमाणित होना चाहिए या नहीं। |
| static [set_PrefixList](./set_prefixlist/)(System::SharedPtr\<Collections::Generic::List\<System::SharedPtr\<WebRequest::WebRequestPrefixElement\>\>\>) | प्रिफिक्स सूची सेट करता है। |
| virtual [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | HTTP प्रॉक्सी सेट करता है। |
| virtual [set_Timeout](./set_timeout/)(int32_t) | सेट करता है वह समय (मिलीसेकंड में) जिसके बाद अनुरोध टाइम‑आउट हो जाएगा। |
| virtual [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | सेट करता है वह मान जो दर्शाता है कि 'Credential' प्रॉपर्टी 'DefaultCredentials' प्रॉपर्टी के बराबर है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
