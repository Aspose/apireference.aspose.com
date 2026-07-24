---
title: "System::Xml::XmlResolver क्लास"
linktitle: "XmlResolver"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlResolver क्लास। C++ में Uniform Resource Identifier (URI) द्वारा नामित बाहरी XML संसाधनों को हल करता है।"
type: docs
weight: 3500
url: /hi/cpp/system.xml/xmlresolver/
---
## XmlResolver class


Uniform Resource Identifier (URI) द्वारा नामित बाहरी XML संसाधनों को हल करता है।

```cpp
class XmlResolver : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) | जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो एक URI को उस वस्तु से मैप करता है जिसमें वास्तविक संसाधन होता है। |
| virtual [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) | जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो बेस और रिलेटिव URI से पूर्ण URI को हल करता है। |
| virtual [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) | जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो वेब अनुरोधों को प्रमाणित करने के लिए उपयोग किए जाने वाले क्रेडेंशियल्स को सेट करता है। |
| virtual [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) | रिज़ॉल्वर को स्ट्रीम के अलावा अन्य प्रकार लौटाने में सक्षम बनाता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
