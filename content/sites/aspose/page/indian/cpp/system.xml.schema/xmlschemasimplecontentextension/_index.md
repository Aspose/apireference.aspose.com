---
title: "System::Xml::Schema::XmlSchemaSimpleContentExtension क्लास"
linktitle: "XmlSchemaSimpleContentExtension"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaSimpleContentExtension क्लास। XML स्कीमा से सरल सामग्री के **extension** तत्व को दर्शाता है जैसा कि World Wide Web Consortium (W3C) द्वारा निर्दिष्ट किया गया है। इस क्लास का उपयोग विस्तार द्वारा सरल प्रकारों को व्युत्पन्न करने के लिए किया जा सकता है। ऐसे व्युत्पन्न तत्वों का उपयोग C++ में एट्रिब्यूट जोड़कर तत्व की सरल प्रकार सामग्री को विस्तारित करने के लिए किया जाता है।"
type: docs
weight: 6000
url: /hi/cpp/system.xml.schema/xmlschemasimplecontentextension/
---
## XmlSchemaSimpleContentExtension class


XML [Schema](../) से सरल सामग्री के **extension** तत्व को दर्शाता है जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट किया गया है। इस क्लास का उपयोग विस्तार द्वारा सरल प्रकारों को व्युत्पन्न करने के लिए किया जा सकता है। ऐसे व्युत्पन्न तत्वों का उपयोग एट्रिब्यूट जोड़कर तत्व की सरल प्रकार सामग्री को विस्तारित करने के लिए किया जाता है।

```cpp
class XmlSchemaSimpleContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | एट्रिब्यूट मान के लिए उपयोग किए जाने वाले [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) को लौटाता है। |
| [get_Attributes](./get_attributes/)() | [XmlSchemaAttribute](../xmlschemaattribute/) और [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) का संग्रह लौटाता है। |
| [get_BaseTypeName](./get_basetypename/)() | उस अंतर्निहित डेटा प्रकार या सरल प्रकार का नाम लौटाता है जिससे यह प्रकार विस्तारित किया गया है। |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | एट्रिब्यूट मान के लिए उपयोग किए जाने वाले [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) को सेट करता है। |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | उस अंतर्निहित डेटा प्रकार या सरल प्रकार का नाम सेट करता है जिससे यह प्रकार विस्तारित किया गया है। |
| [XmlSchemaSimpleContentExtension](./xmlschemasimplecontentextension/)() | [XmlSchemaSimpleContentExtension](./) क्लास का नया उदाहरण आरंभ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
