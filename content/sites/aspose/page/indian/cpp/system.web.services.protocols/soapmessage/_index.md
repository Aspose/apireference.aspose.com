---
title: "System::Web::Services::Protocols::SoapMessage क्लास"
linktitle: "SoapMessage"
second_title: "Aspose.Page C++ के लिए"
description: "System::Web::Services::Protocols::SoapMessage क्लास। SOAP संदेश का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1000
url: /hi/cpp/system.web.services.protocols/soapmessage/
---
## SoapMessage class


SOAP संदेश का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class SoapMessage : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CollectHeaders](./collectheaders/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, SoapHeaderDirection) | SOAP हेडर्स के आंतरिक संग्रह को सेट करता है। |
| [FindHeader](./findheader/)(System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, const TypeInfo\&) | निर्दिष्ट हेडर प्रकार द्वारा हेडर मैपिंग खोजें। |
| virtual [get_Action](./get_action/)() | 'SOAPAction' एट्रिब्यूट का मान लौटाता है। |
| [get_ContentEncoding](./get_contentencoding/)() | 'Content-Encoding' हेडर का मान प्राप्त करता है। |
| [get_ContentType](./get_contenttype/)() | 'Content-Type' हेडर का मान प्राप्त करता है। |
| [get_Exception](./get_exception/)() | XML [Web](../../system.web/) सेवा विधि द्वारा उत्पन्न अपवाद प्राप्त करता है। |
| [get_Headers](./get_headers/)() | SOAP हेडर का संग्रह लौटाता है। |
| [get_InParameters](./get_inparameters/)() | XML [Web](../../system.web/) सेवा विधि में पास किए गए पैरामीटर प्राप्त करता है। |
| [get_IsSoap12](./get_issoap12/)() | यह दर्शाने वाला मान लौटाता है कि क्या SOAP संस्करण 1.2 उपयोग किया गया है। |
| [get_OutParameters](./get_outparameters/)() | XML [Web](../../system.web/) सेवा विधि में पास किए गए आउटपुट पैरामीटर प्राप्त करता है। |
| virtual [get_SoapVersion](./get_soapversion/)() | उपयोग किए गए SOAP संस्करण को लौटाता है। |
| [get_Stage](./get_stage/)() | एक SOAP संदेश की प्रसंस्करण अवस्था प्राप्त करता है। |
| [get_Stream](./get_stream/)() | SOAP संदेश डेटा को सम्मिलित करने वाले स्ट्रीम को प्राप्त करता है। |
| virtual [get_Url](./get_url/)() | XML [Web](../../system.web/) सेवा URL लौटाता है। |
| [GetInParameterValue](./getinparametervalue/)(int32_t) | निर्दिष्ट अनुक्रमणिका पर इनपुट पैरामीटर मान प्राप्त करता है। |
| [GetOutParameterValue](./getoutparametervalue/)(int32_t) | निर्दिष्ट अनुक्रमणिका पर आउटपुट पैरामीटर मान प्राप्त करता है। |
| [GetReturnValue](./getreturnvalue/)() | XML [Web](../../system.web/) सेवा विधि का रिटर्न मान प्राप्त करता है। |
| [set_ContentEncoding](./set_contentencoding/)(String) | 'Content-Encoding' हेडर का मान सेट करता है। |
| [set_ContentType](./set_contenttype/)(String) | 'Content-Type' हेडर का मान सेट करता है। |
| [set_InParameters](./set_inparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | XML [Web](../../system.web/) सेवा विधि में पास किए गए पैरामीटर सेट करता है। |
| [set_InternalStream](./set_internalstream/)(System::SharedPtr\<System::IO::Stream\>) | SOAP संदेश डेटा को सम्मिलित करने वाले स्ट्रीम को सेट करता है। |
| [set_OutParameters](./set_outparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | XML [Web](../../system.web/) सेवा विधि में पास किए गए आउटपुट पैरामीटर सेट करता है। |
| [SetException](./setexception/)(SoapException) | XML [Web](../../system.web/) सेवा विधि द्वारा उत्पन्न अपवाद सेट करता है। |
| [SetHeaders](./setheaders/)(System::SharedPtr\<SoapHeaderCollection\>) | SOAP हेडर का संग्रह सेट करता है। |
| [SetStage](./setstage/)(SoapMessageStage) | SOAP संदेश की प्रसंस्करण अवस्था सेट करता है। |
| [SetStream](./setstream/)(System::SharedPtr\<System::IO::Stream\>) | SOAP संदेश डेटा को सम्मिलित करने वाले स्ट्रीम को सेट करता है। |
| [SoapMessage](./soapmessage/)() | एक नया उदाहरण बनाता है। |
| [UpdateHeaderValues](./updateheadervalues/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>) | SOAP हेडर के आंतरिक संग्रह को अपडेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
