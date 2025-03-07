---
title: IXPathExpression.Evaluate
second_title: Aspose.HTML for .NET API Reference
description: IXPathExpression Evaluate method. Evaluates this XPath expression and returns a result
type: docs
weight: 10
url: /net/aspose.html.dom.xpath/ixpathexpression/evaluate/
---
## IXPathExpression.Evaluate method

Evaluates this XPath expression and returns a result.

```csharp
public IXPathResult Evaluate(Node contextNode, XPathResultType type, object result)
```

| Parameter | Type | Description |
| --- | --- | --- |
| contextNode | Node | The `context` is context node for the evaluation of this XPath expression. If the [`IXPathEvaluator`](../../ixpathevaluator/) was obtained by casting the [`Document`](../../../aspose.html.dom/document/) then this must be owned by the same document and must be a [`Document`](../../../aspose.html.dom/document/), [`Element`](../../../aspose.html.dom/element/), [`Attr`](../../../aspose.html.dom/attr/), [`Text`](../../../aspose.html.dom/text/), [`CDATASection`](../../../aspose.html.dom/cdatasection/), [`Comment`](../../../aspose.html.dom/comment/), [`ProcessingInstruction`](../../../aspose.html.dom/processinginstruction/), or XPathNamespace node. If the context node is a [`Text`](../../../aspose.html.dom/text/) or a [`CDATASection`](../../../aspose.html.dom/cdatasection/), then the context is interpreted as the whole logical text node as seen by XPath, unless the node is empty in which case it may not serve as the XPath context. |
| type | XPathResultType | If a specific `type` is specified, then the result will be coerced to return the specified type relying on XPath conversions and fail if the desired coercion is not possible. This must be one of the values of [`XPathResultType`](../../xpathresulttype/). |
| result | Object | The `result` specifies a specific result object which may be reused and returned by this method. If this is specified as `null` or the implementation does not reuse the specified result, a new result object will be constructed and returned. For XPath 1.0 results, this object will be of type [`IXPathResult`](../../ixpathresult/). |

### Return Value

The result of the evaluation of the XPath expression. For XPath 1.0 results, this object will be of type [`IXPathResult`](../../ixpathresult/).

### Exceptions

| exception | condition |
| --- | --- |
| [DOMException](../../../aspose.html.dom/domexception/) | TYPE_ERR: Raised if the result cannot be converted to return the specified type. |
| [DOMException](../../../aspose.html.dom/domexception/) | WRONG_DOCUMENT_ERR: The Node is from a document that is not supported by the [`IXPathEvaluator`](../../ixpathevaluator/) that created this [`IXPathExpression`](../). |
| [DOMException](../../../aspose.html.dom/domexception/) | NOT_SUPPORTED_ERR: The Node is not a type permitted as an XPath context node or the request type is not permitted by this [`IXPathExpression`](../). |

### See Also

* interface [IXPathResult](../../ixpathresult/)
* class [Node](../../../aspose.html.dom/node/)
* enum [XPathResultType](../../xpathresulttype/)
* interface [IXPathExpression](../)
* namespace [Aspose.Html.Dom.XPath](../../../aspose.html.dom.xpath/)
* assembly [Aspose.HTML](../../../)
