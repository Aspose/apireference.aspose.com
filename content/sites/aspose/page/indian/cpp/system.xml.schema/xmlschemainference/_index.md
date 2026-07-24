---
title: "System::Xml::Schema::XmlSchemaInference क्लास"
linktitle: "XmlSchemaInference"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaInference क्लास। एक XML दस्तावेज़ से XML स्कीमा डिफिनिशन लैंग्वेज (XSD) स्कीमा का अनुमान लगाता है। XmlSchemaInference क्लास को C++ में विरासत में नहीं लिया जा सकता।"
type: docs
weight: 3700
url: /hi/cpp/system.xml.schema/xmlschemainference/
---
## XmlSchemaInference class


एक XML दस्तावेज़ से XML [Schema](../) डिफिनिशन लैंग्वेज (XSD) स्कीमा का अनुमान लगाता है। [XmlSchemaInference](./) क्लास को विरासत में नहीं लिया जा सकता।

```cpp
class XmlSchemaInference : public System::Object
```

## Enums

| एनम | विवरण |
| --- | --- |
| [InferenceOption](./inferenceoption/) | [XmlSchemaInference](./) क्लास द्वारा XML दस्तावेज़ में तत्वों और गुणों के लिए अनुमानित होने वाली आवृत्ति और प्रकार जानकारी को प्रभावित करता है। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Occurrence](./get_occurrence/)() | XML दस्तावेज़ से अनुमानित स्कीमा आवृत्ति घोषणाओं को प्रभावित करने वाले [XmlSchemaInference::InferenceOption](./inferenceoption/) मान को लौटाता है। |
| [get_TypeInference](./get_typeinference/)() | XML दस्तावेज़ से अनुमानित प्रकारों को प्रभावित करने वाले [XmlSchemaInference::InferenceOption](./inferenceoption/) मान को लौटाता है। |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&) | निर्दिष्ट [XmlReader](../../system.xml/xmlreader/) ऑब्जेक्ट में शामिल XML दस्तावेज़ से XML [Schema](../) डिफिनिशन लैंग्वेज (XSD) स्कीमा का अनुमान लगाता है। |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) | निर्दिष्ट [XmlReader](../../system.xml/xmlreader/) ऑब्जेक्ट में शामिल XML दस्तावेज़ से XML [Schema](../) डिफिनिशन लैंग्वेज (XSD) स्कीमा का अनुमान लगाता है, और समान लक्ष्य नेमस्पेस वाले निर्दिष्ट [XmlSchemaSet](../xmlschemaset/) ऑब्जेक्ट में मौजूद स्कीमा का उपयोग करके अनुमानित स्कीमा को परिष्कृत करता है। |
| [set_Occurrence](./set_occurrence/)(XmlSchemaInference::InferenceOption) | XML दस्तावेज़ से अनुमानित स्कीमा आवृत्ति घोषणाओं को प्रभावित करने वाले [XmlSchemaInference::InferenceOption](./inferenceoption/) मान को सेट करता है। |
| [set_TypeInference](./set_typeinference/)(XmlSchemaInference::InferenceOption) | XML दस्तावेज़ से अनुमानित प्रकारों को प्रभावित करने वाले [XmlSchemaInference::InferenceOption](./inferenceoption/) मान को सेट करता है। |
| [XmlSchemaInference](./xmlschemainference/)() | [XmlSchemaInference](./) क्लास की नई इंस्टेंस को इनिशियलाइज़ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
