---
title: "System::Web::Services::Protocols::SoapDocumentMethodAttribute क्लास"
linktitle: "SoapDocumentMethodAttribute"
second_title: "Aspose.Page C++ के लिए"
description: "System::Web::Services::Protocols::SoapDocumentMethodAttribute क्लास। निर्दिष्ट करता है कि इस मेथड से पास या लौटाए गए सभी SOAP संदेश Document फ़ॉर्मेटिंग का उपयोग करते हैं। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 400
url: /hi/cpp/system.web.services.protocols/soapdocumentmethodattribute/
---
## SoapDocumentMethodAttribute class


निर्दिष्ट करता है कि इस मेथड से पास या लौटाए गए सभी SOAP संदेश Document फ़ॉर्मेटिंग का उपयोग करते हैं। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class SoapDocumentMethodAttribute : public System::Attribute
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Action](./get_action/)() | RTTI जानकारी। |
| [get_Binding](./get_binding/)() | उस बाइंडिंग को प्राप्त करता है जिसके लिए एक XML वेब सर्विस मेथड एक ऑपरेशन को लागू कर रहा है। |
| [get_OneWay](./get_oneway/)() | एक मान प्राप्त करता है जो दर्शाता है कि क्लाइंट सर्वर के मेथड प्रोसेसिंग समाप्त होने की प्रतीक्षा नहीं करता है या नहीं। |
| [get_ParameterStyle](./get_parameterstyle/)() | एक मान प्राप्त करता है जो दर्शाता है कि पैरामीटर 'Body' तत्व के नीचे एकल XML तत्व में संलग्न हैं या नहीं। |
| [get_RequestElementName](./get_requestelementname/)() | SOAP अनुरोध से संबंधित XML तत्व का नाम प्राप्त करता है, जिसे सेवा विवरण में एक ऑपरेशन के रूप में परिभाषित किया गया है। |
| [get_RequestNamespace](./get_requestnamespace/)() | SOAP अनुरोध से संबद्ध नेमस्पेस प्राप्त करता है। |
| [get_ResponseElementName](./get_responseelementname/)() | SOAP प्रतिक्रिया से संबद्ध XML तत्व का नाम प्राप्त करता है। |
| [get_ResponseNamespace](./get_responsenamespace/)() | SOAP प्रतिक्रिया से संबद्ध नेमस्पेस प्राप्त करता है। |
| [get_Use](./get_use/)() | संदेश एन्कोडिंग विधि निर्धारित करने वाला मान प्राप्त करता है। |
| [set_Action](./set_action/)(String) | 'SOAPAction' एट्रिब्यूट का मान सेट करता है। |
| [set_Binding](./set_binding/)(String) | एक XML वेब सेवा मेथड द्वारा कार्यान्वित ऑपरेशन के लिए बाइंडिंग सेट करता है। |
| [set_OneWay](./set_oneway/)(bool) | क्लाइंट के सर्वर द्वारा मेथड प्रोसेसिंग समाप्त होने की प्रतीक्षा न करने को दर्शाने वाला मान सेट करता है। |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | 'Body' तत्व के नीचे एकल XML तत्व में पैरामीटर संलग्न हैं या नहीं, यह दर्शाने वाला मान सेट करता है। |
| [set_RequestElementName](./set_requestelementname/)(String) | सेवा विवरण में ऑपरेशन के रूप में परिभाषित SOAP अनुरोध से संबद्ध XML तत्व का नाम सेट करता है। |
| [set_RequestNamespace](./set_requestnamespace/)(String) | SOAP अनुरोध से संबद्ध नेमस्पेस सेट करता है। |
| [set_ResponseElementName](./set_responseelementname/)(String) | SOAP प्रतिक्रिया से संबद्ध XML तत्व का नाम सेट करता है। |
| [set_ResponseNamespace](./set_responsenamespace/)(String) | SOAP प्रतिक्रिया से संबद्ध नेमस्पेस सेट करता है। |
| [set_Use](./set_use/)(Description::SoapBindingUse) | संदेश एन्कोडिंग विधि निर्धारित करने वाला मान सेट करता है। |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)() | एक नया उदाहरण बनाता है। |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)(String) | एक नया उदाहरण बनाता है। |
## संबंधित देखें

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
