---
title: "System::Xml::Schema::XmlSchemaObject class"
linktitle: "XmlSchemaObject"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaObject class. Xml schema ऑब्जेक्ट मॉडल पदानुक्रम के लिए मूल क्लास को दर्शाता है और C++ में XmlSchema क्लास जैसी कक्षाओं के लिए बेस क्लास के रूप में कार्य करता है।"
type: docs
weight: 5000
url: /hi/cpp/system.xml.schema/xmlschemaobject/
---
## XmlSchemaObject class


[Xml](../../system.xml/) स्कीमा ऑब्जेक्ट मॉडल पदानुक्रम के लिए मूल क्लास को दर्शाता है और [XmlSchema](../xmlschema/) क्लास जैसी कक्षाओं के लिए बेस क्लास के रूप में कार्य करता है।

```cpp
class XmlSchemaObject : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_LineNumber](./get_linenumber/)() | फ़ाइल में उस पंक्ति संख्या को लौटाता है जिससे **schema** तत्व संबंधित है। |
| [get_LinePosition](./get_lineposition/)() | फ़ाइल में उस पंक्ति स्थिति को लौटाता है जिससे **schema** तत्व संबंधित है। |
| [get_Namespaces](./get_namespaces/)() | इस स्कीमा ऑब्जेक्ट के साथ उपयोग करने के लिए XmlSerializerNamespaces लौटाता है। |
| [get_Parent](./get_parent/)() | इस [XmlSchemaObject](./) का पैरेंट लौटाता है। |
| [get_SourceUri](./get_sourceuri/)() | स्कीमा को लोड करने वाली फ़ाइल का स्रोत स्थान लौटाता है। |
| [set_LineNumber](./set_linenumber/)(int32_t) | फ़ाइल में उस पंक्ति संख्या को सेट करता है जिससे **schema** तत्व संबंधित है। |
| [set_LinePosition](./set_lineposition/)(int32_t) | फ़ाइल में उस पंक्ति स्थिति को सेट करता है जिससे **schema** तत्व संबंधित है। |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | इस स्कीमा ऑब्जेक्ट के साथ उपयोग करने के लिए XmlSerializerNamespaces सेट करता है। |
| [set_Parent](./set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | इस [XmlSchemaObject](./) का पैरेंट सेट करता है। |
| [set_SourceUri](./set_sourceuri/)(const String\&) | स्कीमा लोड करने वाली फ़ाइल के स्रोत स्थान को सेट करता है। |
| [XmlSchemaObject](./xmlschemaobject/)() | [XmlSchemaObject](./) क्लास का नया उदाहरण प्रारंभ करता है। |
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
