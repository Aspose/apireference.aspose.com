---
title: "System::Xml::Schema::XmlSchemaParticle क्लास"
linktitle: "XmlSchemaParticle"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaParticle क्लास। यह सभी कण प्रकारों (जैसे XmlSchemaAny) के लिए बेस क्लास है, C++ में।"
type: docs
weight: 5400
url: /hi/cpp/system.xml.schema/xmlschemaparticle/
---
## XmlSchemaParticle class


यह सभी कण प्रकारों (जैसे [XmlSchemaAny](../xmlschemaany/)) के लिए बेस क्लास है।

```cpp
class XmlSchemaParticle : public System::Xml::Schema::XmlSchemaAnnotated
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_MaxOccurs](./get_maxoccurs/)() | कण के अधिकतम बार होने की संख्या लौटाता है। |
| [get_MaxOccursString](./get_maxoccursstring/)() | संख्या को स्ट्रिंग मान के रूप में लौटाता है। कण के अधिकतम बार होने की संख्या। |
| [get_MinOccurs](./get_minoccurs/)() | कण के न्यूनतम बार होने की संख्या लौटाता है। |
| [get_MinOccursString](./get_minoccursstring/)() | संख्या को स्ट्रिंग मान के रूप में लौटाता है। कण के न्यूनतम बार होने की संख्या। |
| [set_MaxOccurs](./set_maxoccurs/)(Decimal) | कण के अधिकतम बार होने की संख्या सेट करता है। |
| [set_MaxOccursString](./set_maxoccursstring/)(const String\&) | संख्या को स्ट्रिंग मान के रूप में सेट करता है। कण के अधिकतम बार होने की संख्या। |
| [set_MinOccurs](./set_minoccurs/)(Decimal) | कण के न्यूनतम बार होने की संख्या सेट करता है। |
| [set_MinOccursString](./set_minoccursstring/)(const String\&) | संख्या को स्ट्रिंग मान के रूप में सेट करता है। कण के न्यूनतम बार होने की संख्या। |
| [XmlSchemaParticle](./xmlschemaparticle/)() | [XmlSchemaParticle](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
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
