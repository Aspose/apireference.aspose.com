---
title: evaluate method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 20
url: /aspose.svg.dom.xpath/ixpathexpression/evaluate/
is_root: false
---

## evaluate {#aspose.svg.dom.Node-aspose.svg.dom.xpath.XPathResultType-any}

Evaluates this XPath expression and returns a result.


### Returns 


The result of the evaluation of the XPath expression. For XPath 1.0 results, this object will be 
of type [`IXPathResult`](./aspose.svg.dom.xpath/ixpathresult).


```python
def evaluate(self, context_node, type, result):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| context_node | [`Node`](./aspose.svg.dom/node) | The `context` is context node for the evaluation of this XPath expression. <br/>If the [`IXPathEvaluator`](./aspose.svg.dom.xpath/ixpathevaluator) was obtained by casting the [`Document`](./aspose.svg.dom/document) then this must be <br/>owned by the same document and must be a [`Document`](./aspose.svg.dom/document), [`Element`](./aspose.svg.dom/element), [`Attr`](./aspose.svg.dom/attr), <br/>[`Text`](./aspose.svg.dom/text), [`CDATASection`](./aspose.svg.dom/cdatasection), [`Comment`](./aspose.svg.dom/comment), [`ProcessingInstruction`](./aspose.svg.dom/processinginstruction), <br/>or XPathNamespace node. If the context node is a [`Text`](./aspose.svg.dom/text) or a [`CDATASection`](./aspose.svg.dom/cdatasection), <br/>then the context is interpreted as the whole logical text node as seen by XPath, unless the node is empty <br/>in which case it may not serve as the XPath context. |
| type | [`XPathResultType`](./aspose.svg.dom.xpath/xpathresulttype) | If a specific `type` is specified, then the result will be coerced to return the <br/>specified type relying on XPath conversions and fail if the desired coercion is not possible. This must <br/>be one of the values of [`XPathResultType`](./aspose.svg.dom.xpath/xpathresulttype). |
| result | any | The `result` specifies a specific result object which may be reused and returned <br/>by this method. If this is specified as `null` or the implementation does not reuse the specified <br/>result, a new result object will be constructed and returned. For XPath 1.0 results, this object will be <br/>of type [`IXPathResult`](./aspose.svg.dom.xpath/ixpathresult). |
### Exceptions
| Exception | Description |
| :- | :- |
| [`DOMException`](./aspose.svg.dom/domexception) | TYPE_ERR: Raised if the result cannot be converted to return the specified type. |
| [`DOMException`](./aspose.svg.dom/domexception) | WRONG_DOCUMENT_ERR: The Node is from a document that is not supported by <br/>the [`IXPathEvaluator`](./aspose.svg.dom.xpath/ixpathevaluator) that created this [`IXPathExpression`](./aspose.svg.dom.xpath/ixpathexpression). |
| [`DOMException`](./aspose.svg.dom/domexception) | NOT_SUPPORTED_ERR: The Node is not a type permitted as an XPath context node <br/>or the request type is not permitted by this [`IXPathExpression`](./aspose.svg.dom.xpath/ixpathexpression). |





### See Also
* module [`aspose.svg.dom.xpath`](../../)
* class [`Attr`](./aspose.svg.dom/attr)
* class [`CDATASection`](./aspose.svg.dom/cdatasection)
* class [`Comment`](./aspose.svg.dom/comment)
* class [`DOMException`](./aspose.svg.dom/domexception)
* class [`Document`](./aspose.svg.dom/document)
* class [`Element`](./aspose.svg.dom/element)
* class [`IXPathEvaluator`](./aspose.svg.dom.xpath/ixpathevaluator)
* class [`IXPathExpression`](./aspose.svg.dom.xpath/ixpathexpression)
* class [`IXPathResult`](./aspose.svg.dom.xpath/ixpathresult)
* class [`ProcessingInstruction`](./aspose.svg.dom/processinginstruction)
* class [`Text`](./aspose.svg.dom/text)
* class [`XPathResultType`](./aspose.svg.dom.xpath/xpathresulttype)
