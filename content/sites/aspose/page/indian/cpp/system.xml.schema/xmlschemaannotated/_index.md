---
title: "System::Xml::Schema::XmlSchemaAnnotated वर्ग"
linktitle: "XmlSchemaAnnotated"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaAnnotated वर्ग। C++ में उन सभी तत्वों के लिए आधार वर्ग जो एनोटेशन तत्वों को समाहित कर सकते हैं।"
type: docs
weight: 600
url: /hi/cpp/system.xml.schema/xmlschemaannotated/
---
## XmlSchemaAnnotated class


किसी भी तत्व के लिए आधार वर्ग जो annotation तत्वों को समाहित कर सकता है।

```cpp
class XmlSchemaAnnotated : public System::Xml::Schema::XmlSchemaObject
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Annotation](./get_annotation/)() | **annotation** प्रॉपर्टी लौटाता है। |
| [get_Id](./get_id/)() | स्ट्रिंग आईडी को लौटाता है। |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | वर्तमान स्कीमा के लक्ष्य नेमस्पेस से संबंधित नहीं होने वाले योग्य गुणधर्मों को लौटाता है। |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | **annotation** प्रॉपर्टी सेट करता है। |
| [set_Id](./set_id/)(const String\&) | स्ट्रिंग आईडी सेट करता है। |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | वर्तमान स्कीमा के लक्ष्य नेमस्पेस से संबंधित नहीं होने वाले योग्य गुणधर्मों को सेट करता है। |
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
