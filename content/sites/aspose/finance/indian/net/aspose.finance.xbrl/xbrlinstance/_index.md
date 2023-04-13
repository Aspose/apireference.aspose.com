---
title: Class XbrlInstance
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Xbrl.XbrlInstance कक्ष. एक्सबआरएल इंस्टेंस एक्सएमएल फ़्रैगमेंट है जसमें रूट एलमेंट में xbrl टैग है एक्सबआरएल इंस्टेंस में बजनेस रपर्ट तथ्य शमल हैं प्रत्येक तथ्य के अनुरूप हैConcept उनके सहयक डटएस में परभषत कय गय है XBRL उदहरण में संदर्भ और इकइयं भ शमल हैं ज उदहरण में तथ्यं क व्यख्य करने के लए आवश्यक अतरक्त जनकर प्रदन करते हैं
type: docs
weight: 8250
url: /hi/net/aspose.finance.xbrl/xbrlinstance/
---
## XbrlInstance class

एक्सबीआरएल इंस्टेंस एक्सएमएल फ़्रैगमेंट है जिसमें रूट एलिमेंट में xbrl टैग है। एक्सबीआरएल इंस्टेंस में बिजनेस रिपोर्ट तथ्य शामिल हैं, प्रत्येक तथ्य के अनुरूप है[`Concept`](../concept/) उनके सहायक डीटीएस में परिभाषित किया गया है। XBRL उदाहरण में संदर्भ और इकाइयां भी शामिल हैं जो उदाहरण में तथ्यों की व्याख्या करने के लिए आवश्यक अतिरिक्त जानकारी प्रदान करते हैं।

```csharp
public class XbrlInstance
```

## गुण

| नाम | विवरण |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl/xbrlinstance/arcrolereferences/) { get; set; } | का संग्रह प्राप्त या सेट करता है[`ArcroleReference`](../arcrolereference/) XBRL उदाहरण में ऑब्जेक्ट. |
| [Contexts](../../aspose.finance.xbrl/xbrlinstance/contexts/) { get; set; } | का संग्रह प्राप्त या सेट करता है[`Context`](../context/) XBRL उदाहरण में ऑब्जेक्ट. |
| [Facts](../../aspose.finance.xbrl/xbrlinstance/facts/) { get; } | का संग्रह प्राप्त करता है[`Fact`](../fact/) XBRL उदाहरण में ऑब्जेक्ट. |
| [FootnoteLinks](../../aspose.finance.xbrl/xbrlinstance/footnotelinks/) { get; set; } | का संग्रह प्राप्त या सेट करता है[`FootnoteLink`](../footnotelink/) XBRL उदाहरण में ऑब्जेक्ट. |
| [Items](../../aspose.finance.xbrl/xbrlinstance/items/) { get; } | का संग्रह प्राप्त करता है[`Item`](../item/) XBRL उदाहरण में ऑब्जेक्ट. |
| [LinkbaseRefCollection](../../aspose.finance.xbrl/xbrlinstance/linkbaserefcollection/) { get; } | हो जाता है[`LinkbaseRefCollection`](./linkbaserefcollection/) में`XbrlInstance` . |
| [RoleReferences](../../aspose.finance.xbrl/xbrlinstance/rolereferences/) { get; set; } | का संग्रह प्राप्त या सेट करता है[`RoleReference`](../rolereference/) XBRL उदाहरण में ऑब्जेक्ट. |
| [SchemaLocation](../../aspose.finance.xbrl/xbrlinstance/schemalocation/) { get; set; } | स्कीमा स्थान प्राप्त या सेट करता है |
| [SchemaRefs](../../aspose.finance.xbrl/xbrlinstance/schemarefs/) { get; } | स्कीमारेफ संग्रह प्राप्त करता है। |
| [Units](../../aspose.finance.xbrl/xbrlinstance/units/) { get; set; } | का संग्रह प्राप्त या सेट करता है[`Unit`](../unit/) XBRL उदाहरण में ऑब्जेक्ट. |
| [ValidationErrors](../../aspose.finance.xbrl/xbrlinstance/validationerrors/) { get; } | सत्यापन त्रुटि का संग्रह प्राप्त करता है। |
| [XbrlDocument](../../aspose.finance.xbrl/xbrlinstance/xbrldocument/) { get; } | प्राप्त करें[`XbrlDocument`](./xbrldocument/) जिसमें यह उदाहरण है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [CreateElement](../../aspose.finance.xbrl/xbrlinstance/createelement/)(string, string, string) | एक नया तत्व बनाएँ। |
| [GetAllLinkbaseRefCollections](../../aspose.finance.xbrl/xbrlinstance/getalllinkbaserefcollections/)() | सभी लिंकबेस संदर्भ संग्रह xbrl उदाहरण और स्कीमा संदर्भों में प्राप्त करें। |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl/xbrlinstance/getarcroletypebyuri/)(string) | ArcroleType प्राप्त करता है जिसमें निर्दिष्ट uri. है |
| [GetConceptById](../../aspose.finance.xbrl/xbrlinstance/getconceptbyid/)(string) | उस अवधारणा को प्राप्त करता है जिसमें निर्दिष्ट आईडी है। |
| [GetConceptByLoc](../../aspose.finance.xbrl/xbrlinstance/getconceptbyloc/)(Loc) | लोकेटर द्वारा अवधारणा प्राप्त करता है। |
| [GetConceptByName](../../aspose.finance.xbrl/xbrlinstance/getconceptbyname/)(string) | उस अवधारणा को प्राप्त करता है जिसका निर्दिष्ट नाम है। |
| [GetConceptByUriAndName](../../aspose.finance.xbrl/xbrlinstance/getconceptbyuriandname/)(string, string) | उस अवधारणा को प्राप्त करता है जिसमें निर्दिष्ट यूरी और नाम है। |
| [GetContextById](../../aspose.finance.xbrl/xbrlinstance/getcontextbyid/)(string) | उस संदर्भ को प्राप्त करता है जिसमें निर्दिष्ट आईडी है। |
| [GetPresentationLinks](../../aspose.finance.xbrl/xbrlinstance/getpresentationlinks/)(string, string) | xbrl उदाहरण में प्रस्तुति लिंक प्राप्त करता है। |
| [GetRoleTypeByURI](../../aspose.finance.xbrl/xbrlinstance/getroletypebyuri/)(string) | रोलटाइप प्राप्त करता है जिसमें निर्दिष्ट यूरी है। |
| [GetUnitById](../../aspose.finance.xbrl/xbrlinstance/getunitbyid/)(string) | निर्दिष्ट आईडी वाली इकाई प्राप्त करता है। |
| [IsValid](../../aspose.finance.xbrl/xbrlinstance/isvalid/)() | जाँचता है कि क्या यह XBRL उदाहरण मान्य है. |
| [Validate](../../aspose.finance.xbrl/xbrlinstance/validate/)() | इस XBRL उदाहरण को मान्य करता है। |

### यह सभी देखें

* नाम स्थान [Aspose.Finance.Xbrl](../../aspose.finance.xbrl/)
* सभा [Aspose.Finance](../../)


