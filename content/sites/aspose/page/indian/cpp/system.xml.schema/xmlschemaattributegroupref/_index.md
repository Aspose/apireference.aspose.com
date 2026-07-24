---
title: "System::Xml::Schema::XmlSchemaAttributeGroupRef क्लास"
linktitle: "XmlSchemaAttributeGroupRef"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaAttributeGroupRef क्लास। XML Schema से ref विशेषता के साथ attributeGroup तत्व का प्रतिनिधित्व करता है जैसा कि निर्दिष्ट है। AttributesGroupRef एक attributeGroup के लिए संदर्भ है, name प्रॉपर्टी में C++ में संदर्भित attribute group शामिल है।"
type: docs
weight: 1300
url: /hi/cpp/system.xml.schema/xmlschemaattributegroupref/
---
## XmlSchemaAttributeGroupRef class


XML [Schema](../) से **ref** विशेषता के साथ **attributeGroup** तत्व का प्रतिनिधित्व करता है जैसा कि [World Wide Web Consortium (W3C)](https://go.microsoft.com/fwlink/?LinkId=49454) द्वारा निर्दिष्ट है। AttributesGroupRef एक attributeGroup के लिए संदर्भ है, name प्रॉपर्टी में संदर्भित attribute group शामिल है।

```cpp
class XmlSchemaAttributeGroupRef : public System::Xml::Schema::XmlSchemaAnnotated
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_RefName](./get_refname/)() | संदर्भित **attributeGroup** तत्व का नाम लौटाता है। |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | संदर्भित **attributeGroup** तत्व का नाम सेट करता है। |
| [XmlSchemaAttributeGroupRef](./xmlschemaattributegroupref/)() | [XmlSchemaAttributeGroupRef](./) क्लास का नया उदाहरण प्रारंभ करता है। |
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
