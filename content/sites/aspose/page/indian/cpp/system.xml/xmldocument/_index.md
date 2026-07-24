---
title: "System::Xml::XmlDocument क्लास"
linktitle: "XmlDocument"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlDocument क्लास। एक XML दस्तावेज़ का प्रतिनिधित्व करता है। आप इस क्लास का उपयोग C++ में दस्तावेज़ में XML को लोड, वैलिडेट, एडिट, जोड़ने और पोजिशन करने के लिए कर सकते हैं।"
type: docs
weight: 1400
url: /hi/cpp/system.xml/xmldocument/
---
## XmlDocument class


एक XML दस्तावेज़ को दर्शाता है। आप इस क्लास का उपयोग करके दस्तावेज़ में XML को लोड, वैलिडेट, एडिट, जोड़ और पोज़िशन कर सकते हैं।

```cpp
class XmlDocument : public System::Xml::XmlNode
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | इस नोड की एक डुप्लिकेट बनाता है। |
| [CreateAttribute](./createattribute/)(const String\&) | निर्दिष्ट नाम के साथ एक [XmlAttribute](../xmlattribute/) बनाता है। |
| [CreateAttribute](./createattribute/)(const String\&, const String\&) | निर्दिष्ट योग्य नाम और [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) के साथ एक [XmlAttribute](../xmlattribute/) बनाता है। |
| virtual [CreateAttribute](./createattribute/)(const String\&, const String\&, const String\&) | निर्दिष्ट [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_LocalName](./get_localname/), और [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) के साथ एक [XmlAttribute](../xmlattribute/) बनाता है। |
| virtual [CreateCDataSection](./createcdatasection/)(const String\&) | निर्दिष्ट डेटा वाले एक [XmlCDataSection](../xmlcdatasection/) बनाता है। |
| virtual [CreateComment](./createcomment/)(const String\&) | निर्दिष्ट डेटा वाले एक [XmlComment](../xmlcomment/) बनाता है। |
| virtual [CreateDocumentFragment](./createdocumentfragment/)() | एक [XmlDocumentFragment](../xmldocumentfragment/) बनाता है। |
| virtual [CreateDocumentType](./createdocumenttype/)(const String\&, const String\&, const String\&, const String\&) | एक नया [XmlDocumentType](../xmldocumenttype/) ऑब्जेक्ट लौटाता है। |
| [CreateElement](./createelement/)(const String\&) | निर्दिष्ट नाम के साथ एक तत्व बनाता है। |
| [CreateElement](./createelement/)(const String\&, const String\&) | योग्य नाम और [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) के साथ एक [XmlElement](../xmlelement/) बनाता है। |
| virtual [CreateElement](./createelement/)(const String\&, const String\&, const String\&) | निर्दिष्ट [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_LocalName](./get_localname/), और [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) के साथ एक तत्व बनाता है। |
| virtual [CreateEntityReference](./createentityreference/)(const String\&) | निर्दिष्ट नाम के साथ एक [XmlEntityReference](../xmlentityreference/) बनाता है। |
| [CreateNavigator](./createnavigator/)() override | इस दस्तावेज़ को नेविगेट करने के लिए एक नया XPathNavigator ऑब्जेक्ट बनाता है। |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&, const String\&) | निर्दिष्ट [XmlNodeType](../xmlnodetype/), [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_Name](./get_name/), और [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) के साथ एक [XmlNode](../xmlnode/) बनाता है। |
| virtual [CreateNode](./createnode/)(const String\&, const String\&, const String\&) | निर्दिष्ट नोड प्रकार, [XmlDocument::get_Name](./get_name/), और [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) के साथ एक [XmlNode](../xmlnode/) बनाता है। |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&) | निर्दिष्ट [XmlNodeType](../xmlnodetype/), [XmlDocument::get_Name](./get_name/), और [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) के साथ एक [XmlNode](../xmlnode/) बनाता है। |
| virtual [CreateProcessingInstruction](./createprocessinginstruction/)(const String\&, const String\&) | निर्दिष्ट नाम और डेटा के साथ एक [XmlProcessingInstruction](../xmlprocessinginstruction/) बनाता है। |
| virtual [CreateSignificantWhitespace](./createsignificantwhitespace/)(const String\&) | एक [XmlSignificantWhitespace](../xmlsignificantwhitespace/) नोड बनाता है। |
| virtual [CreateTextNode](./createtextnode/)(const String\&) | निर्दिष्ट पाठ के साथ एक [XmlText](../xmltext/) बनाता है। |
| virtual [CreateWhitespace](./createwhitespace/)(const String\&) | [XmlWhitespace](../xmlwhitespace/) नोड बनाता है। |
| virtual [CreateXmlDeclaration](./createxmldeclaration/)(const String\&, const String\&, const String\&) | निर्दिष्ट मानों के साथ एक [XmlDeclaration](../xmldeclaration/) नोड बनाता है। |
| [get_BaseURI](./get_baseuri/)() override | वर्तमान नोड का बेस URI लौटाता है। |
| [get_DocumentElement](./get_documentelement/)() | दस्तावेज़ के लिए मूल [XmlElement](../xmlelement/) लौटाता है। |
| virtual [get_DocumentType](./get_documenttype/)() | DOCTYPE घोषणा युक्त नोड लौटाता है। |
| [get_Implementation](./get_implementation/)() | वर्तमान दस्तावेज़ के लिए [XmlImplementation](../xmlimplementation/) ऑब्जेक्ट लौटाता है। |
| [get_InnerXml](./get_innerxml/)() override | वर्तमान नोड के बच्चों का प्रतिनिधित्व करने वाला मार्कअप लौटाता है। |
| [get_IsReadOnly](./get_isreadonly/)() override | एक मान लौटाता है जो दर्शाता है कि वर्तमान नोड केवल-पढ़ने योग्य है या नहीं। |
| [get_LocalName](./get_localname/)() override | नोड का स्थानीय नाम लौटाता है। |
| [get_Name](./get_name/)() override | नोड का क्वालिफाइड नाम लौटाता है। |
| [get_NameTable](./get_nametable/)() | वापस देता है इस कार्यान्वयन से जुड़ा [XmlNameTable](../xmlnametable/)। |
| [get_NodeType](./get_nodetype/)() override | वर्तमान नोड का प्रकार लौटाता है। |
| [get_OwnerDocument](./get_ownerdocument/)() override | वर्तमान नोड जिस [XmlDocument](./) से संबंधित है, उसे लौटाता है। |
| [get_PreserveWhitespace](./get_preservewhitespace/)() | एक मान लौटाता है जो दर्शाता है कि तत्व सामग्री में व्हाइट स्पेस संरक्षित किया जाए या नहीं। |
| [get_SchemaInfo](./get_schemainfo/)() override | नोड का पोस्ट-स्कीमा-वैलिडेशन-इन्फोसैट (PSVI) लौटाता है। |
| [get_Schemas](./get_schemas/)() | इस [XmlDocument](./) से संबंधित XmlSchemaSet ऑब्जेक्ट लौटाता है। |
| virtual [GetElementById](./getelementbyid/)(String) | निर्दिष्ट ID वाला [XmlElement](../xmlelement/) लौटाता है। |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | निर्दिष्ट नाम से मेल खाने वाले सभी वंशज तत्वों की सूची युक्त एक [XmlNodeList](../xmlnodelist/) लौटाता है। |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | निर्दिष्ट [XmlDocument::get_LocalName](./get_localname/) और [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) से मेल खाने वाले सभी वंशज तत्वों की सूची युक्त एक [XmlNodeList](../xmlnodelist/) लौटाता है। |
| virtual [ImportNode](./importnode/)(SharedPtr\<XmlNode\>, bool) | एक अन्य दस्तावेज़ से नोड को वर्तमान दस्तावेज़ में आयात करता है। |
| virtual [Load](./load/)(String) | निर्दिष्ट URL से XML दस्तावेज़ लोड करता है। |
| virtual [Load](./load/)(SharedPtr\<IO::Stream\>) | निर्दिष्ट स्ट्रीम से XML दस्तावेज़ लोड करता है। |
| virtual [Load](./load/)(SharedPtr\<IO::TextReader\>) | निर्दिष्ट TextReader से XML दस्तावेज़ लोड करता है। |
| virtual [Load](./load/)(SharedPtr\<XmlReader\>) | निर्दिष्ट [XmlReader](../xmlreader/) से XML दस्तावेज़ लोड करता है। |
| virtual [LoadXml](./loadxml/)(String) | निर्दिष्ट स्ट्रिंग से XML दस्तावेज़ लोड करता है। |
| virtual [ReadNode](./readnode/)(SharedPtr\<XmlReader\>) | [XmlReader](../xmlreader/) में जानकारी के आधार पर एक [XmlNode](../xmlnode/) ऑब्जेक्ट बनाता है। रीडर को किसी नोड या एट्रिब्यूट पर स्थित होना चाहिए। |
| virtual [Save](./save/)(String) | XML दस्तावेज़ को निर्दिष्ट फ़ाइल में सहेजता है। यदि निर्दिष्ट फ़ाइल मौजूद है, तो यह मेथड उसे ओवरराइट कर देता है। |
| virtual [Save](./save/)(SharedPtr\<IO::Stream\>) | XML दस्तावेज़ को निर्दिष्ट स्ट्रीम में सहेजता है। |
| virtual [Save](./save/)(SharedPtr\<IO::TextWriter\>) | XML दस्तावेज़ को निर्दिष्ट TextWriter में सहेजता है। |
| virtual [Save](./save/)(SharedPtr\<XmlWriter\>) | निर्दिष्ट [XmlWriter](../xmlwriter/) में XML दस्तावेज़ को सहेजता है। |
| [set_InnerText](./set_innertext/)(String) override | सभी मामलों में InvalidOperationException फेंकता है। |
| [set_InnerXml](./set_innerxml/)(String) override | वर्तमान नोड के बच्चों का प्रतिनिधित्व करने वाला मार्कअप सेट करता है। |
| [set_PreserveWhitespace](./set_preservewhitespace/)(bool) | तत्व सामग्री में व्हाइट स्पेस को संरक्षित करने का संकेत देने वाला मान सेट करता है। |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | इस [XmlDocument](./) से जुड़ा XmlSchemaSet ऑब्जेक्ट सेट करता है। |
| virtual [set_XmlResolver](./set_xmlresolver/)(SharedPtr\<System::Xml::XmlResolver\>) | बाहरी संसाधनों को हल करने के लिए उपयोग किए जाने वाले [XmlResolver](../xmlresolver/) को सेट करता है। |
| [Validate](./validate/)(Schema::ValidationEventHandler) | [XmlDocument](./) को XML [Schema](../../system.xml.schema/) डिफिनिशन लैंग्वेज (XSD) स्कीमा के विरुद्ध सत्यापित करता है, जो [XmlDocument::get_Schemas](./get_schemas/) सूची में शामिल हैं। |
| [Validate](./validate/)(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) | निर्दिष्ट [XmlNode](../xmlnode/) ऑब्जेक्ट को XML [Schema](../../system.xml.schema/) डिफिनिशन लैंग्वेज (XSD) स्कीमा के विरुद्ध सत्यापित करता है, जो [XmlDocument::get_Schemas](./get_schemas/) सूची में हैं। |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | [XmlDocument](./) नोड के सभी बच्चों को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | [XmlDocument](./) नोड को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। |
| [XmlDocument](./xmldocument/)() | [XmlDocument](./) क्लास का एक नया इंस्टेंस प्रारंभ करता है। |
| [XmlDocument](./xmldocument/)(const SharedPtr\<XmlNameTable\>\&) | निर्दिष्ट [XmlNameTable](../xmlnametable/) के साथ [XmlDocument](./) क्लास का एक नया इंस्टेंस प्रारंभ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
