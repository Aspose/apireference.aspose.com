---
title: "System::Web::Services::Protocols::WebClientProtocol class"
linktitle: "WebClientProtocol"
second_title: "Aspose.Page C++ के लिए"
description: "System::Web::Services::Protocols::WebClientProtocol वर्ग। यह बेस क्लास सभी XML Web सेवा क्लाइंट प्रॉक्सी में उपयोग किया जाता है जो ASP.NET का उपयोग करके बनाए गए थे। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 1100
url: /hi/cpp/system.web.services.protocols/webclientprotocol/
---
## WebClientProtocol class


यह बेस क्लास सभी XML [Web](../../system.web/) सेवा क्लाइंट प्रॉक्सी में उपयोग किया जाता है जो ASP.NET का उपयोग करके बनाए गए थे। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class WebClientProtocol : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Abort](./abort/)() | अनुरोध को रद्द करता है। |
| [get_ConnectionGroupName](./get_connectiongroupname/)() | कनेक्शन समूह का नाम प्राप्त करता है। |
| [get_Credentials](./get_credentials/)() | प्रमाणीकरण जानकारी को प्राप्त करता है। |
| [get_PreAuthenticate](./get_preauthenticate/)() | एक मान प्राप्त करता है जो दर्शाता है कि प्री‑ऑथेंटिकेशन सक्षम है या नहीं। |
| [get_RequestEncoding](./get_requestencoding/)() | क्लाइंट अनुरोध बनाने के लिए उपयोग की जाने वाली एन्कोडिंग प्राप्त करता है। |
| [get_Timeout](./get_timeout/)() | अनुरोध के टाइम‑आउट होने से पहले प्रतीक्षा करने के समय अंतराल को प्राप्त करता है। |
| [get_Uri](./get_uri/)() | XML [Web](../../system.web/) सेवा URI प्राप्त करता है। |
| [get_Url](./get_url/)() | XML [Web](../../system.web/) सेवा URL प्राप्त करता है। |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | एक मान प्राप्त करता है जो दर्शाता है कि 'Credential' प्रॉपर्टी 'DefaultCredentials' प्रॉपर्टी के बराबर है या नहीं। |
| [set_ConnectionGroupName](./set_connectiongroupname/)(String) | कनेक्शन समूह का नाम सेट करता है। |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<Net::ICredentials\>) | प्रमाणीकरण जानकारी को सेट करता है। |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) | एक मान सेट करता है जो दर्शाता है कि प्री‑ऑथेंटिकेशन सक्षम है या नहीं। |
| [set_RequestEncoding](./set_requestencoding/)(System::SharedPtr\<Text::Encoding\>) | क्लाइंट अनुरोधों को बनाने के लिए उपयोग की जाने वाली एन्कोडिंग सेट करता है। |
| [set_Timeout](./set_timeout/)(int32_t) | अनुरोध के टाइम‑आउट होने से पहले प्रतीक्षा करने की अवधि सेट करता है. |
| [set_Uri](./set_uri/)(System::SharedPtr\<Uri\>) | XML [Web](../../system.web/) सेवा URI सेट करता है। |
| [set_Url](./set_url/)(String) | XML [Web](../../system.web/) सेवा URL सेट करता है। |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | सेट करता है वह मान जो दर्शाता है कि 'Credential' प्रॉपर्टी 'DefaultCredentials' प्रॉपर्टी के बराबर है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
