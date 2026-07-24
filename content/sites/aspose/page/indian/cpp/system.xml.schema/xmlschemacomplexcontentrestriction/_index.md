---
title: "System::Xml::Schema::XmlSchemaComplexContentRestriction क्लास"
linktitle: "XmlSchemaComplexContentRestriction"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaComplexContentRestriction क्लास। XML Schema से प्रतिबंध तत्व को दर्शाता है जैसा कि World Wide Web Consortium (W3C) द्वारा निर्दिष्ट है। यह क्लास जटिल प्रकारों के लिए है जिनका जटिल सामग्री मॉडल प्रतिबंध द्वारा व्युत्पन्न होता है। यह जटिल प्रकार की सामग्री को विरासत में मिले जटिल प्रकार के उपसमुच्चय तक सीमित करता है C++ में।"
type: docs
weight: 2000
url: /hi/cpp/system.xml.schema/xmlschemacomplexcontentrestriction/
---
## XmlSchemaComplexContentRestriction class


XML [Schema](../) से **restriction** तत्व को दर्शाता है जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट है। यह क्लास जटिल प्रकारों के लिए है जिनका जटिल सामग्री मॉडल प्रतिबंध द्वारा व्युत्पन्न होता है। यह जटिल प्रकार की सामग्री को विरासत में मिले जटिल प्रकार के उपसमुच्चय तक सीमित करता है।

```cpp
class XmlSchemaComplexContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | जटिल सामग्री मॉडल का [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) घटक लौटाता है। |
| [get_Attributes](./get_attributes/)() | जटिल प्रकार के लिए गुणों का संग्रह लौटाता है। इसमें [XmlSchemaAttribute](../xmlschemaattribute/) और [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) तत्व शामिल हैं। |
| [get_BaseTypeName](./get_basetypename/)() | उस जटिल प्रकार का नाम लौटाता है जिससे यह प्रकार प्रतिबंध द्वारा व्युत्पन्न हुआ है। |
| [get_Particle](./get_particle/)() | इनमें से एक लौटाता है: [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), या [XmlSchemaSequence](../xmlschemasequence/) क्लास। |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | जटिल सामग्री मॉडल का [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) घटक सेट करता है। |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | उस जटिल प्रकार का नाम सेट करता है जिससे यह प्रकार प्रतिबंध द्वारा व्युत्पन्न हुआ है। |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | इनमें से एक सेट करता है: [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), या [XmlSchemaSequence](../xmlschemasequence/) क्लास। |
| [XmlSchemaComplexContentRestriction](./xmlschemacomplexcontentrestriction/)() | एक नया उदाहरण प्रारंभ करता है [XmlSchemaComplexContentRestriction](./) क्लास का। |
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
