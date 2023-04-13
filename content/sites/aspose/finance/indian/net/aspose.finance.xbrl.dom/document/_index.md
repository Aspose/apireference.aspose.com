---
title: Class Document
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Xbrl.Dom.Document कक्ष. दस्तवेज़ संपूर्ण इनलइन xbrl दस्तवेज़ क प्रतनधत्व करत है संकल्पनत्मक रूप से यह दस्तवेज़ वृक्ष क मूल है और दस्तवेज़ के डेट तक प्रथमक पहुँच प्रदन करत है
type: docs
weight: 6690
url: /hi/net/aspose.finance.xbrl.dom/document/
---
## Document class

दस्तावेज़ संपूर्ण इनलाइन xbrl दस्तावेज़ का प्रतिनिधित्व करता है। संकल्पनात्मक रूप से, यह दस्तावेज़ वृक्ष का मूल है, और दस्तावेज़ के डेटा तक प्राथमिक पहुँच प्रदान करता है।

```csharp
public class Document : Node
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [Document](document/)() | डिफ़ॉल्ट कंस्ट्रक्टर। |

## गुण

| नाम | विवरण |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | इस नोड का पूर्ण आधार यूआरआई प्राप्त करता है या यदि कार्यान्वयन पूर्ण यूआरआई प्राप्त करने में सक्षम नहीं था तो शून्य हो जाता है। |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset/) { get; } | दस्तावेज़ की एन्कोडिंग प्राप्त करता है। |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements/) { get; } | बाल तत्व प्राप्त करता है। |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | चाइल्ड नोड प्राप्त करता है। |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype/) { get; } | दस्तावेज़ सामग्री प्रकार प्राप्त करता है। |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement/) { get; } | यह एक सुविधा विशेषता है जो चाइल्ड नोड तक सीधी पहुंच की अनुमति देता है जो दस्तावेज़ का दस्तावेज़ तत्व है। |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi/) { get; } | दस्तावेज़ यूआरआई प्राप्त करता है। |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | इस नोड का पहला चाइल्ड प्राप्त करता है। यदि ऐसा कोई नोड नहीं है, तो यह शून्य हो जाता है। |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | प्राप्त करता है कि क्या इस नोड के कोई बच्चे हैं। |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | इस नोड का अंतिम चाइल्ड प्राप्त करता है। यदि ऐसा कोई नोड नहीं है, तो यह शून्य हो जाता है। |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname/) { get; } | इस नोड के योग्य नाम का स्थानीय भाग प्राप्त करता है। |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri/) { get; } | इस नोड का नाम स्थान URI प्राप्त करता है। |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | इस नोड के तुरंत बाद नोड प्राप्त करता है। यदि ऐसा कोई नोड नहीं है, तो यह शून्य हो जाता है। |
| override [NodeName](../../aspose.finance.xbrl.dom/document/nodename/) { get; } | दस्तावेज़ का नोड नाम प्राप्त करता है। |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype/) { get; } | नोड प्रकार प्राप्त करता है। |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue/) { get; set; } | इसके प्रकार के आधार पर, इस नोड का मान प्राप्त या सेट करता है। |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument/) { get; } | इस नोड से संबद्ध दस्तावेज़ वस्तु प्राप्त करता है। |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode/) { get; } | मूल नोड प्राप्त करता है। |
| virtual [Prefix](../../aspose.finance.xbrl.dom/node/prefix/) { get; set; } | इस नोड के नामस्थान उपसर्ग को प्राप्त या सेट करता है। |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling/) { get; } | इस नोड से ठीक पहले वाला नोड प्राप्त करता है। यदि ऐसा कोई नोड नहीं है, तो यह शून्य हो जाता है। |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent/) { get; set; } | इस नोड और उसके वंशजों की टेक्स्ट सामग्री प्राप्त या सेट करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild/)(Node) | नोड न्यूचाइल्ड को इस नोड के चिल्ड्रन की सूची के अंत में जोड़ता है। |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | बच्चों की सूची से पुराने बच्चे द्वारा इंगित चाइल्ड नोड को हटाता है। |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | चिल्ड्रन की सूची में चाइल्ड नोड ओल्ड चाइल्ड को नए चाइल्ड से बदलता है, और पुराना चाइल्ड नोड लौटाता है। |

### यह सभी देखें

* class [Node](../node/)
* नाम स्थान [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* सभा [Aspose.Finance](../../)


