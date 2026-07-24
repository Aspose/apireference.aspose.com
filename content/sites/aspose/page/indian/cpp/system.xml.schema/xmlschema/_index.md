---
title: "System::Xml::Schema::XmlSchema क्लास"
linktitle: "XmlSchema"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchema क्लास। एक इन-मेमारी प्रतिनिधित्व है XML Schema का, जैसा कि World Wide Web Consortium (W3C) और C++ में निर्दिष्ट है।"
type: docs
weight: 400
url: /hi/cpp/system.xml.schema/xmlschema/
---
## XmlSchema class


XML [Schema](../) का एक इन-मेमारी प्रतिनिधित्व, जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) के [XML Schema Part 1: Structures](https://www.w3.org/TR/xmlschema-1/) और [XML Schema Part 2: Datatypes](https://www.w3.org/TR/xmlschema-2/) में निर्दिष्ट है।

```cpp
class XmlSchema : public System::Xml::Schema::XmlSchemaObject
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Compile](./compile/)(ValidationEventHandler) | XML [Schema](../)[Object](../../system/object/) मॉडल (SOM) को वैधता के लिए स्कीमा जानकारी में संकलित करता है। प्रोग्रामेटिक रूप से निर्मित SOM की वाक्यात्मक और अर्थात्मक संरचना की जाँच के लिए उपयोग किया जाता है। अर्थात्मक वैधता जाँच संकलन के दौरान की जाती है। |
| [Compile](./compile/)(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) | XML [Schema](../)[Object](../../system/object/) मॉडल (SOM) को वैधता के लिए स्कीमा जानकारी में संकलित करता है। प्रोग्रामेटिक रूप से निर्मित SOM की वाक्यात्मक और अर्थात्मक संरचना की जाँच के लिए उपयोग किया जाता है। अर्थात्मक वैधता जाँच संकलन के दौरान की जाती है। |
| [get_AttributeFormDefault](./get_attributeformdefault/)() | स्कीमा के टार्गेट नेमस्पेस में घोषित एट्रिब्यूट्स के फ़ॉर्म को लौटाता है। |
| [get_AttributeGroups](./get_attributegroups/)() | स्कीमा में सभी ग्लोबल एट्रिब्यूट समूहों का पोस्ट-स्कीमा-कम्पाइलेशन मान लौटाता है। |
| [get_Attributes](./get_attributes/)() | स्कीमा में सभी एट्रिब्यूट्स का पोस्ट-स्कीमा-कम्पाइलेशन मान लौटाता है। |
| [get_BlockDefault](./get_blockdefault/)() | स्कीमा के **targetNamespace** में एलिमेंट और कॉम्प्लेक्स टाइप्स पर **block** एट्रिब्यूट का डिफ़ॉल्ट मान सेट करने वाले **blockDefault** एट्रिब्यूट को लौटाता है। |
| [get_ElementFormDefault](./get_elementformdefault/)() | स्कीमा के टार्गेट नेमस्पेस में घोषित एलिमेंट्स के फ़ॉर्म को लौटाता है। |
| [get_Elements](./get_elements/)() | स्कीमा में सभी एलिमेंट्स का पोस्ट-स्कीमा-कम्पाइलेशन मान लौटाता है। |
| [get_FinalDefault](./get_finaldefault/)() | स्कीमा के टार्गेट नेमस्पेस में एलिमेंट्स और कॉम्प्लेक्स टाइप्स पर **final** एट्रिब्यूट का डिफ़ॉल्ट मान सेट करने वाले **finalDefault** एट्रिब्यूट को लौटाता है। |
| [get_Groups](./get_groups/)() | स्कीमा में सभी समूहों के पोस्ट-स्कीमा-कम्पाइलेशन मान को लौटाता है। |
| [get_Id](./get_id/)() | स्ट्रिंग आईडी को लौटाता है। |
| [get_Includes](./get_includes/)() | शामिल और आयातित स्कीमा का संग्रह लौटाता है। |
| [get_IsCompiled](./get_iscompiled/)() | बताता है कि स्कीमा कम्पाइल किया गया है या नहीं। |
| [get_Items](./get_items/)() | स्कीमा में स्कीमा तत्वों का संग्रह लौटाता है और **schema** तत्व स्तर पर नए तत्व प्रकार जोड़ने के लिए उपयोग किया जाता है। |
| [get_LineNumber](../xmlschemaobject/get_linenumber/)() | फ़ाइल में उस पंक्ति संख्या को लौटाता है जिससे **schema** तत्व संबंधित है। |
| [get_LinePosition](../xmlschemaobject/get_lineposition/)() | फ़ाइल में उस पंक्ति स्थिति को लौटाता है जिससे **schema** तत्व संबंधित है। |
| [get_Namespaces](../xmlschemaobject/get_namespaces/)() | इस स्कीमा ऑब्जेक्ट के साथ उपयोग करने के लिए XmlSerializerNamespaces लौटाता है। |
| [get_Notations](./get_notations/)() | स्कीमा में सभी नोटेशन के पोस्ट-स्कीमा-कम्पाइलेशन मान को लौटाता है। |
| [get_Parent](../xmlschemaobject/get_parent/)() | इस [XmlSchemaObject](../xmlschemaobject/) का पैरेंट लौटाता है। |
| [get_SchemaTypes](./get_schematypes/)() | स्कीमा में सभी स्कीमा प्रकारों के पोस्ट-स्कीमा-कम्पाइलेशन मान को लौटाता है। |
| [get_SourceUri](../xmlschemaobject/get_sourceuri/)() | स्कीमा को लोड करने वाली फ़ाइल का स्रोत स्थान लौटाता है। |
| [get_TargetNamespace](./get_targetnamespace/)() | स्कीमा लक्ष्य नेमस्पेस का यूनिफ़ॉर्म रिसोर्स आइडेंटिफ़ायर (URI) लौटाता है। |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | वे योग्य गुण लौटाता है जो स्कीमा लक्ष्य नेमस्पेस से संबंधित नहीं हैं। |
| [get_Version](./get_version/)() | स्कीमा का संस्करण लौटाता है। |
| static [Read](./read/)(const SharedPtr\<IO::TextReader\>\&, ValidationEventHandler) | प्रदान किए गए [IO::TextReader](../../system.io/textreader/) से एक XML [Schema](../) पढ़ता है। |
| static [Read](./read/)(const SharedPtr\<IO::Stream\>\&, ValidationEventHandler) | प्रदान किए गए स्ट्रीम से एक XML [Schema](../) पढ़ता है। |
| static [Read](./read/)(const SharedPtr\<XmlReader\>\&, ValidationEventHandler) | प्रदान किए गए [XmlReader](../../system.xml/xmlreader/) से एक XML [Schema](../) पढ़ता है। |
| [set_AttributeFormDefault](./set_attributeformdefault/)(XmlSchemaForm) | स्कीमा के लक्ष्य नेमस्पेस में घोषित गुणों के लिए फ़ॉर्म सेट करता है। |
| [set_BlockDefault](./set_blockdefault/)(XmlSchemaDerivationMethod) | **blockDefault** गुण सेट करता है जो स्कीमा के **targetNamespace** में तत्व और कॉम्प्लेक्स प्रकारों पर **block** गुण का डिफ़ॉल्ट मान सेट करता है। |
| [set_ElementFormDefault](./set_elementformdefault/)(XmlSchemaForm) | स्कीमा के लक्ष्य नेमस्पेस में घोषित तत्वों के लिए फ़ॉर्म सेट करता है। |
| [set_FinalDefault](./set_finaldefault/)(XmlSchemaDerivationMethod) | **finalDefault** गुण सेट करता है जो स्कीमा के लक्ष्य नेमस्पेस में तत्व और कॉम्प्लेक्स प्रकारों पर **final** गुण का डिफ़ॉल्ट मान सेट करता है। |
| [set_Id](./set_id/)(const String\&) | स्ट्रिंग आईडी सेट करता है। |
| [set_LineNumber](../xmlschemaobject/set_linenumber/)(int32_t) | फ़ाइल में उस पंक्ति संख्या को सेट करता है जिससे **schema** तत्व संबंधित है। |
| [set_LinePosition](../xmlschemaobject/set_lineposition/)(int32_t) | फ़ाइल में उस पंक्ति स्थिति को सेट करता है जिससे **schema** तत्व संबंधित है। |
| [set_Namespaces](../xmlschemaobject/set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | इस स्कीमा ऑब्जेक्ट के साथ उपयोग करने के लिए XmlSerializerNamespaces सेट करता है। |
| [set_Parent](../xmlschemaobject/set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | इस [XmlSchemaObject](../xmlschemaobject/) का पैरेंट सेट करता है। |
| [set_SourceUri](../xmlschemaobject/set_sourceuri/)(const String\&) | स्कीमा लोड करने वाली फ़ाइल के स्रोत स्थान को सेट करता है। |
| [set_TargetNamespace](./set_targetnamespace/)(const String\&) | स्कीमा लक्ष्य नेमस्पेस का यूनिफॉर्म रिसोर्स आइडेंटिफायर (URI) सेट करता है। |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | स्कीमा लक्ष्य नेमस्पेस से संबंधित न होने वाले योग्य एट्रिब्यूट्स सेट करता है। |
| [set_Version](./set_version/)(const String\&) | स्कीमा का संस्करण सेट करता है। |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&) | प्रदान किए गए डेटा स्ट्रीम में XML [Schema](../) लिखता है। |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | निर्दिष्ट किए गए [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) का उपयोग करके प्रदान किए गए स्ट्रीम में XML [Schema](../) लिखता है। |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&) | प्रदान किए गए [IO::TextWriter](../../system.io/textwriter/) में XML [Schema](../) लिखता है। |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | प्रदान किए गए TextWriter में XML [Schema](../) लिखता है। |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&) | प्रदान किए गए [XmlWriter](../../system.xml/xmlwriter/) में XML [Schema](../) लिखता है। |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | प्रदान किए गए [XmlWriter](../../system.xml/xmlwriter/) में XML [Schema](../) लिखता है। |
| [XmlSchema](./xmlschema/)() | [XmlSchema](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
| [XmlSchemaObject](../xmlschemaobject/xmlschemaobject/)() | [XmlSchemaObject](../xmlschemaobject/) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [InstanceNamespace](./instancenamespace/) | XML स्कीमा इंस्टेंस नेमस्पेस। यह फ़ील्ड स्थिर है। |
| static [Namespace](./namespace/) | XML स्कीमा नेमस्पेस। यह फ़ील्ड स्थिर है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
