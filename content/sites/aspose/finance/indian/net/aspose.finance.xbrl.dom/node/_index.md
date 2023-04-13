---
title: Class Node
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Xbrl.Dom.Node कक्ष. नड वर्ग संपूर्ण दस्तवेज़ वस्तु मडल के लए प्रथमक डेट प्रकर है यह दस्तवेज़ ट्र में एकल नड क प्रतनधत्व करत है
type: docs
weight: 7460
url: /hi/net/aspose.finance.xbrl.dom/node/
---
## Node class

नोड वर्ग संपूर्ण दस्तावेज़ वस्तु मॉडल के लिए प्राथमिक डेटा प्रकार है। यह दस्तावेज़ ट्री में एकल नोड का प्रतिनिधित्व करता है।

```csharp
public abstract class Node
```

## गुण

| नाम | विवरण |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | इस नोड का पूर्ण आधार यूआरआई प्राप्त करता है या यदि कार्यान्वयन पूर्ण यूआरआई प्राप्त करने में सक्षम नहीं था तो शून्य हो जाता है। |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | चाइल्ड नोड प्राप्त करता है। |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | इस नोड का पहला चाइल्ड प्राप्त करता है। यदि ऐसा कोई नोड नहीं है, तो यह शून्य हो जाता है। |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | प्राप्त करता है कि क्या इस नोड के कोई बच्चे हैं। |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | इस नोड का अंतिम चाइल्ड प्राप्त करता है। यदि ऐसा कोई नोड नहीं है, तो यह शून्य हो जाता है। |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname/) { get; } | इस नोड के योग्य नाम का स्थानीय भाग प्राप्त करता है। |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri/) { get; } | इस नोड का नाम स्थान URI प्राप्त करता है। |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | इस नोड के तुरंत बाद नोड प्राप्त करता है। यदि ऐसा कोई नोड नहीं है, तो यह शून्य हो जाता है। |
| abstract [NodeName](../../aspose.finance.xbrl.dom/node/nodename/) { get; } | इसके प्रकार के आधार पर नोड नाम प्राप्त करता है। |
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

## खेत

| नाम | विवरण |
| --- | --- |
| const [COMMENT_NODE](../../aspose.finance.xbrl.dom/node/comment_node/) | टिप्पणी नोड प्रकार। |
| const [DOCUMENT_NODE](../../aspose.finance.xbrl.dom/node/document_node/) | दस्तावेज़ नोड प्रकार. |
| const [DOCUMENT_TYPE_NODE](../../aspose.finance.xbrl.dom/node/document_type_node/) | दस्तावेज़ प्रकार नोड प्रकार. |
| const [ELEMENT_NODE](../../aspose.finance.xbrl.dom/node/element_node/) | तत्व नोड प्रकार। |
| const [PROCESSING_INSTRUCTION_NODE](../../aspose.finance.xbrl.dom/node/processing_instruction_node/) | प्रोसेसिंग निर्देश नोड प्रकार. |
| const [TEXT_NODE](../../aspose.finance.xbrl.dom/node/text_node/) | टेक्स्ट नोड प्रकार। |

### यह सभी देखें

* नाम स्थान [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* सभा [Aspose.Finance](../../)


