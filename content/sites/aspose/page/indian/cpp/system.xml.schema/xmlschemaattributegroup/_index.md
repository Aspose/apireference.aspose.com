---
title: "System::Xml::Schema::XmlSchemaAttributeGroup क्लास"
linktitle: "XmlSchemaAttributeGroup"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaAttributeGroup क्लास। XML Schema से attributeGroup तत्व का प्रतिनिधित्व करता है जैसा कि World Wide Web Consortium (W3C) द्वारा निर्दिष्ट है। AttributesGroups एक तंत्र प्रदान करता है जिससे attribute घोषणाओं के सेट को समूहित किया जा सके ताकि उन्हें C++ में जटिल प्रकार परिभाषाओं में समूह के रूप में सम्मिलित किया जा सके।"
type: docs
weight: 1200
url: /hi/cpp/system.xml.schema/xmlschemaattributegroup/
---
## XmlSchemaAttributeGroup class


XML [Schema](../) से **attributeGroup** तत्व को World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट अनुसार दर्शाता है। AttributesGroups एक तंत्र प्रदान करता है जिससे attribute घोषणाओं के सेट को समूहित किया जा सके और उन्हें जटिल प्रकार परिभाषाओं में समूह के रूप में सम्मिलित किया जा सके।

```cpp
class XmlSchemaAttributeGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | attribute समूह का [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) घटक लौटाता है। |
| [get_Attributes](./get_attributes/)() | attribute समूह के लिए attribute संग्रह लौटाता है। इसमें [XmlSchemaAttribute](../xmlschemaattribute/) और [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) तत्व शामिल हैं। |
| [get_Name](./get_name/)() | attribute समूह का नाम लौटाता है। |
| [get_QualifiedName](./get_qualifiedname/)() | attribute समूह का योग्य (qualified) नाम लौटाता है। |
| [get_RedefinedAttributeGroup](./get_redefinedattributegroup/)() | XML [Schema](../) से पुनःपरिभाषित attribute समूह गुण लौटाता है। |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | attribute समूह का [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) घटक सेट करता है। |
| [set_Name](./set_name/)(const String\&) | attribute समूह का नाम सेट करता है। |
| [XmlSchemaAttributeGroup](./xmlschemaattributegroup/)() | [XmlSchemaAttributeGroup](./) वर्ग का नया उदाहरण आरंभ करता है। |
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
