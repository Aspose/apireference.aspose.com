---
title: Class Text
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Xbrl.Dom.Text कक्ष. वर्ग पठ्य समग्र क प्रतनधत्व करत है
type: docs
weight: 7490
url: /hi/net/aspose.finance.xbrl.dom/text/
---
## Text class

वर्ग पाठ्य सामग्री का प्रतिनिधित्व करता है।

```csharp
public class Text : CharacterData
```

## गुण

| नाम | विवरण |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | इस नोड का पूर्ण आधार यूआरआई प्राप्त करता है या यदि कार्यान्वयन पूर्ण यूआरआई प्राप्त करने में सक्षम नहीं था तो शून्य हो जाता है। |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | चाइल्ड नोड प्राप्त करता है। |
| [Data](../../aspose.finance.xbrl.dom/characterdata/data/) { get; set; } | इस इंटरफ़ेस को लागू करने वाले नोड के वर्ण डेटा को प्राप्त या सेट करता है। |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | इस नोड का पहला चाइल्ड प्राप्त करता है। यदि ऐसा कोई नोड नहीं है, तो यह शून्य हो जाता है। |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes/) { get; } | प्राप्त करता है कि क्या इस नोड के कोई बच्चे हैं। |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild/) { get; } | इस नोड का अंतिम चाइल्ड प्राप्त करता है। यदि ऐसा कोई नोड नहीं है, तो यह शून्य हो जाता है। |
| [Length](../../aspose.finance.xbrl.dom/characterdata/length/) { get; } | डेटा के माध्यम से उपलब्ध 16-बिट इकाइयों की संख्या प्राप्त करता है। इसका मान शून्य हो सकता है, अर्थात, कैरेक्टरडेटा नोड खाली हो सकते हैं। |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname/) { get; } | इस नोड के योग्य नाम का स्थानीय भाग प्राप्त करता है। |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri/) { get; } | इस नोड का नाम स्थान URI प्राप्त करता है। |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling/) { get; } | इस नोड के तुरंत बाद नोड प्राप्त करता है। यदि ऐसा कोई नोड नहीं है, तो यह शून्य हो जाता है। |
| override [NodeName](../../aspose.finance.xbrl.dom/text/nodename/) { get; } | इस पाठ का नाम प्राप्त करता है। |
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
| virtual [AppendData](../../aspose.finance.xbrl.dom/characterdata/appenddata/)(string) | नोड के वर्ण डेटा के अंत में स्ट्रिंग जोड़ता है। |
| virtual [DeleteData](../../aspose.finance.xbrl.dom/characterdata/deletedata/)(int, int) | नोड से सामग्री की एक श्रेणी को हटाता है। |
| virtual [InsertData](../../aspose.finance.xbrl.dom/characterdata/insertdata/)(int, string) | निर्दिष्ट ऑफसेट पर एक स्ट्रिंग सम्मिलित करता है। |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | बच्चों की सूची से पुराने बच्चे द्वारा इंगित चाइल्ड नोड को हटाता है। |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | चिल्ड्रन की सूची में चाइल्ड नोड ओल्ड चाइल्ड को नए चाइल्ड से बदलता है, और पुराना चाइल्ड नोड लौटाता है। |
| virtual [ReplaceData](../../aspose.finance.xbrl.dom/characterdata/replacedata/)(int, int, string) | निर्दिष्ट स्ट्रिंग के साथ निर्दिष्ट ऑफ़सेट पर शुरू होने वाले वर्णों को प्रतिस्थापित करता है। |
| virtual [Substring](../../aspose.finance.xbrl.dom/characterdata/substring/)(int, int) | नोड से डेटा की एक श्रेणी निकालता है। |

### यह सभी देखें

* class [CharacterData](../characterdata/)
* नाम स्थान [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* सभा [Aspose.Finance](../../)


