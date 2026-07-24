---
title: "System::Web::Services::Protocols::SoapHttpClientProtocol क्लास"
linktitle: "SoapHttpClientProtocol"
second_title: "Aspose.Page C++ के लिए"
description: "System::Web::Services::Protocols::SoapHttpClientProtocol क्लास। जब SOAP का उपयोग किया जाता है तो क्लाइंट प्रॉक्सी सेवाओं को इस क्लास को विरासत में लेना चाहिए। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 900
url: /hi/cpp/system.web.services.protocols/soaphttpclientprotocol/
---
## SoapHttpClientProtocol class


जब SOAP का उपयोग किया जाता है तो क्लाइंट प्रॉक्सी सेवाओं को इस क्लास को विरासत में लेना चाहिए। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class SoapHttpClientProtocol : public System::Web::Services::Protocols::HttpWebClientProtocol
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Discover](./discover/)() | वर्तमान इंस्टेंस को XML [Web](../../system.web/) सेवा से बाइंड करता है। |
| [get_SoapVersion](./get_soapversion/)() | SOAP संस्करण प्राप्त करता है। |
| [InitializeSerializers](./initializeserializers/)(const System::TypeInfo\&, System::SharedPtr\<System::Xml::Serialization::XmlSerializerImplementation\>, String) | आंतरिक फ़ील्ड्स को प्रारंभ करता है। |
| [set_SoapVersion](./set_soapversion/)(SoapProtocolVersion) | SOAP संस्करण सेट करता है। |
| [SoapHttpClientProtocol](./soaphttpclientprotocol/)() | एक नया उदाहरण बनाता है। |
## संबंधित देखें

* Class [HttpWebClientProtocol](../httpwebclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
