---
title: "System::Xml::Resolvers::XmlPreloadedResolver क्लास"
linktitle: "XmlPreloadedResolver"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Resolvers::XmlPreloadedResolver क्लास. C++ में DTDs या XML स्ट्रीम्स के साथ कैश को पूर्व-भरण करने के लिए उपयोग की जाने वाली क्लास का प्रतिनिधित्व करता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml.resolvers/xmlpreloadedresolver/
---
## XmlPreloadedResolver class


एक क्लास का प्रतिनिधित्व करता है जिसका उपयोग DTDs या XML स्ट्रीम्स के साथ कैश को पूर्व-भरण करने के लिए किया जाता है।

```cpp
class XmlPreloadedResolver : public System::Xml::XmlResolver
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&) | एक बाइट एरे को [XmlPreloadedResolver](./) स्टोर में जोड़ता है और इसे एक URI से मैप करता है। यदि स्टोर में पहले से ही समान URI के लिए एक मैपिंग मौजूद है, तो मौजूदा मैपिंग को ओवरराइड किया जाता है। |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | एक बाइट एरे को [XmlPreloadedResolver](./) स्टोर में जोड़ता है और इसे एक URI से मैप करता है। यदि स्टोर में पहले से ही समान URI के लिए एक मैपिंग मौजूद है, तो मौजूदा मैपिंग को ओवरराइड किया जाता है। |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const SharedPtr\<IO::Stream\>\&) | एक Stream को [XmlPreloadedResolver](./) स्टोर में जोड़ता है और इसे एक URI से मैप करता है। यदि स्टोर में पहले से ही समान URI के लिए एक मैपिंग मौजूद है, तो मौजूदा मैपिंग को ओवरराइड किया जाता है। |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const String\&) | पूर्व-लोडेड डेटा वाली एक स्ट्रिंग को [XmlPreloadedResolver](./) स्टोर में जोड़ता है और इसे एक URI से मैप करता है। यदि स्टोर में पहले से ही समान URI के लिए एक मैपिंग मौजूद है, तो मौजूदा मैपिंग को ओवरराइड किया जाता है। |
| [get_PreloadedUris](./get_preloadeduris/)() | पूर्व-लोडेड URIs का एक संग्रह लौटाता है। |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | एक URI को उस ऑब्जेक्ट से मैप करता है जिसमें वास्तविक संसाधन होता है। |
| [Remove](./remove/)(const SharedPtr\<Uri\>\&) | URI से संबंधित डेटा को [XmlPreloadedResolver](./) से हटाता है। |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | बेस और रिलेटिव URI से पूर्ण (एब्सोल्यूट) URI को हल करता है। |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | उन क्रेडेंशियल्स को सेट करता है जो आधारभूत [Net::WebRequest](../../system.net/webrequest/) को प्रमाणित करने के लिए उपयोग किए जाते हैं। |
| [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) override | निर्धारित करता है कि रिजॉल्वर केवल Stream के अलावा अन्य Types को समर्थन देता है या नहीं। |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)() | एक नया उदाहरण प्रारंभ करता है [XmlPreloadedResolver](./) क्लास का। |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(XmlKnownDtds) | निर्दिष्ट पूर्व-लोडेड प्रसिद्ध DTDs के साथ [XmlPreloadedResolver](./) क्लास का एक नया उदाहरण प्रारंभ करता है। |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&) | निर्दिष्ट फॉलबैक रिजॉल्वर के साथ [XmlPreloadedResolver](./) क्लास का एक नया उदाहरण प्रारंभ करता है। |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) | निर्दिष्ट फॉलबैक रिजॉल्वर और पूर्व-लोडेड प्रसिद्ध DTDs के साथ [XmlPreloadedResolver](./) क्लास का एक नया उदाहरण प्रारंभ करता है। |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) | निर्दिष्ट फॉलबैक रिजॉल्वर, पूर्व-लोडेड प्रसिद्ध DTDs, और URI समानता तुलना करने वाले के साथ [XmlPreloadedResolver](./) क्लास का एक नया उदाहरण प्रारंभ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlResolver](../../system.xml/xmlresolver/)
* Namespace [System::Xml::Resolvers](../)
* Library [Aspose.Page for C++](../../)
