---
title: "System::Xml::Schema::XmlSchemaRedefine क्लास"
linktitle: "XmlSchemaRedefine"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaRedefine क्लास। XML Schema से पुनःपरिभाषित (redefine) तत्व को दर्शाता है जैसा कि World Wide Web Consortium (W3C) द्वारा निर्दिष्ट किया गया है। इस क्लास का उपयोग बाहरी स्कीमा फ़ाइलों से सरल और जटिल प्रकार, समूह और एट्रिब्यूट समूहों को वर्तमान स्कीमा में पुनःपरिभाषित करने के लिए किया जा सकता है। इस क्लास का उपयोग C++ में स्कीमा तत्वों के लिए संस्करणीकरण प्रदान करने के लिए भी किया जा सकता है।"
type: docs
weight: 5600
url: /hi/cpp/system.xml.schema/xmlschemaredefine/
---
## XmlSchemaRedefine class


XML [Schema](../) से **redefine** तत्व को World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट अनुसार दर्शाता है। यह क्लास बाहरी स्कीमा फ़ाइलों से सरल और जटिल प्रकार, समूह और एट्रिब्यूट समूहों को वर्तमान स्कीमा में पुनःपरिभाषित करने के लिए उपयोग की जा सकती है। यह क्लास स्कीमा तत्वों के संस्करणीकरण को प्रदान करने के लिए भी उपयोग की जा सकती है।

```cpp
class XmlSchemaRedefine : public System::Xml::Schema::XmlSchemaExternal
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_AttributeGroups](./get_attributegroups/)() | स्कीमा में सभी एट्रिब्यूट्स के लिए [XmlSchemaObjectTable](../xmlschemaobjecttable/) लौटाता है, जो **AttributeGroups** मान की पोस्ट-कम्पाइलेशन व्याख्या रखता है। |
| [get_Groups](./get_groups/)() | स्कीमा में सभी समूहों के लिए [XmlSchemaObjectTable](../xmlschemaobjecttable/) लौटाता है, जो **Groups** मान की पोस्ट-कम्पाइलेशन व्याख्या रखता है। |
| [get_Items](./get_items/)() | निम्नलिखित क्लासों का संग्रह लौटाता है: [XmlSchemaAnnotation](../xmlschemaannotation/), [XmlSchemaAttributeGroup](../xmlschemaattributegroup/), [XmlSchemaComplexType](../xmlschemacomplextype/), [XmlSchemaSimpleType](../xmlschemasimpletype/), और [XmlSchemaGroup](../xmlschemagroup/). |
| [get_SchemaTypes](./get_schematypes/)() | स्कीमा में सभी सरल और जटिल प्रकारों के लिए [XmlSchemaObjectTable](../xmlschemaobjecttable/) लौटाता है, जो **SchemaTypes** मान की पोस्ट-कम्पाइलेशन व्याख्या रखता है। |
| [XmlSchemaRedefine](./xmlschemaredefine/)() | [XmlSchemaRedefine](./) क्लास का नया उदाहरण आरंभ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
