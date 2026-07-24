---
title: "System::Xml::XmlNode क्लास"
linktitle: "XmlNode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNode क्लास। C++ में XML दस्तावेज़ में एकल नोड का प्रतिनिधित्व करता है।"
type: docs
weight: 2500
url: /hi/cpp/system.xml/xmlnode/
---
## XmlNode class


XML दस्तावेज़ में एकल नोड का प्रतिनिधित्व करता है।

```cpp
class XmlNode : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>,
                public System::Xml::XPath::IXPathNavigable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) | इस नोड के बच्चों की सूची के अंत में निर्दिष्ट नोड को जोड़ता है। |
| virtual [Clone](./clone/)() | इस नोड की एक डुप्लिकेट बनाता है। |
| virtual [CloneNode](./clonenode/)(bool) | जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो नोड की एक प्रतिलिपि बनाता है। |
| [CreateNavigator](./createnavigator/)() override | इस ऑब्जेक्ट को नेविगेट करने के लिए एक XPathNavigator बनाता है। |
| virtual [get_Attributes](./get_attributes/)() | इस नोड के गुणों को शामिल करने वाला एक [XmlAttributeCollection](../xmlattributecollection/) लौटाता है। |
| virtual [get_BaseURI](./get_baseuri/)() | वर्तमान नोड का बेस URI लौटाता है। |
| virtual [get_ChildNodes](./get_childnodes/)() | नोड के सभी चाइल्ड नोड्स लौटाता है। |
| virtual [get_FirstChild](./get_firstchild/)() | नोड का पहला चाइल्ड लौटाता है। |
| virtual [get_HasChildNodes](./get_haschildnodes/)() | एक मान लौटाता है जो दर्शाता है कि इस नोड के कोई चाइल्ड नोड हैं या नहीं। |
| virtual [get_InnerText](./get_innertext/)() | नोड और उसके सभी चाइल्ड नोड्स के संयोजित मान लौटाता है। |
| virtual [get_InnerXml](./get_innerxml/)() | इस नोड के केवल चाइल्ड नोड्स को दर्शाने वाला मार्कअप लौटाता है। |
| virtual [get_IsReadOnly](./get_isreadonly/)() | एक मान लौटाता है जो दर्शाता है कि नोड केवल-पढ़ने योग्य है या नहीं। |
| virtual [get_LastChild](./get_lastchild/)() | नोड का अंतिम चाइल्ड लौटाता है। |
| virtual [get_LocalName](./get_localname/)() | डेराइव्ड क्लास में ओवरराइड किए जाने पर नोड का स्थानीय नाम लौटाता है। |
| virtual [get_Name](./get_name/)() | डेराइव्ड क्लास में ओवरराइड किए जाने पर नोड का योग्य नाम लौटाता है। |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | इस नोड का नेमस्पेस URI लौटाता है। |
| virtual [get_NextSibling](./get_nextsibling/)() | इस नोड के तुरंत बाद आने वाला नोड लौटाता है। |
| virtual [get_NodeType](./get_nodetype/)() | डेराइव्ड क्लास में ओवरराइड किए जाने पर वर्तमान नोड का प्रकार लौटाता है। |
| virtual [get_OuterXml](./get_outerxml/)() | इस नोड और उसके सभी चाइल्ड नोड्स को शामिल करने वाला मार्कअप लौटाता है। |
| virtual [get_OwnerDocument](./get_ownerdocument/)() | इस नोड से संबंधित [XmlDocument](../xmldocument/) लौटाता है। |
| virtual [get_ParentNode](./get_parentnode/)() | इस नोड का पैरेंट लौटाता है (उन नोड्स के लिए जिनके पास पैरेंट हो सकता है)। |
| virtual [get_Prefix](./get_prefix/)() | इस नोड का नेमस्पेस प्रीफ़िक्स लौटाता है। |
| virtual [get_PreviousSibling](./get_previoussibling/)() | इस नोड से तुरंत पहले आने वाला नोड लौटाता है। |
| virtual [get_PreviousText](./get_previoustext/)() | उस टेक्स्ट नोड को लौटाता है जो इस नोड से तुरंत पहले आता है। |
| virtual [get_SchemaInfo](./get_schemainfo/)() | स्कीमा वैधता के परिणामस्वरूप इस नोड को सौंपा गया पोस्ट स्कीमा वैधता इन्फोसैट लौटाता है। |
| virtual [get_Value](./get_value/)() | नोड का मान लौटाता है। |
| [GetEnumerator](./getenumerator/)() override | वर्तमान नोड में चाइल्ड नोड्स के माध्यम से इटररेट करने वाला एक एनेमरेटर लौटाता है। |
| virtual [GetNamespaceOfPrefix](./getnamespaceofprefix/)(String) | वर्तमान नोड के स्कोप में दिए गए प्रीफ़िक्स के लिए सबसे निकटतम **xmlns** घोषणा खोजता है और घोषणा में नेमस्पेस URI लौटाता है। |
| virtual [GetPrefixOfNamespace](./getprefixofnamespace/)(String) | वर्तमान नोड के स्कोप में दिए गए नेमस्पेस URI के लिए सबसे निकटतम **xmlns** घोषणा खोजता है और उस घोषणा में परिभाषित प्रीफ़िक्स लौटाता है। |
| virtual [idx_get](./idx_get/)(String) | निर्दिष्ट [XmlNode::get_Name](./get_name/) वाले पहले चाइल्ड एलिमेंट को लौटाता है। |
| virtual [idx_get](./idx_get/)(String, String) | निर्दिष्ट [XmlNode::get_LocalName](./get_localname/) और [XmlNode::get_NamespaceURI](./get_namespaceuri/) मानों वाले पहले चाइल्ड एलिमेंट को लौटाता है। |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | निर्दिष्ट रेफ़रेंस नोड के तुरंत बाद निर्दिष्ट नोड को सम्मिलित करता है। |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | निर्दिष्ट रेफ़रेंस नोड के तुरंत पहले निर्दिष्ट नोड को सम्मिलित करता है। |
| virtual [Normalize](./normalize/)() | इस [XmlNode](./) के नीचे सब-ट्री की पूरी गहराई में सभी [XmlText](../xmltext/) नोड्स को एक \"normal\" रूप में बदलता है जहाँ केवल मार्कअप (जैसे टैग, टिप्पणी, प्रोसेसिंग इंस्ट्रक्शन, CDATA सेक्शन, और एंटिटी रेफ़रेंसेज़) ही [XmlText](../xmltext/) नोड्स को अलग करता है, अर्थात् कोई आसन्न [XmlText](../xmltext/) नोड नहीं होते। |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) | इस नोड के चाइल्ड नोड्स की सूची की शुरुआत में निर्दिष्ट नोड को जोड़ता है। |
| virtual [RemoveAll](./removeall/)() | वर्तमान नोड के सभी चाइल्ड नोड्स और/या गुणों को हटा देता है। |
| virtual [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) | निर्दिष्ट चाइल्ड नोड को हटाता है। |
| virtual [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | चाइल्ड नोड **oldChild** को **newChild** नोड से बदलता है। |
| [SelectNodes](./selectnodes/)(const String\&) | एक सूची चुनता है जिसमें वे नोड्स होते हैं जो [XPath](../../system.xml.xpath/) अभिव्यक्ति से मेल खाते हैं। |
| [SelectNodes](./selectnodes/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | एक सूची चुनता है जिसमें वे नोड्स होते हैं जो [XPath](../../system.xml.xpath/) अभिव्यक्ति से मेल खाते हैं। [XPath](../../system.xml.xpath/) अभिव्यक्ति में पाए गए किसी भी प्रीफ़िक्स को प्रदान किए गए [XmlNamespaceManager](../xmlnamespacemanager/) का उपयोग करके हल किया जाता है। |
| [SelectSingleNode](./selectsinglenode/)(const String\&) | पहला [XmlNode](./) चुनता है जो [XPath](../../system.xml.xpath/) अभिव्यक्ति से मेल खाता है। |
| [SelectSingleNode](./selectsinglenode/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | पहला [XmlNode](./) चुनता है जो [XPath](../../system.xml.xpath/) अभिव्यक्ति से मेल खाता है। [XPath](../../system.xml.xpath/) अभिव्यक्ति में पाए गए किसी भी प्रीफ़िक्स को प्रदान किए गए [XmlNamespaceManager](../xmlnamespacemanager/) का उपयोग करके हल किया जाता है। |
| virtual [set_InnerText](./set_innertext/)(String) | नोड और उसके सभी चाइल्ड नोड्स के संयोजित मान सेट करता है। |
| virtual [set_InnerXml](./set_innerxml/)(String) | इस नोड के केवल चाइल्ड नोड्स को दर्शाने वाला मार्कअप सेट करता है। |
| virtual [set_Prefix](./set_prefix/)(String) | इस नोड का नेमस्पेस प्रीफ़िक्स सेट करता है। |
| virtual [set_Value](./set_value/)(String) | नोड का मान सेट करता है। |
| virtual [Supports](./supports/)(String, String) | जाँचता है कि DOM इम्प्लीमेंटेशन कोई विशिष्ट फीचर लागू करता है या नहीं। |
| virtual [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) | डेराइव्ड क्लास में ओवरराइड होने पर नोड के सभी चाइल्ड नोड्स को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। |
| virtual [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) | डेराइव्ड क्लास में ओवरराइड होने पर वर्तमान नोड को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## संबंधित देखें

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Class [IXPathNavigable](../../system.xml.xpath/ixpathnavigable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
