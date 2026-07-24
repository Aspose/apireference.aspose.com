---
title: "System::Xml::XPath::XPathNavigator class"
linktitle: "XPathNavigator"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator class. C++ में XML डेटा को नेविगेट करने और संपादित करने के लिए एक कर्सर मॉडल प्रदान करता है।"
type: docs
weight: 500
url: /hi/cpp/system.xml.xpath/xpathnavigator/
---
## XPathNavigator class


XML डेटा को नेविगेट करने और संपादित करने के लिए एक कर्सर मॉडल प्रदान करता है।

```cpp
class XPathNavigator : public System::Xml::XPath::XPathItem,
                       public System::Xml::XPath::IXPathNavigable,
                       public System::Xml::IXmlNamespaceResolver
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [AppendChild](./appendchild/)() | वर्तमान नोड के चाइल्ड नोड्स की सूची के अंत में एक या अधिक नए चाइल्ड नोड्स बनाने के लिए उपयोग किया जाने वाला एक [XmlWriter](../../system.xml/xmlwriter/) ऑब्जेक्ट लौटाता है। |
| virtual [AppendChild](./appendchild/)(String) | निर्दिष्ट XML डेटा स्ट्रिंग का उपयोग करके वर्तमान नोड के चाइल्ड नोड्स की सूची के अंत में एक नया चाइल्ड नोड बनाता है। |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlReader\>) | निर्दिष्ट [XmlReader](../../system.xml/xmlreader/) ऑब्जेक्ट की XML सामग्री का उपयोग करके वर्तमान नोड के चाइल्ड नोड्स की सूची के अंत में एक नया चाइल्ड नोड बनाता है। |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XPathNavigator\>) | निर्दिष्ट [XPathNavigator](./) में नोड्स का उपयोग करके वर्तमान नोड के चाइल्ड नोड्स की सूची के अंत में एक नया चाइल्ड नोड बनाता है। |
| virtual [AppendChildElement](./appendchildelement/)(String, String, String, String) | निर्दिष्ट मान के साथ नामस्थान उपसर्ग, स्थानीय नाम और नामस्थान URI का उपयोग करके वर्तमान नोड के चाइल्ड नोड्स की सूची के अंत में एक नया चाइल्ड एलिमेंट नोड बनाता है। |
| virtual [CheckValidity](./checkvalidity/)(SharedPtr\<System::Xml::Schema::XmlSchemaSet\>, System::Xml::Schema::ValidationEventHandler) | जाँचता है कि [XPathNavigator](./) में XML डेटा प्रदान किए गए XML [Schema](../../system.xml.schema/) परिभाषा भाषा (XSD) स्कीमा के अनुरूप है। |
| virtual [Clone](./clone/)() | जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो यह इस [XPathNavigator](./) के समान नोड पर स्थित एक नया [XPathNavigator](./) बनाता है। |
| virtual [ComparePosition](./compareposition/)(SharedPtr\<XPathNavigator\>) | वर्तमान [XPathNavigator](./) की स्थिति की तुलना निर्दिष्ट [XPathNavigator](./) की स्थिति से करता है। |
| virtual [Compile](./compile/)(String) | एक [XPath](../) अभिव्यक्ति का प्रतिनिधित्व करने वाली स्ट्रिंग को संकलित करता है और एक [XPathExpression](../xpathexpression/) ऑब्जेक्ट लौटाता है। |
| virtual [CreateAttribute](./createattribute/)(String, String, String, String) | निर्दिष्ट मान के साथ नामस्थान उपसर्ग, स्थानीय नाम और नामस्थान URI का उपयोग करके वर्तमान एलिमेंट नोड पर एक एट्रिब्यूट नोड बनाता है। |
| virtual [CreateAttributes](./createattributes/)() | वर्तमान एलिमेंट पर नए एट्रिब्यूट बनाने के लिए उपयोग किए जाने वाले एक [XmlWriter](../../system.xml/xmlwriter/) ऑब्जेक्ट को लौटाता है। |
| [CreateNavigator](./createnavigator/)() override | [XPathNavigator](./) की एक प्रति लौटाता है। |
| virtual [DeleteRange](./deleterange/)(SharedPtr\<XPathNavigator\>) | वर्तमान नोड से लेकर निर्दिष्ट नोड तक के सहोदर नोड्स की एक श्रृंखला को हटाता है। |
| virtual [DeleteSelf](./deleteself/)() | वर्तमान नोड और उसके चाइल्ड नोड्स को हटाता है। |
| virtual [Evaluate](./evaluate/)(String) | निर्दिष्ट [XPath](../) अभिव्यक्ति का मूल्यांकन करता है और टाइप्ड परिणाम लौटाता है। |
| virtual [Evaluate](./evaluate/)(String, SharedPtr\<IXmlNamespaceResolver\>) | निर्दिष्ट [XPath](../) अभिव्यक्ति का मूल्यांकन करता है और टाइप्ड परिणाम लौटाता है, [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट का उपयोग करके [XPath](../) अभिव्यक्ति में नामस्थान उपसर्गों को हल करता है। |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>) | [XPathExpression](../xpathexpression/) का मूल्यांकन करता है और टाइप्ड परिणाम लौटाता है। |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) | प्रदान किए गए संदर्भ का उपयोग करके [XPathExpression](../xpathexpression/) का मूल्यांकन करता है, और टाइप्ड परिणाम लौटाता है। |
| virtual [get_BaseURI](./get_baseuri/)() | जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो यह वर्तमान नोड के लिए बेस URI प्राप्त करता है। |
| virtual [get_CanEdit](./get_canedit/)() | एक मान लौटाता है जो दर्शाता है कि क्या [XPathNavigator](./) अंतर्निहित XML डेटा को संपादित कर सकता है। |
| virtual [get_HasAttributes](./get_hasattributes/)() | एक मान लौटाता है जो दर्शाता है कि क्या वर्तमान नोड के पास कोई एट्रिब्यूट हैं। |
| virtual [get_HasChildren](./get_haschildren/)() | एक मान लौटाता है जो दर्शाता है कि क्या वर्तमान नोड के पास कोई चाइल्ड नोड्स हैं। |
| virtual [get_InnerXml](./get_innerxml/)() | वर्तमान नोड के चाइल्ड नोड्स का प्रतिनिधित्व करने वाला मार्कअप लौटाता है। |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो यह एक मान प्राप्त करता है जो दर्शाता है कि क्या वर्तमान नोड एक खाली एलिमेंट है जिसमें अंत टैग नहीं है। |
| [get_IsNode](./get_isnode/)() override | एक मान लौटाता है जो दर्शाता है कि क्या वर्तमान नोड एक [XPath](../) नोड का प्रतिनिधित्व करता है। |
| virtual [get_LocalName](./get_localname/)() | जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो यह वर्तमान नोड का [XPathNavigator::get_Name](./get_name/) बिना किसी नामस्थान उपसर्ग के प्राप्त करता है। |
| virtual [get_Name](./get_name/)() | जब डेराइव्ड क्लास में ओवरराइड किया जाता है, तो वर्तमान नोड का क्वालिफाइड नाम प्राप्त करता है। |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो वर्तमान नोड का नेमस्पेस URI प्राप्त करता है। |
| virtual [get_NameTable](./get_nametable/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो [XmlNameTable](../../system.xml/xmlnametable/) का [XPathNavigator](./) प्राप्त करता है। |
| static [get_NavigatorComparer](./get_navigatorcomparer/)() | एक [Collections::IEqualityComparer](../../system.collections/iequalitycomparer/) लौटाता है जिसका उपयोग [XPathNavigator](./) ऑब्जेक्ट्स की समानता तुलना के लिए किया जाता है। |
| virtual [get_NodeType](./get_nodetype/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो वर्तमान नोड का [XPathNodeType](../xpathnodetype/) प्राप्त करता है। |
| virtual [get_OuterXml](./get_outerxml/)() | वर्तमान नोड और उसके चाइल्ड नोड्स के उद्घाटन और समापन टैग्स का प्रतिनिधित्व करने वाला मार्कअप लौटाता है। |
| virtual [get_Prefix](./get_prefix/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो वर्तमान नोड से जुड़ा नेमस्पेस उपसर्ग प्राप्त करता है। |
| virtual [get_SchemaInfo](./get_schemainfo/)() | वर्तमान नोड को स्कीमा वैधता के परिणामस्वरूप सौंपा गया स्कीमा जानकारी लौटाता है। |
| [get_TypedValue](./get_typedvalue/)() override | वर्तमान नोड को सबसे उपयुक्त प्रकार के बॉक्स्ड ऑब्जेक्ट के रूप में लौटाता है। |
| virtual [get_UnderlyingObject](./get_underlyingobject/)() | [XPathNavigator](./) कार्यान्वयन द्वारा उपयोग किया जाता है जो स्टोर पर एक "वर्चुअलाइज़्ड" XML दृश्य प्रदान करते हैं, ताकि अंतर्निहित ऑब्जेक्ट्स तक पहुंच प्रदान की जा सके। |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | वर्तमान नोड का मान एक [Boolean](../../system/boolean/) के रूप में लौटाता है। |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | वर्तमान नोड का मान एक [DateTime](../../system/datetime/) के रूप में लौटाता है। |
| [get_ValueAsDouble](./get_valueasdouble/)() override | वर्तमान नोड का मान एक [Double](../../system/double/) के रूप में लौटाता है। |
| [get_ValueAsInt](./get_valueasint/)() override | वर्तमान नोड का मान एक [Int32](../../system/int32/) के रूप में लौटाता है। |
| [get_ValueAsLong](./get_valueaslong/)() override | वर्तमान नोड का मान एक [Int64](../../system/int64/) के रूप में लौटाता है। |
| [get_ValueType](./get_valuetype/)() override | वर्तमान नोड का प्रकार लौटाता है। |
| virtual [get_XmlLang](./get_xmllang/)() | वर्तमान नोड के लिए **xml:lang** स्कोप लौटाता है। |
| [get_XmlType](./get_xmltype/)() override | वर्तमान नोड के लिए XmlSchemaType जानकारी लौटाता है। |
| virtual [GetAttribute](./getattribute/)(String, String) | वापस देता है निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले गुण का मान। |
| virtual [GetNamespace](./getnamespace/)(String) | निर्दिष्ट स्थानीय नाम के अनुरूप नेमस्पेस नोड का मान लौटाता है। |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | वर्तमान नोड के इन-स्कोप नेमस्पेस लौटाता है। |
| virtual [InsertAfter](./insertafter/)() | एक [XmlWriter](../../system.xml/xmlwriter/) ऑब्जेक्ट लौटाता है जिसका उपयोग वर्तमान चयनित नोड के बाद एक नया सिब्लिंग नोड बनाने के लिए किया जाता है। |
| virtual [InsertAfter](./insertafter/)(String) | निर्दिष्ट XML स्ट्रिंग का उपयोग करके वर्तमान चयनित नोड के बाद एक नया सिब्लिंग नोड बनाता है। |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlReader\>) | निर्दिष्ट [XmlReader](../../system.xml/xmlreader/) ऑब्जेक्ट की XML सामग्री का उपयोग करके वर्तमान चयनित नोड के बाद एक नया सिब्लिंग नोड बनाता है। |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XPathNavigator\>) | निर्दिष्ट [XPathNavigator](./) ऑब्जेक्ट के नोड्स का उपयोग करके वर्तमान नोड के बाद एक नया सिब्लिंग नोड बनाता है। |
| virtual [InsertBefore](./insertbefore/)() | एक [XmlWriter](../../system.xml/xmlwriter/) ऑब्जेक्ट लौटाता है जिसका उपयोग वर्तमान चयनित नोड से पहले एक नया सिब्लिंग नोड बनाने के लिए किया जाता है। |
| virtual [InsertBefore](./insertbefore/)(String) | निर्दिष्ट XML स्ट्रिंग का उपयोग करके वर्तमान चयनित नोड से पहले एक नया सिब्लिंग नोड बनाता है। |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlReader\>) | निर्दिष्ट [XmlReader](../../system.xml/xmlreader/) ऑब्जेक्ट की XML सामग्री का उपयोग करके वर्तमान चयनित नोड से पहले एक नया सिब्लिंग नोड बनाता है। |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XPathNavigator\>) | निर्दिष्ट [XPathNavigator](./) के नोड्स का उपयोग करके वर्तमान चयनित नोड से पहले एक नया सिब्लिंग नोड बनाता है। |
| virtual [InsertElementAfter](./insertelementafter/)(String, String, String, String) | निर्दिष्ट नेमस्पेस प्रीफ़िक्स, स्थानीय नाम और नेमस्पेस URI का उपयोग करके, तथा निर्दिष्ट मान के साथ, वर्तमान नोड के बाद एक नया सिब्लिंग एलिमेंट बनाता है। |
| virtual [InsertElementBefore](./insertelementbefore/)(String, String, String, String) | वर्तमान नोड से पहले निर्दिष्ट नेमस्पेस प्रीफ़िक्स, स्थानीय नाम, और नेमस्पेस URI का उपयोग करके नया सिब्लिंग एलिमेंट बनाता है, निर्दिष्ट मान के साथ। |
| virtual [IsDescendant](./isdescendant/)(SharedPtr\<XPathNavigator\>) | निर्धारित करता है कि निर्दिष्ट [XPathNavigator](./) वर्तमान [XPathNavigator](./) का वंशज है या नहीं। |
| virtual [IsSamePosition](./issameposition/)(SharedPtr\<XPathNavigator\>) | जब व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्धारित करता है कि वर्तमान [XPathNavigator](./) निर्दिष्ट [XPathNavigator](./) के समान स्थिति में है या नहीं। |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | निर्दिष्ट प्रीफ़िक्स के लिए नेमस्पेस URI लौटाता है। |
| [LookupPrefix](./lookupprefix/)(const String\&) override | निर्दिष्ट नेमस्पेस URI के लिए घोषित प्रीफ़िक्स लौटाता है। |
| virtual [Matches](./matches/)(SharedPtr\<XPathExpression\>) | निर्धारित करता है कि वर्तमान नोड निर्दिष्ट [XPathExpression](../xpathexpression/) से मेल खाता है या नहीं। |
| virtual [Matches](./matches/)(String) | निर्धारित करता है कि वर्तमान नोड निर्दिष्ट [XPath](../) अभिव्यक्ति से मेल खाता है या नहीं। |
| virtual [MoveTo](./moveto/)(SharedPtr\<XPathNavigator\>) | जब व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो [XPathNavigator](./) को निर्दिष्ट [XPathNavigator](./) के समान स्थिति में ले जाता है। |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | [XPathNavigator](./) को मिलते-जुलते स्थानीय नाम और नेमस्पेस URI वाले एट्रिब्यूट पर ले जाता है। |
| virtual [MoveToChild](./movetochild/)(String, String) | [XPathNavigator](./) को निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले चाइल्ड नोड पर ले जाता है। |
| virtual [MoveToChild](./movetochild/)(XPathNodeType) | [XPathNavigator](./) को निर्दिष्ट [XPathNodeType](../xpathnodetype/) के चाइल्ड नोड पर ले जाता है। |
| virtual [MoveToFirst](./movetofirst/)() | [XPathNavigator](./) को वर्तमान नोड के पहले सिब्लिंग नोड पर ले जाता है। |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | जब व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो [XPathNavigator](./) को वर्तमान नोड के पहले एट्रिब्यूट पर ले जाता है। |
| virtual [MoveToFirstChild](./movetofirstchild/)() | जब व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो [XPathNavigator](./) को वर्तमान नोड के पहले चाइल्ड नोड पर ले जाता है। |
| virtual [MoveToFirstNamespace](./movetofirstnamespace/)(XPathNamespaceScope) | जब व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो [XPathNavigator](./) को निर्दिष्ट [XPathNamespaceScope](../xpathnamespacescope/) से मेल खाने वाले पहले नेमस्पेस नोड पर ले जाता है। |
| [MoveToFirstNamespace](./movetofirstnamespace/)() | [XPathNavigator](./) को वर्तमान नोड के पहले नेमस्पेस नोड पर ले जाता है। |
| virtual [MoveToFollowing](./movetofollowing/)(String, String) | [XPathNavigator](./) को दस्तावेज़ क्रम में निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले एलिमेंट पर ले जाता है। |
| virtual [MoveToFollowing](./movetofollowing/)(String, String, SharedPtr\<XPathNavigator\>) | [XPathNavigator](./) को दस्तावेज़ क्रम में निर्दिष्ट सीमा तक, निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले एलिमेंट पर ले जाता है। |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType) | [XPathNavigator](./) को दस्तावेज़ क्रम में निर्दिष्ट [XPathNodeType](../xpathnodetype/) के अगले एलिमेंट पर ले जाता है। |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType, SharedPtr\<XPathNavigator\>) | [XPathNavigator](./) को दस्तावेज़ क्रम में निर्दिष्ट सीमा तक, निर्दिष्ट [XPathNodeType](../xpathnodetype/) के अगले एलिमेंट पर ले जाता है। |
| virtual [MoveToId](./movetoid/)(String) | जब व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो **ID** प्रकार के एट्रिब्यूट वाले नोड पर ले जाता है, जिसका मान निर्दिष्ट [String](../../system/string/) से मेल खाता है। |
| virtual [MoveToNamespace](./movetonamespace/)(String) | [XPathNavigator](./) को निर्दिष्ट नेमस्पेस प्रीफ़िक्स वाले नेमस्पेस नोड पर ले जाता है। |
| virtual [MoveToNext](./movetonext/)() | जब व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो [XPathNavigator](./) को वर्तमान नोड के अगले सिब्लिंग नोड पर ले जाता है। |
| virtual [MoveToNext](./movetonext/)(String, String) | [XPathNavigator](./) को निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले अगले सिब्लिंग नोड पर ले जाता है। |
| virtual [MoveToNext](./movetonext/)(XPathNodeType) | [XPathNavigator](./) को वर्तमान नोड के अगले सिब्लिंग नोड पर ले जाता है, जो निर्दिष्ट [XPathNodeType](../xpathnodetype/) से मेल खाता है। |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | जब व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो [XPathNavigator](./) को अगले एट्रिब्यूट पर ले जाता है। |
| virtual [MoveToNextNamespace](./movetonextnamespace/)(XPathNamespaceScope) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो यह [XPathNavigator](./) को निर्दिष्ट किए गए [XPathNamespaceScope](../xpathnamespacescope/) से मेल खाने वाले अगले नेमस्पेस नोड पर ले जाता है। |
| [MoveToNextNamespace](./movetonextnamespace/)() | [XPathNavigator](./) को अगले नेमस्पेस नोड पर ले जाता है। |
| virtual [MoveToParent](./movetoparent/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो यह [XPathNavigator](./) को वर्तमान नोड के पैरेंट नोड पर ले जाता है। |
| virtual [MoveToPrevious](./movetoprevious/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो यह [XPathNavigator](./) को वर्तमान नोड के पिछले सिब्लिंग नोड पर ले जाता है। |
| virtual [MoveToRoot](./movetoroot/)() | [XPathNavigator](./) को उस रूट नोड पर ले जाता है जिससे वर्तमान नोड संबंधित है। |
| virtual [PrependChild](./prependchild/)() | एक [XmlWriter](../../system.xml/xmlwriter/) ऑब्जेक्ट लौटाता है जिसका उपयोग वर्तमान नोड के चाइल्ड नोड्स की सूची की शुरुआत में एक नया चाइल्ड नोड बनाने के लिए किया जाता है। |
| virtual [PrependChild](./prependchild/)(String) | निर्दिष्ट XML स्ट्रिंग का उपयोग करके वर्तमान नोड के चाइल्ड नोड्स की सूची की शुरुआत में एक नया चाइल्ड नोड बनाता है। |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlReader\>) | निर्दिष्ट [XmlReader](../../system.xml/xmlreader/) ऑब्जेक्ट की XML सामग्री का उपयोग करके वर्तमान नोड के चाइल्ड नोड्स की सूची की शुरुआत में एक नया चाइल्ड नोड बनाता है। |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XPathNavigator\>) | निर्दिष्ट [XPathNavigator](./) ऑब्जेक्ट के नोड्स का उपयोग करके वर्तमान नोड के चाइल्ड नोड्स की सूची की शुरुआत में एक नया चाइल्ड नोड बनाता है। |
| virtual [PrependChildElement](./prependchildelement/)(String, String, String, String) | निर्दिष्ट मान के साथ नेमस्पेस प्रीफ़िक्स, लोकल नाम, और नेमस्पेस URI का उपयोग करके वर्तमान नोड के चाइल्ड नोड्स की सूची की शुरुआत में एक नया चाइल्ड एलिमेंट बनाता है। |
| virtual [ReadSubtree](./readsubtree/)() | एक [XmlReader](../../system.xml/xmlreader/) ऑब्जेक्ट लौटाता है जिसमें वर्तमान नोड और उसके चाइल्ड नोड्स शामिल होते हैं। |
| virtual [ReplaceRange](./replacerange/)(SharedPtr\<XPathNavigator\>) | वर्तमान नोड से निर्दिष्ट नोड तक के सिब्लिंग नोड्स की रेंज को बदलता है। |
| virtual [ReplaceSelf](./replaceself/)(String) | वर्तमान नोड को निर्दिष्ट स्ट्रिंग की सामग्री से बदलता है। |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XmlReader\>) | वर्तमान नोड को निर्दिष्ट [XmlReader](../../system.xml/xmlreader/) ऑब्जेक्ट की सामग्री से बदलता है। |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XPathNavigator\>) | वर्तमान नोड को निर्दिष्ट [XPathNavigator](./) ऑब्जेक्ट की सामग्री से बदलता है। |
| virtual [Select](./select/)(String) | निर्दिष्ट [XPath](../) अभिव्यक्ति का उपयोग करके एक नोड सेट चुनता है। |
| virtual [Select](./select/)(String, SharedPtr\<IXmlNamespaceResolver\>) | निर्दिष्ट [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट का उपयोग करके नेमस्पेस प्रीफ़िक्स को हल करने के लिए निर्दिष्ट [XPath](../) अभिव्यक्ति के साथ एक नोड सेट चुनता है। |
| virtual [Select](./select/)(SharedPtr\<XPathExpression\>) | निर्दिष्ट [XPathExpression](../xpathexpression/) का उपयोग करके एक नोड सेट चुनता है। |
| virtual [SelectAncestors](./selectancestors/)(XPathNodeType, bool) | वर्तमान नोड के सभी ऐसे पूर्वज नोड्स को चुनता है जिनका [XPathNodeType](../xpathnodetype/) मेल खाता है। |
| virtual [SelectAncestors](./selectancestors/)(String, String, bool) | वर्तमान नोड के सभी ऐसे पूर्वज नोड्स को चुनता है जिनका निर्दिष्ट लोकल नाम और नेमस्पेस URI हो। |
| virtual [SelectChildren](./selectchildren/)(XPathNodeType) | वर्तमान नोड के सभी ऐसे चाइल्ड नोड्स को चुनता है जिनका [XPathNodeType](../xpathnodetype/) मेल खाता है। |
| virtual [SelectChildren](./selectchildren/)(String, String) | वर्तमान नोड के सभी ऐसे चाइल्ड नोड्स को चुनता है जिनका लोकल नाम और नेमस्पेस URI निर्दिष्ट है। |
| virtual [SelectDescendants](./selectdescendants/)(XPathNodeType, bool) | वर्तमान नोड के सभी ऐसे वंशज नोड्स को चुनता है जिनका [XPathNodeType](../xpathnodetype/) मेल खाता है। |
| virtual [SelectDescendants](./selectdescendants/)(String, String, bool) | वर्तमान नोड के सभी ऐसे वंशज नोड्स को चुनता है जिनका लोकल नाम और नेमस्पेस URI निर्दिष्ट है। |
| virtual [SelectSingleNode](./selectsinglenode/)(String) | निर्दिष्ट [XPath](../) क्वेरी का उपयोग करके [XPathNavigator](./) में एक एकल नोड चुनता है। |
| virtual [SelectSingleNode](./selectsinglenode/)(String, SharedPtr\<IXmlNamespaceResolver\>) | निर्दिष्ट [XPath](../) क्वेरी का उपयोग करके [XPathNavigator](./) ऑब्जेक्ट में एकल नोड का चयन करता है, तथा नेमस्पेस प्रीफ़िक्स को हल करने के लिए निर्दिष्ट [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट का उपयोग करता है। |
| virtual [SelectSingleNode](./selectsinglenode/)(SharedPtr\<XPathExpression\>) | निर्दिष्ट [XPathExpression](../xpathexpression/) ऑब्जेक्ट का उपयोग करके [XPathNavigator](./) में एकल नोड का चयन करता है। |
| virtual [set_InnerXml](./set_innerxml/)(String) | वर्तमान नोड के चाइल्ड नोड्स को दर्शाने वाले मार्कअप को सेट करता है। |
| virtual [set_OuterXml](./set_outerxml/)(String) | वर्तमान नोड और उसके चाइल्ड नोड्स के उद्घाटन और समापन टैग को दर्शाने वाले मार्कअप को सेट करता है। |
| virtual [SetTypedValue](./settypedvalue/)(SharedPtr\<Object\>) | वर्तमान नोड का टाइप्ड वैल्यू सेट करता है। |
| virtual [SetValue](./setvalue/)(String) | वर्तमान नोड का मान सेट करता है। |
| [ToString](./tostring/)() const override | वापस देता है वर्तमान नोड का पाठ मान। |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | निर्दिष्ट [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट का उपयोग करके नेमस्पेस प्रीफ़िक्स को हल करते हुए, निर्दिष्ट टाइप के रूप में वर्तमान नोड का मान लौटाता है। |
| virtual [WriteSubtree](./writesubtree/)(SharedPtr\<XmlWriter\>) | निर्दिष्ट [XmlWriter](../../system.xml/xmlwriter/) ऑब्जेक्ट में वर्तमान नोड और उसके चाइल्ड नोड्स को स्ट्रीम करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## संबंधित देखें

* Class [XPathItem](../xpathitem/)
* Class [IXPathNavigable](../ixpathnavigable/)
* Class [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
