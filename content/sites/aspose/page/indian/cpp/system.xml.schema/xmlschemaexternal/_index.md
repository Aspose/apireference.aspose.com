---
title: "System::Xml::Schema::XmlSchemaExternal क्लास"
linktitle: "XmlSchemaExternal"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaExternal क्लास। C++ में शामिल स्कीमा के बारे में जानकारी प्रदान करती है।"
type: docs
weight: 2800
url: /hi/cpp/system.xml.schema/xmlschemaexternal/
---
## XmlSchemaExternal class


शामिल स्कीमा के बारे में जानकारी प्रदान करता है।

```cpp
class XmlSchemaExternal : public System::Xml::Schema::XmlSchemaObject
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Id](./get_id/)() | स्ट्रिंग आईडी को लौटाता है। |
| [get_Schema](./get_schema/)() | संदर्भित स्कीमा के लिए [XmlSchema](../xmlschema/) को लौटाता है। |
| [get_SchemaLocation](./get_schemalocation/)() | स्कीमा के Uniform Resource Identifier (URI) स्थान को लौटाता है, जो स्कीमा प्रोसेसर को बताता है कि स्कीमा भौतिक रूप से कहाँ स्थित है। |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | योग्य गुणों को लौटाता है, जो स्कीमा लक्ष्य नेमस्पेस से संबंधित नहीं होते। |
| [set_Id](./set_id/)(const String\&) | स्ट्रिंग आईडी सेट करता है। |
| [set_Schema](./set_schema/)(const SharedPtr\<XmlSchema\>\&) | संदर्भित स्कीमा के लिए [XmlSchema](../xmlschema/) सेट करता है। |
| [set_SchemaLocation](./set_schemalocation/)(const String\&) | स्कीमा के लिए यूनिफ़ॉर्म रिसोर्स आइडेंटिफ़ायर (URI) स्थान सेट करता है, जो स्कीमा प्रोसेसर को बताता है कि स्कीमा शारीरिक रूप से कहाँ स्थित है। |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | क्वालिफ़ाइड एट्रिब्यूट्स सेट करता है, जो स्कीमा टार्गेट नेमस्पेस से संबंधित नहीं हैं। |
| [XmlSchemaExternal](./xmlschemaexternal/)() | [XmlSchemaExternal](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
