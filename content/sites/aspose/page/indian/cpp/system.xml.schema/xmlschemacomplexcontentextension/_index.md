---
title: "System::Xml::Schema::XmlSchemaComplexContentExtension क्लास"
linktitle: "XmlSchemaComplexContentExtension"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaComplexContentExtension क्लास। XML Schema से एक्सटेंशन तत्व को World Wide Web Consortium (W3C) द्वारा निर्दिष्ट अनुसार दर्शाता है। यह क्लास एक्सटेंशन द्वारा प्राप्त जटिल कंटेंट मॉडल वाले जटिल प्रकारों के लिए है। यह जटिल प्रकार को C++ में एट्रिब्यूट या तत्व जोड़कर विस्तारित करता है।"
type: docs
weight: 1900
url: /hi/cpp/system.xml.schema/xmlschemacomplexcontentextension/
---
## XmlSchemaComplexContentExtension class


XML [Schema](../) से **extension** तत्व को World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट अनुसार दर्शाता है। यह क्लास एक्सटेंशन द्वारा प्राप्त जटिल कंटेंट मॉडल वाले जटिल प्रकारों के लिए है। यह जटिल प्रकार को एट्रिब्यूट या तत्व जोड़कर विस्तारित करता है।

```cpp
class XmlSchemaComplexContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | जटिल सामग्री मॉडल का [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) घटक लौटाता है। |
| [get_Attributes](./get_attributes/)() | जटिल कंटेंट के लिए एट्रिब्यूट्स का संग्रह लौटाता है। इसमें [XmlSchemaAttribute](../xmlschemaattribute/) और [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) तत्व शामिल हैं। |
| [get_BaseTypeName](./get_basetypename/)() | उस जटिल प्रकार का नाम लौटाता है जिससे यह प्रकार एक्सटेंशन द्वारा व्युत्पन्न हुआ है। |
| [get_Particle](./get_particle/)() | इनमें से एक लौटाता है: [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), या [XmlSchemaSequence](../xmlschemasequence/) क्लास। |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | जटिल सामग्री मॉडल का [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) घटक सेट करता है। |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | उस जटिल प्रकार का नाम सेट करता है जिससे यह प्रकार एक्सटेंशन द्वारा व्युत्पन्न हुआ है। |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | इनमें से एक सेट करता है: [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), या [XmlSchemaSequence](../xmlschemasequence/) क्लास। |
| [XmlSchemaComplexContentExtension](./xmlschemacomplexcontentextension/)() | [XmlSchemaComplexContentExtension](./) क्लास का नया उदाहरण आरंभ करता है। |
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
