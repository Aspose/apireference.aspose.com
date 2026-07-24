---
title: "System::Web::Services::Protocols::SoapHeader class"
linktitle: "SoapHeader"
second_title: "Aspose.Page C++ के लिए"
description: "System::Web::Services::Protocols::SoapHeader class. SOAP हेडर की सामग्री का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शन के तर्क के रूप में पास करें।"
type: docs
weight: 600
url: /hi/cpp/system.web.services.protocols/soapheader/
---
## SoapHeader class


SOAP हेडर की सामग्री का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class SoapHeader : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Actor](./get_actor/)() | जब SOAP संस्करण 1.1 उपयोग किया जाता है, तब SOAP हेडर प्राप्तकर्ता का URI प्राप्त करता है। |
| [get_DidUnderstand](./get_didunderstand/)() | एक मान प्राप्त करता है जो दर्शाता है कि SOAP हेडर सही ढंग से प्रोसेस किया गया है या नहीं। |
| [get_EncodedMustUnderstand](./get_encodedmustunderstand/)() | जब SOAP संस्करण 1.1 उपयोग किया जाता है, तब 'mustUnderstand' एट्रिब्यूट का मान प्राप्त करता है। |
| [get_EncodedMustUnderstand12](./get_encodedmustunderstand12/)() | जब SOAP संस्करण 1.2 उपयोग किया जाता है, तब 'mustUnderstand' एट्रिब्यूट का मान प्राप्त करता है। |
| [get_EncodedRelay](./get_encodedrelay/)() | 'relay' एट्रिब्यूट मान का स्ट्रिंग प्रतिनिधित्व प्राप्त करता है। |
| [get_MustUnderstand](./get_mustunderstand/)() | एक मान प्राप्त करता है जो दर्शाता है कि SOAP हेडर को समझा जाना आवश्यक है या नहीं। |
| [get_Relay](./get_relay/)() | 'relay' एट्रिब्यूट का मान प्राप्त करता है। |
| [get_Role](./get_role/)() | जब SOAP संस्करण 1.2 उपयोग किया जाता है, तब SOAP हेडर प्राप्तकर्ता का URI प्राप्त करता है। |
| [set_Actor](./set_actor/)(String) | जब SOAP संस्करण 1.1 उपयोग किया जाता है, तब SOAP हेडर प्राप्तकर्ता का URI सेट करता है। |
| [set_DidUnderstand](./set_didunderstand/)(bool) | एक मान सेट करता है जो दर्शाता है कि SOAP हेडर सही ढंग से प्रोसेस किया गया है या नहीं। |
| [set_EncodedMustUnderstand](./set_encodedmustunderstand/)(String) | जब SOAP संस्करण 1.1 उपयोग किया जाता है, तब 'mustUnderstand' एट्रिब्यूट का मान सेट करता है। |
| [set_EncodedMustUnderstand12](./set_encodedmustunderstand12/)(String) | जब SOAP संस्करण 1.2 उपयोग किया जाता है, तब 'mustUnderstand' एट्रिब्यूट का मान सेट करता है। |
| [set_EncodedRelay](./set_encodedrelay/)(String) | 'relay' एट्रिब्यूट मान का स्ट्रिंग प्रतिनिधित्व सेट करता है। |
| [set_MustUnderstand](./set_mustunderstand/)(bool) | एक मान सेट करता है जो दर्शाता है कि SOAP हेडर को समझा जाना आवश्यक है या नहीं। |
| [set_Relay](./set_relay/)(bool) | 'relay' एट्रिब्यूट का मान सेट करता है। |
| [set_Role](./set_role/)(String) | जब SOAP संस्करण 1.2 उपयोग किया जाता है, तब SOAP हेडर प्राप्तकर्ता का URI सेट करता है। |
| [SoapHeader](./soapheader/)(System::SharedPtr\<Xml::XmlElement\>) | एक नया उदाहरण बनाता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
