---
title: Class InlineXbrlDocument
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Xbrl.Inline.InlineXbrlDocument कक्ष. एक इनलइन XBRL दस्तवेज़.
type: docs
weight: 7790
url: /hi/net/aspose.finance.xbrl.inline/inlinexbrldocument/
---
## InlineXbrlDocument class

एक इनलाइन XBRL दस्तावेज़.

```csharp
public class InlineXbrlDocument : Document
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [InlineXbrlDocument](inlinexbrldocument/#constructor)(Stream) | का एक नया उदाहरण शुरू करता है`InlineXbrlDocument` क्लास और इसे एक स्ट्रीम के साथ खोलता है.. |
| [InlineXbrlDocument](inlinexbrldocument/#constructor_2)(string) | का एक नया उदाहरण शुरू करता है`InlineXbrlDocument` वर्ग और एक फ़ाइल खोलें. |
| [InlineXbrlDocument](inlinexbrldocument/#constructor_1)(Stream, LoadOptions) | का एक नया उदाहरण शुरू करता है`InlineXbrlDocument` क्लास और इसे स्ट्रीम के साथ खोलता है। |
| [InlineXbrlDocument](inlinexbrldocument/#constructor_3)(string, LoadOptions) | का एक नया उदाहरण शुरू करता है`InlineXbrlDocument` वर्ग और एक फ़ाइल खोलें. |

## गुण

| नाम | विवरण |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/arcrolereferences/) { get; } | का संग्रह प्राप्त करता है[`ArcroleReference`](../../aspose.finance.xbrl/arcrolereference/) इनलाइन XBRL दस्तावेज़ में. |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri/) { get; } | इस नोड का पूर्ण आधार यूआरआई प्राप्त करता है या यदि कार्यान्वयन पूर्ण यूआरआई प्राप्त करने में सक्षम नहीं था तो शून्य हो जाता है। |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset/) { get; } | दस्तावेज़ की एन्कोडिंग प्राप्त करता है। |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements/) { get; } | बाल तत्व प्राप्त करता है। |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes/) { get; } | चाइल्ड नोड प्राप्त करता है। |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype/) { get; } | दस्तावेज़ सामग्री प्रकार प्राप्त करता है। |
| [Contexts](../../aspose.finance.xbrl.inline/inlinexbrldocument/contexts/) { get; } | का संग्रह प्राप्त करता है[`Context`](../../aspose.finance.xbrl/context/) इनलाइन XBRL दस्तावेज़ में. |
| [Continuations](../../aspose.finance.xbrl.inline/inlinexbrldocument/continuations/) { get; } | का संग्रह प्राप्त करता है[`InlineContinuation`](../inlinecontinuation/) इनलाइन XBRL दस्तावेज़ में. |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement/) { get; } | यह एक सुविधा विशेषता है जो चाइल्ड नोड तक सीधी पहुंच की अनुमति देता है जो दस्तावेज़ का दस्तावेज़ तत्व है। |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi/) { get; } | दस्तावेज़ यूआरआई प्राप्त करता है। |
| [Facts](../../aspose.finance.xbrl.inline/inlinexbrldocument/facts/) { get; } | का संग्रह प्राप्त करता है[`InlineFact`](../inlinefact/) इनलाइन XBRL दस्तावेज़ में. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild/) { get; } | इस नोड का पहला चाइल्ड प्राप्त करता है। यदि ऐसा कोई नोड नहीं है, तो यह शून्य हो जाता है। |
| [Footnotes](../../aspose.finance.xbrl.inline/inlinexbrldocument/footnotes/) { get; } | का संग्रह प्राप्त करता है[`InlineFootnote`](../inlinefootnote/) इनलाइन XBRL दस्तावेज़ में. |
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
| [References](../../aspose.finance.xbrl.inline/inlinexbrldocument/references/) { get; } | हो जाता है[`InlineReferences`](../inlinereferences/) इनलाइन XBRL दस्तावेज़ में. |
| [Relationships](../../aspose.finance.xbrl.inline/inlinexbrldocument/relationships/) { get; } | का संग्रह प्राप्त करता है[`InlineRelationship`](../inlinerelationship/) इनलाइन XBRL दस्तावेज़ में. |
| [RoleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/rolereferences/) { get; } | का संग्रह प्राप्त करता है[`RoleReference`](../../aspose.finance.xbrl/rolereference/) इनलाइन XBRL दस्तावेज़ में. |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent/) { get; set; } | इस नोड और उसके वंशजों की टेक्स्ट सामग्री प्राप्त या सेट करता है। |
| [Units](../../aspose.finance.xbrl.inline/inlinexbrldocument/units/) { get; } | का संग्रह प्राप्त करता है[`Unit`](../../aspose.finance.xbrl/unit/) इनलाइन XBRL दस्तावेज़ में. |
| [ValidationErrors](../../aspose.finance.xbrl.inline/inlinexbrldocument/validationerrors/) { get; set; } | का संग्रह प्राप्त करता है[`ValidationError`](../../aspose.finance.xbrl.validator/validationerror/) इनलाइन XBRL दस्तावेज़ में. |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild/)(Node) | नोड न्यूचाइल्ड को इस नोड के चिल्ड्रन की सूची के अंत में जोड़ता है। |
| [CreateHtmlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createhtmlelement/)(string, string) | एक एचटीएमएल एलिमेंट बनाता है। |
| [CreateInlineXbrlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createinlinexbrlelement/)(string, string) | एक इनलाइन xbrl elment बनाता है। |
| [CreateXbrlInstanceElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrlinstanceelement/)(string, string) | एक xbrl उदाहरण elment बनाता है। |
| [CreateXbrlLinkbaseElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrllinkbaseelement/)(string, string) | एक xbrl लिंकबेस एल्मेंट बनाता है। |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl/#exporttoxbrl)() | XbrlDocument ऑब्जेक्ट में निर्यात करें। |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl/#exporttoxbrl_1)(Stream) | xbrl स्ट्रीम में निर्यात करें। |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl/#exporttoxbrl_2)(string) | xbrl फ़ाइल में निर्यात करें। |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getarcroletypebyuri/)(string) | ArcroleType प्राप्त करता है जिसमें निर्दिष्ट uri. है |
| [GetConceptById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyid/)(string) | उस संदर्भ को प्राप्त करता है जिसमें निर्दिष्ट आईडी है। |
| [GetConceptByLoc](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyloc/)(Loc) | लोकेटर द्वारा अवधारणा प्राप्त करता है। |
| [GetConceptByName](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyname/)(string) | उस अवधारणा को प्राप्त करता है जिसका निर्दिष्ट नाम है। |
| [GetContextById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontextbyid/)(string) | उस संदर्भ को प्राप्त करता है जिसमें निर्दिष्ट आईडी है। |
| [GetContinuationChainByContinuationReference](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontinuationchainbycontinuationreference/)(string) | निरंतरता संदर्भ के अनुसार निरंतरता श्रृंखला प्राप्त करता है। |
| [GetRoleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getroletypebyuri/)(string) | रोलटाइप प्राप्त करता है जिसमें निर्दिष्ट यूरी है। |
| [GetUnitById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getunitbyid/)(string) | निर्दिष्ट आईडी वाली इकाई प्राप्त करता है। |
| [IsValid](../../aspose.finance.xbrl.inline/inlinexbrldocument/isvalid/)() | जाँचता है कि क्या यह इनलाइन XBRL दस्तावेज़ मान्य है. |
| [RefreshInlineXbrlObjects](../../aspose.finance.xbrl.inline/inlinexbrldocument/refreshinlinexbrlobjects/)() | यदि DOM ट्री में इनलाइन Xbrl तत्वों को जोड़ें, अपडेट करें, हटाएं, इनलाइन xbrl ऑब्जेक्ट्स को रीफ्रेश करने के लिए इस विधि को कॉल किया जाना चाहिए। |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild/)(Node) | बच्चों की सूची से पुराने बच्चे द्वारा इंगित चाइल्ड नोड को हटाता है। |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild/)(Node, Node) | चिल्ड्रन की सूची में चाइल्ड नोड ओल्ड चाइल्ड को नए चाइल्ड से बदलता है, और पुराना चाइल्ड नोड लौटाता है। |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save)(Stream) | इनलाइन xbrl फ़ाइल बनाता है और स्ट्रीम में सहेजता है। |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save_2)(string) | इनलाइन xbrl फ़ाइल बनाता है और डिस्क में सहेजता है। |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save_1)(Stream, SaveOptions) | इनलाइन xbrl फ़ाइल बनाता है और स्ट्रीम में सहेजता है। |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save/#save_3)(string, SaveOptions) | इनलाइन xbrl फ़ाइल बनाता है और डिस्क में सहेजता है। |
| [Validate](../../aspose.finance.xbrl.inline/inlinexbrldocument/validate/)() | इस इनलाइन XBRL दस्तावेज़ को मान्य करता है। |

### यह सभी देखें

* class [Document](../../aspose.finance.xbrl.dom/document/)
* नाम स्थान [Aspose.Finance.Xbrl.Inline](../../aspose.finance.xbrl.inline/)
* सभा [Aspose.Finance](../../)


