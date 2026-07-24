---
title: "System::Xml::XmlAttribute क्लास"
linktitle: "XmlAttribute"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlAttribute क्लास। एक एट्रिब्यूट का प्रतिनिधित्व करता है। एट्रिब्यूट के वैध और डिफ़ॉल्ट मान एक डॉक्यूमेंट टाइप डिफिनिशन (DTD) या C++ में स्कीमा में परिभाषित होते हैं।"
type: docs
weight: 600
url: /hi/cpp/system.xml/xmlattribute/
---
## XmlAttribute class


एक एट्रिब्यूट को दर्शाता है। एट्रिब्यूट के वैध और डिफ़ॉल्ट मान दस्तावेज़ प्रकार परिभाषा (DTD) या स्कीमा में परिभाषित होते हैं।

```cpp
class XmlAttribute : public System::Xml::XmlNode
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) override | इस नोड के बच्चों की सूची के अंत में निर्दिष्ट नोड को जोड़ता है। |
| [CloneNode](./clonenode/)(bool) override | इस नोड की एक डुप्लिकेट बनाता है। |
| [get_BaseURI](./get_baseuri/)() override | नोड का बेस यूनिफॉर्म रिसोर्स आइडेंटिफ़ायर (URI) लौटाता है। |
| [get_LocalName](./get_localname/)() override | नोड का स्थानीय नाम लौटाता है। |
| [get_Name](./get_name/)() override | नोड का क्वालिफाइड नाम लौटाता है। |
| [get_NamespaceURI](./get_namespaceuri/)() override | इस नोड का नेमस्पेस URI लौटाता है। |
| [get_NodeType](./get_nodetype/)() override | वर्तमान नोड का प्रकार लौटाता है। |
| [get_OwnerDocument](./get_ownerdocument/)() override | इस नोड से संबंधित [XmlDocument](../xmldocument/) लौटाता है। |
| virtual [get_OwnerElement](./get_ownerelement/)() | [XmlElement](../xmlelement/) लौटाता है जिससे एट्रिब्यूट संबंधित है। |
| [get_Prefix](./get_prefix/)() override | इस नोड का नेमस्पेस प्रीफ़िक्स लौटाता है। |
| [get_SchemaInfo](./get_schemainfo/)() override | स्कीमा वैलिडेशन के परिणामस्वरूप इस नोड को असाइन किया गया पोस्ट-स्कीमा-वैलिडेशन-इन्फोसैट लौटाता है। |
| virtual [get_Specified](./get_specified/)() | एक मान लौटाता है जो दर्शाता है कि एट्रिब्यूट वैल्यू स्पष्ट रूप से सेट किया गया था या नहीं। |
| [get_Value](./get_value/)() override | नोड का मान लौटाता है। |
| [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | निर्दिष्ट रेफ़रेंस नोड के तुरंत बाद निर्दिष्ट नोड को सम्मिलित करता है। |
| [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | निर्दिष्ट रेफ़रेंस नोड के तुरंत पहले निर्दिष्ट नोड को सम्मिलित करता है। |
| [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) override | इस नोड के चाइल्ड नोड्स की सूची की शुरुआत में निर्दिष्ट नोड को जोड़ता है। |
| [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) override | निर्दिष्ट चाइल्ड नोड को हटाता है। |
| [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | निर्दिष्ट चाइल्ड नोड को निर्दिष्ट नए चाइल्ड नोड से बदलता है। |
| [set_InnerText](./set_innertext/)(String) override | नोड और उसकी सभी संतानों के संयोजित मान सेट करता है। |
| [set_InnerXml](./set_innerxml/)(String) override | एट्रिब्यूट का मान सेट करता है। |
| [set_Prefix](./set_prefix/)(String) override | इस नोड का नेमस्पेस प्रीफ़िक्स सेट करता है। |
| [set_Value](./set_value/)(String) override | नोड का मान सेट करता है। |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | नोड के सभी चाइल्ड को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | नोड को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। |
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
