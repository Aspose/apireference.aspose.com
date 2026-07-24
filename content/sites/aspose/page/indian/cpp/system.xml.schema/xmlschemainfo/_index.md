---
title: "System::Xml::Schema::XmlSchemaInfo वर्ग"
linktitle: "XmlSchemaInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaInfo वर्ग। C++ में मान्य किए गए XML नोड के पोस्ट-स्कीमा-वैधता इन्फोसैट का प्रतिनिधित्व करता है।"
type: docs
weight: 3800
url: /hi/cpp/system.xml.schema/xmlschemainfo/
---
## XmlSchemaInfo class


एक मान्य XML नोड के पोस्ट-स्कीमा-वैलिडेशन इन्फोसैट का प्रतिनिधित्व करता है।

```cpp
class XmlSchemaInfo : public System::Xml::Schema::IXmlSchemaInfo
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_ContentType](./get_contenttype/)() | इस मान्य किए गए XML नोड की सामग्री प्रकार से मेल खाने वाला [XmlSchemaContentType](../xmlschemacontenttype/) ऑब्जेक्ट लौटाता है। |
| [get_IsDefault](./get_isdefault/)() override | एक मान लौटाता है जो दर्शाता है कि क्या इस मान्य किए गए XML नोड को XML [Schema](../) Definition Language (XSD) स्कीमा वैधता के दौरान लागू किए गए डिफ़ॉल्ट के परिणामस्वरूप सेट किया गया था। |
| [get_IsNil](./get_isnil/)() override | एक मान लौटाता है जो दर्शाता है कि इस मान्य किए गए XML नोड का मान **nil** है या नहीं। |
| [get_MemberType](./get_membertype/)() override | इस मान्य किए गए XML नोड के लिए गतिशील स्कीमा प्रकार लौटाता है। |
| [get_SchemaAttribute](./get_schemaattribute/)() override | इस मान्य किए गए XML नोड से मेल खाने वाला संकलित [XmlSchemaAttribute](../xmlschemaattribute/) ऑब्जेक्ट लौटाता है। |
| [get_SchemaElement](./get_schemaelement/)() override | इस मान्य किए गए XML नोड से मेल खाने वाला संकलित [XmlSchemaElement](../xmlschemaelement/) ऑब्जेक्ट लौटाता है। |
| [get_SchemaType](./get_schematype/)() override | इस मान्य किए गए XML नोड का स्थिर XML [Schema](../) Definition Language (XSD) स्कीमा प्रकार लौटाता है। |
| [get_Validity](./get_validity/)() override | इस मान्य XML नोड का [XmlSchemaValidity](../xmlschemavalidity/) मान लौटाता है। |
| [set_ContentType](./set_contenttype/)(XmlSchemaContentType) | इस मान्य XML नोड की सामग्री प्रकार से मेल खाने वाले [XmlSchemaContentType](../xmlschemacontenttype/) ऑब्जेक्ट को सेट करता है। |
| [set_IsDefault](./set_isdefault/)(bool) | XML [Schema](../) परिभाषा भाषा (XSD) स्कीमा सत्यापन के दौरान डिफ़ॉल्ट लागू होने के परिणामस्वरूप इस मान्य XML नोड को सेट किया गया है या नहीं, यह दर्शाने वाला मान सेट करता है। |
| [set_IsNil](./set_isnil/)(bool) | इस मान्य XML नोड के मान **nil** है या नहीं, यह दर्शाने वाला मान सेट करता है। |
| [set_MemberType](./set_membertype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | इस मान्य XML नोड के लिए गतिशील स्कीमा प्रकार सेट करता है। |
| [set_SchemaAttribute](./set_schemaattribute/)(const SharedPtr\<XmlSchemaAttribute\>\&) | इस मान्य XML नोड से मेल खाने वाले संकलित [XmlSchemaAttribute](../xmlschemaattribute/) ऑब्जेक्ट को सेट करता है। |
| [set_SchemaElement](./set_schemaelement/)(const SharedPtr\<XmlSchemaElement\>\&) | इस मान्य XML नोड से मेल खाने वाले संकलित [XmlSchemaElement](../xmlschemaelement/) ऑब्जेक्ट को सेट करता है। |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | इस मान्य XML नोड के स्थैतिक XML [Schema](../) परिभाषा भाषा (XSD) स्कीमा प्रकार को सेट करता है। |
| [set_Validity](./set_validity/)(XmlSchemaValidity) | इस मान्य XML नोड का [XmlSchemaValidity](../xmlschemavalidity/) मान सेट करता है। |
| [XmlSchemaInfo](./xmlschemainfo/)() | [XmlSchemaInfo](./) क्लास का नया उदाहरण प्रारंभ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [IXmlSchemaInfo](../ixmlschemainfo/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
