---
title: "System::Xml::XmlElement क्लास"
linktitle: "XmlElement"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlElement क्लास। C++ में एक तत्व का प्रतिनिधित्व करता है।"
type: docs
weight: 1700
url: /hi/cpp/system.xml/xmlelement/
---
## XmlElement class


एक एलिमेंट को दर्शाता है।

```cpp
class XmlElement : public System::Xml::XmlLinkedNode
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | इस नोड की एक डुप्लिकेट बनाता है। |
| virtual [get_HasAttributes](./get_hasattributes/)() | वर्तमान नोड के पास कोई गुणधर्म हैं या नहीं, यह दर्शाने वाला **bool** मान लौटाता है। |
| [get_InnerText](./get_innertext/)() override | नोड और उसके सभी बच्चों के जुड़े हुए मान लौटाता है। |
| [get_InnerXml](./get_innerxml/)() override | इस नोड के केवल बच्चों को दर्शाने वाला मार्कअप लौटाता है। |
| [get_IsEmpty](./get_isempty/)() | तत्व के टैग फ़ॉर्मेट को लौटाता है। |
| [get_LocalName](./get_localname/)() override | वर्तमान नोड का स्थानीय नाम लौटाता है। |
| [get_Name](./get_name/)() override | नोड का क्वालिफाइड नाम लौटाता है। |
| [get_NamespaceURI](./get_namespaceuri/)() override | इस नोड का नेमस्पेस URI लौटाता है। |
| [get_NodeType](./get_nodetype/)() override | वर्तमान नोड का प्रकार लौटाता है। |
| [get_OwnerDocument](./get_ownerdocument/)() override | इस नोड से संबंधित [XmlDocument](../xmldocument/) लौटाता है। |
| [get_Prefix](./get_prefix/)() override | इस नोड का नेमस्पेस प्रीफ़िक्स लौटाता है। |
| [get_SchemaInfo](./get_schemainfo/)() override | स्कीमा वैधता के परिणामस्वरूप इस नोड को सौंपा गया पोस्ट स्कीमा वैधता इन्फोसैट लौटाता है। |
| virtual [GetAttribute](./getattribute/)(String) | निर्दिष्ट नाम वाले गुणधर्म का मान लौटाता है। |
| virtual [GetAttribute](./getattribute/)(String, String) | निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले गुणधर्म का मान लौटाता है। |
| virtual [GetAttributeNode](./getattributenode/)(String) | निर्दिष्ट नाम वाला [XmlAttribute](../xmlattribute/) लौटाता है। |
| virtual [GetAttributeNode](./getattributenode/)(String, String) | निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाला [XmlAttribute](../xmlattribute/) लौटाता है। |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | निर्दिष्ट [XmlElement::get_Name](./get_name/) से मेल खाने वाले सभी वंशज तत्वों की सूची वाला एक [XmlNodeList](../xmlnodelist/) लौटाता है। |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | निर्दिष्ट [XmlElement::get_LocalName](./get_localname/) और [XmlElement::get_NamespaceURI](./get_namespaceuri/) मानों से मेल खाने वाले सभी वंशज तत्वों की सूची वाला एक [XmlNodeList](../xmlnodelist/) लौटाता है। |
| virtual [HasAttribute](./hasattribute/)(String) | निर्धारित करता है कि वर्तमान नोड के पास निर्दिष्ट नाम वाला गुणधर्म है या नहीं। |
| virtual [HasAttribute](./hasattribute/)(String, String) | निर्धारित करता है कि वर्तमान नोड के पास निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाला गुणधर्म है या नहीं। |
| [RemoveAll](./removeall/)() override | वर्तमान नोड के सभी निर्दिष्ट गुणधर्म और बच्चे हटाता है। डिफ़ॉल्ट गुणधर्म नहीं हटाए जाते। |
| virtual [RemoveAllAttributes](./removeallattributes/)() | तत्व से सभी निर्दिष्ट गुणधर्म हटाता है। डिफ़ॉल्ट गुणधर्म नहीं हटाए जाते। |
| virtual [RemoveAttribute](./removeattribute/)(String) | नाम द्वारा एक गुणधर्म हटाता है। |
| virtual [RemoveAttribute](./removeattribute/)(String, String) | निर्दिष्ट स्थानीय नाम और नेमस्पेस URI के साथ एक विशेषता को हटाता है। (यदि हटाई गई विशेषता का डिफ़ॉल्ट मान है, तो उसे तुरंत प्रतिस्थापित किया जाता है)। |
| virtual [RemoveAttributeAt](./removeattributeat/)(int32_t) | तत्व से निर्दिष्ट अनुक्रमांक वाली विशेषता नोड को हटाता है। (यदि हटाई गई विशेषता का डिफ़ॉल्ट मान है, तो उसे तुरंत प्रतिस्थापित किया जाता है)। |
| virtual [RemoveAttributeNode](./removeattributenode/)(SharedPtr\<XmlAttribute\>) | निर्दिष्ट [XmlAttribute](../xmlattribute/) को हटाता है। |
| virtual [RemoveAttributeNode](./removeattributenode/)(String, String) | स्थानीय नाम और नेमस्पेस URI द्वारा निर्दिष्ट [XmlAttribute](../xmlattribute/) को हटाता है। (यदि हटाई गई विशेषता का डिफ़ॉल्ट मान है, तो उसे तुरंत प्रतिस्थापित किया जाता है)। |
| [set_InnerText](./set_innertext/)(String) override | नोड और उसकी सभी संतानों के संयोजित मान सेट करता है। |
| [set_InnerXml](./set_innerxml/)(String) override | इस नोड की केवल संतानों को दर्शाने वाला मार्कअप सेट करता है। |
| [set_IsEmpty](./set_isempty/)(bool) | तत्व के टैग फ़ॉर्मेट को सेट करता है। |
| [set_Prefix](./set_prefix/)(String) override | इस नोड का नेमस्पेस प्रीफ़िक्स सेट करता है। |
| virtual [SetAttribute](./setattribute/)(String, String) | निर्दिष्ट नाम वाली विशेषता का मान सेट करता है। |
| virtual [SetAttribute](./setattribute/)(String, String, String) | निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाली विशेषता का मान सेट करता है। |
| virtual [SetAttributeNode](./setattributenode/)(SharedPtr\<XmlAttribute\>) | निर्दिष्ट [XmlAttribute](../xmlattribute/) जोड़ता है। |
| virtual [SetAttributeNode](./setattributenode/)(String, String) | निर्दिष्ट [XmlAttribute](../xmlattribute/) जोड़ता है। |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | नोड के सभी चाइल्ड को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | वर्तमान नोड को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
