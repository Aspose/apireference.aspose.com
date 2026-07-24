---
title: "System::Xml::Schema::XmlSchemaGroup क्लास"
linktitle: "XmlSchemaGroup"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaGroup क्लास। XML Schema से समूह (group) तत्व को दर्शाता है जैसा कि World Wide Web Consortium (W3C) द्वारा निर्दिष्ट है। यह क्लास स्कीमा स्तर पर समूहों को परिभाषित करती है जो जटिल प्रकारों से संदर्भित होते हैं। यह तत्व घोषणाओं के एक सेट को समूहित करती है ताकि उन्हें C++ में जटिल प्रकार परिभाषाओं में समूह के रूप में सम्मिलित किया जा सके।"
type: docs
weight: 3100
url: /hi/cpp/system.xml.schema/xmlschemagroup/
---
## XmlSchemaGroup class


XML [Schema](../) से **group** तत्व को दर्शाता है जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट है। यह क्लास जटिल प्रकारों से संदर्भित **schema** स्तर पर समूहों को परिभाषित करती है। यह तत्व घोषणाओं के एक सेट को समूहित करती है ताकि उन्हें जटिल प्रकार परिभाषाओं में समूह के रूप में सम्मिलित किया जा सके।

```cpp
class XmlSchemaGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Name](./get_name/)() | स्कीमा समूह का नाम लौटाता है। |
| [get_Particle](./get_particle/)() | इनमें से एक लौटाता है: [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), या [XmlSchemaSequence](../xmlschemasequence/) क्लास। |
| [get_QualifiedName](./get_qualifiedname/)() | स्कीमा समूह का योग्य (qualified) नाम लौटाता है। |
| [set_Name](./set_name/)(const String\&) | स्कीमा समूह का नाम सेट करता है। |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaGroupBase\>\&) | इनमें से एक सेट करता है: [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), या [XmlSchemaSequence](../xmlschemasequence/) क्लास। |
| [XmlSchemaGroup](./xmlschemagroup/)() | एक नया उदाहरण प्रारंभ करता है [XmlSchemaGroup](./) क्लास का। |
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
