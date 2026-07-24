---
title: "System::Xml::Schema::XmlSchemaNotation क्लास"
linktitle: "XmlSchemaNotation"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaNotation क्लास. XML स्कीमा से नोटेशन तत्व का प्रतिनिधित्व करता है जैसा कि वर्ल्ड वाइड वेब कंसोर्टियम (W3C) द्वारा निर्दिष्ट किया गया है। एक XML स्कीमा नोटेशन घोषणा XML 1.0 NOTATION घोषणाओं का पुनर्निर्माण है। नोटेशनों का उद्देश्य C++ में XML दस्तावेज़ के भीतर गैर-XML डेटा के स्वरूप का वर्णन करना है।"
type: docs
weight: 4800
url: /hi/cpp/system.xml.schema/xmlschemanotation/
---
## XmlSchemaNotation class


XML [Schema](../) से **notation** तत्व का प्रतिनिधित्व करता है जैसा कि वर्ल्ड वाइड [Web](../../system.web/) कंसोर्टियम (W3C) द्वारा निर्दिष्ट किया गया है। एक XML [Schema](../)**notation** घोषणा **XML** 1.0 NOTATION घोषणाओं का पुनर्निर्माण है। नोटेशनों का उद्देश्य XML दस्तावेज़ के भीतर गैर-XML डेटा के स्वरूप का वर्णन करना है।

```cpp
class XmlSchemaNotation : public System::Xml::Schema::XmlSchemaAnnotated
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Name](./get_name/)() | नोटेशन का नाम लौटाता है। |
| [get_Public](./get_public/)() | **public** पहचानकर्ता लौटाता है। |
| [get_System](./get_system/)() | **system** पहचानकर्ता लौटाता है। |
| [set_Name](./set_name/)(const String\&) | नोटेशन का नाम सेट करता है। |
| [set_Public](./set_public/)(const String\&) | **public** पहचानकर्ता सेट करता है। |
| [set_System](./set_system/)(const String\&) | **system** पहचानकर्ता सेट करता है। |
| [XmlSchemaNotation](./xmlschemanotation/)() | नए [XmlSchemaNotation](./) क्लास का एक नया उदाहरण प्रारंभ करता है। |
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
