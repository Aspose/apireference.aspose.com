---
title: "System::Xml::Schema::XmlSchemaAttribute क्लास"
linktitle: "XmlSchemaAttribute"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaAttribute क्लास। XML Schema से attribute तत्व को दर्शाता है जैसा कि World Wide Web Consortium (W3C) द्वारा निर्दिष्ट है। Attributes अन्य दस्तावेज़ तत्वों के लिए अतिरिक्त जानकारी प्रदान करते हैं। attribute टैग दस्तावेज़ के तत्व के टैग के बीच नेस्टेड होता है। XML दस्तावेज़ attributes को एक तत्व के उद्घाटन टैग में नामित आइटम के रूप में C++ में प्रदर्शित करता है।"
type: docs
weight: 1100
url: /hi/cpp/system.xml.schema/xmlschemaattribute/
---
## XmlSchemaAttribute class


XML [Schema](../) से **attribute** तत्व को दर्शाता है जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट है। Attributes अन्य दस्तावेज़ तत्वों के लिए अतिरिक्त जानकारी प्रदान करते हैं। attribute टैग दस्तावेज़ के तत्व के टैग के बीच नेस्टेड होता है। XML दस्तावेज़ attributes को एक तत्व के उद्घाटन टैग में नामित आइटम के रूप में प्रदर्शित करता है।

```cpp
class XmlSchemaAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_AttributeSchemaType](./get_attributeschematype/)() | एक [XmlSchemaSimpleType](../xmlschemasimpletype/) ऑब्जेक्ट लौटाता है जो attribute के प्रकार को दर्शाता है, जो attribute के [XmlSchemaAttribute::get_SchemaType](./get_schematype/) या [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) मान पर आधारित है। |
| [get_AttributeType](./get_attributetype/)() | ऑब्जेक्ट लौटाता है जो attribute के [XmlSchemaAttribute::get_SchemaType](./get_schematype/) या [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) मान पर आधारित है, जो **AttributeType** मान की पोस्ट-कम्पाइल व्याख्या रखता है। |
| [get_DefaultValue](./get_defaultvalue/)() | attribute के लिए डिफ़ॉल्ट मान लौटाता है। |
| [get_FixedValue](./get_fixedvalue/)() | attribute के लिए निश्चित (fixed) मान लौटाता है। |
| [get_Form](./get_form/)() | attribute के लिए फ़ॉर्म लौटाता है। |
| [get_Name](./get_name/)() | attribute का नाम लौटाता है। |
| [get_QualifiedName](./get_qualifiedname/)() | attribute का योग्य (qualified) नाम लौटाता है। |
| [get_RefName](./get_refname/)() | इस schema (या निर्दिष्ट नेमस्पेस द्वारा संकेतित किसी अन्य schema) में घोषित attribute का नाम लौटाता है। |
| [get_SchemaType](./get_schematype/)() | एट्रिब्यूट प्रकार को एक सरल प्रकार में लौटाता है। |
| [get_SchemaTypeName](./get_schematypename/)() | इस स्कीमा में परिभाषित सरल प्रकार का नाम लौटाता है (या निर्दिष्ट नेमस्पेस द्वारा संकेतित अन्य स्कीमा)। |
| [get_Use](./get_use/)() | एट्रिब्यूट के उपयोग के बारे में जानकारी लौटाता है। |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | एट्रिब्यूट के लिए डिफ़ॉल्ट मान सेट करता है। |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | एट्रिब्यूट के लिए स्थिर मान सेट करता है। |
| [set_Form](./set_form/)(XmlSchemaForm) | एट्रिब्यूट के फ़ॉर्म को सेट करता है। |
| [set_Name](./set_name/)(const String\&) | एट्रिब्यूट का नाम सेट करता है। |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | इस स्कीमा में घोषित एट्रिब्यूट (या निर्दिष्ट नेमस्पेस द्वारा संकेतित अन्य स्कीमा) का नाम सेट करता है। |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | एट्रिब्यूट प्रकार को एक सरल प्रकार में सेट करता है। |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | इस स्कीमा में परिभाषित सरल प्रकार (या निर्दिष्ट नेमस्पेस द्वारा संकेतित अन्य स्कीमा) का नाम सेट करता है। |
| [set_Use](./set_use/)(XmlSchemaUse) | एट्रिब्यूट के उपयोग के बारे में जानकारी सेट करता है। |
| [XmlSchemaAttribute](./xmlschemaattribute/)() | नए [XmlSchemaAttribute](./) क्लास का एक नया इंस्टेंस इनिशियलाइज़ करता है। |
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
