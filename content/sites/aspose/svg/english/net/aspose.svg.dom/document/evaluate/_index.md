---
title: Document.Evaluate
second_title: Aspose.SVG for .NET API Reference
description: Document Evaluate method. Evaluates an XPath expression string and returns a result of the specified type if possible
type: docs
weight: 950
url: /net/aspose.svg.dom/document/evaluate/
---
## Document.Evaluate method

Evaluates an XPath expression string and returns a result of the specified type if possible.

```csharp
public IXPathResult Evaluate(string expression, Node contextNode, IXPathNSResolver resolver, 
    XPathResultType type, object result)
```

| Parameter | Type | Description |
| --- | --- | --- |
| expression | String | The XPath expression string to be parsed and evaluated. |
| contextNode | Node | The context is context node for the evaluation of this XPath expression. |
| resolver | IXPathNSResolver | The resolver permits translation of all prefixes, including the xml namespace prefix, within the XPath expression into appropriate namespace URIs. |
| type | XPathResultType | If a specific type is specified, then the result will be returned as the corresponding type. |
| result | Object | The result specifies a specific result object which may be reused and returned by this method. |

### Return Value

The result of the evaluation of the XPath expression.

### See Also

* interface [IXPathResult](../../../aspose.svg.dom.xpath/ixpathresult/)
* class [Node](../../node/)
* interface [IXPathNSResolver](../../../aspose.svg.dom.xpath/ixpathnsresolver/)
* enum [XPathResultType](../../../aspose.svg.dom.xpath/xpathresulttype/)
* class [Document](../)
* namespace [Aspose.Svg.Dom](../../../aspose.svg.dom/)
* assembly [Aspose.SVG](../../../)
