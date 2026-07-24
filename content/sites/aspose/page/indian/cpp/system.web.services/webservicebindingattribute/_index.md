---
title: "System::Web::Services::WebServiceBindingAttribute क्लास"
linktitle: "WebServiceBindingAttribute"
second_title: "Aspose.Page C++ के लिए"
description: "System::Web::Services::WebServiceBindingAttribute क्लास। XML वेब सेवा की एक या अधिक विधियों को परिभाषित करने वाला बाइंडिंग घोषित करने के लिए उपयोग किया जाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या अभिकथन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 400
url: /hi/cpp/system.web.services/webservicebindingattribute/
---
## WebServiceBindingAttribute class


XML [Web](../../system.web/) सेवा की एक या अधिक विधियों को परिभाषित करने वाला बाइंडिंग घोषित करने के लिए उपयोग किया जाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या अभिकथन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class WebServiceBindingAttribute : public System::Attribute
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_ConformsTo](./get_conformsto/)() | WSI विनिर्देश प्राप्त करता है। |
| [get_EmitConformanceClaims](./get_emitconformanceclaims/)() | एक मान प्राप्त करता है जो दर्शाता है कि बाइंडिंग अनुरूपता दावे जारी करता है या नहीं। |
| [get_Location](./get_location/)() | RTTI जानकारी। |
| [get_Name](./get_name/)() | बाइंडिंग का नाम प्राप्त करता है। |
| [get_Namespace](./get_namespace/)() | बाइंडिंग से संबंधित नेमस्पेस प्राप्त करता है। |
| [set_ConformsTo](./set_conformsto/)(System::SharedPtr\<WsiProfiles\>) | WSI विनिर्देश सेट करता है। |
| [set_EmitConformanceClaims](./set_emitconformanceclaims/)(bool) | एक मान सेट करता है जो दर्शाता है कि बाइंडिंग अनुरूपता दावे जारी करता है या नहीं। |
| [set_Location](./set_location/)(String) | बाइंडिंग के परिभाषित स्थान को सेट करता है। |
| [set_Name](./set_name/)(String) | बाइंडिंग का नाम सेट करता है। |
| [set_Namespace](./set_namespace/)(String) | बाइंडिंग से संबंधित नेमस्पेस सेट करता है। |
| [WebServiceBindingAttribute](./webservicebindingattribute/)() | एक नया उदाहरण बनाता है। |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String) | एक नया उदाहरण बनाता है। |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String) | एक नया उदाहरण बनाता है। |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String, String) | एक नया उदाहरण बनाता है। |
## संबंधित देखें

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services](../)
* Library [Aspose.Page for C++](../../)
