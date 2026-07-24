---
title: "System::Xml::Schema::XmlSchemaAppInfo class"
linktitle: "XmlSchemaAppInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaAppInfo class. C++ में World Wide Web Consortium (W3C) appinfo तत्व का प्रतिनिधित्व करता है।"
type: docs
weight: 1000
url: /hi/cpp/system.xml.schema/xmlschemaappinfo/
---
## XmlSchemaAppInfo class


World Wide [Web](../../system.web/) Consortium (W3C) **appinfo** तत्व का प्रतिनिधित्व करता है।

```cpp
class XmlSchemaAppInfo : public System::Xml::Schema::XmlSchemaObject
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Markup](./get_markup/)() | एक एरे लौटाता है जिसमें [XmlNode](../../system.xml/xmlnode/) वस्तुएँ होती हैं जो **appinfo** चाइल्ड नोड्स का प्रतिनिधित्व करती हैं। |
| [get_Source](./get_source/)() | एप्लिकेशन जानकारी का स्रोत लौटाता है। |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | एक एरे सेट करता है जिसमें [XmlNode](../../system.xml/xmlnode/) वस्तुएँ होती हैं जो **appinfo** चाइल्ड नोड्स का प्रतिनिधित्व करती हैं। |
| [set_Source](./set_source/)(const String\&) | एप्लिकेशन जानकारी का स्रोत सेट करता है। |
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
