---
title: "System::Web::Services::Protocols::SoapClientMessage class"
linktitle: "SoapClientMessage"
second_title: "Aspose.Page C++ के लिए"
description: "System::Web::Services::Protocols::SoapClientMessage वर्ग। एक भेजे गए SOAP अनुरोध या प्राप्त SOAP प्रतिक्रिया में डेटा का प्रतिनिधित्व करता है। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 300
url: /hi/cpp/system.web.services.protocols/soapclientmessage/
---
## SoapClientMessage class


एक भेजे गए SOAP अनुरोध या प्राप्त SOAP प्रतिक्रिया में डेटा का प्रतिनिधित्व करता है। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class SoapClientMessage : public System::Web::Services::Protocols::SoapMessage
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Action](./get_action/)() override | 'SOAPAction' एट्रिब्यूट का मान लौटाता है। |
| [get_Client](./get_client/)() | क्लाइंट प्रॉक्सी वर्ग का एक इंस्टेंस लौटाता है। |
| virtual [get_OneWay](./get_oneway/)() | एक मान लौटाता है जो दर्शाता है कि क्लाइंट सर्वर द्वारा विधि की प्रक्रिया समाप्त होने की प्रतीक्षा नहीं करता है। |
| [get_SoapVersion](./get_soapversion/)() override | उपयोग किए गए SOAP संस्करण को लौटाता है। |
| [get_Url](./get_url/)() override | XML [Web](../../system.web/) सेवा URL लौटाता है। |
| [SoapClientMessage](./soapclientmessage/)(System::SharedPtr\<SoapHttpClientProtocol\>, System::SharedPtr\<SoapMethodStubInfo\>, String, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | एक नया उदाहरण बनाता है। |
## संबंधित देखें

* Class [SoapMessage](../soapmessage/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
