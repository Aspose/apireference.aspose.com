---
title: "System::Xml::XmlSecureResolver क्लास"
linktitle: "XmlSecureResolver"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlSecureResolver क्लास। C++ में XmlResolver ऑब्जेक्ट को रैप करके और अंतर्निहित XmlResolver की पहुँच वाले संसाधनों को प्रतिबंधित करके XmlResolver के एक अन्य कार्यान्वयन को सुरक्षित करने में मदद करता है।"
type: docs
weight: 3600
url: /hi/cpp/system.xml/xmlsecureresolver/
---
## XmlSecureResolver class


एक अन्य कार्यान्वयन को सुरक्षित करने में मदद करता है [XmlResolver](../xmlresolver/) का, [XmlResolver](../xmlresolver/) ऑब्जेक्ट को रैप करके और अंतर्निहित [XmlResolver](../xmlresolver/) की पहुँच वाले संसाधनों को प्रतिबंधित करके।

```cpp
class XmlSecureResolver : public System::Xml::XmlResolver
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | एक URI को उस ऑब्जेक्ट से मैप करता है जिसमें वास्तविक संसाधन होता है। |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | अंतर्निहित [XmlResolver](../xmlresolver/) पर **ResolveUri** को कॉल करके बेस और रिलेटिव URI से पूर्ण URI को हल करता है। |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | वेब अनुरोधों को प्रमाणित करने के लिए उपयोग किए जाने वाले क्रेडेंशियल्स सेट करता है। |
| [XmlSecureResolver](./xmlsecureresolver/)(const SharedPtr\<XmlResolver\>\&, const String\&) | प्रदान किए गए [XmlResolver](../xmlresolver/) और URL के साथ [XmlSecureResolver](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlResolver](../xmlresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
