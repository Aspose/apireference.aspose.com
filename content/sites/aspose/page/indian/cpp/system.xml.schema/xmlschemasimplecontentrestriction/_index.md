---
title: "System::Xml::Schema::XmlSchemaSimpleContentRestriction क्लास"
linktitle: "XmlSchemaSimpleContentRestriction"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaSimpleContentRestriction क्लास। XML Schema से सरल सामग्री के लिए प्रतिबंध तत्व को दर्शाता है जैसा कि World Wide Web Consortium (W3C) द्वारा निर्दिष्ट किया गया है। यह क्लास प्रतिबंध द्वारा सरल प्रकारों को व्युत्पन्न करने के लिए उपयोग की जा सकती है। ऐसी व्युत्पत्तियों का उपयोग तत्व के मानों की सीमा को विरासत में मिले सरल प्रकार में निर्दिष्ट मानों के उपसमुच्चय तक सीमित करने के लिए किया जा सकता है C++ में।"
type: docs
weight: 6100
url: /hi/cpp/system.xml.schema/xmlschemasimplecontentrestriction/
---
## XmlSchemaSimpleContentRestriction class


XML [Schema](../) से सरल सामग्री के लिए **restriction** तत्व को दर्शाता है जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट किया गया है। यह क्लास प्रतिबंध द्वारा सरल प्रकारों को व्युत्पन्न करने के लिए उपयोग की जा सकती है। ऐसी व्युत्पत्तियों का उपयोग तत्व के मानों की सीमा को विरासत में मिले सरल प्रकार में निर्दिष्ट मानों के उपसमुच्चय तक सीमित करने के लिए किया जा सकता है।

```cpp
class XmlSchemaSimpleContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | एक [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) लौटाता है जिसका उपयोग विशेषता मान के लिए किया जाएगा। |
| [get_Attributes](./get_attributes/)() | सरल प्रकार के लिए [XmlSchemaAttribute](../xmlschemaattribute/) और [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) विशेषताओं का संग्रह लौटाता है। |
| [get_BaseType](./get_basetype/)() | सरल प्रकार के आधार मान को लौटाता है। |
| [get_BaseTypeName](./get_basetypename/)() | उस अंतर्निहित डेटा प्रकार या सरल प्रकार का नाम लौटाता है जिससे यह प्रकार व्युत्पन्न हुआ है। |
| [get_Facets](./get_facets/)() | एक [Xml](../../system.xml/)[Schema](../) फ़ैसेट लौटाता है। |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | एक [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) सेट करता है जिसे विशेषता मान के लिए उपयोग किया जाएगा। |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | सरल प्रकार के आधार मान को सेट करता है। |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | उस अंतर्निहित डेटा प्रकार या सरल प्रकार का नाम सेट करता है जिससे यह प्रकार व्युत्पन्न हुआ है। |
| [XmlSchemaSimpleContentRestriction](./xmlschemasimplecontentrestriction/)() | एक नया उदाहरण प्रारंभ करता है [XmlSchemaSimpleContentRestriction](./) क्लास का। |
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
