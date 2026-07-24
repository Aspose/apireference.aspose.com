---
title: "System::Web::Services::Protocols::SoapDocumentServiceAttribute class"
linktitle: "SoapDocumentServiceAttribute"
second_title: "Aspose.Page C++ के लिए"
description: "System::Web::Services::Protocols::SoapDocumentServiceAttribute वर्ग। SOAP अनुरोधों और प्रतिक्रियाओं के लिए डिफ़ॉल्ट फ़ॉर्मेट सेट करता है। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 500
url: /hi/cpp/system.web.services.protocols/soapdocumentserviceattribute/
---
## SoapDocumentServiceAttribute class


SOAP अनुरोधों और प्रतिक्रियाओं के लिए डिफ़ॉल्ट फ़ॉर्मेट सेट करता है। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class SoapDocumentServiceAttribute : public System::Attribute
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_ParameterStyle](./get_parameterstyle/)() | RTTI जानकारी। |
| [get_RoutingStyle](./get_routingstyle/)() | एक मान प्राप्त करता है जो दर्शाता है कि SOAP संदेश सेवा तक कैसे रूट किए जाते हैं। |
| [get_Use](./get_use/)() | पैरामीटर फ़ॉर्मेटिंग प्राप्त करता है। |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | 'Body' तत्व के नीचे एकल XML तत्व में पैरामीटर संलग्न हैं या नहीं, यह दर्शाने वाला मान सेट करता है। |
| [set_RoutingStyle](./set_routingstyle/)(SoapServiceRoutingStyle) | एक मान सेट करता है जो दर्शाता है कि SOAP संदेश सेवा तक कैसे रूट किए जाते हैं। |
| [set_Use](./set_use/)(Description::SoapBindingUse) | पैरामीटर फ़ॉर्मेटिंग सेट करता है। |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)() | एक नया उदाहरण बनाता है। |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse) | एक नया उदाहरण बनाता है। |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse, SoapParameterStyle) | एक नया उदाहरण बनाता है। |
## संबंधित देखें

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
