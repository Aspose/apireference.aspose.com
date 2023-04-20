---
title: IXPathExpression.Evaluate
second_title: .NET API संदर्भ के लिए Aspose.SVG
description: IXPathExpression तरक. इस XPath व्यंजक क मूल्यंकन करत है और परणम देत है.
type: docs
weight: 10
url: /hi/net/aspose.svg.dom.xpath/ixpathexpression/evaluate/
---
## IXPathExpression.Evaluate method

इस XPath व्यंजक का मूल्यांकन करता है और परिणाम देता है.

```csharp
public IXPathResult Evaluate(Node contextNode, XPathResultType type, object result)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| contextNode | Node | `प्रसंग` इस XPath व्यंजक के मूल्यांकन के लिए प्रसंग नोड है। यदि[`IXPathEvaluator`](../../ixpathevaluator/) कास्ट करके प्राप्त किया गया था[`Document`](../../../aspose.svg.dom/document/) तो यह उसी दस्तावेज़ के स्वामित्व में होना चाहिए और एक होना चाहिए[`Document`](../../../aspose.svg.dom/document/) ,[`Element`](../../../aspose.svg.dom/element/) ,[`Attr`](../../../aspose.svg.dom/attr/) , [`Text`](../../../aspose.svg.dom/text/) ,[`CDATASection`](../../../aspose.svg.dom/cdatasection/) ,[`Comment`](../../../aspose.svg.dom/comment/) ,[`ProcessingInstruction`](../../../aspose.svg.dom/processinginstruction/) , याXPathNamespace नोड। यदि संदर्भ नोड a[`Text`](../../../aspose.svg.dom/text/) या ए[`CDATASection`](../../../aspose.svg.dom/cdatasection/), तब संदर्भ को संपूर्ण तार्किक पाठ नोड के रूप में समझा जाता है जैसा कि XPath द्वारा देखा जाता है, जब तक कि नोड खाली न हो जिस स्थिति में यह XPath संदर्भ के रूप में काम नहीं कर सकता है। |
| type | XPathResultType | यदि कोई विशिष्ट`प्रकार` निर्दिष्ट किया गया है, तो परिणाम XPath रूपांतरणों पर निर्भर निर्दिष्ट प्रकार को वापस करने के लिए बाध्य किया जाएगा और यदि वांछित दबाव संभव नहीं है तो विफल हो जाएगा। यह के मानों में से एक होना चाहिए[`XPathResultType`](../../xpathresulttype/). |
| result | Object | `परिणाम` एक विशिष्ट परिणाम ऑब्जेक्ट निर्दिष्ट करता है जिसका पुन: उपयोग किया जा सकता है और इस विधि द्वारा लौटाया जा सकता है। यदि यह निर्दिष्ट किया गया है`व्यर्थ`या कार्यान्वयन निर्दिष्ट परिणाम का पुन: उपयोग नहीं करता है, एक नया परिणाम ऑब्जेक्ट बनाया जाएगा और लौटाया जाएगा। XPath 1.0 परिणामों के लिए, यह ऑब्जेक्ट प्रकार का होगा[`IXPathResult`](../../ixpathresult/). |

### प्रतिलाभ की मात्रा

XPath व्यंजक के मूल्यांकन का परिणाम. XPath 1.0 परिणामों के लिए, यह ऑब्जेक्ट प्रकार का होगा[`IXPathResult`](../../ixpathresult/).

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | TYPE_ERR: यदि परिणाम निर्दिष्ट प्रकार को वापस करने के लिए परिवर्तित नहीं किया जा सकता है तो उठाया गया। |
| [DOMException](../../../aspose.svg.dom/domexception/) | WRONG_DOCUMENT_ERR: नोड एक ऐसे दस्तावेज़ से है जो द्वारा समर्थित नहीं है[`IXPathEvaluator`](../../ixpathevaluator/) जिसने इसे बनाया[`IXPathExpression`](../). |
| [DOMException](../../../aspose.svg.dom/domexception/) | NOT_SUPPORTED_ERR: नोड एक XPath संदर्भ नोड के रूप में अनुमत प्रकार नहीं है या इसके द्वारा अनुरोध प्रकार की अनुमति नहीं है[`IXPathExpression`](../). |

### यह सभी देखें

* interface [IXPathResult](../../ixpathresult/)
* class [Node](../../../aspose.svg.dom/node/)
* enum [XPathResultType](../../xpathresulttype/)
* interface [IXPathExpression](../)
* नाम स्थान [Aspose.Svg.Dom.XPath](../../ixpathexpression/)
* सभा [Aspose.SVG](../../../)


