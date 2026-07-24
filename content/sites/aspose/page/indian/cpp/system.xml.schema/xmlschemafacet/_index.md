---
title: "System::Xml::Schema::XmlSchemaFacet क्लास"
linktitle: "XmlSchemaFacet"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaFacet क्लास। सभी फ़ैसेट्स के लिए एक बेस क्लास जो C++ में प्रतिबंध द्वारा सरल प्रकारों को व्युत्पन्न करने पर उपयोग होते हैं।"
type: docs
weight: 2900
url: /hi/cpp/system.xml.schema/xmlschemafacet/
---
## XmlSchemaFacet class


सभी फ़ैसेट्स के लिए एक बेस क्लास जो तब उपयोग किए जाते हैं जब सरल प्रकार प्रतिबंध द्वारा व्युत्पन्न होते हैं।

```cpp
class XmlSchemaFacet : public System::Xml::Schema::XmlSchemaAnnotated
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [get_IsFixed](./get_isfixed/)() | वापस देता है जानकारी जो दर्शाती है कि यह फ़ैसेट स्थिर है। |
| [get_Value](./get_value/)() | फ़ैसेट के **value** एट्रिब्यूट को वापस देता है। |
| virtual [set_IsFixed](./set_isfixed/)(bool) | ऐसी जानकारी सेट करता है जो दर्शाती है कि यह फ़ैसेट स्थिर है। |
| [set_Value](./set_value/)(const String\&) | फ़ैसेट के **value** एट्रिब्यूट को सेट करता है। |
| [XmlSchemaFacet](./xmlschemafacet/)() | एक नया उदाहरण प्रारंभ करता है [XmlSchemaFacet](./) क्लास का। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
