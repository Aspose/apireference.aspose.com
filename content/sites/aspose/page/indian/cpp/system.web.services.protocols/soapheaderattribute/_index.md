---
title: "System::Web::Services::Protocols::SoapHeaderAttribute क्लास"
linktitle: "SoapHeaderAttribute"
second_title: "Aspose.Page C++ के लिए"
description: "System::Web::Services::Protocols::SoapHeaderAttribute क्लास। वह SOAP हेडर निर्दिष्ट करता है जिसे XML Web सेवा मेथड या XML Web सेवा क्लाइंट प्रोसेस कर सकता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 700
url: /hi/cpp/system.web.services.protocols/soapheaderattribute/
---
## SoapHeaderAttribute class


XML [Web](../../system.web/) सेवा मेथड या XML [Web](../../system.web/) सेवा क्लाइंट द्वारा प्रोसेस किया जा सकने वाला SOAP हेडर निर्दिष्ट करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class SoapHeaderAttribute : public System::Attribute
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Direction](./get_direction/)() | RTTI जानकारी। |
| [get_MemberName](./get_membername/)() | XML SOAP सेवा का वह सदस्य वेरिएबल नाम प्राप्त करता है जिसका उपयोग SOAP हेडर सामग्री प्राप्त करने के लिए किया जाता है। |
| [get_Required](./get_required/)() | यह मान प्राप्त करता है जो दर्शाता है कि क्या SOAP हेडर को प्राप्तकर्ता XML [Web](../../system.web/) सेवा या XML [Web](../../system.web/) सेवा क्लाइंट द्वारा समझा और प्रोसेस किया जाना चाहिए। |
| [set_Direction](./set_direction/)(SoapHeaderDirection) | SOAP हेडर दिशा सेट करता है। |
| [set_MemberName](./set_membername/)(String) | XML SOAP सेवा का वह सदस्य वेरिएबल नाम सेट करता है जिसका उपयोग SOAP हेडर सामग्री प्राप्त करने के लिए किया जाता है। |
| [set_Required](./set_required/)(bool) | यह मान सेट करता है जो दर्शाता है कि क्या SOAP हेडर को प्राप्तकर्ता XML [Web](../../system.web/) सेवा या XML [Web](../../system.web/) सेवा क्लाइंट द्वारा समझा और प्रोसेस किया जाना चाहिए। |
| [SoapHeaderAttribute](./soapheaderattribute/)(String) | एक नया उदाहरण बनाता है। |
## संबंधित देखें

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
