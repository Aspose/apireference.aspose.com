---
title: IXPathEvaluator.Evaluate
second_title: Aspose.SVG for .NET API Reference
description: IXPathEvaluator Evaluate method. Evaluates an XPath expression string and returns a result of the specified type if possible
type: docs
weight: 30
url: /net/aspose.svg.dom.xpath/ixpathevaluator/evaluate/
---
## IXPathEvaluator.Evaluate method

Evaluates an XPath expression string and returns a result of the specified type if possible.

```csharp
public IXPathResult Evaluate(string expression, Node contextNode, IXPathNSResolver resolver, 
    XPathResultType type, object result)
```

| Parameter | Type | Description |
| --- | --- | --- |
| expression | String | The XPath expression string to be parsed and evaluated. |
| contextNode | Node | The `context` is context node for the evaluation of this XPath expression. If the [`IXPathEvaluator`](../) was obtained by casting the [`Document`](../../../aspose.svg.dom/document/) then this must be owned by the same document and must be a [`Document`](../../../aspose.svg.dom/document/), [`Element`](../../../aspose.svg.dom/element/), [`Attr`](../../../aspose.svg.dom/attr/), [`Text`](../../../aspose.svg.dom/text/), [`CDATASection`](../../../aspose.svg.dom/cdatasection/), [`Comment`](../../../aspose.svg.dom/comment/), [`ProcessingInstruction`](../../../aspose.svg.dom/processinginstruction/), or XPathNamespace node. If the context node is a [`Text`](../../../aspose.svg.dom/text/) or a [`CDATASection`](../../../aspose.svg.dom/cdatasection/), then the context is interpreted as the whole logical text node as seen by XPath, unless the node is empty in which case it may not serve as the XPath context. |
| resolver | IXPathNSResolver | The `resolver` permits translation of all prefixes, including the `xml` namespace prefix, within the XPath expression into appropriate namespace URIs. If this is specified as `null`, any namespace prefix within the expression will result in [`DOMException`](../../../aspose.svg.dom/domexception/) being thrown with the code `NAMESPACE_ERR`. |
| type | XPathResultType | If a specific `type` is specified, then the result will be returned as the corresponding type. For XPath 1.0 results, this must be one of the values of the [`XPathResultType`](../../xpathresulttype/) enum. |
| result | Object | The `result` specifies a specific result object which may be reused and returned by this method. If this is specified as `null` or the implementation does not reuse the specified result, a new result object will be constructed and returned. For XPath 1.0 results, this object will be of type [`IXPathResult`](../../ixpathresult/). |

### Return Value

The result of the evaluation of the XPath expression. For XPath 1.0 results, this object will be of type [`IXPathResult`](../../ixpathresult/).

### Exceptions

| exception | condition |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | INVALID_EXPRESSION_ERR: Raised if the expression is not legal according to the rules of the [`IXPathEvaluator`](../). |
| [DOMException](../../../aspose.svg.dom/domexception/) | TYPE_ERR: Raised if the result cannot be converted to return the specified type. |
| [DOMException](../../../aspose.svg.dom/domexception/) | NAMESPACE_ERR: Raised if the expression contains namespace prefixes which cannot be resolved by the specified [`IXPathNSResolver`](../../ixpathnsresolver/). |
| [DOMException](../../../aspose.svg.dom/domexception/) | WRONG_DOCUMENT_ERR: The Node is from a document that is not supported by this [`IXPathEvaluator`](../). |
| [DOMException](../../../aspose.svg.dom/domexception/) | NOT_SUPPORTED_ERR: The Node is not a type permitted as an XPath context node or the request type is not permitted by this [`IXPathEvaluator`](../). |

### See Also

* interface [IXPathResult](../../ixpathresult/)
* class [Node](../../../aspose.svg.dom/node/)
* interface [IXPathNSResolver](../../ixpathnsresolver/)
* enum [XPathResultType](../../xpathresulttype/)
* interface [IXPathEvaluator](../)
* namespace [Aspose.Svg.Dom.XPath](../../../aspose.svg.dom.xpath/)
* assembly [Aspose.SVG](../../../)
